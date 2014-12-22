[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:36:52 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:37:23 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u00051\u0001\u0002\u0003\u000c\u0001\u0005#\u0005\u000b\u0011\u0002\u0004\u0002\u0005a\u0004\u0003\u0002\u0003\r\u0001\u0005+\u0007I\u0011A\r\u0002\u0003e,\u0012A\u0007\u0009\u00037yq!a\u0002\u000f\n\u0005uA\u0011A\u0002)sK\u0012,g-\u0003\u0002 A\u000911\u000b\u001e:j]\u001eT!!\u0008\u0005\u0009\u0011\u0009\u0002!\u0011#Q\u0001\ni\u0009!!\u001f\u0011\u0009\u000b\u0011\u0002A\u0011A\u0013\u0002\rqJg.\u001b;?)\r1\u0003&\u000b\u0009\u0003O\u0001i\u0011A\u0001\u0005\u0006'\r\u0002\rA\u0002\u0005\u00061\r\u0002\rA\u0007\u0005\u0008W\u0001\u0009\u0009\u0011\"\u0001-\u0003\u0011\u0019w\u000e]=\u0015\u0007\u0019jc\u0006C\u0004\u0014UA\u0005\u0009\u0019\u0001\u0004\u0009\u000faQ\u0003\u0013!a\u00015!9\u0001\u0007AI\u0001\n\u0003\u0009\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002e)\u0012aaM\u0016\u0002iA\u0011QGO\u0007\u0002m)\u0011q\u0007O\u0001\nk:\u001c\u0007.Z2lK\u0012T!!\u000f\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002<m\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000fu\u0002\u0011\u0013!C\u0001}\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\u0012T#A +\u0005i\u0019\u0004bB!\u0001\u0003\u0003%\u0009EQ\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003\r\u0003\"\u0001R%\u000e\u0003\u0015S!AR$\u0002\u00091\u000cgn\u001a\u0006\u0002\u0011\u0006!!.\u0019<b\u0013\u0009yR\u0009C\u0004L\u0001\u0005\u0005I\u0011\u0001'\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u00035\u0003\"a\u0002(\n\u0005=C!aA%oi\"9\u0011\u000bAA\u0001\n\u0003\u0011\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003'Z\u0003\"a\u0002+\n\u0005UC!aA!os\"9q\u000bUA\u0001\u0002\u0004i\u0015a\u0001=%c!9\u0011\u000cAA\u0001\n\u0003R\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003m\u00032\u0001X0T\u001b\u0005i&B\u00010\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003Av\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008E\u0002\u0009\u0009\u0011\"\u0001d\u0003!\u0019\u0017M\\#rk\u0006dGC\u00013h!\u00099Q-\u0003\u0002g\u0011\u00099!i\\8mK\u0006t\u0007bB,b\u0003\u0003\u0005\ra\u0015\u0005\u0008S\u0002\u0009\u0009\u0011\"\u0011k\u0003!A\u0017m\u001d5D_\u0012,G#A'\u0009\u000f1\u0004\u0011\u0011!C![\u0006AAo\\*ue&tw\rF\u0001D\u0011\u001dy\u0007!!A\u0005BA\u000ca!Z9vC2\u001cHC\u00013r\u0011\u001d9f.!AA\u0002M;qa\u001d\u0002\u0002\u0002#\u0005A/\u0001\u0005NsJ+7m\u001c:e!\u00099SOB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001<\u0014\u0007U<x\u0002E\u0003yw\u001aQb%D\u0001z\u0015\u0009Q\u0008\"A\u0004sk:$\u0018.\\3\n\u0005qL(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)A%\u001eC\u0001}R\u0009A\u000fC\u0004mk\u0006\u0005IQI7\u0009\u0013\u0005\rQ/!A\u0005\u0002\u0006\u0015\u0011!B1qa2LH#\u0002\u0014\u0002\u0008\u0005%\u0001BB\n\u0002\u0002\u0001\u0007a\u0001\u0003\u0004\u0019\u0003\u0003\u0001\rA\u0007\u0005\n\u0003\u001b)\u0018\u0011!CA\u0003\u001f\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u0012\u0005u\u0001#B\u0004\u0002\u0014\u0005]\u0011bAA\u000b\u0011\u00091q\n\u001d;j_:\u0004RaBA\r\riI1!a\u0007\u0009\u0005\u0019!V\u000f\u001d7fe!9\u0011qDA\u0006\u0001\u00041\u0013a\u0001=%a!I\u00111E;\u0002\u0002\u0013%\u0011QE\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002(A\u0019A)!\u000b\n\u0007\u0005-RI\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
