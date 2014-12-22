
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/collection/immutable/List;B)Lmodels/MyRecord;", "(Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;B)Lmodels/MyRecord;", null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/collection/immutable/List;B)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
