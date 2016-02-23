package com.scalalearning.c8

object S2_UsingSet {
  def main(args: Array[String]) {
    val feed1 = Set("blog.toolshed.com", "pragdave.pragprog.com",
      "pragmactic-osxer.blogspot.com", "vita-contemplativa.blogspot.com")
    var feed2 = Set("blog.toolshed.com", "martingfowler.com/bliki")

    val blogSpotFeeds = feed1 filter (_ contains "blogspot")
    println("blogspot feeds: " + blogSpotFeeds.mkString(", "))
    
    val mergedFeeds = feed1 ++ feed2
    println("# of merged feeds: " + mergedFeeds.size)

    val commonFeeds = feed1 & feed2
    println("common feeds: " + commonFeeds.mkString(", "))

    val urls = feed1 map ("http://" + _)
    val v:Array[String] = urls.toArray
    println("One url: " + v(0))

    println("Refresh Feeds: ")
    feed1 foreach {feed => println(" Refreshing " + feed)}
  }
}
