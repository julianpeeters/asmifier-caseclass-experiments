[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:35:02 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:35:35 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004C_>dW-\u00198\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011!_\u000b\u0002;A\u0011a$\u0009\u0008\u0003\u000f}I!\u0001\u0009\u0005\u0002\rA\u0013X\rZ3g\u0013\u0009\u00113E\u0001\u0004TiJLgn\u001a\u0006\u0003A!A\u0001\"\n\u0001\u0003\u0012\u0003\u0006I!H\u0001\u0003s\u0002BQa\n\u0001\u0005\u0002!\na\u0001P5oSRtDcA\u0015,YA\u0011!\u0006A\u0007\u0002\u0005!)1C\na\u0001+!)1D\na\u0001;!9a\u0006AA\u0001\n\u0003y\u0013\u0001B2paf$2!\u000b\u00192\u0011\u001d\u0019R\u0006%AA\u0002UAqaG\u0017\u0011\u0002\u0003\u0007Q\u0004C\u00044\u0001E\u0005I\u0011\u0001\u001b\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009QG\u000b\u0002\u0016m-\nq\u0007\u0005\u00029{5\u0009\u0011H\u0003\u0002;w\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003y!\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009q\u0014HA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u0011\u0001\u0012\u0002\u0013\u0005\u0011)\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003\u0009S#!\u0008\u001c\u0009\u000f\u0011\u0003\u0011\u0011!C!\u000b\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0012\u0009\u0003\u000f2k\u0011\u0001\u0013\u0006\u0003\u0013*\u000bA\u0001\\1oO*\u00091*\u0001\u0003kCZ\u000c\u0017B\u0001\u0012I\u0011\u001dq\u0005!!A\u0005\u0002=\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012\u0001\u0015\u0009\u0003\u000fEK!A\u0015\u0005\u0003\u0007%sG\u000fC\u0004U\u0001\u0005\u0005I\u0011A+\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011a+\u0017\u0009\u0003\u000f]K!\u0001\u0017\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004['\u0006\u0005\u0009\u0019\u0001)\u0002\u0007a$\u0013\u0007C\u0004]\u0001\u0005\u0005I\u0011I/\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012A\u0018\u0009\u0004?\n4V\"\u00011\u000b\u0005\u0005D\u0011AC2pY2,7\r^5p]&\u00111\r\u0019\u0002\u0009\u0013R,'/\u0019;pe\"9Q\rAA\u0001\n\u00031\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005U9\u0007b\u0002.e\u0003\u0003\u0005\rA\u0016\u0005\u0008S\u0002\u0009\u0009\u0011\"\u0011k\u0003!A\u0017m\u001d5D_\u0012,G#\u0001)\u0009\u000f1\u0004\u0011\u0011!C![\u0006AAo\\*ue&tw\rF\u0001G\u0011\u001dy\u0007!!A\u0005BA\u000ca!Z9vC2\u001cHCA\u000br\u0011\u001dQf.!AA\u0002Y;qa\u001d\u0002\u0002\u0002#\u0005A/\u0001\u0005NsJ+7m\u001c:e!\u0009QSOB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001<\u0014\u0007U<x\u0002E\u0003ywVi\u0012&D\u0001z\u0015\u0009Q\u0008\"A\u0004sk:$\u0018.\\3\n\u0005qL(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)q%\u001eC\u0001}R\u0009A\u000fC\u0004mk\u0006\u0005IQI7\u0009\u0013\u0005\rQ/!A\u0005\u0002\u0006\u0015\u0011!B1qa2LH#B\u0015\u0002\u0008\u0005%\u0001BB\n\u0002\u0002\u0001\u0007Q\u0003\u0003\u0004\u001c\u0003\u0003\u0001\r!\u0008\u0005\n\u0003\u001b)\u0018\u0011!CA\u0003\u001f\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u0012\u0005u\u0001#B\u0004\u0002\u0014\u0005]\u0011bAA\u000b\u0011\u00091q\n\u001d;j_:\u0004RaBA\r+uI1!a\u0007\u0009\u0005\u0019!V\u000f\u001d7fe!9\u0011qDA\u0006\u0001\u0004I\u0013a\u0001=%a!I\u00111E;\u0002\u0002\u0013%\u0011QE\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002(A\u0019q)!\u000b\n\u0007\u0005-\u0002J\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Z", null, null);
fv.visitEnd();
