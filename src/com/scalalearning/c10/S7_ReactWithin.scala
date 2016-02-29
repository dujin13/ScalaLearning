package com.scalalearning.c10

import scala.actors._
import scala.actors.Actor._

/**
  * Created by gaolp on 2016/2/28.
  */
object S7_ReactWithin {
  def main(args: Array[String]) {
    val caller = self

    def accumulate(sum:Int) {
      reactWithin(500) {
        case number: Int => accumulate(sum + number)
        case TIMEOUT =>
          println("Timed out! Will return result now")
          caller ! sum
      }
      println("This will not be called...")
    }

    val accumulator = actor { accumulate(0) }
    accumulator ! 1
    accumulator ! 7
    accumulator ! 8
    println("ready to run")
    receiveWithin(10000) { case result => println("Total is " + result) }
  }
}
