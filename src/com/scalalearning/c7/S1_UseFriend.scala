package com.scalalearning.c7

object S1_UseFriend {
  def main(args: Array[String]) {
    val john = new Man("John")
    val sara = new Woman("Sara")
    var comet = new Dog("Comet")

    john.listen
    sara.listen
    comet.listen

    val manBestFriend : Friend = comet
    manBestFriend.listen

    def helpAsFriend(friend: Friend) = friend listen

    helpAsFriend(sara)
    helpAsFriend(comet)
  }

  trait Friend {
    val name:String
    def listen() = println("Your friend " + name + " is listerning")
  }

  class Human(val name:String) extends  Friend

  class Man(override val name:String) extends Human(name)

  class Woman(override val name:String) extends Human(name)

  class Animal

  class Dog(val name:String) extends Animal with Friend {
    override def listen = println(name + " is listerning quietly")
  }

}
