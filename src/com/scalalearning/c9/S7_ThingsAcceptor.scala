package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S7_ThingsAcceptor {

  case class Apple()
  case class Orange()
  case class Book()

  def main(args: Array[String]) {
    def acceptStuff(thing:Any) = {
      thing match {
        case Apple() => println("Thanks for the Apple")
        case Orange() => println("Thanks for the Orange")
        case Book() => println("Thanks for the Book")
        case _ => println("Excuse me, why did you send me a " + thing)
      }
    }

    acceptStuff(Apple())
    acceptStuff(Book())
    acceptStuff(Apple)
  }
}
