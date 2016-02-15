package com.scalalearning.c3

import java.util

object S3_MultipleAssignment {
  def main(args: Array[String]) {
    def getPersionIngo(primaryKey : Int) = {
      ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
    }

    val (firstName, lastName, emailAddess) = getPersionIngo(1)

    println("First Name is " + firstName)
    println("Last Name is " + lastName)
    println("Email Address is " + emailAddess)

    val info = getPersionIngo(1)

    println("First Name is " + info._1)
    println("Last Name is " + info._2)
    println("Email Address is " + info._3)
  }
}
