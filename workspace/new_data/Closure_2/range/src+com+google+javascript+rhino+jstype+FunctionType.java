{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/FunctionType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.PrototypeObjectType"
      ],
      "begin_line": 66,
      "end_line": 1266,
      "comment": "\n * This derived type provides extended information about a function, including\n * its return type and argument types.\u003cp\u003e\n *\n * Note: the parameters list is the LP node that is the parent of the\n * actual NAME node containing the parsed argument list (annotated with\n * JSDOC_TYPE_PROP\u0027s for the compile-time type of each argument.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "call"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n   * {@code [[Call]]} property.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeSlot"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * The {@code prototype} property. This field is lazily initialized by\n   * {@code #getPrototype()}. The most important reason for lazily\n   * initializing this field is that there are cycles in the native types\n   * graph, so some prototypes must temporarily be {@code null} during\n   * the construction of the graph.\n   *\n   * If non-null, the type must be a PrototypeObjectType.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "kind"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n   * Whether a function is a constructor, an interface, or just an ordinary\n   * function.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "propAccess"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n   * Whether the instances are structs, dicts, or unrestricted.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeOfThis"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n   * The type of {@code this} in the scope of this function.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n   * The function node which this type represents. It may be {@code null}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "implementedInterfaces"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n   * The interfaces directly implemented by this function (for constructors)\n   * It is only relevant for constructors. May not be {@code null}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "extendedInterfaces"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n   * The interfaces directly extended by this function (for interfaces)\n   * It is only relevant for constructors. May not be {@code null}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "subTypes"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n   * The types which are subtypes of this function. It is only relevant for\n   * constructors and may be {@code null}.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ArrowType, com.google.javascript.rhino.jstype.JSType, com.google.common.collect.ImmutableList\u003cjava.lang.String\u003e, boolean, boolean)",
      "begin_line": 134,
      "end_line": 159,
      "comment": " Creates an instance for a function that might be a constructor. ",
      "child_ranges": [
        "(line 138,col 5)-(line 140,col 40)",
        "(line 141,col 5)-(line 141,col 25)",
        "(line 143,col 5)-(line 144,col 44)",
        "(line 145,col 5)-(line 145,col 42)",
        "(line 146,col 5)-(line 146,col 25)",
        "(line 147,col 5)-(line 157,col 5)",
        "(line 158,col 5)-(line 158,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 174,
      "comment": " Creates an instance for a function that is an interface. ",
      "child_ranges": [
        "(line 163,col 5)-(line 164,col 75)",
        "(line 165,col 5)-(line 165,col 25)",
        "(line 167,col 5)-(line 168,col 44)",
        "(line 169,col 5)-(line 169,col 46)",
        "(line 170,col 5)-(line 170,col 25)",
        "(line 171,col 5)-(line 171,col 74)",
        "(line 172,col 5)-(line 172,col 31)",
        "(line 173,col 5)-(line 173,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 177,
      "end_line": 180,
      "comment": " Creates an instance for a function that is an interface. ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isInstanceType()",
      "begin_line": 182,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isConstructor()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isInterface()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isOrdinaryFunction()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.makesStructs()",
      "begin_line": 209,
      "end_line": 222,
      "comment": "\n   * When a class B inherits from A and A is annotated as a struct, then B\n   * automatically gets the annotation, even if B\u0027s constructor is not\n   * explicitly annotated.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 5)",
        "(line 213,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 216,col 53)",
        "(line 217,col 5)-(line 220,col 5)",
        "(line 221,col 5)-(line 221,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.makesDicts()",
      "begin_line": 229,
      "end_line": 242,
      "comment": "\n   * When a class B inherits from A and A is annotated as a dict, then B\n   * automatically gets the annotation, even if B\u0027s constructor is not\n   * explicitly annotated.\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 232,col 5)",
        "(line 233,col 5)-(line 235,col 5)",
        "(line 236,col 5)-(line 236,col 53)",
        "(line 237,col 5)-(line 240,col 5)",
        "(line 241,col 5)-(line 241,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setStruct()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setDict()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.toMaybeFunctionType()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.canBeCalled()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasImplementedInterfaces()",
      "begin_line": 262,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 267,col 42)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getParameters()",
      "begin_line": 274,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 33)",
        "(line 276,col 5)-(line 280,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getParametersNode()",
      "begin_line": 284,
      "end_line": 286,
      "comment": " Gets an LP node that contains all params. May be null. ",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getMinArguments()",
      "begin_line": 289,
      "end_line": 302,
      "comment": " Gets the minimum number of arguments that this function requires. ",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 14)",
        "(line 294,col 5)-(line 294,col 16)",
        "(line 295,col 5)-(line 300,col 5)",
        "(line 301,col 5)-(line 301,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getMaxArguments()",
      "begin_line": 308,
      "end_line": 318,
      "comment": "\n   * Gets the maximum number of arguments that this function requires,\n   * or Integer.MAX_VALUE if this is a variable argument function.\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 38)",
        "(line 310,col 5)-(line 315,col 5)",
        "(line 317,col 5)-(line 317,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getReturnType()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getInternalArrowType()",
      "begin_line": 329,
      "end_line": 331,
      "comment": " Gets the internal arrow type. For use by subclasses only. ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSlot(java.lang.String)",
      "begin_line": 333,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 341,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames()",
      "begin_line": 348,
      "end_line": 357,
      "comment": "\n   * Includes the prototype iff someone has created it. We do not want\n   * to expose the prototype for ordinary functions.\n   ",
      "child_ranges": [
        "(line 350,col 5)-(line 356,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getPrototype()",
      "begin_line": 363,
      "end_line": 385,
      "comment": "\n   * Gets the {@code prototype} property of this function type. This is\n   * equivalent to {@code (ObjectType) getPropertyType(\"prototype\")}.\n   ",
      "child_ranges": [
        "(line 365,col 5)-(line 383,col 5)",
        "(line 384,col 5)-(line 384,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n   * Sets the prototype, creating the prototype object from the given\n   * base type.\n   * @param baseType The base type.\n   ",
      "child_ranges": [
        "(line 393,col 5)-(line 393,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.Node)",
      "begin_line": 396,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 419,col 5)",
        "(line 420,col 5)-(line 420,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototype(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.Node)",
      "begin_line": 428,
      "end_line": 437,
      "comment": "\n   * Sets the prototype.\n   * @param prototype the prototype. If this value is {@code null} it will\n   *        silently be discarded.\n   ",
      "child_ranges": [
        "(line 429,col 5)-(line 431,col 5)",
        "(line 433,col 5)-(line 435,col 5)",
        "(line 436,col 5)-(line 436,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototypeNoCheck(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.Node)",
      "begin_line": 440,
      "end_line": 475,
      "comment": " Set the prototype without doing any sanity checks. ",
      "child_ranges": [
        "(line 441,col 5)-(line 442,col 54)",
        "(line 443,col 5)-(line 443,col 53)",
        "(line 445,col 5)-(line 446,col 54)",
        "(line 447,col 5)-(line 447,col 37)",
        "(line 449,col 5)-(line 453,col 5)",
        "(line 455,col 5)-(line 468,col 5)",
        "(line 470,col 5)-(line 472,col 5)",
        "(line 474,col 5)-(line 474,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces()",
      "begin_line": 482,
      "end_line": 491,
      "comment": "\n   * Returns all interfaces implemented by a class or its superclass and any\n   * superclasses for any of those interfaces. If this is called before all\n   * types are resolved, it may return an incomplete set.\n   ",
      "child_ranges": [
        "(line 485,col 5)-(line 485,col 57)",
        "(line 487,col 5)-(line 489,col 5)",
        "(line 490,col 5)-(line 490,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 493,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 57)",
        "(line 495,col 5)-(line 505,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces()",
      "begin_line": 509,
      "end_line": 518,
      "comment": " Returns interfaces implemented directly by a class or its superclass. ",
      "child_ranges": [
        "(line 510,col 5)-(line 511,col 42)",
        "(line 512,col 5)-(line 517,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getOwnImplementedInterfaces()",
      "begin_line": 521,
      "end_line": 523,
      "comment": " Returns interfaces directly implemented by the class. ",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 525,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 526,col 5)-(line 534,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces()",
      "begin_line": 542,
      "end_line": 551,
      "comment": "\n   * Returns all extended interfaces declared by an interfaces or its super-\n   * interfaces. If this is called before all types are resolved, it may return\n   * an incomplete set.\n   ",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 65)",
        "(line 547,col 5)-(line 549,col 5)",
        "(line 550,col 5)-(line 550,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 553,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 57)",
        "(line 556,col 5)-(line 562,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfaces()",
      "begin_line": 566,
      "end_line": 568,
      "comment": " Returns interfaces directly extended by an interface ",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfacesCount()",
      "begin_line": 571,
      "end_line": 573,
      "comment": " Returns the number of interfaces directly extended by an interface ",
      "child_ranges": [
        "(line 572,col 5)-(line 572,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setExtendedInterfaces(java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 575,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 581,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getPropertyType(java.lang.String)",
      "begin_line": 584,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 586,col 5)-(line 613,col 5)",
        "(line 615,col 5)-(line 615,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getBindReturnType(int)",
      "begin_line": 625,
      "end_line": 643,
      "comment": "\n   * Get the return value of calling \"bind\" on this function\n   * with the specified number of arguments.\n   *\n   * If -1 is passed, then we will return a result that accepts\n   * any parameters.\n   ",
      "child_ranges": [
        "(line 626,col 5)-(line 628,col 45)",
        "(line 629,col 5)-(line 641,col 5)",
        "(line 642,col 5)-(line 642,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getCallOrBindSignature(boolean)",
      "begin_line": 650,
      "end_line": 687,
      "comment": "\n   * Notice that \"call\" and \"bind\" have the same argument signature,\n   * except that all the arguments of \"bind\" (except the first)\n   * are optional.\n   ",
      "child_ranges": [
        "(line 651,col 5)-(line 651,col 29)",
        "(line 652,col 5)-(line 654,col 45)",
        "(line 656,col 5)-(line 656,col 42)",
        "(line 657,col 5)-(line 684,col 5)",
        "(line 686,col 5)-(line 686,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 689,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 692,col 5)-(line 704,col 5)",
        "(line 705,col 5)-(line 705,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(com.google.javascript.rhino.jstype.FunctionType, boolean)",
      "begin_line": 716,
      "end_line": 786,
      "comment": "\n   * Computes the supremum or infimum of two functions.\n   * Because sup() and inf() share a lot of logic for functions, we use\n   * a single helper.\n   * @param leastSuper If true, compute the supremum of {@code this} with\n   *     {@code that}. Otherwise, compute the infimum.\n   * @return The least supertype or greatest subtype.\n   ",
      "child_ranges": [
        "(line 734,col 5)-(line 734,col 37)",
        "(line 736,col 5)-(line 738,col 5)",
        "(line 744,col 5)-(line 763,col 5)",
        "(line 767,col 5)-(line 768,col 45)",
        "(line 769,col 5)-(line 773,col 5)",
        "(line 781,col 5)-(line 782,col 74)",
        "(line 783,col 5)-(line 784,col 73)",
        "(line 785,col 5)-(line 785,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType, boolean)",
      "begin_line": 792,
      "end_line": 825,
      "comment": "\n   * Try to get the sup/inf of two functions by looking at the\n   * piecewise components.\n   ",
      "child_ranges": [
        "(line 794,col 5)-(line 794,col 30)",
        "(line 795,col 5)-(line 801,col 5)",
        "(line 803,col 5)-(line 805,col 66)",
        "(line 807,col 5)-(line 807,col 32)",
        "(line 808,col 5)-(line 815,col 5)",
        "(line 817,col 5)-(line 818,col 65)",
        "(line 820,col 5)-(line 824,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor()",
      "begin_line": 831,
      "end_line": 838,
      "comment": "\n   * Given a constructor or an interface type, get its superclass constructor\n   * or {@code null} if none exists.\n   ",
      "child_ranges": [
        "(line 832,col 5)-(line 832,col 66)",
        "(line 833,col 5)-(line 833,col 78)",
        "(line 834,col 5)-(line 836,col 5)",
        "(line 837,col 5)-(line 837,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 844,
      "end_line": 856,
      "comment": "\n   * Given an interface and a property, finds the top-most super interface\n   * that has the property defined (including this interface).\n   ",
      "child_ranges": [
        "(line 846,col 5)-(line 846,col 32)",
        "(line 847,col 5)-(line 849,col 5)",
        "(line 850,col 5)-(line 854,col 5)",
        "(line 855,col 5)-(line 855,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(java.lang.String)",
      "begin_line": 863,
      "end_line": 880,
      "comment": "\n   * Given a constructor or an interface type and a property, finds the\n   * top-most superclass that has the property defined (including this\n   * constructor).\n   ",
      "child_ranges": [
        "(line 864,col 5)-(line 864,col 63)",
        "(line 865,col 5)-(line 865,col 77)",
        "(line 866,col 5)-(line 866,col 29)",
        "(line 868,col 5)-(line 870,col 5)",
        "(line 872,col 5)-(line 872,col 38)",
        "(line 873,col 5)-(line 877,col 58)",
        "(line 879,col 5)-(line 879,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.checkFunctionEquivalenceHelper(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 886,
      "end_line": 906,
      "comment": "\n   * Two function types are equal if their signatures match. Since they don\u0027t\n   * have signatures, two interfaces are equal if their names match.\n   ",
      "child_ranges": [
        "(line 888,col 5)-(line 893,col 5)",
        "(line 894,col 5)-(line 899,col 5)",
        "(line 900,col 5)-(line 902,col 5)",
        "(line 904,col 5)-(line 905,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hashCode()",
      "begin_line": 908,
      "end_line": 911,
      "comment": "",
      "child_ranges": [
        "(line 910,col 5)-(line 910,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 913,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 914,col 5)-(line 915,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.toStringHelper(boolean)",
      "begin_line": 924,
      "end_line": 964,
      "comment": "\n   * Informally, a function is represented by\n   * {@code function (params): returnType} where the {@code params} is a comma\n   * separated list of types, the first one being a special\n   * {@code this:T} if the function expects a known type for {@code this}.\n   ",
      "child_ranges": [
        "(line 926,col 5)-(line 929,col 5)",
        "(line 931,col 5)-(line 931,col 26)",
        "(line 933,col 5)-(line 933,col 44)",
        "(line 934,col 5)-(line 934,col 27)",
        "(line 935,col 5)-(line 935,col 51)",
        "(line 936,col 5)-(line 936,col 70)",
        "(line 937,col 5)-(line 944,col 5)",
        "(line 945,col 5)-(line 958,col 5)",
        "(line 959,col 5)-(line 959,col 20)",
        "(line 960,col 5)-(line 960,col 61)",
        "(line 962,col 5)-(line 962,col 25)",
        "(line 963,col 5)-(line 963,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.appendArgString(java.lang.StringBuilder, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 966,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 968,col 5)-(line 974,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 978,
      "end_line": 987,
      "comment": " Gets the string representation of a var args param. ",
      "child_ranges": [
        "(line 980,col 5)-(line 984,col 5)",
        "(line 985,col 5)-(line 986,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.appendOptionalArgString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 990,
      "end_line": 998,
      "comment": " Gets the string representation of an optional param. ",
      "child_ranges": [
        "(line 992,col 5)-(line 996,col 5)",
        "(line 997,col 5)-(line 997,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1005,
      "end_line": 1045,
      "comment": "\n   * A function is a subtype of another if their call methods are related via\n   * subtyping and {@code this} is a subtype of {@code that} with regard to\n   * the prototype chain.\n   ",
      "child_ranges": [
        "(line 1007,col 5)-(line 1009,col 5)",
        "(line 1011,col 5)-(line 1042,col 5)",
        "(line 1044,col 5)-(line 1044,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 1047,
      "end_line": 1050,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 5)-(line 1049,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1052,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 5)-(line 1053,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getInstanceType()",
      "begin_line": 1061,
      "end_line": 1064,
      "comment": "\n   * Gets the type of instance of this function.\n   * @throws IllegalStateException if this function is not a constructor\n   *         (see {@link #isConstructor()}).\n   ",
      "child_ranges": [
        "(line 1062,col 5)-(line 1062,col 48)",
        "(line 1063,col 5)-(line 1063,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setInstanceType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\n   * Sets the instance type. This should only be used for special\n   * native types.\n   ",
      "child_ranges": [
        "(line 1071,col 5)-(line 1071,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasInstanceType()",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\n   * Returns whether this function type has an instance type.\n   ",
      "child_ranges": [
        "(line 1078,col 5)-(line 1078,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis()",
      "begin_line": 1084,
      "end_line": 1088,
      "comment": "\n   * Gets the type of {@code this} in this function.\n   ",
      "child_ranges": [
        "(line 1086,col 5)-(line 1087,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSource()",
      "begin_line": 1093,
      "end_line": 1095,
      "comment": "\n   * Gets the source node or null if this is an unknown function.\n   ",
      "child_ranges": [
        "(line 1094,col 5)-(line 1094,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setSource(com.google.javascript.rhino.Node)",
      "begin_line": 1100,
      "end_line": 1113,
      "comment": "\n   * Sets the source node.\n   ",
      "child_ranges": [
        "(line 1101,col 5)-(line 1111,col 5)",
        "(line 1112,col 5)-(line 1112,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.addSubType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1116,
      "end_line": 1121,
      "comment": " Adds a type to the list of subtypes for this type. ",
      "child_ranges": [
        "(line 1117,col 5)-(line 1119,col 5)",
        "(line 1120,col 5)-(line 1120,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.clearCachedValues()",
      "begin_line": 1123,
      "end_line": 1142,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 5)-(line 1125,col 30)",
        "(line 1127,col 5)-(line 1131,col 5)",
        "(line 1133,col 5)-(line 1141,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSubTypes()",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "\n   * Returns a list of types that are subtypes of this type. This is only valid\n   * for constructor functions, and may be null. This allows a downward\n   * traversal of the subtype graph.\n   ",
      "child_ranges": [
        "(line 1150,col 5)-(line 1150,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasCachedValues()",
      "begin_line": 1153,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1155,col 5)-(line 1155,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1158,
      "end_line": 1207,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 5)-(line 1160,col 34)",
        "(line 1162,col 5)-(line 1162,col 51)",
        "(line 1163,col 5)-(line 1166,col 5)",
        "(line 1179,col 5)-(line 1179,col 63)",
        "(line 1180,col 5)-(line 1182,col 5)",
        "(line 1183,col 5)-(line 1185,col 5)",
        "(line 1187,col 5)-(line 1187,col 28)",
        "(line 1188,col 5)-(line 1189,col 32)",
        "(line 1190,col 5)-(line 1194,col 5)",
        "(line 1195,col 5)-(line 1197,col 5)",
        "(line 1199,col 5)-(line 1204,col 5)",
        "(line 1206,col 5)-(line 1206,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString()",
      "begin_line": 1209,
      "end_line": 1240,
      "comment": "",
      "child_ranges": [
        "(line 1211,col 5)-(line 1213,col 5)",
        "(line 1215,col 5)-(line 1215,col 44)",
        "(line 1216,col 5)-(line 1216,col 27)",
        "(line 1217,col 5)-(line 1217,col 51)",
        "(line 1218,col 5)-(line 1218,col 61)",
        "(line 1219,col 5)-(line 1222,col 5)",
        "(line 1223,col 5)-(line 1235,col 5)",
        "(line 1236,col 5)-(line 1236,col 18)",
        "(line 1237,col 5)-(line 1237,col 19)",
        "(line 1238,col 5)-(line 1238,col 56)",
        "(line 1239,col 5)-(line 1239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1242,
      "end_line": 1248,
      "comment": "",
      "child_ranges": [
        "(line 1243,col 5)-(line 1247,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.cloneWithoutArrowType()",
      "begin_line": 1251,
      "end_line": 1258,
      "comment": " Create a new constructor with the parameters and return type stripped. ",
      "child_ranges": [
        "(line 1252,col 5)-(line 1255,col 27)",
        "(line 1256,col 5)-(line 1256,col 50)",
        "(line 1257,col 5)-(line 1257,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateTypesInternal()",
      "begin_line": 1260,
      "end_line": 1265,
      "comment": "",
      "child_ranges": [
        "(line 1262,col 5)-(line 1264,col 38)"
      ]
    }
  ]
}