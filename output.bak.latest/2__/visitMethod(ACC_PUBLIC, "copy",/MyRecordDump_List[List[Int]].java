
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/collection/immutable/List;Lscala/runtime/Nothing$;)Lmodels/MyRecord;", "(Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;Lscala/runtime/Nothing$;)Lmodels/MyRecord;", null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/collection/immutable/List;Lscala/runtime/Nothing$;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
