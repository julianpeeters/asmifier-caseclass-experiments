[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:28:01 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 20 s, completed Sep 2, 2013 9:28:26 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005%a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0004E_V\u0014G.\u001a\u0005\u00093\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0001\u0010\u0009\u0005\u00067\u0001!\u0009\u0001H\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0005uy\u0002C\u0001\u0010\u0001\u001b\u0005\u0011\u0001\"B\n\u001b\u0001\u0004)\u0002bB\u0011\u0001\u0003\u0003%\u0009AI\u0001\u0005G>\u0004\u0018\u0010\u0006\u0002\u001eG!91\u0003\u0009I\u0001\u0002\u0004)\u0002bB\u0013\u0001#\u0003%\u0009AJ\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u00059#FA\u000b)W\u0005I\u0003C\u0001\u00160\u001b\u0005Y#B\u0001\u0017.\u0003%)hn\u00195fG.,GM\u0003\u0002/\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005AZ#!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9!\u0007AA\u0001\n\u0003\u001a\u0014!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u00015!\u0009)$(D\u00017\u0015\u00099\u0004(\u0001\u0003mC:<'\"A\u001d\u0002\u0009)\u000cg/Y\u0005\u0003wY\u0012aa\u0015;sS:<\u0007bB\u001f\u0001\u0003\u0003%\u0009AP\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002A\u0011q\u0001Q\u0005\u0003\u0003\"\u00111!\u00138u\u0011\u001d\u0019\u0005!!A\u0005\u0002\u0011\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002F\u0011B\u0011qAR\u0005\u0003\u000f\"\u00111!\u00118z\u0011\u001dI%)!AA\u0002}\n1\u0001\u001f\u00132\u0011\u001dY\u0005!!A\u0005B1\u000bq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u0002\u001bB\u0019a*U#\u000e\u0003=S!\u0001\u0015\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002S\u001f\nA\u0011\n^3sCR|'\u000fC\u0004U\u0001\u0005\u0005I\u0011A+\u0002\u0011\r\u000cg.R9vC2$\"AV-\u0011\u0005\u001d9\u0016B\u0001-\u0009\u0005\u001d\u0011un\u001c7fC:Dq!S*\u0002\u0002\u0003\u0007Q\u0009C\u0004\\\u0001\u0005\u0005I\u0011\u0009/\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012a\u0010\u0005\u0008=\u0002\u0009\u0009\u0011\"\u0011`\u0003!!xn\u0015;sS:<G#\u0001\u001b\u0009\u000f\u0005\u0004\u0011\u0011!C!E\u00061Q-];bYN$\"AV2\u0009\u000f%\u0003\u0017\u0011!a\u0001\u000b\u001e9QMAA\u0001\u0012\u00031\u0017\u0001C'z%\u0016\u001cwN\u001d3\u0011\u0005y9gaB\u0001\u0003\u0003\u0003E\u0009\u0001[\n\u0004O&|\u0001\u0003\u00026n+ui\u0011a\u001b\u0006\u0003Y\"\u0009qA];oi&lW-\u0003\u0002oW\n\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u0019\u0009\u000bm9G\u0011\u00019\u0015\u0003\u0019DqAX4\u0002\u0002\u0013\u0015s\u000cC\u0004tO\u0006\u0005I\u0011\u0011;\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u0005u)\u0008\"B\ns\u0001\u0004)\u0002bB<h\u0003\u0003%\u0009\u0009_\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0009IH\u0010E\u0002\u0008uVI!a\u001f\u0005\u0003\r=\u0003H/[8o\u0011\u0015ih\u000f1\u0001\u001e\u0003\rAH\u0005\r\u0005\u0009\u001e\u000c\u0009\u0011\"\u0003\u0002\u0002\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009\u0019\u0001E\u00026\u0003\u000bI1!a\u00027\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "D", null, null);
fv.visitEnd();
