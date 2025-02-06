{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeSubstituteAlternateSyntax.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeSubstituteAlternateSyntax",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 35,
      "end_line": 641,
      "comment": "\n * A peephole optimization that minimizes code by simplifying conditional\n * expressions, replacing IFs with HOOKs, replacing object constructors\n * with literals, and simplifying returns.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "REGEXP_ESCAPER"
      ],
      "begin_line": 38,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_SPLIT_OVERHEAD"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_REGULAR_EXPRESSION_FLAGS"
      ],
      "begin_line": 46,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.PeepholeSubstituteAlternateSyntax(boolean)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n   * @param late When late is false, this mean we are currently running before\n   * most of the other optimizations. In this case we would avoid optimizations\n   * that would make the code harder to analyze (such as using string splitting,\n   * merging statements with commas, etc). When this is true, we would\n   * do anything to minimize for size.\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 105,
      "comment": "\n   * Tries apply our various peephole minimizations on the passed in node.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 104,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)",
      "begin_line": 107,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 41)",
        "(line 109,col 5)-(line 109,col 40)",
        "(line 110,col 5)-(line 128,col 5)",
        "(line 129,col 5)-(line 129,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)",
      "begin_line": 132,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 41)",
        "(line 135,col 5)-(line 135,col 40)",
        "(line 136,col 5)-(line 136,col 78)",
        "(line 137,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(com.google.javascript.rhino.Node)",
      "begin_line": 171,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 174,col 5)",
        "(line 175,col 5)-(line 175,col 32)",
        "(line 176,col 5)-(line 176,col 34)",
        "(line 177,col 5)-(line 177,col 34)",
        "(line 179,col 5)-(line 196,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReplaceUndefined(com.google.javascript.rhino.Node)",
      "begin_line": 202,
      "end_line": 213,
      "comment": "\n   * Use \"void 0\" in place of \"undefined\"\n   ",
      "child_ranges": [
        "(line 204,col 5)-(line 211,col 5)",
        "(line 212,col 5)-(line 212,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(com.google.javascript.rhino.Node)",
      "begin_line": 220,
      "end_line": 243,
      "comment": "\n   * Reduce \"return undefined\" or \"return void 0\" to simply \"return\".\n   *\n   * @return The original node, maybe simplified.\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 36)",
        "(line 223,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 242,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_OBJECT_CONSTRUCTORS"
      ],
      "begin_line": 245,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors(com.google.javascript.rhino.Node)",
      "begin_line": 259,
      "end_line": 277,
      "comment": "\n   * Fold \"new Object()\" to \"Object()\".\n   ",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 40)",
        "(line 265,col 5)-(line 274,col 5)",
        "(line 276,col 5)-(line 276,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor(com.google.javascript.rhino.Node)",
      "begin_line": 283,
      "end_line": 331,
      "comment": "\n   * Replaces a new Array or Object node with an object literal, unless the\n   * call to Array or Object is to a local function with the same name.\n   ",
      "child_ranges": [
        "(line 284,col 5)-(line 285,col 22)",
        "(line 287,col 5)-(line 287,col 49)",
        "(line 289,col 5)-(line 289,col 31)",
        "(line 295,col 5)-(line 329,col 5)",
        "(line 330,col 5)-(line 330,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)",
      "begin_line": 342,
      "end_line": 369,
      "comment": "\n   * Checks if it is safe to fold Array() constructor into []. It can be\n   * obviously done, if the initial constructor has either no arguments or\n   * at least two. The remaining case may be unsafe since Array(number)\n   * actually reserves memory for an empty array which contains number elements.\n   ",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 62)",
        "(line 345,col 5)-(line 367,col 5)",
        "(line 368,col 5)-(line 368,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)",
      "begin_line": 371,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 32)",
        "(line 373,col 5)-(line 373,col 41)",
        "(line 374,col 5)-(line 374,col 41)",
        "(line 375,col 5)-(line 375,col 60)",
        "(line 377,col 5)-(line 380,col 5)",
        "(line 382,col 5)-(line 423,col 5)",
        "(line 425,col 5)-(line 425,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.reduceTrueFalse(com.google.javascript.rhino.Node)",
      "begin_line": 428,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 429,col 5)-(line 435,col 5)",
        "(line 436,col 5)-(line 436,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 439,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 440,col 5)-(line 440,col 30)",
        "(line 441,col 5)-(line 445,col 5)",
        "(line 447,col 5)-(line 451,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 457,col 5)",
        "(line 459,col 5)-(line 459,col 40)",
        "(line 461,col 5)-(line 461,col 57)",
        "(line 462,col 5)-(line 464,col 5)",
        "(line 466,col 5)-(line 466,col 53)",
        "(line 467,col 5)-(line 467,col 16)",
        "(line 468,col 5)-(line 470,col 5)",
        "(line 474,col 5)-(line 474,col 46)",
        "(line 475,col 5)-(line 486,col 5)",
        "(line 487,col 5)-(line 487,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter(java.lang.String[])",
      "begin_line": 495,
      "end_line": 519,
      "comment": "\n   * Find a delimiter that does not occur in the given strings\n   * @param strings The strings that must be separated.\n   * @return a delimiter string or null\n   ",
      "child_ranges": [
        "(line 496,col 5)-(line 496,col 30)",
        "(line 497,col 5)-(line 502,col 5)",
        "(line 504,col 5)-(line 506,col 5)",
        "(line 508,col 5)-(line 508,col 70)",
        "(line 509,col 5)-(line 509,col 14)",
        "(line 510,col 5)-(line 517,col 5)",
        "(line 518,col 5)-(line 518,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "REGEXP_FLAGS_RE"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areValidRegexpFlags(java.lang.String)",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n   * are the given flags valid regular expression flags?\n   * JavaScript recognizes several suffix flags for regular expressions,\n   * \u0027g\u0027 - global replace, \u0027i\u0027 - case insensitive, \u0027m\u0027 - multi-line.\n   * They are case insensitive, and JavaScript does not recognize the extended\n   * syntax mode, single-line mode, or expression replacement mode from Perl 5.\n   ",
      "child_ranges": [
        "(line 531,col 5)-(line 531,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold(java.lang.String)",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\n   * are the given flags safe to fold?\n   * We don\u0027t fold the regular expression if global (\u0027g\u0027) flag is on,\n   * because in this case it isn\u0027t really a constant: its \u0027lastIndex\u0027\n   * property contains the state of last execution, so replacing\n   * \u0027new RegExp(\u0027foobar\u0027,\u0027g\u0027)\u0027 with \u0027/foobar/g\u0027 may change the behavior of\n   * the program if the RegExp is used inside a loop, for example.\n   * \u003cp\u003e\n   * ECMAScript 5 explicitly disallows pooling of regular expression literals so\n   * in ECMAScript 5, {@code /foo/g} and {@code new RegExp(\u0027foo\u0027, \u0027g\u0027)} are\n   * equivalent.\n   * From section 7.8.5:\n   * \"Then each time the literal is evaluated, a new object is created as if by\n   * the expression new RegExp(Pattern, Flags) where RegExp is the standard\n   * built-in constructor with that name.\"\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 551,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)",
      "begin_line": 557,
      "end_line": 622,
      "comment": "\n   * returns a string node that can safely be rendered inside /brackets/.\n   ",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 29)",
        "(line 560,col 5)-(line 560,col 28)",
        "(line 561,col 5)-(line 561,col 16)",
        "(line 562,col 5)-(line 562,col 49)",
        "(line 563,col 5)-(line 616,col 5)",
        "(line 618,col 5)-(line 618,col 45)",
        "(line 620,col 5)-(line 620,col 34)",
        "(line 621,col 5)-(line 621,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(java.lang.String)",
      "begin_line": 628,
      "end_line": 640,
      "comment": "\n   * true if the JavaScript string would contain a Unicode escape when written\n   * out as the body of a regular expression literal.\n   ",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 48)",
        "(line 630,col 5)-(line 638,col 5)",
        "(line 639,col 5)-(line 639,col 17)"
      ]
    }
  ]
}