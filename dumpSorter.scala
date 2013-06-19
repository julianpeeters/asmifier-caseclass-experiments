import java.io._
import scala.io._
object dumpSorter extends App{
  case class dynamicClass
  case class cls
  case class module
  
  class step 
  class visitClass extends step  

  
  val directory = new File("entire_dumps")
  val files = directory.listFiles

  val splitsArrays = for {
    file <- files if file.isFile
    val source = Source.fromFile(file)
    val splitsArray = source.mkString.split('o')     
  } yield {source.close(); (file.getName, splitsArray)}

  val filenameAndSplitStreams = for { //one stream per file, the tuple being (filename, split)
    splitsArray <- splitsArrays
  } yield {Stream.continually(splitsArray._1).zip(splitsArray._2)}

val steps = List("visit(", "x", "h")

//val g = for{ 
//step <- steps
val grouped = filenameAndSplitStreams.toList.flatMap(n=>n).map(m=>m).groupBy(o => o._2.contains("h") ).filter(p => p._1 == true)
//} yield group
println(grouped.values)

println(grouped.values.last.foreach(println))
}
