{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CodeGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodeGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 1287,
      "comment": "\n * CodeGenerator generates codes from a parse tree, sending it to the specified\n * CodeConsumer.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "LT_ESCAPED"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GT_ESCAPED"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_JS_STRINGS"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " A memoizer for formatting strings as JS strings."
    },
    {
      "type": "field",
      "varNames": [
        "HEX_CHARS"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputCharsetEncoder"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferSingleQuotes"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trustedStrings"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodeGenerator.CodeGenerator(com.google.javascript.jscomp.CodeConsumer)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 18)",
        "(line 56,col 5)-(line 56,col 32)",
        "(line 57,col 5)-(line 57,col 31)",
        "(line 58,col 5)-(line 58,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.forCostEstimation(com.google.javascript.jscomp.CodeConsumer)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodeGenerator.CodeGenerator(com.google.javascript.jscomp.CodeConsumer, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 65,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 18)",
        "(line 70,col 5)-(line 70,col 55)",
        "(line 71,col 5)-(line 79,col 5)",
        "(line 80,col 5)-(line 80,col 57)",
        "(line 81,col 5)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.tagAsStrict()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n   * Insert a ECMASCRIPT 5 strict annotation.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.add(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addIdentifier(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.add(com.google.javascript.rhino.Node)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 103,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 106,col 5)",
        "(line 108,col 5)-(line 108,col 27)",
        "(line 109,col 5)-(line 109,col 42)",
        "(line 110,col 5)-(line 110,col 39)",
        "(line 111,col 5)-(line 111,col 35)",
        "(line 112,col 5)-(line 112,col 33)",
        "(line 115,col 5)-(line 143,col 5)",
        "(line 145,col 5)-(line 145,col 29)",
        "(line 147,col 5)-(line 753,col 5)",
        "(line 755,col 5)-(line 755,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.unrollBinaryOperator(com.google.javascript.rhino.Node, int, java.lang.String, com.google.javascript.jscomp.CodeGenerator.Context, com.google.javascript.jscomp.CodeGenerator.Context, int, int)",
      "begin_line": 765,
      "end_line": 781,
      "comment": "\n   * We could use addList recursively here, but sometimes we produce\n   * very deeply nested operators and run out of stack space, so we\n   * just unroll the recursion when possible.\n   *\n   * We assume nodes are left-recursive.\n   ",
      "child_ranges": [
        "(line 768,col 5)-(line 768,col 46)",
        "(line 769,col 5)-(line 771,col 5)",
        "(line 773,col 5)-(line 773,col 55)",
        "(line 775,col 5)-(line 775,col 36)",
        "(line 776,col 5)-(line 780,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(java.lang.String)",
      "begin_line": 783,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 25)",
        "(line 785,col 5)-(line 790,col 5)",
        "(line 791,col 5)-(line 791,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(java.lang.String)",
      "begin_line": 794,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 795,col 5)-(line 804,col 5)",
        "(line 805,col 5)-(line 805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.isIndirectEval(com.google.javascript.rhino.Node)",
      "begin_line": 811,
      "end_line": 814,
      "comment": "\n   * @return Whether the name is an indirect eval.\n   ",
      "child_ranges": [
        "(line 812,col 5)-(line 813,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addNonEmptyStatement(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator.Context, boolean)",
      "begin_line": 823,
      "end_line": 879,
      "comment": "\n   * Adds a block or expression, substituting a VOID with an empty statement.\n   * This is used for \"for (...);\" and \"if (...);\" type statements.\n   *\n   * @param n The node to print.\n   * @param context The context to determine how the node should be printed.\n   ",
      "child_ranges": [
        "(line 825,col 5)-(line 825,col 27)",
        "(line 827,col 5)-(line 829,col 5)",
        "(line 833,col 5)-(line 866,col 5)",
        "(line 868,col 5)-(line 878,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)",
      "begin_line": 885,
      "end_line": 905,
      "comment": "\n   * @return Whether the Node is a DO or FUNCTION (with or without\n   * labels).\n   ",
      "child_ranges": [
        "(line 886,col 5)-(line 904,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addExpr(com.google.javascript.rhino.Node, int, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 907,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 908,col 5)-(line 915,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addList(com.google.javascript.rhino.Node)",
      "begin_line": 918,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 919,col 5)-(line 919,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addList(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 923,col 5)-(line 923,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addList(com.google.javascript.rhino.Node, boolean, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 926,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 928,col 5)-(line 936,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addArrayList(com.google.javascript.rhino.Node)",
      "begin_line": 947,
      "end_line": 960,
      "comment": "\n   * This function adds a comma-separated list as is specified by an ARRAYLIT\n   * node with the associated skipIndexes array.  This is a space optimization\n   * since we avoid creating a whole Node object for each empty array literal\n   * slot.\n   * @param firstInList The first in the node list (chained through the next\n   * property).\n   ",
      "child_ranges": [
        "(line 948,col 5)-(line 948,col 33)",
        "(line 949,col 5)-(line 955,col 5)",
        "(line 957,col 5)-(line 959,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addCaseBody(com.google.javascript.rhino.Node)",
      "begin_line": 962,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 963,col 5)-(line 963,col 23)",
        "(line 964,col 5)-(line 964,col 18)",
        "(line 965,col 5)-(line 965,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addAllSiblings(com.google.javascript.rhino.Node)",
      "begin_line": 968,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 969,col 5)-(line 971,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addJsString(com.google.javascript.rhino.Node)",
      "begin_line": 975,
      "end_line": 988,
      "comment": " Outputs a JS string, using the optimal (single/double) quote character ",
      "child_ranges": [
        "(line 976,col 5)-(line 976,col 29)",
        "(line 977,col 5)-(line 977,col 55)",
        "(line 978,col 5)-(line 987,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.jsString(java.lang.String, boolean)",
      "begin_line": 990,
      "end_line": 1018,
      "comment": "",
      "child_ranges": [
        "(line 991,col 5)-(line 991,col 33)",
        "(line 994,col 5)-(line 999,col 5)",
        "(line 1001,col 5)-(line 1001,col 36)",
        "(line 1002,col 5)-(line 1002,col 15)",
        "(line 1003,col 5)-(line 1014,col 5)",
        "(line 1016,col 5)-(line 1017,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.regexpEscape(java.lang.String, java.nio.charset.CharsetEncoder)",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": " Escapes regular expression ",
      "child_ranges": [
        "(line 1022,col 5)-(line 1022,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(java.lang.String)",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": "\n   * Escapes the given string to a double quoted (\") JavaScript/JSON string\n   ",
      "child_ranges": [
        "(line 1029,col 5)-(line 1029,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.regexpEscape(java.lang.String)",
      "begin_line": 1035,
      "end_line": 1037,
      "comment": " If the user doesn\u0027t want to specify an output charset encoder, assume\n     they want Latin/ASCII characters only.\n   ",
      "child_ranges": [
        "(line 1036,col 5)-(line 1036,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.strEscape(java.lang.String, char, java.lang.String, java.lang.String, java.lang.String, java.nio.charset.CharsetEncoder, boolean, boolean)",
      "begin_line": 1040,
      "end_line": 1163,
      "comment": " Helper to escape JavaScript string as well as regular expression ",
      "child_ranges": [
        "(line 1049,col 5)-(line 1049,col 57)",
        "(line 1050,col 5)-(line 1050,col 21)",
        "(line 1051,col 5)-(line 1160,col 5)",
        "(line 1161,col 5)-(line 1161,col 21)",
        "(line 1162,col 5)-(line 1162,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.identifierEscape(java.lang.String)",
      "begin_line": 1165,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1167,col 5)-(line 1169,col 5)",
        "(line 1172,col 5)-(line 1172,col 43)",
        "(line 1173,col 5)-(line 1183,col 5)",
        "(line 1184,col 5)-(line 1184,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 1191,
      "end_line": 1202,
      "comment": "\n   * @param maxCount The maximum number of children to look for.\n   * @return The number of children of this node that are non empty up to\n   * maxCount.\n   ",
      "child_ranges": [
        "(line 1192,col 5)-(line 1192,col 14)",
        "(line 1193,col 5)-(line 1193,col 31)",
        "(line 1194,col 5)-(line 1200,col 5)",
        "(line 1201,col 5)-(line 1201,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild(com.google.javascript.rhino.Node)",
      "begin_line": 1205,
      "end_line": 1217,
      "comment": " Gets the first non-empty child of the given node. ",
      "child_ranges": [
        "(line 1206,col 5)-(line 1215,col 5)",
        "(line 1216,col 5)-(line 1216,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getContextForNonEmptyExpression(com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 1234,
      "end_line": 1237,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 5)-(line 1236,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 1243,
      "end_line": 1246,
      "comment": "\n   * If we\u0027re in a IN_FOR_INIT_CLAUSE, we can\u0027t permit in operators in the\n   * expression.  Pass on the IN_FOR_INIT_CLAUSE flag through subexpressions.\n   ",
      "child_ranges": [
        "(line 1244,col 5)-(line 1245,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(java.lang.StringBuilder, char)",
      "begin_line": 1251,
      "end_line": 1259,
      "comment": "\n   * @see #appendHexJavaScriptRepresentation(int, Appendable)\n   ",
      "child_ranges": [
        "(line 1253,col 5)-(line 1258,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(int, java.lang.Appendable)",
      "begin_line": 1268,
      "end_line": 1286,
      "comment": "\n   * Returns a JavaScript representation of the character in a hex escaped\n   * format.\n   *\n   * @param codePoint The code point to append.\n   * @param out The buffer to which the hex representation should be appended.\n   ",
      "child_ranges": [
        "(line 1271,col 5)-(line 1280,col 5)",
        "(line 1281,col 5)-(line 1285,col 44)"
      ]
    }
  ]
}