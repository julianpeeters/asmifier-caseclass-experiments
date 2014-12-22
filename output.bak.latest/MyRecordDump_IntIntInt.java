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
av0.visit("bytes", "\u0006\u0001\u0005-b\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002J]RD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001F\u0001\u0002s\"AQ\u0004\u0001B\u0009B\u0003%Q#\u0001\u0002zA!Aq\u0004\u0001BK\u0002\u0013\u0005A#A\u0001{\u0011!\u0009\u0003A!E!\u0002\u0013)\u0012A\u0001>!\u0011\u0015\u0019\u0003\u0001\"\u0001%\u0003\u0019a\u0014N\\5u}Q!Qe\n\u0015*!\u00091\u0003!D\u0001\u0003\u0011\u0015\u0019\"\u00051\u0001\u0016\u0011\u0015Y\"\u00051\u0001\u0016\u0011\u0015y\"\u00051\u0001\u0016\u0011\u001dY\u0003!!A\u0005\u00021\nAaY8qsR!Q%\u000c\u00180\u0011\u001d\u0019\"\u0006%AA\u0002UAqa\u0007\u0016\u0011\u0002\u0003\u0007Q\u0003C\u0004 UA\u0005\u0009\u0019A\u000b\u0009\u000fE\u0002\u0011\u0013!C\u0001e\u0005q1m\u001c9zI\u0011,g-Y;mi\u0012\nT#A\u001a+\u0005U!4&A\u001b\u0011\u0005YZT\"A\u001c\u000b\u0005aJ\u0014!C;oG\",7m[3e\u0015\u0009Q\u0004\"\u0001\u0006b]:|G/\u0019;j_:L!\u0001P\u001c\u0003#Ut7\r[3dW\u0016$g+\u0019:jC:\u001cW\rC\u0004?\u0001E\u0005I\u0011\u0001\u001a\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%e!9\u0001\u0009AI\u0001\n\u0003\u0011\u0014AD2paf$C-\u001a4bk2$He\r\u0005\u0008\u0005\u0002\u0009\u0009\u0011\"\u0011D\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009A\u0009\u0005\u0002F\u00156\u0009aI\u0003\u0002H\u0011\u0006!A.\u00198h\u0015\u0005I\u0015\u0001\u00026bm\u0006L!a\u0013$\u0003\rM#(/\u001b8h\u0011\u001di\u0005!!A\u0005\u0002Q\u0009A\u0002\u001d:pIV\u001cG/\u0011:jifDqa\u0014\u0001\u0002\u0002\u0013\u0005\u0001+\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005E#\u0006CA\u0004S\u0013\u0009\u0019\u0006BA\u0002B]fDq!\u0016(\u0002\u0002\u0003\u0007Q#A\u0002yIEBqa\u0016\u0001\u0002\u0002\u0013\u0005\u0003,A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005I\u0006c\u0001.^#6\u00091L\u0003\u0002]\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005y[&\u0001C%uKJ\u000cGo\u001c:\u0009\u000f\u0001\u0004\u0011\u0011!C\u0001C\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002cKB\u0011qaY\u0005\u0003I\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004V?\u0006\u0005\u0009\u0019A)\u0009\u000f\u001d\u0004\u0011\u0011!C!Q\u0006A\u0001.Y:i\u0007>$W\rF\u0001\u0016\u0011\u001dQ\u0007!!A\u0005B-\u000c\u0001\u0002^8TiJLgn\u001a\u000b\u0002\u0009\"9Q\u000eAA\u0001\n\u0003r\u0017AB3rk\u0006d7\u000f\u0006\u0002c_\"9Q\u000b\\A\u0001\u0002\u0004\u0009vaB9\u0003\u0003\u0003E\u0009A]\u0001\u0009\u001bf\u0014VmY8sIB\u0011ae\u001d\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0001u'\r\u0019Xo\u0004\u0009\u0007mf,R#F\u0013\u000e\u0003]T!\u0001\u001f\u0005\u0002\u000fI,h\u000e^5nK&\u0011!p\u001e\u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u001c\u0004\"B\u0012t\u0009\u0003aH#\u0001:\u0009\u000f)\u001c\u0018\u0011!C#W\"Aqp]A\u0001\n\u0003\u000b\u0009!A\u0003baBd\u0017\u0010F\u0004&\u0003\u0007\u0009)!a\u0002\u0009\u000bMq\u0008\u0019A\u000b\u0009\u000bmq\u0008\u0019A\u000b\u0009\u000b}q\u0008\u0019A\u000b\u0009\u0013\u0005-1/!A\u0005\u0002\u00065\u0011aB;oCB\u0004H.\u001f\u000b\u0005\u0003\u001f\u0009Y\u0002E\u0003\u0008\u0003#\u0009)\"C\u0002\u0002\u0014!\u0011aa\u00149uS>t\u0007CB\u0004\u0002\u0018U)R#C\u0002\u0002\u001a!\u0011a\u0001V;qY\u0016\u001c\u0004\"CA\u000f\u0003\u0013\u0009\u0009\u00111\u0001&\u0003\rAH\u0005\r\u0005\n\u0003C\u0019\u0018\u0011!C\u0005\u0003G\u00091B]3bIJ+7o\u001c7wKR\u0011\u0011Q\u0005\u0009\u0004\u000b\u0006\u001d\u0012bAA\u0015\r\n1qJ\u00196fGR\u0004");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "I", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "I", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "z", "I", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple3<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lmodels/MyRecord;>;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "curried", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "y", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "y", "I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "z", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "z", "I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(III)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitVarInsn(ILOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(III)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()I");
mv.visitInsn(IRETURN);
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
Label l4 = new Label();
mv.visitJumpInsn(GOTO, l4);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitJumpInsn(GOTO, l4);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Integer"});
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);

mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);

mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);

mv.visitInsn(ICONST_ + fieldData.length);

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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()I");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()I");
Label l4 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()I");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()I");
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()I");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()I");
mv.visitJumpInsn(IF_ICMPNE, l4);
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
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(III)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "I");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "I");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 3);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "z", "I");
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
