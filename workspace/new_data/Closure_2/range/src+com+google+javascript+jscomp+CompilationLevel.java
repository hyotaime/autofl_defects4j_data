{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CompilationLevel.java",
  "nodes": [
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilationLevel.CompilationLevel()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilationLevel.setOptionsForCompilationLevel(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 53,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 66,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilationLevel.setDebugOptionsForCompilationLevel(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 77)",
        "(line 71,col 5)-(line 71,col 39)",
        "(line 72,col 5)-(line 72,col 41)",
        "(line 74,col 5)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilationLevel.applyBasicCompilationOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n   * Gets options that only strip whitespace and comments.\n   * @param options The CompilerOptions object to set the options on.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 36)",
        "(line 85,col 5)-(line 86,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilationLevel.applySafeCompilationOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 95,
      "end_line": 125,
      "comment": "\n   * Add options that are safe. Safe means options that won\u0027t break the\n   * JavaScript code even if no symbols are exported and no coding convention\n   * is used.\n   * @param options The CompilerOptions object to set the options on.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 40)",
        "(line 101,col 5)-(line 101,col 57)",
        "(line 102,col 5)-(line 102,col 31)",
        "(line 103,col 5)-(line 104,col 66)",
        "(line 105,col 5)-(line 105,col 35)",
        "(line 106,col 5)-(line 106,col 49)",
        "(line 107,col 5)-(line 107,col 48)",
        "(line 108,col 5)-(line 108,col 49)",
        "(line 109,col 5)-(line 109,col 50)",
        "(line 110,col 5)-(line 110,col 33)",
        "(line 111,col 5)-(line 111,col 41)",
        "(line 112,col 5)-(line 112,col 45)",
        "(line 113,col 5)-(line 113,col 48)",
        "(line 114,col 5)-(line 114,col 45)",
        "(line 115,col 5)-(line 115,col 33)",
        "(line 116,col 5)-(line 116,col 34)",
        "(line 117,col 5)-(line 117,col 42)",
        "(line 118,col 5)-(line 118,col 55)",
        "(line 119,col 5)-(line 119,col 42)",
        "(line 120,col 5)-(line 120,col 44)",
        "(line 123,col 5)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilationLevel.applyFullCompilationOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 132,
      "end_line": 189,
      "comment": "\n   * Add the options that will work only if the user exported all the symbols\n   * correctly.\n   * @param options The CompilerOptions object to set the options on.\n   ",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 57)",
        "(line 138,col 5)-(line 138,col 31)",
        "(line 139,col 5)-(line 139,col 33)",
        "(line 140,col 5)-(line 140,col 41)",
        "(line 141,col 5)-(line 141,col 45)",
        "(line 142,col 5)-(line 142,col 54)",
        "(line 143,col 5)-(line 143,col 48)",
        "(line 144,col 5)-(line 144,col 45)",
        "(line 145,col 5)-(line 145,col 46)",
        "(line 146,col 5)-(line 146,col 33)",
        "(line 147,col 5)-(line 147,col 34)",
        "(line 148,col 5)-(line 148,col 42)",
        "(line 149,col 5)-(line 149,col 42)",
        "(line 150,col 5)-(line 150,col 44)",
        "(line 153,col 5)-(line 153,col 40)",
        "(line 154,col 5)-(line 154,col 33)",
        "(line 155,col 5)-(line 155,col 37)",
        "(line 156,col 5)-(line 157,col 73)",
        "(line 158,col 5)-(line 158,col 35)",
        "(line 159,col 5)-(line 159,col 51)",
        "(line 160,col 5)-(line 160,col 60)",
        "(line 161,col 5)-(line 161,col 46)",
        "(line 162,col 5)-(line 162,col 38)",
        "(line 163,col 5)-(line 163,col 54)",
        "(line 164,col 5)-(line 164,col 46)",
        "(line 165,col 5)-(line 165,col 36)",
        "(line 166,col 5)-(line 166,col 38)",
        "(line 167,col 5)-(line 167,col 42)",
        "(line 168,col 5)-(line 168,col 33)",
        "(line 169,col 5)-(line 169,col 42)",
        "(line 170,col 5)-(line 170,col 48)",
        "(line 171,col 5)-(line 171,col 46)",
        "(line 174,col 5)-(line 174,col 48)",
        "(line 177,col 5)-(line 177,col 41)",
        "(line 178,col 5)-(line 178,col 43)",
        "(line 181,col 5)-(line 181,col 48)",
        "(line 182,col 5)-(line 182,col 38)",
        "(line 183,col 5)-(line 183,col 35)",
        "(line 184,col 5)-(line 184,col 33)",
        "(line 187,col 5)-(line 188,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilationLevel.setTypeBasedOptimizationOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 195,
      "end_line": 211,
      "comment": "\n   * Enable additional optimizations that use type information.\n   * @param options The CompilerOptions object to set the options on.\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 210,col 5)"
      ]
    }
  ]
}