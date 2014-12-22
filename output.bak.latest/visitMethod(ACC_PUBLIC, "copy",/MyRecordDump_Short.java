
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(S)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(S)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
