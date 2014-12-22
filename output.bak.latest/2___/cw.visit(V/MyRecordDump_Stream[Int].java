[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:09:06 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 9:09:33 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012aa\u0015;sK\u0006l'BA\u000f\u0009!\u00099!%\u0003\u0002$\u0011\u0009\u0019\u0011J\u001c;\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011\u001d\u0002!Q3A\u0005\u0002!\n\u0011!_\u000b\u0002SA\u0011qAK\u0005\u0003W!\u0011AAQ=uK\"AQ\u0006\u0001B\u0009B\u0003%\u0011&\u0001\u0002zA!)q\u0006\u0001C\u0001a\u00051A(\u001b8jiz\"2!M\u001a5!\u0009\u0011\u0004!D\u0001\u0003\u0011\u0015\u0019b\u00061\u0001\u0016\u0011\u00159c\u00061\u0001*\u0011\u001d1\u0004!!A\u0005\u0002]\nAaY8qsR\u0019\u0011\u0007O\u001d\u0009\u000fM)\u0004\u0013!a\u0001+!9q%\u000eI\u0001\u0002\u0004I\u0003bB\u001e\u0001#\u0003%\u0009\u0001P\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005i$FA\u000b?W\u0005y\u0004C\u0001!F\u001b\u0005\u0009%B\u0001\"D\u0003%)hn\u00195fG.,GM\u0003\u0002E\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005\u0019\u000b%!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0001\nAI\u0001\n\u0003I\u0015AD2paf$C-\u001a4bk2$HEM\u000b\u0002\u0015*\u0012\u0011F\u0010\u0005\u0008\u0019\u0002\u0009\u0009\u0011\"\u0011N\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009a\n\u0005\u0002P)6\u0009\u0001K\u0003\u0002R%\u0006!A.\u00198h\u0015\u0005\u0019\u0016\u0001\u00026bm\u0006L!!\u0016)\u0003\rM#(/\u001b8h\u0011\u001d9\u0006!!A\u0005\u0002a\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012!\u0009\u0005\u00085\u0002\u0009\u0009\u0011\"\u0001\\\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"\u0001X0\u0011\u0005\u001di\u0016B\u00010\u0009\u0005\r\u0009e.\u001f\u0005\u0008Af\u000b\u0009\u00111\u0001\"\u0003\rAH%\r\u0005\u0008E\u0002\u0009\u0009\u0011\"\u0011d\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u00013\u0011\u0007\u0015DG,D\u0001g\u0015\u00099\u0007\"\u0001\u0006d_2dWm\u0019;j_:L!!\u001b4\u0003\u0011%#XM]1u_JDqa\u001b\u0001\u0002\u0002\u0013\u0005A.\u0001\u0005dC:,\u0015/^1m)\u0009i\u0007\u000f\u0005\u0002\u0008]&\u0011q\u000e\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d\u0001'.!AA\u0002qCqA\u001d\u0001\u0002\u0002\u0013\u00053/\u0001\u0005iCND7i\u001c3f)\u0005\u0009\u0003bB;\u0001\u0003\u0003%\u0009E^\u0001\u0009i>\u001cFO]5oOR\u0009a\nC\u0004y\u0001\u0005\u0005I\u0011I=\u0002\r\u0015\u000cX/\u00197t)\u0009i'\u0010C\u0004ao\u0006\u0005\u0009\u0019\u0001/\u0008\u000fq\u0014\u0011\u0011!E\u0001{\u0006AQ*\u001f*fG>\u0014H\r\u0005\u00023}\u001a9\u0011AAA\u0001\u0012\u0003y8\u0003\u0002@\u0002\u0002=\u0001r!a\u0001\u0002\nUI\u0013'\u0004\u0002\u0002\u0006)\u0019\u0011q\u0001\u0005\u0002\u000fI,h\u000e^5nK&!\u00111BA\u0003\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0007_y$\u0009!a\u0004\u0015\u0003uDq!\u001e@\u0002\u0002\u0013\u0015c\u000fC\u0005\u0002\u0016y\u000c\u0009\u0011\"!\u0002\u0018\u0005)\u0011\r\u001d9msR)\u0011'!\u0007\u0002\u001c!11#a\u0005A\u0002UAaaJA\n\u0001\u0004I\u0003\"CA\u0010}\u0006\u0005I\u0011QA\u0011\u0003\u001d)h.\u00199qYf$B!a\u0009\u00020A)q!!\n\u0002*%\u0019\u0011q\u0005\u0005\u0003\r=\u0003H/[8o!\u00159\u00111F\u000b*\u0013\r\u0009i\u0003\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\u000f\u0005E\u0012Q\u0004a\u0001c\u0005\u0019\u0001\u0010\n\u0019\u0009\u0013\u0005Ub0!A\u0005\n\u0005]\u0012a\u0003:fC\u0012\u0014Vm]8mm\u0016$\"!!\u000f\u0011\u0007=\u000bY$C\u0002\u0002>A\u0013aa\u00142kK\u000e$\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/Stream;", "Lscala/collection/immutable/Stream<Ljava/lang/Object;>;", null);
fv.visitEnd();
