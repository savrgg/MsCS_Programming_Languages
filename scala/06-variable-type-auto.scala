import scala.reflect.ClassTag

object VarTypes {
    
    def main(args: Array[String]) = {
        val a= 7
        var b= 7.0
        
        println(f(a))
        println(f(b))
    }
    
    def f[T](v: T)(implicit ev: ClassTag[T]) = ev.toString

}