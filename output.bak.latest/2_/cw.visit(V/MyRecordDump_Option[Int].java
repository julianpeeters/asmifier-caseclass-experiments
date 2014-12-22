[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 10:06:07 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 10:06:39 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005%b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005\u001dI\u0012B\u0001\u000e\u0009\u0005\rIe\u000e\u001e\u0005\u00099\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0001\u0010\u0009\u0005\u0009=\u0001\u0011)\u001a!C\u0001?\u0005\u0009\u00110F\u0001!!\u00099\u0011%\u0003\u0002#\u0011\u0009!!)\u001f;f\u0011!!\u0003A!E!\u0002\u0013\u0001\u0013AA=!\u0011\u00151\u0003\u0001\"\u0001(\u0003\u0019a\u0014N\\5u}Q\u0019\u0001FK\u0016\u0011\u0005%\u0002Q\"\u0001\u0002\u0009\u000bM)\u0003\u0019A\u000b\u0009\u000by)\u0003\u0019\u0001\u0011\u0009\u000f5\u0002\u0011\u0011!C\u0001]\u0005!1m\u001c9z)\rAs\u0006\r\u0005\u0008'1\u0002\n\u00111\u0001\u0016\u0011\u001dqB\u0006%AA\u0002\u0001BqA\r\u0001\u0012\u0002\u0013\u00051'\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003QR#!F\u001b,\u0003Y\u0002\"a\u000e\u001f\u000e\u0003aR!!\u000f\u001e\u0002\u0013Ut7\r[3dW\u0016$'BA\u001e\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003{a\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001dy\u0004!%A\u0005\u0002\u0001\u000babY8qs\u0012\"WMZ1vYR$#'F\u0001BU\u0009\u0001S\u0007C\u0004D\u0001\u0005\u0005I\u0011\u0009#\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005)\u0005C\u0001$L\u001b\u00059%B\u0001%J\u0003\u0011a\u0017M\\4\u000b\u0003)\u000bAA[1wC&\u0011Aj\u0012\u0002\u0007'R\u0014\u0018N\\4\u0009\u000f9\u0003\u0011\u0011!C\u0001\u001f\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009\u0001\u0004C\u0004R\u0001\u0005\u0005I\u0011\u0001*\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u00111K\u0016\u0009\u0003\u000fQK!!\u0016\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004X!\u0006\u0005\u0009\u0019\u0001\r\u0002\u0007a$\u0013\u0007C\u0004Z\u0001\u0005\u0005I\u0011\u0009.\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012a\u0017\u0009\u00049~\u001bV\"A/\u000b\u0005yC\u0011AC2pY2,7\r^5p]&\u0011\u0001-\u0018\u0002\u0009\u0013R,'/\u0019;pe\"9!\rAA\u0001\n\u0003\u0019\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005\u0011<\u0007CA\u0004f\u0013\u00091\u0007BA\u0004C_>dW-\u00198\u0009\u000f]\u000b\u0017\u0011!a\u0001'\"9\u0011\u000eAA\u0001\n\u0003R\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003aAq\u0001\u001c\u0001\u0002\u0002\u0013\u0005S.\u0001\u0005u_N#(/\u001b8h)\u0005)\u0005bB8\u0001\u0003\u0003%\u0009\u0005]\u0001\u0007KF,\u0018\r\\:\u0015\u0005\u0011\u000c\u0008bB,o\u0003\u0003\u0005\raU\u0004\u0008g\n\u0009\u0009\u0011#\u0001u\u0003!i\u0015PU3d_J$\u0007CA\u0015v\r\u001d\u0009!!!A\u0009\u0002Y\u001c2!^<\u0010!\u0015A80\u0006\u0011)\u001b\u0005I(B\u0001>\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!\u0001`=\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007C\u0003'k\u0012\u0005a\u0010F\u0001u\u0011\u001daW/!A\u0005F5D\u0011\"a\u0001v\u0003\u0003%\u0009)!\u0002\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000b!\n9!!\u0003\u0009\rM\u0009\u0009\u00011\u0001\u0016\u0011\u0019q\u0012\u0011\u0001a\u0001A!I\u0011QB;\u0002\u0002\u0013\u0005\u0015qB\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009\u0009\"!\u0007\u0011\u0009\u001d1\u00121\u0003\u0009\u0006\u000f\u0005UQ\u0003I\u0005\u0004\u0003/A!A\u0002+va2,'\u0007C\u0004\u0002\u001c\u0005-\u0001\u0019\u0001\u0015\u0002\u0007a$\u0003\u0007C\u0005\u0002 U\u000c\u0009\u0011\"\u0003\u0002\"\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009\u0019\u0003E\u0002G\u0003KI1!a\nH\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/Object;>;", null);
fv.visitEnd();
