package com.scalalearning.c6

object S6_Underscore {
  def main(args: Array[String]) {
    val array = Array(2, 3, 5, 1, 6, 4)
    println("Sum of all values in array is " + (0 /: array){ _ + _ })

    val negativeNumberExists = array.exists {_ < 0}
    println("Array has negative number?" + negativeNumberExists)

    println("Max of all values in array is " + (Integer.MIN_VALUE /: array){
      Math.max(_,_)})
    println("Max of all values in array is " + (Integer.MIN_VALUE /: array){
      Math.max _})
    println("Max of all values in array is " + (Integer.MIN_VALUE /: array){
      Math.max})
  }
}
