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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001a\u001d\u00099q#\u0003\u0002\u0019\u0011\u00051\u0001K]3eK\u001aL!AG\u000e\u0003\rM#(/\u001b8h\u0015\u0009A\u0002\u0002\u0003\u0005\u001e\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005 \u0001\u0009U\r\u0011\"\u0001\u0015\u0003\u0005I\u0008\u0002C\u0011\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005e\u0004\u0003\"B\u0012\u0001\u0009\u0003!\u0013A\u0002\u001fj]&$h\u0008F\u0002&O!\u0002\"A\n\u0001\u000e\u0003\u0009AQa\u0005\u0012A\u0002UAQa\u0008\u0012A\u0002UAqA\u000b\u0001\u0002\u0002\u0013\u00051&\u0001\u0003d_BLHcA\u0013-[!91#\u000bI\u0001\u0002\u0004)\u0002bB\u0010*!\u0003\u0005\r!\u0006\u0005\u0008_\u0001\u0009\n\u0011\"\u00011\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012!\r\u0016\u0003+IZ\u0013a\r\u0009\u0003iej\u0011!\u000e\u0006\u0003m]\n\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u0005aB\u0011AC1o]>$\u0018\r^5p]&\u0011!(\u000e\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002\u001f\u0001#\u0003%\u0009\u0001M\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133\u0011\u001dq\u0004!!A\u0005B}\nQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001!\u0011\u0005\u00053U\"\u0001\"\u000b\u0005\r#\u0015\u0001\u00027b]\u001eT\u0011!R\u0001\u0005U\u00064\u0018-\u0003\u0002\u001b\u0005\"9\u0001\nAA\u0001\n\u0003I\u0015\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001&\u0011\u0005\u001dY\u0015B\u0001'\u0009\u0005\rIe\u000e\u001e\u0005\u0008\u001d\u0002\u0009\u0009\u0011\"\u0001P\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"\u0001U*\u0011\u0005\u001d\u0009\u0016B\u0001*\u0009\u0005\r\u0009e.\u001f\u0005\u0008)6\u000b\u0009\u00111\u0001K\u0003\rAH%\r\u0005\u0008-\u0002\u0009\u0009\u0011\"\u0011X\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u0001-\u0011\u0007ec\u0006+D\u0001[\u0015\u0009Y\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!!\u0018.\u0003\u0011%#XM]1u_JDqa\u0018\u0001\u0002\u0002\u0013\u0005\u0001-\u0001\u0005dC:,\u0015/^1m)\u0009\u0009G\r\u0005\u0002\u0008E&\u00111\r\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001d!f,!AA\u0002ACqA\u001a\u0001\u0002\u0002\u0013\u0005s-\u0001\u0005iCND7i\u001c3f)\u0005Q\u0005bB5\u0001\u0003\u0003%\u0009E[\u0001\u0009i>\u001cFO]5oOR\u0009\u0001\u0009C\u0004m\u0001\u0005\u0005I\u0011I7\u0002\r\u0015\u000cX/\u00197t)\u0009\u0009g\u000eC\u0004UW\u0006\u0005\u0009\u0019\u0001)\u0008\u000fA\u0014\u0011\u0011!E\u0001c\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002'e\u001a9\u0011AAA\u0001\u0012\u0003\u00198c\u0001:u\u001fA)Q\u000f_\u000b\u0016K5\u0009aO\u0003\u0002x\u0011\u00059!/\u001e8uS6,\u0017BA=w\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|gN\r\u0005\u0006GI$\u0009a\u001f\u000b\u0002c\"9\u0011N]A\u0001\n\u000bR\u0007b\u0002@s\u0003\u0003%\u0009i`\u0001\u0006CB\u0004H.\u001f\u000b\u0006K\u0005\u0005\u00111\u0001\u0005\u0006'u\u0004\r!\u0006\u0005\u0006?u\u0004\r!\u0006\u0005\n\u0003\u000f\u0011\u0018\u0011!CA\u0003\u0013\u0009q!\u001e8baBd\u0017\u0010\u0006\u0003\u0002\u000c\u0005]\u0001#B\u0004\u0002\u000e\u0005E\u0011bAA\u0008\u0011\u00091q\n\u001d;j_:\u0004RaBA\n+UI1!!\u0006\u0009\u0005\u0019!V\u000f\u001d7fe!I\u0011\u0011DA\u0003\u0003\u0003\u0005\r!J\u0001\u0004q\u0012\u0002\u0004\"CA\u000fe\u0006\u0005I\u0011BA\u0010\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0005\u0005\u0005\u0002cA!\u0002$%\u0019\u0011Q\u0005\"\u0003\r=\u0013'.Z2u\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple2<Ljava/lang/String;Ljava/lang/String;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/String;Lscala/Function1<Ljava/lang/String;Lmodels/MyRecord;>;>;", null);
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
mv = cw.visitMethod(ACC_PUBLIC, "y", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "y", "Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;Ljava/lang/String;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V");
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
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/String;");
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/String;");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Ljava/lang/String;");
mv.visitVarInsn(ASTORE, 6);
mv.visitInsn(DUP);
Label l7 = new Label();
mv.visitJumpInsn(IFNONNULL, l7);
mv.visitInsn(POP);
mv.visitVarInsn(ALOAD, 6);
Label l8 = new Label();
mv.visitJumpInsn(IFNULL, l8);
mv.visitJumpInsn(GOTO, l6);
mv.visitLabel(l7);
mv.visitFrame(Opcodes.F_FULL, 7, new Object[] {"models/MyRecord", "java/lang/Object", "java/lang/Object", Opcodes.INTEGER, "models/MyRecord", "java/lang/String", "java/lang/String"}, 1, new Object[] {"java/lang/String"});
mv.visitVarInsn(ALOAD, 6);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitLabel(l8);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "canEqual", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitInsn(ICONST_1);
Label l9 = new Label();
mv.visitJumpInsn(GOTO, l9);
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l9);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitJumpInsn(IFEQ, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 0, new Object[] {});
mv.visitInsn(ICONST_1);
Label l10 = new Label();
mv.visitJumpInsn(GOTO, l10);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l10);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 1, new Object[] {Opcodes.INTEGER});
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 7);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Ljava/lang/String;");
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
