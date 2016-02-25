package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S8_StockService {

  def process(input : String) = {
    input match {
      case Symbol() => println("Look up price for valid symbol " + input)
      case _ => println("Invalid input " + input)
    }
  }

  object Symbol {
    def unapply(symbol:String):Boolean = symbol == "GOOG" || symbol == "IBM"
  }

  def main(args: Array[String]) {
    process("GOOG")
    process("IBM")
    process("ERR")
  }
}
