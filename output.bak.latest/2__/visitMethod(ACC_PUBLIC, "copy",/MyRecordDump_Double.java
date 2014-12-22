
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(DLscala/runtime/Nothing$;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(DLOAD, 1);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(DLscala/runtime/Nothing$;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
