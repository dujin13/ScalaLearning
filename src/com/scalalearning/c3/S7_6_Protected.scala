package com.scalalearning.c3

object S7_6_Protected {
  def main(args: Array[String]) {
  }

  class Vehicle {
    protected def checkEngine(){}
  }

  class Car extends Vehicle {
    def start() { checkEngine() }
    def tow(car : Car): Unit = {
      car.checkEngine()
    }
    def tow(vehicle: Vehicle): Unit = {
//      vehicle.checkEngine()
    }

    class GasStation {
      def fillGas(vehicle: Vehicle): Unit = {
//        vehicle.checkEngine()
      }
    }
  }
}
