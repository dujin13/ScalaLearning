package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S2_Wildcard {

  def main(args: Array[String]) {
    object DayOfWeek extends Enumeration {
      val SUNDAY = Value("Sunday")
      val MONDAY = Value("Monday")
      val TUESDAY = Value("Tuesday")
      val WEDNESDAY = Value("Wednesday")
      val THURSDAY = Value("Thursday")
      val FRIDAY = Value("Friday")
      val SATURDAY = Value("Saturday")
    }

    def activity(day: DayOfWeek.Value): Unit = {
      day match {
        case DayOfWeek.SUNDAY => print("Eat, sleep, repeat...")
        case DayOfWeek.SATURDAY => print("Hangout with friends...")
        case _ => print("...code for fun...")
      }
    }

    activity(DayOfWeek.SATURDAY)
    activity(DayOfWeek.WEDNESDAY)
  }
}
