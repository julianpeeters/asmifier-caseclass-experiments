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
av0.visit("bytes", "\u0006\u0001\u0005\rd\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004C_>dW-\u00198\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002Q\u0009\u0011!\u001f\u0005\u0009;\u0001\u0011\u0009\u0012)A\u0005+\u0005\u0011\u0011\u0010\u0009\u0005\u0009?\u0001\u0011)\u001a!C\u0001)\u0005\u0009!\u0010\u0003\u0005\"\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009Q\u0008\u0005\u0003\u0005$\u0001\u0009U\r\u0011\"\u0001\u0015\u0003\u0005\u0009\u0007\u0002C\u0013\u0001\u0005#\u0005\u000b\u0011B\u000b\u0002\u0005\u0005\u0004\u0003\u0002C\u0014\u0001\u0005+\u0007I\u0011\u0001\u000b\u0002\u0003\u0009D\u0001\"\u000b\u0001\u0003\u0012\u0003\u0006I!F\u0001\u0003E\u0002B\u0001b\u000b\u0001\u0003\u0016\u0004%\u0009\u0001F\u0001\u0002G\"AQ\u0006\u0001B\u0009B\u0003%Q#\u0001\u0002dA!)q\u0006\u0001C\u0001a\u00051A(\u001b8jiz\"r!M\u001a5kY:\u0004\u0008\u0005\u00023\u00015\u0009!\u0001C\u0003\u0014]\u0001\u0007Q\u0003C\u0003\u001c]\u0001\u0007Q\u0003C\u0003 ]\u0001\u0007Q\u0003C\u0003$]\u0001\u0007Q\u0003C\u0003(]\u0001\u0007Q\u0003C\u0003,]\u0001\u0007Q\u0003C\u0004;\u0001\u0005\u0005I\u0011A\u001e\u0002\u0009\r|\u0007/\u001f\u000b\u0008cqjdh\u0010!B\u0011\u001d\u0019\u0012\u0008%AA\u0002UAqaG\u001d\u0011\u0002\u0003\u0007Q\u0003C\u0004 sA\u0005\u0009\u0019A\u000b\u0009\u000f\rJ\u0004\u0013!a\u0001+!9q%\u000fI\u0001\u0002\u0004)\u0002bB\u0016:!\u0003\u0005\r!\u0006\u0005\u0008\u0007\u0002\u0009\n\u0011\"\u0001E\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIE*\u0012!\u0012\u0016\u0003+\u0019[\u0013a\u0012\u0009\u0003\u00116k\u0011!\u0013\u0006\u0003\u0015.\u000b\u0011\"\u001e8dQ\u0016\u001c7.\u001a3\u000b\u00051C\u0011AC1o]>$\u0018\r^5p]&\u0011a*\u0013\u0002\u0012k:\u001c\u0007.Z2lK\u00124\u0016M]5b]\u000e,\u0007b\u0002)\u0001#\u0003%\u0009\u0001R\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00133\u0011\u001d\u0011\u0006!%A\u0005\u0002\u0011\u000babY8qs\u0012\"WMZ1vYR$3\u0007C\u0004U\u0001E\u0005I\u0011\u0001#\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%i!9a\u000bAI\u0001\n\u0003!\u0015AD2paf$C-\u001a4bk2$H%\u000e\u0005\u00081\u0002\u0009\n\u0011\"\u0001E\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uIYBqA\u0017\u0001\u0002\u0002\u0013\u00053,A\u0007qe>$Wo\u0019;Qe\u00164\u0017\u000e_\u000b\u00029B\u0011QLY\u0007\u0002=*\u0011q\u000cY\u0001\u0005Y\u0006twMC\u0001b\u0003\u0011Q\u0017M^1\n\u0005\rt&AB*ue&tw\rC\u0004f\u0001\u0005\u0005I\u0011\u00014\u0002\u0019A\u0014x\u000eZ;di\u0006\u0013\u0018\u000e^=\u0016\u0003\u001d\u0004\"a\u00025\n\u0005%D!aA%oi\"91\u000eAA\u0001\n\u0003a\u0017A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003[B\u0004\"a\u00028\n\u0005=D!aA!os\"9\u0011O[A\u0001\u0002\u00049\u0017a\u0001=%c!91\u000fAA\u0001\n\u0003\"\u0018a\u00049s_\u0012,8\r^%uKJ\u000cGo\u001c:\u0016\u0003U\u00042A^=n\u001b\u00059(B\u0001=\u0009\u0003)\u0019w\u000e\u001c7fGRLwN\\\u0005\u0003u^\u0014\u0001\"\u0013;fe\u0006$xN\u001d\u0005\u0008y\u0002\u0009\u0009\u0011\"\u0001~\u0003!\u0019\u0017M\\#rk\u0006dGCA\u000b\u0011\u001d\u000980!AA\u00025D\u0011\"!\u0001\u0001\u0003\u0003%\u0009%a\u0001\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012a\u001a\u0005\n\u0003\u000f\u0001\u0011\u0011!C!\u0003\u0013\u0009\u0001\u0002^8TiJLgn\u001a\u000b\u00029\"I\u0011Q\u0002\u0001\u0002\u0002\u0013\u0005\u0013qB\u0001\u0007KF,\u0018\r\\:\u0015\u0007U\u0009\u0009\u0002\u0003\u0005r\u0003\u0017\u0009\u0009\u00111\u0001n\u000f%\u0009)BAA\u0001\u0012\u0003\u00099\"\u0001\u0005NsJ+7m\u001c:e!\r\u0011\u0014\u0011\u0004\u0004\u0009\u0003\u0009\u0009\u0009\u0011#\u0001\u0002\u001cM)\u0011\u0011DA\u000f\u001fAY\u0011qDA\u0013+U)R#F\u000b2\u001b\u0009\u0009\u0009CC\u0002\u0002$!\u0009qA];oi&lW-\u0003\u0003\u0002(\u0005\u0005\"!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8om!9q&!\u0007\u0005\u0002\u0005-BCAA\u000c\u0011)\u00099!!\u0007\u0002\u0002\u0013\u0015\u0013\u0011\u0002\u0005\u000b\u0003c\u0009I\"!A\u0005\u0002\u0006M\u0012!B1qa2LH#D\u0019\u00026\u0005]\u0012\u0011HA\u001e\u0003{\u0009y\u0004\u0003\u0004\u0014\u0003_\u0001\r!\u0006\u0005\u00077\u0005=\u0002\u0019A\u000b\u0009\r}\u0009y\u00031\u0001\u0016\u0011\u0019\u0019\u0013q\u0006a\u0001+!1q%a\u000cA\u0002UAaaKA\u0018\u0001\u0004)\u0002BCA\"\u00033\u0009\u0009\u0011\"!\u0002F\u00059QO\\1qa2LH\u0003BA$\u0003'\u0002RaBA%\u0003\u001bJ1!a\u0013\u0009\u0005\u0019y\u0005\u000f^5p]BIq!a\u0014\u0016+U)R#F\u0005\u0004\u0003#B!A\u0002+va2,g\u0007C\u0005\u0002V\u0005\u0005\u0013\u0011!a\u0001c\u0005\u0019\u0001\u0010\n\u0019\u0009\u0015\u0005e\u0013\u0011DA\u0001\n\u0013\u0009Y&A\u0006sK\u0006$'+Z:pYZ,GCAA/!\ri\u0016qL\u0005\u0004\u0003Cr&AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Z", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "Z", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "z", "Z", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "a", "Z", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "b", "Z", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "c", "Z", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple6<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lmodels/MyRecord;>;>;>;>;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "curried", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "y", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "y", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "z", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "z", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "a", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "a", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "b", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "b", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "c", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "c", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$4", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "a", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$5", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "b", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$6", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "c", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(ZZZZZZ)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitVarInsn(ILOAD, 3);
mv.visitVarInsn(ILOAD, 4);
mv.visitVarInsn(ILOAD, 5);
mv.visitVarInsn(ILOAD, 6);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(ZZZZZZ)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(8, 7);
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
mv.visitIntInsn(BIPUSH, 6);
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
Label l4 = new Label();
Label l5 = new Label();
Label l6 = new Label();
mv.visitTableSwitchInsn(0, 5, l6, new Label[] { l0, l1, l2, l3, l4, l5 });
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitLabel(l5);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "c", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
Label l7 = new Label();
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "b", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "a", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l2);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
mv.visitLabel(l7);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Z");
Label l0 = new Label();
mv.visitJumpInsn(IFEQ, l0);
mv.visitIntInsn(SIPUSH, 1231);
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 1, new Object[] {Opcodes.INTEGER});
mv.visitIntInsn(SIPUSH, 1237);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Z");
Label l2 = new Label();
mv.visitJumpInsn(IFEQ, l2);
mv.visitIntInsn(SIPUSH, 1231);
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitIntInsn(SIPUSH, 1237);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Z");
Label l4 = new Label();
mv.visitJumpInsn(IFEQ, l4);
mv.visitIntInsn(SIPUSH, 1231);
Label l5 = new Label();
mv.visitJumpInsn(GOTO, l5);
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitIntInsn(SIPUSH, 1237);
mv.visitLabel(l5);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "a", "()Z");
Label l6 = new Label();
mv.visitJumpInsn(IFEQ, l6);
mv.visitIntInsn(SIPUSH, 1231);
Label l7 = new Label();
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitIntInsn(SIPUSH, 1237);
mv.visitLabel(l7);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "b", "()Z");
Label l8 = new Label();
mv.visitJumpInsn(IFEQ, l8);
mv.visitIntInsn(SIPUSH, 1231);
Label l9 = new Label();
mv.visitJumpInsn(GOTO, l9);
mv.visitLabel(l8);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitIntInsn(SIPUSH, 1237);
mv.visitLabel(l9);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "c", "()Z");
Label l10 = new Label();
mv.visitJumpInsn(IFEQ, l10);
mv.visitIntInsn(SIPUSH, 1231);
Label l11 = new Label();
mv.visitJumpInsn(GOTO, l11);
mv.visitLabel(l10);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitIntInsn(SIPUSH, 1237);
mv.visitLabel(l11);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitIntInsn(BIPUSH, 6);
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Z");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Z");
Label l4 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Z");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()Z");
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Z");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Z");
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "a", "()Z");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "a", "()Z");
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "b", "()Z");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "b", "()Z");
mv.visitJumpInsn(IF_ICMPNE, l4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "c", "()Z");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "c", "()Z");
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
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(ZZZZZZ)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 3);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "z", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 4);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "a", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 5);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "b", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 6);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "c", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 7);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
