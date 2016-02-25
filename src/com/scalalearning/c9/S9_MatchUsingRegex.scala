package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S9_MatchUsingRegex {

  def main(args: Array[String]) {
    def process(input:String): Unit = {
      val GoogStock = """^GOOG:(\d*\.\d+)""".r
      input match {
        case GoogStock(price) => println("Price of GOOG is " + price)
        case _ => println("not processing " + input)
      }
    }

    process("GOOG:310.84")
    process("GOOG:310")
    process("IBM:84.01")

    def process2(input:String): Unit = {
      val MatchStock = """^(.+):(\d*\.\d+)""".r
      input match {
        case MatchStock("GOOG", price) => println("Price of GOOG is " + price)
        case MatchStock("IBM", price) => println("IBM's trading at " + price)
        case MatchStock(symbol, price) => printf("Price of %s is %s\n",symbol, price)
        case _ => println("not processing " + input)
      }
    }

    process2("GOOG:310.84")
    process2("IBM:84.01")
    process2("GE:15.86")
  }
}
