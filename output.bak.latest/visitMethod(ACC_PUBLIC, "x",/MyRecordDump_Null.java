
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Lscala/runtime/Null$;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Lscala/runtime/Null$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
