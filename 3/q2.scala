import scala.compiletime.ops.float
object q2 {
  def toFahr(temp:Float):Double={
    return temp*1.8000+32.00
  }

  def main(args: Array[String]):Unit= {
    print("Enter the tempreture (C): ")
    val input = scala.io.StdIn.readFloat()
    println(toFahr(input))
  }
}
