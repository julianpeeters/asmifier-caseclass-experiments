[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:50:18 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 25 s, completed Sep 5, 2013 9:50:53 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002\r!Aa\u0004\u0001B\u0009B\u0003%a!\u0001\u0002yA!)\u0001\u0005\u0001C\u0001C\u00051A(\u001b8jiz\"2A\u0009\u0013&!\u0009\u0019\u0003!D\u0001\u0003\u0011\u0015\u0019r\u00041\u0001\u0016\u0011\u0015Yr\u00041\u0001\u0007\u0011\u001d9\u0003!!A\u0005\u0002!\nAaY8qsR\u0019!%\u000b\u0016\u0009\u000fM1\u0003\u0013!a\u0001+!91D\nI\u0001\u0002\u00041\u0001b\u0002\u0017\u0001#\u0003%\u0009!L\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005q#FA\u000b0W\u0005\u0001\u0004CA\u00197\u001b\u0005\u0011$BA\u001a5\u0003%)hn\u00195fG.,GM\u0003\u00026\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005]\u0012$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0011\u0008AI\u0001\n\u0003Q\u0014AD2paf$C-\u001a4bk2$HEM\u000b\u0002w)\u0012aa\u000c\u0005\u0008{\u0001\u0009\u0009\u0011\"\u0011?\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009q\u0008\u0005\u0002A\u000b6\u0009\u0011I\u0003\u0002C\u0007\u0006!A.\u00198h\u0015\u0005!\u0015\u0001\u00026bm\u0006L!AR!\u0003\rM#(/\u001b8h\u0011\u001dA\u0005!!A\u0005\u0002%\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012A\u0013\u0009\u0003\u000f-K!\u0001\u0014\u0005\u0003\u0007%sG\u000fC\u0004O\u0001\u0005\u0005I\u0011A(\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011\u0001k\u0015\u0009\u0003\u000fEK!A\u0015\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004U\u001b\u0006\u0005\u0009\u0019\u0001&\u0002\u0007a$\u0013\u0007C\u0004W\u0001\u0005\u0005I\u0011I,\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012\u0001\u0017\u0009\u00043r\u0003V\"\u0001.\u000b\u0005mC\u0011AC2pY2,7\r^5p]&\u0011QL\u0017\u0002\u0009\u0013R,'/\u0019;pe\"9q\u000cAA\u0001\n\u0003\u0001\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005\u0005$\u0007CA\u0004c\u0013\u0009\u0019\u0007BA\u0004C_>dW-\u00198\u0009\u000fQs\u0016\u0011!a\u0001!\"9a\rAA\u0001\n\u0003:\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003)Cq!\u001b\u0001\u0002\u0002\u0013\u0005#.\u0001\u0005u_N#(/\u001b8h)\u0005y\u0004b\u00027\u0001\u0003\u0003%\u0009%\\\u0001\u0007KF,\u0018\r\\:\u0015\u0005\u0005t\u0007b\u0002+l\u0003\u0003\u0005\r\u0001U\u0004\u0008a\n\u0009\u0009\u0011#\u0001r\u0003!i\u0015PU3d_J$\u0007CA\u0012s\r\u001d\u0009!!!A\u0009\u0002M\u001c2A\u001d;\u0010!\u0015)\u00080\u0006\u0004#\u001b\u00051(BA<\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!!\u001f<\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007C\u0003!e\u0012\u00051\u0010F\u0001r\u0011\u001dI'/!A\u0005F)DqA :\u0002\u0002\u0013\u0005u0A\u0003baBd\u0017\u0010F\u0003#\u0003\u0003\u0009\u0019\u0001C\u0003\u0014{\u0002\u0007Q\u0003C\u0003\u001c{\u0002\u0007a\u0001C\u0005\u0002\u0008I\u000c\u0009\u0011\"!\u0002\n\u00059QO\\1qa2LH\u0003BA\u0006\u0003/\u0001RaBA\u0007\u0003#I1!a\u0004\u0009\u0005\u0019y\u0005\u000f^5p]B)q!a\u0005\u0016\r%\u0019\u0011Q\u0003\u0005\u0003\rQ+\u0008\u000f\\33\u0011\u001d\u0009I\"!\u0002A\u0002\u0009\n1\u0001\u001f\u00131\u0011%\u0009iB]A\u0001\n\u0013\u0009y\"A\u0006sK\u0006$'+Z:pYZ,GCAA\u0011!\r\u0001\u00151E\u0005\u0004\u0003K\u0009%AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();