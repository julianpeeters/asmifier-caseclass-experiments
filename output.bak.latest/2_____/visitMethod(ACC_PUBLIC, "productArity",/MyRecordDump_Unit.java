
mv = cw.visitMethod(ACC_PUBLIC, "productArity", "()I", null, null);
mv.visitCode();
mv.visitInsn(ICONST_3);
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
