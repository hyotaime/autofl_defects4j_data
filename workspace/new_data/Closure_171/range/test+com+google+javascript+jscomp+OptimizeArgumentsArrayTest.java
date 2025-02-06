{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/OptimizeArgumentsArrayTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeArgumentsArrayTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 166,
      "comment": "\n * Unit tests for {@link OptimizeArgumentsArray}.\n *\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.OptimizeArgumentsArrayTest()",
      "begin_line": 25,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.setUp()",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testSimple()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 48,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testNoVarArgs()",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 55)",
        "(line 54,col 5)-(line 55,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testMissingVarArgs()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testArgumentRefOnNamedParameter()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 64,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testTwoVarArgs()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 69,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testTwoFourArgsTwoUsed()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 74,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testOneRequired()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 79,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testTwoRequiredSixthVarArgReferenced()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 84,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testTwoRequiredOneOptionalFifthVarArgReferenced()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 91,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testTwoRequiredTwoOptionalSixthVarArgReferenced()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 98,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testInnerFunctions()",
      "begin_line": 101,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 103,col 61)",
        "(line 105,col 5)-(line 106,col 62)",
        "(line 108,col 5)-(line 109,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testInnerFunctionsWithNamedArgumentInInnerFunction()",
      "begin_line": 112,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 114,col 62)",
        "(line 116,col 5)-(line 117,col 63)",
        "(line 119,col 5)-(line 120,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testInnerFunctionsWithNamedArgumentInOutterFunction()",
      "begin_line": 123,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 125,col 61)",
        "(line 127,col 5)-(line 128,col 64)",
        "(line 130,col 5)-(line 131,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testInnerFunctionsWithNamedArgumentInInnerAndOutterFunction()",
      "begin_line": 134,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 136,col 63)",
        "(line 138,col 5)-(line 139,col 65)",
        "(line 141,col 5)-(line 142,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testInnerFunctionsAfterArguments()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 149,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testNoOptimizationWhenGetProp()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testNoOptimizationWhenIndexIsNotNumberConstant()",
      "begin_line": 156,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 73)",
        "(line 158,col 5)-(line 158,col 70)",
        "(line 159,col 5)-(line 160,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArrayTest.testNoOptimizationWhenArgumentIsUsedAsFunctionCall()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 46)"
      ]
    }
  ]
}