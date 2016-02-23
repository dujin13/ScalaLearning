package com.scalalearning.c8

object S5_PowerOfFor {
  def main(args: Array[String]) {
    for(i <- 1 to 3) {
      print("ho ")
    }

    val result = for(i <- 1 to 10)
      yield i * 2
    println("result: " + result.mkString(", "))

    val result2 = (1 to 10).map(_ * 2)
    println("result2: " + result2.mkString(", "))

    val result3 = for(i <- 1 to 10; if i % 2 == 0)
      yield i * 2
    println("result3: " + result3.mkString(", "))
  }
}
