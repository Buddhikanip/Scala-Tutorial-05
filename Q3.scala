import scala.io.StdIn.readLine

object Q3 extends App(){
  def add(x:Int):Int={
    if(x>1) x + add(x-1) else 1
  }

  print("Enter a Number : ")
  val num = readLine().toInt
  print("Addtion : "+add(num))
}
