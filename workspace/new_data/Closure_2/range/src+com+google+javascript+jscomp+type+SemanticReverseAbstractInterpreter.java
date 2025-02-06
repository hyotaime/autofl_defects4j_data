{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/type/SemanticReverseAbstractInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemanticReverseAbstractInterpreter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"
      ],
      "begin_line": 41,
      "end_line": 602,
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
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-b6068f9e-3da0-4d29-ad9e-416d5687eca6.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
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
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-40057bde-5e30-454f-b687-b3eea86ebc75.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
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
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-4a2c4c53-1696-4469-9f8a-22632116eeab.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
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
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-0694e5fa-6c9a-47d4-8310-612bc9113331.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
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
        "INEQ"
      ],
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n   * Merging function for inequality comparisons between types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.Anonymous-47e39f1b-0a95-4e28-9613-cf0bbdaf5caa.apply(com.google.javascript.rhino.jstype.JSType.TypePair)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.SemanticReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n   * Creates a semantic reverse abstract interpreter.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 124,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 44)",
        "(line 129,col 5)-(line 168,col 5)",
        "(line 169,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 263,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function\u003ccom.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair\u003e)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 269,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function\u003ccom.google.javascript.rhino.jstype.JSType.TypePair, com.google.javascript.rhino.jstype.JSType.TypePair\u003e)",
      "begin_line": 272,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 59)",
        "(line 276,col 5)-(line 276,col 29)",
        "(line 277,col 5)-(line 282,col 5)",
        "(line 285,col 5)-(line 285,col 61)",
        "(line 286,col 5)-(line 286,col 30)",
        "(line 287,col 5)-(line 292,col 5)",
        "(line 295,col 5)-(line 295,col 71)",
        "(line 298,col 5)-(line 303,col 5)",
        "(line 304,col 5)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 307,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 59)",
        "(line 311,col 5)-(line 311,col 29)",
        "(line 312,col 5)-(line 319,col 5)",
        "(line 322,col 5)-(line 323,col 67)",
        "(line 324,col 5)-(line 327,col 5)",
        "(line 330,col 5)-(line 330,col 61)",
        "(line 331,col 5)-(line 331,col 30)",
        "(line 332,col 5)-(line 339,col 5)",
        "(line 341,col 5)-(line 350,col 5)",
        "(line 351,col 5)-(line 351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 354,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 357,col 38)",
        "(line 358,col 5)-(line 358,col 77)",
        "(line 359,col 5)-(line 361,col 5)",
        "(line 362,col 5)-(line 363,col 37)",
        "(line 364,col 5)-(line 365,col 39)",
        "(line 366,col 5)-(line 366,col 79)",
        "(line 367,col 5)-(line 369,col 5)",
        "(line 370,col 5)-(line 370,col 74)",
        "(line 371,col 5)-(line 371,col 59)",
        "(line 372,col 5)-(line 372,col 52)",
        "(line 373,col 5)-(line 373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 392,
      "end_line": 400,
      "comment": "\n   * If the restrictedType differs from the originalType, then we should\n   * branch the current flow scope and create a new flow scope with the name\n   * declared with the new type.\n   *\n   * We try not to create spurious child flow scopes as this makes type\n   * inference slower.\n   *\n   * We also do not want spurious slots around in type inference, because\n   * we use these as a signal for \"checked unknown\" types. A \"checked unknown\"\n   * type is a symbol that the programmer has already checked and verified that\n   * it\u0027s defined, even if we don\u0027t know what it is.\n   *\n   * It is OK to pass non-name nodes into this method, as long as you pass\n   * in {@code null} for a restricted type.\n   ",
      "child_ranges": [
        "(line 394,col 5)-(line 398,col 5)",
        "(line 399,col 5)-(line 399,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 405,
      "end_line": 424,
      "comment": "\n   * @see #maybeRestrictName\n   ",
      "child_ranges": [
        "(line 409,col 5)-(line 410,col 77)",
        "(line 411,col 5)-(line 412,col 80)",
        "(line 413,col 5)-(line 422,col 5)",
        "(line 423,col 5)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 426,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 428,col 5)-(line 428,col 55)",
        "(line 429,col 5)-(line 433,col 5)",
        "(line 434,col 5)-(line 434,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 437,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 441,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseInstanceOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 444,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 59)",
        "(line 447,col 5)-(line 449,col 5)",
        "(line 450,col 5)-(line 450,col 41)",
        "(line 451,col 5)-(line 452,col 68)",
        "(line 453,col 5)-(line 455,col 5)",
        "(line 456,col 5)-(line 456,col 28)",
        "(line 457,col 5)-(line 461,col 5)",
        "(line 462,col 5)-(line 463,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 473,
      "end_line": 498,
      "comment": "\n   * Given \u0027property in object\u0027, ensures that the object has the property in the\n   * informed scope by defining it as a qualified name if the object type lacks\n   * the property and it\u0027s not in the blind scope.\n   * @param object The node of the right-side of the in.\n   * @param propertyName The string of the left-side of the in.\n   ",
      "child_ranges": [
        "(line 474,col 5)-(line 474,col 39)",
        "(line 475,col 5)-(line 475,col 51)",
        "(line 476,col 5)-(line 476,col 56)",
        "(line 478,col 5)-(line 478,col 32)",
        "(line 479,col 5)-(line 479,col 52)",
        "(line 480,col 5)-(line 482,col 5)",
        "(line 483,col 5)-(line 496,col 5)",
        "(line 497,col 5)-(line 497,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByTrueInstanceOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor"
      ],
      "begin_line": 503,
      "end_line": 552,
      "comment": "\n   * @see SemanticReverseAbstractInterpreter#caseInstanceOf\n   "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 505,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.RestrictByTrueInstanceOfResultVisitor(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 508,col 7)-(line 508,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 513,col 7)-(line 513,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseUnknownType()",
      "begin_line": 516,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 518,col 7)-(line 518,col 67)",
        "(line 519,col 7)-(line 521,col 7)",
        "(line 522,col 7)-(line 522,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 525,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 7)-(line 527,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 530,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 7)-(line 532,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 7)-(line 537,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 540,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 541,col 7)-(line 543,col 7)",
        "(line 545,col 7)-(line 545,col 61)",
        "(line 546,col 7)-(line 548,col 7)",
        "(line 550,col 7)-(line 550,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByFalseInstanceOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor"
      ],
      "begin_line": 557,
      "end_line": 601,
      "comment": "\n   * @see SemanticReverseAbstractInterpreter#caseInstanceOf\n   "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 559,
      "end_line": 559,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.RestrictByFalseInstanceOfResultVisitor(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 7)-(line 562,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 565,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 567,col 7)-(line 569,col 7)",
        "(line 571,col 7)-(line 571,col 61)",
        "(line 572,col 7)-(line 578,col 7)",
        "(line 580,col 7)-(line 580,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 583,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 585,col 7)-(line 587,col 7)",
        "(line 589,col 7)-(line 589,col 61)",
        "(line 590,col 7)-(line 592,col 7)",
        "(line 594,col 7)-(line 594,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.RestrictByFalseInstanceOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 597,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 599,col 7)-(line 599,col 34)"
      ]
    }
  ]
}