package com.scalalearning.c5

object S4_OptionExample {
  def main(args: Array[String]) {
    def commentOnPractice(input: String) = {
      if(input == "test") Some("good") else None
    }

    for(input <- Set("test", "hack")) {
      val comment = commentOnPractice(input);
      println("input " + input + " comment " +
        comment.getOrElse("Found no comments"))
    }
  }
}
