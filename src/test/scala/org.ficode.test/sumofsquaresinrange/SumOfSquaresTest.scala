package org.ficode.test.sumofsquaresinrange

import org.scalatest.FunSuite
import ficode.sumofsquaresinrange.SumOfSquares

/***
  *
  */
class SumOfSquaresTest extends FunSuite{
  val sos = SumOfSquares
  test("SumOfSquares sumOfSquares"){
    assert(SumOfSquares.sumOfSquares(2,1)==5)
  }
}
