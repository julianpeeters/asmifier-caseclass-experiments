visitMethod(ACC_PUBLIC, "copy$default$1", "()B", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()B");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv