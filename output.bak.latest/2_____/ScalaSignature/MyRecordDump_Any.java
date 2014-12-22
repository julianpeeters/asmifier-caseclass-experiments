[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:25:04 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 24 s, completed Sep 5, 2013 11:25:32 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005eb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002B]fD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001H\u0001\u0002sV\u0009Q\u0004\u0005\u0002\u0008=%\u0011q\u0004\u0003\u0002\u0008\u001d>$\u0008.\u001b8h\u0011!\u0009\u0003A!E!\u0002\u0013i\u0012AA=!\u0011!\u0019\u0003A!f\u0001\n\u0003!\u0012!\u0001>\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nU\u0009!A\u001f\u0011\u0009\u000b\u001d\u0002A\u0011\u0001\u0015\u0002\rqJg.\u001b;?)\u0011I3\u0006L\u0017\u0011\u0005)\u0002Q\"\u0001\u0002\u0009\u000bM1\u0003\u0019A\u000b\u0009\u000bm1\u0003\u0019A\u000f\u0009\u000b\r2\u0003\u0019A\u000b\u0009\u000f=\u0002\u0011\u0011!C\u0001a\u0005!1m\u001c9z)\u0011I\u0013GM\u001a\u0009\u000fMq\u0003\u0013!a\u0001+!91D\u000cI\u0001\u0002\u0004i\u0002bB\u0012/!\u0003\u0005\r!\u0006\u0005\u0008k\u0001\u0009\n\u0011\"\u00017\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012a\u000e\u0016\u0003+aZ\u0013!\u000f\u0009\u0003u}j\u0011a\u000f\u0006\u0003yu\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005yB\u0011AC1o]>$\u0018\r^5p]&\u0011\u0001i\u000f\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002\"\u0001#\u0003%\u0009aQ\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133+\u0005!%FA\u000f9\u0011\u001d1\u0005!%A\u0005\u0002Y\nabY8qs\u0012\"WMZ1vYR$3\u0007C\u0004I\u0001\u0005\u0005I\u0011I%\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005Q\u0005CA&Q\u001b\u0005a%BA'O\u0003\u0011a\u0017M\\4\u000b\u0003=\u000bAA[1wC&\u0011\u0011\u000b\u0014\u0002\u0007'R\u0014\u0018N\\4\u0009\u000fM\u0003\u0011\u0011!C\u0001)\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009Q\u000b\u0005\u0002\u0008-&\u0011q\u000b\u0003\u0002\u0004\u0013:$\u0008bB-\u0001\u0003\u0003%\u0009AW\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009)2\u000cC\u0004]1\u0006\u0005\u0009\u0019A+\u0002\u0007a$\u0013\u0007C\u0004_\u0001\u0005\u0005I\u0011I0\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012\u0001\u0019\u0009\u0004C\u0012,R\"\u00012\u000b\u0005\rD\u0011AC2pY2,7\r^5p]&\u0011QM\u0019\u0002\u0009\u0013R,'/\u0019;pe\"9q\rAA\u0001\n\u0003A\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005%d\u0007CA\u0004k\u0013\u0009Y\u0007BA\u0004C_>dW-\u00198\u0009\u000fq3\u0017\u0011!a\u0001+!9a\u000eAA\u0001\n\u0003z\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003UCq!\u001d\u0001\u0002\u0002\u0013\u0005#/\u0001\u0005u_N#(/\u001b8h)\u0005Q\u0005b\u0002;\u0001\u0003\u0003%\u0009%^\u0001\u0007KF,\u0018\r\\:\u0015\u0005%4\u0008b\u0002/t\u0003\u0003\u0005\r!F\u0004\u0008q\n\u0009\u0009\u0011#\u0001z\u0003!i\u0015PU3d_J$\u0007C\u0001\u0016{\r\u001d\u0009!!!A\u0009\u0002m\u001c2A\u001f?\u0010!\u001di\u0018\u0011A\u000b\u001e+%j\u0011A \u0006\u0003\"\u0009qA];oi&lW-C\u0002\u0002\u0004y\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c84\u0011\u00199#\u0010\"\u0001\u0002\u0008Q\u0009\u0011\u0010C\u0004ru\u0006\u0005IQ\u0009:\u0009\u0013\u00055!0!A\u0005\u0002\u0006=\u0011!B1qa2LHcB\u0015\u0002\u0012\u0005M\u0011Q\u0003\u0005\u0007'\u0005-\u0001\u0019A\u000b\u0009\rm\u0009Y\u00011\u0001\u001e\u0011\u0019\u0019\u00131\u0002a\u0001+!I\u0011\u0011\u0004>\u0002\u0002\u0013\u0005\u00151D\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009i\"!\u000b\u0011\u000b\u001d\u0009y\"a\u0009\n\u0007\u0005\u0005\u0002B\u0001\u0004PaRLwN\u001c\u0009\u0007\u000f\u0005\u0015R#H\u000b\n\u0007\u0005\u001d\u0002B\u0001\u0004UkBdWm\r\u0005\u0008\u0003W\u00099\u00021\u0001*\u0003\rAH\u0005\r\u0005\n\u0003_Q\u0018\u0011!C\u0005\u0003c\u00091B]3bIJ+7o\u001c7wKR\u0011\u00111\u0007\u0009\u0004\u0017\u0006U\u0012bAA\u001c\u0019\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
