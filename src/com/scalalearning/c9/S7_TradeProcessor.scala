package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S7_TradeProcessor {

  sealed abstract class Trade()
  case class Sell(stockSymbol:String, Quantity:Int) extends Trade
  case class Buy(stockSymbol:String, Quantity:Int) extends Trade
  case class Hedge(stockSymbol:String, Quantity:Int) extends Trade

    def processTransaction(request:Trade): Unit = {
      request match {
        case Sell(stock, 1000) => println("Selling 1000-units of " + stock)
        case Sell(stock, quantity) => printf("Selling %d units of %s\n", quantity, stock)
        case Buy(stock, quantity) if(quantity > 2000) => printf("Buying %d (large) units of %s\n", quantity, stock)
        case Buy(stock, quantity) => printf("Buying %d units of %s\n", quantity, stock)
      }
  }

  def main(args: Array[String]) {
    processTransaction(Sell("GOOG", 500))
    processTransaction(Buy("GOOG", 700))
    processTransaction(Sell("GOOG", 1000))
    processTransaction(Buy("GOOG", 3000))
  }
}
