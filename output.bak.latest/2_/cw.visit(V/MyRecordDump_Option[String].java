[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 10:05:29 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 10:06:01 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Ub\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005eabBA\u0004\u001b\u0013\u0009Y\u0002\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003;y\u0011aa\u0015;sS:<'BA\u000e\u0009\u0011!\u0001\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!\u0011\u0003A!f\u0001\n\u0003\u0019\u0013!A=\u0016\u0003\u0011\u0002\"aB\u0013\n\u0005\u0019B!\u0001\u0002\"zi\u0016D\u0001\u0002\u000b\u0001\u0003\u0012\u0003\u0006I\u0001J\u0001\u0003s\u0002BQA\u000b\u0001\u0005\u0002-\na\u0001P5oSRtDc\u0001\u0017/_A\u0011Q\u0006A\u0007\u0002\u0005!)1#\u000ba\u0001+!)!%\u000ba\u0001I!9\u0011\u0007AA\u0001\n\u0003\u0011\u0014\u0001B2paf$2\u0001L\u001a5\u0011\u001d\u0019\u0002\u0007%AA\u0002UAqA\u0009\u0019\u0011\u0002\u0003\u0007A\u0005C\u00047\u0001E\u0005I\u0011A\u001c\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009\u0001H\u000b\u0002\u0016s-\n!\u0008\u0005\u0002<\u00016\u0009AH\u0003\u0002>}\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003!\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009\u0009EHA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dqa\u0011\u0001\u0012\u0002\u0013\u0005A)\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003\u0015S#\u0001J\u001d\u0009\u000f\u001d\u0003\u0011\u0011!C!\u0011\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012!\u0013\u0009\u0003\u0015>k\u0011a\u0013\u0006\u0003\u00196\u000bA\u0001\\1oO*\u0009a*\u0001\u0003kCZ\u000c\u0017BA\u000fL\u0011\u001d\u0009\u0006!!A\u0005\u0002I\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012a\u0015\u0009\u0003\u000fQK!!\u0016\u0005\u0003\u0007%sG\u000fC\u0004X\u0001\u0005\u0005I\u0011\u0001-\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011\u0011\u000c\u0018\u0009\u0003\u000fiK!a\u0017\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004^-\u0006\u0005\u0009\u0019A*\u0002\u0007a$\u0013\u0007C\u0004`\u0001\u0005\u0005I\u0011\u00091\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012!\u0019\u0009\u0004E\u0016LV\"A2\u000b\u0005\u0011D\u0011AC2pY2,7\r^5p]&\u0011am\u0019\u0002\u0009\u0013R,'/\u0019;pe\"9\u0001\u000eAA\u0001\n\u0003I\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005)l\u0007CA\u0004l\u0013\u0009a\u0007BA\u0004C_>dW-\u00198\u0009\u000fu;\u0017\u0011!a\u00013\"9q\u000eAA\u0001\n\u0003\u0002\u0018\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003MCqA\u001d\u0001\u0002\u0002\u0013\u00053/\u0001\u0005u_N#(/\u001b8h)\u0005I\u0005bB;\u0001\u0003\u0003%\u0009E^\u0001\u0007KF,\u0018\r\\:\u0015\u0005)<\u0008bB/u\u0003\u0003\u0005\r!W\u0004\u0008s\n\u0009\u0009\u0011#\u0001{\u0003!i\u0015PU3d_J$\u0007CA\u0017|\r\u001d\u0009!!!A\u0009\u0002q\u001c2a_?\u0010!\u0019q\u00181A\u000b%Y5\u0009qPC\u0002\u0002\u0002!\u0009qA];oi&lW-C\u0002\u0002\u0006}\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c83\u0011\u0019Q3\u0010\"\u0001\u0002\nQ\u0009!\u0010C\u0004sw\u0006\u0005IQI:\u0009\u0013\u0005=10!A\u0005\u0002\u0006E\u0011!B1qa2LH#\u0002\u0017\u0002\u0014\u0005U\u0001BB\n\u0002\u000e\u0001\u0007Q\u0003\u0003\u0004#\u0003\u001b\u0001\r\u0001\n\u0005\n\u00033Y\u0018\u0011!CA\u00037\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u001e\u0005\u0015\u0002\u0003B\u0004\u0017\u0003?\u0001RaBA\u0011+\u0011J1!a\u0009\u0009\u0005\u0019!V\u000f\u001d7fe!9\u0011qEA\u000c\u0001\u0004a\u0013a\u0001=%a!I\u00111F>\u0002\u0002\u0013%\u0011QF\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u00020A\u0019!*!\r\n\u0007\u0005M2J\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/String;>;", null);
fv.visitEnd();
