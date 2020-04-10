package ficode.wordcountfromfiles.transform

import scala.io.BufferedSource
import scala.util.Try

trait Transform {
  def doTransform(content :Try[BufferedSource]):Map[String, Int]
}
