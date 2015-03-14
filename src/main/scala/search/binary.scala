package search

object BinarySearch {
  def indexOf(number: Int, numbers: Array[Int]) : Option[Int] = {
    var low = 0
    var high = numbers.length - 1

    while (low <= high) {
      val mid = (low + high) / 2
      val current = numbers(mid)
      if(current == number) {
        return Some(mid)
      }

      if(current >= number)
        high = mid - 1
      else
        low = mid + 1
    }

    return None
  }
}
