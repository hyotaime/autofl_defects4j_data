{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/safety/Whitelist.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Whitelist",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 443,
      "comment": "\n Whitelists define what HTML (elements and attributes) to allow through the cleaner. Everything else is removed.\n \u003cp/\u003e\n Start with one of the defaults:\n \u003cul\u003e\n \u003cli\u003e{@link #none}\n \u003cli\u003e{@link #simpleText}\n \u003cli\u003e{@link #basic}\n \u003cli\u003e{@link #basicWithImages}\n \u003cli\u003e{@link #relaxed}\n \u003c/ul\u003e\n \u003cp/\u003e\n If you need to allow more through (please be careful!), tweak a base whitelist with:\n \u003cul\u003e\n \u003cli\u003e{@link #addTags}\n \u003cli\u003e{@link #addAttributes}\n \u003cli\u003e{@link #addEnforcedAttribute}\n \u003cli\u003e{@link #addProtocols}\n \u003c/ul\u003e\n \u003cp/\u003e\n The cleaner and these whitelists assume that you want to clean a \u003ccode\u003ebody\u003c/code\u003e fragment of HTML (to add user\n supplied HTML into a templated page), and not to clean a full HTML document. If the latter is the case, either wrap the\n document HTML around the cleaned body HTML, or create a whitelist that allows \u003ccode\u003ehtml\u003c/code\u003e and \u003ccode\u003ehead\u003c/code\u003e\n elements as appropriate.\n \u003cp/\u003e\n If you are going to extend a whitelist, please be very careful. Make sure you understand what attributes may lead to\n XSS attack vectors. URL attributes are particularly vulnerable and require careful validation. See \n http://ha.ckers.org/xss.html for some XSS attack examples.\n\n @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "tagNames"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " tags allowed, lower case. e.g. [p, br, span]"
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " tag -\u003e attribute[]. allowed attributes [href] for a tag."
    },
    {
      "type": "field",
      "varNames": [
        "enforcedAttributes"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " always set these attribute values"
    },
    {
      "type": "field",
      "varNames": [
        "protocols"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " allowed URL protocols for attributes"
    },
    {
      "type": "field",
      "varNames": [
        "preserveRelativeLinks"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " option to preserve relative links"
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.none()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     This whitelist allows only text nodes: all HTML will be stripped.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.simpleText()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     This whitelist allows only simple text formatting: \u003ccode\u003eb, em, i, strong, u\u003c/code\u003e. All other HTML (tags and\n     attributes) will be removed.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.basic()",
      "begin_line": 89,
      "end_line": 107,
      "comment": "\n     This whitelist allows a fuller range of text nodes: \u003ccode\u003ea, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,\n     ol, p, pre, q, small, strike, strong, sub, sup, u, ul\u003c/code\u003e, and appropriate attributes.\n     \u003cp/\u003e\n     Links (\u003ccode\u003ea\u003c/code\u003e elements) can point to \u003ccode\u003ehttp, https, ftp, mailto\u003c/code\u003e, and have an enforced\n     \u003ccode\u003erel\u003dnofollow\u003c/code\u003e attribute.\n     \u003cp/\u003e\n     Does not allow images.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 105,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.basicWithImages()",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     This whitelist allows the same text tags as {@link #basic}, and also allows \u003ccode\u003eimg\u003c/code\u003e tags, with appropriate\n     attributes, with \u003ccode\u003esrc\u003c/code\u003e pointing to \u003ccode\u003ehttp\u003c/code\u003e or \u003ccode\u003ehttps\u003c/code\u003e.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.relaxed()",
      "begin_line": 132,
      "end_line": 160,
      "comment": "\n     This whitelist allows a full range of text and structural body HTML: \u003ccode\u003ea, b, blockquote, br, caption, cite,\n     code, col, colgroup, dd, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, strike, strong, sub,\n     sup, table, tbody, td, tfoot, th, thead, tr, u, ul\u003c/code\u003e\n     \u003cp/\u003e\n     Links do not have an enforced \u003ccode\u003erel\u003dnofollow\u003c/code\u003e attribute, but you can add that if desired.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 159,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Whitelist()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     Create a new, empty whitelist. Generally it will be better to start with a default prepared whitelist instead.\n\n     @see #basic()\n     @see #basicWithImages()\n     @see #simpleText()\n     @see #relaxed()\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 42)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 173,col 9)-(line 173,col 87)",
        "(line 174,col 9)-(line 174,col 77)",
        "(line 175,col 9)-(line 175,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addTags(java.lang.String...)",
      "begin_line": 184,
      "end_line": 192,
      "comment": "\n     Add a list of allowed elements to a whitelist. (If a tag is not allowed, it will be removed from the HTML.)\n\n     @param tags tag names to allow\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 31)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addAttributes(java.lang.String, java.lang.String...)",
      "begin_line": 204,
      "end_line": 221,
      "comment": "\n     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)\n     \u003cp/\u003e\n     To make an attribute valid for \u003cb\u003eall tags\u003c/b\u003e, use the pseudo tag \u003ccode\u003e:all\u003c/code\u003e, e.g.\n     \u003ccode\u003eaddAttributes(\":all\", \"class\")\u003c/code\u003e.\n\n     @param tag  The tag the attributes are for\n     @param keys List of valid attributes for the tag\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 31)",
        "(line 206,col 9)-(line 206,col 31)",
        "(line 208,col 9)-(line 208,col 47)",
        "(line 209,col 9)-(line 209,col 69)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 235,
      "end_line": 252,
      "comment": "\n     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element\n     already has the attribute set, it will be overridden.\n     \u003cp/\u003e\n     E.g.: \u003ccode\u003eaddEnforcedAttribute(\"a\", \"rel\", \"nofollow\")\u003c/code\u003e will make all \u003ccode\u003ea\u003c/code\u003e tags output as\n     \u003ccode\u003e\u0026lt;a href\u003d\"...\" rel\u003d\"nofollow\"\u003e\u003c/code\u003e\n\n     @param tag   The tag the enforced attribute is for\n     @param key   The attribute key\n     @param value The enforced attribute value\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 31)",
        "(line 237,col 9)-(line 237,col 31)",
        "(line 238,col 9)-(line 238,col 33)",
        "(line 240,col 9)-(line 240,col 47)",
        "(line 241,col 9)-(line 241,col 57)",
        "(line 242,col 9)-(line 242,col 63)",
        "(line 244,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.preserveRelativeLinks(boolean)",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * Configure this Whitelist to preserve relative links in an element\u0027s URL attribute, or convert them to absolute\n     * links. By default, this is \u003cb\u003efalse\u003c/b\u003e: URLs will be  made absolute (e.g. start with an allowed protocol, like\n     * e.g. {@code http://}.\n     * \u003cp /\u003e\n     * Note that when handling relative links, the input document must have an appropriate {@code base URI} set when\n     * parsing, so that the link\u0027s protocol can be confirmed. Regardless of the setting of the {@code preserve relative\n     * links} option, the link must be resolvable against the base URI to an allowed protocol; otherwise the attribute\n     * will be removed.\n     *\n     * @param preserve {@code true} to allow relative links, {@code false} (default) to deny\n     * @return this Whitelist, for chaining.\n     * @see #addProtocols\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addProtocols(java.lang.String, java.lang.String, java.lang.String...)",
      "begin_line": 284,
      "end_line": 312,
      "comment": "\n     Add allowed URL protocols for an element\u0027s URL attribute. This restricts the possible values of the attribute to\n     URLs with the defined protocol.\n     \u003cp/\u003e\n     E.g.: \u003ccode\u003eaddProtocols(\"a\", \"href\", \"ftp\", \"http\", \"https\")\u003c/code\u003e\n\n     @param tag       Tag the URL protocol is for\n     @param key       Attribute key\n     @param protocols List of valid protocols\n     @return this, for chaining\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 31)",
        "(line 286,col 9)-(line 286,col 31)",
        "(line 287,col 9)-(line 287,col 36)",
        "(line 289,col 9)-(line 289,col 47)",
        "(line 290,col 9)-(line 290,col 57)",
        "(line 291,col 9)-(line 291,col 49)",
        "(line 292,col 9)-(line 292,col 30)",
        "(line 294,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeTag(java.lang.String)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)",
      "begin_line": 318,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 47)",
        "(line 320,col 9)-(line 320,col 63)",
        "(line 322,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.testValidProtocol(org.jsoup.nodes.Element, org.jsoup.nodes.Attribute, java.util.Set\u003corg.jsoup.safety.Whitelist.Protocol\u003e)",
      "begin_line": 338,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 48)",
        "(line 342,col 9)-(line 343,col 36)",
        "(line 344,col 9)-(line 345,col 33)",
        "(line 347,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.getEnforcedAttributes(java.lang.String)",
      "begin_line": 356,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 44)",
        "(line 358,col 9)-(line 358,col 47)",
        "(line 359,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TagName",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 370,
      "end_line": 378,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TagName.TagName(java.lang.String)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TagName.valueOf(java.lang.String)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKey",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 380,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.AttributeKey(java.lang.String)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.valueOf(java.lang.String)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 390,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.AttributeValue(java.lang.String)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 392,col 13)-(line 392,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.valueOf(java.lang.String)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 13)-(line 396,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Protocol",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 400,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Protocol.Protocol(java.lang.String)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.Protocol.valueOf(java.lang.String)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 13)-(line 406,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypedValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 410,
      "end_line": 442,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.TypedValue(java.lang.String)",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 36)",
        "(line 415,col 13)-(line 415,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.hashCode()",
      "begin_line": 418,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 33)",
        "(line 421,col 13)-(line 421,col 27)",
        "(line 422,col 13)-(line 422,col 79)",
        "(line 423,col 13)-(line 423,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.equals(java.lang.Object)",
      "begin_line": 426,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 41)",
        "(line 429,col 13)-(line 429,col 42)",
        "(line 430,col 13)-(line 430,col 59)",
        "(line 431,col 13)-(line 431,col 48)",
        "(line 432,col 13)-(line 434,col 64)",
        "(line 435,col 13)-(line 435,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.toString()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 25)"
      ]
    }
  ]
}