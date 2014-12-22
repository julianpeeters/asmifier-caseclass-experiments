[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:36:15 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:36:46 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001a\u001d\u00099q#\u0003\u0002\u0019\u0011\u00051\u0001K]3eK\u001aL!AG\u000e\u0003\rM#(/\u001b8h\u0015\u0009A\u0002\u0002\u0003\u0005\u001e\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005 \u0001\u0009U\r\u0011\"\u0001\u0015\u0003\u0005I\u0008\u0002C\u0011\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005e\u0004\u0003\"B\u0012\u0001\u0009\u0003!\u0013A\u0002\u001fj]&$h\u0008F\u0002&O!\u0002\"A\n\u0001\u000e\u0003\u0009AQa\u0005\u0012A\u0002UAQa\u0008\u0012A\u0002UAqA\u000b\u0001\u0002\u0002\u0013\u00051&\u0001\u0003d_BLHcA\u0013-[!91#\u000bI\u0001\u0002\u0004)\u0002bB\u0010*!\u0003\u0005\r!\u0006\u0005\u0008_\u0001\u0009\n\u0011\"\u00011\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012!\r\u0016\u0003+IZ\u0013a\r\u0009\u0003iej\u0011!\u000e\u0006\u0003m]\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005aB\u0011AC1o]>$\u0018\r^5p]&\u0011!(\u000e\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002\u001f\u0001#\u0003%\u0009\u0001M\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133\u0011\u001dq\u0004!!A\u0005B}\nQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001!\u0011\u0005\u00053U\"\u0001\"\u000b\u0005\r#\u0015\u0001\u00027b]\u001eT\u0011!R\u0001\u0005U\u00064\u0018-\u0003\u0002\u001b\u0005\"9\u0001\nAA\u0001\n\u0003I\u0015\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001&\u0011\u0005\u001dY\u0015B\u0001'\u0009\u0005\rIe\u000e\u001e\u0005\u0008\u001d\u0002\u0009\u0009\u0011\"\u0001P\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"\u0001U*\u0011\u0005\u001d\u0009\u0016B\u0001*\u0009\u0005\r\u0009e.\u001f\u0005\u0008)6\u000b\u0009\u00111\u0001K\u0003\rAH%\r\u0005\u0008-\u0002\u0009\u0009\u0011\"\u0011X\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u0001-\u0011\u0007ec\u0006+D\u0001[\u0015\u0009Y\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!!\u0018.\u0003\u0011%#XM]1u_JDqa\u0018\u0001\u0002\u0002\u0013\u0005\u0001-\u0001\u0005dC:,\u0015/^1m)\u0009\u0009G\r\u0005\u0002\u0008E&\u00111\r\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d!f,!AA\u0002ACqA\u001a\u0001\u0002\u0002\u0013\u0005s-\u0001\u0005iCND7i\u001c3f)\u0005Q\u0005bB5\u0001\u0003\u0003%\u0009E[\u0001\u0009i>\u001cFO]5oOR\u0009\u0001\u0009C\u0004m\u0001\u0005\u0005I\u0011I7\u0002\r\u0015\u000cX/\u00197t)\u0009\u0009g\u000eC\u0004UW\u0006\u0005\u0009\u0019\u0001)\u0008\u000fA\u0014\u0011\u0011!E\u0001c\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002'e\u001a9\u0011AAA\u0001\u0012\u0003\u00198c\u0001:u\u001fA)Q\u000f_\u000b\u0016K5\u0009aO\u0003\u0002x\u0011\u00059!/\u001e8uS6,\u0017BA=w\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0006GI$\u0009a\u001f\u000b\u0002c\"9\u0011N]A\u0001\n\u000bR\u0007b\u0002@s\u0003\u0003%\u0009i`\u0001\u0006CB\u0004H.\u001f\u000b\u0006K\u0005\u0005\u00111\u0001\u0005\u0006'u\u0004\r!\u0006\u0005\u0006?u\u0004\r!\u0006\u0005\n\u0003\u000f\u0011\u0018\u0011!CA\u0003\u0013\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u000c\u0005]\u0001#B\u0004\u0002\u000e\u0005E\u0011bAA\u0008\u0011\u00091q\n\u001d;j_:\u0004RaBA\n+UI1!!\u0006\u0009\u0005\u0019!V\u000f\u001d7fe!9\u0011\u0011DA\u0003\u0001\u0004)\u0013a\u0001=%a!I\u0011Q\u0004:\u0002\u0002\u0013%\u0011qD\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002\"A\u0019\u0011)a\u0009\n\u0007\u0005\u0015\"I\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
