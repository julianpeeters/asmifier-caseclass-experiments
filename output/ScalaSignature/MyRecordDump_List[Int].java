[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:38:43 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 18 s, completed Jun 21, 2013 11:39:06 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005]a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0007y1\u0013F\u0004\u0002 I9\u0011\u0001eI\u0007\u0002C)\u0011!\u0005B\u0001\u0007yI|w\u000e\u001e \n\u0003EI!!\n\u0009\u0002\u000fA\u000c7m[1hK&\u0011q\u0005\u000b\u0002\u0005\u0019&\u001cHO\u0003\u0002&!A\u0011qBK\u0005\u0003WA\u00111!\u00138u\u0011!i\u0003A!E!\u0002\u0013i\u0012A\u0001=!\u0011\u0015y\u0003\u0001\"\u00011\u0003\u0019a\u0014N\\5u}Q\u0011\u0011g\r\u0009\u0003e\u0001i\u0011A\u0001\u0005\u000679\u0002\r!\u0008\u0005\u0008k\u0001\u0009\u0009\u0011\"\u00017\u0003\u0011\u0019w\u000e]=\u0015\u0005E:\u0004bB\u000e5!\u0003\u0005\r!\u0008\u0005\u0008s\u0001\u0009\n\u0011\"\u0001;\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012a\u000f\u0016\u0003;qZ\u0013!\u0010\u0009\u0003}\rk\u0011a\u0010\u0006\u0003\u0001\u0006\u000b\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005\u0009\u0003\u0012AC1o]>$\u0018\r^5p]&\u0011Ai\u0010\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007\"\u0002$\u0001\u0009\u0003:\u0015\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003%BQ!\u0013\u0001\u0005B)\u000b\u0001\u0002^8TiJLgn\u001a\u000b\u0002\u0017B\u0011Aj\u0014\u0008\u0003\u001f5K!A\u0014\u0009\u0002\rA\u0013X\rZ3g\u0013\u0009\u0001\u0016K\u0001\u0004TiJLgn\u001a\u0006\u0003\u001dBAQa\u0015\u0001\u0005BQ\u000ba!Z9vC2\u001cHCA+Y!\u0009ya+\u0003\u0002X!\u00099!i\\8mK\u0006t\u0007bB-S\u0003\u0003\u0005\rAW\u0001\u0004q\u0012\n\u0004CA\u0008\\\u0013\u0009a\u0006CA\u0002B]fDQA\u0018\u0001\u0005B}\u000bQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u00011\u0011\u0005\u001d\u0009\u0017B\u0001)\u0009\u0011\u0015\u0019\u0007\u0001\"\u0011e\u00031\u0001(o\u001c3vGR\u000c%/\u001b;z+\u0005I\u0003\"\u00024\u0001\u0009\u0003:\u0017A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u00035\"Dq!W3\u0002\u0002\u0003\u0007\u0011\u0006C\u0003k\u0001\u0011\u00053.\u0001\u0005dC:,\u0015/^1m)\u0009)F\u000eC\u0004ZS\u0006\u0005\u0009\u0019\u0001.\u0008\u000f9\u0014\u0011\u0011!E\u0003_\u0006AQ*\u001f*fG>\u0014H\r\u0005\u00023a\u001a9\u0011AAA\u0001\u0012\u000b\u00098\u0003\u00029s\u001d]\u0001Ba\u001d<\u001ec5\u0009AO\u0003\u0002v!\u00059!/\u001e8uS6,\u0017BA<u\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|g.\r\u0005\u0006_A$\u0009!\u001f\u000b\u0002_\")\u0011\n\u001dC#wR\u0009\u0001\rC\u0004~a\u0006\u0005I\u0011\u0011@\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u0005Ez\u0008\"B\u000e}\u0001\u0004i\u0002\"CA\u0002a\u0006\u0005I\u0011QA\u0003\u0003\u001d)h.\u00199qYf$B!a\u0002\u0002\u000eA!q\"!\u0003\u001e\u0013\r\u0009Y\u0001\u0005\u0002\u0007\u001fB$\u0018n\u001c8\u0009\u000f\u0005=\u0011\u0011\u0001a\u0001c\u0005\u0019\u0001\u0010\n\u0019\u0009\u000f\u0005M\u0001\u000f\"\u0005\u0002\u0016\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u00051\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Ljava/lang/Object;>;", null);
fv.visitEnd();
