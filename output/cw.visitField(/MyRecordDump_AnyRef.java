Loading /usr/share/sbt/bin/sbt-launch-lib.bash
[0m[[0minfo[0m] [0mLoading global plugins from /home/julian/.sbt/0.13/plugins[0m
[0m[[0minfo[0m] [0mLoading project definition from /home/julian/Dropbox/asmifier-caseclass-experiments/project[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julian/Dropbox/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Dec 21, 2014 4:21:48 PM[0m
Loading /usr/share/sbt/bin/sbt-launch-lib.bash
[0m[[0minfo[0m] [0mLoading global plugins from /home/julian/.sbt/0.13/plugins[0m
[0m[[0minfo[0m] [0mLoading project definition from /home/julian/Dropbox/asmifier-caseclass-experiments/project[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julian/Dropbox/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julian/Dropbox/asmifier-caseclass-experiments/}asmifier-caseclass-experiments...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.11.4 ...[0m
































[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 5 Scala sources to /home/julian/Dropbox/asmifier-caseclass-experiments/target/scala-2.11/classes...[0m
[0m[[33mwarn[0m] [0mthere were three deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere was one feature warning; re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mtwo warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 64 s, completed Dec 21, 2014 4:23:39 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\ra\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u00051\u0001\u0002\u0003\u000c\u0001\u0005#\u0005\u000b\u0011\u0002\u0004\u0002\u0005a\u0004\u0003\"\u0002\r\u0001\u0009\u0003I\u0012A\u0002\u001fj]&$h\u0008\u0006\u0002\u001b9A\u00111\u0004A\u0007\u0002\u0005!)1c\u0006a\u0001\r!9a\u0004AA\u0001\n\u0003y\u0012\u0001B2paf$\"A\u0007\u0011\u0009\u000fMi\u0002\u0013!a\u0001\r!9!\u0005AI\u0001\n\u0003\u0019\u0013AD2paf$C-\u001a4bk2$H%M\u000b\u0002I)\u0012a!J\u0016\u0002MA\u0011q\u0005L\u0007\u0002Q)\u0011\u0011FK\u0001\nk:\u001c\u0007.Z2lK\u0012T!a\u000b\u0005\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002.Q\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000f=\u0002\u0011\u0011!C!a\u0005i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012!\r\u0009\u0003e]j\u0011a\r\u0006\u0003iU\nA\u0001\\1oO*\u0009a'\u0001\u0003kCZ\u000c\u0017B\u0001\u001d4\u0005\u0019\u0019FO]5oO\"9!\u0008AA\u0001\n\u0003Y\u0014\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001\u001f\u0011\u0005\u001di\u0014B\u0001 \u0009\u0005\rIe\u000e\u001e\u0005\u0008\u0001\u0002\u0009\u0009\u0011\"\u0001B\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"AQ#\u0011\u0005\u001d\u0019\u0015B\u0001#\u0009\u0005\r\u0009e.\u001f\u0005\u0008\r~\n\u0009\u00111\u0001=\u0003\rAH%\r\u0005\u0008\u0011\u0002\u0009\u0009\u0011\"\u0011J\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u0001&\u0011\u0007-s%)D\u0001M\u0015\u0009i\u0005\"\u0001\u0006d_2dWm\u0019;j_:L!a\u0014'\u0003\u0011%#XM]1u_JDq!\u0015\u0001\u0002\u0002\u0013\u0005!+\u0001\u0005dC:,\u0015/^1m)\u0009\u0019f\u000b\u0005\u0002\u0008)&\u0011Q\u000b\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d1\u0005+!AA\u0002\u0009Cq\u0001\u0017\u0001\u0002\u0002\u0013\u0005\u0013,\u0001\u0005iCND7i\u001c3f)\u0005a\u0004bB.\u0001\u0003\u0003%\u0009\u0005X\u0001\u0009i>\u001cFO]5oOR\u0009\u0011\u0007C\u0004_\u0001\u0005\u0005I\u0011I0\u0002\r\u0015\u000cX/\u00197t)\u0009\u0019\u0006\rC\u0004G;\u0006\u0005\u0009\u0019\u0001\"\u0008\u000f\u0009\u0014\u0011\u0011!E\u0001G\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002\u001cI\u001a9\u0011AAA\u0001\u0012\u0003)7c\u00013g\u001fA!qM\u001b\u0004\u001b\u001b\u0005A'BA5\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!a\u001b5\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t\u0017\u0007C\u0003\u0019I\u0012\u0005Q\u000eF\u0001d\u0011\u001dYF-!A\u0005FqCq\u0001\u001d3\u0002\u0002\u0013\u0005\u0015/A\u0003baBd\u0017\u0010\u0006\u0002\u001be\")1c\u001ca\u0001\r!9A\u000fZA\u0001\n\u0003+\u0018aB;oCB\u0004H.\u001f\u000b\u0003mf\u00042aB<\u0007\u0013\u0009A\u0008B\u0001\u0004PaRLwN\u001c\u0005\u0008uN\u000c\u0009\u00111\u0001\u001b\u0003\rAH\u0005\r\u0005\u0008y\u0012\u000c\u0009\u0011\"\u0003~\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0003y\u0004\"AM@\n\u0007\u0005\u00051G\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();