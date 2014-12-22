[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:32:05 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.avro#avro;1.7.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-core-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-mapper-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.3 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.xerial.snappy#snappy-java;1.0.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.commons#commons-compress;1.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.tukaani#xz;1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.6.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-util_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.7.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scalap;2.10.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-compiler;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-reflect;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-core_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-core_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-commons_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.github.nscala-time#nscala-time_2.10;0.2.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving joda-time#joda-time;2.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.joda#joda-convert;1.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#mongo-java-driver;2.11.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-query_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-native_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-core_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-ast_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.5.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-simple;1.6.4 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[33mwarn[0m] [0mPotentially incompatible versions of dependencies of {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6:[0m
[0m[[33mwarn[0m] [0m   org.scala-lang: 2.10.2, 2.10.0[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.10/classes...[0m
[0m[[33mwarn[0m] [0mthere were 6 deprecation warning(s); re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere were 1 feature warning(s); re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mtwo warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 28 s, completed Sep 5, 2013 11:32:40 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005Uc\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002c\u0001\u000c\u001fC9\u0011q\u0003\u0008\u0008\u00031mi\u0011!\u0007\u0006\u00035\u0011\u0009a\u0001\u0010:p_Rt\u0014\"A\u0005\n\u0005uA\u0011a\u00029bG.\u000cw-Z\u0005\u0003?\u0001\u0012A\u0001T5ti*\u0011Q\u0004\u0003\u0009\u0004-y\u0011\u0003c\u0001\u000c\u001fGA\u0011q\u0001J\u0005\u0003K!\u00111!\u00138u\u0011!9\u0003A!E!\u0002\u0013)\u0012A\u0001=!\u0011!I\u0003A!f\u0001\n\u0003Q\u0013!A=\u0016\u0003-\u0002\"a\u0002\u0017\n\u00055B!a\u0002(pi\"Lgn\u001a\u0005\u0009_\u0001\u0011\u0009\u0012)A\u0005W\u0005\u0011\u0011\u0010\u0009\u0005\u0009c\u0001\u0011)\u001a!C\u0001)\u0005\u0009!\u0010\u0003\u00054\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009Q\u0008\u0005C\u00036\u0001\u0011\u0005a'\u0001\u0004=S:LGO\u0010\u000b\u0005oeR4\u0008\u0005\u00029\u00015\u0009!\u0001C\u0003\u0014i\u0001\u0007Q\u0003C\u0003*i\u0001\u00071\u0006C\u00032i\u0001\u0007Q\u0003C\u0004>\u0001\u0005\u0005I\u0011\u0001 \u0002\u0009\r|\u0007/\u001f\u000b\u0005o}\u0002\u0015\u0009C\u0004\u0014yA\u0005\u0009\u0019A\u000b\u0009\u000f%b\u0004\u0013!a\u0001W!9\u0011\u0007\u0010I\u0001\u0002\u0004)\u0002bB\"\u0001#\u0003%\u0009\u0001R\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005)%FA\u000bGW\u00059\u0005C\u0001%N\u001b\u0005I%B\u0001&L\u0003%)hn\u00195fG.,GM\u0003\u0002M\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u00059K%!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0001\u000bAI\u0001\n\u0003\u0009\u0016AD2paf$C-\u001a4bk2$HEM\u000b\u0002%*\u00121F\u0012\u0005\u0008)\u0002\u0009\n\u0011\"\u0001E\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIMBqA\u0016\u0001\u0002\u0002\u0013\u0005s+A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u00021B\u0011\u0011LX\u0007\u00025*\u00111\u000cX\u0001\u0005Y\u0006twMC\u0001^\u0003\u0011Q\u0017M^1\n\u0005}S&AB*ue&tw\rC\u0004b\u0001\u0005\u0005I\u0011\u00012\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\rBq\u0001\u001a\u0001\u0002\u0002\u0013\u0005Q-\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005\u0019L\u0007CA\u0004h\u0013\u0009A\u0007BA\u0002B]fDqA[2\u0002\u0002\u0003\u00071%A\u0002yIEBq\u0001\u001c\u0001\u0002\u0002\u0013\u0005S.A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005q\u0007cA8sM6\u0009\u0001O\u0003\u0002r\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005M\u0004(\u0001C%uKJ\u000cGo\u001c:\u0009\u000fU\u0004\u0011\u0011!C\u0001m\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002xuB\u0011q\u0001_\u0005\u0003s\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004ki\u0006\u0005\u0009\u0019\u00014\u0009\u000fq\u0004\u0011\u0011!C!{\u0006A\u0001.Y:i\u0007>$W\rF\u0001$\u0011!y\u0008!!A\u0005B\u0005\u0005\u0011\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003aC\u0011\"!\u0002\u0001\u0003\u0003%\u0009%a\u0002\u0002\r\u0015\u000cX/\u00197t)\r9\u0018\u0011\u0002\u0005\u0009U\u0006\r\u0011\u0011!a\u0001M\u001eI\u0011Q\u0002\u0002\u0002\u0002#\u0005\u0011qB\u0001\u0009\u001bf\u0014VmY8sIB\u0019\u0001(!\u0005\u0007\u0011\u0005\u0011\u0011\u0011!E\u0001\u0003'\u0019R!!\u0005\u0002\u0016=\u0001\u0002\"a\u0006\u0002\u001eUYScN\u0007\u0003\u00033Q1!a\u0007\u0009\u0003\u001d\u0011XO\u001c;j[\u0016LA!a\u0008\u0002\u001a\u0009\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u001a\u0009\u000fU\n\u0009\u0002\"\u0001\u0002$Q\u0011\u0011q\u0002\u0005\n\u0006E\u0011\u0011!C#\u0003\u0003A!\"!\u000b\u0002\u0012\u0005\u0005I\u0011QA\u0016\u0003\u0015\u0009\u0007\u000f\u001d7z)\u001d9\u0014QFA\u0018\u0003cAaaEA\u0014\u0001\u0004)\u0002BB\u0015\u0002(\u0001\u00071\u0006\u0003\u00042\u0003O\u0001\r!\u0006\u0005\u000b\u0003k\u0009\u0009\"!A\u0005\u0002\u0006]\u0012aB;oCB\u0004H.\u001f\u000b\u0005\u0003s\u0009)\u0005E\u0003\u0008\u0003w\u0009y$C\u0002\u0002>!\u0011aa\u00149uS>t\u0007CB\u0004\u0002BUYS#C\u0002\u0002D!\u0011a\u0001V;qY\u0016\u001c\u0004bBA$\u0003g\u0001\raN\u0001\u0004q\u0012\u0002\u0004BCA&\u0003#\u0009\u0009\u0011\"\u0003\u0002N\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009y\u0005E\u0002Z\u0003#J1!a\u0015[\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "z", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple3<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;Lscala/runtime/Nothing$;Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;Lscala/Function1<Lscala/runtime/Nothing$;Lscala/Function1<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;Lmodels/MyRecord;>;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "curried", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Lscala/collection/immutable/List;", "()Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Lscala/collection/immutable/List;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "y", "()Lscala/runtime/Nothing$;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "y", "Lscala/runtime/Nothing$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "z", "()Lscala/collection/immutable/List;", "()Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "z", "Lscala/collection/immutable/List;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/collection/immutable/List;Lscala/runtime/Nothing$;Lscala/collection/immutable/List;)Lmodels/MyRecord;", "(Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;Lscala/runtime/Nothing$;Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;)Lmodels/MyRecord;", null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/collection/immutable/List;Lscala/runtime/Nothing$;Lscala/collection/immutable/List;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Lscala/collection/immutable/List;", "()Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()Lscala/runtime/Nothing$;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Lscala/runtime/Nothing$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()Lscala/collection/immutable/List;", "()Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Lscala/collection/immutable/List;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productPrefix", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitLdcInsn("MyRecord");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productArity", "()I", null, null);
mv.visitCode();
mv.visitInsn(ICONST_3);
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productElement", "(I)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ISTORE, 2);
mv.visitVarInsn(ILOAD, 2);
Label l0 = new Label();
Label l1 = new Label();
Label l2 = new Label();
Label l3 = new Label();
mv.visitTableSwitchInsn(0, 2, l3, new Label[] { l0, l1, l2 });
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitLabel(l2);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Lscala/collection/immutable/List;");
Label l4 = new Label();
mv.visitJumpInsn(GOTO, l4);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Lscala/runtime/Nothing$;");
mv.visitInsn(ATHROW);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"scala/collection/immutable/List"});
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productIterator", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "typedProductIterator", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "canEqual", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(INSTANCEOF, "models/MyRecord");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "_hashCode", "(Lscala/Product;)I");
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "_toString", "(Lscala/Product;)Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
Label l0 = new Label();
mv.visitJumpInsn(IF_ACMPEQ, l0);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ASTORE, 2);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(INSTANCEOF, "models/MyRecord");
Label l1 = new Label();
mv.visitJumpInsn(IFEQ, l1);
mv.visitInsn(ICONST_1);
mv.visitVarInsn(ISTORE, 3);
Label l2 = new Label();
mv.visitJumpInsn(GOTO, l2);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitVarInsn(ISTORE, 3);
mv.visitLabel(l2);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
mv.visitVarInsn(ILOAD, 3);
Label l3 = new Label();
mv.visitJumpInsn(IFEQ, l3);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "models/MyRecord");
mv.visitVarInsn(ASTORE, 4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitVarInsn(ASTORE, 5);
mv.visitInsn(DUP);
Label l4 = new Label();
mv.visitJumpInsn(IFNONNULL, l4);
mv.visitInsn(POP);
mv.visitVarInsn(ALOAD, 5);
Label l5 = new Label();
mv.visitJumpInsn(IFNULL, l5);
Label l6 = new Label();
mv.visitJumpInsn(GOTO, l6);
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_FULL, 6, new Object[] {"models/MyRecord", "java/lang/Object", "java/lang/Object", Opcodes.INTEGER, "models/MyRecord", "scala/collection/immutable/List"}, 1, new Object[] {"scala/collection/immutable/List"});
mv.visitVarInsn(ALOAD, 5);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitLabel(l5);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Lscala/runtime/Nothing$;");
mv.visitInsn(ATHROW);
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitInsn(ICONST_0);
mv.visitJumpInsn(IFEQ, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 0, new Object[] {});
mv.visitInsn(ICONST_1);
Label l7 = new Label();
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l7);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 1, new Object[] {Opcodes.INTEGER});
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 6);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lscala/collection/immutable/List;Lscala/runtime/Nothing$;Lscala/collection/immutable/List;)V", "(Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;Lscala/runtime/Nothing$;Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;)V", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Lscala/collection/immutable/List;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Lscala/runtime/Nothing$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 3);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "z", "Lscala/collection/immutable/List;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 4);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
