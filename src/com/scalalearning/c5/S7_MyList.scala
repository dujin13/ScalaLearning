package com.scalalearning.c5

object S7_MyList {
  def main(args: Array[String]) {
    // 协变
    var list1 = new MyList[Int]
    var list2 : MyList[Any] = null
    list2 = list1

    // 逆变
    var list3 : MyList2[Int] = null
    var list4 = new MyList2[Any]
    list3 = list4
  }

  class MyList[+T]
  class MyList2[-T]
}

