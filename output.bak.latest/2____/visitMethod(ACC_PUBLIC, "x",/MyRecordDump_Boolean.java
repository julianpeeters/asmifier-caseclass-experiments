
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
