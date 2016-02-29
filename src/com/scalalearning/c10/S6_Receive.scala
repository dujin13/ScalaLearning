package com.scalalearning.c10

import scala.actors.{Actor, !}
import scala.actors.Actor._

/**
  * Created by gaolp on 2016/2/28.
  */
object S6_Receive {
  def main(args: Array[String]) {
    val caller = self

    val accumulator = actor {
      var sum = 0
      var continue = true
      while (continue) {
        sum += receive {
          case number : Int => number
          case "quit" => continue = false
            0
        }
      }

      caller ! sum
    }

    accumulator ! 1
    accumulator ! 7
    accumulator ! 8
    accumulator ! "quit"

    receive {case result => println("Total is " + result)}
  }
}
