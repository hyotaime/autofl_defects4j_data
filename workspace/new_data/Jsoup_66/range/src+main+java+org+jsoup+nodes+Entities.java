{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 355,
      "comment": "\n * HTML entities, and escape routines.\n * Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C HTML\n * named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyName"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codepointRadix"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ASCII"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameKeys"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " table of named references to their codepoints. sorted so we can binary search. built by BuildEntities."
    },
    {
      "type": "field",
      "varNames": [
        "codeVals"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " limitation is the few references with multiple characters; those go into multipoints."
    },
    {
      "type": "field",
      "varNames": [
        "codeKeys"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " we don\u0027 support multicodepoints to single named value currently"
    },
    {
      "type": "field",
      "varNames": [
        "nameVals"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.lang.String, int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.codepointForName(java.lang.String)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 60)",
        "(line 60,col 13)-(line 60,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.nameForCodepoint(int)",
      "begin_line": 63,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 71)",
        "(line 65,col 13)-(line 70,col 13)",
        "(line 71,col 13)-(line 71,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.size()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "multipoints"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " name -\u003e multiple character references"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.Entities()",
      "begin_line": 81,
      "end_line": 82,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isNamedEntity(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Check if the input is a known named entity\n     *\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isBaseNamedEntity(java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Check if the input is a known named entity in the base entity set.\n     *\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity in the base set\n     * @see #isNamedEntity(String)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getCharacterByName(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Get the Character value of the named entity\n     *\n     * @param name named entity (e.g. \"lt\" or \"amp\")\n     * @return the Character value of the named entity (e.g. \u0027{@literal \u003c}\u0027 or \u0027{@literal \u0026}\u0027)\n     * @deprecated does not support characters outside the BMP or multiple character names\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getByName(java.lang.String)",
      "begin_line": 122,
      "end_line": 130,
      "comment": "\n     * Get the character(s) represented by the named entity\n     *\n     * @param name entity (e.g. \"lt\" or \"amp\")\n     * @return the string value of the character(s) represented by this entity, or \"\" if not defined\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 43)",
        "(line 124,col 9)-(line 125,col 23)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 127,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.codepointsForName(java.lang.String, int[])",
      "begin_line": 132,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 56)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 147,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 69)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.Appendable, java.lang.String, org.jsoup.nodes.Document.OutputSettings, boolean, boolean, boolean)",
      "begin_line": 158,
      "end_line": 231,
      "comment": " this method is ugly, and does a lot. but other breakups cause rescanning and stringbuilder generations",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 163,col 55)",
        "(line 164,col 9)-(line 164,col 96)",
        "(line 165,col 9)-(line 165,col 56)",
        "(line 166,col 9)-(line 166,col 43)",
        "(line 168,col 9)-(line 168,col 22)",
        "(line 169,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.appendEncoded(java.lang.Appendable, org.jsoup.nodes.Entities.EscapeMode, int)",
      "begin_line": 233,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 67)",
        "(line 235,col 9)-(line 238,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String, boolean)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Unescape the input string.\n     *\n     * @param string to un-HTML-escape\n     * @param strict if \"strict\" (that is, requires trailing \u0027;\u0027 char, otherwise that\u0027s optional)\n     * @return unescaped string\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.canEncode(org.jsoup.nodes.Entities.CoreCharset, char, java.nio.charset.CharsetEncoder)",
      "begin_line": 269,
      "end_line": 279,
      "comment": "\n     * Provides a fast-path for Encoder.canEncode, which drastically improves performance on Android post JellyBean.\n     * After KitKat, the implementation of canEncode degrades to the point of being useless. For non ASCII or UTF,\n     * performance may be bad. We can add more encoders for common character sets that are impacted by performance\n     * issues on Android if required.\n     *\n     * Benchmarks:     *\n     * OLD toHtml() impl v New (fastpath) in millis\n     * Wiki: 1895, 16\n     * CNN: 6378, 55\n     * Alterslash: 3013, 28\n     * Jsoup: 167, 2\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.CoreCharset.byName(java.lang.String)",
      "begin_line": 284,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 285,col 13)-(line 286,col 29)",
        "(line 287,col 13)-(line 288,col 27)",
        "(line 289,col 13)-(line 289,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "codeDelims"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.load(org.jsoup.nodes.Entities.EscapeMode, java.lang.String, int)",
      "begin_line": 295,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 38)",
        "(line 297,col 9)-(line 297,col 35)",
        "(line 298,col 9)-(line 298,col 35)",
        "(line 299,col 9)-(line 299,col 38)",
        "(line 301,col 9)-(line 301,col 70)",
        "(line 302,col 9)-(line 303,col 155)",
        "(line 305,col 9)-(line 305,col 18)",
        "(line 306,col 9)-(line 306,col 36)",
        "(line 307,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 86)"
      ]
    }
  ]
}