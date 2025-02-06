{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CrossModuleMethodMotionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CrossModuleMethodMotionTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 565,
      "comment": "\n * Tests for {@link CrossModuleMethodMotion}.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 25,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canMoveExterns"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STUB_DECLARATIONS"
      ],
      "begin_line": 30,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.CrossModuleMethodMotionTest()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 40,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.setUp()",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 38)",
        "(line 46,col 5)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMovePrototypeMethod1()",
      "begin_line": 49,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 54,col 37)",
        "(line 56,col 5)-(line 56,col 26)",
        "(line 57,col 5)-(line 69,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMovePrototypeMethod2()",
      "begin_line": 72,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 86,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMovePrototypeMethod3()",
      "begin_line": 89,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 94,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMovePrototypeRecursiveMethod()",
      "begin_line": 97,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 111,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testCantMovePrototypeProp()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 119,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMoveMethodsInRightOrder()",
      "begin_line": 122,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 140,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMoveMethodsInRightOrder2()",
      "begin_line": 143,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 156,col 27)",
        "(line 158,col 5)-(line 158,col 29)",
        "(line 159,col 5)-(line 159,col 29)",
        "(line 160,col 5)-(line 160,col 29)",
        "(line 161,col 5)-(line 161,col 29)",
        "(line 163,col 5)-(line 182,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMoveMethodsUsedInTwoModules()",
      "begin_line": 185,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 192,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testMoveMethodsUsedInTwoModules2()",
      "begin_line": 195,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 204,col 31)",
        "(line 206,col 5)-(line 206,col 41)",
        "(line 207,col 5)-(line 207,col 41)",
        "(line 208,col 5)-(line 208,col 41)",
        "(line 209,col 5)-(line 220,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testTwoMethods()",
      "begin_line": 223,
      "end_line": 223,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testTwoMethods2()",
      "begin_line": 247,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 266,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testGlobalFunctionsInGraph()",
      "begin_line": 269,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 284,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testClosureVariableReads1()",
      "begin_line": 288,
      "end_line": 297,
      "comment": " Read of closure variable disables method motions.",
      "child_ranges": [
        "(line 289,col 5)-(line 296,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testClosureVariableReads2()",
      "begin_line": 300,
      "end_line": 337,
      "comment": " Read of global variable is fine.",
      "child_ranges": [
        "(line 301,col 5)-(line 336,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testClosureVariableReads3()",
      "begin_line": 339,
      "end_line": 339,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testNoClosureVariableReads1()",
      "begin_line": 382,
      "end_line": 398,
      "comment": " Read of global variable is fine.",
      "child_ranges": [
        "(line 383,col 5)-(line 397,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testNoClosureVariableReads2()",
      "begin_line": 401,
      "end_line": 416,
      "comment": " Read of a local is fine.",
      "child_ranges": [
        "(line 402,col 5)-(line 415,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testInnerFunctionClosureVariableReads()",
      "begin_line": 419,
      "end_line": 435,
      "comment": " An anonymous inner function reading a closure variable is fine.",
      "child_ranges": [
        "(line 420,col 5)-(line 434,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testIssue600()",
      "begin_line": 437,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 454,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testIssue600b()",
      "begin_line": 457,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 458,col 5)-(line 473,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testIssue600c()",
      "begin_line": 476,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 502,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testIssue600d()",
      "begin_line": 505,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 506,col 5)-(line 535,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testIssue600e()",
      "begin_line": 538,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 554,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotionTest.testPrototypeOfThisAssign()",
      "begin_line": 557,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 563,col 33)"
      ]
    }
  ]
}