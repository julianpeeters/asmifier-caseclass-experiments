
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(DLscala/runtime/Nothing$;D)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(DLOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "D");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 3);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Lscala/runtime/Nothing$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(DLOAD, 4);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "z", "D");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(3, 6);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
