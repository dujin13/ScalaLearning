package com.scalalearning.c6

import java.io.{File, PrintWriter}
import java.util.Date

object S8_Log {
  def main(args: Array[String]) {
    def log(date:Date, message: String) = {
      println(date + "----" + message)
    }

    val date = new Date()
    log(date, "message1")
    log(date, "message2")
    log(date, "message3")

    val logWithDateBound = log(new Date, _: String)
    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")
  }
}
