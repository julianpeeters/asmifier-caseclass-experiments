
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Ljava/lang/Object;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
