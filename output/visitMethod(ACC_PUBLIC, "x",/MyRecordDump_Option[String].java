
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Lscala/Option;", "()Lscala/Option<Ljava/lang/String;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "MyRecord", "x", "Lscala/Option;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
