{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/SideEffectsAnalysisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SideEffectsAnalysisTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 30,
      "end_line": 625,
      "comment": "\n * Tests for {@link SideEffectsAnalysis}.\n *\n * @author dcc@google.com (Devin Coughlin)\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHARED_EXTERNS"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentLocationAbstractionIdentifier"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentAnalysis"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentCompiler"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentJsRoot"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 42,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 31)",
        "(line 46,col 5)-(line 47,col 46)",
        "(line 49,col 5)-(line 68,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.Anonymous-434f9c7c-e7a3-4edd-8794-b0fbe57378f5.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 65,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.setUp()",
      "begin_line": 71,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 18)",
        "(line 75,col 5)-(line 75,col 27)",
        "(line 76,col 5)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testDegenerateSafeMoves()",
      "begin_line": 79,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 56)",
        "(line 84,col 5)-(line 84,col 57)",
        "(line 87,col 5)-(line 87,col 57)",
        "(line 88,col 5)-(line 88,col 57)",
        "(line 91,col 5)-(line 91,col 59)",
        "(line 93,col 5)-(line 93,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testVisibilitySafeMoves()",
      "begin_line": 96,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 56)",
        "(line 101,col 5)-(line 101,col 57)",
        "(line 104,col 5)-(line 104,col 64)",
        "(line 105,col 5)-(line 105,col 64)",
        "(line 108,col 5)-(line 108,col 66)",
        "(line 109,col 5)-(line 109,col 66)",
        "(line 112,col 5)-(line 119,col 15)",
        "(line 122,col 5)-(line 129,col 15)",
        "(line 132,col 5)-(line 140,col 15)",
        "(line 143,col 5)-(line 151,col 15)",
        "(line 155,col 5)-(line 165,col 14)",
        "(line 168,col 5)-(line 178,col 13)",
        "(line 181,col 5)-(line 188,col 15)",
        "(line 191,col 5)-(line 198,col 15)",
        "(line 201,col 5)-(line 207,col 20)",
        "(line 210,col 5)-(line 216,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testDegenerateUnsafeMoves()",
      "begin_line": 220,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 66)",
        "(line 226,col 5)-(line 226,col 66)",
        "(line 229,col 5)-(line 229,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testVisibilityUnsafeMoves()",
      "begin_line": 232,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 70)",
        "(line 238,col 5)-(line 240,col 13)",
        "(line 243,col 5)-(line 249,col 14)",
        "(line 252,col 5)-(line 252,col 74)",
        "(line 255,col 5)-(line 255,col 70)",
        "(line 258,col 5)-(line 260,col 13)",
        "(line 263,col 5)-(line 269,col 14)",
        "(line 272,col 5)-(line 272,col 74)",
        "(line 275,col 5)-(line 275,col 76)",
        "(line 278,col 5)-(line 280,col 13)",
        "(line 283,col 5)-(line 289,col 14)",
        "(line 292,col 5)-(line 292,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testVisibilityMoveCalls()",
      "begin_line": 295,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 311,col 15)",
        "(line 314,col 5)-(line 322,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testVisibilityMergesParametersWithHeap()",
      "begin_line": 325,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 337,col 15)",
        "(line 340,col 5)-(line 346,col 15)",
        "(line 349,col 5)-(line 355,col 15)",
        "(line 358,col 5)-(line 364,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.testMovedSideEffectsMustHaveSameControlFlow()",
      "begin_line": 367,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 380,col 6)",
        "(line 383,col 5)-(line 395,col 6)",
        "(line 398,col 5)-(line 409,col 6)",
        "(line 412,col 5)-(line 422,col 6)",
        "(line 425,col 5)-(line 436,col 6)",
        "(line 439,col 5)-(line 450,col 6)",
        "(line 453,col 5)-(line 464,col 6)",
        "(line 467,col 5)-(line 477,col 6)",
        "(line 480,col 5)-(line 490,col 6)",
        "(line 495,col 5)-(line 507,col 6)",
        "(line 510,col 5)-(line 524,col 6)",
        "(line 527,col 5)-(line 536,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.environment(com.google.javascript.rhino.Node...)",
      "begin_line": 539,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 542,col 5)-(line 543,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.assertMove(com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode, java.lang.String, boolean)",
      "begin_line": 546,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 549,col 5)-(line 549,col 67)",
        "(line 551,col 5)-(line 551,col 50)",
        "(line 552,col 5)-(line 552,col 55)",
        "(line 553,col 5)-(line 553,col 56)",
        "(line 555,col 5)-(line 556,col 55)",
        "(line 558,col 5)-(line 562,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.assertSafeMoveDegenerate(java.lang.String)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 5)-(line 566,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.assertUnsafeMoveDegenerate(java.lang.String)",
      "begin_line": 569,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.assertSafeMoveVisibility(java.lang.String)",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 5)-(line 574,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.assertUnsafeMoveVisibility(java.lang.String)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.compileAndRun(java.lang.String, com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode)",
      "begin_line": 581,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 584,col 5)-(line 584,col 73)",
        "(line 586,col 5)-(line 586,col 39)",
        "(line 588,col 5)-(line 588,col 43)",
        "(line 590,col 5)-(line 590,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.findLabeledStatement(java.lang.String)",
      "begin_line": 594,
      "end_line": 601,
      "comment": " Shamelessly stolen from NameReferenceGraphConstructionTest",
      "child_ranges": [
        "(line 595,col 5)-(line 595,col 69)",
        "(line 597,col 5)-(line 597,col 75)",
        "(line 598,col 5)-(line 598,col 79)",
        "(line 600,col 5)-(line 600,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabeledStatementSearcher",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 609,
      "end_line": 624,
      "comment": "\n   * Quick traversal to find a given labeled statement in the AST.\n   *\n   * Given \"foo\", finds the statement a \u003d x in\n   * foo: a \u003d x;\n   "
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 611,
      "end_line": 611,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.LabeledStatementSearcher.LabeledStatementSearcher(java.lang.String)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 614,col 7)-(line 614,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysisTest.LabeledStatementSearcher.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 616,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 618,col 7)-(line 622,col 7)"
      ]
    }
  ]
}