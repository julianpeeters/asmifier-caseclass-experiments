
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Lscala/Option;", "()Lscala/Option<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/Option;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
