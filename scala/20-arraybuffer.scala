import scala.collection.mutable.ArrayBuffer

object MyCalc{
   def main(args: Array[String]): Unit = {
        val a = ArrayBuffer(1, 2, 3)         // ArrayBuffer(1, 2, 3)
        a.append(4)                          // ArrayBuffer(1, 2, 3, 4)
        a.append(5, 6)                       // ArrayBuffer(1, 2, 3, 4, 5, 6)
        a.appendAll(Seq(7,8))                // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)
        a.clear                              // ArrayBuffer()

        val a = ArrayBuffer(9, 10)           // ArrayBuffer(9, 10)
        a.insert(0, 8)                       // ArrayBuffer(8, 9, 10)
        a.insertAll(0, Vector(4, 5, 6, 7))   // ArrayBuffer(4, 5, 6, 7, 8, 9, 10)
        a.prepend(3)                         // ArrayBuffer(3, 4, 5, 6, 7, 8, 9, 10)
        a.prepend(1, 2)                      // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        a.prependAll(Array(0))               // ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val a = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
        a.remove(0)                          // ArrayBuffer(b, c, d, e, f, g)
        a.remove(2, 3)                       // ArrayBuffer(b, c, g)

        val a = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
        a.trimStart(2)                       // ArrayBuffer(c, d, e, f, g)
        a.trimEnd(2)                  
      }
}





