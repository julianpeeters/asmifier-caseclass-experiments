
mv = cw.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
Label l0 = new Label();
mv.visitJumpInsn(IF_ACMPEQ, l0);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ASTORE, 2);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(INSTANCEOF, "MyRecord");
Label l1 = new Label();
mv.visitJumpInsn(IFEQ, l1);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(CHECKCAST, "MyRecord");
mv.visitVarInsn(ASTORE, 3);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()I");
mv.visitVarInsn(ISTORE, 4);
mv.visitVarInsn(ILOAD, 4);
mv.visitVarInsn(ISTORE, 5);
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 5);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "gd1$1", "(I)Z");
Label l2 = new Label();
mv.visitJumpInsn(IFEQ, l2);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "MyRecord");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEINTERFACE, "scala/Equals", "canEqual", "(Ljava/lang/Object;)Z");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l1);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
Label l4 = new Label();
mv.visitJumpInsn(IFEQ, l4);
mv.visitLabel(l0);
mv.visitInsn(ICONST_1);
Label l5 = new Label();
mv.visitJumpInsn(GOTO, l5);
mv.visitLabel(l4);
mv.visitInsn(ICONST_0);
mv.visitLabel(l5);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 6);
mv.visitEnd();
