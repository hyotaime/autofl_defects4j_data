{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ReplaceCssNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceCssNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 83,
      "end_line": 263,
      "comment": "\n * ReplaceCssNames replaces occurrences of goog.getCssName(\u0027foo\u0027) with\n * a shorter version from the passed in renaming map. There are two\n * styles of operation: for \u0027BY_WHOLE\u0027 we look up the whole string in the\n * renaming map. For \u0027BY_PART\u0027, all the class name\u0027s components,\n * separated by \u0027-\u0027, are renamed individually and then recombined.\n *\n * Given the renaming map:\n *   {\n *     once:  \u0027a\u0027,\n *     upon:  \u0027b\u0027,\n *     atime: \u0027c\u0027,\n *     long:  \u0027d\u0027,\n *     time:  \u0027e\u0027,\n *     ago:   \u0027f\u0027\n *   }\n *\n * The following outputs are expected with the \u0027BY_PART\u0027 renaming style:\n *\n * goog.getCssName(\u0027once\u0027) -\u003e \u0027a\u0027\n * goog.getCssName(\u0027once-upon-atime\u0027) -\u003e \u0027a-b-c\u0027\n *\n * var baseClass \u003d goog.getCssName(\u0027long-time\u0027);\n * el.className \u003d goog.getCssName(baseClass, \u0027ago\u0027);\n * -\u003e\n * var baseClass \u003d \u0027d-e\u0027;\n * el.className \u003d baseClass + \u0027-f\u0027;\n *\n * However if we have the following renaming map with the \u0027BY_WHOLE\u0027 renaming style:\n *   {\n *     once: \u0027a\u0027,\n *     upon-atime: \u0027b\u0027,\n *     long-time: \u0027c\u0027,\n *     ago: \u0027d\u0027\n *   }\n *\n * Then we would expect:\n *\n * goog.getCssName(\u0027once\u0027) -\u003e \u0027a\u0027\n *\n * var baseClass \u003d goog.getCssName(\u0027long-time\u0027);\n * el.className \u003d goog.getCssName(baseClass, \u0027ago\u0027);\n * -\u003e\n * var baseClass \u003d \u0027c\u0027;\n * el.className \u003d baseClass + \u0027-d\u0027;\n *\n * In addition, the CSS names before replacement can optionally be gathered.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "GET_CSS_NAME_FUNCTION"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_NUM_ARGUMENTS_ERROR"
      ],
      "begin_line": 87,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_LITERAL_EXPECTED_ERROR"
      ],
      "begin_line": 91,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNEXPECTED_STRING_LITERAL_ERROR"
      ],
      "begin_line": 96,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_SYMBOL_WARNING"
      ],
      "begin_line": 102,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cssNames"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "symbolMap"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nativeStringType"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceCssNames.ReplaceCssNames(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 118,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 29)",
        "(line 122,col 5)-(line 122,col 29)",
        "(line 123,col 5)-(line 123,col 31)",
        "(line 124,col 5)-(line 125,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 36)",
        "(line 135,col 5)-(line 135,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNames.getCssRenamingMap()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Traversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 143,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNames.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 145,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 195,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceCssNames.Traversal.processStringNode(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 209,
      "end_line": 260,
      "comment": "\n     * Processes a string argument to goog.getCssName().  The string will be\n     * renamed based off the symbol map.  If there is no map or any part of the\n     * name can\u0027t be renamed, a warning is reported to the compiler and the node\n     * is left unchanged.\n     *\n     * If the type is unexpected then an error is reported to the compiler.\n     *\n     * @param t The node traversal.\n     * @param n The string node to process.\n     ",
      "child_ranges": [
        "(line 210,col 7)-(line 210,col 34)",
        "(line 211,col 7)-(line 215,col 7)",
        "(line 216,col 7)-(line 216,col 39)",
        "(line 217,col 7)-(line 247,col 7)",
        "(line 248,col 7)-(line 259,col 7)"
      ]
    }
  ]
}