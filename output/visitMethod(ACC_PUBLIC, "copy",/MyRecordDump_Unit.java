visitMethod(ACC_PUBLIC, "copy", "(Lscala/runtime/BoxedUnit;)LMyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "<init>", "(Lscala/runtime/BoxedUnit;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv