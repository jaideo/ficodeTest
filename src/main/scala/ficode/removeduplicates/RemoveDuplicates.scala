package ficode.removeduplicates

object RemoveDuplicates {
  def removeDuplicates[T](list:List[T]):List[T] = list match {
    case Nil => list
    case head::tail => head :: removeDuplicates(tail filterNot (_==head))
  }
}
