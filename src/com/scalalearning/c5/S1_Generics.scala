package com.scalalearning.c5

import java.util
import java.util._

object S1_Generics {
  def main(args: Array[String]) {
    var list1 : List[Int] = new ArrayList[Int]
    val list2 = new ArrayList[Int]

    list2 add 1
    list2 add 2

    var total = 0
    (0 until list2.size()).foreach(i => total += list2.get(i))

    println("Total is " + total)
  }
}
