package com.scalalearning.c10

import scala.actors.Actor._

/**
  * Created by gaolp on 2016/2/28.
  */
object S3_MessagePassing {
  def main(args: Array[String]) {
    var startTime:Long = 0
    val caller = self

    val engrossedActor = actor {
      println("Number of messages received so far? " + mailboxSize)
      caller ! "send"
      Thread.sleep(10000)
      println("Number of messages received while I was busy? " + mailboxSize)
      receive {
        case msg =>
          val receivedTime = System.currentTimeMillis() - startTime
          println("Received message " + msg + " after " + receivedTime + " ms")
      }
      caller ! "received"
    }

    receive {case msg => println("caller msg:" + msg)}

    println("Sending Message")
    startTime = System.currentTimeMillis()
    engrossedActor ! "hello buddy"
    val endTime = System.currentTimeMillis() - startTime

    printf("Took less than %dms to send message\n", endTime)

    receive {
      case msg => println("caller msg:" + msg)
    }
  }
}
