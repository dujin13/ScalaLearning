package com.scalalearning.c8

object S5_MultipleLoop {
  def main(args: Array[String]) {
    for(i <- 1 to 3; j <- 4 to 6) {
      print("[" + i + ", " + j + "] ")
    }
  }
}
