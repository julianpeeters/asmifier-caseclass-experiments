[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:28:52 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 27 s, completed Sep 5, 2013 11:29:26 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001dc\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005eabBA\u0004\u001b\u0013\u0009Y\u0002\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003;y\u0011aa\u0015;sS:<'BA\u000e\u0009\u0011!\u0001\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!\u0011\u0003A!f\u0001\n\u0003\u0019\u0013!A=\u0016\u0003\u0011\u0002\"aB\u0013\n\u0005\u0019B!a\u0002(pi\"Lgn\u001a\u0005\u0009Q\u0001\u0011\u0009\u0012)A\u0005I\u0005\u0011\u0011\u0010\u0009\u0005\u0009U\u0001\u0011)\u001a!C\u0001)\u0005\u0009!\u0010\u0003\u0005-\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009Q\u0008\u0005C\u0003/\u0001\u0011\u0005q&\u0001\u0004=S:LGO\u0010\u000b\u0005aI\u001aD\u0007\u0005\u00022\u00015\u0009!\u0001C\u0003\u0014[\u0001\u0007Q\u0003C\u0003#[\u0001\u0007A\u0005C\u0003+[\u0001\u0007Q\u0003C\u00047\u0001\u0005\u0005I\u0011A\u001c\u0002\u0009\r|\u0007/\u001f\u000b\u0005aaJ$\u0008C\u0004\u0014kA\u0005\u0009\u0019A\u000b\u0009\u000f\u0009*\u0004\u0013!a\u0001I!9!&\u000eI\u0001\u0002\u0004)\u0002b\u0002\u001f\u0001#\u0003%\u0009!P\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005q$FA\u000b@W\u0005\u0001\u0005CA!G\u001b\u0005\u0011%BA\"E\u0003%)hn\u00195fG.,GM\u0003\u0002F\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005\u001d\u0013%!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0011\nAI\u0001\n\u0003Q\u0015AD2paf$C-\u001a4bk2$HEM\u000b\u0002\u0017*\u0012Ae\u0010\u0005\u0008\u001b\u0002\u0009\n\u0011\"\u0001>\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIMBqa\u0014\u0001\u0002\u0002\u0013\u0005\u0003+A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002#B\u0011!kV\u0007\u0002'*\u0011A+V\u0001\u0005Y\u0006twMC\u0001W\u0003\u0011Q\u0017M^1\n\u0005u\u0019\u0006bB-\u0001\u0003\u0003%\u0009AW\u0001\raJ|G-^2u\u0003JLG/_\u000b\u00027B\u0011q\u0001X\u0005\u0003;\"\u00111!\u00138u\u0011\u001dy\u0006!!A\u0005\u0002\u0001\u000ca\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002bIB\u0011qAY\u0005\u0003G\"\u00111!\u00118z\u0011\u001d)g,!AA\u0002m\u000b1\u0001\u001f\u00132\u0011\u001d9\u0007!!A\u0005B!\u000cq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u0002SB\u0019!.\\1\u000e\u0003-T!\u0001\u001c\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002oW\nA\u0011\n^3sCR|'\u000fC\u0004q\u0001\u0005\u0005I\u0011A9\u0002\u0011\r\u000cg.R9vC2$\"A];\u0011\u0005\u001d\u0019\u0018B\u0001;\u0009\u0005\u001d\u0011un\u001c7fC:Dq!Z8\u0002\u0002\u0003\u0007\u0011\rC\u0004x\u0001\u0005\u0005I\u0011\u0009=\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012a\u0017\u0005\u0008u\u0002\u0009\u0009\u0011\"\u0011|\u0003!!xn\u0015;sS:<G#A)\u0009\u000fu\u0004\u0011\u0011!C!}\u00061Q-];bYN$\"A]@\u0009\u000f\u0015d\u0018\u0011!a\u0001C\u001eI\u00111\u0001\u0002\u0002\u0002#\u0005\u0011QA\u0001\u0009\u001bf\u0014VmY8sIB\u0019\u0011'a\u0002\u0007\u0011\u0005\u0011\u0011\u0011!E\u0001\u0003\u0013\u0019R!a\u0002\u0002\u000c=\u0001\u0002\"!\u0004\u0002\u0014U!S\u0003M\u0007\u0003\u0003\u001fQ1!!\u0005\u0009\u0003\u001d\u0011XO\u001c;j[\u0016LA!!\u0006\u0002\u0010\u0009\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u001a\u0009\u000f9\n9\u0001\"\u0001\u0002\u001aQ\u0011\u0011Q\u0001\u0005\u0009u\u0006\u001d\u0011\u0011!C#w\"Q\u0011qDA\u0004\u0003\u0003%\u0009)!\u0009\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000fA\n\u0019#!\n\u0002(!11#!\u0008A\u0002UAaAIA\u000f\u0001\u0004!\u0003B\u0002\u0016\u0002\u001e\u0001\u0007Q\u0003\u0003\u0006\u0002,\u0005\u001d\u0011\u0011!CA\u0003[\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u00020\u0005]\u0002\u0003B\u0004\u0017\u0003c\u0001baBA\u001a+\u0011*\u0012bAA\u001b\u0011\u00091A+\u001e9mKNBq!!\u000f\u0002*\u0001\u0007\u0001'A\u0002yIAB!\"!\u0010\u0002\u0008\u0005\u0005I\u0011BA \u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005\u0005\u0003c\u0001*\u0002D%\u0019\u0011QI*\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/String;>;", null);
fv.visitEnd();
