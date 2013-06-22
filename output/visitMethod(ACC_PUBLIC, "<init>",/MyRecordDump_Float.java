visitMethod(ACC_PUBLIC, "<init>", "(F)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(FLOAD, 1);
mv.visitFieldInsn(PUTFIELD, "MyRecord", "x", "F");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
