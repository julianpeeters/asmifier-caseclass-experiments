
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()B", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "y", "()B");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
