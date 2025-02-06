{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/parsing/ParserRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParserRunner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 169,
      "comment": " parser runner "
    },
    {
      "type": "field",
      "varNames": [
        "CONFIG_RESOURCE"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "annotationNames"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suppressionNames"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedVars"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.ParserRunner()",
      "begin_line": 49,
      "end_line": 49,
      "comment": " Should never need to instantiate class of static methods.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.createConfig(boolean)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.createConfig(boolean, com.google.javascript.jscomp.parsing.Config.LanguageMode, boolean)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.createConfig(boolean, com.google.javascript.jscomp.parsing.Config.LanguageMode, boolean, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 62,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 25)",
        "(line 67,col 5)-(line 67,col 41)",
        "(line 68,col 5)-(line 73,col 5)",
        "(line 74,col 5)-(line 75,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.getReservedVars()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 25)",
        "(line 80,col 5)-(line 80,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.initResourceConfig()",
      "begin_line": 83,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 86,col 5)",
        "(line 88,col 5)-(line 88,col 70)",
        "(line 89,col 5)-(line 89,col 73)",
        "(line 90,col 5)-(line 90,col 75)",
        "(line 91,col 5)-(line 91,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.extractList(java.lang.String)",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 43)",
        "(line 96,col 5)-(line 96,col 49)",
        "(line 97,col 5)-(line 99,col 5)",
        "(line 100,col 5)-(line 100,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.parse(com.google.javascript.rhino.jstype.StaticSourceFile, java.lang.String, com.google.javascript.jscomp.parsing.Config, com.google.javascript.rhino.head.ErrorReporter, java.util.logging.Logger)",
      "begin_line": 112,
      "end_line": 155,
      "comment": "\n   * Parses the JavaScript text given by a reader.\n   *\n   * @param sourceString Source code from the file.\n   * @param errorReporter An error.\n   * @param logger A logger.\n   * @return The AST of the given text.\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 33)",
        "(line 118,col 5)-(line 118,col 39)",
        "(line 119,col 5)-(line 119,col 47)",
        "(line 120,col 5)-(line 120,col 58)",
        "(line 121,col 5)-(line 121,col 36)",
        "(line 122,col 5)-(line 122,col 43)",
        "(line 123,col 5)-(line 123,col 53)",
        "(line 126,col 5)-(line 127,col 57)",
        "(line 130,col 5)-(line 131,col 76)",
        "(line 132,col 5)-(line 132,col 58)",
        "(line 134,col 5)-(line 134,col 56)",
        "(line 135,col 5)-(line 135,col 45)",
        "(line 136,col 5)-(line 136,col 55)",
        "(line 138,col 5)-(line 138,col 54)",
        "(line 139,col 5)-(line 139,col 27)",
        "(line 140,col 5)-(line 147,col 5)",
        "(line 148,col 5)-(line 148,col 21)",
        "(line 149,col 5)-(line 153,col 5)",
        "(line 154,col 5)-(line 154,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParseResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 160,
      "end_line": 168,
      "comment": "\n   * Holds results of parsing. Includes both ast formats.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ast"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldAst"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.ParserRunner.ParseResult.ParseResult(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 21)",
        "(line 166,col 7)-(line 166,col 27)"
      ]
    }
  ]
}