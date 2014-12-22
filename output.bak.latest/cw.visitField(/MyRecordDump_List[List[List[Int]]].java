[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:36:44 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 2, 2013 9:37:10 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003c\u0001\u000c\u001fGA\u0011q\u0001J\u0005\u0003K!\u00111!\u00138u\u0011!9\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011\u0015I\u0003\u0001\"\u0001+\u0003\u0019a\u0014N\\5u}Q\u00111&\u000c\u0009\u0003Y\u0001i\u0011A\u0001\u0005\u0006'!\u0002\r!\u0006\u0005\u0008_\u0001\u0009\u0009\u0011\"\u00011\u0003\u0011\u0019w\u000e]=\u0015\u0005-\n\u0004bB\n/!\u0003\u0005\r!\u0006\u0005\u0008g\u0001\u0009\n\u0011\"\u00015\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012!\u000e\u0016\u0003+YZ\u0013a\u000e\u0009\u0003quj\u0011!\u000f\u0006\u0003um\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005qB\u0011AC1o]>$\u0018\r^5p]&\u0011a(\u000f\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002!\u0001\u0003\u0003%\u0009%Q\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003\u0009\u0003\"a\u0011%\u000e\u0003\u0011S!!\u0012$\u0002\u00091\u000cgn\u001a\u0006\u0002\u000f\u0006!!.\u0019<b\u0013\u0009IEI\u0001\u0004TiJLgn\u001a\u0005\u0008\u0017\u0002\u0009\u0009\u0011\"\u0001M\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005\u0019\u0003b\u0002(\u0001\u0003\u0003%\u0009aT\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009\u00016\u000b\u0005\u0002\u0008#&\u0011!\u000b\u0003\u0002\u0004\u0003:L\u0008b\u0002+N\u0003\u0003\u0005\raI\u0001\u0004q\u0012\n\u0004b\u0002,\u0001\u0003\u0003%\u0009eV\u0001\u0010aJ|G-^2u\u0013R,'/\u0019;peV\u0009\u0001\u000cE\u0002Z9Bk\u0011A\u0017\u0006\u00037\"\u0009!bY8mY\u0016\u001cG/[8o\u0013\u0009i&L\u0001\u0005Ji\u0016\u0014\u0018\r^8s\u0011\u001dy\u0006!!A\u0005\u0002\u0001\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003C\u0012\u0004\"a\u00022\n\u0005\rD!a\u0002\"p_2,\u0017M\u001c\u0005\u0008)z\u000b\u0009\u00111\u0001Q\u0011\u001d1\u0007!!A\u0005B\u001d\u000c\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002G!9\u0011\u000eAA\u0001\n\u0003R\u0017\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003\u0009Cq\u0001\u001c\u0001\u0002\u0002\u0013\u0005S.\u0001\u0004fcV\u000cGn\u001d\u000b\u0003C:Dq\u0001V6\u0002\u0002\u0003\u0007\u0001kB\u0004q\u0005\u0005\u0005\u0009\u0012A9\u0002\u00115K(+Z2pe\u0012\u0004\"\u0001\u000c:\u0007\u000f\u0005\u0011\u0011\u0011!E\u0001gN\u0019!\u000f^\u0008\u0011\u0009UDXcK\u0007\u0002m*\u0011q\u000fC\u0001\u0008eVtG/[7f\u0013\u0009IhOA\u0009BEN$(/Y2u\rVt7\r^5p]FBQ!\u000b:\u0005\u0002m$\u0012!\u001d\u0005\u0008SJ\u000c\u0009\u0011\"\u0012k\u0011\u001dq(/!A\u0005\u0002~\u000cQ!\u00199qYf$2aKA\u0001\u0011\u0015\u0019R\u00101\u0001\u0016\u0011%\u0009)A]A\u0001\n\u0003\u000b9!A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005%\u0011q\u0002\u0009\u0005\u000f\u0005-Q#C\u0002\u0002\u000e!\u0011aa\u00149uS>t\u0007bBA\u0009\u0003\u0007\u0001\raK\u0001\u0004q\u0012\u0002\u0004\"CA\u000be\u0006\u0005I\u0011BA\u000c\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005e\u0001cA\"\u0002\u001c%\u0019\u0011Q\u0004#\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
