[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:09:34 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 15 s, completed Jun 21, 2013 11:09:54 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0005=q\u0012BA\u0010\u0011\u0005\u0015\u0019\u0006n\u001c:u\u0011!\u0009\u0003A!E!\u0002\u0013i\u0012A\u0001=!\u0011\u0015\u0019\u0003\u0001\"\u0001%\u0003\u0019a\u0014N\\5u}Q\u0011Qe\n\u0009\u0003M\u0001i\u0011A\u0001\u0005\u00067\u0009\u0002\r!\u0008\u0005\u0008S\u0001\u0009\u0009\u0011\"\u0001+\u0003\u0011\u0019w\u000e]=\u0015\u0005\u0015Z\u0003bB\u000e)!\u0003\u0005\r!\u0008\u0005\u0008[\u0001\u0009\n\u0011\"\u0001/\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012a\u000c\u0016\u0003;AZ\u0013!\r\u0009\u0003e]j\u0011a\r\u0006\u0003iU\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005Y\u0002\u0012AC1o]>$\u0018\r^5p]&\u0011\u0001h\r\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007\"\u0002\u001e\u0001\u0009\u0003Z\u0014\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003q\u0002\"aD\u001f\n\u0005y\u0002\"aA%oi\")\u0001\u0009\u0001C!\u0003\u0006AAo\\*ue&tw\rF\u0001C!\u0009\u0019eI\u0004\u0002\u0010\u0009&\u0011Q\u0009E\u0001\u0007!J,G-\u001a4\n\u0005\u001dC%AB*ue&twM\u0003\u0002F!!)!\n\u0001C!\u0017\u00061Q-];bYN$\"\u0001T(\u0011\u0005=i\u0015B\u0001(\u0011\u0005\u001d\u0011un\u001c7fC:Dq\u0001U%\u0002\u0002\u0003\u0007\u0011+A\u0002yIE\u0002\"a\u0004*\n\u0005M\u0003\"aA!os\")Q\u000b\u0001C!-\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012a\u0016\u0009\u0003\u000faK!a\u0012\u0005\u0009\u000bi\u0003A\u0011I.\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003qBQ!\u0018\u0001\u0005By\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002R?\"9\u0001\u000bXA\u0001\u0002\u0004a\u0004\"B1\u0001\u0009\u0003\u0012\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u00051\u001b\u0007b\u0002)a\u0003\u0003\u0005\r!U\u0004\u0008K\n\u0009\u0009\u0011#\u0002g\u0003!i\u0015PU3d_J$\u0007C\u0001\u0014h\r\u001d\u0009!!!A\u0009\u0006!\u001cBaZ5\u000f/A!!.\\\u000f&\u001b\u0005Y'B\u00017\u0011\u0003\u001d\u0011XO\u001c;j[\u0016L!A\\6\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t\u0017\u0007C\u0003$O\u0012\u0005\u0001\u000fF\u0001g\u0011\u0015\u0001u\r\"\u0012s)\u00059\u0006b\u0002;h\u0003\u0003%\u0009)^\u0001\u0006CB\u0004H.\u001f\u000b\u0003KYDQaG:A\u0002uAq\u0001_4\u0002\u0002\u0013\u0005\u00150A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0005il\u0008cA\u0008|;%\u0011A\u0010\u0005\u0002\u0007\u001fB$\u0018n\u001c8\u0009\u000by<\u0008\u0019A\u0013\u0002\u0007a$\u0003\u0007C\u0004\u0002\u0002\u001d$\u0009\"a\u0001\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0002\r\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "S", null, null);
fv.visitEnd();