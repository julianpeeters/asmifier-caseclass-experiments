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
av0.visit("bytes", "\u0006\u0001\u00055b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001a\u001d\u00099q#\u0003\u0002\u0019\u0011\u00051\u0001K]3eK\u001aL!AG\u000e\u0003\rM#(/\u001b8h\u0015\u0009A\u0002\u0002\u0003\u0005\u001e\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005 \u0001\u0009U\r\u0011\"\u0001!\u0003\u0005IX#A\u0011\u0011\u0005\u001d\u0011\u0013BA\u0012\u0009\u0005\r\u0009e.\u001f\u0005\u0009K\u0001\u0011\u0009\u0012)A\u0005C\u0005\u0011\u0011\u0010\u0009\u0005\u0006O\u0001!\u0009\u0001K\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007%ZC\u0006\u0005\u0002+\u00015\u0009!\u0001C\u0003\u0014M\u0001\u0007Q\u0003C\u0003 M\u0001\u0007\u0011\u0005C\u0004/\u0001\u0005\u0005I\u0011A\u0018\u0002\u0009\r|\u0007/\u001f\u000b\u0004SA\n\u0004bB\n.!\u0003\u0005\r!\u0006\u0005\u0008?5\u0002\n\u00111\u0001\"\u0011\u001d\u0019\u0004!%A\u0005\u0002Q\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u00016U\u0009)bgK\u00018!\u0009AT(D\u0001:\u0015\u0009Q4(A\u0005v]\u000eDWmY6fI*\u0011A\u0008C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001 :\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\u0001\u0002\u0009\n\u0011\"\u0001B\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012A\u0011\u0016\u0003CYBq\u0001\u0012\u0001\u0002\u0002\u0013\u0005S)A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002\rB\u0011q\u0009T\u0007\u0002\u0011*\u0011\u0011JS\u0001\u0005Y\u0006twMC\u0001L\u0003\u0011Q\u0017M^1\n\u0005iA\u0005b\u0002(\u0001\u0003\u0003%\u0009aT\u0001\raJ|G-^2u\u0003JLG/_\u000b\u0002!B\u0011q!U\u0005\u0003%\"\u00111!\u00138u\u0011\u001d!\u0006!!A\u0005\u0002U\u000ba\u0002\u001d:pIV\u001cG/\u00127f[\u0016tG\u000f\u0006\u0002\"-\"9qkUA\u0001\u0002\u0004\u0001\u0016a\u0001=%c!9\u0011\u000cAA\u0001\n\u0003R\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003m\u00032\u0001X0\"\u001b\u0005i&B\u00010\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003Av\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008E\u0002\u0009\u0009\u0011\"\u0001d\u0003!\u0019\u0017M\\#rk\u0006dGC\u00013h!\u00099Q-\u0003\u0002g\u0011\u00099!i\\8mK\u0006t\u0007bB,b\u0003\u0003\u0005\r!\u0009\u0005\u0008S\u0002\u0009\u0009\u0011\"\u0011k\u0003!A\u0017m\u001d5D_\u0012,G#\u0001)\u0009\u000f1\u0004\u0011\u0011!C![\u0006AAo\\*ue&tw\rF\u0001G\u0011\u001dy\u0007!!A\u0005BA\u000ca!Z9vC2\u001cHC\u00013r\u0011\u001d9f.!AA\u0002\u0005:qa\u001d\u0002\u0002\u0002#\u0005A/\u0001\u0005NsJ+7m\u001c:e!\u0009QSOB\u0004\u0002\u0005\u0005\u0005\u0009\u0012\u0001<\u0014\u0007U<x\u0002E\u0003ywV\u0009\u0013&D\u0001z\u0015\u0009Q\u0008\"A\u0004sk:$\u0018.\\3\n\u0005qL(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)q%\u001eC\u0001}R\u0009A\u000fC\u0004mk\u0006\u0005IQI7\u0009\u0013\u0005\rQ/!A\u0005\u0002\u0006\u0015\u0011!B1qa2LH#B\u0015\u0002\u0008\u0005%\u0001BB\n\u0002\u0002\u0001\u0007Q\u0003\u0003\u0004 \u0003\u0003\u0001\r!\u0009\u0005\n\u0003\u001b)\u0018\u0011!CA\u0003\u001f\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u0012\u0005u\u0001#B\u0004\u0002\u0014\u0005]\u0011bAA\u000b\u0011\u00091q\n\u001d;j_:\u0004RaBA\r+\u0005J1!a\u0007\u0009\u0005\u0019!V\u000f\u001d7fe!I\u0011qDA\u0006\u0003\u0003\u0005\r!K\u0001\u0004q\u0012\u0002\u0004\"CA\u0012k\u0006\u0005I\u0011BA\u0013\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005\u001d\u0002cA$\u0002*%\u0019\u00111\u0006%\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "Ljava/lang/Object;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple2<Ljava/lang/String;Ljava/lang/Object;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/String;Lscala/Function1<Ljava/lang/Object;Lmodels/MyRecord;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "curried", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "y", "()Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "y", "Ljava/lang/Object;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
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
mv.visitInsn(ICONST_2);
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
mv.visitTableSwitchInsn(0, 1, l2, new Label[] { l0, l1 });
mv.visitLabel(l2);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Object"});
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
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
mv.visitFrame(Opcodes.F_FULL, 6, new Object[] {"models/MyRecord", "java/lang/Object", "java/lang/Object", Opcodes.INTEGER, "models/MyRecord", "java/lang/String"}, 1, new Object[] {"java/lang/String"});
mv.visitVarInsn(ALOAD, 5);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitLabel(l5);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "canEqual", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitInsn(ICONST_1);
Label l7 = new Label();
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l7);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitJumpInsn(IFEQ, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 0, new Object[] {});
mv.visitInsn(ICONST_1);
Label l8 = new Label();
mv.visitJumpInsn(GOTO, l8);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l8);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 1, new Object[] {Opcodes.INTEGER});
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 6);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Ljava/lang/Object;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 3);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
