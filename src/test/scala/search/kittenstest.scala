package search

import org.specs2.mutable.Specification


object KittenSpec extends Specification {
  "The 'matchesAttribute' method" should {
    "return true" in {
      val tabby = Kitten(1, List("female","tabby"))
      val result = tabby.matchesAttribute("tabby")
      result must beEqualTo(true)
    }
  }
}
