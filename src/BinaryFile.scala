package sizemap

import java.io.DataInputStream
import Endianness.LITTLE
import Endianness.BIG
import java.io.RandomAccessFile
import java.nio.channels.Channels

class BinaryFile(raf: RandomAccessFile):
  private val ch = raf.getChannel()
  private val ds = new DataInputStream(Channels.newInputStream(ch))

  implicit val implicitDS: DataInputStream = ds

  def seek(pos: Long): Unit = raf.seek(pos)
  def readByte(): Byte = ds.readByte()
  def readUnsignedByte(): UnsignedByte = ds.readUnsignedByte()
  def readUnsignedShort(): UnsignedShort = ds.readUnsignedShort()
  def readLong(): Long = ds.readLong()
  def readInt(): Int = ds.readInt()
  def readNBytes(bytes: Int): Array[Byte] = ds.readNBytes(bytes)
  def position(): Long = ch.position()
  def readFully(ar: Array[Byte]) = ds.readFully(ar)

  def skipNBytes(n: Long): Unit = ds.skipNBytes(n)

  def withRestore[A](f: => A): A =
    val pos = position()
    try f
    finally seek(pos)
end BinaryFile
