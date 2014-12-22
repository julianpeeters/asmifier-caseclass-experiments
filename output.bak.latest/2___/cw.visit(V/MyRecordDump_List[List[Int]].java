[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:10:10 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 23 s, completed Sep 5, 2013 9:10:38 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0005c\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003CA\u0004$\u0013\u0009!\u0003BA\u0002J]RD\u0001B\n\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001\u0002\u000b\u0001\u0003\u0016\u0004%\u0009!K\u0001\u0002sV\u0009!\u0006\u0005\u0002\u0008W%\u0011A\u0006\u0003\u0002\u0005\u0005f$X\r\u0003\u0005/\u0001\u0009E\u0009\u0015!\u0003+\u0003\u0009I\u0008\u0005C\u00031\u0001\u0011\u0005\u0011'\u0001\u0004=S:LGO\u0010\u000b\u0004eQ*\u0004CA\u001a\u0001\u001b\u0005\u0011\u0001\"B\n0\u0001\u0004)\u0002\"\u0002\u00150\u0001\u0004Q\u0003bB\u001c\u0001\u0003\u0003%\u0009\u0001O\u0001\u0005G>\u0004\u0018\u0010F\u00023siBqa\u0005\u001c\u0011\u0002\u0003\u0007Q\u0003C\u0004)mA\u0005\u0009\u0019\u0001\u0016\u0009\u000fq\u0002\u0011\u0013!C\u0001{\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#\u0001 +\u0005Uy4&\u0001!\u0011\u0005\u00053U\"\u0001\"\u000b\u0005\r#\u0015!C;oG\",7m[3e\u0015\u0009)\u0005\"\u0001\u0006b]:|G/\u0019;j_:L!a\u0012\"\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004J\u0001E\u0005I\u0011\u0001&\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u00091J\u000b\u0002+!9Q\nAA\u0001\n\u0003r\u0015!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001P!\u0009\u0001V+D\u0001R\u0015\u0009\u00116+\u0001\u0003mC:<'\"\u0001+\u0002\u0009)\u000cg/Y\u0005\u0003-F\u0013aa\u0015;sS:<\u0007b\u0002-\u0001\u0003\u0003%\u0009!W\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002E!91\u000cAA\u0001\n\u0003a\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003;\u0002\u0004\"a\u00020\n\u0005}C!aA!os\"9\u0011MWA\u0001\u0002\u0004\u0011\u0013a\u0001=%c!91\rAA\u0001\n\u0003\"\u0017a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003\u0015\u00042AZ5^\u001b\u00059'B\u00015\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003U\u001e\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008Y\u0002\u0009\u0009\u0011\"\u0001n\u0003!\u0019\u0017M\\#rk\u0006dGC\u00018r!\u00099q.\u0003\u0002q\u0011\u00099!i\\8mK\u0006t\u0007bB1l\u0003\u0003\u0005\r!\u0018\u0005\u0008g\u0002\u0009\u0009\u0011\"\u0011u\u0003!A\u0017m\u001d5D_\u0012,G#\u0001\u0012\u0009\u000fY\u0004\u0011\u0011!C!o\u0006AAo\\*ue&tw\rF\u0001P\u0011\u001dI\u0008!!A\u0005Bi\u000ca!Z9vC2\u001cHC\u00018|\u0011\u001d\u0009\u00070!AA\u0002u;q! \u0002\u0002\u0002#\u0005a0\u0001\u0005NsJ+7m\u001c:e!\u0009\u0019tP\u0002\u0005\u0002\u0005\u0005\u0005\u0009\u0012AA\u0001'\u0011y\u00181A\u0008\u0011\u000f\u0005\u0015\u00111B\u000b+e5\u0011\u0011q\u0001\u0006\u0004\u0003\u0013A\u0011a\u0002:v]RLW.Z\u0005\u0005\u0003\u001b\u00099AA\u0009BEN$(/Y2u\rVt7\r^5p]JBa\u0001M@\u0005\u0002\u0005EA#\u0001@\u0009\u000fY|\u0018\u0011!C#o\"I\u0011qC@\u0002\u0002\u0013\u0005\u0015\u0011D\u0001\u0006CB\u0004H.\u001f\u000b\u0006e\u0005m\u0011Q\u0004\u0005\u0007'\u0005U\u0001\u0019A\u000b\u0009\r!\n)\u00021\u0001+\u0011%\u0009\u0009c`A\u0001\n\u0003\u000b\u0019#A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005\u0015\u0012\u0011\u0007\u0009\u0006\u000f\u0005\u001d\u00121F\u0005\u0004\u0003SA!AB(qi&|g\u000eE\u0003\u0008\u0003[)\"&C\u0002\u00020!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u001a\u0003?\u0001\rAM\u0001\u0004q\u0012\u0002\u0004\"CA\u001c\u0006\u0005I\u0011BA\u001d\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005m\u0002c\u0001)\u0002>%\u0019\u0011qH)\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;", null);
fv.visitEnd();
