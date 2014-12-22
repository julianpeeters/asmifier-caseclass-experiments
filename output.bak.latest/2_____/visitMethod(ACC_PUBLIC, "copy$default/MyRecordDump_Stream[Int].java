
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()Lscala/collection/immutable/Stream;", "()Lscala/collection/immutable/Stream<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "z", "()Lscala/collection/immutable/Stream;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
