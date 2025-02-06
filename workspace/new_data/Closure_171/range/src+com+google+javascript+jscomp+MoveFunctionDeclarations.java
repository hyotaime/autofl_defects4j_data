{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MoveFunctionDeclarations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MoveFunctionDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 48,
      "end_line": 94,
      "comment": "\n * Moves top-level function declarations to the top.\n *\n * Enable this pass if a try catch block wraps the output after compilation,\n * and the output runs on Firefox because function declarations are only\n * defined when reached inside a try catch block on Firefox.\n *\n * On Firefox, this code works:\n *\n * var g \u003d f;\n * function f() {}\n *\n * but this code does not work:\n *\n * try {\n *   var g \u003d f;\n *   function f() {}\n * } catch(e) {}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functions"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.MoveFunctionDeclarations(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 29)",
        "(line 54,col 5)-(line 54,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 49)",
        "(line 60,col 5)-(line 66,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 35)",
        "(line 72,col 5)-(line 72,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MoveFunctionDeclarations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 79,col 5)",
        "(line 81,col 5)-(line 92,col 5)"
      ]
    }
  ]
}