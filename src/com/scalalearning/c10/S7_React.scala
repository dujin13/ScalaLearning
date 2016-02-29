package com.scalalearning.c10

import scala.actors.Actor._
import scala.actors._

/**
  * Created by gaolp on 2016/2/28.
  */
object S7_React {
  def main(args: Array[String]) {
    def info(msg: String) = println(msg + " received by " + Thread.currentThread())

    def receivedMessage(id: Int): Unit = {
      for (i <- 1 to 2) {
        receiveWithin(20000) {
          case msg: String => info("receive: " + id + msg)
          case TIMEOUT => info("receive: " + id)
        }
      }
    }

    def reactMessage(id : Int): Unit = {
      react {
        case msg : String => info("react: " + id + msg)
          reactMessage(id)
      }
    }

    val actors = Array (
      actor {info("react: 1 actor created"); reactMessage(1)},
      actor {info("react: 2 actor created"); reactMessage(2)},
      actor {info("react: 3 actor created"); receivedMessage(3)},
      actor {info("react: 4 actor created"); receivedMessage(4)}
    )

    Thread.sleep(1000)
    for(i <- 0 to 3) {actors(i) ! " hello"; Thread.sleep(2000)}
    Thread.sleep(2000)
    for(i <- 0 to 3) {actors(i) ! " hello"; Thread.sleep(2000)}
  }
}
