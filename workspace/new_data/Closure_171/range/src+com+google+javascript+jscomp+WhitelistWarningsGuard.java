{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/WhitelistWarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WhitelistWarningsGuard",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.WarningsGuard"
      ],
      "begin_line": 51,
      "end_line": 293,
      "comment": "\n * An extension of {@code WarningsGuard} that provides functionality to maintain\n * a list of warnings (white-list). It is subclasses\u0027 responsibility to decide\n * what to do with the white-list by implementing the {@code level} function.\n * Warnings are defined by the name of the JS file and the first line of\n * warnings description.\n *\n * @author anatol@google.com (Anatol Pomazau)\n * @author bashir@google.com (Bashir Sadjad)\n "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SPLITTER"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The set of white-listed warnings, same format as {@code formatWarning}. "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_NUMBER"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Pattern to match line number in error descriptions. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistWarningsGuard(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n   * This class depends on an input set that contains the white-list. The format\n   * of each white-list string is:\n   * \u003cfile-name\u003e:\u003cline-number\u003e?  \u003cwarning-description\u003e\n   * # \u003coptional-comment\u003e\n   *\n   * @param whitelist The set of JS-warnings that are white-listed. This is\n   *     expected to have similar format as {@code formatWarning(JSError)}.\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 42)",
        "(line 71,col 5)-(line 71,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.normalizeWhitelist(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 80,
      "end_line": 93,
      "comment": "\n   * Loads legacy warnings list from the set of strings. During development line\n   * numbers are changed very often - we just cut them and compare without ones.\n   *\n   * @return known legacy warnings without line numbers.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 43)",
        "(line 82,col 5)-(line 91,col 5)",
        "(line 92,col 5)-(line 92,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 95,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 102,col 5)",
        "(line 104,col 5)-(line 104,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.containWarning(java.lang.String)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n   * Determines whether a given warning is included in the white-list.\n   *\n   * @param formattedWarning the warning formatted by {@code formatWarning}\n   * @return whether the given warning is white-listed or not.\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.getPriority()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.fromFile(java.io.File)",
      "begin_line": 123,
      "end_line": 125,
      "comment": " Creates a warnings guard from a file. ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(java.io.File)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n   * Loads legacy warnings list from the file.\n   * @return The lines of the file.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(com.google.common.io.CharSource)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n   * Loads legacy warnings list from the file.\n   * @return The lines of the file.\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 145,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(java.io.Reader)",
      "begin_line": 153,
      "end_line": 163,
      "comment": " TODO(nicksantos): This is a weird API.",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 39)",
        "(line 156,col 5)-(line 156,col 43)",
        "(line 158,col 5)-(line 160,col 5)",
        "(line 162,col 5)-(line 162,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(com.google.javascript.jscomp.JSError)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(com.google.javascript.jscomp.JSError, boolean)",
      "begin_line": 173,
      "end_line": 192,
      "comment": "\n   * @param withMetaData If true, include metadata that\u0027s useful to humans\n   *     This metadata won\u0027t be used for matching the warning.\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 43)",
        "(line 175,col 5)-(line 175,col 44)",
        "(line 176,col 5)-(line 178,col 5)",
        "(line 179,col 5)-(line 180,col 48)",
        "(line 181,col 5)-(line 181,col 41)",
        "(line 184,col 5)-(line 189,col 5)",
        "(line 191,col 5)-(line 191,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.getFirstLine(java.lang.String)",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 43)",
        "(line 196,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WhitelistBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ErrorHandler"
      ],
      "begin_line": 203,
      "end_line": 292,
      "comment": " Whitelist builder "
    },
    {
      "type": "field",
      "varNames": [
        "warnings"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "productName"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatorTarget"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerNote"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setProductName(java.lang.String)",
      "begin_line": 210,
      "end_line": 213,
      "comment": " Fill in your product name to get a fun message! ",
      "child_ranges": [
        "(line 211,col 7)-(line 211,col 30)",
        "(line 212,col 7)-(line 212,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setGeneratorTarget(java.lang.String)",
      "begin_line": 216,
      "end_line": 219,
      "comment": " Fill in instructions on how to generate this whitelist. ",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 34)",
        "(line 218,col 7)-(line 218,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setNote(java.lang.String)",
      "begin_line": 222,
      "end_line": 225,
      "comment": " A note to include at the top of the whitelist file. ",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 30)",
        "(line 224,col 7)-(line 224,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.setWithLineNumber(boolean)",
      "begin_line": 228,
      "end_line": 231,
      "comment": " We now always record the line number. ",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.report(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 7)-(line 235,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.writeWhitelist(java.io.File)",
      "begin_line": 242,
      "end_line": 246,
      "comment": "\n     * Writes the warnings collected in a format that the WhitelistWarningsGuard\n     * can read back later.\n     ",
      "child_ranges": [
        "(line 243,col 7)-(line 243,col 48)",
        "(line 244,col 7)-(line 244,col 30)",
        "(line 245,col 7)-(line 245,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.appendWhitelist(java.io.PrintStream)",
      "begin_line": 252,
      "end_line": 291,
      "comment": "\n     * Writes the warnings collected in a format that the WhitelistWarningsGuard\n     * can read back later.\n     ",
      "child_ranges": [
        "(line 253,col 7)-(line 254,col 78)",
        "(line 256,col 7)-(line 259,col 7)",
        "(line 261,col 7)-(line 264,col 7)",
        "(line 266,col 7)-(line 270,col 7)",
        "(line 272,col 7)-(line 272,col 78)",
        "(line 273,col 7)-(line 277,col 7)",
        "(line 279,col 7)-(line 289,col 7)",
        "(line 290,col 7)-(line 290,col 18)"
      ]
    }
  ]
}