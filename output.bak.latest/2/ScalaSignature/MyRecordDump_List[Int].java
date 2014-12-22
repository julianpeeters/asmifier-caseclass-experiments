[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 9:43:13 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 26 s, completed Sep 3, 2013 9:43:44 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015c\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0003\u000f\u0009J!a\u0009\u0005\u0003\u0007%sG\u000f\u0003\u0005&\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005(\u0001\u0009U\r\u0011\"\u0001)\u0003\u0005IX#A\u0015\u0011\u0005)jcBA\u0004,\u0013\u0009a\u0003\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003]=\u0012aa\u0015;sS:<'B\u0001\u0017\u0009\u0011!\u0009\u0004A!E!\u0002\u0013I\u0013AA=!\u0011\u0015\u0019\u0004\u0001\"\u00015\u0003\u0019a\u0014N\\5u}Q\u0019Qg\u000e\u001d\u0011\u0005Y\u0002Q\"\u0001\u0002\u0009\u000bM\u0011\u0004\u0019A\u000b\u0009\u000b\u001d\u0012\u0004\u0019A\u0015\u0009\u000fi\u0002\u0011\u0011!C\u0001w\u0005!1m\u001c9z)\r)D(\u0010\u0005\u0008'e\u0002\n\u00111\u0001\u0016\u0011\u001d9\u0013\u0008%AA\u0002%Bqa\u0010\u0001\u0012\u0002\u0013\u0005\u0001)\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003\u0005S#!\u0006\",\u0003\r\u0003\"\u0001R%\u000e\u0003\u0015S!AR$\u0002\u0013Ut7\r[3dW\u0016$'B\u0001%\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003\u0015\u0016\u0013\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001da\u0005!%A\u0005\u00025\u000babY8qs\u0012\"WMZ1vYR$#'F\u0001OU\u0009I#\u0009C\u0004Q\u0001\u0005\u0005I\u0011I)\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005\u0011\u0006CA*Y\u001b\u0005!&BA+W\u0003\u0011a\u0017M\\4\u000b\u0003]\u000bAA[1wC&\u0011a\u0006\u0016\u0005\u00085\u0002\u0009\u0009\u0011\"\u0001\\\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005\u0009\u0003bB/\u0001\u0003\u0003%\u0009AX\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009y&\r\u0005\u0002\u0008A&\u0011\u0011\r\u0003\u0002\u0004\u0003:L\u0008bB2]\u0003\u0003\u0005\r!I\u0001\u0004q\u0012\n\u0004bB3\u0001\u0003\u0003%\u0009EZ\u0001\u0010aJ|G-^2u\u0013R,'/\u0019;peV\u0009q\rE\u0002iW~k\u0011!\u001b\u0006\u0003U\"\u0009!bY8mY\u0016\u001cG/[8o\u0013\u0009a\u0017N\u0001\u0005Ji\u0016\u0014\u0018\r^8s\u0011\u001dq\u0007!!A\u0005\u0002=\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003aN\u0004\"aB9\n\u0005ID!a\u0002\"p_2,\u0017M\u001c\u0005\u0008G6\u000c\u0009\u00111\u0001`\u0011\u001d)\u0008!!A\u0005BY\u000c\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002C!9\u0001\u0010AA\u0001\n\u0003J\u0018\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003ICqa\u001f\u0001\u0002\u0002\u0013\u0005C0\u0001\u0004fcV\u000cGn\u001d\u000b\u0003avDqa\u0019>\u0002\u0002\u0003\u0007ql\u0002\u0005\u0000\u0005\u0005\u0005\u0009\u0012AA\u0001\u0003!i\u0015PU3d_J$\u0007c\u0001\u001c\u0002\u0004\u0019A\u0011AAA\u0001\u0012\u0003\u0009)aE\u0003\u0002\u0004\u0005\u001dq\u0002E\u0004\u0002\n\u0005=Q#K\u001b\u000e\u0005\u0005-!bAA\u0007\u0011\u00059!/\u001e8uS6,\u0017\u0002BA\u0009\u0003\u0017\u0011\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c83\u0011\u001d\u0019\u00141\u0001C\u0001\u0003+!\"!!\u0001\u0009\u0011a\u000c\u0019!!A\u0005FeD!\"a\u0007\u0002\u0004\u0005\u0005I\u0011QA\u000f\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0015)\u0014qDA\u0011\u0011\u0019\u0019\u0012\u0011\u0004a\u0001+!1q%!\u0007A\u0002%B!\"!\n\u0002\u0004\u0005\u0005I\u0011QA\u0014\u0003\u001d)h.\u00199qYf$B!!\u000b\u00026A)q!a\u000b\u00020%\u0019\u0011Q\u0006\u0005\u0003\r=\u0003H/[8o!\u00159\u0011\u0011G\u000b*\u0013\r\u0009\u0019\u0004\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\u000f\u0005]\u00121\u0005a\u0001k\u0005\u0019\u0001\u0010\n\u0019\u0009\u0015\u0005m\u00121AA\u0001\n\u0013\u0009i$A\u0006sK\u0006$'+Z:pYZ,GCAA !\r\u0019\u0016\u0011I\u0005\u0004\u0003\u0007\"&AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Ljava/lang/Object;>;", null);
fv.visitEnd();
