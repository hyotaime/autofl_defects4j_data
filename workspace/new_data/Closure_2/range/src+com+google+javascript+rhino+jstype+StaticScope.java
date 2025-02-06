{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/StaticScope.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StaticScope",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 76,
      "comment": "\n * The {@code StaticScope} interface must be implemented by any object that\n * defines variables for the purposes of static analysis.  It is distinguished\n * from the {@code Scriptable} class that Rhino normally uses to represent a\n * run-time scope.\n *\n * @param \u003cT\u003e The type of information stored about the slot\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticScope.getRootNode()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n   * Returns the root node associated with this scope. May be null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticScope.getParentScope()",
      "begin_line": 59,
      "end_line": 59,
      "comment": " Returns the scope enclosing this one or null if none. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticScope.getSlot(java.lang.String)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n   * Returns any defined slot within this scope for this name.  This call\n   * continues searching through parent scopes if a slot with this name is not\n   * found in the current scope.\n   * @param name The name of the variable slot to look up.\n   * @return The defined slot for the variable, or {@code null} if no\n   *         definition exists.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticScope.getOwnSlot(java.lang.String)",
      "begin_line": 72,
      "end_line": 72,
      "comment": " Like {@code getSlot} but does not recurse into parent scopes. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticScope.getTypeOfThis()",
      "begin_line": 75,
      "end_line": 75,
      "comment": " Returns the expected type of {@code this} in the current scope. ",
      "child_ranges": []
    }
  ]
}