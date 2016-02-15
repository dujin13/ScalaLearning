package com.scalalearning.c3

import java.util

object S2_ScalaInt {
  def main(args: Array[String]) {
    val capacity : Int = 10
    val list = new util.ArrayList[String]
    list.ensureCapacity(capacity)
  }
}
