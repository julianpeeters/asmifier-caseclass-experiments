[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 2, 2013 9:29:39 PM[0m
[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[0minfo[0m] [0mUpdating {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6...[0m
[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-library;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.avro#avro;1.7.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-core-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.codehaus.jackson#jackson-mapper-asl;1.8.8 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.3 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.xerial.snappy#snappy-java;1.0.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.apache.commons#commons-compress;1.4.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.tukaani#xz;1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.6.4 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-util_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-api;1.7.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scalap;2.10.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-compiler;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.scala-lang#scala-reflect;2.10.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.novus#salat-core_2.10;1.9.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-core_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-commons_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.github.nscala-time#nscala-time_2.10;0.2.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving joda-time#joda-time;2.1 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.joda#joda-convert;1.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#mongo-java-driver;2.11.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.mongodb#casbah-query_2.10;2.6.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-native_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-core_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.json4s#json4s-ast_2.10;3.1.0 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving com.thoughtworks.paranamer#paranamer;2.5.2 ...[0m
M[2K[0m[[0minfo[0m] [0mResolving org.slf4j#slf4j-simple;1.6.4 ...[0m
[0m[[0minfo[0m] [0mDone updating.[0m
[0m[[33mwarn[0m] [0mPotentially incompatible versions of dependencies of {file:/home/julianpeeters/asmifier-caseclass-experiments/}default-22f0e6:[0m
[0m[[33mwarn[0m] [0m   org.scala-lang: 2.10.2, 2.10.0[0m
[0m[[0minfo[0m] [0mCompiling 4 Scala sources to /home/julianpeeters/asmifier-caseclass-experiments/target/scala-2.10/classes...[0m
[0m[[33mwarn[0m] [0mthere were 6 deprecation warning(s); re-run with -deprecation for details[0m
[0m[[33mwarn[0m] [0mthere were 1 feature warning(s); re-run with -feature for details[0m
[0m[[33mwarn[0m] [0mtwo warnings found[0m
[0m[[32msuccess[0m] [0mTotal time: 21 s, completed Sep 2, 2013 9:30:05 PM[0m
package asm.models;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.attrs.*;
public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "models/MyRecord", null, "java/lang/Object", new String[] { "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\u0005=a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001a\u001d\u00099q#\u0003\u0002\u0019\u0011\u00051\u0001K]3eK\u001aL!AG\u000e\u0003\rM#(/\u001b8h\u0015\u0009A\u0002\u0002\u0003\u0005\u001e\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005C\u0003 \u0001\u0011\u0005\u0001%\u0001\u0004=S:LGO\u0010\u000b\u0003C\r\u0002\"A\u0009\u0001\u000e\u0003\u0009AQa\u0005\u0010A\u0002UAq!\n\u0001\u0002\u0002\u0013\u0005a%\u0001\u0003d_BLHCA\u0011(\u0011\u001d\u0019B\u0005%AA\u0002UAq!\u000b\u0001\u0012\u0002\u0013\u0005!&\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003-R#!\u0006\u0017,\u00035\u0002\"AL\u001a\u000e\u0003=R!\u0001M\u0019\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001a\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003i=\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001d1\u0004!!A\u0005B]\nQ\u0002\u001d:pIV\u001cG\u000f\u0015:fM&DX#\u0001\u001d\u0011\u0005erT\"\u0001\u001e\u000b\u0005mb\u0014\u0001\u00027b]\u001eT\u0011!P\u0001\u0005U\u00064\u0018-\u0003\u0002\u001bu!9\u0001\u0009AA\u0001\n\u0003\u0009\u0015\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001\"\u0011\u0005\u001d\u0019\u0015B\u0001#\u0009\u0005\rIe\u000e\u001e\u0005\u0008\r\u0002\u0009\u0009\u0011\"\u0001H\u00039\u0001(o\u001c3vGR,E.Z7f]R$\"\u0001S&\u0011\u0005\u001dI\u0015B\u0001&\u0009\u0005\r\u0009e.\u001f\u0005\u0008\u0019\u0016\u000b\u0009\u00111\u0001C\u0003\rAH%\r\u0005\u0008\u001d\u0002\u0009\u0009\u0011\"\u0011P\u0003=\u0001(o\u001c3vGRLE/\u001a:bi>\u0014X#\u0001)\u0011\u0007E#\u0006*D\u0001S\u0015\u0009\u0019\u0006\"\u0001\u0006d_2dWm\u0019;j_:L!!\u0016*\u0003\u0011%#XM]1u_JDqa\u0016\u0001\u0002\u0002\u0013\u0005\u0001,\u0001\u0005dC:,\u0015/^1m)\u0009IF\u000c\u0005\u0002\u00085&\u00111\u000c\u0003\u0002\u0008\u0005>|G.Z1o\u0011\u001dae+!AA\u0002!CqA\u0018\u0001\u0002\u0002\u0013\u0005s,\u0001\u0005iCND7i\u001c3f)\u0005\u0011\u0005bB1\u0001\u0003\u0003%\u0009EY\u0001\u0009i>\u001cFO]5oOR\u0009\u0001\u0008C\u0004e\u0001\u0005\u0005I\u0011I3\u0002\r\u0015\u000cX/\u00197t)\u0009If\rC\u0004MG\u0006\u0005\u0009\u0019\u0001%\u0008\u000f!\u0014\u0011\u0011!E\u0001S\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002#U\u001a9\u0011AAA\u0001\u0012\u0003Y7c\u00016m\u001fA!Q\u000e]\u000b\"\u001b\u0005q'BA8\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!!\u001d8\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t\u0017\u0007C\u0003 U\u0012\u00051\u000fF\u0001j\u0011\u001d\u0009'.!A\u0005F\u0009DqA\u001e6\u0002\u0002\u0013\u0005u/A\u0003baBd\u0017\u0010\u0006\u0002\"q\")1#\u001ea\u0001+!9!P[A\u0001\n\u0003[\u0018aB;oCB\u0004H.\u001f\u000b\u0003y~\u00042aB?\u0016\u0013\u0009q\u0008B\u0001\u0004PaRLwN\u001c\u0005\u0007\u0003\u0003I\u0008\u0019A\u0011\u0002\u0007a$\u0003\u0007C\u0005\u0002\u0006)\u000c\u0009\u0011\"\u0003\u0002\u0008\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009I\u0001E\u0002:\u0003\u0017I1!!\u0004;\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
