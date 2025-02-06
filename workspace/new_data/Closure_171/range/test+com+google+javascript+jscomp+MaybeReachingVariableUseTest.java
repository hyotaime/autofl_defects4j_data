{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/MaybeReachingVariableUseTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaybeReachingVariableUseTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 173,
      "comment": "\n * Tests for {@link MaybeReachingVariableUse}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "useDef"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uses"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testStraightLine()",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 35)",
        "(line 46,col 5)-(line 46,col 38)",
        "(line 47,col 5)-(line 47,col 45)",
        "(line 48,col 5)-(line 48,col 40)",
        "(line 49,col 5)-(line 49,col 39)",
        "(line 50,col 5)-(line 50,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testIf()",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 58)",
        "(line 55,col 5)-(line 55,col 58)",
        "(line 56,col 5)-(line 56,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testLoops()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 51)",
        "(line 61,col 5)-(line 61,col 51)",
        "(line 63,col 5)-(line 63,col 47)",
        "(line 64,col 5)-(line 64,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testConditional()",
      "begin_line": 67,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 51)",
        "(line 69,col 5)-(line 69,col 51)",
        "(line 70,col 5)-(line 70,col 57)",
        "(line 71,col 5)-(line 71,col 57)",
        "(line 72,col 5)-(line 72,col 61)",
        "(line 73,col 5)-(line 73,col 67)",
        "(line 74,col 5)-(line 74,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testUseAndDefInSameInstruction()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 41)",
        "(line 79,col 5)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testAssignmentInExpressions()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 49)",
        "(line 84,col 5)-(line 84,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testHook()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 55)",
        "(line 89,col 5)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testAssignmentOps()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 47)",
        "(line 94,col 5)-(line 94,col 45)",
        "(line 95,col 5)-(line 95,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testInc()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 39)",
        "(line 100,col 5)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testForIn()",
      "begin_line": 103,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 64)",
        "(line 107,col 5)-(line 107,col 65)",
        "(line 108,col 5)-(line 108,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.testTryCatch()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.assertMatch(java.lang.String)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n   * The def of x at D: may be used by the read of x at U:.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 23)",
        "(line 123,col 5)-(line 123,col 55)",
        "(line 124,col 5)-(line 124,col 45)",
        "(line 125,col 5)-(line 125,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.assertNotMatch(java.lang.String)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n   * The def of x at D: is not used by the read of x at U:.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 23)",
        "(line 133,col 5)-(line 133,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.computeUseDef(java.lang.String)",
      "begin_line": 139,
      "end_line": 156,
      "comment": "\n   * Computes reaching use on given source.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 39)",
        "(line 141,col 5)-(line 141,col 60)",
        "(line 142,col 5)-(line 142,col 57)",
        "(line 143,col 5)-(line 143,col 46)",
        "(line 144,col 5)-(line 144,col 75)",
        "(line 145,col 5)-(line 145,col 77)",
        "(line 146,col 5)-(line 146,col 25)",
        "(line 147,col 5)-(line 147,col 46)",
        "(line 148,col 5)-(line 148,col 64)",
        "(line 149,col 5)-(line 149,col 21)",
        "(line 150,col 5)-(line 150,col 15)",
        "(line 151,col 5)-(line 151,col 32)",
        "(line 152,col 5)-(line 152,col 62)",
        "(line 153,col 5)-(line 153,col 68)",
        "(line 154,col 5)-(line 155,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelFinder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 161,
      "end_line": 172,
      "comment": "\n   * Finds the D: and U: label and store which node they point to.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUseTest.LabelFinder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 170,col 7)"
      ]
    }
  ]
}