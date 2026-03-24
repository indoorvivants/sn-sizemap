package sizemap

import decline_derive.*
import java.nio.file.Path
import java.io.File
import sizemap.BinaryFile
import java.io.RandomAccessFile

import com.indoorvivants.demangler.*
import scala.util.Try
import java.io.FileWriter
import scala.util.Using
import scala.scalanative.unsafe.Zone

enum CLI(val path: Path) derives CommandApplication:
  case Serve(
      @Positional("filename")
      filename: Path,
      @Short("p")
      port: Option[Int]
  ) extends CLI(filename)
end CLI

@main def hello(args: String*) =
  val cli = CommandApplication.parseOrExit[CLI](args)

  val file = cli.path.toFile()
  implicit val bf: BinaryFile = new BinaryFile(
    new RandomAccessFile(file, "r")
  )

  import macho.*

  val indiv =
    if scalanative.meta.LinktimeInfo.isMac then
      for
        parsed = MachO.parse(bf)
        sizes = parsed.sizes
        case (scalaSymbol, size) <- sizes
          .filter(_._1.startsWith("__S"))
          .toList
          .sortBy(s => (s._2 * -1, s._1))
        demangled = Try(Demangler.demangle(scalaSymbol.stripPrefix("_")))
        _ = demangled.failed.toOption.foreach(_ =>
          scribe.warn(
            s"Failed to demangle symbol ${scalaSymbol.stripPrefix("_")}"
          )
        )
        symbol <- demangled.toOption
      yield (symbol, size)
    else sys.error("At the moment only MacOS is supported!")

  cli match
    case CLI.Serve(filename, port) =>
      Zone:
        Server(filename.toString, indiv.toMap).serve(port)
end hello
