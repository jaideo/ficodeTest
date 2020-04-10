package org.ficode.test.reverselist

import ficode.reverselist.ReverseList
import org.scalatest.FunSuite


class ReverseListTest extends FunSuite {
   val ac = ReverseList
   test("ReverseList reverseList"){
      assert(ac.reverseList(List(1,2,3))==List(3,2,1))
      assert(ac.reverseList(List("a","b","c"))==List("c","b","a"))
   }
  }
