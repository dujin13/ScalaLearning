package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S8_Extractor {

  def process(input : String) = {
    input match {
      case Symbol() => println("Look up price for valid symbol " + input)
//      case ReceiveStockPrice(symbol, price) =>
      case ReceiveStockPrice(symbol @ Symbol(), price) =>
        printf("Received price %f for symbol %s\n", price, symbol)
      case _ => println("Invalid input " + input)
    }
  }

  object Symbol {
    def unapply(symbol:String):Boolean = symbol == "GOOG" || symbol == "IBM"
  }

  object ReceiveStockPrice {
    def unapply(input:String):Option[(String, Double)] = {
      try {
        if(input contains ":") {
          val splitQuote = input.split(":")
          Some(splitQuote(0), splitQuote(1).toDouble)
        } else {
          None
        }
      }catch {
        case _ : NumberFormatException => None
      }
    }
  }

  def main(args: Array[String]) {
    process("GOOG")
    process("GOOG:310.84")
    process("GOOG:BUY")
    process("ERR:12.21")
  }
}
