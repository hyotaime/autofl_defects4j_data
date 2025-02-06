{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/ScriptRuntime.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScriptRuntime",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.ScriptRuntime.ScriptRuntime()",
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * No instances should be created.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(int)",
      "begin_line": 67,
      "end_line": 74,
      "comment": " It is public so NativeRegExp can access it .",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": " So we use ScriptRuntime.NaN instead of Double.NaN."
    },
    {
      "type": "field",
      "varNames": [
        "negativeZero"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": " A similar problem exists for negative zero."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.stringToNumber(java.lang.String, int, int)",
      "begin_line": 90,
      "end_line": 237,
      "comment": "\n     * Helper function for toNumber, parseInt, and TokenStream.getToken.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 28)",
        "(line 93,col 9)-(line 93,col 34)",
        "(line 94,col 9)-(line 94,col 34)",
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 16)",
        "(line 104,col 9)-(line 104,col 25)",
        "(line 105,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.escapeString(java.lang.String)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.escapeString(java.lang.String, char)",
      "begin_line": 247,
      "end_line": 308,
      "comment": "\n     * For escaping strings printed by object and array literals; not quite\n     * the same as \u0027escape.\u0027\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 31)",
        "(line 253,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.isValidIdentifierName(java.lang.String)",
      "begin_line": 310,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 27)",
        "(line 312,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 315,col 25)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.testUint32String(java.lang.String)",
      "begin_line": 327,
      "end_line": 356,
      "comment": "\n     * If str is a decimal presentation of Uint32 value, return it as long.\n     * Otherwise, return -1L;\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 40)",
        "(line 332,col 9)-(line 332,col 31)",
        "(line 333,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.isSpecialProperty(java.lang.String)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.getMessage0(java.lang.String)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.getMessage1(java.lang.String, java.lang.Object)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 36)",
        "(line 372,col 9)-(line 372,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ScriptRuntime.getMessage(java.lang.String, java.lang.Object[])",
      "begin_line": 379,
      "end_line": 404,
      "comment": " OPT there\u0027s a noticeable delay for the first error!  Maybe it\u0027d\n     * make sense to use a ListResourceBundle instead of a properties\n     * file to avoid (synchronized) text parsing.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 381,col 68)",
        "(line 383,col 9)-(line 383,col 44)",
        "(line 386,col 9)-(line 386,col 78)",
        "(line 388,col 9)-(line 388,col 28)",
        "(line 389,col 9)-(line 394,col 9)",
        "(line 402,col 9)-(line 402,col 66)",
        "(line 403,col 9)-(line 403,col 43)"
      ]
    }
  ]
}