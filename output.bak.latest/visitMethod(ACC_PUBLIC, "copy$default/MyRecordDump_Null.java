
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Lscala/runtime/Null$;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/runtime/Null$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
