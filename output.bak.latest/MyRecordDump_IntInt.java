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
av0.visit("bytes", "\u0006\u0001\u0005ea\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0002J]RD\u0001\"\u0007\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003q\u0002B\u0001b\u0007\u0001\u0003\u0016\u0004%\u0009\u0001F\u0001\u0002s\"AQ\u0004\u0001B\u0009B\u0003%Q#\u0001\u0002zA!)q\u0004\u0001C\u0001A\u00051A(\u001b8jiz\"2!I\u0012%!\u0009\u0011\u0003!D\u0001\u0003\u0011\u0015\u0019b\u00041\u0001\u0016\u0011\u0015Yb\u00041\u0001\u0016\u0011\u001d1\u0003!!A\u0005\u0002\u001d\nAaY8qsR\u0019\u0011\u0005K\u0015\u0009\u000fM)\u0003\u0013!a\u0001+!91$\nI\u0001\u0002\u0004)\u0002bB\u0016\u0001#\u0003%\u0009\u0001L\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005i#FA\u000b/W\u0005y\u0003C\u0001\u00196\u001b\u0005\u0009$B\u0001\u001a4\u0003%)hn\u00195fG.,GM\u0003\u00025\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005Y\n$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0001\u0008AI\u0001\n\u0003a\u0013AD2paf$C-\u001a4bk2$HE\r\u0005\u0008u\u0001\u0009\u0009\u0011\"\u0011<\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009A\u0008\u0005\u0002>\u00056\u0009aH\u0003\u0002@\u0001\u0006!A.\u00198h\u0015\u0005\u0009\u0015\u0001\u00026bm\u0006L!a\u0011 \u0003\rM#(/\u001b8h\u0011\u001d)\u0005!!A\u0005\u0002Q\u0009A\u0002\u001d:pIV\u001cG/\u0011:jifDqa\u0012\u0001\u0002\u0002\u0013\u0005\u0001*\u0001\u0008qe>$Wo\u0019;FY\u0016lWM\u001c;\u0015\u0005%c\u0005CA\u0004K\u0013\u0009Y\u0005BA\u0002B]fDq!\u0014$\u0002\u0002\u0003\u0007Q#A\u0002yIEBqa\u0014\u0001\u0002\u0002\u0013\u0005\u0003+A\u0008qe>$Wo\u0019;Ji\u0016\u0014\u0018\r^8s+\u0005\u0009\u0006c\u0001*V\u00136\u00091K\u0003\u0002U\u0011\u0005Q1m\u001c7mK\u000e$\u0018n\u001c8\n\u0005Y\u001b&\u0001C%uKJ\u000cGo\u001c:\u0009\u000fa\u0003\u0011\u0011!C\u00013\u0006A1-\u00198FcV\u000cG\u000e\u0006\u0002[;B\u0011qaW\u0005\u00039\"\u0011qAQ8pY\u0016\u000cg\u000eC\u0004N/\u0006\u0005\u0009\u0019A%\u0009\u000f}\u0003\u0011\u0011!C!A\u0006A\u0001.Y:i\u0007>$W\rF\u0001\u0016\u0011\u001d\u0011\u0007!!A\u0005B\r\u000c\u0001\u0002^8TiJLgn\u001a\u000b\u0002y!9Q\rAA\u0001\n\u00032\u0017AB3rk\u0006d7\u000f\u0006\u0002[O\"9Q\nZA\u0001\u0002\u0004IuaB5\u0003\u0003\u0003E\u0009A[\u0001\u0009\u001bf\u0014VmY8sIB\u0011!e\u001b\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0001m'\rYWn\u0004\u0009\u0006]F,R#I\u0007\u0002_*\u0011\u0001\u000fC\u0001\u0008eVtG/[7f\u0013\u0009\u0011xNA\u0009BEN$(/Y2u\rVt7\r^5p]JBQaH6\u0005\u0002Q$\u0012A\u001b\u0005\u0008E.\u000c\u0009\u0011\"\u0012d\u0011\u001d98.!A\u0005\u0002b\u000cQ!\u00199qYf$2!I={\u0011\u0015\u0019b\u000f1\u0001\u0016\u0011\u0015Yb\u000f1\u0001\u0016\u0011\u001da8.!A\u0005\u0002v\u000cq!\u001e8baBd\u0017\u0010F\u0002\u0003\u0013\u0001BaB@\u0002\u0004%\u0019\u0011\u0011\u0001\u0005\u0003\r=\u0003H/[8o!\u00159\u0011QA\u000b\u0016\u0013\r\u00099\u0001\u0003\u0002\u0007)V\u0004H.\u001a\u001a\u0009\u0011\u0005-10!AA\u0002\u0005\n1\u0001\u001f\u00131\u0011%\u0009ya[A\u0001\n\u0013\u0009\u0009\"A\u0006sK\u0006$'+Z:pYZ,GCAA\n!\ri\u0014QC\u0005\u0004\u0003/q$AB(cU\u0016\u001cG\u000f");
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
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(II)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(II)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitLabel(l3);
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
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(II)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "I");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "I");
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
