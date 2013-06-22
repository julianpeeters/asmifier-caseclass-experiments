[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Jun 21, 2013 10:23:08 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to default-22f0e6 (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.9.2 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.9.2/classes...[0m
[0m[[33mwarn[0m] [0mthere were 3 deprecation warnings; re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mone warning found[0m
[0m[[32msuccess[0m] [0mTotal time: 14 s, completed Jun 21, 2013 10:23:26 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005ma\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00059A(Z7qift4\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005AX#A\u000f\u0011\u0007y1\u0013F\u0004\u0002 I9\u0011\u0001eI\u0007\u0002C)\u0011!\u0005B\u0001\u0007yI|w\u000e\u001e \n\u0003EI!!\n\u0009\u0002\u000fA\u000c7m[1hK&\u0011q\u0005\u000b\u0002\u0005\u0019&\u001cHO\u0003\u0002&!A\u0019aD\n\u0016\u0011\u0007y13\u0006\u0005\u0002\u0010Y%\u0011Q\u0006\u0005\u0002\u0004\u0013:$\u0008\u0002C\u0018\u0001\u0005#\u0005\u000b\u0011B\u000f\u0002\u0005a\u0004\u0003\"B\u0019\u0001\u0009\u0003\u0011\u0014A\u0002\u001fj]&$h\u0008\u0006\u00024kA\u0011A\u0007A\u0007\u0002\u0005!)1\u0004\ra\u0001;!9q\u0007AA\u0001\n\u0003A\u0014\u0001B2paf$\"aM\u001d\u0009\u000fm1\u0004\u0013!a\u0001;!91\u0008AI\u0001\n\u0003a\u0014AD2paf$C-\u001a4bk2$H%M\u000b\u0002{)\u0012QDP\u0016\u0002A\u0011\u0001)R\u0007\u0002\u0003*\u0011!iQ\u0001\nk:\u001c\u0007.Z2lK\u0012T!\u0001\u0012\u0009\u0002\u0015\u0005tgn\u001c;bi&|g.\u0003\u0002G\u0003\n\u0009RO\\2iK\u000e\\W\r\u001a,be&\u000cgnY3\u0009\u000b!\u0003A\u0011I%\u0002\u0011!\u000c7\u000f[\"pI\u0016$\u0012a\u000b\u0005\u0006\u0017\u0002!\u0009\u0005T\u0001\u0009i>\u001cFO]5oOR\u0009Q\n\u0005\u0002O#:\u0011qbT\u0005\u0003!B\u0009a\u0001\u0015:fI\u00164\u0017B\u0001*T\u0005\u0019\u0019FO]5oO*\u0011\u0001\u000b\u0005\u0005\u0006+\u0002!\u0009EV\u0001\u0007KF,\u0018\r\\:\u0015\u0005]S\u0006CA\u0008Y\u0013\u0009I\u0006CA\u0004C_>dW-\u00198\u0009\u000fm#\u0016\u0011!a\u00019\u0006\u0019\u0001\u0010J\u0019\u0011\u0005=i\u0016B\u00010\u0011\u0005\r\u0009e.\u001f\u0005\u0006A\u0002!\u0009%Y\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003\u0009\u0004\"aB2\n\u0005IC\u0001\"B3\u0001\u0009\u00032\u0017\u0001\u00049s_\u0012,8\r^!sSRLX#A\u0016\u0009\u000b!\u0004A\u0011I5\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011AL\u001b\u0005\u00087\u001e\u000c\u0009\u00111\u0001,\u0011\u0015a\u0007\u0001\"\u0011n\u0003!\u0019\u0017M\\#rk\u0006dGCA,o\u0011\u001dY6.!AA\u0002q;q\u0001\u001d\u0002\u0002\u0002#\u0015\u0011/\u0001\u0005NsJ+7m\u001c:e!\u0009!$OB\u0004\u0002\u0005\u0005\u0005\u0009RA:\u0014\u0009I$hb\u0006\u0009\u0005kbl2'D\u0001w\u0015\u00099\u0008#A\u0004sk:$\u0018.\\3\n\u0005e4(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oc!)\u0011G\u001dC\u0001wR\u0009\u0011\u000fC\u0003Le\u0012\u0015S\u0010F\u0001c\u0011!y(/!A\u0005\u0002\u0006\u0005\u0011!B1qa2LHcA\u001a\u0002\u0004!)1D a\u0001;!I\u0011q\u0001:\u0002\u0002\u0013\u0005\u0015\u0011B\u0001\u0008k:\u000c\u0007\u000f\u001d7z)\u0011\u0009Y!!\u0005\u0011\u0009=\u0009i!H\u0005\u0004\u0003\u001f\u0001\"AB(qi&|g\u000eC\u0004\u0002\u0014\u0005\u0015\u0001\u0019A\u001a\u0002\u0007a$\u0003\u0007C\u0004\u0002\u0018I$\u0009\"!\u0007\u0002\u0017I,\u0017\r\u001a*fg>dg/\u001a\u000b\u0002\r\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lscala/collection/immutable/List;", "Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<LMyRecord;TA;>;)Lscala/Function1<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "compose", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<TA;Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;>;)Lscala/Function1<TA;LMyRecord;>;", null);
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
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Lscala/collection/immutable/List;", "()Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "Lscala/collection/immutable/List;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/collection/immutable/List;)LMyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "<init>", "(Lscala/collection/immutable/List;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Lscala/collection/immutable/List;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Lscala/collection/immutable/List;");
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
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(CHECKCAST, "MyRecord");
mv.visitVarInsn(ASTORE, 3);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitVarInsn(ASTORE, 4);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ASTORE, 5);
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 5);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "gd1$1", "(Lscala/collection/immutable/List;)Z");
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
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Lscala/collection/immutable/List;");
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
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(Lscala/collection/immutable/List;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitVarInsn(ASTORE, 2);
mv.visitInsn(DUP);
Label l0 = new Label();
mv.visitJumpInsn(IFNONNULL, l0);
mv.visitInsn(POP);
mv.visitVarInsn(ALOAD, 2);
Label l1 = new Label();
mv.visitJumpInsn(IFNULL, l1);
Label l2 = new Label();
mv.visitJumpInsn(GOTO, l2);
mv.visitLabel(l0);
mv.visitVarInsn(ALOAD, 2);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l2);
mv.visitLabel(l1);
mv.visitInsn(ICONST_1);
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lscala/collection/immutable/List;)V", "(Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;)V", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "MyRecord", "x", "Lscala/collection/immutable/List;");
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
