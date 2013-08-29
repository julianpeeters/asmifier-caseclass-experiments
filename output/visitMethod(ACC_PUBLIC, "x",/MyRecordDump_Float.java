
mv = cw.visitMethod(ACC_PUBLIC, "x", "()F", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "F");
mv.visitInsn(FRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
