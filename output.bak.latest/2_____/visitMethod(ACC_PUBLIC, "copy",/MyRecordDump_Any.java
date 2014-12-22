
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/Object;Lscala/runtime/Nothing$;Ljava/lang/Object;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Ljava/lang/Object;Lscala/runtime/Nothing$;Ljava/lang/Object;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
