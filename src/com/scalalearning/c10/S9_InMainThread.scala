package com.scalalearning.c10

import scala.actors.Actor._
import scala.actors._
import scala.actors.scheduler.SingleThreadedScheduler

/**
  * Created by gaolp on 2016/2/28.
  */
object S9_InMainThread {
  def main(args: Array[String]) {
    if(args.length > 0 && args(0) == "Single") {
      println("Command-line argument Single found")
      Scheduler.impl = new SingleThreadedScheduler
    }

    println("Main running in " + Thread.currentThread())

    actor { println("Actor 1 running in " + Thread.currentThread())}

    actor { println("Actor 2 running in " + Thread.currentThread())}

    receiveWithin(3000) {case _=>}
  }
}
