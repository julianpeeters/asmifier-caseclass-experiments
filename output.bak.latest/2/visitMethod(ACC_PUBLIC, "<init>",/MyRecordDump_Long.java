
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(JLjava/lang/String;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(LLOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "J");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 3);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(3, 4);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
