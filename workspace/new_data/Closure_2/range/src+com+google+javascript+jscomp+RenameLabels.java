{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RenameLabels.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameLabels",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 71,
      "end_line": 278,
      "comment": "\n * RenameLabels renames all the labels so that they have short names, to reduce\n * code size and also to obfuscate the code.\n *\n * Label names have a unique namespace, so variable or function names clashes\n * are not a concern, but keywords clashes are.\n *\n * Additionally, labels names are only within the statements include in the\n * label and do not cross function boundaries. This means that it is possible to\n * create one label name that is used for labels at any given depth of label\n * nesting. Typically, the name \"a\" will be used for all top-level labels, \"b\"\n * for the next nested label, and so on. For example:\n *\n * \u003ccode\u003e\n * function bar() {\n *   a: {\n *     b: {\n *       foo();\n *     }\n *   }\n *\n *   a: {\n *     b: break a;\n *   }\n * }\n * \u003c/code\u003e\n *\n * The general processes is as follows: process() is the entry point for the\n * CompilerPass, and from there a standard \"ScopedCallback\" traversal is done,\n * where \"shouldTraverse\" is called when descending the tree, and the \"visit\" is\n * called in a depth first manner. The name for the label is selected during the\n * decent in \"shouldTraverse\", and the references to the label name are renamed\n * as they are encountered during the \"visit\". This means that if the label is\n * unreferenced, it is known when the label node is visited, and, if so, can be\n * safely removed.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameSupplier"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeUnused"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.RenameLabels(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.RenameLabels(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 29)",
        "(line 85,col 5)-(line 85,col 33)",
        "(line 86,col 5)-(line 86,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultNameSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Supplier\u003cjava.lang.String\u003e"
      ],
      "begin_line": 89,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " NameGenerator is used to create safe label names."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier.get()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 7)-(line 96,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessLabels",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 103,
      "end_line": 255,
      "comment": "\n   * Iterate through the nodes, renaming all the labels.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.ProcessLabels()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "namespaceStack"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " inner scope, so a new namespace is created each time a scope is entered."
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " the second \"b\", etc."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 7)-(line 127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 136,
      "end_line": 160,
      "comment": "\n     * shouldTraverse is call when descending into the Node tree, so it is used\n     * here to build the context for label renames.\n     *\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 7)-(line 157,col 7)",
        "(line 159,col 7)-(line 159,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 180,
      "comment": "\n     * Delegate the actual processing of the node to visitLabel and\n     * visitBreakOrContinue.\n     *\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 170,col 7)-(line 179,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.visitBreakOrContinue(com.google.javascript.rhino.Node)",
      "begin_line": 186,
      "end_line": 204,
      "comment": "\n     * Rename label references in breaks and continues.\n     * @param node The break or continue node.\n     ",
      "child_ranges": [
        "(line 187,col 7)-(line 187,col 43)",
        "(line 188,col 7)-(line 203,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.visitLabel(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 211,
      "end_line": 237,
      "comment": "\n     * Rename or remove labels.\n     * @param node  The label node.\n     * @param parent The parent of the label node.\n     ",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 43)",
        "(line 213,col 7)-(line 213,col 49)",
        "(line 214,col 7)-(line 214,col 41)",
        "(line 215,col 7)-(line 215,col 40)",
        "(line 217,col 7)-(line 233,col 7)",
        "(line 236,col 7)-(line 236,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.getNameForId(int)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * @param id The id, which is the depth of the label in the current context,\n     *        for which to get a short name.\n     * @return The short name of the identified label.\n     ",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.getLabelInfo(java.lang.String)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * @param name The name to retrieve information about.\n     * @return The structure representing the name in the current context.\n     ",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 257,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 264,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.LabelInfo.LabelInfo(int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 7)-(line 269,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelNamespace",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 274,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameMap"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    }
  ]
}