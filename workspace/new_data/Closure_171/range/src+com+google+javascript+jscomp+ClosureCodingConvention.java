{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ClosureCodingConvention.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureCodingConvention",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConventions.Proxy"
      ],
      "begin_line": 39,
      "end_line": 472,
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
      "end_line": 155,
      "comment": "\n   * {@inheritDoc}\n   *\n   * \u003cp\u003eUnderstands several different inheritance patterns that occur in\n   * Google code (various uses of {@code inherits} and {@code mixin}).\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 48)",
        "(line 98,col 5)-(line 100,col 5)",
        "(line 102,col 5)-(line 102,col 45)",
        "(line 103,col 5)-(line 103,col 58)",
        "(line 104,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 154,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 183,
      "comment": "\n   * Determines whether the given node is a class-defining name, like\n   * \"inherits\" or \"mixin.\"\n   * @return The type of class-defining name, or null.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 29)",
        "(line 165,col 5)-(line 173,col 5)",
        "(line 175,col 5)-(line 181,col 5)",
        "(line 182,col 5)-(line 182,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isSuperClassReference(java.lang.String)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 188,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.endsWithPrototype(com.google.javascript.rhino.Node)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n   * Given a qualified name node, returns whether \"prototype\" is at the end.\n   * For example:\n   * a.b.c \u003d\u003e false\n   * a.b.c.prototype \u003d\u003e true\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 199,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n   * Extracts X from goog.provide(\u0027X\u0027), if the applied Node is goog.\n   *\n   * @return The extracted class name, or null.\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n   * Extracts X from goog.require(\u0027X\u0027), if the applied Node is goog.\n   *\n   * @return The extracted class name, or null.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 222,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 28)",
        "(line 225,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getExportPropertyFunction()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n   * Use closure\u0027s implementation.\n   * @return closure\u0027s function name for exporting properties.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getExportSymbolFunction()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n   * Use closure\u0027s implementation.\n   * @return closure\u0027s function name for exporting symbols.\n   ",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.identifyTypeDeclarationCall(com.google.javascript.rhino.Node)",
      "begin_line": 258,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 38)",
        "(line 261,col 5)-(line 274,col 5)",
        "(line 275,col 5)-(line 275,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getAbstractMethodName()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 280,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getSingletonGetterClassName(com.google.javascript.rhino.Node)",
      "begin_line": 283,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 44)",
        "(line 286,col 5)-(line 286,col 49)",
        "(line 289,col 5)-(line 293,col 5)",
        "(line 295,col 5)-(line 295,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 298,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 69)",
        "(line 302,col 5)-(line 303,col 34)",
        "(line 304,col 5)-(line 305,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getGlobalObject()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "propertyTestFunctions"
      ],
      "begin_line": 313,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(com.google.javascript.rhino.Node)",
      "begin_line": 318,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 47)",
        "(line 321,col 5)-(line 323,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getObjectLiteralCast(com.google.javascript.rhino.Node)",
      "begin_line": 326,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 51)",
        "(line 329,col 5)-(line 329,col 71)",
        "(line 330,col 5)-(line 332,col 5)",
        "(line 334,col 5)-(line 334,col 45)",
        "(line 335,col 5)-(line 338,col 5)",
        "(line 340,col 5)-(line 340,col 39)",
        "(line 341,col 5)-(line 343,col 5)",
        "(line 345,col 5)-(line 345,col 41)",
        "(line 346,col 5)-(line 348,col 5)",
        "(line 350,col 5)-(line 351,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isOptionalParameter(com.google.javascript.rhino.Node)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 356,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isVarArgsParameter(com.google.javascript.rhino.Node)",
      "begin_line": 359,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.isPrivate(java.lang.String)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getAssertionFunctions()",
      "begin_line": 369,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 371,col 5)-(line 384,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.describeFunctionBind(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 387,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 61)",
        "(line 390,col 5)-(line 392,col 5)",
        "(line 394,col 5)-(line 396,col 5)",
        "(line 398,col 5)-(line 398,col 40)",
        "(line 399,col 5)-(line 399,col 48)",
        "(line 400,col 5)-(line 423,col 5)",
        "(line 425,col 5)-(line 425,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.getIndirectlyDeclaredProperties()",
      "begin_line": 428,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.safeNext(com.google.javascript.rhino.Node)",
      "begin_line": 433,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 436,col 5)",
        "(line 437,col 5)-(line 437,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AssertInstanceofSpec",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec"
      ],
      "begin_line": 444,
      "end_line": 469,
      "comment": "\n   * A function that will throw an exception when if the value is not\n   * an instanceof a specific type.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.AssertInstanceofSpec.AssertInstanceofSpec(java.lang.String)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 7)-(line 446,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodingConvention.AssertInstanceofSpec.getAssertedType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 453,
      "end_line": 468,
      "comment": "\n     * Returns the type for a type assertion, or null if the function asserts\n     * that the node must not be null or undefined.\n     ",
      "child_ranges": [
        "(line 455,col 7)-(line 466,col 7)",
        "(line 467,col 7)-(line 467,col 51)"
      ]
    }
  ]
}