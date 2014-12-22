[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:30:59 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 5, 2013 8:31:30 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0003M_:<\u0007\u0002C\r\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005a\u0004\u0003\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003e,\u0012!\u0008\u0009\u0003\u000fyI!a\u0008\u0005\u0003\u000f9{G\u000f[5oO\"A\u0011\u0005\u0001B\u0009B\u0003%Q$\u0001\u0002zA!)1\u0005\u0001C\u0001I\u00051A(\u001b8jiz\"2!J\u0014)!\u00091\u0003!D\u0001\u0003\u0011\u0015\u0019\"\u00051\u0001\u0016\u0011\u0015Y\"\u00051\u0001\u001e\u0011\u001dQ\u0003!!A\u0005\u0002-\nAaY8qsR\u0019Q\u0005L\u0017\u0009\u000fMI\u0003\u0013!a\u0001+!91$\u000bI\u0001\u0002\u0004i\u0002bB\u0018\u0001#\u0003%\u0009\u0001M\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005\u0009$FA\u000b3W\u0005\u0019\u0004C\u0001\u001b:\u001b\u0005)$B\u0001\u001c8\u0003%)hn\u00195fG.,GM\u0003\u00029\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005i*$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9A\u0008AI\u0001\n\u0003i\u0014AD2paf$C-\u001a4bk2$HEM\u000b\u0002})\u0012QD\r\u0005\u0008\u0001\u0002\u0009\u0009\u0011\"\u0011B\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009!\u0009\u0005\u0002D\u00116\u0009AI\u0003\u0002F\r\u0006!A.\u00198h\u0015\u00059\u0015\u0001\u00026bm\u0006L!!\u0013#\u0003\rM#(/\u001b8h\u0011\u001dY\u0005!!A\u0005\u00021\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012!\u0014\u0009\u0003\u000f9K!a\u0014\u0005\u0003\u0007%sG\u000fC\u0004R\u0001\u0005\u0005I\u0011\u0001*\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u00111K\u0016\u0009\u0003\u000fQK!!\u0016\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004X!\u0006\u0005\u0009\u0019A'\u0002\u0007a$\u0013\u0007C\u0004Z\u0001\u0005\u0005I\u0011\u0009.\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012a\u0017\u0009\u00049~\u001bV\"A/\u000b\u0005yC\u0011AC2pY2,7\r^5p]&\u0011\u0001-\u0018\u0002\u0009\u0013R,'/\u0019;pe\"9!\rAA\u0001\n\u0003\u0019\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005\u0011<\u0007CA\u0004f\u0013\u00091\u0007BA\u0004C_>dW-\u00198\u0009\u000f]\u000b\u0017\u0011!a\u0001'\"9\u0011\u000eAA\u0001\n\u0003R\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u00035Cq\u0001\u001c\u0001\u0002\u0002\u0013\u0005S.\u0001\u0005u_N#(/\u001b8h)\u0005\u0011\u0005bB8\u0001\u0003\u0003%\u0009\u0005]\u0001\u0007KF,\u0018\r\\:\u0015\u0005\u0011\u000c\u0008bB,o\u0003\u0003\u0005\raU\u0004\u0008g\n\u0009\u0009\u0011#\u0001u\u0003!i\u0015PU3d_J$\u0007C\u0001\u0014v\r\u001d\u0009!!!A\u0009\u0002Y\u001c2!^<\u0010!\u0015A80F\u000f&\u001b\u0005I(B\u0001>\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!\u0001`=\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007C\u0003$k\u0012\u0005a\u0010F\u0001u\u0011\u001daW/!A\u0005F5D\u0011\"a\u0001v\u0003\u0003%\u0009)!\u0002\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000b\u0015\n9!!\u0003\u0009\rM\u0009\u0009\u00011\u0001\u0016\u0011\u0019Y\u0012\u0011\u0001a\u0001;!I\u0011QB;\u0002\u0002\u0013\u0005\u0015qB\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009\u0009\"!\u0008\u0011\u000b\u001d\u0009\u0019\"a\u0006\n\u0007\u0005U\u0001B\u0001\u0004PaRLwN\u001c\u0009\u0006\u000f\u0005eQ#H\u0005\u0004\u00037A!A\u0002+va2,'\u0007C\u0004\u0002 \u0005-\u0001\u0019A\u0013\u0002\u0007a$\u0003\u0007C\u0005\u0002$U\u000c\u0009\u0011\"\u0003\u0002&\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u00099\u0003E\u0002D\u0003SI1!a\u000bE\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "J", null, null);
fv.visitEnd();
