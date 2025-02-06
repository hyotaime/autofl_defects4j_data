{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CodeGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodeGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 1292,
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
        "escapedJsStrings"
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
      "end_line": 757,
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
        "(line 147,col 5)-(line 754,col 5)",
        "(line 756,col 5)-(line 756,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.unrollBinaryOperator(com.google.javascript.rhino.Node, int, java.lang.String, com.google.javascript.jscomp.CodeGenerator.Context, com.google.javascript.jscomp.CodeGenerator.Context, int, int)",
      "begin_line": 766,
      "end_line": 782,
      "comment": "\n   * We could use addList recursively here, but sometimes we produce\n   * very deeply nested operators and run out of stack space, so we\n   * just unroll the recursion when possible.\n   *\n   * We assume nodes are left-recursive.\n   ",
      "child_ranges": [
        "(line 769,col 5)-(line 769,col 46)",
        "(line 770,col 5)-(line 772,col 5)",
        "(line 774,col 5)-(line 774,col 55)",
        "(line 776,col 5)-(line 776,col 36)",
        "(line 777,col 5)-(line 781,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(java.lang.String)",
      "begin_line": 784,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 785,col 5)-(line 785,col 25)",
        "(line 786,col 5)-(line 788,col 5)",
        "(line 789,col 5)-(line 794,col 5)",
        "(line 795,col 5)-(line 795,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(java.lang.String)",
      "begin_line": 798,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 799,col 5)-(line 808,col 5)",
        "(line 809,col 5)-(line 809,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.isIndirectEval(com.google.javascript.rhino.Node)",
      "begin_line": 815,
      "end_line": 818,
      "comment": "\n   * @return Whether the name is an indirect eval.\n   ",
      "child_ranges": [
        "(line 816,col 5)-(line 817,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addNonEmptyStatement(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator.Context, boolean)",
      "begin_line": 827,
      "end_line": 883,
      "comment": "\n   * Adds a block or expression, substituting a VOID with an empty statement.\n   * This is used for \"for (...);\" and \"if (...);\" type statements.\n   *\n   * @param n The node to print.\n   * @param context The context to determine how the node should be printed.\n   ",
      "child_ranges": [
        "(line 829,col 5)-(line 829,col 27)",
        "(line 831,col 5)-(line 833,col 5)",
        "(line 837,col 5)-(line 870,col 5)",
        "(line 872,col 5)-(line 882,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node)",
      "begin_line": 889,
      "end_line": 909,
      "comment": "\n   * @return Whether the Node is a DO or FUNCTION (with or without\n   * labels).\n   ",
      "child_ranges": [
        "(line 890,col 5)-(line 908,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addExpr(com.google.javascript.rhino.Node, int, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 911,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 912,col 5)-(line 919,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addList(com.google.javascript.rhino.Node)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 923,col 5)-(line 923,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addList(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 926,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 927,col 5)-(line 927,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addList(com.google.javascript.rhino.Node, boolean, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 930,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 932,col 5)-(line 941,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addArrayList(com.google.javascript.rhino.Node)",
      "begin_line": 952,
      "end_line": 965,
      "comment": "\n   * This function adds a comma-separated list as is specified by an ARRAYLIT\n   * node with the associated skipIndexes array.  This is a space optimization\n   * since we avoid creating a whole Node object for each empty array literal\n   * slot.\n   * @param firstInList The first in the node list (chained through the next\n   * property).\n   ",
      "child_ranges": [
        "(line 953,col 5)-(line 953,col 33)",
        "(line 954,col 5)-(line 960,col 5)",
        "(line 962,col 5)-(line 964,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addCaseBody(com.google.javascript.rhino.Node)",
      "begin_line": 967,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 968,col 5)-(line 968,col 23)",
        "(line 969,col 5)-(line 969,col 18)",
        "(line 970,col 5)-(line 970,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addAllSiblings(com.google.javascript.rhino.Node)",
      "begin_line": 973,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 974,col 5)-(line 976,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.addJsString(com.google.javascript.rhino.Node)",
      "begin_line": 980,
      "end_line": 993,
      "comment": " Outputs a JS string, using the optimal (single/double) quote character ",
      "child_ranges": [
        "(line 981,col 5)-(line 981,col 29)",
        "(line 982,col 5)-(line 982,col 55)",
        "(line 983,col 5)-(line 992,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.jsString(java.lang.String, boolean)",
      "begin_line": 995,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 996,col 5)-(line 996,col 33)",
        "(line 999,col 5)-(line 1004,col 5)",
        "(line 1006,col 5)-(line 1006,col 36)",
        "(line 1007,col 5)-(line 1007,col 15)",
        "(line 1008,col 5)-(line 1019,col 5)",
        "(line 1021,col 5)-(line 1022,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.regexpEscape(java.lang.String, java.nio.charset.CharsetEncoder)",
      "begin_line": 1026,
      "end_line": 1028,
      "comment": " Escapes regular expression ",
      "child_ranges": [
        "(line 1027,col 5)-(line 1027,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(java.lang.String)",
      "begin_line": 1033,
      "end_line": 1035,
      "comment": "\n   * Escapes the given string to a double quoted (\") JavaScript/JSON string\n   ",
      "child_ranges": [
        "(line 1034,col 5)-(line 1034,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.regexpEscape(java.lang.String)",
      "begin_line": 1040,
      "end_line": 1042,
      "comment": " If the user doesn\u0027t want to specify an output charset encoder, assume\n     they want Latin/ASCII characters only.\n   ",
      "child_ranges": [
        "(line 1041,col 5)-(line 1041,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.strEscape(java.lang.String, char, java.lang.String, java.lang.String, java.lang.String, java.nio.charset.CharsetEncoder, boolean, boolean)",
      "begin_line": 1045,
      "end_line": 1168,
      "comment": " Helper to escape JavaScript string as well as regular expression ",
      "child_ranges": [
        "(line 1054,col 5)-(line 1054,col 57)",
        "(line 1055,col 5)-(line 1055,col 21)",
        "(line 1056,col 5)-(line 1165,col 5)",
        "(line 1166,col 5)-(line 1166,col 21)",
        "(line 1167,col 5)-(line 1167,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.identifierEscape(java.lang.String)",
      "begin_line": 1170,
      "end_line": 1190,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 5)-(line 1174,col 5)",
        "(line 1177,col 5)-(line 1177,col 43)",
        "(line 1178,col 5)-(line 1188,col 5)",
        "(line 1189,col 5)-(line 1189,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount(com.google.javascript.rhino.Node, int)",
      "begin_line": 1196,
      "end_line": 1207,
      "comment": "\n   * @param maxCount The maximum number of children to look for.\n   * @return The number of children of this node that are non empty up to\n   * maxCount.\n   ",
      "child_ranges": [
        "(line 1197,col 5)-(line 1197,col 14)",
        "(line 1198,col 5)-(line 1198,col 31)",
        "(line 1199,col 5)-(line 1205,col 5)",
        "(line 1206,col 5)-(line 1206,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild(com.google.javascript.rhino.Node)",
      "begin_line": 1210,
      "end_line": 1222,
      "comment": " Gets the first non-empty child of the given node. ",
      "child_ranges": [
        "(line 1211,col 5)-(line 1220,col 5)",
        "(line 1221,col 5)-(line 1221,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getContextForNonEmptyExpression(com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 1239,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 5)-(line 1241,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.getContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 1248,
      "end_line": 1251,
      "comment": "\n   * If we\u0027re in a IN_FOR_INIT_CLAUSE, we can\u0027t permit in operators in the\n   * expression.  Pass on the IN_FOR_INIT_CLAUSE flag through subexpressions.\n   ",
      "child_ranges": [
        "(line 1249,col 5)-(line 1250,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(java.lang.StringBuilder, char)",
      "begin_line": 1256,
      "end_line": 1264,
      "comment": "\n   * @see #appendHexJavaScriptRepresentation(int, Appendable)\n   ",
      "child_ranges": [
        "(line 1258,col 5)-(line 1263,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(int, java.lang.Appendable)",
      "begin_line": 1273,
      "end_line": 1291,
      "comment": "\n   * Returns a JavaScript representation of the character in a hex escaped\n   * format.\n   *\n   * @param codePoint The code point to append.\n   * @param out The buffer to which the hex representation should be appended.\n   ",
      "child_ranges": [
        "(line 1276,col 5)-(line 1285,col 5)",
        "(line 1286,col 5)-(line 1290,col 44)"
      ]
    }
  ]
}