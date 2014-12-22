
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/runtime/BoxedUnit;Lscala/runtime/Nothing$;Lscala/runtime/BoxedUnit;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/runtime/BoxedUnit;Lscala/runtime/Nothing$;Lscala/runtime/BoxedUnit;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
