{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/NodeIterators.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeIterators",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 290,
      "comment": "\n * A package for common iteration patterns.\n *\n * All iterators are forward, post-order traversals unless otherwise noted.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeIterators.NodeIterators()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "FunctionlessLocalScope",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 43,
      "end_line": 131,
      "comment": "\n   * Traverses the local scope, skipping all function nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ancestors"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.FunctionlessLocalScope(com.google.javascript.rhino.Node...)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "\n     * @param ancestors The ancestors of the point where iteration will start,\n     *     beginning with the deepest ancestor. The start node will not be\n     *     exposed in the iteration.\n     ",
      "child_ranges": [
        "(line 52,col 7)-(line 52,col 56)",
        "(line 54,col 7)-(line 60,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.hasNext()",
      "begin_line": 63,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 7)-(line 66,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.next()",
      "begin_line": 69,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 71,col 7)-(line 71,col 37)",
        "(line 72,col 7)-(line 97,col 7)",
        "(line 99,col 7)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.remove()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.current()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Gets the node most recently returned by next().\n     ",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.currentParent()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Gets the parent of the node most recently returned by next().\n     ",
      "child_ranges": [
        "(line 118,col 7)-(line 119,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.currentAncestors()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Gets the ancestors of the current node, with the deepest node first.\n     * Only exposed for testing purposes.\n     ",
      "child_ranges": [
        "(line 127,col 7)-(line 127,col 54)",
        "(line 128,col 7)-(line 128,col 32)",
        "(line 129,col 7)-(line 129,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalVarMotion",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 153,
      "end_line": 289,
      "comment": "\n   * An iterator to help with variable inlining. Given a variable declaration,\n   * find all the nodes in post-order where the variable is guaranteed to\n   * retain its original value.\n   *\n   * Consider:\n   * \u003cpre\u003e\n   * var X \u003d 1;\n   * var Y \u003d 3; // X is still 1\n   * if (Y) {\n   *   // X is still 1\n   * } else {\n   *   X \u003d 5;\n   * }\n   * // X may not be 1\n   * \u003c/pre\u003e\n   * In the above example, the iterator will iterate past the declaration of\n   * Y and into the first block of the IF branch, and will stop at the\n   * assignment {@code X \u003d 5}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "valueHasSideEffects"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varName"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lookAhead"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.forVar(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 173,
      "comment": "\n     * @return Create a LocalVarMotion for use with moving a value assigned\n     * at a variable declaration.\n     ",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 47)",
        "(line 166,col 7)-(line 166,col 61)",
        "(line 171,col 7)-(line 172,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.forAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * @return Create a LocalVarMotion for use with moving a value assigned\n     * as part of a simple assignment expression (\"a \u003d b;\").\n     ",
      "child_ranges": [
        "(line 181,col 7)-(line 181,col 53)",
        "(line 182,col 7)-(line 182,col 55)",
        "(line 185,col 7)-(line 186,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.LocalVarMotion(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope)",
      "begin_line": 193,
      "end_line": 201,
      "comment": "\n     * @param iterator The iterator to use while inspecting the node\n     *     beginning with the deepest ancestor.\n     ",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 53)",
        "(line 195,col 7)-(line 195,col 59)",
        "(line 196,col 7)-(line 196,col 42)",
        "(line 197,col 7)-(line 198,col 49)",
        "(line 199,col 7)-(line 199,col 31)",
        "(line 200,col 7)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.hasNext()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 7)-(line 205,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.next()",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 210,col 7)-(line 210,col 28)",
        "(line 211,col 7)-(line 211,col 30)",
        "(line 212,col 7)-(line 212,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.remove()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIterators.LocalVarMotion.advanceLookAhead(boolean)",
      "begin_line": 220,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 221,col 7)-(line 234,col 7)",
        "(line 236,col 7)-(line 239,col 7)",
        "(line 241,col 7)-(line 241,col 38)",
        "(line 242,col 7)-(line 242,col 49)",
        "(line 243,col 7)-(line 243,col 36)",
        "(line 245,col 7)-(line 273,col 7)",
        "(line 281,col 7)-(line 285,col 7)",
        "(line 287,col 7)-(line 287,col 27)"
      ]
    }
  ]
}