[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:24:22 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 30 s, completed Sep 5, 2013 11:24:57 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005eb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u00051\u0001\u0002\u0003\u000c\u0001\u0005#\u0005\u000b\u0011\u0002\u0004\u0002\u0005a\u0004\u0003\u0002\u0003\r\u0001\u0005+\u0007I\u0011A\r\u0002\u0003e,\u0012A\u0007\u0009\u0003\u000fmI!\u0001\u0008\u0005\u0003\u000f9{G\u000f[5oO\"Aa\u0004\u0001B\u0009B\u0003%!$\u0001\u0002zA!A\u0001\u0005\u0001BK\u0002\u0013\u0005A#A\u0001{\u0011!\u0011\u0003A!E!\u0002\u00131\u0011A\u0001>!\u0011\u0015!\u0003\u0001\"\u0001&\u0003\u0019a\u0014N\\5u}Q!a\u0005K\u0015+!\u00099\u0003!D\u0001\u0003\u0011\u0015\u00192\u00051\u0001\u0007\u0011\u0015A2\u00051\u0001\u001b\u0011\u0015\u00013\u00051\u0001\u0007\u0011\u001da\u0003!!A\u0005\u00025\nAaY8qsR!aEL\u00181\u0011\u001d\u00192\u0006%AA\u0002\u0019Aq\u0001G\u0016\u0011\u0002\u0003\u0007!\u0004C\u0004!WA\u0005\u0009\u0019\u0001\u0004\u0009\u000fI\u0002\u0011\u0013!C\u0001g\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#\u0001\u001b+\u0005\u0019)4&\u0001\u001c\u0011\u0005]bT\"\u0001\u001d\u000b\u0005eR\u0014!C;oG\",7m[3e\u0015\u0009Y\u0004\"\u0001\u0006b]:|G/\u0019;j_:L!!\u0010\u001d\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004@\u0001E\u0005I\u0011\u0001!\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u0009\u0011I\u000b\u0002\u001bk!91\u0009AI\u0001\n\u0003\u0019\u0014AD2paf$C-\u001a4bk2$He\r\u0005\u0008\u000b\u0002\u0009\u0009\u0011\"\u0011G\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009q\u0009\u0005\u0002I\u001b6\u0009\u0011J\u0003\u0002K\u0017\u0006!A.\u00198h\u0015\u0005a\u0015\u0001\u00026bm\u0006L!AT%\u0003\rM#(/\u001b8h\u0011\u001d\u0001\u0006!!A\u0005\u0002E\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012A\u0015\u0009\u0003\u000fMK!\u0001\u0016\u0005\u0003\u0007%sG\u000fC\u0004W\u0001\u0005\u0005I\u0011A,\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011\u0001l\u0017\u0009\u0003\u000feK!A\u0017\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004]+\u0006\u0005\u0009\u0019\u0001*\u0002\u0007a$\u0013\u0007C\u0004_\u0001\u0005\u0005I\u0011I0\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012\u0001\u0019\u0009\u0004C\u0012DV\"\u00012\u000b\u0005\rD\u0011AC2pY2,7\r^5p]&\u0011QM\u0019\u0002\u0009\u0013R,'/\u0019;pe\"9q\rAA\u0001\n\u0003A\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005%d\u0007CA\u0004k\u0013\u0009Y\u0007BA\u0004C_>dW-\u00198\u0009\u000fq3\u0017\u0011!a\u00011\"9a\u000eAA\u0001\n\u0003z\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003ICq!\u001d\u0001\u0002\u0002\u0013\u0005#/\u0001\u0005u_N#(/\u001b8h)\u00059\u0005b\u0002;\u0001\u0003\u0003%\u0009%^\u0001\u0007KF,\u0018\r\\:\u0015\u0005%4\u0008b\u0002/t\u0003\u0003\u0005\r\u0001W\u0004\u0008q\n\u0009\u0009\u0011#\u0001z\u0003!i\u0015PU3d_J$\u0007CA\u0014{\r\u001d\u0009!!!A\u0009\u0002m\u001c2A\u001f?\u0010!\u001di\u0018\u0011\u0001\u0004\u001b\r\u0019j\u0011A \u0006\u0003\"\u0009qA];oi&lW-C\u0002\u0002\u0004y\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c84\u0011\u0019!#\u0010\"\u0001\u0002\u0008Q\u0009\u0011\u0010C\u0004ru\u0006\u0005IQ\u0009:\u0009\u0013\u00055!0!A\u0005\u0002\u0006=\u0011!B1qa2LHc\u0002\u0014\u0002\u0012\u0005M\u0011Q\u0003\u0005\u0007'\u0005-\u0001\u0019\u0001\u0004\u0009\ra\u0009Y\u00011\u0001\u001b\u0011\u0019\u0001\u00131\u0002a\u0001\r!I\u0011\u0011\u0004>\u0002\u0002\u0013\u0005\u00151D\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009i\"!\u000b\u0011\u000b\u001d\u0009y\"a\u0009\n\u0007\u0005\u0005\u0002B\u0001\u0004PaRLwN\u001c\u0009\u0007\u000f\u0005\u0015bA\u0007\u0004\n\u0007\u0005\u001d\u0002B\u0001\u0004UkBdWm\r\u0005\u0008\u0003W\u00099\u00021\u0001'\u0003\rAH\u0005\r\u0005\n\u0003_Q\u0018\u0011!C\u0005\u0003c\u00091B]3bIJ+7o\u001c7wKR\u0011\u00111\u0007\u0009\u0004\u0011\u0006U\u0012bAA\u001c\u0013\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
