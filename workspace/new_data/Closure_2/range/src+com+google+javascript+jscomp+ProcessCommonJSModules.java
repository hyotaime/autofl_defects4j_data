{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ProcessCommonJSModules.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessCommonJSModules",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 38,
      "end_line": 287,
      "comment": "\n * Rewrites a CommonJS module http://wiki.commonjs.org/wiki/Modules/1.1.1\n * into a form that can be safely concatenated.\n * Does not add a function around the module body but instead adds suffixes\n * to global variables to avoid conflicts.\n * Calls to require are changed to reference the required module directly.\n * goog.provide and goog.require are emitted for closure compiler automatic\n * ordering.\n "
    },
    {
      "type": "field",
      "varNames": [
        "MODULE_SLASH"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " all platforms."
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILENAME_PREFIX"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULE_NAME_SEPARATOR"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULE_NAME_PREFIX"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filenamePrefix"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportDependencies"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJSModules(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJSModules(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 29)",
        "(line 60,col 5)-(line 61,col 55)",
        "(line 62,col 5)-(line 62,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 68,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName(java.lang.String)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.getModule()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n   * For every file that is being processed this returns the module that\n   * created for it.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(java.lang.String)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n   * Turns a filename into a JS identifier that is used for moduleNames in\n   * rewritten code. Removes leading ./, replaces / with $, removes trailing .js\n   * and replaces - with _. All moduleNames get a \"module$\" prefix.\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 92,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 114,
      "comment": "\n   * Turn a filename into a moduleName with support for relative addressing\n   * with ./ and ../ based on currentFilename;\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 65)",
        "(line 102,col 5)-(line 102,col 63)",
        "(line 104,col 5)-(line 112,col 5)",
        "(line 113,col 5)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName(java.lang.String)",
      "begin_line": 116,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 43)",
        "(line 121,col 5)-(line 123,col 5)",
        "(line 125,col 5)-(line 125,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessCommonJsModulesCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 131,
      "end_line": 252,
      "comment": "\n   * Visits require, every \"script\" and special module.exports assignments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "scriptNodeCount"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modulesWithExports"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 137,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 139,col 7)-(line 143,col 7)",
        "(line 145,col 7)-(line 148,col 7)",
        "(line 150,col 7)-(line 153,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback.visitRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 174,
      "comment": "\n     * Visit require calls. Emit corresponding goog.require and rewrite require\n     * to be a direct reference to name of require module.\n     ",
      "child_ranges": [
        "(line 161,col 7)-(line 162,col 50)",
        "(line 163,col 7)-(line 163,col 59)",
        "(line 164,col 7)-(line 164,col 46)",
        "(line 165,col 7)-(line 165,col 49)",
        "(line 166,col 7)-(line 168,col 7)",
        "(line 170,col 7)-(line 172,col 75)",
        "(line 173,col 7)-(line 173,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback.visitScript(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 180,
      "end_line": 205,
      "comment": "\n     * Emit goog.provide and add suffix to all global vars to avoid conflicts\n     * with other modules.\n     ",
      "child_ranges": [
        "(line 181,col 7)-(line 183,col 41)",
        "(line 184,col 7)-(line 184,col 73)",
        "(line 185,col 7)-(line 186,col 47)",
        "(line 187,col 7)-(line 193,col 7)",
        "(line 194,col 7)-(line 196,col 74)",
        "(line 198,col 7)-(line 198,col 60)",
        "(line 201,col 7)-(line 202,col 23)",
        "(line 204,col 7)-(line 204,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback.emitOptionalModuleExportsOverride(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 212,
      "end_line": 225,
      "comment": "\n     * Emit \u003ccode\u003eif (moduleName.module$exports) {\n     *    moduleName \u003d moduleName.module$export;\n     * }\u003c/code\u003e at end of file.\n     ",
      "child_ranges": [
        "(line 214,col 7)-(line 216,col 7)",
        "(line 218,col 7)-(line 219,col 39)",
        "(line 220,col 7)-(line 224,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback.visitModuleExports(com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 239,
      "comment": "\n     * Rewrite module.exports to moduleName.module$exports.\n     ",
      "child_ranges": [
        "(line 231,col 7)-(line 231,col 71)",
        "(line 232,col 7)-(line 232,col 44)",
        "(line 233,col 7)-(line 233,col 55)",
        "(line 234,col 7)-(line 234,col 35)",
        "(line 235,col 7)-(line 235,col 45)",
        "(line 236,col 7)-(line 236,col 57)",
        "(line 237,col 7)-(line 237,col 42)",
        "(line 238,col 7)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback.getCurrentScriptNode(com.google.javascript.rhino.Node)",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n     * Returns next script node in parents.\n     ",
      "child_ranges": [
        "(line 245,col 7)-(line 250,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SuffixVarsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 257,
      "end_line": 286,
      "comment": "\n   * Traverses a node tree and appends a suffix to all global variable names.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "EXPORTS"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.SuffixVarsCallback.SuffixVarsCallback(java.lang.String)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 7)-(line 264,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessCommonJSModules.SuffixVarsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 269,col 7)-(line 284,col 7)"
      ]
    }
  ]
}