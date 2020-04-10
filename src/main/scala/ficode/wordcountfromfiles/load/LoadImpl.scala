package ficode.wordcountfromfiles.load

import scala.reflect.io.File

object LoadImpl extends Load {
  override def doLoad(content :Map[String, Int],fileOutput:String)={

/*
    for{
      d <- content
    } yield File(fileOutput).writeAll(d.toString())
*/

        File(fileOutput).writeAll(content.toString())
  }
}
