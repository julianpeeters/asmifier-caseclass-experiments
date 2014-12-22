[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:53:47 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 9:54:14 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005%b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002;A\u0019qA\u0008\u0011\n\u0005}A!AB(qi&|g\u000e\u0005\u0002\u0008C%\u0011!\u0005\u0003\u0002\u0004\u0003:L\u0008\u0002\u0003\u0013\u0001\u0005#\u0005\u000b\u0011B\u000f\u0002\u0005a\u0004\u0003\"\u0002\u0014\u0001\u0009\u00039\u0013A\u0002\u001fj]&$h\u0008F\u0002)U-\u0002\"!\u000b\u0001\u000e\u0003\u0009AQaE\u0013A\u0002UAQaG\u0013A\u0002uAq!\u000c\u0001\u0002\u0002\u0013\u0005a&\u0001\u0003d_BLHc\u0001\u00150a!91\u0003\u000cI\u0001\u0002\u0004)\u0002bB\u000e-!\u0003\u0005\r!\u0008\u0005\u0008e\u0001\u0009\n\u0011\"\u00014\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012\u0001\u000e\u0016\u0003+UZ\u0013A\u000e\u0009\u0003oqj\u0011\u0001\u000f\u0006\u0003si\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005mB\u0011AC1o]>$\u0018\r^5p]&\u0011Q\u0008\u000f\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007bB \u0001#\u0003%\u0009\u0001Q\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133+\u0005\u0009%FA\u000f6\u0011\u001d\u0019\u0005!!A\u0005B\u0011\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#A#\u0011\u0005\u0019[U\"A$\u000b\u0005!K\u0015\u0001\u00027b]\u001eT\u0011AS\u0001\u0005U\u00064\u0018-\u0003\u0002M\u000f\n11\u000b\u001e:j]\u001eDqA\u0014\u0001\u0002\u0002\u0013\u0005q*\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001Q!\u00099\u0011+\u0003\u0002S\u0011\u0009\u0019\u0011J\u001c;\u0009\u000fQ\u0003\u0011\u0011!C\u0001+\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HC\u0001\u0011W\u0011\u001d96+!AA\u0002A\u000b1\u0001\u001f\u00132\u0011\u001dI\u0006!!A\u0005Bi\u000bq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u00027B\u0019Al\u0018\u0011\u000e\u0003uS!A\u0018\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002a;\nA\u0011\n^3sCR|'\u000fC\u0004c\u0001\u0005\u0005I\u0011A2\u0002\u0011\r\u000cg.R9vC2$\"\u0001Z4\u0011\u0005\u001d)\u0017B\u00014\u0009\u0005\u001d\u0011un\u001c7fC:DqaV1\u0002\u0002\u0003\u0007\u0001\u0005C\u0004j\u0001\u0005\u0005I\u0011\u00096\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012\u0001\u0015\u0005\u0008Y\u0002\u0009\u0009\u0011\"\u0011n\u0003!!xn\u0015;sS:<G#A#\u0009\u000f=\u0004\u0011\u0011!C!a\u00061Q-];bYN$\"\u0001Z9\u0009\u000f]s\u0017\u0011!a\u0001A\u001d91OAA\u0001\u0012\u0003!\u0018\u0001C'z%\u0016\u001cwN\u001d3\u0011\u0005%*haB\u0001\u0003\u0003\u0003E\u0009A^\n\u0004k^|\u0001#\u0002=|+uAS\"A=\u000b\u0005iD\u0011a\u0002:v]RLW.Z\u0005\u0003yf\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c83\u0011\u00151S\u000f\"\u0001)\u0005!\u0008b\u00027v\u0003\u0003%)%\u001c\u0005\n\u0003\u0007)\u0018\u0011!CA\u0003\u000b\u0009Q!\u00199qYf$R\u0001KA\u0004\u0003\u0013AaaEA\u0001\u0001\u0004)\u0002BB\u000e\u0002\u0002\u0001\u0007Q\u0004C\u0005\u0002\u000eU\u000c\u0009\u0011\"!\u0002\u0010\u00059QO\\1qa2LH\u0003BA\u0009\u00033\u0001Ba\u0002\u0010\u0002\u0014A)q!!\u0006\u0016;%\u0019\u0011q\u0003\u0005\u0003\rQ+\u0008\u000f\\33\u0011\u001d\u0009Y\"a\u0003A\u0002!\n1\u0001\u001f\u00131\u0011%\u0009y\"^A\u0001\n\u0013\u0009\u0009#A\u0006sK\u0006$'+Z:pYZ,GCAA\u0012!\r1\u0015QE\u0005\u0004\u0003O9%AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
