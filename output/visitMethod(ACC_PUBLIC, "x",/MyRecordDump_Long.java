visitMethod(ACC_PUBLIC, "x", "()J", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "J");
mv.visitInsn(LRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv