{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/Tag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 317,
      "comment": "\n * HTML Tag capabilities.\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "tags"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": " map of known tags"
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isBlock"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": " block or inline"
    },
    {
      "type": "field",
      "varNames": [
        "formatAsBlock"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " should be formatted as a block"
    },
    {
      "type": "field",
      "varNames": [
        "canContainInline"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " only pcdata if not"
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " can hold nothing; e.g. img"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " can self close (\u003cfoo /\u003e). used for unknown tags that self close, without forcing them as empty."
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespace"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " for pre, textarea, script etc"
    },
    {
      "type": "field",
      "varNames": [
        "formList"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " a control that appears in forms: input, textarea, output etc"
    },
    {
      "type": "field",
      "varNames": [
        "formSubmit"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " a control that can be submitted in a form: input etc"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tag.Tag(java.lang.String)",
      "begin_line": 26,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getName()",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Get this tag\u0027s name.\n     *\n     * @return the tag\u0027s name\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String, org.jsoup.parser.ParseSettings)",
      "begin_line": 49,
      "end_line": 65,
      "comment": "\n     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     * \u003cp\u003e\n     * Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     * \u003c/p\u003e\n     * \n     * @param tagName Name of tag, e.g. \"p\". Case insensitive.\n     * @param settings used to control tag name sensitivity\n     * @return The tag, either defined or new generic.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 34)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 53,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     * \u003cp\u003e\n     * Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     * \u003c/p\u003e\n     *\n     * @param tagName Name of tag, e.g. \"p\". \u003cb\u003eCase sensitive\u003c/b\u003e.\n     * @return The tag, either defined or new generic.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isBlock()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Gets if this is a block tag.\n     *\n     * @return if block tag\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.formatAsBlock()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Gets if this tag should be formatted as a block (or as inline)\n     *\n     * @return if should be formatted as block or inline\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContainBlock()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Gets if this tag can contain block tags.\n     *\n     * @return if tag can contain block tags\n     * @deprecated No longer used, and no different result than {{@link #isBlock()}}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isInline()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Gets if this tag is an inline tag.\n     *\n     * @return if this tag is an inline tag.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isData()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Gets if this tag is a data only tag.\n     *\n     * @return if this tag is a data only tag\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isEmpty()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get if this is an empty tag\n     *\n     * @return if this is an empty tag\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isSelfClosing()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Get if this tag is self closing.\n     *\n     * @return if this tag should be output as self closing.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Get if this is a pre-defined tag, or was auto created on parsing.\n     *\n     * @return if a known tag\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag(java.lang.String)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Check if this tagname is a known tag.\n     *\n     * @param tagName name of tag\n     * @return if known HTML tag\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.preserveWhitespace()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Get if this tag should preserve whitespace within child text nodes.\n     *\n     * @return if preserve whitespace\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isFormListed()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Get if this tag represents a control associated with a form. E.g. input, textarea, output\n     * @return if associated with a form\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isFormSubmittable()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Get if this tag represents an element that should be submitted with a form. E.g. input, option\n     * @return if submittable with a form\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setSelfClosing()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.equals(java.lang.Object)",
      "begin_line": 193,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 35)",
        "(line 196,col 9)-(line 196,col 46)",
        "(line 198,col 9)-(line 198,col 26)",
        "(line 200,col 9)-(line 200,col 55)",
        "(line 201,col 9)-(line 201,col 67)",
        "(line 202,col 9)-(line 202,col 45)",
        "(line 203,col 9)-(line 203,col 61)",
        "(line 204,col 9)-(line 204,col 49)",
        "(line 205,col 9)-(line 205,col 71)",
        "(line 206,col 9)-(line 206,col 57)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 208,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.hashCode()",
      "begin_line": 211,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 40)",
        "(line 214,col 9)-(line 214,col 49)",
        "(line 215,col 9)-(line 215,col 55)",
        "(line 216,col 9)-(line 216,col 58)",
        "(line 217,col 9)-(line 217,col 47)",
        "(line 218,col 9)-(line 218,col 53)",
        "(line 219,col 9)-(line 219,col 60)",
        "(line 220,col 9)-(line 220,col 50)",
        "(line 221,col 9)-(line 221,col 52)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.toString()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "blockTags"
      ],
      "begin_line": 232,
      "end_line": 239,
      "comment": " prepped from http://www.w3.org/TR/REC-html40/sgml/dtd.html and other sources"
    },
    {
      "type": "field",
      "varNames": [
        "inlineTags"
      ],
      "begin_line": 240,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyTags"
      ],
      "begin_line": 248,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formatAsInlineTags"
      ],
      "begin_line": 252,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespaceTags"
      ],
      "begin_line": 256,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formListedTags"
      ],
      "begin_line": 261,
      "end_line": 263,
      "comment": " todo: I think we just need submit tags, and can scrub listed"
    },
    {
      "type": "field",
      "varNames": [
        "formSubmitTags"
      ],
      "begin_line": 264,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.register(org.jsoup.parser.Tag)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 35)"
      ]
    }
  ]
}