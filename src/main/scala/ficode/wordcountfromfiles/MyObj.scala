package ficode.wordcountfromfiles
import ficode.wordcountfromfiles.extract.ExtractImpl
import ficode.wordcountfromfiles.transform.TransformImpl
import ficode.wordcountfromfiles.load.LoadImpl

object MyObj extends App{
  val fileInput ="input.txt"
  val extractContent = ExtractImpl.doExtract(fileInput)
  val transformedContent = TransformImpl.doTransform(extractContent)
  val fileOutput ="output.txt"
  LoadImpl.doLoad(transformedContent,fileOutput)
}