object q4 {
  def discount(price:Double):Double={
    return price*.4
  }

  def bookPrice(copies:Int):Double={
    return 24.95*copies
  }

  def shippingCost(x:Int):Double= x>50 match{
    case true => return 3*x+(x-50)*.75
    case false => return 3*x
  }

  def main(args: Array[String]):Unit= {
    val copies = 60
    
    val cost = bookPrice(copies)-discount(bookPrice(copies))+shippingCost(copies)

    println(s"Total wholesale cost: ${BigDecimal(cost).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble} ")



  }
}
