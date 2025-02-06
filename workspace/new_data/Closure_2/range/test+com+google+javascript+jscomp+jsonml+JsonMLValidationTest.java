{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/jsonml/JsonMLValidationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonMLValidationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 850,
      "comment": "\n * Tests validation of particular JsonML elements.\n *\n * @author dhans@google.com (Daniel Hans)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testValidation(java.lang.String)",
      "begin_line": 35,
      "end_line": 42,
      "comment": " Used for correct statements - error message should be null",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 55)",
        "(line 37,col 5)-(line 37,col 48)",
        "(line 38,col 5)-(line 41,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testValidation(java.lang.String, java.lang.String)",
      "begin_line": 44,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 55)",
        "(line 47,col 5)-(line 47,col 48)",
        "(line 48,col 5)-(line 53,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testNotEnoughChildrenValidation(java.lang.String, com.google.javascript.jscomp.jsonml.TagType, int, int)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 60,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testTooManyChildrenValidation(java.lang.String, com.google.javascript.jscomp.jsonml.TagType, int, int)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testWrongChildTypeValidation(java.lang.String, com.google.javascript.jscomp.jsonml.TagType, com.google.javascript.jscomp.jsonml.TagType, com.google.javascript.jscomp.jsonml.TagType, int)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 73,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testWrongChildTypeValidation(java.lang.String, com.google.javascript.jscomp.jsonml.TagType, com.google.javascript.jscomp.jsonml.TagType[], com.google.javascript.jscomp.jsonml.TagType, int)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 80,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testMissingArgument(java.lang.String, com.google.javascript.jscomp.jsonml.TagAttr, com.google.javascript.jscomp.jsonml.TagType)",
      "begin_line": 83,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 86,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testAssignExpr()",
      "begin_line": 89,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 94,col 60)",
        "(line 96,col 5)-(line 99,col 34)",
        "(line 100,col 5)-(line 105,col 34)",
        "(line 107,col 5)-(line 111,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testBinaryExpr()",
      "begin_line": 114,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 119,col 60)",
        "(line 121,col 5)-(line 124,col 34)",
        "(line 125,col 5)-(line 130,col 34)",
        "(line 132,col 5)-(line 136,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testCaseValidation()",
      "begin_line": 139,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 143,col 40)",
        "(line 144,col 5)-(line 148,col 47)",
        "(line 150,col 5)-(line 152,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testCatchValidation()",
      "begin_line": 155,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 160,col 33)",
        "(line 162,col 5)-(line 165,col 35)",
        "(line 167,col 5)-(line 171,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testConditionalExprValidation()",
      "begin_line": 174,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 182,col 59)",
        "(line 184,col 5)-(line 189,col 39)",
        "(line 190,col 5)-(line 196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testCountExprValidation()",
      "begin_line": 199,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 203,col 40)",
        "(line 205,col 5)-(line 209,col 33)",
        "(line 211,col 5)-(line 214,col 47)",
        "(line 215,col 5)-(line 218,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testDataProp()",
      "begin_line": 221,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 225,col 60)",
        "(line 227,col 5)-(line 229,col 32)",
        "(line 231,col 5)-(line 234,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testDeleteExpr()",
      "begin_line": 237,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 241,col 40)",
        "(line 243,col 5)-(line 245,col 34)",
        "(line 246,col 5)-(line 250,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testDoWhileStmtValidation()",
      "begin_line": 253,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 258,col 64)",
        "(line 260,col 5)-(line 262,col 35)",
        "(line 263,col 5)-(line 268,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testEmptyStmtValidation()",
      "begin_line": 271,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 273,col 5)-(line 274,col 28)",
        "(line 276,col 5)-(line 279,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testForInStmtValidation()",
      "begin_line": 282,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 284,col 5)-(line 288,col 33)",
        "(line 290,col 5)-(line 294,col 33)",
        "(line 295,col 5)-(line 301,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testForStmtValidation()",
      "begin_line": 304,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 316,col 33)",
        "(line 318,col 5)-(line 326,col 31)",
        "(line 327,col 5)-(line 339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testFunctionDeclValidation()",
      "begin_line": 342,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 344,col 5)-(line 347,col 33)",
        "(line 348,col 5)-(line 352,col 42)",
        "(line 354,col 5)-(line 357,col 36)",
        "(line 359,col 5)-(line 363,col 64)",
        "(line 365,col 5)-(line 369,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testFunctionExprValidation()",
      "begin_line": 372,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 377,col 33)",
        "(line 378,col 5)-(line 382,col 42)",
        "(line 383,col 5)-(line 386,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testIdExprValidation()",
      "begin_line": 389,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 391,col 5)-(line 392,col 35)",
        "(line 394,col 5)-(line 397,col 30)",
        "(line 399,col 5)-(line 401,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testIdPattValidation()",
      "begin_line": 404,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 406,col 5)-(line 407,col 35)",
        "(line 409,col 5)-(line 412,col 30)",
        "(line 414,col 5)-(line 416,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testIfStmtValidation()",
      "begin_line": 419,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 421,col 5)-(line 425,col 33)",
        "(line 426,col 5)-(line 430,col 33)",
        "(line 432,col 5)-(line 436,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testInvokeExprValidation()",
      "begin_line": 439,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 444,col 64)",
        "(line 446,col 5)-(line 449,col 34)",
        "(line 451,col 5)-(line 455,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testJmpStmtValidation()",
      "begin_line": 458,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 461,col 28)",
        "(line 462,col 5)-(line 463,col 39)",
        "(line 464,col 5)-(line 465,col 31)",
        "(line 466,col 5)-(line 467,col 42)",
        "(line 469,col 5)-(line 472,col 33)",
        "(line 473,col 5)-(line 476,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testLabelledStmtValidation()",
      "begin_line": 479,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 483,col 40)",
        "(line 485,col 5)-(line 487,col 36)",
        "(line 488,col 5)-(line 492,col 36)",
        "(line 494,col 5)-(line 497,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testLiteralExprValidation()",
      "begin_line": 500,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 503,col 57)",
        "(line 504,col 5)-(line 505,col 61)",
        "(line 506,col 5)-(line 507,col 59)",
        "(line 509,col 5)-(line 512,col 35)",
        "(line 514,col 5)-(line 516,col 44)",
        "(line 517,col 5)-(line 519,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testLogicalExprValidation()",
      "begin_line": 522,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 524,col 5)-(line 527,col 40)",
        "(line 528,col 5)-(line 531,col 40)",
        "(line 533,col 5)-(line 538,col 42)",
        "(line 539,col 5)-(line 542,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testNewExprValidation()",
      "begin_line": 545,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 547,col 5)-(line 550,col 40)",
        "(line 552,col 5)-(line 554,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testObjectExprValidation()",
      "begin_line": 557,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 559,col 5)-(line 560,col 29)",
        "(line 561,col 5)-(line 566,col 65)",
        "(line 568,col 5)-(line 569,col 68)",
        "(line 570,col 5)-(line 575,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testParamDeclValidation()",
      "begin_line": 578,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 580,col 5)-(line 581,col 28)",
        "(line 582,col 5)-(line 585,col 40)",
        "(line 587,col 5)-(line 591,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testRegExpExprValidation()",
      "begin_line": 594,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 596,col 5)-(line 597,col 52)",
        "(line 598,col 5)-(line 599,col 53)",
        "(line 601,col 5)-(line 604,col 34)",
        "(line 606,col 5)-(line 608,col 43)",
        "(line 609,col 5)-(line 611,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testReturnStmtValidation()",
      "begin_line": 614,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 616,col 5)-(line 617,col 29)",
        "(line 618,col 5)-(line 620,col 60)",
        "(line 622,col 5)-(line 626,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testSwitchStmtValidation()",
      "begin_line": 629,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 631,col 5)-(line 640,col 52)",
        "(line 641,col 5)-(line 643,col 40)",
        "(line 645,col 5)-(line 647,col 34)",
        "(line 649,col 5)-(line 661,col 31)",
        "(line 662,col 5)-(line 671,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testThisExprValidation()",
      "begin_line": 674,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 676,col 5)-(line 677,col 27)",
        "(line 679,col 5)-(line 682,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testThrowStmtValidation()",
      "begin_line": 685,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 687,col 5)-(line 689,col 40)",
        "(line 691,col 5)-(line 695,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testTryStmtValidation()",
      "begin_line": 698,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 700,col 5)-(line 705,col 38)",
        "(line 706,col 5)-(line 712,col 33)",
        "(line 714,col 5)-(line 719,col 31)",
        "(line 720,col 5)-(line 728,col 31)",
        "(line 730,col 5)-(line 739,col 30)",
        "(line 740,col 5)-(line 747,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testUnaryExprValidation()",
      "begin_line": 750,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 752,col 5)-(line 754,col 40)",
        "(line 755,col 5)-(line 759,col 49)",
        "(line 761,col 5)-(line 763,col 33)",
        "(line 764,col 5)-(line 768,col 33)",
        "(line 770,col 5)-(line 773,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testVarDeclValidation()",
      "begin_line": 776,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 778,col 5)-(line 780,col 40)",
        "(line 781,col 5)-(line 785,col 65)",
        "(line 786,col 5)-(line 791,col 40)",
        "(line 793,col 5)-(line 795,col 31)",
        "(line 797,col 5)-(line 806,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testWhileStmtValidation()",
      "begin_line": 809,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 811,col 5)-(line 814,col 33)",
        "(line 815,col 5)-(line 818,col 40)",
        "(line 820,col 5)-(line 823,col 33)",
        "(line 824,col 5)-(line 829,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.jsonml.JsonMLValidationTest.testWithStmtValidation()",
      "begin_line": 832,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 834,col 5)-(line 837,col 33)",
        "(line 839,col 5)-(line 842,col 32)",
        "(line 843,col 5)-(line 848,col 32)"
      ]
    }
  ]
}