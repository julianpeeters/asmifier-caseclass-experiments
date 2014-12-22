[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:29:32 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 28 s, completed Sep 5, 2013 11:30:07 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005\u001dI\u0012B\u0001\u000e\u0009\u0005\rIe\u000e\u001e\u0005\u00099\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0001\u0010\u0009\u0005\u0009=\u0001\u0011)\u001a!C\u0001?\u0005\u0009\u00110F\u0001!!\u00099\u0011%\u0003\u0002#\u0011\u00099aj\u001c;iS:<\u0007\u0002\u0003\u0013\u0001\u0005#\u0005\u000b\u0011\u0002\u0011\u0002\u0005e\u0004\u0003\u0002\u0003\u0014\u0001\u0005+\u0007I\u0011\u0001\u000b\u0002\u0003iD\u0001\u0002\u000b\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003u\u0002BQA\u000b\u0001\u0005\u0002-\na\u0001P5oSRtD\u0003\u0002\u0017/_A\u0002\"!\u000c\u0001\u000e\u0003\u0009AQaE\u0015A\u0002UAQAH\u0015A\u0002\u0001BQAJ\u0015A\u0002UAqA\r\u0001\u0002\u0002\u0013\u00051'\u0001\u0003d_BLH\u0003\u0002\u00175kYBqaE\u0019\u0011\u0002\u0003\u0007Q\u0003C\u0004\u001fcA\u0005\u0009\u0019\u0001\u0011\u0009\u000f\u0019\n\u0004\u0013!a\u0001+!9\u0001\u0008AI\u0001\n\u0003I\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002u)\u0012QcO\u0016\u0002yA\u0011QHQ\u0007\u0002})\u0011q\u0008Q\u0001\nk:\u001c\u0007.Z2lK\u0012T!!\u0011\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002D}\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000f\u0015\u0003\u0011\u0013!C\u0001\r\u0006q1m\u001c9zI\u0011,g-Y;mi\u0012\u0012T#A$+\u0005\u0001Z\u0004bB%\u0001#\u0003%\u0009!O\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00134\u0011\u001dY\u0005!!A\u0005B1\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#A'\u0011\u00059\u001bV\"A(\u000b\u0005A\u000b\u0016\u0001\u00027b]\u001eT\u0011AU\u0001\u0005U\u00064\u0018-\u0003\u0002U\u001f\n11\u000b\u001e:j]\u001eDqA\u0016\u0001\u0002\u0002\u0013\u0005q+\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001\u0019\u0011\u001dI\u0006!!A\u0005\u0002i\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002\\=B\u0011q\u0001X\u0005\u0003;\"\u00111!\u00118z\u0011\u001dy\u0006,!AA\u0002a\u00091\u0001\u001f\u00132\u0011\u001d\u0009\u0007!!A\u0005B\u0009\u000cq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u0002GB\u0019AmZ.\u000e\u0003\u0015T!A\u001a\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002iK\nA\u0011\n^3sCR|'\u000fC\u0004k\u0001\u0005\u0005I\u0011A6\u0002\u0011\r\u000cg.R9vC2$\"\u0001\\8\u0011\u0005\u001di\u0017B\u00018\u0009\u0005\u001d\u0011un\u001c7fC:DqaX5\u0002\u0002\u0003\u00071\u000cC\u0004r\u0001\u0005\u0005I\u0011\u0009:\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012\u0001\u0007\u0005\u0008i\u0002\u0009\u0009\u0011\"\u0011v\u0003!!xn\u0015;sS:<G#A'\u0009\u000f]\u0004\u0011\u0011!C!q\u00061Q-];bYN$\"\u0001\\=\u0009\u000f}3\u0018\u0011!a\u00017\u001e91PAA\u0001\u0012\u0003a\u0018\u0001C'z%\u0016\u001cwN\u001d3\u0011\u00055jhaB\u0001\u0003\u0003\u0003E\u0009A`\n\u0004{~|\u0001\u0003CA\u0001\u0003\u000f)\u0002%\u0006\u0017\u000e\u0005\u0005\r!bAA\u0003\u0011\u00059!/\u001e8uS6,\u0017\u0002BA\u0005\u0003\u0007\u0011\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c84\u0011\u0019QS\u0010\"\u0001\u0002\u000eQ\u0009A\u0010C\u0004u{\u0006\u0005IQI;\u0009\u0013\u0005MQ0!A\u0005\u0002\u0006U\u0011!B1qa2LHc\u0002\u0017\u0002\u0018\u0005e\u00111\u0004\u0005\u0007'\u0005E\u0001\u0019A\u000b\u0009\ry\u0009\u0009\u00021\u0001!\u0011\u00191\u0013\u0011\u0003a\u0001+!I\u0011qD?\u0002\u0002\u0013\u0005\u0015\u0011E\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009\u0019#a\u000b\u0011\u0009\u001d1\u0012Q\u0005\u0009\u0007\u000f\u0005\u001dR\u0003I\u000b\n\u0007\u0005%\u0002B\u0001\u0004UkBdWm\r\u0005\u0008\u0003[\u0009i\u00021\u0001-\u0003\rAH\u0005\r\u0005\n\u0003ci\u0018\u0011!C\u0005\u0003g\u00091B]3bIJ+7o\u001c7wKR\u0011\u0011Q\u0007\u0009\u0004\u001d\u0006]\u0012bAA\u001d\u001f\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/Object;>;", null);
fv.visitEnd();
