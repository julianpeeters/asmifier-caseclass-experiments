[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:36:34 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 14 s, completed Jun 21, 2013 11:36:53 PM[0m
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
av0.visit("bytes", "\u0006\u0001}4A!\u0001\u0002A\u000b\u0009AQ*\u001f*fG>\u0014HMC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003a,\u0012A\u0002\u0005\u0009=\u0001\u0011\u0009\u0012)A\u0005\r\u0005\u0011\u0001\u0010\u0009\u0005\u0006A\u0001!\u0009!I\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0005\u0009\"\u0003CA\u0012\u0001\u001b\u0005\u0011\u0001\"B\u000e \u0001\u00041\u0001b\u0002\u0014\u0001\u0003\u0003%\u0009aJ\u0001\u0005G>\u0004\u0018\u0010\u0006\u0002#Q!91$\nI\u0001\u0002\u00041\u0001b\u0002\u0016\u0001#\u0003%\u0009aK\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005a#F\u0001\u0004.W\u0005q\u0003CA\u00185\u001b\u0005\u0001$BA\u00193\u0003%)hn\u00195fG.,GM\u0003\u00024!\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005U\u0002$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\")q\u0007\u0001C!q\u0005A\u0001.Y:i\u0007>$W\rF\u0001:!\u0009y!(\u0003\u0002<!\u0009\u0019\u0011J\u001c;\u0009\u000bu\u0002A\u0011\u0009 \u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012a\u0010\u0009\u0003\u0001\u000es!aD!\n\u0005\u0009\u0003\u0012A\u0002)sK\u0012,g-\u0003\u0002E\u000b\n11\u000b\u001e:j]\u001eT!A\u0011\u0009\u0009\u000b\u001d\u0003A\u0011\u0009%\u0002\r\u0015\u000cX/\u00197t)\u0009IE\n\u0005\u0002\u0010\u0015&\u00111\n\u0005\u0002\u0008\u0005>|G.Z1o\u0011\u001die)!AA\u00029\u000b1\u0001\u001f\u00132!\u0009yq*\u0003\u0002Q!\u0009\u0019\u0011I\\=\u0009\u000bI\u0003A\u0011I*\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005!\u0006CA\u0004V\u0013\u0009!\u0005\u0002C\u0003X\u0001\u0011\u0005\u0003,\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001:\u0011\u0015Q\u0006\u0001\"\u0011\\\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"A\u0014/\u0009\u000f5K\u0016\u0011!a\u0001s!)a\u000c\u0001C!?\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002JA\"9Q*XA\u0001\u0002\u0004qua\u00022\u0003\u0003\u0003E)aY\u0001\u0009\u001bf\u0014VmY8sIB\u00111\u0005\u001a\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0002f'\u0011!gMD\u000c\u0011\u0009\u001dTgAI\u0007\u0002Q*\u0011\u0011\u000eE\u0001\u0008eVtG/[7f\u0013\u0009Y\u0007NA\u0009BEN$(/Y2u\rVt7\r^5p]FBQ\u0001\u00093\u0005\u00025$\u0012a\u0019\u0005\u0006{\u0011$)e\u001c\u000b\u0002)\"9\u0011\u000fZA\u0001\n\u0003\u0013\u0018!B1qa2LHC\u0001\u0012t\u0011\u0015Y\u0002\u000f1\u0001\u0007\u0011\u001d)H-!A\u0005\u0002Z\u000cq!\u001e8baBd\u0017\u0010\u0006\u0002xuB\u0019q\u0002\u001f\u0004\n\u0005e\u0004\"AB(qi&|g\u000eC\u0003|i\u0002\u0007!%A\u0002yIABQ! 3\u0005\u0012y\u000c1B]3bIJ+7o\u001c7wKR\u0009a\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
