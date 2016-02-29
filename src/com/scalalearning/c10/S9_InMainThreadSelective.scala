package com.scalalearning.c10

import scala.actors.Actor._
import scala.actors._
import scala.actors.scheduler.SingleThreadedScheduler

/**
  * Created by gaolp on 2016/2/28.
  */
object S9_InMainThreadSelective {
  def main(args: Array[String]) {
    trait SingleThreadActor extends Actor {
      override def scheduler() = new SingleThreadedScheduler
    }

    class MyActor1 extends Actor {
      def act() = println("Actor1 running in " + Thread.currentThread())
    }

    class MyActor2 extends SingleThreadActor {
      def act() = println("Actor2 running in " + Thread.currentThread())
    }

    println("Main running in " + Thread.currentThread())
    new MyActor1().start()
    new MyActor2().start()
    actor { println("Actor 3 running in " + Thread.currentThread())}

    receiveWithin(5000) { case _ => }
  }
}
