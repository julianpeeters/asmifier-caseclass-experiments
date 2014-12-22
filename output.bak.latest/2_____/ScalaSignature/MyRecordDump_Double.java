[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:21:57 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 11:22:23 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0004E_V\u0014G.\u001a\u0005\u00093\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0001\u0010\u0009\u0005\u00097\u0001\u0011)\u001a!C\u00019\u0005\u0009\u00110F\u0001\u001e!\u00099a$\u0003\u0002 \u0011\u00099aj\u001c;iS:<\u0007\u0002C\u0011\u0001\u0005#\u0005\u000b\u0011B\u000f\u0002\u0005e\u0004\u0003\u0002C\u0012\u0001\u0005+\u0007I\u0011\u0001\u000b\u0002\u0003iD\u0001\"\n\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003u\u0002BQa\n\u0001\u0005\u0002!\na\u0001P5oSRtD\u0003B\u0015,Y5\u0002\"A\u000b\u0001\u000e\u0003\u0009AQa\u0005\u0014A\u0002UAQa\u0007\u0014A\u0002uAQa\u0009\u0014A\u0002UAqa\u000c\u0001\u0002\u0002\u0013\u0005\u0001'\u0001\u0003d_BLH\u0003B\u00152eMBqa\u0005\u0018\u0011\u0002\u0003\u0007Q\u0003C\u0004\u001c]A\u0005\u0009\u0019A\u000f\u0009\u000f\rr\u0003\u0013!a\u0001+!9Q\u0007AI\u0001\n\u00031\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002o)\u0012Q\u0003O\u0016\u0002sA\u0011!hP\u0007\u0002w)\u0011A(P\u0001\nk:\u001c\u0007.Z2lK\u0012T!A\u0010\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002Aw\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000f\u0009\u0003\u0011\u0013!C\u0001\u0007\u0006q1m\u001c9zI\u0011,g-Y;mi\u0012\u0012T#\u0001#+\u0005uA\u0004b\u0002$\u0001#\u0003%\u0009AN\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00134\u0011\u001dA\u0005!!A\u0005B%\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001&\u0011\u0005-\u0003V\"\u0001'\u000b\u00055s\u0015\u0001\u00027b]\u001eT\u0011aT\u0001\u0005U\u00064\u0018-\u0003\u0002R\u0019\n11\u000b\u001e:j]\u001eDqa\u0015\u0001\u0002\u0002\u0013\u0005A+\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001V!\u00099a+\u0003\u0002X\u0011\u0009\u0019\u0011J\u001c;\u0009\u000fe\u0003\u0011\u0011!C\u00015\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA._!\u00099A,\u0003\u0002^\u0011\u0009\u0019\u0011I\\=\u0009\u000f}C\u0016\u0011!a\u0001+\u0006\u0019\u0001\u0010J\u0019\u0009\u000f\u0005\u0004\u0011\u0011!C!E\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001d!\r!wmW\u0007\u0002K*\u0011a\rC\u0001\u000bG>dG.Z2uS>t\u0017B\u00015f\u0005!IE/\u001a:bi>\u0014\u0008b\u00026\u0001\u0003\u0003%\u0009a[\u0001\u0009G\u0006tW)];bYR\u0011An\u001c\u0009\u0003\u000f5L!A\u001c\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9q,[A\u0001\u0002\u0004Y\u0006bB9\u0001\u0003\u0003%\u0009E]\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009Q\u000bC\u0004u\u0001\u0005\u0005I\u0011I;\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012A\u0013\u0005\u0008o\u0002\u0009\u0009\u0011\"\u0011y\u0003\u0019)\u0017/^1mgR\u0011A.\u001f\u0005\u0008?Z\u000c\u0009\u00111\u0001\\\u000f\u001dY(!!A\u0009\u0002q\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003Uu4q!\u0001\u0002\u0002\u0002#\u0005apE\u0002~>\u0001\u0002\"!\u0001\u0002\u0008UiR#K\u0007\u0003\u0003\u0007Q1!!\u0002\u0009\u0003\u001d\u0011XO\u001c;j[\u0016LA!!\u0003\u0002\u0004\u0009\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u001a\u0009\r\u001djH\u0011AA\u0007)\u0005a\u0008b\u0002;~\u0003\u0003%)%\u001e\u0005\n\u0003'i\u0018\u0011!CA\u0003+\u0009Q!\u00199qYf$r!KA\u000c\u00033\u0009Y\u0002\u0003\u0004\u0014\u0003#\u0001\r!\u0006\u0005\u00077\u0005E\u0001\u0019A\u000f\u0009\r\r\n\u0009\u00021\u0001\u0016\u0011%\u0009y\"`A\u0001\n\u0003\u000b\u0009#A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005\r\u0012q\u0006\u0009\u0006\u000f\u0005\u0015\u0012\u0011F\u0005\u0004\u0003OA!AB(qi&|g\u000e\u0005\u0004\u0008\u0003W)R$F\u0005\u0004\u0003[A!A\u0002+va2,7\u0007C\u0004\u00022\u0005u\u0001\u0019A\u0015\u0002\u0007a$\u0003\u0007C\u0005\u00026u\u000c\u0009\u0011\"\u0003\u00028\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009I\u0004E\u0002L\u0003wI1!!\u0010M\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "D", null, null);
fv.visitEnd();
