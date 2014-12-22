[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:34:35 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 2, 2013 9:35:02 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005\u001dI\u0012B\u0001\u000e\u0009\u0005\rIe\u000e\u001e\u0005\u00099\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0001\u0010\u0009\u0005\u0006=\u0001!\u0009aH\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0005\u0001\u0012\u0003CA\u0011\u0001\u001b\u0005\u0011\u0001\"B\n\u001e\u0001\u0004)\u0002b\u0002\u0013\u0001\u0003\u0003%\u0009!J\u0001\u0005G>\u0004\u0018\u0010\u0006\u0002!M!91c\u0009I\u0001\u0002\u0004)\u0002b\u0002\u0015\u0001#\u0003%\u0009!K\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005Q#FA\u000b,W\u0005a\u0003CA\u00173\u001b\u0005q#BA\u00181\u0003%)hn\u00195fG.,GM\u0003\u00022\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005Mr#!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9Q\u0007AA\u0001\n\u00032\u0014!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u00018!\u0009AT(D\u0001:\u0015\u0009Q4(\u0001\u0003mC:<'\"\u0001\u001f\u0002\u0009)\u000cg/Y\u0005\u0003}e\u0012aa\u0015;sS:<\u0007b\u0002!\u0001\u0003\u0003%\u0009!Q\u0001\raJ|G-^2u\u0003JLG/_\u000b\u00021!91\u0009AA\u0001\n\u0003!\u0015A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003\u000b\"\u0003\"a\u0002$\n\u0005\u001dC!aA!os\"9\u0011JQA\u0001\u0002\u0004A\u0012a\u0001=%c!91\nAA\u0001\n\u0003b\u0015a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u00035\u00032AT)F\u001b\u0005y%B\u0001)\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003%>\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008)\u0002\u0009\u0009\u0011\"\u0001V\u0003!\u0019\u0017M\\#rk\u0006dGC\u0001,Z!\u00099q+\u0003\u0002Y\u0011\u00099!i\\8mK\u0006t\u0007bB%T\u0003\u0003\u0005\r!\u0012\u0005\u00087\u0002\u0009\u0009\u0011\"\u0011]\u0003!A\u0017m\u001d5D_\u0012,G#\u0001\r\u0009\u000fy\u0003\u0011\u0011!C!?\u0006AAo\\*ue&tw\rF\u00018\u0011\u001d\u0009\u0007!!A\u0005B\u0009\u000ca!Z9vC2\u001cHC\u0001,d\u0011\u001dI\u0005-!AA\u0002\u0015;q!\u001a\u0002\u0002\u0002#\u0005a-\u0001\u0005NsJ+7m\u001c:e!\u0009\u0009sMB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u00015\u0014\u0007\u001dLw\u0002\u0005\u0003k[V\u0001S\"A6\u000b\u00051D\u0011a\u0002:v]RLW.Z\u0005\u0003].\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c82\u0011\u0015qr\r\"\u0001q)\u00051\u0007b\u00020h\u0003\u0003%)e\u0018\u0005\u0008g\u001e\u000c\u0009\u0011\"!u\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0009\u0001S\u000fC\u0003\u0014e\u0002\u0007Q\u0003C\u0004xO\u0006\u0005I\u0011\u0011=\u0002\u000fUt\u0017\r\u001d9msR\u0011\u0011P\u001f\u0009\u0004\u000fY)\u0002\"B>w\u0001\u0004\u0001\u0013a\u0001=%a!9QpZA\u0001\n\u0013q\u0018a\u0003:fC\u0012\u0014Vm]8mm\u0016$\u0012a \u0009\u0004q\u0005\u0005\u0011bAA\u0002s\u00091qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/Object;>;", null);
fv.visitEnd();
