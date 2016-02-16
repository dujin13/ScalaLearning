package com.scalalearning.c5

object S6_Params {
  def main(args: Array[String]) {
    def max(values: Int*) = values.foldLeft(values(0)) { Math.max }
    println(max(2, 5, 3, 7, 1, 6))

    val numbers = Array(2, 5, 3, 7, 1, 6)
    println(max(numbers: _*))
  }

  class Methods {
    def method1() { 6 }
    def method2() = {6}
    def method3() = 6
    def method4 : Double = 6

    def printMethodInfo(methodName: String) = {
      println("The return type of " + methodName + " is " +
        getClass().getDeclaredMethod(methodName).getReturnType.getName)
    }

    printMethodInfo("method1")
    printMethodInfo("method2")
    printMethodInfo("method3")
    printMethodInfo("method4")
  }
}

