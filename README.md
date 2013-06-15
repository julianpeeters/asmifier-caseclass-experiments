asmifier-caseclass-experiments
==============================

Running the ASMifier on a variety of case classes in order to inspect the dump output for differences, and deduce rules for arbitrarily adding value members to a dynamic class definition. Towards the goal of defining Scala case classes based on data from files or "off the wire".





 // These steps were deduced "by eye" using the above strategy, running the ASMifier on the class's .class file, as well as the MODULE$'s .class file.





An awk command was used to split the dump files into their component steps (split at each new visit).
`awk '{print $0 "}{"> FILENAME NR}' RS='}\\n{' *`

Bash script to group files by the methods they describe.
`mkdir destinationDir`
`find . -type f -exec grep -il 'RegEx' {} \; -exec sh -c 'mv -i "$@" "$0"' destinationDir {} +`

Now we can more easily compare the differences between various case classes at each step in the dynamic class definition.

------------------------------

Results: Deduced steps for generating arbitary scala case classes with ASM's visitor API:

  Legend: 
    V - Steps for which there exists _variation_ between case class ASMifier outputs
    R - Steps that are _required for instantiation_ (a bare minimum of "functionality")
    F - Steps that are necessary for the addition of _fields_ (i.e. value members)
    
  class dumps:
         R   1. Visit class     
        V    2. Visit ScalaSig annotation
          F  3. Visit fields
          F  4. Visit method `andThen`
          F  5. Visit method `compose`
         R   6. Visit method `productIterator`
             7. Visit method `productElements`
          F  8. Visit methods for fields
          F  9. Visit method `copy`
          F 10. Visit methods `copy$default$_`
            11. Visit method `hashCode`
         R  12. Visit method `toString`
        V   13. Visit method `equals`
         R  14. Visit method `productPrefix`
        VR  15. Visit method `productArity`
        VR  16. Visit method `productElement`
            17. Visit method `canEqual`
          F 18. Visit method `gd1$1`
        VR  19. Visit method `<init>`

  module dumps:
