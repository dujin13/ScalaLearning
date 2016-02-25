package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S3_MatchList {

  def main(args: Array[String]) {
    def processItems(items:List[String]): Unit = {
      items match {
        case List("apple", "ibm") => println("Apple and IBMs")
        case List("red", "blue", "white") => println("Stars and Stripes")
        case List("red", "blue", _*) => println("colors red, blue, ...")
        case List("apple", "orange", otherFruits @ _*) =>
          println("apples, oranges, and " + otherFruits)
      }
    }

    processItems(List("apple", "ibm"))
    processItems(List("red", "blue", "green"))
    processItems(List("red", "blue", "white"))
    processItems(List("apple", "orange", "grapes", "dates"))
  }
}
