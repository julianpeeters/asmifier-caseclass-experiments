[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:33:40 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 14 s, completed Jun 21, 2013 11:34:00 PM[0m
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.attrs.*;
public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "MyRecord", null, "java/lang/Object", new String[] { "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001}4A!\u0001\u0002A\u000b\u0009AQ*\u001f*fG>\u0014HMC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003a,\u0012!\u0008\u0009\u0003\u001fyI!a\u0008\u0009\u0003\u000f\u0009{w\u000e\\3b]\"A\u0011\u0005\u0001B\u0009B\u0003%Q$\u0001\u0002yA!)1\u0005\u0001C\u0001I\u00051A(\u001b8jiz\"\"!J\u0014\u0011\u0005\u0019\u0002Q\"\u0001\u0002\u0009\u000bm\u0011\u0003\u0019A\u000f\u0009\u000f%\u0002\u0011\u0011!C\u0001U\u0005!1m\u001c9z)\u0009)3\u0006C\u0004\u001cQA\u0005\u0009\u0019A\u000f\u0009\u000f5\u0002\u0011\u0013!C\u0001]\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u0018+\u0005u\u00014&A\u0019\u0011\u0005I:T\"A\u001a\u000b\u0005Q*\u0014!C;oG\",7m[3e\u0015\u00091\u0004#\u0001\u0006b]:|G/\u0019;j_:L!\u0001O\u001a\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0003;\u0001\u0011\u00053(\u0001\u0005iCND7i\u001c3f)\u0005a\u0004CA\u0008>\u0013\u0009q\u0004CA\u0002J]RDQ\u0001\u0011\u0001\u0005B\u0005\u000b\u0001\u0002^8TiJLgn\u001a\u000b\u0002\u0005B\u00111I\u0012\u0008\u0003\u001f\u0011K!!\u0012\u0009\u0002\rA\u0013X\rZ3g\u0013\u00099\u0005J\u0001\u0004TiJLgn\u001a\u0006\u0003\u000bBAQA\u0013\u0001\u0005B-\u000ba!Z9vC2\u001cHCA\u000fM\u0011\u001di\u0015*!AA\u00029\u000b1\u0001\u001f\u00132!\u0009yq*\u0003\u0002Q!\u0009\u0019\u0011I\\=\u0009\u000bI\u0003A\u0011I*\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005!\u0006CA\u0004V\u0013\u00099\u0005\u0002C\u0003X\u0001\u0011\u0005\u0003,\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001=\u0011\u0015Q\u0006\u0001\"\u0011\\\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"A\u0014/\u0009\u000f5K\u0016\u0011!a\u0001y!)a\u000c\u0001C!?\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002\u001eA\"9Q*XA\u0001\u0002\u0004qua\u00022\u0003\u0003\u0003E)aY\u0001\u0009\u001bf\u0014VmY8sIB\u0011a\u0005\u001a\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0002f'\u0011!gMD\u000c\u0011\u0009\u001dTW$J\u0007\u0002Q*\u0011\u0011\u000eE\u0001\u0008eVtG/[7f\u0013\u0009Y\u0007NA\u0009BEN$(/Y2u\rVt7\r^5p]FBQa\u00093\u0005\u00025$\u0012a\u0019\u0005\u0006\u0001\u0012$)e\u001c\u000b\u0002)\"9\u0011\u000fZA\u0001\n\u0003\u0013\u0018!B1qa2LHCA\u0013t\u0011\u0015Y\u0002\u000f1\u0001\u001e\u0011\u001d)H-!A\u0005\u0002Z\u000cq!\u001e8baBd\u0017\u0010\u0006\u0002xuB\u0019q\u0002_\u000f\n\u0005e\u0004\"AB(qi&|g\u000eC\u0003|i\u0002\u0007Q%A\u0002yIABQ! 3\u0005\u0012y\u000c1B]3bIJ+7o\u001c7wKR\u0009a\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Z", null, null);
fv.visitEnd();
