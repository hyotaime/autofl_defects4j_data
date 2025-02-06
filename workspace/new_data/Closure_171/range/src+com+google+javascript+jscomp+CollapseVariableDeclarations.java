{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CollapseVariableDeclarations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollapseVariableDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 64,
      "end_line": 256,
      "comment": "\n * Collapses multiple variable declarations into a single one. i.e the\n * following:\n *\n * \u003cpre\u003e\n * var a;\n * var b \u003d 1;\n * var c \u003d 2;\n * \u003c/pre\u003e\n *\n * becomes:\n *\n * \u003cpre\u003evar a, b \u003d 1, c \u003d 2;\u003c/pre\u003e\n *\n * This reduces the generated code size. More optimizations are possible:\n * \u003cli\u003eGroup all variable declarations inside a function into one such variable.\n * declaration block.\u003c/li\u003e\n * \u003cli\u003eRe-use variables instead of declaring a new one if they are used for\n * only part of a function.\u003c/li\u003e\n *\n * Similarly, also collapses assigns like:\n *\n * \u003cpre\u003e\n * a \u003d true;\n * b \u003d true;\n * var c \u003d true;\n * \u003c/pre\u003e\n *\n * becomes:\n *\n * \u003cpre\u003evar c \u003d b \u003d a \u003d true;\u003c/pre\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Reference to JS Compiler "
    },
    {
      "type": "class_interface",
      "name": "Collapse",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 89,
      "comment": " Encapsulation of information about a variable declaration collapse "
    },
    {
      "type": "field",
      "varNames": [
        "startNode"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Variable declaration that any following var nodes should be\n     * collapsed into\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endNode"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Last node (non-inclusive) of the chain of nodes to collapse.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Parent of the nodes to the collapse "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse.Collapse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 33)",
        "(line 86,col 7)-(line 86,col 29)",
        "(line 87,col 7)-(line 87,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapses"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n   * Collapses to do in this pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodesToCollapse"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n   * Nodes we\u0027ve already looked at for collapsing, so that we don\u0027t look at them\n   * again (we look ahead when examining what nodes can be collapsed, and the\n   * node traversal may give them to us again)\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.CollapseVariableDeclarations(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 75)",
        "(line 105,col 5)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 22)",
        "(line 111,col 5)-(line 111,col 28)",
        "(line 113,col 5)-(line 113,col 66)",
        "(line 115,col 5)-(line 118,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherCollapses",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 128,
      "end_line": 213,
      "comment": "\n   * Gathers all of the variable declarations / assignments that should be\n   * collapsed into one.\n   *\n   * We do not do the collapsing as we go since node traversal would be affected\n   * by the changes we are making to the parse tree.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "blacklistedVars"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " This is a workaround for a bug in Firefox."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.GatherCollapses.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 136,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 140,col 7)",
        "(line 143,col 7)-(line 145,col 7)",
        "(line 148,col 7)-(line 150,col 7)",
        "(line 154,col 7)-(line 156,col 7)",
        "(line 158,col 7)-(line 158,col 23)",
        "(line 160,col 7)-(line 160,col 33)",
        "(line 163,col 7)-(line 163,col 22)",
        "(line 165,col 7)-(line 165,col 41)",
        "(line 167,col 7)-(line 179,col 7)",
        "(line 181,col 7)-(line 184,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.GatherCollapses.blacklistStubVars(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 187,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 188,col 7)-(line 193,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.GatherCollapses.canBeRedeclared(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 196,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 199,col 7)",
        "(line 200,col 7)-(line 200,col 38)",
        "(line 201,col 7)-(line 201,col 40)",
        "(line 203,col 7)-(line 205,col 7)",
        "(line 207,col 7)-(line 207,col 42)",
        "(line 208,col 7)-(line 211,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.isNamedParameter(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses()",
      "begin_line": 219,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 254,col 5)"
      ]
    }
  ]
}