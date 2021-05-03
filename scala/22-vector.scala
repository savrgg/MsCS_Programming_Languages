object MyCalc{
   def main(args: Array[String]): Unit = {
        val nums = Vector(1, 2, 3, 4, 5)
        val strings = Vector("one", "two")

        val a = Vector(1,2,3)
        val b = a :+ 4

        println(b(1))
        println(a)
        println(nums)
      }
}


