[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:20:00 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 29 s, completed Sep 5, 2013 11:20:36 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005]b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002J]RD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001H\u0001\u0002sV\u0009Q\u0004\u0005\u0002\u0008=%\u0011q\u0004\u0003\u0002\u0008\u001d>$\u0008.\u001b8h\u0011!\u0009\u0003A!E!\u0002\u0013i\u0012AA=!\u0011!\u0019\u0003A!f\u0001\n\u0003!\u0012!\u0001>\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nU\u0009!A\u001f\u0011\u0009\u000b\u001d\u0002A\u0011\u0001\u0015\u0002\rqJg.\u001b;?)\u0011I3\u0006L\u0017\u0011\u0005)\u0002Q\"\u0001\u0002\u0009\u000bM1\u0003\u0019A\u000b\u0009\u000bm1\u0003\u0019A\u000f\u0009\u000b\r2\u0003\u0019A\u000b\u0009\u000f=\u0002\u0011\u0011!C\u0001a\u0005!1m\u001c9z)\u0011I\u0013GM\u001a\u0009\u000fMq\u0003\u0013!a\u0001+!91D\u000cI\u0001\u0002\u0004i\u0002bB\u0012/!\u0003\u0005\r!\u0006\u0005\u0008k\u0001\u0009\n\u0011\"\u00017\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012a\u000e\u0016\u0003+aZ\u0013!\u000f\u0009\u0003u}j\u0011a\u000f\u0006\u0003yu\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005yB\u0011AC1o]>$\u0018\r^5p]&\u0011\u0001i\u000f\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002\"\u0001#\u0003%\u0009aQ\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133+\u0005!%FA\u000f9\u0011\u001d1\u0005!%A\u0005\u0002Y\nabY8qs\u0012\"WMZ1vYR$3\u0007C\u0004I\u0001\u0005\u0005I\u0011I%\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005Q\u0005CA&Q\u001b\u0005a%BA'O\u0003\u0011a\u0017M\\4\u000b\u0003=\u000bAA[1wC&\u0011\u0011\u000b\u0014\u0002\u0007'R\u0014\u0018N\\4\u0009\u000fM\u0003\u0011\u0011!C\u0001)\u0005a\u0001O]8ek\u000e$\u0018I]5us\"9Q\u000bAA\u0001\n\u00031\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003/j\u0003\"a\u0002-\n\u0005eC!aA!os\"91\u000cVA\u0001\u0002\u0004)\u0012a\u0001=%c!9Q\u000cAA\u0001\n\u0003r\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003}\u00032\u0001Y2X\u001b\u0005\u0009'B\u00012\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003I\u0006\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008M\u0002\u0009\u0009\u0011\"\u0001h\u0003!\u0019\u0017M\\#rk\u0006dGC\u00015l!\u00099\u0011.\u0003\u0002k\u0011\u00099!i\\8mK\u0006t\u0007bB.f\u0003\u0003\u0005\ra\u0016\u0005\u0008[\u0002\u0009\u0009\u0011\"\u0011o\u0003!A\u0017m\u001d5D_\u0012,G#A\u000b\u0009\u000fA\u0004\u0011\u0011!C!c\u0006AAo\\*ue&tw\rF\u0001K\u0011\u001d\u0019\u0008!!A\u0005BQ\u000ca!Z9vC2\u001cHC\u00015v\u0011\u001dY&/!AA\u0002];qa\u001e\u0002\u0002\u0002#\u0005\u00010\u0001\u0005NsJ+7m\u001c:e!\u0009Q\u0013PB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001>\u0014\u0007e\\x\u0002\u0005\u0004}ViR#K\u0007\u0002{*\u0011a\u0010C\u0001\u0008eVtG/[7f\u0013\r\u0009\u0009! \u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u001c\u0004BB\u0014z\u0009\u0003\u0009)\u0001F\u0001y\u0011\u001d\u0001\u00180!A\u0005FED\u0011\"a\u0003z\u0003\u0003%\u0009)!\u0004\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000f%\ny!!\u0005\u0002\u0014!11#!\u0003A\u0002UAaaGA\u0005\u0001\u0004i\u0002BB\u0012\u0002\n\u0001\u0007Q\u0003C\u0005\u0002\u0018e\u000c\u0009\u0011\"!\u0002\u001a\u00059QO\\1qa2LH\u0003BA\u000e\u0003O\u0001RaBA\u000f\u0003CI1!a\u0008\u0009\u0005\u0019y\u0005\u000f^5p]B1q!a\u0009\u0016;UI1!!\n\u0009\u0005\u0019!V\u000f\u001d7fg!9\u0011\u0011FA\u000b\u0001\u0004I\u0013a\u0001=%a!I\u0011QF=\u0002\u0002\u0013%\u0011qF\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u00022A\u00191*a\r\n\u0007\u0005UBJ\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "I", null, null);
fv.visitEnd();
