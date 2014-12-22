
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()D", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()D");
mv.visitInsn(DRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
