package com.scalalearning.c7

import java.io.StringWriter

object S4_MethodBinding {
  def main(args: Array[String]) {
    val myWriterProfanityFirst = new StringWriterDelegate with UpperCaseWriter
      with ProfanityFilteredWriter

    val myWriterProfanityLast = new StringWriterDelegate with ProfanityFilteredWriter
      with UpperCaseWriter

    myWriterProfanityFirst writeMessage "There is no sin except stupidity"
    myWriterProfanityLast writeMessage "There is no sin except stupidity"

    println(myWriterProfanityFirst)
    println(myWriterProfanityLast)
  }

  class StringWriterDelegate extends  Writer {
    val writer = new StringWriter

    def writeMessage(message: String) = writer write message
    override  def toString(): String = writer.toString
  }

  abstract class Writer {
    def writeMessage(message: String)
  }

  trait UpperCaseWriter extends Writer {
    abstract override def writeMessage(message:String) =
      super.writeMessage(message.toUpperCase)
  }

  trait ProfanityFilteredWriter extends Writer {
    abstract override def writeMessage(message:String) =
      super.writeMessage(message.replace("stupid", "s-----"))
  }

}
