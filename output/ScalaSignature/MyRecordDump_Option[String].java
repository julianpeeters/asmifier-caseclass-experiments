[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 11:37:27 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 16 s, completed Jun 21, 2013 11:37:48 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0005a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0007=q\u0002%\u0003\u0002 !\u00091q\n\u001d;j_:\u0004\"!\u0009\u0013\u000f\u0005=\u0011\u0013BA\u0012\u0011\u0003\u0019\u0001&/\u001a3fM&\u0011QE\n\u0002\u0007'R\u0014\u0018N\\4\u000b\u0005\r\u0002\u0002\u0002\u0003\u0015\u0001\u0005#\u0005\u000b\u0011B\u000f\u0002\u0005a\u0004\u0003\"\u0002\u0016\u0001\u0009\u0003Y\u0013A\u0002\u001fj]&$h\u0008\u0006\u0002-]A\u0011Q\u0006A\u0007\u0002\u0005!)1$\u000ba\u0001;!9\u0001\u0007AA\u0001\n\u0003\u0009\u0014\u0001B2paf$\"\u0001\u000c\u001a\u0009\u000fmy\u0003\u0013!a\u0001;!9A\u0007AI\u0001\n\u0003)\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002m)\u0012QdN\u0016\u0002qA\u0011\u0011HP\u0007\u0002u)\u00111\u0008P\u0001\nk:\u001c\u0007.Z2lK\u0012T!!\u0010\u0009\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002@u\u0009\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000b\u0005\u0003A\u0011\u0009\"\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012a\u0011\u0009\u0003\u001f\u0011K!!\u0012\u0009\u0003\u0007%sG\u000fC\u0003H\u0001\u0011\u0005\u0003*\u0001\u0005u_N#(/\u001b8h)\u0005\u0001\u0003\"\u0002&\u0001\u0009\u0003Z\u0015AB3rk\u0006d7\u000f\u0006\u0002M\u001fB\u0011q\"T\u0005\u0003\u001dB\u0011qAQ8pY\u0016\u000cg\u000eC\u0004Q\u0013\u0006\u0005\u0009\u0019A)\u0002\u0007a$\u0013\u0007\u0005\u0002\u0010%&\u00111\u000b\u0005\u0002\u0004\u0003:L\u0008\"B+\u0001\u0009\u00032\u0016!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001X!\u00099\u0001,\u0003\u0002&\u0011!)!\u000c\u0001C!7\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u00091\u0009C\u0003^\u0001\u0011\u0005c,\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005E{\u0006b\u0002)]\u0003\u0003\u0005\ra\u0011\u0005\u0006C\u0002!\u0009EY\u0001\u0009G\u0006tW)];bYR\u0011Aj\u0019\u0005\u0008!\u0002\u000c\u0009\u00111\u0001R\u000f\u001d)'!!A\u0009\u0006\u0019\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003[\u001d4q!\u0001\u0002\u0002\u0002#\u0015\u0001n\u0005\u0003hS:9\u0002\u0003\u00026n;1j\u0011a\u001b\u0006\u0003YB\u0009qA];oi&lW-\u0003\u0002oW\n\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u0019\u0009\u000b):G\u0011\u00019\u0015\u0003\u0019DQaR4\u0005FI$\u0012a\u0016\u0005\u0008i\u001e\u000c\u0009\u0011\"!v\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0009ac\u000fC\u0003\u001cg\u0002\u0007Q\u0004C\u0004yO\u0006\u0005I\u0011Q=\u0002\u000fUt\u0017\r\u001d9msR\u0011!p\u001f\u0009\u0004\u001fyi\u0002\"\u0002?x\u0001\u0004a\u0013a\u0001=%a!)ap\u001aC\u0009\u0006Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u00051\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/Option;", "Lscala/Option<Ljava/lang/String;>;", null);
fv.visitEnd();
