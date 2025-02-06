{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CombinedCompilerPassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedCompilerPassTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 260,
      "comment": "\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.createPostOrderAlphabet()",
      "begin_line": 49,
      "end_line": 81,
      "comment": "\n   * Returns a Node tree with the post-order traversal a b c d e f g h i j k l m\n   * and the in-order traversal m d a b c h e f g l i j k:\n   *\n   *                                   m\n   *                         ,---------|---------.\n   *                         d         h         l\n   *                      ,--|--.   ,--|--.   ,--|--.\n   *                      a  b  c   e  f  g   i  j  k\n   *\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 33)",
        "(line 51,col 5)-(line 51,col 33)",
        "(line 52,col 5)-(line 52,col 33)",
        "(line 53,col 5)-(line 53,col 33)",
        "(line 54,col 5)-(line 54,col 33)",
        "(line 55,col 5)-(line 55,col 33)",
        "(line 56,col 5)-(line 56,col 33)",
        "(line 57,col 5)-(line 57,col 33)",
        "(line 58,col 5)-(line 58,col 33)",
        "(line 59,col 5)-(line 59,col 33)",
        "(line 60,col 5)-(line 60,col 33)",
        "(line 61,col 5)-(line 61,col 33)",
        "(line 62,col 5)-(line 62,col 33)",
        "(line 64,col 5)-(line 64,col 24)",
        "(line 65,col 5)-(line 65,col 24)",
        "(line 66,col 5)-(line 66,col 24)",
        "(line 68,col 5)-(line 68,col 27)",
        "(line 69,col 5)-(line 69,col 27)",
        "(line 70,col 5)-(line 70,col 27)",
        "(line 72,col 5)-(line 72,col 24)",
        "(line 73,col 5)-(line 73,col 24)",
        "(line 74,col 5)-(line 74,col 24)",
        "(line 76,col 5)-(line 76,col 24)",
        "(line 77,col 5)-(line 77,col 24)",
        "(line 78,col 5)-(line 78,col 24)",
        "(line 80,col 5)-(line 80,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.setUp()",
      "begin_line": 83,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 18)",
        "(line 86,col 5)-(line 86,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcatTraversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 94,
      "end_line": 130,
      "comment": "\n   * Concatenates contents of string nodes encountered in pre-order\n   * and post-order traversals. Abbreviates traversals by ignoring subtrees\n   * rooted with specified strings.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldTraversed"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoring"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal.ignore(java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 7)-(line 100,col 22)",
        "(line 101,col 7)-(line 101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 46)",
        "(line 107,col 7)-(line 107,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 112,col 46)",
        "(line 113,col 7)-(line 113,col 44)",
        "(line 114,col 7)-(line 114,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal.getVisited()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " Returns strings concatenated during post-order traversal. ",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal.getShouldTraversed()",
      "begin_line": 123,
      "end_line": 125,
      "comment": " Returns strings concatenated during pre-order traversal. ",
      "child_ranges": [
        "(line 124,col 7)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal.getIgnoring()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestHelper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 136,
      "end_line": 163,
      "comment": "\n   * Collection of data for a traversal test. Contains the traversal callback\n   * and the expected pre- and post-order traversal results.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "traversal"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedVisited"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldTraverseExpected"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.TestHelper.TestHelper(com.google.javascript.jscomp.CombinedCompilerPassTest.ConcatTraversal, java.lang.String, java.lang.String)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 33)",
        "(line 144,col 7)-(line 144,col 45)",
        "(line 145,col 7)-(line 145,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.TestHelper.getTraversal()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.TestHelper.checkResults()",
      "begin_line": 152,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 156,col 60)",
        "(line 158,col 7)-(line 161,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.createStringTests()",
      "begin_line": 165,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 50)",
        "(line 168,col 5)-(line 169,col 66)",
        "(line 171,col 5)-(line 172,col 71)",
        "(line 174,col 5)-(line 175,col 77)",
        "(line 177,col 5)-(line 177,col 74)",
        "(line 179,col 5)-(line 179,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.testIndividualPasses()",
      "begin_line": 182,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 188,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.testCombinedPasses()",
      "begin_line": 191,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 50)",
        "(line 193,col 5)-(line 193,col 54)",
        "(line 194,col 5)-(line 194,col 14)",
        "(line 195,col 5)-(line 197,col 5)",
        "(line 198,col 5)-(line 199,col 54)",
        "(line 200,col 5)-(line 200,col 50)",
        "(line 201,col 5)-(line 203,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ScopeRecordingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 210,
      "end_line": 241,
      "comment": "\n   * Records the scopes visited during an AST traversal. Abbreviates traversals\n   * by ignoring subtrees rooted with specified NAME nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "visitedScopes"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoring"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ScopeRecordingCallback.ignore(java.lang.String)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 7)-(line 216,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ScopeRecordingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 7)-(line 221,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ScopeRecordingCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 7)-(line 226,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ScopeRecordingCallback.getVisitedScopes()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ScopeRecordingCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.ScopeRecordingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPassTest.testScopes()",
      "begin_line": 243,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 245,col 80)",
        "(line 247,col 5)-(line 247,col 61)",
        "(line 248,col 5)-(line 248,col 19)",
        "(line 249,col 5)-(line 249,col 61)",
        "(line 250,col 5)-(line 250,col 19)",
        "(line 251,col 5)-(line 251,col 61)",
        "(line 253,col 5)-(line 253,col 79)",
        "(line 254,col 5)-(line 254,col 29)",
        "(line 256,col 5)-(line 256,col 50)",
        "(line 257,col 5)-(line 257,col 50)",
        "(line 258,col 5)-(line 258,col 50)"
      ]
    }
  ]
}