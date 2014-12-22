[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:30:24 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 23 s, completed Sep 5, 2013 8:30:53 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002J]RD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001H\u0001\u0002sV\u0009Q\u0004\u0005\u0002\u0008=%\u0011q\u0004\u0003\u0002\u0008\u001d>$\u0008.\u001b8h\u0011!\u0009\u0003A!E!\u0002\u0013i\u0012AA=!\u0011\u0015\u0019\u0003\u0001\"\u0001%\u0003\u0019a\u0014N\\5u}Q\u0019Qe\n\u0015\u0011\u0005\u0019\u0002Q\"\u0001\u0002\u0009\u000bM\u0011\u0003\u0019A\u000b\u0009\u000bm\u0011\u0003\u0019A\u000f\u0009\u000f)\u0002\u0011\u0011!C\u0001W\u0005!1m\u001c9z)\r)C&\u000c\u0005\u0008'%\u0002\n\u00111\u0001\u0016\u0011\u001dY\u0012\u0006%AA\u0002uAqa\u000c\u0001\u0012\u0002\u0013\u0005\u0001'\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003ER#!\u0006\u001a,\u0003M\u0002\"\u0001N\u001d\u000e\u0003UR!AN\u001c\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001d\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003uU\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001da\u0004!%A\u0005\u0002u\nabY8qs\u0012\"WMZ1vYR$#'F\u0001?U\u0009i\"\u0007C\u0004A\u0001\u0005\u0005I\u0011I!\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005\u0011\u0005CA\"I\u001b\u0005!%BA#G\u0003\u0011a\u0017M\\4\u000b\u0003\u001d\u000bAA[1wC&\u0011\u0011\n\u0012\u0002\u0007'R\u0014\u0018N\\4\u0009\u000f-\u0003\u0011\u0011!C\u0001)\u0005a\u0001O]8ek\u000e$\u0018I]5us\"9Q\nAA\u0001\n\u0003q\u0015A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003\u001fJ\u0003\"a\u0002)\n\u0005EC!aA!os\"91\u000bTA\u0001\u0002\u0004)\u0012a\u0001=%c!9Q\u000bAA\u0001\n\u00032\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003]\u00032\u0001W.P\u001b\u0005I&B\u0001.\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u00039f\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008=\u0002\u0009\u0009\u0011\"\u0001`\u0003!\u0019\u0017M\\#rk\u0006dGC\u00011d!\u00099\u0011-\u0003\u0002c\u0011\u00099!i\\8mK\u0006t\u0007bB*^\u0003\u0003\u0005\ra\u0014\u0005\u0008K\u0002\u0009\u0009\u0011\"\u0011g\u0003!A\u0017m\u001d5D_\u0012,G#A\u000b\u0009\u000f!\u0004\u0011\u0011!C!S\u0006AAo\\*ue&tw\rF\u0001C\u0011\u001dY\u0007!!A\u0005B1\u000ca!Z9vC2\u001cHC\u00011n\u0011\u001d\u0019&.!AA\u0002=;qa\u001c\u0002\u0002\u0002#\u0005\u0001/\u0001\u0005NsJ+7m\u001c:e!\u00091\u0013OB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001:\u0014\u0007E\u001cx\u0002E\u0003uoViR%D\u0001v\u0015\u00091\u0008\"A\u0004sk:$\u0018.\\3\n\u0005a,(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)1%\u001dC\u0001uR\u0009\u0001\u000fC\u0004ic\u0006\u0005IQI5\u0009\u000fu\u000c\u0018\u0011!CA}\u0006)\u0011\r\u001d9msR!Qe`A\u0001\u0011\u0015\u0019B\u00101\u0001\u0016\u0011\u0015YB\u00101\u0001\u001e\u0011%\u0009)!]A\u0001\n\u0003\u000b9!A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005%\u0011Q\u0003\u0009\u0006\u000f\u0005-\u0011qB\u0005\u0004\u0003\u001bA!AB(qi&|g\u000eE\u0003\u0008\u0003#)R$C\u0002\u0002\u0014!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u000c\u0003\u0007\u0001\r!J\u0001\u0004q\u0012\u0002\u0004\"CA\u000ec\u0006\u0005I\u0011BA\u000f\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005}\u0001cA\"\u0002\"%\u0019\u00111\u0005#\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "I", null, null);
fv.visitEnd();
