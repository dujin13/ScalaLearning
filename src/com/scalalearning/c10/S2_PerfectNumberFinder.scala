package com.scalalearning.c10

/**
  * Created by gaolp on 2016/2/27.
  */
object S2_PerfectNumberFinder {
  def main(args: Array[String]) {
    def sumOfFactors(number:Int) = {
      (0 /: (1 to number)) {(sum, i) => if(number % i == 0) sum + i else sum}
    }

    def isPerfect(candidate:Int) = 2 * candidate == sumOfFactors(candidate)

    println("6 is perfect? " + isPerfect(6))
    println("33550336 is perfect? " + isPerfect(33550336))
    println("33550337 is perfect? " + isPerfect(33550337))
  }
}
