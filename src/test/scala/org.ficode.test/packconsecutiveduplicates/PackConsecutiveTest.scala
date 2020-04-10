package org.ficode.test.packconsecutiveduplicates

import org.scalatest.FunSuite
import ficode.packconsecutiveduplicates.PackConsecutive

/***
  *
  */
class PackConsecutiveTest extends FunSuite{
val sos = PackConsecutive
  test("PackConsecutive packConsecutiveTest"){
     assert(PackConsecutive.packConsecutiveNestedList(List(1,1,1,2,2,4,5,6,6,6,6))==List(List(1,1,1), List(2,2), List(4), List(5), List(6,6,6,6)))
  }
}
