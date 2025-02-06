{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PeepholeReplaceKnownMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeReplaceKnownMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 30,
      "end_line": 795,
      "comment": "\n * Just to fold known methods when they are called with constants.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ROOT_LOCALE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The LOCALE independent \"locale\""
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.PeepholeReplaceKnownMethods(boolean)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n   * @param late When late is true, this mean we are currently running after\n   * most of the other optimizations. In this case we avoid changes that make\n   * the code larger (but otherwise easier to analyze - such as using string\n   * splitting).\n   ",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 50,col 5)",
        "(line 51,col 5)-(line 51,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 40)",
        "(line 61,col 5)-(line 72,col 5)",
        "(line 74,col 5)-(line 74,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(com.google.javascript.rhino.Node)",
      "begin_line": 81,
      "end_line": 131,
      "comment": "\n   * Try to evaluate known String methods\n   *    .indexOf(), .substr(), .substring()\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 50)",
        "(line 86,col 5)-(line 86,col 46)",
        "(line 87,col 5)-(line 89,col 5)",
        "(line 91,col 5)-(line 93,col 5)",
        "(line 95,col 5)-(line 95,col 49)",
        "(line 96,col 5)-(line 96,col 45)",
        "(line 98,col 5)-(line 101,col 5)",
        "(line 103,col 5)-(line 103,col 57)",
        "(line 104,col 5)-(line 104,col 41)",
        "(line 105,col 5)-(line 128,col 5)",
        "(line 130,col 5)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)",
      "begin_line": 137,
      "end_line": 162,
      "comment": "\n   * Try to evaluate known Numeric methods\n   *    .parseInt(), parseFloat()\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 50)",
        "(line 140,col 5)-(line 160,col 5)",
        "(line 161,col 5)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 167,
      "end_line": 174,
      "comment": "\n   * @return The lowered string Node.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 69)",
        "(line 170,col 5)-(line 170,col 42)",
        "(line 171,col 5)-(line 171,col 59)",
        "(line 172,col 5)-(line 172,col 23)",
        "(line 173,col 5)-(line 173,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 186,
      "comment": "\n   * @return The upped string Node.\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 67)",
        "(line 182,col 5)-(line 182,col 40)",
        "(line 183,col 5)-(line 183,col 59)",
        "(line 184,col 5)-(line 184,col 23)",
        "(line 185,col 5)-(line 185,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.normalizeNumericString(java.lang.String)",
      "begin_line": 192,
      "end_line": 219,
      "comment": "\n   * @param input string representation of a number\n   * @return string with leading and trailing zeros removed\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 195,col 5)",
        "(line 197,col 5)-(line 197,col 54)",
        "(line 200,col 5)-(line 203,col 5)",
        "(line 206,col 5)-(line 213,col 5)",
        "(line 214,col 5)-(line 216,col 5)",
        "(line 218,col 5)-(line 218,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 227,
      "end_line": 351,
      "comment": "\n   * Try to evaluate parseInt, parseFloat:\n   *     parseInt(\"1\") -\u003e 1\n   *     parseInt(\"1\", 10) -\u003e 1\n   *     parseFloat(\"1.11\") -\u003e 1.11\n   ",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 44)",
        "(line 231,col 5)-(line 231,col 57)",
        "(line 232,col 5)-(line 232,col 40)",
        "(line 235,col 5)-(line 235,col 18)",
        "(line 236,col 5)-(line 253,col 5)",
        "(line 256,col 5)-(line 256,col 28)",
        "(line 257,col 5)-(line 257,col 20)",
        "(line 258,col 5)-(line 294,col 5)",
        "(line 296,col 5)-(line 296,col 17)",
        "(line 297,col 5)-(line 344,col 5)",
        "(line 346,col 5)-(line 346,col 43)",
        "(line 348,col 5)-(line 348,col 23)",
        "(line 350,col 5)-(line 350,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 358,
      "end_line": 388,
      "comment": "\n   * Try to evaluate String.indexOf/lastIndexOf:\n   *     \"abcdef\".indexOf(\"bc\") -\u003e 1\n   *     \"abcdefbc\".indexOf(\"bc\", 3) -\u003e 6\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 44)",
        "(line 361,col 5)-(line 361,col 56)",
        "(line 363,col 5)-(line 363,col 58)",
        "(line 364,col 5)-(line 364,col 55)",
        "(line 365,col 5)-(line 365,col 40)",
        "(line 366,col 5)-(line 366,col 59)",
        "(line 368,col 5)-(line 370,col 5)",
        "(line 371,col 5)-(line 371,col 53)",
        "(line 372,col 5)-(line 379,col 5)",
        "(line 380,col 5)-(line 381,col 75)",
        "(line 382,col 5)-(line 382,col 39)",
        "(line 383,col 5)-(line 383,col 43)",
        "(line 385,col 5)-(line 385,col 23)",
        "(line 387,col 5)-(line 387,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(com.google.javascript.rhino.Node)",
      "begin_line": 393,
      "end_line": 507,
      "comment": "\n   * Try to fold an array join: [\u0027a\u0027, \u0027b\u0027, \u0027c\u0027].join(\u0027\u0027) -\u003e \u0027abc\u0027;\n   ",
      "child_ranges": [
        "(line 394,col 5)-(line 394,col 40)",
        "(line 396,col 5)-(line 398,col 5)",
        "(line 400,col 5)-(line 400,col 38)",
        "(line 401,col 5)-(line 405,col 5)",
        "(line 407,col 5)-(line 407,col 48)",
        "(line 408,col 5)-(line 408,col 44)",
        "(line 410,col 5)-(line 413,col 5)",
        "(line 415,col 5)-(line 420,col 5)",
        "(line 422,col 5)-(line 422,col 79)",
        "(line 423,col 5)-(line 423,col 59)",
        "(line 424,col 5)-(line 424,col 28)",
        "(line 425,col 5)-(line 425,col 23)",
        "(line 426,col 5)-(line 426,col 21)",
        "(line 427,col 5)-(line 427,col 42)",
        "(line 429,col 5)-(line 451,col 5)",
        "(line 453,col 5)-(line 459,col 5)",
        "(line 461,col 5)-(line 461,col 49)",
        "(line 463,col 5)-(line 463,col 54)",
        "(line 464,col 5)-(line 504,col 5)",
        "(line 506,col 5)-(line 506,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 512,
      "end_line": 561,
      "comment": "\n   * Try to fold .substr() calls on strings\n   ",
      "child_ranges": [
        "(line 513,col 5)-(line 513,col 44)",
        "(line 514,col 5)-(line 514,col 55)",
        "(line 516,col 5)-(line 516,col 22)",
        "(line 517,col 5)-(line 517,col 51)",
        "(line 521,col 5)-(line 525,col 5)",
        "(line 527,col 5)-(line 527,col 31)",
        "(line 528,col 5)-(line 542,col 5)",
        "(line 548,col 5)-(line 552,col 5)",
        "(line 554,col 5)-(line 554,col 68)",
        "(line 555,col 5)-(line 555,col 40)",
        "(line 557,col 5)-(line 557,col 32)",
        "(line 558,col 5)-(line 558,col 39)",
        "(line 559,col 5)-(line 559,col 23)",
        "(line 560,col 5)-(line 560,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 566,
      "end_line": 614,
      "comment": "\n   * Try to fold .substring() calls on strings\n   ",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 44)",
        "(line 568,col 5)-(line 568,col 55)",
        "(line 570,col 5)-(line 570,col 19)",
        "(line 571,col 5)-(line 571,col 51)",
        "(line 573,col 5)-(line 577,col 5)",
        "(line 579,col 5)-(line 579,col 31)",
        "(line 580,col 5)-(line 594,col 5)",
        "(line 600,col 5)-(line 605,col 5)",
        "(line 607,col 5)-(line 607,col 57)",
        "(line 608,col 5)-(line 608,col 40)",
        "(line 610,col 5)-(line 610,col 32)",
        "(line 611,col 5)-(line 611,col 39)",
        "(line 612,col 5)-(line 612,col 23)",
        "(line 613,col 5)-(line 613,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 619,
      "end_line": 645,
      "comment": "\n   * Try to fold .charAt() calls on strings\n   ",
      "child_ranges": [
        "(line 620,col 5)-(line 620,col 44)",
        "(line 621,col 5)-(line 621,col 55)",
        "(line 623,col 5)-(line 623,col 14)",
        "(line 624,col 5)-(line 624,col 51)",
        "(line 626,col 5)-(line 631,col 5)",
        "(line 633,col 5)-(line 637,col 5)",
        "(line 639,col 5)-(line 640,col 52)",
        "(line 641,col 5)-(line 641,col 32)",
        "(line 642,col 5)-(line 642,col 39)",
        "(line 643,col 5)-(line 643,col 23)",
        "(line 644,col 5)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 650,
      "end_line": 675,
      "comment": "\n   * Try to fold .charCodeAt() calls on strings\n   ",
      "child_ranges": [
        "(line 651,col 5)-(line 651,col 44)",
        "(line 652,col 5)-(line 652,col 55)",
        "(line 654,col 5)-(line 654,col 14)",
        "(line 655,col 5)-(line 655,col 51)",
        "(line 657,col 5)-(line 662,col 5)",
        "(line 664,col 5)-(line 668,col 5)",
        "(line 670,col 5)-(line 670,col 62)",
        "(line 671,col 5)-(line 671,col 32)",
        "(line 672,col 5)-(line 672,col 39)",
        "(line 673,col 5)-(line 673,col 23)",
        "(line 674,col 5)-(line 674,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.jsSplitMatch(java.lang.String, int, java.lang.String)",
      "begin_line": 681,
      "end_line": 695,
      "comment": "\n   * Support function for jsSplit, find the first occurrence of\n   * separator within stringValue starting at startIndex.\n   ",
      "child_ranges": [
        "(line 684,col 5)-(line 686,col 5)",
        "(line 688,col 5)-(line 688,col 64)",
        "(line 690,col 5)-(line 692,col 5)",
        "(line 694,col 5)-(line 694,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.jsSplit(java.lang.String, java.lang.String, int)",
      "begin_line": 700,
      "end_line": 743,
      "comment": "\n   * Implement the JS String.split method using a string separator.\n   ",
      "child_ranges": [
        "(line 701,col 5)-(line 701,col 44)",
        "(line 702,col 5)-(line 702,col 53)",
        "(line 705,col 5)-(line 707,col 5)",
        "(line 711,col 5)-(line 713,col 5)",
        "(line 715,col 5)-(line 715,col 53)",
        "(line 719,col 5)-(line 740,col 5)",
        "(line 742,col 5)-(line 742,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSplit(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 748,
      "end_line": 794,
      "comment": "\n   * Try to fold .split() calls on strings\n   ",
      "child_ranges": [
        "(line 749,col 5)-(line 751,col 5)",
        "(line 753,col 5)-(line 753,col 44)",
        "(line 754,col 5)-(line 754,col 55)",
        "(line 756,col 5)-(line 756,col 28)",
        "(line 757,col 5)-(line 757,col 48)",
        "(line 760,col 5)-(line 760,col 41)",
        "(line 762,col 5)-(line 780,col 5)",
        "(line 783,col 5)-(line 783,col 66)",
        "(line 784,col 5)-(line 784,col 40)",
        "(line 785,col 5)-(line 788,col 5)",
        "(line 790,col 5)-(line 790,col 32)",
        "(line 791,col 5)-(line 791,col 43)",
        "(line 792,col 5)-(line 792,col 23)",
        "(line 793,col 5)-(line 793,col 26)"
      ]
    }
  ]
}