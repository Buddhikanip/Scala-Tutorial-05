import scala.io.StdIn.readLine

object Q2 extends App(){
  def gcd(a: Int, b: Int): Int  = a match {
    case a if (a == 0) => b
    case _ => gcd(b % a, a)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (p == x) => true
    case x if gcd(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def printPrime(x:Int,y:Int=2):Any={
    if(prime(y)) print(y+" ")
    if (y < x) printPrime(x, y + 1)
  }
  print("Enter a Number : ")
  val num = readLine().toInt
  print("Prime sequence : ")
  printPrime(num)
}
