
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lscala/runtime/BoxedUnit;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 2);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
