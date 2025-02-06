{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 19,
      "end_line": 606,
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
      "signature": "org.jsoup.nodes.Node.Anonymous-2a704c1c-7afa-45ce-b4fe-f6ae11e4b170.head(org.jsoup.nodes.Node, int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 17)-(line 143,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-35e58042-2f36-476e-8fc0-18b5d59d2d0f.tail(org.jsoup.nodes.Node, int)",
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
      "end_line": 214,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Gets the Document associated with this Node. \n     * @return the Document associated with this Node, or null if there is no such Document.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 238,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 37)",
        "(line 246,col 9)-(line 246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(java.lang.String)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Insert the specified HTML into the DOM before this node (i.e. as a preceeding sibling).\n     * @param html HTML to add before this node\n     * @return this node, for chaining\n     * @see #after(String)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 45)",
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(org.jsoup.nodes.Node)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\n     * Insert the specified node into the DOM before this node (i.e. as a preceeding sibling).\n     * @param node to add before this node\n     * @return this node, for chaining\n     * @see #after(Node)\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 31)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 270,col 9)-(line 270,col 53)",
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(java.lang.String)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).\n     * @param html HTML to add after this node\n     * @return this node, for chaining\n     * @see #before(String)\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 47)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(org.jsoup.nodes.Node)",
      "begin_line": 291,
      "end_line": 297,
      "comment": "\n     * Insert the specified node into the DOM after this node (i.e. as a following sibling).\n     * @param node to add after this node\n     * @return this node, for chaining\n     * @see #before(Node)\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 31)",
        "(line 293,col 9)-(line 293,col 37)",
        "(line 295,col 9)-(line 295,col 55)",
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addSiblingHtml(int, java.lang.String)",
      "begin_line": 299,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 31)",
        "(line 301,col 9)-(line 301,col 37)",
        "(line 303,col 9)-(line 303,col 82)",
        "(line 304,col 9)-(line 304,col 74)",
        "(line 305,col 9)-(line 305,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.wrap(java.lang.String)",
      "begin_line": 313,
      "end_line": 336,
      "comment": "\n     Wrap the supplied HTML around this node.\n     @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this node, for chaining.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 32)",
        "(line 316,col 9)-(line 316,col 82)",
        "(line 317,col 9)-(line 317,col 81)",
        "(line 318,col 9)-(line 318,col 44)",
        "(line 319,col 9)-(line 320,col 24)",
        "(line 322,col 9)-(line 322,col 42)",
        "(line 323,col 9)-(line 323,col 45)",
        "(line 324,col 9)-(line 324,col 44)",
        "(line 325,col 9)-(line 325,col 34)",
        "(line 328,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.unwrap()",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\n     * Removes this node from the DOM, and moves its children up into the node\u0027s parent. This has the effect of dropping\n     * the node but keeping its children.\n     * \u003cp/\u003e\n     * For example, with the input html:\u003cbr/\u003e\n     * {@code \u003cdiv\u003eOne \u003cspan\u003eTwo \u003cb\u003eThree\u003c/b\u003e\u003c/span\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:\u003cbr/\u003e\n     * {@code \u003cdiv\u003eOne Two \u003cb\u003eThree\u003c/b\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * and the {@code \"Two \"} {@link TextNode} being returned.\n     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.\n     * @see #remove()\n     * @see #wrap(String)\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 37)",
        "(line 354,col 9)-(line 354,col 33)",
        "(line 355,col 9)-(line 355,col 75)",
        "(line 356,col 9)-(line 356,col 64)",
        "(line 357,col 9)-(line 357,col 22)",
        "(line 359,col 9)-(line 359,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getDeepChild(org.jsoup.nodes.Element)",
      "begin_line": 362,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 47)",
        "(line 364,col 9)-(line 367,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 374,
      "end_line": 378,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 29)",
        "(line 376,col 9)-(line 376,col 37)",
        "(line 377,col 9)-(line 377,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 380,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 382,col 46)",
        "(line 383,col 9)-(line 383,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 386,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 48)",
        "(line 388,col 9)-(line 388,col 29)",
        "(line 389,col 9)-(line 390,col 42)",
        "(line 392,col 9)-(line 392,col 43)",
        "(line 393,col 9)-(line 393,col 34)",
        "(line 394,col 9)-(line 394,col 29)",
        "(line 395,col 9)-(line 395,col 34)",
        "(line 396,col 9)-(line 396,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 399,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 48)",
        "(line 401,col 9)-(line 401,col 39)",
        "(line 402,col 9)-(line 402,col 33)",
        "(line 403,col 9)-(line 403,col 26)",
        "(line 404,col 9)-(line 404,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 407,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 416,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 42)",
        "(line 418,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 426,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 428,col 48)",
        "(line 429,col 9)-(line 429,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren()",
      "begin_line": 432,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 443,
      "end_line": 446,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not\n     include this node (a node is not a sibling of itself).\n     @return node siblings. If the node has no parent, returns an empty list.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 452,
      "end_line": 463,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 454,col 24)",
        "(line 456,col 9)-(line 456,col 52)",
        "(line 457,col 9)-(line 457,col 39)",
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 462,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 469,
      "end_line": 478,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 52)",
        "(line 472,col 9)-(line 472,col 39)",
        "(line 473,col 9)-(line 473,col 32)",
        "(line 474,col 9)-(line 477,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 499,
      "end_line": 504,
      "comment": "\n     * Perform a depth-first traversal through this node and its descendants.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this node, for chaining\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 38)",
        "(line 501,col 9)-(line 501,col 65)",
        "(line 502,col 9)-(line 502,col 33)",
        "(line 503,col 9)-(line 503,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 510,
      "end_line": 514,
      "comment": "\n     Get the outer HTML of this node.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 53)",
        "(line 512,col 9)-(line 512,col 25)",
        "(line 513,col 9)-(line 513,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.StringBuilder)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getOutputSettings()",
      "begin_line": 521,
      "end_line": 523,
      "comment": " if this node has no document (or parent), retrieve the default output settings",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 529,
      "end_line": 529,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 531,
      "end_line": 531,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 541,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 35)",
        "(line 545,col 9)-(line 545,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hashCode()",
      "begin_line": 548,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 68)",
        "(line 552,col 9)-(line 552,col 80)",
        "(line 553,col 9)-(line 553,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clone()",
      "begin_line": 564,
      "end_line": 567,
      "comment": "\n     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or\n     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the\n     * original node.\n     * \u003cp\u003e\n     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.\n     * @return stand-alone cloned node\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doClone(org.jsoup.nodes.Node)",
      "begin_line": 569,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 19)",
        "(line 571,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 577,col 34)",
        "(line 578,col 9)-(line 578,col 63)",
        "(line 579,col 9)-(line 579,col 74)",
        "(line 580,col 9)-(line 580,col 32)",
        "(line 581,col 9)-(line 581,col 66)",
        "(line 582,col 9)-(line 583,col 55)",
        "(line 585,col 9)-(line 585,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 588,
      "end_line": 605,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 590,
      "end_line": 590,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 593,col 13)-(line 593,col 31)",
        "(line 594,col 13)-(line 594,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 601,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 602,col 13)-(line 603,col 54)"
      ]
    }
  ]
}