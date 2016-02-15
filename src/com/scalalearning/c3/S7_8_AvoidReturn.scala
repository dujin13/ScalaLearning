package com.scalalearning.c3

object S7_8_AvoidReturn {
  def main(args: Array[String]): Unit = {
    def check1() = true
    def check2():Boolean = return true

    println(check1)
    println(check2)
  }

}
