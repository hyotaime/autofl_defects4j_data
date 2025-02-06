{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PeepholeOptimizationsPassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeOptimizationsPassTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 32,
      "end_line": 258,
      "comment": "\n * Unit tests for PeepholeOptimizationsPass.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "currentPeepholePasses"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.setUp()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 18)",
        "(line 39,col 5)-(line 39,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 42,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 46,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.getNumRepetitions()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testEmptyPass()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n   * PeepholeOptimizationsPass should handle the case when no peephole\n   * optimizations are turned on.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 77)",
        "(line 62,col 5)-(line 62,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testOptimizationOrder()",
      "begin_line": 65,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 60)",
        "(line 86,col 5)-(line 96,col 6)",
        "(line 98,col 5)-(line 108,col 6)",
        "(line 110,col 5)-(line 112,col 67)",
        "(line 114,col 5)-(line 114,col 41)",
        "(line 122,col 5)-(line 122,col 42)",
        "(line 123,col 5)-(line 123,col 45)",
        "(line 124,col 5)-(line 124,col 45)",
        "(line 125,col 5)-(line 125,col 45)",
        "(line 126,col 5)-(line 126,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.Anonymous-b56faa93-3f12-413e-8744-028765484512.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.Anonymous-75ad6f37-5785-489b-815d-075d6a480d37.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 100,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveNodesNamedXUnderVarOptimization",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 133,
      "end_line": 154,
      "comment": "\n   * A peephole optimization that, given a subtree consisting of a VAR node,\n   * removes children of that node named \"x\".\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.RemoveNodesNamedXUnderVarOptimization.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 135,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 137,col 7)-(line 150,col 7)",
        "(line 152,col 7)-(line 152,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveNodesNamedXOptimization",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 160,
      "end_line": 173,
      "comment": "\n   * A peephole optimization that, given a subtree consisting of a name node\n   * named \"x\" removes that node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.RemoveNodesNamedXOptimization.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 169,col 7)",
        "(line 171,col 7)-(line 171,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveParentVarsForNodesNamedX",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 179,
      "end_line": 193,
      "comment": "\n   * A peephole optimization that, given a subtree consisting of a name node\n   * named \"x\" whose parent is a VAR node, removes the parent VAR node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.RemoveParentVarsForNodesNamedX.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 183,col 7)-(line 190,col 7)",
        "(line 191,col 7)-(line 191,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RenameYToX",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 199,
      "end_line": 212,
      "comment": "\n   * A peephole optimization that, given a subtree consisting of a name node\n   * named \"y\", replaces it with a name node named \"x\";\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.RenameYToX.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 200,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 202,col 7)-(line 209,col 7)",
        "(line 210,col 7)-(line 210,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testOptimizationRemovingSubtreeChild()",
      "begin_line": 214,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 216,col 51)",
        "(line 218,col 5)-(line 218,col 31)",
        "(line 219,col 5)-(line 219,col 31)",
        "(line 220,col 5)-(line 220,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testOptimizationRemovingSubtree()",
      "begin_line": 223,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 225,col 43)",
        "(line 227,col 5)-(line 227,col 31)",
        "(line 228,col 5)-(line 228,col 31)",
        "(line 229,col 5)-(line 229,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testOptimizationRemovingSubtreeParent()",
      "begin_line": 232,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 234,col 44)",
        "(line 236,col 5)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testOptimizationsRemoveParentAfterRemoveChild()",
      "begin_line": 243,
      "end_line": 249,
      "comment": "\n   * Test the case where the first peephole optimization removes a node and the\n   * second wants to remove (the now nonexistent) parent of that node.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 246,col 48)",
        "(line 248,col 5)-(line 248,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPassTest.testOptimizationReplacingNode()",
      "begin_line": 251,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 254,col 48)",
        "(line 256,col 5)-(line 256,col 36)"
      ]
    }
  ]
}