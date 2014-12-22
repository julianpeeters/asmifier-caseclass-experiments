[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 10:07:22 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 10:07:53 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0003\u000f\u0009J!a\u0009\u0005\u0003\u0007%sG\u000f\u0003\u0005&\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005(\u0001\u0009U\r\u0011\"\u0001)\u0003\u0005IX#A\u0015\u0011\u0005\u001dQ\u0013BA\u0016\u0009\u0005\u0011\u0011\u0015\u0010^3\u0009\u00115\u0002!\u0011#Q\u0001\n%\n!!\u001f\u0011\u0009\u000b=\u0002A\u0011\u0001\u0019\u0002\rqJg.\u001b;?)\r\u00094\u0007\u000e\u0009\u0003e\u0001i\u0011A\u0001\u0005\u0006'9\u0002\r!\u0006\u0005\u0006O9\u0002\r!\u000b\u0005\u0008m\u0001\u0009\u0009\u0011\"\u00018\u0003\u0011\u0019w\u000e]=\u0015\u0007EB\u0014\u0008C\u0004\u0014kA\u0005\u0009\u0019A\u000b\u0009\u000f\u001d*\u0004\u0013!a\u0001S!91\u0008AI\u0001\n\u0003a\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002{)\u0012QCP\u0016\u0002A\u0011\u0001)R\u0007\u0002\u0003*\u0011!iQ\u0001\nk:\u001c\u0007.Z2lK\u0012T!\u0001\u0012\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002G\u0003\n\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000f!\u0003\u0011\u0013!C\u0001\u0013\u0006q1m\u001c9zI\u0011,g-Y;mi\u0012\u0012T#\u0001&+\u0005%r\u0004b\u0002'\u0001\u0003\u0003%\u0009%T\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u00039\u0003\"a\u0014+\u000e\u0003AS!!\u0015*\u0002\u00091\u000cgn\u001a\u0006\u0002'\u0006!!.\u0019<b\u0013\u0009)\u0006K\u0001\u0004TiJLgn\u001a\u0005\u0008/\u0002\u0009\u0009\u0011\"\u0001Y\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005\u0009\u0003b\u0002.\u0001\u0003\u0003%\u0009aW\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009av\u000c\u0005\u0002\u0008;&\u0011a\u000c\u0003\u0002\u0004\u0003:L\u0008b\u00021Z\u0003\u0003\u0005\r!I\u0001\u0004q\u0012\n\u0004b\u00022\u0001\u0003\u0003%\u0009eY\u0001\u0010aJ|G-^2u\u0013R,'/\u0019;peV\u0009A\rE\u0002fQrk\u0011A\u001a\u0006\u0003O\"\u0009!bY8mY\u0016\u001cG/[8o\u0013\u0009IgM\u0001\u0005Ji\u0016\u0014\u0018\r^8s\u0011\u001dY\u0007!!A\u0005\u00021\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003[B\u0004\"a\u00028\n\u0005=D!a\u0002\"p_2,\u0017M\u001c\u0005\u0008A*\u000c\u0009\u00111\u0001]\u0011\u001d\u0011\u0008!!A\u0005BM\u000c\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002C!9Q\u000fAA\u0001\n\u00032\u0018\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u00039Cq\u0001\u001f\u0001\u0002\u0002\u0013\u0005\u00130\u0001\u0004fcV\u000cGn\u001d\u000b\u0003[jDq\u0001Y<\u0002\u0002\u0003\u0007AlB\u0004}\u0005\u0005\u0005\u0009\u0012A?\u0002\u00115K(+Z2pe\u0012\u0004\"A\r@\u0007\u000f\u0005\u0011\u0011\u0011!E\u0001N!a0!\u0001\u0010!\u001d\u0009\u0019!!\u0003\u0016SEj!!!\u0002\u000b\u0007\u0005\u001d\u0001\"A\u0004sk:$\u0018.\\3\n\u0009\u0005-\u0011Q\u0001\u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u0014\u0004BB\u0018\u0009\u0003\u0009y\u0001F\u0001~\u0011\u001d)h0!A\u0005FYD\u0011\"!\u0006\u0003\u0003%\u0009)a\u0006\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000bE\nI\"a\u0007\u0009\rM\u0009\u0019\u00021\u0001\u0016\u0011\u00199\u00131\u0003a\u0001S!I\u0011q\u0004@\u0002\u0002\u0013\u0005\u0015\u0011E\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009\u0019#a\u000c\u0011\u000b\u001d\u0009)#!\u000b\n\u0007\u0005\u001d\u0002B\u0001\u0004PaRLwN\u001c\u0009\u0006\u000f\u0005-R#K\u0005\u0004\u0003[A!A\u0002+va2,'\u0007C\u0004\u00022\u0005u\u0001\u0019A\u0019\u0002\u0007a$\u0003\u0007C\u0005\u00026y\u000c\u0009\u0011\"\u0003\u00028\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009I\u0004E\u0002P\u0003wI1!!\u0010Q\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Ljava/lang/Object;>;", null);
fv.visitEnd();
