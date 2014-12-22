[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:03:12 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 9:03:39 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0003DQ\u0006\u0014\u0008\u0002C\r\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005a\u0004\u0003\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003e,\u0012!\u0008\u0009\u0003\u000fyI!a\u0008\u0005\u0003\u0009\u0009KH/\u001a\u0005\u0009C\u0001\u0011\u0009\u0012)A\u0005;\u0005\u0011\u0011\u0010\u0009\u0005\u0006G\u0001!\u0009\u0001J\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007\u0015:\u0003\u0006\u0005\u0002'\u00015\u0009!\u0001C\u0003\u0014E\u0001\u0007Q\u0003C\u0003\u001cE\u0001\u0007Q\u0004C\u0004+\u0001\u0005\u0005I\u0011A\u0016\u0002\u0009\r|\u0007/\u001f\u000b\u0004K1j\u0003bB\n*!\u0003\u0005\r!\u0006\u0005\u00087%\u0002\n\u00111\u0001\u001e\u0011\u001dy\u0003!%A\u0005\u0002A\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u00012U\u0009)\"gK\u00014!\u0009!\u0014(D\u00016\u0015\u00091t'A\u0005v]\u000eDWmY6fI*\u0011\u0001\u0008C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001\u001e6\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008y\u0001\u0009\n\u0011\"\u0001>\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012A\u0010\u0016\u0003;IBq\u0001\u0011\u0001\u0002\u0002\u0013\u0005\u0013)A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002\u0005B\u00111\u0009S\u0007\u0002\u0009*\u0011QIR\u0001\u0005Y\u0006twMC\u0001H\u0003\u0011Q\u0017M^1\n\u0005%#%AB*ue&tw\rC\u0004L\u0001\u0005\u0005I\u0011\u0001'\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u00035\u0003\"a\u0002(\n\u0005=C!aA%oi\"9\u0011\u000bAA\u0001\n\u0003\u0011\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003'Z\u0003\"a\u0002+\n\u0005UC!aA!os\"9q\u000bUA\u0001\u0002\u0004i\u0015a\u0001=%c!9\u0011\u000cAA\u0001\n\u0003R\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003m\u00032\u0001X0T\u001b\u0005i&B\u00010\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003Av\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008E\u0002\u0009\u0009\u0011\"\u0001d\u0003!\u0019\u0017M\\#rk\u0006dGC\u00013h!\u00099Q-\u0003\u0002g\u0011\u00099!i\\8mK\u0006t\u0007bB,b\u0003\u0003\u0005\ra\u0015\u0005\u0008S\u0002\u0009\u0009\u0011\"\u0011k\u0003!A\u0017m\u001d5D_\u0012,G#A'\u0009\u000f1\u0004\u0011\u0011!C![\u0006AAo\\*ue&tw\rF\u0001C\u0011\u001dy\u0007!!A\u0005BA\u000ca!Z9vC2\u001cHC\u00013r\u0011\u001d9f.!AA\u0002M;qa\u001d\u0002\u0002\u0002#\u0005A/\u0001\u0005NsJ+7m\u001c:e!\u00091SOB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001<\u0014\u0007U<x\u0002E\u0003ywViR%D\u0001z\u0015\u0009Q\u0008\"A\u0004sk:$\u0018.\\3\n\u0005qL(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)1%\u001eC\u0001}R\u0009A\u000fC\u0004mk\u0006\u0005IQI7\u0009\u0013\u0005\rQ/!A\u0005\u0002\u0006\u0015\u0011!B1qa2LH#B\u0013\u0002\u0008\u0005%\u0001BB\n\u0002\u0002\u0001\u0007Q\u0003\u0003\u0004\u001c\u0003\u0003\u0001\r!\u0008\u0005\n\u0003\u001b)\u0018\u0011!CA\u0003\u001f\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u0012\u0005u\u0001#B\u0004\u0002\u0014\u0005]\u0011bAA\u000b\u0011\u00091q\n\u001d;j_:\u0004RaBA\r+uI1!a\u0007\u0009\u0005\u0019!V\u000f\u001d7fe!9\u0011qDA\u0006\u0001\u0004)\u0013a\u0001=%a!I\u00111E;\u0002\u0002\u0013%\u0011QE\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002(A\u00191)!\u000b\n\u0007\u0005-BI\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "C", null, null);
fv.visitEnd();
