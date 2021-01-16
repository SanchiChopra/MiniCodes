import lists.k

import scala.io.StdIn.readInt

object lists extends App{
 var obj = new listoperations()
  obj.display()
  val lastele = obj.findlast()
  println("The last element in the marks list is: " + lastele)
  val lastbutone = obj.findseclast()
  println("The second last element in the marks list is: " + lastbutone)
  val k = readInt
  val kthmarks = obj.findkthele()
  println("The marks of the kth student are: " + kthmarks)
}
class listoperations {
  val marks: List[Int] = List(10,20,25,45,30)

  def display(): Unit = {
    println {
      marks
    }
  }
    def findlast(): Int = marks.last
    def findseclast(): Int = if(marks.isEmpty)
      throw new NoSuchElementException
    else
      marks.init.last
    def findkthele():Int = if(marks.size <= k)
      throw new ArrayIndexOutOfBoundsException
    else marks(k)
}
