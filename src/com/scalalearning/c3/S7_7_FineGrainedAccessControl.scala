package com.scalalearning.c3

package society {
  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another : Executive): Unit = {
        println(another.workDetails)
        println(another.friends)
        //      println(another.secrets)
      }
    }
  }

  package social {
    class Acquaintance {
      def socialize(person: professional.Executive): Unit = {
        println(person.friends)
//        println(person.workDetails)
      }
    }
  }
}
