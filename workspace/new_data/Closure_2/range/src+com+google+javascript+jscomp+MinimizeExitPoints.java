{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/MinimizeExitPoints.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinimizeExitPoints",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 36,
      "end_line": 323,
      "comment": "\n * Transform the structure of the AST so that the number of explicit exits\n * are minimized.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.MinimizeExitPoints(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 83,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 114,
      "end_line": 205,
      "comment": "\n   * Attempts to minimize the number of explicit exit points in a control\n   * structure to take advantage of the implied exit at the end of the\n   * structure.  This is accomplished by removing redundant statements, and\n   * moving statements following a qualifying IF node into that node.\n   * For example:\n   *\n   * function () {\n   *   if (x) return;\n   *   else blah();\n   *   foo();\n   * }\n   *\n   * becomes:\n   *\n   * function () {\n   *  if (x) ;\n   *  else {\n   *    blah();\n   *    foo();\n   *  }\n   *\n   * @param n The execution node of a parent to inspect.\n   * @param exitType The type of exit to look for.\n   * @param labelName If parent is a label the name of the label to look for,\n   *   null otherwise.\n   * @nullable labelName non-null only for breaks within labels.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 121,col 5)",
        "(line 124,col 5)-(line 132,col 5)",
        "(line 135,col 5)-(line 149,col 5)",
        "(line 152,col 5)-(line 155,col 5)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 168,col 5)-(line 194,col 5)",
        "(line 198,col 5)-(line 204,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 220,
      "end_line": 271,
      "comment": "\n   * Look for exits (returns, breaks, or continues, depending on the context) at\n   * the end of a block and removes them by moving the if node\u0027s siblings,\n   * if any, into the opposite condition block.\n   *\n   * @param srcBlock The block to inspect.\n   * @param destBlock The block to move sibling nodes into.\n   * @param ifNode The if node to work with.\n   * @param exitType The type of exit to look for.\n   * @param labelName The name associated with the exit, if any.\n   * @nullable labelName null for anything excepted for named-break associated\n   *           with a label.\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 31)",
        "(line 223,col 5)-(line 223,col 25)",
        "(line 226,col 5)-(line 236,col 5)",
        "(line 239,col 5)-(line 241,col 5)",
        "(line 244,col 5)-(line 265,col 5)",
        "(line 268,col 5)-(line 268,col 51)",
        "(line 270,col 5)-(line 270,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 284,
      "end_line": 299,
      "comment": "\n   * Determines if n matches the type and name for the following types of\n   * \"exits\":\n   *    - return without values\n   *    - continues and breaks with or without names.\n   * @param n The node to inspect.\n   * @param type The Token type to look for.\n   * @param labelName The name that must be associated with the exit type.\n   * @nullable labelName non-null only for breaks associated with labels.\n   * @return Whether the node matches the specified block-exit type.\n   ",
      "child_ranges": [
        "(line 285,col 5)-(line 297,col 5)",
        "(line 298,col 5)-(line 298,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 308,
      "end_line": 322,
      "comment": "\n   * Move all the child nodes following start in srcParent to the end of\n   * destParent\u0027s child list.\n   * @param start The start point in the srcParent child list.\n   * @param srcParent The parent node of start.\n   * @param destParent The destination node.\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 321,col 5)"
      ]
    }
  ]
}