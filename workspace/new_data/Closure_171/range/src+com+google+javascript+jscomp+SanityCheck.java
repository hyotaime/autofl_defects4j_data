{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SanityCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SanityCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 27,
      "end_line": 134,
      "comment": "\n * A compiler pass that verifies the structure of the AST conforms\n * to a number of invariants. Because this can add a lot of overhead,\n * we only run this in development mode.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "CANNOT_PARSE_GENERATED_CODE"
      ],
      "begin_line": 29,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GENERATED_BAD_CODE"
      ],
      "begin_line": 33,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "astValidator"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SanityCheck.SanityCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SanityCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 34)",
        "(line 52,col 5)-(line 52,col 44)",
        "(line 53,col 5)-(line 53,col 36)",
        "(line 54,col 5)-(line 54,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SanityCheck.sanityCheckAst(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n   * Sanity check the AST is structurally accurate.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 43)",
        "(line 62,col 5)-(line 62,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SanityCheck.sanityCheckVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 68,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SanityCheck.sanityCheckCodeGeneration(com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 106,
      "comment": "\n   * Sanity checks code generation by performing it once, parsing the result,\n   * then generating code from the second parse tree to verify that it matches\n   * the code generated from the first parse tree.\n   *\n   * @return The regenerated parse tree. Null on error.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 83,col 5)",
        "(line 85,col 5)-(line 85,col 44)",
        "(line 86,col 5)-(line 86,col 53)",
        "(line 87,col 5)-(line 94,col 5)",
        "(line 96,col 5)-(line 96,col 46)",
        "(line 97,col 5)-(line 103,col 5)",
        "(line 105,col 5)-(line 105,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SanityCheck.sanityCheckNormalization(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 112,
      "end_line": 133,
      "comment": "\n   * Sanity checks the AST. This is by verifying the normalization passes do\n   * nothing.\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 54)",
        "(line 115,col 5)-(line 115,col 39)",
        "(line 120,col 5)-(line 120,col 55)",
        "(line 121,col 5)-(line 130,col 5)",
        "(line 132,col 5)-(line 132,col 42)"
      ]
    }
  ]
}