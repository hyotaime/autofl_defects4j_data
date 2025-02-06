{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PrepareAst.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrepareAst",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 34,
      "end_line": 219,
      "comment": "\n * Prepare the AST before we do any checks or optimizations on it.\n *\n * This pass must run. It should bring the AST into a consistent state,\n * and add annotations where necessary. It should not make any transformations\n * on the tree that would lose source information, since we need that source\n * information for checks.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkOnly"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAst(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAst(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 29)",
        "(line 45,col 5)-(line 45,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.reportChange()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 51,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 71,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.normalizeNodeTypes(com.google.javascript.rhino.Node)",
      "begin_line": 77,
      "end_line": 88,
      "comment": "\n   * Covert EXPR_VOID to EXPR_RESULT to simplify the rest of the code.\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 23)",
        "(line 80,col 5)-(line 87,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.normalizeBlocks(com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 111,
      "comment": "\n   * Add blocks to IF, WHILE, DO, etc.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 110,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrepareAnnotations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 117,
      "end_line": 218,
      "comment": "\n   * Normalize where annotations appear on the AST. Copies\n   * around existing JSDoc annotations as well as internal annotations.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.PrepareAnnotations()",
      "begin_line": 120,
      "end_line": 121,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 7)-(line 127,col 7)",
        "(line 128,col 7)-(line 128,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 131,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 141,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.normalizeObjectLiteralAnnotations(com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 145,col 7)-(line 145,col 53)",
        "(line 146,col 7)-(line 150,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.annotateCalls(com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 179,
      "comment": "\n     * There are two types of calls we are interested in calls without explicit\n     * \"this\" values (what we are call \"free\" calls) and direct call to eval.\n     ",
      "child_ranges": [
        "(line 158,col 7)-(line 158,col 43)",
        "(line 162,col 7)-(line 162,col 37)",
        "(line 165,col 7)-(line 167,col 7)",
        "(line 169,col 7)-(line 171,col 7)",
        "(line 175,col 7)-(line 178,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.annotateDispatchers(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 184,
      "end_line": 193,
      "comment": "\n     * Translate dispatcher info into the property expected node.\n     ",
      "child_ranges": [
        "(line 185,col 7)-(line 185,col 47)",
        "(line 186,col 7)-(line 192,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrepareAst.PrepareAnnotations.normalizeObjectLiteralKeyAnnotations(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 210,
      "end_line": 217,
      "comment": "\n     * In the AST that Rhino gives us, it needs to make a distinction\n     * between JsDoc on the object literal node and JsDoc on the object literal\n     * value. For example,\n     * \u003cpre\u003e\n     * var x \u003d {\n     *   / JSDOC /\n     *   a: \u0027b\u0027,\n     *   c: / JSDOC / \u0027d\u0027\n     * };\n     * \u003c/pre\u003e\n     *\n     * But in few narrow cases (in particular, function literals), it\u0027s\n     * a lot easier for us if the doc is attached to the value.\n     ",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 53)",
        "(line 213,col 7)-(line 216,col 7)"
      ]
    }
  ]
}