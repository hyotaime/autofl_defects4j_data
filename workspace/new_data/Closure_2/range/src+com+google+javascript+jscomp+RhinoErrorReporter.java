{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RhinoErrorReporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RhinoErrorReporter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 213,
      "comment": "\n * An error reporter for serializing Rhino errors into our error format.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "PARSE_ERROR"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_PARSE_ERROR"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRAILING_COMMA"
      ],
      "begin_line": 42,
      "end_line": 47,
      "comment": " warnings API."
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_PARAM"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_JSDOC_ANNOTATION"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISPLACED_TYPE_ANNOTATION"
      ],
      "begin_line": 55,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeMap"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " A map of Rhino messages to their DiagnosticType."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.replacePlaceHolders(java.lang.String)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n   * For each message such as \"Not a good use of {0}\", replace the place\n   * holder {0} with a wild card that matches all possible strings.\n   * Also put the any non-place-holder in quotes for regex matching later.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 25)",
        "(line 72,col 5)-(line 72,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.RhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 75,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 29)",
        "(line 77,col 5)-(line 100,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.warningAtLine(java.lang.String, java.lang.String, int, int)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 115,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.errorAtLine(java.lang.String, java.lang.String, int, int)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.makeError(java.lang.String, java.lang.String, int, int, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 124,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 134,col 5)",
        "(line 136,col 5)-(line 137,col 30)"
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
      "begin_line": 140,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter.OldRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.OldRhinoErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 65)"
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
      "begin_line": 160,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.NewRhinoErrorReporter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.runtimeError(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 7)-(line 172,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.error(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 7)-(line 178,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 181,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 184,col 7)-(line 184,col 19)",
        "(line 185,col 7)-(line 185,col 21)",
        "(line 186,col 7)-(line 186,col 70)",
        "(line 187,col 7)-(line 190,col 7)",
        "(line 191,col 7)-(line 191,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.warning(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RhinoErrorReporter.NewRhinoErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 200,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 203,col 7)-(line 203,col 19)",
        "(line 204,col 7)-(line 204,col 21)",
        "(line 205,col 7)-(line 205,col 70)",
        "(line 206,col 7)-(line 209,col 7)",
        "(line 210,col 7)-(line 210,col 59)"
      ]
    }
  ]
}