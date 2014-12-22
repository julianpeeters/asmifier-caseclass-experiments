
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()Lscala/runtime/Nothing$;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Lscala/runtime/Nothing$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
