package com.scalalearning.c4

object S1_Cars {
  def main(args: Array[String]) {
    val car = new Car(2009)
    println("Car made in year " + car.year)
    println("Miles driven " + car.miles)
    println("Dive for 10 miles")
    car.drive(10)
    println("Miles driven " + car.miles)
  }

  class Car(val year:Int) {
    private var milesDriven: Int = _
    def miles() = milesDriven
    def drive(distance: Int) = milesDriven += Math.abs(distance)
  }
}
