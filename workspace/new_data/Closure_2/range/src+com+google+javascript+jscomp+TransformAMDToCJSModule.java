{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TransformAMDToCJSModule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformAMDToCJSModule",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 302,
      "comment": "\n * Rewrites an AMD module https://github.com/amdjs/amdjs-api/wiki/AMD to a\n * CommonJS module. See {@link ProcessCommonJSModules} for follow up processing\n * step.\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSUPPORTED_DEFINE_SIGNATURE_ERROR"
      ],
      "begin_line": 32,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_TOP_LEVEL_STATEMENT_DEFINE_ERROR"
      ],
      "begin_line": 39,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REQUIREJS_PLUGINS_NOT_SUPPORTED_WARNING"
      ],
      "begin_line": 43,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_RENAME_SUFFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameIndex"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDToCJSModule(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.unsupportedDefineError(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.isVirtualModuleName(java.lang.String)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n   * The modules \"exports\", \"require\" and \"module\" are virtual in terms of\n   * existing implicitly in CommonJS.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 73,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformAMDModulesCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 80,
      "end_line": 260,
      "comment": "\n   * Rewrites calls to define which has to be in void context just below the\n   * current script node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 84,col 7)-(line 132,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handleDefineObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * When define is called with an object literal, assign it to exports and\n     * we\u0027re done.\n     ",
      "child_ranges": [
        "(line 141,col 7)-(line 141,col 53)",
        "(line 142,col 7)-(line 144,col 55)",
        "(line 145,col 7)-(line 145,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handleRequiresAndParamList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 152,
      "end_line": 163,
      "comment": "\n     * Rewrites the required modules to\n     * \u003ccode\u003evar nameInParamList \u003d require(\"nameFromRequireList\");\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 154,col 7)-(line 155,col 21)",
        "(line 156,col 7)-(line 157,col 79)",
        "(line 158,col 7)-(line 162,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handleRequire(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 218,
      "comment": "\n     * Rewrite a single require call.\n     ",
      "child_ranges": [
        "(line 170,col 7)-(line 170,col 31)",
        "(line 171,col 7)-(line 173,col 7)",
        "(line 175,col 7)-(line 177,col 7)",
        "(line 179,col 7)-(line 179,col 74)",
        "(line 180,col 7)-(line 180,col 39)",
        "(line 181,col 7)-(line 193,col 7)",
        "(line 195,col 7)-(line 195,col 23)",
        "(line 196,col 7)-(line 214,col 7)",
        "(line 216,col 7)-(line 217,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handlePlugins(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 227,
      "end_line": 242,
      "comment": "\n     * Require.js supports a range of plugins that are hard to support\n     * statically. Generally none are supported right now with the\n     * exception of a simple hack to support condition loading. This\n     * was added to make compilation of Dojo work better but will\n     * probably break, so just don\u0027t use them :)\n     ",
      "child_ranges": [
        "(line 229,col 7)-(line 240,col 7)",
        "(line 241,col 7)-(line 241,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.moveCallbackContentToTopLevel(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 248,
      "end_line": 259,
      "comment": "\n     * Moves the statements in the callback to be direct children of the\n     * current script.\n     ",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 58)",
        "(line 251,col 7)-(line 251,col 39)",
        "(line 252,col 7)-(line 252,col 59)",
        "(line 253,col 7)-(line 253,col 53)",
        "(line 254,col 7)-(line 256,col 7)",
        "(line 257,col 7)-(line 257,col 43)",
        "(line 258,col 7)-(line 258,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefineCallbackReturnCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 266,
      "end_line": 279,
      "comment": "\n   * Rewrites the return statement of the callback to be an assignment to\n   * module.exports.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.DefineCallbackReturnCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 268,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 270,col 7)-(line 277,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RenameCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 284,
      "end_line": 301,
      "comment": "\n   * Renames names;\n   "
    },
    {
      "type": "field",
      "varNames": [
        "from"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "to"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.RenameCallback.RenameCallback(java.lang.String, java.lang.String)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 290,col 7)-(line 290,col 23)",
        "(line 291,col 7)-(line 291,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.RenameCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 294,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 296,col 7)-(line 299,col 7)"
      ]
    }
  ]
}