{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckGlobalNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckGlobalNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 34,
      "end_line": 288,
      "comment": "\n * Checks references to undefined properties of global variables.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
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
        "convention"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "objectPrototypeProps"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionPrototypeProps"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_NAME_WARNING"
      ],
      "begin_line": 45,
      "end_line": 47,
      "comment": " Warnings"
    },
    {
      "type": "field",
      "varNames": [
        "NAME_DEFINED_LATE_WARNING"
      ],
      "begin_line": 49,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRICT_MODULE_DEP_QNAME"
      ],
      "begin_line": 54,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.CheckGlobalNames(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n   * Creates a pass to check global name references at the given warning level.\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 29)",
        "(line 65,col 5)-(line 65,col 53)",
        "(line 66,col 5)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.injectNamespace(com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n   * Injects a pre-computed global namespace, so that the same namespace\n   * can be re-used for multiple check passes. Returns this for easy chaining.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 60)",
        "(line 75,col 5)-(line 75,col 31)",
        "(line 76,col 5)-(line 76,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 79,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 5)",
        "(line 86,col 5)-(line 86,col 57)",
        "(line 87,col 5)-(line 87,col 55)",
        "(line 88,col 5)-(line 88,col 59)",
        "(line 89,col 5)-(line 90,col 54)",
        "(line 92,col 5)-(line 103,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.findPrototypeProps(java.lang.String, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 106,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 40)",
        "(line 108,col 5)-(line 117,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.checkDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 128,
      "end_line": 145,
      "comment": "\n   * Checks to make sure all the descendants of a name are defined if they\n   * are referenced.\n   *\n   * @param name A global name.\n   * @param nameIsDefined If true, {@code name} is defined. Otherwise, it\u0027s\n   *    undefined, and any references to descendant names should emit warnings.\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 144,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.validateName(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 147,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 44)",
        "(line 151,col 5)-(line 151,col 30)",
        "(line 153,col 5)-(line 153,col 58)",
        "(line 154,col 5)-(line 194,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.isTypedef(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 197,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 39)",
        "(line 200,col 5)-(line 205,col 5)",
        "(line 206,col 5)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.reportBadModuleReference(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 209,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 214,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.reportRefToUndefinedName(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 217,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 226,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckGlobalNames.propertyMustBeInitializedByFullName(com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 233,
      "end_line": 287,
      "comment": "\n   * Checks whether the given name is a property, and whether that property\n   * must be initialized with its full qualified name.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 246,col 5)",
        "(line 248,col 5)-(line 248,col 36)",
        "(line 249,col 5)-(line 266,col 5)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 272,col 5)-(line 274,col 5)",
        "(line 276,col 5)-(line 278,col 5)",
        "(line 280,col 5)-(line 284,col 5)",
        "(line 286,col 5)-(line 286,col 17)"
      ]
    }
  ]
}