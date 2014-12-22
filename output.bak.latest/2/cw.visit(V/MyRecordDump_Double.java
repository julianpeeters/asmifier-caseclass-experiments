[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:34:21 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 29 s, completed Sep 3, 2013 9:34:56 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0004E_V\u0014G.\u001a\u0005\u00093\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0001\u0010\u0009\u0005\u00097\u0001\u0011)\u001a!C\u00019\u0005\u0009\u00110F\u0001\u001e!\u0009q\u0012E\u0004\u0002\u0008?%\u0011\u0001\u0005C\u0001\u0007!J,G-\u001a4\n\u0005\u0009\u001a#AB*ue&twM\u0003\u0002!\u0011!AQ\u0005\u0001B\u0009B\u0003%Q$\u0001\u0002zA!)q\u0005\u0001C\u0001Q\u00051A(\u001b8jiz\"2!K\u0016-!\u0009Q\u0003!D\u0001\u0003\u0011\u0015\u0019b\u00051\u0001\u0016\u0011\u0015Yb\u00051\u0001\u001e\u0011\u001dq\u0003!!A\u0005\u0002=\nAaY8qsR\u0019\u0011\u0006M\u0019\u0009\u000fMi\u0003\u0013!a\u0001+!91$\u000cI\u0001\u0002\u0004i\u0002bB\u001a\u0001#\u0003%\u0009\u0001N\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005)$FA\u000b7W\u00059\u0004C\u0001\u001d>\u001b\u0005I$B\u0001\u001e<\u0003%)hn\u00195fG.,GM\u0003\u0002=\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005yJ$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0001\u0009AI\u0001\n\u0003\u0009\u0015AD2paf$C-\u001a4bk2$HEM\u000b\u0002\u0005*\u0012QD\u000e\u0005\u0008\u0009\u0002\u0009\u0009\u0011\"\u0011F\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009a\u0009\u0005\u0002H\u00196\u0009\u0001J\u0003\u0002J\u0015\u0006!A.\u00198h\u0015\u0005Y\u0015\u0001\u00026bm\u0006L!A\u0009%\u0009\u000f9\u0003\u0011\u0011!C\u0001\u001f\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009\u0001\u000b\u0005\u0002\u0008#&\u0011!\u000b\u0003\u0002\u0004\u0013:$\u0008b\u0002+\u0001\u0003\u0003%\u0009!V\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u00091\u0016\u000c\u0005\u0002\u0008/&\u0011\u0001\u000c\u0003\u0002\u0004\u0003:L\u0008b\u0002.T\u0003\u0003\u0005\r\u0001U\u0001\u0004q\u0012\n\u0004b\u0002/\u0001\u0003\u0003%\u0009%X\u0001\u0010aJ|G-^2u\u0013R,'/\u0019;peV\u0009a\u000cE\u0002`EZk\u0011\u0001\u0019\u0006\u0003C\"\u0009!bY8mY\u0016\u001cG/[8o\u0013\u0009\u0019\u0007M\u0001\u0005Ji\u0016\u0014\u0018\r^8s\u0011\u001d)\u0007!!A\u0005\u0002\u0019\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003O*\u0004\"a\u00025\n\u0005%D!a\u0002\"p_2,\u0017M\u001c\u0005\u00085\u0012\u000c\u0009\u00111\u0001W\u0011\u001da\u0007!!A\u0005B5\u000c\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002!\"9q\u000eAA\u0001\n\u0003\u0002\u0018\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003\u0019CqA\u001d\u0001\u0002\u0002\u0013\u00053/\u0001\u0004fcV\u000cGn\u001d\u000b\u0003ORDqAW9\u0002\u0002\u0003\u0007akB\u0004w\u0005\u0005\u0005\u0009\u0012A<\u0002\u00115K(+Z2pe\u0012\u0004\"A\u000b=\u0007\u000f\u0005\u0011\u0011\u0011!E\u0001sN\u0019\u0001P_\u0008\u0011\u000bmtX#H\u0015\u000e\u0003qT!! \u0005\u0002\u000fI,h\u000e^5nK&\u0011q\u0010 \u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u0014\u0004BB\u0014y\u0009\u0003\u0009\u0019\u0001F\u0001x\u0011\u001dy\u00070!A\u0005FAD\u0011\"!\u0003y\u0003\u0003%\u0009)a\u0003\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000b%\ni!a\u0004\u0009\rM\u00099\u00011\u0001\u0016\u0011\u0019Y\u0012q\u0001a\u0001;!I\u00111\u0003=\u0002\u0002\u0013\u0005\u0015QC\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u00099\"a\u0009\u0011\u000b\u001d\u0009I\"!\u0008\n\u0007\u0005m\u0001B\u0001\u0004PaRLwN\u001c\u0009\u0006\u000f\u0005}Q#H\u0005\u0004\u0003CA!A\u0002+va2,'\u0007C\u0004\u0002&\u0005E\u0001\u0019A\u0015\u0002\u0007a$\u0003\u0007C\u0005\u0002*a\u000c\u0009\u0011\"\u0003\u0002,\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009i\u0003E\u0002H\u0003_I1!!\rI\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "D", null, null);
fv.visitEnd();
