
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()Lscala/Option;", "()Lscala/Option<Ljava/lang/String;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/Option;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
