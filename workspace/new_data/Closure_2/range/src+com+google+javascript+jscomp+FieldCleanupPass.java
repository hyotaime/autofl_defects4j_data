{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/FieldCleanupPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldCleanupPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 36,
      "end_line": 126,
      "comment": "\n * A CleanupPass implementation that will remove all field declarations on\n * JSTypes contributed by the original file.\n * \u003cp\u003e\n * This pass is expected to clear out declarations contributed to any JSType,\n * even if the constructor declaration is not provided in the file being\n * updated.\n *\n * @author tylerg@google.com (Tyler Goodwin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.FieldCleanupPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 54)",
        "(line 47,col 5)-(line 48,col 78)",
        "(line 49,col 5)-(line 49,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "QualifiedNameSearchTraversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 80,
      "end_line": 125,
      "comment": "\n   * Search for fields to cleanup by looking for nodes in the tree which are\n   * root nodes of qualified names and getting the final token of the qualified\n   * name as a candidate field.\n   * \u003cp\u003e\n   * Once a candidate field is found, ask the {@code JSTypeRegistry} for all\n   * JSTypes that have a field with the same name, and check if the field on\n   * that type is defined in the file the compiler is cleaning up. If so, remove\n   * the field, and update the {@code JSTypeRegistry} to no longer associate the\n   * type with the field.\n   * \u003cp\u003e\n   * This algorithm was chosen for simplicity and is less than optimally\n   * efficient in two ways:\n   * \u003cp\u003e\n   * 1) All types with a matching field name are iterated over (when only types\n   * that extend or implement the JSType indicated by the containing object in\n   * the found Qualified Name need to be checked).\n   * \u003cp\u003e\n   * 2) All Qualified Names are checked, even those which are not L-Values or\n   * single declarations of an Type Expression. In general field should only be\n   * declared as part of an assignment (\u0027ns.Type.a \u003d 3;\u0027) or stand alone name\n   * declaration (\u0027ns.Type.a;\u0027).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "srcName"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.QualifiedNameSearchTraversal.QualifiedNameSearchTraversal(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 7)-(line 87,col 39)",
        "(line 88,col 7)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.QualifiedNameSearchTraversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 91,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 94,col 7)-(line 102,col 7)",
        "(line 103,col 7)-(line 105,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.QualifiedNameSearchTraversal.removeProperty(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Removes a given property from a type and updates type-registry.\n     *\n     * @param type the object type to be updated, should not be null\n     * @param propName the property to remove\n     ",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 50)",
        "(line 116,col 7)-(line 119,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FieldCleanupPass.QualifiedNameSearchTraversal.getFieldName(com.google.javascript.rhino.Node)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 42)"
      ]
    }
  ]
}