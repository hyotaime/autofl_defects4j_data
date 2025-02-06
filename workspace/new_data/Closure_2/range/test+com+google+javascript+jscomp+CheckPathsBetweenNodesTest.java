{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/CheckPathsBetweenNodesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckPathsBetweenNodesTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 340,
      "comment": "\n * Tests for {@link CheckPathsBetweenNodes}.\n *\n "
    },
    {
      "type": "class_interface",
      "name": "PrefixPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003cjava.lang.String\u003e"
      ],
      "begin_line": 37,
      "end_line": 48,
      "comment": "\n   * Predicate satisfied by strings with a given prefix.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.PrefixPredicate.PrefixPredicate(java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 7)-(line 41,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.PrefixPredicate.apply(java.lang.String)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 7)-(line 46,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FALSE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_EDGE"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_EDGE"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSimple()",
      "begin_line": 59,
      "end_line": 85,
      "comment": " Tests straight-line graphs. ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 61)",
        "(line 61,col 5)-(line 61,col 35)",
        "(line 62,col 5)-(line 62,col 35)",
        "(line 63,col 5)-(line 63,col 35)",
        "(line 64,col 5)-(line 64,col 35)",
        "(line 66,col 5)-(line 66,col 29)",
        "(line 67,col 5)-(line 67,col 29)",
        "(line 68,col 5)-(line 68,col 29)",
        "(line 69,col 5)-(line 69,col 29)",
        "(line 71,col 5)-(line 71,col 55)",
        "(line 74,col 5)-(line 74,col 78)",
        "(line 77,col 5)-(line 77,col 78)",
        "(line 78,col 5)-(line 78,col 78)",
        "(line 81,col 5)-(line 81,col 56)",
        "(line 84,col 5)-(line 84,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomeValidPaths()",
      "begin_line": 91,
      "end_line": 107,
      "comment": "\n   * Tests a graph where some paths between the nodes are valid and others\n   * are invalid.\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 61)",
        "(line 93,col 5)-(line 93,col 35)",
        "(line 94,col 5)-(line 94,col 35)",
        "(line 95,col 5)-(line 95,col 35)",
        "(line 96,col 5)-(line 96,col 35)",
        "(line 97,col 5)-(line 97,col 35)",
        "(line 99,col 5)-(line 99,col 29)",
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 101,col 29)",
        "(line 102,col 5)-(line 102,col 29)",
        "(line 103,col 5)-(line 103,col 29)",
        "(line 105,col 5)-(line 105,col 74)",
        "(line 106,col 5)-(line 106,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testManyValidPaths()",
      "begin_line": 110,
      "end_line": 128,
      "comment": " Tests a graph with many valid paths. ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 61)",
        "(line 112,col 5)-(line 112,col 35)",
        "(line 113,col 5)-(line 113,col 35)",
        "(line 114,col 5)-(line 114,col 36)",
        "(line 115,col 5)-(line 115,col 36)",
        "(line 116,col 5)-(line 116,col 36)",
        "(line 117,col 5)-(line 117,col 67)",
        "(line 119,col 5)-(line 119,col 30)",
        "(line 120,col 5)-(line 120,col 31)",
        "(line 121,col 5)-(line 121,col 31)",
        "(line 122,col 5)-(line 122,col 30)",
        "(line 123,col 5)-(line 123,col 30)",
        "(line 124,col 5)-(line 124,col 31)",
        "(line 125,col 5)-(line 125,col 30)",
        "(line 127,col 5)-(line 127,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testCycles1()",
      "begin_line": 131,
      "end_line": 152,
      "comment": " Tests a graph with some cycles. ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 61)",
        "(line 133,col 5)-(line 133,col 35)",
        "(line 134,col 5)-(line 134,col 35)",
        "(line 135,col 5)-(line 135,col 35)",
        "(line 136,col 5)-(line 136,col 35)",
        "(line 137,col 5)-(line 137,col 35)",
        "(line 138,col 5)-(line 138,col 35)",
        "(line 140,col 5)-(line 140,col 29)",
        "(line 141,col 5)-(line 141,col 29)",
        "(line 142,col 5)-(line 142,col 29)",
        "(line 143,col 5)-(line 143,col 29)",
        "(line 144,col 5)-(line 144,col 29)",
        "(line 145,col 5)-(line 145,col 29)",
        "(line 147,col 5)-(line 147,col 75)",
        "(line 148,col 5)-(line 148,col 75)",
        "(line 149,col 5)-(line 149,col 75)",
        "(line 150,col 5)-(line 150,col 75)",
        "(line 151,col 5)-(line 151,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testCycles2()",
      "begin_line": 159,
      "end_line": 173,
      "comment": "\n   * Tests another graph with cycles. The topology of this graph was inspired\n   * by a control flow graph that was being incorrectly analyzed by an early\n   * version of CheckPathsBetweenNodes.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 61)",
        "(line 161,col 5)-(line 161,col 35)",
        "(line 162,col 5)-(line 162,col 35)",
        "(line 163,col 5)-(line 163,col 35)",
        "(line 164,col 5)-(line 164,col 35)",
        "(line 166,col 5)-(line 166,col 29)",
        "(line 167,col 5)-(line 167,col 29)",
        "(line 168,col 5)-(line 168,col 29)",
        "(line 169,col 5)-(line 169,col 29)",
        "(line 171,col 5)-(line 171,col 75)",
        "(line 172,col 5)-(line 172,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testCycles3()",
      "begin_line": 180,
      "end_line": 195,
      "comment": "\n   * Tests another graph with cycles. The topology of this graph was inspired\n   * by a control flow graph that was being incorrectly analyzed by an early\n   * version of CheckPathsBetweenNodes.\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 61)",
        "(line 182,col 5)-(line 182,col 35)",
        "(line 183,col 5)-(line 183,col 35)",
        "(line 184,col 5)-(line 184,col 35)",
        "(line 185,col 5)-(line 185,col 35)",
        "(line 187,col 5)-(line 187,col 29)",
        "(line 188,col 5)-(line 188,col 29)",
        "(line 189,col 5)-(line 189,col 29)",
        "(line 190,col 5)-(line 190,col 29)",
        "(line 191,col 5)-(line 191,col 29)",
        "(line 193,col 5)-(line 193,col 75)",
        "(line 194,col 5)-(line 194,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomePath1()",
      "begin_line": 202,
      "end_line": 224,
      "comment": "\n   * Much of the tests are done by testing all paths. We quickly verified\n   * that some paths are indeed correct for the some path case.\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 61)",
        "(line 204,col 5)-(line 204,col 35)",
        "(line 205,col 5)-(line 205,col 35)",
        "(line 206,col 5)-(line 206,col 35)",
        "(line 207,col 5)-(line 207,col 35)",
        "(line 209,col 5)-(line 209,col 29)",
        "(line 210,col 5)-(line 210,col 29)",
        "(line 211,col 5)-(line 211,col 29)",
        "(line 212,col 5)-(line 212,col 29)",
        "(line 214,col 5)-(line 215,col 38)",
        "(line 216,col 5)-(line 217,col 38)",
        "(line 218,col 5)-(line 219,col 38)",
        "(line 220,col 5)-(line 221,col 38)",
        "(line 222,col 5)-(line 223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomePath2()",
      "begin_line": 226,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 61)",
        "(line 229,col 5)-(line 229,col 35)",
        "(line 230,col 5)-(line 230,col 35)",
        "(line 232,col 5)-(line 233,col 38)",
        "(line 234,col 5)-(line 235,col 38)",
        "(line 236,col 5)-(line 237,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomePathRevisiting()",
      "begin_line": 240,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 61)",
        "(line 242,col 5)-(line 242,col 35)",
        "(line 243,col 5)-(line 243,col 36)",
        "(line 244,col 5)-(line 244,col 36)",
        "(line 245,col 5)-(line 245,col 35)",
        "(line 246,col 5)-(line 246,col 36)",
        "(line 247,col 5)-(line 247,col 36)",
        "(line 248,col 5)-(line 248,col 35)",
        "(line 249,col 5)-(line 249,col 30)",
        "(line 250,col 5)-(line 250,col 30)",
        "(line 251,col 5)-(line 251,col 30)",
        "(line 252,col 5)-(line 252,col 30)",
        "(line 253,col 5)-(line 253,col 30)",
        "(line 254,col 5)-(line 254,col 30)",
        "(line 255,col 5)-(line 255,col 30)",
        "(line 256,col 5)-(line 256,col 30)",
        "(line 258,col 5)-(line 259,col 62)",
        "(line 261,col 5)-(line 262,col 38)",
        "(line 265,col 5)-(line 265,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testNonInclusive()",
      "begin_line": 268,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 61)",
        "(line 271,col 5)-(line 271,col 35)",
        "(line 272,col 5)-(line 272,col 35)",
        "(line 273,col 5)-(line 273,col 35)",
        "(line 274,col 5)-(line 274,col 29)",
        "(line 275,col 5)-(line 275,col 29)",
        "(line 276,col 5)-(line 277,col 72)",
        "(line 278,col 5)-(line 279,col 72)",
        "(line 280,col 5)-(line 281,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.assertGood(com.google.javascript.jscomp.CheckPathsBetweenNodes\u003cN, E\u003e)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.assertBad(com.google.javascript.jscomp.CheckPathsBetweenNodes\u003cN, E\u003e)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 5)-(line 289,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.createTest(com.google.javascript.jscomp.graph.DiGraph\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, java.lang.String, com.google.common.base.Predicate\u003cjava.lang.String\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cjava.lang.String, java.lang.String\u003e\u003e)",
      "begin_line": 292,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 300,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.createNonInclusiveTest(com.google.javascript.jscomp.graph.DiGraph\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, java.lang.String, com.google.common.base.Predicate\u003cjava.lang.String\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cjava.lang.String, java.lang.String\u003e\u003e)",
      "begin_line": 303,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 312,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.edgeIs(java.lang.Object)",
      "begin_line": 315,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 317,col 5)-(line 322,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.Anonymous-63d13933-3f77-4fcc-93c7-41fa8391e206.apply(com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003cT\u003e"
      ],
      "begin_line": 325,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.CountingPredicate.CountingPredicate(com.google.common.base.Predicate\u003cT\u003e)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.CountingPredicate.apply(T)",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 15)",
        "(line 336,col 7)-(line 336,col 35)"
      ]
    }
  ]
}