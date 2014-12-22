[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:44:28 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 28 s, completed Sep 3, 2013 9:45:02 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005%c\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003c\u0001\u000c\u001fGA\u0011q\u0001J\u0005\u0003K!\u00111!\u00138u\u0011!9\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!I\u0003A!f\u0001\n\u0003Q\u0013!A=\u0016\u0003-\u0002\"\u0001L\u0018\u000f\u0005\u001di\u0013B\u0001\u0018\u0009\u0003\u0019\u0001&/\u001a3fM&\u0011\u0001'\r\u0002\u0007'R\u0014\u0018N\\4\u000b\u00059B\u0001\u0002C\u001a\u0001\u0005#\u0005\u000b\u0011B\u0016\u0002\u0005e\u0004\u0003\"B\u001b\u0001\u0009\u00031\u0014A\u0002\u001fj]&$h\u0008F\u00028si\u0002\"\u0001\u000f\u0001\u000e\u0003\u0009AQa\u0005\u001bA\u0002UAQ!\u000b\u001bA\u0002-Bq\u0001\u0010\u0001\u0002\u0002\u0013\u0005Q(\u0001\u0003d_BLHcA\u001c?!91c\u000fI\u0001\u0002\u0004)\u0002bB\u0015<!\u0003\u0005\ra\u000b\u0005\u0008\u0003\u0002\u0009\n\u0011\"\u0001C\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012a\u0011\u0016\u0003+\u0011[\u0013!\u0012\u0009\u0003\r.k\u0011a\u0012\u0006\u0003\u0011&\u000b\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005)C\u0011AC1o]>$\u0018\r^5p]&\u0011Aj\u0012\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002(\u0001#\u0003%\u0009aT\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133+\u0005\u0001&FA\u0016E\u0011\u001d\u0011\u0006!!A\u0005BM\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001+\u0011\u0005USV\"\u0001,\u000b\u0005]C\u0016\u0001\u00027b]\u001eT\u0011!W\u0001\u0005U\u00064\u0018-\u0003\u00021-\"9A\u000cAA\u0001\n\u0003i\u0016\u0001\u00049s_\u0012,8\r^!sSRLX#A\u0012\u0009\u000f}\u0003\u0011\u0011!C\u0001A\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA1e!\u00099!-\u0003\u0002d\u0011\u0009\u0019\u0011I\\=\u0009\u000f\u0015t\u0016\u0011!a\u0001G\u0005\u0019\u0001\u0010J\u0019\u0009\u000f\u001d\u0004\u0011\u0011!C!Q\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001j!\rQW.Y\u0007\u0002W*\u0011A\u000eC\u0001\u000bG>dG.Z2uS>t\u0017B\u00018l\u0005!IE/\u001a:bi>\u0014\u0008b\u00029\u0001\u0003\u0003%\u0009!]\u0001\u0009G\u0006tW)];bYR\u0011!/\u001e\u0009\u0003\u000fML!\u0001\u001e\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9Qm\\A\u0001\u0002\u0004\u0009\u0007bB<\u0001\u0003\u0003%\u0009\u0005_\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u00091\u0005C\u0004{\u0001\u0005\u0005I\u0011I>\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012\u0001\u0016\u0005\u0008{\u0002\u0009\u0009\u0011\"\u0011\u0003\u0019)\u0017/^1mgR\u0011!o \u0005\u0008Kr\u000c\u0009\u00111\u0001b\u000f%\u0009\u0019AAA\u0001\u0012\u0003\u0009)!\u0001\u0005NsJ+7m\u001c:e!\rA\u0014q\u0001\u0004\u0009\u0003\u0009\u0009\u0009\u0011#\u0001\u0002\nM)\u0011qAA\u0006\u001fA9\u0011QBA\n+-:TBAA\u0008\u0015\r\u0009\u0009\u0002C\u0001\u0008eVtG/[7f\u0013\u0011\u0009)\"a\u0004\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007C\u00046\u0003\u000f!\u0009!!\u0007\u0015\u0005\u0005\u0015\u0001\u0002\u0003>\u0002\u0008\u0005\u0005IQI>\u0009\u0015\u0005}\u0011qAA\u0001\n\u0003\u000b\u0009#A\u0003baBd\u0017\u0010F\u00038\u0003G\u0009)\u0003\u0003\u0004\u0014\u0003;\u0001\r!\u0006\u0005\u0007S\u0005u\u0001\u0019A\u0016\u0009\u0015\u0005%\u0012qAA\u0001\n\u0003\u000bY#A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u00055\u0012\u0011\u0008\u0009\u0006\u000f\u0005=\u00121G\u0005\u0004\u0003cA!AB(qi&|g\u000eE\u0003\u0008\u0003k)2&C\u0002\u00028!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u001e\u0003O\u0001\raN\u0001\u0004q\u0012\u0002\u0004BCA \u0003\u000f\u0009\u0009\u0011\"\u0003\u0002B\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009\u0019\u0005E\u0002V\u0003\u000bJ1!a\u0012W\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
