import scala.compiletime.ops.float

object q3:

    def main(args: Array[String]): Unit = {
        var (a,b,c,d) = (2,3,4,5);
        var k:Float = 4.3f;
        val g:Float = 4.0f;

        b=b-1
        println(b*a+c*d) // b decrement first, d decrement afterwards
        d=d-1 
        println(a) // a will increment afterwards
        a=a+1
        println(-2*(g-k)+c)
        println(c) // c will not increase
        println((c+1)*a)
    }
