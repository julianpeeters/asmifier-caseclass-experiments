[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:38:33 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 8:38:59 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Ub\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002cA\u0004\u00171%\u0011q\u0003\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\u0005eabBA\u0004\u001b\u0013\u0009Y\u0002\"\u0001\u0004Qe\u0016$WMZ\u0005\u0003;y\u0011aa\u0015;sS:<'BA\u000e\u0009\u0011!\u0001\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!\u0011\u0003A!f\u0001\n\u0003\u0019\u0013!A=\u0016\u0003\u0011\u0002\"aB\u0013\n\u0005\u0019B!a\u0002(pi\"Lgn\u001a\u0005\u0009Q\u0001\u0011\u0009\u0012)A\u0005I\u0005\u0011\u0011\u0010\u0009\u0005\u0006U\u0001!\u0009aK\u0001\u0007y%t\u0017\u000e\u001e \u0015\u00071rs\u0006\u0005\u0002.\u00015\u0009!\u0001C\u0003\u0014S\u0001\u0007Q\u0003C\u0003#S\u0001\u0007A\u0005C\u00042\u0001\u0005\u0005I\u0011\u0001\u001a\u0002\u0009\r|\u0007/\u001f\u000b\u0004YM\"\u0004bB\n1!\u0003\u0005\r!\u0006\u0005\u0008EA\u0002\n\u00111\u0001%\u0011\u001d1\u0004!%A\u0005\u0002]\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u00019U\u0009)\u0012hK\u0001;!\u0009Y\u0004)D\u0001=\u0015\u0009id(A\u0005v]\u000eDWmY6fI*\u0011q\u0008C\u0001\u000bC:tw\u000e^1uS>t\u0017BA!=\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u0007\u0002\u0009\n\u0011\"\u0001E\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012!\u0012\u0016\u0003IeBqa\u0012\u0001\u0002\u0002\u0013\u0005\u0003*A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002\u0013B\u0011!jT\u0007\u0002\u0017*\u0011A*T\u0001\u0005Y\u0006twMC\u0001O\u0003\u0011Q\u0017M^1\n\u0005uY\u0005bB)\u0001\u0003\u0003%\u0009AU\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002'B\u0011q\u0001V\u0005\u0003+\"\u00111!\u00138u\u0011\u001d9\u0006!!A\u0005\u0002a\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002Z9B\u0011qAW\u0005\u00037\"\u00111!\u00118z\u0011\u001dif+!AA\u0002M\u000b1\u0001\u001f\u00132\u0011\u001dy\u0006!!A\u0005B\u0001\u000cq\u0002\u001d:pIV\u001cG/\u0013;fe\u0006$xN]\u000b\u0002CB\u0019!-Z-\u000e\u0003\rT!\u0001\u001a\u0005\u0002\u0015\r|G\u000e\\3di&|g.\u0003\u0002gG\nA\u0011\n^3sCR|'\u000fC\u0004i\u0001\u0005\u0005I\u0011A5\u0002\u0011\r\u000cg.R9vC2$\"A[7\u0011\u0005\u001dY\u0017B\u00017\u0009\u0005\u001d\u0011un\u001c7fC:Dq!X4\u0002\u0002\u0003\u0007\u0011\u000cC\u0004p\u0001\u0005\u0005I\u0011\u00099\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012a\u0015\u0005\u0008e\u0002\u0009\u0009\u0011\"\u0011t\u0003!!xn\u0015;sS:<G#A%\u0009\u000fU\u0004\u0011\u0011!C!m\u00061Q-];bYN$\"A[<\u0009\u000fu#\u0018\u0011!a\u00013\u001e9\u0011PAA\u0001\u0012\u0003Q\u0018\u0001C'z%\u0016\u001cwN\u001d3\u0011\u00055ZhaB\u0001\u0003\u0003\u0003E\u0009\u0001`\n\u0004wv|\u0001C\u0002@\u0002\u0004U!C&D\u0001\u0000\u0015\r\u0009\u0009\u0001C\u0001\u0008eVtG/[7f\u0013\r\u0009)a \u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u0014\u0004B\u0002\u0016|\u0009\u0003\u0009I\u0001F\u0001{\u0011\u001d\u001180!A\u0005FMD\u0011\"a\u0004|\u0003\u0003%\u0009)!\u0005\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000b1\n\u0019\"!\u0006\u0009\rM\u0009i\u00011\u0001\u0016\u0011\u0019\u0011\u0013Q\u0002a\u0001I!I\u0011\u0011D>\u0002\u0002\u0013\u0005\u00151D\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009i\"!\n\u0011\u0009\u001d1\u0012q\u0004\u0009\u0006\u000f\u0005\u0005R\u0003J\u0005\u0004\u0003GA!A\u0002+va2,'\u0007C\u0004\u0002(\u0005]\u0001\u0019\u0001\u0017\u0002\u0007a$\u0003\u0007C\u0005\u0002,m\u000c\u0009\u0011\"\u0003\u0002.\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009y\u0003E\u0002K\u0003cI1!a\rL\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/String;>;", null);
fv.visitEnd();
