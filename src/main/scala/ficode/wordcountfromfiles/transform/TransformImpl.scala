package ficode.wordcountfromfiles.transform

import scala.io.BufferedSource
import scala.util.Try

object TransformImpl extends Transform {
  override def doTransform(content: Try[BufferedSource]): Map[String, Int] = {
    readFile(content)
  }

  def readFile(content: Try[BufferedSource]): Map[String, Int] = {
    val counter = content.get
      .getLines
      .flatMap(_.split("\\W+"))
      .foldLeft(Map.empty[String, Int]) {
        (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
      }
    counter
  }
}
