{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/StaticSlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StaticSlot",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 72,
      "comment": "\n * The {@code StaticSlot} interface must be implemented by variables that can\n * appear as members of a {@code StaticScope}.\n *\n * @param \u003cT\u003e The type of information stored about the slot\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSlot.getName()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n   * Gets the name of the slot.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSlot.getType()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n   * Returns the type information, if any, for this slot.\n   * @return The type or {@code null} if no type is declared for it.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSlot.isTypeInferred()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * Returns whether the type has been inferred (as opposed to declared).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSlot.getDeclaration()",
      "begin_line": 68,
      "end_line": 68,
      "comment": " Gets the declaration of this symbol. May not exist. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSlot.getJSDocInfo()",
      "begin_line": 71,
      "end_line": 71,
      "comment": " Gets the JSDoc for this slot. ",
      "child_ranges": []
    }
  ]
}