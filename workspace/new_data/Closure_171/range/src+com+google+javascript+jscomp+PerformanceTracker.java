{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PerformanceTracker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTracker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 377,
      "comment": "\n * A PerformanceTracker collects statistics about the runtime of each pass, and\n * how much a pass impacts the size of the compiled output, before and after\n * gzip.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WHEN_SIZE_UNTRACKED"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trackSize"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trackGzSize"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeChange"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " if there is any."
    },
    {
      "type": "field",
      "varNames": [
        "initCodeSize"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initGzCodeSize"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runtime"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runs"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loopRuns"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loopChanges"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeSize"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " To get exact sizes, call compiler.toSource() for the final generated code."
    },
    {
      "type": "field",
      "varNames": [
        "gzCodeSize"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diff"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gzDiff"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPass"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Summary stats by pass name. "
    },
    {
      "type": "field",
      "varNames": [
        "summaryCopy"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " To share with the rest of the program"
    },
    {
      "type": "field",
      "varNames": [
        "log"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Stats for each run of a compiler pass. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.PerformanceTracker(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerOptions.TracerMode)",
      "begin_line": 88,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 25)",
        "(line 90,col 5)-(line 110,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getCodeChangeHandler()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.recordPassStart(java.lang.String, boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 53)",
        "(line 119,col 5)-(line 119,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.recordPassStop(java.lang.String, long)",
      "begin_line": 129,
      "end_line": 179,
      "comment": "\n   * Collects information about a pass P after P finishes running, eg, how much\n   * time P took and what was its impact on code size.\n   *\n   * @param passName short name of the pass\n   * @param runtime execution time in milliseconds\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 61)",
        "(line 134,col 5)-(line 141,col 5)",
        "(line 144,col 5)-(line 144,col 22)",
        "(line 145,col 5)-(line 145,col 47)",
        "(line 146,col 5)-(line 149,col 5)",
        "(line 152,col 5)-(line 152,col 31)",
        "(line 153,col 5)-(line 153,col 22)",
        "(line 154,col 5)-(line 154,col 36)",
        "(line 155,col 5)-(line 155,col 27)",
        "(line 156,col 5)-(line 159,col 5)",
        "(line 162,col 5)-(line 178,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getRuntime()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 21)",
        "(line 183,col 5)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getSize()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 21)",
        "(line 188,col 5)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getGzSize()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 21)",
        "(line 193,col 5)-(line 193,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getChanges()",
      "begin_line": 196,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 21)",
        "(line 199,col 5)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getLoopChanges()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 21)",
        "(line 205,col 5)-(line 205,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getRuns()",
      "begin_line": 208,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 21)",
        "(line 211,col 5)-(line 211,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getLoopRuns()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 21)",
        "(line 217,col 5)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getStats()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 21)",
        "(line 222,col 5)-(line 222,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.calcTotalStats()",
      "begin_line": 225,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 229,col 5)",
        "(line 230,col 5)-(line 230,col 47)",
        "(line 231,col 5)-(line 242,col 5)",
        "(line 243,col 5)-(line 243,col 76)",
        "(line 244,col 5)-(line 245,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.outputTracerReport(java.io.PrintStream)",
      "begin_line": 252,
      "end_line": 303,
      "comment": "\n   * Prints a summary, which contains aggregate stats for all runs of each pass\n   * and a log, which contains stats for each individual run.\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 64)",
        "(line 254,col 5)-(line 254,col 61)",
        "(line 255,col 5)-(line 302,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.Anonymous-7d8719f9-b9a9-440c-a73e-013c3541a2c7.compare(java.util.Map.Entry\u003cjava.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats\u003e, java.util.Map.Entry\u003cjava.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats\u003e)",
      "begin_line": 264,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 15)-(line 267,col 75)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 309,
      "end_line": 323,
      "comment": "\n   * A Stats object contains statistics about a pass run, such as running time,\n   * size changes, etc\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.Stats.Stats(java.lang.String, boolean)",
      "begin_line": 310,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 311,col 23)",
        "(line 312,col 7)-(line 312,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pass"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isOneTime"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runtime"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runs"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diff"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gzDiff"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gzSize"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CodeSizeEstimatePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeConsumer"
      ],
      "begin_line": 326,
      "end_line": 376,
      "comment": " An object to get a gzsize estimate; it doesn\u0027t generate code. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastChar"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.CodeSizeEstimatePrinter()",
      "begin_line": 332,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 333,col 7)-(line 337,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.append(java.lang.String)",
      "begin_line": 340,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 342,col 7)-(line 342,col 29)",
        "(line 343,col 7)-(line 353,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.getLastChar()",
      "begin_line": 356,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 7)-(line 358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.calcSize()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 7)-(line 362,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.calcZippedSize()",
      "begin_line": 366,
      "end_line": 375,
      "comment": " Called iff trackGzSize is true",
      "child_ranges": [
        "(line 367,col 7)-(line 374,col 7)"
      ]
    }
  ]
}