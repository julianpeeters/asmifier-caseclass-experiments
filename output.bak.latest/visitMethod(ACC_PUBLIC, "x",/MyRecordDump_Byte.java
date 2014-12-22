
mv = cw.visitMethod(ACC_PUBLIC, "x", "()B", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "B");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
