{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DiagnosticGroups.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiagnosticGroups",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 255,
      "comment": "\n * Named groups of DiagnosticTypes exposed by Compiler.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNUSED"
      ],
      "begin_line": 30,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.DiagnosticGroups()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "groupsByName"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.registerDeprecatedGroup(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.registerGroup(java.lang.String, com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 34)",
        "(line 45,col 5)-(line 45,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.registerGroup(java.lang.String, com.google.javascript.jscomp.DiagnosticType...)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 61)",
        "(line 51,col 5)-(line 51,col 34)",
        "(line 52,col 5)-(line 52,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.registerGroup(java.lang.String, com.google.javascript.jscomp.DiagnosticGroup...)",
      "begin_line": 55,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 62)",
        "(line 58,col 5)-(line 58,col 34)",
        "(line 59,col 5)-(line 59,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.getRegisteredGroups()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Get the registered diagnostic groups, indexed by name. ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.forName(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Find the diagnostic group registered under the given name. ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DIAGNOSTIC_GROUP_NAMES"
      ],
      "begin_line": 78,
      "end_line": 88,
      "comment": " to parser/ParserConfig.properties"
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_THIS"
      ],
      "begin_line": 90,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED"
      ],
      "begin_line": 94,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VISIBILITY"
      ],
      "begin_line": 103,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT_PROPERTY"
      ],
      "begin_line": 111,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_STANDARD_JSDOC"
      ],
      "begin_line": 116,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_CONTROLS"
      ],
      "begin_line": 120,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_CASTS"
      ],
      "begin_line": 124,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FILEOVERVIEW_JSDOC"
      ],
      "begin_line": 128,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRICT_MODULE_DEP_CHECK"
      ],
      "begin_line": 131,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VIOLATED_MODULE_DEP"
      ],
      "begin_line": 136,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS_VALIDATION"
      ],
      "begin_line": 140,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AMBIGUOUS_FUNCTION_DECL"
      ],
      "begin_line": 145,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_DEFINES"
      ],
      "begin_line": 149,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWEAKS"
      ],
      "begin_line": 153,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_PROPERTIES"
      ],
      "begin_line": 159,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERNET_EXPLORER_CHECKS"
      ],
      "begin_line": 163,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_VARIABLES"
      ],
      "begin_line": 167,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_NAMES"
      ],
      "begin_line": 171,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEBUGGER_STATEMENT_PRESENT"
      ],
      "begin_line": 175,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHECK_REGEXP"
      ],
      "begin_line": 179,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHECK_TYPES"
      ],
      "begin_line": 184,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHECK_VARIABLES"
      ],
      "begin_line": 189,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHECK_USELESS_CODE"
      ],
      "begin_line": 194,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONST"
      ],
      "begin_line": 199,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_INVALIDATION"
      ],
      "begin_line": 205,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_VARS"
      ],
      "begin_line": 209,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ES5_STRICT"
      ],
      "begin_line": 214,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHECK_PROVIDES"
      ],
      "begin_line": 225,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_MESSAGE"
      ],
      "begin_line": 229,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISPLACED_TYPE_ANNOTATION"
      ],
      "begin_line": 233,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CAST"
      ],
      "begin_line": 237,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUSPICIOUS_CODE"
      ],
      "begin_line": 241,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroups.setWarningLevel(com.google.javascript.jscomp.CompilerOptions, java.lang.String, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 249,
      "end_line": 254,
      "comment": "\n   * Adds warning levels by name.\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 42)",
        "(line 252,col 5)-(line 252,col 77)",
        "(line 253,col 5)-(line 253,col 42)"
      ]
    }
  ]
}