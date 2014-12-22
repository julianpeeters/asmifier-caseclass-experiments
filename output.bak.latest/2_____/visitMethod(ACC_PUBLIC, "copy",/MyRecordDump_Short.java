
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(SLscala/runtime/Nothing$;S)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(ILOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(SLscala/runtime/Nothing$;S)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
