
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Lscala/collection/immutable/Stream;", "()Lscala/collection/immutable/Stream<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Lscala/collection/immutable/Stream;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
