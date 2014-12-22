[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:31:24 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 29 s, completed Sep 5, 2013 11:31:58 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Mc\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003CA\u0004$\u0013\u0009!\u0003BA\u0002J]RD\u0001B\n\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001\u0002\u000b\u0001\u0003\u0016\u0004%\u0009!K\u0001\u0002sV\u0009!\u0006\u0005\u0002\u0008W%\u0011A\u0006\u0003\u0002\u0008\u001d>$\u0008.\u001b8h\u0011!q\u0003A!E!\u0002\u0013Q\u0013AA=!\u0011!\u0001\u0004A!f\u0001\n\u0003!\u0012!\u0001>\u0009\u0011I\u0002!\u0011#Q\u0001\nU\u0009!A\u001f\u0011\u0009\u000bQ\u0002A\u0011A\u001b\u0002\rqJg.\u001b;?)\u00111\u0004(\u000f\u001e\u0011\u0005]\u0002Q\"\u0001\u0002\u0009\u000bM\u0019\u0004\u0019A\u000b\u0009\u000b!\u001a\u0004\u0019\u0001\u0016\u0009\u000bA\u001a\u0004\u0019A\u000b\u0009\u000fq\u0002\u0011\u0011!C\u0001{\u0005!1m\u001c9z)\u00111dh\u0010!\u0009\u000fMY\u0004\u0013!a\u0001+!9\u0001f\u000fI\u0001\u0002\u0004Q\u0003b\u0002\u0019<!\u0003\u0005\r!\u0006\u0005\u0008\u0005\u0002\u0009\n\u0011\"\u0001D\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012\u0001\u0012\u0016\u0003+\u0015[\u0013A\u0012\u0009\u0003\u000f2k\u0011\u0001\u0013\u0006\u0003\u0013*\u000b\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005-C\u0011AC1o]>$\u0018\r^5p]&\u0011Q\n\u0013\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007bB(\u0001#\u0003%\u0009\u0001U\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133+\u0005\u0009&F\u0001\u0016F\u0011\u001d\u0019\u0006!%A\u0005\u0002\r\u000babY8qs\u0012\"WMZ1vYR$3\u0007C\u0004V\u0001\u0005\u0005I\u0011\u0009,\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u00059\u0006C\u0001-^\u001b\u0005I&B\u0001.\\\u0003\u0011a\u0017M\\4\u000b\u0003q\u000bAA[1wC&\u0011a,\u0017\u0002\u0007'R\u0014\u0018N\\4\u0009\u000f\u0001\u0004\u0011\u0011!C\u0001C\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009!\u0005C\u0004d\u0001\u0005\u0005I\u0011\u00013\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011Q\r\u001b\u0009\u0003\u000f\u0019L!a\u001a\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004jE\u0006\u0005\u0009\u0019\u0001\u0012\u0002\u0007a$\u0013\u0007C\u0004l\u0001\u0005\u0005I\u0011\u00097\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012!\u001c\u0009\u0004]F,W\"A8\u000b\u0005AD\u0011AC2pY2,7\r^5p]&\u0011!o\u001c\u0002\u0009\u0013R,'/\u0019;pe\"9A\u000fAA\u0001\n\u0003)\u0018\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005YL\u0008CA\u0004x\u0013\u0009A\u0008BA\u0004C_>dW-\u00198\u0009\u000f%\u001c\u0018\u0011!a\u0001K\"91\u0010AA\u0001\n\u0003b\u0018\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003\u0009BqA \u0001\u0002\u0002\u0013\u0005s0\u0001\u0005u_N#(/\u001b8h)\u00059\u0006\"CA\u0002\u0001\u0005\u0005I\u0011IA\u0003\u0003\u0019)\u0017/^1mgR\u0019a/a\u0002\u0009\u0011%\u000c\u0009!!AA\u0002\u0015<\u0011\"a\u0003\u0003\u0003\u0003E\u0009!!\u0004\u0002\u00115K(+Z2pe\u0012\u00042aNA\u0008\r!\u0009!!!A\u0009\u0002\u0005E1#BA\u0008\u0003'y\u0001\u0003CA\u000b\u00037)\"&\u0006\u001c\u000e\u0005\u0005]!bAA\r\u0011\u00059!/\u001e8uS6,\u0017\u0002BA\u000f\u0003/\u0011\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c84\u0011\u001d!\u0014q\u0002C\u0001\u0003C!\"!!\u0004\u0009\u0011y\u000cy!!A\u0005F}D!\"a\n\u0002\u0010\u0005\u0005I\u0011QA\u0015\u0003\u0015\u0009\u0007\u000f\u001d7z)\u001d1\u00141FA\u0017\u0003_AaaEA\u0013\u0001\u0004)\u0002B\u0002\u0015\u0002&\u0001\u0007!\u0006\u0003\u00041\u0003K\u0001\r!\u0006\u0005\u000b\u0003g\u0009y!!A\u0005\u0002\u0006U\u0012aB;oCB\u0004H.\u001f\u000b\u0005\u0003o\u0009\u0019\u0005E\u0003\u0008\u0003s\u0009i$C\u0002\u0002<!\u0011aa\u00149uS>t\u0007CB\u0004\u0002@UQS#C\u0002\u0002B!\u0011a\u0001V;qY\u0016\u001c\u0004bBA#\u0003c\u0001\rAN\u0001\u0004q\u0012\u0002\u0004BCA%\u0003\u001f\u0009\u0009\u0011\"\u0003\u0002L\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009i\u0005E\u0002Y\u0003\u001fJ1!!\u0015Z\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;", null);
fv.visitEnd();
