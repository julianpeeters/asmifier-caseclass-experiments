[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 10:00:27 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 10:00:59 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001a\u001d\u00099q#\u0003\u0002\u0019\u0011\u00051\u0001K]3eK\u001aL!AG\u000e\u0003\rM#(/\u001b8h\u0015\u0009A\u0002\u0002\u0003\u0005\u001e\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005 \u0001\u0009U\r\u0011\"\u0001!\u0003\u0005IX#A\u0011\u0011\u0005\u001d\u0011\u0013BA\u0012\u0009\u0005\u0011\u0011\u0015\u0010^3\u0009\u0011\u0015\u0002!\u0011#Q\u0001\n\u0005\n!!\u001f\u0011\u0009\u000b\u001d\u0002A\u0011\u0001\u0015\u0002\rqJg.\u001b;?)\rI3\u0006\u000c\u0009\u0003U\u0001i\u0011A\u0001\u0005\u0006'\u0019\u0002\r!\u0006\u0005\u0006?\u0019\u0002\r!\u0009\u0005\u0008]\u0001\u0009\u0009\u0011\"\u00010\u0003\u0011\u0019w\u000e]=\u0015\u0007%\u0002\u0014\u0007C\u0004\u0014[A\u0005\u0009\u0019A\u000b\u0009\u000f}i\u0003\u0013!a\u0001C!91\u0007AI\u0001\n\u0003!\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002k)\u0012QCN\u0016\u0002oA\u0011\u0001(P\u0007\u0002s)\u0011!hO\u0001\nk:\u001c\u0007.Z2lK\u0012T!\u0001\u0010\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002?s\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000f\u0001\u0003\u0011\u0013!C\u0001\u0003\u0006q1m\u001c9zI\u0011,g-Y;mi\u0012\u0012T#\u0001\"+\u0005\u00052\u0004b\u0002#\u0001\u0003\u0003%\u0009%R\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003\u0019\u0003\"a\u0012'\u000e\u0003!S!!\u0013&\u0002\u00091\u000cgn\u001a\u0006\u0002\u0017\u0006!!.\u0019<b\u0013\u0009Q\u0002\nC\u0004O\u0001\u0005\u0005I\u0011A(\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003A\u0003\"aB)\n\u0005IC!aA%oi\"9A\u000bAA\u0001\n\u0003)\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003-f\u0003\"aB,\n\u0005aC!aA!os\"9!lUA\u0001\u0002\u0004\u0001\u0016a\u0001=%c!9A\u000cAA\u0001\n\u0003j\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003y\u00032a\u00182W\u001b\u0005\u0001'BA1\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003G\u0002\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008K\u0002\u0009\u0009\u0011\"\u0001g\u0003!\u0019\u0017M\\#rk\u0006dGCA4k!\u00099\u0001.\u0003\u0002j\u0011\u00099!i\\8mK\u0006t\u0007b\u0002.e\u0003\u0003\u0005\rA\u0016\u0005\u0008Y\u0002\u0009\u0009\u0011\"\u0011n\u0003!A\u0017m\u001d5D_\u0012,G#\u0001)\u0009\u000f=\u0004\u0011\u0011!C!a\u0006AAo\\*ue&tw\rF\u0001G\u0011\u001d\u0011\u0008!!A\u0005BM\u000ca!Z9vC2\u001cHCA4u\u0011\u001dQ\u0016/!AA\u0002Y;qA\u001e\u0002\u0002\u0002#\u0005q/\u0001\u0005NsJ+7m\u001c:e!\u0009Q\u0003PB\u0004\u0002\u0005\u0005\u0005\u0009\u0012A=\u0014\u0007aTx\u0002E\u0003|}V\u0009\u0013&D\u0001}\u0015\u0009i\u0008\"A\u0004sk:$\u0018.\\3\n\u0005}d(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!1q\u0005\u001fC\u0001\u0003\u0007!\u0012a\u001e\u0005\u0008_b\u000c\u0009\u0011\"\u0012q\u0011%\u0009I\u0001_A\u0001\n\u0003\u000bY!A\u0003baBd\u0017\u0010F\u0003*\u0003\u001b\u0009y\u0001\u0003\u0004\u0014\u0003\u000f\u0001\r!\u0006\u0005\u0007?\u0005\u001d\u0001\u0019A\u0011\u0009\u0013\u0005M\u00010!A\u0005\u0002\u0006U\u0011aB;oCB\u0004H.\u001f\u000b\u0005\u0003/\u0009\u0019\u0003E\u0003\u0008\u00033\u0009i\"C\u0002\u0002\u001c!\u0011aa\u00149uS>t\u0007#B\u0004\u0002 U\u0009\u0013bAA\u0011\u0011\u00091A+\u001e9mKJBq!!\n\u0002\u0012\u0001\u0007\u0011&A\u0002yIAB\u0011\"!\u000by\u0003\u0003%I!a\u000b\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003[\u00012aRA\u0018\u0013\r\u0009\u0009\u0004\u0013\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
