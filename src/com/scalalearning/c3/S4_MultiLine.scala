package com.scalalearning.c3

object S4_MultiLine {
  def main(args: Array[String]) {
    val str = """git add README.md
                git commit -m "first commit"
                git remote add origin git@github.com:dujin13/ScalaLearning.git
                git push -u origin master"""
    println(str)
  }
}
