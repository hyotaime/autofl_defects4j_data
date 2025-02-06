{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 355,
      "comment": "\n * HTML entities, and escape routines. Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C\n * HTML named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyName"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codepointRadix"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeDelims"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "multipoints"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " name -\u003e multiple character references"
    },
    {
      "type": "field",
      "varNames": [
        "DefaultOutput"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameKeys"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " table of named references to their codepoints. sorted so we can binary search. built by BuildEntities."
    },
    {
      "type": "field",
      "varNames": [
        "codeVals"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " limitation is the few references with multiple characters; those go into multipoints."
    },
    {
      "type": "field",
      "varNames": [
        "codeKeys"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " we don\u0027 support multicodepoints to single named value currently"
    },
    {
      "type": "field",
      "varNames": [
        "nameVals"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.lang.String, int)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.codepointForName(java.lang.String)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 60)",
        "(line 57,col 13)-(line 57,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.nameForCodepoint(int)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 71)",
        "(line 62,col 13)-(line 67,col 13)",
        "(line 68,col 13)-(line 68,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.size()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.Entities()",
      "begin_line": 76,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isNamedEntity(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Check if the input is a known named entity\n     *\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isBaseNamedEntity(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Check if the input is a known named entity in the base entity set.\n     *\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity in the base set\n     * @see #isNamedEntity(String)\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getCharacterByName(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Get the Character value of the named entity\n     *\n     * @param name named entity (e.g. \"lt\" or \"amp\")\n     * @return the Character value of the named entity (e.g. \u0027{@literal \u003c}\u0027 or \u0027{@literal \u0026}\u0027)\n     * @deprecated does not support characters outside the BMP or multiple character names\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getByName(java.lang.String)",
      "begin_line": 117,
      "end_line": 125,
      "comment": "\n     * Get the character(s) represented by the named entity\n     *\n     * @param name entity (e.g. \"lt\" or \"amp\")\n     * @return the string value of the character(s) represented by this entity, or \"\" if not defined\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 120,col 23)",
        "(line 121,col 9)-(line 121,col 56)",
        "(line 122,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.codepointsForName(java.lang.String, int[])",
      "begin_line": 127,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 43)",
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 56)",
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 149,
      "end_line": 159,
      "comment": "\n     * HTML escape an input string. That is, {@code \u003c} is returned as {@code \u0026lt;}\n     *\n     * @param string the un-escaped string to escape\n     * @param out the output settings to use\n     * @return the escaped string\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 151,col 22)",
        "(line 152,col 9)-(line 152,col 57)",
        "(line 153,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * HTML escape an input string, using the default settings (UTF-8, base entities). That is, {@code \u003c} is returned as\n     * {@code \u0026lt;}\n     *\n     * @param string the un-escaped string to escape\n     * @return the escaped string\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.Appendable, java.lang.String, org.jsoup.nodes.Document.OutputSettings, boolean, boolean, boolean)",
      "begin_line": 173,
      "end_line": 246,
      "comment": " this method is ugly, and does a lot. but other breakups cause rescanning and stringbuilder generations",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 37)",
        "(line 177,col 9)-(line 177,col 40)",
        "(line 178,col 9)-(line 178,col 55)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 56)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 183,col 9)-(line 183,col 22)",
        "(line 184,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.appendEncoded(java.lang.Appendable, org.jsoup.nodes.Entities.EscapeMode, int)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 67)",
        "(line 250,col 9)-(line 253,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Un-escape an HTML escaped string. That is, {@code \u0026lt;} is returned as {@code \u003c}.\n     *\n     * @param string the HTML string to un-escape\n     * @return the unescaped string\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String, boolean)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Unescape the input string.\n     *\n     * @param string to un-HTML-escape\n     * @param strict if \"strict\" (that is, requires trailing \u0027;\u0027 char, otherwise that\u0027s optional)\n     * @return unescaped string\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.canEncode(org.jsoup.nodes.Entities.CoreCharset, char, java.nio.charset.CharsetEncoder)",
      "begin_line": 290,
      "end_line": 300,
      "comment": "\n     * Provides a fast-path for Encoder.canEncode, which drastically improves performance on Android post JellyBean.\n     * After KitKat, the implementation of canEncode degrades to the point of being useless. For non ASCII or UTF,\n     * performance may be bad. We can add more encoders for common character sets that are impacted by performance\n     * issues on Android if required.\n     *\n     * Benchmarks:     *\n     * OLD toHtml() impl v New (fastpath) in millis\n     * Wiki: 1895, 16\n     * CNN: 6378, 55\n     * Alterslash: 3013, 28\n     * Jsoup: 167, 2\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.CoreCharset.byName(java.lang.String)",
      "begin_line": 305,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 307,col 29)",
        "(line 308,col 13)-(line 309,col 27)",
        "(line 310,col 13)-(line 310,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.load(org.jsoup.nodes.Entities.EscapeMode, java.lang.String, int)",
      "begin_line": 314,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 35)",
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 38)",
        "(line 320,col 9)-(line 320,col 18)",
        "(line 321,col 9)-(line 321,col 65)",
        "(line 323,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 74)"
      ]
    }
  ]
}