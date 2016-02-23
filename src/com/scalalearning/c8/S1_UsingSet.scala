package com.scalalearning.c8

object S1_UsingSet {
  def main(args: Array[String]) {
    val colors1 = Set("Blue", "Green", "Red")
    var colors = colors1
    println("colors1(colors): " + colors)

    colors += "Black"
    println("colors: " + colors)
    println("colors1: " + colors1)
  }
}
