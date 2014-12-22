[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:40:39 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 8:41:04 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0005c\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003CA\u0004$\u0013\u0009!\u0003BA\u0002J]RD\u0001B\n\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001\u0002\u000b\u0001\u0003\u0016\u0004%\u0009!K\u0001\u0002sV\u0009!\u0006\u0005\u0002\u0008W%\u0011A\u0006\u0003\u0002\u0008\u001d>$\u0008.\u001b8h\u0011!q\u0003A!E!\u0002\u0013Q\u0013AA=!\u0011\u0015\u0001\u0004\u0001\"\u00012\u0003\u0019a\u0014N\\5u}Q\u0019!\u0007N\u001b\u0011\u0005M\u0002Q\"\u0001\u0002\u0009\u000bMy\u0003\u0019A\u000b\u0009\u000b!z\u0003\u0019\u0001\u0016\u0009\u000f]\u0002\u0011\u0011!C\u0001q\u0005!1m\u001c9z)\r\u0011\u0014H\u000f\u0005\u0008'Y\u0002\n\u00111\u0001\u0016\u0011\u001dAc\u0007%AA\u0002)Bq\u0001\u0010\u0001\u0012\u0002\u0013\u0005Q(\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003yR#!F ,\u0003\u0001\u0003\"!\u0011$\u000e\u0003\u0009S!a\u0011#\u0002\u0013Ut7\r[3dW\u0016$'BA#\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003\u000f\n\u0013\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001dI\u0005!%A\u0005\u0002)\u000babY8qs\u0012\"WMZ1vYR$#'F\u0001LU\u0009Qs\u0008C\u0004N\u0001\u0005\u0005I\u0011\u0009(\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005y\u0005C\u0001)V\u001b\u0005\u0009&B\u0001*T\u0003\u0011a\u0017M\\4\u000b\u0003Q\u000bAA[1wC&\u0011a+\u0015\u0002\u0007'R\u0014\u0018N\\4\u0009\u000fa\u0003\u0011\u0011!C\u00013\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009!\u0005C\u0004\\\u0001\u0005\u0005I\u0011\u0001/\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011Q\u000c\u0019\u0009\u0003\u000fyK!a\u0018\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004b5\u0006\u0005\u0009\u0019\u0001\u0012\u0002\u0007a$\u0013\u0007C\u0004d\u0001\u0005\u0005I\u0011\u00093\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012!\u001a\u0009\u0004M&lV\"A4\u000b\u0005!D\u0011AC2pY2,7\r^5p]&\u0011!n\u001a\u0002\u0009\u0013R,'/\u0019;pe\"9A\u000eAA\u0001\n\u0003i\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u00059\u000c\u0008CA\u0004p\u0013\u0009\u0001\u0008BA\u0004C_>dW-\u00198\u0009\u000f\u0005\\\u0017\u0011!a\u0001;\"91\u000fAA\u0001\n\u0003\"\u0018\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003\u0009BqA\u001e\u0001\u0002\u0002\u0013\u0005s/\u0001\u0005u_N#(/\u001b8h)\u0005y\u0005bB=\u0001\u0003\u0003%\u0009E_\u0001\u0007KF,\u0018\r\\:\u0015\u00059\\\u0008bB1y\u0003\u0003\u0005\r!X\u0004\u0008{\n\u0009\u0009\u0011#\u0001\u0003!i\u0015PU3d_J$\u0007CA\u001a\u0000\r!\u0009!!!A\u0009\u0002\u0005\u00051\u0003B@\u0002\u0004=\u0001r!!\u0002\u0002\u000cUQ#'\u0004\u0002\u0002\u0008)\u0019\u0011\u0011\u0002\u0005\u0002\u000fI,h\u000e^5nK&!\u0011QBA\u0004\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0007a}$\u0009!!\u0005\u0015\u0003yDqA^@\u0002\u0002\u0013\u0015s\u000fC\u0005\u0002\u0018}\u000c\u0009\u0011\"!\u0002\u001a\u0005)\u0011\r\u001d9msR)!'a\u0007\u0002\u001e!11#!\u0006A\u0002UAa\u0001KA\u000b\u0001\u0004Q\u0003\"CA\u0011\u0006\u0005I\u0011QA\u0012\u0003\u001d)h.\u00199qYf$B!!\n\u00022A)q!a\n\u0002,%\u0019\u0011\u0011\u0006\u0005\u0003\r=\u0003H/[8o!\u00159\u0011QF\u000b+\u0013\r\u0009y\u0003\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\u000f\u0005M\u0012q\u0004a\u0001e\u0005\u0019\u0001\u0010\n\u0019\u0009\u0013\u0005]r0!A\u0005\n\u0005e\u0012a\u0003:fC\u0012\u0014Vm]8mm\u0016$\"!a\u000f\u0011\u0007A\u000bi$C\u0002\u0002@E\u0013aa\u00142kK\u000e$\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;", null);
fv.visitEnd();
