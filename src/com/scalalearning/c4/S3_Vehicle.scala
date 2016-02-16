package com.scalalearning.c4

import scala.beans.BeanProperty

object S3_Vehicle {
  def main(args: Array[String]) {
    val car = new Car(1, 2009, 100)
    println(car)
  }

  class Vehicle(val id:Int, val year:Int) {
    override def toString(): String = "ID: " + id + " Year: " + year
  }

  class Car(override val id: Int, override val year: Int,
            var fuelLevel:Int) extends Vehicle(id, year) {
    override def toString(): String = super.toString() + " Fuel Level:" + fuelLevel
  }
}
