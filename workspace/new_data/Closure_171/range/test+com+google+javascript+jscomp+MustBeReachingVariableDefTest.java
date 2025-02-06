{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/MustBeReachingVariableDefTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MustBeReachingVariableDefTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 202,
      "comment": "\n * Tests for {@link MustBeReachingVariableDef}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "defUse"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testStraightLine()",
      "begin_line": 35,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 35)",
        "(line 37,col 5)-(line 37,col 38)",
        "(line 38,col 5)-(line 38,col 45)",
        "(line 39,col 5)-(line 39,col 40)",
        "(line 40,col 5)-(line 40,col 39)",
        "(line 41,col 5)-(line 41,col 40)",
        "(line 42,col 5)-(line 42,col 43)",
        "(line 43,col 5)-(line 43,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testIf()",
      "begin_line": 46,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 62)",
        "(line 48,col 5)-(line 48,col 62)",
        "(line 49,col 5)-(line 49,col 55)",
        "(line 50,col 5)-(line 50,col 55)",
        "(line 51,col 5)-(line 51,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testLoops()",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 54)",
        "(line 56,col 5)-(line 56,col 54)",
        "(line 57,col 5)-(line 57,col 47)",
        "(line 58,col 5)-(line 58,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testConditional()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 46)",
        "(line 63,col 5)-(line 63,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testUseAndDefInSameInstruction()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 38)",
        "(line 68,col 5)-(line 68,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testAssignmentInExpressions()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 49)",
        "(line 73,col 5)-(line 73,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testHook()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 58)",
        "(line 78,col 5)-(line 78,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testExpressionVariableReassignment()",
      "begin_line": 81,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 50)",
        "(line 83,col 5)-(line 83,col 62)",
        "(line 84,col 5)-(line 84,col 65)",
        "(line 85,col 5)-(line 85,col 59)",
        "(line 88,col 5)-(line 88,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testMergeDefinitions()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testMergesWithOneDefinition()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testRedefinitionUsingItself()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 49)",
        "(line 102,col 5)-(line 102,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testMultipleDefinitionsWithDependence()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 54)",
        "(line 107,col 5)-(line 107,col 61)",
        "(line 108,col 5)-(line 108,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testExterns()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testAssignmentOp()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 46)",
        "(line 117,col 5)-(line 117,col 46)",
        "(line 118,col 5)-(line 118,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testIncAndDec()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 39)",
        "(line 123,col 5)-(line 123,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testFunctionParams1()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 62)",
        "(line 128,col 5)-(line 128,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testFunctionParams2()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 60)",
        "(line 133,col 5)-(line 133,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testArgumentsObjectModifications()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 64)",
        "(line 138,col 5)-(line 138,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testArgumentsObjectEscaped()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 75)",
        "(line 143,col 5)-(line 143,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.testArgumentsObjectEscapedDependents()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.assertMatch(java.lang.String)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n   * The use of x at U: is the definition of x at D:.\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 23)",
        "(line 155,col 5)-(line 155,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.assertNotMatch(java.lang.String)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n   * The use of x at U: is not the definition of x at D:.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 23)",
        "(line 163,col 5)-(line 163,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.computeDefUse(java.lang.String)",
      "begin_line": 169,
      "end_line": 185,
      "comment": "\n   * Computes reaching definition on given source.\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 39)",
        "(line 171,col 5)-(line 171,col 60)",
        "(line 172,col 5)-(line 172,col 60)",
        "(line 173,col 5)-(line 173,col 46)",
        "(line 174,col 5)-(line 174,col 78)",
        "(line 175,col 5)-(line 175,col 77)",
        "(line 176,col 5)-(line 176,col 28)",
        "(line 177,col 5)-(line 177,col 46)",
        "(line 178,col 5)-(line 178,col 65)",
        "(line 179,col 5)-(line 179,col 21)",
        "(line 180,col 5)-(line 180,col 15)",
        "(line 181,col 5)-(line 181,col 15)",
        "(line 182,col 5)-(line 182,col 65)",
        "(line 183,col 5)-(line 183,col 68)",
        "(line 184,col 5)-(line 184,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelFinder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 190,
      "end_line": 201,
      "comment": "\n   * Finds the D: and U: label and store which node they point to.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDefTest.LabelFinder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 191,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 7)-(line 199,col 7)"
      ]
    }
  ]
}