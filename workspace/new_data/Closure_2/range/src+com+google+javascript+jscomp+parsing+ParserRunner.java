{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/parsing/ParserRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParserRunner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "configResource"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "annotationNames"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suppressionNames"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedVars"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.ParserRunner()",
      "begin_line": 48,
      "end_line": 48,
      "comment": " Should never need to instantiate class of static methods.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.createConfig(boolean)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.createConfig(boolean, com.google.javascript.jscomp.parsing.Config.LanguageMode, boolean)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.createConfig(boolean, com.google.javascript.jscomp.parsing.Config.LanguageMode, boolean, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 61,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 25)",
        "(line 66,col 5)-(line 66,col 41)",
        "(line 67,col 5)-(line 72,col 5)",
        "(line 73,col 5)-(line 74,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.getReservedVars()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 25)",
        "(line 79,col 5)-(line 79,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.initResourceConfig()",
      "begin_line": 82,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 85,col 5)",
        "(line 87,col 5)-(line 87,col 69)",
        "(line 88,col 5)-(line 88,col 73)",
        "(line 89,col 5)-(line 89,col 75)",
        "(line 90,col 5)-(line 90,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.extractList(java.lang.String)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 43)",
        "(line 95,col 5)-(line 95,col 49)",
        "(line 96,col 5)-(line 98,col 5)",
        "(line 99,col 5)-(line 99,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.parse(com.google.javascript.rhino.jstype.StaticSourceFile, java.lang.String, com.google.javascript.jscomp.parsing.Config, com.google.javascript.rhino.head.ErrorReporter, java.util.logging.Logger)",
      "begin_line": 111,
      "end_line": 154,
      "comment": "\n   * Parses the JavaScript text given by a reader.\n   *\n   * @param sourceString Source code from the file.\n   * @param errorReporter An error.\n   * @param logger A logger.\n   * @return The AST of the given text.\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 33)",
        "(line 117,col 5)-(line 117,col 39)",
        "(line 118,col 5)-(line 118,col 47)",
        "(line 119,col 5)-(line 119,col 58)",
        "(line 120,col 5)-(line 120,col 36)",
        "(line 121,col 5)-(line 121,col 43)",
        "(line 122,col 5)-(line 122,col 53)",
        "(line 125,col 5)-(line 126,col 57)",
        "(line 129,col 5)-(line 130,col 76)",
        "(line 131,col 5)-(line 131,col 58)",
        "(line 133,col 5)-(line 133,col 56)",
        "(line 134,col 5)-(line 134,col 45)",
        "(line 135,col 5)-(line 135,col 55)",
        "(line 137,col 5)-(line 137,col 54)",
        "(line 138,col 5)-(line 138,col 27)",
        "(line 139,col 5)-(line 146,col 5)",
        "(line 147,col 5)-(line 147,col 21)",
        "(line 148,col 5)-(line 152,col 5)",
        "(line 153,col 5)-(line 153,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParseResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 159,
      "end_line": 167,
      "comment": "\n   * Holds results of parsing. Includes both ast formats.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ast"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldAst"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.ParseResult.ParseResult(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 21)",
        "(line 165,col 7)-(line 165,col 27)"
      ]
    }
  ]
}