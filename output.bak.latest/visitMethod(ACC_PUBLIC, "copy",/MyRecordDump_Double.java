
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(D)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(DLOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(D)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
