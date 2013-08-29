
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(Z)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Z");
Label l0 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l0);
mv.visitInsn(ICONST_1);
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitInsn(ICONST_0);
mv.visitLabel(l1);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
