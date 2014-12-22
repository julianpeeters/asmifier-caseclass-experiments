
mv = cw.visitMethod(ACC_PUBLIC, "x", "()C", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "C");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
