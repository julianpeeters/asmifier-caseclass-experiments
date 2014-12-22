
mv = cw.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
mv.visitCode();
mv.visitLdcInsn(new Integer(-889275714));
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()D");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "doubleHash", "(D)I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "mix", "(II)I");
mv.visitVarInsn(ISTORE, 1);
mv.visitVarInsn(ILOAD, 1);
mv.visitInsn(ICONST_1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/Statics", "finalizeHash", "(II)I");
mv.visitInsn(IRETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
