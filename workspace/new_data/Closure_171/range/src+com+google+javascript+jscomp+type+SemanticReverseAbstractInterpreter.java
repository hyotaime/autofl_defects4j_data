{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/type/SemanticReverseAbstractInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemanticReverseAbstractInterpreter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"
      ],
      "begin_line": 41,
      "end_line": 606,
      "comment": "\n * A reverse abstract interpreter using the semantics of the JavaScript\n * language as a means to reverse interpret computations. This interpreter\n * expects the parse tree inputs to be typed.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EQ"
      ],
      "begin_line": 47,
      "end_line": 56,
      "comment": "\n   * Merging function for equality between types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-fecc83b8-e687-4ee7-9a22-a814195ac73e.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NE"
      ],
      "begin_line": 61,
      "end_line": 70,
      "comment": "\n   * Merging function for non-equality between types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-aafef006-fa05-4577-bf45-29e6a503cbb2.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
      "begin_line": 63,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SHEQ"
      ],
      "begin_line": 75,
      "end_line": 85,
      "comment": "\n   * Merging function for strict equality between types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-ac3ac8e8-cba7-4792-8dcc-0165b2894544.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SHNE"
      ],
      "begin_line": 90,
      "end_line": 100,
      "comment": "\n   * Merging function for strict non-equality between types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-c81ad2f2-a926-4feb-a97a-06dbd69fd79f.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 63)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ineq"
      ],
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n   * Merging function for inequality comparisons between types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-55c4a0c5-e996-489c-a7a6-360fba5de9ef.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.SemanticReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n   * Creates a semantic reverse abstract interpreter.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 123,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 44)",
        "(line 128,col 5)-(line 167,col 5)",
        "(line 168,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 262,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function\u003ccom.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair\u003e)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 268,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function\u003ccom.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair\u003e)",
      "begin_line": 271,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 59)",
        "(line 275,col 5)-(line 275,col 29)",
        "(line 276,col 5)-(line 281,col 5)",
        "(line 284,col 5)-(line 284,col 61)",
        "(line 285,col 5)-(line 285,col 30)",
        "(line 286,col 5)-(line 291,col 5)",
        "(line 294,col 5)-(line 294,col 71)",
        "(line 297,col 5)-(line 302,col 5)",
        "(line 303,col 5)-(line 303,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 306,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 59)",
        "(line 310,col 5)-(line 310,col 29)",
        "(line 311,col 5)-(line 318,col 5)",
        "(line 321,col 5)-(line 322,col 67)",
        "(line 323,col 5)-(line 326,col 5)",
        "(line 329,col 5)-(line 329,col 61)",
        "(line 330,col 5)-(line 330,col 30)",
        "(line 331,col 5)-(line 338,col 5)",
        "(line 340,col 5)-(line 349,col 5)",
        "(line 350,col 5)-(line 350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 353,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 356,col 38)",
        "(line 357,col 5)-(line 357,col 77)",
        "(line 358,col 5)-(line 364,col 5)",
        "(line 365,col 5)-(line 366,col 37)",
        "(line 367,col 5)-(line 368,col 39)",
        "(line 369,col 5)-(line 369,col 79)",
        "(line 370,col 5)-(line 373,col 5)",
        "(line 374,col 5)-(line 374,col 74)",
        "(line 375,col 5)-(line 375,col 59)",
        "(line 376,col 5)-(line 376,col 52)",
        "(line 377,col 5)-(line 377,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 396,
      "end_line": 404,
      "comment": "\n   * If the restrictedType differs from the originalType, then we should\n   * branch the current flow scope and create a new flow scope with the name\n   * declared with the new type.\n   *\n   * We try not to create spurious child flow scopes as this makes type\n   * inference slower.\n   *\n   * We also do not want spurious slots around in type inference, because\n   * we use these as a signal for \"checked unknown\" types. A \"checked unknown\"\n   * type is a symbol that the programmer has already checked and verified that\n   * it\u0027s defined, even if we don\u0027t know what it is.\n   *\n   * It is OK to pass non-name nodes into this method, as long as you pass\n   * in {@code null} for a restricted type.\n   ",
      "child_ranges": [
        "(line 398,col 5)-(line 402,col 5)",
        "(line 403,col 5)-(line 403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 409,
      "end_line": 428,
      "comment": "\n   * @see #maybeRestrictName\n   ",
      "child_ranges": [
        "(line 413,col 5)-(line 414,col 77)",
        "(line 415,col 5)-(line 416,col 80)",
        "(line 417,col 5)-(line 426,col 5)",
        "(line 427,col 5)-(line 427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 430,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 432,col 5)-(line 432,col 55)",
        "(line 433,col 5)-(line 437,col 5)",
        "(line 438,col 5)-(line 438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 441,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 445,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseInstanceOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 448,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 59)",
        "(line 451,col 5)-(line 453,col 5)",
        "(line 454,col 5)-(line 454,col 41)",
        "(line 455,col 5)-(line 456,col 68)",
        "(line 457,col 5)-(line 459,col 5)",
        "(line 460,col 5)-(line 460,col 28)",
        "(line 461,col 5)-(line 465,col 5)",
        "(line 466,col 5)-(line 467,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 477,
      "end_line": 502,
      "comment": "\n   * Given \u0027property in object\u0027, ensures that the object has the property in the\n   * informed scope by defining it as a qualified name if the object type lacks\n   * the property and it\u0027s not in the blind scope.\n   * @param object The node of the right-side of the in.\n   * @param propertyName The string of the left-side of the in.\n   ",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 39)",
        "(line 479,col 5)-(line 479,col 51)",
        "(line 480,col 5)-(line 480,col 56)",
        "(line 482,col 5)-(line 482,col 32)",
        "(line 483,col 5)-(line 483,col 52)",
        "(line 484,col 5)-(line 486,col 5)",
        "(line 487,col 5)-(line 500,col 5)",
        "(line 501,col 5)-(line 501,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByTrueInstanceOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor"
      ],
      "begin_line": 507,
      "end_line": 556,
      "comment": "\n   * @see SemanticReverseAbstractInterpreter#caseInstanceOf\n   "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.RestrictByTrueInstanceOfResultVisitor(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 7)-(line 512,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 7)-(line 517,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseUnknownType()",
      "begin_line": 520,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 522,col 7)-(line 522,col 67)",
        "(line 523,col 7)-(line 525,col 7)",
        "(line 526,col 7)-(line 526,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 529,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 7)-(line 531,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 7)-(line 536,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 539,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 7)-(line 541,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 544,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 545,col 7)-(line 547,col 7)",
        "(line 549,col 7)-(line 549,col 61)",
        "(line 550,col 7)-(line 552,col 7)",
        "(line 554,col 7)-(line 554,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByFalseInstanceOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor"
      ],
      "begin_line": 561,
      "end_line": 605,
      "comment": "\n   * @see SemanticReverseAbstractInterpreter#caseInstanceOf\n   "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 563,
      "end_line": 563,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.RestrictByFalseInstanceOfResultVisitor(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 7)-(line 566,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 569,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 571,col 7)-(line 573,col 7)",
        "(line 575,col 7)-(line 575,col 61)",
        "(line 576,col 7)-(line 582,col 7)",
        "(line 584,col 7)-(line 584,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 587,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 589,col 7)-(line 591,col 7)",
        "(line 593,col 7)-(line 593,col 61)",
        "(line 594,col 7)-(line 596,col 7)",
        "(line 598,col 7)-(line 598,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 601,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 7)-(line 603,col 34)"
      ]
    }
  ]
}