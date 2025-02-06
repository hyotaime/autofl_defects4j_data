{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PassConfig.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PassConfig",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 311,
      "comment": "\n * Pass factories and meta-data for native Compiler passes.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Used by subclasses in this package."
    },
    {
      "type": "field",
      "varNames": [
        "typedScopeCreator"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n   * A memoized version of scopeCreator. It must be memoized so that\n   * we can make two separate passes over the AST, one for inferring types\n   * and one for checking types.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "internalScopeCreator"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n   * This is the scope creator that {@code TypedScopeCreator} delegates to.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "topScope"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The global typed scope. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfig(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.regenerateGlobalTypedScope(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n   * Regenerates the top scope from scratch.\n   *\n   * @param compiler The compiler for which the global scope is regenerated.\n   * @param root The root of the AST.\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 59)",
        "(line 67,col 5)-(line 67,col 71)",
        "(line 68,col 5)-(line 68,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.clearTypedScope()",
      "begin_line": 71,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 32)",
        "(line 73,col 5)-(line 73,col 29)",
        "(line 74,col 5)-(line 74,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.patchGlobalTypedScope(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n   * Regenerates the top scope potentially only for a sub-tree of AST and then\n   * copies information for the old global scope.\n   *\n   * @param compiler The compiler for which the global scope is generated.\n   * @param scriptRoot The root of the AST used to generate global scope.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 53)",
        "(line 86,col 5)-(line 86,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getTypedScopeCreator()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n   * Gets the scope creator for typed scopes.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getTopScope()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n   * Gets the global scope, with type information.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getChecks()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n   * Gets the checking passes to run.\n   *\n   * Checking passes revolve around emitting warnings and errors.\n   * They also may include pre-processor passes needed to do\n   * error analysis more effectively.\n   *\n   * Clients that only want to analyze code (like IDEs) and not emit\n   * code will only run checks and not optimizations.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getOptimizations()",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n   * Gets the optimization passes to run.\n   *\n   * Optimization passes revolve around producing smaller and faster code.\n   * They should always run after checking passes.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getPassGraph()",
      "begin_line": 126,
      "end_line": 154,
      "comment": "\n   * Gets a graph of the passes run. For debugging.\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 128,col 55)",
        "(line 129,col 5)-(line 130,col 58)",
        "(line 131,col 5)-(line 131,col 27)",
        "(line 132,col 5)-(line 132,col 28)",
        "(line 133,col 5)-(line 152,col 5)",
        "(line 153,col 5)-(line 153,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.makeTypeInference(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "\n   * Create a type inference pass.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.makeInferJsDocInfo(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.makeTypeCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 172,
      "end_line": 182,
      "comment": "\n   * Create a type-checking pass.\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 181,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.addPassFactoryBefore(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e, com.google.javascript.jscomp.PassFactory, java.lang.String)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n   * Insert the given pass factory before the factory of the given name.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 190,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.replacePassFactory(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e, com.google.javascript.jscomp.PassFactory)",
      "begin_line": 196,
      "end_line": 200,
      "comment": "\n   * Find a pass factory with the same name as the given one, and replace it.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 199,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.findPassIndexByName(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e, java.lang.String)",
      "begin_line": 205,
      "end_line": 215,
      "comment": "\n   * Throws an exception if no pass with the given name exists.\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 211,col 5)",
        "(line 213,col 5)-(line 214,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getBasePassConfig()",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\n   * Find the first pass provider that does not have a delegate.\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 30)",
        "(line 222,col 5)-(line 224,col 5)",
        "(line 225,col 5)-(line 225,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.getIntermediateState()",
      "begin_line": 232,
      "end_line": 232,
      "comment": "\n   * Get intermediate state for a running pass config, so it can\n   * be paused and started again later.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.setIntermediateState(com.google.javascript.jscomp.PassConfig.State)",
      "begin_line": 238,
      "end_line": 238,
      "comment": "\n   * Set the intermediate state for a pass config, to restart\n   * a compilation process that had been previously paused.\n   ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "PassConfigDelegate",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassConfig"
      ],
      "begin_line": 244,
      "end_line": 276,
      "comment": "\n   * An implementation of PassConfig that just proxies all its method calls\n   * into an inner class.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.PassConfigDelegate(com.google.javascript.jscomp.PassConfig)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 30)",
        "(line 250,col 7)-(line 250,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.getChecks()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 7)-(line 254,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.getOptimizations()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 7)-(line 258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.getTypedScopeCreator()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 7)-(line 262,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.getTopScope()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.getIntermediateState()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 7)-(line 270,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PassConfig.PassConfigDelegate.setIntermediateState(com.google.javascript.jscomp.PassConfig.State)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 7)-(line 274,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 281,
      "end_line": 310,
      "comment": "\n   * Intermediate state for a running pass configuration.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cssNames"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportedNames"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleIdGenerator"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variableMap"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyMap"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anonymousFunctionNameMap"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringMap"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionNames"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorMap"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PassConfig.State.State(java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator, com.google.javascript.jscomp.VariableMap, com.google.javascript.jscomp.VariableMap, com.google.javascript.jscomp.VariableMap, com.google.javascript.jscomp.VariableMap, com.google.javascript.jscomp.FunctionNames, java.lang.String)",
      "begin_line": 294,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 300,col 7)-(line 300,col 31)",
        "(line 301,col 7)-(line 301,col 41)",
        "(line 302,col 7)-(line 302,col 59)",
        "(line 303,col 7)-(line 303,col 37)",
        "(line 304,col 7)-(line 304,col 37)",
        "(line 305,col 7)-(line 305,col 63)",
        "(line 306,col 7)-(line 306,col 33)",
        "(line 307,col 7)-(line 307,col 43)",
        "(line 308,col 7)-(line 308,col 41)"
      ]
    }
  ]
}