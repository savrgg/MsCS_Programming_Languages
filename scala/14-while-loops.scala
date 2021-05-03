object WhileLoop{
   def main(args: Array[String]) = {
      var a = 10;
      var loopWhile = while( a < 20 ){
         println( "Value of a: " + a );
         a = a + 1
      }

      println(loopWhile)
   }
}