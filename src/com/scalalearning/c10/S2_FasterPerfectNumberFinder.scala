package com.scalalearning.c10

import scala.actors.Actor._
/**
  * Created by gaolp on 2016/2/27.
  */
object S2_FasterPerfectNumberFinder {
  def main(args: Array[String]) {
    def sumOfFactorsInRange(lower:Int, upper:Int, number:Int) = {
      (0 /: (lower to upper)) {(sum, i) => if(number % i == 0) sum + i else sum}
    }

    def isPerfectConcurrent(candidate:Int) = {
      val RANGE = 1000000
      val numberIdPartitions = (candidate.toDouble / RANGE).ceil.toInt
      val caller = self

      for(i <- 0 until numberIdPartitions) {
        val lower = i * RANGE + 1
        val upper = candidate.min (i + 1) * RANGE

//        println("lower:" + lower + ", upper:" + upper)

        actor {
          caller ! sumOfFactorsInRange(lower, upper, candidate)
        }
      }

      val sum = (0 /: (0 until numberIdPartitions)) {
        (partialSum, i) => receive {
          case sumInRange : Int => partialSum + sumInRange
        }
      }

      2 * candidate == sum
    }

    println("6 is perfect? " + isPerfectConcurrent(6))
    println("33550336 is perfect? " + isPerfectConcurrent(33550336))
    println("33550337 is perfect? " + isPerfectConcurrent(33550337))
  }
}
