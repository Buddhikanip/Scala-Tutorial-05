import scala.io.StdIn.readLine

object Q4 extends App(){
  def even(x: Int): Boolean = x match {
    case 0 => true
    case _ => odd(x - 1)
  }
  def odd(x:Int):Boolean= !even(x)

  print("Enter a Number : ")
  val num = readLine().toInt
  print(even(num))
}
