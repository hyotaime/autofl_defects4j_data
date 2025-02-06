{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ControlFlowAnalysisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ControlFlowAnalysisTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 37,
      "end_line": 1442,
      "comment": "\n * Tests {@link ControlFlowAnalysis}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testCfg(java.lang.String, java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n   * Given an input in JavaScript, test if the control flow analysis\n   * creates the proper control flow graph by comparing the expected\n   * Dot file output.\n   *\n   * @param input Input JavaScript.\n   * @param expected Expected Graphviz Dot file.\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.getAllEdges(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 54,
      "end_line": 63,
      "comment": "\n   * Gets all the edges of the graph.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 65)",
        "(line 57,col 5)-(line 61,col 5)",
        "(line 62,col 5)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.getAllEdges(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int)",
      "begin_line": 69,
      "end_line": 83,
      "comment": "\n   * Gets all the control flow edges from some node with the first token to\n   * some node with the second token.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 61)",
        "(line 72,col 5)-(line 72,col 62)",
        "(line 73,col 5)-(line 81,col 5)",
        "(line 82,col 5)-(line 82,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.getAllEdges(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int, com.google.javascript.jscomp.ControlFlowGraph.Branch)",
      "begin_line": 89,
      "end_line": 100,
      "comment": "\n   * Gets all the control flow edges of the given type from some node with the\n   * first token to some node with the second token.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 47)",
        "(line 93,col 5)-(line 93,col 62)",
        "(line 94,col 5)-(line 98,col 5)",
        "(line 99,col 5)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.isAncestor(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 109,col 5)",
        "(line 111,col 5)-(line 111,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.getAllDownEdges(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int, com.google.javascript.jscomp.ControlFlowGraph.Branch)",
      "begin_line": 119,
      "end_line": 134,
      "comment": "\n   * Gets all the control flow edges of the given type from some node with\n   * the first token to some node with the second token.\n   * This edge must flow from a parent to one of its descendants.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 122,col 53)",
        "(line 123,col 5)-(line 123,col 62)",
        "(line 124,col 5)-(line 131,col 5)",
        "(line 133,col 5)-(line 133,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertNoEdge(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n   * Assert that there exists a control flow edge of the given type\n   * from some node with the first token to some node with the second token.\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertDownEdge(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int, com.google.javascript.jscomp.ControlFlowGraph.Branch)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n   * Assert that there exists a control flow edge of the given type\n   * from some node with the first token to some node with the second token.\n   * This edge must flow from a parent to one of its descendants.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertUpEdge(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int, com.google.javascript.jscomp.ControlFlowGraph.Branch)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n   * Assert that there exists a control flow edge of the given type\n   * from some node with the first token to some node with the second token.\n   * This edge must flow from a node to one of its ancestors.\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 164,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertCrossEdge(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int, int, com.google.javascript.jscomp.ControlFlowGraph.Branch)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n   * Assert that there exists a control flow edge of the given type\n   * from some node with the first token to some node with the second token.\n   * This edge must flow between two nodes that are not in the same subtree.\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 79)",
        "(line 175,col 5)-(line 175,col 77)",
        "(line 176,col 5)-(line 176,col 71)",
        "(line 177,col 5)-(line 177,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertReturnEdge(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int)",
      "begin_line": 184,
      "end_line": 197,
      "comment": "\n   * Assert that there exists a control flow edge of the given type\n   * from some node with the first token to the return node.\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 61)",
        "(line 187,col 5)-(line 194,col 5)",
        "(line 196,col 5)-(line 196,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertNoReturnEdge(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, int)",
      "begin_line": 203,
      "end_line": 215,
      "comment": "\n   * Assert that there exists no control flow edge of the given type\n   * from some node with the first token to the return node.\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 61)",
        "(line 206,col 5)-(line 214,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.createCfg(java.lang.String, boolean)",
      "begin_line": 222,
      "end_line": 235,
      "comment": "\n   * Given an input in JavaScript, get a control flow graph for it.\n   *\n   * @param input Input JavaScript.\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 39)",
        "(line 225,col 5)-(line 225,col 76)",
        "(line 227,col 5)-(line 227,col 62)",
        "(line 228,col 5)-(line 232,col 5)",
        "(line 233,col 5)-(line 233,col 28)",
        "(line 234,col 5)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.createCfg(java.lang.String)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testCfg(java.lang.String, java.lang.String, boolean)",
      "begin_line": 252,
      "end_line": 266,
      "comment": "\n   * Given an input in JavaScript, test if the control flow analysis\n   * creates the proper control flow graph by comparing the expected\n   * Dot file output.\n   *\n   * @param input Input JavaScript.\n   * @param expected Expected Graphviz Dot file.\n   * @param shouldTraverseFunctions Whether to traverse functions when\n   *    constructing the CFG (true by default). Passed in to the\n   *    constructor of {@link ControlFlowAnalysis}.\n   ",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 39)",
        "(line 255,col 5)-(line 256,col 73)",
        "(line 258,col 5)-(line 258,col 62)",
        "(line 259,col 5)-(line 259,col 28)",
        "(line 260,col 5)-(line 260,col 46)",
        "(line 261,col 5)-(line 265,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleStatements()",
      "begin_line": 268,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 39)",
        "(line 270,col 5)-(line 270,col 48)",
        "(line 271,col 5)-(line 271,col 64)",
        "(line 272,col 5)-(line 272,col 70)",
        "(line 273,col 5)-(line 273,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleIf()",
      "begin_line": 277,
      "end_line": 287,
      "comment": " Test a simple IF control flow.",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 55)",
        "(line 279,col 5)-(line 279,col 48)",
        "(line 280,col 5)-(line 280,col 64)",
        "(line 281,col 5)-(line 281,col 61)",
        "(line 282,col 5)-(line 282,col 63)",
        "(line 283,col 5)-(line 283,col 71)",
        "(line 284,col 5)-(line 284,col 53)",
        "(line 285,col 5)-(line 285,col 64)",
        "(line 286,col 5)-(line 286,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testBreakingBlock()",
      "begin_line": 289,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 45)",
        "(line 292,col 5)-(line 292,col 48)",
        "(line 293,col 5)-(line 293,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testBreakingTryBlock()",
      "begin_line": 296,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 59)",
        "(line 298,col 5)-(line 298,col 48)",
        "(line 299,col 5)-(line 299,col 63)",
        "(line 301,col 5)-(line 301,col 50)",
        "(line 302,col 5)-(line 302,col 25)",
        "(line 303,col 5)-(line 303,col 63)",
        "(line 305,col 5)-(line 305,col 51)",
        "(line 306,col 5)-(line 306,col 25)",
        "(line 307,col 5)-(line 307,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testWithStatement()",
      "begin_line": 310,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 45)",
        "(line 312,col 5)-(line 312,col 48)",
        "(line 313,col 5)-(line 313,col 64)",
        "(line 314,col 5)-(line 314,col 46)",
        "(line 315,col 5)-(line 315,col 47)",
        "(line 316,col 5)-(line 316,col 71)",
        "(line 317,col 5)-(line 317,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleWhile()",
      "begin_line": 321,
      "end_line": 328,
      "comment": " Test a simple WHILE control flow with BREAKs.",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 67)",
        "(line 323,col 5)-(line 323,col 48)",
        "(line 324,col 5)-(line 324,col 66)",
        "(line 325,col 5)-(line 325,col 71)",
        "(line 326,col 5)-(line 326,col 63)",
        "(line 327,col 5)-(line 327,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleSwitch()",
      "begin_line": 330,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 332,col 27)",
        "(line 333,col 5)-(line 333,col 48)",
        "(line 334,col 5)-(line 334,col 65)",
        "(line 335,col 5)-(line 335,col 48)",
        "(line 337,col 5)-(line 337,col 65)",
        "(line 338,col 5)-(line 338,col 66)",
        "(line 339,col 5)-(line 339,col 74)",
        "(line 341,col 5)-(line 341,col 65)",
        "(line 342,col 5)-(line 342,col 71)",
        "(line 343,col 5)-(line 343,col 53)",
        "(line 344,col 5)-(line 344,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleNoDefault()",
      "begin_line": 347,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 348,col 60)",
        "(line 349,col 5)-(line 349,col 48)",
        "(line 350,col 5)-(line 350,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSwitchDefaultFirst()",
      "begin_line": 353,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 70)",
        "(line 356,col 5)-(line 356,col 48)",
        "(line 357,col 5)-(line 357,col 65)",
        "(line 358,col 5)-(line 358,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSwitchDefaultInMiddle()",
      "begin_line": 361,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 364,col 27)",
        "(line 365,col 5)-(line 365,col 48)",
        "(line 366,col 5)-(line 366,col 65)",
        "(line 367,col 5)-(line 367,col 66)",
        "(line 368,col 5)-(line 368,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSwitchEmpty()",
      "begin_line": 371,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 43)",
        "(line 374,col 5)-(line 374,col 48)",
        "(line 375,col 5)-(line 375,col 67)",
        "(line 376,col 5)-(line 376,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testReturnThrowingException()",
      "begin_line": 379,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 70)",
        "(line 381,col 5)-(line 381,col 48)",
        "(line 382,col 5)-(line 382,col 66)",
        "(line 383,col 5)-(line 383,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleFor()",
      "begin_line": 387,
      "end_line": 440,
      "comment": " Test a simple FOR loop.",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 65)",
        "(line 389,col 5)-(line 438,col 12)",
        "(line 439,col 5)-(line 439,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleForWithContinue()",
      "begin_line": 442,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 75)",
        "(line 444,col 5)-(line 505,col 12)",
        "(line 506,col 5)-(line 506,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testNestedFor()",
      "begin_line": 509,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 511,col 5)-(line 512,col 24)",
        "(line 513,col 5)-(line 606,col 12)",
        "(line 607,col 5)-(line 607,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testNestedDoWithBreak()",
      "begin_line": 610,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 612,col 5)-(line 612,col 72)",
        "(line 613,col 5)-(line 672,col 12)",
        "(line 673,col 5)-(line 673,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testForIn()",
      "begin_line": 676,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 677,col 5)-(line 677,col 45)",
        "(line 678,col 5)-(line 711,col 12)",
        "(line 712,col 5)-(line 712,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testThrow()",
      "begin_line": 715,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 716,col 5)-(line 716,col 49)",
        "(line 717,col 5)-(line 746,col 12)",
        "(line 747,col 5)-(line 747,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleFunction()",
      "begin_line": 751,
      "end_line": 788,
      "comment": " Test a simple FUNCTION.",
      "child_ranges": [
        "(line 752,col 5)-(line 752,col 44)",
        "(line 753,col 5)-(line 786,col 12)",
        "(line 787,col 5)-(line 787,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleCatch()",
      "begin_line": 790,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 791,col 5)-(line 791,col 76)",
        "(line 792,col 5)-(line 873,col 16)",
        "(line 874,col 5)-(line 874,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testFunctionWithinTry()",
      "begin_line": 877,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 879,col 5)-(line 879,col 65)",
        "(line 880,col 5)-(line 923,col 16)",
        "(line 924,col 5)-(line 924,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testNestedCatch()",
      "begin_line": 927,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 929,col 5)-(line 929,col 65)",
        "(line 930,col 5)-(line 991,col 16)",
        "(line 992,col 5)-(line 992,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleFinally()",
      "begin_line": 995,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 996,col 5)-(line 996,col 46)",
        "(line 997,col 5)-(line 997,col 48)",
        "(line 998,col 5)-(line 998,col 63)",
        "(line 999,col 5)-(line 999,col 63)",
        "(line 1001,col 5)-(line 1001,col 72)",
        "(line 1003,col 5)-(line 1003,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSimpleCatchFinally()",
      "begin_line": 1006,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1008,col 5)-(line 1008,col 70)",
        "(line 1009,col 5)-(line 1080,col 16)",
        "(line 1081,col 5)-(line 1081,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testComplicatedFinally2()",
      "begin_line": 1084,
      "end_line": 1095,
      "comment": "",
      "child_ranges": [
        "(line 1086,col 5)-(line 1088,col 38)",
        "(line 1090,col 5)-(line 1090,col 48)",
        "(line 1092,col 5)-(line 1092,col 69)",
        "(line 1093,col 5)-(line 1093,col 66)",
        "(line 1094,col 5)-(line 1094,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testDeepNestedBreakwithFinally()",
      "begin_line": 1097,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1098,col 5)-(line 1099,col 32)",
        "(line 1100,col 5)-(line 1100,col 48)",
        "(line 1101,col 5)-(line 1101,col 66)",
        "(line 1102,col 5)-(line 1102,col 63)",
        "(line 1103,col 5)-(line 1103,col 63)",
        "(line 1105,col 5)-(line 1105,col 66)",
        "(line 1107,col 5)-(line 1107,col 65)",
        "(line 1108,col 5)-(line 1108,col 68)",
        "(line 1109,col 5)-(line 1109,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testDeepNestedFinally()",
      "begin_line": 1112,
      "end_line": 1119,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 5)-(line 1114,col 60)",
        "(line 1115,col 5)-(line 1115,col 48)",
        "(line 1116,col 5)-(line 1116,col 65)",
        "(line 1117,col 5)-(line 1117,col 64)",
        "(line 1118,col 5)-(line 1118,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testReturn()",
      "begin_line": 1121,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 5)-(line 1122,col 44)",
        "(line 1123,col 5)-(line 1123,col 48)",
        "(line 1124,col 5)-(line 1124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testReturnInFinally()",
      "begin_line": 1127,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1128,col 5)-(line 1128,col 62)",
        "(line 1129,col 5)-(line 1129,col 48)",
        "(line 1130,col 5)-(line 1130,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testReturnInFinally2()",
      "begin_line": 1133,
      "end_line": 1141,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 5)-(line 1135,col 64)",
        "(line 1136,col 5)-(line 1136,col 48)",
        "(line 1137,col 5)-(line 1137,col 65)",
        "(line 1138,col 5)-(line 1138,col 67)",
        "(line 1139,col 5)-(line 1139,col 39)",
        "(line 1140,col 5)-(line 1140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testReturnInTry()",
      "begin_line": 1143,
      "end_line": 1152,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 5)-(line 1144,col 72)",
        "(line 1145,col 5)-(line 1145,col 48)",
        "(line 1146,col 5)-(line 1146,col 73)",
        "(line 1147,col 5)-(line 1147,col 67)",
        "(line 1148,col 5)-(line 1148,col 64)",
        "(line 1149,col 5)-(line 1149,col 37)",
        "(line 1150,col 5)-(line 1150,col 39)",
        "(line 1151,col 5)-(line 1151,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testOptionNotToTraverseFunctions()",
      "begin_line": 1154,
      "end_line": 1224,
      "comment": "",
      "child_ranges": [
        "(line 1155,col 5)-(line 1155,col 57)",
        "(line 1156,col 5)-(line 1185,col 12)",
        "(line 1186,col 5)-(line 1221,col 12)",
        "(line 1222,col 5)-(line 1222,col 27)",
        "(line 1223,col 5)-(line 1223,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testInstanceOf()",
      "begin_line": 1226,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1227,col 5)-(line 1227,col 58)",
        "(line 1228,col 5)-(line 1228,col 54)",
        "(line 1229,col 5)-(line 1229,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testSynBlock()",
      "begin_line": 1232,
      "end_line": 1236,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 5)-(line 1233,col 49)",
        "(line 1234,col 5)-(line 1234,col 54)",
        "(line 1235,col 5)-(line 1235,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testPartialTraversalOfScope()",
      "begin_line": 1238,
      "end_line": 1252,
      "comment": "",
      "child_ranges": [
        "(line 1239,col 5)-(line 1239,col 39)",
        "(line 1240,col 5)-(line 1240,col 76)",
        "(line 1242,col 5)-(line 1242,col 70)",
        "(line 1243,col 5)-(line 1243,col 71)",
        "(line 1245,col 5)-(line 1245,col 44)",
        "(line 1247,col 5)-(line 1247,col 31)",
        "(line 1248,col 5)-(line 1248,col 46)",
        "(line 1250,col 5)-(line 1250,col 40)",
        "(line 1251,col 5)-(line 1251,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testForLoopOrder()",
      "begin_line": 1254,
      "end_line": 1261,
      "comment": "",
      "child_ranges": [
        "(line 1255,col 5)-(line 1260,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testLabelledForInLoopOrder()",
      "begin_line": 1263,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1264,col 5)-(line 1272,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testLocalFunctionOrder()",
      "begin_line": 1275,
      "end_line": 1285,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 5)-(line 1277,col 68)",
        "(line 1278,col 5)-(line 1284,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testDoWhileOrder()",
      "begin_line": 1287,
      "end_line": 1292,
      "comment": "",
      "child_ranges": [
        "(line 1288,col 5)-(line 1291,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testBreakInFinally1()",
      "begin_line": 1294,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1295,col 5)-(line 1308,col 13)",
        "(line 1309,col 5)-(line 1385,col 14)",
        "(line 1386,col 5)-(line 1386,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.testBreakInFinally2()",
      "begin_line": 1389,
      "end_line": 1406,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 5)-(line 1401,col 24)",
        "(line 1403,col 5)-(line 1403,col 48)",
        "(line 1404,col 5)-(line 1404,col 72)",
        "(line 1405,col 5)-(line 1405,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysisTest.assertNodeOrder(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 1419,
      "end_line": 1441,
      "comment": "\n   * Asserts the priority order of CFG nodes.\n   *\n   * Checks that the node type of the highest-priority node matches the\n   * first element of the list, the type of the second node matches the\n   * second element of the list, and so on.\n   *\n   * @param cfg The control flow graph.\n   * @param nodeTypes The expected node types, in order.\n   ",
      "child_ranges": [
        "(line 1421,col 5)-(line 1422,col 56)",
        "(line 1423,col 5)-(line 1423,col 68)",
        "(line 1426,col 5)-(line 1426,col 74)",
        "(line 1427,col 5)-(line 1428,col 24)",
        "(line 1430,col 5)-(line 1431,col 43)",
        "(line 1432,col 5)-(line 1440,col 5)"
      ]
    }
  ]
}