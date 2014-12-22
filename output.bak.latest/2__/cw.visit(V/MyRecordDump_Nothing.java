[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:36:26 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.avro#avro;1.7.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-core-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-mapper-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.3 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.xerial.snappy#snappy-java;1.0.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.commons#commons-compress;1.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.tukaani#xz;1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.6.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-util_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.7.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scalap;2.10.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-compiler;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-reflect;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-core_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-core_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-commons_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.github.nscala-time#nscala-time_2.10;0.2.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving joda-time#joda-time;2.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.joda#joda-convert;1.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#mongo-java-driver;2.11.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-query_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-native_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-core_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-ast_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.5.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-simple;1.6.4 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[33mwarn[0m] [0mPotentially incompatible versions of dependencies of {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6:[0m
[0m[[33mwarn[0m] [0m   org.scala-lang: 2.10.2, 2.10.0[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.10/classes...[0m
[0m[[33mwarn[0m] [0mthere were 6 deprecation warning(s); re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere were 1 feature warning(s); re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mtwo warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 8:36:53 PM[0m
package asm.models;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.attrs.*;
public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "models/MyRecord", null, "java/lang/Object", new String[] { "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\u0005\u0005b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002Q\u0009\u0011!\u001f\u0005\u0009;\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0011\u0010\u0009\u0005\u0006?\u0001!\u0009\u0001I\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007\u0005\u001aC\u0005\u0005\u0002#\u00015\u0009!\u0001C\u0003\u0014=\u0001\u0007Q\u0003C\u0003\u001c=\u0001\u0007Q\u0003C\u0004'\u0001\u0005\u0005I\u0011A\u0014\u0002\u0009\r|\u0007/\u001f\u000b\u0004C!J\u0003bB\n&!\u0003\u0005\r!\u0006\u0005\u00087\u0015\u0002\n\u00111\u0001\u0016\u0011\u001dY\u0003!%A\u0005\u00021\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u0001.U\u0009)bfK\u00010!\u0009\u0001T'D\u00012\u0015\u0009\u00114'A\u0005v]\u000eDWmY6fI*\u0011A\u0007C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001\u001c2\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008q\u0001\u0009\n\u0011\"\u0001-\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIIBqA\u000f\u0001\u0002\u0002\u0013\u00053(A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002yA\u0011QHQ\u0007\u0002})\u0011q\u0008Q\u0001\u0005Y\u0006twMC\u0001B\u0003\u0011Q\u0017M^1\n\u0005\rs$AB*ue&tw\rC\u0004F\u0001\u0005\u0005I\u0011\u0001$\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\u001d\u0003\"a\u0002%\n\u0005%C!aA%oi\"91\nAA\u0001\n\u0003a\u0015A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003\u001bB\u0003\"a\u0002(\n\u0005=C!aA!os\"9\u0011KSA\u0001\u0002\u00049\u0015a\u0001=%c!91\u000bAA\u0001\n\u0003\"\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003U\u00032AV-N\u001b\u00059&B\u0001-\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u00035^\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u00089\u0002\u0009\u0009\u0011\"\u0001^\u0003!\u0019\u0017M\\#rk\u0006dGC\u00010b!\u00099q,\u0003\u0002a\u0011\u00099!i\\8mK\u0006t\u0007bB)\\\u0003\u0003\u0005\r!\u0014\u0005\u0008G\u0002\u0009\u0009\u0011\"\u0011e\u0003!A\u0017m\u001d5D_\u0012,G#A$\u0009\u000f\u0019\u0004\u0011\u0011!C!O\u0006AAo\\*ue&tw\rF\u0001=\u0011\u001dI\u0007!!A\u0005B)\u000ca!Z9vC2\u001cHC\u00010l\u0011\u001d\u0009\u0006.!AA\u00025;q!\u001c\u0002\u0002\u0002#\u0005a.\u0001\u0005NsJ+7m\u001c:e!\u0009\u0011sNB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u00019\u0014\u0007=\u000cx\u0002E\u0003skV)\u0012%D\u0001t\u0015\u0009!\u0008\"A\u0004sk:$\u0018.\\3\n\u0005Y\u001c(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)qd\u001cC\u0001qR\u0009a\u000eC\u0004g_\u0006\u0005IQI4\u0009\u000fm|\u0017\u0011!CAy\u0006)\u0011\r\u001d9msR\u0019\u0011% @\u0009\u000bMQ\u0008\u0019A\u000b\u0009\u000bmQ\u0008\u0019A\u000b\u0009\u0013\u0005\u0005q.!A\u0005\u0002\u0006\r\u0011aB;oCB\u0004H.\u001f\u000b\u0005\u0003\u000b\u0009\u0009\u0002E\u0003\u0008\u0003\u000f\u0009Y!C\u0002\u0002\n!\u0011aa\u00149uS>t\u0007#B\u0004\u0002\u000eU)\u0012bAA\u0008\u0011\u00091A+\u001e9mKJBa!a\u0005\u0000\u0001\u0004\u0009\u0013a\u0001=%a!I\u0011qC8\u0002\u0002\u0013%\u0011\u0011D\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002\u001cA\u0019Q(!\u0008\n\u0007\u0005}aH\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
