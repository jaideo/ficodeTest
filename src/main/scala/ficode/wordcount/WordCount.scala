package ficode.wordcount

object WordCount {
   def wordCount(str:String)  :Map[String,Int] = str.split(" ").map(v => (v,1)).groupBy(_._1).mapValues(_.size)
}
