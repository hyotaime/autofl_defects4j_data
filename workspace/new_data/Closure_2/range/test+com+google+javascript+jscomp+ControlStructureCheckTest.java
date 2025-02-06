{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ControlStructureCheckTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ControlStructureCheckTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 147,
      "comment": "\n * Test for the control structure verification.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNLABELED_BREAK"
      ],
      "begin_line": 25,
      "end_line": 26,
      "comment": " Rhino parse error message text"
    },
    {
      "type": "field",
      "varNames": [
        "UNEXPECTED_CONTINUE"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNEXPECTED_LABLED_CONTINUE"
      ],
      "begin_line": 30,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_LABEL"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 35,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testWhile()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testNextedWhile()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testBreak()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinue()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testBreakCrossFunction()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testBreakCrossFunctionInFor()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueToSwitch()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueToSwitchWithNoCases()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueToSwitchWithTwoCases()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueToSwitchWithDefault()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueToLabelSwitch()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 82,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueOutsideSwitch()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueNotCrossFunction1()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testContinueNotCrossFunction2()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 95,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testUseOfWith1()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testUseOfWith2()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testUseOfWith3()",
      "begin_line": 107,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 117,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.assertNoError(java.lang.String)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.assertInvalidBreak(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.assertInvalidContinue(java.lang.String)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.assertInvalidLabeledContinue(java.lang.String)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.assertUndefinedLabel(java.lang.String)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheckTest.testParseError(java.lang.String, java.lang.String)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 39)",
        "(line 142,col 5)-(line 142,col 31)",
        "(line 143,col 5)-(line 143,col 46)",
        "(line 144,col 5)-(line 144,col 52)",
        "(line 145,col 5)-(line 145,col 40)"
      ]
    }
  ]
}