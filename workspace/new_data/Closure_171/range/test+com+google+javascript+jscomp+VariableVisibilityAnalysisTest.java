{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/VariableVisibilityAnalysisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableVisibilityAnalysisTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 29,
      "end_line": 248,
      "comment": "\n * Tests of {@link VariableVisibilityAnalysis}.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastAnalysis"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 34,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 60)",
        "(line 37,col 5)-(line 37,col 28)",
        "(line 39,col 5)-(line 39,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.testCapturedVariables()",
      "begin_line": 42,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 51,col 14)",
        "(line 53,col 5)-(line 53,col 20)",
        "(line 55,col 5)-(line 55,col 38)",
        "(line 56,col 5)-(line 56,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.testGlobals()",
      "begin_line": 59,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 61,col 27)",
        "(line 63,col 5)-(line 63,col 20)",
        "(line 65,col 5)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.testParameters()",
      "begin_line": 68,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 71,col 12)",
        "(line 73,col 5)-(line 73,col 20)",
        "(line 75,col 5)-(line 75,col 27)",
        "(line 76,col 5)-(line 76,col 27)",
        "(line 77,col 5)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.testFunctions()",
      "begin_line": 80,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 88,col 14)",
        "(line 90,col 5)-(line 90,col 20)",
        "(line 92,col 5)-(line 93,col 35)",
        "(line 95,col 5)-(line 96,col 34)",
        "(line 98,col 5)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.assertFunctionHasVisibility(java.lang.String, com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility)",
      "begin_line": 102,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 56)",
        "(line 106,col 5)-(line 106,col 32)",
        "(line 108,col 5)-(line 108,col 49)",
        "(line 109,col 5)-(line 109,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.assertLabeledVariableHasVisibility(java.lang.String, com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility)",
      "begin_line": 112,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 46)",
        "(line 116,col 5)-(line 116,col 54)",
        "(line 120,col 5)-(line 120,col 52)",
        "(line 122,col 5)-(line 122,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.assertIsCapturedLocal(java.lang.String)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 127,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.assertIsUncapturedLocal(java.lang.String)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 132,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.assertIsGlobal(java.lang.String)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 137,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.assertIsParameter(java.lang.String)",
      "begin_line": 140,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 59)",
        "(line 143,col 5)-(line 143,col 33)",
        "(line 145,col 5)-(line 146,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.analyze(java.lang.String)",
      "begin_line": 149,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 18)",
        "(line 152,col 5)-(line 152,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.searchForParameter(java.lang.String)",
      "begin_line": 161,
      "end_line": 182,
      "comment": "\n   * Finds a parameter NAME node with the given name in the source AST.\n   *\n   * Behavior is undefined if there are multiple parameters with\n   * parameterName.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 55)",
        "(line 164,col 5)-(line 164,col 41)",
        "(line 166,col 5)-(line 176,col 6)",
        "(line 178,col 5)-(line 179,col 39)",
        "(line 181,col 5)-(line 181,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.Anonymous-13e8dbb6-f6be-4adf-9421-75a6b251357c.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.searchForFunction(java.lang.String)",
      "begin_line": 190,
      "end_line": 210,
      "comment": "\n   * Finds a function node with the given name in the source AST.\n   *\n   * Behavior is undefined if there are multiple functions with\n   * parameterName.\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 54)",
        "(line 193,col 5)-(line 193,col 41)",
        "(line 195,col 5)-(line 204,col 6)",
        "(line 206,col 5)-(line 207,col 39)",
        "(line 209,col 5)-(line 209,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.Anonymous-d2307696-4a7f-46cd-9320-126e01d733e9.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 197,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.searchLabel(java.lang.String)",
      "begin_line": 213,
      "end_line": 220,
      "comment": " Shamelessly stolen from NameReferenceGraphConstructionTest",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 67)",
        "(line 216,col 5)-(line 216,col 69)",
        "(line 217,col 5)-(line 217,col 79)",
        "(line 219,col 5)-(line 219,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabeledVariableSearcher",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 228,
      "end_line": 247,
      "comment": "\n   * Quick traversal to find a given labeled variable in the AST.\n   *\n   * Finds the variable for foo in:\n   * foo: var a \u003d ...\n   "
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.LabeledVariableSearcher.LabeledVariableSearcher(java.lang.String)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 7)-(line 233,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysisTest.LabeledVariableSearcher.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 235,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 237,col 7)-(line 245,col 7)"
      ]
    }
  ]
}