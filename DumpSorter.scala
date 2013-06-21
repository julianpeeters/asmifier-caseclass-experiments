import java.io._
import scala.io._

object dumpSorter {
  case class dynamicClass
  case class cls
  case class module
  


  
  val directory = new File("entire_dumps")
  val files = directory.listFiles

  val splitsArrays = for {
    file <- files if file.isFile
    val source = Source.fromFile(file)
    val splitsArray = source.mkString.split("\\}\\{")     
  } yield {source.close(); (file.getName, splitsArray)}

  val filenameAndSplitStreams = for { //one stream per file, the tuple being (filename, split)
    splitsArray <- splitsArrays
  } yield {Stream.continually(splitsArray._1).zip(splitsArray._2)}

  val steps = List("visit(", "productArity", "h")

val listOfMaps = for{ 
step <- steps
  val grouped = filenameAndSplitStreams.toList
    .flatMap(n=>n).groupBy(o =>o._2.contains(step)).filter(p => p._1 == true)//groupBy groups by boolean, filter for hits
    .map(q => (step->q._2)) //re-label the boolean key to the query, resulting in a map from query to a list of hits
} yield grouped
println(listOfMaps)
//println(filenameAndSplitStreams.foreach(println))
  //println(grouped
val res = for { map <- listOfMaps
              //  steps <- map.values
          } yield { 

//TODO for ( (k,v) <- map)
map.foreach(q => Some(new File(q._1)).foreach(r => r.mkdir))
//listOfMaps.foreach(p => p.foreach(q => Some(new File(q._1)).foreach(r => r.mkdir)))
map.foreach(v => Some(new PrintWriter(v._1 + "/" + v._2(0)._1)).foreach{s => s.write(v._2(0)._2); s.close})
//Some(new PrintWriter(steps._1 + "/name")).foreach{s => s.write("hello world"); s.close}
}
//res
println(res)
//println(res)
//"echo hello world" #> new java.io.File("example.txt") !
//println(grouped.values.foreach(println))
}
