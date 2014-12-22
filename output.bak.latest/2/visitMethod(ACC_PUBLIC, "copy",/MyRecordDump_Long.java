
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(JLjava/lang/String;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(LLOAD, 1);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(JLjava/lang/String;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
