object DoWhileLoop{
   def main(args: Array[String]) = {
      var a = 10;
      do {
          println( "Value of a: " + a );
          a = a + 1;
        } while( a < 20)
   }
}