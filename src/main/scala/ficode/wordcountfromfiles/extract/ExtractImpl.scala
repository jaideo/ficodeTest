package ficode.wordcountfromfiles.extract

import java.io.FileNotFoundException



import scala.io.{BufferedSource, Source}
import scala.util.{ Try}


object ExtractImpl extends Extract {
  class MissingPathConfigurationFile(msg: String = "file not found.") extends RuntimeException(msg)
  override def doExtract(filepath :String) :Try[BufferedSource]={
    try {
      val bufferedSource = Source.fromFile(filepath)
      Try(bufferedSource)
    }catch{
      case e: FileNotFoundException => throw new MissingPathConfigurationFile
    }
  }
}
