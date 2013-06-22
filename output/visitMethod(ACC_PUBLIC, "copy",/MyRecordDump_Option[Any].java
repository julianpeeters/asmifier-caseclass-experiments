visitMethod(ACC_PUBLIC, "copy", "(Lscala/Option;)LMyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "<init>", "(Lscala/Option;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv