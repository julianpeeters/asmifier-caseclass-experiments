
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()F", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()F");
mv.visitInsn(FRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
