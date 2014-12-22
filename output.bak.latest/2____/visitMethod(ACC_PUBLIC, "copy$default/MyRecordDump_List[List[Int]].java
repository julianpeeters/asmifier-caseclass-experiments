
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()Lscala/collection/immutable/List;", "()Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lscala/collection/immutable/List;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
