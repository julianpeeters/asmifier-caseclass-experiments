[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:37:54 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 14 s, completed Jun 21, 2013 11:38:13 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0005a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0007=q\u0002%\u0003\u0002 !\u00091q\n\u001d;j_:\u0004\"aD\u0011\n\u0005\u0009\u0002\"aA%oi\"AA\u0005\u0001B\u0009B\u0003%Q$\u0001\u0002yA!)a\u0005\u0001C\u0001O\u00051A(\u001b8jiz\"\"\u0001\u000b\u0016\u0011\u0005%\u0002Q\"\u0001\u0002\u0009\u000bm)\u0003\u0019A\u000f\u0009\u000f1\u0002\u0011\u0011!C\u0001[\u0005!1m\u001c9z)\u0009Ac\u0006C\u0004\u001cWA\u0005\u0009\u0019A\u000f\u0009\u000fA\u0002\u0011\u0013!C\u0001c\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#\u0001\u001a+\u0005u\u00194&\u0001\u001b\u0011\u0005URT\"\u0001\u001c\u000b\u0005]B\u0014!C;oG\",7m[3e\u0015\u0009I\u0004#\u0001\u0006b]:|G/\u0019;j_:L!a\u000f\u001c\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0003>\u0001\u0011\u0005c(\u0001\u0005iCND7i\u001c3f)\u0005\u0001\u0003\"\u0002!\u0001\u0009\u0003\n\u0015\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003\u0009\u0003\"a\u0011$\u000f\u0005=!\u0015BA#\u0011\u0003\u0019\u0001&/\u001a3fM&\u0011q\u0009\u0013\u0002\u0007'R\u0014\u0018N\\4\u000b\u0005\u0015\u0003\u0002\"\u0002&\u0001\u0009\u0003Z\u0015AB3rk\u0006d7\u000f\u0006\u0002M\u001fB\u0011q\"T\u0005\u0003\u001dB\u0011qAQ8pY\u0016\u000cg\u000eC\u0004Q\u0013\u0006\u0005\u0009\u0019A)\u0002\u0007a$\u0013\u0007\u0005\u0002\u0010%&\u00111\u000b\u0005\u0002\u0004\u0003:L\u0008\"B+\u0001\u0009\u00032\u0016!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001X!\u00099\u0001,\u0003\u0002H\u0011!)!\u000c\u0001C!7\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009\u0001\u0005C\u0003^\u0001\u0011\u0005c,\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005E{\u0006b\u0002)]\u0003\u0003\u0005\r\u0001\u0009\u0005\u0006C\u0002!\u0009EY\u0001\u0009G\u0006tW)];bYR\u0011Aj\u0019\u0005\u0008!\u0002\u000c\u0009\u00111\u0001R\u000f\u001d)'!!A\u0009\u0006\u0019\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003S\u001d4q!\u0001\u0002\u0002\u0002#\u0015\u0001n\u0005\u0003hS:9\u0002\u0003\u00026n;!j\u0011a\u001b\u0006\u0003YB\u0009qA];oi&lW-\u0003\u0002oW\n\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u0019\u0009\u000b\u0019:G\u0011\u00019\u0015\u0003\u0019DQ\u0001Q4\u0005FI$\u0012a\u0016\u0005\u0008i\u001e\u000c\u0009\u0011\"!v\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0009Ac\u000fC\u0003\u001cg\u0002\u0007Q\u0004C\u0004yO\u0006\u0005I\u0011Q=\u0002\u000fUt\u0017\r\u001d9msR\u0011!p\u001f\u0009\u0004\u001fyi\u0002\"\u0002?x\u0001\u0004A\u0013a\u0001=%a!)ap\u001aC\u0009\u0006Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u00051\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/Object;>;", null);
fv.visitEnd();
