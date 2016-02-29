package com.scalalearning.c10

import scala.actors.Actor._
import scala.actors._

/**
  * Created by gaolp on 2016/2/28.
  */
object S6_MessageIgnore {
  def main(args: Array[String]) {
    val expectStringOrInteger = actor {
      for(i <- 1 to 4) {
        receiveWithin(1000) {
          case str : String => println("Youd said " + str)
          case num: Int => println("You gave " + num)
          case TIMEOUT => println("Timed out!")
        }
      }
    }

    expectStringOrInteger ! "only constant is change"
    expectStringOrInteger ! 1024
    expectStringOrInteger ! 22.22
    expectStringOrInteger ! (self, 1024)

    receiveWithin(3000) {case _ => }

  }
}
