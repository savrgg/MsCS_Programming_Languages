import scala.reflect.ClassTag

object StringConcat {
    
    def main(args: Array[String]) = {
        val firstName = "Salvador"
        val lastName = 7
        
        val name = firstName + " " + lastName
        val name2 = s"$firstName $lastName"
        
        println(name)
        println(name2)
    }
}