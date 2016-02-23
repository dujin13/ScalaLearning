package com.scalalearning.c8

object S4_UsingList {
  def main(args: Array[String]) {
    val feeds = List("blog.toolshed.com", "pragdave.pragprog.com","dimsumthinking.com/blog")

    println("First feed: " + feeds.head)
    println("Second feed:" + feeds(1))

    val prefixedList = "forms.prgprog.com/forms/887" :: feeds
    println("First Feed In Prefixed: " + prefixedList.head)

    val feedsWithForums = feeds ::: List("forms.prgprog.com/forms/87", "forms.prgprog.com/forms/55")
    println("First feed in feeds with forum: " + feedsWithForums.head)
    println("Last feed in feeds with forum: " + feedsWithForums.last)

    // filter, forall, exists
    println("Feeds with blog: " + feeds.filter(_ contains "blog").mkString(", "))
    println("All feeds have com: " + feeds.forall(_ contains "com"))
    println("All feeds have dave: " + feeds.forall(_ contains "dave"))
    println("Any feeds have dave: " + feeds.exists(_ contains "dave"))
    println("Any feeds have bill: " + feeds.exists(_ contains "bill"))

    // map
    println("Feed url lengths: " + feeds.map(_.length).mkString(","))

    // foldLeft
    val total = feeds.foldLeft(0) {(total, feed) => total + feed.length}
    println("Total length of feed urls: " + total)
    val total2 = (0 /: feeds)  {(total, feed) => total + feed.length}
    println("Total length of feed urls: " + total2)
    val total3 = (0 /: feeds)  { _ + _.length}
    println("Total length of feed urls: " + total3)
  }
}
