{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ClosureCodingConvention.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureCodingConvention",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConventions.Proxy"
      ],
      "begin_line": 39,
      "end_line": 470,
      "comment": "\n * This describes the Closure-specific JavaScript coding conventions.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OBJECTLIT_EXPECTED"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indirectlyDeclaredProperties"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.ClosureCodingConvention()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.ClosureCodingConvention(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 53,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 19)",
        "(line 56,col 5)-(line 59,col 23)",
        "(line 60,col 5)-(line 60,col 60)",
        "(line 61,col 5)-(line 61,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention.SubclassType)",
      "begin_line": 68,
      "end_line": 86,
      "comment": "\n   * Closure\u0027s goog.inherits adds a {@code superClass_} property to the\n   * subclass, and a {@code constructor} property.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 65)",
        "(line 72,col 5)-(line 85,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(com.google.javascript.rhino.Node)",
      "begin_line": 94,
      "end_line": 153,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eUnderstands several different inheritance patterns that occur in\n   * Google code (various uses of {@code inherits} and {@code mixin}).\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 48)",
        "(line 98,col 5)-(line 98,col 50)",
        "(line 100,col 5)-(line 100,col 45)",
        "(line 101,col 5)-(line 101,col 58)",
        "(line 102,col 5)-(line 150,col 5)",
        "(line 152,col 5)-(line 152,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 181,
      "comment": "\n   * Determines whether the given node is a class-defining name, like\n   * \"inherits\" or \"mixin.\"\n   * @return The type of class-defining name, or null.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 29)",
        "(line 163,col 5)-(line 171,col 5)",
        "(line 173,col 5)-(line 179,col 5)",
        "(line 180,col 5)-(line 180,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isSuperClassReference(java.lang.String)",
      "begin_line": 183,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 186,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype(com.google.javascript.rhino.Node)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n   * Given a qualified name node, returns whether \"prototype\" is at the end.\n   * For example:\n   * a.b.c \u003d\u003e false\n   * a.b.c.prototype \u003d\u003e true\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 197,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n   * Extracts X from goog.provide(\u0027X\u0027), if the applied Node is goog.\n   *\n   * @return The extracted class name, or null.\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n   * Extracts X from goog.require(\u0027X\u0027), if the applied Node is goog.\n   *\n   * @return The extracted class name, or null.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 220,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 28)",
        "(line 223,col 5)-(line 234,col 5)",
        "(line 235,col 5)-(line 235,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getExportPropertyFunction()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n   * Use closure\u0027s implementation.\n   * @return closure\u0027s function name for exporting properties.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getExportSymbolFunction()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n   * Use closure\u0027s implementation.\n   * @return closure\u0027s function name for exporting symbols.\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall(com.google.javascript.rhino.Node)",
      "begin_line": 256,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 38)",
        "(line 259,col 5)-(line 272,col 5)",
        "(line 273,col 5)-(line 273,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getAbstractMethodName()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName(com.google.javascript.rhino.Node)",
      "begin_line": 281,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 44)",
        "(line 284,col 5)-(line 284,col 49)",
        "(line 287,col 5)-(line 291,col 5)",
        "(line 293,col 5)-(line 293,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 296,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 69)",
        "(line 300,col 5)-(line 301,col 34)",
        "(line 302,col 5)-(line 303,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getGlobalObject()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "propertyTestFunctions"
      ],
      "begin_line": 311,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(com.google.javascript.rhino.Node)",
      "begin_line": 316,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 318,col 47)",
        "(line 319,col 5)-(line 321,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast(com.google.javascript.rhino.Node)",
      "begin_line": 324,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 51)",
        "(line 327,col 5)-(line 327,col 71)",
        "(line 328,col 5)-(line 330,col 5)",
        "(line 332,col 5)-(line 332,col 45)",
        "(line 333,col 5)-(line 336,col 5)",
        "(line 338,col 5)-(line 338,col 39)",
        "(line 339,col 5)-(line 341,col 5)",
        "(line 343,col 5)-(line 343,col 41)",
        "(line 344,col 5)-(line 346,col 5)",
        "(line 348,col 5)-(line 349,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isOptionalParameter(com.google.javascript.rhino.Node)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isVarArgsParameter(com.google.javascript.rhino.Node)",
      "begin_line": 357,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isPrivate(java.lang.String)",
      "begin_line": 362,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getAssertionFunctions()",
      "begin_line": 367,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 369,col 5)-(line 382,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.describeFunctionBind(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 385,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 61)",
        "(line 388,col 5)-(line 390,col 5)",
        "(line 392,col 5)-(line 394,col 5)",
        "(line 396,col 5)-(line 396,col 40)",
        "(line 397,col 5)-(line 397,col 48)",
        "(line 398,col 5)-(line 421,col 5)",
        "(line 423,col 5)-(line 423,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getIndirectlyDeclaredProperties()",
      "begin_line": 426,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 428,col 5)-(line 428,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.safeNext(com.google.javascript.rhino.Node)",
      "begin_line": 431,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 432,col 5)-(line 434,col 5)",
        "(line 435,col 5)-(line 435,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AssertInstanceofSpec",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec"
      ],
      "begin_line": 442,
      "end_line": 467,
      "comment": "\n   * A function that will throw an exception when if the value is not\n   * an instanceof a specific type.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.AssertInstanceofSpec.AssertInstanceofSpec(java.lang.String)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 7)-(line 444,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.AssertInstanceofSpec.getAssertedType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 451,
      "end_line": 466,
      "comment": "\n     * Returns the type for a type assertion, or null if the function asserts\n     * that the node must not be null or undefined.\n     ",
      "child_ranges": [
        "(line 453,col 7)-(line 464,col 7)",
        "(line 465,col 7)-(line 465,col 51)"
      ]
    }
  ]
}