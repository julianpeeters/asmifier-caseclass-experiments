[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:26:25 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 2, 2013 9:26:51 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0005a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002J]RD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002BQa\u0007\u0001\u0005\u0002q\u0009a\u0001P5oSRtDCA\u000f !\u0009q\u0002!D\u0001\u0003\u0011\u0015\u0019\"\u00041\u0001\u0016\u0011\u001d\u0009\u0003!!A\u0005\u0002\u0009\nAaY8qsR\u0011Qd\u0009\u0005\u0008'\u0001\u0002\n\u00111\u0001\u0016\u0011\u001d)\u0003!%A\u0005\u0002\u0019\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u0001(U\u0009)\u0002fK\u0001*!\u0009Qs&D\u0001,\u0015\u0009aS&A\u0005v]\u000eDWmY6fI*\u0011a\u0006C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001\u0019,\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008e\u0001\u0009\u0009\u0011\"\u00114\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009A\u0007\u0005\u00026u5\u0009aG\u0003\u00028q\u0005!A.\u00198h\u0015\u0005I\u0014\u0001\u00026bm\u0006L!a\u000f\u001c\u0003\rM#(/\u001b8h\u0011\u001di\u0004!!A\u0005\u0002Q\u0009A\u0002\u001d:pIV\u001cG/\u0011:jifDqa\u0010\u0001\u0002\u0002\u0013\u0005\u0001)\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005\u0005#\u0005CA\u0004C\u0013\u0009\u0019\u0005BA\u0002B]fDq!\u0012 \u0002\u0002\u0003\u0007Q#A\u0002yIEBqa\u0012\u0001\u0002\u0002\u0013\u0005\u0003*A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005I\u0005c\u0001&N\u00036\u00091J\u0003\u0002M\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u00059[%\u0001C%uKJ\u000cGo\u001c:\u0009\u000fA\u0003\u0011\u0011!C\u0001#\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002S+B\u0011qaU\u0005\u0003)\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004F\u001f\u0006\u0005\u0009\u0019A!\u0009\u000f]\u0003\u0011\u0011!C!1\u0006A\u0001.Y:i\u0007>$W\rF\u0001\u0016\u0011\u001dQ\u0006!!A\u0005Bm\u000b\u0001\u0002^8TiJLgn\u001a\u000b\u0002i!9Q\u000cAA\u0001\n\u0003r\u0016AB3rk\u0006d7\u000f\u0006\u0002S?\"9Q\u0009XA\u0001\u0002\u0004\u0009uaB1\u0003\u0003\u0003E\u0009AY\u0001\u0009\u001bf\u0014VmY8sIB\u0011ad\u0019\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0001e'\r\u0019Wm\u0004\u0009\u0005M&,R$D\u0001h\u0015\u0009A\u0007\"A\u0004sk:$\u0018.\\3\n\u0005)<'!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oc!)1d\u0019C\u0001YR\u0009!\rC\u0004[G\u0006\u0005IQI.\u0009\u000f=\u001c\u0017\u0011!CAa\u0006)\u0011\r\u001d9msR\u0011Q$\u001d\u0005\u0006'9\u0004\r!\u0006\u0005\u0008g\u000e\u000c\u0009\u0011\"!u\u0003\u001d)h.\u00199qYf$\"!\u001e=\u0011\u0007\u001d1X#\u0003\u0002x\u0011\u00091q\n\u001d;j_:DQ!\u001f:A\u0002u\u00091\u0001\u001f\u00131\u0011\u001dY8-!A\u0005\nq\u000c1B]3bIJ+7o\u001c7wKR\u0009Q\u0010\u0005\u00026}&\u0011qP\u000e\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "I", null, null);
fv.visitEnd();
