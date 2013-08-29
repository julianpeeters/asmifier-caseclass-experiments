[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:35:14 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0m/home/julianpeeters/asmifier-caseclass-experiments/MyRecord_Null.scala:1: comparing values of types Null and Null using `==' will always yield true[0m
[0m[[33mwarn[0m] [0mcase class MyRecord(x: Null)[0m
[0m[[33mwarn[0m] [0m           ^[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mtwo warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 16 s, completed Jun 21, 2013 11:35:35 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0005=q\u0012BA\u0010\u0011\u0005\u0011qU\u000f\u001c7\u0009\u0011\u0005\u0002!\u0011#Q\u0001\nu\u0009!\u0001\u001f\u0011\u0009\u000b\r\u0002A\u0011\u0001\u0013\u0002\rqJg.\u001b;?)\u0009)s\u0005\u0005\u0002'\u00015\u0009!\u0001C\u0003\u001cE\u0001\u0007Q\u0004C\u0004*\u0001\u0005\u0005I\u0011\u0001\u0016\u0002\u0009\r|\u0007/\u001f\u000b\u0003K-Bqa\u0007\u0015\u0011\u0002\u0003\u0007Q\u0004C\u0004.\u0001E\u0005I\u0011\u0001\u0018\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009qF\u000b\u0002\u001ea-\n\u0011\u0007\u0005\u00023o5\u00091G\u0003\u00025k\u0005IQO\\2iK\u000e\\W\r\u001a\u0006\u0003mA\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009A4GA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016DQA\u000f\u0001\u0005Bm\n\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002yA\u0011q\"P\u0005\u0003}A\u00111!\u00138u\u0011\u0015\u0001\u0005\u0001\"\u0011B\u0003!!xn\u0015;sS:<G#\u0001\"\u0011\u0005\r3eBA\u0008E\u0013\u0009)\u0005#\u0001\u0004Qe\u0016$WMZ\u0005\u0003\u000f\"\u0013aa\u0015;sS:<'BA#\u0011\u0011\u0015Q\u0005\u0001\"\u0011L\u0003\u0019)\u0017/^1mgR\u0011Aj\u0014\u0009\u0003\u001f5K!A\u0014\u0009\u0003\u000f\u0009{w\u000e\\3b]\"9\u0001+SA\u0001\u0002\u0004\u0009\u0016a\u0001=%cA\u0011qBU\u0005\u0003'B\u00111!\u00118z\u0011\u0015)\u0006\u0001\"\u0011W\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009q\u000b\u0005\u0002\u00081&\u0011q\u0009\u0003\u0005\u00065\u0002!\u0009eW\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002y!)Q\u000c\u0001C!=\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA)`\u0011\u001d\u0001F,!AA\u0002qBQ!\u0019\u0001\u0005B\u0009\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003\u0019\u000eDq\u0001\u00151\u0002\u0002\u0003\u0007\u0011kB\u0004f\u0005\u0005\u0005\u0009R\u00014\u0002\u00115K(+Z2pe\u0012\u0004\"AJ4\u0007\u000f\u0005\u0011\u0011\u0011!E\u0003QN!q-\u001b\u0008\u0018!\u0011QW.H\u0013\u000e\u0003-T!\u0001\u001c\u0009\u0002\u000fI,h\u000e^5nK&\u0011an\u001b\u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u000c\u0004\"B\u0012h\u0009\u0003\u0001H#\u00014\u0009\u000b\u0001;GQ\u0009:\u0015\u0003]Cq\u0001^4\u0002\u0002\u0013\u0005U/A\u0003baBd\u0017\u0010\u0006\u0002&m\")1d\u001da\u0001;!9\u0001pZA\u0001\n\u0003K\u0018aB;oCB\u0004H.\u001f\u000b\u0003uv\u00042aD>\u001e\u0013\u0009a\u0008C\u0001\u0004PaRLwN\u001c\u0005\u0006}^\u0004\r!J\u0001\u0004q\u0012\u0002\u0004bBA\u0001O\u0012E\u00111A\u0001\u000ce\u0016\u000cGMU3t_24X\rF\u0001\u0007\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/runtime/Null$;", null, null);
fv.visitEnd();
