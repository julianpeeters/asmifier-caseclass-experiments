visitMethod(ACC_PUBLIC, "copy$default$1", "()Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Ljava/lang/Object;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv