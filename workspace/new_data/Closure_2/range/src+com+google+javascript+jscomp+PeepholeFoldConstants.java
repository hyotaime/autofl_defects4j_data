{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PeepholeFoldConstants.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeFoldConstants",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 30,
      "end_line": 1506,
      "comment": "\n * Peephole optimization to fold constants (e.g. x + 1 + 7 --\u003e x + 8).\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_GETELEM_INDEX_ERROR"
      ],
      "begin_line": 34,
      "end_line": 37,
      "comment": " a check pass."
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_OUT_OF_BOUNDS_ERROR"
      ],
      "begin_line": 39,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEGATING_A_NON_NUMBER_ERROR"
      ],
      "begin_line": 44,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BITWISE_OPERAND_OUT_OF_RANGE"
      ],
      "begin_line": 49,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHIFT_AMOUNT_OUT_OF_BOUNDS"
      ],
      "begin_line": 54,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FRACTIONAL_BITWISE_OPERAND"
      ],
      "begin_line": 59,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_FOLD_NUMBER"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.PeepholeFoldConstants(boolean)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n   * @param late When late is false, this mean we are currently running before\n   * most of the other optimizations. In this case we would avoid optimizations\n   * that would make the code harder to analyze. When this is true, we would\n   * do anything to minimize for size.\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 100,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(com.google.javascript.rhino.Node)",
      "begin_line": 103,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 40)",
        "(line 106,col 5)-(line 108,col 5)",
        "(line 110,col 5)-(line 110,col 32)",
        "(line 112,col 5)-(line 114,col 5)",
        "(line 117,col 5)-(line 182,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(com.google.javascript.rhino.Node)",
      "begin_line": 185,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 35)",
        "(line 187,col 5)-(line 192,col 5)",
        "(line 193,col 5)-(line 193,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp(com.google.javascript.rhino.Node)",
      "begin_line": 196,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 233,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(com.google.javascript.rhino.Node)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 14)",
        "(line 238,col 5)-(line 241,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(com.google.javascript.rhino.Node)",
      "begin_line": 244,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 263,col 5)",
        "(line 265,col 5)-(line 265,col 47)",
        "(line 266,col 5)-(line 268,col 5)",
        "(line 270,col 5)-(line 270,col 26)",
        "(line 272,col 5)-(line 272,col 53)",
        "(line 273,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 277,col 47)",
        "(line 278,col 5)-(line 278,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(com.google.javascript.rhino.Node)",
      "begin_line": 286,
      "end_line": 336,
      "comment": "\n   * Folds \u0027typeof(foo)\u0027 if foo is a literal, e.g.\n   * typeof(\"bar\") --\u003e \"string\"\n   * typeof(6) --\u003e \"number\"\n   ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 63)",
        "(line 289,col 5)-(line 289,col 59)",
        "(line 290,col 5)-(line 292,col 5)",
        "(line 294,col 5)-(line 294,col 33)",
        "(line 296,col 5)-(line 325,col 5)",
        "(line 327,col 5)-(line 333,col 5)",
        "(line 335,col 5)-(line 335,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(com.google.javascript.rhino.Node)",
      "begin_line": 338,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 46)",
        "(line 341,col 5)-(line 341,col 34)",
        "(line 342,col 5)-(line 342,col 32)",
        "(line 344,col 5)-(line 346,col 5)",
        "(line 348,col 5)-(line 348,col 62)",
        "(line 349,col 5)-(line 351,col 5)",
        "(line 353,col 5)-(line 427,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 434,
      "end_line": 460,
      "comment": "\n   * Try to fold {@code left instanceof right} into {@code true}\n   * or {@code false}.\n   ",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 50)",
        "(line 439,col 5)-(line 457,col 5)",
        "(line 459,col 5)-(line 459,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 462,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 46)",
        "(line 465,col 5)-(line 467,col 5)",
        "(line 470,col 5)-(line 474,col 5)",
        "(line 476,col 5)-(line 478,col 5)",
        "(line 480,col 5)-(line 480,col 18)",
        "(line 481,col 5)-(line 488,col 5)",
        "(line 490,col 5)-(line 490,col 21)",
        "(line 491,col 5)-(line 527,col 5)",
        "(line 529,col 5)-(line 530,col 62)",
        "(line 531,col 5)-(line 531,col 43)",
        "(line 533,col 5)-(line 533,col 23)",
        "(line 535,col 5)-(line 535,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryUnfoldAssignOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 538,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 541,col 5)",
        "(line 543,col 5)-(line 546,col 5)",
        "(line 548,col 5)-(line 550,col 5)",
        "(line 553,col 5)-(line 553,col 47)",
        "(line 554,col 5)-(line 556,col 24)",
        "(line 557,col 5)-(line 557,col 47)",
        "(line 558,col 5)-(line 558,col 23)",
        "(line 560,col 5)-(line 560,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 566,
      "end_line": 604,
      "comment": "\n   * Try to fold a AND/OR node.\n   ",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 32)",
        "(line 569,col 5)-(line 569,col 23)",
        "(line 571,col 5)-(line 571,col 27)",
        "(line 573,col 5)-(line 573,col 64)",
        "(line 575,col 5)-(line 589,col 5)",
        "(line 594,col 5)-(line 603,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 615,
      "end_line": 664,
      "comment": "\n   * Expressions such as [foo() + \u0027a\u0027 + \u0027b\u0027] generate parse trees\n   * where no node has two const children ((foo() + \u0027a\u0027) + \u0027b\u0027), so\n   * tryFoldAdd() won\u0027t fold it -- tryFoldLeftChildAdd() will (for Strings).\n   * Specifically, it folds Add expressions where:\n   *  - The left child is also and add expression\n   *  - The right child is a constant value\n   *  - The left child\u0027s right child is a STRING constant.\n   ",
      "child_ranges": [
        "(line 617,col 5)-(line 638,col 5)",
        "(line 640,col 5)-(line 661,col 5)",
        "(line 663,col 5)-(line 663,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 669,
      "end_line": 686,
      "comment": "\n   * Try to fold an ADD node with constant operands\n   ",
      "child_ranges": [
        "(line 670,col 5)-(line 681,col 5)",
        "(line 685,col 5)-(line 685,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmeticOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 691,
      "end_line": 700,
      "comment": "\n   * Try to fold arithmetic binary operators\n   ",
      "child_ranges": [
        "(line 692,col 5)-(line 692,col 64)",
        "(line 693,col 5)-(line 698,col 5)",
        "(line 699,col 5)-(line 699,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.performArithmeticOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 705,
      "end_line": 780,
      "comment": "\n   * Try to fold arithmetic binary operators\n   ",
      "child_ranges": [
        "(line 708,col 5)-(line 712,col 5)",
        "(line 714,col 5)-(line 714,col 18)",
        "(line 719,col 5)-(line 719,col 51)",
        "(line 720,col 5)-(line 722,col 5)",
        "(line 723,col 5)-(line 723,col 52)",
        "(line 724,col 5)-(line 726,col 5)",
        "(line 728,col 5)-(line 728,col 26)",
        "(line 729,col 5)-(line 729,col 26)",
        "(line 731,col 5)-(line 764,col 5)",
        "(line 768,col 5)-(line 778,col 5)",
        "(line 779,col 5)-(line 779,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 791,
      "end_line": 829,
      "comment": "\n   * Expressions such as [foo() * 10 * 20] generate parse trees\n   * where no node has two const children ((foo() * 10) * 20), so\n   * performArithmeticOp() won\u0027t fold it -- tryFoldLeftChildOp() will.\n   * Specifically, it folds associative expressions where:\n   *  - The left child is also an associative expression of the same time.\n   *  - The right child is a constant NUMBER constant.\n   *  - The left child\u0027s right child is a NUMBER constant.\n   ",
      "child_ranges": [
        "(line 792,col 5)-(line 792,col 29)",
        "(line 793,col 5)-(line 795,col 22)",
        "(line 797,col 5)-(line 798,col 47)",
        "(line 802,col 5)-(line 802,col 56)",
        "(line 803,col 5)-(line 826,col 5)",
        "(line 828,col 5)-(line 828,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 831,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 832,col 5)-(line 832,col 46)",
        "(line 834,col 5)-(line 850,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 856,
      "end_line": 918,
      "comment": "\n   * Try to fold shift operations\n   ",
      "child_ranges": [
        "(line 857,col 5)-(line 915,col 5)",
        "(line 917,col 5)-(line 917,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 923,
      "end_line": 935,
      "comment": "\n   * Try to fold comparison nodes, e.g \u003d\u003d\n   ",
      "child_ranges": [
        "(line 925,col 5)-(line 925,col 71)",
        "(line 926,col 5)-(line 928,col 5)",
        "(line 930,col 5)-(line 930,col 64)",
        "(line 931,col 5)-(line 931,col 43)",
        "(line 932,col 5)-(line 932,col 23)",
        "(line 934,col 5)-(line 934,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.evaluateComparison(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 937,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 938,col 5)-(line 938,col 62)",
        "(line 939,col 5)-(line 939,col 64)",
        "(line 941,col 5)-(line 946,col 5)",
        "(line 948,col 5)-(line 948,col 73)",
        "(line 949,col 5)-(line 949,col 39)",
        "(line 950,col 5)-(line 950,col 45)",
        "(line 951,col 5)-(line 951,col 46)",
        "(line 952,col 5)-(line 1113,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.areStringsEqual(java.lang.String, java.lang.String)",
      "begin_line": 1117,
      "end_line": 1126,
      "comment": " Returns whether two JS strings are equal. ",
      "child_ranges": [
        "(line 1120,col 5)-(line 1125,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType(com.google.javascript.rhino.Node)",
      "begin_line": 1131,
      "end_line": 1143,
      "comment": "\n   * @return Translate NOT expressions into TRUE or FALSE when possible.\n   ",
      "child_ranges": [
        "(line 1132,col 5)-(line 1132,col 27)",
        "(line 1133,col 5)-(line 1141,col 5)",
        "(line 1142,col 5)-(line 1142,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1149,
      "end_line": 1184,
      "comment": "\n   * The result of the comparison, or UNKNOWN if the\n   * result could not be determined.\n   ",
      "child_ranges": [
        "(line 1150,col 5)-(line 1150,col 53)",
        "(line 1151,col 5)-(line 1153,col 5)",
        "(line 1154,col 5)-(line 1154,col 55)",
        "(line 1155,col 5)-(line 1157,col 5)",
        "(line 1159,col 5)-(line 1159,col 26)",
        "(line 1160,col 5)-(line 1160,col 27)",
        "(line 1162,col 5)-(line 1183,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined(com.google.javascript.rhino.Node, int)",
      "begin_line": 1191,
      "end_line": 1214,
      "comment": "\n   * @param value The value to compare to \"undefined\"\n   * @param op The boolean op to compare with\n   * @return Whether the boolean op is true or false\n   ",
      "child_ranges": [
        "(line 1192,col 5)-(line 1192,col 67)",
        "(line 1193,col 5)-(line 1193,col 57)",
        "(line 1194,col 5)-(line 1194,col 56)",
        "(line 1195,col 5)-(line 1195,col 53)",
        "(line 1196,col 5)-(line 1213,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.isEqualityOp(int)",
      "begin_line": 1216,
      "end_line": 1225,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 5)-(line 1223,col 5)",
        "(line 1224,col 5)-(line 1224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.compareToNull(com.google.javascript.rhino.Node, int)",
      "begin_line": 1232,
      "end_line": 1249,
      "comment": "\n   * @param value The value to compare to \"null\"\n   * @param op The boolean op to compare with\n   * @return Whether the boolean op is true or false\n   ",
      "child_ranges": [
        "(line 1233,col 5)-(line 1233,col 57)",
        "(line 1234,col 5)-(line 1234,col 56)",
        "(line 1235,col 5)-(line 1235,col 53)",
        "(line 1236,col 5)-(line 1248,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(com.google.javascript.rhino.Node)",
      "begin_line": 1255,
      "end_line": 1263,
      "comment": "\n   * Try to fold away unnecessary object instantiation.\n   * e.g. this[new String(\u0027eval\u0027)] -\u003e this.eval\n   ",
      "child_ranges": [
        "(line 1256,col 5)-(line 1256,col 43)",
        "(line 1259,col 5)-(line 1261,col 5)",
        "(line 1262,col 5)-(line 1262,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(com.google.javascript.rhino.Node)",
      "begin_line": 1266,
      "end_line": 1277,
      "comment": " Returns whether this node must be coerced to a string. ",
      "child_ranges": [
        "(line 1267,col 5)-(line 1270,col 5)",
        "(line 1273,col 5)-(line 1275,col 5)",
        "(line 1276,col 5)-(line 1276,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(com.google.javascript.rhino.Node)",
      "begin_line": 1279,
      "end_line": 1315,
      "comment": "",
      "child_ranges": [
        "(line 1281,col 5)-(line 1281,col 43)",
        "(line 1283,col 5)-(line 1283,col 40)",
        "(line 1284,col 5)-(line 1286,col 5)",
        "(line 1288,col 5)-(line 1313,col 5)",
        "(line 1314,col 5)-(line 1314,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1320,
      "end_line": 1331,
      "comment": "\n   * Try to fold array-element. e.g [1, 2, 3][10];\n   ",
      "child_ranges": [
        "(line 1321,col 5)-(line 1321,col 47)",
        "(line 1323,col 5)-(line 1325,col 5)",
        "(line 1327,col 5)-(line 1329,col 5)",
        "(line 1330,col 5)-(line 1330,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1336,
      "end_line": 1371,
      "comment": "\n   * Try to fold array-length. e.g [1, 2, 3].length \u003d\u003d\u003e 3, [x, y].length \u003d\u003d\u003e 2\n   ",
      "child_ranges": [
        "(line 1337,col 5)-(line 1337,col 47)",
        "(line 1339,col 5)-(line 1341,col 5)",
        "(line 1343,col 5)-(line 1368,col 5)",
        "(line 1370,col 5)-(line 1370,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 1373,
      "end_line": 1384,
      "comment": "",
      "child_ranges": [
        "(line 1374,col 5)-(line 1374,col 32)",
        "(line 1375,col 5)-(line 1382,col 5)",
        "(line 1383,col 5)-(line 1383,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1386,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1387,col 5)-(line 1387,col 32)",
        "(line 1391,col 5)-(line 1393,col 5)",
        "(line 1395,col 5)-(line 1399,col 5)",
        "(line 1401,col 5)-(line 1401,col 37)",
        "(line 1402,col 5)-(line 1402,col 31)",
        "(line 1403,col 5)-(line 1406,col 5)",
        "(line 1408,col 5)-(line 1411,col 5)",
        "(line 1413,col 5)-(line 1413,col 40)",
        "(line 1414,col 5)-(line 1414,col 21)",
        "(line 1415,col 5)-(line 1425,col 5)",
        "(line 1427,col 5)-(line 1430,col 5)",
        "(line 1432,col 5)-(line 1436,col 5)",
        "(line 1439,col 5)-(line 1439,col 40)",
        "(line 1440,col 5)-(line 1440,col 23)",
        "(line 1441,col 5)-(line 1441,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1444,
      "end_line": 1505,
      "comment": "",
      "child_ranges": [
        "(line 1445,col 5)-(line 1445,col 51)",
        "(line 1447,col 5)-(line 1449,col 5)",
        "(line 1451,col 5)-(line 1456,col 5)",
        "(line 1459,col 5)-(line 1459,col 20)",
        "(line 1460,col 5)-(line 1460,col 22)",
        "(line 1461,col 5)-(line 1483,col 5)",
        "(line 1487,col 5)-(line 1489,col 5)",
        "(line 1491,col 5)-(line 1494,col 5)",
        "(line 1496,col 5)-(line 1496,col 48)",
        "(line 1497,col 5)-(line 1500,col 5)",
        "(line 1502,col 5)-(line 1502,col 47)",
        "(line 1503,col 5)-(line 1503,col 23)",
        "(line 1504,col 5)-(line 1504,col 13)"
      ]
    }
  ]
}