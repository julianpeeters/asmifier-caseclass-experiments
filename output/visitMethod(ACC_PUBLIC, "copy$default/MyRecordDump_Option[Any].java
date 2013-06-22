visitMethod(ACC_PUBLIC, "copy$default$1", "()Lscala/Option;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Lscala/Option;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv