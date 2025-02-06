{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/CallGraphTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallGraphTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 36,
      "end_line": 1157,
      "comment": "\n * Tests for CallGraph.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "currentProcessor"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createForwardCallGraph"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createBackwardCallGraph"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 47,col 33)",
        "(line 49,col 5)-(line 49,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SHARED_EXTERNS"
      ],
      "begin_line": 52,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetFunctionForAstNode()",
      "begin_line": 57,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 41)",
        "(line 60,col 5)-(line 60,col 55)",
        "(line 62,col 5)-(line 62,col 76)",
        "(line 64,col 5)-(line 64,col 48)",
        "(line 66,col 5)-(line 66,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllFunctions()",
      "begin_line": 69,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 74,col 15)",
        "(line 76,col 5)-(line 76,col 55)",
        "(line 78,col 5)-(line 78,col 75)",
        "(line 81,col 5)-(line 81,col 38)",
        "(line 83,col 5)-(line 84,col 49)",
        "(line 85,col 5)-(line 86,col 49)",
        "(line 87,col 5)-(line 88,col 49)",
        "(line 90,col 5)-(line 90,col 72)",
        "(line 91,col 5)-(line 91,col 72)",
        "(line 92,col 5)-(line 92,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllFunctionsContainsNormalFunction()",
      "begin_line": 95,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 39)",
        "(line 98,col 5)-(line 98,col 55)",
        "(line 100,col 5)-(line 100,col 78)",
        "(line 103,col 5)-(line 103,col 41)",
        "(line 105,col 4)-(line 105,col 79)",
        "(line 106,col 4)-(line 106,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllFunctionsContainsVarAssignedLiteralFunction()",
      "begin_line": 109,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 45)",
        "(line 112,col 5)-(line 112,col 55)",
        "(line 114,col 5)-(line 114,col 78)",
        "(line 117,col 5)-(line 117,col 41)",
        "(line 119,col 5)-(line 119,col 66)",
        "(line 120,col 5)-(line 120,col 49)",
        "(line 121,col 5)-(line 121,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllFunctionsContainsNamespaceAssignedLiteralFunction()",
      "begin_line": 124,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 127,col 40)",
        "(line 129,col 5)-(line 129,col 55)",
        "(line 131,col 5)-(line 131,col 78)",
        "(line 134,col 5)-(line 134,col 41)",
        "(line 136,col 5)-(line 137,col 61)",
        "(line 138,col 5)-(line 138,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllFunctionsContainsLocalFunction()",
      "begin_line": 141,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 143,col 54)",
        "(line 145,col 5)-(line 145,col 55)",
        "(line 147,col 5)-(line 147,col 78)",
        "(line 150,col 5)-(line 150,col 41)",
        "(line 152,col 5)-(line 152,col 80)",
        "(line 153,col 5)-(line 153,col 80)",
        "(line 154,col 5)-(line 154,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllFunctionsContainsAnonymousFunction()",
      "begin_line": 157,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 159,col 51)",
        "(line 161,col 5)-(line 161,col 55)",
        "(line 163,col 5)-(line 163,col 78)",
        "(line 166,col 5)-(line 166,col 41)",
        "(line 168,col 5)-(line 168,col 80)",
        "(line 169,col 5)-(line 170,col 74)",
        "(line 171,col 5)-(line 171,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetCallsiteForAstNode()",
      "begin_line": 174,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 177,col 28)",
        "(line 179,col 5)-(line 179,col 56)",
        "(line 181,col 5)-(line 181,col 76)",
        "(line 182,col 5)-(line 183,col 61)",
        "(line 185,col 5)-(line 185,col 45)",
        "(line 187,col 5)-(line 187,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetCallsites()",
      "begin_line": 190,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 195,col 15)",
        "(line 197,col 5)-(line 197,col 55)",
        "(line 199,col 5)-(line 199,col 76)",
        "(line 200,col 5)-(line 201,col 43)",
        "(line 203,col 5)-(line 203,col 41)",
        "(line 205,col 5)-(line 206,col 39)",
        "(line 208,col 5)-(line 208,col 75)",
        "(line 209,col 5)-(line 209,col 58)",
        "(line 210,col 5)-(line 210,col 53)",
        "(line 212,col 5)-(line 213,col 49)",
        "(line 215,col 5)-(line 216,col 43)",
        "(line 218,col 5)-(line 218,col 41)",
        "(line 220,col 5)-(line 221,col 37)",
        "(line 223,col 5)-(line 223,col 75)",
        "(line 224,col 5)-(line 224,col 62)",
        "(line 225,col 5)-(line 225,col 67)",
        "(line 227,col 5)-(line 228,col 49)",
        "(line 230,col 5)-(line 231,col 43)",
        "(line 232,col 5)-(line 232,col 41)",
        "(line 234,col 5)-(line 235,col 37)",
        "(line 237,col 5)-(line 237,col 75)",
        "(line 238,col 5)-(line 238,col 58)",
        "(line 239,col 5)-(line 239,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFindNewInFunction()",
      "begin_line": 242,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 58)",
        "(line 245,col 5)-(line 245,col 55)",
        "(line 247,col 5)-(line 248,col 49)",
        "(line 249,col 5)-(line 250,col 43)",
        "(line 251,col 5)-(line 251,col 41)",
        "(line 253,col 5)-(line 253,col 67)",
        "(line 254,col 5)-(line 254,col 51)",
        "(line 256,col 5)-(line 256,col 57)",
        "(line 257,col 5)-(line 257,col 58)",
        "(line 258,col 5)-(line 258,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFindCallsiteTargetGlobalName()",
      "begin_line": 261,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 265,col 29)",
        "(line 267,col 5)-(line 267,col 55)",
        "(line 269,col 5)-(line 270,col 49)",
        "(line 271,col 5)-(line 271,col 29)",
        "(line 273,col 5)-(line 274,col 61)",
        "(line 275,col 5)-(line 275,col 31)",
        "(line 277,col 5)-(line 278,col 41)",
        "(line 280,col 5)-(line 280,col 40)",
        "(line 281,col 5)-(line 281,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFindCallsiteTargetAliasedGlobalProperty()",
      "begin_line": 284,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 288,col 41)",
        "(line 290,col 5)-(line 290,col 55)",
        "(line 292,col 5)-(line 293,col 49)",
        "(line 294,col 5)-(line 294,col 29)",
        "(line 296,col 5)-(line 297,col 61)",
        "(line 299,col 5)-(line 299,col 31)",
        "(line 301,col 5)-(line 302,col 41)",
        "(line 304,col 5)-(line 304,col 40)",
        "(line 305,col 5)-(line 305,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllCallsitesContainsMultiple()",
      "begin_line": 308,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 315,col 17)",
        "(line 317,col 5)-(line 317,col 56)",
        "(line 319,col 5)-(line 319,col 78)",
        "(line 321,col 5)-(line 321,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllCallsitesContainsGlobalSite()",
      "begin_line": 324,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 327,col 17)",
        "(line 329,col 5)-(line 329,col 56)",
        "(line 331,col 5)-(line 331,col 78)",
        "(line 332,col 5)-(line 332,col 41)",
        "(line 334,col 5)-(line 334,col 68)",
        "(line 335,col 5)-(line 335,col 53)",
        "(line 336,col 5)-(line 336,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllCallsitesContainsLocalSite()",
      "begin_line": 339,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 342,col 31)",
        "(line 344,col 5)-(line 344,col 56)",
        "(line 346,col 5)-(line 346,col 78)",
        "(line 347,col 5)-(line 347,col 41)",
        "(line 349,col 5)-(line 349,col 68)",
        "(line 350,col 5)-(line 350,col 53)",
        "(line 351,col 5)-(line 351,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllCallsitesContainsLiteralSite()",
      "begin_line": 354,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 57)",
        "(line 357,col 5)-(line 357,col 56)",
        "(line 359,col 5)-(line 359,col 78)",
        "(line 360,col 5)-(line 360,col 41)",
        "(line 362,col 5)-(line 362,col 68)",
        "(line 363,col 5)-(line 363,col 53)",
        "(line 364,col 5)-(line 364,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetAllCallsitesContainsConstructorSite()",
      "begin_line": 367,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 368,col 5)-(line 370,col 35)",
        "(line 372,col 5)-(line 372,col 56)",
        "(line 374,col 5)-(line 374,col 78)",
        "(line 375,col 5)-(line 375,col 41)",
        "(line 377,col 5)-(line 377,col 68)",
        "(line 378,col 5)-(line 378,col 52)",
        "(line 379,col 5)-(line 379,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetDirectedGraph_backwardOnBackward()",
      "begin_line": 386,
      "end_line": 441,
      "comment": "\n   * Test getting a backward directed graph on a backward call graph\n   * and propagating over it.\n   ",
      "child_ranges": [
        "(line 392,col 5)-(line 398,col 17)",
        "(line 400,col 5)-(line 400,col 56)",
        "(line 402,col 5)-(line 402,col 62)",
        "(line 405,col 5)-(line 409,col 5)",
        "(line 412,col 5)-(line 427,col 6)",
        "(line 429,col 5)-(line 430,col 65)",
        "(line 433,col 5)-(line 433,col 46)",
        "(line 435,col 5)-(line 436,col 51)",
        "(line 437,col 5)-(line 438,col 51)",
        "(line 439,col 5)-(line 440,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.Anonymous-a947a62f-196f-485b-89fb-d4ee62b12b41.traverseEdge(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 414,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 28)",
        "(line 419,col 13)-(line 423,col 13)",
        "(line 425,col 13)-(line 425,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetDirectedGraph_backwardOnForward()",
      "begin_line": 447,
      "end_line": 502,
      "comment": "\n   * Test getting a backward directed graph on a forward call graph\n   * and propagating over it.\n   ",
      "child_ranges": [
        "(line 453,col 5)-(line 459,col 17)",
        "(line 461,col 5)-(line 461,col 55)",
        "(line 463,col 5)-(line 463,col 62)",
        "(line 466,col 5)-(line 470,col 5)",
        "(line 473,col 5)-(line 488,col 6)",
        "(line 490,col 5)-(line 491,col 65)",
        "(line 494,col 5)-(line 494,col 46)",
        "(line 496,col 5)-(line 497,col 51)",
        "(line 498,col 5)-(line 499,col 51)",
        "(line 500,col 5)-(line 501,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.Anonymous-ca120070-80c7-42c1-a662-02bd70ef2667.traverseEdge(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 475,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 28)",
        "(line 480,col 13)-(line 484,col 13)",
        "(line 486,col 13)-(line 486,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetDirectedGraph_forwardOnForward()",
      "begin_line": 508,
      "end_line": 578,
      "comment": "\n   * Test getting a forward directed graph on a forward call graph\n   * and propagating over it.\n   ",
      "child_ranges": [
        "(line 513,col 5)-(line 522,col 17)",
        "(line 524,col 5)-(line 524,col 55)",
        "(line 526,col 5)-(line 526,col 63)",
        "(line 529,col 5)-(line 529,col 56)",
        "(line 530,col 5)-(line 530,col 69)",
        "(line 534,col 5)-(line 549,col 6)",
        "(line 551,col 5)-(line 552,col 64)",
        "(line 557,col 5)-(line 557,col 47)",
        "(line 559,col 5)-(line 560,col 51)",
        "(line 561,col 5)-(line 562,col 51)",
        "(line 563,col 5)-(line 564,col 51)",
        "(line 565,col 5)-(line 566,col 51)",
        "(line 567,col 5)-(line 568,col 51)",
        "(line 569,col 5)-(line 570,col 51)",
        "(line 571,col 5)-(line 572,col 38)",
        "(line 574,col 5)-(line 575,col 51)",
        "(line 576,col 5)-(line 577,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.Anonymous-b2f4fc4b-6a08-42d0-b880-54eecf0c7155.traverseEdge(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 536,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 539,col 13)-(line 539,col 28)",
        "(line 541,col 13)-(line 545,col 13)",
        "(line 547,col 13)-(line 547,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testGetDirectedGraph_forwardOnBackward()",
      "begin_line": 584,
      "end_line": 654,
      "comment": "\n   * Test getting a backward directed graph on a forward call graph\n   * and propagating over it.\n   ",
      "child_ranges": [
        "(line 589,col 5)-(line 598,col 17)",
        "(line 600,col 5)-(line 600,col 56)",
        "(line 602,col 5)-(line 602,col 63)",
        "(line 605,col 5)-(line 605,col 56)",
        "(line 606,col 5)-(line 606,col 69)",
        "(line 610,col 5)-(line 625,col 6)",
        "(line 627,col 5)-(line 628,col 64)",
        "(line 633,col 5)-(line 633,col 47)",
        "(line 635,col 5)-(line 636,col 51)",
        "(line 637,col 5)-(line 638,col 51)",
        "(line 639,col 5)-(line 640,col 51)",
        "(line 641,col 5)-(line 642,col 51)",
        "(line 643,col 5)-(line 644,col 51)",
        "(line 645,col 5)-(line 646,col 51)",
        "(line 647,col 5)-(line 648,col 38)",
        "(line 650,col 5)-(line 651,col 51)",
        "(line 652,col 5)-(line 653,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.Anonymous-ea7d4edd-7f81-46b2-be39-32f83218d871.traverseEdge(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 612,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 28)",
        "(line 617,col 13)-(line 621,col 13)",
        "(line 623,col 13)-(line 623,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionIsMain()",
      "begin_line": 656,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 657,col 5)-(line 659,col 17)",
        "(line 661,col 5)-(line 661,col 55)",
        "(line 663,col 5)-(line 663,col 66)",
        "(line 665,col 5)-(line 665,col 38)",
        "(line 666,col 5)-(line 666,col 46)",
        "(line 667,col 5)-(line 667,col 53)",
        "(line 669,col 5)-(line 669,col 76)",
        "(line 671,col 5)-(line 671,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetAstNode()",
      "begin_line": 674,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 675,col 5)-(line 677,col 17)",
        "(line 679,col 5)-(line 679,col 55)",
        "(line 681,col 5)-(line 681,col 66)",
        "(line 684,col 5)-(line 684,col 52)",
        "(line 686,col 5)-(line 686,col 76)",
        "(line 689,col 5)-(line 689,col 52)",
        "(line 690,col 5)-(line 690,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetBodyNode()",
      "begin_line": 693,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 694,col 5)-(line 696,col 17)",
        "(line 698,col 5)-(line 698,col 55)",
        "(line 700,col 5)-(line 700,col 66)",
        "(line 703,col 5)-(line 703,col 72)",
        "(line 705,col 5)-(line 705,col 76)",
        "(line 708,col 5)-(line 708,col 50)",
        "(line 709,col 5)-(line 710,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetName()",
      "begin_line": 713,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 714,col 5)-(line 716,col 17)",
        "(line 718,col 5)-(line 718,col 55)",
        "(line 720,col 5)-(line 720,col 66)",
        "(line 723,col 5)-(line 723,col 71)",
        "(line 725,col 5)-(line 725,col 76)",
        "(line 728,col 5)-(line 729,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetCallsitesInFunction()",
      "begin_line": 732,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 733,col 5)-(line 737,col 17)",
        "(line 739,col 5)-(line 739,col 55)",
        "(line 742,col 5)-(line 742,col 66)",
        "(line 743,col 5)-(line 744,col 70)",
        "(line 746,col 5)-(line 746,col 48)",
        "(line 747,col 5)-(line 747,col 50)",
        "(line 748,col 5)-(line 748,col 50)",
        "(line 751,col 5)-(line 751,col 76)",
        "(line 752,col 5)-(line 752,col 63)",
        "(line 755,col 5)-(line 755,col 76)",
        "(line 756,col 5)-(line 757,col 67)",
        "(line 759,col 5)-(line 759,col 45)",
        "(line 760,col 5)-(line 760,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetCallsitesInFunction_ignoreInnerFunction()",
      "begin_line": 763,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 764,col 5)-(line 766,col 28)",
        "(line 768,col 5)-(line 768,col 55)",
        "(line 771,col 5)-(line 771,col 76)",
        "(line 772,col 5)-(line 772,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetCallsitesPossiblyTargetingFunction()",
      "begin_line": 775,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 776,col 5)-(line 780,col 17)",
        "(line 782,col 5)-(line 782,col 56)",
        "(line 784,col 5)-(line 784,col 48)",
        "(line 785,col 5)-(line 785,col 66)",
        "(line 786,col 5)-(line 786,col 66)",
        "(line 787,col 5)-(line 787,col 66)",
        "(line 789,col 5)-(line 789,col 73)",
        "(line 791,col 5)-(line 792,col 58)",
        "(line 795,col 5)-(line 795,col 48)",
        "(line 796,col 5)-(line 797,col 71)",
        "(line 799,col 5)-(line 800,col 56)",
        "(line 803,col 5)-(line 803,col 48)",
        "(line 804,col 5)-(line 805,col 71)",
        "(line 807,col 5)-(line 808,col 56)",
        "(line 811,col 5)-(line 811,col 48)",
        "(line 813,col 5)-(line 814,col 60)",
        "(line 815,col 5)-(line 815,col 73)",
        "(line 817,col 5)-(line 817,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetCallsitesInFunction_newIsCallsite()",
      "begin_line": 820,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 821,col 5)-(line 823,col 35)",
        "(line 825,col 5)-(line 825,col 55)",
        "(line 828,col 5)-(line 828,col 76)",
        "(line 829,col 5)-(line 829,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetIsAliased()",
      "begin_line": 832,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 834,col 5)-(line 843,col 15)",
        "(line 845,col 5)-(line 845,col 33)",
        "(line 847,col 5)-(line 847,col 37)",
        "(line 848,col 5)-(line 848,col 40)",
        "(line 849,col 5)-(line 849,col 37)",
        "(line 850,col 5)-(line 850,col 38)",
        "(line 853,col 5)-(line 865,col 18)",
        "(line 867,col 5)-(line 867,col 33)",
        "(line 869,col 5)-(line 869,col 37)",
        "(line 870,col 5)-(line 870,col 40)",
        "(line 871,col 5)-(line 871,col 37)",
        "(line 872,col 5)-(line 872,col 41)",
        "(line 875,col 5)-(line 885,col 15)",
        "(line 887,col 5)-(line 887,col 33)",
        "(line 889,col 5)-(line 889,col 37)",
        "(line 890,col 5)-(line 890,col 40)",
        "(line 891,col 5)-(line 891,col 37)",
        "(line 892,col 5)-(line 892,col 38)",
        "(line 895,col 5)-(line 902,col 17)",
        "(line 904,col 5)-(line 904,col 33)",
        "(line 906,col 5)-(line 906,col 38)",
        "(line 907,col 5)-(line 907,col 41)",
        "(line 908,col 5)-(line 908,col 38)",
        "(line 911,col 5)-(line 918,col 18)",
        "(line 920,col 5)-(line 920,col 33)",
        "(line 922,col 5)-(line 922,col 38)",
        "(line 923,col 5)-(line 923,col 41)",
        "(line 924,col 5)-(line 924,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testFunctionGetIsExposedToCallOrApply()",
      "begin_line": 927,
      "end_line": 947,
      "comment": "",
      "child_ranges": [
        "(line 929,col 5)-(line 936,col 17)",
        "(line 938,col 5)-(line 938,col 55)",
        "(line 940,col 5)-(line 940,col 66)",
        "(line 941,col 5)-(line 941,col 66)",
        "(line 942,col 5)-(line 942,col 66)",
        "(line 944,col 5)-(line 944,col 51)",
        "(line 945,col 5)-(line 945,col 51)",
        "(line 946,col 5)-(line 946,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testCallsiteGetAstNode()",
      "begin_line": 949,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 950,col 5)-(line 952,col 26)",
        "(line 954,col 5)-(line 954,col 55)",
        "(line 956,col 5)-(line 956,col 66)",
        "(line 957,col 5)-(line 957,col 76)",
        "(line 959,col 5)-(line 959,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testCallsiteGetContainingFunction()",
      "begin_line": 962,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 963,col 5)-(line 966,col 15)",
        "(line 968,col 5)-(line 968,col 55)",
        "(line 970,col 5)-(line 970,col 56)",
        "(line 971,col 5)-(line 971,col 79)",
        "(line 972,col 5)-(line 972,col 64)",
        "(line 974,col 5)-(line 974,col 66)",
        "(line 975,col 5)-(line 975,col 76)",
        "(line 976,col 5)-(line 976,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testCallsiteGetKnownTargets()",
      "begin_line": 979,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 980,col 5)-(line 983,col 15)",
        "(line 985,col 5)-(line 985,col 55)",
        "(line 987,col 5)-(line 987,col 56)",
        "(line 988,col 5)-(line 988,col 66)",
        "(line 989,col 5)-(line 989,col 66)",
        "(line 991,col 5)-(line 992,col 16)",
        "(line 994,col 5)-(line 994,col 79)",
        "(line 996,col 5)-(line 996,col 48)",
        "(line 997,col 5)-(line 997,col 56)",
        "(line 999,col 5)-(line 999,col 76)",
        "(line 1000,col 5)-(line 1000,col 73)",
        "(line 1002,col 5)-(line 1002,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testCallsiteHasUnknownTarget()",
      "begin_line": 1005,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 5)-(line 1009,col 15)",
        "(line 1011,col 5)-(line 1011,col 55)",
        "(line 1013,col 5)-(line 1013,col 56)",
        "(line 1014,col 5)-(line 1014,col 66)",
        "(line 1016,col 5)-(line 1017,col 64)",
        "(line 1020,col 5)-(line 1020,col 47)",
        "(line 1021,col 5)-(line 1021,col 75)",
        "(line 1023,col 5)-(line 1023,col 76)",
        "(line 1026,col 5)-(line 1026,col 43)",
        "(line 1027,col 5)-(line 1027,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testCallsiteHasExternTarget()",
      "begin_line": 1030,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1031,col 5)-(line 1034,col 15)",
        "(line 1036,col 5)-(line 1036,col 55)",
        "(line 1038,col 5)-(line 1038,col 56)",
        "(line 1039,col 5)-(line 1039,col 66)",
        "(line 1041,col 5)-(line 1042,col 64)",
        "(line 1045,col 5)-(line 1045,col 46)",
        "(line 1047,col 5)-(line 1047,col 76)",
        "(line 1049,col 5)-(line 1050,col 58)",
        "(line 1053,col 5)-(line 1053,col 42)",
        "(line 1054,col 5)-(line 1054,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testThrowForBackwardOpOnForwardGraph()",
      "begin_line": 1057,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 5)-(line 1062,col 15)",
        "(line 1064,col 5)-(line 1064,col 55)",
        "(line 1066,col 5)-(line 1066,col 66)",
        "(line 1068,col 5)-(line 1068,col 57)",
        "(line 1070,col 5)-(line 1074,col 5)",
        "(line 1076,col 5)-(line 1076,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.testThrowForForwardOpOnBackwardGraph()",
      "begin_line": 1079,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 5)-(line 1083,col 15)",
        "(line 1085,col 5)-(line 1085,col 56)",
        "(line 1087,col 5)-(line 1087,col 56)",
        "(line 1088,col 5)-(line 1088,col 66)",
        "(line 1090,col 5)-(line 1091,col 16)",
        "(line 1093,col 5)-(line 1093,col 57)",
        "(line 1095,col 5)-(line 1099,col 5)",
        "(line 1100,col 5)-(line 1100,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.getCallsiteTargetNames(java.util.Collection\u003ccom.google.javascript.jscomp.CallGraph.Callsite\u003e)",
      "begin_line": 1114,
      "end_line": 1129,
      "comment": "\n   * Helper function that, given a collection of callsites, returns a\n   * collection of the names of the target expression nodes, e.g.\n   * if the callsites are [A(), B.b()], the collection returned is\n   * [\"A\", \"B\"].\n   *\n   * This makes it easier to test methods that return collections of callsites.\n   *\n   * An exception is thrown if the callsite target is not a simple name\n   * (e.g. \"a.bar()\").\n   ",
      "child_ranges": [
        "(line 1116,col 5)-(line 1116,col 47)",
        "(line 1118,col 5)-(line 1126,col 5)",
        "(line 1128,col 5)-(line 1128,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.assertFunctionAliased(boolean, java.lang.String)",
      "begin_line": 1131,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 5)-(line 1132,col 73)",
        "(line 1134,col 5)-(line 1134,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.compileAndRunBackward(java.lang.String)",
      "begin_line": 1137,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 5)-(line 1138,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.compileAndRunForward(java.lang.String)",
      "begin_line": 1141,
      "end_line": 1143,
      "comment": "",
      "child_ranges": [
        "(line 1142,col 5)-(line 1142,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraphTest.compileAndRun(java.lang.String, java.lang.String, boolean, boolean)",
      "begin_line": 1145,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 5)-(line 1150,col 39)",
        "(line 1151,col 5)-(line 1151,col 37)",
        "(line 1153,col 5)-(line 1153,col 32)",
        "(line 1155,col 5)-(line 1155,col 28)"
      ]
    }
  ]
}