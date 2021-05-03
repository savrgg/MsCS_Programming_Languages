import scala.io.StdIn.readLine

object InputExample {    
    def main(args: Array[String]) = {
        println("Enter your name")
        val name = readLine()
		println(s"Your name is: $name")
    }
}