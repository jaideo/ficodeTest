package org.ficode.test.wordcountfromfiles

import ficode.wordcountfromfiles.extract.ExtractImpl
import org.scalatest.FunSuite

import scala.io.BufferedSource
import scala.util.Try

class WordCountFileTest extends FunSuite{
  test("Extract.doExtract Success") {
    assert( ExtractImpl.doExtract("input.txt").isInstanceOf[Try[BufferedSource]])
  }
}





