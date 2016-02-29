package com.scalalearning.c10

import scala.actors.!
import scala.actors.Actor._

/**
  * Created by gaolp on 2016/2/28.
  */
object S3_AskFortune {
  def main(args: Array[String]) {
    val fortuneTeller = actor {
      for(i <- 1 to 4) {
        Thread.sleep(1000)
        receive{
//          case _ => sender ! "your day will rock! " + i
          case msg => sender ! "your day will rock! " + i + ":" + msg
        }
      }
    }

    println( fortuneTeller !? (2000, "what's ahead"))
    println( fortuneTeller !? (500, "what's ahead"))

    val aPrinter = actor( {
      receive {case msg => println("Ah, fortune message for you-" + msg)}
    })

    fortuneTeller.send("What's up", aPrinter)

    fortuneTeller ! "How's my future?"

    Thread.sleep(3000)
    receive {case msg : String => println("Received " + msg)}

    println("Let's get that lost message")
    receive {case !(channel, msg) => println("Received belated message " + msg)}
}
}
