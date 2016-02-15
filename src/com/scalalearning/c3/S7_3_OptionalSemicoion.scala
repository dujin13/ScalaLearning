package com.scalalearning.c3

import java.util

object S7_3_OptionalSemicoion {
  def main(args: Array[String]) {
    val list1 = new util.ArrayList[Int];
    {
      println("Created list1")
    }

    val list2 = new util.ArrayList[Int]
    {
      println("Created list2")
    }

    println(list1.getClass)
    println(list2.getClass)
  }
}
