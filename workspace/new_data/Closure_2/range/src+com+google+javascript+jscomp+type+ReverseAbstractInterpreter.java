{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/type/ReverseAbstractInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReverseAbstractInterpreter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 43,
      "comment": "\n * This interface defines what reversed abstract interpreters provide.\n * \u003cp\u003eAbstract interpretation is the process of interpreting a program at an\n * abstracted level (such as at the type level) instead of the concrete level\n * (the flow of values). This reversed abstract interpreter reverses the\n * abstract interpretation process by knowing the outcome of some computation\n * and calculating a preciser view of the world than the view without knowing\n * the outcome of the computation.\u003c/p\u003e\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 41,
      "end_line": 42,
      "comment": "\n   * Calculates a precise version of the scope knowing the outcome of the\n   * condition.\n   *\n   *  @param condition the condition\u0027s expression\n   *  @param blindScope the scope without knowledge about the outcome of the\n   *  condition\n   *  @param outcome the outcome of the condition\n   ",
      "child_ranges": []
    }
  ]
}