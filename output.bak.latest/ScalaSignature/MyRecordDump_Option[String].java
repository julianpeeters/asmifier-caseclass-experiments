[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:34:01 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 24 s, completed Sep 2, 2013 9:34:30 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Ea\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005eabBA\u0004\u001b\u0013\u0009Y\u0002\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003;y\u0011aa\u0015;sS:<'BA\u000e\u0009\u0011!\u0001\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011\u0015\u0011\u0003\u0001\"\u0001$\u0003\u0019a\u0014N\\5u}Q\u0011AE\n\u0009\u0003K\u0001i\u0011A\u0001\u0005\u0006'\u0005\u0002\r!\u0006\u0005\u0008Q\u0001\u0009\u0009\u0011\"\u0001*\u0003\u0011\u0019w\u000e]=\u0015\u0005\u0011R\u0003bB\n(!\u0003\u0005\r!\u0006\u0005\u0008Y\u0001\u0009\n\u0011\"\u0001.\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012A\u000c\u0016\u0003+=Z\u0013\u0001\r\u0009\u0003cYj\u0011A\r\u0006\u0003gQ\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005UB\u0011AC1o]>$\u0018\r^5p]&\u0011qG\r\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007bB\u001d\u0001\u0003\u0003%\u0009EO\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003m\u0002\"\u0001P!\u000e\u0003uR!AP \u0002\u00091\u000cgn\u001a\u0006\u0002\u0001\u0006!!.\u0019<b\u0013\u0009iR\u0008C\u0004D\u0001\u0005\u0005I\u0011\u0001#\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\u0015\u0003\"a\u0002$\n\u0005\u001dC!aA%oi\"9\u0011\nAA\u0001\n\u0003Q\u0015A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003\u0017:\u0003\"a\u0002'\n\u00055C!aA!os\"9q\nSA\u0001\u0002\u0004)\u0015a\u0001=%c!9\u0011\u000bAA\u0001\n\u0003\u0012\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003M\u00032\u0001V,L\u001b\u0005)&B\u0001,\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u00031V\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u00085\u0002\u0009\u0009\u0011\"\u0001\\\u0003!\u0019\u0017M\\#rk\u0006dGC\u0001/`!\u00099Q,\u0003\u0002_\u0011\u00099!i\\8mK\u0006t\u0007bB(Z\u0003\u0003\u0005\ra\u0013\u0005\u0008C\u0002\u0009\u0009\u0011\"\u0011c\u0003!A\u0017m\u001d5D_\u0012,G#A#\u0009\u000f\u0011\u0004\u0011\u0011!C!K\u0006AAo\\*ue&tw\rF\u0001<\u0011\u001d9\u0007!!A\u0005B!\u000ca!Z9vC2\u001cHC\u0001/j\u0011\u001dye-!AA\u0002-;qa\u001b\u0002\u0002\u0002#\u0005A.\u0001\u0005NsJ+7m\u001c:e!\u0009)SNB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u00018\u0014\u00075|w\u0002\u0005\u0003qgV!S\"A9\u000b\u0005ID\u0011a\u0002:v]RLW.Z\u0005\u0003iF\u0014\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c82\u0011\u0015\u0011S\u000e\"\u0001w)\u0005a\u0007b\u00023n\u0003\u0003%)%\u001a\u0005\u0008s6\u000c\u0009\u0011\"!{\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0009!3\u0010C\u0003\u0014q\u0002\u0007Q\u0003C\u0004~[\u0006\u0005I\u0011\u0011@\u0002\u000fUt\u0017\r\u001d9msR\u0019q0!\u0001\u0011\u0007\u001d1R\u0003\u0003\u0004\u0002\u0004q\u0004\r\u0001J\u0001\u0004q\u0012\u0002\u0004\"CA\u0004[\u0006\u0005I\u0011BA\u0005\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005-\u0001c\u0001\u001f\u0002\u000e%\u0019\u0011qB\u001f\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/String;>;", null);
fv.visitEnd();
