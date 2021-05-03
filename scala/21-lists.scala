object MyCalc{
   def main(args: Array[String]): Unit = {
        val a = List(1, 2, 3)
        val names = List("Joel", "Chris", "Ed")
        // adding elements to rigth
        val b = 0 +: a
        // adding elements to left
        val c = a :+ 4
        // iterating
        println(b)
        println(c)
        for (name <- names) println(name)
      }
}





