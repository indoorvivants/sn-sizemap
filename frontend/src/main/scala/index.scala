package sizemap

import org.scalajs.dom, dom.*
import scalajs.js, js.annotation.*
import scala.collection.mutable.ArrayBuffer
import com.raquo.laminar.api.L.*
import scala.util.boundary

@js.native
trait Sym extends js.Array[js.Any]

@js.native
trait ServerData extends js.Object:
  val binary: String = js.native
  val sizeOnDisk: Int = js.native
  val data: js.Array[Sym] = js.native
end ServerData

extension (s: Sym)
  def name = s.apply(0).asInstanceOf[String]
  def value = s.apply(1).asInstanceOf[Int]
  def demangledFrom = Lang.fromString(s.apply(2).asInstanceOf[String])

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

enum Lang:
  case Scala, Cpp, Unknown, Rust

object Lang:
  def fromString(s: String) =
    s.trim.toLowerCase() match
      case "scala" => Lang.Scala
      case "cpp"   => Lang.Cpp
      case "rust"  => Lang.Rust
      case other   => Lang.Unknown
end Lang

enum Tree:
  case Node(
      label: String,
      children: ArrayBuffer[Tree],
      lang: Option[Lang] = None
  )
  case Leaf(label: String, symbolSize: Int, lang: Option[Lang] = None)

  private var lastSize = 0
  private var lastNodeSize = 0

  def size: Int = this match
    case n: Node =>
      val children = n.children
      if children.size != lastSize then
        var s = 0
        for child <- children do s += child.size
        lastNodeSize = s
        lastSize = n.children.size
        s
      else lastNodeSize
      end if
    case l: Leaf => l.symbolSize

  def render: String = Tree.render(this)

end Tree

object Tree:
  def render(root: Tree): String =
    def go(tree: Tree, level: Int = 0): Array[String] = tree match
      case n: Node =>
        val childStrings = n.children.map(go(_, level + 1))

        Array(s"${" " * level}$label (${n.size}):") ++
          childStrings.flatten.map(s => s"${" " * (level + 1)}$s")

      case l: Leaf =>
        Array(s"${" " * level}${l.label} (${l.size})")
    go(root).mkString("\n")
  end render
end Tree

def buildTree(data: scala.scalajs.js.Array[Sym]) =
  val root: Tree.Node = Tree.Node("root", ArrayBuffer.empty[Tree])

  case class Symbol(segments: Array[String], size: Int, lang: Lang):
    lazy val str = segments.mkString(".")
    override def toString = s"Symbol($str, $size)"

  val symbols =
    data
      .map(s => Symbol(s.segments, s.value, s.demangledFrom))
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
            val newNode: Tree.Node = Tree.Node(seg, ArrayBuffer.empty[Tree], lang = Some(sym.lang))
            start.children.addOne(newNode)
            start = newNode
      end for
      start
    end insertionPoint

    insertionPoint.children.addOne(Tree.Leaf(sym.segments.last, sym.size, Some(sym.lang)))

  root
end buildTree

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

def treePathFromPath(root: Tree.Node, path: String): List[Tree.Node] =
  boundary:
    val segments = path.split("/")
    var cur = List(root)

    segments.foreach: seg =>
      val found = cur.head.children.collectFirst:
        case t: Tree.Node if t.label == seg =>
          cur = t :: cur

      if found.isEmpty then boundary.break(cur)

    cur

def langColor(l: Lang) =
  l match
    case Lang.Scala   => "#DC322F"
    case Lang.Cpp     => "#00599C"
    case Lang.Rust    => "#000000"
    case Lang.Unknown => "#5890FF"

def langIcon(l: Lang) =
  val slug = l match
    case Lang.Scala   => "scala"
    case Lang.Cpp     => "cplusplus"
    case Lang.Unknown => "c"
    case Lang.Rust    => "rust"

  img(
    cls := s"lang-icon lang-icon-$slug",
    src := s"https://cdn.simpleicons.org/$slug"
  )
end langIcon

def singleBinary(name: String, sizeOnDisk: Int, tree: Tree.Node) =

  val hash = window.location.hash.stripPrefix("#")
  val path = dom.window.atob(hash)
  val default =
    if hash.nonEmpty then treePathFromPath(tree, path) else List(tree)

  println(hash)
  val current = Var(default)

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

  val trackHistory = Observer[List[Tree.Node]] { path =>
    val rev =
      dom.window.btoa(path.reverse.drop(1).map(_.label).mkString("/"))
    console.log("Tracking history: " + rev)

    if window.location.hash != "#" + rev then window.location.hash = "#" + rev
  }

  div(
    div(
      cls := "binary-info",
      span(cls := "binary-name", name),
      div(
        cls := "binary-stats",
        span(
          cls := "stat",
          span(cls := "stat-label", "on disk"),
          span(cls := "stat-value", formatBytes(sizeOnDisk))
        ),
        span(cls := "stat-sep", "·"),
        span(
          cls := "stat",
          span(cls := "stat-label", "symbols"),
          span(cls := "stat-value", formatBytes(tree.size))
        )
      )
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
    current --> trackHistory,
    windowEvents(_.onPopState)
      .mapTo(window.location.hash.stripPrefix("#"))
      .map(dom.window.atob(_))
      .map(treePathFromPath(tree, _))
      .debugSpy(s => console.log(s.map(_.map(_.label)))) --> current.writer,
    div(
      cls := "table",
      div("symbol", cls := "col-hdr col-name"),
      div("size", cls := "col-hdr col-size"),
      div("relative size", cls := "col-hdr col-bar"),
      children <-- current.signal.map { t =>
        val parentSize = t.head.size.toFloat
        val (display, summarise) =
          t.head.children.sortBy(-1 * _.size).splitAt(100)

        val summary = Option
          .when(summarise.nonEmpty):
            val totalSize = summarise.map(_.size).sum
            val pct = 100 * totalSize.toFloat / parentSize
            List(
              div(
                cls := "col-name cell-leaf",
                span(
                  cls := "symbol-label",
                  s"${summarise.length} more symbols"
                )
              ),
              div(formatBytes(totalSize), cls := "col-size cell-node"),
              div(
                cls := "col-bar",
                div(
                  cls := "bar bar-node",
                  styleAttr := s"width: ${pct}%;"
                )
              )
            )
          .toList
          .flatten
        val spittingBars = display.flatMap {
          case c: Tree.Node =>
            import c.*
            val pct = 100 * c.size.toFloat / parentSize
            List(
              div(
                cls := "col-name cell-node",
                c.lang.map(langIcon(_)),
                // langIcon("scala", "Scala"),
                // langIcon("cplusplus", "C++"),
                span(cls := "symbol-label", label),
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
          case l: Tree.Leaf =>
            import l.*
            val pct = 100 * size.toFloat / parentSize
            List(
              div(
                cls := "col-name cell-leaf",
                l.lang.map(langIcon(_)),
                span(cls := "symbol-label", label)
              ),
              div(formatBytes(size), cls := "col-size cell-leaf"),
              div(
                cls := "col-bar",
                div(cls := "bar bar-leaf", styleAttr := s"width: ${pct}%;")
              )
            )
        }

        spittingBars ++ summary
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
  val base =
    org.scalajs.dom.window.location.href.takeWhile(_ != '#') + "api/data"

  console.log(base)

  val app = div(
    child <-- FetchStream.raw
      .get(base)
      .flatMapSwitch(b => EventStream.fromJsPromise(b.json()))
      .map(_.asInstanceOf[ServerData])
      .map(data =>
        singleBinary(data.binary, data.sizeOnDisk, buildTree(data.data))
      )
  )

  renderOnDomContentLoaded(container, app)

end hello
