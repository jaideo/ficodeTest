package org.ficode.test.wordcount

import org.scalatest.FunSuite
import ficode.wordcount.WordCount

class WordCountTest extends FunSuite{
  val wordCount =  WordCount
  test("wordcount test"){
    assert(wordCount.wordCount("adb sdf vvv vvv")==Map("adb"->1,"sdf"->1,"vvv"->2))
  }
}
