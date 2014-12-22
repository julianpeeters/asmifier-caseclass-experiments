[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:40:02 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:40:34 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001c\u001b\u00059\"B\u0001\r\u001a\u0003\u0011a\u0017M\\4\u000b\u0003i\u0009AA[1wC&\u0011Ad\u0006\u0002\u0007\u001f\nTWm\u0019;\u0009\u0011y\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011\u0001\u0002!Q3A\u0005\u0002\u0005\n\u0011!_\u000b\u0002EA\u00111E\n\u0008\u0003\u000f\u0011J!!\n\u0005\u0002\rA\u0013X\rZ3g\u0013\u00099\u0003F\u0001\u0004TiJLgn\u001a\u0006\u0003K!A\u0001B\u000b\u0001\u0003\u0012\u0003\u0006IAI\u0001\u0003s\u0002BQ\u0001\u000c\u0001\u0005\u00025\na\u0001P5oSRtDc\u0001\u00181cA\u0011q\u0006A\u0007\u0002\u0005!)1c\u000ba\u0001+!)\u0001e\u000ba\u0001E!91\u0007AA\u0001\n\u0003!\u0014\u0001B2paf$2AL\u001b7\u0011\u001d\u0019\"\u0007%AA\u0002UAq\u0001\u0009\u001a\u0011\u0002\u0003\u0007!\u0005C\u00049\u0001E\u0005I\u0011A\u001d\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009!H\u000b\u0002\u0016w-\nA\u0008\u0005\u0002>\u00056\u0009aH\u0003\u0002@\u0001\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003\u0003\"\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009\u0019eHA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq!\u0012\u0001\u0012\u0002\u0013\u0005a)\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003\u001dS#AI\u001e\u0009\u000f%\u0003\u0011\u0011!C!\u0015\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012a\u0013\u0009\u0003-1K!aJ\u000c\u0009\u000f9\u0003\u0011\u0011!C\u0001\u001f\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009\u0001\u000b\u0005\u0002\u0008#&\u0011!\u000b\u0003\u0002\u0004\u0013:$\u0008b\u0002+\u0001\u0003\u0003%\u0009!V\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u00091\u0016\u000c\u0005\u0002\u0008/&\u0011\u0001\u000c\u0003\u0002\u0004\u0003:L\u0008b\u0002.T\u0003\u0003\u0005\r\u0001U\u0001\u0004q\u0012\n\u0004b\u0002/\u0001\u0003\u0003%\u0009%X\u0001\u0010aJ|G-^2u\u0013R,'/\u0019;peV\u0009a\u000cE\u0002`EZk\u0011\u0001\u0019\u0006\u0003C\"\u0009!bY8mY\u0016\u001cG/[8o\u0013\u0009\u0019\u0007M\u0001\u0005Ji\u0016\u0014\u0018\r^8s\u0011\u001d)\u0007!!A\u0005\u0002\u0019\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003O*\u0004\"a\u00025\n\u0005%D!a\u0002\"p_2,\u0017M\u001c\u0005\u00085\u0012\u000c\u0009\u00111\u0001W\u0011\u001da\u0007!!A\u0005B5\u000c\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002!\"9q\u000eAA\u0001\n\u0003\u0002\u0018\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003-CqA\u001d\u0001\u0002\u0002\u0013\u00053/\u0001\u0004fcV\u000cGn\u001d\u000b\u0003ORDqAW9\u0002\u0002\u0003\u0007akB\u0004w\u0005\u0005\u0005\u0009\u0012A<\u0002\u00115K(+Z2pe\u0012\u0004\"a\u000c=\u0007\u000f\u0005\u0011\u0011\u0011!E\u0001sN\u0019\u0001P_\u0008\u0011\u000bmtXC\u0009\u0018\u000e\u0003qT!! \u0005\u0002\u000fI,h\u000e^5nK&\u0011q\u0010 \u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u0014\u0004B\u0002\u0017y\u0009\u0003\u0009\u0019\u0001F\u0001x\u0011\u001dy\u00070!A\u0005FAD\u0011\"!\u0003y\u0003\u0003%\u0009)a\u0003\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000b9\ni!a\u0004\u0009\rM\u00099\u00011\u0001\u0016\u0011\u0019\u0001\u0013q\u0001a\u0001E!I\u00111\u0003=\u0002\u0002\u0013\u0005\u0015QC\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u00099\"a\u0009\u0011\u000b\u001d\u0009I\"!\u0008\n\u0007\u0005m\u0001B\u0001\u0004PaRLwN\u001c\u0009\u0006\u000f\u0005}QCI\u0005\u0004\u0003CA!A\u0002+va2,'\u0007C\u0004\u0002&\u0005E\u0001\u0019\u0001\u0018\u0002\u0007a$\u0003\u0007C\u0005\u0002*a\u000c\u0009\u0011\"\u0003\u0002,\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0005)\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
