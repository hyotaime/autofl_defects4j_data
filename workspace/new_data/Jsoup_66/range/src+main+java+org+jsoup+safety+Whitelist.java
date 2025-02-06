{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/safety/Whitelist.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Whitelist",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 66,
      "end_line": 645,
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
      "end_line": 273,
      "comment": "\n     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eaddAttributes(\"a\", \"href\", \"class\")\u003c/code\u003e allows \u003ccode\u003ehref\u003c/code\u003e and \u003ccode\u003eclass\u003c/code\u003e attributes\n     on \u003ccode\u003ea\u003c/code\u003e tags.\n     \u003c/p\u003e\n     \u003cp\u003e\n     To make an attribute valid for \u003cb\u003eall tags\u003c/b\u003e, use the pseudo tag \u003ccode\u003e:all\u003c/code\u003e, e.g.\n     \u003ccode\u003eaddAttributes(\":all\", \"class\")\u003c/code\u003e.\n     \u003c/p\u003e\n\n     @param tag  The tag the attributes are for. The tag will be added to the allowed tag list if necessary.\n     @param attributes List of valid attributes for the tag\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 31)",
        "(line 255,col 9)-(line 255,col 37)",
        "(line 256,col 9)-(line 256,col 79)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 260,col 34)",
        "(line 261,col 9)-(line 261,col 57)",
        "(line 262,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeAttributes(java.lang.String, java.lang.String...)",
      "begin_line": 290,
      "end_line": 317,
      "comment": "\n     Remove a list of allowed attributes from a tag. (If an attribute is not allowed on an element, it will be removed.)\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eremoveAttributes(\"a\", \"href\", \"class\")\u003c/code\u003e disallows \u003ccode\u003ehref\u003c/code\u003e and \u003ccode\u003eclass\u003c/code\u003e\n     attributes on \u003ccode\u003ea\u003c/code\u003e tags.\n     \u003c/p\u003e\n     \u003cp\u003e\n     To make an attribute invalid for \u003cb\u003eall tags\u003c/b\u003e, use the pseudo tag \u003ccode\u003e:all\u003c/code\u003e, e.g.\n     \u003ccode\u003eremoveAttributes(\":all\", \"class\")\u003c/code\u003e.\n     \u003c/p\u003e\n\n     @param tag  The tag the attributes are for.\n     @param attributes List of invalid attributes for the tag\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 31)",
        "(line 292,col 9)-(line 292,col 37)",
        "(line 293,col 9)-(line 293,col 79)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 296,col 9)-(line 296,col 57)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 315,col 13)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 332,
      "end_line": 351,
      "comment": "\n     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element\n     already has the attribute set, it will be overridden with this value.\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eaddEnforcedAttribute(\"a\", \"rel\", \"nofollow\")\u003c/code\u003e will make all \u003ccode\u003ea\u003c/code\u003e tags output as\n     \u003ccode\u003e\u0026lt;a href\u003d\"...\" rel\u003d\"nofollow\"\u0026gt;\u003c/code\u003e\n     \u003c/p\u003e\n\n     @param tag   The tag the enforced attribute is for. The tag will be added to the allowed tag list if necessary.\n     @param attribute   The attribute name\n     @param value The enforced attribute value\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 31)",
        "(line 334,col 9)-(line 334,col 37)",
        "(line 335,col 9)-(line 335,col 33)",
        "(line 337,col 9)-(line 337,col 47)",
        "(line 338,col 9)-(line 339,col 34)",
        "(line 340,col 9)-(line 340,col 63)",
        "(line 341,col 9)-(line 341,col 63)",
        "(line 343,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeEnforcedAttribute(java.lang.String, java.lang.String)",
      "begin_line": 360,
      "end_line": 374,
      "comment": "\n     Remove a previously configured enforced attribute from a tag.\n\n     @param tag   The tag the enforced attribute is for.\n     @param attribute   The attribute name\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 31)",
        "(line 362,col 9)-(line 362,col 37)",
        "(line 364,col 9)-(line 364,col 47)",
        "(line 365,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.preserveRelativeLinks(boolean)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\n     * Configure this Whitelist to preserve relative links in an element\u0027s URL attribute, or convert them to absolute\n     * links. By default, this is \u003cb\u003efalse\u003c/b\u003e: URLs will be  made absolute (e.g. start with an allowed protocol, like\n     * e.g. {@code http://}.\n     * \u003cp\u003e\n     * Note that when handling relative links, the input document must have an appropriate {@code base URI} set when\n     * parsing, so that the link\u0027s protocol can be confirmed. Regardless of the setting of the {@code preserve relative\n     * links} option, the link must be resolvable against the base URI to an allowed protocol; otherwise the attribute\n     * will be removed.\n     * \u003c/p\u003e\n     *\n     * @param preserve {@code true} to allow relative links, {@code false} (default) to deny\n     * @return this Whitelist, for chaining.\n     * @see #addProtocols\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 41)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addProtocols(java.lang.String, java.lang.String, java.lang.String...)",
      "begin_line": 412,
      "end_line": 440,
      "comment": "\n     Add allowed URL protocols for an element\u0027s URL attribute. This restricts the possible values of the attribute to\n     URLs with the defined protocol.\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eaddProtocols(\"a\", \"href\", \"ftp\", \"http\", \"https\")\u003c/code\u003e\n     \u003c/p\u003e\n     \u003cp\u003e\n     To allow a link to an in-page URL anchor (i.e. \u003ccode\u003e\u0026lt;a href\u003d\"#anchor\"\u0026gt;\u003c/code\u003e, add a \u003ccode\u003e#\u003c/code\u003e:\u003cbr\u003e\n     E.g.: \u003ccode\u003eaddProtocols(\"a\", \"href\", \"#\")\u003c/code\u003e\n     \u003c/p\u003e\n\n     @param tag       Tag the URL protocol is for\n     @param attribute       Attribute name\n     @param protocols List of valid protocols\n     @return this, for chaining\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 31)",
        "(line 414,col 9)-(line 414,col 37)",
        "(line 415,col 9)-(line 415,col 36)",
        "(line 417,col 9)-(line 417,col 47)",
        "(line 418,col 9)-(line 418,col 63)",
        "(line 419,col 9)-(line 419,col 49)",
        "(line 420,col 9)-(line 420,col 30)",
        "(line 422,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.removeProtocols(java.lang.String, java.lang.String, java.lang.String...)",
      "begin_line": 454,
      "end_line": 480,
      "comment": "\n     Remove allowed URL protocols for an element\u0027s URL attribute. If you remove all protocols for an attribute, that\n     attribute will allow any protocol.\n     \u003cp\u003e\n     E.g.: \u003ccode\u003eremoveProtocols(\"a\", \"href\", \"ftp\")\u003c/code\u003e\n     \u003c/p\u003e\n\n     @param tag Tag the URL protocol is for\n     @param attribute Attribute name\n     @param removeProtocols List of invalid protocols\n     @return this, for chaining\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 31)",
        "(line 456,col 9)-(line 456,col 37)",
        "(line 457,col 9)-(line 457,col 42)",
        "(line 459,col 9)-(line 459,col 47)",
        "(line 460,col 9)-(line 460,col 60)",
        "(line 464,col 9)-(line 464,col 101)",
        "(line 465,col 9)-(line 465,col 79)",
        "(line 466,col 9)-(line 466,col 101)",
        "(line 468,col 9)-(line 468,col 61)",
        "(line 469,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeTag(java.lang.String)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Test if the supplied tag is allowed by this whitelist\n     * @param tag test tag\n     * @return true if allowed\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)",
      "begin_line": 498,
      "end_line": 523,
      "comment": "\n     * Test if the supplied attribute is allowed by this whitelist for this tag\n     * @param tagName tag to consider allowing the attribute in\n     * @param el element under test, to confirm protocol\n     * @param attr attribute under test\n     * @return true if allowed\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 47)",
        "(line 500,col 9)-(line 500,col 63)",
        "(line 502,col 9)-(line 502,col 54)",
        "(line 503,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 513,col 84)",
        "(line 514,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 522,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.testValidProtocol(org.jsoup.nodes.Element, org.jsoup.nodes.Attribute, java.util.Set\u003corg.jsoup.safety.Whitelist.Protocol\u003e)",
      "begin_line": 525,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 48)",
        "(line 529,col 9)-(line 530,col 36)",
        "(line 531,col 9)-(line 532,col 33)",
        "(line 534,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isValidAnchor(java.lang.String)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.getEnforcedAttributes(java.lang.String)",
      "begin_line": 558,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 44)",
        "(line 560,col 9)-(line 560,col 47)",
        "(line 561,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TagName",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 572,
      "end_line": 580,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TagName.TagName(java.lang.String)",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 13)-(line 574,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TagName.valueOf(java.lang.String)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 13)-(line 578,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKey",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 582,
      "end_line": 590,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.AttributeKey(java.lang.String)",
      "begin_line": 583,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 13)-(line 584,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.valueOf(java.lang.String)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 588,col 13)-(line 588,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 592,
      "end_line": 600,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.AttributeValue(java.lang.String)",
      "begin_line": 593,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 13)-(line 594,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.valueOf(java.lang.String)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Protocol",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 602,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Protocol.Protocol(java.lang.String)",
      "begin_line": 603,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 604,col 13)-(line 604,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.Protocol.valueOf(java.lang.String)",
      "begin_line": 607,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 13)-(line 608,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypedValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 612,
      "end_line": 644,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 613,
      "end_line": 613,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.TypedValue(java.lang.String)",
      "begin_line": 615,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 616,col 13)-(line 616,col 36)",
        "(line 617,col 13)-(line 617,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.hashCode()",
      "begin_line": 620,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 622,col 13)-(line 622,col 33)",
        "(line 623,col 13)-(line 623,col 27)",
        "(line 624,col 13)-(line 624,col 79)",
        "(line 625,col 13)-(line 625,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.equals(java.lang.Object)",
      "begin_line": 628,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 630,col 13)-(line 630,col 41)",
        "(line 631,col 13)-(line 631,col 42)",
        "(line 632,col 13)-(line 632,col 59)",
        "(line 633,col 13)-(line 633,col 48)",
        "(line 634,col 13)-(line 636,col 64)",
        "(line 637,col 13)-(line 637,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.toString()",
      "begin_line": 640,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 25)"
      ]
    }
  ]
}