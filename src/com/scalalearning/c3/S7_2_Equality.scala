package com.scalalearning.c3

object S7_2_Equality {
  def main(args: Array[String]) {
    val str1 = "hello"
    val str2 = "hello"
    val str3 = new String("hello")

    println(str1 == str2)
    println(str1 eq str2)
    println(str1== str3)
    println(str1 eq str3)
  }
}
