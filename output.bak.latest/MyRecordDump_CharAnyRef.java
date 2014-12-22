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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002B\u0001\u0003DQ\u0006\u0014\u0008\u0002C\r\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005a\u0004\u0003\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003e,\u0012A\u0002\u0005\u0009=\u0001\u0011\u0009\u0012)A\u0005\r\u0005\u0011\u0011\u0010\u0009\u0005\u0006A\u0001!\u0009!I\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0007\u0009\"S\u0005\u0005\u0002$\u00015\u0009!\u0001C\u0003\u0014?\u0001\u0007Q\u0003C\u0003\u001c?\u0001\u0007a\u0001C\u0004(\u0001\u0005\u0005I\u0011\u0001\u0015\u0002\u0009\r|\u0007/\u001f\u000b\u0004E%R\u0003bB\n'!\u0003\u0005\r!\u0006\u0005\u00087\u0019\u0002\n\u00111\u0001\u0007\u0011\u001da\u0003!%A\u0005\u00025\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u0001/U\u0009)rfK\u00011!\u0009\u0009d'D\u00013\u0015\u0009\u0019D'A\u0005v]\u000eDWmY6fI*\u0011Q\u0007C\u0001\u000bC:tw\u000e^1uS>t\u0017BA\u001c3\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008s\u0001\u0009\n\u0011\"\u0001;\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012a\u000f\u0016\u0003\r=Bq!\u0010\u0001\u0002\u0002\u0013\u0005c(A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u0002A\u0011\u0001)R\u0007\u0002\u0003*\u0011!iQ\u0001\u0005Y\u0006twMC\u0001E\u0003\u0011Q\u0017M^1\n\u0005\u0019\u000b%AB*ue&tw\rC\u0004I\u0001\u0005\u0005I\u0011A%\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003)\u0003\"aB&\n\u00051C!aA%oi\"9a\nAA\u0001\n\u0003y\u0015A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003!N\u0003\"aB)\n\u0005IC!aA!os\"9A+TA\u0001\u0002\u0004Q\u0015a\u0001=%c!9a\u000bAA\u0001\n\u0003:\u0016a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003a\u00032!\u0017/Q\u001b\u0005Q&BA.\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003;j\u0013\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008?\u0002\u0009\u0009\u0011\"\u0001a\u0003!\u0019\u0017M\\#rk\u0006dGCA1e!\u00099!-\u0003\u0002d\u0011\u00099!i\\8mK\u0006t\u0007b\u0002+_\u0003\u0003\u0005\r\u0001\u0015\u0005\u0008M\u0002\u0009\u0009\u0011\"\u0011h\u0003!A\u0017m\u001d5D_\u0012,G#\u0001&\u0009\u000f%\u0004\u0011\u0011!C!U\u0006AAo\\*ue&tw\rF\u0001@\u0011\u001da\u0007!!A\u0005B5\u000ca!Z9vC2\u001cHCA1o\u0011\u001d!6.!AA\u0002A;q\u0001\u001d\u0002\u0002\u0002#\u0005\u0011/\u0001\u0005NsJ+7m\u001c:e!\u0009\u0019#OB\u0004\u0002\u0005\u0005\u0005\u0009\u0012A:\u0014\u0007I$x\u0002E\u0003vqV1!%D\u0001w\u0015\u00099\u0008\"A\u0004sk:$\u0018.\\3\n\u0005e4(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oe!)\u0001E\u001dC\u0001wR\u0009\u0011\u000fC\u0004je\u0006\u0005IQ\u00096\u0009\u000fy\u0014\u0018\u0011!CA\u0006)\u0011\r\u001d9msR)!%!\u0001\u0002\u0004!)1# a\u0001+!)1$ a\u0001\r!I\u0011q\u0001:\u0002\u0002\u0013\u0005\u0015\u0011B\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009Y!a\u0006\u0011\u000b\u001d\u0009i!!\u0005\n\u0007\u0005=\u0001B\u0001\u0004PaRLwN\u001c\u0009\u0006\u000f\u0005MQCB\u0005\u0004\u0003+A!A\u0002+va2,'\u0007C\u0005\u0002\u001a\u0005\u0015\u0011\u0011!a\u0001E\u0005\u0019\u0001\u0010\n\u0019\u0009\u0013\u0005u!/!A\u0005\n\u0005}\u0011a\u0003:fC\u0012\u0014Vm]8mm\u0016$\"!!\u0009\u0011\u0007\u0001\u000b\u0019#C\u0002\u0002&\u0005\u0013aa\u00142kK\u000e$\u0008");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "C", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "Ljava/lang/Object;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lmodels/MyRecord;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "curried", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()C", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "C");
mv.visitInsn(IRETURN);
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
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(CLjava/lang/Object;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(CLjava/lang/Object;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()C", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()C");
mv.visitInsn(IRETURN);
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()C");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToCharacter", "(C)Ljava/lang/Character;");
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
mv.visitLdcInsn(new Integer(-889275714));
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()C");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "anyHash", "(Ljava/lang/Object;)I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitInsn(ICONST_2);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "finalizeHash", "(II)I");
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 2);
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()C");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()C");
Label l4 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/Object;");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l4);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "canEqual", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l4);
mv.visitInsn(ICONST_1);
Label l5 = new Label();
mv.visitJumpInsn(GOTO, l5);
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {"models/MyRecord"}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l5);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitJumpInsn(IFEQ, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
mv.visitInsn(ICONST_1);
Label l6 = new Label();
mv.visitJumpInsn(GOTO, l6);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 1, new Object[] {Opcodes.INTEGER});
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 5);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(CLjava/lang/Object;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "C");
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
