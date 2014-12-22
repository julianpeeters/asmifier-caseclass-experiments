
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lscala/runtime/Nothing$;Lscala/collection/immutable/List;)V", "(Lscala/runtime/Nothing$;Lscala/collection/immutable/List<Lscala/collection/immutable/List<Lscala/collection/immutable/List<Ljava/lang/Object;>;>;>;)V", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "w", "Lscala/runtime/Nothing$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 2);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Lscala/collection/immutable/List;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 3);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
