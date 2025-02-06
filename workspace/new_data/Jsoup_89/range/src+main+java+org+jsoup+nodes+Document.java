{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/Document.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Document",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Element"
      ],
      "begin_line": 19,
      "end_line": 598,
      "comment": "\n A HTML Document.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "outputSettings"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " the parser used to parse this document"
    },
    {
      "type": "field",
      "varNames": [
        "quirksMode"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "updateMetaCharset"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.Document(java.lang.String)",
      "begin_line": 32,
      "end_line": 35,
      "comment": "\n     Create a new, empty Document.\n     @param baseUri base URI of document\n     @see org.jsoup.Jsoup#parse\n     @see #createShell\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 72)",
        "(line 34,col 9)-(line 34,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createShell(java.lang.String)",
      "begin_line": 42,
      "end_line": 52,
      "comment": "\n     Create a valid, empty shell of a document, suitable for adding more elements to.\n     @param baseUri baseUri of document\n     @return document with html, head, and body elements.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 34)",
        "(line 45,col 9)-(line 45,col 45)",
        "(line 46,col 9)-(line 46,col 34)",
        "(line 47,col 9)-(line 47,col 49)",
        "(line 48,col 9)-(line 48,col 35)",
        "(line 49,col 9)-(line 49,col 35)",
        "(line 51,col 9)-(line 51,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.location()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Get the URL this Document was parsed from. If the starting URL is a redirect,\n     * this will return the final URL from which the document was served from.\n     * @return location\n     ",
      "child_ranges": [
        "(line 60,col 6)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.head()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     Accessor to the document\u0027s {@code head} element.\n     @return {@code head}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.body()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     Accessor to the document\u0027s {@code body} element.\n     @return {@code body}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title()",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     Get the string contents of the document\u0027s {@code title} element.\n     @return Trimmed title, or empty string if none set.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 60)",
        "(line 86,col 9)-(line 86,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title(java.lang.String)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "\n     Set the document\u0027s {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if\n     not present\n     @param title string to set as title\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 32)",
        "(line 96,col 9)-(line 96,col 60)",
        "(line 97,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createElement(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     Create a new Element, with this document\u0027s base uri. Does not make the new element a child of this document.\n     @param tagName element tag name (e.g. {@code a})\n     @return new element\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise()",
      "begin_line": 118,
      "end_line": 139,
      "comment": "\n     Normalise the document. This happens after the parse phase so generally does not need to be called.\n     Moves any text content that is not in the body element into the body.\n     @return this document after normalisation\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 65)",
        "(line 120,col 9)-(line 121,col 43)",
        "(line 122,col 9)-(line 123,col 42)",
        "(line 124,col 9)-(line 125,col 41)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 134,col 43)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseTextNodes(org.jsoup.nodes.Element)",
      "begin_line": 142,
      "end_line": 158,
      "comment": " does not recurse.",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseStructure(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 161,
      "end_line": 179,
      "comment": " merge multiple \u003chead\u003e or \u003cbody\u003e contents into one, delete the remainder, and ensure they are owned by \u003chtml\u003e",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 163,col 42)",
        "(line 164,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.findFirstElementByTagName(java.lang.String, org.jsoup.nodes.Node)",
      "begin_line": 182,
      "end_line": 194,
      "comment": " fast method to get first by tag name, used for html, head, body finders",
      "child_ranges": [
        "(line 183,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outerHtml()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.text(java.lang.String)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\n     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.\n     @param text unencoded text\n     @return this document\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 26)",
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.nodeName()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.charset(java.nio.charset.Charset)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\n     * Sets the charset used in this document. This method is equivalent\n     * to {@link OutputSettings#charset(java.nio.charset.Charset)\n     * OutputSettings.charset(Charset)} but in addition it updates the\n     * charset / encoding element within the document.\n     * \n     * \u003cp\u003eThis enables\n     * {@link #updateMetaCharsetElement(boolean) meta charset update}.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf there\u0027s no element with charset / encoding information yet it will\n     * be created. Obsolete charset / encoding definitions are removed!\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003cb\u003eElements used:\u003c/b\u003e\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     * \u003cli\u003e\u003cb\u003eHtml:\u003c/b\u003e \u003ci\u003e\u0026lt;meta charset\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003eXml:\u003c/b\u003e \u003ci\u003e\u0026lt;?xml version\u003d\"1.0\" encoding\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param charset Charset\n     * \n     * @see #updateMetaCharsetElement(boolean) \n     * @see OutputSettings#charset(java.nio.charset.Charset) \n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 39)",
        "(line 243,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 244,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.charset()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns the charset used in this document. This method is equivalent\n     * to {@link OutputSettings#charset()}.\n     * \n     * @return Current Charset\n     * \n     * @see OutputSettings#charset() \n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.updateMetaCharsetElement(boolean)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Sets whether the element with charset information in this document is\n     * updated on changes through {@link #charset(java.nio.charset.Charset)\n     * Document.charset(Charset)} or not.\n     * \n     * \u003cp\u003eIf set to \u003ctt\u003efalse\u003c/tt\u003e \u003ci\u003e(default)\u003c/i\u003e there are no elements\n     * modified.\u003c/p\u003e\n     * \n     * @param update If \u003ctt\u003etrue\u003c/tt\u003e the element updated on charset\n     * changes, \u003ctt\u003efalse\u003c/tt\u003e if not\n     * \n     * @see #charset(java.nio.charset.Charset) \n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.updateMetaCharsetElement()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Returns whether the element with charset information in this document is\n     * updated on changes through {@link #charset(java.nio.charset.Charset)\n     * Document.charset(Charset)} or not.\n     * \n     * @return Returns \u003ctt\u003etrue\u003c/tt\u003e if the element is updated on charset\n     * changes, \u003ctt\u003efalse\u003c/tt\u003e if not\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.clone()",
      "begin_line": 288,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 50)",
        "(line 291,col 9)-(line 291,col 59)",
        "(line 292,col 9)-(line 292,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.ensureMetaCharsetElement()",
      "begin_line": 314,
      "end_line": 363,
      "comment": "\n     * Ensures a meta charset (html) or xml declaration (xml) with the current\n     * encoding used. This only applies with\n     * {@link #updateMetaCharsetElement(boolean) updateMetaCharset} set to\n     * \u003ctt\u003etrue\u003c/tt\u003e, otherwise this method does nothing.\n     * \n     * \u003cul\u003e\n     * \u003cli\u003eAn existing element gets updated with the current charset\u003c/li\u003e\n     * \u003cli\u003eIf there\u0027s no element yet it will be inserted\u003c/li\u003e\n     * \u003cli\u003eObsolete elements are removed\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\u003cb\u003eElements used:\u003c/b\u003e\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     * \u003cli\u003e\u003cb\u003eHtml:\u003c/b\u003e \u003ci\u003e\u0026lt;meta charset\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003eXml:\u003c/b\u003e \u003ci\u003e\u0026lt;?xml version\u003d\"1.0\" encoding\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputSettings",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 369,
      "end_line": 546,
      "comment": "\n     * A Document\u0027s output settings control the form of the text() and html() methods.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeMode"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoderThreadLocal"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " initialized by start of OuterHtmlVisitor"
    },
    {
      "type": "field",
      "varNames": [
        "coreCharset"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " fast encoders for ascii and utf8"
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outline"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indentAmount"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "syntax"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.OutputSettings.OutputSettings()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n         * Get the document\u0027s current HTML escape mode: \u003ccode\u003ebase\u003c/code\u003e, which provides a limited set of named HTML\n         * entities and escapes other characters as numbered entities for maximum compatibility; or \u003ccode\u003eextended\u003c/code\u003e,\n         * which uses the complete set of HTML named entities.\n         * \u003cp\u003e\n         * The default escape mode is \u003ccode\u003ebase\u003c/code\u003e.\n         * @return the document\u0027s current escape mode\n         ",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode(org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n         * Set the document\u0027s escape mode, which determines how characters are escaped when the output character set\n         * does not support a given character:- using either a named or a numbered escape.\n         * @param escapeMode the new escape mode to use\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 408,col 13)-(line 408,col 41)",
        "(line 409,col 13)-(line 409,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n         * Get the document\u0027s current output charset, which is used to control which characters are escaped when\n         * generating HTML (via the \u003ccode\u003ehtml()\u003c/code\u003e methods), and which are kept intact.\n         * \u003cp\u003e\n         * Where possible (when parsing from a URL or File), the document\u0027s output charset is automatically set to the\n         * input charset. Otherwise, it defaults to UTF-8.\n         * @return the document\u0027s current charset.\n         ",
      "child_ranges": [
        "(line 421,col 13)-(line 421,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.nio.charset.Charset)",
      "begin_line": 429,
      "end_line": 432,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 35)",
        "(line 431,col 13)-(line 431,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.lang.String)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset (by name) to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 46)",
        "(line 441,col 13)-(line 441,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prepareEncoder()",
      "begin_line": 444,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 446,col 13)-(line 446,col 58)",
        "(line 447,col 13)-(line 447,col 44)",
        "(line 448,col 13)-(line 448,col 80)",
        "(line 449,col 13)-(line 449,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.encoder()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 453,col 13)-(line 453,col 62)",
        "(line 454,col 13)-(line 454,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.syntax()",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n         * Get the document\u0027s current output syntax.\n         * @return current syntax\n         ",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.syntax(org.jsoup.nodes.Document.OutputSettings.Syntax)",
      "begin_line": 471,
      "end_line": 474,
      "comment": "\n         * Set the document\u0027s output syntax. Either {@code html}, with empty tags and boolean attributes (etc), or\n         * {@code xml}, with self-closing tags.\n         * @param syntax serialization syntax\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 33)",
        "(line 473,col 13)-(line 473,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format\n         * the output, and the output will generally look like the input.\n         * @return if pretty printing is enabled.\n         ",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint(boolean)",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\n         * Enable or disable pretty printing.\n         * @param pretty new pretty print setting\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 33)",
        "(line 492,col 13)-(line 492,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.outline()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n         * Get if outline mode is enabled. Default is false. If enabled, the HTML output methods will consider\n         * all tags as block.\n         * @return if outline mode is enabled.\n         ",
      "child_ranges": [
        "(line 501,col 13)-(line 501,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.outline(boolean)",
      "begin_line": 509,
      "end_line": 512,
      "comment": "\n         * Enable or disable HTML outline mode.\n         * @param outlineMode new outline setting\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 510,col 13)-(line 510,col 34)",
        "(line 511,col 13)-(line 511,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount()",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n         * Get the current tag indent amount, used when pretty printing.\n         * @return the current indent amount\n         ",
      "child_ranges": [
        "(line 519,col 13)-(line 519,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount(int)",
      "begin_line": 527,
      "end_line": 531,
      "comment": "\n         * Set the indent amount for pretty printing\n         * @param indentAmount number of spaces to use for indenting each level. Must be {@literal \u003e\u003d} 0.\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 47)",
        "(line 529,col 13)-(line 529,col 45)",
        "(line 530,col 13)-(line 530,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.clone()",
      "begin_line": 533,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 33)",
        "(line 536,col 13)-(line 540,col 13)",
        "(line 541,col 13)-(line 541,col 42)",
        "(line 542,col 13)-(line 542,col 78)",
        "(line 544,col 13)-(line 544,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n     * Get the document\u0027s current output settings.\n     * @return the document\u0027s current output settings.\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings(org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 561,
      "end_line": 565,
      "comment": "\n     * Set the document\u0027s output settings.\n     * @param outputSettings new output settings.\n     * @return this document, for chaining.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 41)",
        "(line 563,col 9)-(line 563,col 45)",
        "(line 564,col 9)-(line 564,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode(org.jsoup.nodes.Document.QuirksMode)",
      "begin_line": 575,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 37)",
        "(line 577,col 9)-(line 577,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.parser()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Get the parser that was used to parse this document.\n     * @return the parser\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.parser(org.jsoup.parser.Parser)",
      "begin_line": 594,
      "end_line": 597,
      "comment": "\n     * Set the parser used to create this document. This parser is then used when further parsing within this document\n     * is required.\n     * @param parser the configured parser to use when further parsing is required for this document.\n     * @return this document, for chaining.\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 29)",
        "(line 596,col 9)-(line 596,col 20)"
      ]
    }
  ]
}