visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Ljava/lang/Object;");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
Label l0 = new Label();
mv.visitJumpInsn(IFEQ, l0);
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
mv