{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/WhitelistWarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WhitelistWarningsGuard",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.WarningsGuard"
      ],
      "begin_line": 52,
      "end_line": 294,
      "comment": "\n * An extension of {@code WarningsGuard} that provides functionality to maintain\n * a list of warnings (white-list). It is subclasses\u0027 responsibility to decide\n * what to do with the white-list by implementing the {@code level} function.\n * Warnings are defined by the name of the JS file and the first line of\n * warnings description.\n *\n * @author anatol@google.com (Anatol Pomazau)\n * @author bashir@google.com (Bashir Sadjad)\n "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SPLITTER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The set of white-listed warnings, same format as {@code formatWarning}. "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_NUMBER"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Pattern to match line number in error descriptions. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistWarningsGuard(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n   * This class depends on an input set that contains the white-list. The format\n   * of each white-list string is:\n   * \u003cfile-name\u003e:\u003cline-number\u003e?  \u003cwarning-description\u003e\n   * # \u003coptional-comment\u003e\n   *\n   * @param whitelist The set of JS-warnings that are white-listed. This is\n   *     expected to have similar format as {@code formatWarning(JSError)}.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 42)",
        "(line 72,col 5)-(line 72,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.normalizeWhitelist(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 81,
      "end_line": 94,
      "comment": "\n   * Loads legacy warnings list from the set of strings. During development line\n   * numbers are changed very often - we just cut them and compare without ones.\n   *\n   * @return known legacy warnings without line numbers.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 43)",
        "(line 83,col 5)-(line 92,col 5)",
        "(line 93,col 5)-(line 93,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 96,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 103,col 5)",
        "(line 105,col 5)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.containWarning(java.lang.String)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n   * Determines whether a given warning is included in the white-list.\n   *\n   * @param formattedWarning the warning formatted by {@code formatWarning}\n   * @return whether the given warning is white-listed or not.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.getPriority()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.fromFile(java.io.File)",
      "begin_line": 124,
      "end_line": 126,
      "comment": " Creates a warnings guard from a file. ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(java.io.File)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n   * Loads legacy warnings list from the file.\n   * @return The lines of the file.\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 134,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(com.google.common.io.InputSupplier\u003c? extends java.io.Reader\u003e)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n   * Loads legacy warnings list from the file.\n   * @return The lines of the file.\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 147,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(java.io.Reader)",
      "begin_line": 155,
      "end_line": 165,
      "comment": " TODO(nicksantos): This is a weird API.",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 39)",
        "(line 158,col 5)-(line 158,col 43)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 164,col 5)-(line 164,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(com.google.javascript.jscomp.JSError)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(com.google.javascript.jscomp.JSError, boolean)",
      "begin_line": 175,
      "end_line": 194,
      "comment": "\n   * @param withMetaData If true, include metadata that\u0027s useful to humans\n   *     This metadata won\u0027t be used for matching the warning.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 43)",
        "(line 177,col 5)-(line 177,col 44)",
        "(line 178,col 5)-(line 180,col 5)",
        "(line 181,col 5)-(line 182,col 48)",
        "(line 183,col 5)-(line 183,col 41)",
        "(line 186,col 5)-(line 191,col 5)",
        "(line 193,col 5)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.getFirstLine(java.lang.String)",
      "begin_line": 196,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 43)",
        "(line 198,col 5)-(line 200,col 5)",
        "(line 201,col 5)-(line 201,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WhitelistBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ErrorHandler"
      ],
      "begin_line": 204,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warnings"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "productName"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatorTarget"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerNote"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setProductName(java.lang.String)",
      "begin_line": 211,
      "end_line": 214,
      "comment": " Fill in your product name to get a fun message! ",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 30)",
        "(line 213,col 7)-(line 213,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setGeneratorTarget(java.lang.String)",
      "begin_line": 217,
      "end_line": 220,
      "comment": " Fill in instructions on how to generate this whitelist. ",
      "child_ranges": [
        "(line 218,col 7)-(line 218,col 34)",
        "(line 219,col 7)-(line 219,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setNote(java.lang.String)",
      "begin_line": 223,
      "end_line": 226,
      "comment": " A note to include at the top of the whitelist file. ",
      "child_ranges": [
        "(line 224,col 7)-(line 224,col 30)",
        "(line 225,col 7)-(line 225,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setWithLineNumber(boolean)",
      "begin_line": 229,
      "end_line": 232,
      "comment": " We now always record the line number. ",
      "child_ranges": [
        "(line 231,col 7)-(line 231,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.report(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 7)-(line 236,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.writeWhitelist(java.io.File)",
      "begin_line": 243,
      "end_line": 247,
      "comment": "\n     * Writes the warnings collected in a format that the WhitelistWarningsGuard\n     * can read back later.\n     ",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 48)",
        "(line 245,col 7)-(line 245,col 30)",
        "(line 246,col 7)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.appendWhitelist(java.io.PrintStream)",
      "begin_line": 253,
      "end_line": 292,
      "comment": "\n     * Writes the warnings collected in a format that the WhitelistWarningsGuard\n     * can read back later.\n     ",
      "child_ranges": [
        "(line 254,col 7)-(line 255,col 78)",
        "(line 257,col 7)-(line 260,col 7)",
        "(line 262,col 7)-(line 265,col 7)",
        "(line 267,col 7)-(line 271,col 7)",
        "(line 273,col 7)-(line 273,col 78)",
        "(line 274,col 7)-(line 278,col 7)",
        "(line 280,col 7)-(line 290,col 7)",
        "(line 291,col 7)-(line 291,col 18)"
      ]
    }
  ]
}