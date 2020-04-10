package ficode.reverselist

import scala.annotation.tailrec

/***
  * reversing list w/o using inbuilt function
  */
object ReverseList {
  /***
    *
    * @param list
    * @tparam T
    * @return
    */
  def reverseList[T](list: List[T]): List[T] = {
    @tailrec
    def reverseRec(listHead: List[T], listToReverse: List[T]): List[T] = listToReverse match {
      case Nil => listHead
      case head :: tail => reverseRec(head :: listHead, tail)
    }
    reverseRec(Nil, list)
  }
}
