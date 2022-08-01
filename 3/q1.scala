
import scala.math.Pi

object q1 {
  def areaOfDisk(radius:Float):Unit={
    println(s"Area of disk with radius $radius : ${Pi*radius*radius}");
  }

  def main(args: Array[String]):Unit= {
    print("Enter the radius of the Disk: ")
    val input = scala.io.StdIn.readFloat()
    areaOfDisk(input)
  }

}
