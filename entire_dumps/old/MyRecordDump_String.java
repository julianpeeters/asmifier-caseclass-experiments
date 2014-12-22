Loading /usr/share/sbt/bin/sbt-launch-lib.bash
[0m[[0minfo[0m] [0mLoading global plugins from /home/julian/.sbt/0.13/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julian/Dropbox/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Dec 17, 2014 2:22:17 AM[0m
Loading /usr/share/sbt/bin/sbt-launch-lib.bash
[0m[[0minfo[0m] [0mLoading global plugins from /home/julian/.sbt/0.13/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julian/Dropbox/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julian/Dropbox/asmifier-caseclass-experiments/}asmifier-caseclass-experiments...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.11.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.avro#avro;1.7.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-core-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-mapper-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.3 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.xerial.snappy#snappy-java;1.0.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.commons#commons-compress;1.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.tukaani#xz;1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.6.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat_2.11;1.9.9 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-util_2.11;1.9.9 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.7.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scalap;2.11.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-compiler;2.11.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-reflect;2.11.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang.modules#scala-xml_2.11;1.0.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-core_2.11;1.9.9 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-core_2.11;2.7.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-commons_2.11;2.7.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.github.nscala-time#nscala-time_2.11;1.0.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving joda-time#joda-time;2.3 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.joda#joda-convert;1.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#mongo-java-driver;2.12.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-query_2.11;2.7.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-native_2.11;3.2.9 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-core_2.11;3.2.9 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-ast_2.11;3.2.9 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.6 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-simple;1.6.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-compiler;2.11.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-reflect;2.11.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving jline#jline;2.12 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 13 Scala sources to /home/julian/Dropbox/asmifier-caseclass-experiments/target/scala-2.11/classes...[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Byte.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Byte, y: Nothing, z:Byte)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Char.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Char, y: Nothing, z:Char)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Double.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Double, y: Nothing, z:Double)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Float.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Float, y: Nothing, z:Float)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Int.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Int, y: Nothing, z:Int)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Long.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Long, y: Nothing, z:Long)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Short.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: Short, y: Nothing, z:Short)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m/home/julian/Dropbox/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_String.scala:2: MyRecord is already defined as case class MyRecord[0m
[0m[[31merror[0m] [0mcase class MyRecord(x: String, y: Nothing, z:String)[0m
[0m[[31merror[0m] [0m           ^[0m
[0m[[31merror[0m] [0m8 errors found[0m
[0m[[31merror[0m] [0m(compile:[31mcompile[0m) Compilation failed[0m
[0m[[31merror[0m] [0mTotal time: 23 s, completed Dec 17, 2014 2:23:02 AM[0m
