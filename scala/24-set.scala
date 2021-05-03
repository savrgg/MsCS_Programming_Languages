

object MyCalc{
   def main(args: Array[String]): Unit = {
     val set = scala.collection.mutable.Set[Int]()
        set += 1
        set += 2 += 3
        set ++= Vector(4, 5)
        set.add(6)

        println(set)
      }
}



