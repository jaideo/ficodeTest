package ficode.wordcountfromfiles.extract

import scala.io.BufferedSource
import scala.util.Try

trait Extract {
  def doExtract(file :String):Try[BufferedSource]
}
