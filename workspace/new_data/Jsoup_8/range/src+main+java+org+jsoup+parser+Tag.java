{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/parser/Tag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 504,
      "comment": "\n HTML Tag specifications. This is a very simplistic model without the full expressiveness as the DTD,\n but it should capture most of what we need to know to intelligently parse a doc.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "tags"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultAncestor"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "knownTag"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " if pre-defined or auto-created"
    },
    {
      "type": "field",
      "varNames": [
        "isBlock"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " block or inline"
    },
    {
      "type": "field",
      "varNames": [
        "canContainBlock"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " Can this tag hold block level tags?"
    },
    {
      "type": "field",
      "varNames": [
        "canContainInline"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " only pcdata if not"
    },
    {
      "type": "field",
      "varNames": [
        "optionalClosing"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " If tag is open, and another seen, close previous tag"
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " can hold nothing; e.g. img"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " can self close (\u003cfoo /\u003e). used for unknown tags that self close, without forcing them as empty."
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespace"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " for pre, textarea, script etc"
    },
    {
      "type": "field",
      "varNames": [
        "ancestors"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " elements must be a descendant of one of these ancestors"
    },
    {
      "type": "field",
      "varNames": [
        "excludes"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " cannot contain these tags"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEndTags"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " ignore these end tags"
    },
    {
      "type": "field",
      "varNames": [
        "directDescendant"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " if true, must directly descend from one of the ancestors"
    },
    {
      "type": "field",
      "varNames": [
        "limitChildren"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " if true, only contain children that\u0027ve registered parents"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tag.Tag(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getName()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String)",
      "begin_line": 50,
      "end_line": 67,
      "comment": "\n     Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     \u003cp\u003e\n     Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     @param tagName Name of tag, e.g. \"p\". Case insensitive.\n     @return The tag, either defined or new generic.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 34)",
        "(line 52,col 9)-(line 52,col 47)",
        "(line 53,col 9)-(line 53,col 35)",
        "(line 55,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContain(org.jsoup.parser.Tag)",
      "begin_line": 74,
      "end_line": 111,
      "comment": "\n     Test if this tag, the prospective parent, can accept the proposed child.\n     @param child potential child tag.\n     @return true if this can contain child.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)",
        "(line 77,col 9)-(line 78,col 25)",
        "(line 80,col 9)-(line 81,col 25)",
        "(line 83,col 9)-(line 84,col 25)",
        "(line 86,col 9)-(line 87,col 25)",
        "(line 90,col 9)-(line 91,col 25)",
        "(line 94,col 9)-(line 100,col 9)",
        "(line 103,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isBlock()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     Gets if this is a block tag.\n     @return if block tag\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContainBlock()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     Gets if this tag can contain block tags.\n     @return if tag can contain block tags\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isInline()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     Gets if this tag is an inline tag.\n     @return if this tag is an inline tag.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isData()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     Gets if this tag is a data only tag.\n     @return if this tag is a data only tag\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isEmpty()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     Get if this is an empty tag\n     @return if this is an emtpy tag\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isSelfClosing()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Get if this tag is self closing.\n     * @return if this tag should be output as self closing.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Get if this is a pre-defined tag, or was auto created on parsing.\n     * @return if a known tag\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.preserveWhitespace()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     Get if this tag should preserve whitespace within child text nodes.\n     @return if preserve whitepace\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getImplicitParent()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.requiresSpecificParent()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isValidParent(org.jsoup.parser.Tag)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isValidAncestor(org.jsoup.parser.Tag)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 191,col 24)",
        "(line 193,col 9)-(line 195,col 28)",
        "(line 197,col 9)-(line 197,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isIgnorableEndTag(org.jsoup.parser.Tag)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.equals(java.lang.Object)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 211,col 66)",
        "(line 213,col 9)-(line 213,col 26)",
        "(line 215,col 9)-(line 215,col 95)",
        "(line 217,col 9)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.hashCode()",
      "begin_line": 220,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 62)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 224,col 9)-(line 224,col 57)",
        "(line 225,col 9)-(line 225,col 58)",
        "(line 226,col 9)-(line 226,col 57)",
        "(line 227,col 9)-(line 227,col 47)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.toString()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.createBlock(java.lang.String)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.createInline(java.lang.String)",
      "begin_line": 397,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 38)",
        "(line 399,col 9)-(line 399,col 31)",
        "(line 400,col 9)-(line 400,col 39)",
        "(line 401,col 9)-(line 401,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.register(org.jsoup.parser.Tag)",
      "begin_line": 404,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 49)",
        "(line 406,col 9)-(line 406,col 26)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setCanContainBlock()",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 31)",
        "(line 415,col 9)-(line 415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setContainInlineOnly()",
      "begin_line": 418,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 32)",
        "(line 420,col 9)-(line 420,col 32)",
        "(line 421,col 9)-(line 421,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setContainDataOnly()",
      "begin_line": 424,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 32)",
        "(line 426,col 9)-(line 426,col 33)",
        "(line 427,col 9)-(line 427,col 34)",
        "(line 428,col 9)-(line 428,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setEmpty()",
      "begin_line": 431,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 32)",
        "(line 433,col 9)-(line 433,col 33)",
        "(line 434,col 9)-(line 434,col 21)",
        "(line 435,col 9)-(line 435,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setOptionalClosing()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 31)",
        "(line 440,col 9)-(line 440,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setPreserveWhitespace()",
      "begin_line": 443,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 34)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setAncestor(java.lang.String...)",
      "begin_line": 448,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setExcludes(java.lang.String...)",
      "begin_line": 460,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 461,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setIgnoreEnd(java.lang.String...)",
      "begin_line": 472,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setParent(java.lang.String...)",
      "begin_line": 484,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 32)",
        "(line 486,col 9)-(line 486,col 30)",
        "(line 487,col 9)-(line 487,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setLimitChildren()",
      "begin_line": 490,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 29)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setSelfClosing()",
      "begin_line": 495,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 27)",
        "(line 497,col 9)-(line 497,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setKnownTag()",
      "begin_line": 500,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 24)",
        "(line 502,col 9)-(line 502,col 20)"
      ]
    }
  ]
}