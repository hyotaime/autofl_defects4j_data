{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TransformAMDToCJSModule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformAMDToCJSModule",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 31,
      "end_line": 303,
      "comment": "\n * Rewrites an AMD module https://github.com/amdjs/amdjs-api/wiki/AMD to a\n * CommonJS module. See {@link ProcessCommonJSModules} for follow up processing\n * step.\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSUPPORTED_DEFINE_SIGNATURE_ERROR"
      ],
      "begin_line": 33,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_TOP_LEVEL_STATEMENT_DEFINE_ERROR"
      ],
      "begin_line": 40,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REQUIREJS_PLUGINS_NOT_SUPPORTED_WARNING"
      ],
      "begin_line": 44,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_RENAME_SUFFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameIndex"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDToCJSModule(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.unsupportedDefineError(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.isVirtualModuleName(java.lang.String)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n   * The modules \"exports\", \"require\" and \"module\" are virtual in terms of\n   * existing implicitly in CommonJS.\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 74,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformAMDModulesCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 81,
      "end_line": 261,
      "comment": "\n   * Rewrites calls to define which has to be in void context just below the\n   * current script node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 133,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handleDefineObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\n     * When define is called with an object literal, assign it to exports and\n     * we\u0027re done.\n     ",
      "child_ranges": [
        "(line 142,col 7)-(line 142,col 53)",
        "(line 143,col 7)-(line 145,col 55)",
        "(line 146,col 7)-(line 146,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handleRequiresAndParamList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 153,
      "end_line": 164,
      "comment": "\n     * Rewrites the required modules to\n     * \u003ccode\u003evar nameInParamList \u003d require(\"nameFromRequireList\");\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 155,col 7)-(line 156,col 21)",
        "(line 157,col 7)-(line 158,col 79)",
        "(line 159,col 7)-(line 163,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handleRequire(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 169,
      "end_line": 219,
      "comment": "\n     * Rewrite a single require call.\n     ",
      "child_ranges": [
        "(line 171,col 7)-(line 171,col 31)",
        "(line 172,col 7)-(line 174,col 7)",
        "(line 176,col 7)-(line 178,col 7)",
        "(line 180,col 7)-(line 180,col 74)",
        "(line 181,col 7)-(line 181,col 39)",
        "(line 182,col 7)-(line 194,col 7)",
        "(line 196,col 7)-(line 196,col 23)",
        "(line 197,col 7)-(line 215,col 7)",
        "(line 217,col 7)-(line 218,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.handlePlugins(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 228,
      "end_line": 243,
      "comment": "\n     * Require.js supports a range of plugins that are hard to support\n     * statically. Generally none are supported right now with the\n     * exception of a simple hack to support condition loading. This\n     * was added to make compilation of Dojo work better but will\n     * probably break, so just don\u0027t use them :)\n     ",
      "child_ranges": [
        "(line 230,col 7)-(line 241,col 7)",
        "(line 242,col 7)-(line 242,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback.moveCallbackContentToTopLevel(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 260,
      "comment": "\n     * Moves the statements in the callback to be direct children of the\n     * current script.\n     ",
      "child_ranges": [
        "(line 251,col 7)-(line 251,col 58)",
        "(line 252,col 7)-(line 252,col 39)",
        "(line 253,col 7)-(line 253,col 59)",
        "(line 254,col 7)-(line 254,col 53)",
        "(line 255,col 7)-(line 257,col 7)",
        "(line 258,col 7)-(line 258,col 43)",
        "(line 259,col 7)-(line 259,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefineCallbackReturnCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 267,
      "end_line": 280,
      "comment": "\n   * Rewrites the return statement of the callback to be an assignment to\n   * module.exports.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.DefineCallbackReturnCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 269,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 271,col 7)-(line 278,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RenameCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 285,
      "end_line": 302,
      "comment": "\n   * Renames names;\n   "
    },
    {
      "type": "field",
      "varNames": [
        "from"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "to"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.RenameCallback.RenameCallback(java.lang.String, java.lang.String)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 23)",
        "(line 292,col 7)-(line 292,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TransformAMDToCJSModule.RenameCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 295,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 297,col 7)-(line 300,col 7)"
      ]
    }
  ]
}