[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:26:12 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 27 s, completed Sep 5, 2013 11:26:44 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002Q\u0009\u0011!\u001f\u0005\u0009;\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0011\u0010\u0009\u0005\u0009?\u0001\u0011)\u001a!C\u0001)\u0005\u0009!\u0010\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009Q\u0008\u0005C\u0003$\u0001\u0011\u0005A%\u0001\u0004=S:LGO\u0010\u000b\u0005K\u001dB\u0013\u0006\u0005\u0002'\u00015\u0009!\u0001C\u0003\u0014E\u0001\u0007Q\u0003C\u0003\u001cE\u0001\u0007Q\u0003C\u0003 E\u0001\u0007Q\u0003C\u0004,\u0001\u0005\u0005I\u0011\u0001\u0017\u0002\u0009\r|\u0007/\u001f\u000b\u0005K5rs\u0006C\u0004\u0014UA\u0005\u0009\u0019A\u000b\u0009\u000fmQ\u0003\u0013!a\u0001+!9qD\u000bI\u0001\u0002\u0004)\u0002bB\u0019\u0001#\u0003%\u0009AM\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005\u0019$FA\u000b5W\u0005)\u0004C\u0001\u001c<\u001b\u00059$B\u0001\u001d:\u0003%)hn\u00195fG.,GM\u0003\u0002;\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005q:$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9a\u0008AI\u0001\n\u0003\u0011\u0014AD2paf$C-\u001a4bk2$HE\r\u0005\u0008\u0001\u0002\u0009\n\u0011\"\u00013\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIMBqA\u0011\u0001\u0002\u0002\u0013\u00053)A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002\u0009B\u0011QIS\u0007\u0002\r*\u0011q\u0009S\u0001\u0005Y\u0006twMC\u0001J\u0003\u0011Q\u0017M^1\n\u0005-3%AB*ue&tw\rC\u0004N\u0001\u0005\u0005I\u0011\u0001(\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003=\u0003\"a\u0002)\n\u0005EC!aA%oi\"91\u000bAA\u0001\n\u0003!\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003+b\u0003\"a\u0002,\n\u0005]C!aA!os\"9\u0011LUA\u0001\u0002\u0004y\u0015a\u0001=%c!91\u000cAA\u0001\n\u0003b\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003u\u00032AX1V\u001b\u0005y&B\u00011\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003E~\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008I\u0002\u0009\u0009\u0011\"\u0001f\u0003!\u0019\u0017M\\#rk\u0006dGC\u00014j!\u00099q-\u0003\u0002i\u0011\u00099!i\\8mK\u0006t\u0007bB-d\u0003\u0003\u0005\r!\u0016\u0005\u0008W\u0002\u0009\u0009\u0011\"\u0011m\u0003!A\u0017m\u001d5D_\u0012,G#A(\u0009\u000f9\u0004\u0011\u0011!C!_\u0006AAo\\*ue&tw\rF\u0001E\u0011\u001d\u0009\u0008!!A\u0005BI\u000ca!Z9vC2\u001cHC\u00014t\u0011\u001dI\u0006/!AA\u0002U;q!\u001e\u0002\u0002\u0002#\u0005a/\u0001\u0005NsJ+7m\u001c:e!\u00091sOB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001=\u0014\u0007]Lx\u0002\u0005\u0004{{V)R#J\u0007\u0002w*\u0011A\u0010C\u0001\u0008eVtG/[7f\u0013\u0009q8PA\u0009BEN$(/Y2u\rVt7\r^5p]NBaaI<\u0005\u0002\u0005\u0005A#\u0001<\u0009\u000f9<\u0018\u0011!C#_\"I\u0011qA<\u0002\u0002\u0013\u0005\u0015\u0011B\u0001\u0006CB\u0004H.\u001f\u000b\u0008K\u0005-\u0011QBA\u0008\u0011\u0019\u0019\u0012Q\u0001a\u0001+!11$!\u0002A\u0002UAaaHA\u0003\u0001\u0004)\u0002\"CA\no\u0006\u0005I\u0011QA\u000b\u0003\u001d)h.\u00199qYf$B!a\u0006\u0002$A)q!!\u0007\u0002\u001e%\u0019\u00111\u0004\u0005\u0003\r=\u0003H/[8o!\u00199\u0011qD\u000b\u0016+%\u0019\u0011\u0011\u0005\u0005\u0003\rQ+\u0008\u000f\\34\u0011\u001d\u0009)#!\u0005A\u0002\u0015\n1\u0001\u001f\u00131\u0011%\u0009Ic^A\u0001\n\u0013\u0009Y#A\u0006sK\u0006$'+Z:pYZ,GCAA\u0017!\r)\u0015qF\u0005\u0004\u0003c1%AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
