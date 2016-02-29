package com.scalalearning.c13

/**
  * Created by gaolp on 2016/2/26.
  */
object S2_CatchOrder {
  def main(args: Array[String]) {
    try {
      val str = "hello"
      println(str(31))
    }
    catch {
      case ex : Exception => println("Exception caught")
      case ex : StringIndexOutOfBoundsException => println("Invalid Index")
    }
  }
}
