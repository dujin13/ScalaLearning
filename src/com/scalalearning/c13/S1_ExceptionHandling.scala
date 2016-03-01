package com.scalalearning.c13

/**
  * Created by gaolp on 2016/2/26.
  */
object S1_ExceptionHandling {
  def main(args: Array[String]) {
    def taxFor(amount:Double) : String = {
      if(amount < 0)
        throw new IllegalArgumentException("Amount must be greater than zero")
      if(amount < 0.1) throw new RuntimeException("Amount too small to be taxed")
      if(amount > 1000000) throw new Exception("Amount too large...")
      "Tax for $" + amount + " is $" + amount * 0.08
    }

    List(100.0, 0.09, -2.0, 1000001.0).foreach(amount =>
      try {
        println(taxFor(amount))
      } catch {
        case ex: IllegalArgumentException => println(ex.getMessage)
        //        case ex:RuntimeException => {
        //          println("Don't bother reporting..." + ex.getMessage)
        //      }
        case _=> println("Somthing went wrong")
      }
    )
  }

}
