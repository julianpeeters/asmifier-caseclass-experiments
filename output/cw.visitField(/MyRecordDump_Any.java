[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:34:51 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 14 s, completed Jun 21, 2013 11:35:10 PM[0m
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
av0.visit("bytes", "\u0006\u0001}4A!\u0001\u0002A\u000b\u0009AQ*\u001f*fG>\u0014HMC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003a,\u0012!\u0008\u0009\u0003\u001fyI!a\u0008\u0009\u0003\u0007\u0005s\u0017\u0010\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u001e\u0003\u0009A\u0008\u0005C\u0003$\u0001\u0011\u0005A%\u0001\u0004=S:LGO\u0010\u000b\u0003K\u001d\u0002\"A\n\u0001\u000e\u0003\u0009AQa\u0007\u0012A\u0002uAq!\u000b\u0001\u0002\u0002\u0013\u0005!&\u0001\u0003d_BLHCA\u0013,\u0011\u001dY\u0002\u0006%AA\u0002uAq!\u000c\u0001\u0012\u0002\u0013\u0005a&\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003=R#!\u0008\u0019,\u0003E\u0002\"AM\u001c\u000e\u0003MR!\u0001N\u001b\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001c\u0011\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003qM\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u0015Q\u0004\u0001\"\u0011<\u0003!A\u0017m\u001d5D_\u0012,G#\u0001\u001f\u0011\u0005=i\u0014B\u0001 \u0011\u0005\rIe\u000e\u001e\u0005\u0006\u0001\u0002!\u0009%Q\u0001\u0009i>\u001cFO]5oOR\u0009!\u0009\u0005\u0002D\r:\u0011q\u0002R\u0005\u0003\u000bB\u0009a\u0001\u0015:fI\u00164\u0017BA$I\u0005\u0019\u0019FO]5oO*\u0011Q\u0009\u0005\u0005\u0006\u0015\u0002!\u0009eS\u0001\u0007KF,\u0018\r\\:\u0015\u00051{\u0005CA\u0008N\u0013\u0009q\u0005CA\u0004C_>dW-\u00198\u0009\u000fAK\u0015\u0011!a\u0001;\u0005\u0019\u0001\u0010J\u0019\u0009\u000bI\u0003A\u0011I*\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005!\u0006CA\u0004V\u0013\u00099\u0005\u0002C\u0003X\u0001\u0011\u0005\u0003,\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001=\u0011\u0015Q\u0006\u0001\"\u0011\\\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"!\u0008/\u0009\u000fAK\u0016\u0011!a\u0001y!)a\u000c\u0001C!?\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002MA\"9\u0001+XA\u0001\u0002\u0004ira\u00022\u0003\u0003\u0003E)aY\u0001\u0009\u001bf\u0014VmY8sIB\u0011a\u0005\u001a\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0002f'\u0011!gMD\u000c\u0011\u0009\u001dTW$J\u0007\u0002Q*\u0011\u0011\u000eE\u0001\u0008eVtG/[7f\u0013\u0009Y\u0007NA\u0009BEN$(/Y2u\rVt7\r^5p]FBQa\u00093\u0005\u00025$\u0012a\u0019\u0005\u0006\u0001\u0012$)e\u001c\u000b\u0002)\"9\u0011\u000fZA\u0001\n\u0003\u0013\u0018!B1qa2LHCA\u0013t\u0011\u0015Y\u0002\u000f1\u0001\u001e\u0011\u001d)H-!A\u0005\u0002Z\u000cq!\u001e8baBd\u0017\u0010\u0006\u0002xuB\u0019q\u0002_\u000f\n\u0005e\u0004\"AB(qi&|g\u000eC\u0003|i\u0002\u0007Q%A\u0002yIABQ! 3\u0005\u0012y\u000c1B]3bIJ+7o\u001c7wKR\u0009a\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
