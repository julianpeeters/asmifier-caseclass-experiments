
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()C", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()C");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
