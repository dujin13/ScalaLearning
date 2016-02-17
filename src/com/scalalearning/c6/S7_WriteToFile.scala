package com.scalalearning.c6

import java.io.{File, PrintWriter}

object S7_WriteToFile {
  def main(args: Array[String]) {
    def writeToFile(fileName:String)(codeBlock: PrintWriter => Unit) = {
      val writer = new PrintWriter(new File(fileName))
      try {codeBlock(writer)} finally {writer.close()}
    }

    writeToFile("output.txt") {writer =>
      writer write "hello from Scala"
    }
  }
}
