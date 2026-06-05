package sizemap

import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.util.control.NonFatal
import scalanative.libc.string.*

class Server(filename: String, sizeOnDisk: Long, data: Map[String, Long]):
  def serve(port: Option[Int])(using Zone) =
    // val handlers = Handlers()

    val dataJS =
      val serialised = data.toList.sortBy(s => (s._2 * -1, s._1))
      val symbols =         serialised
          .map { case (k, v) => s"""["$k", $v]""" }
          .mkString("[", ",", "]")

      toCString(
        s"""{"binary": "$filename", "sizeOnDisk": $sizeOnDisk, "data": $symbols}"""
      )
    end dataJS

    Server.raw = dataJS

    val indexHtml = io.Source
      .fromInputStream(getClass.getResourceAsStream("/index.html"))
      .mkString

    Server.indexHtmlRaw = toCString(indexHtml)

    import mongoose.all.*

    val mgr = stackalloc[mg_mgr]()

    mg_mgr_init(mgr)

    val ev_handler = mongoose.aliases.mg_event_handler_t:
      CFuncPtr3.fromScalaFunction: (connection, ev, data) =>
        if ev == MG_EV_HTTP_MSG then
          val httpMessage = !(data.asInstanceOf[Ptr[mg_http_message]])

          val path = fromCStringSlice(httpMessage.uri.buf, httpMessage.uri.len)

          given Zone = Server.z

          path match
            case "/api/data" =>
              mg_http_reply(
                connection,
                200,
                toCString(s"Content-Type: application/json\r\n"),
                c"%s",
                Server.raw
              )
            case s"/assets/$something.css" =>
              val raw = Server.read(s"/$something.css")
              mg_http_reply(
                connection,
                200,
                toCString(s"Content-Type: text/css\r\n"),
                c"%s",
                raw
              )
            case s"/assets/$something.js" =>
              val raw = Server.read(s"/$something.js")
              mg_http_reply(
                connection,
                200,
                toCString(s"Content-Type: application/javascript\r\n"),
                c"%s",
                raw
              )

            case "/" | "/index.html" =>
              mg_http_reply(
                connection,
                200,
                toCString(s"Content-Type: text/html\n"),
                c"%s",
                Server.indexHtmlRaw
              )

            case other =>
              scribe.warn(s"Not handling $other")
              mg_http_reply(
                connection,
                404,
                toCString(s"Content-Type: text/html\n"),
                c"%s",
                c"Not Found"
              )
          end match

          (!connection).is_draining = 1.toUInt

        end if

    val mc = mg_http_listen(
      mgr,
      port.fold(c"http://localhost:0")(p => toCString(s"http://localhost:$p")),
      ev_handler,
      null
    )

    assert(mc != null, "Failed to start the server")

    val boundPort = mg_ntohs((!mc).loc.port)

    scribe.info(s"Started server on http://localhost:${boundPort}")


    while true do 
      val pollDuration = if (!mc).send.len.toInt > 0 then 1 else 100
      mg_mgr_poll(mgr, pollDuration)

  end serve
end Server

object Server:
  var raw: CString = null
  var z: Zone = Zone.open()

  var indexHtmlRaw: CString = null
  var cssRaw: CString = null
  var jsRaw: CString = null

  private val mp = collection.mutable.Map.empty[String, CString]

  val cls = getClass

  def read(asset: String) =
    mp.getOrElseUpdate(
      asset,
      toCString(
        io.Source
          .fromInputStream(cls.getResourceAsStream(asset))
          .mkString
      )(using Server.z)
    )
end Server
