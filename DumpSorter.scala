import java.io._
import scala.io._

object DumpSorter {
  case class dynamicClass
  case class cls
  case class module
  

  val directory = new File("entire_dumps")
  val files = directory.listFiles

  val splitsArrays = for {
    file <- files if file.isFile
    val source = Source.fromFile(file)
    val splitsArray = source.mkString.split("""\}
\{""")//(" = cw.")     
  } yield {source.close(); (file.getName, splitsArray)}

  val filenameAndSplitStreams = for { //one stream per file, the tuple being (filename, split)
    splitsArray <- splitsArrays
  } yield {Stream.continually(splitsArray._1).zip(splitsArray._2)}
println(filenameAndSplitStreams)

  val steps = List("cw.visit(V", 
		   "ScalaSignature", 
                   """cw.visitField(""", 
                   """visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "andThen",""", 
                   """visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "compose",""",
                   """visitMethod(ACC_PUBLIC, "tupled",""", 
                   """visitMethod(ACC_PUBLIC, "curry",""", 
                   """visitMethod(ACC_PUBLIC, "curried",""", 
                   """visitMethod(ACC_PUBLIC, "productIterator",""", 
                   """visitMethod(ACC_PUBLIC + ACC_DEPRECATED, "productElements",""", 
                   """visitMethod(ACC_PUBLIC, "x",""", 
                   """visitMethod(ACC_PUBLIC, "copy",""", 
                   """visitMethod(ACC_PUBLIC, "copy$default""", 
                   """visitMethod(ACC_PUBLIC, "hashCode",""", 
                   """visitMethod(ACC_PUBLIC, "toString",""", 
                   """visitMethod(ACC_PUBLIC, "equals",""", 
                   """visitMethod(ACC_PUBLIC, "productPrefix",""", 
                   """visitMethod(ACC_PUBLIC, "productElement",""", 
                   """visitMethod(ACC_PUBLIC, "productArity",""", 
                   """visitMethod(ACC_PUBLIC, "canEqual",""", 
                   """visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1",""", 
                   """visitMethod(ACC_PUBLIC, "<init>",""")


val listOfMaps = for{   //listOfMaps is a Map(step1 -> List(List(filename1,step1), List(filename2, step1)...)
  step <- steps
  val grouped = filenameAndSplitStreams.toList
    .flatMap(n=>n)
    .groupBy(o =>o._2.contains(step))
    .filter(p => p._1 == true)//groupBy groups by a boolean, filter for hits
    .map(q => (step->q._2)) //re-label the boolean key to the query, resulting in a map from query to a list of hits
} yield {grouped}



val res = for {                        map <- listOfMaps
  (step, listOfTuples_FilenameAndStepDump) <- map
                      (filename, stepDump) <- listOfTuples_FilenameAndStepDump
          } yield { 
            Some(new File("output/" + step)).foreach(step => step.mkdir)
            Some(new PrintWriter("output/" + step + "/" + filename)).foreach{s => s.write(stepDump); s.close}

}

}
