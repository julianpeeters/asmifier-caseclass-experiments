[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:33:39 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 29 s, completed Sep 3, 2013 9:34:14 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0003GY>\u000cG\u000f\u0003\u0005\u001a\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005IX#A\u000f\u0011\u0005y\u0009cBA\u0004 \u0013\u0009\u0001\u0003\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003E\r\u0012aa\u0015;sS:<'B\u0001\u0011\u0009\u0011!)\u0003A!E!\u0002\u0013i\u0012AA=!\u0011\u00159\u0003\u0001\"\u0001)\u0003\u0019a\u0014N\\5u}Q\u0019\u0011f\u000b\u0017\u0011\u0005)\u0002Q\"\u0001\u0002\u0009\u000bM1\u0003\u0019A\u000b\u0009\u000bm1\u0003\u0019A\u000f\u0009\u000f9\u0002\u0011\u0011!C\u0001_\u0005!1m\u001c9z)\rI\u0003'\r\u0005\u0008'5\u0002\n\u00111\u0001\u0016\u0011\u001dYR\u0006%AA\u0002uAqa\r\u0001\u0012\u0002\u0013\u0005A'\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003UR#!\u0006\u001c,\u0003]\u0002\"\u0001O\u001f\u000e\u0003eR!AO\u001e\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001f\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003}e\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001d\u0001\u0005!%A\u0005\u0002\u0005\u000babY8qs\u0012\"WMZ1vYR$#'F\u0001CU\u0009ib\u0007C\u0004E\u0001\u0005\u0005I\u0011I#\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u00051\u0005CA$M\u001b\u0005A%BA%K\u0003\u0011a\u0017M\\4\u000b\u0003-\u000bAA[1wC&\u0011!\u0005\u0013\u0005\u0008\u001d\u0002\u0009\u0009\u0011\"\u0001P\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005\u0001\u0006CA\u0004R\u0013\u0009\u0011\u0006BA\u0002J]RDq\u0001\u0016\u0001\u0002\u0002\u0013\u0005Q+\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005YK\u0006CA\u0004X\u0013\u0009A\u0006BA\u0002B]fDqAW*\u0002\u0002\u0003\u0007\u0001+A\u0002yIEBq\u0001\u0018\u0001\u0002\u0002\u0013\u0005S,A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005q\u0006cA0c-6\u0009\u0001M\u0003\u0002b\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005\r\u0004'\u0001C%uKJ\u000cGo\u001c:\u0009\u000f\u0015\u0004\u0011\u0011!C\u0001M\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002hUB\u0011q\u0001[\u0005\u0003S\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004[I\u0006\u0005\u0009\u0019\u0001,\u0009\u000f1\u0004\u0011\u0011!C![\u0006A\u0001.Y:i\u0007>$W\rF\u0001Q\u0011\u001dy\u0007!!A\u0005BA\u000c\u0001\u0002^8TiJLgn\u001a\u000b\u0002\r\"9!\u000fAA\u0001\n\u0003\u001a\u0018AB3rk\u0006d7\u000f\u0006\u0002hi\"9!,]A\u0001\u0002\u00041va\u0002<\u0003\u0003\u0003E\u0009a^\u0001\u0009\u001bf\u0014VmY8sIB\u0011!\u0006\u001f\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0001z'\rA(p\u0004\u0009\u0006wz,R$K\u0007\u0002y*\u0011Q\u0010C\u0001\u0008eVtG/[7f\u0013\u0009yHPA\u0009BEN$(/Y2u\rVt7\r^5p]JBaa\n=\u0005\u0002\u0005\rA#A<\u0009\u000f=D\u0018\u0011!C#a\"I\u0011\u0011\u0002=\u0002\u0002\u0013\u0005\u00151B\u0001\u0006CB\u0004H.\u001f\u000b\u0006S\u00055\u0011q\u0002\u0005\u0007'\u0005\u001d\u0001\u0019A\u000b\u0009\rm\u00099\u00011\u0001\u001e\u0011%\u0009\u0019\u0002_A\u0001\n\u0003\u000b)\"A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005]\u00111\u0005\u0009\u0006\u000f\u0005e\u0011QD\u0005\u0004\u00037A!AB(qi&|g\u000eE\u0003\u0008\u0003?)R$C\u0002\u0002\"!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u0013\u0003#\u0001\r!K\u0001\u0004q\u0012\u0002\u0004\"CA\u0015q\u0006\u0005I\u0011BA\u0016\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u00055\u0002cA$\u00020%\u0019\u0011\u0011\u0007%\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "F", null, null);
fv.visitEnd();
