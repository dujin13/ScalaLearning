package com.scalalearning.c11

/**
  * Created by gaolp on 2016/3/1.
  */
class Car(val year:Int) {
  private[this] var miles:Int = 0

  def drive(distance:Int) {miles += distance}

  override  def toString() : String = "year: " + year + " miles: " + miles
}
