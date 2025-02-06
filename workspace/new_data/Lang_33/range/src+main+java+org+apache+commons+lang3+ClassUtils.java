{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/ClassUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 1052,
      "comment": "\n * \u003cp\u003eOperates on classes without using reflection.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles invalid \u003ccode\u003enull\u003c/code\u003e inputs as best it can.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * \u003cp\u003eThe notion of a \u003ccode\u003ecanonical name\u003c/code\u003e includes the human\n * readable name for the type, for example \u003ccode\u003eint[]\u003c/code\u003e. The\n * non-canonical method variants work with the JVM names, such as\n * \u003ccode\u003e[I\u003c/code\u003e. \u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Norm Deane\n * @author Alban Peignier\n * @author Tomasz Blachowicz\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR_CHAR"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * \u003cp\u003eThe package separator character: \u003ccode\u003e\u0027\u0026#x2e;\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eThe package separator String: \u003ccode\u003e\"\u0026#x2e;\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR_CHAR"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eThe inner class separator character: \u003ccode\u003e\u0027$\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eThe inner class separator String: \u003ccode\u003e\"$\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveWrapperMap"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Maps primitive \u003ccode\u003eClass\u003c/code\u003ees to their corresponding wrapper \u003ccode\u003eClass\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "wrapperPrimitiveMap"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Maps wrapper \u003ccode\u003eClass\u003c/code\u003ees to their corresponding primitive types.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "abbreviationMap"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Maps a primitive class name to its corresponding abbreviation used in array class names.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reverseAbbreviationMap"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Maps an abbreviation used in array class names to corresponding primitive class name.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.addAbbreviation(java.lang.String, java.lang.String)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Add primitive type abbreviation to maps of abbreviations.\n     *\n     * @param primitive Canonical name of primitive type\n     * @param abbreviation Corresponding abbreviation of primitive type\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ClassUtils.ClassUtils()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eClassUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eClassUtils.getShortClassName(cls)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.Object, java.lang.String)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the class name of the object without the package name, or the null value\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the class name without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.String)",
      "begin_line": 183,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     *\n     * @param className  the className to get the short name for\n     * @return the class name of the class without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 56)",
        "(line 194,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 71)",
        "(line 210,col 9)-(line 211,col 83)",
        "(line 212,col 9)-(line 212,col 57)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.Object, java.lang.String)",
      "begin_line": 228,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eGets the package name of an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.Class\u003c?\u003e)",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\n     * \u003cp\u003eGets the package name of a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e.\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.String)",
      "begin_line": 257,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eGets the package name from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param className  the className to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 62)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getAllSuperclasses(java.lang.Class\u003c?\u003e)",
      "begin_line": 287,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of superclasses for the given class.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of superclasses in order going up from this one\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 59)",
        "(line 292,col 9)-(line 292,col 50)",
        "(line 293,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getAllInterfaces(java.lang.Class\u003c?\u003e)",
      "begin_line": 313,
      "end_line": 322,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of all interfaces implemented by the given\n     * class and its superclasses.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe order is determined by looking through each interface in turn as\n     * declared in the source file and following its hierarchy up. Then each\n     * superclass is considered in the same way. Later duplicates are ignored,\n     * so the order is maintained.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of interfaces in order,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 80)",
        "(line 319,col 9)-(line 319,col 47)",
        "(line 321,col 9)-(line 321,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getAllInterfaces(java.lang.Class\u003c?\u003e, java.util.HashSet\u003cjava.lang.Class\u003c?\u003e\u003e)",
      "begin_line": 330,
      "end_line": 342,
      "comment": "\n     * Get the interfaces for the specified class.\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param interfacesFound the \u003ccode\u003eSet\u003c/code\u003e of interfaces for the class\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 341,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 358,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of class names, this method converts them into classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. If the class name cannot be found, \u003ccode\u003enull\u003c/code\u003e\n     * is stored in the \u003ccode\u003eList\u003c/code\u003e. If the class name in the \u003ccode\u003eList\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is stored in the output \u003ccode\u003eList\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classNames  the classNames to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of Class objects corresponding to the class names,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if classNames contains a non String entry\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 76)",
        "(line 363,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(java.util.List\u003cjava.lang.Class\u003c?\u003e\u003e)",
      "begin_line": 385,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eClass\u003c/code\u003e objects, this method converts\n     * them into class names.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. \u003ccode\u003enull\u003c/code\u003e objects will be copied into\n     * the returned list as \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classes  the classes to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of class names corresponding to the Class objects,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if \u003ccode\u003eclasses\u003c/code\u003e contains a non-\u003ccode\u003eClass\u003c/code\u003e entry\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 72)",
        "(line 390,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a \u003ccode\u003elong\u003c/code\u003e,\n     * \u003ccode\u003efloat\u003c/code\u003e or \u003ccode\u003edouble\u003c/code\u003e. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method will\n     * return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eSince Lang 3.0,\u003c/strong\u003e this method will default behavior for\n     * calculating assignability between primitive and wrapper types \u003cem\u003ecorresponding\n     * to the running Java version\u003c/em\u003e; i.e. autoboxing will be the default\n     * behavior in VMs running Java versions \u003e\u003d 1.5.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param toClassArray  the array of Classes to try to assign into, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[], boolean)",
      "begin_line": 474,
      "end_line": 490,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a \u003ccode\u003elong\u003c/code\u003e,\n     * \u003ccode\u003efloat\u003c/code\u003e or \u003ccode\u003edouble\u003c/code\u003e. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method will\n     * return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param toClassArray  the array of Classes to try to assign into, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eChecks if one \u003ccode\u003eClass\u003c/code\u003e can be assigned to a variable of\n     * another \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method\n     * will return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eSince Lang 3.0,\u003c/strong\u003e this method will default behavior for\n     * calculating assignability between primitive and wrapper types \u003cem\u003ecorresponding\n     * to the running Java version\u003c/em\u003e; i.e. autoboxing will be the default\n     * behavior in VMs running Java versions \u003e\u003d 1.5.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, boolean)",
      "begin_line": 554,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003eChecks if one \u003ccode\u003eClass\u003c/code\u003e can be assigned to a variable of\n     * another \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method\n     * will return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 557,col 9)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.primitiveToWrapper(java.lang.Class\u003c?\u003e)",
      "begin_line": 639,
      "end_line": 645,
      "comment": "\n     * \u003cp\u003eConverts the specified primitive Class object to its corresponding\n     * wrapper Class object.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: From v2.2, this method handles \u003ccode\u003eVoid.TYPE\u003c/code\u003e,\n     * returning \u003ccode\u003eVoid.TYPE\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to convert, may be null\n     * @return the wrapper class for \u003ccode\u003ecls\u003c/code\u003e or \u003ccode\u003ecls\u003c/code\u003e if\n     * \u003ccode\u003ecls\u003c/code\u003e is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 38)",
        "(line 641,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.primitivesToWrappers(java.lang.Class\u003c?\u003e[])",
      "begin_line": 657,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003eConverts the specified array of primitive Class objects to an array of\n     * its corresponding wrapper Class objects.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the wrapper class or\n     * the original class if class is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * Empty array if an empty array passed in.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 666,col 9)-(line 666,col 64)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(java.lang.Class\u003c?\u003e)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eConverts the specified wrapper class to its corresponding primitive\n     * class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is the counter part of \u003ccode\u003eprimitiveToWrapper()\u003c/code\u003e.\n     * If the passed in class is a wrapper class for a primitive type, this\n     * primitive type will be returned (e.g. \u003ccode\u003eInteger.TYPE\u003c/code\u003e for\n     * \u003ccode\u003eInteger.class\u003c/code\u003e). For other classes, or if the parameter is\n     * \u003cb\u003enull\u003c/b\u003e, the return value is \u003cb\u003enull\u003c/b\u003e.\u003c/p\u003e\n     *\n     * @param cls the class to convert, may be \u003cb\u003enull\u003c/b\u003e\n     * @return the corresponding primitive type if \u003ccode\u003ecls\u003c/code\u003e is a\n     * wrapper class, \u003cb\u003enull\u003c/b\u003e otherwise\n     * @see #primitiveToWrapper(Class)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(java.lang.Class\u003c?\u003e[])",
      "begin_line": 707,
      "end_line": 721,
      "comment": "\n     * \u003cp\u003eConverts the specified array of wrapper Class objects to an array of\n     * its corresponding primitive Class objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method invokes \u003ccode\u003ewrapperToPrimitive()\u003c/code\u003e for each element\n     * of the passed in array.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the primitive class or\n     * \u003cb\u003enull\u003c/b\u003e if the original class is not a wrapper class. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * Empty array if an empty array passed in.\n     * @see #wrapperToPrimitive(Class)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 710,col 9)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 64)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isInnerClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 732,
      "end_line": 737,
      "comment": "\n     * \u003cp\u003eIs the specified class an inner class or static nested class.\u003c/p\u003e\n     *\n     * @param cls  the class to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the class is an inner or static nested class,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 752,
      "end_line": 762,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names like\n     * \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 23)",
        "(line 755,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names\n     * like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.String)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the current thread\u0027s context class loader. This implementation\n     * supports names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.String, boolean)",
      "begin_line": 804,
      "end_line": 808,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * current thread\u0027s context class loader. This implementation supports\n     * names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 79)",
        "(line 806,col 9)-(line 806,col 95)",
        "(line 807,col 9)-(line 807,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPublicMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 833,
      "end_line": 862,
      "comment": "\n     * \u003cp\u003eReturns the desired Method much like \u003ccode\u003eClass.getMethod\u003c/code\u003e, however\n     * it ensures that the returned Method is from a public class or interface and not\n     * from an anonymous inner class. This means that the Method is invokable and\n     * doesn\u0027t fall foul of Java bug\n     * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4071957\"\u003e4071957\u003c/a\u003e).\n     *\n     *  \u003ccode\u003e\u003cpre\u003eSet set \u003d Collections.unmodifiableSet(...);\n     *  Method method \u003d ClassUtils.getPublicMethod(set.getClass(), \"isEmpty\",  new Class[0]);\n     *  Object result \u003d method.invoke(set, new Object[]);\u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param cls  the class to check, not null\n     * @param methodName  the name of the method\n     * @param parameterTypes  the list of parameters\n     * @return the method\n     * @throws NullPointerException if the class is null\n     * @throws SecurityException if a a security violation occured\n     * @throws NoSuchMethodException if the method is not found in the given class\n     *  or if the metothod doen\u0027t conform with the requirements\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 74)",
        "(line 837,col 9)-(line 839,col 9)",
        "(line 841,col 9)-(line 841,col 68)",
        "(line 842,col 9)-(line 842,col 55)",
        "(line 843,col 9)-(line 843,col 57)",
        "(line 845,col 9)-(line 858,col 9)",
        "(line 860,col 9)-(line 861,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.toCanonicalName(java.lang.String)",
      "begin_line": 871,
      "end_line": 890,
      "comment": "\n     * Converts a class name to a JLS style class name.\n     *\n     * @param className  the class name\n     * @return the converted name\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 60)",
        "(line 873,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.toClass(java.lang.Object[])",
      "begin_line": 902,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003eConverts an array of \u003ccode\u003eObject\u003c/code\u003e in to an array of \u003ccode\u003eClass\u003c/code\u003e objects.\n     * If any of these objects is null, a null element will be inserted into the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array an \u003ccode\u003eObject\u003c/code\u003e array\n     * @return a \u003ccode\u003eClass\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 53)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.Object, java.lang.String)",
      "begin_line": 925,
      "end_line": 930,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the canonical name of the object without the package name, or the null value\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 929,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.Class\u003c?\u003e)",
      "begin_line": 939,
      "end_line": 944,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name from a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the canonical name without the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.String)",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a canonical name - it is not checked.\u003c/p\u003e\n     *\n     * @param canonicalName  the class name to get the short name for\n     * @return the canonical name of the class without the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.Object, java.lang.String)",
      "begin_line": 969,
      "end_line": 974,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name of an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.Class\u003c?\u003e)",
      "begin_line": 983,
      "end_line": 988,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name of a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e.\n     * @return the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.String)",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a canonical name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param canonicalName  the canonical name to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getCanonicalName(java.lang.String)",
      "begin_line": 1020,
      "end_line": 1051,
      "comment": "\n     * \u003cp\u003eConverts a given name of class into canonical format.\n     * If name of class is not a name of array class it returns\n     * unchanged name.\u003c/p\u003e\n     * \u003cp\u003eExample:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003egetCanonicalName(\"[I\") \u003d \"int[]\"\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003egetCanonicalName(\"[Ljava.lang.String;\") \u003d \"java.lang.String[]\"\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003egetCanonicalName(\"java.lang.String\") \u003d \"java.lang.String\"\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param className the name of class\n     * @return canonical form of class name\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 60)",
        "(line 1022,col 9)-(line 1050,col 9)"
      ]
    }
  ]
}