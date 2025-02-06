{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckMissingReturn.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckMissingReturn",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 35,
      "end_line": 193,
      "comment": "\n * Checks functions for missing return statements. Return statements are only\n * expected for functions with return type information. Functions with empty\n * bodies are ignored.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_RETURN_STATEMENT"
      ],
      "begin_line": 37,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IS_RETURN"
      ],
      "begin_line": 45,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.Anonymous-dd7bc39d-42a2-46ae-be53-9ba88f927a98.apply(com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 7)-(line 50,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GOES_THROUGH_TRUE_CONDITION_PREDICATE"
      ],
      "begin_line": 55,
      "end_line": 80,
      "comment": " Skips all exception edges and impossible edges. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.Anonymous-8dc91657-44b5-4675-a7d5-6ae645531f24.apply(com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 58,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 61,col 7)-(line 61,col 39)",
        "(line 62,col 7)-(line 77,col 7)",
        "(line 78,col 7)-(line 78,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.CheckMissingReturn(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n   * @param level level of severity to report when a missing return statement\n   *     is discovered\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 29)",
        "(line 88,col 5)-(line 88,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 91,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 65)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 98,col 5)-(line 100,col 5)",
        "(line 102,col 5)-(line 107,col 62)",
        "(line 109,col 5)-(line 113,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.fastAllPathsReturnCheck(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n   * Fast check to see if all execution paths contain a return statement.\n   * May spuriously report that a return statement is missing.\n   *\n   * @return true if all paths return, converse not necessarily true\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 127,col 5)",
        "(line 128,col 5)-(line 128,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.explicitReturnExpected(com.google.javascript.rhino.Node)",
      "begin_line": 150,
      "end_line": 172,
      "comment": "\n   * Determines if the given scope should explicitly return. All functions\n   * with non-void or non-unknown return types must have explicit returns.\n   * @return If a return type is expected, returns it. Otherwise, returns null.\n   ",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 75)",
        "(line 153,col 5)-(line 155,col 5)",
        "(line 157,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 161,col 50)",
        "(line 163,col 5)-(line 165,col 5)",
        "(line 167,col 5)-(line 169,col 5)",
        "(line 171,col 5)-(line 171,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.isEmptyFunction(com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n   * @return {@code true} if function represents a JavaScript function\n   *     with an empty body\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 181,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingReturn.isVoidOrUnknown(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n   * @return {@code true} if returnType is void, unknown, or a union\n   *     containing void or unknown\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 190,col 73)",
        "(line 191,col 5)-(line 191,col 42)"
      ]
    }
  ]
}