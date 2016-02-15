package com.scalalearning.c3

object S6_Complex {
  def main(args: Array[String]) {
    val c1 = new Complex(1, 2)
    val c2 = new Complex(2, -3)
    val sum = c1 + c2
    println("(" + c1 + ") + (" + c2 + ") = " + sum)
  }
}

class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex): Complex = {
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  override def toString(): String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}