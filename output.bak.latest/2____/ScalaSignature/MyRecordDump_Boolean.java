[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:48:46 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 20 s, completed Sep 5, 2013 9:49:11 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002;A\u0011qAH\u0005\u0003?!\u0011qAQ8pY\u0016\u000cg\u000e\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u001e\u0003\u0009A\u0008\u0005C\u0003$\u0001\u0011\u0005A%\u0001\u0004=S:LGO\u0010\u000b\u0004K\u001dB\u0003C\u0001\u0014\u0001\u001b\u0005\u0011\u0001\"B\n#\u0001\u0004)\u0002\"B\u000e#\u0001\u0004i\u0002b\u0002\u0016\u0001\u0003\u0003%\u0009aK\u0001\u0005G>\u0004\u0018\u0010F\u0002&Y5BqaE\u0015\u0011\u0002\u0003\u0007Q\u0003C\u0004\u001cSA\u0005\u0009\u0019A\u000f\u0009\u000f=\u0002\u0011\u0013!C\u0001a\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u0019+\u0005U\u00114&A\u001a\u0011\u0005QJT\"A\u001b\u000b\u0005Y:\u0014!C;oG\",7m[3e\u0015\u0009A\u0004\"\u0001\u0006b]:|G/\u0019;j_:L!AO\u001b\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004=\u0001E\u0005I\u0011A\u001f\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u0009aH\u000b\u0002\u001ee!9\u0001\u0009AA\u0001\n\u0003\n\u0015!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001C!\u0009\u0019\u0005*D\u0001E\u0015\u0009)e)\u0001\u0003mC:<'\"A$\u0002\u0009)\u000cg/Y\u0005\u0003\u0013\u0012\u0013aa\u0015;sS:<\u0007bB&\u0001\u0003\u0003%\u0009\u0001T\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002\u001bB\u0011qAT\u0005\u0003\u001f\"\u00111!\u00138u\u0011\u001d\u0009\u0006!!A\u0005\u0002I\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002T-B\u0011q\u0001V\u0005\u0003+\"\u00111!\u00118z\u0011\u001d9\u0006+!AA\u00025\u000b1\u0001\u001f\u00132\u0011\u001dI\u0006!!A\u0005Bi\u000bq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u00027B\u0019AlX*\u000e\u0003uS!A\u0018\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002a;\nA\u0011\n^3sCR|'\u000fC\u0004c\u0001\u0005\u0005I\u0011A2\u0002\u0011\r\u000cg.R9vC2$\"!\u00083\u0009\u000f]\u000b\u0017\u0011!a\u0001'\"9a\rAA\u0001\n\u0003:\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u00035Cq!\u001b\u0001\u0002\u0002\u0013\u0005#.\u0001\u0005u_N#(/\u001b8h)\u0005\u0011\u0005b\u00027\u0001\u0003\u0003%\u0009%\\\u0001\u0007KF,\u0018\r\\:\u0015\u0005uq\u0007bB,l\u0003\u0003\u0005\raU\u0004\u0008a\n\u0009\u0009\u0011#\u0001r\u0003!i\u0015PU3d_J$\u0007C\u0001\u0014s\r\u001d\u0009!!!A\u0009\u0002M\u001c2A\u001d;\u0010!\u0015)\u00080F\u000f&\u001b\u00051(BA<\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!!\u001f<\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007C\u0003$e\u0012\u00051\u0010F\u0001r\u0011\u001dI'/!A\u0005F)DqA :\u0002\u0002\u0013\u0005u0A\u0003baBd\u0017\u0010F\u0003&\u0003\u0003\u0009\u0019\u0001C\u0003\u0014{\u0002\u0007Q\u0003C\u0003\u001c{\u0002\u0007Q\u0004C\u0005\u0002\u0008I\u000c\u0009\u0011\"!\u0002\n\u00059QO\\1qa2LH\u0003BA\u0006\u0003/\u0001RaBA\u0007\u0003#I1!a\u0004\u0009\u0005\u0019y\u0005\u000f^5p]B)q!a\u0005\u0016;%\u0019\u0011Q\u0003\u0005\u0003\rQ+\u0008\u000f\\33\u0011\u001d\u0009I\"!\u0002A\u0002\u0015\n1\u0001\u001f\u00131\u0011%\u0009iB]A\u0001\n\u0013\u0009y\"A\u0006sK\u0006$'+Z:pYZ,GCAA\u0011!\r\u0019\u00151E\u0005\u0004\u0003K!%AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
