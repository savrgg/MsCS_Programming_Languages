import scala.reflect.ClassTag
object ForLoop{
    def main(args: Array[String]) = {         
        val fruits = List("apple", "banana", "lime", "orange")
        val fruitLengths = 
        for {f <- fruits if f.length > 4}
            yield f.length 

        println(detectClass(fruits))
        println(detectClass(fruitLengths))
        
    }
    def detectClass[T](v: T)(implicit ev: ClassTag[T]) = ev.toString
}

