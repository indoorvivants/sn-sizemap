package httplib

// This file was generated using sn-bindgen 0.4.2: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[httplib] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def value: CUnsignedInt = t.asInstanceOf[CUnsignedInt]
      inline def int: CInt = value.toInt
      inline def uint: CUnsignedInt = value

object enumerations:
  import predef.*
  /**
   * [bindgen] header: resources/scala-native/httplib_glue.h
  */
  opaque type BodyType = CUnsignedInt
  object BodyType extends _BindgenEnumCUnsignedInt[BodyType]:
    given _tag: Tag[BodyType] = Tag.UInt
    inline def define(inline a: Long): BodyType = a.toUInt
    val JAVASCRIPT = define(0)
    val HTML = define(1)
    def getName(value: BodyType): Option[String] =
      value match
        case `JAVASCRIPT` => Some("JAVASCRIPT")
        case `HTML` => Some("HTML")
        case _ => _root_.scala.None
    extension (a: BodyType)
      inline def &(b: BodyType): BodyType = a & b
      inline def |(b: BodyType): BodyType = a | b
      inline def is(b: BodyType): Boolean = (a & b) == b

  /**
   * [bindgen] header: resources/scala-native/httplib_glue.h
  */
  opaque type Code = CUnsignedInt
  object Code extends _BindgenEnumCUnsignedInt[Code]:
    given _tag: Tag[Code] = Tag.UInt
    inline def define(inline a: Long): Code = a.toUInt
    val OK = define(200)
    val SERVER_ERROR = define(500)
    val BAD_REQUEST = define(400)
    def getName(value: Code): Option[String] =
      value match
        case `OK` => Some("OK")
        case `SERVER_ERROR` => Some("SERVER_ERROR")
        case `BAD_REQUEST` => Some("BAD_REQUEST")
        case _ => _root_.scala.None
    extension (a: Code)
      inline def &(b: Code): Code = a & b
      inline def |(b: Code): Code = a | b
      inline def is(b: Code): Boolean = (a & b) == b

object structs:
  import _root_.httplib.predef.*
  import _root_.httplib.enumerations.*
  import _root_.httplib.structs.*

  /**
   * [bindgen] header: resources/scala-native/httplib_glue.h
  */
  opaque type Handlers = CStruct2[CFuncPtr0[Ptr[Resp]], CFuncPtr0[Ptr[Resp]]]
  
  object Handlers:
    given _tag: Tag[Handlers] = Tag.materializeCStruct2Tag[CFuncPtr0[Ptr[Resp]], CFuncPtr0[Ptr[Resp]]]
    
    export fields.*
    private[httplib] object fields:
      extension (struct: Handlers)
        inline def data : CFuncPtr0[Ptr[Resp]] = struct._1
        inline def data_=(value: CFuncPtr0[Ptr[Resp]]): Unit = (!struct.at1 = value)
        inline def index : CFuncPtr0[Ptr[Resp]] = struct._2
        inline def index_=(value: CFuncPtr0[Ptr[Resp]]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates Handlers on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[Handlers] = scala.scalanative.unsafe.alloc[Handlers](1)
    def apply(data : CFuncPtr0[Ptr[Resp]], index : CFuncPtr0[Ptr[Resp]])(using Zone): Ptr[Handlers] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).index = index
      ____ptr
    
    

  /**
   * [bindgen] header: resources/scala-native/httplib_glue.h
  */
  opaque type Resp = CStruct3[Code, BodyType, Ptr[Byte]]
  
  object Resp:
    given _tag: Tag[Resp] = Tag.materializeCStruct3Tag[Code, BodyType, Ptr[Byte]]
    
    export fields.*
    private[httplib] object fields:
      extension (struct: Resp)
        inline def code : Code = struct._1
        inline def code_=(value: Code): Unit = (!struct.at1 = value)
        inline def bodyType : BodyType = struct._2
        inline def bodyType_=(value: BodyType): Unit = (!struct.at2 = value)
        inline def body : Ptr[Byte] = struct._3
        inline def body_=(value: Ptr[Byte]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates Resp on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[Resp] = scala.scalanative.unsafe.alloc[Resp](1)
    def apply(code : Code, bodyType : BodyType, body : Ptr[Byte])(using Zone): Ptr[Resp] =
      val ____ptr = apply()
      (!____ptr).code = code
      (!____ptr).bodyType = bodyType
      (!____ptr).body = body
      ____ptr
    
    


@extern
private[httplib] object extern_functions:
  import _root_.httplib.predef.*
  import _root_.httplib.enumerations.*
  import _root_.httplib.structs.*
  /**
   * [bindgen] header: resources/scala-native/httplib_glue.h
  */
  def start_server(handlers : Ptr[Handlers], socket : CString, port : CInt): Unit = extern

object functions:
  import _root_.httplib.predef.*
  import _root_.httplib.enumerations.*
  import _root_.httplib.structs.*
  import extern_functions.*
  export extern_functions.*


object types:
    export _root_.httplib.structs.*
    export _root_.httplib.enumerations.*

object all:
  export _root_.httplib.enumerations.BodyType
  export _root_.httplib.enumerations.Code
  export _root_.httplib.structs.Handlers
  export _root_.httplib.structs.Resp
  export _root_.httplib.functions.start_server