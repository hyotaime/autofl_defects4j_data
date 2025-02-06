{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/regex/RegExpTree.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegExpTree",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 1859,
      "comment": "\n * An AST for JavaScript regular expressions.\n *\n * @author Mike Samuel \u003cmikesamuel@gmail.com\u003e\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.simplify(java.lang.String)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n   * Returns a simpler regular expression that is semantically the same assuming\n   * the given flags.\n   * @param flags Regular expression flags, e.g. {@code \"igm\"}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.isCaseSensitive()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n   * True if the presence or absence of an {@code \"i\"} flag would change the\n   * meaning of this regular expression.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.containsAnchor()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n   * True if the regular expression contains an anchor : {@code ^} or {@code $}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.hasCapturingGroup()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n   * True if the regular expression contains capturing groups.\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.numCapturingGroups()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * The number of capturing groups.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.children()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * The children of this node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n   * Appends this regular expression source to the given buffer.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.toString()",
      "begin_line": 79,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 43)",
        "(line 82,col 5)-(line 82,col 19)",
        "(line 83,col 5)-(line 83,col 25)",
        "(line 85,col 5)-(line 87,col 5)",
        "(line 88,col 5)-(line 88,col 19)",
        "(line 89,col 5)-(line 89,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.toDebugString()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 43)",
        "(line 94,col 5)-(line 94,col 26)",
        "(line 95,col 5)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.appendDebugString(java.lang.StringBuilder)",
      "begin_line": 98,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 54)",
        "(line 100,col 5)-(line 100,col 26)",
        "(line 101,col 5)-(line 101,col 19)",
        "(line 102,col 5)-(line 102,col 24)",
        "(line 103,col 5)-(line 103,col 54)",
        "(line 104,col 5)-(line 107,col 5)",
        "(line 108,col 5)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.equals(java.lang.Object)",
      "begin_line": 111,
      "end_line": 112,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.hashCode()",
      "begin_line": 114,
      "end_line": 115,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.parseRegExp(java.lang.String, java.lang.String)",
      "begin_line": 124,
      "end_line": 558,
      "comment": "\n   * Parses a regular expression to an AST.\n   *\n   * @param pattern The {@code foo} From {@code /foo/i}.\n   * @param flags The {@code i} From {@code /foo/i}.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 555,col 5)",
        "(line 557,col 5)-(line 557,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 128,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The number of characters in pattern consumed. "
    },
    {
      "type": "field",
      "varNames": [
        "numCapturingGroups"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The number of capturing groups seen so far. "
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The length of pattern. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseTopLevel()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 21)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parse()",
      "begin_line": 145,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 62)",
        "(line 149,col 9)-(line 149,col 35)",
        "(line 151,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 60)",
        "(line 242,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseParenthetical()",
      "begin_line": 255,
      "end_line": 295,
      "comment": "\n       * Handles capturing groups {@code (...)},\n       * non-capturing groups {@code (?:...)}, and lookahead assertions\n       * {@code (?\u003d...)}.\n       ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 61)",
        "(line 257,col 9)-(line 257,col 24)",
        "(line 258,col 9)-(line 258,col 14)",
        "(line 259,col 9)-(line 259,col 33)",
        "(line 260,col 9)-(line 260,col 21)",
        "(line 261,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseCharset()",
      "begin_line": 302,
      "end_line": 370,
      "comment": "\n       * Parses a square bracketed character set.\n       * Standalone character groups (@code /\\d/} are handled by\n       * {@link #parseEscape}.\n       ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 61)",
        "(line 304,col 9)-(line 304,col 14)",
        "(line 306,col 9)-(line 306,col 60)",
        "(line 307,col 9)-(line 307,col 68)",
        "(line 308,col 9)-(line 308,col 31)",
        "(line 309,col 9)-(line 309,col 45)",
        "(line 310,col 9)-(line 310,col 50)",
        "(line 311,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 14)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseEscapeChar()",
      "begin_line": 378,
      "end_line": 411,
      "comment": "\n       * Parses an escape to a code point.\n       * Some of the characters parsed here have special meanings in various\n       * contexts, so contexts must filter those instead.\n       * E.g. \u0027\\b\u0027 means a different thing inside a charset than without.\n       ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 40)",
        "(line 380,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseEscape()",
      "begin_line": 416,
      "end_line": 453,
      "comment": "\n       * Parses an escape that appears outside a charset.\n       ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 62)",
        "(line 418,col 9)-(line 418,col 14)",
        "(line 419,col 9)-(line 419,col 38)",
        "(line 420,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseHex(int)",
      "begin_line": 458,
      "end_line": 480,
      "comment": "\n       * Parses n hex digits to a code-unit.\n       ",
      "child_ranges": [
        "(line 459,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 23)",
        "(line 464,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.isRepetitionStart(char)",
      "begin_line": 482,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Parser.parseRepetition(com.google.javascript.jscomp.regex.RegExpTree)",
      "begin_line": 498,
      "end_line": 554,
      "comment": "\n       * Parse a repetition.  {@code x?} is treated as a repetition --\n       * an optional production can be matched 0 or 1 time.\n       ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 42)",
        "(line 500,col 9)-(line 500,col 21)",
        "(line 501,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 30)",
        "(line 549,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.matchesWholeInput(com.google.javascript.jscomp.regex.RegExpTree, java.lang.String)",
      "begin_line": 565,
      "end_line": 578,
      "comment": "\n   * True if, but not necessarily always when the, given regular expression\n   * must match the whole input or none of it.\n   ",
      "child_ranges": [
        "(line 566,col 5)-(line 566,col 50)",
        "(line 568,col 5)-(line 570,col 5)",
        "(line 572,col 5)-(line 572,col 40)",
        "(line 573,col 5)-(line 573,col 47)",
        "(line 574,col 5)-(line 575,col 53)",
        "(line 576,col 5)-(line 576,col 79)",
        "(line 577,col 5)-(line 577,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RegExpTreeAtom",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree"
      ],
      "begin_line": 581,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom.isCaseSensitive()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 7)-(line 584,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom.containsAnchor()",
      "begin_line": 587,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 7)-(line 589,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom.numCapturingGroups()",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 7)-(line 594,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom.children()",
      "begin_line": 597,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 599,col 7)-(line 599,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Empty",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom"
      ],
      "begin_line": 603,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 604,
      "end_line": 604,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Empty.simplify(java.lang.String)",
      "begin_line": 606,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 7)-(line 608,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Empty.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 611,
      "end_line": 614,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Empty.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 616,
      "end_line": 619,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Empty.equals(java.lang.Object)",
      "begin_line": 621,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 623,col 7)-(line 623,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Empty.hashCode()",
      "begin_line": 626,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 628,col 7)-(line 628,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Anchor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom"
      ],
      "begin_line": 632,
      "end_line": 665,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 633,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.Anchor(char)",
      "begin_line": 634,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 634,col 25)-(line 634,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.simplify(java.lang.String)",
      "begin_line": 636,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 7)-(line 638,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.containsAnchor()",
      "begin_line": 641,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 643,col 7)-(line 643,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 646,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 648,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 651,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 653,col 7)-(line 653,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.equals(java.lang.Object)",
      "begin_line": 656,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 658,col 7)-(line 658,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Anchor.hashCode()",
      "begin_line": 661,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 663,col 7)-(line 663,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WordBoundary",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom"
      ],
      "begin_line": 667,
      "end_line": 698,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 668,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.WordBoundary(char)",
      "begin_line": 670,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 7)-(line 671,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.simplify(java.lang.String)",
      "begin_line": 674,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 676,col 7)-(line 676,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 679,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 7)-(line 681,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 684,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.equals(java.lang.Object)",
      "begin_line": 689,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 691,col 7)-(line 691,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.hashCode()",
      "begin_line": 694,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 696,col 7)-(line 696,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BackReference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom"
      ],
      "begin_line": 700,
      "end_line": 733,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupIndex"
      ],
      "begin_line": 701,
      "end_line": 701,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.BackReference.BackReference(int)",
      "begin_line": 703,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 704,col 7)-(line 704,col 71)",
        "(line 705,col 7)-(line 705,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.BackReference.simplify(java.lang.String)",
      "begin_line": 708,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 710,col 7)-(line 710,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.BackReference.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 713,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 715,col 7)-(line 715,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.BackReference.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 718,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 720,col 7)-(line 720,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.BackReference.equals(java.lang.Object)",
      "begin_line": 723,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 725,col 7)-(line 726,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.BackReference.hashCode()",
      "begin_line": 729,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 731,col 7)-(line 731,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Text",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom"
      ],
      "begin_line": 735,
      "end_line": 821,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 736,
      "end_line": 736,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.Text(java.lang.String)",
      "begin_line": 738,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 739,col 7)-(line 739,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.escapeRegularCharOnto(char, int, java.lang.StringBuilder)",
      "begin_line": 746,
      "end_line": 773,
      "comment": "\n     * @param ch The code-unit to escape.\n     * @param next The next code-unit or -1 if indeterminable.\n     ",
      "child_ranges": [
        "(line 748,col 7)-(line 772,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.simplify(java.lang.String)",
      "begin_line": 775,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 777,col 7)-(line 777,col 28)",
        "(line 778,col 7)-(line 780,col 7)",
        "(line 781,col 7)-(line 786,col 7)",
        "(line 787,col 7)-(line 787,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.isCaseSensitive()",
      "begin_line": 790,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 792,col 7)-(line 796,col 7)",
        "(line 797,col 7)-(line 797,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 800,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 802,col 7)-(line 804,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 807,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 809,col 7)-(line 809,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.equals(java.lang.Object)",
      "begin_line": 812,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 814,col 7)-(line 814,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Text.hashCode()",
      "begin_line": 817,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 819,col 7)-(line 819,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Repetition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree"
      ],
      "begin_line": 823,
      "end_line": 1006,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "body"
      ],
      "begin_line": 824,
      "end_line": 824,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "min",
        "max"
      ],
      "begin_line": 825,
      "end_line": 825,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "greedy"
      ],
      "begin_line": 826,
      "end_line": 826,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.Repetition(com.google.javascript.jscomp.regex.RegExpTree, int, int, boolean)",
      "begin_line": 828,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 829,col 7)-(line 829,col 23)",
        "(line 830,col 7)-(line 830,col 21)",
        "(line 831,col 7)-(line 831,col 21)",
        "(line 832,col 7)-(line 832,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.simplify(java.lang.String)",
      "begin_line": 835,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 837,col 7)-(line 837,col 50)",
        "(line 838,col 7)-(line 838,col 75)",
        "(line 839,col 7)-(line 839,col 79)",
        "(line 840,col 7)-(line 840,col 25)",
        "(line 841,col 7)-(line 841,col 25)",
        "(line 842,col 7)-(line 853,col 7)",
        "(line 854,col 7)-(line 854,col 48)",
        "(line 855,col 7)-(line 855,col 49)",
        "(line 856,col 7)-(line 859,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.isCaseSensitive()",
      "begin_line": 862,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 864,col 7)-(line 864,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.containsAnchor()",
      "begin_line": 867,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 869,col 7)-(line 869,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.numCapturingGroups()",
      "begin_line": 872,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.children()",
      "begin_line": 877,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 879,col 7)-(line 879,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.appendBodySourceCode(java.lang.StringBuilder)",
      "begin_line": 882,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 883,col 7)-(line 891,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.suffixLen(int, int)",
      "begin_line": 894,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 896,col 7)-(line 902,col 7)",
        "(line 903,col 7)-(line 905,col 7)",
        "(line 906,col 7)-(line 911,col 7)",
        "(line 912,col 7)-(line 912,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.numDecimalDigits(int)",
      "begin_line": 915,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 916,col 7)-(line 921,col 7)",
        "(line 922,col 7)-(line 922,col 22)",
        "(line 923,col 7)-(line 926,col 7)",
        "(line 927,col 7)-(line 927,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 930,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 932,col 7)-(line 932,col 34)",
        "(line 933,col 7)-(line 933,col 31)",
        "(line 934,col 7)-(line 934,col 32)",
        "(line 935,col 7)-(line 935,col 40)",
        "(line 936,col 7)-(line 936,col 25)",
        "(line 937,col 7)-(line 937,col 25)",
        "(line 938,col 7)-(line 963,col 7)",
        "(line 965,col 7)-(line 980,col 7)",
        "(line 981,col 7)-(line 983,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 986,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 988,col 7)-(line 988,col 66)",
        "(line 989,col 7)-(line 989,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.equals(java.lang.Object)",
      "begin_line": 992,
      "end_line": 1000,
      "comment": "",
      "child_ranges": [
        "(line 994,col 7)-(line 994,col 55)",
        "(line 995,col 7)-(line 995,col 39)",
        "(line 996,col 7)-(line 999,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Repetition.hashCode()",
      "begin_line": 1002,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 7)-(line 1004,col 79)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Alternation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree"
      ],
      "begin_line": 1008,
      "end_line": 1154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternatives"
      ],
      "begin_line": 1009,
      "end_line": 1009,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.Alternation(java.util.List\u003c? extends com.google.javascript.jscomp.regex.RegExpTree\u003e)",
      "begin_line": 1011,
      "end_line": 1013,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 7)-(line 1012,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.simplify(java.lang.String)",
      "begin_line": 1015,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1017,col 7)-(line 1017,col 59)",
        "(line 1018,col 7)-(line 1025,col 7)",
        "(line 1027,col 7)-(line 1027,col 29)",
        "(line 1028,col 7)-(line 1036,col 7)",
        "(line 1038,col 7)-(line 1081,col 7)",
        "(line 1082,col 7)-(line 1092,col 7)",
        "(line 1094,col 7)-(line 1095,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.isCaseSensitive()",
      "begin_line": 1098,
      "end_line": 1104,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 7)-(line 1102,col 7)",
        "(line 1103,col 7)-(line 1103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.containsAnchor()",
      "begin_line": 1106,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1108,col 7)-(line 1110,col 7)",
        "(line 1111,col 7)-(line 1111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.numCapturingGroups()",
      "begin_line": 1114,
      "end_line": 1121,
      "comment": "",
      "child_ranges": [
        "(line 1116,col 7)-(line 1116,col 16)",
        "(line 1117,col 7)-(line 1119,col 7)",
        "(line 1120,col 7)-(line 1120,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.children()",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 7)-(line 1125,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 1128,
      "end_line": 1136,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 7)-(line 1135,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 1138,
      "end_line": 1141,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.equals(java.lang.Object)",
      "begin_line": 1143,
      "end_line": 1148,
      "comment": "",
      "child_ranges": [
        "(line 1145,col 7)-(line 1147,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Alternation.hashCode()",
      "begin_line": 1150,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 7)-(line 1152,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NEVER_MATCHES"
      ],
      "begin_line": 1156,
      "end_line": 1157,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LookaheadAssertion",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree"
      ],
      "begin_line": 1159,
      "end_line": 1222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "body"
      ],
      "begin_line": 1160,
      "end_line": 1160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "positive"
      ],
      "begin_line": 1161,
      "end_line": 1161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.LookaheadAssertion(com.google.javascript.jscomp.regex.RegExpTree, boolean)",
      "begin_line": 1163,
      "end_line": 1166,
      "comment": "",
      "child_ranges": [
        "(line 1164,col 7)-(line 1164,col 23)",
        "(line 1165,col 7)-(line 1165,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.simplify(java.lang.String)",
      "begin_line": 1168,
      "end_line": 1177,
      "comment": "",
      "child_ranges": [
        "(line 1170,col 7)-(line 1170,col 51)",
        "(line 1171,col 7)-(line 1175,col 7)",
        "(line 1176,col 7)-(line 1176,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.isCaseSensitive()",
      "begin_line": 1179,
      "end_line": 1182,
      "comment": "",
      "child_ranges": [
        "(line 1181,col 7)-(line 1181,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.containsAnchor()",
      "begin_line": 1184,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 7)-(line 1186,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.numCapturingGroups()",
      "begin_line": 1189,
      "end_line": 1192,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 7)-(line 1191,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.children()",
      "begin_line": 1194,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1196,col 7)-(line 1196,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 1199,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1201,col 7)-(line 1201,col 42)",
        "(line 1202,col 7)-(line 1202,col 32)",
        "(line 1203,col 7)-(line 1203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 1206,
      "end_line": 1209,
      "comment": "",
      "child_ranges": [
        "(line 1208,col 7)-(line 1208,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.equals(java.lang.Object)",
      "begin_line": 1211,
      "end_line": 1216,
      "comment": "",
      "child_ranges": [
        "(line 1213,col 7)-(line 1213,col 63)",
        "(line 1214,col 7)-(line 1214,col 55)",
        "(line 1215,col 7)-(line 1215,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.hashCode()",
      "begin_line": 1218,
      "end_line": 1221,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 7)-(line 1220,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CapturingGroup",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree"
      ],
      "begin_line": 1224,
      "end_line": 1278,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "body"
      ],
      "begin_line": 1225,
      "end_line": 1225,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.CapturingGroup(com.google.javascript.jscomp.regex.RegExpTree)",
      "begin_line": 1227,
      "end_line": 1229,
      "comment": "",
      "child_ranges": [
        "(line 1228,col 7)-(line 1228,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.simplify(java.lang.String)",
      "begin_line": 1231,
      "end_line": 1234,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 7)-(line 1233,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.isCaseSensitive()",
      "begin_line": 1236,
      "end_line": 1239,
      "comment": "",
      "child_ranges": [
        "(line 1238,col 7)-(line 1238,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.containsAnchor()",
      "begin_line": 1241,
      "end_line": 1244,
      "comment": "",
      "child_ranges": [
        "(line 1243,col 7)-(line 1243,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.numCapturingGroups()",
      "begin_line": 1246,
      "end_line": 1249,
      "comment": "",
      "child_ranges": [
        "(line 1248,col 7)-(line 1248,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.children()",
      "begin_line": 1251,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 7)-(line 1253,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 1256,
      "end_line": 1261,
      "comment": "",
      "child_ranges": [
        "(line 1258,col 7)-(line 1258,col 21)",
        "(line 1259,col 7)-(line 1259,col 32)",
        "(line 1260,col 7)-(line 1260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 1263,
      "end_line": 1266,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.equals(java.lang.Object)",
      "begin_line": 1268,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1270,col 7)-(line 1271,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup.hashCode()",
      "begin_line": 1274,
      "end_line": 1277,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 7)-(line 1276,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS"
      ],
      "begin_line": 1280,
      "end_line": 1280,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UCASE_LETTERS"
      ],
      "begin_line": 1282,
      "end_line": 1283,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LCASE_LETTERS"
      ],
      "begin_line": 1285,
      "end_line": 1286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LETTERS"
      ],
      "begin_line": 1288,
      "end_line": 1288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD_CHARS"
      ],
      "begin_line": 1290,
      "end_line": 1291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVERSE_WORD_CHARS"
      ],
      "begin_line": 1293,
      "end_line": 1294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPACE_CHARS"
      ],
      "begin_line": 1296,
      "end_line": 1309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IE_SPACE_CHARS"
      ],
      "begin_line": 1312,
      "end_line": 1314,
      "comment": " IE is broken around \\s.  IE (6, 7, 8 at least), only recognize these. "
    },
    {
      "type": "field",
      "varNames": [
        "IE_SPEC_ERRORS"
      ],
      "begin_line": 1317,
      "end_line": 1318,
      "comment": " IE is broken around \\s.  IE (6, 7, 8 at least), only recognize these. "
    },
    {
      "type": "field",
      "varNames": [
        "NAMED_CHAR_GROUPS"
      ],
      "begin_line": 1320,
      "end_line": 1328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DOT_CHARSET"
      ],
      "begin_line": 1330,
      "end_line": 1333,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Charset",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom"
      ],
      "begin_line": 1335,
      "end_line": 1504,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ranges"
      ],
      "begin_line": 1336,
      "end_line": 1336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ieExplicits"
      ],
      "begin_line": 1342,
      "end_line": 1342,
      "comment": "\n     * Code units that were mentioned explicitly and that might be matched by\n     * a group according to ECMAScript 5 but would not because of specification\n     * violations in IE.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.Charset(com.google.javascript.jscomp.regex.CharRanges, com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 1344,
      "end_line": 1347,
      "comment": "",
      "child_ranges": [
        "(line 1345,col 7)-(line 1345,col 27)",
        "(line 1346,col 7)-(line 1346,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.complexityWordFolded(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 1349,
      "end_line": 1354,
      "comment": "",
      "child_ranges": [
        "(line 1350,col 7)-(line 1353,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.complexityWordFoldedHelper(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 1356,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1357,col 7)-(line 1357,col 60)",
        "(line 1358,col 7)-(line 1362,col 7)",
        "(line 1363,col 7)-(line 1368,col 7)",
        "(line 1369,col 7)-(line 1369,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.simplify(java.lang.String)",
      "begin_line": 1372,
      "end_line": 1418,
      "comment": "",
      "child_ranges": [
        "(line 1374,col 7)-(line 1376,col 7)",
        "(line 1377,col 7)-(line 1377,col 31)",
        "(line 1378,col 7)-(line 1406,col 7)",
        "(line 1408,col 7)-(line 1411,col 7)",
        "(line 1413,col 7)-(line 1415,col 7)",
        "(line 1417,col 7)-(line 1417,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.isCaseSensitive()",
      "begin_line": 1420,
      "end_line": 1433,
      "comment": "",
      "child_ranges": [
        "(line 1430,col 7)-(line 1430,col 57)",
        "(line 1431,col 7)-(line 1432,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.decompose(com.google.javascript.jscomp.regex.CharRanges, boolean)",
      "begin_line": 1435,
      "end_line": 1464,
      "comment": "",
      "child_ranges": [
        "(line 1436,col 7)-(line 1436,col 54)",
        "(line 1437,col 7)-(line 1437,col 75)",
        "(line 1438,col 7)-(line 1462,col 7)",
        "(line 1463,col 7)-(line 1463,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 1466,
      "end_line": 1473,
      "comment": "",
      "child_ranges": [
        "(line 1468,col 7)-(line 1471,col 7)",
        "(line 1472,col 7)-(line 1472,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.decompose()",
      "begin_line": 1475,
      "end_line": 1488,
      "comment": "",
      "child_ranges": [
        "(line 1476,col 7)-(line 1476,col 74)",
        "(line 1477,col 7)-(line 1483,col 7)",
        "(line 1484,col 7)-(line 1484,col 60)",
        "(line 1485,col 7)-(line 1485,col 62)",
        "(line 1486,col 7)-(line 1487,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 1490,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1492,col 7)-(line 1492,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.equals(java.lang.Object)",
      "begin_line": 1495,
      "end_line": 1498,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 7)-(line 1497,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Charset.hashCode()",
      "begin_line": 1500,
      "end_line": 1503,
      "comment": "",
      "child_ranges": [
        "(line 1502,col 7)-(line 1502,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DecomposedCharset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1506,
      "end_line": 1628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inverted"
      ],
      "begin_line": 1507,
      "end_line": 1507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ranges"
      ],
      "begin_line": 1508,
      "end_line": 1508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namedGroups"
      ],
      "begin_line": 1509,
      "end_line": 1509,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.DecomposedCharset(boolean, com.google.javascript.jscomp.regex.CharRanges, java.lang.String)",
      "begin_line": 1511,
      "end_line": 1516,
      "comment": "",
      "child_ranges": [
        "(line 1513,col 7)-(line 1513,col 31)",
        "(line 1514,col 7)-(line 1514,col 27)",
        "(line 1515,col 7)-(line 1515,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity()",
      "begin_line": 1518,
      "end_line": 1520,
      "comment": "",
      "child_ranges": [
        "(line 1519,col 7)-(line 1519,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 1522,
      "end_line": 1564,
      "comment": "",
      "child_ranges": [
        "(line 1523,col 7)-(line 1531,col 7)",
        "(line 1532,col 7)-(line 1532,col 21)",
        "(line 1533,col 7)-(line 1533,col 39)",
        "(line 1534,col 7)-(line 1534,col 29)",
        "(line 1535,col 7)-(line 1535,col 74)",
        "(line 1536,col 7)-(line 1536,col 36)",
        "(line 1537,col 7)-(line 1561,col 7)",
        "(line 1562,col 7)-(line 1562,col 44)",
        "(line 1563,col 7)-(line 1563,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.escapeRangeCharOnto(char, boolean, boolean, boolean, java.lang.StringBuilder)",
      "begin_line": 1566,
      "end_line": 1586,
      "comment": "",
      "child_ranges": [
        "(line 1569,col 7)-(line 1585,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 1588,
      "end_line": 1610,
      "comment": "",
      "child_ranges": [
        "(line 1589,col 7)-(line 1589,col 25)",
        "(line 1590,col 7)-(line 1608,col 7)",
        "(line 1609,col 7)-(line 1609,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.equals(java.lang.Object)",
      "begin_line": 1612,
      "end_line": 1621,
      "comment": "",
      "child_ranges": [
        "(line 1614,col 7)-(line 1616,col 7)",
        "(line 1617,col 7)-(line 1617,col 53)",
        "(line 1618,col 7)-(line 1620,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.hashCode()",
      "begin_line": 1623,
      "end_line": 1627,
      "comment": "",
      "child_ranges": [
        "(line 1625,col 7)-(line 1626,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Concatenation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.regex.RegExpTree"
      ],
      "begin_line": 1630,
      "end_line": 1819,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 1631,
      "end_line": 1631,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.Concatenation(com.google.javascript.jscomp.regex.RegExpTree, com.google.javascript.jscomp.regex.RegExpTree)",
      "begin_line": 1633,
      "end_line": 1635,
      "comment": "",
      "child_ranges": [
        "(line 1634,col 7)-(line 1634,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.Concatenation(java.util.List\u003c? extends com.google.javascript.jscomp.regex.RegExpTree\u003e)",
      "begin_line": 1637,
      "end_line": 1639,
      "comment": "",
      "child_ranges": [
        "(line 1638,col 7)-(line 1638,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.simplify(java.lang.String)",
      "begin_line": 1641,
      "end_line": 1720,
      "comment": "",
      "child_ranges": [
        "(line 1643,col 7)-(line 1708,col 7)",
        "(line 1710,col 7)-(line 1710,col 38)",
        "(line 1711,col 7)-(line 1713,col 7)",
        "(line 1715,col 7)-(line 1719,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Simplifier",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1643,
      "end_line": 1708,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "simplified"
      ],
      "begin_line": 1644,
      "end_line": 1644,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.Simplifier.simplify(com.google.javascript.jscomp.regex.RegExpTree)",
      "begin_line": 1646,
      "end_line": 1665,
      "comment": "",
      "child_ranges": [
        "(line 1647,col 11)-(line 1664,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.Simplifier.simplifyPairwise(com.google.javascript.jscomp.regex.RegExpTree, com.google.javascript.jscomp.regex.RegExpTree)",
      "begin_line": 1667,
      "end_line": 1707,
      "comment": "",
      "child_ranges": [
        "(line 1668,col 11)-(line 1671,col 11)",
        "(line 1673,col 11)-(line 1673,col 43)",
        "(line 1674,col 11)-(line 1674,col 41)",
        "(line 1675,col 11)-(line 1675,col 39)",
        "(line 1676,col 11)-(line 1682,col 11)",
        "(line 1683,col 11)-(line 1683,col 41)",
        "(line 1684,col 11)-(line 1684,col 39)",
        "(line 1685,col 11)-(line 1685,col 38)",
        "(line 1686,col 11)-(line 1692,col 11)",
        "(line 1693,col 11)-(line 1705,col 11)",
        "(line 1706,col 11)-(line 1706,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.isCaseSensitive()",
      "begin_line": 1722,
      "end_line": 1730,
      "comment": "",
      "child_ranges": [
        "(line 1724,col 7)-(line 1728,col 7)",
        "(line 1729,col 7)-(line 1729,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.containsAnchor()",
      "begin_line": 1732,
      "end_line": 1740,
      "comment": "",
      "child_ranges": [
        "(line 1734,col 7)-(line 1738,col 7)",
        "(line 1739,col 7)-(line 1739,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.numCapturingGroups()",
      "begin_line": 1742,
      "end_line": 1749,
      "comment": "",
      "child_ranges": [
        "(line 1744,col 7)-(line 1744,col 16)",
        "(line 1745,col 7)-(line 1747,col 7)",
        "(line 1748,col 7)-(line 1748,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.children()",
      "begin_line": 1751,
      "end_line": 1754,
      "comment": "",
      "child_ranges": [
        "(line 1753,col 7)-(line 1753,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.appendSourceCode(java.lang.StringBuilder)",
      "begin_line": 1756,
      "end_line": 1802,
      "comment": "",
      "child_ranges": [
        "(line 1760,col 7)-(line 1760,col 39)",
        "(line 1761,col 7)-(line 1801,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.appendDebugInfo(java.lang.StringBuilder)",
      "begin_line": 1804,
      "end_line": 1807,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.equals(java.lang.Object)",
      "begin_line": 1809,
      "end_line": 1813,
      "comment": "",
      "child_ranges": [
        "(line 1811,col 7)-(line 1812,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.Concatenation.hashCode()",
      "begin_line": 1815,
      "end_line": 1818,
      "comment": "",
      "child_ranges": [
        "(line 1817,col 7)-(line 1817,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.RegExpTree.escapeCharOnto(char, java.lang.StringBuilder)",
      "begin_line": 1821,
      "end_line": 1858,
      "comment": "",
      "child_ranges": [
        "(line 1822,col 5)-(line 1857,col 5)"
      ]
    }
  ]
}