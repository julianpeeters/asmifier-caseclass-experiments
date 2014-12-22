[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 10:01:42 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 10:02:14 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002B]fD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001H\u0001\u0002sV\u0009Q\u0004\u0005\u0002\u0008=%\u0011q\u0004\u0003\u0002\u0005\u0005f$X\r\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u001e\u0003\u0009I\u0008\u0005C\u0003$\u0001\u0011\u0005A%\u0001\u0004=S:LGO\u0010\u000b\u0004K\u001dB\u0003C\u0001\u0014\u0001\u001b\u0005\u0011\u0001\"B\n#\u0001\u0004)\u0002\"B\u000e#\u0001\u0004i\u0002b\u0002\u0016\u0001\u0003\u0003%\u0009aK\u0001\u0005G>\u0004\u0018\u0010F\u0002&Y5BqaE\u0015\u0011\u0002\u0003\u0007Q\u0003C\u0004\u001cSA\u0005\u0009\u0019A\u000f\u0009\u000f=\u0002\u0011\u0013!C\u0001a\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u0019+\u0005U\u00114&A\u001a\u0011\u0005QJT\"A\u001b\u000b\u0005Y:\u0014!C;oG\",7m[3e\u0015\u0009A\u0004\"\u0001\u0006b]:|G/\u0019;j_:L!AO\u001b\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004=\u0001E\u0005I\u0011A\u001f\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u0009aH\u000b\u0002\u001ee!9\u0001\u0009AA\u0001\n\u0003\n\u0015!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001C!\u0009\u0019\u0005*D\u0001E\u0015\u0009)e)\u0001\u0003mC:<'\"A$\u0002\u0009)\u000cg/Y\u0005\u0003\u0013\u0012\u0013aa\u0015;sS:<\u0007bB&\u0001\u0003\u0003%\u0009\u0001T\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002\u001bB\u0011qAT\u0005\u0003\u001f\"\u00111!\u00138u\u0011\u001d\u0009\u0006!!A\u0005\u0002I\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002\u0016'\"9A\u000bUA\u0001\u0002\u0004i\u0015a\u0001=%c!9a\u000bAA\u0001\n\u0003:\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003a\u00032!\u0017/\u0016\u001b\u0005Q&BA.\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003;j\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008?\u0002\u0009\u0009\u0011\"\u0001a\u0003!\u0019\u0017M\\#rk\u0006dGCA1e!\u00099!-\u0003\u0002d\u0011\u00099!i\\8mK\u0006t\u0007b\u0002+_\u0003\u0003\u0005\r!\u0006\u0005\u0008M\u0002\u0009\u0009\u0011\"\u0011h\u0003!A\u0017m\u001d5D_\u0012,G#A'\u0009\u000f%\u0004\u0011\u0011!C!U\u0006AAo\\*ue&tw\rF\u0001C\u0011\u001da\u0007!!A\u0005B5\u000ca!Z9vC2\u001cHCA1o\u0011\u001d!6.!AA\u0002U9q\u0001\u001d\u0002\u0002\u0002#\u0005\u0011/\u0001\u0005NsJ+7m\u001c:e!\u00091#OB\u0004\u0002\u0005\u0005\u0005\u0009\u0012A:\u0014\u0007I$x\u0002E\u0003vqViR%D\u0001w\u0015\u00099\u0008\"A\u0004sk:$\u0018.\\3\n\u0005e4(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)1E\u001dC\u0001wR\u0009\u0011\u000fC\u0004je\u0006\u0005IQ\u00096\u0009\u000fy\u0014\u0018\u0011!CA\u0006)\u0011\r\u001d9msR)Q%!\u0001\u0002\u0004!)1# a\u0001+!)1$ a\u0001;!I\u0011q\u0001:\u0002\u0002\u0013\u0005\u0015\u0011B\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009Y!a\u0006\u0011\u000b\u001d\u0009i!!\u0005\n\u0007\u0005=\u0001B\u0001\u0004PaRLwN\u001c\u0009\u0006\u000f\u0005MQ#H\u0005\u0004\u0003+A!A\u0002+va2,'\u0007C\u0004\u0002\u001a\u0005\u0015\u0001\u0019A\u0013\u0002\u0007a$\u0003\u0007C\u0005\u0002\u001eI\u000c\u0009\u0011\"\u0003\u0002 \u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009\u0009\u0003E\u0002D\u0003GI1!!\nE\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
