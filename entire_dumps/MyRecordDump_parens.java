import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.attrs.*;
public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "MyRecord", null, "java/lang/Object", new String[] { "scala/ScalaObject", "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\r4A!\u0001\u0002A\u000b\u0009AQ*\u001f*fG>\u0014HMC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\"B\u000e\u0001\u0009\u0003a\u0012A\u0002\u001fj]&$h\u0008F\u0001\u001e!\u0009q\u0002!D\u0001\u0003\u0011\u0015\u0001\u0003\u0001\"\u0011\"\u0003!A\u0017m\u001d5D_\u0012,G#\u0001\u0012\u0011\u0005=\u0019\u0013B\u0001\u0013\u0011\u0005\rIe\u000e\u001e\u0005\u0006M\u0001!\u0009eJ\u0001\u0009i>\u001cFO]5oOR\u0009\u0001\u0006\u0005\u0002*Y9\u0011qBK\u0005\u0003WA\u0009a\u0001\u0015:fI\u00164\u0017BA\u0017/\u0005\u0019\u0019FO]5oO*\u00111\u0006\u0005\u0005\u0006a\u0001!\u0009%M\u0001\u0007KF,\u0018\r\\:\u0015\u0005I*\u0004CA\u00084\u0013\u0009!\u0004CA\u0004C_>dW-\u00198\u0009\u000fYz\u0013\u0011!a\u0001o\u0005\u0019\u0001\u0010J\u0019\u0011\u0005=A\u0014BA\u001d\u0011\u0005\r\u0009e.\u001f\u0005\u0006w\u0001!\u0009\u0005P\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003u\u0002\"a\u0002 \n\u00055B\u0001\"\u0002!\u0001\u0009\u0003\n\u0015\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001\u0012\u0009\u000b\r\u0003A\u0011\u0009#\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011q'\u0012\u0005\u0008m\u0009\u000b\u0009\u00111\u0001#\u0011\u00159\u0005\u0001\"\u0011I\u0003!\u0019\u0017M\\#rk\u0006dGC\u0001\u001aJ\u0011\u001d1d)!AA\u0002]:qa\u0013\u0002\u0002\u0002#\u0015A*\u0001\u0005NsJ+7m\u001c:e!\u0009qRJB\u0004\u0002\u0005\u0005\u0005\u0009R\u0001(\u0014\u00095{eb\u0006\u0009\u0004!NkR\"A)\u000b\u0005I\u0003\u0012a\u0002:v]RLW.Z\u0005\u0003)F\u0013\u0011#\u00112tiJ\u000c7\r\u001e$v]\u000e$\u0018n\u001c81\u0011\u0015YR\n\"\u0001W)\u0005a\u0005\"\u0002\u0014N\u0009\u000bBF#A\u001f\u0009\u000fik\u0015\u0011!CA9\u0005)\u0011\r\u001d9ms\"9A,TA\u0001\n\u0003k\u0016aB;oCB\u0004H.\u001f\u000b\u0003eyCQaX.A\u0002u\u00091\u0001\u001f\u00131\u0011\u0015\u0009W\n\"\u0005c\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0003\u0019\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "productIterator", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productIterator", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE + ACC_DEPRECATED, "productElements", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productElements", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
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
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "MyRecord");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEINTERFACE, "scala/Equals", "canEqual", "(Ljava/lang/Object;)Z");
Label l2 = new Label();
mv.visitJumpInsn(GOTO, l2);
mv.visitLabel(l1);
mv.visitInsn(ICONST_0);
mv.visitLabel(l2);
Label l3 = new Label();
mv.visitJumpInsn(IFEQ, l3);
mv.visitLabel(l0);
mv.visitInsn(ICONST_1);
Label l4 = new Label();
mv.visitJumpInsn(GOTO, l4);
mv.visitLabel(l3);
mv.visitInsn(ICONST_0);
mv.visitLabel(l4);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 3);
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
mv.visitInsn(ICONST_0);
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productElement", "(I)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ISTORE, 2);
//
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
//
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
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
