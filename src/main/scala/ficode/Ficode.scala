package ficode

import scala.annotation.tailrec

object Ficode extends App{

  val listreverse = List(1,2,3,4,5,6,7,8,9)

  println(reverse (listreverse))



  def reverseList[A](l: List[A]): List[A] = l match {
    case h :: tail => reverseList(tail) ::: List(h)
    case Nil => Nil
  }






  def reverse[A](l: List[A]): List[A] = {
    @tailrec
    def _reverse(res: List[A], rem: List[A]): List[A] = rem match {
      case Nil => res
      case h :: tail => _reverse(h :: res, tail)
    }
    _reverse(Nil, l)
  }


  println( dedupe(List("one","two","one")) )  // List(one, two)
  println( dedupe(List(1,2,3,4,5,2,3,6,1,1)) ) // List(1, 2, 3, 4, 5, 6)

  def dedupe[T](list:List[T]):List[T] = list match {
    case Nil => list
    case head::tail => head :: dedupe(tail filterNot (_==head))
  }

}

object ListUtil {

  println( dedupe(List("one","two","one")) )  // List(one, two)
  println( dedupe(List(1,2,3,4,5,2,3,6,1,1)) ) // List(1, 2, 3, 4, 5, 6)

  def dedupe[T](list:List[T]):List[T] = list match {
    case Nil => list
    case head::tail => head :: dedupe(tail filterNot (_==head))
  }
}


