{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/MoveFunctionDeclarations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MoveFunctionDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 93,
      "comment": "\n * Moves top-level function declarations to the top.\n *\n * Enable this pass if a try catch block wraps the output after compilation,\n * and the output runs on Firefox because function declarations are only\n * defined when reached inside a try catch block on Firefox.\n *\n * On Firefox, this code works:\n *\n * var g \u003d f;\n * function f() {}\n *\n * but this code does not work:\n *\n * try {\n *   var g \u003d f;\n *   function f() {}\n * } catch(e) {}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functions"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.MoveFunctionDeclarations(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 29)",
        "(line 53,col 5)-(line 53,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 49)",
        "(line 59,col 5)-(line 65,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 35)",
        "(line 71,col 5)-(line 71,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 74,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 78,col 5)",
        "(line 80,col 5)-(line 91,col 5)"
      ]
    }
  ]
}