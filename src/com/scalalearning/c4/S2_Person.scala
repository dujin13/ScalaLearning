package com.scalalearning.c4

import scala.beans.BeanProperty

object S2_Person {
  def main(args: Array[String]) {
    val john = new Person("John", "Smith", "Analyst")
    println(john)
    val bill = new Person("Bill", "Walker")
    println(bill)
    println(bill.toString() + ", age " + bill.getAge)
  }

  class Person(val firstName:String, val lastName:String) {
    private var position: String = _
    @BeanProperty // BeanProperty不能用于private，只是提供一个getter或setter的风格，而非必须使用该风格来获取age数据值
    var age: Int = _

    println("Creating " + toString)

    def this(firstName: String, lastName:String, positionHold: String) {
      this(firstName, lastName)
      position = positionHold
    }

    override def toString(): String = {
      firstName + " " + lastName + " holds " + position + " position"
    }
  }
}
