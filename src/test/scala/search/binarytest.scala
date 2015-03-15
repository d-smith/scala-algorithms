package search

import org.specs2.mutable.Specification


object BinarySearchSpec extends Specification {
  "The 'indexOf' method" should {
    "return Some" in {
      val items = Array(1,2,5,7,9,100)
      BinarySearch.indexOf(1, items) must beEqualTo(Some(0))
      BinarySearch.indexOf(2, items) must beEqualTo(Some(1))
      BinarySearch.indexOf(5, items) must beEqualTo(Some(2))
      BinarySearch.indexOf(7, items) must beEqualTo(Some(3))
      BinarySearch.indexOf(9, items) must beEqualTo(Some(4))
      BinarySearch.indexOf(100, items) must beEqualTo(Some(5))
    }

    "return Some working with doubles" in {
      val items = Array[Double](1.1, 2.3, 5.0, 7.2)
      BinarySearch.indexOf(2.3, items) must beEqualTo(Some(1))
    }

    "return None" in {
      val items = Array(1,2,5,7,9,100)
      BinarySearch.indexOf(-1, items) must beEqualTo(None)
      BinarySearch.indexOf(20, items) must beEqualTo(None)
      BinarySearch.indexOf(200, items) must beEqualTo(None)
    }
  }
}
