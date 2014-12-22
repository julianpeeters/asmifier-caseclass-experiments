[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:55:20 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 27 s, completed Sep 3, 2013 9:55:53 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0005b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0003CsR,\u0007\u0002C\r\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005a\u0004\u0003\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000b\u0002\u0003eD\u0001\"\u0008\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003s\u0002BQa\u0008\u0001\u0005\u0002\u0001\na\u0001P5oSRtDcA\u0011$IA\u0011!\u0005A\u0007\u0002\u0005!)1C\u0008a\u0001+!)1D\u0008a\u0001+!9a\u0005AA\u0001\n\u00039\u0013\u0001B2paf$2!\u0009\u0015*\u0011\u001d\u0019R\u0005%AA\u0002UAqaG\u0013\u0011\u0002\u0003\u0007Q\u0003C\u0004,\u0001E\u0005I\u0011\u0001\u0017\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009QF\u000b\u0002\u0016]-\nq\u0006\u0005\u00021k5\u0009\u0011G\u0003\u00023g\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003i!\u0009!\"\u00198o_R\u000cG/[8o\u0013\u00091\u0014GA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u000f\u0001\u0012\u0002\u0013\u0005A&\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0009\u000fi\u0002\u0011\u0011!C!w\u0005i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012\u0001\u0010\u0009\u0003{\u0009k\u0011A\u0010\u0006\u0003\u0001\u000bA\u0001\\1oO*\u0009\u0011)\u0001\u0003kCZ\u000c\u0017BA\"?\u0005\u0019\u0019FO]5oO\"9Q\u0009AA\u0001\n\u00031\u0015\u0001\u00049s_\u0012,8\r^!sSRLX#A$\u0011\u0005\u001dA\u0015BA%\u0009\u0005\rIe\u000e\u001e\u0005\u0008\u0017\u0002\u0009\u0009\u0011\"\u0001M\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"!\u0014)\u0011\u0005\u001dq\u0015BA(\u0009\u0005\r\u0009e.\u001f\u0005\u0008#*\u000b\u0009\u00111\u0001H\u0003\rAH%\r\u0005\u0008'\u0002\u0009\u0009\u0011\"\u0011U\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#A+\u0011\u0007YKV*D\u0001X\u0015\u0009A\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!AW,\u0003\u0011%#XM]1u_JDq\u0001\u0018\u0001\u0002\u0002\u0013\u0005Q,\u0001\u0005dC:,\u0015/^1m)\u0009q\u0016\r\u0005\u0002\u0008?&\u0011\u0001\r\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d\u00096,!AA\u00025Cqa\u0019\u0001\u0002\u0002\u0013\u0005C-\u0001\u0005iCND7i\u001c3f)\u00059\u0005b\u00024\u0001\u0003\u0003%\u0009eZ\u0001\u0009i>\u001cFO]5oOR\u0009A\u0008C\u0004j\u0001\u0005\u0005I\u0011\u00096\u0002\r\u0015\u000cX/\u00197t)\u0009q6\u000eC\u0004RQ\u0006\u0005\u0009\u0019A'\u0008\u000f5\u0014\u0011\u0011!E\u0001]\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002#_\u001a9\u0011AAA\u0001\u0012\u0003\u00018cA8r\u001fA)!/^\u000b\u0016C5\u00091O\u0003\u0002u\u0011\u00059!/\u001e8uS6,\u0017B\u0001<t\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0006?=$\u0009\u0001\u001f\u000b\u0002]\"9am\\A\u0001\n\u000b:\u0007bB>p\u0003\u0003%\u0009\u0009`\u0001\u0006CB\u0004H.\u001f\u000b\u0004Cut\u0008\"B\n{\u0001\u0004)\u0002\"B\u000e{\u0001\u0004)\u0002\"CA\u0001_\u0006\u0005I\u0011QA\u0002\u0003\u001d)h.\u00199qYf$B!!\u0002\u0002\u0012A)q!a\u0002\u0002\u000c%\u0019\u0011\u0011\u0002\u0005\u0003\r=\u0003H/[8o!\u00159\u0011QB\u000b\u0016\u0013\r\u0009y\u0001\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\r\u0005Mq\u00101\u0001\"\u0003\rAH\u0005\r\u0005\n\u0003/y\u0017\u0011!C\u0005\u00033\u00091B]3bIJ+7o\u001c7wKR\u0011\u00111\u0004\u0009\u0004{\u0005u\u0011bAA\u0010}\u00091qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "B", null, null);
fv.visitEnd();
