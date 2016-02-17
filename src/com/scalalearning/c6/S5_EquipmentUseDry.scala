package com.scalalearning.c6

object S5_EquipmentUseDry {
  def main(args: Array[String]) {

    val calculator = {input: Int => println("calc with " + input); input}
    val equipment1 = new Equipment(calculator)
    val equipment2 = new Equipment(calculator)

    equipment1.simulate(4)
    equipment2.simulate(6)
  }

  class Equipment(val routine : Int => Int) {
    def simulate(input: Int) = {
      print("Running simulation...")
      routine(input)
    }
  }
}
