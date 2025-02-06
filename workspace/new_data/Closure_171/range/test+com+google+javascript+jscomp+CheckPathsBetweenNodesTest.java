{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CheckPathsBetweenNodesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckPathsBetweenNodesTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 336,
      "comment": "\n * Tests for {@link CheckPathsBetweenNodes}.\n *\n "
    },
    {
      "type": "class_interface",
      "name": "PrefixPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003cjava.lang.String\u003e"
      ],
      "begin_line": 35,
      "end_line": 46,
      "comment": "\n   * Predicate satisfied by strings with a given prefix.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.PrefixPredicate.PrefixPredicate(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 7)-(line 39,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.PrefixPredicate.apply(java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FALSE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_EDGE"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_EDGE"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSimple()",
      "begin_line": 57,
      "end_line": 81,
      "comment": " Tests straight-line graphs. ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 61)",
        "(line 59,col 5)-(line 59,col 35)",
        "(line 60,col 5)-(line 60,col 35)",
        "(line 61,col 5)-(line 61,col 35)",
        "(line 62,col 5)-(line 62,col 35)",
        "(line 64,col 5)-(line 64,col 29)",
        "(line 65,col 5)-(line 65,col 29)",
        "(line 66,col 5)-(line 66,col 29)",
        "(line 67,col 5)-(line 67,col 29)",
        "(line 70,col 5)-(line 70,col 78)",
        "(line 73,col 5)-(line 73,col 78)",
        "(line 74,col 5)-(line 74,col 78)",
        "(line 77,col 5)-(line 77,col 56)",
        "(line 80,col 5)-(line 80,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomeValidPaths()",
      "begin_line": 87,
      "end_line": 103,
      "comment": "\n   * Tests a graph where some paths between the nodes are valid and others\n   * are invalid.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 61)",
        "(line 89,col 5)-(line 89,col 35)",
        "(line 90,col 5)-(line 90,col 35)",
        "(line 91,col 5)-(line 91,col 35)",
        "(line 92,col 5)-(line 92,col 35)",
        "(line 93,col 5)-(line 93,col 35)",
        "(line 95,col 5)-(line 95,col 29)",
        "(line 96,col 5)-(line 96,col 29)",
        "(line 97,col 5)-(line 97,col 29)",
        "(line 98,col 5)-(line 98,col 29)",
        "(line 99,col 5)-(line 99,col 29)",
        "(line 101,col 5)-(line 101,col 74)",
        "(line 102,col 5)-(line 102,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testManyValidPaths()",
      "begin_line": 106,
      "end_line": 124,
      "comment": " Tests a graph with many valid paths. ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 61)",
        "(line 108,col 5)-(line 108,col 35)",
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 110,col 36)",
        "(line 111,col 5)-(line 111,col 36)",
        "(line 112,col 5)-(line 112,col 36)",
        "(line 113,col 5)-(line 113,col 35)",
        "(line 115,col 5)-(line 115,col 30)",
        "(line 116,col 5)-(line 116,col 31)",
        "(line 117,col 5)-(line 117,col 31)",
        "(line 118,col 5)-(line 118,col 30)",
        "(line 119,col 5)-(line 119,col 30)",
        "(line 120,col 5)-(line 120,col 31)",
        "(line 121,col 5)-(line 121,col 30)",
        "(line 123,col 5)-(line 123,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testCycles1()",
      "begin_line": 127,
      "end_line": 148,
      "comment": " Tests a graph with some cycles. ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 61)",
        "(line 129,col 5)-(line 129,col 35)",
        "(line 130,col 5)-(line 130,col 35)",
        "(line 131,col 5)-(line 131,col 35)",
        "(line 132,col 5)-(line 132,col 35)",
        "(line 133,col 5)-(line 133,col 35)",
        "(line 134,col 5)-(line 134,col 35)",
        "(line 136,col 5)-(line 136,col 29)",
        "(line 137,col 5)-(line 137,col 29)",
        "(line 138,col 5)-(line 138,col 29)",
        "(line 139,col 5)-(line 139,col 29)",
        "(line 140,col 5)-(line 140,col 29)",
        "(line 141,col 5)-(line 141,col 29)",
        "(line 143,col 5)-(line 143,col 75)",
        "(line 144,col 5)-(line 144,col 75)",
        "(line 145,col 5)-(line 145,col 75)",
        "(line 146,col 5)-(line 146,col 75)",
        "(line 147,col 5)-(line 147,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testCycles2()",
      "begin_line": 155,
      "end_line": 169,
      "comment": "\n   * Tests another graph with cycles. The topology of this graph was inspired\n   * by a control flow graph that was being incorrectly analyzed by an early\n   * version of CheckPathsBetweenNodes.\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 61)",
        "(line 157,col 5)-(line 157,col 35)",
        "(line 158,col 5)-(line 158,col 35)",
        "(line 159,col 5)-(line 159,col 35)",
        "(line 160,col 5)-(line 160,col 35)",
        "(line 162,col 5)-(line 162,col 29)",
        "(line 163,col 5)-(line 163,col 29)",
        "(line 164,col 5)-(line 164,col 29)",
        "(line 165,col 5)-(line 165,col 29)",
        "(line 167,col 5)-(line 167,col 75)",
        "(line 168,col 5)-(line 168,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testCycles3()",
      "begin_line": 176,
      "end_line": 191,
      "comment": "\n   * Tests another graph with cycles. The topology of this graph was inspired\n   * by a control flow graph that was being incorrectly analyzed by an early\n   * version of CheckPathsBetweenNodes.\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 61)",
        "(line 178,col 5)-(line 178,col 35)",
        "(line 179,col 5)-(line 179,col 35)",
        "(line 180,col 5)-(line 180,col 35)",
        "(line 181,col 5)-(line 181,col 35)",
        "(line 183,col 5)-(line 183,col 29)",
        "(line 184,col 5)-(line 184,col 29)",
        "(line 185,col 5)-(line 185,col 29)",
        "(line 186,col 5)-(line 186,col 29)",
        "(line 187,col 5)-(line 187,col 29)",
        "(line 189,col 5)-(line 189,col 75)",
        "(line 190,col 5)-(line 190,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomePath1()",
      "begin_line": 198,
      "end_line": 220,
      "comment": "\n   * Much of the tests are done by testing all paths. We quickly verified\n   * that some paths are indeed correct for the some path case.\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 61)",
        "(line 200,col 5)-(line 200,col 35)",
        "(line 201,col 5)-(line 201,col 35)",
        "(line 202,col 5)-(line 202,col 35)",
        "(line 203,col 5)-(line 203,col 35)",
        "(line 205,col 5)-(line 205,col 29)",
        "(line 206,col 5)-(line 206,col 29)",
        "(line 207,col 5)-(line 207,col 29)",
        "(line 208,col 5)-(line 208,col 29)",
        "(line 210,col 5)-(line 211,col 38)",
        "(line 212,col 5)-(line 213,col 38)",
        "(line 214,col 5)-(line 215,col 38)",
        "(line 216,col 5)-(line 217,col 38)",
        "(line 218,col 5)-(line 219,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomePath2()",
      "begin_line": 222,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 61)",
        "(line 225,col 5)-(line 225,col 35)",
        "(line 226,col 5)-(line 226,col 35)",
        "(line 228,col 5)-(line 229,col 38)",
        "(line 230,col 5)-(line 231,col 38)",
        "(line 232,col 5)-(line 233,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testSomePathRevisiting()",
      "begin_line": 236,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 61)",
        "(line 238,col 5)-(line 238,col 35)",
        "(line 239,col 5)-(line 239,col 36)",
        "(line 240,col 5)-(line 240,col 36)",
        "(line 241,col 5)-(line 241,col 35)",
        "(line 242,col 5)-(line 242,col 36)",
        "(line 243,col 5)-(line 243,col 36)",
        "(line 244,col 5)-(line 244,col 35)",
        "(line 245,col 5)-(line 245,col 30)",
        "(line 246,col 5)-(line 246,col 30)",
        "(line 247,col 5)-(line 247,col 30)",
        "(line 248,col 5)-(line 248,col 30)",
        "(line 249,col 5)-(line 249,col 30)",
        "(line 250,col 5)-(line 250,col 30)",
        "(line 251,col 5)-(line 251,col 30)",
        "(line 252,col 5)-(line 252,col 30)",
        "(line 254,col 5)-(line 255,col 62)",
        "(line 257,col 5)-(line 258,col 38)",
        "(line 261,col 5)-(line 261,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.testNonInclusive()",
      "begin_line": 264,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 61)",
        "(line 267,col 5)-(line 267,col 35)",
        "(line 268,col 5)-(line 268,col 35)",
        "(line 269,col 5)-(line 269,col 35)",
        "(line 270,col 5)-(line 270,col 29)",
        "(line 271,col 5)-(line 271,col 29)",
        "(line 272,col 5)-(line 273,col 72)",
        "(line 274,col 5)-(line 275,col 72)",
        "(line 276,col 5)-(line 277,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.assertGood(com.google.javascript.jscomp.CheckPathsBetweenNodes\u003cN, E\u003e)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.assertBad(com.google.javascript.jscomp.CheckPathsBetweenNodes\u003cN, E\u003e)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.createTest(com.google.javascript.jscomp.graph.DiGraph\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, java.lang.String, com.google.common.base.Predicate\u003cjava.lang.String\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cjava.lang.String, java.lang.String\u003e\u003e)",
      "begin_line": 288,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 296,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.createNonInclusiveTest(com.google.javascript.jscomp.graph.DiGraph\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, java.lang.String, com.google.common.base.Predicate\u003cjava.lang.String\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cjava.lang.String, java.lang.String\u003e\u003e)",
      "begin_line": 299,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 308,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.edgeIs(java.lang.Object)",
      "begin_line": 311,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 318,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.Anonymous-fbe1757d-a391-4908-8be8-a5037e68d64c.apply(com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003cT\u003e"
      ],
      "begin_line": 321,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.CountingPredicate.CountingPredicate(com.google.common.base.Predicate\u003cT\u003e)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodesTest.CountingPredicate.apply(T)",
      "begin_line": 329,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 15)",
        "(line 332,col 7)-(line 332,col 35)"
      ]
    }
  ]
}