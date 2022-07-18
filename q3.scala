import scala.math.Pi
import scala.math.BigDecimal

object q3 {
  def volOfSphere(radius:Float):Unit={
    println(s"Volume of sphere with radius $radius : ${BigDecimal(Pi*radius*radius).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble}")
  }

  def main(args: Array[String]):Unit= {
    print("Enter the radius of the Sphere: ")
    val input = scala.io.StdIn.readFloat()
    volOfSphere(input)
  }
}
