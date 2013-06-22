[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 10:15:33 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 15 s, completed Jun 21, 2013 10:15:52 PM[0m
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
av0.visit("bytes", "\u0006\u0001y4A!\u0001\u0002A\u000b\u0009AQ*\u001f*fG>\u0014HMC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003a,\u0012!\u0008\u0009\u0003\u001fyI!a\u0008\u0009\u0003\u0007%sG\u000f\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u001e\u0003\u0009A\u0008\u0005C\u0003$\u0001\u0011\u0005A%\u0001\u0004=S:LGO\u0010\u000b\u0003K\u001d\u0002\"A\n\u0001\u000e\u0003\u0009AQa\u0007\u0012A\u0002uAq!\u000b\u0001\u0002\u0002\u0013\u0005!&\u0001\u0003d_BLHCA\u0013,\u0011\u001dY\u0002\u0006%AA\u0002uAq!\u000c\u0001\u0012\u0002\u0013\u0005a&\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003=R#!\u0008\u0019,\u0003E\u0002\"AM\u001c\u000e\u0003MR!\u0001N\u001b\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001c\u0011\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003qM\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u0015Q\u0004\u0001\"\u0011<\u0003!A\u0017m\u001d5D_\u0012,G#A\u000f\u0009\u000bu\u0002A\u0011\u0009 \u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012a\u0010\u0009\u0003\u0001\u000es!aD!\n\u0005\u0009\u0003\u0012A\u0002)sK\u0012,g-\u0003\u0002E\u000b\n11\u000b\u001e:j]\u001eT!A\u0011\u0009\u0009\u000b\u001d\u0003A\u0011\u0009%\u0002\r\u0015\u000cX/\u00197t)\u0009IE\n\u0005\u0002\u0010\u0015&\u00111\n\u0005\u0002\u0008\u0005>|G.Z1o\u0011\u001die)!AA\u00029\u000b1\u0001\u001f\u00132!\u0009yq*\u0003\u0002Q!\u0009\u0019\u0011I\\=\u0009\u000bI\u0003A\u0011I*\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005!\u0006CA\u0004V\u0013\u0009!\u0005\u0002C\u0003X\u0001\u0011\u0005C$\u0001\u0007qe>$Wo\u0019;Be&$\u0018\u0010C\u0003Z\u0001\u0011\u0005#,\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u00059[\u0006bB'Y\u0003\u0003\u0005\r!\u0008\u0005\u0006;\u0002!\u0009EX\u0001\u0009G\u0006tW)];bYR\u0011\u0011j\u0018\u0005\u0008\u001br\u000b\u0009\u00111\u0001O\u000f\u001d\u0009'!!A\u0009\u0006\u0009\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003M\r4q!\u0001\u0002\u0002\u0002#\u0015Am\u0005\u0003dK:9\u0002\u0003\u00024j;\u0015j\u0011a\u001a\u0006\u0003QB\u0009qA];oi&lW-\u0003\u0002kO\n\u0009\u0012IY:ue\u0006\u001cGOR;oGRLwN\\\u0019\u0009\u000b\r\u001aG\u0011\u00017\u0015\u0003\u0009DQ!P2\u0005F9$\u0012\u0001\u0016\u0005\u0008a\u000e\u000c\u0009\u0011\"!r\u0003\u0015\u0009\u0007\u000f\u001d7z)\u0009)#\u000fC\u0003\u001c_\u0002\u0007Q\u0004C\u0004uG\u0006\u0005I\u0011Q;\u0002\u000fUt\u0017\r\u001d9msR\u0011a/\u001f\u0009\u0004\u001f]l\u0012B\u0001=\u0011\u0005\u0019y\u0005\u000f^5p]\")!p\u001da\u0001K\u0005\u0019\u0001\u0010\n\u0019\u0009\u000bq\u001cG\u0011C?\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0002\r\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "I", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<LMyRecord;TA;>;)Lscala/Function1<Ljava/lang/Object;TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "compose", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<TA;Ljava/lang/Object;>;)Lscala/Function1<TA;LMyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord$", "compose", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productIterator", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productIterator", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_DEPRECATED, "productElements", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productElements", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(I)LMyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "<init>", "(I)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
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
mv.visitTypeInsn(INSTANCEOF, "MyRecord");
Label l1 = new Label();
mv.visitJumpInsn(IFEQ, l1);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(CHECKCAST, "MyRecord");
mv.visitVarInsn(ASTORE, 3);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()I");
mv.visitVarInsn(ISTORE, 4);
mv.visitVarInsn(ILOAD, 4);
mv.visitVarInsn(ISTORE, 5);
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 5);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "gd1$1", "(I)Z");
Label l2 = new Label();
mv.visitJumpInsn(IFEQ, l2);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "MyRecord");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEINTERFACE, "scala/Equals", "canEqual", "(Ljava/lang/Object;)Z");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l1);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
Label l4 = new Label();
mv.visitJumpInsn(IFEQ, l4);
mv.visitLabel(l0);
mv.visitInsn(ICONST_1);
Label l5 = new Label();
mv.visitJumpInsn(GOTO, l5);
mv.visitLabel(l4);
mv.visitInsn(ICONST_0);
mv.visitLabel(l5);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 6);
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
mv.visitInsn(ICONST_1);
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
mv.visitInsn(ICONST_0);
Label l0 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l0);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitInsn(ARETURN);
mv.visitLabel(l0);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "canEqual", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(INSTANCEOF, "MyRecord");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(I)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()I");
Label l0 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l0);
mv.visitInsn(ICONST_1);
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitInsn(ICONST_0);
mv.visitLabel(l1);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 1);
mv.visitFieldInsn(PUTFIELD, "MyRecord", "x", "I");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
