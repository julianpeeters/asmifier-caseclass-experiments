[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:32:18 PM[0m
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
[0m[[33mwarn[0m] [0m/home/julianpeeters/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Unit.scala:3: comparing values of types Unit and Unit using `==' will always yield true[0m
[0m[[33mwarn[0m] [0mcase class MyRecord(x: Unit)[0m
[0m[[33mwarn[0m] [0m           ^[0m
[0m[[33mwarn[0m] [0mthere were 6 deprecation warning(s); re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere were 1 feature warning(s); re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mthree warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 2, 2013 9:32:44 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005%a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0003V]&$\u0008\u0002C\r\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005a\u0004\u0003\"B\u000e\u0001\u0009\u0003a\u0012A\u0002\u001fj]&$h\u0008\u0006\u0002\u001e?A\u0011a\u0004A\u0007\u0002\u0005!)1C\u0007a\u0001+!9\u0011\u0005AA\u0001\n\u0003\u0011\u0013\u0001B2paf$\"!H\u0012\u0009\u000fM\u0001\u0003\u0013!a\u0001+!9Q\u0005AI\u0001\n\u00031\u0013AD2paf$C-\u001a4bk2$H%M\u000b\u0002O)\u0012Q\u0003K\u0016\u0002SA\u0011!fL\u0007\u0002W)\u0011A&L\u0001\nk:\u001c\u0007.Z2lK\u0012T!A\u000c\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u00021W\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000fI\u0002\u0011\u0011!C!g\u0005i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012\u0001\u000e\u0009\u0003kij\u0011A\u000e\u0006\u0003oa\nA\u0001\\1oO*\u0009\u0011(\u0001\u0003kCZ\u000c\u0017BA\u001e7\u0005\u0019\u0019FO]5oO\"9Q\u0008AA\u0001\n\u0003q\u0014\u0001\u00049s_\u0012,8\r^!sSRLX#A \u0011\u0005\u001d\u0001\u0015BA!\u0009\u0005\rIe\u000e\u001e\u0005\u0008\u0007\u0002\u0009\u0009\u0011\"\u0001E\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"!\u0012%\u0011\u0005\u001d1\u0015BA$\u0009\u0005\r\u0009e.\u001f\u0005\u0008\u0013\n\u000b\u0009\u00111\u0001@\u0003\rAH%\r\u0005\u0008\u0017\u0002\u0009\u0009\u0011\"\u0011M\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#A'\u0011\u00079\u000bV)D\u0001P\u0015\u0009\u0001\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!AU(\u0003\u0011%#XM]1u_JDq\u0001\u0016\u0001\u0002\u0002\u0013\u0005Q+\u0001\u0005dC:,\u0015/^1m)\u00091\u0016\u000c\u0005\u0002\u0008/&\u0011\u0001\u000c\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001dI5+!AA\u0002\u0015Cqa\u0017\u0001\u0002\u0002\u0013\u0005C,\u0001\u0005iCND7i\u001c3f)\u0005y\u0004b\u00020\u0001\u0003\u0003%\u0009eX\u0001\u0009i>\u001cFO]5oOR\u0009A\u0007C\u0004b\u0001\u0005\u0005I\u0011\u00092\u0002\r\u0015\u000cX/\u00197t)\u000916\rC\u0004JA\u0006\u0005\u0009\u0019A#\u0008\u000f\u0015\u0014\u0011\u0011!E\u0001M\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002\u001fO\u001a9\u0011AAA\u0001\u0012\u0003A7cA4j\u001fA!!.\\\u000b\u001e\u001b\u0005Y'B\u00017\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!A\\6\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t\u0017\u0007C\u0003\u001cO\u0012\u0005\u0001\u000fF\u0001g\u0011\u001dqv-!A\u0005F}Cqa]4\u0002\u0002\u0013\u0005E/A\u0003baBd\u0017\u0010\u0006\u0002\u001ek\")1C\u001da\u0001+!9qoZA\u0001\n\u0003C\u0018aB;oCB\u0004H.\u001f\u000b\u0003sr\u00042a\u0002>\u0016\u0013\u0009Y\u0008B\u0001\u0004PaRLwN\u001c\u0005\u0006{Z\u0004\r!H\u0001\u0004q\u0012\u0002\u0004\u0002C@h\u0003\u0003%I!!\u0001\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003\u0007\u00012!NA\u0003\u0013\r\u00099A\u000e\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<Lmodels/MyRecord;TA;>;)Lscala/Function1<Lscala/runtime/BoxedUnit;TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
