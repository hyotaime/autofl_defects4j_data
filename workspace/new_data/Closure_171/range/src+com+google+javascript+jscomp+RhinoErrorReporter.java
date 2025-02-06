{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RhinoErrorReporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RhinoErrorReporter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 235,
      "comment": "\n * An error reporter for serializing Rhino errors into our error format.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "PARSE_ERROR"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_PARSE_ERROR"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRAILING_COMMA"
      ],
      "begin_line": 41,
      "end_line": 46,
      "comment": " warnings API."
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_PARAM"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_JSDOC_ANNOTATION"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISPLACED_TYPE_ANNOTATION"
      ],
      "begin_line": 54,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PARSE_TREE_TOO_DEEP"
      ],
      "begin_line": 59,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeMap"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A map of Rhino messages to their DiagnosticType."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.replacePlaceHolders(java.lang.String)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n   * For each message such as \"Not a good use of {0}\", replace the place\n   * holder {0} with a wild card that matches all possible strings.\n   * Also put the any non-place-holder in quotes for regex matching later.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 25)",
        "(line 75,col 5)-(line 75,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.RhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 78,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 29)",
        "(line 80,col 5)-(line 110,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.warningAtLine(java.lang.String, java.lang.String, int, int)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 125,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.errorAtLine(java.lang.String, java.lang.String, int, int)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 131,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.mapError(java.lang.String)",
      "begin_line": 134,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 139,col 5)",
        "(line 140,col 5)-(line 140,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.makeError(java.lang.String, java.lang.String, int, int, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 44)",
        "(line 149,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 155,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OldRhinoErrorReporter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.RhinoErrorReporter",
        "com.google.javascript.rhino.ErrorReporter"
      ],
      "begin_line": 158,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter.OldRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 174,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NewRhinoErrorReporter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.RhinoErrorReporter",
        "com.google.javascript.rhino.head.ast.IdeErrorReporter"
      ],
      "begin_line": 178,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.NewRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.runtimeError(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 185,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 189,col 7)-(line 189,col 46)",
        "(line 190,col 7)-(line 192,col 7)",
        "(line 193,col 7)-(line 194,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.error(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 7)-(line 200,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 203,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 206,col 7)-(line 206,col 19)",
        "(line 207,col 7)-(line 207,col 21)",
        "(line 208,col 7)-(line 208,col 70)",
        "(line 209,col 7)-(line 212,col 7)",
        "(line 213,col 7)-(line 213,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.warning(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 7)-(line 219,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 222,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 225,col 7)-(line 225,col 19)",
        "(line 226,col 7)-(line 226,col 21)",
        "(line 227,col 7)-(line 227,col 70)",
        "(line 228,col 7)-(line 231,col 7)",
        "(line 232,col 7)-(line 232,col 59)"
      ]
    }
  ]
}