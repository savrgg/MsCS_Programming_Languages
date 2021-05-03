import scala.reflect.ClassTag

object ForLoop{
    def main(args: Array[String]) = {         
        val m1 = Map(
            "cold weather" -> "jacket", 
            "pool party" -> "swimsuit",
            "travel" -> "suitcase",
            )

        val fruitLengths = 
            for ((k,v) <- m1) 
            yield s"PLACE: $k" -> s"OUTFIT: $v"

        println(f(m1))
        println(f(fruitLengths))
    }
    def f[T](v: T)(implicit ev: ClassTag[T]) = ev.toString
}


