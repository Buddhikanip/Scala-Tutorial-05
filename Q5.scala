import scala.io.StdIn.readLine

object Q5 extends App(){
  def even(x: Int): Boolean = x match {
    case 0 => true
    case _ => odd(x - 1)
  }
  def odd(x: Int): Boolean = !even(x)

  def add(x: Int): Int = {
    if (x > 1) {
      if(even(x)) x + add(x - 1) else add(x-1)
    }else 0
  }

  print("Enter a Number : ")
  val num = readLine().toInt
  print(add(num))
}
