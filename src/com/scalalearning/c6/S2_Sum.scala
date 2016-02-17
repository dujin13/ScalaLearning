package com.scalalearning.c6

import java.util._

object S2_Sum {
  def main(args: Array[String]) {
    def totalResultOverRange(number:Int, codeBlock:Int => Int) : Int = {
      var result = 0
      (0 to number).foreach(i=> result += codeBlock(i))
      result
    }

    println(totalResultOverRange(11, i => i))
    println(totalResultOverRange(11, i => if(i % 2 == 0) i else 0))
    println(totalResultOverRange(11, i => if(i % 2 != 0) i else 0))
  }
}
