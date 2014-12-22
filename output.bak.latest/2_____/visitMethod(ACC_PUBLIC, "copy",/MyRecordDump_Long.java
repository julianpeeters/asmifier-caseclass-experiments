
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(JLscala/runtime/Nothing$;J)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(LLOAD, 1);
mv.visitVarInsn(ALOAD, 3);
mv.visitVarInsn(LLOAD, 4);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(JLscala/runtime/Nothing$;J)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(7, 6);
mv.visitEnd();
