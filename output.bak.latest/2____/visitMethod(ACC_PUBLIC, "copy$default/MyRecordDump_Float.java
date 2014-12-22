
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()F", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()F");
mv.visitInsn(FRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
