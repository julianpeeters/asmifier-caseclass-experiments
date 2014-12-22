[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:10:43 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 9:11:10 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\rc\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003c\u0001\u000c\u001fGA\u0011q\u0001J\u0005\u0003K!\u00111!\u00138u\u0011!9\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!I\u0003A!f\u0001\n\u0003Q\u0013!A=\u0016\u0003-\u0002\"a\u0002\u0017\n\u00055B!\u0001\u0002\"zi\u0016D\u0001b\u000c\u0001\u0003\u0012\u0003\u0006IaK\u0001\u0003s\u0002BQ!\r\u0001\u0005\u0002I\na\u0001P5oSRtDcA\u001a6mA\u0011A\u0007A\u0007\u0002\u0005!)1\u0003\ra\u0001+!)\u0011\u0006\ra\u0001W!9\u0001\u0008AA\u0001\n\u0003I\u0014\u0001B2paf$2a\r\u001e<\u0011\u001d\u0019r\u0007%AA\u0002UAq!K\u001c\u0011\u0002\u0003\u00071\u0006C\u0004>\u0001E\u0005I\u0011\u0001 \u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009qH\u000b\u0002\u0016\u0001.\n\u0011\u0009\u0005\u0002C\u000f6\u00091I\u0003\u0002E\u000b\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003\r\"\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009A5IA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016DqA\u0013\u0001\u0012\u0002\u0013\u00051*\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u00031S#a\u000b!\u0009\u000f9\u0003\u0011\u0011!C!\u001f\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012\u0001\u0015\u0009\u0003#Zk\u0011A\u0015\u0006\u0003'R\u000bA\u0001\\1oO*\u0009Q+\u0001\u0003kCZ\u000c\u0017BA,S\u0005\u0019\u0019FO]5oO\"9\u0011\u000cAA\u0001\n\u0003Q\u0016\u0001\u00049s_\u0012,8\r^!sSRLX#A\u0012\u0009\u000fq\u0003\u0011\u0011!C\u0001;\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HC\u00010b!\u00099q,\u0003\u0002a\u0011\u0009\u0019\u0011I\\=\u0009\u000f\u0009\\\u0016\u0011!a\u0001G\u0005\u0019\u0001\u0010J\u0019\u0009\u000f\u0011\u0004\u0011\u0011!C!K\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001g!\r9'NX\u0007\u0002Q*\u0011\u0011\u000eC\u0001\u000bG>dG.Z2uS>t\u0017BA6i\u0005!IE/\u001a:bi>\u0014\u0008bB7\u0001\u0003\u0003%\u0009A\\\u0001\u0009G\u0006tW)];bYR\u0011qN\u001d\u0009\u0003\u000fAL!!\u001d\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9!\r\\A\u0001\u0002\u0004q\u0006b\u0002;\u0001\u0003\u0003%\u0009%^\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u00091\u0005C\u0004x\u0001\u0005\u0005I\u0011\u0009=\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012\u0001\u0015\u0005\u0008u\u0002\u0009\u0009\u0011\"\u0011|\u0003\u0019)\u0017/^1mgR\u0011q\u000e \u0005\u0008Ef\u000c\u0009\u00111\u0001_\u000f\u001dq(!!A\u0009\u0002}\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0004i\u0005\u0005a\u0001C\u0001\u0003\u0003\u0003E\u0009!a\u0001\u0014\u000b\u0005\u0005\u0011QA\u0008\u0011\u000f\u0005\u001d\u0011QB\u000b,g5\u0011\u0011\u0011\u0002\u0006\u0004\u0003\u0017A\u0011a\u0002:v]RLW.Z\u0005\u0005\u0003\u001f\u0009IAA\u0009BEN$(/Y2u\rVt7\r^5p]JBq!MA\u0001\u0009\u0003\u0009\u0019\u0002F\u0001\u0000\u0011!9\u0018\u0011AA\u0001\n\u000bB\u0008BCA\r\u0003\u0003\u0009\u0009\u0011\"!\u0002\u001c\u0005)\u0011\r\u001d9msR)1'!\u0008\u0002 !11#a\u0006A\u0002UAa!KA\u000c\u0001\u0004Y\u0003BCA\u0012\u0003\u0003\u0009\u0009\u0011\"!\u0002&\u00059QO\\1qa2LH\u0003BA\u0014\u0003g\u0001RaBA\u0015\u0003[I1!a\u000b\u0009\u0005\u0019y\u0005\u000f^5p]B)q!a\u000c\u0016W%\u0019\u0011\u0011\u0007\u0005\u0003\rQ+\u0008\u000f\\33\u0011\u001d\u0009)$!\u0009A\u0002M\n1\u0001\u001f\u00131\u0011)\u0009I$!\u0001\u0002\u0002\u0013%\u00111H\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002>A\u0019\u0011+a\u0010\n\u0007\u0005\u0005#K\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
