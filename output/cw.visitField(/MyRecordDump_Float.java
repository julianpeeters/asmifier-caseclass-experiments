Loading /usr/share/sbt/bin/sbt-launch-lib.bash
[0m[[0minfo[0m] [0mLoading global plugins from /home/julian/.sbt/0.13/plugins[0m
[0m[[0minfo[0m] [0mLoading project definition from /home/julian/Dropbox/asmifier-caseclass-experiments/project[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julian/Dropbox/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Dec 21, 2014 4:11:34 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 46 s, completed Dec 21, 2014 4:12:39 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005%a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0003GY>\u000cG\u000f\u0003\u0005\u001a\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005C\u0003\u001c\u0001\u0011\u0005A$\u0001\u0004=S:LGO\u0010\u000b\u0003;}\u0001\"A\u0008\u0001\u000e\u0003\u0009AQa\u0005\u000eA\u0002UAq!\u0009\u0001\u0002\u0002\u0013\u0005!%\u0001\u0003d_BLHCA\u000f$\u0011\u001d\u0019\u0002\u0005%AA\u0002UAq!\n\u0001\u0012\u0002\u0013\u0005a%\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003\u001dR#!\u0006\u0015,\u0003%\u0002\"AK\u0018\u000e\u0003-R!\u0001L\u0017\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u0018\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003a-\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001d\u0011\u0004!!A\u0005BM\nQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001\u001b\u0011\u0005URT\"\u0001\u001c\u000b\u0005]B\u0014\u0001\u00027b]\u001eT\u0011!O\u0001\u0005U\u00064\u0018-\u0003\u0002<m\u000911\u000b\u001e:j]\u001eDq!\u0010\u0001\u0002\u0002\u0013\u0005a(\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001@!\u00099\u0001)\u0003\u0002B\u0011\u0009\u0019\u0011J\u001c;\u0009\u000f\r\u0003\u0011\u0011!C\u0001\u0009\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA#I!\u00099a)\u0003\u0002H\u0011\u0009\u0019\u0011I\\=\u0009\u000f%\u0013\u0015\u0011!a\u0001\u0005\u0019\u0001\u0010J\u0019\u0009\u000f-\u0003\u0011\u0011!C!\u0019\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001N!\rq\u0015+R\u0007\u0002\u001f*\u0011\u0001\u000bC\u0001\u000bG>dG.Z2uS>t\u0017B\u0001*P\u0005!IE/\u001a:bi>\u0014\u0008b\u0002+\u0001\u0003\u0003%\u0009!V\u0001\u0009G\u0006tW)];bYR\u0011a+\u0017\u0009\u0003\u000f]K!\u0001\u0017\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9\u0011jUA\u0001\u0002\u0004)\u0005bB.\u0001\u0003\u0003%\u0009\u0005X\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009q\u0008C\u0004_\u0001\u0005\u0005I\u0011I0\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012\u0001\u000e\u0005\u0008C\u0002\u0009\u0009\u0011\"\u0011c\u0003\u0019)\u0017/^1mgR\u0011ak\u0019\u0005\u0008\u0013\u0002\u000c\u0009\u00111\u0001F\u000f\u001d)'!!A\u0009\u0002\u0019\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003=\u001d4q!\u0001\u0002\u0002\u0002#\u0005\u0001nE\u0002hS>\u0001BA[7\u0016;5\u00091N\u0003\u0002m\u0011\u00059!/\u001e8uS6,\u0017B\u00018l\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|g.\r\u0005\u00067\u001d$\u0009\u0001\u001d\u000b\u0002M\"9alZA\u0001\n\u000bz\u0006bB:h\u0003\u0003%\u0009\u0009^\u0001\u0006CB\u0004H.\u001f\u000b\u0003;UDQa\u0005:A\u0002UAqa^4\u0002\u0002\u0013\u0005\u00050A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0005ed\u0008cA\u0004{+%\u00111\u0010\u0003\u0002\u0007\u001fB$\u0018n\u001c8\u0009\u000fu4\u0018\u0011!a\u0001;\u0005\u0019\u0001\u0010\n\u0019\u0009\u0011}<\u0017\u0011!C\u0005\u0003\u0003\u00091B]3bIJ+7o\u001c7wKR\u0011\u00111\u0001\u0009\u0004k\u0005\u0015\u0011bAA\u0004m\u00091qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "F", null, null);
fv.visitEnd();