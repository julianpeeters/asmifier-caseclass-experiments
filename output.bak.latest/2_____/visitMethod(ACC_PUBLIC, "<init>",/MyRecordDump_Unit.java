
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lscala/runtime/BoxedUnit;Lscala/runtime/Nothing$;Lscala/runtime/BoxedUnit;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "y", "Lscala/runtime/Nothing$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 4);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
