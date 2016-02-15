package com.scalalearning.c3

import java.util

object S7_5_Access {
  def main(args: Array[String]) {
    val microware = new Microware
    microware.start()
//    microware.turnTable();
  }

  class Microware {
    def start() = println("started")
    def stop() = println("stopped")
    private def turnTable() = println("turning table")
  }
}
