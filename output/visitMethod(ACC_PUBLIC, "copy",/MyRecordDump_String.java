visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;)LMyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv