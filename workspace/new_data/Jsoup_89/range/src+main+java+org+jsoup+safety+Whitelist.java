{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/safety/Whitelist.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Whitelist",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 66,
      "end_line": 642,
      "comment": "\n Whitelists define what HTML (elements and attributes) to allow through the cleaner. Everything else is removed.\n \u003cp\u003e\n Start with one of the defaults:\n \u003c/p\u003e\n \u003cul\u003e\n \u003cli\u003e{@link #none}\n \u003cli\u003e{@link #simpleText}\n \u003cli\u003e{@link #basic}\n \u003cli\u003e{@link #basicWithImages}\n \u003cli\u003e{@link #relaxed}\n \u003c/ul\u003e\n \u003cp\u003e\n If you need to allow more through (please be careful!), tweak a base whitelist with:\n \u003c/p\u003e\n \u003cul\u003e\n \u003cli\u003e{@link #addTags}\n \u003cli\u003e{@link #addAttributes}\n \u003cli\u003e{@link #addEnforcedAttribute}\n \u003cli\u003e{@link #addProtocols}\n \u003c/ul\u003e\n \u003cp\u003e\n You can remove any setting from an existing whitelist with:\n \u003c/p\u003e\n \u003cul\u003e\n \u003cli\u003e{@link #removeTags}\n \u003cli\u003e{@link #removeAttributes}\n \u003cli\u003e{@link #removeEnforcedAttribute}\n \u003cli\u003e{@link #removeProtocols}\n \u003c/ul\u003e\n \n \u003cp\u003e\n The cleaner and these whitelists assume that you want to clean a \u003ccode\u003ebody\u003c/code\u003e fragment of HTML (to add user\n supplied HTML into a templated page), and not to clean a full HTML document. If the latter is the case, either wrap the\n document HTML around the cleaned body HTML, or create a whitelist that allows \u003ccode\u003ehtml\u003c/code\u003e and \u003ccode\u003ehead\u003c/code\u003e\n elements as appropriate.\n \u003c/p\u003e\n \u003cp\u003e\n If you are going to extend a whitelist, please be very careful. Make sure you understand what attributes may lead to\n XSS attack vectors. URL attributes are particularly vulnerable and require careful validation. See \n http://ha.ckers.org/xss.html for some XSS attack examples.\n \u003c/p\u003e\n\n @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "tagNames"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " tags allowed, lower case. e.g. [p, br, span]"
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " tag -\u003e attribute[]. allowed attributes [href] for a tag."
    },
    {
      "type": "field",
      "varNames": [
        "enforcedAttributes"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " always set these attribute values"
    },
    {
      "type": "field",
      "varNames": [
        "protocols"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " allowed URL protocols for attributes"
    },
    {
      "type": "field",
      "varNames": [
        "preserveRelativeLinks"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " option to preserve relative links"
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.none()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     This whitelist allows only text nodes: all HTML will be stripped.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.simpleText()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     This whitelist allows only simple text formatting: \u003ccode\u003eb, em, i, strong, u\u003c/code\u003e. All other HTML (tags and\n     attributes) will be removed.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.basic()",
      "begin_line": 109,
      "end_line": 127,
      "comment": "\n     \u003cp\u003e\n     This whitelist allows a fuller range of text nodes: \u003ccode\u003ea, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,\n     ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul\u003c/code\u003e, and appropriate attributes.\n     \u003c/p\u003e\n     \u003cp\u003e\n     Links (\u003ccode\u003ea\u003c/code\u003e elements) can point to \u003ccode\u003ehttp, https, ftp, mailto\u003c/code\u003e, and have an enforced\n     \u003ccode\u003erel\u003dnofollow\u003c/code\u003e attribute.\n     \u003c/p\u003e\n     \u003cp\u003e\n     Does not allow images.\n     \u003c/p\u003e\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 125,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.basicWithImages()",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\n     This whitelist allows the same text tags as {@link #basic}, and also allows \u003ccode\u003eimg\u003c/code\u003e tags, with appropriate\n     attributes, with \u003ccode\u003esrc\u003c/code\u003e pointing to \u003ccode\u003ehttp\u003c/code\u003e or \u003ccode\u003ehttps\u003c/code\u003e.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.relaxed()",
      "begin_line": 153,
      "end_line": 182,
      "comment": "\n     This whitelist allows a full range of text and structural body HTML: \u003ccode\u003ea, b, blockquote, br, caption, cite,\n     code, col, colgroup, dd, div, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, span, strike, strong, sub,\n     sup, table, tbody, td, tfoot, th, thead, tr, u, ul\u003c/code\u003e\n     \u003cp\u003e\n     Links do not have an enforced \u003ccode\u003erel\u003dnofollow\u003c/code\u003e attribute, but you can add that if desired.\n     \u003c/p\u003e\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 181,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Whitelist()",
      "begin_line": 192,
      "end_line": 198,
      "comment": "\n     Create a new, empty whitelist. Generally it will be better to start with a default prepared whitelist instead.\n\n     @see #basic()\n     @see #basicWithImages()\n     @see #simpleText()\n     @see #relaxed()\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 37)",
        "(line 195,col 9)-(line 195,col 45)",
        "(line 196,col 9)-(line 196,col 36)",
        "(line 197,col 9)-(line 197,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addTags(java.lang.String...)",
      "begin_line": 206,
      "end_line": 214,
      "comment": "\n     Add a list of allowed elements to a whitelist. (If a tag is not allowed, it will be removed from the HTML.)\n\n     @param tags tag names to allow\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 31)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeTags(java.lang.String...)",
      "begin_line": 222,
      "end_line": 236,
      "comment": "\n     Remove a list of allowed elements from a whitelist. (If a tag is not allowed, it will be removed from the HTML.)\n\n     @param tags tag names to disallow\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 31)",
        "(line 225,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addAttributes(java.lang.String, java.lang.String...)",
      "begin_line": 253,
      "end_line": 272,
      "comment": "\n     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eaddAttributes(\"a\", \"href\", \"class\")\u003c/code\u003e allows \u003ccode\u003ehref\u003c/code\u003e and \u003ccode\u003eclass\u003c/code\u003e attributes\n     on \u003ccode\u003ea\u003c/code\u003e tags.\n     \u003c/p\u003e\n     \u003cp\u003e\n     To make an attribute valid for \u003cb\u003eall tags\u003c/b\u003e, use the pseudo tag \u003ccode\u003e:all\u003c/code\u003e, e.g.\n     \u003ccode\u003eaddAttributes(\":all\", \"class\")\u003c/code\u003e.\n     \u003c/p\u003e\n\n     @param tag  The tag the attributes are for. The tag will be added to the allowed tag list if necessary.\n     @param attributes List of valid attributes for the tag\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 31)",
        "(line 255,col 9)-(line 255,col 37)",
        "(line 256,col 9)-(line 256,col 79)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 259,col 30)",
        "(line 260,col 9)-(line 260,col 57)",
        "(line 261,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeAttributes(java.lang.String, java.lang.String...)",
      "begin_line": 289,
      "end_line": 316,
      "comment": "\n     Remove a list of allowed attributes from a tag. (If an attribute is not allowed on an element, it will be removed.)\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eremoveAttributes(\"a\", \"href\", \"class\")\u003c/code\u003e disallows \u003ccode\u003ehref\u003c/code\u003e and \u003ccode\u003eclass\u003c/code\u003e\n     attributes on \u003ccode\u003ea\u003c/code\u003e tags.\n     \u003c/p\u003e\n     \u003cp\u003e\n     To make an attribute invalid for \u003cb\u003eall tags\u003c/b\u003e, use the pseudo tag \u003ccode\u003e:all\u003c/code\u003e, e.g.\n     \u003ccode\u003eremoveAttributes(\":all\", \"class\")\u003c/code\u003e.\n     \u003c/p\u003e\n\n     @param tag  The tag the attributes are for.\n     @param attributes List of invalid attributes for the tag\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 31)",
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 292,col 79)",
        "(line 294,col 9)-(line 294,col 47)",
        "(line 295,col 9)-(line 295,col 57)",
        "(line 296,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 314,col 13)",
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 331,
      "end_line": 349,
      "comment": "\n     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element\n     already has the attribute set, it will be overridden with this value.\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eaddEnforcedAttribute(\"a\", \"rel\", \"nofollow\")\u003c/code\u003e will make all \u003ccode\u003ea\u003c/code\u003e tags output as\n     \u003ccode\u003e\u0026lt;a href\u003d\"...\" rel\u003d\"nofollow\"\u0026gt;\u003c/code\u003e\n     \u003c/p\u003e\n\n     @param tag   The tag the enforced attribute is for. The tag will be added to the allowed tag list if necessary.\n     @param attribute   The attribute name\n     @param value The enforced attribute value\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 31)",
        "(line 333,col 9)-(line 333,col 37)",
        "(line 334,col 9)-(line 334,col 33)",
        "(line 336,col 9)-(line 336,col 47)",
        "(line 337,col 9)-(line 337,col 30)",
        "(line 338,col 9)-(line 338,col 63)",
        "(line 339,col 9)-(line 339,col 63)",
        "(line 341,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeEnforcedAttribute(java.lang.String, java.lang.String)",
      "begin_line": 358,
      "end_line": 372,
      "comment": "\n     Remove a previously configured enforced attribute from a tag.\n\n     @param tag   The tag the enforced attribute is for.\n     @param attribute   The attribute name\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 31)",
        "(line 360,col 9)-(line 360,col 37)",
        "(line 362,col 9)-(line 362,col 47)",
        "(line 363,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.preserveRelativeLinks(boolean)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "\n     * Configure this Whitelist to preserve relative links in an element\u0027s URL attribute, or convert them to absolute\n     * links. By default, this is \u003cb\u003efalse\u003c/b\u003e: URLs will be  made absolute (e.g. start with an allowed protocol, like\n     * e.g. {@code http://}.\n     * \u003cp\u003e\n     * Note that when handling relative links, the input document must have an appropriate {@code base URI} set when\n     * parsing, so that the link\u0027s protocol can be confirmed. Regardless of the setting of the {@code preserve relative\n     * links} option, the link must be resolvable against the base URI to an allowed protocol; otherwise the attribute\n     * will be removed.\n     * \u003c/p\u003e\n     *\n     * @param preserve {@code true} to allow relative links, {@code false} (default) to deny\n     * @return this Whitelist, for chaining.\n     * @see #addProtocols\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 41)",
        "(line 391,col 9)-(line 391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addProtocols(java.lang.String, java.lang.String, java.lang.String...)",
      "begin_line": 410,
      "end_line": 438,
      "comment": "\n     Add allowed URL protocols for an element\u0027s URL attribute. This restricts the possible values of the attribute to\n     URLs with the defined protocol.\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eaddProtocols(\"a\", \"href\", \"ftp\", \"http\", \"https\")\u003c/code\u003e\n     \u003c/p\u003e\n     \u003cp\u003e\n     To allow a link to an in-page URL anchor (i.e. \u003ccode\u003e\u0026lt;a href\u003d\"#anchor\"\u0026gt;\u003c/code\u003e, add a \u003ccode\u003e#\u003c/code\u003e:\u003cbr\u003e\n     E.g.: \u003ccode\u003eaddProtocols(\"a\", \"href\", \"#\")\u003c/code\u003e\n     \u003c/p\u003e\n\n     @param tag       Tag the URL protocol is for\n     @param attribute       Attribute name\n     @param protocols List of valid protocols\n     @return this, for chaining\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 31)",
        "(line 412,col 9)-(line 412,col 37)",
        "(line 413,col 9)-(line 413,col 36)",
        "(line 415,col 9)-(line 415,col 47)",
        "(line 416,col 9)-(line 416,col 63)",
        "(line 417,col 9)-(line 417,col 49)",
        "(line 418,col 9)-(line 418,col 30)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeProtocols(java.lang.String, java.lang.String, java.lang.String...)",
      "begin_line": 452,
      "end_line": 478,
      "comment": "\n     Remove allowed URL protocols for an element\u0027s URL attribute. If you remove all protocols for an attribute, that\n     attribute will allow any protocol.\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eremoveProtocols(\"a\", \"href\", \"ftp\")\u003c/code\u003e\n     \u003c/p\u003e\n\n     @param tag Tag the URL protocol is for\n     @param attribute Attribute name\n     @param removeProtocols List of invalid protocols\n     @return this, for chaining\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 31)",
        "(line 454,col 9)-(line 454,col 37)",
        "(line 455,col 9)-(line 455,col 42)",
        "(line 457,col 9)-(line 457,col 47)",
        "(line 458,col 9)-(line 458,col 60)",
        "(line 462,col 9)-(line 462,col 101)",
        "(line 463,col 9)-(line 463,col 79)",
        "(line 464,col 9)-(line 464,col 101)",
        "(line 466,col 9)-(line 466,col 61)",
        "(line 467,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeTag(java.lang.String)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Test if the supplied tag is allowed by this whitelist\n     * @param tag test tag\n     * @return true if allowed\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)",
      "begin_line": 496,
      "end_line": 521,
      "comment": "\n     * Test if the supplied attribute is allowed by this whitelist for this tag\n     * @param tagName tag to consider allowing the attribute in\n     * @param el element under test, to confirm protocol\n     * @param attr attribute under test\n     * @return true if allowed\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 47)",
        "(line 498,col 9)-(line 498,col 63)",
        "(line 500,col 9)-(line 500,col 54)",
        "(line 501,col 9)-(line 509,col 9)",
        "(line 511,col 9)-(line 511,col 84)",
        "(line 512,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 520,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.testValidProtocol(org.jsoup.nodes.Element, org.jsoup.nodes.Attribute, java.util.Set\u003corg.jsoup.safety.Whitelist.Protocol\u003e)",
      "begin_line": 523,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 48)",
        "(line 527,col 9)-(line 528,col 36)",
        "(line 529,col 9)-(line 530,col 33)",
        "(line 532,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isValidAnchor(java.lang.String)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.getEnforcedAttributes(java.lang.String)",
      "begin_line": 556,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 44)",
        "(line 558,col 9)-(line 558,col 47)",
        "(line 559,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TagName",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 570,
      "end_line": 578,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TagName.TagName(java.lang.String)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TagName.valueOf(java.lang.String)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKey",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 580,
      "end_line": 588,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.AttributeKey(java.lang.String)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 13)-(line 582,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.valueOf(java.lang.String)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 590,
      "end_line": 598,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.AttributeValue(java.lang.String)",
      "begin_line": 591,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 13)-(line 592,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.valueOf(java.lang.String)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 596,col 13)-(line 596,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Protocol",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 600,
      "end_line": 608,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Protocol.Protocol(java.lang.String)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.Protocol.valueOf(java.lang.String)",
      "begin_line": 605,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 13)-(line 606,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypedValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 610,
      "end_line": 641,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 611,
      "end_line": 611,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.TypedValue(java.lang.String)",
      "begin_line": 613,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 614,col 13)-(line 614,col 36)",
        "(line 615,col 13)-(line 615,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.hashCode()",
      "begin_line": 618,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 620,col 13)-(line 620,col 33)",
        "(line 621,col 13)-(line 621,col 27)",
        "(line 622,col 13)-(line 622,col 79)",
        "(line 623,col 13)-(line 623,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.equals(java.lang.Object)",
      "begin_line": 626,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 41)",
        "(line 629,col 13)-(line 629,col 42)",
        "(line 630,col 13)-(line 630,col 59)",
        "(line 631,col 13)-(line 631,col 48)",
        "(line 632,col 13)-(line 634,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.toString()",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 639,col 13)-(line 639,col 25)"
      ]
    }
  ]
}