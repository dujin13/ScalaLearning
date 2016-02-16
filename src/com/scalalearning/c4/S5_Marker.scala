package com.scalalearning.c4

object S5_Marker {
  def main(args: Array[String]) {
    println(Marker getMarker "blue")
    println(Marker getMarker "blue")
    println(Marker getMarker "red")
    println(Marker getMarker "red")
  }

  class Marker private (val color: String) {
    println("Creating " + this)

    override def toString() : String = "marker color " + color
  }

  object Marker {
    private val markers = Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "green" -> new Marker("green")
    )

    def getMarker(color:String) =
      if(markers.contains(color)) markers(color) else null
  }

}
