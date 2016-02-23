package com.scalalearning.c8

object S4_Sample {
  def main(args: Array[String]) {
    class Sample {
      def unary_+ = println("Called unary +")
      def unary_- = println("Called unary -")
      def unary_! = println("Called unary !")
      def unary_~ = println("Called unary ~")
    }

    val sample = new Sample
    +sample
    -sample
    !sample
    ~sample
  }
}
