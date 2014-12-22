
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
