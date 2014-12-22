name := "asmifier-caseclass-experiments"

version := "0.1-SNAPSHOT"

organization := "com.julianpeeters"

//scalaVersion := "2.9.1"
//scalaVersion := "2.10.1"
scalaVersion := "2.11.4"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "Sonatype OSS REls" at "https://oss.sonatype.org/content/repositories/releases"

libraryDependencies ++= Seq( 
 // "org.scalatest" %% "scalatest" % "1.8" % "test",
  "org.apache.avro" % "avro" % "1.7.4",
 //  "com.novus" %% "salat" % "1.9.1", 
  "com.novus" %% "salat" % "1.9.9",
   "org.slf4j" % "slf4j-simple" % "1.6.4"
)
