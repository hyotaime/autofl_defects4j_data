{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeReplaceKnownMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeReplaceKnownMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 31,
      "end_line": 796,
      "comment": "\n * Just to fold known methods when they are called with constants.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ROOT_LOCALE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The LOCALE independent \"locale\""
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.PeepholeReplaceKnownMethods(boolean)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n   * @param late When late is true, this mean we are currently running after\n   * most of the other optimizations. In this case we avoid changes that make\n   * the code larger (but otherwise easier to analyze - such as using string\n   * splitting).\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 51,col 5)",
        "(line 52,col 5)-(line 52,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(com.google.javascript.rhino.Node)",
      "begin_line": 55,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 40)",
        "(line 62,col 5)-(line 73,col 5)",
        "(line 75,col 5)-(line 75,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 132,
      "comment": "\n   * Try to evaluate known String methods\n   *    .indexOf(), .substr(), .substring()\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 50)",
        "(line 87,col 5)-(line 87,col 46)",
        "(line 88,col 5)-(line 90,col 5)",
        "(line 92,col 5)-(line 94,col 5)",
        "(line 96,col 5)-(line 96,col 49)",
        "(line 97,col 5)-(line 97,col 45)",
        "(line 99,col 5)-(line 102,col 5)",
        "(line 104,col 5)-(line 104,col 57)",
        "(line 105,col 5)-(line 105,col 41)",
        "(line 106,col 5)-(line 129,col 5)",
        "(line 131,col 5)-(line 131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)",
      "begin_line": 138,
      "end_line": 163,
      "comment": "\n   * Try to evaluate known Numeric methods\n   *    .parseInt(), parseFloat()\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 50)",
        "(line 141,col 5)-(line 161,col 5)",
        "(line 162,col 5)-(line 162,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 175,
      "comment": "\n   * @return The lowered string Node.\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 69)",
        "(line 171,col 5)-(line 171,col 42)",
        "(line 172,col 5)-(line 172,col 59)",
        "(line 173,col 5)-(line 173,col 23)",
        "(line 174,col 5)-(line 174,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 180,
      "end_line": 187,
      "comment": "\n   * @return The upped string Node.\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 67)",
        "(line 183,col 5)-(line 183,col 40)",
        "(line 184,col 5)-(line 184,col 59)",
        "(line 185,col 5)-(line 185,col 23)",
        "(line 186,col 5)-(line 186,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.normalizeNumericString(java.lang.String)",
      "begin_line": 193,
      "end_line": 220,
      "comment": "\n   * @param input string representation of a number\n   * @return string with leading and trailing zeros removed\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 196,col 5)",
        "(line 198,col 5)-(line 198,col 54)",
        "(line 201,col 5)-(line 204,col 5)",
        "(line 207,col 5)-(line 214,col 5)",
        "(line 215,col 5)-(line 217,col 5)",
        "(line 219,col 5)-(line 219,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 228,
      "end_line": 352,
      "comment": "\n   * Try to evaluate parseInt, parseFloat:\n   *     parseInt(\"1\") -\u003e 1\n   *     parseInt(\"1\", 10) -\u003e 1\n   *     parseFloat(\"1.11\") -\u003e 1.11\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 44)",
        "(line 232,col 5)-(line 232,col 57)",
        "(line 233,col 5)-(line 233,col 40)",
        "(line 236,col 5)-(line 236,col 18)",
        "(line 237,col 5)-(line 255,col 5)",
        "(line 258,col 5)-(line 258,col 28)",
        "(line 259,col 5)-(line 259,col 20)",
        "(line 260,col 5)-(line 296,col 5)",
        "(line 298,col 5)-(line 298,col 17)",
        "(line 299,col 5)-(line 345,col 5)",
        "(line 347,col 5)-(line 347,col 43)",
        "(line 349,col 5)-(line 349,col 23)",
        "(line 351,col 5)-(line 351,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 359,
      "end_line": 389,
      "comment": "\n   * Try to evaluate String.indexOf/lastIndexOf:\n   *     \"abcdef\".indexOf(\"bc\") -\u003e 1\n   *     \"abcdefbc\".indexOf(\"bc\", 3) -\u003e 6\n   ",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 44)",
        "(line 362,col 5)-(line 362,col 56)",
        "(line 364,col 5)-(line 364,col 58)",
        "(line 365,col 5)-(line 365,col 55)",
        "(line 366,col 5)-(line 366,col 40)",
        "(line 367,col 5)-(line 367,col 59)",
        "(line 369,col 5)-(line 371,col 5)",
        "(line 372,col 5)-(line 372,col 53)",
        "(line 373,col 5)-(line 380,col 5)",
        "(line 381,col 5)-(line 382,col 75)",
        "(line 383,col 5)-(line 383,col 39)",
        "(line 384,col 5)-(line 384,col 43)",
        "(line 386,col 5)-(line 386,col 23)",
        "(line 388,col 5)-(line 388,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(com.google.javascript.rhino.Node)",
      "begin_line": 394,
      "end_line": 508,
      "comment": "\n   * Try to fold an array join: [\u0027a\u0027, \u0027b\u0027, \u0027c\u0027].join(\u0027\u0027) -\u003e \u0027abc\u0027;\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 40)",
        "(line 397,col 5)-(line 399,col 5)",
        "(line 401,col 5)-(line 401,col 38)",
        "(line 402,col 5)-(line 406,col 5)",
        "(line 408,col 5)-(line 408,col 48)",
        "(line 409,col 5)-(line 409,col 44)",
        "(line 411,col 5)-(line 414,col 5)",
        "(line 416,col 5)-(line 421,col 5)",
        "(line 423,col 5)-(line 423,col 79)",
        "(line 424,col 5)-(line 424,col 59)",
        "(line 425,col 5)-(line 425,col 28)",
        "(line 426,col 5)-(line 426,col 23)",
        "(line 427,col 5)-(line 427,col 21)",
        "(line 428,col 5)-(line 428,col 42)",
        "(line 430,col 5)-(line 452,col 5)",
        "(line 454,col 5)-(line 460,col 5)",
        "(line 462,col 5)-(line 462,col 49)",
        "(line 464,col 5)-(line 464,col 54)",
        "(line 465,col 5)-(line 505,col 5)",
        "(line 507,col 5)-(line 507,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 513,
      "end_line": 562,
      "comment": "\n   * Try to fold .substr() calls on strings\n   ",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 44)",
        "(line 515,col 5)-(line 515,col 55)",
        "(line 517,col 5)-(line 517,col 22)",
        "(line 518,col 5)-(line 518,col 51)",
        "(line 522,col 5)-(line 526,col 5)",
        "(line 528,col 5)-(line 528,col 31)",
        "(line 529,col 5)-(line 543,col 5)",
        "(line 549,col 5)-(line 553,col 5)",
        "(line 555,col 5)-(line 555,col 68)",
        "(line 556,col 5)-(line 556,col 40)",
        "(line 558,col 5)-(line 558,col 32)",
        "(line 559,col 5)-(line 559,col 39)",
        "(line 560,col 5)-(line 560,col 23)",
        "(line 561,col 5)-(line 561,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 567,
      "end_line": 615,
      "comment": "\n   * Try to fold .substring() calls on strings\n   ",
      "child_ranges": [
        "(line 568,col 5)-(line 568,col 44)",
        "(line 569,col 5)-(line 569,col 55)",
        "(line 571,col 5)-(line 571,col 19)",
        "(line 572,col 5)-(line 572,col 51)",
        "(line 574,col 5)-(line 578,col 5)",
        "(line 580,col 5)-(line 580,col 31)",
        "(line 581,col 5)-(line 595,col 5)",
        "(line 601,col 5)-(line 606,col 5)",
        "(line 608,col 5)-(line 608,col 57)",
        "(line 609,col 5)-(line 609,col 40)",
        "(line 611,col 5)-(line 611,col 32)",
        "(line 612,col 5)-(line 612,col 39)",
        "(line 613,col 5)-(line 613,col 23)",
        "(line 614,col 5)-(line 614,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 620,
      "end_line": 646,
      "comment": "\n   * Try to fold .charAt() calls on strings\n   ",
      "child_ranges": [
        "(line 621,col 5)-(line 621,col 44)",
        "(line 622,col 5)-(line 622,col 55)",
        "(line 624,col 5)-(line 624,col 14)",
        "(line 625,col 5)-(line 625,col 51)",
        "(line 627,col 5)-(line 632,col 5)",
        "(line 634,col 5)-(line 638,col 5)",
        "(line 640,col 5)-(line 641,col 52)",
        "(line 642,col 5)-(line 642,col 32)",
        "(line 643,col 5)-(line 643,col 39)",
        "(line 644,col 5)-(line 644,col 23)",
        "(line 645,col 5)-(line 645,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 651,
      "end_line": 676,
      "comment": "\n   * Try to fold .charCodeAt() calls on strings\n   ",
      "child_ranges": [
        "(line 652,col 5)-(line 652,col 44)",
        "(line 653,col 5)-(line 653,col 55)",
        "(line 655,col 5)-(line 655,col 14)",
        "(line 656,col 5)-(line 656,col 51)",
        "(line 658,col 5)-(line 663,col 5)",
        "(line 665,col 5)-(line 669,col 5)",
        "(line 671,col 5)-(line 671,col 62)",
        "(line 672,col 5)-(line 672,col 32)",
        "(line 673,col 5)-(line 673,col 39)",
        "(line 674,col 5)-(line 674,col 23)",
        "(line 675,col 5)-(line 675,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.jsSplitMatch(java.lang.String, int, java.lang.String)",
      "begin_line": 682,
      "end_line": 696,
      "comment": "\n   * Support function for jsSplit, find the first occurrence of\n   * separator within stringValue starting at startIndex.\n   ",
      "child_ranges": [
        "(line 685,col 5)-(line 687,col 5)",
        "(line 689,col 5)-(line 689,col 64)",
        "(line 691,col 5)-(line 693,col 5)",
        "(line 695,col 5)-(line 695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.jsSplit(java.lang.String, java.lang.String, int)",
      "begin_line": 701,
      "end_line": 744,
      "comment": "\n   * Implement the JS String.split method using a string separator.\n   ",
      "child_ranges": [
        "(line 702,col 5)-(line 702,col 44)",
        "(line 703,col 5)-(line 703,col 53)",
        "(line 706,col 5)-(line 708,col 5)",
        "(line 712,col 5)-(line 714,col 5)",
        "(line 716,col 5)-(line 716,col 53)",
        "(line 720,col 5)-(line 741,col 5)",
        "(line 743,col 5)-(line 743,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSplit(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 749,
      "end_line": 795,
      "comment": "\n   * Try to fold .split() calls on strings\n   ",
      "child_ranges": [
        "(line 750,col 5)-(line 752,col 5)",
        "(line 754,col 5)-(line 754,col 44)",
        "(line 755,col 5)-(line 755,col 55)",
        "(line 757,col 5)-(line 757,col 28)",
        "(line 758,col 5)-(line 758,col 48)",
        "(line 761,col 5)-(line 761,col 41)",
        "(line 763,col 5)-(line 781,col 5)",
        "(line 784,col 5)-(line 784,col 66)",
        "(line 785,col 5)-(line 785,col 40)",
        "(line 786,col 5)-(line 789,col 5)",
        "(line 791,col 5)-(line 791,col 32)",
        "(line 792,col 5)-(line 792,col 43)",
        "(line 793,col 5)-(line 793,col 23)",
        "(line 794,col 5)-(line 794,col 26)"
      ]
    }
  ]
}