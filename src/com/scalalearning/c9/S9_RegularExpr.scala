package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S9_RegularExpr {

  def main(args: Array[String]) {
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    println(pattern findFirstIn str)
    println((pattern findAllIn str).mkString(", "))
    println("cool".r replaceFirstIn(str, "awesome"))
  }
}
