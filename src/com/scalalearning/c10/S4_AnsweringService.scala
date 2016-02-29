package com.scalalearning.c10

import scala.actors.{Actor, !}
import scala.actors.Actor._

/**
  * Created by gaolp on 2016/2/28.
  */
object S4_AnsweringService {
  def main(args: Array[String]) {
    class AnsweringService(val folks: String*) extends Actor {
      def act(): Unit = {
        while(true) {
          receive {
            case (caller:Actor, name:String, msg:String) =>
              caller ! (
                if(folks.contains(name))
                  String.format("Hey it's %s got message %s", name, msg)
                else
                  String.format("Hey there's no one with the name %s here", name)
                )
            case "ping" => println("ping!")
            case "quit" => println("exiting actor")
              exit
          }
        }
      }
    }

    val answeringService1 = new AnsweringService("Sara", "Kara", "John")

    answeringService1 ! (self, "Sara", "In town")
    answeringService1 ! (self, "Kara", "Go shopping?")
    // 上面两个语句只是将消息发送出去，但answeringService1还未启动进行应答。
    Thread.sleep(2000)
    answeringService1.start()

    answeringService1 ! (self, "John", "Bug fixed?")
    answeringService1 ! (self, "Bill", "What's up")

    for(i <- 1 to 4) {receive {case msg => println(msg)}}

    answeringService1 ! "ping"
    answeringService1 ! "quit"
    answeringService1 ! "ping"

    Thread.sleep(2000)
    println("The last ping was not processed")
  }
}
