{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/Document.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Document",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Element"
      ],
      "begin_line": 16,
      "end_line": 314,
      "comment": "\n A HTML Document.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "outputSettings"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.Document(java.lang.String)",
      "begin_line": 25,
      "end_line": 27,
      "comment": "\n     Create a new, empty Document.\n     @param baseUri base URI of document\n     @see org.jsoup.Jsoup#parse\n     @see #createShell\n     ",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createShell(java.lang.String)",
      "begin_line": 34,
      "end_line": 43,
      "comment": "\n     Create a valid, empty shell of a document, suitable for adding more elements to.\n     @param baseUri baseUri of document\n     @return document with html, head, and body elements.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 34)",
        "(line 37,col 9)-(line 37,col 45)",
        "(line 38,col 9)-(line 38,col 49)",
        "(line 39,col 9)-(line 39,col 35)",
        "(line 40,col 9)-(line 40,col 35)",
        "(line 42,col 9)-(line 42,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.head()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     Accessor to the document\u0027s {@code head} element.\n     @return {@code head}\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.body()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     Accessor to the document\u0027s {@code body} element.\n     @return {@code body}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     Get the string contents of the document\u0027s {@code title} element.\n     @return Trimed title, or empty string if none set.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 60)",
        "(line 67,col 9)-(line 67,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title(java.lang.String)",
      "begin_line": 75,
      "end_line": 83,
      "comment": "\n     Set the document\u0027s {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if\n     not present\n     @param title string to set as title\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 60)",
        "(line 78,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createElement(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     Create a new Element, with this document\u0027s base uri. Does not make the new element a child of this document.\n     @param tagName element tag name (e.g. {@code a})\n     @return new element\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise()",
      "begin_line": 99,
      "end_line": 118,
      "comment": "\n     Normalise the document. This happens after the parse phase so generally does not need to be called.\n     Moves any text content that is not in the body element into the body.\n     @return this document after normalisation\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 104,col 42)",
        "(line 105,col 9)-(line 106,col 41)",
        "(line 110,col 9)-(line 110,col 35)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 33)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseTextNodes(org.jsoup.nodes.Element)",
      "begin_line": 121,
      "end_line": 137,
      "comment": " does not recurse.",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)",
        "(line 123,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseStructure(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 140,
      "end_line": 159,
      "comment": " merge multiple \u003chead\u003e or \u003cbody\u003e contents into one, delete the remainder, and ensure they are owned by \u003chtml\u003e",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.findFirstElementByTagName(java.lang.String, org.jsoup.nodes.Node)",
      "begin_line": 162,
      "end_line": 173,
      "comment": " fast method to get first by tag name, used for html, head, body finders",
      "child_ranges": [
        "(line 163,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outerHtml()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.text(java.lang.String)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "\n     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.\n     @param text unencoded text\n     @return this document\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 26)",
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.nodeName()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputSettings",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 199,
      "end_line": 305,
      "comment": "\n     * A Document\u0027s output settings control the form of the text() and html() methods.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeMode"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsetEncoder"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indentAmount"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.OutputSettings.OutputSettings()",
      "begin_line": 206,
      "end_line": 206,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n         * Get the document\u0027s current HTML escape mode: \u003ccode\u003ebase\u003c/code\u003e, which provides a limited set of named HTML\n         * entities and escapes other characters as numbered entities for maximum compatibility; or \u003ccode\u003eextended\u003c/code\u003e,\n         * which uses the complete set of HTML named entities.\n         * \u003cp\u003e\n         * The default escape mode is \u003ccode\u003ebase\u003c/code\u003e.\n         * @return the document\u0027s current escape mode\n         ",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode(org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n         * Set the document\u0027s escape mode\n         * @param escapeMode the new escape mode to use\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 41)",
        "(line 227,col 13)-(line 227,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n         * Get the document\u0027s current output charset, which is used to control which characters are escaped when\n         * generating HTML (via the \u003ccode\u003ehtml()\u003c/code\u003e methods), and which are kept intact.\n         * \u003cp\u003e\n         * Where possible (when parsing from a URL or File), the document\u0027s output charset is automatically set to the\n         * input charset. Otherwise, it defaults to UTF-8.\n         * @return the document\u0027s current charset.\n         ",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.nio.charset.Charset)",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 35)",
        "(line 250,col 13)-(line 250,col 50)",
        "(line 251,col 13)-(line 251,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.lang.String)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset (by name) to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 46)",
        "(line 261,col 13)-(line 261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.encoder()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format\n         * the output, and the output will generally look like the input.\n         * @return if pretty printing is enabled.\n         ",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint(boolean)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n         * Enable or disable pretty printing.\n         * @param pretty new pretty print setting\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 33)",
        "(line 284,col 13)-(line 284,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n         * Get the current tag indent amount, used when pretty printing.\n         * @return the current indent amount\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount(int)",
      "begin_line": 300,
      "end_line": 304,
      "comment": "\n         * Set the indent amount for pretty printing\n         * @param indentAmount number of spaces to use for indenting each level. Must be \u003e\u003d 0.\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 47)",
        "(line 302,col 13)-(line 302,col 45)",
        "(line 303,col 13)-(line 303,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Get the document\u0027s current output settings.\n     * @return the document\u0027s current output settings.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 30)"
      ]
    }
  ]
}