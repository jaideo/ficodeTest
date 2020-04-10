package org.ficode.test.removeduplicates

import org.scalatest.FunSuite
import ficode.removeduplicates._

class RemoveDuplicatesTest extends FunSuite{
  val rd = RemoveDuplicates
  test("RemoveDuplicates.removeduplicates "){
    assert(rd.removeDuplicates(List(1,1,1,2,3,4,4,4,5,6,7)) == List(1,2,3,4,5,6,7))
    assert(rd.removeDuplicates(List("a","a","b","b","c","d")) == List("a","b","c","d"))
    assert(rd.removeDuplicates(List(1.1,1.1,1.1,2.2,3.2,4.1,4.1,4.1,5.1,6.1,7.1)) == List(1.1,2.2,3.2,4.1,5.1,6.1,7.1))
  }
}
