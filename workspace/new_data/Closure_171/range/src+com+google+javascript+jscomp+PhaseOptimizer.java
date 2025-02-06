{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PhaseOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhaseOptimizer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 38,
      "end_line": 502,
      "comment": "\n * An object that optimizes the order of compiler passes.\n *\n * @author nicksantos@google.com (Nick Santos)\n * @author dimvar@google.com (Dimitris Vardoulakis)\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tracker"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passes"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inLoop"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheck"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printAstHashcodes"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progress"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progressStep"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progressRange"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPass"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " 2) Compiler talks to PhaseOptimizer, not Loop or ScopedChangeHandler"
    },
    {
      "type": "field",
      "varNames": [
        "lastRuns"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For each pass, remember the time at the end of the pass\u0027s last run."
    },
    {
      "type": "field",
      "varNames": [
        "currentScope"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timestamp"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " returning 0 if the custom attribute on a node hasn\u0027t been set."
    },
    {
      "type": "field",
      "varNames": [
        "lastChange"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The time of the last change made to the program by any pass."
    },
    {
      "type": "field",
      "varNames": [
        "START_TIME"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crossScopeReporting"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " change handlers. This flag prevents double update in ScopedChangeHandler."
    },
    {
      "type": "field",
      "varNames": [
        "lastAst"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Used for sanity checks between loopable passes"
    },
    {
      "type": "field",
      "varNames": [
        "mtoc"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Stands for \"main to clone\""
    },
    {
      "type": "field",
      "varNames": [
        "OPTIMAL_ORDER"
      ],
      "begin_line": 94,
      "end_line": 104,
      "comment": " future, we should write new code to do it."
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LOOPS"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OPTIMIZE_LOOP_ERROR"
      ],
      "begin_line": 107,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.PhaseOptimizer(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PerformanceTracker, com.google.javascript.jscomp.PhaseOptimizer.ProgressRange)",
      "begin_line": 116,
      "end_line": 126,
      "comment": "\n   * @param compiler the compiler that owns/creates this.\n   * @param tracker an optional performance tracker\n   * @param progressRange the progress range for the process function or null\n   *        if progress should not be reported.\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 25)",
        "(line 119,col 5)-(line 119,col 35)",
        "(line 120,col 5)-(line 120,col 27)",
        "(line 121,col 5)-(line 121,col 39)",
        "(line 122,col 5)-(line 122,col 31)",
        "(line 123,col 5)-(line 123,col 24)",
        "(line 124,col 5)-(line 124,col 37)",
        "(line 125,col 5)-(line 125,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.consume(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e)",
      "begin_line": 139,
      "end_line": 159,
      "comment": "\n   * Add the passes generated by the given factories to the compile sequence.\n   * \u003cp\u003e\n   * Automatically pulls multi-run passes into fixed point loops. If there\n   * are 1 or more multi-run passes in a row, they will run together in\n   * the same fixed point loop. The passes will run until they are finished\n   * making changes.\n   * \u003cp\u003e\n   * The PhaseOptimizer is free to tweak the order and frequency of multi-run\n   * passes in a fixed-point loop.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 34)",
        "(line 141,col 5)-(line 141,col 43)",
        "(line 142,col 5)-(line 154,col 5)",
        "(line 156,col 5)-(line 158,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.addOneTimePass(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n   * Add the pass generated by the given factory to the compile sequence.\n   * This pass will be run once.\n   ",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.addFixedPointLoop()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n   * Add a loop to the compile sequence. This loop will continue running\n   * until the AST stops changing.\n   * @return The loop structure. Pass suppliers should be added to the loop.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 27)",
        "(line 177,col 5)-(line 177,col 21)",
        "(line 178,col 5)-(line 178,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.setSanityCheck(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n   * Adds a sanity checker to be run after every pass. Intended for development.\n   ",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 35)",
        "(line 186,col 5)-(line 186,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.setSanityCheckState()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 190,col 33)",
        "(line 191,col 5)-(line 191,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.setPrintAstHashcodes(boolean)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n   * Sets the hashcode of the AST to be logged every pass.\n   * Intended for development.\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 205,
      "end_line": 220,
      "comment": "\n   * Run all the passes in the optimizer.\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 19)",
        "(line 208,col 5)-(line 208,col 23)",
        "(line 209,col 5)-(line 213,col 5)",
        "(line 214,col 5)-(line 219,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.maybePrintAstHashcodes(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 222,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 228,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.maybeSanityCheck(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 234,
      "end_line": 242,
      "comment": "\n   * Runs the sanity check if it is available.\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 241,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.hasHaltingErrors()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamedPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 251,
      "end_line": 290,
      "comment": "\n   * A single compiler pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tracer"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.NamedPass.NamedPass(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 36)",
        "(line 258,col 7)-(line 258,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.NamedPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 261,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 263,col 7)-(line 263,col 24)",
        "(line 264,col 7)-(line 266,col 7)",
        "(line 267,col 7)-(line 267,col 40)",
        "(line 271,col 7)-(line 271,col 54)",
        "(line 272,col 7)-(line 288,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.setScope(com.google.javascript.rhino.Node)",
      "begin_line": 292,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 297,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.hasScopeChanged(com.google.javascript.rhino.Node)",
      "begin_line": 300,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 304,col 5)",
        "(line 305,col 5)-(line 305,col 50)",
        "(line 307,col 5)-(line 308,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.getEnclosingScope(com.google.javascript.rhino.Node)",
      "begin_line": 311,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 317,col 5)",
        "(line 318,col 5)-(line 318,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.reportChangeToEnclosingScope(com.google.javascript.rhino.Node)",
      "begin_line": 321,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 27)",
        "(line 323,col 5)-(line 323,col 50)",
        "(line 325,col 5)-(line 325,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.startCrossScopeReporting()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n   * Records that the currently-running pass may report cross-scope changes.\n   * When this happens, we don\u0027t want to falsely report the current scope as\n   * changed when reportChangeToScope is called from Compiler.\n   ",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.endCrossScopeReporting()",
      "begin_line": 338,
      "end_line": 340,
      "comment": " The currently-running pass won\u0027t report cross-scope changes. ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ScopedChangeHandler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeChangeHandler"
      ],
      "begin_line": 345,
      "end_line": 372,
      "comment": "\n   * A change handler that marks scopes as changed when reportChange is called.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastCodeChangeQuery"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.ScopedChangeHandler.ScopedChangeHandler()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 349,col 7)-(line 349,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.ScopedChangeHandler.reportChange()",
      "begin_line": 352,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 354,col 7)-(line 358,col 7)",
        "(line 359,col 7)-(line 359,col 29)",
        "(line 360,col 7)-(line 360,col 44)",
        "(line 362,col 7)-(line 362,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.ScopedChangeHandler.hasCodeChangedSinceLastCall()",
      "begin_line": 365,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 366,col 7)-(line 366,col 56)",
        "(line 367,col 7)-(line 367,col 38)",
        "(line 369,col 7)-(line 369,col 18)",
        "(line 370,col 7)-(line 370,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Loop",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 381,
      "end_line": 487,
      "comment": "\n   * A compound pass that contains atomic passes and runs them until they reach\n   * a fixed point.\n   * \u003cp\u003e\n   * Notice that this is a non-static class, because it includes the closure\n   * of PhaseOptimizer.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "myPasses"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "myNames"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopeHandler"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.addLoopedPass(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 387,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 388,col 7)-(line 388,col 38)",
        "(line 389,col 7)-(line 390,col 62)",
        "(line 391,col 7)-(line 391,col 24)",
        "(line 392,col 7)-(line 392,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 397,col 7)-(line 397,col 70)",
        "(line 398,col 7)-(line 398,col 20)",
        "(line 399,col 7)-(line 399,col 23)",
        "(line 402,col 7)-(line 402,col 47)",
        "(line 403,col 7)-(line 403,col 46)",
        "(line 404,col 7)-(line 404,col 21)",
        "(line 407,col 7)-(line 407,col 51)",
        "(line 408,col 7)-(line 410,col 7)",
        "(line 412,col 7)-(line 412,col 53)",
        "(line 414,col 7)-(line 414,col 55)",
        "(line 415,col 7)-(line 415,col 58)",
        "(line 416,col 7)-(line 416,col 34)",
        "(line 417,col 7)-(line 417,col 20)",
        "(line 419,col 7)-(line 463,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.optimizePasses()",
      "begin_line": 467,
      "end_line": 486,
      "comment": " Re-arrange the passes in an optimal order. ",
      "child_ranges": [
        "(line 474,col 7)-(line 474,col 59)",
        "(line 475,col 7)-(line 482,col 7)",
        "(line 484,col 7)-(line 484,col 40)",
        "(line 485,col 7)-(line 485,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProgressRange",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 493,
      "end_line": 501,
      "comment": "\n   * An object used when running many NamedPass loopable passes as a Loop pass,\n   * to keep track of how far along we are.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "initialValue"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.ProgressRange.ProgressRange(double, double)",
      "begin_line": 497,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 498,col 7)-(line 498,col 39)",
        "(line 499,col 7)-(line 499,col 31)"
      ]
    }
  ]
}