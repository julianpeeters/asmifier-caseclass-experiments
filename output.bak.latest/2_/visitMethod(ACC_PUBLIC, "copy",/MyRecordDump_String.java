
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;B)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Ljava/lang/String;B)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
