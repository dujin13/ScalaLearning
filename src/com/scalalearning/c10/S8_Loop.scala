package com.scalalearning.c10

import scala.actors.Actor._
import scala.actors._

/**
  * Created by gaolp on 2016/2/28.
  */
object S8_Loop {
  def main(args: Array[String]) {
    val caller = self

    val accumulator = actor {
      var continue = true
      var sum = 0

      loopWhile(continue) {
        reactWithin(500) {
          case number: Int => sum += number
          case TIMEOUT =>
            continue = false
            caller ! sum
        }
      }
    }

    accumulator ! 1
    accumulator ! 7
    accumulator ! 8
    println("ready to run")
    receiveWithin(10000) { case result => println("Total is " + result) }
  }
}
