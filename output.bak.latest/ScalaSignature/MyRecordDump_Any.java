[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:30:44 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 2, 2013 9:31:11 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\ra\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002B]fD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002BQa\u0007\u0001\u0005\u0002q\u0009a\u0001P5oSRtDCA\u000f !\u0009q\u0002!D\u0001\u0003\u0011\u0015\u0019\"\u00041\u0001\u0016\u0011\u001d\u0009\u0003!!A\u0005\u0002\u0009\nAaY8qsR\u0011Qd\u0009\u0005\u0008'\u0001\u0002\n\u00111\u0001\u0016\u0011\u001d)\u0003!%A\u0005\u0002\u0019\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u0001(U\u0009)\u0002fK\u0001*!\u0009Qs&D\u0001,\u0015\u0009aS&A\u0005v]\u000eDWmY6fI*\u0011a\u0006C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001\u0019,\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008e\u0001\u0009\u0009\u0011\"\u00114\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009A\u0007\u0005\u00026u5\u0009aG\u0003\u00028q\u0005!A.\u00198h\u0015\u0005I\u0014\u0001\u00026bm\u0006L!a\u000f\u001c\u0003\rM#(/\u001b8h\u0011\u001di\u0004!!A\u0005\u0002y\nA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012a\u0010\u0009\u0003\u000f\u0001K!!\u0011\u0005\u0003\u0007%sG\u000fC\u0004D\u0001\u0005\u0005I\u0011\u0001#\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011Q#\u0012\u0005\u0008\r\n\u000b\u0009\u00111\u0001@\u0003\rAH%\r\u0005\u0008\u0011\u0002\u0009\u0009\u0011\"\u0011J\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u0001&\u0011\u0007-sU#D\u0001M\u0015\u0009i\u0005\"\u0001\u0006d_2dWm\u0019;j_:L!a\u0014'\u0003\u0011%#XM]1u_JDq!\u0015\u0001\u0002\u0002\u0013\u0005!+\u0001\u0005dC:,\u0015/^1m)\u0009\u0019f\u000b\u0005\u0002\u0008)&\u0011Q\u000b\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d1\u0005+!AA\u0002UAq\u0001\u0017\u0001\u0002\u0002\u0013\u0005\u0013,\u0001\u0005iCND7i\u001c3f)\u0005y\u0004bB.\u0001\u0003\u0003%\u0009\u0005X\u0001\u0009i>\u001cFO]5oOR\u0009A\u0007C\u0004_\u0001\u0005\u0005I\u0011I0\u0002\r\u0015\u000cX/\u00197t)\u0009\u0019\u0006\rC\u0004G;\u0006\u0005\u0009\u0019A\u000b\u0008\u000f\u0009\u0014\u0011\u0011!E\u0001G\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002\u001fI\u001a9\u0011AAA\u0001\u0012\u0003)7c\u00013g\u001fA!qM[\u000b\u001e\u001b\u0005A'BA5\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!a\u001b5\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t\u0017\u0007C\u0003\u001cI\u0012\u0005Q\u000eF\u0001d\u0011\u001dYF-!A\u0005FqCq\u0001\u001d3\u0002\u0002\u0013\u0005\u0015/A\u0003baBd\u0017\u0010\u0006\u0002\u001ee\")1c\u001ca\u0001+!9A\u000fZA\u0001\n\u0003+\u0018aB;oCB\u0004H.\u001f\u000b\u0003mf\u00042aB<\u0016\u0013\u0009A\u0008B\u0001\u0004PaRLwN\u001c\u0005\u0006uN\u0004\r!H\u0001\u0004q\u0012\u0002\u0004b\u0002?e\u0003\u0003%I!`\u0001\u000ce\u0016\u000cGMU3t_24X\rF\u0001!\u0009)t0C\u0002\u0002\u0002Y\u0012aa\u00142kK\u000e$\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
