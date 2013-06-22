visitMethod(ACC_PUBLIC, "x", "()Lscala/runtime/Nothing$;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "Lscala/runtime/Nothing$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv