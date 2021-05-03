trait Speaker {
    def speak(): String  
}

trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
    def startRunning(): Unit = print("I am running ")
    def stopRunning(): Unit = println("Stopped running")
    println("test string")
}

class Dog(name: String) extends Speaker with TailWagger {
    def speak(): String = "Woof!"
}

class Cat(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("I do not want to run")
    override def stopRunning(): Unit = println("I will not stop")
}

object Example{
   def main(args: Array[String]) =  {
      val d = new Dog("Chuleta")
      println(d.speak)
      //println(d.startRunning)
      //println(d.stopRunning)
      println(d.startTail)
      println(d.stopTail)

      //val c = new Cat("Logan Antonio")
      //println(c.speak)
      //println(c.startRunning)
      //println(c.stopRunning)
      //println(c.startTail)
      //println(c.stopTail)
   }
}





