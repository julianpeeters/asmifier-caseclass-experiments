[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:33:17 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 14 s, completed Jun 21, 2013 11:33:36 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0005=q\u0012BA\u0010\u0011\u0005\u0019!u.\u001e2mK\"A\u0011\u0005\u0001B\u0009B\u0003%Q$\u0001\u0002yA!)1\u0005\u0001C\u0001I\u00051A(\u001b8jiz\"\"!J\u0014\u0011\u0005\u0019\u0002Q\"\u0001\u0002\u0009\u000bm\u0011\u0003\u0019A\u000f\u0009\u000f%\u0002\u0011\u0011!C\u0001U\u0005!1m\u001c9z)\u0009)3\u0006C\u0004\u001cQA\u0005\u0009\u0019A\u000f\u0009\u000f5\u0002\u0011\u0013!C\u0001]\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u0018+\u0005u\u00014&A\u0019\u0011\u0005I:T\"A\u001a\u000b\u0005Q*\u0014!C;oG\",7m[3e\u0015\u00091\u0004#\u0001\u0006b]:|G/\u0019;j_:L!\u0001O\u001a\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0003;\u0001\u0011\u00053(\u0001\u0005iCND7i\u001c3f)\u0005a\u0004CA\u0008>\u0013\u0009q\u0004CA\u0002J]RDQ\u0001\u0011\u0001\u0005B\u0005\u000b\u0001\u0002^8TiJLgn\u001a\u000b\u0002\u0005B\u00111I\u0012\u0008\u0003\u001f\u0011K!!\u0012\u0009\u0002\rA\u0013X\rZ3g\u0013\u00099\u0005J\u0001\u0004TiJLgn\u001a\u0006\u0003\u000bBAQA\u0013\u0001\u0005B-\u000ba!Z9vC2\u001cHC\u0001'P!\u0009yQ*\u0003\u0002O!\u00099!i\\8mK\u0006t\u0007b\u0002)J\u0003\u0003\u0005\r!U\u0001\u0004q\u0012\n\u0004CA\u0008S\u0013\u0009\u0019\u0006CA\u0002B]fDQ!\u0016\u0001\u0005BY\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#A,\u0011\u0005\u001dA\u0016BA$\u0009\u0011\u0015Q\u0006\u0001\"\u0011\\\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005a\u0004\"B/\u0001\u0009\u0003r\u0016A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003#~Cq\u0001\u0015/\u0002\u0002\u0003\u0007A\u0008C\u0003b\u0001\u0011\u0005#-\u0001\u0005dC:,\u0015/^1m)\u0009a5\rC\u0004QA\u0006\u0005\u0009\u0019A)\u0008\u000f\u0015\u0014\u0011\u0011!E\u0003M\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002'O\u001a9\u0011AAA\u0001\u0012\u000bA7\u0003B4j\u001d]\u0001BA[7\u001eK5\u00091N\u0003\u0002m!\u00059!/\u001e8uS6,\u0017B\u00018l\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|g.\r\u0005\u0006G\u001d$\u0009\u0001\u001d\u000b\u0002M\")\u0001i\u001aC#eR\u0009q\u000bC\u0004uO\u0006\u0005I\u0011Q;\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u0005\u00152\u0008\"B\u000et\u0001\u0004i\u0002b\u0002=h\u0003\u0003%\u0009)_\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0009QX\u0010E\u0002\u0010wvI!\u0001 \u0009\u0003\r=\u0003H/[8o\u0011\u0015qx\u000f1\u0001&\u0003\rAH\u0005\r\u0005\u0008\u0003\u00039G\u0011CA\u0002\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0003\u0019\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "D", null, null);
fv.visitEnd();
