{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CodingConventions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodingConventions",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 477,
      "comment": "\n * Helper classes for dealing with coding conventions.\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConventions.CodingConventions()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.getDefault()",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Gets the default coding convention. ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Proxy",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConvention"
      ],
      "begin_line": 55,
      "end_line": 242,
      "comment": "\n   * A convention that wraps another.\n   *\n   * When you want to support a new library, you should subclass this\n   * delegate, and override the methods that you want to customize.\n   *\n   * This way, a person using jQuery and Closure Library can create a new\n   * coding convention by creating a jQueryCodingConvention that delegates\n   * to a ClosureCodingConvention that delegates to a DefaultCodingConvention.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nextConvention"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.Proxy(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 7)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isConstant(java.lang.String)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 7)-(line 65,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isConstantKey(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isValidEnumKey(java.lang.String)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 7)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isOptionalParameter(com.google.javascript.rhino.Node)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 7)-(line 79,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isVarArgsParameter(com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 7)-(line 84,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isExported(java.lang.String, boolean)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isExported(java.lang.String)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isPrivate(java.lang.String)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 7)-(line 100,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getClassesDefinedByCall(com.google.javascript.rhino.Node)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 7)-(line 105,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isSuperClassReference(java.lang.String)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 110,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 7)-(line 120,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getExportPropertyFunction()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getExportSymbolFunction()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.identifyTypeDeclarationCall(com.google.javascript.rhino.Node)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention.SubclassType)",
      "begin_line": 138,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 7)-(line 142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getAbstractMethodName()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getSingletonGetterClassName(com.google.javascript.rhino.Node)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 7)-(line 159,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isInlinableFunction(com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getDelegateRelationship(com.google.javascript.rhino.Node)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.applyDelegateRelationship(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 172,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 177,col 7)-(line 179,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getDelegateSuperclassName()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 7)-(line 184,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 187,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 7)-(line 191,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.defineDelegateProxyPrototypeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 194,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 200,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getGlobalObject()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 7)-(line 205,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getAssertionFunctions()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 7)-(line 210,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.describeFunctionBind(com.google.javascript.rhino.Node)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 7)-(line 215,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.describeFunctionBind(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 7)-(line 220,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isPropertyTestFunction(com.google.javascript.rhino.Node)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 7)-(line 225,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.isPrototypeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getObjectLiteralCast(com.google.javascript.rhino.Node)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 7)-(line 235,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.Proxy.getIndirectlyDeclaredProperties()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultCodingConvention",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodingConvention"
      ],
      "begin_line": 249,
      "end_line": 476,
      "comment": "\n   * The default coding convention.\n   * Should be at the bottom of all proxy chains.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isConstant(java.lang.String)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 7)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isConstantKey(java.lang.String)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 7)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isValidEnumKey(java.lang.String)",
      "begin_line": 263,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 7)-(line 265,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isOptionalParameter(com.google.javascript.rhino.Node)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isVarArgsParameter(com.google.javascript.rhino.Node)",
      "begin_line": 275,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isExported(java.lang.String, boolean)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 7)-(line 283,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isExported(java.lang.String)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isPrivate(java.lang.String)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getClassesDefinedByCall(com.google.javascript.rhino.Node)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isSuperClassReference(java.lang.String)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.extractClassNameIfProvide(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 306,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 68)",
        "(line 309,col 7)-(line 309,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.extractClassNameIfRequire(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 68)",
        "(line 315,col 7)-(line 315,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getExportPropertyFunction()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 320,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getExportSymbolFunction()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 7)-(line 325,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.identifyTypeDeclarationCall(com.google.javascript.rhino.Node)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 7)-(line 330,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.CodingConvention.SubclassType)",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getAbstractMethodName()",
      "begin_line": 339,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 7)-(line 341,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getSingletonGetterClassName(com.google.javascript.rhino.Node)",
      "begin_line": 344,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 7)-(line 346,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 349,
      "end_line": 353,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isInlinableFunction(com.google.javascript.rhino.Node)",
      "begin_line": 355,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 357,col 7)-(line 357,col 47)",
        "(line 358,col 7)-(line 358,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getDelegateRelationship(com.google.javascript.rhino.Node)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 7)-(line 363,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.applyDelegateRelationship(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 366,
      "end_line": 372,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getDelegateSuperclassName()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 7)-(line 376,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 379,
      "end_line": 383,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.defineDelegateProxyPrototypeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, java.util.List\u003ccom.google.javascript.rhino.jstype.ObjectType\u003e, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 385,
      "end_line": 391,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getGlobalObject()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isPropertyTestFunction(com.google.javascript.rhino.Node)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 7)-(line 400,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.isPrototypeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 403,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 405,col 7)-(line 405,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getObjectLiteralCast(com.google.javascript.rhino.Node)",
      "begin_line": 408,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 7)-(line 410,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getAssertionFunctions()",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 7)-(line 415,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.describeFunctionBind(com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 420,col 7)-(line 420,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.describeFunctionBind(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 423,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 425,col 7)-(line 427,col 7)",
        "(line 429,col 7)-(line 429,col 42)",
        "(line 430,col 7)-(line 430,col 50)",
        "(line 431,col 7)-(line 442,col 7)",
        "(line 444,col 7)-(line 460,col 7)",
        "(line 462,col 7)-(line 462,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.getIndirectlyDeclaredProperties()",
      "begin_line": 465,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 7)-(line 467,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention.safeNext(com.google.javascript.rhino.Node)",
      "begin_line": 470,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 471,col 7)-(line 473,col 7)",
        "(line 474,col 7)-(line 474,col 18)"
      ]
    }
  ]
}