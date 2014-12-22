
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/collection/immutable/Stream;Lscala/runtime/Nothing$;Lscala/collection/immutable/Stream;)Lmodels/MyRecord;", "(Lscala/collection/immutable/Stream<Ljava/lang/Object;>;Lscala/runtime/Nothing$;Lscala/collection/immutable/Stream<Ljava/lang/Object;>;)Lmodels/MyRecord;", null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/collection/immutable/Stream;Lscala/runtime/Nothing$;Lscala/collection/immutable/Stream;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
