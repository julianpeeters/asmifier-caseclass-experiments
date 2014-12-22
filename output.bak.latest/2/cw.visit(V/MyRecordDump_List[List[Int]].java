[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:43:50 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:44:22 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001dc\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003CA\u0004$\u0013\u0009!\u0003BA\u0002J]RD\u0001B\n\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001\u0002\u000b\u0001\u0003\u0016\u0004%\u0009!K\u0001\u0002sV\u0009!\u0006\u0005\u0002,]9\u0011q\u0001L\u0005\u0003[!\u0009a\u0001\u0015:fI\u00164\u0017BA\u00181\u0005\u0019\u0019FO]5oO*\u0011Q\u0006\u0003\u0005\u0009e\u0001\u0011\u0009\u0012)A\u0005U\u0005\u0011\u0011\u0010\u0009\u0005\u0006i\u0001!\u0009!N\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007YB\u0014\u0008\u0005\u00028\u00015\u0009!\u0001C\u0003\u0014g\u0001\u0007Q\u0003C\u0003)g\u0001\u0007!\u0006C\u0004<\u0001\u0005\u0005I\u0011\u0001\u001f\u0002\u0009\r|\u0007/\u001f\u000b\u0004mur\u0004bB\n;!\u0003\u0005\r!\u0006\u0005\u0008Qi\u0002\n\u00111\u0001+\u0011\u001d\u0001\u0005!%A\u0005\u0002\u0005\u000babY8qs\u0012\"WMZ1vYR$\u0013'F\u0001CU\u0009)2iK\u0001E!\u0009)%*D\u0001G\u0015\u00099\u0005*A\u0005v]\u000eDWmY6fI*\u0011\u0011\nC\u0001\u000bC:tw\u000e^1uS>t\u0017BA&G\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u001b\u0002\u0009\n\u0011\"\u0001O\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012a\u0014\u0016\u0003U\rCq!\u0015\u0001\u0002\u0002\u0013\u0005#+A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002'B\u0011A+W\u0007\u0002+*\u0011akV\u0001\u0005Y\u0006twMC\u0001Y\u0003\u0011Q\u0017M^1\n\u0005=*\u0006bB.\u0001\u0003\u0003%\u0009\u0001X\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002E!9a\u000cAA\u0001\n\u0003y\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003A\u000e\u0004\"aB1\n\u0005\u0009D!aA!os\"9A-XA\u0001\u0002\u0004\u0011\u0013a\u0001=%c!9a\rAA\u0001\n\u0003:\u0017a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003!\u00042!\u001b7a\u001b\u0005Q'BA6\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003[*\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008_\u0002\u0009\u0009\u0011\"\u0001q\u0003!\u0019\u0017M\\#rk\u0006dGCA9u!\u00099!/\u0003\u0002t\u0011\u00099!i\\8mK\u0006t\u0007b\u00023o\u0003\u0003\u0005\r\u0001\u0019\u0005\u0008m\u0002\u0009\u0009\u0011\"\u0011x\u0003!A\u0017m\u001d5D_\u0012,G#\u0001\u0012\u0009\u000fe\u0004\u0011\u0011!C!u\u0006AAo\\*ue&tw\rF\u0001T\u0011\u001da\u0008!!A\u0005Bu\u000ca!Z9vC2\u001cHCA9\u0011\u001d!70!AA\u0002\u0001<\u0011\"!\u0001\u0003\u0003\u0003E\u0009!a\u0001\u0002\u00115K(+Z2pe\u0012\u00042aNA\u0003\r!\u0009!!!A\u0009\u0002\u0005\u001d1#BA\u0003\u0003\u0013y\u0001cBA\u0006\u0003#)\"FN\u0007\u0003\u0003\u001bQ1!a\u0004\u0009\u0003\u001d\u0011XO\u001c;j[\u0016LA!a\u0005\u0002\u000e\u0009\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\u001c\u001a\u0009\u000fQ\n)\u0001\"\u0001\u0002\u0018Q\u0011\u00111\u0001\u0005\u0009s\u0006\u0015\u0011\u0011!C#u\"Q\u0011QDA\u0003\u0003\u0003%\u0009)a\u0008\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000bY\n\u0009#a\u0009\u0009\rM\u0009Y\u00021\u0001\u0016\u0011\u0019A\u00131\u0004a\u0001U!Q\u0011qEA\u0003\u0003\u0003%\u0009)!\u000b\u0002\u000fUt\u0017\r\u001d9msR!\u00111FA\u001c!\u00159\u0011QFA\u0019\u0013\r\u0009y\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u000b\u001d\u0009\u0019$\u0006\u0016\n\u0007\u0005U\u0002B\u0001\u0004UkBdWM\r\u0005\u0008\u0003s\u0009)\u00031\u00017\u0003\rAH\u0005\r\u0005\u000b\u0003{\u0009)!!A\u0005\n\u0005}\u0012a\u0003:fC\u0012\u0014Vm]8mm\u0016$\"!!\u0011\u0011\u0007Q\u000b\u0019%C\u0002\u0002FU\u0013aa\u00142kK\u000e$\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;", null);
fv.visitEnd();
