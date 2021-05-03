
class Person(var firstName: String, var lastName: String) {
    def printFullName() = println(s"$firstName $lastName")
}

object Example{
   def main(args: Array[String])=  {
      val p = new Person("Braulio", "Pina")
      println(p)
      println(p.printFullName)
   }
}


