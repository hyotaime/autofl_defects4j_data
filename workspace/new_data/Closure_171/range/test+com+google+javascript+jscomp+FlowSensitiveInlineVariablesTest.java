{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/FlowSensitiveInlineVariablesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FlowSensitiveInlineVariablesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 592,
      "comment": "\n * Unit tests for {@link FlowSensitiveInlineVariables}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERN_FUNCTIONS"
      ],
      "begin_line": 27,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.FlowSensitiveInlineVariablesTest()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.getNumRepetitions()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 42,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 51,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.Anonymous-b90c5dc5-0c20-41cb-afab-782f20fd2450.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 69)",
        "(line 49,col 9)-(line 49,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testSimpleAssign()",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 56)",
        "(line 56,col 5)-(line 56,col 42)",
        "(line 57,col 5)-(line 57,col 58)",
        "(line 58,col 5)-(line 58,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testSimpleVar()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 53)",
        "(line 63,col 5)-(line 63,col 39)",
        "(line 64,col 5)-(line 64,col 55)",
        "(line 65,col 5)-(line 65,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testSimpleForIn()",
      "begin_line": 68,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 70,col 32)",
        "(line 71,col 5)-(line 71,col 54)",
        "(line 72,col 5)-(line 72,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testExported()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineIncrement()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 32)",
        "(line 81,col 5)-(line 81,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineAssignmentOp()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 35)",
        "(line 86,col 5)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineIntoLhsOfAssign()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testMultiUse()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testMultiUseInSameCfgNode()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testMultiUseInTwoDifferentPath()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testAssignmentBeforeDefinition()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testVarInConditionPath()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testMultiDefinitionsBeforeUse()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testMultiDefinitionsInSameCfgNode()",
      "begin_line": 117,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 52)",
        "(line 119,col 5)-(line 119,col 52)",
        "(line 120,col 5)-(line 120,col 51)",
        "(line 121,col 5)-(line 121,col 51)",
        "(line 122,col 5)-(line 122,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNotReachingDefinitions()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineLoopCarriedDefinition()",
      "begin_line": 129,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 56)",
        "(line 134,col 5)-(line 134,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotExitLoop()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineWithinLoop()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineCatchExpression1()",
      "begin_line": 145,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineCatchExpression1a()",
      "begin_line": 156,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 164,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineCatchExpression2()",
      "begin_line": 167,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 175,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineCatchExpression3()",
      "begin_line": 178,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 187,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDoNotInlineCatchExpression4()",
      "begin_line": 190,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 198,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDefinitionAfterUse()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineSameVariableInStraightLine()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 207,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineInDifferentPaths()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 212,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineInMergedPath()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 217,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineIntoExpressions()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions1()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions2()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions3()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 235,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions4()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions5()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions6()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression7()",
      "begin_line": 251,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 51)",
        "(line 258,col 5)-(line 258,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression8()",
      "begin_line": 261,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 267,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression9()",
      "begin_line": 270,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 276,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression10()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions11()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 64)",
        "(line 286,col 5)-(line 286,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions12()",
      "begin_line": 289,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 292,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions13()",
      "begin_line": 295,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 310,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineIfDefinitionMayNotReach()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 5)-(line 314,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineEscapedToInnerFunction()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 318,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineLValue()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testSwitchCase()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testShadowedVariableInnerFunction()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 330,col 5)-(line 331,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testCatch()",
      "begin_line": 334,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 49)",
        "(line 336,col 5)-(line 336,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetProp()",
      "begin_line": 339,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetProp2()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetProp3()",
      "begin_line": 348,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 351,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetEle()",
      "begin_line": 354,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 356,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineConstructors()",
      "begin_line": 360,
      "end_line": 362,
      "comment": " TODO(user): These should be inlinable.",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineArrayLits()",
      "begin_line": 365,
      "end_line": 367,
      "comment": " TODO(user): These should be inlinable.",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineObjectLits()",
      "begin_line": 370,
      "end_line": 372,
      "comment": " TODO(user): These should be inlinable.",
      "child_ranges": [
        "(line 371,col 5)-(line 371,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineRegExpLits()",
      "begin_line": 375,
      "end_line": 377,
      "comment": " TODO(user): These should be inlinable after the REGEX checks.",
      "child_ranges": [
        "(line 376,col 5)-(line 376,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineConstructorCallsIntoLoop()",
      "begin_line": 379,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 382,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testRemoveWithLabels()",
      "begin_line": 385,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 72)",
        "(line 387,col 5)-(line 387,col 77)",
        "(line 388,col 5)-(line 389,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect1()",
      "begin_line": 392,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 397,col 5)-(line 397,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect2()",
      "begin_line": 401,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 65)",
        "(line 408,col 5)-(line 408,col 69)",
        "(line 409,col 5)-(line 409,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect3()",
      "begin_line": 412,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 61)",
        "(line 415,col 5)-(line 415,col 65)",
        "(line 416,col 5)-(line 416,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect4()",
      "begin_line": 419,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 422,col 5)-(line 422,col 61)",
        "(line 423,col 5)-(line 423,col 65)",
        "(line 424,col 5)-(line 424,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testCanInlineAcrossNoSideEffect()",
      "begin_line": 427,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 432,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDependOnOuterScopeVariables()",
      "begin_line": 438,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 69)",
        "(line 440,col 5)-(line 440,col 67)",
        "(line 445,col 5)-(line 445,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineIfNameIsLeftSideOfAssign()",
      "begin_line": 448,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 69)",
        "(line 450,col 5)-(line 450,col 61)",
        "(line 451,col 5)-(line 451,col 67)",
        "(line 453,col 5)-(line 453,col 50)",
        "(line 454,col 5)-(line 454,col 54)",
        "(line 455,col 5)-(line 455,col 39)",
        "(line 456,col 5)-(line 456,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineArguments()",
      "begin_line": 459,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 47)",
        "(line 461,col 5)-(line 461,col 66)",
        "(line 463,col 5)-(line 464,col 42)",
        "(line 466,col 5)-(line 467,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInvalidInlineArguments1()",
      "begin_line": 470,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 471,col 71)",
        "(line 472,col 5)-(line 473,col 41)",
        "(line 474,col 5)-(line 474,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInvalidInlineArguments2()",
      "begin_line": 477,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 478,col 5)-(line 479,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testForIn()",
      "begin_line": 482,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 483,col 5)-(line 483,col 49)",
        "(line 484,col 5)-(line 484,col 68)",
        "(line 485,col 5)-(line 485,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNotOkToSkipCheckPathBetweenNodes()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 490,col 46)",
        "(line 491,col 5)-(line 491,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue698()",
      "begin_line": 494,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 510,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue777()",
      "begin_line": 513,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 514,col 5)-(line 544,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testTransitiveDependencies1()",
      "begin_line": 547,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 548,col 5)-(line 550,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testTransitiveDependencies2()",
      "begin_line": 553,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 554,col 5)-(line 556,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue794a()",
      "begin_line": 559,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 560,col 5)-(line 565,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue794b()",
      "begin_line": 568,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 569,col 5)-(line 574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testVarAssinInsideHookIssue965()",
      "begin_line": 577,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 54)",
        "(line 579,col 5)-(line 579,col 61)",
        "(line 580,col 5)-(line 580,col 58)",
        "(line 581,col 5)-(line 581,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.noInline(java.lang.String)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 5)-(line 585,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.inline(java.lang.String, java.lang.String)",
      "begin_line": 588,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 590,col 59)"
      ]
    }
  ]
}