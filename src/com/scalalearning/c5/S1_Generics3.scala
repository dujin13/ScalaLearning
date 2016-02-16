package com.scalalearning.c5

import java.util._

object S1_Generics3 {
  def main(args: Array[String]) {
    var list1 = new ArrayList[Int]
    val list2 = new ArrayList[Any]

    var ref1 : Int = 1
    var ref2 : Any = null

    ref2 = ref1

//    list2 = list1 // 编译出错

  }
}
