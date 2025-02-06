{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/nodes/Document.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Document",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Element"
      ],
      "begin_line": 16,
      "end_line": 349,
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
      "type": "field",
      "varNames": [
        "quirksMode"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.Document(java.lang.String)",
      "begin_line": 26,
      "end_line": 28,
      "comment": "\n     Create a new, empty Document.\n     @param baseUri base URI of document\n     @see org.jsoup.Jsoup#parse\n     @see #createShell\n     ",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createShell(java.lang.String)",
      "begin_line": 35,
      "end_line": 44,
      "comment": "\n     Create a valid, empty shell of a document, suitable for adding more elements to.\n     @param baseUri baseUri of document\n     @return document with html, head, and body elements.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 34)",
        "(line 38,col 9)-(line 38,col 45)",
        "(line 39,col 9)-(line 39,col 49)",
        "(line 40,col 9)-(line 40,col 35)",
        "(line 41,col 9)-(line 41,col 35)",
        "(line 43,col 9)-(line 43,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.head()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     Accessor to the document\u0027s {@code head} element.\n     @return {@code head}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.body()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     Accessor to the document\u0027s {@code body} element.\n     @return {@code body}\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     Get the string contents of the document\u0027s {@code title} element.\n     @return Trimed title, or empty string if none set.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)",
        "(line 68,col 9)-(line 68,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title(java.lang.String)",
      "begin_line": 76,
      "end_line": 84,
      "comment": "\n     Set the document\u0027s {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if\n     not present\n     @param title string to set as title\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 32)",
        "(line 78,col 9)-(line 78,col 60)",
        "(line 79,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createElement(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     Create a new Element, with this document\u0027s base uri. Does not make the new element a child of this document.\n     @param tagName element tag name (e.g. {@code a})\n     @return new element\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise()",
      "begin_line": 100,
      "end_line": 119,
      "comment": "\n     Normalise the document. This happens after the parse phase so generally does not need to be called.\n     Moves any text content that is not in the body element into the body.\n     @return this document after normalisation\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 65)",
        "(line 102,col 9)-(line 103,col 43)",
        "(line 104,col 9)-(line 105,col 42)",
        "(line 106,col 9)-(line 107,col 41)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 35)",
        "(line 113,col 9)-(line 113,col 33)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 116,col 43)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseTextNodes(org.jsoup.nodes.Element)",
      "begin_line": 122,
      "end_line": 138,
      "comment": " does not recurse.",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)",
        "(line 124,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseStructure(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 141,
      "end_line": 160,
      "comment": " merge multiple \u003chead\u003e or \u003cbody\u003e contents into one, delete the remainder, and ensure they are owned by \u003chtml\u003e",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 55)",
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.findFirstElementByTagName(java.lang.String, org.jsoup.nodes.Node)",
      "begin_line": 163,
      "end_line": 174,
      "comment": " fast method to get first by tag name, used for html, head, body finders",
      "child_ranges": [
        "(line 164,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outerHtml()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.text(java.lang.String)",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.\n     @param text unencoded text\n     @return this document\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 26)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.nodeName()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.clone()",
      "begin_line": 197,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputSettings",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 207,
      "end_line": 327,
      "comment": "\n     * A Document\u0027s output settings control the form of the text() and html() methods.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeMode"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsetEncoder"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indentAmount"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.OutputSettings.OutputSettings()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n         * Get the document\u0027s current HTML escape mode: \u003ccode\u003ebase\u003c/code\u003e, which provides a limited set of named HTML\n         * entities and escapes other characters as numbered entities for maximum compatibility; or \u003ccode\u003eextended\u003c/code\u003e,\n         * which uses the complete set of HTML named entities.\n         * \u003cp\u003e\n         * The default escape mode is \u003ccode\u003ebase\u003c/code\u003e.\n         * @return the document\u0027s current escape mode\n         ",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode(org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n         * Set the document\u0027s escape mode\n         * @param escapeMode the new escape mode to use\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 41)",
        "(line 235,col 13)-(line 235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n         * Get the document\u0027s current output charset, which is used to control which characters are escaped when\n         * generating HTML (via the \u003ccode\u003ehtml()\u003c/code\u003e methods), and which are kept intact.\n         * \u003cp\u003e\n         * Where possible (when parsing from a URL or File), the document\u0027s output charset is automatically set to the\n         * input charset. Otherwise, it defaults to UTF-8.\n         * @return the document\u0027s current charset.\n         ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.nio.charset.Charset)",
      "begin_line": 255,
      "end_line": 260,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 35)",
        "(line 258,col 13)-(line 258,col 50)",
        "(line 259,col 13)-(line 259,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.lang.String)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset (by name) to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 46)",
        "(line 269,col 13)-(line 269,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.encoder()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format\n         * the output, and the output will generally look like the input.\n         * @return if pretty printing is enabled.\n         ",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint(boolean)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n         * Enable or disable pretty printing.\n         * @param pretty new pretty print setting\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 33)",
        "(line 292,col 13)-(line 292,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n         * Get the current tag indent amount, used when pretty printing.\n         * @return the current indent amount\n         ",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount(int)",
      "begin_line": 308,
      "end_line": 312,
      "comment": "\n         * Set the indent amount for pretty printing\n         * @param indentAmount number of spaces to use for indenting each level. Must be \u003e\u003d 0.\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 47)",
        "(line 310,col 13)-(line 310,col 45)",
        "(line 311,col 13)-(line 311,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.clone()",
      "begin_line": 314,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 33)",
        "(line 317,col 13)-(line 321,col 13)",
        "(line 322,col 13)-(line 322,col 42)",
        "(line 323,col 13)-(line 323,col 78)",
        "(line 325,col 13)-(line 325,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Get the document\u0027s current output settings.\n     * @return the document\u0027s current output settings.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode(org.jsoup.nodes.Document.QuirksMode)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 37)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    }
  ]
}