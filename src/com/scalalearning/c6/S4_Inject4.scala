package com.scalalearning.c6

object S4_Inject4 {
  def main(args: Array[String]) {
    def inject(arr:Array[Int], initial:Int)(opration: (Int, Int) => Int) : Int = {
      var carryOut = initial
      arr.foreach(element => carryOut = opration(carryOut, element))
      carryOut
    }

    val array = Array(2, 3, 5, 1, 6, 4)
    val sum = inject(array, 0){(carryOut, elem) => carryOut + elem}
    println("Sum of elements in array [" + array.mkString(", ") + "] is " + sum)

    val max = inject(array, Integer.MIN_VALUE){(large, elem) => Math.max(large, elem)}
    println("Max of elements in array [" + array.mkString(", ") + "] is " + max)
  }
}
