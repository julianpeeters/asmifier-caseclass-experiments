visitMethod(ACC_PUBLIC, "x", "()S", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "S");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv