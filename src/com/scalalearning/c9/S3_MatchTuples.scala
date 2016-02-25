package com.scalalearning.c9

/**
  * Created by gaolp on 2016/2/23.
  */
object S3_MatchTuples {

  def main(args: Array[String]) {
    def processCoordinates(input:Any): Unit = {
      input match {
        case (a, b) => printf("Processing (%d, %d)... ", a, b)
        case "done" => println("done")
        case _ => null
      }
    }

    processCoordinates(39, -104)
    processCoordinates("done")
  }
}
