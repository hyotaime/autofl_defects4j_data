{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PhaseOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhaseOptimizer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 35,
      "end_line": 392,
      "comment": "\n * Optimizes the order of compiler passes.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "OPTIMAL_ORDER"
      ],
      "begin_line": 38,
      "end_line": 49,
      "comment": " This ordering is computed offline by running with compute_phase_ordering."
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LOOPS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OPTIMIZE_LOOP_ERROR"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passes"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tracker"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recentChange"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loopMutex"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentTracer"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPassName"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheck"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progress"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progressStep"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomizeLoops"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " phase orderings. They should not be touched by normal compiler runs."
    },
    {
      "type": "field",
      "varNames": [
        "loopsRun"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progressRange"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.PhaseOptimizer(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PerformanceTracker, com.google.javascript.jscomp.PhaseOptimizer.ProgressRange)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n   * @param compiler the compiler that owns/creates this.\n   * @param tracker an optional performance tracker\n   * @param progressRange the progress range for the process function or null\n   * if progress should not be reported.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 29)",
        "(line 88,col 5)-(line 88,col 27)",
        "(line 89,col 5)-(line 89,col 39)",
        "(line 90,col 5)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.randomizeLoops()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n   * Randomizes loops. This should only be used when computing optimal phase\n   * orderings.\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n   * Get the phase ordering of loops during this run.\n   * Returns an empty list when the loops are not randomized.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.clearLoopsRun()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n   * Clears the phase ordering of loops during this run.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.consume(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e)",
      "begin_line": 128,
      "end_line": 148,
      "comment": "\n   * Add the passes generated by the given factories to the compile sequence.\n   *\n   * Automatically pulls multi-run passes into fixed point loops. If there\n   * are 2 or more multi-run passes in a row, they will run together in\n   * the same fixed point loop. If A and B are in the same fixed point loop,\n   * the loop will continue to run both A and B until both are finished\n   * making changes.\n   *\n   * Other than that, the PhaseOptimizer is free to tweak the order and\n   * frequency of multi-run passes in a fixed-point loop.\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 34)",
        "(line 130,col 5)-(line 130,col 43)",
        "(line 131,col 5)-(line 143,col 5)",
        "(line 145,col 5)-(line 147,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.addOneTimePass(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n   * Add the pass generated by the given factory to the compile sequence.\n   * This pass will be run once.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.addFixedPointLoop()",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n   * Add a loop to the compile sequence. This loop will continue running\n   * until the AST stops changing.\n   * @return The loop structure. Pass suppliers should be added to the loop.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 27)",
        "(line 165,col 5)-(line 165,col 21)",
        "(line 166,col 5)-(line 166,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.setSanityCheck(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n   * Adds a sanity checker to be run after every pass. Intended for development.\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 195,
      "comment": "\n   * Run all the passes in the optimizer.\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 19)",
        "(line 182,col 5)-(line 182,col 23)",
        "(line 183,col 5)-(line 187,col 5)",
        "(line 189,col 5)-(line 194,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.startPass(java.lang.String)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n   * Marks the beginning of a pass.\n   ",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 79)",
        "(line 202,col 5)-(line 202,col 31)",
        "(line 203,col 5)-(line 203,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.endPass(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 209,
      "end_line": 230,
      "comment": "\n   * Marks the end of a pass.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 79)",
        "(line 212,col 5)-(line 212,col 41)",
        "(line 213,col 5)-(line 229,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.maybeSanityCheck(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\n   * Runs the sanity check if it is available.\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 238,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.hasHaltingErrors()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.newTracer(java.lang.String)",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\n   * Returns a new tracer for the given pass name.\n   ",
      "child_ranges": [
        "(line 249,col 5)-(line 250,col 74)",
        "(line 251,col 5)-(line 253,col 5)",
        "(line 254,col 5)-(line 254,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.stopTracer(com.google.javascript.jscomp.Tracer, java.lang.String)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 27)",
        "(line 259,col 5)-(line 261,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamedPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 267,
      "end_line": 286,
      "comment": "\n   * A single compiler pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.NamedPass.NamedPass(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 36)",
        "(line 273,col 7)-(line 273,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.NamedPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 276,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 24)",
        "(line 279,col 7)-(line 279,col 22)",
        "(line 283,col 7)-(line 283,col 54)",
        "(line 284,col 7)-(line 284,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Loop",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 294,
      "end_line": 381,
      "comment": "\n   * Runs a set of compiler passes until they reach a fixed point.\n   *\n   * Notice that this is a non-static class, because it includes the closure\n   * of PhaseOptimizer.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "myPasses"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "myNames"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.addLoopedPass(com.google.javascript.jscomp.PassFactory)",
      "begin_line": 298,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 299,col 7)-(line 299,col 38)",
        "(line 300,col 7)-(line 301,col 62)",
        "(line 302,col 7)-(line 302,col 24)",
        "(line 303,col 7)-(line 303,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.getPassOrder()",
      "begin_line": 309,
      "end_line": 315,
      "comment": "\n     * Gets the pass names, in order.\n     ",
      "child_ranges": [
        "(line 310,col 7)-(line 310,col 48)",
        "(line 311,col 7)-(line 313,col 7)",
        "(line 314,col 7)-(line 314,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 317,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 319,col 73)",
        "(line 320,col 7)-(line 320,col 23)",
        "(line 321,col 7)-(line 325,col 7)",
        "(line 327,col 7)-(line 352,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.randomizePasses()",
      "begin_line": 356,
      "end_line": 358,
      "comment": " Re-arrange the passes in a random order. ",
      "child_ranges": [
        "(line 357,col 7)-(line 357,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.Loop.optimizePasses()",
      "begin_line": 361,
      "end_line": 380,
      "comment": " Re-arrange the passes in an optimal order. ",
      "child_ranges": [
        "(line 368,col 7)-(line 368,col 59)",
        "(line 369,col 7)-(line 376,col 7)",
        "(line 378,col 7)-(line 378,col 40)",
        "(line 379,col 7)-(line 379,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProgressRange",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 383,
      "end_line": 391,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialValue"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PhaseOptimizer.ProgressRange.ProgressRange(double, double)",
      "begin_line": 387,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 388,col 7)-(line 388,col 39)",
        "(line 389,col 7)-(line 389,col 31)"
      ]
    }
  ]
}