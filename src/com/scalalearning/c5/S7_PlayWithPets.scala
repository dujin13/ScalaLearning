package com.scalalearning.c5

object S7_PlayWithPets {
  def main(args: Array[String]) {
    val dogs = Array(new Dog("Rever"), new Dog("Comet"))

//    workWithPets(dogs)  // 编译出错
    playWithPets(dogs)
  }

  class Pet(val name:String) {
    override def toString() = name
  }

  class Dog(override val name:String) extends Pet(name)

  def workWithPets(pets:Array[Pet]) {}

  def playWithPets[T <: Pet](pets: Array[T]) =
    println("Play with pets: " + pets.mkString(", "))
}

