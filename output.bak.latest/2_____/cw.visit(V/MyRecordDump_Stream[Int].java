[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:30:13 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 25 s, completed Sep 5, 2013 11:30:44 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Ec\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012aa\u0015;sK\u0006l'BA\u000f\u0009!\u00099!%\u0003\u0002$\u0011\u0009\u0019\u0011J\u001c;\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011\u001d\u0002!Q3A\u0005\u0002!\n\u0011!_\u000b\u0002SA\u0011qAK\u0005\u0003W!\u0011qAT8uQ&tw\r\u0003\u0005.\u0001\u0009E\u0009\u0015!\u0003*\u0003\u0009I\u0008\u0005\u0003\u00050\u0001\u0009U\r\u0011\"\u0001\u0015\u0003\u0005Q\u0008\u0002C\u0019\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005i\u0004\u0003\"B\u001a\u0001\u0009\u0003!\u0014A\u0002\u001fj]&$h\u0008\u0006\u00036oaJ\u0004C\u0001\u001c\u0001\u001b\u0005\u0011\u0001\"B\n3\u0001\u0004)\u0002\"B\u00143\u0001\u0004I\u0003\"B\u00183\u0001\u0004)\u0002bB\u001e\u0001\u0003\u0003%\u0009\u0001P\u0001\u0005G>\u0004\u0018\u0010\u0006\u00036{yz\u0004bB\n;!\u0003\u0005\r!\u0006\u0005\u0008Oi\u0002\n\u00111\u0001*\u0011\u001dy#\u0008%AA\u0002UAq!\u0011\u0001\u0012\u0002\u0013\u0005!)\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003\rS#!\u0006#,\u0003\u0015\u0003\"AR&\u000e\u0003\u001dS!\u0001S%\u0002\u0013Ut7\r[3dW\u0016$'B\u0001&\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003\u0019\u001e\u0013\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001dq\u0005!%A\u0005\u0002=\u000babY8qs\u0012\"WMZ1vYR$#'F\u0001QU\u0009IC\u0009C\u0004S\u0001E\u0005I\u0011\u0001\"\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%g!9A\u000bAA\u0001\n\u0003*\u0016!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001W!\u00099F,D\u0001Y\u0015\u0009I&,\u0001\u0003mC:<'\"A.\u0002\u0009)\u000cg/Y\u0005\u0003;b\u0013aa\u0015;sS:<\u0007bB0\u0001\u0003\u0003%\u0009\u0001Y\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002C!9!\rAA\u0001\n\u0003\u0019\u0017A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003I\u001e\u0004\"aB3\n\u0005\u0019D!aA!os\"9\u0001.YA\u0001\u0002\u0004\u0009\u0013a\u0001=%c!9!\u000eAA\u0001\n\u0003Z\u0017a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u00031\u00042!\u001c9e\u001b\u0005q'BA8\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003c:\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008g\u0002\u0009\u0009\u0011\"\u0001u\u0003!\u0019\u0017M\\#rk\u0006dGCA;y!\u00099a/\u0003\u0002x\u0011\u00099!i\\8mK\u0006t\u0007b\u00025s\u0003\u0003\u0005\r\u0001\u001a\u0005\u0008u\u0002\u0009\u0009\u0011\"\u0011|\u0003!A\u0017m\u001d5D_\u0012,G#A\u0011\u0009\u000fu\u0004\u0011\u0011!C!}\u0006AAo\\*ue&tw\rF\u0001W\u0011%\u0009\u0009\u0001AA\u0001\n\u0003\n\u0019!\u0001\u0004fcV\u000cGn\u001d\u000b\u0004k\u0006\u0015\u0001b\u00025\u0000\u0003\u0003\u0005\r\u0001Z\u0004\n\u0003\u0013\u0011\u0011\u0011!E\u0001\u0003\u0017\u0009\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0004m\u00055a\u0001C\u0001\u0003\u0003\u0003E\u0009!a\u0004\u0014\u000b\u00055\u0011\u0011C\u0008\u0011\u0011\u0005M\u0011\u0011D\u000b*+Uj!!!\u0006\u000b\u0007\u0005]\u0001\"A\u0004sk:$\u0018.\\3\n\u0009\u0005m\u0011Q\u0003\u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u001c\u0004bB\u001a\u0002\u000e\u0011\u0005\u0011q\u0004\u000b\u0003\u0003\u0017A\u0001\"`A\u0007\u0003\u0003%)E \u0005\u000b\u0003K\u0009i!!A\u0005\u0002\u0006\u001d\u0012!B1qa2LHcB\u001b\u0002*\u0005-\u0012Q\u0006\u0005\u0007'\u0005\r\u0002\u0019A\u000b\u0009\r\u001d\n\u0019\u00031\u0001*\u0011\u0019y\u00131\u0005a\u0001+!Q\u0011\u0011GA\u0007\u0003\u0003%\u0009)a\r\u0002\u000fUt\u0017\r\u001d9msR!\u0011QGA!!\u00159\u0011qGA\u001e\u0013\r\u0009I\u0004\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0011\r\u001d\u0009i$F\u0015\u0016\u0013\r\u0009y\u0004\u0003\u0002\u0007)V\u0004H.Z\u001a\u0009\u000f\u0005\r\u0013q\u0006a\u0001k\u0005\u0019\u0001\u0010\n\u0019\u0009\u0015\u0005\u001d\u0013QBA\u0001\n\u0013\u0009I%A\u0006sK\u0006$'+Z:pYZ,GCAA&!\r9\u0016QJ\u0005\u0004\u0003\u001fB&AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/Stream;", "Lscala/collection/immutable/Stream<Ljava/lang/Object;>;", null);
fv.visitEnd();