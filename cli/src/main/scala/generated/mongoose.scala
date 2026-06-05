package mongoose

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[mongoose] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def value: CUnsignedInt = t.asInstanceOf[CUnsignedInt]
      inline def int: CInt = value.toInt
      inline def uint: CUnsignedInt = value

object enumerations:
  import predef.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_val_type = CUnsignedInt
  object mg_val_type extends _BindgenEnumCUnsignedInt[mg_val_type]:
    given _tag: Tag[mg_val_type] = Tag.UInt
    inline def define(inline a: Long): mg_val_type = a.toUInt
    val MG_VAL_INT = define(0)
    val MG_VAL_BOOL = define(1)
    val MG_VAL_DBL = define(2)
    val MG_VAL_STR = define(3)
    val MG_VAL_RAW = define(4)
    def getName(value: mg_val_type): Option[String] =
      value match
        case `MG_VAL_INT` => Some("MG_VAL_INT")
        case `MG_VAL_BOOL` => Some("MG_VAL_BOOL")
        case `MG_VAL_DBL` => Some("MG_VAL_DBL")
        case `MG_VAL_STR` => Some("MG_VAL_STR")
        case `MG_VAL_RAW` => Some("MG_VAL_RAW")
        case _ => _root_.scala.None
    extension (a: mg_val_type)
      inline def &(b: mg_val_type): mg_val_type = a & b
      inline def |(b: mg_val_type): mg_val_type = a | b
      inline def is(b: mg_val_type): Boolean = (a & b) == b

object structs:
  import _root_.mongoose.predef.*
  import _root_.mongoose.enumerations.*
  import _root_.mongoose.aliases.*
  import _root_.mongoose.structs.*

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type MG_UECC_Curve_t = CStruct0
  
  object MG_UECC_Curve_t:
    given _tag: Tag[MG_UECC_Curve_t] = Tag.materializeCStruct0Tag
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type MG_UECC_HashContext = CStruct6[CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CUnsignedInt, Unit], CFuncPtr2[Ptr[Byte], Ptr[uint8_t], Unit], CUnsignedInt, CUnsignedInt, Ptr[uint8_t]]
  
  object MG_UECC_HashContext:
    given _tag: Tag[MG_UECC_HashContext] = Tag.materializeCStruct6Tag[CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CUnsignedInt, Unit], CFuncPtr2[Ptr[Byte], Ptr[uint8_t], Unit], CUnsignedInt, CUnsignedInt, Ptr[uint8_t]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: MG_UECC_HashContext)
        inline def init_hash : CFuncPtr1[Ptr[MG_UECC_HashContext], Unit] = struct._1.asInstanceOf[CFuncPtr1[Ptr[MG_UECC_HashContext], Unit]]
        inline def init_hash_=(value: CFuncPtr1[Ptr[MG_UECC_HashContext], Unit]): Unit = (!struct.at1 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]])
        inline def update_hash : CFuncPtr3[Ptr[MG_UECC_HashContext], Ptr[uint8_t], CUnsignedInt, Unit] = struct._2.asInstanceOf[CFuncPtr3[Ptr[MG_UECC_HashContext], Ptr[uint8_t], CUnsignedInt, Unit]]
        inline def update_hash_=(value: CFuncPtr3[Ptr[MG_UECC_HashContext], Ptr[uint8_t], CUnsignedInt, Unit]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CUnsignedInt, Unit]])
        inline def finish_hash : CFuncPtr2[Ptr[MG_UECC_HashContext], Ptr[uint8_t], Unit] = struct._3.asInstanceOf[CFuncPtr2[Ptr[MG_UECC_HashContext], Ptr[uint8_t], Unit]]
        inline def finish_hash_=(value: CFuncPtr2[Ptr[MG_UECC_HashContext], Ptr[uint8_t], Unit]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[uint8_t], Unit]])
        inline def block_size : CUnsignedInt = struct._4
        inline def block_size_=(value: CUnsignedInt): Unit = (!struct.at4 = value)
        inline def result_size : CUnsignedInt = struct._5
        inline def result_size_=(value: CUnsignedInt): Unit = (!struct.at5 = value)
        inline def tmp : Ptr[uint8_t] = struct._6
        inline def tmp_=(value: Ptr[uint8_t]): Unit = (!struct.at6 = value)
      end extension
    
    // Allocates MG_UECC_HashContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[MG_UECC_HashContext] = scala.scalanative.unsafe.alloc[MG_UECC_HashContext](1)
    def apply(init_hash : CFuncPtr1[Ptr[MG_UECC_HashContext], Unit], update_hash : CFuncPtr3[Ptr[MG_UECC_HashContext], Ptr[uint8_t], CUnsignedInt, Unit], finish_hash : CFuncPtr2[Ptr[MG_UECC_HashContext], Ptr[uint8_t], Unit], block_size : CUnsignedInt, result_size : CUnsignedInt, tmp : Ptr[uint8_t])(using Zone): Ptr[MG_UECC_HashContext] =
      val ____ptr = apply()
      (!____ptr).init_hash = init_hash
      (!____ptr).update_hash = update_hash
      (!____ptr).finish_hash = finish_hash
      (!____ptr).block_size = block_size
      (!____ptr).result_size = result_size
      (!____ptr).tmp = tmp
      ____ptr
    
    

  /**
   * **************************************************************************** AES_CONTEXT : cipher context / holds inter-call data ****************************************************************************
  
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type aes_context = CStruct4[CInt, CInt, Ptr[uint32_t], CArray[uint32_t, Nat.Digit2[Nat._6, Nat._8]]]
  
  object aes_context:
    given _tag: Tag[aes_context] = Tag.materializeCStruct4Tag[CInt, CInt, Ptr[uint32_t], CArray[uint32_t, Nat.Digit2[Nat._6, Nat._8]]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: aes_context)
        inline def mode : CInt = struct._1
        inline def mode_=(value: CInt): Unit = (!struct.at1 = value)
        inline def rounds : CInt = struct._2
        inline def rounds_=(value: CInt): Unit = (!struct.at2 = value)
        inline def rk : Ptr[uint32_t] = struct._3
        inline def rk_=(value: Ptr[uint32_t]): Unit = (!struct.at3 = value)
        inline def buf : CArray[uint32_t, Nat.Digit2[Nat._6, Nat._8]] = struct._4
        inline def buf_=(value: CArray[uint32_t, Nat.Digit2[Nat._6, Nat._8]]): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates aes_context on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[aes_context] = scala.scalanative.unsafe.alloc[aes_context](1)
    def apply(mode : CInt, rounds : CInt, rk : Ptr[uint32_t], buf : CArray[uint32_t, Nat.Digit2[Nat._6, Nat._8]])(using Zone): Ptr[aes_context] =
      val ____ptr = apply()
      (!____ptr).mode = mode
      (!____ptr).rounds = rounds
      (!____ptr).rk = rk
      (!____ptr).buf = buf
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_addr = CStruct4[mg_addr_Addr, uint16_t, uint8_t, Boolean]
  
  object mg_addr:
    given _tag: Tag[mg_addr] = Tag.materializeCStruct4Tag[mg_addr_Addr, uint16_t, uint8_t, Boolean]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_addr)
        inline def addr : mg_addr_Addr = struct._1
        inline def addr_=(value: mg_addr_Addr): Unit = (!struct.at1 = value)
        inline def port : uint16_t = struct._2
        inline def port_=(value: uint16_t): Unit = (!struct.at2 = value)
        inline def scope_id : uint8_t = struct._3
        inline def scope_id_=(value: uint8_t): Unit = (!struct.at3 = value)
        inline def is_ip6 : Boolean = struct._4
        inline def is_ip6_=(value: Boolean): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_addr on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_addr] = scala.scalanative.unsafe.alloc[mg_addr](1)
    def apply(addr : mg_addr_Addr, port : uint16_t, scope_id : uint8_t, is_ip6 : Boolean)(using Zone): Ptr[mg_addr] =
      val ____ptr = apply()
      (!____ptr).addr = addr
      (!____ptr).port = port
      (!____ptr).scope_id = scope_id
      (!____ptr).is_ip6 = is_ip6
      ____ptr
    
    
  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_addr_Addr = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
  object mg_addr_Addr:
    given _tag: Tag[mg_addr_Addr] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
    
    def apply()(using Zone): Ptr[mg_addr_Addr] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_addr_Addr](1)
      ___ptr
    
    @scala.annotation.targetName("apply_ip")
    def apply(ip: CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[mg_addr_Addr] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_addr_Addr](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]]]].update(0, ip)
      ___ptr
    
    @scala.annotation.targetName("apply_ip4")
    def apply(ip4: uint32_t)(using Zone): Ptr[mg_addr_Addr] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_addr_Addr](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uint32_t]].update(0, ip4)
      ___ptr
    
    @scala.annotation.targetName("apply_ip6")
    def apply(ip6: CArray[uint64_t, Nat._2])(using Zone): Ptr[mg_addr_Addr] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_addr_Addr](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CArray[uint64_t, Nat._2]]].update(0, ip6)
      ___ptr
    
    extension (struct: mg_addr_Addr)
      inline def ip : CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]]]]
      inline def ip_=(value: CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]]]] = value
      inline def ip4 : uint32_t = !struct.at(0).asInstanceOf[Ptr[uint32_t]]
      inline def ip4_=(value: uint32_t): Unit = !struct.at(0).asInstanceOf[Ptr[uint32_t]] = value
      inline def ip6 : CArray[uint64_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[uint64_t, Nat._2]]]
      inline def ip6_=(value: CArray[uint64_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint64_t, Nat._2]]] = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_connection = CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._8]]
  
  object mg_connection:
    given _tag: Tag[mg_connection] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._8]](Tag.Byte, Tag.Digit3[Nat._2, Nat._8, Nat._8](Tag.Nat2, Tag.Nat8, Tag.Nat8))
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_connection)
        inline def next: Ptr[mg_connection] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[mg_connection]]]
        inline def next_=(value: Ptr[mg_connection]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[mg_connection]]] = value
        inline def mgr: Ptr[mg_mgr] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[mg_mgr]]]
        inline def mgr_=(value: Ptr[mg_mgr]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[mg_mgr]]] = value
        inline def loc: mg_addr = !struct.at(offsets(2)).asInstanceOf[Ptr[mg_addr]]
        inline def loc_=(value: mg_addr): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[mg_addr]] = value
        inline def rem: mg_addr = !struct.at(offsets(3)).asInstanceOf[Ptr[mg_addr]]
        inline def rem_=(value: mg_addr): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[mg_addr]] = value
        inline def fd: Ptr[Byte] = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def fd_=(value: Ptr[Byte]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def id: CUnsignedLongInt = !struct.at(offsets(5)).asInstanceOf[Ptr[CUnsignedLongInt]]
        inline def id_=(value: CUnsignedLongInt): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CUnsignedLongInt]] = value
        inline def recv: mg_iobuf = !struct.at(offsets(6)).asInstanceOf[Ptr[mg_iobuf]]
        inline def recv_=(value: mg_iobuf): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[mg_iobuf]] = value
        inline def send: mg_iobuf = !struct.at(offsets(7)).asInstanceOf[Ptr[mg_iobuf]]
        inline def send_=(value: mg_iobuf): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[mg_iobuf]] = value
        inline def prof: mg_iobuf = !struct.at(offsets(8)).asInstanceOf[Ptr[mg_iobuf]]
        inline def prof_=(value: mg_iobuf): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[mg_iobuf]] = value
        inline def rtls: mg_iobuf = !struct.at(offsets(9)).asInstanceOf[Ptr[mg_iobuf]]
        inline def rtls_=(value: mg_iobuf): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[mg_iobuf]] = value
        inline def fn: mg_event_handler_t = !struct.at(offsets(10)).asInstanceOf[Ptr[mg_event_handler_t]]
        inline def fn_=(value: mg_event_handler_t): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[mg_event_handler_t]] = value
        inline def fn_data: Ptr[Byte] = !struct.at(offsets(11)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def fn_data_=(value: Ptr[Byte]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def pfn: mg_event_handler_t = !struct.at(offsets(12)).asInstanceOf[Ptr[mg_event_handler_t]]
        inline def pfn_=(value: mg_event_handler_t): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[mg_event_handler_t]] = value
        inline def pfn_data: Ptr[Byte] = !struct.at(offsets(13)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def pfn_data_=(value: Ptr[Byte]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def data: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = !struct.at(offsets(14)).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]]]
        inline def data_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]]] = value
        inline def tls: Ptr[Byte] = !struct.at(offsets(15)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def tls_=(value: Ptr[Byte]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def is_listening: CUnsignedInt = !struct.at(offsets(16)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_listening_=(value: CUnsignedInt): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_client: CUnsignedInt = !struct.at(offsets(17)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_client_=(value: CUnsignedInt): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_accepted: CUnsignedInt = !struct.at(offsets(18)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_accepted_=(value: CUnsignedInt): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_resolving: CUnsignedInt = !struct.at(offsets(19)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_resolving_=(value: CUnsignedInt): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_arplooking: CUnsignedInt = !struct.at(offsets(20)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_arplooking_=(value: CUnsignedInt): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_connecting: CUnsignedInt = !struct.at(offsets(21)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_connecting_=(value: CUnsignedInt): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_tls: CUnsignedInt = !struct.at(offsets(22)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_tls_=(value: CUnsignedInt): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_tls_hs: CUnsignedInt = !struct.at(offsets(23)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_tls_hs_=(value: CUnsignedInt): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_udp: CUnsignedInt = !struct.at(offsets(24)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_udp_=(value: CUnsignedInt): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_websocket: CUnsignedInt = !struct.at(offsets(25)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_websocket_=(value: CUnsignedInt): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_mqtt5: CUnsignedInt = !struct.at(offsets(26)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_mqtt5_=(value: CUnsignedInt): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_hexdumping: CUnsignedInt = !struct.at(offsets(27)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_hexdumping_=(value: CUnsignedInt): Unit = !struct.at(offsets(27)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_draining: CUnsignedInt = !struct.at(offsets(28)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_draining_=(value: CUnsignedInt): Unit = !struct.at(offsets(28)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_closing: CUnsignedInt = !struct.at(offsets(29)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_closing_=(value: CUnsignedInt): Unit = !struct.at(offsets(29)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_full: CUnsignedInt = !struct.at(offsets(30)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_full_=(value: CUnsignedInt): Unit = !struct.at(offsets(30)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_tls_throttled: CUnsignedInt = !struct.at(offsets(31)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_tls_throttled_=(value: CUnsignedInt): Unit = !struct.at(offsets(31)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_resp: CUnsignedInt = !struct.at(offsets(32)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_resp_=(value: CUnsignedInt): Unit = !struct.at(offsets(32)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_readable: CUnsignedInt = !struct.at(offsets(33)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_readable_=(value: CUnsignedInt): Unit = !struct.at(offsets(33)).asInstanceOf[Ptr[CUnsignedInt]] = value
        inline def is_writable: CUnsignedInt = !struct.at(offsets(34)).asInstanceOf[Ptr[CUnsignedInt]]
        inline def is_writable_=(value: CUnsignedInt): Unit = !struct.at(offsets(34)).asInstanceOf[Ptr[CUnsignedInt]] = value
      end extension
    
    // Allocates mg_connection on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_connection] = scala.scalanative.unsafe.alloc[mg_connection](1)
    def apply(next : Ptr[mg_connection], mgr : Ptr[mg_mgr], loc : mg_addr, rem : mg_addr, fd : Ptr[Byte], id : CUnsignedLongInt, recv : mg_iobuf, send : mg_iobuf, prof : mg_iobuf, rtls : mg_iobuf, fn : mg_event_handler_t, fn_data : Ptr[Byte], pfn : mg_event_handler_t, pfn_data : Ptr[Byte], data : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], tls : Ptr[Byte], is_listening : CUnsignedInt, is_client : CUnsignedInt, is_accepted : CUnsignedInt, is_resolving : CUnsignedInt, is_arplooking : CUnsignedInt, is_connecting : CUnsignedInt, is_tls : CUnsignedInt, is_tls_hs : CUnsignedInt, is_udp : CUnsignedInt, is_websocket : CUnsignedInt, is_mqtt5 : CUnsignedInt, is_hexdumping : CUnsignedInt, is_draining : CUnsignedInt, is_closing : CUnsignedInt, is_full : CUnsignedInt, is_tls_throttled : CUnsignedInt, is_resp : CUnsignedInt, is_readable : CUnsignedInt, is_writable : CUnsignedInt)(using Zone): Ptr[mg_connection] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).mgr = mgr
      (!____ptr).loc = loc
      (!____ptr).rem = rem
      (!____ptr).fd = fd
      (!____ptr).id = id
      (!____ptr).recv = recv
      (!____ptr).send = send
      (!____ptr).prof = prof
      (!____ptr).rtls = rtls
      (!____ptr).fn = fn
      (!____ptr).fn_data = fn_data
      (!____ptr).pfn = pfn
      (!____ptr).pfn_data = pfn_data
      (!____ptr).data = data
      (!____ptr).tls = tls
      (!____ptr).is_listening = is_listening
      (!____ptr).is_client = is_client
      (!____ptr).is_accepted = is_accepted
      (!____ptr).is_resolving = is_resolving
      (!____ptr).is_arplooking = is_arplooking
      (!____ptr).is_connecting = is_connecting
      (!____ptr).is_tls = is_tls
      (!____ptr).is_tls_hs = is_tls_hs
      (!____ptr).is_udp = is_udp
      (!____ptr).is_websocket = is_websocket
      (!____ptr).is_mqtt5 = is_mqtt5
      (!____ptr).is_hexdumping = is_hexdumping
      (!____ptr).is_draining = is_draining
      (!____ptr).is_closing = is_closing
      (!____ptr).is_full = is_full
      (!____ptr).is_tls_throttled = is_tls_throttled
      (!____ptr).is_resp = is_resp
      (!____ptr).is_readable = is_readable
      (!____ptr).is_writable = is_writable
      ____ptr
    
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](35)
      def align(offset: Int, alignment: Int) = {
        val alignmentMask = alignment - 1
        val padding =
          if ((offset & alignmentMask) == 0) 0
          else alignment - (offset & alignmentMask)
        offset + padding
      }
      
      res(0) = align(0, alignmentof[Ptr[mg_connection]].toInt)
      res(1) = align(res(0) + sizeof[Ptr[mg_connection]].toInt, alignmentof[Ptr[mg_mgr]].toInt)
      res(2) = align(res(1) + sizeof[Ptr[mg_mgr]].toInt, alignmentof[mg_addr].toInt)
      res(3) = align(res(2) + sizeof[mg_addr].toInt, alignmentof[mg_addr].toInt)
      res(4) = align(res(3) + sizeof[mg_addr].toInt, alignmentof[Ptr[Byte]].toInt)
      res(5) = align(res(4) + sizeof[Ptr[Byte]].toInt, alignmentof[CUnsignedLongInt].toInt)
      res(6) = align(res(5) + sizeof[CUnsignedLongInt].toInt, alignmentof[mg_iobuf].toInt)
      res(7) = align(res(6) + sizeof[mg_iobuf].toInt, alignmentof[mg_iobuf].toInt)
      res(8) = align(res(7) + sizeof[mg_iobuf].toInt, alignmentof[mg_iobuf].toInt)
      res(9) = align(res(8) + sizeof[mg_iobuf].toInt, alignmentof[mg_iobuf].toInt)
      res(10) = align(res(9) + sizeof[mg_iobuf].toInt, alignmentof[mg_event_handler_t].toInt)
      res(11) = align(res(10) + sizeof[mg_event_handler_t].toInt, alignmentof[Ptr[Byte]].toInt)
      res(12) = align(res(11) + sizeof[Ptr[Byte]].toInt, alignmentof[mg_event_handler_t].toInt)
      res(13) = align(res(12) + sizeof[mg_event_handler_t].toInt, alignmentof[Ptr[Byte]].toInt)
      res(14) = align(res(13) + sizeof[Ptr[Byte]].toInt, alignmentof[CChar].toInt)
      res(15) = align(res(14) + sizeof[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]].toInt, alignmentof[Ptr[Byte]].toInt)
      res(16) = align(res(15) + sizeof[Ptr[Byte]].toInt, alignmentof[CUnsignedInt].toInt)
      res(17) = align(res(16) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(18) = align(res(17) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(19) = align(res(18) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(20) = align(res(19) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(21) = align(res(20) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(22) = align(res(21) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(23) = align(res(22) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(24) = align(res(23) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(25) = align(res(24) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(26) = align(res(25) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(27) = align(res(26) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(28) = align(res(27) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(29) = align(res(28) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(30) = align(res(29) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(31) = align(res(30) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(32) = align(res(31) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(33) = align(res(32) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(34) = align(res(33) + sizeof[CUnsignedInt].toInt, alignmentof[CUnsignedInt].toInt)
      res
    end offsets
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dash = CStruct4[Ptr[Byte], Ptr[Byte], CFuncPtr3[CString, size_t, CString, CInt], CInt]
  
  object mg_dash:
    given _tag: Tag[mg_dash] = Tag.materializeCStruct4Tag[Ptr[Byte], Ptr[Byte], CFuncPtr3[CString, size_t, CString, CInt], CInt]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dash)
        inline def sets : Ptr[mg_field_set] = struct._1.asInstanceOf[Ptr[mg_field_set]]
        inline def sets_=(value: Ptr[mg_field_set]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
        inline def custom_handlers : Ptr[mg_dash_custom_handler] = struct._2.asInstanceOf[Ptr[mg_dash_custom_handler]]
        inline def custom_handlers_=(value: Ptr[mg_dash_custom_handler]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
        inline def authenticate : CFuncPtr3[CString, size_t, CString, CInt] = struct._3
        inline def authenticate_=(value: CFuncPtr3[CString, size_t, CString, CInt]): Unit = (!struct.at3 = value)
        inline def session_auto_expiration_seconds : CInt = struct._4
        inline def session_auto_expiration_seconds_=(value: CInt): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_dash on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dash] = scala.scalanative.unsafe.alloc[mg_dash](1)
    def apply(sets : Ptr[mg_field_set], custom_handlers : Ptr[mg_dash_custom_handler], authenticate : CFuncPtr3[CString, size_t, CString, CInt], session_auto_expiration_seconds : CInt)(using Zone): Ptr[mg_dash] =
      val ____ptr = apply()
      (!____ptr).sets = sets
      (!____ptr).custom_handlers = custom_handlers
      (!____ptr).authenticate = authenticate
      (!____ptr).session_auto_expiration_seconds = session_auto_expiration_seconds
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dash_custom_handler = CStruct4[Ptr[Byte], mg_str, mg_event_handler_t, Ptr[Byte]]
  
  object mg_dash_custom_handler:
    given _tag: Tag[mg_dash_custom_handler] = Tag.materializeCStruct4Tag[Ptr[Byte], mg_str, mg_event_handler_t, Ptr[Byte]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dash_custom_handler)
        inline def next : Ptr[mg_dash_custom_handler] = struct._1.asInstanceOf[Ptr[mg_dash_custom_handler]]
        inline def next_=(value: Ptr[mg_dash_custom_handler]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
        inline def uri_pattern : mg_str = struct._2
        inline def uri_pattern_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def handler : mg_event_handler_t = struct._3
        inline def handler_=(value: mg_event_handler_t): Unit = (!struct.at3 = value)
        inline def handler_data : Ptr[Byte] = struct._4
        inline def handler_data_=(value: Ptr[Byte]): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_dash_custom_handler on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dash_custom_handler] = scala.scalanative.unsafe.alloc[mg_dash_custom_handler](1)
    def apply(next : Ptr[mg_dash_custom_handler], uri_pattern : mg_str, handler : mg_event_handler_t, handler_data : Ptr[Byte])(using Zone): Ptr[mg_dash_custom_handler] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).uri_pattern = uri_pattern
      (!____ptr).handler = handler
      (!____ptr).handler_data = handler_data
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dash_file = CStruct3[Ptr[Byte], CString, size_t]
  
  object mg_dash_file:
    given _tag: Tag[mg_dash_file] = Tag.materializeCStruct3Tag[Ptr[Byte], CString, size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dash_file)
        inline def next : Ptr[mg_dash_file] = struct._1.asInstanceOf[Ptr[mg_dash_file]]
        inline def next_=(value: Ptr[mg_dash_file]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
        inline def name : CString = struct._2
        inline def name_=(value: CString): Unit = (!struct.at2 = value)
        inline def size : size_t = struct._3
        inline def size_=(value: size_t): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates mg_dash_file on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dash_file] = scala.scalanative.unsafe.alloc[mg_dash_file](1)
    def apply(next : Ptr[mg_dash_file], name : CString, size : size_t)(using Zone): Ptr[mg_dash_file] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).name = name
      (!____ptr).size = size
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dns = CStruct2[CString, Ptr[mg_connection]]
  
  object mg_dns:
    given _tag: Tag[mg_dns] = Tag.materializeCStruct2Tag[CString, Ptr[mg_connection]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dns)
        inline def url : CString = struct._1
        inline def url_=(value: CString): Unit = (!struct.at1 = value)
        inline def c : Ptr[mg_connection] = struct._2
        inline def c_=(value: Ptr[mg_connection]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates mg_dns on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dns] = scala.scalanative.unsafe.alloc[mg_dns](1)
    def apply(url : CString, c : Ptr[mg_connection])(using Zone): Ptr[mg_dns] =
      val ____ptr = apply()
      (!____ptr).url = url
      (!____ptr).c = c
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dns_header = CStruct6[uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t]
  
  object mg_dns_header:
    given _tag: Tag[mg_dns_header] = Tag.materializeCStruct6Tag[uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dns_header)
        inline def txnid : uint16_t = struct._1
        inline def txnid_=(value: uint16_t): Unit = (!struct.at1 = value)
        inline def flags : uint16_t = struct._2
        inline def flags_=(value: uint16_t): Unit = (!struct.at2 = value)
        inline def num_questions : uint16_t = struct._3
        inline def num_questions_=(value: uint16_t): Unit = (!struct.at3 = value)
        inline def num_answers : uint16_t = struct._4
        inline def num_answers_=(value: uint16_t): Unit = (!struct.at4 = value)
        inline def num_authority_prs : uint16_t = struct._5
        inline def num_authority_prs_=(value: uint16_t): Unit = (!struct.at5 = value)
        inline def num_other_prs : uint16_t = struct._6
        inline def num_other_prs_=(value: uint16_t): Unit = (!struct.at6 = value)
      end extension
    
    // Allocates mg_dns_header on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dns_header] = scala.scalanative.unsafe.alloc[mg_dns_header](1)
    def apply(txnid : uint16_t, flags : uint16_t, num_questions : uint16_t, num_answers : uint16_t, num_authority_prs : uint16_t, num_other_prs : uint16_t)(using Zone): Ptr[mg_dns_header] =
      val ____ptr = apply()
      (!____ptr).txnid = txnid
      (!____ptr).flags = flags
      (!____ptr).num_questions = num_questions
      (!____ptr).num_answers = num_answers
      (!____ptr).num_authority_prs = num_authority_prs
      (!____ptr).num_other_prs = num_other_prs
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dns_message = CStruct4[uint16_t, Boolean, mg_addr, CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  
  object mg_dns_message:
    given _tag: Tag[mg_dns_message] = Tag.materializeCStruct4Tag[uint16_t, Boolean, mg_addr, CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dns_message)
        inline def txnid : uint16_t = struct._1
        inline def txnid_=(value: uint16_t): Unit = (!struct.at1 = value)
        inline def resolved : Boolean = struct._2
        inline def resolved_=(value: Boolean): Unit = (!struct.at2 = value)
        inline def addr : mg_addr = struct._3
        inline def addr_=(value: mg_addr): Unit = (!struct.at3 = value)
        inline def name : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
        inline def name_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_dns_message on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dns_message] = scala.scalanative.unsafe.alloc[mg_dns_message](1)
    def apply(txnid : uint16_t, resolved : Boolean, addr : mg_addr, name : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[mg_dns_message] =
      val ____ptr = apply()
      (!____ptr).txnid = txnid
      (!____ptr).resolved = resolved
      (!____ptr).addr = addr
      (!____ptr).name = name
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dns_rr = CStruct4[uint16_t, uint16_t, uint16_t, uint16_t]
  
  object mg_dns_rr:
    given _tag: Tag[mg_dns_rr] = Tag.materializeCStruct4Tag[uint16_t, uint16_t, uint16_t, uint16_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dns_rr)
        inline def nlen : uint16_t = struct._1
        inline def nlen_=(value: uint16_t): Unit = (!struct.at1 = value)
        inline def atype : uint16_t = struct._2
        inline def atype_=(value: uint16_t): Unit = (!struct.at2 = value)
        inline def aclass : uint16_t = struct._3
        inline def aclass_=(value: uint16_t): Unit = (!struct.at3 = value)
        inline def alen : uint16_t = struct._4
        inline def alen_=(value: uint16_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_dns_rr on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dns_rr] = scala.scalanative.unsafe.alloc[mg_dns_rr](1)
    def apply(nlen : uint16_t, atype : uint16_t, aclass : uint16_t, alen : uint16_t)(using Zone): Ptr[mg_dns_rr] =
      val ____ptr = apply()
      (!____ptr).nlen = nlen
      (!____ptr).atype = atype
      (!____ptr).aclass = aclass
      (!____ptr).alen = alen
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_dnssd_record = CStruct3[mg_str, mg_str, uint16_t]
  
  object mg_dnssd_record:
    given _tag: Tag[mg_dnssd_record] = Tag.materializeCStruct3Tag[mg_str, mg_str, uint16_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_dnssd_record)
        inline def srvcproto : mg_str = struct._1
        inline def srvcproto_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def txt : mg_str = struct._2
        inline def txt_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def port : uint16_t = struct._3
        inline def port_=(value: uint16_t): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates mg_dnssd_record on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_dnssd_record] = scala.scalanative.unsafe.alloc[mg_dnssd_record](1)
    def apply(srvcproto : mg_str, txt : mg_str, port : uint16_t)(using Zone): Ptr[mg_dnssd_record] =
      val ____ptr = apply()
      (!____ptr).srvcproto = srvcproto
      (!____ptr).txt = txt
      (!____ptr).port = port
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_fd = CStruct2[Ptr[Byte], Ptr[mg_fs]]
  
  object mg_fd:
    given _tag: Tag[mg_fd] = Tag.materializeCStruct2Tag[Ptr[Byte], Ptr[mg_fs]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_fd)
        inline def fd : Ptr[Byte] = struct._1
        inline def fd_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def fs : Ptr[mg_fs] = struct._2
        inline def fs_=(value: Ptr[mg_fs]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates mg_fd on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_fd] = scala.scalanative.unsafe.alloc[mg_fd](1)
    def apply(fd : Ptr[Byte], fs : Ptr[mg_fs])(using Zone): Ptr[mg_fd] =
      val ____ptr = apply()
      (!____ptr).fd = fd
      (!____ptr).fs = fs
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_field = CStruct4[CString, mg_val_type, Ptr[Byte], size_t]
  
  object mg_field:
    given _tag: Tag[mg_field] = Tag.materializeCStruct4Tag[CString, mg_val_type, Ptr[Byte], size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_field)
        inline def name : CString = struct._1
        inline def name_=(value: CString): Unit = (!struct.at1 = value)
        inline def `type` : mg_val_type = struct._2
        inline def type_=(value: mg_val_type): Unit = (!struct.at2 = value)
        inline def value : Ptr[Byte] = struct._3
        inline def value_=(value: Ptr[Byte]): Unit = (!struct.at3 = value)
        inline def value_size : size_t = struct._4
        inline def value_size_=(value: size_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_field on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_field] = scala.scalanative.unsafe.alloc[mg_field](1)
    def apply(name : CString, `type` : mg_val_type, value : Ptr[Byte], value_size : size_t)(using Zone): Ptr[mg_field] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).`type` = `type`
      (!____ptr).value = value
      (!____ptr).value_size = value_size
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_field_set = CStruct7[CString, Ptr[mg_field], CFuncPtr0[Unit], CFuncPtr0[Unit], CInt, CInt, Ptr[Byte]]
  
  object mg_field_set:
    given _tag: Tag[mg_field_set] = Tag.materializeCStruct7Tag[CString, Ptr[mg_field], CFuncPtr0[Unit], CFuncPtr0[Unit], CInt, CInt, Ptr[Byte]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_field_set)
        inline def name : CString = struct._1
        inline def name_=(value: CString): Unit = (!struct.at1 = value)
        inline def fields : Ptr[mg_field] = struct._2
        inline def fields_=(value: Ptr[mg_field]): Unit = (!struct.at2 = value)
        inline def reader : CFuncPtr0[Unit] = struct._3
        inline def reader_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
        inline def writer : CFuncPtr0[Unit] = struct._4
        inline def writer_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
        inline def read_level : CInt = struct._5
        inline def read_level_=(value: CInt): Unit = (!struct.at5 = value)
        inline def write_level : CInt = struct._6
        inline def write_level_=(value: CInt): Unit = (!struct.at6 = value)
        inline def next : Ptr[mg_field_set] = struct._7.asInstanceOf[Ptr[mg_field_set]]
        inline def next_=(value: Ptr[mg_field_set]): Unit = (!struct.at7 = value.asInstanceOf[Ptr[Byte]])
      end extension
    
    // Allocates mg_field_set on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_field_set] = scala.scalanative.unsafe.alloc[mg_field_set](1)
    def apply(name : CString, fields : Ptr[mg_field], reader : CFuncPtr0[Unit], writer : CFuncPtr0[Unit], read_level : CInt, write_level : CInt, next : Ptr[mg_field_set])(using Zone): Ptr[mg_field_set] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).fields = fields
      (!____ptr).reader = reader
      (!____ptr).writer = writer
      (!____ptr).read_level = read_level
      (!____ptr).write_level = write_level
      (!____ptr).next = next
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_fs = CStruct10[CFuncPtr3[CString, Ptr[size_t], Ptr[time_t], CInt], CFuncPtr3[CString, CFuncPtr2[CString, Ptr[Byte], Unit], Ptr[Byte], Unit], CFuncPtr2[CString, CInt, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t], CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t], CFuncPtr2[Ptr[Byte], size_t, size_t], CFuncPtr2[CString, CString, Boolean], CFuncPtr1[CString, Boolean], CFuncPtr1[CString, Boolean]]
  
  object mg_fs:
    given _tag: Tag[mg_fs] = Tag.materializeCStruct10Tag[CFuncPtr3[CString, Ptr[size_t], Ptr[time_t], CInt], CFuncPtr3[CString, CFuncPtr2[CString, Ptr[Byte], Unit], Ptr[Byte], Unit], CFuncPtr2[CString, CInt, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t], CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t], CFuncPtr2[Ptr[Byte], size_t, size_t], CFuncPtr2[CString, CString, Boolean], CFuncPtr1[CString, Boolean], CFuncPtr1[CString, Boolean]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_fs)
        inline def st : CFuncPtr3[CString, Ptr[size_t], Ptr[time_t], CInt] = struct._1
        inline def st_=(value: CFuncPtr3[CString, Ptr[size_t], Ptr[time_t], CInt]): Unit = (!struct.at1 = value)
        inline def ls : CFuncPtr3[CString, CFuncPtr2[CString, Ptr[Byte], Unit], Ptr[Byte], Unit] = struct._2
        inline def ls_=(value: CFuncPtr3[CString, CFuncPtr2[CString, Ptr[Byte], Unit], Ptr[Byte], Unit]): Unit = (!struct.at2 = value)
        inline def op : CFuncPtr2[CString, CInt, Ptr[Byte]] = struct._3
        inline def op_=(value: CFuncPtr2[CString, CInt, Ptr[Byte]]): Unit = (!struct.at3 = value)
        inline def cl : CFuncPtr1[Ptr[Byte], Unit] = struct._4
        inline def cl_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = (!struct.at4 = value)
        inline def rd : CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t] = struct._5
        inline def rd_=(value: CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t]): Unit = (!struct.at5 = value)
        inline def wr : CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t] = struct._6
        inline def wr_=(value: CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t]): Unit = (!struct.at6 = value)
        inline def sk : CFuncPtr2[Ptr[Byte], size_t, size_t] = struct._7
        inline def sk_=(value: CFuncPtr2[Ptr[Byte], size_t, size_t]): Unit = (!struct.at7 = value)
        inline def mv : CFuncPtr2[CString, CString, Boolean] = struct._8
        inline def mv_=(value: CFuncPtr2[CString, CString, Boolean]): Unit = (!struct.at8 = value)
        inline def rm : CFuncPtr1[CString, Boolean] = struct._9
        inline def rm_=(value: CFuncPtr1[CString, Boolean]): Unit = (!struct.at9 = value)
        inline def mkd : CFuncPtr1[CString, Boolean] = struct._10
        inline def mkd_=(value: CFuncPtr1[CString, Boolean]): Unit = (!struct.at10 = value)
      end extension
    
    // Allocates mg_fs on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_fs] = scala.scalanative.unsafe.alloc[mg_fs](1)
    def apply(st : CFuncPtr3[CString, Ptr[size_t], Ptr[time_t], CInt], ls : CFuncPtr3[CString, CFuncPtr2[CString, Ptr[Byte], Unit], Ptr[Byte], Unit], op : CFuncPtr2[CString, CInt, Ptr[Byte]], cl : CFuncPtr1[Ptr[Byte], Unit], rd : CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t], wr : CFuncPtr3[Ptr[Byte], Ptr[Byte], size_t, size_t], sk : CFuncPtr2[Ptr[Byte], size_t, size_t], mv : CFuncPtr2[CString, CString, Boolean], rm : CFuncPtr1[CString, Boolean], mkd : CFuncPtr1[CString, Boolean])(using Zone): Ptr[mg_fs] =
      val ____ptr = apply()
      (!____ptr).st = st
      (!____ptr).ls = ls
      (!____ptr).op = op
      (!____ptr).cl = cl
      (!____ptr).rd = rd
      (!____ptr).wr = wr
      (!____ptr).sk = sk
      (!____ptr).mv = mv
      (!____ptr).rm = rm
      (!____ptr).mkd = mkd
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_http_header = CStruct2[mg_str, mg_str]
  
  object mg_http_header:
    given _tag: Tag[mg_http_header] = Tag.materializeCStruct2Tag[mg_str, mg_str]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_http_header)
        inline def name : mg_str = struct._1
        inline def name_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def value : mg_str = struct._2
        inline def value_=(value: mg_str): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates mg_http_header on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_http_header] = scala.scalanative.unsafe.alloc[mg_http_header](1)
    def apply(name : mg_str, value : mg_str)(using Zone): Ptr[mg_http_header] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).value = value
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_http_message = CStruct8[mg_str, mg_str, mg_str, mg_str, CArray[mg_http_header, Nat.Digit2[Nat._3, Nat._0]], mg_str, mg_str, mg_str]
  
  object mg_http_message:
    given _tag: Tag[mg_http_message] = Tag.materializeCStruct8Tag[mg_str, mg_str, mg_str, mg_str, CArray[mg_http_header, Nat.Digit2[Nat._3, Nat._0]], mg_str, mg_str, mg_str]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_http_message)
        inline def method : mg_str = struct._1
        inline def method_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def uri : mg_str = struct._2
        inline def uri_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def query : mg_str = struct._3
        inline def query_=(value: mg_str): Unit = (!struct.at3 = value)
        inline def proto : mg_str = struct._4
        inline def proto_=(value: mg_str): Unit = (!struct.at4 = value)
        inline def headers : CArray[mg_http_header, Nat.Digit2[Nat._3, Nat._0]] = struct._5
        inline def headers_=(value: CArray[mg_http_header, Nat.Digit2[Nat._3, Nat._0]]): Unit = (!struct.at5 = value)
        inline def body : mg_str = struct._6
        inline def body_=(value: mg_str): Unit = (!struct.at6 = value)
        inline def head : mg_str = struct._7
        inline def head_=(value: mg_str): Unit = (!struct.at7 = value)
        inline def message : mg_str = struct._8
        inline def message_=(value: mg_str): Unit = (!struct.at8 = value)
      end extension
    
    // Allocates mg_http_message on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_http_message] = scala.scalanative.unsafe.alloc[mg_http_message](1)
    def apply(method : mg_str, uri : mg_str, query : mg_str, proto : mg_str, headers : CArray[mg_http_header, Nat.Digit2[Nat._3, Nat._0]], body : mg_str, head : mg_str, message : mg_str)(using Zone): Ptr[mg_http_message] =
      val ____ptr = apply()
      (!____ptr).method = method
      (!____ptr).uri = uri
      (!____ptr).query = query
      (!____ptr).proto = proto
      (!____ptr).headers = headers
      (!____ptr).body = body
      (!____ptr).head = head
      (!____ptr).message = message
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_http_part = CStruct3[mg_str, mg_str, mg_str]
  
  object mg_http_part:
    given _tag: Tag[mg_http_part] = Tag.materializeCStruct3Tag[mg_str, mg_str, mg_str]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_http_part)
        inline def name : mg_str = struct._1
        inline def name_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def filename : mg_str = struct._2
        inline def filename_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def body : mg_str = struct._3
        inline def body_=(value: mg_str): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates mg_http_part on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_http_part] = scala.scalanative.unsafe.alloc[mg_http_part](1)
    def apply(name : mg_str, filename : mg_str, body : mg_str)(using Zone): Ptr[mg_http_part] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).filename = filename
      (!____ptr).body = body
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_http_serve_opts = CStruct6[CString, CString, CString, CString, CString, Ptr[mg_fs]]
  
  object mg_http_serve_opts:
    given _tag: Tag[mg_http_serve_opts] = Tag.materializeCStruct6Tag[CString, CString, CString, CString, CString, Ptr[mg_fs]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_http_serve_opts)
        inline def root_dir : CString = struct._1
        inline def root_dir_=(value: CString): Unit = (!struct.at1 = value)
        inline def ssi_pattern : CString = struct._2
        inline def ssi_pattern_=(value: CString): Unit = (!struct.at2 = value)
        inline def extra_headers : CString = struct._3
        inline def extra_headers_=(value: CString): Unit = (!struct.at3 = value)
        inline def mime_types : CString = struct._4
        inline def mime_types_=(value: CString): Unit = (!struct.at4 = value)
        inline def page404 : CString = struct._5
        inline def page404_=(value: CString): Unit = (!struct.at5 = value)
        inline def fs : Ptr[mg_fs] = struct._6
        inline def fs_=(value: Ptr[mg_fs]): Unit = (!struct.at6 = value)
      end extension
    
    // Allocates mg_http_serve_opts on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_http_serve_opts] = scala.scalanative.unsafe.alloc[mg_http_serve_opts](1)
    def apply(root_dir : CString, ssi_pattern : CString, extra_headers : CString, mime_types : CString, page404 : CString, fs : Ptr[mg_fs])(using Zone): Ptr[mg_http_serve_opts] =
      val ____ptr = apply()
      (!____ptr).root_dir = root_dir
      (!____ptr).ssi_pattern = ssi_pattern
      (!____ptr).extra_headers = extra_headers
      (!____ptr).mime_types = mime_types
      (!____ptr).page404 = page404
      (!____ptr).fs = fs
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_iobuf = CStruct4[Ptr[CUnsignedChar], size_t, size_t, size_t]
  
  object mg_iobuf:
    given _tag: Tag[mg_iobuf] = Tag.materializeCStruct4Tag[Ptr[CUnsignedChar], size_t, size_t, size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_iobuf)
        inline def buf : Ptr[CUnsignedChar] = struct._1
        inline def buf_=(value: Ptr[CUnsignedChar]): Unit = (!struct.at1 = value)
        inline def size : size_t = struct._2
        inline def size_=(value: size_t): Unit = (!struct.at2 = value)
        inline def len : size_t = struct._3
        inline def len_=(value: size_t): Unit = (!struct.at3 = value)
        inline def align : size_t = struct._4
        inline def align_=(value: size_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_iobuf on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_iobuf] = scala.scalanative.unsafe.alloc[mg_iobuf](1)
    def apply(buf : Ptr[CUnsignedChar], size : size_t, len : size_t, align : size_t)(using Zone): Ptr[mg_iobuf] =
      val ____ptr = apply()
      (!____ptr).buf = buf
      (!____ptr).size = size
      (!____ptr).len = len
      (!____ptr).align = align
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_md5_ctx = CStruct3[CArray[uint32_t, Nat._4], CArray[uint32_t, Nat._2], CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]]
  
  object mg_md5_ctx:
    given _tag: Tag[mg_md5_ctx] = Tag.materializeCStruct3Tag[CArray[uint32_t, Nat._4], CArray[uint32_t, Nat._2], CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_md5_ctx)
        inline def buf : CArray[uint32_t, Nat._4] = struct._1
        inline def buf_=(value: CArray[uint32_t, Nat._4]): Unit = (!struct.at1 = value)
        inline def bits : CArray[uint32_t, Nat._2] = struct._2
        inline def bits_=(value: CArray[uint32_t, Nat._2]): Unit = (!struct.at2 = value)
        inline def in : CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]] = struct._3
        inline def in_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates mg_md5_ctx on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_md5_ctx] = scala.scalanative.unsafe.alloc[mg_md5_ctx](1)
    def apply(buf : CArray[uint32_t, Nat._4], bits : CArray[uint32_t, Nat._2], in : CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]])(using Zone): Ptr[mg_md5_ctx] =
      val ____ptr = apply()
      (!____ptr).buf = buf
      (!____ptr).bits = bits
      (!____ptr).in = in
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mdns_req = CStruct8[Ptr[mg_dns_rr], Ptr[mg_dnssd_record], mg_str, mg_str, Ptr[mg_addr], Boolean, Boolean, Boolean]
  
  object mg_mdns_req:
    given _tag: Tag[mg_mdns_req] = Tag.materializeCStruct8Tag[Ptr[mg_dns_rr], Ptr[mg_dnssd_record], mg_str, mg_str, Ptr[mg_addr], Boolean, Boolean, Boolean]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mdns_req)
        inline def rr : Ptr[mg_dns_rr] = struct._1
        inline def rr_=(value: Ptr[mg_dns_rr]): Unit = (!struct.at1 = value)
        inline def r : Ptr[mg_dnssd_record] = struct._2
        inline def r_=(value: Ptr[mg_dnssd_record]): Unit = (!struct.at2 = value)
        inline def reqname : mg_str = struct._3
        inline def reqname_=(value: mg_str): Unit = (!struct.at3 = value)
        inline def respname : mg_str = struct._4
        inline def respname_=(value: mg_str): Unit = (!struct.at4 = value)
        inline def addr : Ptr[mg_addr] = struct._5
        inline def addr_=(value: Ptr[mg_addr]): Unit = (!struct.at5 = value)
        inline def is_listing : Boolean = struct._6
        inline def is_listing_=(value: Boolean): Unit = (!struct.at6 = value)
        inline def is_resp : Boolean = struct._7
        inline def is_resp_=(value: Boolean): Unit = (!struct.at7 = value)
        inline def is_unicast : Boolean = struct._8
        inline def is_unicast_=(value: Boolean): Unit = (!struct.at8 = value)
      end extension
    
    // Allocates mg_mdns_req on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mdns_req] = scala.scalanative.unsafe.alloc[mg_mdns_req](1)
    def apply(rr : Ptr[mg_dns_rr], r : Ptr[mg_dnssd_record], reqname : mg_str, respname : mg_str, addr : Ptr[mg_addr], is_listing : Boolean, is_resp : Boolean, is_unicast : Boolean)(using Zone): Ptr[mg_mdns_req] =
      val ____ptr = apply()
      (!____ptr).rr = rr
      (!____ptr).r = r
      (!____ptr).reqname = reqname
      (!____ptr).respname = respname
      (!____ptr).addr = addr
      (!____ptr).is_listing = is_listing
      (!____ptr).is_resp = is_resp
      (!____ptr).is_unicast = is_unicast
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mdns_resp = CStruct3[Ptr[mg_dns_rr], mg_str, mg_addr]
  
  object mg_mdns_resp:
    given _tag: Tag[mg_mdns_resp] = Tag.materializeCStruct3Tag[Ptr[mg_dns_rr], mg_str, mg_addr]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mdns_resp)
        inline def rr : Ptr[mg_dns_rr] = struct._1
        inline def rr_=(value: Ptr[mg_dns_rr]): Unit = (!struct.at1 = value)
        inline def name : mg_str = struct._2
        inline def name_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def addr : mg_addr = struct._3
        inline def addr_=(value: mg_addr): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates mg_mdns_resp on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mdns_resp] = scala.scalanative.unsafe.alloc[mg_mdns_resp](1)
    def apply(rr : Ptr[mg_dns_rr], name : mg_str, addr : mg_addr)(using Zone): Ptr[mg_mdns_resp] =
      val ____ptr = apply()
      (!____ptr).rr = rr
      (!____ptr).name = name
      (!____ptr).addr = addr
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mem_file = CStruct4[CString, Ptr[CUnsignedChar], size_t, time_t]
  
  object mg_mem_file:
    given _tag: Tag[mg_mem_file] = Tag.materializeCStruct4Tag[CString, Ptr[CUnsignedChar], size_t, time_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mem_file)
        inline def path : CString = struct._1
        inline def path_=(value: CString): Unit = (!struct.at1 = value)
        inline def data : Ptr[CUnsignedChar] = struct._2
        inline def data_=(value: Ptr[CUnsignedChar]): Unit = (!struct.at2 = value)
        inline def size : size_t = struct._3
        inline def size_=(value: size_t): Unit = (!struct.at3 = value)
        inline def mtime : time_t = struct._4
        inline def mtime_=(value: time_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_mem_file on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mem_file] = scala.scalanative.unsafe.alloc[mg_mem_file](1)
    def apply(path : CString, data : Ptr[CUnsignedChar], size : size_t, mtime : time_t)(using Zone): Ptr[mg_mem_file] =
      val ____ptr = apply()
      (!____ptr).path = path
      (!____ptr).data = data
      (!____ptr).size = size
      (!____ptr).mtime = mtime
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mgr = CStruct17[Ptr[mg_connection], mg_dns, mg_dns, Ptr[mg_connection], CInt, Boolean, CUnsignedLongInt, Ptr[Byte], Ptr[Byte], uint16_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt, Ptr[mg_tcpip_if], size_t, CInt]
  
  object mg_mgr:
    given _tag: Tag[mg_mgr] = Tag.materializeCStruct17Tag[Ptr[mg_connection], mg_dns, mg_dns, Ptr[mg_connection], CInt, Boolean, CUnsignedLongInt, Ptr[Byte], Ptr[Byte], uint16_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt, Ptr[mg_tcpip_if], size_t, CInt]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mgr)
        inline def conns : Ptr[mg_connection] = struct._1
        inline def conns_=(value: Ptr[mg_connection]): Unit = (!struct.at1 = value)
        inline def dns4 : mg_dns = struct._2
        inline def dns4_=(value: mg_dns): Unit = (!struct.at2 = value)
        inline def dns6 : mg_dns = struct._3
        inline def dns6_=(value: mg_dns): Unit = (!struct.at3 = value)
        inline def mdns : Ptr[mg_connection] = struct._4
        inline def mdns_=(value: Ptr[mg_connection]): Unit = (!struct.at4 = value)
        inline def dnstimeout : CInt = struct._5
        inline def dnstimeout_=(value: CInt): Unit = (!struct.at5 = value)
        inline def use_dns6 : Boolean = struct._6
        inline def use_dns6_=(value: Boolean): Unit = (!struct.at6 = value)
        inline def nextid : CUnsignedLongInt = struct._7
        inline def nextid_=(value: CUnsignedLongInt): Unit = (!struct.at7 = value)
        inline def userdata : Ptr[Byte] = struct._8
        inline def userdata_=(value: Ptr[Byte]): Unit = (!struct.at8 = value)
        inline def tls_ctx : Ptr[Byte] = struct._9
        inline def tls_ctx_=(value: Ptr[Byte]): Unit = (!struct.at9 = value)
        inline def mqtt_id : uint16_t = struct._10
        inline def mqtt_id_=(value: uint16_t): Unit = (!struct.at10 = value)
        inline def active_dns_requests : Ptr[Byte] = struct._11
        inline def active_dns_requests_=(value: Ptr[Byte]): Unit = (!struct.at11 = value)
        inline def active_mdns_requests : Ptr[Byte] = struct._12
        inline def active_mdns_requests_=(value: Ptr[Byte]): Unit = (!struct.at12 = value)
        inline def timers : Ptr[mg_timer] = struct._13.asInstanceOf[Ptr[mg_timer]]
        inline def timers_=(value: Ptr[mg_timer]): Unit = (!struct.at13 = value.asInstanceOf[Ptr[Byte]])
        inline def epoll_fd : CInt = struct._14
        inline def epoll_fd_=(value: CInt): Unit = (!struct.at14 = value)
        inline def ifp : Ptr[mg_tcpip_if] = struct._15
        inline def ifp_=(value: Ptr[mg_tcpip_if]): Unit = (!struct.at15 = value)
        inline def extraconnsize : size_t = struct._16
        inline def extraconnsize_=(value: size_t): Unit = (!struct.at16 = value)
        inline def pipe : CInt = struct._17
        inline def pipe_=(value: CInt): Unit = (!struct.at17 = value)
      end extension
    
    // Allocates mg_mgr on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mgr] = scala.scalanative.unsafe.alloc[mg_mgr](1)
    def apply(conns : Ptr[mg_connection], dns4 : mg_dns, dns6 : mg_dns, mdns : Ptr[mg_connection], dnstimeout : CInt, use_dns6 : Boolean, nextid : CUnsignedLongInt, userdata : Ptr[Byte], tls_ctx : Ptr[Byte], mqtt_id : uint16_t, active_dns_requests : Ptr[Byte], active_mdns_requests : Ptr[Byte], timers : Ptr[mg_timer], epoll_fd : CInt, ifp : Ptr[mg_tcpip_if], extraconnsize : size_t, pipe : CInt)(using Zone): Ptr[mg_mgr] =
      val ____ptr = apply()
      (!____ptr).conns = conns
      (!____ptr).dns4 = dns4
      (!____ptr).dns6 = dns6
      (!____ptr).mdns = mdns
      (!____ptr).dnstimeout = dnstimeout
      (!____ptr).use_dns6 = use_dns6
      (!____ptr).nextid = nextid
      (!____ptr).userdata = userdata
      (!____ptr).tls_ctx = tls_ctx
      (!____ptr).mqtt_id = mqtt_id
      (!____ptr).active_dns_requests = active_dns_requests
      (!____ptr).active_mdns_requests = active_mdns_requests
      (!____ptr).timers = timers
      (!____ptr).epoll_fd = epoll_fd
      (!____ptr).ifp = ifp
      (!____ptr).extraconnsize = extraconnsize
      (!____ptr).pipe = pipe
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_modbus_req = CStruct5[uint8_t, uint8_t, uint16_t, mg_modbus_req_U, uint16_t]
  
  object mg_modbus_req:
    given _tag: Tag[mg_modbus_req] = Tag.materializeCStruct5Tag[uint8_t, uint8_t, uint16_t, mg_modbus_req_U, uint16_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_modbus_req)
        inline def func : uint8_t = struct._1
        inline def func_=(value: uint8_t): Unit = (!struct.at1 = value)
        inline def error : uint8_t = struct._2
        inline def error_=(value: uint8_t): Unit = (!struct.at2 = value)
        inline def addr : uint16_t = struct._3
        inline def addr_=(value: uint16_t): Unit = (!struct.at3 = value)
        inline def u : mg_modbus_req_U = struct._4
        inline def u_=(value: mg_modbus_req_U): Unit = (!struct.at4 = value)
        inline def len : uint16_t = struct._5
        inline def len_=(value: uint16_t): Unit = (!struct.at5 = value)
      end extension
    
    // Allocates mg_modbus_req on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_modbus_req] = scala.scalanative.unsafe.alloc[mg_modbus_req](1)
    def apply(func : uint8_t, error : uint8_t, addr : uint16_t, u : mg_modbus_req_U, len : uint16_t)(using Zone): Ptr[mg_modbus_req] =
      val ____ptr = apply()
      (!____ptr).func = func
      (!____ptr).error = error
      (!____ptr).addr = addr
      (!____ptr).u = u
      (!____ptr).len = len
      ____ptr
    
    
  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_modbus_req_U = CArray[Byte, Nat._8]
  object mg_modbus_req_U:
    given _tag: Tag[mg_modbus_req_U] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    
    def apply()(using Zone): Ptr[mg_modbus_req_U] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_modbus_req_U](1)
      ___ptr
    
    @scala.annotation.targetName("apply_bits")
    def apply(bits: Ptr[Boolean])(using Zone): Ptr[mg_modbus_req_U] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_modbus_req_U](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[Boolean]]].update(0, bits)
      ___ptr
    
    @scala.annotation.targetName("apply_regs")
    def apply(regs: Ptr[uint16_t])(using Zone): Ptr[mg_modbus_req_U] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[mg_modbus_req_U](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[uint16_t]]].update(0, regs)
      ___ptr
    
    extension (struct: mg_modbus_req_U)
      inline def bits : Ptr[Boolean] = !struct.at(0).asInstanceOf[Ptr[Ptr[Boolean]]]
      inline def bits_=(value: Ptr[Boolean]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Boolean]]] = value
      inline def regs : Ptr[uint16_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[uint16_t]]]
      inline def regs_=(value: Ptr[uint16_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[uint16_t]]] = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mqtt_message = CStruct9[mg_str, mg_str, mg_str, uint16_t, uint8_t, uint8_t, uint8_t, size_t, size_t]
  
  object mg_mqtt_message:
    given _tag: Tag[mg_mqtt_message] = Tag.materializeCStruct9Tag[mg_str, mg_str, mg_str, uint16_t, uint8_t, uint8_t, uint8_t, size_t, size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mqtt_message)
        inline def topic : mg_str = struct._1
        inline def topic_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def data : mg_str = struct._2
        inline def data_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def dgram : mg_str = struct._3
        inline def dgram_=(value: mg_str): Unit = (!struct.at3 = value)
        inline def id : uint16_t = struct._4
        inline def id_=(value: uint16_t): Unit = (!struct.at4 = value)
        inline def cmd : uint8_t = struct._5
        inline def cmd_=(value: uint8_t): Unit = (!struct.at5 = value)
        inline def qos : uint8_t = struct._6
        inline def qos_=(value: uint8_t): Unit = (!struct.at6 = value)
        inline def ack : uint8_t = struct._7
        inline def ack_=(value: uint8_t): Unit = (!struct.at7 = value)
        inline def props_start : size_t = struct._8
        inline def props_start_=(value: size_t): Unit = (!struct.at8 = value)
        inline def props_size : size_t = struct._9
        inline def props_size_=(value: size_t): Unit = (!struct.at9 = value)
      end extension
    
    // Allocates mg_mqtt_message on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mqtt_message] = scala.scalanative.unsafe.alloc[mg_mqtt_message](1)
    def apply(topic : mg_str, data : mg_str, dgram : mg_str, id : uint16_t, cmd : uint8_t, qos : uint8_t, ack : uint8_t, props_start : size_t, props_size : size_t)(using Zone): Ptr[mg_mqtt_message] =
      val ____ptr = apply()
      (!____ptr).topic = topic
      (!____ptr).data = data
      (!____ptr).dgram = dgram
      (!____ptr).id = id
      (!____ptr).cmd = cmd
      (!____ptr).qos = qos
      (!____ptr).ack = ack
      (!____ptr).props_start = props_start
      (!____ptr).props_size = props_size
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mqtt_opts = CStruct15[mg_str, mg_str, mg_str, mg_str, mg_str, uint8_t, uint8_t, uint16_t, uint16_t, Boolean, Boolean, Ptr[mg_mqtt_prop], size_t, Ptr[mg_mqtt_prop], size_t]
  
  object mg_mqtt_opts:
    given _tag: Tag[mg_mqtt_opts] = Tag.materializeCStruct15Tag[mg_str, mg_str, mg_str, mg_str, mg_str, uint8_t, uint8_t, uint16_t, uint16_t, Boolean, Boolean, Ptr[mg_mqtt_prop], size_t, Ptr[mg_mqtt_prop], size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mqtt_opts)
        inline def user : mg_str = struct._1
        inline def user_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def pass : mg_str = struct._2
        inline def pass_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def client_id : mg_str = struct._3
        inline def client_id_=(value: mg_str): Unit = (!struct.at3 = value)
        inline def topic : mg_str = struct._4
        inline def topic_=(value: mg_str): Unit = (!struct.at4 = value)
        inline def message : mg_str = struct._5
        inline def message_=(value: mg_str): Unit = (!struct.at5 = value)
        inline def qos : uint8_t = struct._6
        inline def qos_=(value: uint8_t): Unit = (!struct.at6 = value)
        inline def version : uint8_t = struct._7
        inline def version_=(value: uint8_t): Unit = (!struct.at7 = value)
        inline def keepalive : uint16_t = struct._8
        inline def keepalive_=(value: uint16_t): Unit = (!struct.at8 = value)
        inline def retransmit_id : uint16_t = struct._9
        inline def retransmit_id_=(value: uint16_t): Unit = (!struct.at9 = value)
        inline def retain : Boolean = struct._10
        inline def retain_=(value: Boolean): Unit = (!struct.at10 = value)
        inline def clean : Boolean = struct._11
        inline def clean_=(value: Boolean): Unit = (!struct.at11 = value)
        inline def props : Ptr[mg_mqtt_prop] = struct._12
        inline def props_=(value: Ptr[mg_mqtt_prop]): Unit = (!struct.at12 = value)
        inline def num_props : size_t = struct._13
        inline def num_props_=(value: size_t): Unit = (!struct.at13 = value)
        inline def will_props : Ptr[mg_mqtt_prop] = struct._14
        inline def will_props_=(value: Ptr[mg_mqtt_prop]): Unit = (!struct.at14 = value)
        inline def num_will_props : size_t = struct._15
        inline def num_will_props_=(value: size_t): Unit = (!struct.at15 = value)
      end extension
    
    // Allocates mg_mqtt_opts on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mqtt_opts] = scala.scalanative.unsafe.alloc[mg_mqtt_opts](1)
    def apply(user : mg_str, pass : mg_str, client_id : mg_str, topic : mg_str, message : mg_str, qos : uint8_t, version : uint8_t, keepalive : uint16_t, retransmit_id : uint16_t, retain : Boolean, clean : Boolean, props : Ptr[mg_mqtt_prop], num_props : size_t, will_props : Ptr[mg_mqtt_prop], num_will_props : size_t)(using Zone): Ptr[mg_mqtt_opts] =
      val ____ptr = apply()
      (!____ptr).user = user
      (!____ptr).pass = pass
      (!____ptr).client_id = client_id
      (!____ptr).topic = topic
      (!____ptr).message = message
      (!____ptr).qos = qos
      (!____ptr).version = version
      (!____ptr).keepalive = keepalive
      (!____ptr).retransmit_id = retransmit_id
      (!____ptr).retain = retain
      (!____ptr).clean = clean
      (!____ptr).props = props
      (!____ptr).num_props = num_props
      (!____ptr).will_props = will_props
      (!____ptr).num_will_props = num_will_props
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_mqtt_prop = CStruct4[uint8_t, uint32_t, mg_str, mg_str]
  
  object mg_mqtt_prop:
    given _tag: Tag[mg_mqtt_prop] = Tag.materializeCStruct4Tag[uint8_t, uint32_t, mg_str, mg_str]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_mqtt_prop)
        inline def id : uint8_t = struct._1
        inline def id_=(value: uint8_t): Unit = (!struct.at1 = value)
        inline def iv : uint32_t = struct._2
        inline def iv_=(value: uint32_t): Unit = (!struct.at2 = value)
        inline def key : mg_str = struct._3
        inline def key_=(value: mg_str): Unit = (!struct.at3 = value)
        inline def `val` : mg_str = struct._4
        inline def val_=(value: mg_str): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_mqtt_prop on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_mqtt_prop] = scala.scalanative.unsafe.alloc[mg_mqtt_prop](1)
    def apply(id : uint8_t, iv : uint32_t, key : mg_str, `val` : mg_str)(using Zone): Ptr[mg_mqtt_prop] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).iv = iv
      (!____ptr).key = key
      (!____ptr).`val` = `val`
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_phy = CStruct2[CFuncPtr2[uint8_t, uint8_t, uint16_t], CFuncPtr3[uint8_t, uint8_t, uint16_t, Unit]]
  
  object mg_phy:
    given _tag: Tag[mg_phy] = Tag.materializeCStruct2Tag[CFuncPtr2[uint8_t, uint8_t, uint16_t], CFuncPtr3[uint8_t, uint8_t, uint16_t, Unit]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_phy)
        inline def read_reg : CFuncPtr2[uint8_t, uint8_t, uint16_t] = struct._1
        inline def read_reg_=(value: CFuncPtr2[uint8_t, uint8_t, uint16_t]): Unit = (!struct.at1 = value)
        inline def write_reg : CFuncPtr3[uint8_t, uint8_t, uint16_t, Unit] = struct._2
        inline def write_reg_=(value: CFuncPtr3[uint8_t, uint8_t, uint16_t, Unit]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates mg_phy on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_phy] = scala.scalanative.unsafe.alloc[mg_phy](1)
    def apply(read_reg : CFuncPtr2[uint8_t, uint8_t, uint16_t], write_reg : CFuncPtr3[uint8_t, uint8_t, uint16_t, Unit])(using Zone): Ptr[mg_phy] =
      val ____ptr = apply()
      (!____ptr).read_reg = read_reg
      (!____ptr).write_reg = write_reg
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_queue = CStruct4[CString, size_t, size_t, size_t]
  
  object mg_queue:
    given _tag: Tag[mg_queue] = Tag.materializeCStruct4Tag[CString, size_t, size_t, size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_queue)
        inline def buf : CString = struct._1
        inline def buf_=(value: CString): Unit = (!struct.at1 = value)
        inline def size : size_t = struct._2
        inline def size_=(value: size_t): Unit = (!struct.at2 = value)
        inline def tail : size_t = struct._3
        inline def tail_=(value: size_t): Unit = (!struct.at3 = value)
        inline def head : size_t = struct._4
        inline def head_=(value: size_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_queue on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_queue] = scala.scalanative.unsafe.alloc[mg_queue](1)
    def apply(buf : CString, size : size_t, tail : size_t, head : size_t)(using Zone): Ptr[mg_queue] =
      val ____ptr = apply()
      (!____ptr).buf = buf
      (!____ptr).size = size
      (!____ptr).tail = tail
      (!____ptr).head = head
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_rpc = CStruct4[Ptr[Byte], mg_str, CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte]]
  
  object mg_rpc:
    given _tag: Tag[mg_rpc] = Tag.materializeCStruct4Tag[Ptr[Byte], mg_str, CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_rpc)
        inline def next : Ptr[mg_rpc] = struct._1.asInstanceOf[Ptr[mg_rpc]]
        inline def next_=(value: Ptr[mg_rpc]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
        inline def method : mg_str = struct._2
        inline def method_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def fn : CFuncPtr1[Ptr[mg_rpc_req], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[mg_rpc_req], Unit]]
        inline def fn_=(value: CFuncPtr1[Ptr[mg_rpc_req], Unit]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]])
        inline def fn_data : Ptr[Byte] = struct._4
        inline def fn_data_=(value: Ptr[Byte]): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_rpc on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_rpc] = scala.scalanative.unsafe.alloc[mg_rpc](1)
    def apply(next : Ptr[mg_rpc], method : mg_str, fn : CFuncPtr1[Ptr[mg_rpc_req], Unit], fn_data : Ptr[Byte])(using Zone): Ptr[mg_rpc] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).method = method
      (!____ptr).fn = fn
      (!____ptr).fn_data = fn_data
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_rpc_req = CStruct6[Ptr[Byte], Ptr[Byte], mg_pfn_t, Ptr[Byte], Ptr[Byte], mg_str]
  
  object mg_rpc_req:
    given _tag: Tag[mg_rpc_req] = Tag.materializeCStruct6Tag[Ptr[Byte], Ptr[Byte], mg_pfn_t, Ptr[Byte], Ptr[Byte], mg_str]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_rpc_req)
        inline def head : Ptr[Ptr[mg_rpc]] = struct._1.asInstanceOf[Ptr[Ptr[mg_rpc]]]
        inline def head_=(value: Ptr[Ptr[mg_rpc]]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
        inline def rpc : Ptr[mg_rpc] = struct._2.asInstanceOf[Ptr[mg_rpc]]
        inline def rpc_=(value: Ptr[mg_rpc]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
        inline def pfn : mg_pfn_t = struct._3
        inline def pfn_=(value: mg_pfn_t): Unit = (!struct.at3 = value)
        inline def pfn_data : Ptr[Byte] = struct._4
        inline def pfn_data_=(value: Ptr[Byte]): Unit = (!struct.at4 = value)
        inline def req_data : Ptr[Byte] = struct._5
        inline def req_data_=(value: Ptr[Byte]): Unit = (!struct.at5 = value)
        inline def frame : mg_str = struct._6
        inline def frame_=(value: mg_str): Unit = (!struct.at6 = value)
      end extension
    
    // Allocates mg_rpc_req on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_rpc_req] = scala.scalanative.unsafe.alloc[mg_rpc_req](1)
    def apply(head : Ptr[Ptr[mg_rpc]], rpc : Ptr[mg_rpc], pfn : mg_pfn_t, pfn_data : Ptr[Byte], req_data : Ptr[Byte], frame : mg_str)(using Zone): Ptr[mg_rpc_req] =
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).rpc = rpc
      (!____ptr).pfn = pfn
      (!____ptr).pfn_data = pfn_data
      (!____ptr).req_data = req_data
      (!____ptr).frame = frame
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_sha1_ctx = CStruct3[CArray[uint32_t, Nat._5], CArray[uint32_t, Nat._2], CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]]
  
  object mg_sha1_ctx:
    given _tag: Tag[mg_sha1_ctx] = Tag.materializeCStruct3Tag[CArray[uint32_t, Nat._5], CArray[uint32_t, Nat._2], CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_sha1_ctx)
        inline def state : CArray[uint32_t, Nat._5] = struct._1
        inline def state_=(value: CArray[uint32_t, Nat._5]): Unit = (!struct.at1 = value)
        inline def count : CArray[uint32_t, Nat._2] = struct._2
        inline def count_=(value: CArray[uint32_t, Nat._2]): Unit = (!struct.at2 = value)
        inline def buffer : CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]] = struct._3
        inline def buffer_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates mg_sha1_ctx on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_sha1_ctx] = scala.scalanative.unsafe.alloc[mg_sha1_ctx](1)
    def apply(state : CArray[uint32_t, Nat._5], count : CArray[uint32_t, Nat._2], buffer : CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]])(using Zone): Ptr[mg_sha1_ctx] =
      val ____ptr = apply()
      (!____ptr).state = state
      (!____ptr).count = count
      (!____ptr).buffer = buffer
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_sha256_ctx = CStruct4[CArray[uint32_t, Nat._8], uint64_t, uint32_t, CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]]
  
  object mg_sha256_ctx:
    given _tag: Tag[mg_sha256_ctx] = Tag.materializeCStruct4Tag[CArray[uint32_t, Nat._8], uint64_t, uint32_t, CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_sha256_ctx)
        inline def state : CArray[uint32_t, Nat._8] = struct._1
        inline def state_=(value: CArray[uint32_t, Nat._8]): Unit = (!struct.at1 = value)
        inline def bits : uint64_t = struct._2
        inline def bits_=(value: uint64_t): Unit = (!struct.at2 = value)
        inline def len : uint32_t = struct._3
        inline def len_=(value: uint32_t): Unit = (!struct.at3 = value)
        inline def buffer : CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]] = struct._4
        inline def buffer_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_sha256_ctx on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_sha256_ctx] = scala.scalanative.unsafe.alloc[mg_sha256_ctx](1)
    def apply(state : CArray[uint32_t, Nat._8], bits : uint64_t, len : uint32_t, buffer : CArray[CUnsignedChar, Nat.Digit2[Nat._6, Nat._4]])(using Zone): Ptr[mg_sha256_ctx] =
      val ____ptr = apply()
      (!____ptr).state = state
      (!____ptr).bits = bits
      (!____ptr).len = len
      (!____ptr).buffer = buffer
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_sha384_ctx = CStruct4[CArray[uint64_t, Nat._8], CArray[uint8_t, Nat.Digit3[Nat._1, Nat._2, Nat._8]], CArray[uint64_t, Nat._2], uint32_t]
  
  object mg_sha384_ctx:
    given _tag: Tag[mg_sha384_ctx] = Tag.materializeCStruct4Tag[CArray[uint64_t, Nat._8], CArray[uint8_t, Nat.Digit3[Nat._1, Nat._2, Nat._8]], CArray[uint64_t, Nat._2], uint32_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_sha384_ctx)
        inline def state : CArray[uint64_t, Nat._8] = struct._1
        inline def state_=(value: CArray[uint64_t, Nat._8]): Unit = (!struct.at1 = value)
        inline def buffer : CArray[uint8_t, Nat.Digit3[Nat._1, Nat._2, Nat._8]] = struct._2
        inline def buffer_=(value: CArray[uint8_t, Nat.Digit3[Nat._1, Nat._2, Nat._8]]): Unit = (!struct.at2 = value)
        inline def bitlen : CArray[uint64_t, Nat._2] = struct._3
        inline def bitlen_=(value: CArray[uint64_t, Nat._2]): Unit = (!struct.at3 = value)
        inline def datalen : uint32_t = struct._4
        inline def datalen_=(value: uint32_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates mg_sha384_ctx on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_sha384_ctx] = scala.scalanative.unsafe.alloc[mg_sha384_ctx](1)
    def apply(state : CArray[uint64_t, Nat._8], buffer : CArray[uint8_t, Nat.Digit3[Nat._1, Nat._2, Nat._8]], bitlen : CArray[uint64_t, Nat._2], datalen : uint32_t)(using Zone): Ptr[mg_sha384_ctx] =
      val ____ptr = apply()
      (!____ptr).state = state
      (!____ptr).buffer = buffer
      (!____ptr).bitlen = bitlen
      (!____ptr).datalen = datalen
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_str = CStruct2[CString, size_t]
  
  object mg_str:
    given _tag: Tag[mg_str] = Tag.materializeCStruct2Tag[CString, size_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_str)
        inline def buf : CString = struct._1
        inline def buf_=(value: CString): Unit = (!struct.at1 = value)
        inline def len : size_t = struct._2
        inline def len_=(value: size_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates mg_str on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_str] = scala.scalanative.unsafe.alloc[mg_str](1)
    def apply(buf : CString, len : size_t)(using Zone): Ptr[mg_str] =
      val ____ptr = apply()
      (!____ptr).buf = buf
      (!____ptr).len = len
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_tcpip_driver_atcmd_data = CStruct10[Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], uint8_t, Unit], CFuncPtr1[Ptr[Byte], CInt], Ptr[CString], CInt, uint64_t, Boolean, Boolean, Boolean]
  
  object mg_tcpip_driver_atcmd_data:
    given _tag: Tag[mg_tcpip_driver_atcmd_data] = Tag.materializeCStruct10Tag[Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], uint8_t, Unit], CFuncPtr1[Ptr[Byte], CInt], Ptr[CString], CInt, uint64_t, Boolean, Boolean, Boolean]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_tcpip_driver_atcmd_data)
        inline def usart : Ptr[Byte] = struct._1
        inline def usart_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def reset : CFuncPtr1[Ptr[Byte], Unit] = struct._2
        inline def reset_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = (!struct.at2 = value)
        inline def tx : CFuncPtr2[Ptr[Byte], uint8_t, Unit] = struct._3
        inline def tx_=(value: CFuncPtr2[Ptr[Byte], uint8_t, Unit]): Unit = (!struct.at3 = value)
        inline def rx : CFuncPtr1[Ptr[Byte], CInt] = struct._4
        inline def rx_=(value: CFuncPtr1[Ptr[Byte], CInt]): Unit = (!struct.at4 = value)
        inline def script : Ptr[CString] = struct._5
        inline def script_=(value: Ptr[CString]): Unit = (!struct.at5 = value)
        inline def script_index : CInt = struct._6
        inline def script_index_=(value: CInt): Unit = (!struct.at6 = value)
        inline def deadline : uint64_t = struct._7
        inline def deadline_=(value: uint64_t): Unit = (!struct.at7 = value)
        inline def no_byte_stuff : Boolean = struct._8
        inline def no_byte_stuff_=(value: Boolean): Unit = (!struct.at8 = value)
        inline def link : Boolean = struct._9
        inline def link_=(value: Boolean): Unit = (!struct.at9 = value)
        inline def unstuffing : Boolean = struct._10
        inline def unstuffing_=(value: Boolean): Unit = (!struct.at10 = value)
      end extension
    
    // Allocates mg_tcpip_driver_atcmd_data on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_tcpip_driver_atcmd_data] = scala.scalanative.unsafe.alloc[mg_tcpip_driver_atcmd_data](1)
    def apply(usart : Ptr[Byte], reset : CFuncPtr1[Ptr[Byte], Unit], tx : CFuncPtr2[Ptr[Byte], uint8_t, Unit], rx : CFuncPtr1[Ptr[Byte], CInt], script : Ptr[CString], script_index : CInt, deadline : uint64_t, no_byte_stuff : Boolean, link : Boolean, unstuffing : Boolean)(using Zone): Ptr[mg_tcpip_driver_atcmd_data] =
      val ____ptr = apply()
      (!____ptr).usart = usart
      (!____ptr).reset = reset
      (!____ptr).tx = tx
      (!____ptr).rx = rx
      (!____ptr).script = script
      (!____ptr).script_index = script_index
      (!____ptr).deadline = deadline
      (!____ptr).no_byte_stuff = no_byte_stuff
      (!____ptr).link = link
      (!____ptr).unstuffing = unstuffing
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_tcpip_if = CStruct0
  
  object mg_tcpip_if:
    given _tag: Tag[mg_tcpip_if] = Tag.materializeCStruct0Tag
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_timer = CStruct6[uint64_t, uint64_t, CUnsignedInt, CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte], Ptr[Byte]]
  
  object mg_timer:
    given _tag: Tag[mg_timer] = Tag.materializeCStruct6Tag[uint64_t, uint64_t, CUnsignedInt, CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte], Ptr[Byte]]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_timer)
        inline def period_ms : uint64_t = struct._1
        inline def period_ms_=(value: uint64_t): Unit = (!struct.at1 = value)
        inline def expire : uint64_t = struct._2
        inline def expire_=(value: uint64_t): Unit = (!struct.at2 = value)
        inline def flags : CUnsignedInt = struct._3
        inline def flags_=(value: CUnsignedInt): Unit = (!struct.at3 = value)
        inline def fn : CFuncPtr1[Ptr[Byte], Unit] = struct._4
        inline def fn_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = (!struct.at4 = value)
        inline def arg : Ptr[Byte] = struct._5
        inline def arg_=(value: Ptr[Byte]): Unit = (!struct.at5 = value)
        inline def next : Ptr[mg_timer] = struct._6.asInstanceOf[Ptr[mg_timer]]
        inline def next_=(value: Ptr[mg_timer]): Unit = (!struct.at6 = value.asInstanceOf[Ptr[Byte]])
      end extension
    
    // Allocates mg_timer on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_timer] = scala.scalanative.unsafe.alloc[mg_timer](1)
    def apply(period_ms : uint64_t, expire : uint64_t, flags : CUnsignedInt, fn : CFuncPtr1[Ptr[Byte], Unit], arg : Ptr[Byte], next : Ptr[mg_timer])(using Zone): Ptr[mg_timer] =
      val ____ptr = apply()
      (!____ptr).period_ms = period_ms
      (!____ptr).expire = expire
      (!____ptr).flags = flags
      (!____ptr).fn = fn
      (!____ptr).arg = arg
      (!____ptr).next = next
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_tls_opts = CStruct5[mg_str, mg_str, mg_str, mg_str, Boolean]
  
  object mg_tls_opts:
    given _tag: Tag[mg_tls_opts] = Tag.materializeCStruct5Tag[mg_str, mg_str, mg_str, mg_str, Boolean]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_tls_opts)
        inline def ca : mg_str = struct._1
        inline def ca_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def cert : mg_str = struct._2
        inline def cert_=(value: mg_str): Unit = (!struct.at2 = value)
        inline def key : mg_str = struct._3
        inline def key_=(value: mg_str): Unit = (!struct.at3 = value)
        inline def name : mg_str = struct._4
        inline def name_=(value: mg_str): Unit = (!struct.at4 = value)
        inline def skip_verification : Boolean = struct._5
        inline def skip_verification_=(value: Boolean): Unit = (!struct.at5 = value)
      end extension
    
    // Allocates mg_tls_opts on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_tls_opts] = scala.scalanative.unsafe.alloc[mg_tls_opts](1)
    def apply(ca : mg_str, cert : mg_str, key : mg_str, name : mg_str, skip_verification : Boolean)(using Zone): Ptr[mg_tls_opts] =
      val ____ptr = apply()
      (!____ptr).ca = ca
      (!____ptr).cert = cert
      (!____ptr).key = key
      (!____ptr).name = name
      (!____ptr).skip_verification = skip_verification
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_wifi_data = CStruct10[CString, CString, CString, CString, uint32_t, uint32_t, uint8_t, uint8_t, uint8_t, Boolean]
  
  object mg_wifi_data:
    given _tag: Tag[mg_wifi_data] = Tag.materializeCStruct10Tag[CString, CString, CString, CString, uint32_t, uint32_t, uint8_t, uint8_t, uint8_t, Boolean]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_wifi_data)
        inline def ssid : CString = struct._1
        inline def ssid_=(value: CString): Unit = (!struct.at1 = value)
        inline def pass : CString = struct._2
        inline def pass_=(value: CString): Unit = (!struct.at2 = value)
        inline def apssid : CString = struct._3
        inline def apssid_=(value: CString): Unit = (!struct.at3 = value)
        inline def appass : CString = struct._4
        inline def appass_=(value: CString): Unit = (!struct.at4 = value)
        inline def apip : uint32_t = struct._5
        inline def apip_=(value: uint32_t): Unit = (!struct.at5 = value)
        inline def apmask : uint32_t = struct._6
        inline def apmask_=(value: uint32_t): Unit = (!struct.at6 = value)
        inline def security : uint8_t = struct._7
        inline def security_=(value: uint8_t): Unit = (!struct.at7 = value)
        inline def apsecurity : uint8_t = struct._8
        inline def apsecurity_=(value: uint8_t): Unit = (!struct.at8 = value)
        inline def apchannel : uint8_t = struct._9
        inline def apchannel_=(value: uint8_t): Unit = (!struct.at9 = value)
        inline def apmode : Boolean = struct._10
        inline def apmode_=(value: Boolean): Unit = (!struct.at10 = value)
      end extension
    
    // Allocates mg_wifi_data on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_wifi_data] = scala.scalanative.unsafe.alloc[mg_wifi_data](1)
    def apply(ssid : CString, pass : CString, apssid : CString, appass : CString, apip : uint32_t, apmask : uint32_t, security : uint8_t, apsecurity : uint8_t, apchannel : uint8_t, apmode : Boolean)(using Zone): Ptr[mg_wifi_data] =
      val ____ptr = apply()
      (!____ptr).ssid = ssid
      (!____ptr).pass = pass
      (!____ptr).apssid = apssid
      (!____ptr).appass = appass
      (!____ptr).apip = apip
      (!____ptr).apmask = apmask
      (!____ptr).security = security
      (!____ptr).apsecurity = apsecurity
      (!____ptr).apchannel = apchannel
      (!____ptr).apmode = apmode
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_wifi_scan_bss_data = CStruct9[mg_str, CString, int16_t, uint8_t, uint8_t, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt]
  
  object mg_wifi_scan_bss_data:
    given _tag: Tag[mg_wifi_scan_bss_data] = Tag.materializeCStruct9Tag[mg_str, CString, int16_t, uint8_t, uint8_t, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_wifi_scan_bss_data)
        inline def SSID : mg_str = struct._1
        inline def SSID_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def BSSID : CString = struct._2
        inline def BSSID_=(value: CString): Unit = (!struct.at2 = value)
        inline def RSSI : int16_t = struct._3
        inline def RSSI_=(value: int16_t): Unit = (!struct.at3 = value)
        inline def security : uint8_t = struct._4
        inline def security_=(value: uint8_t): Unit = (!struct.at4 = value)
        inline def channel : uint8_t = struct._5
        inline def channel_=(value: uint8_t): Unit = (!struct.at5 = value)
        inline def band : CUnsignedInt = struct._6
        inline def band_=(value: CUnsignedInt): Unit = (!struct.at6 = value)
        inline def has_n : CUnsignedInt = struct._7
        inline def has_n_=(value: CUnsignedInt): Unit = (!struct.at7 = value)
        inline def has_ac : CUnsignedInt = struct._8
        inline def has_ac_=(value: CUnsignedInt): Unit = (!struct.at8 = value)
        inline def has_ax : CUnsignedInt = struct._9
        inline def has_ax_=(value: CUnsignedInt): Unit = (!struct.at9 = value)
      end extension
    
    // Allocates mg_wifi_scan_bss_data on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_wifi_scan_bss_data] = scala.scalanative.unsafe.alloc[mg_wifi_scan_bss_data](1)
    def apply(SSID : mg_str, BSSID : CString, RSSI : int16_t, security : uint8_t, channel : uint8_t, band : CUnsignedInt, has_n : CUnsignedInt, has_ac : CUnsignedInt, has_ax : CUnsignedInt)(using Zone): Ptr[mg_wifi_scan_bss_data] =
      val ____ptr = apply()
      (!____ptr).SSID = SSID
      (!____ptr).BSSID = BSSID
      (!____ptr).RSSI = RSSI
      (!____ptr).security = security
      (!____ptr).channel = channel
      (!____ptr).band = band
      (!____ptr).has_n = has_n
      (!____ptr).has_ac = has_ac
      (!____ptr).has_ax = has_ax
      ____ptr
    
    

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_ws_message = CStruct2[mg_str, uint8_t]
  
  object mg_ws_message:
    given _tag: Tag[mg_ws_message] = Tag.materializeCStruct2Tag[mg_str, uint8_t]
    
    export fields.*
    private[mongoose] object fields:
      extension (struct: mg_ws_message)
        inline def data : mg_str = struct._1
        inline def data_=(value: mg_str): Unit = (!struct.at1 = value)
        inline def flags : uint8_t = struct._2
        inline def flags_=(value: uint8_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates mg_ws_message on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[mg_ws_message] = scala.scalanative.unsafe.alloc[mg_ws_message](1)
    def apply(data : mg_str, flags : uint8_t)(using Zone): Ptr[mg_ws_message] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    
    

object constants:
  val MG_PHY_SPEED_10M: CUnsignedInt = 0.toUInt
  val MG_PHY_SPEED_100M: CUnsignedInt = 1.toUInt
  val MG_PHY_SPEED_1000M: CUnsignedInt = 2.toUInt
  
  val MG_OTA_CONFIRMED: CUnsignedInt = 0.toUInt
  val MG_OTA_TESTING: CUnsignedInt = 1.toUInt
  val MG_OTA_FAILED: CUnsignedInt = 2.toUInt
  
  val MQTT_OK: CUnsignedInt = 0.toUInt
  val MQTT_INCOMPLETE: CUnsignedInt = 1.toUInt
  val MQTT_MALFORMED: CUnsignedInt = 2.toUInt
  
  val MQTT_PROP_TYPE_BYTE: CUnsignedInt = 0.toUInt
  val MQTT_PROP_TYPE_STRING: CUnsignedInt = 1.toUInt
  val MQTT_PROP_TYPE_STRING_PAIR: CUnsignedInt = 2.toUInt
  val MQTT_PROP_TYPE_BINARY_DATA: CUnsignedInt = 3.toUInt
  val MQTT_PROP_TYPE_VARIABLE_INT: CUnsignedInt = 4.toUInt
  val MQTT_PROP_TYPE_INT: CUnsignedInt = 5.toUInt
  val MQTT_PROP_TYPE_SHORT: CUnsignedInt = 6.toUInt
  
  val MG_IO_ERR: CInt = -1
  val MG_IO_WAIT: CInt = -2
  
  val MG_LL_NONE: CUnsignedInt = 0.toUInt
  val MG_LL_ERROR: CUnsignedInt = 1.toUInt
  val MG_LL_INFO: CUnsignedInt = 2.toUInt
  val MG_LL_DEBUG: CUnsignedInt = 3.toUInt
  val MG_LL_VERBOSE: CUnsignedInt = 4.toUInt
  
  val MG_JSON_TOO_DEEP: CInt = -1
  val MG_JSON_INVALID: CInt = -2
  val MG_JSON_NOT_FOUND: CInt = -3
  
  val MG_FS_READ: CUnsignedInt = 1.toUInt
  val MG_FS_WRITE: CUnsignedInt = 2.toUInt
  val MG_FS_DIR: CUnsignedInt = 4.toUInt
  
  val MG_EV_ERROR: CUnsignedInt = 0.toUInt
  val MG_EV_OPEN: CUnsignedInt = 1.toUInt
  val MG_EV_POLL: CUnsignedInt = 2.toUInt
  val MG_EV_RESOLVE: CUnsignedInt = 3.toUInt
  val MG_EV_CONNECT: CUnsignedInt = 4.toUInt
  val MG_EV_ACCEPT: CUnsignedInt = 5.toUInt
  val MG_EV_TLS_HS: CUnsignedInt = 6.toUInt
  val MG_EV_READ: CUnsignedInt = 7.toUInt
  val MG_EV_WRITE: CUnsignedInt = 8.toUInt
  val MG_EV_CLOSE: CUnsignedInt = 9.toUInt
  val MG_EV_HTTP_HDRS: CUnsignedInt = 10.toUInt
  val MG_EV_HTTP_MSG: CUnsignedInt = 11.toUInt
  val MG_EV_WS_OPEN: CUnsignedInt = 12.toUInt
  val MG_EV_WS_MSG: CUnsignedInt = 13.toUInt
  val MG_EV_WS_CTL: CUnsignedInt = 14.toUInt
  val MG_EV_MQTT_CMD: CUnsignedInt = 15.toUInt
  val MG_EV_MQTT_MSG: CUnsignedInt = 16.toUInt
  val MG_EV_MQTT_OPEN: CUnsignedInt = 17.toUInt
  val MG_EV_SNTP_TIME: CUnsignedInt = 18.toUInt
  val MG_EV_WAKEUP: CUnsignedInt = 19.toUInt
  val MG_EV_MDNS_REQ: CUnsignedInt = 20.toUInt
  val MG_EV_MDNS_RESP: CUnsignedInt = 21.toUInt
  val MG_EV_MODBUS_REQ: CUnsignedInt = 22.toUInt
  val MG_EV_USER: CUnsignedInt = 23.toUInt
  
  val MG_PHY_LEDS_ACTIVE_HIGH: CUnsignedInt = 1.toUInt
  val MG_PHY_CLOCKS_MAC: CUnsignedInt = 2.toUInt
  

object aliases:
  import _root_.mongoose.predef.*
  import _root_.mongoose.enumerations.*
  import _root_.mongoose.aliases.*
  import _root_.mongoose.structs.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type MG_UECC_Curve = Ptr[MG_UECC_Curve_t]
  object MG_UECC_Curve:
    given _tag: Tag[MG_UECC_Curve] = Tag.Ptr[MG_UECC_Curve_t](MG_UECC_Curve_t._tag)
    inline def apply(inline o: Ptr[MG_UECC_Curve_t]): MG_UECC_Curve = o
    extension (v: MG_UECC_Curve)
      inline def value: Ptr[MG_UECC_Curve_t] = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type MG_UECC_RNG_Function = CFuncPtr2[Ptr[uint8_t], CUnsignedInt, CInt]
  object MG_UECC_RNG_Function:
    given _tag: Tag[MG_UECC_RNG_Function] = Tag.materializeCFuncPtr2[Ptr[uint8_t], CUnsignedInt, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): MG_UECC_RNG_Function = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr2[Ptr[uint8_t], CUnsignedInt, CInt]): MG_UECC_RNG_Function = o
    extension (v: MG_UECC_RNG_Function)
      inline def value: CFuncPtr2[Ptr[uint8_t], CUnsignedInt, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  type bitcount_t = int16_t
  object bitcount_t:
    given _tag: Tag[bitcount_t] = int16_t._tag
    inline def apply(inline o: int16_t): bitcount_t = o
    extension (v: bitcount_t)
      inline def value: int16_t = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  type cmpresult_t = int8_t
  object cmpresult_t:
    given _tag: Tag[cmpresult_t] = int8_t._tag
    inline def apply(inline o: int8_t): cmpresult_t = o
    extension (v: cmpresult_t)
      inline def value: int8_t = v

  type int16_t = scala.Short
  object int16_t:
    val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
    inline def apply(inline o: scala.Short): int16_t = o
    extension (v: int16_t)
      inline def value: scala.Short = v

  type int64_t = scala.Long
  object int64_t:
    val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
    inline def apply(inline o: scala.Long): int64_t = o
    extension (v: int64_t)
      inline def value: scala.Long = v

  type int8_t = scala.scalanative.unsafe.CChar
  object int8_t:
    val _tag: Tag[int8_t] = summon[Tag[scala.scalanative.unsafe.CChar]]
    inline def apply(inline o: scala.scalanative.unsafe.CChar): int8_t = o
    extension (v: int8_t)
      inline def value: scala.scalanative.unsafe.CChar = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_event_handler_t = CFuncPtr3[Ptr[mg_connection], CInt, Ptr[Byte], Unit]
  object mg_event_handler_t:
    given _tag: Tag[mg_event_handler_t] = Tag.materializeCFuncPtr3[Ptr[mg_connection], CInt, Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): mg_event_handler_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[Ptr[mg_connection], CInt, Ptr[Byte], Unit]): mg_event_handler_t = o
    extension (v: mg_event_handler_t)
      inline def value: CFuncPtr3[Ptr[mg_connection], CInt, Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_pfn_t = CFuncPtr2[CChar, Ptr[Byte], Unit]
  object mg_pfn_t:
    given _tag: Tag[mg_pfn_t] = Tag.materializeCFuncPtr2[CChar, Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): mg_pfn_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr2[CChar, Ptr[Byte], Unit]): mg_pfn_t = o
    extension (v: mg_pfn_t)
      inline def value: CFuncPtr2[CChar, Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  opaque type mg_pm_t = CFuncPtr3[mg_pfn_t, Ptr[Byte], Ptr[va_list], size_t]
  object mg_pm_t:
    given _tag: Tag[mg_pm_t] = Tag.materializeCFuncPtr3[mg_pfn_t, Ptr[Byte], Ptr[va_list], size_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): mg_pm_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[mg_pfn_t, Ptr[Byte], Ptr[va_list], size_t]): mg_pm_t = o
    extension (v: mg_pm_t)
      inline def value: CFuncPtr3[mg_pfn_t, Ptr[Byte], Ptr[va_list], size_t] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  type mg_uecc_word_t = uint64_t
  object mg_uecc_word_t:
    given _tag: Tag[mg_uecc_word_t] = uint64_t._tag
    inline def apply(inline o: uint64_t): mg_uecc_word_t = o
    extension (v: mg_uecc_word_t)
      inline def value: uint64_t = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type time_t = posix.sys.types.time_t
  object time_t:
    val _tag: Tag[time_t] = summon[Tag[posix.sys.types.time_t]]
    inline def apply(inline o: posix.sys.types.time_t): time_t = o
    extension (v: time_t)
      inline def value: posix.sys.types.time_t = v

  type uint16_t = scala.scalanative.unsigned.UShort
  object uint16_t:
    val _tag: Tag[uint16_t] = summon[Tag[scala.scalanative.unsigned.UShort]]
    inline def apply(inline o: scala.scalanative.unsigned.UShort): uint16_t = o
    extension (v: uint16_t)
      inline def value: scala.scalanative.unsigned.UShort = v

  type uint32_t = scala.scalanative.unsigned.UInt
  object uint32_t:
    val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
    inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
    extension (v: uint32_t)
      inline def value: scala.scalanative.unsigned.UInt = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t:
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

  type uint8_t = scala.scalanative.unsigned.UByte
  object uint8_t:
    val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
    inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
    extension (v: uint8_t)
      inline def value: scala.scalanative.unsigned.UByte = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list)
      inline def value: unsafe.CVarArgList = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  type wordcount_t = int8_t
  object wordcount_t:
    given _tag: Tag[wordcount_t] = int8_t._tag
    inline def apply(inline o: int8_t): wordcount_t = o
    extension (v: wordcount_t)
      inline def value: int8_t = v


@extern
private[mongoose] object extern_functions:
  import _root_.mongoose.predef.*
  import _root_.mongoose.enumerations.*
  import _root_.mongoose.aliases.*
  import _root_.mongoose.structs.*
  private[mongoose] def __sn_wrap_mongoose_mg_aton(str : Ptr[mg_str], addr : Ptr[mg_addr]): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_check_ip_acl(acl : Ptr[mg_str], remote_ip : Ptr[mg_addr]): CInt = extern

  private[mongoose] def __sn_wrap_mongoose_mg_dash_file_add(name : Ptr[mg_str], size : size_t): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_dash_file_del(name : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_file_read(fs : Ptr[mg_fs], path : CString, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_http_get_header_var(s : Ptr[mg_str], v : Ptr[mg_str], __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_http_next_multipart(_0 : Ptr[mg_str], _1 : size_t, _2 : Ptr[mg_http_part]): size_t = extern

  private[mongoose] def __sn_wrap_mongoose_mg_http_start_upload(c : Ptr[mg_connection], hm : Ptr[mg_http_message], name : Ptr[mg_str], dir : Ptr[mg_str], fs : Ptr[mg_fs], fn : CFuncPtr2[Ptr[mg_connection], CString, Unit]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_http_var(buf : Ptr[mg_str], name : Ptr[mg_str], __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get(json : Ptr[mg_str], path : CString, toklen : Ptr[CInt]): CInt = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_b64(json : Ptr[mg_str], path : CString, len : Ptr[CInt]): CString = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_bool(json : Ptr[mg_str], path : CString, v : Ptr[Boolean]): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_hex(json : Ptr[mg_str], path : CString, len : Ptr[CInt]): CString = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_long(json : Ptr[mg_str], path : CString, dflt : CLongInt): CLongInt = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_num(json : Ptr[mg_str], path : CString, v : Ptr[Double]): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_str(json : Ptr[mg_str], path : CString): CString = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_get_tok(json : Ptr[mg_str], path : CString, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_next(obj : Ptr[mg_str], ofs : size_t, key : Ptr[mg_str], `val` : Ptr[mg_str]): size_t = extern

  private[mongoose] def __sn_wrap_mongoose_mg_json_unescape(json : Ptr[mg_str], path : CString, _2 : CString, _3 : size_t): size_t = extern

  private[mongoose] def __sn_wrap_mongoose_mg_match(str : Ptr[mg_str], pattern : Ptr[mg_str], caps : Ptr[mg_str]): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_path_is_sane(path : Ptr[mg_str]): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_rpc_add(head : Ptr[Ptr[mg_rpc]], method_pattern : Ptr[mg_str], handler : CFuncPtr1[Ptr[mg_rpc_req], Unit], handler_data : Ptr[Byte]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_span(s : Ptr[mg_str], a : Ptr[mg_str], b : Ptr[mg_str], delim : CChar): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_str_n(s : CString, n : size_t, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_str_s(s : CString, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_str_to_num(_0 : Ptr[mg_str], base : CInt, `val` : Ptr[Byte], val_len : size_t): Boolean = extern

  private[mongoose] def __sn_wrap_mongoose_mg_strcasecmp(str1 : Ptr[mg_str], str2 : Ptr[mg_str]): CInt = extern

  private[mongoose] def __sn_wrap_mongoose_mg_strcmp(str1 : Ptr[mg_str], str2 : Ptr[mg_str]): CInt = extern

  private[mongoose] def __sn_wrap_mongoose_mg_strdup(s : Ptr[mg_str], __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_unpacked(path : CString, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_url_host(url : CString, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_url_pass(url : CString, __return : Ptr[mg_str]): Unit = extern

  private[mongoose] def __sn_wrap_mongoose_mg_url_user(url : CString, __return : Ptr[mg_str]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_aes_gcm_decrypt(output : Ptr[CUnsignedChar], input : Ptr[CUnsignedChar], input_length : size_t, key : Ptr[CUnsignedChar], key_len : size_t, iv : Ptr[CUnsignedChar], iv_len : size_t, aead : Ptr[CUnsignedChar], aead_len : size_t, tag : Ptr[CUnsignedChar], tag_len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_aes_gcm_encrypt(output : Ptr[CUnsignedChar], input : Ptr[CUnsignedChar], input_length : size_t, key : Ptr[CUnsignedChar], key_len : size_t, iv : Ptr[CUnsignedChar], iv_len : size_t, aead : Ptr[CUnsignedChar], aead_len : size_t, tag : Ptr[CUnsignedChar], tag_len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_alloc_conn(_0 : Ptr[mg_mgr]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_base64_decode(src : CString, n : size_t, dst : CString, _3 : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_base64_encode(p : Ptr[CUnsignedChar], n : size_t, buf : CString, _3 : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_base64_final(buf : CString, len : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_base64_update(input_byte : CUnsignedChar, buf : CString, len : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_bzero(buf : Ptr[CUnsignedChar], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_call(c : Ptr[mg_connection], ev : CInt, ev_data : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_calloc(count : size_t, size : size_t): Ptr[Byte] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_casecmp(s1 : CString, s2 : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_close_conn(c : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_connect(_0 : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_connect_resolved(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_connect_svc(mgr : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte], pfn : mg_event_handler_t, pfn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_crc32(crc : uint32_t, buf : CString, len : size_t): uint32_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_ev_handler(c : Ptr[mg_connection], ev : CInt, ev_data : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_init(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_poll(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_send_change(mgr : Ptr[mg_mgr], _1 : Ptr[mg_field_set]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_delayms(ms : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dns_parse(buf : Ptr[uint8_t], len : size_t, _2 : Ptr[mg_dns_message]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dns_parse_rr(buf : Ptr[uint8_t], len : size_t, ofs : size_t, is_question : Boolean, _4 : Ptr[mg_dns_rr]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_error(c : Ptr[mg_connection], fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_file_printf(fs : Ptr[mg_fs], path : CString, fmt : CString, rest: Any*): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_file_write(fs : Ptr[mg_fs], path : CString, _2 : Ptr[Byte], _3 : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_free(ptr : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_fs_close(fd : Ptr[mg_fd]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_fs_ls(fs : Ptr[mg_fs], path : CString, buf : CString, len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_fs_open(fs : Ptr[mg_fs], path : CString, flags : CInt): Ptr[mg_fd] = extern

  /**
   * **************************************************************************** GCM_CONTEXT : MUST be called once before ANY use of this library ****************************************************************************
  
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_gcm_initialize(): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_hexdump(buf : Ptr[Byte], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_hmac_sha256(dst : CArray[uint8_t, Nat.Digit2[Nat._3, Nat._2]], key : Ptr[uint8_t], keysz : size_t, data : Ptr[uint8_t], datasz : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_bauth(_0 : Ptr[mg_connection], user : CString, pass : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_connect(_0 : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_creds(_0 : Ptr[mg_http_message], _1 : CString, _2 : size_t, _3 : CString, _4 : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_get_header(_0 : Ptr[mg_http_message], name : CString): Ptr[mg_str] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_get_request_len(buf : Ptr[CUnsignedChar], buf_len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_get_var(_0 : Ptr[mg_str], name : CString, _2 : CString, _3 : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_listen(_0 : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_parse(s : CString, len : size_t, _2 : Ptr[mg_http_message]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_printf_chunk(cnn : Ptr[mg_connection], fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_reply(_0 : Ptr[mg_connection], status_code : CInt, headers : CString, body_fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_serve_dir(_0 : Ptr[mg_connection], hm : Ptr[mg_http_message], _2 : Ptr[mg_http_serve_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_serve_file(_0 : Ptr[mg_connection], hm : Ptr[mg_http_message], path : CString, _3 : Ptr[mg_http_serve_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_serve_ssi(c : Ptr[mg_connection], root : CString, fullpath : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_start_ota(c : Ptr[mg_connection], hm : Ptr[mg_http_message], fn : CFuncPtr2[Ptr[mg_connection], CString, Unit]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_status(hm : Ptr[mg_http_message]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_upload(c : Ptr[mg_connection], hm : Ptr[mg_http_message], fs : Ptr[mg_fs], dir : CString, max_size : size_t): CLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_write_chunk(c : Ptr[mg_connection], buf : CString, len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_io_recv(c : Ptr[mg_connection], buf : Ptr[Byte], len : size_t): CLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_io_send(c : Ptr[mg_connection], buf : Ptr[Byte], len : size_t): CLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_iobuf_add(_0 : Ptr[mg_iobuf], _1 : size_t, _2 : Ptr[Byte], _3 : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_iobuf_del(_0 : Ptr[mg_iobuf], ofs : size_t, len : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_iobuf_free(_0 : Ptr[mg_iobuf]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_iobuf_init(_0 : Ptr[mg_iobuf], _1 : size_t, _2 : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_iobuf_resize(_0 : Ptr[mg_iobuf], _1 : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_listen(_0 : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_log(fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_log_prefix(ll : CInt, file : CString, line : CInt, fname : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_log_set_fn(fn : mg_pfn_t, param : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_md5_final(c : Ptr[mg_md5_ctx], _1 : CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_md5_init(c : Ptr[mg_md5_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_md5_update(c : Ptr[mg_md5_ctx], data : Ptr[CUnsignedChar], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mdns_listen(mgr : Ptr[mg_mgr], fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mdns_query(_0 : Ptr[mg_connection], _1 : CString, _2 : CUnsignedInt): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mgr_free(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mgr_init(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mgr_poll(_0 : Ptr[mg_mgr], ms : CInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_millis(): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_modbus_listen(mgr : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mprintf(fmt : CString, rest: Any*): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_connect(_0 : Ptr[mg_mgr], url : CString, opts : Ptr[mg_mqtt_opts], fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_disconnect(_0 : Ptr[mg_connection], _1 : Ptr[mg_mqtt_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_init(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_listen(mgr : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_login(c : Ptr[mg_connection], opts : Ptr[mg_mqtt_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_next_prop(_0 : Ptr[mg_mqtt_message], _1 : Ptr[mg_mqtt_prop], ofs : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_parse(_0 : Ptr[uint8_t], _1 : size_t, _2 : uint8_t, _3 : Ptr[mg_mqtt_message]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_ping(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_poll(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_pong(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_pub(c : Ptr[mg_connection], opts : Ptr[mg_mqtt_opts]): uint16_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_send_header(_0 : Ptr[mg_connection], cmd : uint8_t, flags : uint8_t, len : uint32_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_sub(_0 : Ptr[mg_connection], opts : Ptr[mg_mqtt_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_mqtt_unsub(c : Ptr[mg_connection], opts : Ptr[mg_mqtt_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_multicast_restore(c : Ptr[mg_connection], from : Ptr[uint8_t]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_now(): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ntohl(net : uint32_t): uint32_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ntohll(net : uint64_t): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ntohs(net : uint16_t): uint16_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_open_listener(c : Ptr[mg_connection], url : CString): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ota_begin(new_firmware_size : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ota_end(): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ota_url_check(mgr : Ptr[mg_mgr], current_version : CString, metadata_url : CString, fn : CFuncPtr1[CString, Unit]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ota_write(buf : Ptr[Byte], len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_pfn_iobuf(ch : CChar, param : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_pfn_iobuf_noresize(ch : CChar, param : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_pfn_stdout(c : CChar, param : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_phy_init(_0 : Ptr[mg_phy], addr : uint8_t, config : uint8_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_phy_up(_0 : Ptr[mg_phy], addr : uint8_t, full_duplex : Ptr[Boolean], speed : Ptr[uint8_t]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_base64(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_esc(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_hex(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_ieee64(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_ip(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_ip4(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_ip6(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_ip_port(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_l2addr(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_print_mac(out : CFuncPtr2[CChar, Ptr[Byte], Unit], arg : Ptr[Byte], ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_printf(_0 : Ptr[mg_connection], fmt : CString, rest: Any*): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_queue_add(_0 : Ptr[mg_queue], _1 : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_queue_book(_0 : Ptr[mg_queue], buf : Ptr[CString], _2 : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_queue_del(_0 : Ptr[mg_queue], _1 : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_queue_init(_0 : Ptr[mg_queue], _1 : CString, _2 : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_queue_next(_0 : Ptr[mg_queue], _1 : Ptr[CString]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_queue_printf(_0 : Ptr[mg_queue], fmt : CString, rest: Any*): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_random(buf : Ptr[Byte], len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_random_str(buf : CString, len : size_t): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_resolve(_0 : Ptr[mg_connection], url : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_resolve_cancel(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_del(head : Ptr[Ptr[mg_rpc]], handler : CFuncPtr1[Ptr[mg_rpc_req], Unit]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_err(_0 : Ptr[mg_rpc_req], code : CInt, fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_list(r : Ptr[mg_rpc_req]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_ok(_0 : Ptr[mg_rpc_req], fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_process(_0 : Ptr[mg_rpc_req]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_verr(_0 : Ptr[mg_rpc_req], code : CInt, fmt : CString, _3 : Ptr[va_list]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_vok(_0 : Ptr[mg_rpc_req], fmt : CString, ap : Ptr[va_list]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rsa_crt_sign(em : Ptr[uint8_t], em_len : size_t, dP : Ptr[uint8_t], dP_len : size_t, dQ : Ptr[uint8_t], dQ_len : size_t, p : Ptr[uint8_t], p_len : size_t, q : Ptr[uint8_t], q_len : size_t, qInv : Ptr[uint8_t], qInv_len : size_t, signature : Ptr[uint8_t], sig_len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rsa_mod_pow(mod : Ptr[uint8_t], modsz : size_t, exp : Ptr[uint8_t], expsz : size_t, msg : Ptr[uint8_t], msgsz : size_t, out : Ptr[uint8_t], outsz : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_send(_0 : Ptr[mg_connection], _1 : Ptr[Byte], _2 : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha1_final(digest : CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]], _1 : Ptr[mg_sha1_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha1_init(_0 : Ptr[mg_sha1_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha1_update(_0 : Ptr[mg_sha1_ctx], data : Ptr[CUnsignedChar], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha256(dst : CArray[uint8_t, Nat.Digit2[Nat._3, Nat._2]], data : Ptr[uint8_t], datasz : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha256_final(digest : CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._2]], _1 : Ptr[mg_sha256_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha256_init(_0 : Ptr[mg_sha256_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha256_update(_0 : Ptr[mg_sha256_ctx], data : Ptr[CUnsignedChar], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha384(dst : CArray[uint8_t, Nat.Digit2[Nat._4, Nat._8]], data : Ptr[uint8_t], datasz : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha384_final(digest : CArray[uint8_t, Nat.Digit2[Nat._4, Nat._8]], ctx : Ptr[mg_sha384_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha384_init(ctx : Ptr[mg_sha384_ctx]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sha384_update(ctx : Ptr[mg_sha384_ctx], data : Ptr[uint8_t], len : size_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_snprintf(_0 : CString, _1 : size_t, fmt : CString, rest: Any*): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sntp_connect(mgr : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sntp_parse(buf : Ptr[CUnsignedChar], len : size_t): int64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_sntp_request(c : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_timer_add(mgr : Ptr[mg_mgr], milliseconds : uint64_t, flags : CUnsignedInt, fn : CFuncPtr1[Ptr[Byte], Unit], arg : Ptr[Byte]): Ptr[mg_timer] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_timer_expired(expiration : Ptr[uint64_t], period : uint64_t, now : uint64_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_timer_free(head : Ptr[Ptr[mg_timer]], _1 : Ptr[mg_timer]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_timer_init(head : Ptr[Ptr[mg_timer]], timer : Ptr[mg_timer], milliseconds : uint64_t, flags : CUnsignedInt, fn : CFuncPtr1[Ptr[Byte], Unit], arg : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_timer_poll(head : Ptr[Ptr[mg_timer]], new_ms : uint64_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_ctx_free(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_ctx_init(_0 : Ptr[mg_mgr]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_flush(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_free(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_handshake(_0 : Ptr[mg_connection]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_init(c : Ptr[mg_connection], opts : Ptr[mg_tls_opts]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_pending(_0 : Ptr[mg_connection]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_recv(_0 : Ptr[mg_connection], buf : Ptr[Byte], len : size_t): CLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_send(_0 : Ptr[mg_connection], buf : Ptr[Byte], len : size_t): CLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_tls_x25519(out : CArray[uint8_t, Nat.Digit2[Nat._3, Nat._2]], scalar : CArray[uint8_t, Nat.Digit2[Nat._3, Nat._2]], x1 : CArray[uint8_t, Nat.Digit2[Nat._3, Nat._2]], clamp : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_compress(public_key : Ptr[uint8_t], compressed : Ptr[uint8_t], curve : MG_UECC_Curve): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_compute_public_key(private_key : Ptr[uint8_t], public_key : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_curve_private_key_size(curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_curve_public_key_size(curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_decompress(compressed : Ptr[uint8_t], public_key : Ptr[uint8_t], curve : MG_UECC_Curve): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_get_rng(): MG_UECC_RNG_Function = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_make_key(public_key : Ptr[uint8_t], private_key : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_secp256r1(): MG_UECC_Curve = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_secp384r1(): MG_UECC_Curve = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_set_rng(rng_function : MG_UECC_RNG_Function): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_shared_secret(public_key : Ptr[uint8_t], private_key : Ptr[uint8_t], secret : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_sign(private_key : Ptr[uint8_t], message_hash : Ptr[uint8_t], hash_size : CUnsignedInt, signature : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_sign_deterministic(private_key : Ptr[uint8_t], message_hash : Ptr[uint8_t], hash_size : CUnsignedInt, hash_context : Ptr[MG_UECC_HashContext], signature : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_valid_public_key(public_key : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_uecc_verify(public_key : Ptr[uint8_t], message_hash : Ptr[uint8_t], hash_size : CUnsignedInt, signature : Ptr[uint8_t], curve : MG_UECC_Curve): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_decode(s : CString, n : size_t, to : CString, to_len : size_t, form : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_encode(s : CString, n : size_t, buf : CString, len : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_is_ssl(url : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_port(url : CString): CUnsignedShort = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_uri(url : CString): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_vmprintf(fmt : CString, ap : Ptr[va_list]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_vprintf(_0 : Ptr[mg_connection], fmt : CString, ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_vsnprintf(buf : CString, len : size_t, fmt : CString, ap : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_vxprintf(_0 : CFuncPtr2[CChar, Ptr[Byte], Unit], _1 : Ptr[Byte], fmt : CString, _3 : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wakeup(_0 : Ptr[mg_mgr], id : CUnsignedLongInt, buf : Ptr[Byte], len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wakeup_init(_0 : Ptr[mg_mgr]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wifi_ap_start(_0 : Ptr[mg_wifi_data]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wifi_ap_stop(): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wifi_connect(_0 : Ptr[mg_wifi_data]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wifi_disconnect(): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wifi_scan(): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_wrapfd(mgr : Ptr[mg_mgr], fd : CInt, fn : mg_event_handler_t, fn_data : Ptr[Byte]): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ws_connect(_0 : Ptr[mg_mgr], url : CString, fn : mg_event_handler_t, fn_data : Ptr[Byte], fmt : CString, rest: Any*): Ptr[mg_connection] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ws_printf(c : Ptr[mg_connection], op : CInt, fmt : CString, rest: Any*): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ws_send(_0 : Ptr[mg_connection], buf : Ptr[Byte], len : size_t, op : CInt): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ws_upgrade(_0 : Ptr[mg_connection], _1 : Ptr[mg_http_message], fmt : CString, rest: Any*): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ws_vprintf(c : Ptr[mg_connection], op : CInt, fmt : CString, _3 : Ptr[va_list]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_ws_wrap(_0 : Ptr[mg_connection], len : size_t, op : CInt): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_xprintf(fn : CFuncPtr2[CChar, Ptr[Byte], Unit], _1 : Ptr[Byte], fmt : CString, rest: Any*): size_t = extern

object functions:
  import _root_.mongoose.predef.*
  import _root_.mongoose.enumerations.*
  import _root_.mongoose.aliases.*
  import _root_.mongoose.structs.*
  import extern_functions.*
  export extern_functions.*

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_aton(str : Ptr[mg_str], addr : Ptr[mg_addr]): Boolean =
    __sn_wrap_mongoose_mg_aton(str, addr)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_aton(str : mg_str, addr : Ptr[mg_addr])(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = str
    __sn_wrap_mongoose_mg_aton((__ptr_0 + 0), addr)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_check_ip_acl(acl : Ptr[mg_str], remote_ip : Ptr[mg_addr]): CInt =
    __sn_wrap_mongoose_mg_check_ip_acl(acl, remote_ip)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_check_ip_acl(acl : mg_str, remote_ip : Ptr[mg_addr])(using Zone): CInt =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = acl
    __sn_wrap_mongoose_mg_check_ip_acl((__ptr_0 + 0), remote_ip)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_file_add(name : mg_str, size : size_t)(using Zone): Unit =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = name
    __sn_wrap_mongoose_mg_dash_file_add((__ptr_0 + 0), size)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_file_add(name : Ptr[mg_str], size : size_t): Unit =
    __sn_wrap_mongoose_mg_dash_file_add(name, size)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_file_del(name : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_dash_file_del(name)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_dash_file_del(name : mg_str)(using Zone): Unit =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = name
    __sn_wrap_mongoose_mg_dash_file_del((__ptr_0 + 0))

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_file_read(fs : Ptr[mg_fs], path : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_file_read(fs, path, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_file_read(fs : Ptr[mg_fs], path : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_file_read(fs, path, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_get_header_var(s : Ptr[mg_str], v : Ptr[mg_str])(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_http_get_header_var(s, v, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_get_header_var(s : mg_str, v : mg_str)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](3)
    !(__ptr_0 + 0) = s
    !(__ptr_0 + 1) = v
    __sn_wrap_mongoose_mg_http_get_header_var((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_get_header_var(s : Ptr[mg_str], v : Ptr[mg_str])(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_http_get_header_var(s, v, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_next_multipart(_0 : mg_str, _1 : size_t, _2 : Ptr[mg_http_part])(using Zone): size_t =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = _0
    __sn_wrap_mongoose_mg_http_next_multipart((__ptr_0 + 0), _1, _2)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_next_multipart(_0 : Ptr[mg_str], _1 : size_t, _2 : Ptr[mg_http_part]): size_t =
    __sn_wrap_mongoose_mg_http_next_multipart(_0, _1, _2)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_start_upload(c : Ptr[mg_connection], hm : Ptr[mg_http_message], name : Ptr[mg_str], dir : Ptr[mg_str], fs : Ptr[mg_fs], fn : CFuncPtr2[Ptr[mg_connection], CString, Unit]): Unit =
    __sn_wrap_mongoose_mg_http_start_upload(c, hm, name, dir, fs, fn)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_start_upload(c : Ptr[mg_connection], hm : Ptr[mg_http_message], name : mg_str, dir : mg_str, fs : Ptr[mg_fs], fn : CFuncPtr2[Ptr[mg_connection], CString, Unit])(using Zone): Unit =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](2)
    !(__ptr_0 + 0) = name
    !(__ptr_0 + 1) = dir
    __sn_wrap_mongoose_mg_http_start_upload(c, hm, (__ptr_0 + 0), (__ptr_0 + 1), fs, fn)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_var(buf : mg_str, name : mg_str)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](3)
    !(__ptr_0 + 0) = buf
    !(__ptr_0 + 1) = name
    __sn_wrap_mongoose_mg_http_var((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_var(buf : Ptr[mg_str], name : Ptr[mg_str])(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_http_var(buf, name, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_http_var(buf : Ptr[mg_str], name : Ptr[mg_str])(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_http_var(buf, name, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get(json : Ptr[mg_str], path : CString, toklen : Ptr[CInt]): CInt =
    __sn_wrap_mongoose_mg_json_get(json, path, toklen)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get(json : mg_str, path : CString, toklen : Ptr[CInt])(using Zone): CInt =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get((__ptr_0 + 0), path, toklen)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_b64(json : Ptr[mg_str], path : CString, len : Ptr[CInt]): CString =
    __sn_wrap_mongoose_mg_json_get_b64(json, path, len)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_b64(json : mg_str, path : CString, len : Ptr[CInt])(using Zone): CString =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_b64((__ptr_0 + 0), path, len)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_bool(json : Ptr[mg_str], path : CString, v : Ptr[Boolean]): Boolean =
    __sn_wrap_mongoose_mg_json_get_bool(json, path, v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_bool(json : mg_str, path : CString, v : Ptr[Boolean])(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_bool((__ptr_0 + 0), path, v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_hex(json : Ptr[mg_str], path : CString, len : Ptr[CInt]): CString =
    __sn_wrap_mongoose_mg_json_get_hex(json, path, len)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_hex(json : mg_str, path : CString, len : Ptr[CInt])(using Zone): CString =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_hex((__ptr_0 + 0), path, len)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_long(json : mg_str, path : CString, dflt : CLongInt)(using Zone): CLongInt =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_long((__ptr_0 + 0), path, dflt)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_long(json : Ptr[mg_str], path : CString, dflt : CLongInt): CLongInt =
    __sn_wrap_mongoose_mg_json_get_long(json, path, dflt)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_num(json : mg_str, path : CString, v : Ptr[Double])(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_num((__ptr_0 + 0), path, v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_num(json : Ptr[mg_str], path : CString, v : Ptr[Double]): Boolean =
    __sn_wrap_mongoose_mg_json_get_num(json, path, v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_str(json : Ptr[mg_str], path : CString): CString =
    __sn_wrap_mongoose_mg_json_get_str(json, path)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_str(json : mg_str, path : CString)(using Zone): CString =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_str((__ptr_0 + 0), path)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_tok(json : mg_str, path : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](2)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_get_tok((__ptr_0 + 0), path, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_tok(json : Ptr[mg_str], path : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_json_get_tok(json, path, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_get_tok(json : Ptr[mg_str], path : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_json_get_tok(json, path, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_next(obj : Ptr[mg_str], ofs : size_t, key : Ptr[mg_str], `val` : Ptr[mg_str]): size_t =
    __sn_wrap_mongoose_mg_json_next(obj, ofs, key, `val`)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_next(obj : mg_str, ofs : size_t, key : Ptr[mg_str], `val` : Ptr[mg_str])(using Zone): size_t =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = obj
    __sn_wrap_mongoose_mg_json_next((__ptr_0 + 0), ofs, key, `val`)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_unescape(json : Ptr[mg_str], path : CString, _2 : CString, _3 : size_t): size_t =
    __sn_wrap_mongoose_mg_json_unescape(json, path, _2, _3)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_json_unescape(json : mg_str, path : CString, _2 : CString, _3 : size_t)(using Zone): size_t =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = json
    __sn_wrap_mongoose_mg_json_unescape((__ptr_0 + 0), path, _2, _3)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_match(str : mg_str, pattern : mg_str, caps : Ptr[mg_str])(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](2)
    !(__ptr_0 + 0) = str
    !(__ptr_0 + 1) = pattern
    __sn_wrap_mongoose_mg_match((__ptr_0 + 0), (__ptr_0 + 1), caps)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_match(str : Ptr[mg_str], pattern : Ptr[mg_str], caps : Ptr[mg_str]): Boolean =
    __sn_wrap_mongoose_mg_match(str, pattern, caps)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_path_is_sane(path : mg_str)(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = path
    __sn_wrap_mongoose_mg_path_is_sane((__ptr_0 + 0))

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_path_is_sane(path : Ptr[mg_str]): Boolean =
    __sn_wrap_mongoose_mg_path_is_sane(path)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_add(head : Ptr[Ptr[mg_rpc]], method_pattern : Ptr[mg_str], handler : CFuncPtr1[Ptr[mg_rpc_req], Unit], handler_data : Ptr[Byte]): Unit =
    __sn_wrap_mongoose_mg_rpc_add(head, method_pattern, handler, handler_data)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_rpc_add(head : Ptr[Ptr[mg_rpc]], method_pattern : mg_str, handler : CFuncPtr1[Ptr[mg_rpc_req], Unit], handler_data : Ptr[Byte])(using Zone): Unit =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = method_pattern
    __sn_wrap_mongoose_mg_rpc_add(head, (__ptr_0 + 0), handler, handler_data)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_span(s : mg_str, a : Ptr[mg_str], b : Ptr[mg_str], delim : CChar)(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = s
    __sn_wrap_mongoose_mg_span((__ptr_0 + 0), a, b, delim)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_span(s : Ptr[mg_str], a : Ptr[mg_str], b : Ptr[mg_str], delim : CChar): Boolean =
    __sn_wrap_mongoose_mg_span(s, a, b, delim)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_str_n(s : CString, n : size_t)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_str_n(s, n, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_str_n(s : CString, n : size_t)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_str_n(s, n, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_str_s(s : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_str_s(s, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_str_s(s : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_str_s(s, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_str_to_num(_0 : Ptr[mg_str], base : CInt, `val` : Ptr[Byte], val_len : size_t): Boolean =
    __sn_wrap_mongoose_mg_str_to_num(_0, base, `val`, val_len)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_str_to_num(_0 : mg_str, base : CInt, `val` : Ptr[Byte], val_len : size_t)(using Zone): Boolean =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    !(__ptr_0 + 0) = _0
    __sn_wrap_mongoose_mg_str_to_num((__ptr_0 + 0), base, `val`, val_len)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strcasecmp(str1 : mg_str, str2 : mg_str)(using Zone): CInt =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](2)
    !(__ptr_0 + 0) = str1
    !(__ptr_0 + 1) = str2
    __sn_wrap_mongoose_mg_strcasecmp((__ptr_0 + 0), (__ptr_0 + 1))

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strcasecmp(str1 : Ptr[mg_str], str2 : Ptr[mg_str]): CInt =
    __sn_wrap_mongoose_mg_strcasecmp(str1, str2)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strcmp(str1 : Ptr[mg_str], str2 : Ptr[mg_str]): CInt =
    __sn_wrap_mongoose_mg_strcmp(str1, str2)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strcmp(str1 : mg_str, str2 : mg_str)(using Zone): CInt =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](2)
    !(__ptr_0 + 0) = str1
    !(__ptr_0 + 1) = str2
    __sn_wrap_mongoose_mg_strcmp((__ptr_0 + 0), (__ptr_0 + 1))

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strdup(s : mg_str)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](2)
    !(__ptr_0 + 0) = s
    __sn_wrap_mongoose_mg_strdup((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strdup(s : Ptr[mg_str])(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_strdup(s, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_strdup(s : Ptr[mg_str])(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_strdup(s, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_unpacked(path : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_unpacked(path, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_unpacked(path : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_unpacked(path, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_host(url : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_url_host(url, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_host(url : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_url_host(url, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_pass(url : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_url_pass(url, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_pass(url : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_url_pass(url, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_user(url : CString)(__return : Ptr[mg_str]): Unit =
    __sn_wrap_mongoose_mg_url_user(url, __return)

  /**
   * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/sn-sizemap/cli/src/main/resources/scala-native/mongoose.h
  */
  def mg_url_user(url : CString)(using Zone): mg_str =
    val __ptr_0: Ptr[mg_str] = _root_.scala.scalanative.unsafe.alloc[mg_str](1)
    __sn_wrap_mongoose_mg_url_user(url, (__ptr_0 + 0))
    !(__ptr_0 + 0)

object types:
    export _root_.mongoose.structs.*
    export _root_.mongoose.aliases.*
    export _root_.mongoose.enumerations.*

object all:
  export _root_.mongoose.enumerations.mg_val_type
  export _root_.mongoose.structs.MG_UECC_Curve_t
  export _root_.mongoose.structs.MG_UECC_HashContext
  export _root_.mongoose.structs.aes_context
  export _root_.mongoose.structs.mg_addr
  export _root_.mongoose.structs.mg_connection
  export _root_.mongoose.structs.mg_dash
  export _root_.mongoose.structs.mg_dash_custom_handler
  export _root_.mongoose.structs.mg_dash_file
  export _root_.mongoose.structs.mg_dns
  export _root_.mongoose.structs.mg_dns_header
  export _root_.mongoose.structs.mg_dns_message
  export _root_.mongoose.structs.mg_dns_rr
  export _root_.mongoose.structs.mg_dnssd_record
  export _root_.mongoose.structs.mg_fd
  export _root_.mongoose.structs.mg_field
  export _root_.mongoose.structs.mg_field_set
  export _root_.mongoose.structs.mg_fs
  export _root_.mongoose.structs.mg_http_header
  export _root_.mongoose.structs.mg_http_message
  export _root_.mongoose.structs.mg_http_part
  export _root_.mongoose.structs.mg_http_serve_opts
  export _root_.mongoose.structs.mg_iobuf
  export _root_.mongoose.structs.mg_md5_ctx
  export _root_.mongoose.structs.mg_mdns_req
  export _root_.mongoose.structs.mg_mdns_resp
  export _root_.mongoose.structs.mg_mem_file
  export _root_.mongoose.structs.mg_mgr
  export _root_.mongoose.structs.mg_modbus_req
  export _root_.mongoose.structs.mg_mqtt_message
  export _root_.mongoose.structs.mg_mqtt_opts
  export _root_.mongoose.structs.mg_mqtt_prop
  export _root_.mongoose.structs.mg_phy
  export _root_.mongoose.structs.mg_queue
  export _root_.mongoose.structs.mg_rpc
  export _root_.mongoose.structs.mg_rpc_req
  export _root_.mongoose.structs.mg_sha1_ctx
  export _root_.mongoose.structs.mg_sha256_ctx
  export _root_.mongoose.structs.mg_sha384_ctx
  export _root_.mongoose.structs.mg_str
  export _root_.mongoose.structs.mg_tcpip_driver_atcmd_data
  export _root_.mongoose.structs.mg_tcpip_if
  export _root_.mongoose.structs.mg_timer
  export _root_.mongoose.structs.mg_tls_opts
  export _root_.mongoose.structs.mg_wifi_data
  export _root_.mongoose.structs.mg_wifi_scan_bss_data
  export _root_.mongoose.structs.mg_ws_message
  export _root_.mongoose.constants.MG_PHY_SPEED_10M
  export _root_.mongoose.constants.MG_PHY_SPEED_100M
  export _root_.mongoose.constants.MG_PHY_SPEED_1000M
  export _root_.mongoose.constants.MG_OTA_CONFIRMED
  export _root_.mongoose.constants.MG_OTA_TESTING
  export _root_.mongoose.constants.MG_OTA_FAILED
  export _root_.mongoose.constants.MQTT_OK
  export _root_.mongoose.constants.MQTT_INCOMPLETE
  export _root_.mongoose.constants.MQTT_MALFORMED
  export _root_.mongoose.constants.MQTT_PROP_TYPE_BYTE
  export _root_.mongoose.constants.MQTT_PROP_TYPE_STRING
  export _root_.mongoose.constants.MQTT_PROP_TYPE_STRING_PAIR
  export _root_.mongoose.constants.MQTT_PROP_TYPE_BINARY_DATA
  export _root_.mongoose.constants.MQTT_PROP_TYPE_VARIABLE_INT
  export _root_.mongoose.constants.MQTT_PROP_TYPE_INT
  export _root_.mongoose.constants.MQTT_PROP_TYPE_SHORT
  export _root_.mongoose.constants.MG_IO_ERR
  export _root_.mongoose.constants.MG_IO_WAIT
  export _root_.mongoose.constants.MG_LL_NONE
  export _root_.mongoose.constants.MG_LL_ERROR
  export _root_.mongoose.constants.MG_LL_INFO
  export _root_.mongoose.constants.MG_LL_DEBUG
  export _root_.mongoose.constants.MG_LL_VERBOSE
  export _root_.mongoose.constants.MG_JSON_TOO_DEEP
  export _root_.mongoose.constants.MG_JSON_INVALID
  export _root_.mongoose.constants.MG_JSON_NOT_FOUND
  export _root_.mongoose.constants.MG_FS_READ
  export _root_.mongoose.constants.MG_FS_WRITE
  export _root_.mongoose.constants.MG_FS_DIR
  export _root_.mongoose.constants.MG_EV_ERROR
  export _root_.mongoose.constants.MG_EV_OPEN
  export _root_.mongoose.constants.MG_EV_POLL
  export _root_.mongoose.constants.MG_EV_RESOLVE
  export _root_.mongoose.constants.MG_EV_CONNECT
  export _root_.mongoose.constants.MG_EV_ACCEPT
  export _root_.mongoose.constants.MG_EV_TLS_HS
  export _root_.mongoose.constants.MG_EV_READ
  export _root_.mongoose.constants.MG_EV_WRITE
  export _root_.mongoose.constants.MG_EV_CLOSE
  export _root_.mongoose.constants.MG_EV_HTTP_HDRS
  export _root_.mongoose.constants.MG_EV_HTTP_MSG
  export _root_.mongoose.constants.MG_EV_WS_OPEN
  export _root_.mongoose.constants.MG_EV_WS_MSG
  export _root_.mongoose.constants.MG_EV_WS_CTL
  export _root_.mongoose.constants.MG_EV_MQTT_CMD
  export _root_.mongoose.constants.MG_EV_MQTT_MSG
  export _root_.mongoose.constants.MG_EV_MQTT_OPEN
  export _root_.mongoose.constants.MG_EV_SNTP_TIME
  export _root_.mongoose.constants.MG_EV_WAKEUP
  export _root_.mongoose.constants.MG_EV_MDNS_REQ
  export _root_.mongoose.constants.MG_EV_MDNS_RESP
  export _root_.mongoose.constants.MG_EV_MODBUS_REQ
  export _root_.mongoose.constants.MG_EV_USER
  export _root_.mongoose.constants.MG_PHY_LEDS_ACTIVE_HIGH
  export _root_.mongoose.constants.MG_PHY_CLOCKS_MAC
  export _root_.mongoose.aliases.MG_UECC_Curve
  export _root_.mongoose.aliases.MG_UECC_RNG_Function
  export _root_.mongoose.aliases.bitcount_t
  export _root_.mongoose.aliases.cmpresult_t
  export _root_.mongoose.aliases.int16_t
  export _root_.mongoose.aliases.int64_t
  export _root_.mongoose.aliases.int8_t
  export _root_.mongoose.aliases.mg_event_handler_t
  export _root_.mongoose.aliases.mg_pfn_t
  export _root_.mongoose.aliases.mg_pm_t
  export _root_.mongoose.aliases.mg_uecc_word_t
  export _root_.mongoose.aliases.size_t
  export _root_.mongoose.aliases.time_t
  export _root_.mongoose.aliases.uint16_t
  export _root_.mongoose.aliases.uint32_t
  export _root_.mongoose.aliases.uint64_t
  export _root_.mongoose.aliases.uint8_t
  export _root_.mongoose.aliases.va_list
  export _root_.mongoose.aliases.wordcount_t
  export _root_.mongoose.functions.mg_aes_gcm_decrypt
  export _root_.mongoose.functions.mg_aes_gcm_encrypt
  export _root_.mongoose.functions.mg_alloc_conn
  export _root_.mongoose.functions.mg_base64_decode
  export _root_.mongoose.functions.mg_base64_encode
  export _root_.mongoose.functions.mg_base64_final
  export _root_.mongoose.functions.mg_base64_update
  export _root_.mongoose.functions.mg_bzero
  export _root_.mongoose.functions.mg_call
  export _root_.mongoose.functions.mg_calloc
  export _root_.mongoose.functions.mg_casecmp
  export _root_.mongoose.functions.mg_close_conn
  export _root_.mongoose.functions.mg_connect
  export _root_.mongoose.functions.mg_connect_resolved
  export _root_.mongoose.functions.mg_connect_svc
  export _root_.mongoose.functions.mg_crc32
  export _root_.mongoose.functions.mg_dash_ev_handler
  export _root_.mongoose.functions.mg_dash_init
  export _root_.mongoose.functions.mg_dash_poll
  export _root_.mongoose.functions.mg_dash_send_change
  export _root_.mongoose.functions.mg_delayms
  export _root_.mongoose.functions.mg_dns_parse
  export _root_.mongoose.functions.mg_dns_parse_rr
  export _root_.mongoose.functions.mg_error
  export _root_.mongoose.functions.mg_file_printf
  export _root_.mongoose.functions.mg_file_write
  export _root_.mongoose.functions.mg_free
  export _root_.mongoose.functions.mg_fs_close
  export _root_.mongoose.functions.mg_fs_ls
  export _root_.mongoose.functions.mg_fs_open
  export _root_.mongoose.functions.mg_gcm_initialize
  export _root_.mongoose.functions.mg_hexdump
  export _root_.mongoose.functions.mg_hmac_sha256
  export _root_.mongoose.functions.mg_http_bauth
  export _root_.mongoose.functions.mg_http_connect
  export _root_.mongoose.functions.mg_http_creds
  export _root_.mongoose.functions.mg_http_get_header
  export _root_.mongoose.functions.mg_http_get_request_len
  export _root_.mongoose.functions.mg_http_get_var
  export _root_.mongoose.functions.mg_http_listen
  export _root_.mongoose.functions.mg_http_parse
  export _root_.mongoose.functions.mg_http_printf_chunk
  export _root_.mongoose.functions.mg_http_reply
  export _root_.mongoose.functions.mg_http_serve_dir
  export _root_.mongoose.functions.mg_http_serve_file
  export _root_.mongoose.functions.mg_http_serve_ssi
  export _root_.mongoose.functions.mg_http_start_ota
  export _root_.mongoose.functions.mg_http_status
  export _root_.mongoose.functions.mg_http_upload
  export _root_.mongoose.functions.mg_http_write_chunk
  export _root_.mongoose.functions.mg_io_recv
  export _root_.mongoose.functions.mg_io_send
  export _root_.mongoose.functions.mg_iobuf_add
  export _root_.mongoose.functions.mg_iobuf_del
  export _root_.mongoose.functions.mg_iobuf_free
  export _root_.mongoose.functions.mg_iobuf_init
  export _root_.mongoose.functions.mg_iobuf_resize
  export _root_.mongoose.functions.mg_listen
  export _root_.mongoose.functions.mg_log
  export _root_.mongoose.functions.mg_log_prefix
  export _root_.mongoose.functions.mg_log_set_fn
  export _root_.mongoose.functions.mg_md5_final
  export _root_.mongoose.functions.mg_md5_init
  export _root_.mongoose.functions.mg_md5_update
  export _root_.mongoose.functions.mg_mdns_listen
  export _root_.mongoose.functions.mg_mdns_query
  export _root_.mongoose.functions.mg_mgr_free
  export _root_.mongoose.functions.mg_mgr_init
  export _root_.mongoose.functions.mg_mgr_poll
  export _root_.mongoose.functions.mg_millis
  export _root_.mongoose.functions.mg_modbus_listen
  export _root_.mongoose.functions.mg_mprintf
  export _root_.mongoose.functions.mg_mqtt_connect
  export _root_.mongoose.functions.mg_mqtt_disconnect
  export _root_.mongoose.functions.mg_mqtt_init
  export _root_.mongoose.functions.mg_mqtt_listen
  export _root_.mongoose.functions.mg_mqtt_login
  export _root_.mongoose.functions.mg_mqtt_next_prop
  export _root_.mongoose.functions.mg_mqtt_parse
  export _root_.mongoose.functions.mg_mqtt_ping
  export _root_.mongoose.functions.mg_mqtt_poll
  export _root_.mongoose.functions.mg_mqtt_pong
  export _root_.mongoose.functions.mg_mqtt_pub
  export _root_.mongoose.functions.mg_mqtt_send_header
  export _root_.mongoose.functions.mg_mqtt_sub
  export _root_.mongoose.functions.mg_mqtt_unsub
  export _root_.mongoose.functions.mg_multicast_restore
  export _root_.mongoose.functions.mg_now
  export _root_.mongoose.functions.mg_ntohl
  export _root_.mongoose.functions.mg_ntohll
  export _root_.mongoose.functions.mg_ntohs
  export _root_.mongoose.functions.mg_open_listener
  export _root_.mongoose.functions.mg_ota_begin
  export _root_.mongoose.functions.mg_ota_end
  export _root_.mongoose.functions.mg_ota_url_check
  export _root_.mongoose.functions.mg_ota_write
  export _root_.mongoose.functions.mg_pfn_iobuf
  export _root_.mongoose.functions.mg_pfn_iobuf_noresize
  export _root_.mongoose.functions.mg_pfn_stdout
  export _root_.mongoose.functions.mg_phy_init
  export _root_.mongoose.functions.mg_phy_up
  export _root_.mongoose.functions.mg_print_base64
  export _root_.mongoose.functions.mg_print_esc
  export _root_.mongoose.functions.mg_print_hex
  export _root_.mongoose.functions.mg_print_ieee64
  export _root_.mongoose.functions.mg_print_ip
  export _root_.mongoose.functions.mg_print_ip4
  export _root_.mongoose.functions.mg_print_ip6
  export _root_.mongoose.functions.mg_print_ip_port
  export _root_.mongoose.functions.mg_print_l2addr
  export _root_.mongoose.functions.mg_print_mac
  export _root_.mongoose.functions.mg_printf
  export _root_.mongoose.functions.mg_queue_add
  export _root_.mongoose.functions.mg_queue_book
  export _root_.mongoose.functions.mg_queue_del
  export _root_.mongoose.functions.mg_queue_init
  export _root_.mongoose.functions.mg_queue_next
  export _root_.mongoose.functions.mg_queue_printf
  export _root_.mongoose.functions.mg_random
  export _root_.mongoose.functions.mg_random_str
  export _root_.mongoose.functions.mg_resolve
  export _root_.mongoose.functions.mg_resolve_cancel
  export _root_.mongoose.functions.mg_rpc_del
  export _root_.mongoose.functions.mg_rpc_err
  export _root_.mongoose.functions.mg_rpc_list
  export _root_.mongoose.functions.mg_rpc_ok
  export _root_.mongoose.functions.mg_rpc_process
  export _root_.mongoose.functions.mg_rpc_verr
  export _root_.mongoose.functions.mg_rpc_vok
  export _root_.mongoose.functions.mg_rsa_crt_sign
  export _root_.mongoose.functions.mg_rsa_mod_pow
  export _root_.mongoose.functions.mg_send
  export _root_.mongoose.functions.mg_sha1_final
  export _root_.mongoose.functions.mg_sha1_init
  export _root_.mongoose.functions.mg_sha1_update
  export _root_.mongoose.functions.mg_sha256
  export _root_.mongoose.functions.mg_sha256_final
  export _root_.mongoose.functions.mg_sha256_init
  export _root_.mongoose.functions.mg_sha256_update
  export _root_.mongoose.functions.mg_sha384
  export _root_.mongoose.functions.mg_sha384_final
  export _root_.mongoose.functions.mg_sha384_init
  export _root_.mongoose.functions.mg_sha384_update
  export _root_.mongoose.functions.mg_snprintf
  export _root_.mongoose.functions.mg_sntp_connect
  export _root_.mongoose.functions.mg_sntp_parse
  export _root_.mongoose.functions.mg_sntp_request
  export _root_.mongoose.functions.mg_timer_add
  export _root_.mongoose.functions.mg_timer_expired
  export _root_.mongoose.functions.mg_timer_free
  export _root_.mongoose.functions.mg_timer_init
  export _root_.mongoose.functions.mg_timer_poll
  export _root_.mongoose.functions.mg_tls_ctx_free
  export _root_.mongoose.functions.mg_tls_ctx_init
  export _root_.mongoose.functions.mg_tls_flush
  export _root_.mongoose.functions.mg_tls_free
  export _root_.mongoose.functions.mg_tls_handshake
  export _root_.mongoose.functions.mg_tls_init
  export _root_.mongoose.functions.mg_tls_pending
  export _root_.mongoose.functions.mg_tls_recv
  export _root_.mongoose.functions.mg_tls_send
  export _root_.mongoose.functions.mg_tls_x25519
  export _root_.mongoose.functions.mg_uecc_compress
  export _root_.mongoose.functions.mg_uecc_compute_public_key
  export _root_.mongoose.functions.mg_uecc_curve_private_key_size
  export _root_.mongoose.functions.mg_uecc_curve_public_key_size
  export _root_.mongoose.functions.mg_uecc_decompress
  export _root_.mongoose.functions.mg_uecc_get_rng
  export _root_.mongoose.functions.mg_uecc_make_key
  export _root_.mongoose.functions.mg_uecc_secp256r1
  export _root_.mongoose.functions.mg_uecc_secp384r1
  export _root_.mongoose.functions.mg_uecc_set_rng
  export _root_.mongoose.functions.mg_uecc_shared_secret
  export _root_.mongoose.functions.mg_uecc_sign
  export _root_.mongoose.functions.mg_uecc_sign_deterministic
  export _root_.mongoose.functions.mg_uecc_valid_public_key
  export _root_.mongoose.functions.mg_uecc_verify
  export _root_.mongoose.functions.mg_url_decode
  export _root_.mongoose.functions.mg_url_encode
  export _root_.mongoose.functions.mg_url_is_ssl
  export _root_.mongoose.functions.mg_url_port
  export _root_.mongoose.functions.mg_url_uri
  export _root_.mongoose.functions.mg_vmprintf
  export _root_.mongoose.functions.mg_vprintf
  export _root_.mongoose.functions.mg_vsnprintf
  export _root_.mongoose.functions.mg_vxprintf
  export _root_.mongoose.functions.mg_wakeup
  export _root_.mongoose.functions.mg_wakeup_init
  export _root_.mongoose.functions.mg_wifi_ap_start
  export _root_.mongoose.functions.mg_wifi_ap_stop
  export _root_.mongoose.functions.mg_wifi_connect
  export _root_.mongoose.functions.mg_wifi_disconnect
  export _root_.mongoose.functions.mg_wifi_scan
  export _root_.mongoose.functions.mg_wrapfd
  export _root_.mongoose.functions.mg_ws_connect
  export _root_.mongoose.functions.mg_ws_printf
  export _root_.mongoose.functions.mg_ws_send
  export _root_.mongoose.functions.mg_ws_upgrade
  export _root_.mongoose.functions.mg_ws_vprintf
  export _root_.mongoose.functions.mg_ws_wrap
  export _root_.mongoose.functions.mg_xprintf
  export _root_.mongoose.functions.mg_aton
  export _root_.mongoose.functions.mg_check_ip_acl
  export _root_.mongoose.functions.mg_dash_file_add
  export _root_.mongoose.functions.mg_dash_file_del
  export _root_.mongoose.functions.mg_file_read
  export _root_.mongoose.functions.mg_http_get_header_var
  export _root_.mongoose.functions.mg_http_next_multipart
  export _root_.mongoose.functions.mg_http_start_upload
  export _root_.mongoose.functions.mg_http_var
  export _root_.mongoose.functions.mg_json_get
  export _root_.mongoose.functions.mg_json_get_b64
  export _root_.mongoose.functions.mg_json_get_bool
  export _root_.mongoose.functions.mg_json_get_hex
  export _root_.mongoose.functions.mg_json_get_long
  export _root_.mongoose.functions.mg_json_get_num
  export _root_.mongoose.functions.mg_json_get_str
  export _root_.mongoose.functions.mg_json_get_tok
  export _root_.mongoose.functions.mg_json_next
  export _root_.mongoose.functions.mg_json_unescape
  export _root_.mongoose.functions.mg_match
  export _root_.mongoose.functions.mg_path_is_sane
  export _root_.mongoose.functions.mg_rpc_add
  export _root_.mongoose.functions.mg_span
  export _root_.mongoose.functions.mg_str_n
  export _root_.mongoose.functions.mg_str_s
  export _root_.mongoose.functions.mg_str_to_num
  export _root_.mongoose.functions.mg_strcasecmp
  export _root_.mongoose.functions.mg_strcmp
  export _root_.mongoose.functions.mg_strdup
  export _root_.mongoose.functions.mg_unpacked
  export _root_.mongoose.functions.mg_url_host
  export _root_.mongoose.functions.mg_url_pass
  export _root_.mongoose.functions.mg_url_user