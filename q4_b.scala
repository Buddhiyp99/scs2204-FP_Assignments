object q4_b {

    def attendees(tPrice:Int):Int={
        120+(15-tPrice)/5*20
    }

    def revenue(tPrice:Int):Int={
        attendees(tPrice)*tPrice
    }

    def cost(tPrice:Int):Int={
        500+attendees(tPrice)
    }

    def profit(tPrice:Int):Int={
        revenue(tPrice)-cost(tPrice)
    }

    def main(args: Array[String]): Unit = {
        var tPriceList = Array(5, 10, 15, 20)

        for(x <- tPriceList) {
            println(profit(x))
        }
    }
}
