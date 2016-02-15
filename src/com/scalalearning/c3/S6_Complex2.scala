package com.scalalearning.c3

object S6_Complex2 {
  def main(args: Array[String]) {
    val c1 = new Complex2(1, 4)
    val c2 = new Complex2(2, -3)
    val c3 = new Complex2(2, 2)
    val value = c1 + c2 * c3
    println("(" + c1 + ") + (" + c2 + ") * (" + c3 + ") = " + value)
  }
}

class Complex2(val real: Int, val imaginary: Int) {
  def +(operand: Complex): Complex = {
    println("Calling +")
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  def *(operand: Complex2): Complex = {
    println("Calling *")
    new Complex(real * operand.real - imaginary * operand.imaginary,
      real * operand.imaginary + imaginary * operand.real)
  }

  override def toString(): String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}