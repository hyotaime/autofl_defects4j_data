{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/Document.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Document",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Element"
      ],
      "begin_line": 18,
      "end_line": 569,
      "comment": "\n A HTML Document.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "outputSettings"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quirksMode"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "updateMetaCharset"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.Document(java.lang.String)",
      "begin_line": 30,
      "end_line": 33,
      "comment": "\n     Create a new, empty Document.\n     @param baseUri base URI of document\n     @see org.jsoup.Jsoup#parse\n     @see #createShell\n     ",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 72)",
        "(line 32,col 9)-(line 32,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createShell(java.lang.String)",
      "begin_line": 40,
      "end_line": 49,
      "comment": "\n     Create a valid, empty shell of a document, suitable for adding more elements to.\n     @param baseUri baseUri of document\n     @return document with html, head, and body elements.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 34)",
        "(line 43,col 9)-(line 43,col 45)",
        "(line 44,col 9)-(line 44,col 49)",
        "(line 45,col 9)-(line 45,col 35)",
        "(line 46,col 9)-(line 46,col 35)",
        "(line 48,col 9)-(line 48,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.location()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the URL this Document was parsed from. If the starting URL is a redirect,\n     * this will return the final URL from which the document was served from.\n     * @return location\n     ",
      "child_ranges": [
        "(line 57,col 6)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.head()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     Accessor to the document\u0027s {@code head} element.\n     @return {@code head}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.body()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     Accessor to the document\u0027s {@code body} element.\n     @return {@code body}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     Get the string contents of the document\u0027s {@code title} element.\n     @return Trimmed title, or empty string if none set.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title(java.lang.String)",
      "begin_line": 91,
      "end_line": 99,
      "comment": "\n     Set the document\u0027s {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if\n     not present\n     @param title string to set as title\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 60)",
        "(line 94,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createElement(java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     Create a new Element, with this document\u0027s base uri. Does not make the new element a child of this document.\n     @param tagName element tag name (e.g. {@code a})\n     @return new element\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise()",
      "begin_line": 115,
      "end_line": 136,
      "comment": "\n     Normalise the document. This happens after the parse phase so generally does not need to be called.\n     Moves any text content that is not in the body element into the body.\n     @return this document after normalisation\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 65)",
        "(line 117,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 122,col 41)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 130,col 9)-(line 130,col 43)",
        "(line 131,col 9)-(line 131,col 43)",
        "(line 133,col 9)-(line 133,col 35)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseTextNodes(org.jsoup.nodes.Element)",
      "begin_line": 139,
      "end_line": 155,
      "comment": " does not recurse.",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseStructure(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 158,
      "end_line": 176,
      "comment": " merge multiple \u003chead\u003e or \u003cbody\u003e contents into one, delete the remainder, and ensure they are owned by \u003chtml\u003e",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 55)",
        "(line 160,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.findFirstElementByTagName(java.lang.String, org.jsoup.nodes.Node)",
      "begin_line": 179,
      "end_line": 191,
      "comment": " fast method to get first by tag name, used for html, head, body finders",
      "child_ranges": [
        "(line 180,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outerHtml()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.text(java.lang.String)",
      "begin_line": 203,
      "end_line": 207,
      "comment": "\n     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.\n     @param text unencoded text\n     @return this document\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 26)",
        "(line 206,col 9)-(line 206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.nodeName()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.charset(java.nio.charset.Charset)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\n     * Sets the charset used in this document. This method is equivalent\n     * to {@link OutputSettings#charset(java.nio.charset.Charset)\n     * OutputSettings.charset(Charset)} but in addition it updates the\n     * charset / encoding element within the document.\n     * \n     * \u003cp\u003eThis enables\n     * {@link #updateMetaCharsetElement(boolean) meta charset update}.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf there\u0027s no element with charset / encoding information yet it will\n     * be created. Obsolete charset / encoding definitions are removed!\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003cb\u003eElements used:\u003c/b\u003e\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     * \u003cli\u003e\u003cb\u003eHtml:\u003c/b\u003e \u003ci\u003e\u0026lt;meta charset\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003eXml:\u003c/b\u003e \u003ci\u003e\u0026lt;?xml version\u003d\"1.0\" encoding\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param charset Charset\n     * \n     * @see #updateMetaCharsetElement(boolean) \n     * @see OutputSettings#charset(java.nio.charset.Charset) \n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 39)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.charset()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns the charset used in this document. This method is equivalent\n     * to {@link OutputSettings#charset()}.\n     * \n     * @return Current Charset\n     * \n     * @see OutputSettings#charset() \n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.updateMetaCharsetElement(boolean)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Sets whether the element with charset information in this document is\n     * updated on changes through {@link #charset(java.nio.charset.Charset)\n     * Document.charset(Charset)} or not.\n     * \n     * \u003cp\u003eIf set to \u003ctt\u003efalse\u003c/tt\u003e \u003ci\u003e(default)\u003c/i\u003e there are no elements\n     * modified.\u003c/p\u003e\n     * \n     * @param update If \u003ctt\u003etrue\u003c/tt\u003e the element updated on charset\n     * changes, \u003ctt\u003efalse\u003c/tt\u003e if not\n     * \n     * @see #charset(java.nio.charset.Charset) \n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.updateMetaCharsetElement()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Returns whether the element with charset information in this document is\n     * updated on changes through {@link #charset(java.nio.charset.Charset)\n     * Document.charset(Charset)} or not.\n     * \n     * @return Returns \u003ctt\u003etrue\u003c/tt\u003e if the element is updated on charset\n     * changes, \u003ctt\u003efalse\u003c/tt\u003e if not\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.clone()",
      "begin_line": 285,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 50)",
        "(line 288,col 9)-(line 288,col 59)",
        "(line 289,col 9)-(line 289,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.ensureMetaCharsetElement()",
      "begin_line": 311,
      "end_line": 360,
      "comment": "\n     * Ensures a meta charset (html) or xml declaration (xml) with the current\n     * encoding used. This only applies with\n     * {@link #updateMetaCharsetElement(boolean) updateMetaCharset} set to\n     * \u003ctt\u003etrue\u003c/tt\u003e, otherwise this method does nothing.\n     * \n     * \u003cul\u003e\n     * \u003cli\u003eAn existing element gets updated with the current charset\u003c/li\u003e\n     * \u003cli\u003eIf there\u0027s no element yet it will be inserted\u003c/li\u003e\n     * \u003cli\u003eObsolete elements are removed\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\u003cb\u003eElements used:\u003c/b\u003e\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     * \u003cli\u003e\u003cb\u003eHtml:\u003c/b\u003e \u003ci\u003e\u0026lt;meta charset\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003eXml:\u003c/b\u003e \u003ci\u003e\u0026lt;?xml version\u003d\"1.0\" encoding\u003d\"CHARSET\"\u0026gt;\u003c/i\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputSettings",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 366,
      "end_line": 536,
      "comment": "\n     * A Document\u0027s output settings control the form of the text() and html() methods.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeMode"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoder"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " initialized by start of OuterHtmlVisitor and cleared at end"
    },
    {
      "type": "field",
      "varNames": [
        "coreCharset"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " fast encoders for ascii and utf8"
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outline"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indentAmount"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "syntax"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.OutputSettings.OutputSettings()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 13)-(line 383,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n         * Get the document\u0027s current HTML escape mode: \u003ccode\u003ebase\u003c/code\u003e, which provides a limited set of named HTML\n         * entities and escapes other characters as numbered entities for maximum compatibility; or \u003ccode\u003eextended\u003c/code\u003e,\n         * which uses the complete set of HTML named entities.\n         * \u003cp\u003e\n         * The default escape mode is \u003ccode\u003ebase\u003c/code\u003e.\n         * @return the document\u0027s current escape mode\n         ",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode(org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n         * Set the document\u0027s escape mode, which determines how characters are escaped when the output character set\n         * does not support a given character:- using either a named or a numbered escape.\n         * @param escapeMode the new escape mode to use\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 405,col 13)-(line 405,col 41)",
        "(line 406,col 13)-(line 406,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n         * Get the document\u0027s current output charset, which is used to control which characters are escaped when\n         * generating HTML (via the \u003ccode\u003ehtml()\u003c/code\u003e methods), and which are kept intact.\n         * \u003cp\u003e\n         * Where possible (when parsing from a URL or File), the document\u0027s output charset is automatically set to the\n         * input charset. Otherwise, it defaults to UTF-8.\n         * @return the document\u0027s current charset.\n         ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.nio.charset.Charset)",
      "begin_line": 426,
      "end_line": 429,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 35)",
        "(line 428,col 13)-(line 428,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.lang.String)",
      "begin_line": 436,
      "end_line": 439,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset (by name) to use.\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 437,col 13)-(line 437,col 46)",
        "(line 438,col 13)-(line 438,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prepareEncoder()",
      "begin_line": 441,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 442,col 13)-(line 442,col 43)",
        "(line 443,col 13)-(line 443,col 80)",
        "(line 444,col 13)-(line 444,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.syntax()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n         * Get the document\u0027s current output syntax.\n         * @return current syntax\n         ",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.syntax(org.jsoup.nodes.Document.OutputSettings.Syntax)",
      "begin_line": 461,
      "end_line": 464,
      "comment": "\n         * Set the document\u0027s output syntax. Either {@code html}, with empty tags and boolean attributes (etc), or\n         * {@code xml}, with self-closing tags.\n         * @param syntax serialization syntax\n         * @return the document\u0027s output settings, for chaining\n         ",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 33)",
        "(line 463,col 13)-(line 463,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format\n         * the output, and the output will generally look like the input.\n         * @return if pretty printing is enabled.\n         ",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint(boolean)",
      "begin_line": 480,
      "end_line": 483,
      "comment": "\n         * Enable or disable pretty printing.\n         * @param pretty new pretty print setting\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 481,col 13)-(line 481,col 33)",
        "(line 482,col 13)-(line 482,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.outline()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n         * Get if outline mode is enabled. Default is false. If enabled, the HTML output methods will consider\n         * all tags as block.\n         * @return if outline mode is enabled.\n         ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.outline(boolean)",
      "begin_line": 499,
      "end_line": 502,
      "comment": "\n         * Enable or disable HTML outline mode.\n         * @param outlineMode new outline setting\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 500,col 13)-(line 500,col 34)",
        "(line 501,col 13)-(line 501,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n         * Get the current tag indent amount, used when pretty printing.\n         * @return the current indent amount\n         ",
      "child_ranges": [
        "(line 509,col 13)-(line 509,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount(int)",
      "begin_line": 517,
      "end_line": 521,
      "comment": "\n         * Set the indent amount for pretty printing\n         * @param indentAmount number of spaces to use for indenting each level. Must be {@literal \u003e\u003d} 0.\n         * @return this, for chaining\n         ",
      "child_ranges": [
        "(line 518,col 13)-(line 518,col 47)",
        "(line 519,col 13)-(line 519,col 45)",
        "(line 520,col 13)-(line 520,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.clone()",
      "begin_line": 523,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 33)",
        "(line 526,col 13)-(line 530,col 13)",
        "(line 531,col 13)-(line 531,col 42)",
        "(line 532,col 13)-(line 532,col 78)",
        "(line 534,col 13)-(line 534,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n     * Get the document\u0027s current output settings.\n     * @return the document\u0027s current output settings.\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings(org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 551,
      "end_line": 555,
      "comment": "\n     * Set the document\u0027s output settings.\n     * @param outputSettings new output settings.\n     * @return this document, for chaining.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 41)",
        "(line 553,col 9)-(line 553,col 45)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode(org.jsoup.nodes.Document.QuirksMode)",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 37)",
        "(line 567,col 9)-(line 567,col 20)"
      ]
    }
  ]
}