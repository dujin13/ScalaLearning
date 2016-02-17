package com.scalalearning.c6

object S5_EquipmentUseNotDry {
  def main(args: Array[String]) {
    val equipment1 = new Equipment({input => println("calc with " + input); input})
    val equipment2 = new Equipment({input => println("calc with " + input); input})

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
