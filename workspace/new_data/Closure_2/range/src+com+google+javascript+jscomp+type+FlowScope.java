{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/type/FlowScope.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FlowScope",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e",
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 33,
      "end_line": 82,
      "comment": "\n * A symbol table for inferring types during data flow analysis.\n *\n * Each flow scope represents the types of all variables in the scope at\n * a particular point in the flow analysis.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.FlowScope.createChildFlowScope()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n   * Creates a child of this flow scope, to represent an instruction\n   * directly following this one.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.FlowScope.inferSlotType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n   * Defines the type of a symbol at this point in the flow.\n   * @throws IllegalArgumentException If no slot for this symbol exists.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.FlowScope.inferQualifiedSlot(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n   * Infer the type of a qualified name.\n   *\n   * When traversing the control flow of a function, simple names are\n   * declared at the bottom of the flow lattice. But there are far too many\n   * qualified names to be able to do this and be performant. So the bottoms\n   * of qualified names are declared lazily.\n   *\n   * Therefore, when inferring a qualified slot, we need both the \"bottom\"\n   * type of the slot when we enter the scope, and the current type being\n   * inferred.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.FlowScope.optimize()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * Optimize this scope and return a new FlowScope with faster lookup.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.FlowScope.findUniqueRefinedSlot(com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n   * Tries to find a unique refined variable in the refined scope, up to the\n   * the blind scope.\n   * @param blindScope The scope before the refinement, i.e. some parent of the\n   *     this scope or itself.\n   * @return The unique refined variable if found or null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.FlowScope.completeScope(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n   * Look through the given scope, and try to find slots where it doesn\u0027t\n   * have enough type information. Then fill in that type information\n   * with stuff that we\u0027ve inferred in the local flow.\n   ",
      "child_ranges": []
    }
  ]
}