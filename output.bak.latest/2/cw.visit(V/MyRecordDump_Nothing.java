[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:38:44 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 27 s, completed Sep 3, 2013 9:39:18 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011!_\u000b\u0002;A\u0011a$\u0009\u0008\u0003\u000f}I!\u0001\u0009\u0005\u0002\rA\u0013X\rZ3g\u0013\u0009\u00113E\u0001\u0004TiJLgn\u001a\u0006\u0003A!A\u0001\"\n\u0001\u0003\u0012\u0003\u0006I!H\u0001\u0003s\u0002BQa\n\u0001\u0005\u0002!\na\u0001P5oSRtDcA\u0015,YA\u0011!\u0006A\u0007\u0002\u0005!)1C\na\u0001+!)1D\na\u0001;!9a\u0006AA\u0001\n\u0003y\u0013\u0001B2paf$2!\u000b\u00192\u0011\u001d\u0019R\u0006%AA\u0002UAqaG\u0017\u0011\u0002\u0003\u0007Q\u0004C\u00044\u0001E\u0005I\u0011\u0001\u001b\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009QG\u000b\u0002\u0016m-\nq\u0007\u0005\u00029{5\u0009\u0011H\u0003\u0002;w\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003y!\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009q\u0014HA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u0011\u0001\u0012\u0002\u0013\u0005\u0011)\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003\u0009S#!\u0008\u001c\u0009\u000f\u0011\u0003\u0011\u0011!C!\u000b\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0012\u0009\u0003\u000f2k\u0011\u0001\u0013\u0006\u0003\u0013*\u000bA\u0001\\1oO*\u00091*\u0001\u0003kCZ\u000c\u0017B\u0001\u0012I\u0011\u001dq\u0005!!A\u0005\u0002=\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012\u0001\u0015\u0009\u0003\u000fEK!A\u0015\u0005\u0003\u0007%sG\u000fC\u0004U\u0001\u0005\u0005I\u0011A+\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011a+\u0017\u0009\u0003\u000f]K!\u0001\u0017\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004['\u0006\u0005\u0009\u0019\u0001)\u0002\u0007a$\u0013\u0007C\u0004]\u0001\u0005\u0005I\u0011I/\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012A\u0018\u0009\u0004?\n4V\"\u00011\u000b\u0005\u0005D\u0011AC2pY2,7\r^5p]&\u00111\r\u0019\u0002\u0009\u0013R,'/\u0019;pe\"9Q\rAA\u0001\n\u00031\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005\u001dT\u0007CA\u0004i\u0013\u0009I\u0007BA\u0004C_>dW-\u00198\u0009\u000fi#\u0017\u0011!a\u0001-\"9A\u000eAA\u0001\n\u0003j\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003ACqa\u001c\u0001\u0002\u0002\u0013\u0005\u0003/\u0001\u0005u_N#(/\u001b8h)\u00051\u0005b\u0002:\u0001\u0003\u0003%\u0009e]\u0001\u0007KF,\u0018\r\\:\u0015\u0005\u001d$\u0008b\u0002.r\u0003\u0003\u0005\rAV\u0004\u0008m\n\u0009\u0009\u0011#\u0001x\u0003!i\u0015PU3d_J$\u0007C\u0001\u0016y\r\u001d\u0009!!!A\u0009\u0002e\u001c2\u0001\u001f>\u0010!\u0015Yh0F\u000f*\u001b\u0005a(BA?\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!a ?\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007\u0003\u0004(q\u0012\u0005\u00111\u0001\u000b\u0002o\"9q\u000e_A\u0001\n\u000b\u0002\u0008\"CA\u0005q\u0006\u0005I\u0011QA\u0006\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0015I\u0013QBA\u0008\u0011\u0019\u0019\u0012q\u0001a\u0001+!11$a\u0002A\u0002uA\u0011\"a\u0005y\u0003\u0003%\u0009)!\u0006\u0002\u000fUt\u0017\r\u001d9msR!\u0011qCA\u0012!\u00159\u0011\u0011DA\u000f\u0013\r\u0009Y\u0002\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u000b\u001d\u0009y\"F\u000f\n\u0007\u0005\u0005\u0002B\u0001\u0004UkBdWM\r\u0005\u0008\u0003K\u0009\u0009\u00021\u0001*\u0003\rAH\u0005\r\u0005\n\u0003SA\u0018\u0011!C\u0005\u0003W\u00091B]3bIJ+7o\u001c7wKR\u0011\u0011Q\u0006\u0009\u0004\u000f\u0006=\u0012bAA\u0019\u0011\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
