{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RemoveUnusedPrototypeProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveUnusedPrototypeProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SpecializationAwareCompilerPass"
      ],
      "begin_line": 34,
      "end_line": 140,
      "comment": "\n * Removes unused properties from prototypes.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
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
      "type": "field",
      "varNames": [
        "canModifyExterns"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anchorUnusedVars"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.RemoveUnusedPrototypeProperties(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n   * Creates a new pass for removing unused prototype properties, based\n   * on the uniqueness of property names.\n   * @param compiler The compiler.\n   * @param canModifyExterns If true, then we can remove prototype\n   *     properties that are declared in the externs file.\n   * @param anchorUnusedVars If true, then we must keep unused variables\n   *     and the prototype properties they reference, even if they are\n   *     never used.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 29)",
        "(line 59,col 5)-(line 59,col 45)",
        "(line 60,col 5)-(line 60,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 72,col 76)",
        "(line 73,col 5)-(line 73,col 39)",
        "(line 74,col 5)-(line 74,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.removeUnusedSymbols(java.util.Collection\u003ccom.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo\u003e)",
      "begin_line": 81,
      "end_line": 106,
      "comment": "\n   * Remove all properties under a given name if the property name is\n   * never referenced.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 105,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.getSpecializableFunctionFromSymbol(com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol)",
      "begin_line": 111,
      "end_line": 139,
      "comment": "\n   * Attempts to find a specializable function from the Symbol.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 52)",
        "(line 114,col 5)-(line 114,col 38)",
        "(line 116,col 5)-(line 131,col 5)",
        "(line 133,col 5)-(line 138,col 5)"
      ]
    }
  ]
}