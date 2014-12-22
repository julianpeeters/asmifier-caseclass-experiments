
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()J", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()J");
mv.visitInsn(LRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
