[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:39:36 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 8:40:02 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012aa\u0015;sK\u0006l'BA\u000f\u0009!\u00099!%\u0003\u0002$\u0011\u0009\u0019\u0011J\u001c;\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011\u001d\u0002!Q3A\u0005\u0002!\n\u0011!_\u000b\u0002SA\u0011qAK\u0005\u0003W!\u0011qAT8uQ&tw\r\u0003\u0005.\u0001\u0009E\u0009\u0015!\u0003*\u0003\u0009I\u0008\u0005C\u00030\u0001\u0011\u0005\u0001'\u0001\u0004=S:LGO\u0010\u000b\u0004cM\"\u0004C\u0001\u001a\u0001\u001b\u0005\u0011\u0001\"B\n/\u0001\u0004)\u0002\"B\u0014/\u0001\u0004I\u0003b\u0002\u001c\u0001\u0003\u0003%\u0009aN\u0001\u0005G>\u0004\u0018\u0010F\u00022qeBqaE\u001b\u0011\u0002\u0003\u0007Q\u0003C\u0004(kA\u0005\u0009\u0019A\u0015\u0009\u000fm\u0002\u0011\u0013!C\u0001y\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u001f+\u0005Uq4&A \u0011\u0005\u0001+U\"A!\u000b\u0005\u0009\u001b\u0015!C;oG\",7m[3e\u0015\u0009!\u0005\"\u0001\u0006b]:|G/\u0019;j_:L!AR!\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004I\u0001E\u0005I\u0011A%\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u0009!J\u000b\u0002*}!9A\nAA\u0001\n\u0003j\u0015!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001O!\u0009yE+D\u0001Q\u0015\u0009\u0009&+\u0001\u0003mC:<'\"A*\u0002\u0009)\u000cg/Y\u0005\u0003+B\u0013aa\u0015;sS:<\u0007bB,\u0001\u0003\u0003%\u0009\u0001W\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002C!9!\u000cAA\u0001\n\u0003Y\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u00039~\u0003\"aB/\n\u0005yC!aA!os\"9\u0001-WA\u0001\u0002\u0004\u0009\u0013a\u0001=%c!9!\rAA\u0001\n\u0003\u001a\u0017a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003\u0011\u00042!\u001a5]\u001b\u00051'BA4\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003S\u001a\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008W\u0002\u0009\u0009\u0011\"\u0001m\u0003!\u0019\u0017M\\#rk\u0006dGCA7q!\u00099a.\u0003\u0002p\u0011\u00099!i\\8mK\u0006t\u0007b\u00021k\u0003\u0003\u0005\r\u0001\u0018\u0005\u0008e\u0002\u0009\u0009\u0011\"\u0011t\u0003!A\u0017m\u001d5D_\u0012,G#A\u0011\u0009\u000fU\u0004\u0011\u0011!C!m\u0006AAo\\*ue&tw\rF\u0001O\u0011\u001dA\u0008!!A\u0005Be\u000ca!Z9vC2\u001cHCA7{\u0011\u001d\u0001w/!AA\u0002q;q\u0001 \u0002\u0002\u0002#\u0005Q0\u0001\u0005NsJ+7m\u001c:e!\u0009\u0011dPB\u0004\u0002\u0005\u0005\u0005\u0009\u0012A@\u0014\u0009y\u000c\u0009a\u0004\u0009\u0008\u0003\u0007\u0009I!F\u00152\u001b\u0009\u0009)AC\u0002\u0002\u0008!\u0009qA];oi&lW-\u0003\u0003\u0002\u000c\u0005\u0015!!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!1qF C\u0001\u0003\u001f!\u0012! \u0005\u0008kz\u000c\u0009\u0011\"\u0012w\u0011%\u0009)B`A\u0001\n\u0003\u000b9\"A\u0003baBd\u0017\u0010F\u00032\u00033\u0009Y\u0002\u0003\u0004\u0014\u0003'\u0001\r!\u0006\u0005\u0007O\u0005M\u0001\u0019A\u0015\u0009\u0013\u0005}a0!A\u0005\u0002\u0006\u0005\u0012aB;oCB\u0004H.\u001f\u000b\u0005\u0003G\u0009y\u0003E\u0003\u0008\u0003K\u0009I#C\u0002\u0002(!\u0011aa\u00149uS>t\u0007#B\u0004\u0002,UI\u0013bAA\u0017\u0011\u00091A+\u001e9mKJBq!!\r\u0002\u001e\u0001\u0007\u0011'A\u0002yIAB\u0011\"!\u000e\u0003\u0003%I!a\u000e\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0003\u0003s\u00012aTA\u001e\u0013\r\u0009i\u0004\u0015\u0002\u0007\u001f\nTWm\u0019;");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/Stream;", "Lscala/collection/immutable/Stream<Ljava/lang/Object;>;", null);
fv.visitEnd();
