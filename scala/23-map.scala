import scala.collection.mutable.Map

object MyCalc{
   def main(args: Array[String]): Unit = {
        val states = collection.mutable.Map("AK" -> "Alaska")
        states += ("AL" -> "Alabama")
        states -= "AR"
        states("AK") = "Alaska, A Really Big State"
        states("TX") = "Texas"

        println(states)
      }
}






