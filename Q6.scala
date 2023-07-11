import scala.io.StdIn.readLine

object Q6 extends App(){
  def fibo(x:Int):Int = x match{
    case 0 => 0
    case 1 => 1
    case _ => fibo(x-1) + fibo(x-2)
  }

  print("Enter a Number : ")
  val num = readLine().toInt
  print(fibo(num))
}
