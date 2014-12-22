
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(JB)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(LLOAD, 1);
mv.visitVarInsn(ILOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(JB)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
