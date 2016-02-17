package com.scalalearning.c6

object S9_Closure {
  def main(args: Array[String]) {
    def loopThrough(number: Int)(closure: Int => Unit) = {
      for(i <- 1 to number) {closure(i)}
    }

    var result = 0
    val addIt = {value: Int => result += value}
    loopThrough(10){addIt}
    println("Total of values from 1 to 10 is " + result)

    result = 0
    loopThrough(5){addIt}
    println("Total of values from 1 to 5 is " + result)

    result = 0
    loopThrough(5){result += _}
    println("Total of values from 1 to 5 is " + result)

    var product = 1
    loopThrough(5){product *= _}
    println("Product of values from 1 to 5 is " + product)
  }
}
