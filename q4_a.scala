import scala.compiletime.ops.float
object q4_a {
    def wage(hours:Int):Int = hours*250
    def ot(hours:Int):Int = hours*85
    def income(h1:Int, h2:Int):Int=wage(h1)+ot(h2)
    def tax(inc:Int):Double=inc*.12
    def takeHomeSal(h1:Int, h2:Int):Double=income(h1,h2)-tax(income(h1,h2))
    def main(args: Array[String]): Unit = {
       val normal_hours = 40; 
       val ot_hours = 30;

       println(takeHomeSal(normal_hours,ot_hours))

    }
}
