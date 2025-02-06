{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EntityArrays",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 425,
      "comment": "\n * Class holding various entity data for HTML and XML - generally for use with\n * the LookupTranslator.\n * All arrays are of length [*][2].\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Mapping to escape \u003ca href\u003d\"https://secure.wikimedia.org/wikipedia/en/wiki/ISO/IEC_8859-1\"\u003eISO-8859-1\u003c/a\u003e\n     * characters to their named HTML 3.x equivalents.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 34,col 51)-(line 34,col 82)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_ESCAPE"
      ],
      "begin_line": 35,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()",
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Reverse of {@link #ISO8859_1_ESCAPE()} for unescaping purposes.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 138,col 53)-(line 138,col 86)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_UNESCAPE"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Mapping to escape additional \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003echaracter entity\n     * references\u003c/a\u003e. Note that this must be used with {@link #ISO8859_1_ESCAPE()} to get the full list of\n     * HTML 4.0 character entities.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 147,col 57)-(line 147,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_EXTENDED_ESCAPE"
      ],
      "begin_line": 148,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\n     * Reverse of {@link #HTML40_EXTENDED_ESCAPE()} for unescaping purposes.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 349,col 59)-(line 349,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_EXTENDED_UNESCAPE"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()",
      "begin_line": 358,
      "end_line": 358,
      "comment": "\n     * Mapping to escape the basic XML and HTML character entities.\n     *\n     * Namely: {@code \" \u0026 \u003c \u003e}\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 358,col 47)-(line 358,col 74)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_ESCAPE"
      ],
      "begin_line": 359,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()",
      "begin_line": 370,
      "end_line": 370,
      "comment": "\n     * Reverse of {@link #BASIC_ESCAPE()} for unescaping purposes.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 370,col 49)-(line 370,col 78)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_UNESCAPE"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()",
      "begin_line": 377,
      "end_line": 377,
      "comment": "\n     * Mapping to escape the apostrophe character to its XML character entity.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 377,col 46)-(line 377,col 72)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "APOS_ESCAPE"
      ],
      "begin_line": 378,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE()",
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n     * Reverse of {@link #APOS_ESCAPE()} for unescaping purposes.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 386,col 48)-(line 386,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "APOS_UNESCAPE"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()",
      "begin_line": 395,
      "end_line": 395,
      "comment": "\n     * Mapping to escape the Java control characters.\n     *\n     * Namely: {@code \\b \\n \\t \\f \\r}\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 395,col 57)-(line 395,col 94)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CTRL_CHARS_ESCAPE"
      ],
      "begin_line": 396,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()",
      "begin_line": 408,
      "end_line": 408,
      "comment": "\n     * Reverse of {@link #JAVA_CTRL_CHARS_ESCAPE()} for unescaping purposes.\n     * @return the mapping table\n     ",
      "child_ranges": [
        "(line 408,col 59)-(line 408,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CTRL_CHARS_UNESCAPE"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.EntityArrays.invert(java.lang.String[][])",
      "begin_line": 416,
      "end_line": 423,
      "comment": "\n     * Used to invert an escape array into an unescape array\n     * @param array String[][] to be inverted\n     * @return String[][] inverted array\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 58)",
        "(line 418,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 24)"
      ]
    }
  ]
}