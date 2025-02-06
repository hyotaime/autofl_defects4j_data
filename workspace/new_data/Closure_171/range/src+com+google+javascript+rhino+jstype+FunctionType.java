{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/FunctionType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.PrototypeObjectType"
      ],
      "begin_line": 66,
      "end_line": 1275,
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
      "signature": "com.google.javascript.rhino.jstype.FunctionType.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ArrowType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.TemplateTypeMap, boolean, boolean)",
      "begin_line": 134,
      "end_line": 159,
      "comment": " Creates an instance for a function that might be a constructor. ",
      "child_ranges": [
        "(line 138,col 5)-(line 140,col 37)",
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
      "signature": "com.google.javascript.rhino.jstype.FunctionType.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 162,
      "end_line": 176,
      "comment": " Creates an instance for a function that is an interface. ",
      "child_ranges": [
        "(line 164,col 5)-(line 166,col 31)",
        "(line 167,col 5)-(line 167,col 25)",
        "(line 169,col 5)-(line 170,col 44)",
        "(line 171,col 5)-(line 171,col 46)",
        "(line 172,col 5)-(line 172,col 25)",
        "(line 173,col 5)-(line 173,col 74)",
        "(line 174,col 5)-(line 174,col 31)",
        "(line 175,col 5)-(line 175,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 179,
      "end_line": 183,
      "comment": " Creates an instance for a function that is an interface. ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isInstanceType()",
      "begin_line": 185,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isConstructor()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isInterface()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isOrdinaryFunction()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.makesStructs()",
      "begin_line": 212,
      "end_line": 225,
      "comment": "\n   * When a class B inherits from A and A is annotated as a struct, then B\n   * automatically gets the annotation, even if B\u0027s constructor is not\n   * explicitly annotated.\n   ",
      "child_ranges": [
        "(line 213,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 218,col 5)",
        "(line 219,col 5)-(line 219,col 53)",
        "(line 220,col 5)-(line 223,col 5)",
        "(line 224,col 5)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.makesDicts()",
      "begin_line": 232,
      "end_line": 245,
      "comment": "\n   * When a class B inherits from A and A is annotated as a dict, then B\n   * automatically gets the annotation, even if B\u0027s constructor is not\n   * explicitly annotated.\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 235,col 5)",
        "(line 236,col 5)-(line 238,col 5)",
        "(line 239,col 5)-(line 239,col 53)",
        "(line 240,col 5)-(line 243,col 5)",
        "(line 244,col 5)-(line 244,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setStruct()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setDict()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.toMaybeFunctionType()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.canBeCalled()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasImplementedInterfaces()",
      "begin_line": 265,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 268,col 5)",
        "(line 269,col 5)-(line 270,col 42)",
        "(line 271,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getParameters()",
      "begin_line": 277,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 33)",
        "(line 279,col 5)-(line 283,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getParametersNode()",
      "begin_line": 287,
      "end_line": 289,
      "comment": " Gets an LP node that contains all params. May be null. ",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getMinArguments()",
      "begin_line": 292,
      "end_line": 305,
      "comment": " Gets the minimum number of arguments that this function requires. ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 14)",
        "(line 297,col 5)-(line 297,col 16)",
        "(line 298,col 5)-(line 303,col 5)",
        "(line 304,col 5)-(line 304,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getMaxArguments()",
      "begin_line": 311,
      "end_line": 321,
      "comment": "\n   * Gets the maximum number of arguments that this function requires,\n   * or Integer.MAX_VALUE if this is a variable argument function.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 38)",
        "(line 313,col 5)-(line 318,col 5)",
        "(line 320,col 5)-(line 320,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getReturnType()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 324,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getInternalArrowType()",
      "begin_line": 332,
      "end_line": 334,
      "comment": " Gets the internal arrow type. For use by subclasses only. ",
      "child_ranges": [
        "(line 333,col 5)-(line 333,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSlot(java.lang.String)",
      "begin_line": 336,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 344,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames()",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\n   * Includes the prototype iff someone has created it. We do not want\n   * to expose the prototype for ordinary functions.\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 359,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getPrototype()",
      "begin_line": 366,
      "end_line": 388,
      "comment": "\n   * Gets the {@code prototype} property of this function type. This is\n   * equivalent to {@code (ObjectType) getPropertyType(\"prototype\")}.\n   ",
      "child_ranges": [
        "(line 368,col 5)-(line 386,col 5)",
        "(line 387,col 5)-(line 387,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n   * Sets the prototype, creating the prototype object from the given\n   * base type.\n   * @param baseType The base type.\n   ",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.Node)",
      "begin_line": 399,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 417,col 5)-(line 423,col 5)",
        "(line 424,col 5)-(line 424,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototype(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.Node)",
      "begin_line": 432,
      "end_line": 441,
      "comment": "\n   * Sets the prototype.\n   * @param prototype the prototype. If this value is {@code null} it will\n   *        silently be discarded.\n   ",
      "child_ranges": [
        "(line 433,col 5)-(line 435,col 5)",
        "(line 437,col 5)-(line 439,col 5)",
        "(line 440,col 5)-(line 440,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setPrototypeNoCheck(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.Node)",
      "begin_line": 444,
      "end_line": 479,
      "comment": " Set the prototype without doing any sanity checks. ",
      "child_ranges": [
        "(line 445,col 5)-(line 446,col 54)",
        "(line 447,col 5)-(line 447,col 53)",
        "(line 449,col 5)-(line 450,col 54)",
        "(line 451,col 5)-(line 451,col 37)",
        "(line 453,col 5)-(line 457,col 5)",
        "(line 459,col 5)-(line 472,col 5)",
        "(line 474,col 5)-(line 476,col 5)",
        "(line 478,col 5)-(line 478,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces()",
      "begin_line": 486,
      "end_line": 495,
      "comment": "\n   * Returns all interfaces implemented by a class or its superclass and any\n   * superclasses for any of those interfaces. If this is called before all\n   * types are resolved, it may return an incomplete set.\n   ",
      "child_ranges": [
        "(line 489,col 5)-(line 489,col 57)",
        "(line 491,col 5)-(line 493,col 5)",
        "(line 494,col 5)-(line 494,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 497,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 57)",
        "(line 499,col 5)-(line 509,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces()",
      "begin_line": 513,
      "end_line": 522,
      "comment": " Returns interfaces implemented directly by a class or its superclass. ",
      "child_ranges": [
        "(line 514,col 5)-(line 515,col 42)",
        "(line 516,col 5)-(line 521,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getOwnImplementedInterfaces()",
      "begin_line": 525,
      "end_line": 527,
      "comment": " Returns interfaces directly implemented by the class. ",
      "child_ranges": [
        "(line 526,col 5)-(line 526,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 529,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 530,col 5)-(line 539,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces()",
      "begin_line": 547,
      "end_line": 556,
      "comment": "\n   * Returns all extended interfaces declared by an interfaces or its super-\n   * interfaces. If this is called before all types are resolved, it may return\n   * an incomplete set.\n   ",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 65)",
        "(line 552,col 5)-(line 554,col 5)",
        "(line 555,col 5)-(line 555,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 558,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 560,col 5)-(line 560,col 57)",
        "(line 561,col 5)-(line 567,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfaces()",
      "begin_line": 571,
      "end_line": 573,
      "comment": " Returns interfaces directly extended by an interface ",
      "child_ranges": [
        "(line 572,col 5)-(line 572,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfacesCount()",
      "begin_line": 576,
      "end_line": 578,
      "comment": " Returns the number of interfaces directly extended by an interface ",
      "child_ranges": [
        "(line 577,col 5)-(line 577,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setExtendedInterfaces(java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e)",
      "begin_line": 580,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 582,col 5)-(line 590,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getPropertyType(java.lang.String)",
      "begin_line": 593,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 595,col 5)-(line 622,col 5)",
        "(line 624,col 5)-(line 624,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getBindReturnType(int)",
      "begin_line": 634,
      "end_line": 652,
      "comment": "\n   * Get the return value of calling \"bind\" on this function\n   * with the specified number of arguments.\n   *\n   * If -1 is passed, then we will return a result that accepts\n   * any parameters.\n   ",
      "child_ranges": [
        "(line 635,col 5)-(line 637,col 66)",
        "(line 638,col 5)-(line 650,col 5)",
        "(line 651,col 5)-(line 651,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getCallOrBindSignature(boolean)",
      "begin_line": 659,
      "end_line": 696,
      "comment": "\n   * Notice that \"call\" and \"bind\" have the same argument signature,\n   * except that all the arguments of \"bind\" (except the first)\n   * are optional.\n   ",
      "child_ranges": [
        "(line 660,col 5)-(line 660,col 29)",
        "(line 661,col 5)-(line 663,col 66)",
        "(line 665,col 5)-(line 665,col 42)",
        "(line 666,col 5)-(line 693,col 5)",
        "(line 695,col 5)-(line 695,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 698,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 701,col 5)-(line 713,col 5)",
        "(line 714,col 5)-(line 714,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(com.google.javascript.rhino.jstype.FunctionType, boolean)",
      "begin_line": 725,
      "end_line": 795,
      "comment": "\n   * Computes the supremum or infimum of two functions.\n   * Because sup() and inf() share a lot of logic for functions, we use\n   * a single helper.\n   * @param leastSuper If true, compute the supremum of {@code this} with\n   *     {@code that}. Otherwise, compute the infimum.\n   * @return The least supertype or greatest subtype.\n   ",
      "child_ranges": [
        "(line 743,col 5)-(line 743,col 37)",
        "(line 745,col 5)-(line 747,col 5)",
        "(line 753,col 5)-(line 772,col 5)",
        "(line 776,col 5)-(line 777,col 45)",
        "(line 778,col 5)-(line 782,col 5)",
        "(line 790,col 5)-(line 791,col 74)",
        "(line 792,col 5)-(line 793,col 73)",
        "(line 794,col 5)-(line 794,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType, boolean)",
      "begin_line": 801,
      "end_line": 834,
      "comment": "\n   * Try to get the sup/inf of two functions by looking at the\n   * piecewise components.\n   ",
      "child_ranges": [
        "(line 803,col 5)-(line 803,col 30)",
        "(line 804,col 5)-(line 810,col 5)",
        "(line 812,col 5)-(line 814,col 66)",
        "(line 816,col 5)-(line 816,col 32)",
        "(line 817,col 5)-(line 824,col 5)",
        "(line 826,col 5)-(line 827,col 65)",
        "(line 829,col 5)-(line 833,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor()",
      "begin_line": 840,
      "end_line": 847,
      "comment": "\n   * Given a constructor or an interface type, get its superclass constructor\n   * or {@code null} if none exists.\n   ",
      "child_ranges": [
        "(line 841,col 5)-(line 841,col 66)",
        "(line 842,col 5)-(line 842,col 78)",
        "(line 843,col 5)-(line 845,col 5)",
        "(line 846,col 5)-(line 846,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 853,
      "end_line": 865,
      "comment": "\n   * Given an interface and a property, finds the top-most super interface\n   * that has the property defined (including this interface).\n   ",
      "child_ranges": [
        "(line 855,col 5)-(line 855,col 32)",
        "(line 856,col 5)-(line 858,col 5)",
        "(line 859,col 5)-(line 863,col 5)",
        "(line 864,col 5)-(line 864,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(java.lang.String)",
      "begin_line": 872,
      "end_line": 889,
      "comment": "\n   * Given a constructor or an interface type and a property, finds the\n   * top-most superclass that has the property defined (including this\n   * constructor).\n   ",
      "child_ranges": [
        "(line 873,col 5)-(line 873,col 63)",
        "(line 874,col 5)-(line 874,col 77)",
        "(line 875,col 5)-(line 875,col 29)",
        "(line 877,col 5)-(line 879,col 5)",
        "(line 881,col 5)-(line 881,col 38)",
        "(line 882,col 5)-(line 886,col 58)",
        "(line 888,col 5)-(line 888,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.checkFunctionEquivalenceHelper(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 895,
      "end_line": 915,
      "comment": "\n   * Two function types are equal if their signatures match. Since they don\u0027t\n   * have signatures, two interfaces are equal if their names match.\n   ",
      "child_ranges": [
        "(line 897,col 5)-(line 902,col 5)",
        "(line 903,col 5)-(line 908,col 5)",
        "(line 909,col 5)-(line 911,col 5)",
        "(line 913,col 5)-(line 914,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hashCode()",
      "begin_line": 917,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 919,col 5)-(line 919,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 922,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 923,col 5)-(line 924,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.toStringHelper(boolean)",
      "begin_line": 933,
      "end_line": 973,
      "comment": "\n   * Informally, a function is represented by\n   * {@code function (params): returnType} where the {@code params} is a comma\n   * separated list of types, the first one being a special\n   * {@code this:T} if the function expects a known type for {@code this}.\n   ",
      "child_ranges": [
        "(line 935,col 5)-(line 938,col 5)",
        "(line 940,col 5)-(line 940,col 26)",
        "(line 942,col 5)-(line 942,col 44)",
        "(line 943,col 5)-(line 943,col 27)",
        "(line 944,col 5)-(line 944,col 51)",
        "(line 945,col 5)-(line 945,col 70)",
        "(line 946,col 5)-(line 953,col 5)",
        "(line 954,col 5)-(line 967,col 5)",
        "(line 968,col 5)-(line 968,col 20)",
        "(line 969,col 5)-(line 969,col 61)",
        "(line 971,col 5)-(line 971,col 25)",
        "(line 972,col 5)-(line 972,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.appendArgString(java.lang.StringBuilder, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 975,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 977,col 5)-(line 983,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 987,
      "end_line": 996,
      "comment": " Gets the string representation of a var args param. ",
      "child_ranges": [
        "(line 989,col 5)-(line 993,col 5)",
        "(line 994,col 5)-(line 995,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.appendOptionalArgString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 999,
      "end_line": 1007,
      "comment": " Gets the string representation of an optional param. ",
      "child_ranges": [
        "(line 1001,col 5)-(line 1005,col 5)",
        "(line 1006,col 5)-(line 1006,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1014,
      "end_line": 1054,
      "comment": "\n   * A function is a subtype of another if their call methods are related via\n   * subtyping and {@code this} is a subtype of {@code that} with regard to\n   * the prototype chain.\n   ",
      "child_ranges": [
        "(line 1016,col 5)-(line 1018,col 5)",
        "(line 1020,col 5)-(line 1051,col 5)",
        "(line 1053,col 5)-(line 1053,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 1056,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 5)-(line 1058,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 5)-(line 1062,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getInstanceType()",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": "\n   * Gets the type of instance of this function.\n   * @throws IllegalStateException if this function is not a constructor\n   *         (see {@link #isConstructor()}).\n   ",
      "child_ranges": [
        "(line 1071,col 5)-(line 1071,col 48)",
        "(line 1072,col 5)-(line 1072,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setInstanceType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "\n   * Sets the instance type. This should only be used for special\n   * native types.\n   ",
      "child_ranges": [
        "(line 1080,col 5)-(line 1080,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasInstanceType()",
      "begin_line": 1086,
      "end_line": 1088,
      "comment": "\n   * Returns whether this function type has an instance type.\n   ",
      "child_ranges": [
        "(line 1087,col 5)-(line 1087,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis()",
      "begin_line": 1093,
      "end_line": 1097,
      "comment": "\n   * Gets the type of {@code this} in this function.\n   ",
      "child_ranges": [
        "(line 1095,col 5)-(line 1096,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSource()",
      "begin_line": 1102,
      "end_line": 1104,
      "comment": "\n   * Gets the source node or null if this is an unknown function.\n   ",
      "child_ranges": [
        "(line 1103,col 5)-(line 1103,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.setSource(com.google.javascript.rhino.Node)",
      "begin_line": 1109,
      "end_line": 1122,
      "comment": "\n   * Sets the source node.\n   ",
      "child_ranges": [
        "(line 1110,col 5)-(line 1120,col 5)",
        "(line 1121,col 5)-(line 1121,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.addSubType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1125,
      "end_line": 1130,
      "comment": " Adds a type to the list of subtypes for this type. ",
      "child_ranges": [
        "(line 1126,col 5)-(line 1128,col 5)",
        "(line 1129,col 5)-(line 1129,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.clearCachedValues()",
      "begin_line": 1132,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 5)-(line 1134,col 30)",
        "(line 1136,col 5)-(line 1140,col 5)",
        "(line 1142,col 5)-(line 1150,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getSubTypes()",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": "\n   * Returns a list of types that are subtypes of this type. This is only valid\n   * for constructor functions, and may be null. This allows a downward\n   * traversal of the subtype graph.\n   ",
      "child_ranges": [
        "(line 1159,col 5)-(line 1159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasCachedValues()",
      "begin_line": 1162,
      "end_line": 1165,
      "comment": "",
      "child_ranges": [
        "(line 1164,col 5)-(line 1164,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1167,
      "end_line": 1216,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 5)-(line 1169,col 34)",
        "(line 1171,col 5)-(line 1171,col 51)",
        "(line 1172,col 5)-(line 1175,col 5)",
        "(line 1188,col 5)-(line 1188,col 63)",
        "(line 1189,col 5)-(line 1191,col 5)",
        "(line 1192,col 5)-(line 1194,col 5)",
        "(line 1196,col 5)-(line 1196,col 28)",
        "(line 1197,col 5)-(line 1198,col 32)",
        "(line 1199,col 5)-(line 1203,col 5)",
        "(line 1204,col 5)-(line 1206,col 5)",
        "(line 1208,col 5)-(line 1213,col 5)",
        "(line 1215,col 5)-(line 1215,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString()",
      "begin_line": 1218,
      "end_line": 1249,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 5)-(line 1222,col 5)",
        "(line 1224,col 5)-(line 1224,col 44)",
        "(line 1225,col 5)-(line 1225,col 27)",
        "(line 1226,col 5)-(line 1226,col 51)",
        "(line 1227,col 5)-(line 1227,col 61)",
        "(line 1228,col 5)-(line 1231,col 5)",
        "(line 1232,col 5)-(line 1244,col 5)",
        "(line 1245,col 5)-(line 1245,col 18)",
        "(line 1246,col 5)-(line 1246,col 19)",
        "(line 1247,col 5)-(line 1247,col 56)",
        "(line 1248,col 5)-(line 1248,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1251,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1252,col 5)-(line 1256,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.cloneWithoutArrowType()",
      "begin_line": 1260,
      "end_line": 1267,
      "comment": " Create a new constructor with the parameters and return type stripped. ",
      "child_ranges": [
        "(line 1261,col 5)-(line 1264,col 27)",
        "(line 1265,col 5)-(line 1265,col 50)",
        "(line 1266,col 5)-(line 1266,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateTypesInternal()",
      "begin_line": 1269,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1271,col 5)-(line 1273,col 38)"
      ]
    }
  ]
}