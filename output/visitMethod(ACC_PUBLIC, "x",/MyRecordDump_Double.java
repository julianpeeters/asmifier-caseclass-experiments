
mv = cw.visitMethod(ACC_PUBLIC, "x", "()D", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "D");
mv.visitInsn(DRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
