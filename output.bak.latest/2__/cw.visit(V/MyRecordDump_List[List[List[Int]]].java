[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:41:09 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 8:41:36 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\rc\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003c\u0001\u000c\u001fGA\u0011q\u0001J\u0005\u0003K!\u00111!\u00138u\u0011!9\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!I\u0003A!f\u0001\n\u0003Q\u0013!A=\u0016\u0003-\u0002\"a\u0002\u0017\n\u00055B!a\u0002(pi\"Lgn\u001a\u0005\u0009_\u0001\u0011\u0009\u0012)A\u0005W\u0005\u0011\u0011\u0010\u0009\u0005\u0006c\u0001!\u0009AM\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007M*d\u0007\u0005\u00025\u00015\u0009!\u0001C\u0003\u0014a\u0001\u0007Q\u0003C\u0003*a\u0001\u00071\u0006C\u00049\u0001\u0005\u0005I\u0011A\u001d\u0002\u0009\r|\u0007/\u001f\u000b\u0004giZ\u0004bB\n8!\u0003\u0005\r!\u0006\u0005\u0008S]\u0002\n\u00111\u0001,\u0011\u001di\u0004!%A\u0005\u0002y\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u0001@U\u0009)\u0002iK\u0001B!\u0009\u0011u)D\u0001D\u0015\u0009!U)A\u0005v]\u000eDWmY6fI*\u0011a\u0009C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001%D\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u0015\u0002\u0009\n\u0011\"\u0001L\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012\u0001\u0014\u0016\u0003W\u0001CqA\u0014\u0001\u0002\u0002\u0013\u0005s*A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002!B\u0011\u0011KV\u0007\u0002%*\u00111\u000bV\u0001\u0005Y\u0006twMC\u0001V\u0003\u0011Q\u0017M^1\n\u0005]\u0013&AB*ue&tw\rC\u0004Z\u0001\u0005\u0005I\u0011\u0001.\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\rBq\u0001\u0018\u0001\u0002\u0002\u0013\u0005Q,\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005y\u000b\u0007CA\u0004`\u0013\u0009\u0001\u0007BA\u0002B]fDqAY.\u0002\u0002\u0003\u00071%A\u0002yIEBq\u0001\u001a\u0001\u0002\u0002\u0013\u0005S-A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u00051\u0007cA4k=6\u0009\u0001N\u0003\u0002j\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005-D'\u0001C%uKJ\u000cGo\u001c:\u0009\u000f5\u0004\u0011\u0011!C\u0001]\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002peB\u0011q\u0001]\u0005\u0003c\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004cY\u0006\u0005\u0009\u0019\u00010\u0009\u000fQ\u0004\u0011\u0011!C!k\u0006A\u0001.Y:i\u0007>$W\rF\u0001$\u0011\u001d9\u0008!!A\u0005Ba\u000c\u0001\u0002^8TiJLgn\u001a\u000b\u0002!\"9!\u0010AA\u0001\n\u0003Z\u0018AB3rk\u0006d7\u000f\u0006\u0002py\"9!-_A\u0001\u0002\u0004qva\u0002@\u0003\u0003\u0003E\u0009a`\u0001\u0009\u001bf\u0014VmY8sIB\u0019A'!\u0001\u0007\u0011\u0005\u0011\u0011\u0011!E\u0001\u0003\u0007\u0019R!!\u0001\u0002\u0006=\u0001r!a\u0002\u0002\u000eUY3'\u0004\u0002\u0002\n)\u0019\u00111\u0002\u0005\u0002\u000fI,h\u000e^5nK&!\u0011qBA\u0005\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0008c\u0005\u0005A\u0011AA\n)\u0005y\u0008\u0002C<\u0002\u0002\u0005\u0005IQ\u0009=\u0009\u0015\u0005e\u0011\u0011AA\u0001\n\u0003\u000bY\"A\u0003baBd\u0017\u0010F\u00034\u0003;\u0009y\u0002\u0003\u0004\u0014\u0003/\u0001\r!\u0006\u0005\u0007S\u0005]\u0001\u0019A\u0016\u0009\u0015\u0005\r\u0012\u0011AA\u0001\n\u0003\u000b)#A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005\u001d\u00121\u0007\u0009\u0006\u000f\u0005%\u0012QF\u0005\u0004\u0003WA!AB(qi&|g\u000eE\u0003\u0008\u0003_)2&C\u0002\u00022!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u001b\u0003C\u0001\raM\u0001\u0004q\u0012\u0002\u0004BCA\u001d\u0003\u0003\u0009\u0009\u0011\"\u0003\u0002<\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009i\u0004E\u0002R\u0003I1!!\u0011S\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
