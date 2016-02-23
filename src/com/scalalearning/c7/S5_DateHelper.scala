package com.scalalearning.c7

import com.scalalearning.c7.S5_DateHelper.DateHelper
import DateHelper._
import java.util.{Date, Calendar}

object S5_DateHelper {
  class DateHelper(number:Int) {
    def days(when:String) : Date = {
      val date = Calendar.getInstance()
      when match {
        case DateHelper.ago => date.add(Calendar.DAY_OF_MONTH, -number)
        case DateHelper.from_now => date.add(Calendar.DAY_OF_MONTH, number)
        case _ => date
      }
      date.getTime
    }
  }

  object DateHelper {
    val ago = "ago"
    val from_now = "from_now"

    implicit def convertInt2DateHelper(number: Int) = new DateHelper(number)
  }

  def main(args: Array[String]) {
    val past = 2 days ago
    val appointment = 5 days from_now

    println(past)
    println(appointment)
  }
}




