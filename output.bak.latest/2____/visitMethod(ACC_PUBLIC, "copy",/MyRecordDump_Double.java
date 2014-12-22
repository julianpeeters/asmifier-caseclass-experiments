
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/runtime/Nothing$;D)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(DLOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/runtime/Nothing$;D)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
