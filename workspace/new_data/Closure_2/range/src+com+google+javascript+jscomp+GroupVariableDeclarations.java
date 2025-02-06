{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/GroupVariableDeclarations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GroupVariableDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 63,
      "end_line": 189,
      "comment": "\n * Groups multiple variable declarations (that may or may not be contiguous)\n * in the same scope into a single one. i.e.\n *\n * \u003cpre\u003e\n * var a, b \u003d 10;\n * f1();\n * var c, d;\n * ... some other code ...\n * var x, y, z \u003d 100;\n * ... some other code ...\n * var p \u003d 200, q \u003d 300;\n * \u003c/pre\u003e\n *\n * becomes:\n *\n * \u003cpre\u003e\n * var a, b \u003d 10, c, d, x, y, z;\n * f1();\n * ... some other code ...\n * z \u003d 100;\n * ... some other code ...\n * var p \u003d 200, q \u003d 300;\n * \u003c/pre\u003e\n *\n * This reduces the generated uncompressed code size.\n *\n * For any scope, we use the first VAR statement as the statement to collapse\n * the other declarations into. For other VAR statements in the scope, we only\n * consider ones that either (a) have no variable that is initialized in the\n * the statement, or (b) have exactly one variable that is initialized (e.g.\n * the \"var x, y, z \u003d 100;\" statement in the example above. VAR statements\n * with more than one variable initialization are not collapsed. This is\n * because doing so would increase uncompressed code size.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.GroupVariableDeclarations(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 75,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 49)",
        "(line 78,col 5)-(line 78,col 56)",
        "(line 79,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 87,col 5)",
        "(line 88,col 5)-(line 88,col 53)",
        "(line 89,col 5)-(line 89,col 43)",
        "(line 90,col 5)-(line 93,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GroupVariableDeclarations.applyGroupingToVar(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 188,
      "comment": "\n   * Attempts to collapse groupVar. This can only happen if groupVar has at most\n   * one variable initialization (it may have multiple variable declarations).\n   * If successful, then detaches groupVar\u0027s children and appends them to\n   * firstVar\n   *\n   * @param firstVar The first VAR {@code Node} in that scope. This is the node\n   *                 that we want to collapse groupVar into\n   * @param groupVar The VAR {@code Node} that we want to try collapsing\n   *                 into the first VAR node of that scope\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 42)",
        "(line 125,col 5)-(line 125,col 32)",
        "(line 126,col 5)-(line 135,col 5)",
        "(line 138,col 5)-(line 138,col 47)",
        "(line 141,col 5)-(line 182,col 5)",
        "(line 184,col 5)-(line 184,col 46)",
        "(line 185,col 5)-(line 185,col 41)",
        "(line 187,col 5)-(line 187,col 32)"
      ]
    }
  ]
}