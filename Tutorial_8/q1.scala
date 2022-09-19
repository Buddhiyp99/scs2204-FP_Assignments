case class point(x:Int,y:Int){
    var a=x;
    var b=y;
    def +(p:point)=point(a+p.a,b+p.b);
    def move(dx:Int,dy:Int)=point(a+dx,b+dy);
    def distance(d:point):Double= Math.sqrt(Math.pow((a-d.a),2)+Math.pow((b-d.b),2));
    def invert()=point(b,a);

}

object q1 extends App
{
    var p1=point(1,2);
    println(p1);

    var p2=point(3,4);
    println(p2);

    var p3=p1+p2;
    println(p3);

    println(p3.move(4,-7));
    println(p1.distance(p2));

    println(p1.invert());
     
}