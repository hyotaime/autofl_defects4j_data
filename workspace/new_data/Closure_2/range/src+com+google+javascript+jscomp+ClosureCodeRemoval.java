{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ClosureCodeRemoval.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureCodeRemoval",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 229,
      "comment": "\n * \u003cp\u003eCompiler pass that removes Closure-specific code patterns.\u003c/p\u003e\n *\n * \u003cp\u003eCurrently does the following:\u003c/p\u003e\n *\n * \u003cul\u003e\n *   \u003cli\u003e Instead of setting abstract methods to a function that throws an\n *        informative error, this pass allows some binary size reduction by\n *        removing these methods altogether for production builds.\u003c/li\u003e\n *   \u003cli\u003e Remove calls to assertion functions (like goog.asserts.assert).\n *        If the return value of the assertion function is used, then\n *        the first argument (the asserted value) will be directly inlined.\n *        Otherwise, the entire call will be removed. It is well-known that\n *        this is not provably safe, much like the equivalent assert\n *        statement in Java.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @author robbyw@google.com (Robby Walker)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Reference to the JS compiler "
    },
    {
      "type": "field",
      "varNames": [
        "ABSTRACT_METHOD_NAME"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Name used to denote an abstract function "
    },
    {
      "type": "field",
      "varNames": [
        "removeAbstractMethods"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeAssertionCalls"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "abstractMethodAssignmentNodes"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n   * List of names referenced in successive generations of finding referenced\n   * nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assertionCalls"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n   * List of assertion functions.\n   "
    },
    {
      "type": "class_interface",
      "name": "RemovableAssignment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 133,
      "comment": "\n   * Utility class to track a node and its parent.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The node\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Its parent\n     "
    },
    {
      "type": "field",
      "varNames": [
        "assignAncestors"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Full chain of ASSIGN ancestors\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastAncestor"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * The last ancestor\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.RemovableAssignment.RemovableAssignment(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 102,
      "end_line": 114,
      "comment": "\n     * Data structure for information about a removable assignment.\n     *\n     * @param nameNode The LHS\n     * @param assignNode The parent ASSIGN node\n     * @param traversal Access to further levels, assumed to start at 1\n     ",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 27)",
        "(line 105,col 7)-(line 105,col 31)",
        "(line 107,col 7)-(line 107,col 33)",
        "(line 108,col 7)-(line 112,col 59)",
        "(line 113,col 7)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.RemovableAssignment.remove()",
      "begin_line": 119,
      "end_line": 132,
      "comment": "\n     * Remove this node.\n     ",
      "child_ranges": [
        "(line 120,col 7)-(line 120,col 32)",
        "(line 121,col 7)-(line 121,col 25)",
        "(line 122,col 7)-(line 130,col 7)",
        "(line 131,col 7)-(line 131,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindAbstractMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 138,
      "end_line": 153,
      "comment": "\n   * Identifies all assignments of the abstract method to a variable.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.FindAbstractMethods.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 139,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 141,col 7)-(line 151,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindAssertionCalls",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 159,
      "end_line": 179,
      "comment": "\n   * Identifies all assertion calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assertionNames"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.FindAssertionCalls.FindAssertionCalls()",
      "begin_line": 162,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 166,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.FindAssertionCalls.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 170,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 172,col 7)-(line 177,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.ClosureCodeRemoval(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 189,
      "end_line": 194,
      "comment": "\n   * Creates a Closure code remover.\n   *\n   * @param compiler The AbstractCompiler\n   * @param removeAbstractMethods Remove declarations of abstract methods.\n   * @param removeAssertionCalls Remove calls to goog.assert functions.\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 29)",
        "(line 192,col 5)-(line 192,col 55)",
        "(line 193,col 5)-(line 193,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureCodeRemoval.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 196,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 49)",
        "(line 199,col 5)-(line 201,col 5)",
        "(line 202,col 5)-(line 204,col 5)",
        "(line 205,col 5)-(line 205,col 58)",
        "(line 207,col 5)-(line 209,col 5)",
        "(line 211,col 5)-(line 227,col 5)"
      ]
    }
  ]
}