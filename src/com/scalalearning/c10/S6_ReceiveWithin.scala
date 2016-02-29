package com.scalalearning.c10

import scala.actors._
import scala.actors.Actor._

/**
  * Created by gaolp on 2016/2/28.
  */
object S6_ReceiveWithin {
  def main(args: Array[String]) {
    val caller = self

    val accumulator = actor {
      var sum = 0
      var continue = true
      while (continue) {
        sum += receiveWithin(500) {
          case number : Int => number
          case TIMEOUT =>
            println("Timed out! Will return result now")
            continue = false
            0
        }
        println("sum is " + sum)
      }

      caller ! sum
    }

    accumulator ! 1
    accumulator ! 7
    accumulator ! 8
    println("ready to run")
    receiveWithin(10000) {case result => println("Total is " + result)}
  }
}
