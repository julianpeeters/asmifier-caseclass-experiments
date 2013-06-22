visitMethod(ACC_PUBLIC, "copy$default$1", "()J", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()J");
mv.visitInsn(LRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv