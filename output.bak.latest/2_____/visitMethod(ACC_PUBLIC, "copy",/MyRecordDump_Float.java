
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(FLscala/runtime/Nothing$;F)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(FLOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(FLOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(FLscala/runtime/Nothing$;F)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
