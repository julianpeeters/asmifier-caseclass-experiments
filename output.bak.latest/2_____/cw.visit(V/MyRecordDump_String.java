[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 5, 2013 11:23:40 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 30 s, completed Sep 5, 2013 11:24:16 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u0015c\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001a\u001d\u00099q#\u0003\u0002\u0019\u0011\u00051\u0001K]3eK\u001aL!AG\u000e\u0003\rM#(/\u001b8h\u0015\u0009A\u0002\u0002\u0003\u0005\u001e\u0001\u0009E\u0009\u0015!\u0003\u0016\u0003\u0009A\u0008\u0005\u0003\u0005 \u0001\u0009U\r\u0011\"\u0001!\u0003\u0005IX#A\u0011\u0011\u0005\u001d\u0011\u0013BA\u0012\u0009\u0005\u001dqu\u000e\u001e5j]\u001eD\u0001\"\n\u0001\u0003\u0012\u0003\u0006I!I\u0001\u0003s\u0002B\u0001b\n\u0001\u0003\u0016\u0004%\u0009\u0001F\u0001\u0002u\"A\u0011\u0006\u0001B\u0009B\u0003%Q#\u0001\u0002{A!)1\u0006\u0001C\u0001Y\u00051A(\u001b8jiz\"B!L\u00181cA\u0011a\u0006A\u0007\u0002\u0005!)1C\u000ba\u0001+!)qD\u000ba\u0001C!)qE\u000ba\u0001+!91\u0007AA\u0001\n\u0003!\u0014\u0001B2paf$B!L\u001b7o!91C\rI\u0001\u0002\u0004)\u0002bB\u00103!\u0003\u0005\r!\u0009\u0005\u0008OI\u0002\n\u00111\u0001\u0016\u0011\u001dI\u0004!%A\u0005\u0002i\nabY8qs\u0012\"WMZ1vYR$\u0013'F\u0001<U\u0009)BhK\u0001>!\u0009q4)D\u0001@\u0015\u0009\u0001\u0015)A\u0005v]\u000eDWmY6fI*\u0011!\u0009C\u0001\u000bC:tw\u000e^1uS>t\u0017B\u0001#@\u0005E)hn\u00195fG.,GMV1sS\u0006t7-\u001a\u0005\u0008\r\u0002\u0009\n\u0011\"\u0001H\u00039\u0019w\u000e]=%I\u00164\u0017-\u001e7uII*\u0012\u0001\u0013\u0016\u0003CqBqA\u0013\u0001\u0012\u0002\u0013\u0005!(\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u001a\u0009\u000f1\u0003\u0011\u0011!C!\u001b\u0006i\u0001O]8ek\u000e$\u0008K]3gSb,\u0012A\u0014\u0009\u0003\u001fRk\u0011\u0001\u0015\u0006\u0003#J\u000bA\u0001\\1oO*\u00091+\u0001\u0003kCZ\u000c\u0017B\u0001\u000eQ\u0011\u001d1\u0006!!A\u0005\u0002]\u000bA\u0002\u001d:pIV\u001cG/\u0011:jif,\u0012\u0001\u0017\u0009\u0003\u000feK!A\u0017\u0005\u0003\u0007%sG\u000fC\u0004]\u0001\u0005\u0005I\u0011A/\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011a,\u0019\u0009\u0003\u000f}K!\u0001\u0019\u0005\u0003\u0007\u0005s\u0017\u0010C\u0004c7\u0006\u0005\u0009\u0019\u0001-\u0002\u0007a$\u0013\u0007C\u0004e\u0001\u0005\u0005I\u0011I3\u0002\u001fA\u0014x\u000eZ;di&#XM]1u_J,\u0012A\u001a\u0009\u0004O*tV\"\u00015\u000b\u0005%D\u0011AC2pY2,7\r^5p]&\u00111\u000e\u001b\u0002\u0009\u0013R,'/\u0019;pe\"9Q\u000eAA\u0001\n\u0003q\u0017\u0001C2b]\u0016\u000bX/\u00197\u0015\u0005=\u0014\u0008CA\u0004q\u0013\u0009\u0009\u0008BA\u0004C_>dW-\u00198\u0009\u000f\u0009d\u0017\u0011!a\u0001=\"9A\u000fAA\u0001\n\u0003*\u0018\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003aCqa\u001e\u0001\u0002\u0002\u0013\u0005\u00030\u0001\u0005u_N#(/\u001b8h)\u0005q\u0005b\u0002>\u0001\u0003\u0003%\u0009e_\u0001\u0007KF,\u0018\r\\:\u0015\u0005=d\u0008b\u00022z\u0003\u0003\u0005\rAX\u0004\u0008}\n\u0009\u0009\u0011#\u0001\u0000\u0003!i\u0015PU3d_J$\u0007c\u0001\u0018\u0002\u0002\u0019A\u0011AAA\u0001\u0012\u0003\u0009\u0019aE\u0003\u0002\u0002\u0005\u0015q\u0002\u0005\u0005\u0002\u0008\u00055Q#I\u000b.\u001b\u0009\u0009IAC\u0002\u0002\u000c!\u0009qA];oi&lW-\u0003\u0003\u0002\u0010\u0005%!!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8og!91&!\u0001\u0005\u0002\u0005MA#A@\u0009\u0011]\u000c\u0009!!A\u0005FaD!\"!\u0007\u0002\u0002\u0005\u0005I\u0011QA\u000e\u0003\u0015\u0009\u0007\u000f\u001d7z)\u001di\u0013QDA\u0010\u0003CAaaEA\u000c\u0001\u0004)\u0002BB\u0010\u0002\u0018\u0001\u0007\u0011\u0005\u0003\u0004(\u0003/\u0001\r!\u0006\u0005\u000b\u0003K\u0009\u0009!!A\u0005\u0002\u0006\u001d\u0012aB;oCB\u0004H.\u001f\u000b\u0005\u0003S\u0009)\u0004E\u0003\u0008\u0003W\u0009y#C\u0002\u0002.!\u0011aa\u00149uS>t\u0007CB\u0004\u00022U\u0009S#C\u0002\u00024!\u0011a\u0001V;qY\u0016\u001c\u0004bBA\u001c\u0003G\u0001\r!L\u0001\u0004q\u0012\u0002\u0004BCA\u001e\u0003\u0003\u0009\u0009\u0011\"\u0003\u0002>\u0005Y!/Z1e%\u0016\u001cx\u000e\u001c<f)\u0009\u0009y\u0004E\u0002P\u0003\u0003J1!a\u0011Q\u0005\u0019y%M[3di\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
