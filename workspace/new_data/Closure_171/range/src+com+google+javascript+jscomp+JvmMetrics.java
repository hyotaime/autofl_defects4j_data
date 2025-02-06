{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/JvmMetrics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JvmMetrics",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 275,
      "comment": "\n * A class to report jvm/jmx statistics.\n * Borrowed from:\n * http://code.google.com/p/dart/source/browse/trunk/dart/compiler/java/com/google/dart/compiler/metrics/JvmMetrics.java\n "
    },
    {
      "type": "field",
      "varNames": [
        "TABULAR_COLON_POS"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_KILO_BYTE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_MEGA_BYTE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_GIGA_BYTE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.maybeWriteJvmMetrics(java.io.PrintStream, java.lang.String)",
      "begin_line": 41,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 44,col 5)",
        "(line 46,col 5)-(line 46,col 32)",
        "(line 47,col 5)-(line 47,col 31)",
        "(line 48,col 5)-(line 48,col 59)",
        "(line 50,col 5)-(line 55,col 5)",
        "(line 57,col 5)-(line 62,col 5)",
        "(line 64,col 5)-(line 76,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.writeMetrics(java.io.PrintStream, java.lang.String, boolean, boolean)",
      "begin_line": 79,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 87,col 5)",
        "(line 88,col 5)-(line 90,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.writeJitMetrics(java.io.PrintStream, boolean, boolean)",
      "begin_line": 93,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 71)",
        "(line 98,col 5)-(line 98,col 16)",
        "(line 99,col 5)-(line 103,col 5)",
        "(line 105,col 5)-(line 112,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.writeOverallMemoryUsage(java.io.PrintStream, java.lang.management.MemoryUsage, java.lang.String, boolean)",
      "begin_line": 115,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 127,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.writePoolMemoryUsage(java.io.PrintStream, java.lang.management.MemoryUsage, java.lang.management.MemoryUsage, java.lang.String, boolean)",
      "begin_line": 130,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 146,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.writeMemoryMetrics(java.io.PrintStream, boolean, boolean)",
      "begin_line": 149,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 153,col 5)",
        "(line 156,col 5)-(line 163,col 5)",
        "(line 165,col 5)-(line 199,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.writeGarbageCollectionStats(java.io.PrintStream, boolean, boolean)",
      "begin_line": 202,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 205,col 55)",
        "(line 207,col 5)-(line 248,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.normalizeName(java.lang.String)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 49)",
        "(line 257,col 5)-(line 257,col 32)",
        "(line 258,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 261,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JvmMetrics.formatBytes(long)",
      "begin_line": 264,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 273,col 5)"
      ]
    }
  ]
}