[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:19:14 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 32 s, completed Sep 5, 2013 11:19:53 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0003TQ>\u0014H\u000f\u0003\u0005\u001a\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005IX#A\u000f\u0011\u0005\u001dq\u0012BA\u0010\u0009\u0005\u001dqu\u000e\u001e5j]\u001eD\u0001\"\u0009\u0001\u0003\u0012\u0003\u0006I!H\u0001\u0003s\u0002B\u0001b\u0009\u0001\u0003\u0016\u0004%\u0009\u0001F\u0001\u0002u\"AQ\u0005\u0001B\u0009B\u0003%Q#\u0001\u0002{A!)q\u0005\u0001C\u0001Q\u00051A(\u001b8jiz\"B!K\u0016-[A\u0011!\u0006A\u0007\u0002\u0005!)1C\na\u0001+!)1D\na\u0001;!)1E\na\u0001+!9q\u0006AA\u0001\n\u0003\u0001\u0014\u0001B2paf$B!K\u00193g!91C\u000cI\u0001\u0002\u0004)\u0002bB\u000e/!\u0003\u0005\r!\u0008\u0005\u0008G9\u0002\n\u00111\u0001\u0016\u0011\u001d)\u0004!%A\u0005\u0002Y\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u00018U\u0009)\u0002hK\u0001:!\u0009Qt(D\u0001<\u0015\u0009aT(A\u0005v]\u000eDWmY6fI*\u0011a\u0008C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001!<\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u0005\u0002\u0009\n\u0011\"\u0001D\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012\u0001\u0012\u0016\u0003;aBqA\u0012\u0001\u0012\u0002\u0013\u0005a'\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u001a\u0009\u000f!\u0003\u0011\u0011!C!\u0013\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0013\u0009\u0003\u0017Bk\u0011\u0001\u0014\u0006\u0003\u001b:\u000bA\u0001\\1oO*\u0009q*\u0001\u0003kCZ\u000c\u0017BA)M\u0005\u0019\u0019FO]5oO\"91\u000bAA\u0001\n\u0003!\u0016\u0001\u00049s_\u0012,8\r^!sSRLX#A+\u0011\u0005\u001d1\u0016BA,\u0009\u0005\rIe\u000e\u001e\u0005\u00083\u0002\u0009\u0009\u0011\"\u0001[\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"a\u00170\u0011\u0005\u001da\u0016BA/\u0009\u0005\r\u0009e.\u001f\u0005\u0008?b\u000b\u0009\u00111\u0001V\u0003\rAH%\r\u0005\u0008C\u0002\u0009\u0009\u0011\"\u0011c\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#A2\u0011\u0007\u0011<7,D\u0001f\u0015\u00091\u0007\"\u0001\u0006d_2dWm\u0019;j_:L!\u0001[3\u0003\u0011%#XM]1u_JDqA\u001b\u0001\u0002\u0002\u0013\u00051.\u0001\u0005dC:,\u0015/^1m)\u0009aw\u000e\u0005\u0002\u0008[&\u0011a\u000e\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001dy\u0016.!AA\u0002mCq!\u001d\u0001\u0002\u0002\u0013\u0005#/\u0001\u0005iCND7i\u001c3f)\u0005)\u0006b\u0002;\u0001\u0003\u0003%\u0009%^\u0001\u0009i>\u001cFO]5oOR\u0009!\nC\u0004x\u0001\u0005\u0005I\u0011\u0009=\u0002\r\u0015\u000cX/\u00197t)\u0009a\u0017\u0010C\u0004`m\u0006\u0005\u0009\u0019A.\u0008\u000fm\u0014\u0011\u0011!E\u0001y\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002+{\u001a9\u0011AAA\u0001\u0012\u0003q8cA?\u0000\u001fAA\u0011\u0011AA\u0004+u)\u0012&\u0004\u0002\u0002\u0004)\u0019\u0011Q\u0001\u0005\u0002\u000fI,h\u000e^5nK&!\u0011\u0011BA\u0002\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gn\r\u0005\u0007Ou$\u0009!!\u0004\u0015\u0003qDq\u0001^?\u0002\u0002\u0013\u0015S\u000fC\u0005\u0002\u0014u\u000c\u0009\u0011\"!\u0002\u0016\u0005)\u0011\r\u001d9msR9\u0011&a\u0006\u0002\u001a\u0005m\u0001BB\n\u0002\u0012\u0001\u0007Q\u0003\u0003\u0004\u001c\u0003#\u0001\r!\u0008\u0005\u0007G\u0005E\u0001\u0019A\u000b\u0009\u0013\u0005}Q0!A\u0005\u0002\u0006\u0005\u0012aB;oCB\u0004H.\u001f\u000b\u0005\u0003G\u0009y\u0003E\u0003\u0008\u0003K\u0009I#C\u0002\u0002(!\u0011aa\u00149uS>t\u0007CB\u0004\u0002,UiR#C\u0002\u0002.!\u0011a\u0001V;qY\u0016\u001c\u0004bBA\u0019\u0003;\u0001\r!K\u0001\u0004q\u0012\u0002\u0004\"CA\u001b{\u0006\u0005I\u0011BA\u001c\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005e\u0002cA&\u0002<%\u0019\u0011Q\u0008'\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "S", null, null);
fv.visitEnd();
