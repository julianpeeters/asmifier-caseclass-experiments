[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:26:51 PM[0m
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
[0m[[33mwarn[0m] [0m/home/julianpeeters/asmifier-caseclass-experiments/src/main/scala/models/MyRecord_Unit.scala:2: comparing values of types Unit and Unit using `==' will always yield true[0m
[0m[[33mwarn[0m] [0mcase class MyRecord(x: Unit, y: Nothing, z:Unit)[0m
[0m[[33mwarn[0m] [0m           ^[0m
[0m[[33mwarn[0m] [0mthere were 6 deprecation warning(s); re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere were 1 feature warning(s); re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mthree warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 27 s, completed Sep 5, 2013 11:27:25 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0003V]&$\u0008\u0002C\r\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005a\u0004\u0003\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003e,\u0012!\u0008\u0009\u0003\u000fyI!a\u0008\u0005\u0003\u000f9{G\u000f[5oO\"A\u0011\u0005\u0001B\u0009B\u0003%Q$\u0001\u0002zA!A1\u0005\u0001BK\u0002\u0013\u0005A#A\u0001{\u0011!)\u0003A!E!\u0002\u0013)\u0012A\u0001>!\u0011\u00159\u0003\u0001\"\u0001)\u0003\u0019a\u0014N\\5u}Q!\u0011f\u000b\u0017.!\u0009Q\u0003!D\u0001\u0003\u0011\u0015\u0019b\u00051\u0001\u0016\u0011\u0015Yb\u00051\u0001\u001e\u0011\u0015\u0019c\u00051\u0001\u0016\u0011\u001dy\u0003!!A\u0005\u0002A\nAaY8qsR!\u0011&\r\u001a4\u0011\u001d\u0019b\u0006%AA\u0002UAqa\u0007\u0018\u0011\u0002\u0003\u0007Q\u0004C\u0004$]A\u0005\u0009\u0019A\u000b\u0009\u000fU\u0002\u0011\u0013!C\u0001m\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u001c+\u0005UA4&A\u001d\u0011\u0005izT\"A\u001e\u000b\u0005qj\u0014!C;oG\",7m[3e\u0015\u0009q\u0004\"\u0001\u0006b]:|G/\u0019;j_:L!\u0001Q\u001e\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004C\u0001E\u0005I\u0011A\"\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u0009AI\u000b\u0002\u001eq!9a\u0009AI\u0001\n\u00031\u0014AD2paf$C-\u001a4bk2$He\r\u0005\u0008\u0011\u0002\u0009\u0009\u0011\"\u0011J\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009!\n\u0005\u0002L!6\u0009AJ\u0003\u0002N\u001d\u0006!A.\u00198h\u0015\u0005y\u0015\u0001\u00026bm\u0006L!!\u0015'\u0003\rM#(/\u001b8h\u0011\u001d\u0019\u0006!!A\u0005\u0002Q\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012!\u0016\u0009\u0003\u000fYK!a\u0016\u0005\u0003\u0007%sG\u000fC\u0004Z\u0001\u0005\u0005I\u0011\u0001.\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u00111L\u0018\u0009\u0003\u000fqK!!\u0018\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004`1\u0006\u0005\u0009\u0019A+\u0002\u0007a$\u0013\u0007C\u0004b\u0001\u0005\u0005I\u0011\u00092\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012a\u0019\u0009\u0004I\u001e\\V\"A3\u000b\u0005\u0019D\u0011AC2pY2,7\r^5p]&\u0011\u0001.\u001a\u0002\u0009\u0013R,'/\u0019;pe\"9!\u000eAA\u0001\n\u0003Y\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u00051|\u0007CA\u0004n\u0013\u0009q\u0007BA\u0004C_>dW-\u00198\u0009\u000f}K\u0017\u0011!a\u00017\"9\u0011\u000fAA\u0001\n\u0003\u0012\u0018\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003UCq\u0001\u001e\u0001\u0002\u0002\u0013\u0005S/\u0001\u0005u_N#(/\u001b8h)\u0005Q\u0005bB<\u0001\u0003\u0003%\u0009\u0005_\u0001\u0007KF,\u0018\r\\:\u0015\u00051L\u0008bB0w\u0003\u0003\u0005\raW\u0004\u0008w\n\u0009\u0009\u0011#\u0001}\u0003!i\u0015PU3d_J$\u0007C\u0001\u0016~\r\u001d\u0009!!!A\u0009\u0002y\u001c2!`@\u0010!!\u0009\u0009!a\u0002\u0016;UISBAA\u0002\u0015\r\u0009)\u0001C\u0001\u0008eVtG/[7f\u0013\u0011\u0009I!a\u0001\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t7\u0007\u0003\u0004({\u0012\u0005\u0011Q\u0002\u000b\u0002y\"9A/`A\u0001\n\u000b*\u0008\"CA\n{\u0006\u0005I\u0011QA\u000b\u0003\u0015\u0009\u0007\u000f\u001d7z)\u001dI\u0013qCA\r\u00037AaaEA\u0009\u0001\u0004)\u0002BB\u000e\u0002\u0012\u0001\u0007Q\u0004\u0003\u0004$\u0003#\u0001\r!\u0006\u0005\n\u0003?i\u0018\u0011!CA\u0003C\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002$\u0005=\u0002#B\u0004\u0002&\u0005%\u0012bAA\u0014\u0011\u00091q\n\u001d;j_:\u0004baBA\u0016+u)\u0012bAA\u0017\u0011\u00091A+\u001e9mKNBq!!\r\u0002\u001e\u0001\u0007\u0011&A\u0002yIAB\u0011\"!\u000e~\u0003\u0003%I!a\u000e\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003s\u00012aSA\u001e\u0013\r\u0009i\u0004\u0014\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
