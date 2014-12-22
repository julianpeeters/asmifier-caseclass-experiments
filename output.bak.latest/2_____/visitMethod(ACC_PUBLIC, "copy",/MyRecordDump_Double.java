
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(DLscala/runtime/Nothing$;D)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(DLOAD, 1);
mv.visitVarInsn(ALOAD, 3);
mv.visitVarInsn(DLOAD, 4);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(DLscala/runtime/Nothing$;D)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(7, 6);
mv.visitEnd();
