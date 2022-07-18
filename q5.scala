object q5 {
  def easyPace(x:Int):Int={
    return x*8
  }

  def tempo(y:Int):Int={
    return 7*y
  }

  def main(args: Array[String]):Unit= {
    val ep1 = 2
    val ep2 = 2
    val tem = 3

    println(s"Total running time: ${easyPace(ep1)+tempo(tem)+easyPace(ep2)} min")
  }
}
