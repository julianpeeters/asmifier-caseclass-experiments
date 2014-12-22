[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:42:35 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:43:07 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015c\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012aa\u0015;sK\u0006l'BA\u000f\u0009!\u00099!%\u0003\u0002$\u0011\u0009\u0019\u0011J\u001c;\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011\u001d\u0002!Q3A\u0005\u0002!\n\u0011!_\u000b\u0002SA\u0011!&\u000c\u0008\u0003\u000f-J!\u0001\u000c\u0005\u0002\rA\u0013X\rZ3g\u0013\u0009qsF\u0001\u0004TiJLgn\u001a\u0006\u0003Y!A\u0001\"\r\u0001\u0003\u0012\u0003\u0006I!K\u0001\u0003s\u0002BQa\r\u0001\u0005\u0002Q\na\u0001P5oSRtDcA\u001b8qA\u0011a\u0007A\u0007\u0002\u0005!)1C\ra\u0001+!)qE\ra\u0001S!9!\u0008AA\u0001\n\u0003Y\u0014\u0001B2paf$2!\u000e\u001f>\u0011\u001d\u0019\u0012\u0008%AA\u0002UAqaJ\u001d\u0011\u0002\u0003\u0007\u0011\u0006C\u0004@\u0001E\u0005I\u0011\u0001!\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009\u0011I\u000b\u0002\u0016\u0005.\n1\u0009\u0005\u0002E\u00136\u0009QI\u0003\u0002G\u000f\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003\u0011\"\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009QUIA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u0014\u0001\u0012\u0002\u0013\u0005Q*\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u00039S#!\u000b\"\u0009\u000fA\u0003\u0011\u0011!C!#\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0015\u0009\u0003'bk\u0011\u0001\u0016\u0006\u0003+Z\u000bA\u0001\\1oO*\u0009q+\u0001\u0003kCZ\u000c\u0017B\u0001\u0018U\u0011\u001dQ\u0006!!A\u0005\u0002m\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012!\u0009\u0005\u0008;\u0002\u0009\u0009\u0011\"\u0001_\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"a\u00182\u0011\u0005\u001d\u0001\u0017BA1\u0009\u0005\r\u0009e.\u001f\u0005\u0008Gr\u000b\u0009\u00111\u0001\"\u0003\rAH%\r\u0005\u0008K\u0002\u0009\u0009\u0011\"\u0011g\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#A4\u0011\u0007!\\w,D\u0001j\u0015\u0009Q\u0007\"\u0001\u0006d_2dWm\u0019;j_:L!\u0001\\5\u0003\u0011%#XM]1u_JDqA\u001c\u0001\u0002\u0002\u0013\u0005q.\u0001\u0005dC:,\u0015/^1m)\u0009\u00018\u000f\u0005\u0002\u0008c&\u0011!\u000f\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d\u0019W.!AA\u0002}Cq!\u001e\u0001\u0002\u0002\u0013\u0005c/\u0001\u0005iCND7i\u001c3f)\u0005\u0009\u0003b\u0002=\u0001\u0003\u0003%\u0009%_\u0001\u0009i>\u001cFO]5oOR\u0009!\u000bC\u0004|\u0001\u0005\u0005I\u0011\u0009?\u0002\r\u0015\u000cX/\u00197t)\u0009\u0001X\u0010C\u0004du\u0006\u0005\u0009\u0019A0\u0008\u0011}\u0014\u0011\u0011!E\u0001\u0003\u0003\u0009\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0004m\u0005\ra\u0001C\u0001\u0003\u0003\u0003E\u0009!!\u0002\u0014\u000b\u0005\r\u0011qA\u0008\u0011\u000f\u0005%\u0011qB\u000b*k5\u0011\u00111\u0002\u0006\u0004\u0003\u001bA\u0011a\u0002:v]RLW.Z\u0005\u0005\u0003#\u0009YAA\u0009BEN$(/Y2u\rVt7\r^5p]JBqaMA\u0002\u0009\u0003\u0009)\u0002\u0006\u0002\u0002\u0002!A\u00010a\u0001\u0002\u0002\u0013\u0015\u0013\u0010\u0003\u0006\u0002\u001c\u0005\r\u0011\u0011!CA\u0003;\u0009Q!\u00199qYf$R!NA\u0010\u0003CAaaEA\r\u0001\u0004)\u0002BB\u0014\u0002\u001a\u0001\u0007\u0011\u0006\u0003\u0006\u0002&\u0005\r\u0011\u0011!CA\u0003O\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002*\u0005U\u0002#B\u0004\u0002,\u0005=\u0012bAA\u0017\u0011\u00091q\n\u001d;j_:\u0004RaBA\u0019+%J1!a\r\u0009\u0005\u0019!V\u000f\u001d7fe!9\u0011qGA\u0012\u0001\u0004)\u0014a\u0001=%a!Q\u00111HA\u0002\u0003\u0003%I!!\u0010\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003\u00012aUA!\u0013\r\u0009\u0019\u0005\u0016\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/Stream;", "Lscala/collection/immutable/Stream<Ljava/lang/Object;>;", null);
fv.visitEnd();
