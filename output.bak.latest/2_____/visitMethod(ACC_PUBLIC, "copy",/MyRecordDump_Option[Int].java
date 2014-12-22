
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/Option;Lscala/runtime/Nothing$;Lscala/Option;)Lmodels/MyRecord;", "(Lscala/Option<Ljava/lang/Object;>;Lscala/runtime/Nothing$;Lscala/Option<Ljava/lang/Object;>;)Lmodels/MyRecord;", null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 2);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/Option;Lscala/runtime/Nothing$;Lscala/Option;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
