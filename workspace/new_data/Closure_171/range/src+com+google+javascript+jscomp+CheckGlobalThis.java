{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckGlobalThis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckGlobalThis",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 56,
      "end_line": 201,
      "comment": "\n * Checks for certain uses of the {@code this} keyword that are considered\n * unsafe because they are likely to reference the global {@code this} object\n * unintentionally.\n *\n * \u003cp\u003eA use of {@code this} is considered unsafe if it\u0027s on the left side of an\n * assignment or a property access, and not inside one of the following:\n * \u003col\u003e\n * \u003cli\u003ea prototype method\n * \u003cli\u003ea function annotated with {@code @constructor}\n * \u003cli\u003ea function annotated with {@code @this}.\n * \u003cli\u003ea function where there\u0027s no logical place to put a\n *     {@code this} annotation.\n * \u003c/ol\u003e\n *\n * \u003cp\u003eNote that this check does not track assignments of {@code this} to\n * variables or objects. The code\n * \u003cpre\u003e\n * function evil() {\n *   var a \u003d this;\n *   a.useful \u003d undefined;\n * }\n * \u003c/pre\u003e\n * will not get flagged, even though it is semantically equivalent to\n * \u003cpre\u003e\n * function evil() {\n *   this.useful \u003d undefined;\n * }\n * \u003c/pre\u003e\n * which would get flagged.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_THIS"
      ],
      "begin_line": 58,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignLhsChild"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n   * If {@code assignLhsChild !\u003d null}, then the node being traversed is\n   * a descendant of the first child of an ASSIGN node. assignLhsChild\u0027s\n   * parent is this ASSIGN node.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckGlobalThis.CheckGlobalThis(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 79,
      "end_line": 151,
      "comment": "\n   * Since this pass reports errors only when a global {@code this} keyword\n   * is encountered, there is no reason to traverse non global contexts.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 121,col 5)",
        "(line 123,col 5)-(line 148,col 5)",
        "(line 150,col 5)-(line 150,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalThis.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 153,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 157,col 5)",
        "(line 158,col 5)-(line 160,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalThis.shouldReportThis(com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 32)",
        "(line 165,col 5)-(line 168,col 5)",
        "(line 171,col 5)-(line 171,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(com.google.javascript.rhino.Node)",
      "begin_line": 184,
      "end_line": 200,
      "comment": "\n   * Gets a function\u0027s JSDoc information, if it has any. Checks for a few\n   * patterns (ellipses show where JSDoc would be):\n   * \u003cpre\u003e\n   * ... function() {}\n   * ... x \u003d function() {};\n   * var ... x \u003d function() {};\n   * ... var x \u003d function() {};\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 39)",
        "(line 186,col 5)-(line 186,col 32)",
        "(line 187,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 17)"
      ]
    }
  ]
}