{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InstrumentFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstrumentFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 57,
      "end_line": 345,
      "comment": "\n * Instruments functions for when functions first get called and defined.\n *\n * This pass be used to instrument code to:\n *  1. Gather statistics from real users in the wild.\n *  2. Incorporate utilization statistics into Selenium tests\n *  3. Access utilization statistics from an app\u0027s debug UI\n *\n * By parametrizing the whole instrumentation process we expect to be\n * able to support a wide variety of use cases and minimize the cost\n * of developing new instrumentation schemes.\n *\n * TODO(user): This pass currently runs just before the variable and\n * property renaming near the end of the optimization pass.  I think\n * Mark put it there to minimize the difference between the code\n * generated with/without instrumentation; instrumentation makes\n * several optimization passes do less, for example inline functions.\n *\n * My opinion is that we want utilization/profiling information for\n * all function.  This pass should run before most passes that modify\n * the AST (exception being the localization pass, which makes\n * assumptions about the structure of the AST).  We should move the\n * pass up, list inlined functions or give clients the option to\n * instrument before or after optimization.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionNames"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateFilename"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "appNameStr"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initCodeSource"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "definedFunctionName"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportFunctionName"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportFunctionExitName"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "appNameSetter"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declarationsToRemove"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentFunctions(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.FunctionNames, java.lang.String, java.lang.String, java.lang.Readable)",
      "begin_line": 80,
      "end_line": 121,
      "comment": "\n   * Creates an instrument functions compiler pass.\n   *\n   * @param compiler          The JSCompiler\n   * @param functionNames     Assigned function identifiers.\n   * @param templateFilename  Template filename; for use during error\n   *                          reporting only.\n   * @param appNameStr        String to pass to appNameSetter.\n   * @param readable          Instrumentation template protobuf text.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 29)",
        "(line 86,col 5)-(line 86,col 39)",
        "(line 87,col 5)-(line 87,col 45)",
        "(line 88,col 5)-(line 88,col 33)",
        "(line 90,col 5)-(line 90,col 67)",
        "(line 91,col 5)-(line 104,col 5)",
        "(line 106,col 5)-(line 106,col 47)",
        "(line 108,col 5)-(line 108,col 62)",
        "(line 109,col 5)-(line 111,col 5)",
        "(line 112,col 5)-(line 112,col 59)",
        "(line 114,col 5)-(line 114,col 59)",
        "(line 115,col 5)-(line 115,col 55)",
        "(line 116,col 5)-(line 116,col 59)",
        "(line 117,col 5)-(line 117,col 53)",
        "(line 119,col 5)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 25)",
        "(line 126,col 5)-(line 134,col 5)",
        "(line 136,col 5)-(line 137,col 69)",
        "(line 138,col 5)-(line 138,col 69)",
        "(line 140,col 5)-(line 150,col 5)",
        "(line 152,col 5)-(line 156,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 166,
      "end_line": 183,
      "comment": "\n   * The application must refer to these variables to output them so the\n   * application must also declare these variables for the first\n   * {@link VarCheck} pass. These declarations must be removed before the\n   * second {@link VarCheck} pass. Otherwise, the second pass would warn about\n   * duplicate declarations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "removable"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.RemoveCallback.RemoveCallback(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.RemoveCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 172,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 181,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InstrumentReturns",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 212,
      "end_line": 286,
      "comment": "\n   * Traverse a function\u0027s body by instrument return sites by\n   * inserting calls to {@code reportFunctionExitName}.  If the\n   * function is missing an explicit return statement in some control\n   * path, this pass inserts a call to {@code reportFunctionExitName}\n   * as the last statement in the function\u0027s body.\n   *\n   * Example:\n   * Input:\n   * function f() {\n   *   if (pred) {\n   *     return a;\n   *   }\n   * }\n   *\n   * Template:\n   * reportFunctionExitName: \"onExitFn\"\n   *\n   * Output:\n   * function f() {\n   *   if (pred) {\n   *     return onExitFn(0, a);\n   *   }\n   *   onExitFn(0);\n   * }\n   *\n   *"
    },
    {
      "type": "field",
      "varNames": [
        "functionId"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.InstrumentReturns(int)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * @param functionId Function identifier computed by FunctionNames;\n     *     used as first argument to {@code reportFunctionExitName}\n     *     {@code reportFunctionExitName} must be a 2 argument function that\n     *     returns it\u0027s second argument.\n     ",
      "child_ranges": [
        "(line 221,col 7)-(line 221,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.process(com.google.javascript.rhino.Node)",
      "begin_line": 227,
      "end_line": 236,
      "comment": "\n     * @param body  body of function with id \u003d\u003d this.functionId\n     ",
      "child_ranges": [
        "(line 228,col 7)-(line 228,col 51)",
        "(line 230,col 7)-(line 235,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 243,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 245,col 7)-(line 247,col 7)",
        "(line 249,col 7)-(line 249,col 46)",
        "(line 250,col 7)-(line 250,col 44)",
        "(line 251,col 7)-(line 253,col 7)",
        "(line 254,col 7)-(line 254,col 30)",
        "(line 255,col 7)-(line 255,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.newReportFunctionExitNode()",
      "begin_line": 258,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 261,col 33)",
        "(line 262,col 7)-(line 262,col 48)",
        "(line 263,col 7)-(line 263,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.allPathsReturn(com.google.javascript.rhino.Node)",
      "begin_line": 269,
      "end_line": 285,
      "comment": "\n     * @returns true if all paths from block must exit with an explicit return.\n     ",
      "child_ranges": [
        "(line 271,col 7)-(line 272,col 34)",
        "(line 273,col 7)-(line 273,col 31)",
        "(line 274,col 7)-(line 274,col 48)",
        "(line 276,col 7)-(line 276,col 66)",
        "(line 277,col 7)-(line 283,col 7)",
        "(line 284,col 7)-(line 284,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InstrumentCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 288,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentFunctions.InstrumentCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 289,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 293,col 7)",
        "(line 295,col 7)-(line 295,col 46)",
        "(line 296,col 7)-(line 299,col 7)",
        "(line 301,col 7)-(line 310,col 7)",
        "(line 312,col 7)-(line 315,col 7)",
        "(line 317,col 7)-(line 342,col 7)"
      ]
    }
  ]
}