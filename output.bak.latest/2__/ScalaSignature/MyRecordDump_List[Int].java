[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 8:40:07 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.10.1 ...[0m



























[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[33mwarn[0m] [0mPotentially incompatible versions of dependencies of {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6:[0m
[0m[[33mwarn[0m] [0m   org.scala-lang: 2.10.2, 2.10.0[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.10/classes...[0m
[0m[[33mwarn[0m] [0mthere were 6 deprecation warning(s); re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere were 1 feature warning(s); re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mtwo warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 8:40:33 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005}b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0003\u000f\u0009J!a\u0009\u0005\u0003\u0007%sG\u000f\u0003\u0005&\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005(\u0001\u0009U\r\u0011\"\u0001)\u0003\u0005IX#A\u0015\u0011\u0005\u001dQ\u0013BA\u0016\u0009\u0005\u001dqu\u000e\u001e5j]\u001eD\u0001\"\u000c\u0001\u0003\u0012\u0003\u0006I!K\u0001\u0003s\u0002BQa\u000c\u0001\u0005\u0002A\na\u0001P5oSRtDcA\u00194iA\u0011!\u0007A\u0007\u0002\u0005!)1C\u000ca\u0001+!)qE\u000ca\u0001S!9a\u0007AA\u0001\n\u00039\u0014\u0001B2paf$2!\r\u001d:\u0011\u001d\u0019R\u0007%AA\u0002UAqaJ\u001b\u0011\u0002\u0003\u0007\u0011\u0006C\u0004<\u0001E\u0005I\u0011\u0001\u001f\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009QH\u000b\u0002\u0016}-\nq\u0008\u0005\u0002A\u000b6\u0009\u0011I\u0003\u0002C\u0007\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003\u0009\"\u0009!\"\u00198o_R\u000cG/[8o\u0013\u00091\u0015IA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016Dq\u0001\u0013\u0001\u0012\u0002\u0013\u0005\u0011*\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003)S#!\u000b \u0009\u000f1\u0003\u0011\u0011!C!\u001b\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0014\u0009\u0003\u001fRk\u0011\u0001\u0015\u0006\u0003#J\u000bA\u0001\\1oO*\u00091+\u0001\u0003kCZ\u000c\u0017BA+Q\u0005\u0019\u0019FO]5oO\"9q\u000bAA\u0001\n\u0003A\u0016\u0001\u00049s_\u0012,8\r^!sSRLX#A\u0011\u0009\u000fi\u0003\u0011\u0011!C\u00017\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HC\u0001/`!\u00099Q,\u0003\u0002_\u0011\u0009\u0019\u0011I\\=\u0009\u000f\u0001L\u0016\u0011!a\u0001C\u0005\u0019\u0001\u0010J\u0019\u0009\u000f\u0009\u0004\u0011\u0011!C!G\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001e!\r)\u0007\u000eX\u0007\u0002M*\u0011q\rC\u0001\u000bG>dG.Z2uS>t\u0017BA5g\u0005!IE/\u001a:bi>\u0014\u0008bB6\u0001\u0003\u0003%\u0009\u0001\\\u0001\u0009G\u0006tW)];bYR\u0011Q\u000e\u001d\u0009\u0003\u000f9L!a\u001c\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9\u0001M[A\u0001\u0002\u0004a\u0006b\u0002:\u0001\u0003\u0003%\u0009e]\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009\u0011\u0005C\u0004v\u0001\u0005\u0005I\u0011\u0009<\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012A\u0014\u0005\u0008q\u0002\u0009\u0009\u0011\"\u0011z\u0003\u0019)\u0017/^1mgR\u0011QN\u001f\u0005\u0008A^\u000c\u0009\u00111\u0001]\u000f\u001da(!!A\u0009\u0002u\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003ey4q!\u0001\u0002\u0002\u0002#\u0005qp\u0005\u0003\u0003\u0003y\u0001cBA\u0002\u0003\u0013)\u0012&M\u0007\u0003\u0003\u000bQ1!a\u0002\u0009\u0003\u001d\u0011XO\u001c;j[\u0016LA!a\u0003\u0002\u0006\u0009\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\u001c\u001a\u0009\r=rH\u0011AA\u0008)\u0005i\u0008bB;\u0003\u0003%)E\u001e\u0005\n\u0003+q\u0018\u0011!CA\u0003/\u0009Q!\u00199qYf$R!MA\r\u00037AaaEA\n\u0001\u0004)\u0002BB\u0014\u0002\u0014\u0001\u0007\u0011\u0006C\u0005\u0002 y\u000c\u0009\u0011\"!\u0002\"\u00059QO\\1qa2LH\u0003BA\u0012\u0003_\u0001RaBA\u0013\u0003SI1!a\n\u0009\u0005\u0019y\u0005\u000f^5p]B)q!a\u000b\u0016S%\u0019\u0011Q\u0006\u0005\u0003\rQ+\u0008\u000f\\33\u0011\u001d\u0009\u0009$!\u0008A\u0002E\n1\u0001\u001f\u00131\u0011%\u0009)D`A\u0001\n\u0013\u00099$A\u0006sK\u0006$'+Z:pYZ,GCAA\u001d!\ry\u00151H\u0005\u0004\u0003{\u0001&AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Ljava/lang/Object;>;", null);
fv.visitEnd();