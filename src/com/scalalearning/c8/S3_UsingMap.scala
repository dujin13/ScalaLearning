package com.scalalearning.c8

object S3_UsingMap {
  def main(args: Array[String]) {
    val feeds = Map("Andy Hunt" -> "blog.toolshed.com",
      "Dave Thomas" -> "pragprog.com",
      "Dan Steinverg" -> "dimsumthinking.com/blog"
    )

    val filterNameStartWithD = feeds filterKeys( _ startsWith( "D"))
    println("# of Filtered: " + filterNameStartWithD.size)

    val filterNameStartWithDAndBlogInFeed = feeds filter { element =>
      val (key, value) = element
      (key startsWith "D") && (value contains "blog")
    }

    println("# of feeds with auth name D* and blog in URL: " +
      filterNameStartWithDAndBlogInFeed.size)

    println("Get Andy's Feed: " + feeds.get("Andy Hunt"))
    println("Get Bill's Feed: " + feeds.get("Bill Who"))

    try {
      println("Get Andy's Feed Using apply(): " + feeds("Andy Hunt"))
      print("Get Bill's Feed: ")
      println(feeds("Bill Who"))
    }catch {
      case ex : java.util.NoSuchElementException => println("Not Found")
    }

    val newFeeds1 = feeds.updated("Venkat Subramaniam", "agiledeveloper.com/blog")
    println("Venkat's blog in original feeds: " + feeds.get("Venkat Subramaniam"))
    println("Venkat's blog in original feeds: " + newFeeds1.get("Venkat Subramaniam"))

    val mutableFeeds = scala.collection.mutable.Map(
      "Scala Book Form" -> "forums.pragprog.com/forum/87"
    )
    mutableFeeds("Groovy Book Forum") = "forums.prgprog.com/forms/55"
    println("Number of forums: " + mutableFeeds.size)
  }
}
