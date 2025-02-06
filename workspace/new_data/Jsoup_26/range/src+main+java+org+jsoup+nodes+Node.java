{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 19,
      "end_line": 617,
      "comment": "\n The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childNodes"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingIndex"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 31,
      "end_line": 38,
      "comment": "\n     Create a new Node.\n     @param baseUri base URI\n     @param attributes attributes (not null, but may be empty)\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 34)",
        "(line 33,col 9)-(line 33,col 37)",
        "(line 35,col 9)-(line 35,col 44)",
        "(line 36,col 9)-(line 36,col 38)",
        "(line 37,col 9)-(line 37,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Default constructor. Doesn\u0027t setup base uri, children, or attributes; use with caution.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)",
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodeName()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).\n     @return node name\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n     * Get an attribute\u0027s value by its key.\n     * \u003cp/\u003e\n     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with \u003ccode\u003e\u003cb\u003eabs\u003c/b\u003e\u003c/code\u003e,\n     * which is a shortcut to the {@link #absUrl} method.\n     * E.g.: \u003cblockquote\u003e\u003ccode\u003eString url \u003d a.attr(\"abs:href\");\u003c/code\u003e\u003c/blockquote\u003e\n     * @param attributeKey The attribute key.\n     * @return The attribute, or empty string if not present (to avoid nulls).\n     * @see #attributes()\n     * @see #hasAttr(String)\n     * @see #absUrl(String)\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 39)",
        "(line 73,col 9)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attributes()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Get all of the element\u0027s attributes.\n     * @return attributes (which implements iterable, in same order as presented in original HTML).\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String, java.lang.String)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Set an attribute (key\u003dvalue). If the attribute already exists, it is replaced.\n     * @param attributeKey The attribute key.\n     * @param attributeValue The attribute value.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 53)",
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttr(java.lang.String)",
      "begin_line": 104,
      "end_line": 113,
      "comment": "\n     * Test if this element has an attribute.\n     * @param attributeKey The attribute key to check.\n     * @return true if the attribute exists, false if not.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 39)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeAttr(java.lang.String)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Remove an attribute from this element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.baseUri()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     Get the base URI of this node.\n     @return base URI\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setBaseUri(java.lang.String)",
      "begin_line": 138,
      "end_line": 149,
      "comment": "\n     Update the base URI of this node and all of its descendants.\n     @param baseUri base URI to set\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 34)",
        "(line 141,col 9)-(line 148,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-3f21c7e2-77e9-4f27-b32c-0d7d828da050.head(org.jsoup.nodes.Node, int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 17)-(line 143,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-e90f9a19-37d7-4127-9e21-c116e252d457.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 146,
      "end_line": 147,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.absUrl(java.lang.String)",
      "begin_line": 171,
      "end_line": 196,
      "comment": "\n     * Get an absolute URL from a URL attribute that may be relative (i.e. an \u003ccode\u003e\u0026lt;a href\u003e\u003c/code\u003e or\n     * \u003ccode\u003e\u0026lt;img src\u003e\u003c/code\u003e).\n     * \u003cp/\u003e\n     * E.g.: \u003ccode\u003eString absUrl \u003d linkEl.absUrl(\"href\");\u003c/code\u003e\n     * \u003cp/\u003e\n     * If the attribute value is already absolute (i.e. it starts with a protocol, like\n     * \u003ccode\u003ehttp://\u003c/code\u003e or \u003ccode\u003ehttps://\u003c/code\u003e etc), and it successfully parses as a URL, the attribute is\n     * returned directly. Otherwise, it is treated as a URL relative to the element\u0027s {@link #baseUri}, and made\n     * absolute using that.\n     * \u003cp/\u003e\n     * As an alternate, you can use the {@link #attr} method with the \u003ccode\u003eabs:\u003c/code\u003e prefix, e.g.:\n     * \u003ccode\u003eString absUrl \u003d linkEl.attr(\"abs:href\");\u003c/code\u003e\n     *\n     * @param attributeKey The attribute key\n     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or\n     * could not be made successfully into a URL.\n     * @see #attr\n     * @see java.net.URL#URL(java.net.URL, String)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 40)",
        "(line 174,col 9)-(line 174,col 43)",
        "(line 175,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNode(int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     Get a child node by index\n     @param index index of child node\n     @return the child node at this index.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodes()",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Gets the Document associated with this Node. \n     * @return the Document associated with this Node, or null if there is no such Document.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 240,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 37)",
        "(line 248,col 9)-(line 248,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(java.lang.String)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Insert the specified HTML into the DOM before this node (i.e. as a preceding sibling).\n     * @param html HTML to add before this node\n     * @return this node, for chaining\n     * @see #after(String)\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 45)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(org.jsoup.nodes.Node)",
      "begin_line": 268,
      "end_line": 274,
      "comment": "\n     * Insert the specified node into the DOM before this node (i.e. as a preceding sibling).\n     * @param node to add before this node\n     * @return this node, for chaining\n     * @see #after(Node)\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 31)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 273,col 9)-(line 273,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(java.lang.String)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).\n     * @param html HTML to add after this node\n     * @return this node, for chaining\n     * @see #before(String)\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 47)",
        "(line 284,col 9)-(line 284,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(org.jsoup.nodes.Node)",
      "begin_line": 293,
      "end_line": 299,
      "comment": "\n     * Insert the specified node into the DOM after this node (i.e. as a following sibling).\n     * @param node to add after this node\n     * @return this node, for chaining\n     * @see #before(Node)\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 31)",
        "(line 295,col 9)-(line 295,col 37)",
        "(line 297,col 9)-(line 297,col 55)",
        "(line 298,col 9)-(line 298,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addSiblingHtml(int, java.lang.String)",
      "begin_line": 301,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 31)",
        "(line 303,col 9)-(line 303,col 37)",
        "(line 305,col 9)-(line 305,col 82)",
        "(line 306,col 9)-(line 306,col 74)",
        "(line 307,col 9)-(line 307,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.wrap(java.lang.String)",
      "begin_line": 315,
      "end_line": 338,
      "comment": "\n     Wrap the supplied HTML around this node.\n     @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this node, for chaining.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 32)",
        "(line 318,col 9)-(line 318,col 82)",
        "(line 319,col 9)-(line 319,col 81)",
        "(line 320,col 9)-(line 320,col 44)",
        "(line 321,col 9)-(line 322,col 24)",
        "(line 324,col 9)-(line 324,col 42)",
        "(line 325,col 9)-(line 325,col 45)",
        "(line 326,col 9)-(line 326,col 44)",
        "(line 327,col 9)-(line 327,col 34)",
        "(line 330,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.unwrap()",
      "begin_line": 353,
      "end_line": 362,
      "comment": "\n     * Removes this node from the DOM, and moves its children up into the node\u0027s parent. This has the effect of dropping\n     * the node but keeping its children.\n     * \u003cp/\u003e\n     * For example, with the input html:\u003cbr/\u003e\n     * {@code \u003cdiv\u003eOne \u003cspan\u003eTwo \u003cb\u003eThree\u003c/b\u003e\u003c/span\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:\u003cbr/\u003e\n     * {@code \u003cdiv\u003eOne Two \u003cb\u003eThree\u003c/b\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * and the {@code \"Two \"} {@link TextNode} being returned.\n     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.\n     * @see #remove()\n     * @see #wrap(String)\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 37)",
        "(line 356,col 9)-(line 356,col 33)",
        "(line 357,col 9)-(line 357,col 75)",
        "(line 358,col 9)-(line 358,col 64)",
        "(line 359,col 9)-(line 359,col 22)",
        "(line 361,col 9)-(line 361,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getDeepChild(org.jsoup.nodes.Element)",
      "begin_line": 364,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 369,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 376,
      "end_line": 380,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 29)",
        "(line 378,col 9)-(line 378,col 37)",
        "(line 379,col 9)-(line 379,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 382,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 384,col 46)",
        "(line 385,col 9)-(line 385,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 388,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 48)",
        "(line 390,col 9)-(line 390,col 29)",
        "(line 391,col 9)-(line 392,col 42)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 395,col 34)",
        "(line 396,col 9)-(line 396,col 29)",
        "(line 397,col 9)-(line 397,col 34)",
        "(line 398,col 9)-(line 398,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 401,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 39)",
        "(line 404,col 9)-(line 404,col 33)",
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 409,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 418,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 42)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 430,col 48)",
        "(line 431,col 9)-(line 431,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren()",
      "begin_line": 434,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 445,
      "end_line": 455,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not\n     include this node (a node is not a sibling of itself).\n     @return node siblings. If the node has no parent, returns an empty list.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 447,col 43)",
        "(line 449,col 9)-(line 449,col 49)",
        "(line 450,col 9)-(line 450,col 68)",
        "(line 451,col 9)-(line 453,col 35)",
        "(line 454,col 9)-(line 454,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 461,
      "end_line": 472,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 463,col 24)",
        "(line 465,col 9)-(line 465,col 52)",
        "(line 466,col 9)-(line 466,col 39)",
        "(line 467,col 9)-(line 467,col 32)",
        "(line 468,col 9)-(line 471,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 478,
      "end_line": 489,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 480,col 24)",
        "(line 482,col 9)-(line 482,col 52)",
        "(line 483,col 9)-(line 483,col 39)",
        "(line 484,col 9)-(line 484,col 32)",
        "(line 485,col 9)-(line 488,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 501,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 510,
      "end_line": 515,
      "comment": "\n     * Perform a depth-first traversal through this node and its descendants.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this node, for chaining\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 38)",
        "(line 512,col 9)-(line 512,col 65)",
        "(line 513,col 9)-(line 513,col 33)",
        "(line 514,col 9)-(line 514,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 521,
      "end_line": 525,
      "comment": "\n     Get the outer HTML of this node.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 53)",
        "(line 523,col 9)-(line 523,col 25)",
        "(line 524,col 9)-(line 524,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.StringBuilder)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getOutputSettings()",
      "begin_line": 532,
      "end_line": 534,
      "comment": " if this node has no document (or parent), retrieve the default output settings",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 540,
      "end_line": 540,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 542,
      "end_line": 542,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 552,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 35)",
        "(line 556,col 9)-(line 556,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hashCode()",
      "begin_line": 559,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 68)",
        "(line 563,col 9)-(line 563,col 80)",
        "(line 564,col 9)-(line 564,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clone()",
      "begin_line": 575,
      "end_line": 578,
      "comment": "\n     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or\n     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the\n     * original node.\n     * \u003cp\u003e\n     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.\n     * @return stand-alone cloned node\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doClone(org.jsoup.nodes.Node)",
      "begin_line": 580,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 19)",
        "(line 582,col 9)-(line 586,col 9)",
        "(line 588,col 9)-(line 588,col 34)",
        "(line 589,col 9)-(line 589,col 63)",
        "(line 590,col 9)-(line 590,col 74)",
        "(line 591,col 9)-(line 591,col 32)",
        "(line 592,col 9)-(line 592,col 66)",
        "(line 593,col 9)-(line 594,col 55)",
        "(line 596,col 9)-(line 596,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 599,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 603,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 604,col 13)-(line 604,col 31)",
        "(line 605,col 13)-(line 605,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 13)-(line 609,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 612,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 613,col 13)-(line 614,col 54)"
      ]
    }
  ]
}