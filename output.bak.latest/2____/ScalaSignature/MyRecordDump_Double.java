[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:48:13 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 9:48:40 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002;A\u0011qAH\u0005\u0003?!\u0011a\u0001R8vE2,\u0007\u0002C\u0011\u0001\u0005#\u0005\u000b\u0011B\u000f\u0002\u0005a\u0004\u0003\"B\u0012\u0001\u0009\u0003!\u0013A\u0002\u001fj]&$h\u0008F\u0002&O!\u0002\"A\n\u0001\u000e\u0003\u0009AQa\u0005\u0012A\u0002UAQa\u0007\u0012A\u0002uAqA\u000b\u0001\u0002\u0002\u0013\u00051&\u0001\u0003d_BLHcA\u0013-[!91#\u000bI\u0001\u0002\u0004)\u0002bB\u000e*!\u0003\u0005\r!\u0008\u0005\u0008_\u0001\u0009\n\u0011\"\u00011\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012!\r\u0016\u0003+IZ\u0013a\r\u0009\u0003iej\u0011!\u000e\u0006\u0003m]\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005aB\u0011AC1o]>$\u0018\r^5p]&\u0011!(\u000e\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002\u001f\u0001#\u0003%\u0009!P\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133+\u0005q$FA\u000f3\u0011\u001d\u0001\u0005!!A\u0005B\u0005\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001\"\u0011\u0005\rCU\"\u0001#\u000b\u0005\u00153\u0015\u0001\u00027b]\u001eT\u0011aR\u0001\u0005U\u00064\u0018-\u0003\u0002J\u0009\n11\u000b\u001e:j]\u001eDqa\u0013\u0001\u0002\u0002\u0013\u0005A*\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001N!\u00099a*\u0003\u0002P\u0011\u0009\u0019\u0011J\u001c;\u0009\u000fE\u0003\u0011\u0011!C\u0001%\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA*W!\u00099A+\u0003\u0002V\u0011\u0009\u0019\u0011I\\=\u0009\u000f]\u0003\u0016\u0011!a\u0001\u001b\u0006\u0019\u0001\u0010J\u0019\u0009\u000fe\u0003\u0011\u0011!C!5\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001\\!\ravlU\u0007\u0002;*\u0011a\u000cC\u0001\u000bG>dG.Z2uS>t\u0017B\u00011^\u0005!IE/\u001a:bi>\u0014\u0008b\u00022\u0001\u0003\u0003%\u0009aY\u0001\u0009G\u0006tW)];bYR\u0011Am\u001a\u0009\u0003\u000f\u0015L!A\u001a\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9q+YA\u0001\u0002\u0004\u0019\u0006bB5\u0001\u0003\u0003%\u0009E[\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009Q\nC\u0004m\u0001\u0005\u0005I\u0011I7\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012A\u0011\u0005\u0008_\u0002\u0009\u0009\u0011\"\u0011q\u0003\u0019)\u0017/^1mgR\u0011A-\u001d\u0005\u0008/:\u000c\u0009\u00111\u0001T\u000f\u001d\u0019(!!A\u0009\u0002Q\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003MU4q!\u0001\u0002\u0002\u0002#\u0005aoE\u0002vo>\u0001R\u0001_>\u0016;\u0015j\u0011!\u001f\u0006\u0003u\"\u0009qA];oi&lW-\u0003\u0002}s\n\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\u001c\u001a\u0009\u000b\r*H\u0011\u0001@\u0015\u0003QDq\u0001\\;\u0002\u0002\u0013\u0015S\u000eC\u0005\u0002\u0004U\u000c\u0009\u0011\"!\u0002\u0006\u0005)\u0011\r\u001d9msR)Q%a\u0002\u0002\n!11#!\u0001A\u0002UAaaGA\u0001\u0001\u0004i\u0002\"CA\u0007k\u0006\u0005I\u0011QA\u0008\u0003\u001d)h.\u00199qYf$B!!\u0005\u0002\u001eA)q!a\u0005\u0002\u0018%\u0019\u0011Q\u0003\u0005\u0003\r=\u0003H/[8o!\u00159\u0011\u0011D\u000b\u001e\u0013\r\u0009Y\u0002\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\u000f\u0005}\u00111\u0002a\u0001K\u0005\u0019\u0001\u0010\n\u0019\u0009\u0013\u0005\rR/!A\u0005\n\u0005\u0015\u0012a\u0003:fC\u0012\u0014Vm]8mm\u0016$\"!a\n\u0011\u0007\r\u000bI#C\u0002\u0002,\u0011\u0013aa\u00142kK\u000e$\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
