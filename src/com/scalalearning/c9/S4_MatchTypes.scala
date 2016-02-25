package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S4_MatchTypes {

  def main(args: Array[String]) {
    def process(input: Any): Unit = {
      input match {
        case (a: Int, b: Int) => printf("Processing (int, int)... ")
        case (a: Double, b: Double) => println("Processing (double, double)...")
        case msg : Int if(msg > 1000000) => println("Processing int > 1000000")
        case msg : Int => println("Processing int...")
        case msg : String =>  println("Processing string...")
        case _ => println("Can't handle %s... ", input)
      }
    }

    process(34.2, -159.3)
    process(0)
    process(1000001)
    process(2.2)
  }
}
