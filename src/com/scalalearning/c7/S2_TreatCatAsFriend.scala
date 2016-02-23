package com.scalalearning.c7

import com.scalalearning.c7.S1_UseFriend.{Animal, Friend}

object S2_TreatCatAsFriend {
  def main(args: Array[String]) {
    val snowy = new Cat("Snowy") with Friend
    val friend : Friend = snowy
    friend.listen

    def useFriend(friend: Friend) = friend listen()
    useFriend(snowy)
  }

  class Cat(val name:String) extends Animal

}
