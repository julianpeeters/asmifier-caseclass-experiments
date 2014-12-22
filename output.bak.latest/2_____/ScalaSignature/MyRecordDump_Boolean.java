[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:22:28 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 11:22:55 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005eb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004C_>dW-\u00198\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011!_\u000b\u0002;A\u0011qAH\u0005\u0003?!\u0011qAT8uQ&tw\r\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u001e\u0003\u0009I\u0008\u0005\u0003\u0005$\u0001\u0009U\r\u0011\"\u0001\u0015\u0003\u0005Q\u0008\u0002C\u0013\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005i\u0004\u0003\"B\u0014\u0001\u0009\u0003A\u0013A\u0002\u001fj]&$h\u0008\u0006\u0003*W1j\u0003C\u0001\u0016\u0001\u001b\u0005\u0011\u0001\"B\n'\u0001\u0004)\u0002\"B\u000e'\u0001\u0004i\u0002\"B\u0012'\u0001\u0004)\u0002bB\u0018\u0001\u0003\u0003%\u0009\u0001M\u0001\u0005G>\u0004\u0018\u0010\u0006\u0003*cI\u001a\u0004bB\n/!\u0003\u0005\r!\u0006\u0005\u000879\u0002\n\u00111\u0001\u001e\u0011\u001d\u0019c\u0006%AA\u0002UAq!\u000e\u0001\u0012\u0002\u0013\u0005a'\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003]R#!\u0006\u001d,\u0003e\u0002\"AO \u000e\u0003mR!\u0001P\u001f\u0002\u0013Ut7\r[3dW\u0016$'B\u0001 \u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003\u0001n\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001d\u0011\u0005!%A\u0005\u0002\r\u000babY8qs\u0012\"WMZ1vYR$#'F\u0001EU\u0009i\u0002\u0008C\u0004G\u0001E\u0005I\u0011\u0001\u001c\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%g!9\u0001\nAA\u0001\n\u0003J\u0015!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001K!\u0009Y\u0005+D\u0001M\u0015\u0009ie*\u0001\u0003mC:<'\"A(\u0002\u0009)\u000cg/Y\u0005\u0003#2\u0013aa\u0015;sS:<\u0007bB*\u0001\u0003\u0003%\u0009\u0001V\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002+B\u0011qAV\u0005\u0003/\"\u00111!\u00138u\u0011\u001dI\u0006!!A\u0005\u0002i\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002\\=B\u0011q\u0001X\u0005\u0003;\"\u00111!\u00118z\u0011\u001dy\u0006,!AA\u0002U\u000b1\u0001\u001f\u00132\u0011\u001d\u0009\u0007!!A\u0005B\u0009\u000cq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u0002GB\u0019AmZ.\u000e\u0003\u0015T!A\u001a\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002iK\nA\u0011\n^3sCR|'\u000fC\u0004k\u0001\u0005\u0005I\u0011A6\u0002\u0011\r\u000cg.R9vC2$\"!\u00067\u0009\u000f}K\u0017\u0011!a\u00017\"9a\u000eAA\u0001\n\u0003z\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003UCq!\u001d\u0001\u0002\u0002\u0013\u0005#/\u0001\u0005u_N#(/\u001b8h)\u0005Q\u0005b\u0002;\u0001\u0003\u0003%\u0009%^\u0001\u0007KF,\u0018\r\\:\u0015\u0005U1\u0008bB0t\u0003\u0003\u0005\raW\u0004\u0008q\n\u0009\u0009\u0011#\u0001z\u0003!i\u0015PU3d_J$\u0007C\u0001\u0016{\r\u001d\u0009!!!A\u0009\u0002m\u001c2A\u001f?\u0010!\u001di\u0018\u0011A\u000b\u001e+%j\u0011A \u0006\u0003\"\u0009qA];oi&lW-C\u0002\u0002\u0004y\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c84\u0011\u00199#\u0010\"\u0001\u0002\u0008Q\u0009\u0011\u0010C\u0004ru\u0006\u0005IQ\u0009:\u0009\u0013\u00055!0!A\u0005\u0002\u0006=\u0011!B1qa2LHcB\u0015\u0002\u0012\u0005M\u0011Q\u0003\u0005\u0007'\u0005-\u0001\u0019A\u000b\u0009\rm\u0009Y\u00011\u0001\u001e\u0011\u0019\u0019\u00131\u0002a\u0001+!I\u0011\u0011\u0004>\u0002\u0002\u0013\u0005\u00151D\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009i\"!\u000b\u0011\u000b\u001d\u0009y\"a\u0009\n\u0007\u0005\u0005\u0002B\u0001\u0004PaRLwN\u001c\u0009\u0007\u000f\u0005\u0015R#H\u000b\n\u0007\u0005\u001d\u0002B\u0001\u0004UkBdWm\r\u0005\u0008\u0003W\u00099\u00021\u0001*\u0003\rAH\u0005\r\u0005\n\u0003_Q\u0018\u0011!C\u0005\u0003c\u00091B]3bIJ+7o\u001c7wKR\u0011\u00111\u0007\u0009\u0004\u0017\u0006U\u0012bAA\u001c\u0019\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Z", null, null);
fv.visitEnd();
