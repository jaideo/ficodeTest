package ficode.packconsecutiveduplicates

import scala.annotation.tailrec

object PackConsecutive {

  def packConsecutiveNestedList[T](ls: List[T]):List[List[T]] = {
    @tailrec
    def packConsecutive (headList: List[List[T]], list: List[T]):List[List[T]] = list match {
      case Nil => headList
      case nonEmpty => {
        val (s: List[T], r: List[T]) = list span { _ == list.head }
        packConsecutive(headList:::List(s), r)
      }
    }
    packConsecutive(Nil, ls)
  }
}
