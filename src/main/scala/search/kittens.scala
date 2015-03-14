package search

case class Kitten(id: Long, attributes: Seq[String]) {
  def matchesAttribute(attribute: String) : Boolean = attributes.contains(attribute)
}
