{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RemoveUnusedNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveUnusedNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 31,
      "end_line": 76,
      "comment": "\n * Removes unused names.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
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
      "type": "field",
      "varNames": [
        "canModifyExterns"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedNames.RemoveUnusedNames(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n   * Creates a new pass for removing unused prototype properties, based\n   * on the uniqueness of property names.\n   * @param compiler The compiler.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 29)",
        "(line 48,col 5)-(line 48,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 54,col 44)",
        "(line 55,col 5)-(line 55,col 39)",
        "(line 56,col 5)-(line 56,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedNames.removeUnusedProperties(com.google.javascript.jscomp.NameReferenceGraph)",
      "begin_line": 63,
      "end_line": 75,
      "comment": "\n   * Remove all properties under a given name if the property name is\n   * never referenced.\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 74,col 5)"
      ]
    }
  ]
}