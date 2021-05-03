object trycatch {
   def main(args: Array[String]) = {
      try{
      	val Result = 10/1
         var test = Result/2
         println(test)
      }
      catch{
      	case x: ArithmeticException => {
      		println("Exception: A number is not divisible by zero.")
      	}
      }
   }  
}
