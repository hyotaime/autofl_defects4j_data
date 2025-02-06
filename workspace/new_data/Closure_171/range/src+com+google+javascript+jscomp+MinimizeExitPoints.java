{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MinimizeExitPoints.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinimizeExitPoints",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 32,
      "end_line": 311,
      "comment": "\n * Transform the structure of the AST so that the number of explicit exits\n * are minimized.\n *\n * @author johnlenz@google.com (John Lenz)\n "
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
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.MinimizeExitPoints(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 78,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 109,
      "end_line": 200,
      "comment": "\n   * Attempts to minimize the number of explicit exit points in a control\n   * structure to take advantage of the implied exit at the end of the\n   * structure.  This is accomplished by removing redundant statements, and\n   * moving statements following a qualifying IF node into that node.\n   * For example:\n   *\n   * function () {\n   *   if (x) return;\n   *   else blah();\n   *   foo();\n   * }\n   *\n   * becomes:\n   *\n   * function () {\n   *  if (x) ;\n   *  else {\n   *    blah();\n   *    foo();\n   *  }\n   *\n   * @param n The execution node of a parent to inspect.\n   * @param exitType The type of exit to look for.\n   * @param labelName If parent is a label the name of the label to look for,\n   *   null otherwise.\n   * @nullable labelName non-null only for breaks within labels.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 116,col 5)",
        "(line 119,col 5)-(line 127,col 5)",
        "(line 130,col 5)-(line 144,col 5)",
        "(line 147,col 5)-(line 150,col 5)",
        "(line 155,col 5)-(line 157,col 5)",
        "(line 163,col 5)-(line 189,col 5)",
        "(line 193,col 5)-(line 199,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 215,
      "end_line": 262,
      "comment": "\n   * Look for exits (returns, breaks, or continues, depending on the context) at\n   * the end of a block and removes them by moving the if node\u0027s siblings,\n   * if any, into the opposite condition block.\n   *\n   * @param srcBlock The block to inspect.\n   * @param destBlock The block to move sibling nodes into.\n   * @param ifNode The if node to work with.\n   * @param exitType The type of exit to look for.\n   * @param labelName The name associated with the exit, if any.\n   * @nullable labelName null for anything excepted for named-break associated\n   *           with a label.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 31)",
        "(line 218,col 5)-(line 218,col 25)",
        "(line 221,col 5)-(line 231,col 5)",
        "(line 234,col 5)-(line 236,col 5)",
        "(line 239,col 5)-(line 261,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 275,
      "end_line": 290,
      "comment": "\n   * Determines if n matches the type and name for the following types of\n   * \"exits\":\n   *    - return without values\n   *    - continues and breaks with or without names.\n   * @param n The node to inspect.\n   * @param type The Token type to look for.\n   * @param labelName The name that must be associated with the exit type.\n   * @nullable labelName non-null only for breaks associated with labels.\n   * @return Whether the node matches the specified block-exit type.\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 288,col 5)",
        "(line 289,col 5)-(line 289,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 299,
      "end_line": 310,
      "comment": "\n   * Move all the child nodes following start in srcParent to the end of\n   * destParent\u0027s child list.\n   * @param start The start point in the srcParent child list.\n   * @param srcParent The parent node of start.\n   * @param destParent The destination node.\n   ",
      "child_ranges": [
        "(line 301,col 5)-(line 309,col 5)"
      ]
    }
  ]
}