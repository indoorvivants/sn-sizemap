package sizemap

import org.scalajs.dom.*
import scalajs.js, js.annotation.*
import scala.collection.mutable.ArrayBuffer
import com.raquo.laminar.api.L.*

@js.native
trait Sym extends js.Array[Any]

extension (s: Sym)
  def name = s.apply(0).asInstanceOf[String]
  def value = s.apply(1).asInstanceOf[Int]

  def segments =
    val beforeParens = name.takeWhile(_ != '(')
    if beforeParens.length == name.length then beforeParens.split('.').toArray
    else
      val segs = beforeParens.split('.').toArray

      segs.dropRight(1) ++ (segs
        .takeRight(1)
        .map(_ + name.drop(beforeParens.length)))
    end if
  end segments
end extension

enum Tree:
  case Node(label: String, children: ArrayBuffer[Tree])
  case Leaf(label: String, symbolSize: Int)

  private var lastSize = 0
  private var lastNodeSize = 0

  def size: Int = this match
    case Node(_, children) =>
      if children.size != lastSize then
        var s = 0
        for child <- children do s += child.size
        lastNodeSize = s
        lastSize = children.size
        s
      else lastNodeSize
    case Leaf(_, size) => size

  def render: String =
    def go(tree: Tree, level: Int = 0): Array[String] = tree match
      case n @ Node(label, children) =>
        val childStrings = children.map(go(_, level + 1))

        Array(s"${" " * level}$label (${n.size}):") ++
          childStrings.flatten.map(s => s"${" " * (level + 1)}$s")

      case Leaf(label, size) => Array(s"${" " * level}$label ($size)")
    go(this).mkString("\n")
  end render

end Tree

def buildTree(data: scala.scalajs.js.Array[Sym]) =
  val root: Tree.Node = Tree.Node("root", ArrayBuffer.empty[Tree])

  case class Symbol(segments: Array[String], size: Int):
    lazy val str = segments.mkString(".")
    override def toString = s"Symbol($str, $size)"

  val symbols =
    data
      .map(s => Symbol(s.segments, s.value))
      .sortBy(_.str)

  symbols.foreach: sym =>
    val path = sym.segments.dropRight(1)
    val insertionPoint =
      var start: Tree.Node = root
      for seg <- path do
        start.children.collectFirst {
          case node: Tree.Node if node.label == seg => node
        } match
          case Some(node) => start = node
          case None       =>
            val newNode: Tree.Node = Tree.Node(seg, ArrayBuffer.empty[Tree])
            start.children.addOne(newNode)
            start = newNode
      end for
      start
    end insertionPoint

    insertionPoint.children.addOne(Tree.Leaf(sym.segments.last, sym.size))

  root
end buildTree

// @js.native @JSImport("/data.json", JSImport.Default)
// val jsonData: scala.scalajs.js.Array[Sym] = js.native

def sideBySide(tree1: Tree.Node, tree2: Tree.Node) =

  enum Ior:
    case Left(tree: Tree.Node)
    case Right(tree: Tree.Node)
    case Both(tree1: Tree.Node, tree2: Tree.Node)

    def advance(segment: String): Option[Ior] =
      def find(t: Tree.Node): Option[Tree.Node] =
        t.children.collectFirst:
          case t: Tree.Node if t.label == segment => t

      this match
        case Left(tree) =>
          find(tree).map(Ior.Left(_))

        case Right(tree) =>
          find(tree).map(Ior.Right(_))

        case Both(tree1, tree2) =>
          val l = find(tree1)
          val r = find(tree2)

          (l, r) match
            case (None, None)               => None
            case (Some(treeL), Some(treeR)) => Some(Ior.Both(treeL, treeR))
            case (None, Some(treeR))        => Some(Ior.Right(treeR))
            case (Some(treeL), None)        => Some(Ior.Left(treeL))
          end match

      end match
    end advance
  end Ior

  ???
end sideBySide

def singleBinary(tree: Tree.Node) =

  val current = Var(List(tree))

  val drillDown = Observer[Tree.Node] { node =>
    current.update(node :: _)
  }

  val goBack = Observer[Unit] { _ =>
    current.update: cur =>
      if cur.length > 1 then cur.tail else cur
  }

  val skip = Observer[Int] { n =>
    current.update(t => t.drop(t.length - n))
  }

  div(
    div(
      cls := "toolbar",
      a("← back", cls := "btn-back", onClick.mapToUnit --> goBack),
      b(s"${{ formatBytes(tree.size) }}", cls := "total-size")
    ),
    div(
      cls := "breadcrumb",
      children <-- current.signal.map { bread =>
        bread.reverse.zipWithIndex.map: (node, idx) =>
          a(
            cls := "breadcrumb-item",
            node.label + s" (${formatBytes(node.size)})",
            onClick.mapToStrict(idx + 1) --> skip
          )
      }
    ),
    div(
      cls := "table",
      div("symbol", cls := "col-hdr col-name"),
      div("size", cls := "col-hdr col-size"),
      div("relative size", cls := "col-hdr col-bar"),
      children <-- current.signal.map { t =>
        val parentSize = t.head.size.toFloat
        t.head.children.sortBy(-1 * _.size).take(100).flatMap {
          case c @ Tree.Node(label, _) =>
            val pct = 100 * c.size.toFloat / parentSize
            List(
              div(
                label,
                cls := "col-name cell-node",
                onClick.mapToStrict(c) --> drillDown
              ),
              div(formatBytes(c.size), cls := "col-size cell-node"),
              div(
                cls := "col-bar",
                div(
                  cls := "bar bar-node",
                  styleAttr := s"width: ${pct}%;",
                  onClick.mapToStrict(c) --> drillDown
                )
              )
            )
          case Tree.Leaf(label, size) =>
            val pct = 100 * size.toFloat / parentSize
            List(
              div(label, cls := "col-name cell-leaf"),
              div(formatBytes(size), cls := "col-size cell-leaf"),
              div(
                cls := "col-bar",
                div(cls := "bar bar-leaf", styleAttr := s"width: ${pct}%;")
              )
            )
        }
      }
    )
  )
end singleBinary

def formatBytes(bytes: Int) =
  if bytes < 1024 then bytes.toString + "b"
  else if bytes < 1024 * 1024 then f"${bytes.toFloat / 1024}%.1fKB"
  else if bytes < 1024 * 1024 * 1024 then
    f"${bytes.toFloat / (1024 * 1024)}%.1fMB"
  else bytes.toString + "b"

@main def hello =
  val container = document.getElementById("content")
  val base = org.scalajs.dom.window.location.href + "api/data"

  val app = div(
    child <-- FetchStream.raw
      .get(base)
      .flatMapSwitch(b => EventStream.fromJsPromise(b.json()))
      .map(_.asInstanceOf[scala.scalajs.js.Array[Sym]])
      .map(buildTree(_))
      .map(singleBinary(_))
  )

  renderOnDomContentLoaded(container, app)

end hello
