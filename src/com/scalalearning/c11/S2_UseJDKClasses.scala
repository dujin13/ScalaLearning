package com.scalalearning.c11

import java.lang.reflect.Method
import java.util.Date

/**
  * Created by gaolp on 2016/3/1.
  */
object S2_UseJDKClasses {
  def main(args: Array[String]) {
    println("Today is " + new Date())

    val methods = getClass.getMethods
    methods.foreach {method: Method => println(method.getName)}
  }
}
