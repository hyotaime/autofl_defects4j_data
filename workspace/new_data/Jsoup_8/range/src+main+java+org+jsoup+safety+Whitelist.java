{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/safety/Whitelist.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Whitelist",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 419,
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
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.none()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     This whitelist allows only text nodes: all HTML will be stripped.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.simpleText()",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     This whitelist allows only simple text formatting: \u003ccode\u003eb, em, i, strong, u\u003c/code\u003e. All other HTML (tags and\n     attributes) will be removed.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.basic()",
      "begin_line": 88,
      "end_line": 106,
      "comment": "\n     This whitelist allows a fuller range of text nodes: \u003ccode\u003ea, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,\n     ol, p, pre, q, small, strike, strong, sub, sup, u, ul\u003c/code\u003e, and appropriate attributes.\n     \u003cp/\u003e\n     Links (\u003ccode\u003ea\u003c/code\u003e elements) can point to \u003ccode\u003ehttp, https, ftp, mailto\u003c/code\u003e, and have an enforced\n     \u003ccode\u003erel\u003dnofollow\u003c/code\u003e attribute.\n     \u003cp/\u003e\n     Does not allow images.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.basicWithImages()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     This whitelist allows the same text tags as {@link #basic}, and also allows \u003ccode\u003eimg\u003c/code\u003e tags, with appropriate\n     attributes, with \u003ccode\u003esrc\u003c/code\u003e pointing to \u003ccode\u003ehttp\u003c/code\u003e or \u003ccode\u003ehttps\u003c/code\u003e.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.relaxed()",
      "begin_line": 131,
      "end_line": 159,
      "comment": "\n     This whitelist allows a full range of text and structural body HTML: \u003ccode\u003ea, b, blockquote, br, caption, cite,\n     code, col, colgroup, dd, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, strike, strong, sub,\n     sup, table, tbody, td, tfoot, th, thead, tr, u, ul\u003c/code\u003e\n     \u003cp/\u003e\n     Links do not have an enforced \u003ccode\u003erel\u003dnofollow\u003c/code\u003e attribute, but you can add that if desired.\n\n     @return whitelist\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 158,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Whitelist()",
      "begin_line": 169,
      "end_line": 174,
      "comment": "\n     Create a new, empty whitelist. Generally it will be better to start with a default prepared whitelist instead.\n\n     @see #basic()\n     @see #basicWithImages()\n     @see #simpleText()\n     @see #relaxed()\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 42)",
        "(line 171,col 9)-(line 171,col 63)",
        "(line 172,col 9)-(line 172,col 87)",
        "(line 173,col 9)-(line 173,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addTags(java.lang.String...)",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     Add a list of allowed elements to a whitelist. (If a tag is not allowed, it will be removed from the HTML.)\n\n     @param tags tag names to allow\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 31)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addAttributes(java.lang.String, java.lang.String...)",
      "begin_line": 202,
      "end_line": 219,
      "comment": "\n     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)\n     \u003cp/\u003e\n     To make an attribute valid for \u003cb\u003eall tags\u003c/b\u003e, use the pseudo tag \u003ccode\u003e:all\u003c/code\u003e, e.g.\n     \u003ccode\u003eaddAttributes(\":all\", \"class\")\u003c/code\u003e.\n\n     @param tag  The tag the attributes are for\n     @param keys List of valid attributes for the tag\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 204,col 31)",
        "(line 206,col 9)-(line 206,col 47)",
        "(line 207,col 9)-(line 207,col 69)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 233,
      "end_line": 250,
      "comment": "\n     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element\n     already has the attribute set, it will be overridden.\n     \u003cp/\u003e\n     E.g.: \u003ccode\u003eaddEnforcedAttribute(\"a\", \"rel\", \"nofollow\")\u003c/code\u003e will make all \u003ccode\u003ea\u003c/code\u003e tags output as\n     \u003ccode\u003e\u0026lt;a href\u003d\"...\" rel\u003d\"nofollow\"\u003e\u003c/code\u003e\n\n     @param tag   The tag the enforced attribute is for\n     @param key   The attribute key\n     @param value The enforced attribute value\n     @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 31)",
        "(line 235,col 9)-(line 235,col 31)",
        "(line 236,col 9)-(line 236,col 33)",
        "(line 238,col 9)-(line 238,col 47)",
        "(line 239,col 9)-(line 239,col 57)",
        "(line 240,col 9)-(line 240,col 63)",
        "(line 242,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.addProtocols(java.lang.String, java.lang.String, java.lang.String...)",
      "begin_line": 263,
      "end_line": 291,
      "comment": "\n     Add allowed URL protocols for an element\u0027s URL attribute. This restricts the possible values of the attribute to\n     URLs with the defined protocol.\n     \u003cp/\u003e\n     E.g.: \u003ccode\u003eaddProtocols(\"a\", \"href\", \"ftp\", \"http\", \"https\")\u003c/code\u003e\n\n     @param tag       Tag the URL protocol is for\n     @param key       Attribute key\n     @param protocols List of valid protocols\n     @return this, for chaining\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 31)",
        "(line 265,col 9)-(line 265,col 31)",
        "(line 266,col 9)-(line 266,col 36)",
        "(line 268,col 9)-(line 268,col 47)",
        "(line 269,col 9)-(line 269,col 57)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 30)",
        "(line 273,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeTag(java.lang.String)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)",
      "begin_line": 297,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 47)",
        "(line 299,col 9)-(line 299,col 63)",
        "(line 301,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.testValidProtocol(org.jsoup.nodes.Element, org.jsoup.nodes.Attribute, java.util.Set\u003corg.jsoup.safety.Whitelist.Protocol\u003e)",
      "begin_line": 317,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 48)",
        "(line 321,col 9)-(line 321,col 29)",
        "(line 323,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.getEnforcedAttributes(java.lang.String)",
      "begin_line": 332,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 44)",
        "(line 334,col 9)-(line 334,col 47)",
        "(line 335,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TagName",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 346,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TagName.TagName(java.lang.String)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TagName.valueOf(java.lang.String)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKey",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 356,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.AttributeKey(java.lang.String)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeKey.valueOf(java.lang.String)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 366,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.AttributeValue(java.lang.String)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.AttributeValue.valueOf(java.lang.String)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Protocol",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.safety.Whitelist.TypedValue"
      ],
      "begin_line": 376,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.Protocol.Protocol(java.lang.String)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.Protocol.valueOf(java.lang.String)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypedValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 386,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.TypedValue(java.lang.String)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 36)",
        "(line 391,col 13)-(line 391,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.hashCode()",
      "begin_line": 394,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 396,col 13)-(line 396,col 33)",
        "(line 397,col 13)-(line 397,col 27)",
        "(line 398,col 13)-(line 398,col 79)",
        "(line 399,col 13)-(line 399,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.equals(java.lang.Object)",
      "begin_line": 402,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 41)",
        "(line 405,col 13)-(line 405,col 42)",
        "(line 406,col 13)-(line 406,col 59)",
        "(line 407,col 13)-(line 407,col 48)",
        "(line 408,col 13)-(line 410,col 64)",
        "(line 411,col 13)-(line 411,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Whitelist.TypedValue.toString()",
      "begin_line": 414,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 416,col 13)-(line 416,col 25)"
      ]
    }
  ]
}