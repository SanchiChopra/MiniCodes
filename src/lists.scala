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
  val stucount = obj.marks.length
  println("The number of students are: " + stucount)
  val reverselist = obj.findreverse()
  println("The marks list in reverse order is: " + reverselist)
  val ispalindrome = obj.check_palindrome()
  if(ispalindrome == true)
    println("The marks list is a palindrome!")
  else
    println("The marks list is not a palindrome!")
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
  def findreverse(): List[Int] = marks.reverse
  def check_palindrome(): Boolean = if(lists.reverselist == marks)
    return true
    else return false
}
