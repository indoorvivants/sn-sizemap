//> using target.platform native

package sizemap

import java.io.DataInputStream
import scalanative.unsigned.*

extension (ds: DataInputStream)
  def readUnsignedByte1(): UByte =
    UByte.valueOf(ds.readByte())
  def readUnsignedShort1(): UShort =
    UShort.valueOf(ds.readShort())
end extension
