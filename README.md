asmifier-caseclass-experiments
==============================

Running the ASMifier on a variety of case classes in order to inspect the dump output for differences, and deduce rules for arbitrarily adding value members to a dynamic class definition. Towards the goal of defining Scala case classes based on data from files or "off the wire".





 // These steps were deduced "by eye" using the above strategy, running the ASMifier on the class's .class file, as well as the MODULE$'s .class file.

****Creation of table 1 and table 2 (tables of the steps for generating arbitary scala case classes with ASM's visitor API):
create the bytecode-generating code by deleting any existing .class files, updating the case class with a value member of a different type(manually), then running the ASMifier on the new .class files
`rm -r target/ && sbt run && java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/MyRecord.class>dump/MyRecord_anyref.java`

`rm -r target/ && sbt run && java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/MyRecord\$.class>dump/MyRecordMODULE_anyref.java`

As per recommendation of objectWEB, `diff` was used to compare the output of the ASMifier. Differences were seen to be restricted to visitor blocks (the steps of building a class with the visitor API), in a modular way, with some steps being modified, and others added or deleted.If removing a visitor step broke my ability to instatiate the class dynamically, then the step was said to be required.



****Creation of table 3:  ****
Further dissection of the ASMified code requires a finer look at how each step differs given different numbers of fields and their types.

An awk command was used to split the dump files into their component steps (split at each new visit).
`mkdir destinationDir`
`awk '{print $0 "}{"> "destinationDir/" FILENAME NR}' RS='}\\n{' *`

Bash script to group files by the methods they describe.
`mkdir destinationDir`
`find . -type f -exec grep -il 'RegEx' {} \; -exec sh -c 'mv -i "$@" "$0"' destinationDir {} +`
`find . -name "*.java" -exec rm -f {} \;`

Now we can more easily compare the differences between various case classes at each step in the dynamic class definition.


"Each slot in the local variables and operand stack parts can hold any Java
value, except long and double values. These values require two slots."-ASM 4.0 users guide


------------------------------

Results: Deduced steps for generating arbitary scala case classes with ASM's visitor API:

  Legend: 
    V - Steps for which there exists _variation_ between case class ASMifier outputs, depending on the type of the field
    R - Steps that are _required for instantiation_ (a bare minimum of "functionality")
    F - Steps that are necessary for the addition of _fields_ (i.e. value members)
    G - Steps that for which there exists variation between case class ASMifier outputs, depending on if a class is generic

    a - Steps for classes that have 1 value member
    b - Steps for classes that have >1 value member
    
  Steps found in class dumps
        VR    1. Visit class     
        V     2. Visit ScalaSig annotation
          FG  3. Visit fields
        V FG  4. a. Visit method `andThen`
          F      b. Visit method `tupled`
        V FG  5. a. Visit method `compose`             //TODO 
          F      b. 1. Visit method `curry`
          F         2. Visit Method `curried`         
         R    6. Visit method `productIterator`
              7. Visit method `productElements`
          FG  8. Visit methods for fields
          F   9. Visit method `copy`
          F  10. Visit methods `copy$default$_`
             11. Visit method `hashCode`
         R   12. Visit method `toString`
        V    13. Visit method `equals`
         R   14. Visit method `productPrefix`
        VR   15. Visit method `productArity`
        VR   16. Visit method `productElement`
             17. Visit method `canEqual`
          F  18. Visit method `gd1$1`
        VR G 19. Visit method `<init>`

  Steps found in module dumps:

*Step 1: visit Class*

*Step 2: visit scalaSig*
=====================================================begin section of field-specific steps
*Step 3: visitField*
**Site of Variation:**
`{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "__typeDescriptor__", __expandedTypeDescriptor__, null);
fv.visitEnd();
}`

**Tables of Variation**
__typeDescriptor__
Data Type	Description
Byte	B				null
Short	S				null
Int	I				null
Long	J				null
Float	S				null
Double	D				null
Char	C				null
String	Ljava/lang/String;		null
Boolean	Z				null
Unit	*no visitField section exists	null
Null	Lscala/runtime/Null$;		null
Nothing	Lscala/runtime/Nothing$;	null
Any	Ljava/lang/Object;		null
AnyRef	Ljava/lang/Object;		null
//Non-primitive datatypes
generic[]	Ljava/lang/Object;>; *	expanded type descriptor

*with an extra >; for each level of nesting



*Step 4a: andThen*
**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<LMyRecord;TA;>;)Lscala/Function1<______TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;


*Step 4b: tupled - *
**Site of Variation:**
`{

}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;


*Step 5a: compose*
**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "compose", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<TA;_______>;)Lscala/Function1<TA;LMyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord$", "compose", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;


*Step 5b1: curry*
**Site of Variation:**
`{

}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;

*Step 5b2: curried*
**Site of Variation:**
`{

}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;
================================================================end field-specific steps

*Step 6: productIterator*
No variation

*Step 7: productElements*
No variation


===================================================begin more fields specific steps
*Step 8: fieldMethods*
**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC, "x", "___________", null, null);
mv.visitCode();
___________________________________________________begin field specific sub-steps



___________________________________________________end field-specific sub-steps
mv.visitInsn(__loadInstruction__);
mv.visitMaxs(_, _); 
mv.visitEnd();
}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;

*Step 9: copy*
**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(__typeDescriptor__)__class typeDescriptor__", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(__loadInstruction__, 1);
mv.visitMethodInsn(INVOKESPECIAL, "__class name__", "<init>", "(__typeDescriptor__)V");
mv.visitInsn(__returnInstruction__);
mv.visitMaxs(_, _);
mv.visitEnd();
}`

**Table of Variation** //incomplete in this presentation due to ease of filling in the rest of the table by oneself
Byte	B
Short	S
Int	I
Long	J
Float	S
Double	D
Char	C
String	Ljava/lang/String;
Boolean	Z
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;


*Step 10: copy$default*
**Sites of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()__typeDescriptor__", null, null);
mv.visitCode();
mv.visitVarInsn(__loadInstruction__, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()__typeDescriptor__");
mv.visitInsn(__returnInstruction__);
mv.visitMaxs(_, _);
mv.visitEnd();
}`

**Table of Variation**
Data Type	Description
Byte	B
Short	S
Int	I
Long	J
Float	S
Double	D
Char	C
String	Ljava/lang/String;
Boolean	Z
Unit	V
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;

===============================================end fields specific steps
*Step 11: hashCode*
**Site of Variation:**
No Variation


*Step 12: toString*
No Variation


*Step 13: equals*
_________________________________________________________________________________________________
**Site of Variation:**
`{

}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;

*Step 14: productPrefix*
No variation


*Step 15: productArity*

**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC, "productArity", "()I", null, null);
mv.visitCode();
mv.visitInsn(__ICONST_#__);
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}`

**Table of Variation**
The value of ICONST_# depends on the number of fields in the class

*Step 16: productElement*
**Site of Variation:**
mv = cw.visitMethod(ACC_PUBLIC, "productElement", "(I)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ISTORE, 2);
___________________________________________________begin field specific sub-steps


--------------------------------------------------------------------------------------
___________________________________________________end field-specific sub-steps
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
___________________________________________________begin field specific sub-steps

--------------------------------------------------------------------------------------

___________________________________________________end field-specific sub-steps
mv.visitMaxs(3, 3);
mv.visitEnd();

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;

*Step 17: canEqual*
No variation


===================================================begin more fields specific steps
*Step 18: gd1$1*
**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(Lscala/runtime/Nothing$;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(__loadInstruction__, 1);


___________________________________________________begin field specific sub-steps
mv.visitInsn(ATHROW);//Nothing
--------


___________________________________________________end field-specific sub-steps

mv.visitInsn(ATHROW);





mv.visitMaxs(1, 3);
mv.visitEnd();
}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;
===============================================end fields specific steps


*Step 19: <init>*
**Site of Variation:**
`{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(__empty, or the objects below__)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
___________________________________________________begin field specific sub-steps


--------------------------------------------------------------------------------------
___________________________________________________end field-specific sub-steps
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(_, _);
mv.visitEnd();
}`

**Table of Variation**
Data Type	Description
Byte	Ljava/lang/Object;
Short	Ljava/lang/Object;
Int	Ljava/lang/Object;
Long	Ljava/lang/Object;
Float	Ljava/lang/Object;
Double	Ljava/lang/Object;
Char	Ljava/lang/Object;
String	Ljava/lang/String;
Boolean	Ljava/lang/Object;
Unit	Lscala/runtime/BoxedUnit;
Null	Lscala/runtime/Null$;
Nothing	Lscala/runtime/Nothing$;
Any	Ljava/lang/Object;
AnyRef	Ljava/lang/Object;
