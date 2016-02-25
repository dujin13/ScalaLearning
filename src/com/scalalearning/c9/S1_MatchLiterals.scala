package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S1_MatchLiterals {

  def main(args: Array[String]) {
    def activity(day: String): Unit = {
      day match {
        case "Sunday" => print("Eat, sleep, repeat...")
        case "Saturday" => print("Hangout with friends...")
        case "Monday" => print("...code for fun...")
        case "Friday" => print("...read a good book...")
      }
    }

    List("Monday", "Sunday", "Saturday").foreach {activity}
  }
}
