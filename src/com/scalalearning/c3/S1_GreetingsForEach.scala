package com.scalalearning.c3

object S1_GreetingsForEach {
  def main(args: Array[String]) {
    (1 to 3).foreach(i =>  print(i + ", "))

    println("Scala Rock!!!")
  }
}
