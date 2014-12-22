[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:32:17 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 27 s, completed Sep 3, 2013 9:32:49 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005-b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002J]RD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001H\u0001\u0002sV\u0009Q\u0004\u0005\u0002\u001fC9\u0011qaH\u0005\u0003A!\u0009a\u0001\u0015:fI\u00164\u0017B\u0001\u0012$\u0005\u0019\u0019FO]5oO*\u0011\u0001\u0005\u0003\u0005\u0009K\u0001\u0011\u0009\u0012)A\u0005;\u0005\u0011\u0011\u0010\u0009\u0005\u0006O\u0001!\u0009\u0001K\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007%ZC\u0006\u0005\u0002+\u00015\u0009!\u0001C\u0003\u0014M\u0001\u0007Q\u0003C\u0003\u001cM\u0001\u0007Q\u0004C\u0004/\u0001\u0005\u0005I\u0011A\u0018\u0002\u0009\r|\u0007/\u001f\u000b\u0004SA\n\u0004bB\n.!\u0003\u0005\r!\u0006\u0005\u000875\u0002\n\u00111\u0001\u001e\u0011\u001d\u0019\u0004!%A\u0005\u0002Q\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u00016U\u0009)bgK\u00018!\u0009AT(D\u0001:\u0015\u0009Q4(A\u0005v]\u000eDWmY6fI*\u0011A\u0008C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001 :\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u0001\u0002\u0009\n\u0011\"\u0001B\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012A\u0011\u0016\u0003;YBq\u0001\u0012\u0001\u0002\u0002\u0013\u0005S)A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002\rB\u0011q\u0009T\u0007\u0002\u0011*\u0011\u0011JS\u0001\u0005Y\u0006twMC\u0001L\u0003\u0011Q\u0017M^1\n\u0005\u0009B\u0005b\u0002(\u0001\u0003\u0003%\u0009\u0001F\u0001\raJ|G-^2u\u0003JLG/\u001f\u0005\u0008!\u0002\u0009\u0009\u0011\"\u0001R\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"AU+\u0011\u0005\u001d\u0019\u0016B\u0001+\u0009\u0005\r\u0009e.\u001f\u0005\u0008->\u000b\u0009\u00111\u0001\u0016\u0003\rAH%\r\u0005\u00081\u0002\u0009\u0009\u0011\"\u0011Z\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u0001.\u0011\u0007ms&+D\u0001]\u0015\u0009i\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!a\u0018/\u0003\u0011%#XM]1u_JDq!\u0019\u0001\u0002\u0002\u0013\u0005!-\u0001\u0005dC:,\u0015/^1m)\u0009\u0019g\r\u0005\u0002\u0008I&\u0011Q\r\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d1\u0006-!AA\u0002ICq\u0001\u001b\u0001\u0002\u0002\u0013\u0005\u0013.\u0001\u0005iCND7i\u001c3f)\u0005)\u0002bB6\u0001\u0003\u0003%\u0009\u0005\\\u0001\u0009i>\u001cFO]5oOR\u0009a\u0009C\u0004o\u0001\u0005\u0005I\u0011I8\u0002\r\u0015\u000cX/\u00197t)\u0009\u0019\u0007\u000fC\u0004W[\u0006\u0005\u0009\u0019\u0001*\u0008\u000fI\u0014\u0011\u0011!E\u0001g\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002+i\u001a9\u0011AAA\u0001\u0012\u0003)8c\u0001;w\u001fA)qO_\u000b\u001eS5\u0009\u0001P\u0003\u0002z\u0011\u00059!/\u001e8uS6,\u0017BA>y\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0006OQ$\u0009! \u000b\u0002g\"91\u000e^A\u0001\n\u000bb\u0007\"CA\u0001i\u0006\u0005I\u0011QA\u0002\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0015I\u0013QAA\u0004\u0011\u0015\u0019r\u00101\u0001\u0016\u0011\u0015Yr\u00101\u0001\u001e\u0011%\u0009Y\u0001^A\u0001\n\u0003\u000bi!A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005=\u00111\u0004\u0009\u0006\u000f\u0005E\u0011QC\u0005\u0004\u0003'A!AB(qi&|g\u000eE\u0003\u0008\u0003/)R$C\u0002\u0002\u001a!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u000f\u0003\u0013\u0001\r!K\u0001\u0004q\u0012\u0002\u0004\"CA\u0011i\u0006\u0005I\u0011BA\u0012\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005\u0015\u0002cA$\u0002(%\u0019\u0011\u0011\u0006%\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "I", null, null);
fv.visitEnd();
