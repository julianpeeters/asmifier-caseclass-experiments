
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(J)Z", null, null);
mv.visitCode();
mv.visitVarInsn(LLOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()J");
mv.visitInsn(LCMP);
Label l0 = new Label();
mv.visitJumpInsn(IFNE, l0);
mv.visitInsn(ICONST_1);
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitInsn(ICONST_0);
mv.visitLabel(l1);
mv.visitInsn(IRETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
