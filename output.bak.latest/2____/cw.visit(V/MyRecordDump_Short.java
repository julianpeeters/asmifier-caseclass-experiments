[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:46:08 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 9:46:34 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002;A\u0011qAH\u0005\u0003?!\u0011Qa\u00155peRD\u0001\"\u0009\u0001\u0003\u0012\u0003\u0006I!H\u0001\u0003q\u0002BQa\u0009\u0001\u0005\u0002\u0011\na\u0001P5oSRtDcA\u0013(QA\u0011a\u0005A\u0007\u0002\u0005!)1C\u0009a\u0001+!)1D\u0009a\u0001;!9!\u0006AA\u0001\n\u0003Y\u0013\u0001B2paf$2!\n\u0017.\u0011\u001d\u0019\u0012\u0006%AA\u0002UAqaG\u0015\u0011\u0002\u0003\u0007Q\u0004C\u00040\u0001E\u0005I\u0011\u0001\u0019\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009\u0011G\u000b\u0002\u0016e-\n1\u0007\u0005\u00025s5\u0009QG\u0003\u00027o\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003q!\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009QTGA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u0010\u0001\u0012\u0002\u0013\u0005Q(\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003yR#!\u0008\u001a\u0009\u000f\u0001\u0003\u0011\u0011!C!\u0003\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0011\u0009\u0003\u0007\"k\u0011\u0001\u0012\u0006\u0003\u000b\u001a\u000bA\u0001\\1oO*\u0009q)\u0001\u0003kCZ\u000c\u0017BA%E\u0005\u0019\u0019FO]5oO\"91\nAA\u0001\n\u0003a\u0015\u0001\u00049s_\u0012,8\r^!sSRLX#A'\u0011\u0005\u001dq\u0015BA(\u0009\u0005\rIe\u000e\u001e\u0005\u0008#\u0002\u0009\u0009\u0011\"\u0001S\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"a\u0015,\u0011\u0005\u001d!\u0016BA+\u0009\u0005\r\u0009e.\u001f\u0005\u0008/B\u000b\u0009\u00111\u0001N\u0003\rAH%\r\u0005\u00083\u0002\u0009\u0009\u0011\"\u0011[\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#A.\u0011\u0007q{6+D\u0001^\u0015\u0009q\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!\u0001Y/\u0003\u0011%#XM]1u_JDqA\u0019\u0001\u0002\u0002\u0013\u00051-\u0001\u0005dC:,\u0015/^1m)\u0009!w\r\u0005\u0002\u0008K&\u0011a\r\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d9\u0016-!AA\u0002MCq!\u001b\u0001\u0002\u0002\u0013\u0005#.\u0001\u0005iCND7i\u001c3f)\u0005i\u0005b\u00027\u0001\u0003\u0003%\u0009%\\\u0001\u0009i>\u001cFO]5oOR\u0009!\u0009C\u0004p\u0001\u0005\u0005I\u0011\u00099\u0002\r\u0015\u000cX/\u00197t)\u0009!\u0017\u000fC\u0004X]\u0006\u0005\u0009\u0019A*\u0008\u000fM\u0014\u0011\u0011!E\u0001i\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002'k\u001a9\u0011AAA\u0001\u0012\u000318cA;x\u001fA)\u0001p_\u000b\u001eK5\u0009\u0011P\u0003\u0002{\u0011\u00059!/\u001e8uS6,\u0017B\u0001?z\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0006GU$\u0009A \u000b\u0002i\"9A.^A\u0001\n\u000bj\u0007\"CA\u0002k\u0006\u0005I\u0011QA\u0003\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0015)\u0013qAA\u0005\u0011\u0019\u0019\u0012\u0011\u0001a\u0001+!11$!\u0001A\u0002uA\u0011\"!\u0004v\u0003\u0003%\u0009)a\u0004\u0002\u000fUt\u0017\r\u001d9msR!\u0011\u0011CA\u000f!\u00159\u00111CA\u000c\u0013\r\u0009)\u0002\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u000b\u001d\u0009I\"F\u000f\n\u0007\u0005m\u0001B\u0001\u0004UkBdWM\r\u0005\u0008\u0003?\u0009Y\u00011\u0001&\u0003\rAH\u0005\r\u0005\n\u0003G)\u0018\u0011!C\u0005\u0003K\u00091B]3bIJ+7o\u001c7wKR\u0011\u0011q\u0005\u0009\u0004\u0007\u0006%\u0012bAA\u0016\u0009\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
