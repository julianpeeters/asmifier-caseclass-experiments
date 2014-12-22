[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:57:56 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:58:30 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0003GY>\u000cG\u000f\u0003\u0005\u001a\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005IX#A\u000f\u0011\u0005\u001dq\u0012BA\u0010\u0009\u0005\u0011\u0011\u0015\u0010^3\u0009\u0011\u0005\u0002!\u0011#Q\u0001\nu\u0009!!\u001f\u0011\u0009\u000b\r\u0002A\u0011\u0001\u0013\u0002\rqJg.\u001b;?)\r)s\u0005\u000b\u0009\u0003M\u0001i\u0011A\u0001\u0005\u0006'\u0009\u0002\r!\u0006\u0005\u00067\u0009\u0002\r!\u0008\u0005\u0008U\u0001\u0009\u0009\u0011\"\u0001,\u0003\u0011\u0019w\u000e]=\u0015\u0007\u0015bS\u0006C\u0004\u0014SA\u0005\u0009\u0019A\u000b\u0009\u000fmI\u0003\u0013!a\u0001;!9q\u0006AI\u0001\n\u0003\u0001\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002c)\u0012QCM\u0016\u0002gA\u0011A'O\u0007\u0002k)\u0011agN\u0001\nk:\u001c\u0007.Z2lK\u0012T!\u0001\u000f\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002;k\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000fq\u0002\u0011\u0013!C\u0001{\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\u0012T#\u0001 +\u0005u\u0011\u0004b\u0002!\u0001\u0003\u0003%\u0009%Q\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003\u0009\u0003\"a\u0011%\u000e\u0003\u0011S!!\u0012$\u0002\u00091\u000cgn\u001a\u0006\u0002\u000f\u0006!!.\u0019<b\u0013\u0009IEI\u0001\u0004TiJLgn\u001a\u0005\u0008\u0017\u0002\u0009\u0009\u0011\"\u0001M\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005i\u0005CA\u0004O\u0013\u0009y\u0005BA\u0002J]RDq!\u0015\u0001\u0002\u0002\u0013\u0005!+\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005M3\u0006CA\u0004U\u0013\u0009)\u0006BA\u0002B]fDqa\u0016)\u0002\u0002\u0003\u0007Q*A\u0002yIEBq!\u0017\u0001\u0002\u0002\u0013\u0005#,A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005Y\u0006c\u0001/`'6\u0009QL\u0003\u0002_\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005\u0001l&\u0001C%uKJ\u000cGo\u001c:\u0009\u000f\u0009\u0004\u0011\u0011!C\u0001G\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002eOB\u0011q!Z\u0005\u0003M\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004XC\u0006\u0005\u0009\u0019A*\u0009\u000f%\u0004\u0011\u0011!C!U\u0006A\u0001.Y:i\u0007>$W\rF\u0001N\u0011\u001da\u0007!!A\u0005B5\u000c\u0001\u0002^8TiJLgn\u001a\u000b\u0002\u0005\"9q\u000eAA\u0001\n\u0003\u0002\u0018AB3rk\u0006d7\u000f\u0006\u0002ec\"9qK\\A\u0001\u0002\u0004\u0019vaB:\u0003\u0003\u0003E\u0009\u0001^\u0001\u0009\u001bf\u0014VmY8sIB\u0011a%\u001e\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0001w'\r)xo\u0004\u0009\u0006qn,R$J\u0007\u0002s*\u0011!\u0010C\u0001\u0008eVtG/[7f\u0013\u0009a\u0018PA\u0009BEN$(/Y2u\rVt7\r^5p]JBQaI;\u0005\u0002y$\u0012\u0001\u001e\u0005\u0008YV\u000c\u0009\u0011\"\u0012n\u0011%\u0009\u0019!^A\u0001\n\u0003\u000b)!A\u0003baBd\u0017\u0010F\u0003&\u0003\u000f\u0009I\u0001\u0003\u0004\u0014\u0003\u0003\u0001\r!\u0006\u0005\u00077\u0005\u0005\u0001\u0019A\u000f\u0009\u0013\u00055Q/!A\u0005\u0002\u0006=\u0011aB;oCB\u0004H.\u001f\u000b\u0005\u0003#\u0009i\u0002E\u0003\u0008\u0003'\u00099\"C\u0002\u0002\u0016!\u0011aa\u00149uS>t\u0007#B\u0004\u0002\u001aUi\u0012bAA\u000e\u0011\u00091A+\u001e9mKJBq!a\u0008\u0002\u000c\u0001\u0007Q%A\u0002yIAB\u0011\"a\u0009v\u0003\u0003%I!!\n\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003O\u00012aQA\u0015\u0013\r\u0009Y\u0003\u0012\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "F", null, null);
fv.visitEnd();
