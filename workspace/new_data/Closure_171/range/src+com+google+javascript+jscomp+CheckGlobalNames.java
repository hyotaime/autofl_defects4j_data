{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckGlobalNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckGlobalNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 33,
      "end_line": 287,
      "comment": "\n * Checks references to undefined properties of global variables.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "objectPrototypeProps"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionPrototypeProps"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_NAME_WARNING"
      ],
      "begin_line": 44,
      "end_line": 46,
      "comment": " Warnings"
    },
    {
      "type": "field",
      "varNames": [
        "NAME_DEFINED_LATE_WARNING"
      ],
      "begin_line": 48,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRICT_MODULE_DEP_QNAME"
      ],
      "begin_line": 53,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.CheckGlobalNames(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n   * Creates a pass to check global name references at the given warning level.\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 29)",
        "(line 64,col 5)-(line 64,col 53)",
        "(line 65,col 5)-(line 65,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.injectNamespace(com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n   * Injects a pre-computed global namespace, so that the same namespace\n   * can be re-used for multiple check passes. Returns this for easy chaining.\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 60)",
        "(line 74,col 5)-(line 74,col 31)",
        "(line 75,col 5)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 82,col 5)",
        "(line 85,col 5)-(line 85,col 57)",
        "(line 86,col 5)-(line 86,col 55)",
        "(line 87,col 5)-(line 87,col 59)",
        "(line 88,col 5)-(line 89,col 54)",
        "(line 91,col 5)-(line 102,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.findPrototypeProps(java.lang.String, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 105,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 40)",
        "(line 107,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.checkDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 127,
      "end_line": 144,
      "comment": "\n   * Checks to make sure all the descendants of a name are defined if they\n   * are referenced.\n   *\n   * @param name A global name.\n   * @param nameIsDefined If true, {@code name} is defined. Otherwise, it\u0027s\n   *    undefined, and any references to descendant names should emit warnings.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.validateName(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 146,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 44)",
        "(line 150,col 5)-(line 150,col 30)",
        "(line 152,col 5)-(line 152,col 58)",
        "(line 153,col 5)-(line 193,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.isTypedef(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 196,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 39)",
        "(line 199,col 5)-(line 204,col 5)",
        "(line 205,col 5)-(line 205,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.reportBadModuleReference(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.reportRefToUndefinedName(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 216,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 221,col 5)",
        "(line 223,col 5)-(line 225,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.propertyMustBeInitializedByFullName(com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 232,
      "end_line": 286,
      "comment": "\n   * Checks whether the given name is a property, and whether that property\n   * must be initialized with its full qualified name.\n   ",
      "child_ranges": [
        "(line 243,col 5)-(line 245,col 5)",
        "(line 247,col 5)-(line 247,col 36)",
        "(line 248,col 5)-(line 265,col 5)",
        "(line 267,col 5)-(line 269,col 5)",
        "(line 271,col 5)-(line 273,col 5)",
        "(line 275,col 5)-(line 277,col 5)",
        "(line 279,col 5)-(line 283,col 5)",
        "(line 285,col 5)-(line 285,col 17)"
      ]
    }
  ]
}