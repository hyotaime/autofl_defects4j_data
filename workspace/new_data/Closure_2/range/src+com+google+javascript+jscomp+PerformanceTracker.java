{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PerformanceTracker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTracker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 363,
      "comment": "\n "
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trackSize"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trackGzippedSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeChange"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " if there is any."
    },
    {
      "type": "field",
      "varNames": [
        "curCodeSizeEstimate"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "curZippedCodeSizeEstimate"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentRunningPass"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Summary stats by pass name. "
    },
    {
      "type": "field",
      "varNames": [
        "summaryCopy"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " To share with the rest of the program"
    },
    {
      "type": "field",
      "varNames": [
        "log"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Stats for each run of a compiler pass. "
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.Stats.Stats(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pass"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runtime"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runs"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diff"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gzDiff"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gzSize"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.PerformanceTracker(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerOptions.TracerMode)",
      "begin_line": 81,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 25)",
        "(line 83,col 5)-(line 102,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getCodeChangeHandler()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.recordPassStart(java.lang.String)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 38)",
        "(line 111,col 5)-(line 111,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.recordPassStop(java.lang.String, long)",
      "begin_line": 120,
      "end_line": 150,
      "comment": "\n   * Record that a pass has stopped.\n   *\n   * @param passName Short name of the pass.\n   * @param result Execution time.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 54)",
        "(line 122,col 5)-(line 124,col 5)",
        "(line 126,col 5)-(line 126,col 43)",
        "(line 127,col 5)-(line 129,col 5)",
        "(line 131,col 5)-(line 131,col 48)",
        "(line 132,col 5)-(line 132,col 22)",
        "(line 133,col 5)-(line 133,col 43)",
        "(line 135,col 5)-(line 135,col 47)",
        "(line 136,col 5)-(line 139,col 5)",
        "(line 140,col 5)-(line 140,col 47)",
        "(line 142,col 5)-(line 149,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.updateStats(com.google.javascript.jscomp.PerformanceTracker.Stats, long, com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter)",
      "begin_line": 152,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 28)",
        "(line 155,col 5)-(line 155,col 20)",
        "(line 156,col 5)-(line 158,col 5)",
        "(line 160,col 5)-(line 165,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.recordSizeChange(int, int, com.google.javascript.jscomp.PerformanceTracker.Stats)",
      "begin_line": 171,
      "end_line": 181,
      "comment": "\n   * Record the size change in the given record for that given pass.\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 177,col 5)",
        "(line 178,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.recordGzSizeChange(int, int, com.google.javascript.jscomp.PerformanceTracker.Stats)",
      "begin_line": 186,
      "end_line": 197,
      "comment": "\n   * Record the gzip size change in the given record for that given pass.\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 193,col 5)",
        "(line 194,col 5)-(line 196,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.estimateCodeSize(com.google.javascript.rhino.Node)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 79)",
        "(line 201,col 5)-(line 201,col 59)",
        "(line 202,col 5)-(line 202,col 17)",
        "(line 203,col 5)-(line 203,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.getStats()",
      "begin_line": 206,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 209,col 5)",
        "(line 210,col 5)-(line 210,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CmpEntries",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cjava.util.Map.Entry\u003cjava.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats\u003e\u003e"
      ],
      "begin_line": 213,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CmpEntries.compare(java.util.Map.Entry\u003cjava.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats\u003e, java.util.Map.Entry\u003cjava.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats\u003e)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 7)-(line 215,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.outputTracerReport(java.io.PrintStream)",
      "begin_line": 219,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 64)",
        "(line 221,col 5)-(line 221,col 61)",
        "(line 222,col 5)-(line 300,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CodeSizeEstimatePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeConsumer"
      ],
      "begin_line": 306,
      "end_line": 362,
      "comment": "\n   * Purely use to get a code size estimate and not generate any code at all.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "trackGzippedSize"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastChar"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.CodeSizeEstimatePrinter(boolean)",
      "begin_line": 313,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 47)",
        "(line 316,col 7)-(line 320,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.append(java.lang.String)",
      "begin_line": 323,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 325,col 7)-(line 325,col 29)",
        "(line 326,col 7)-(line 336,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.getLastChar()",
      "begin_line": 339,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 7)-(line 341,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.calcSize()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 7)-(line 345,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter.calcZippedSize()",
      "begin_line": 348,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 349,col 7)-(line 360,col 7)"
      ]
    }
  ]
}