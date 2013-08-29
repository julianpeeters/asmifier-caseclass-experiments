import scala.sys.process._
import java.io._
object DumpGenerator{

val datatypes = List("Byte", "Short", "Int", "Long", "Float", "Double", "Boolean", "String", "AnyRef", "Any", "Null", "Nothing", "Unit", "Object", "Option[Any]", "Option[String]", "Option[Int]", "Stream[Int]", "List[Int]", "List[List[Int]]", "List[List[List[Int]]]")
for (datatype <- datatypes){

Some(new PrintWriter("""MyRecord_""" + datatype + """.scala""")).foreach{pw => pw.write("case class MyRecord(x: " + datatype + ")"); pw.close} 
 

"sbt clean"  #&& "sbt compile"  #&& 
"""java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.2/classes/MyRecord.class"""  #> new File("""entire_dumps/MyRecordDump_""" + datatype + """.java""") #&& ("""rm MyRecord_""" + datatype + """.scala""") !

}


}
