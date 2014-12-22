[0m[[0minfo[0m] [0mLoading global plugins from /home/julianpeeters/.sbt/plugins[0m
[0m[[0minfo[0m] [0mSet current project to asmifier-caseclass-experiments (in build file:/home/julianpeeters/asmifier-caseclass-experiments/)[0m
[0m[[32msuccess[0m] [0mTotal time: 0 s, completed Sep 3, 2013 10:04:13 PM[0m
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
[0m[[32msuccess[0m] [0mTotal time: 24 s, completed Sep 3, 2013 10:04:43 PM[0m
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
av0.visit("bytes", "\u0006\u0001\u0005\u001db\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001a\u0005\u0003\u0001\r1y\u0001CA\u0004\u000b\u001b\u0005A!\"A\u0005\u0002\u000bM\u001c\u0017\r\\1\n\u0005-A!AB!osJ+g\r\u0005\u0002\u0008\u001b%\u0011a\u0002\u0003\u0002\u0008!J|G-^2u!\u00099\u0001#\u0003\u0002\u0012\u0011\u0009a1+\u001a:jC2L'0\u00192mK\"A1\u0003\u0001BK\u0002\u0013\u0005A#A\u0001y+\u0005)\u0002C\u0001\u000c\u001c\u001b\u00059\"B\u0001\r\u001a\u0003\u0011a\u0017M\\4\u000b\u0003i\u0009AA[1wC&\u0011Ad\u0006\u0002\u0007\u001f\nTWm\u0019;\u0009\u0011y\u0001!\u0011#Q\u0001\nU\u0009!\u0001\u001f\u0011\u0009\u0011\u0001\u0002!Q3A\u0005\u0002\u0005\n\u0011!_\u000b\u0002EA\u0011qaI\u0005\u0003I!\u0011AAQ=uK\"Aa\u0005\u0001B\u0009B\u0003%!%\u0001\u0002zA!)\u0001\u0006\u0001C\u0001S\u00051A(\u001b8jiz\"2A\u000b\u0017.!\u0009Y\u0003!D\u0001\u0003\u0011\u0015\u0019r\u00051\u0001\u0016\u0011\u0015\u0001s\u00051\u0001#\u0011\u001dy\u0003!!A\u0005\u0002A\nAaY8qsR\u0019!&\r\u001a\u0009\u000fMq\u0003\u0013!a\u0001+!9\u0001E\u000cI\u0001\u0002\u0004\u0011\u0003b\u0002\u001b\u0001#\u0003%\u0009!N\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u00051$FA\u000b8W\u0005A\u0004CA\u001d?\u001b\u0005Q$BA\u001e=\u0003%)hn\u00195fG.,GM\u0003\u0002>\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005}R$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0011\u0009AI\u0001\n\u0003\u0011\u0015AD2paf$C-\u001a4bk2$HEM\u000b\u0002\u0007*\u0012!e\u000e\u0005\u0008\u000b\u0002\u0009\u0009\u0011\"\u0011G\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009q\u0009\u0005\u0002\u0017\u0011&\u0011\u0011j\u0006\u0002\u0007'R\u0014\u0018N\\4\u0009\u000f-\u0003\u0011\u0011!C\u0001\u0019\u0006a\u0001O]8ek\u000e$\u0018I]5usV\u0009Q\n\u0005\u0002\u0008\u001d&\u0011q\n\u0003\u0002\u0004\u0013:$\u0008bB)\u0001\u0003\u0003%\u0009AU\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009\u0019f\u000b\u0005\u0002\u0008)&\u0011Q\u000b\u0003\u0002\u0004\u0003:L\u0008bB,Q\u0003\u0003\u0005\r!T\u0001\u0004q\u0012\n\u0004bB-\u0001\u0003\u0003%\u0009EW\u0001\u0010aJ|G-^2u\u0013R,'/\u0019;peV\u00091\u000cE\u0002]?Nk\u0011!\u0018\u0006\u0003=\"\u0009!bY8mY\u0016\u001cG/[8o\u0013\u0009\u0001WL\u0001\u0005Ji\u0016\u0014\u0018\r^8s\u0011\u001d\u0011\u0007!!A\u0005\u0002\r\u000c\u0001bY1o\u000bF,\u0018\r\u001c\u000b\u0003I\u001e\u0004\"aB3\n\u0005\u0019D!a\u0002\"p_2,\u0017M\u001c\u0005\u0008/\u0006\u000c\u0009\u00111\u0001T\u0011\u001dI\u0007!!A\u0005B)\u000c\u0001\u0002[1tQ\u000e{G-\u001a\u000b\u0002\u001b\"9A\u000eAA\u0001\n\u0003j\u0017\u0001\u0003;p'R\u0014\u0018N\\4\u0015\u0003\u001dCqa\u001c\u0001\u0002\u0002\u0013\u0005\u0003/\u0001\u0004fcV\u000cGn\u001d\u000b\u0003IFDqa\u00168\u0002\u0002\u0003\u00071kB\u0004t\u0005\u0005\u0005\u0009\u0012\u0001;\u0002\u00115K(+Z2pe\u0012\u0004\"aK;\u0007\u000f\u0005\u0011\u0011\u0011!E\u0001mN\u0019Qo^\u0008\u0011\u000ba\\XC\u0009\u0016\u000e\u0003eT!A\u001f\u0005\u0002\u000fI,h\u000e^5nK&\u0011A0\u001f\u0002\u0012\u0003\n\u001cHO]1di\u001a+hn\u0019;j_:\u0014\u0004\"\u0002\u0015v\u0009\u0003qH#\u0001;\u0009\u000f1,\u0018\u0011!C#[\"I\u00111A;\u0002\u0002\u0013\u0005\u0015QA\u0001\u0006CB\u0004H.\u001f\u000b\u0006U\u0005\u001d\u0011\u0011\u0002\u0005\u0007'\u0005\u0005\u0001\u0019A\u000b\u0009\r\u0001\n\u0009\u00011\u0001#\u0011%\u0009i!^A\u0001\n\u0003\u000by!A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0009\u0005E\u0011Q\u0004\u0009\u0006\u000f\u0005M\u0011qC\u0005\u0004\u0003+A!AB(qi&|g\u000eE\u0003\u0008\u00033)\"%C\u0002\u0002\u001c!\u0011a\u0001V;qY\u0016\u0014\u0004bBA\u0010\u0003\u0017\u0001\rAK\u0001\u0004q\u0012\u0002\u0004\"CA\u0012k\u0006\u0005I\u0011BA\u0013\u0003-\u0011X-\u00193SKN|GN^3\u0015\u0003U\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/Object;", null, null);
fv.visitEnd();
