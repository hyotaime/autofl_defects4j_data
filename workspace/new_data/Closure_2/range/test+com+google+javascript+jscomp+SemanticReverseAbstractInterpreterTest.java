{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/SemanticReverseAbstractInterpreterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemanticReverseAbstractInterpreterTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTypeTestCase"
      ],
      "begin_line": 30,
      "end_line": 609,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "interpreter"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionScope"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.setUp()",
      "begin_line": 36,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 18)",
        "(line 40,col 5)-(line 41,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.newScope()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 71)",
        "(line 46,col 5)-(line 46,col 66)",
        "(line 47,col 5)-(line 47,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testNameCondition()",
      "begin_line": 53,
      "end_line": 67,
      "comment": "\n   * Tests reverse interpretation of a NAME expression.\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 33)",
        "(line 55,col 5)-(line 55,col 76)",
        "(line 58,col 5)-(line 59,col 72)",
        "(line 60,col 5)-(line 60,col 65)",
        "(line 63,col 5)-(line 64,col 73)",
        "(line 65,col 5)-(line 66,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testNegatedNameCondition()",
      "begin_line": 72,
      "end_line": 88,
      "comment": "\n   * Tests reverse interpretation of a NOT(NAME) expression.\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 33)",
        "(line 74,col 5)-(line 74,col 68)",
        "(line 75,col 5)-(line 75,col 41)",
        "(line 76,col 5)-(line 76,col 32)",
        "(line 79,col 5)-(line 80,col 72)",
        "(line 81,col 5)-(line 82,col 39)",
        "(line 85,col 5)-(line 86,col 73)",
        "(line 87,col 5)-(line 87,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testAssignCondition1()",
      "begin_line": 93,
      "end_line": 106,
      "comment": "\n   * Tests reverse interpretation of a ASSIGN expression.\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 33)",
        "(line 96,col 5)-(line 105,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testSheqCondition1()",
      "begin_line": 111,
      "end_line": 121,
      "comment": "\n   * Tests reverse interpretation of a SHEQ(NAME, NUMBER) expression.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 33)",
        "(line 114,col 5)-(line 120,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testSheqCondition2()",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n   * Tests reverse interpretation of a SHEQ(NUMBER, NAME) expression.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 33)",
        "(line 129,col 5)-(line 135,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testSheqCondition3()",
      "begin_line": 141,
      "end_line": 154,
      "comment": "\n   * Tests reverse interpretation of a SHEQ(NAME, NAME) expression.\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 33)",
        "(line 144,col 5)-(line 153,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testSheqCondition4()",
      "begin_line": 156,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 33)",
        "(line 159,col 5)-(line 166,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testSheqCondition5()",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 33)",
        "(line 172,col 5)-(line 179,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testSheqCondition6()",
      "begin_line": 182,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 33)",
        "(line 185,col 5)-(line 196,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testShneCondition1()",
      "begin_line": 202,
      "end_line": 212,
      "comment": "\n   * Tests reverse interpretation of a SHNE(NAME, NUMBER) expression.\n   ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 33)",
        "(line 205,col 5)-(line 211,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testShneCondition2()",
      "begin_line": 217,
      "end_line": 227,
      "comment": "\n   * Tests reverse interpretation of a SHNE(NUMBER, NAME) expression.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 33)",
        "(line 220,col 5)-(line 226,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testShneCondition3()",
      "begin_line": 232,
      "end_line": 245,
      "comment": "\n   * Tests reverse interpretation of a SHNE(NAME, NAME) expression.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 33)",
        "(line 235,col 5)-(line 244,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testShneCondition4()",
      "begin_line": 247,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 33)",
        "(line 250,col 5)-(line 257,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testShneCondition5()",
      "begin_line": 260,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 33)",
        "(line 263,col 5)-(line 270,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testShneCondition6()",
      "begin_line": 273,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 33)",
        "(line 276,col 5)-(line 287,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testEqCondition1()",
      "begin_line": 293,
      "end_line": 302,
      "comment": "\n   * Tests reverse interpretation of a EQ(NAME, NULL) expression.\n   ",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 33)",
        "(line 296,col 5)-(line 301,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testEqCondition2()",
      "begin_line": 307,
      "end_line": 316,
      "comment": "\n   * Tests reverse interpretation of a NE(NULL, NAME) expression.\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 33)",
        "(line 310,col 5)-(line 315,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testEqCondition3()",
      "begin_line": 321,
      "end_line": 336,
      "comment": "\n   * Tests reverse interpretation of a EQ(NAME, NULL) expression.\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 33)",
        "(line 325,col 5)-(line 326,col 59)",
        "(line 328,col 5)-(line 329,col 46)",
        "(line 330,col 5)-(line 335,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testEqCondition4()",
      "begin_line": 341,
      "end_line": 354,
      "comment": "\n   * Tests reverse interpretation of two undefineds.\n   ",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 33)",
        "(line 344,col 5)-(line 353,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInequalitiesCondition1()",
      "begin_line": 360,
      "end_line": 373,
      "comment": "\n   * Tests reverse interpretation of a COMPARE(NAME, NUMBER) expression,\n   * where COMPARE can be LE, LT, GE or GT.\n   ",
      "child_ranges": [
        "(line 362,col 5)-(line 372,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInequalitiesCondition2()",
      "begin_line": 379,
      "end_line": 400,
      "comment": "\n   * Tests reverse interpretation of a COMPARE(NAME, NAME) expression,\n   * where COMPARE can be LE, LT, GE or GT.\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 399,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInequalitiesCondition3()",
      "begin_line": 406,
      "end_line": 419,
      "comment": "\n   * Tests reverse interpretation of a COMPARE(NUMBER-untyped, NAME) expression,\n   * where COMPARE can be LE, LT, GE or GT.\n   ",
      "child_ranges": [
        "(line 408,col 5)-(line 418,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testAnd()",
      "begin_line": 421,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 33)",
        "(line 424,col 5)-(line 433,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testTypeof1()",
      "begin_line": 436,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 33)",
        "(line 439,col 5)-(line 446,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testTypeof2()",
      "begin_line": 449,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 451,col 33)",
        "(line 452,col 5)-(line 459,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testTypeof3()",
      "begin_line": 462,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 33)",
        "(line 465,col 5)-(line 473,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testTypeof4()",
      "begin_line": 476,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 33)",
        "(line 479,col 5)-(line 488,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInstanceOf()",
      "begin_line": 491,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 493,col 5)-(line 493,col 33)",
        "(line 494,col 5)-(line 502,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInstanceOf2()",
      "begin_line": 505,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 507,col 5)-(line 507,col 33)",
        "(line 508,col 5)-(line 518,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInstanceOf3()",
      "begin_line": 521,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 523,col 5)-(line 523,col 33)",
        "(line 524,col 5)-(line 533,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testInstanceOf4()",
      "begin_line": 536,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 33)",
        "(line 539,col 5)-(line 547,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.testBinop(com.google.javascript.jscomp.type.FlowScope, int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Collection\u003ccom.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.TypedName\u003e, java.util.Collection\u003ccom.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.TypedName\u003e)",
      "begin_line": 550,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 553,col 5)-(line 553,col 37)",
        "(line 554,col 5)-(line 554,col 35)",
        "(line 555,col 5)-(line 555,col 36)",
        "(line 558,col 5)-(line 559,col 72)",
        "(line 560,col 5)-(line 562,col 5)",
        "(line 565,col 5)-(line 566,col 73)",
        "(line 567,col 5)-(line 569,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.createNull()",
      "begin_line": 572,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 34)",
        "(line 574,col 5)-(line 574,col 27)",
        "(line 575,col 5)-(line 575,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.createNumber(int)",
      "begin_line": 578,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 579,col 5)-(line 579,col 41)",
        "(line 580,col 5)-(line 580,col 34)",
        "(line 581,col 5)-(line 581,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.createUntypedNumber(int)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 5)-(line 585,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.getVarType(com.google.javascript.jscomp.type.FlowScope, java.lang.String)",
      "begin_line": 588,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.createVar(com.google.javascript.jscomp.type.FlowScope, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 592,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 593,col 5)-(line 593,col 46)",
        "(line 594,col 5)-(line 594,col 47)",
        "(line 595,col 5)-(line 595,col 56)",
        "(line 596,col 5)-(line 596,col 22)",
        "(line 597,col 5)-(line 597,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypedName",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 600,
      "end_line": 608,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 602,
      "end_line": 602,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest.TypedName.TypedName(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 604,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 23)",
        "(line 606,col 7)-(line 606,col 23)"
      ]
    }
  ]
}