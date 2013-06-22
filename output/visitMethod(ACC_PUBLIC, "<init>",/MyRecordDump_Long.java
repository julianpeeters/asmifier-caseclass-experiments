visitMethod(ACC_PUBLIC, "<init>", "(J)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(LLOAD, 1);
mv.visitFieldInsn(PUTFIELD, "MyRecord", "x", "J");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
