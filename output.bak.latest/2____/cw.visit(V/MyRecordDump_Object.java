[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:53:16 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 5, 2013 9:53:42 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002;A\u0011adI\u0007\u0002?)\u0011\u0001%I\u0001\u0005Y\u0006twMC\u0001#\u0003\u0011Q\u0017M^1\n\u0005\u0011z\"AB(cU\u0016\u001cG\u000f\u0003\u0005'\u0001\u0009E\u0009\u0015!\u0003\u001e\u0003\u0009A\u0008\u0005C\u0003)\u0001\u0011\u0005\u0011&\u0001\u0004=S:LGO\u0010\u000b\u0004U1j\u0003CA\u0016\u0001\u001b\u0005\u0011\u0001\"B\n(\u0001\u0004)\u0002\"B\u000e(\u0001\u0004i\u0002bB\u0018\u0001\u0003\u0003%\u0009\u0001M\u0001\u0005G>\u0004\u0018\u0010F\u0002+cIBqa\u0005\u0018\u0011\u0002\u0003\u0007Q\u0003C\u0004\u001c]A\u0005\u0009\u0019A\u000f\u0009\u000fQ\u0002\u0011\u0013!C\u0001k\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#\u0001\u001c+\u0005U94&\u0001\u001d\u0011\u0005erT\"\u0001\u001e\u000b\u0005mb\u0014!C;oG\",7m[3e\u0015\u0009i\u0004\"\u0001\u0006b]:|G/\u0019;j_:L!a\u0010\u001e\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004B\u0001E\u0005I\u0011\u0001\"\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%eU\u00091I\u000b\u0002\u001eo!9Q\u0009AA\u0001\n\u00032\u0015!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001H!\u0009q\u0002*\u0003\u0002J?\u000911\u000b\u001e:j]\u001eDqa\u0013\u0001\u0002\u0002\u0013\u0005A*\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001N!\u00099a*\u0003\u0002P\u0011\u0009\u0019\u0011J\u001c;\u0009\u000fE\u0003\u0011\u0011!C\u0001%\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA*W!\u00099A+\u0003\u0002V\u0011\u0009\u0019\u0011I\\=\u0009\u000f]\u0003\u0016\u0011!a\u0001\u001b\u0006\u0019\u0001\u0010J\u0019\u0009\u000fe\u0003\u0011\u0011!C!5\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001\\!\ravlU\u0007\u0002;*\u0011a\u000cC\u0001\u000bG>dG.Z2uS>t\u0017B\u00011^\u0005!IE/\u001a:bi>\u0014\u0008b\u00022\u0001\u0003\u0003%\u0009aY\u0001\u0009G\u0006tW)];bYR\u0011Am\u001a\u0009\u0003\u000f\u0015L!A\u001a\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9q+YA\u0001\u0002\u0004\u0019\u0006bB5\u0001\u0003\u0003%\u0009E[\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009Q\nC\u0004m\u0001\u0005\u0005I\u0011I7\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012a\u0012\u0005\u0008_\u0002\u0009\u0009\u0011\"\u0011q\u0003\u0019)\u0017/^1mgR\u0011A-\u001d\u0005\u0008/:\u000c\u0009\u00111\u0001T\u000f\u001d\u0019(!!A\u0009\u0002Q\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003WU4q!\u0001\u0002\u0002\u0002#\u0005aoE\u0002vo>\u0001R\u0001_>\u0016;)j\u0011!\u001f\u0006\u0003u\"\u0009qA];oi&lW-\u0003\u0002}s\n\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\u001c\u001a\u0009\u000b!*H\u0011\u0001@\u0015\u0003QDq\u0001\\;\u0002\u0002\u0013\u0015S\u000eC\u0005\u0002\u0004U\u000c\u0009\u0011\"!\u0002\u0006\u0005)\u0011\r\u001d9msR)!&a\u0002\u0002\n!11#!\u0001A\u0002UAaaGA\u0001\u0001\u0004i\u0002\"CA\u0007k\u0006\u0005I\u0011QA\u0008\u0003\u001d)h.\u00199qYf$B!!\u0005\u0002\u001eA)q!a\u0005\u0002\u0018%\u0019\u0011Q\u0003\u0005\u0003\r=\u0003H/[8o!\u00159\u0011\u0011D\u000b\u001e\u0013\r\u0009Y\u0002\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\u000f\u0005}\u00111\u0002a\u0001U\u0005\u0019\u0001\u0010\n\u0019\u0009\u0013\u0005\rR/!A\u0005\n\u0005\u0015\u0012a\u0003:fC\u0012\u0014Vm]8mm\u0016$\u0012!\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();