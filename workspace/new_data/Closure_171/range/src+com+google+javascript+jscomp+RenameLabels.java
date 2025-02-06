{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RenameLabels.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameLabels",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 70,
      "end_line": 289,
      "comment": "\n * RenameLabels renames all the labels so that they have short names, to reduce\n * code size and also to obfuscate the code.\n *\n * Label names have a unique namespace, so variable or function names clashes\n * are not a concern, but keywords clashes are.\n *\n * Additionally, labels names are only within the statements include in the\n * label and do not cross function boundaries. This means that it is possible to\n * create one label name that is used for labels at any given depth of label\n * nesting. Typically, the name \"a\" will be used for all top-level labels, \"b\"\n * for the next nested label, and so on. For example:\n *\n * \u003ccode\u003e\n * function bar() {\n *   a: {\n *     b: {\n *       foo();\n *     }\n *   }\n *\n *   a: {\n *     b: break a;\n *   }\n * }\n * \u003c/code\u003e\n *\n * The general processes is as follows: process() is the entry point for the\n * CompilerPass, and from there a standard \"ScopedCallback\" traversal is done,\n * where \"shouldTraverse\" is called when descending the tree, and the \"visit\" is\n * called in a depth first manner. The name for the label is selected during the\n * decent in \"shouldTraverse\", and the references to the label name are renamed\n * as they are encountered during the \"visit\". This means that if the label is\n * unreferenced, it is known when the label node is visited, and, if so, can be\n * safely removed.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameSupplier"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeUnused"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.RenameLabels(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.RenameLabels(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NameGenerator)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 59)",
        "(line 81,col 5)-(line 81,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.RenameLabels(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 29)",
        "(line 89,col 5)-(line 89,col 33)",
        "(line 90,col 5)-(line 90,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultNameSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Supplier\u003cjava.lang.String\u003e"
      ],
      "begin_line": 93,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " NameGenerator is used to create safe label names."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier.DefaultNameSupplier(com.google.javascript.jscomp.NameGenerator)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier.DefaultNameSupplier()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier.get()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessLabels",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 114,
      "end_line": 266,
      "comment": "\n   * Iterate through the nodes, renaming all the labels.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.ProcessLabels()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 7)-(line 118,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "namespaceStack"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " inner scope, so a new namespace is created each time a scope is entered."
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " the second \"b\", etc."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 147,
      "end_line": 171,
      "comment": "\n     * shouldTraverse is call when descending into the Node tree, so it is used\n     * here to build the context for label renames.\n     *\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 7)-(line 168,col 7)",
        "(line 170,col 7)-(line 170,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 191,
      "comment": "\n     * Delegate the actual processing of the node to visitLabel and\n     * visitBreakOrContinue.\n     *\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 181,col 7)-(line 190,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.visitBreakOrContinue(com.google.javascript.rhino.Node)",
      "begin_line": 197,
      "end_line": 215,
      "comment": "\n     * Rename label references in breaks and continues.\n     * @param node The break or continue node.\n     ",
      "child_ranges": [
        "(line 198,col 7)-(line 198,col 43)",
        "(line 199,col 7)-(line 214,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.visitLabel(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 222,
      "end_line": 248,
      "comment": "\n     * Rename or remove labels.\n     * @param node  The label node.\n     * @param parent The parent of the label node.\n     ",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 43)",
        "(line 224,col 7)-(line 224,col 49)",
        "(line 225,col 7)-(line 225,col 41)",
        "(line 226,col 7)-(line 226,col 40)",
        "(line 228,col 7)-(line 244,col 7)",
        "(line 247,col 7)-(line 247,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.getNameForId(int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * @param id The id, which is the depth of the label in the current context,\n     *        for which to get a short name.\n     * @return The short name of the identified label.\n     ",
      "child_ranges": [
        "(line 256,col 7)-(line 256,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.ProcessLabels.getLabelInfo(java.lang.String)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * @param name The name to retrieve information about.\n     * @return The structure representing the name in the current context.\n     ",
      "child_ranges": [
        "(line 264,col 7)-(line 264,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLabels.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 268,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 275,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameLabels.LabelInfo.LabelInfo(int)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelNamespace",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 285,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameMap"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    }
  ]
}