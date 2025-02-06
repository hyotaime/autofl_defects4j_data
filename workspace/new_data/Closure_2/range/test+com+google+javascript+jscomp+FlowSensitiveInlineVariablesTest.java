{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/FlowSensitiveInlineVariablesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FlowSensitiveInlineVariablesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 574,
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
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.Anonymous-434d257b-eb10-444c-ab37-cda720fb8dda.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
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
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDefinitionAfterUse()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineSameVariableInStraightLine()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 196,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineInDifferentPaths()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 201,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineInMergedPath()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 206,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineIntoExpressions()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions1()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions2()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions3()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 224,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions4()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions5()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions6()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression7()",
      "begin_line": 240,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 51)",
        "(line 247,col 5)-(line 247,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression8()",
      "begin_line": 250,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 256,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression9()",
      "begin_line": 259,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 265,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpression10()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions11()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 64)",
        "(line 275,col 5)-(line 275,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions12()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineExpressions13()",
      "begin_line": 284,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 299,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineIfDefinitionMayNotReach()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineEscapedToInnerFunction()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineLValue()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testSwitchCase()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testShadowedVariableInnerFunction()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 320,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testCatch()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 324,col 49)",
        "(line 325,col 5)-(line 325,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetProp()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetProp2()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetProp3()",
      "begin_line": 337,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 340,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineGetEle()",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineConstructors()",
      "begin_line": 349,
      "end_line": 351,
      "comment": " TODO(user): These should be inlinable.",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineArrayLits()",
      "begin_line": 354,
      "end_line": 356,
      "comment": " TODO(user): These should be inlinable.",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineObjectLits()",
      "begin_line": 359,
      "end_line": 361,
      "comment": " TODO(user): These should be inlinable.",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNoInlineRegExpLits()",
      "begin_line": 364,
      "end_line": 366,
      "comment": " TODO(user): These should be inlinable after the REGEX checks.",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineConstructorCallsIntoLoop()",
      "begin_line": 368,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 371,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testRemoveWithLabels()",
      "begin_line": 374,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 72)",
        "(line 376,col 5)-(line 376,col 77)",
        "(line 377,col 5)-(line 378,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect1()",
      "begin_line": 381,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect2()",
      "begin_line": 390,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 65)",
        "(line 397,col 5)-(line 397,col 69)",
        "(line 398,col 5)-(line 398,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect3()",
      "begin_line": 401,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 61)",
        "(line 404,col 5)-(line 404,col 65)",
        "(line 405,col 5)-(line 405,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineAcrossSideEffect4()",
      "begin_line": 408,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 411,col 61)",
        "(line 412,col 5)-(line 412,col 65)",
        "(line 413,col 5)-(line 413,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testCanInlineAcrossNoSideEffect()",
      "begin_line": 416,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 420,col 5)-(line 421,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testDependOnOuterScopeVariables()",
      "begin_line": 427,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 428,col 5)-(line 428,col 69)",
        "(line 429,col 5)-(line 429,col 67)",
        "(line 434,col 5)-(line 434,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineIfNameIsLeftSideOfAssign()",
      "begin_line": 437,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 69)",
        "(line 439,col 5)-(line 439,col 61)",
        "(line 440,col 5)-(line 440,col 67)",
        "(line 442,col 5)-(line 442,col 50)",
        "(line 443,col 5)-(line 443,col 54)",
        "(line 444,col 5)-(line 444,col 39)",
        "(line 445,col 5)-(line 445,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInlineArguments()",
      "begin_line": 448,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 47)",
        "(line 450,col 5)-(line 450,col 66)",
        "(line 452,col 5)-(line 453,col 42)",
        "(line 455,col 5)-(line 456,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInvalidInlineArguments1()",
      "begin_line": 459,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 71)",
        "(line 461,col 5)-(line 462,col 41)",
        "(line 463,col 5)-(line 463,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testInvalidInlineArguments2()",
      "begin_line": 466,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 467,col 5)-(line 468,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testForIn()",
      "begin_line": 471,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 472,col 5)-(line 472,col 49)",
        "(line 473,col 5)-(line 473,col 68)",
        "(line 474,col 5)-(line 474,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testNotOkToSkipCheckPathBetweenNodes()",
      "begin_line": 478,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 46)",
        "(line 480,col 5)-(line 480,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue698()",
      "begin_line": 483,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 487,col 5)-(line 499,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue777()",
      "begin_line": 502,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 503,col 5)-(line 533,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testTransitiveDependencies1()",
      "begin_line": 536,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 537,col 5)-(line 539,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testTransitiveDependencies2()",
      "begin_line": 542,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 543,col 5)-(line 545,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue794a()",
      "begin_line": 548,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 549,col 5)-(line 554,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.testIssue794b()",
      "begin_line": 557,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 563,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.noInline(java.lang.String)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest.inline(java.lang.String, java.lang.String)",
      "begin_line": 570,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 571,col 5)-(line 572,col 59)"
      ]
    }
  ]
}