[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:30:49 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 24 s, completed Sep 5, 2013 11:31:18 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Ec\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0003\u000f\u0009J!a\u0009\u0005\u0003\u0007%sG\u000f\u0003\u0005&\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005(\u0001\u0009U\r\u0011\"\u0001)\u0003\u0005IX#A\u0015\u0011\u0005\u001dQ\u0013BA\u0016\u0009\u0005\u001dqu\u000e\u001e5j]\u001eD\u0001\"\u000c\u0001\u0003\u0012\u0003\u0006I!K\u0001\u0003s\u0002B\u0001b\u000c\u0001\u0003\u0016\u0004%\u0009\u0001F\u0001\u0002u\"A\u0011\u0007\u0001B\u0009B\u0003%Q#\u0001\u0002{A!)1\u0007\u0001C\u0001i\u00051A(\u001b8jiz\"B!N\u001c9sA\u0011a\u0007A\u0007\u0002\u0005!)1C\ra\u0001+!)qE\ra\u0001S!)qF\ra\u0001+!91\u0008AA\u0001\n\u0003a\u0014\u0001B2paf$B!N\u001f?!91C\u000fI\u0001\u0002\u0004)\u0002bB\u0014;!\u0003\u0005\r!\u000b\u0005\u0008_i\u0002\n\u00111\u0001\u0016\u0011\u001d\u0009\u0005!%A\u0005\u0002\u0009\u000babY8qs\u0012\"WMZ1vYR$\u0013'F\u0001DU\u0009)BiK\u0001F!\u000915*D\u0001H\u0015\u0009A\u0015*A\u0005v]\u000eDWmY6fI*\u0011!\nC\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001'H\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u001d\u0002\u0009\n\u0011\"\u0001P\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012\u0001\u0015\u0016\u0003S\u0011CqA\u0015\u0001\u0012\u0002\u0013\u0005!)\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u001a\u0009\u000fQ\u0003\u0011\u0011!C!+\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0016\u0009\u0003/rk\u0011\u0001\u0017\u0006\u00033j\u000bA\u0001\\1oO*\u00091,\u0001\u0003kCZ\u000c\u0017BA/Y\u0005\u0019\u0019FO]5oO\"9q\u000cAA\u0001\n\u0003\u0001\u0017\u0001\u00049s_\u0012,8\r^!sSRLX#A\u0011\u0009\u000f\u0009\u0004\u0011\u0011!C\u0001G\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HC\u00013h!\u00099Q-\u0003\u0002g\u0011\u0009\u0019\u0011I\\=\u0009\u000f!\u000c\u0017\u0011!a\u0001C\u0005\u0019\u0001\u0010J\u0019\u0009\u000f)\u0004\u0011\u0011!C!W\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001m!\ri\u0007\u000fZ\u0007\u0002]*\u0011q\u000eC\u0001\u000bG>dG.Z2uS>t\u0017BA9o\u0005!IE/\u001a:bi>\u0014\u0008bB:\u0001\u0003\u0003%\u0009\u0001^\u0001\u0009G\u0006tW)];bYR\u0011Q\u000f\u001f\u0009\u0003\u000fYL!a\u001e\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9\u0001N]A\u0001\u0002\u0004!\u0007b\u0002>\u0001\u0003\u0003%\u0009e_\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009\u0011\u0005C\u0004~\u0001\u0005\u0005I\u0011\u0009@\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012A\u0016\u0005\n\u0003\u0003\u0001\u0011\u0011!C!\u0003\u0007\u0009a!Z9vC2\u001cHcA;\u0002\u0006!9\u0001n`A\u0001\u0002\u0004!w!CA\u0005\u0005\u0005\u0005\u0009\u0012AA\u0006\u0003!i\u0015PU3d_J$\u0007c\u0001\u001c\u0002\u000e\u0019A\u0011AAA\u0001\u0012\u0003\u0009yaE\u0003\u0002\u000e\u0005Eq\u0002\u0005\u0005\u0002\u0014\u0005eQ#K\u000b6\u001b\u0009\u0009)BC\u0002\u0002\u0018!\u0009qA];oi&lW-\u0003\u0003\u0002\u001c\u0005U!!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8og!91'!\u0004\u0005\u0002\u0005}ACAA\u0006\u0011!i\u0018QBA\u0001\n\u000br\u0008BCA\u0013\u0003\u001b\u0009\u0009\u0011\"!\u0002(\u0005)\u0011\r\u001d9msR9Q'!\u000b\u0002,\u00055\u0002BB\n\u0002$\u0001\u0007Q\u0003\u0003\u0004(\u0003G\u0001\r!\u000b\u0005\u0007_\u0005\r\u0002\u0019A\u000b\u0009\u0015\u0005E\u0012QBA\u0001\n\u0003\u000b\u0019$A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005U\u0012\u0011\u0009\u0009\u0006\u000f\u0005]\u00121H\u0005\u0004\u0003sA!AB(qi&|g\u000e\u0005\u0004\u0008\u0003{)\u0012&F\u0005\u0004\u0003A!A\u0002+va2,7\u0007C\u0004\u0002D\u0005=\u0002\u0019A\u001b\u0002\u0007a$\u0003\u0007\u0003\u0006\u0002H\u00055\u0011\u0011!C\u0005\u0003\u0013\n1B]3bIJ+7o\u001c7wKR\u0011\u00111\n\u0009\u0004/\u00065\u0013bAA(1\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Ljava/lang/Object;>;", null);
fv.visitEnd();