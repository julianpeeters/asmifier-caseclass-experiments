
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(SB)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(SB)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
