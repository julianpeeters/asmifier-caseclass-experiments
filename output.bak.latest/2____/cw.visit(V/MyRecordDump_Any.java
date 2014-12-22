[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 9:50:58 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 22 s, completed Sep 5, 2013 9:51:25 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001x+\u0005)\u0002CA\u0004\u0017\u0013\u00099\u0002BA\u0004O_RD\u0017N\\4\u0009\u0011e\u0001!\u0011#Q\u0001\nU\u0009!a\u001e\u0011\u0009\u0011m\u0001!Q3A\u0005\u0002q\u0009\u0011\u0001_\u000b\u0002;A\u0011qAH\u0005\u0003?!\u00111!\u00118z\u0011!\u0009\u0003A!E!\u0002\u0013i\u0012A\u0001=!\u0011\u0015\u0019\u0003\u0001\"\u0001%\u0003\u0019a\u0014N\\5u}Q\u0019Qe\n\u0015\u0011\u0005\u0019\u0002Q\"\u0001\u0002\u0009\u000bM\u0011\u0003\u0019A\u000b\u0009\u000bm\u0011\u0003\u0019A\u000f\u0009\u000f)\u0002\u0011\u0011!C\u0001W\u0005!1m\u001c9z)\r)C&\u000c\u0005\u0008'%\u0002\n\u00111\u0001\u0016\u0011\u001dY\u0012\u0006%AA\u0002uAqa\u000c\u0001\u0012\u0002\u0013\u0005\u0001'\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003ER#!\u0006\u001a,\u0003M\u0002\"\u0001N\u001d\u000e\u0003UR!AN\u001c\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001d\u0009\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003uU\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u001da\u0004!%A\u0005\u0002u\nabY8qs\u0012\"WMZ1vYR$#'F\u0001?U\u0009i\"\u0007C\u0004A\u0001\u0005\u0005I\u0011I!\u0002\u001bA\u0014x\u000eZ;diB\u0013XMZ5y+\u0005\u0011\u0005CA\"I\u001b\u0005!%BA#G\u0003\u0011a\u0017M\\4\u000b\u0003\u001d\u000bAA[1wC&\u0011\u0011\n\u0012\u0002\u0007'R\u0014\u0018N\\4\u0009\u000f-\u0003\u0011\u0011!C\u0001\u0019\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009Q\n\u0005\u0002\u0008\u001d&\u0011q\n\u0003\u0002\u0004\u0013:$\u0008bB)\u0001\u0003\u0003%\u0009AU\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009i2\u000bC\u0004U!\u0006\u0005\u0009\u0019A'\u0002\u0007a$\u0013\u0007C\u0004W\u0001\u0005\u0005I\u0011I,\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012\u0001\u0017\u0009\u00043rkR\"\u0001.\u000b\u0005mC\u0011AC2pY2,7\r^5p]&\u0011QL\u0017\u0002\u0009\u0013R,'/\u0019;pe\"9q\u000cAA\u0001\n\u0003\u0001\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005\u0005$\u0007CA\u0004c\u0013\u0009\u0019\u0007BA\u0004C_>dW-\u00198\u0009\u000fQs\u0016\u0011!a\u0001;!9a\rAA\u0001\n\u0003:\u0017\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u00035Cq!\u001b\u0001\u0002\u0002\u0013\u0005#.\u0001\u0005u_N#(/\u001b8h)\u0005\u0011\u0005b\u00027\u0001\u0003\u0003%\u0009%\\\u0001\u0007KF,\u0018\r\\:\u0015\u0005\u0005t\u0007b\u0002+l\u0003\u0003\u0005\r!H\u0004\u0008a\n\u0009\u0009\u0011#\u0001r\u0003!i\u0015PU3d_J$\u0007C\u0001\u0014s\r\u001d\u0009!!!A\u0009\u0002M\u001c2A\u001d;\u0010!\u0015)\u00080F\u000f&\u001b\u00051(BA<\u0009\u0003\u001d\u0011XO\u001c;j[\u0016L!!\u001f<\u0003#\u0005\u00137\u000f\u001e:bGR4UO\\2uS>t'\u0007C\u0003$e\u0012\u00051\u0010F\u0001r\u0011\u001dI'/!A\u0005F)DqA :\u0002\u0002\u0013\u0005u0A\u0003baBd\u0017\u0010F\u0003&\u0003\u0003\u0009\u0019\u0001C\u0003\u0014{\u0002\u0007Q\u0003C\u0003\u001c{\u0002\u0007Q\u0004C\u0005\u0002\u0008I\u000c\u0009\u0011\"!\u0002\n\u00059QO\\1qa2LH\u0003BA\u0006\u0003/\u0001RaBA\u0007\u0003#I1!a\u0004\u0009\u0005\u0019y\u0005\u000f^5p]B)q!a\u0005\u0016;%\u0019\u0011Q\u0003\u0005\u0003\rQ+\u0008\u000f\\33\u0011\u001d\u0009I\"!\u0002A\u0002\u0015\n1\u0001\u001f\u00131\u0011%\u0009iB]A\u0001\n\u0013\u0009y\"A\u0006sK\u0006$'+Z:pYZ,GCAA\u0011!\r\u0019\u00151E\u0005\u0004\u0003K!%AB(cU\u0016\u001cG\u000f");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "w", "Lscala/runtime/Nothing$;", null, null);
fv.visitEnd();
