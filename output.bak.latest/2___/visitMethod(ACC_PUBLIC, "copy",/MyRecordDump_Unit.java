
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lscala/runtime/BoxedUnit;B)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lscala/runtime/BoxedUnit;B)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(4, 3);
mv.visitEnd();
