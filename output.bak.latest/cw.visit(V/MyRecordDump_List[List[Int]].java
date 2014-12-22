[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:36:13 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 2, 2013 9:36:38 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005ua\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003CA\u0004$\u0013\u0009!\u0003BA\u0002J]RD\u0001B\n\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002BQ\u0001\u000b\u0001\u0005\u0002%\na\u0001P5oSRtDC\u0001\u0016-!\u0009Y\u0003!D\u0001\u0003\u0011\u0015\u0019r\u00051\u0001\u0016\u0011\u001dq\u0003!!A\u0005\u0002=\nAaY8qsR\u0011!\u0006\r\u0005\u0008'5\u0002\n\u00111\u0001\u0016\u0011\u001d\u0011\u0004!%A\u0005\u0002M\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u00015U\u0009)RgK\u00017!\u00099D(D\u00019\u0015\u0009I$(A\u0005v]\u000eDWmY6fI*\u00111\u0008C\u0001\u000bC:tw\u000e^1uS>t\u0017BA\u001f9\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u0001\u0009\u0009\u0011\"\u0011A\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009\u0011\u0009\u0005\u0002C\u000f6\u00091I\u0003\u0002E\u000b\u0006!A.\u00198h\u0015\u00051\u0015\u0001\u00026bm\u0006L!\u0001S\"\u0003\rM#(/\u001b8h\u0011\u001dQ\u0005!!A\u0005\u0002-\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012A\u0009\u0005\u0008\u001b\u0002\u0009\u0009\u0011\"\u0001O\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"a\u0014*\u0011\u0005\u001d\u0001\u0016BA)\u0009\u0005\r\u0009e.\u001f\u0005\u0008'2\u000b\u0009\u00111\u0001#\u0003\rAH%\r\u0005\u0008+\u0002\u0009\u0009\u0011\"\u0011W\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#A,\u0011\u0007a[v*D\u0001Z\u0015\u0009Q\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!\u0001X-\u0003\u0011%#XM]1u_JDqA\u0018\u0001\u0002\u0002\u0013\u0005q,\u0001\u0005dC:,\u0015/^1m)\u0009\u00017\r\u0005\u0002\u0008C&\u0011!\r\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d\u0019V,!AA\u0002=Cq!\u001a\u0001\u0002\u0002\u0013\u0005c-\u0001\u0005iCND7i\u001c3f)\u0005\u0011\u0003b\u00025\u0001\u0003\u0003%\u0009%[\u0001\u0009i>\u001cFO]5oOR\u0009\u0011\u0009C\u0004l\u0001\u0005\u0005I\u0011\u00097\u0002\r\u0015\u000cX/\u00197t)\u0009\u0001W\u000eC\u0004TU\u0006\u0005\u0009\u0019A(\u0008\u000f=\u0014\u0011\u0011!E\u0001a\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002,c\u001a9\u0011AAA\u0001\u0012\u0003\u00118cA9t\u001fA!Ao^\u000b+\u001b\u0005)(B\u0001<\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!\u0001_;\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t\u0017\u0007C\u0003)c\u0012\u0005!\u0010F\u0001q\u0011\u001dA\u0017/!A\u0005F%Dq!`9\u0002\u0002\u0013\u0005e0A\u0003baBd\u0017\u0010\u0006\u0002+\")1\u0003 a\u0001+!I\u00111A9\u0002\u0002\u0013\u0005\u0015QA\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u00099!!\u0004\u0011\u0009\u001d\u0009I!F\u0005\u0004\u0003\u0017A!AB(qi&|g\u000eC\u0004\u0002\u0010\u0005\u0005\u0001\u0019\u0001\u0016\u0002\u0007a$\u0003\u0007C\u0005\u0002\u0014E\u000c\u0009\u0011\"\u0003\u0002\u0016\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u00099\u0002E\u0002C\u00033I1!a\u0007D\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;", null);
fv.visitEnd();
