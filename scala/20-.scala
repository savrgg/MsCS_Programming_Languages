class Student {
  
  class Student1 {
    var sage = 0
    def studage() : Unit = {
    println("Student Age is :"+sage)
    }
  }
}

  class StudentAge{
    sage = sage + 4
    studage()
    }

  object example {
    
    def main(args: Array[String]) = {
        x = new Student1()
        x.sage
        x.studage
    }
}

  
  



class School
{ 
    def NumberOfStudents()=
    { 
        0 
    } 
} 


class class_lenguajes extends School
{
    override def NumberOfStudents()=
    { 
        6
    } 
} 

object NewClass
{ 
    def main(args:Array[String]): Unit = {
        println("hola")
        var x = new class_lenguajes() 
        println("Number of students in class lenguajes: " + 
         x.NumberOfStudents()) 
    } 
} 



// DONT
def printBar(bar: Baz) {
  println(bar)
}
// DO
def printBar(bar: Bar): Unit = {
  println(bar)
}
def printBar(bar: Bar): = {
  println(bar)
}


def foo = {
    println("hello")
}

("this" + "is a very" + "long" +
  "expression")

abstract class IntSet {
    def incl(x:Int): IntSet
    def contains(x:Int): Boolean
}

object Curry
{
    def add2(a: Int) = (b: Int) => a + b;
    def main(args: Array[String])
    {
        val sum = add2(29);
        println(sum(5));
    }
}

object Curry
{
    def add2(a: Int) = (b: Int) => a + b;
    def main(args: Array[String])
    {
        println(add2(20)(19));
    }
}

object Curry
{
    def add(x: Int, y: Int) = x + y;  
    def main(args: Array[String])
    {
        println(add(20, 19));
    }
}

def loop:Int = loop
def test(x: => Int, y: => Int) = x 
test(1, loop)

def test(x: Int, y: Int) = x 


def square(x: Double) = x * x
def sumofSqaures(x: Int, y: Int) = square(x) + square(y)
sumofSqaures(2, 2 + 3)



// Evaluation Rules --------------------
def example = 2      // evaluated when called
val example = 2      // evaluated immediately
lazy val example = 2 // evaluated once when needed

def square(x: Double)    // call by value
def square(x: => Double) // call by name
def myFct(bindings: Int*) = { ... } // bindings is a sequence of int, containing a varying # of arguments

// Higher order functions --------------------
// sum() returns a function that takes two integers and returns an integer  
def sum(f: Int => Int): (Int, Int) => Int = {  
  def sumf(a: Int, b: Int): Int = {...}  
  sumf  
} 

// same as above. Its type is (Int => Int) => (Int, Int) => Int  
def sum(f: Int => Int)(a: Int, b: Int): Int = { ... } 

// Called like this
sum((x: Int) => x * x * x)          // Anonymous function, i.e. does not have a name  
sum(x => x * x * x)                 // Same anonymous function with type inferred

def cube(x: Int) = x * x * x  
sum(x => x * x * x)(1, 10) // sum of cubes from 1 to 10
sum(cube)(1, 10)           // same as above      

// Currying --------------------    
def f(a: Int, b: Int): Int // uncurried version (type is (Int, Int) => Int)
def f(a: Int)(b: Int): Int // curried version (type is Int => Int => Int)


// Class --------------------    
class MyClass(x: Int, y: Int) {           // Defines a new type MyClass with a constructor  
  require(y > 0, "y must be positive")    // precondition, triggering an IllegalArgumentException if not met  
  def this (x: Int) = { ... }             // auxiliary constructor   
  def nb1 = x                             // public method computed every time it is called  
  def nb2 = y  
  private def test(a: Int): Int = { ... } // private method  
  val nb3 = x + y                         // computed only once  
  override def toString =                 // overridden method  
      member1 + ", " + member2 
  }

new MyClass(1, 2) // creates a new object of type


// Class hierarchy

abstract class TopLevel {     // abstract class  
  def method1(x: Int): Int   // abstract method  
  def method2(x: Int): Int = { ... }  
}

class Level1 extends TopLevel {  
  def method1(x: Int): Int = { ... }  
  override def method2(x: Int): Int = { ...} // TopLevel's method2 needs to be explicitly overridden  
}

object MyObject extends TopLevel { ... } // defines a singleton object. No other instance can be created

object Hello {  
  def main(args: Array[String]) = println("Hello world")  
}

object Hello extends App {
  println("Hello World")
}


// class organization --------------------

class MyClass[T](arg1: T) { ... }  
new MyClass[Int](1)  
new MyClass(1)   // the type is being inferred, i.e. determined based on the value arguments  

def myFct[T <: TopLevel](arg: T): T = { ... } // T must derive from TopLevel or be TopLevel
def myFct[T >: Level1](arg: T): T = { ... }   // T must be a supertype of Level1
def myFct[T >: Level1 <: Top Level](arg: T): T = { ... }


// variance ---------------------
def myFct[T <: TopLevel](arg: T): T = { ... } // T must derive from TopLevel or be TopLevel
def myFct[T >: Level1](arg: T): T = { ... }   // T must be a supertype of Level1
def myFct[T >: Level1 <: Top Level](arg: T): T = { ... }

trait Function1[-T, +U] {
  def apply(x: T): U
} // Variance check is OK because T is contravariant and U is covariant

class Array[+T] {
  def update(x: T)
} // variance checks fails


// Pattern Matching ------------------------

unknownObject match {
  case MyClass(n) => ...
  case MyClass2(a, b) => ...
}

(someList: List[T]) match {
  case Nil => ...          // empty list
  case x :: Nil => ...     // list with only one element
  case List(x) => ...      // same as above
  case x :: xs => ...      // a list with at least one element. x is bound to the head,
                           // xs to the tail. xs could be Nil or some other list.
  case 1 :: 2 :: cs => ... // lists that starts with 1 and then 2
  case (x, y) :: ps => ... // a list where the head element is a pair
  case _ => ...            // default case if none of the above matches
}


val myMap = Map("a" -> 42, "b" -> 43)
def getMapValue(s: String): String = {
  myMap get s match {
    case Some(nb) => "Value found: " + nb
    case None => "No value found"
  }
}
getMapValue("a")  // "Value found: 42"
getMapValue("c")  // "No value found"


def getMapValue(s: String): String =
  myMap.get(s).map("Value found: " + _).getOrElse("No value found")


  // Pattern Matching in Anonymous Functions --------------

  val pairs: List[(Char, Int)] = ('a', 2) :: ('b', 3) :: Nil
val chars: List[Char] = pairs.map(p => p match {
  case (ch, num) => ch
})

val chars: List[Char] = pairs map {
  case (ch, num) => ch
}


// collections -----------------


val fruitList = List("apples", "oranges", "pears")
// Alternative syntax for lists
val fruit = "apples" :: ("oranges" :: ("pears" :: Nil)) // parens optional, :: is right-associative
fruit.head   // "apples"
fruit.tail   // List("oranges", "pears")
val empty = List()
val empty = Nil

val nums = Vector("louis", "frank", "hiromi")
nums(1)                     // element at index 1, returns "frank", complexity O(log(n))
nums.updated(2, "helena")   // new vector with a different string at index 2, complexity O(log(n))

val fruitSet = Set("apple", "banana", "pear", "banana")
fruitSet.size    // returns 3: there are no duplicates, only one banana

val r: Range = 1 until 5 // 1, 2, 3, 4
val s: Range = 1 to 5    // 1, 2, 3, 4, 5
1 to 10 by 3  // 1, 4, 7, 10
6 to 1 by -2  // 6, 4, 2

val s = (1 to 6).toSet
s map (_ + 2) // adds 2 to each element of the set

val s = "Hello World"
s filter (c => c.isUpper) // returns "HW"; strings can be treated as Seq[Char]

// Operations on sequences
val xs = List(...)
xs.length   // number of elements, complexity O(n)
xs.last     // last element (exception if xs is empty), complexity O(n)
xs.init     // all elements of xs but the last (exception if xs is empty), complexity O(n)
xs take n   // first n elements of xs
xs drop n   // the rest of the collection after taking n elements
xs(n)       // the nth element of xs, complexity O(n)
xs ++ ys    // concatenation, complexity O(n)
xs.reverse  // reverse the order, complexity O(n)
xs updated(n, x)  // same list than xs, except at index n where it contains x, complexity O(n)
xs indexOf x      // the index of the first element equal to x (-1 otherwise)
xs contains x     // same as xs indexOf x >= 0
xs filter p       // returns a list of the elements that satisfy the predicate p
xs filterNot p    // filter with negated p 
xs partition p    // same as (xs filter p, xs filterNot p)
xs takeWhile p    // the longest prefix consisting of elements that satisfy p
xs dropWhile p    // the remainder of the list after any leading element satisfying p have been removed
xs span p         // same as (xs takeWhile p, xs dropWhile p)

List(x1, ..., xn) reduceLeft op    // (...(x1 op x2) op x3) op ...) op xn
List(x1, ..., xn).foldLeft(z)(op)  // (...( z op x1) op x2) op ...) op xn
List(x1, ..., xn) reduceRight op   // x1 op (... (x{n-1} op xn) ...)
List(x1, ..., xn).foldRight(z)(op) // x1 op (... (    xn op  z) ...)

xs exists p    // true if there is at least one element for which predicate p is true
xs forall p    // true if p(x) is true for all elements
xs zip ys      // returns a list of pairs which groups elements with same index together
xs unzip       // opposite of zip: returns a pair of two lists
xs.flatMap f   // applies the function to all elements and concatenates the result
xs.sum         // sum of elements of the numeric collection
xs.product     // product of elements of the numeric collection
xs.max         // maximum of collection
xs.min         // minimum of collection
xs.flatten     // flattens a collection of collection into a single-level collection
xs groupBy f   // returns a map which points to a list of elements
xs distinct    // sequence of distinct entries (removes duplicates)

x +: xs  // creates a new collection with leading element x
xs :+ x  // creates a new collection with trailing element x

// Operations on maps
val myMap = Map("I" -> 1, "V" -> 5, "X" -> 10)  // create a map
myMap("I")      // => 1  
myMap("A")      // => java.util.NoSuchElementException  
myMap get "A"   // => None 
myMap get "I"   // => Some(1)
myMap.updated("V", 15)  // returns a new map where "V" maps to 15 (entry is updated)
                        // if the key ("V" here) does not exist, a new entry is added

// Operations on Streams
val xs = Stream(1, 2, 3)
val xs = Stream.cons(1, Stream.cons(2, Stream.cons(3, Stream.empty))) // same as above
(1 to 1000).toStream // => Stream(1, ?)
x #:: xs // Same as Stream.cons(x, xs)
         // In the Stream's cons operator, the second parameter (the tail)
         // is defined as a "call by name" parameter.
         // Note that x::xs always produces a List


// pairs -------------------

val pair = ("answer", 42)   // type: (String, Int)
val (label, value) = pair   // label = "answer", value = 42  
pair._1 // "answer"  
pair._2 // 42  

// Ordering --------------

import math.Ordering  

def msort[T](xs: List[T])(implicit ord: Ordering) = { ...}  
msort(fruits)(Ordering.String)  
msort(fruits)   // the compiler figures out the right ordering  
