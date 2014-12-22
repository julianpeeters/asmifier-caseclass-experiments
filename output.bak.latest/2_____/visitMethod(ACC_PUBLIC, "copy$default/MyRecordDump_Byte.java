
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()B", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()B");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
