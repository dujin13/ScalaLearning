package com.scalalearning.c5

object S5_Methods {
  def main(args: Array[String]) {
    new Methods
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

