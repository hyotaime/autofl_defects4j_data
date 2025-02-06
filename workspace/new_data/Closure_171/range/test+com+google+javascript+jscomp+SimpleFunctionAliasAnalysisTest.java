{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/SimpleFunctionAliasAnalysisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleFunctionAliasAnalysisTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 223,
      "comment": "\n * Tests for {@link SimpleFunctionAliasAnalysis}.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "analysis"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 32,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 34,col 7)-(line 47,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.Anonymous-e646a9f5-11d9-4e61-bfbf-223a65874228.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 36,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 38,col 11)-(line 38,col 79)",
        "(line 39,col 11)-(line 39,col 40)",
        "(line 41,col 11)-(line 41,col 55)",
        "(line 43,col 11)-(line 43,col 35)",
        "(line 45,col 11)-(line 45,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.testFunctionGetIsAliased()",
      "begin_line": 50,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 61,col 15)",
        "(line 63,col 5)-(line 63,col 26)",
        "(line 65,col 5)-(line 65,col 37)",
        "(line 66,col 5)-(line 66,col 40)",
        "(line 67,col 5)-(line 67,col 37)",
        "(line 68,col 5)-(line 68,col 38)",
        "(line 71,col 5)-(line 83,col 18)",
        "(line 85,col 5)-(line 85,col 26)",
        "(line 87,col 5)-(line 87,col 37)",
        "(line 88,col 5)-(line 88,col 40)",
        "(line 89,col 5)-(line 89,col 37)",
        "(line 90,col 5)-(line 90,col 41)",
        "(line 93,col 5)-(line 103,col 15)",
        "(line 105,col 5)-(line 105,col 26)",
        "(line 107,col 5)-(line 107,col 37)",
        "(line 108,col 5)-(line 108,col 40)",
        "(line 109,col 5)-(line 109,col 37)",
        "(line 110,col 5)-(line 110,col 38)",
        "(line 113,col 5)-(line 120,col 17)",
        "(line 122,col 5)-(line 122,col 26)",
        "(line 124,col 5)-(line 124,col 38)",
        "(line 125,col 5)-(line 125,col 41)",
        "(line 126,col 5)-(line 126,col 38)",
        "(line 129,col 5)-(line 136,col 18)",
        "(line 138,col 5)-(line 138,col 26)",
        "(line 140,col 5)-(line 140,col 38)",
        "(line 141,col 5)-(line 141,col 41)",
        "(line 142,col 5)-(line 142,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.testFunctionGetIsExposedToCallOrApply()",
      "begin_line": 145,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 154,col 17)",
        "(line 156,col 5)-(line 156,col 26)",
        "(line 158,col 5)-(line 158,col 50)",
        "(line 159,col 5)-(line 159,col 50)",
        "(line 160,col 5)-(line 160,col 51)",
        "(line 162,col 5)-(line 170,col 18)",
        "(line 172,col 5)-(line 172,col 26)",
        "(line 174,col 5)-(line 174,col 53)",
        "(line 175,col 5)-(line 175,col 53)",
        "(line 176,col 5)-(line 176,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.assertFunctionAliased(boolean, java.lang.String)",
      "begin_line": 179,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 47)",
        "(line 183,col 5)-(line 183,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.assertFunctionExposedToCallOrApply(boolean, java.lang.String)",
      "begin_line": 186,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 47)",
        "(line 190,col 5)-(line 190,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.compileAndRun(java.lang.String)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.findFunction(java.lang.String)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 48)",
        "(line 199,col 5)-(line 199,col 69)",
        "(line 200,col 5)-(line 200,col 52)",
        "(line 201,col 5)-(line 201,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionFinder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 207,
      "end_line": 222,
      "comment": "\n   * Quick Traversal to find a given function in the AST.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.FunctionFinder.FunctionFinder(java.lang.String)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysisTest.FunctionFinder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 215,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 217,col 7)-(line 220,col 7)"
      ]
    }
  ]
}