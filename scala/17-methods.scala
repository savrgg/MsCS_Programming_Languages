object MyCalc{
   def sum(a: Int, b: Int): Int = a + b
   def concatenate(s1: String, s2: String): String = s1 + s2

   def main(args: Array[String])=  {
      val i = sum(3,5)
      val s = concatenate("Hola ", "Mundo!")
      println(i)
      println(s)
      }
}


