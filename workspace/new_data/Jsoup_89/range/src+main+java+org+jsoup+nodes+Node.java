{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 17,
      "end_line": 725,
      "comment": "\n The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "EmptyString"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingIndex"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node()",
      "begin_line": 25,
      "end_line": 26,
      "comment": "\n     * Default constructor. Doesn\u0027t setup base uri, children, or attributes; use with caution.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodeName()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).\n     @return node name\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttributes()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Check if this Node has an actual Attributes object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasParent()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String)",
      "begin_line": 58,
      "end_line": 69,
      "comment": "\n     * Get an attribute\u0027s value by its key. \u003cb\u003eCase insensitive\u003c/b\u003e\n     * \u003cp\u003e\n     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with \u003ccode\u003e\u003cb\u003eabs\u003c/b\u003e\u003c/code\u003e,\n     * which is a shortcut to the {@link #absUrl} method.\n     * \u003c/p\u003e\n     * E.g.:\n     * \u003cblockquote\u003e\u003ccode\u003eString url \u003d a.attr(\"abs:href\");\u003c/code\u003e\u003c/blockquote\u003e\n     *\n     * @param attributeKey The attribute key.\n     * @return The attribute, or empty string if not present (to avoid nulls).\n     * @see #attributes()\n     * @see #hasAttr(String)\n     * @see #absUrl(String)\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 39)",
        "(line 60,col 9)-(line 61,col 31)",
        "(line 63,col 9)-(line 63,col 62)",
        "(line 64,col 9)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attributes()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Get all of the element\u0027s attributes.\n     * @return attributes (which implements iterable, in same order as presented in original HTML).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String, java.lang.String)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Set an attribute (key\u003dvalue). If the attribute already exists, it is replaced. The attribute key comparison is\n     * \u003cb\u003ecase insensitive\u003c/b\u003e. The key will be set with case sensitivity as set in the parser settings.\n     * @param attributeKey The attribute key.\n     * @param attributeValue The attribute value.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 90)",
        "(line 86,col 9)-(line 86,col 65)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttr(java.lang.String)",
      "begin_line": 95,
      "end_line": 104,
      "comment": "\n     * Test if this element has an attribute. \u003cb\u003eCase insensitive\u003c/b\u003e\n     * @param attributeKey The attribute key to check.\n     * @return true if the attribute exists, false if not.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 39)",
        "(line 98,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeAttr(java.lang.String)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Remove an attribute from this element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 39)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clearAttributes()",
      "begin_line": 121,
      "end_line": 128,
      "comment": "\n     * Clear (remove) all of the attributes in this node.\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 57)",
        "(line 123,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.baseUri()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     Get the base URI of this node.\n     @return base URI\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doSetBaseUri(java.lang.String)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Set the baseUri for just this node (not its descendants), if this Node tracks base URIs.\n     * @param baseUri new URI\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setBaseUri(java.lang.String)",
      "begin_line": 146,
      "end_line": 157,
      "comment": "\n     Update the base URI of this node and all of its descendants.\n     @param baseUri base URI to set\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 34)",
        "(line 149,col 9)-(line 156,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-e20f9a4e-8872-4113-9984-594de0ceedcc.head(org.jsoup.nodes.Node, int)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 17)-(line 151,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-49cd0314-e41c-4534-aa3a-42b8bac625dd.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 154,
      "end_line": 155,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.absUrl(java.lang.String)",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Get an absolute URL from a URL attribute that may be relative (i.e. an \u003ccode\u003e\u0026lt;a href\u0026gt;\u003c/code\u003e or\n     * \u003ccode\u003e\u0026lt;img src\u0026gt;\u003c/code\u003e).\n     * \u003cp\u003e\n     * E.g.: \u003ccode\u003eString absUrl \u003d linkEl.absUrl(\"href\");\u003c/code\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * If the attribute value is already absolute (i.e. it starts with a protocol, like\n     * \u003ccode\u003ehttp://\u003c/code\u003e or \u003ccode\u003ehttps://\u003c/code\u003e etc), and it successfully parses as a URL, the attribute is\n     * returned directly. Otherwise, it is treated as a URL relative to the element\u0027s {@link #baseUri}, and made\n     * absolute using that.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * As an alternate, you can use the {@link #attr} method with the \u003ccode\u003eabs:\u003c/code\u003e prefix, e.g.:\n     * \u003ccode\u003eString absUrl \u003d linkEl.attr(\"abs:href\");\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param attributeKey The attribute key\n     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or\n     * could not be made successfully into a URL.\n     * @see #attr\n     * @see java.net.URL#URL(java.net.URL, String)\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 40)",
        "(line 185,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ensureChildNodes()",
      "begin_line": 192,
      "end_line": 192,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNode(int)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     Get a child node by its 0-based index.\n     @param index index of child node\n     @return the child node at this index. Throws a {@code IndexOutOfBoundsException} if the index is out of bounds.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodes()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesCopy()",
      "begin_line": 217,
      "end_line": 224,
      "comment": "\n     * Returns a deep copy of this node\u0027s children. Changes made to these nodes will not be reflected in the original\n     * nodes\n     * @return a deep copy of this node\u0027s children\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 52)",
        "(line 219,col 9)-(line 219,col 71)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodeSize()",
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * Get the number of child nodes that this node holds.\n     * @return the number of child nodes that this node holds.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parentNode()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     Gets this node\u0027s parent node. Not overridable by extending classes, so useful if you really just need the Node type.\n     @return parent node; or null if no parent.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.root()",
      "begin_line": 256,
      "end_line": 261,
      "comment": "\n     * Get this node\u0027s root node; that is, its topmost ancestor. If this node is the top ancestor, returns {@code this}.\n     * @return topmost ancestor.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 259,col 35)",
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * Gets the Document associated with this Node.\n     * @return the Document associated with this Node, or null if there is no such Document.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 27)",
        "(line 269,col 9)-(line 269,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 37)",
        "(line 277,col 9)-(line 277,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(java.lang.String)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * Insert the specified HTML into the DOM before this node (i.e. as a preceding sibling).\n     * @param html HTML to add before this node\n     * @return this node, for chaining\n     * @see #after(String)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 43)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(org.jsoup.nodes.Node)",
      "begin_line": 297,
      "end_line": 303,
      "comment": "\n     * Insert the specified node into the DOM before this node (i.e. as a preceding sibling).\n     * @param node to add before this node\n     * @return this node, for chaining\n     * @see #after(Node)\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 299,col 37)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 302,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(java.lang.String)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\n     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).\n     * @param html HTML to add after this node\n     * @return this node, for chaining\n     * @see #before(String)\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 47)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(org.jsoup.nodes.Node)",
      "begin_line": 322,
      "end_line": 328,
      "comment": "\n     * Insert the specified node into the DOM after this node (i.e. as a following sibling).\n     * @param node to add after this node\n     * @return this node, for chaining\n     * @see #before(Node)\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 31)",
        "(line 324,col 9)-(line 324,col 37)",
        "(line 326,col 9)-(line 326,col 55)",
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addSiblingHtml(int, java.lang.String)",
      "begin_line": 330,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 31)",
        "(line 332,col 9)-(line 332,col 37)",
        "(line 334,col 9)-(line 334,col 82)",
        "(line 335,col 9)-(line 335,col 95)",
        "(line 336,col 9)-(line 336,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.wrap(java.lang.String)",
      "begin_line": 344,
      "end_line": 368,
      "comment": "\n     Wrap the supplied HTML around this node.\n     @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this node, for chaining.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 32)",
        "(line 347,col 9)-(line 347,col 82)",
        "(line 348,col 9)-(line 348,col 102)",
        "(line 349,col 9)-(line 349,col 44)",
        "(line 350,col 9)-(line 351,col 24)",
        "(line 353,col 9)-(line 353,col 42)",
        "(line 354,col 9)-(line 354,col 45)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 34)",
        "(line 359,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.unwrap()",
      "begin_line": 385,
      "end_line": 393,
      "comment": "\n     * Removes this node from the DOM, and moves its children up into the node\u0027s parent. This has the effect of dropping\n     * the node but keeping its children.\n     * \u003cp\u003e\n     * For example, with the input html:\n     * \u003c/p\u003e\n     * \u003cp\u003e{@code \u003cdiv\u003eOne \u003cspan\u003eTwo \u003cb\u003eThree\u003c/b\u003e\u003c/span\u003e\u003c/div\u003e}\u003c/p\u003e\n     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:\n     * \u003cp\u003e{@code \u003cdiv\u003eOne Two \u003cb\u003eThree\u003c/b\u003e\u003c/div\u003e}\u003c/p\u003e\n     * and the {@code \"Two \"} {@link TextNode} being returned.\n     *\n     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.\n     * @see #remove()\n     * @see #wrap(String)\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 37)",
        "(line 387,col 9)-(line 387,col 57)",
        "(line 388,col 9)-(line 388,col 75)",
        "(line 389,col 9)-(line 389,col 71)",
        "(line 390,col 9)-(line 390,col 22)",
        "(line 392,col 9)-(line 392,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getDeepChild(org.jsoup.nodes.Element)",
      "begin_line": 395,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 47)",
        "(line 397,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodelistChanged()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 411,
      "end_line": 415,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 29)",
        "(line 413,col 9)-(line 413,col 37)",
        "(line 414,col 9)-(line 414,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 417,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 37)",
        "(line 419,col 9)-(line 420,col 46)",
        "(line 421,col 9)-(line 421,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 424,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 48)",
        "(line 426,col 9)-(line 426,col 29)",
        "(line 427,col 9)-(line 428,col 42)",
        "(line 430,col 9)-(line 430,col 43)",
        "(line 431,col 9)-(line 431,col 42)",
        "(line 432,col 9)-(line 432,col 29)",
        "(line 433,col 9)-(line 433,col 34)",
        "(line 434,col 9)-(line 434,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 437,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 48)",
        "(line 439,col 9)-(line 439,col 43)",
        "(line 440,col 9)-(line 440,col 41)",
        "(line 441,col 9)-(line 441,col 31)",
        "(line 442,col 9)-(line 442,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 445,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 52)",
        "(line 449,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 456,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 42)",
        "(line 458,col 9)-(line 458,col 52)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 53)",
        "(line 464,col 9)-(line 464,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren(int)",
      "begin_line": 471,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 57)",
        "(line 474,col 9)-(line 476,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 484,
      "end_line": 494,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not\n     include this node (a node is not a sibling of itself).\n     @return node siblings. If the node has no parent, returns an empty list.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 486,col 43)",
        "(line 488,col 9)-(line 488,col 57)",
        "(line 489,col 9)-(line 489,col 64)",
        "(line 490,col 9)-(line 492,col 35)",
        "(line 493,col 9)-(line 493,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 500,
      "end_line": 510,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 502,col 24)",
        "(line 504,col 9)-(line 504,col 66)",
        "(line 505,col 9)-(line 505,col 41)",
        "(line 506,col 9)-(line 509,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 516,
      "end_line": 524,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 518,col 24)",
        "(line 520,col 9)-(line 523,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 536,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 545,
      "end_line": 549,
      "comment": "\n     * Perform a depth-first traversal through this node and its descendants.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this node, for chaining\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 38)",
        "(line 547,col 9)-(line 547,col 50)",
        "(line 548,col 9)-(line 548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.filter(org.jsoup.select.NodeFilter)",
      "begin_line": 556,
      "end_line": 560,
      "comment": "\n     * Perform a depth-first filtering through this node and its descendants.\n     * @param nodeFilter the filter callbacks to perform on each node\n     * @return this node, for chaining\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 37)",
        "(line 558,col 9)-(line 558,col 47)",
        "(line 559,col 9)-(line 559,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 568,
      "end_line": 572,
      "comment": "\n     Get the outer HTML of this node. For example, on a {@code p} element, may return {@code \u003cp\u003ePara\u003c/p\u003e}.\n     @return outer HTML\n     @see Element#html()\n     @see Element#text()\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 57)",
        "(line 570,col 9)-(line 570,col 25)",
        "(line 571,col 9)-(line 571,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.Appendable)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 583,
      "end_line": 583,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     @throws IOException if appending to the given accumulator fails.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 585,
      "end_line": 585,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.html(T)",
      "begin_line": 593,
      "end_line": 596,
      "comment": "\n     * Write this node and its children to the given {@link Appendable}.\n     *\n     * @param appendable the {@link Appendable} to write to.\n     * @return the supplied {@link Appendable}, for chaining.\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 30)",
        "(line 595,col 9)-(line 595,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Gets this node\u0027s outer HTML.\n     * @return outer HTML.\n     * @see #outerHtml()\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 607,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 617,
      "end_line": 621,
      "comment": "\n     * Check if this node is the same instance of another (object identity test).\n     * @param o other object to compare to\n     * @return true if the content of this node is the same as the other\n     * @see Node#hasSameValue(Object) to compare nodes by their value\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasSameValue(java.lang.Object)",
      "begin_line": 629,
      "end_line": 634,
      "comment": "\n     * Check if this node is has the same content as another node. A node is considered the same if its name, attributes and content match the\n     * other node; particularly its position in the tree does not influence its similarity.\n     * @param o other object to compare to\n     * @return true if the content of this node is the same as the other\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 35)",
        "(line 631,col 9)-(line 631,col 66)",
        "(line 633,col 9)-(line 633,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clone()",
      "begin_line": 645,
      "end_line": 666,
      "comment": "\n     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or\n     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the\n     * original node.\n     * \u003cp\u003e\n     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.\n     * @return a stand-alone cloned node, including clones of any children\n     * @see #shallowClone()\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 39)",
        "(line 650,col 9)-(line 650,col 67)",
        "(line 651,col 9)-(line 651,col 38)",
        "(line 653,col 9)-(line 663,col 9)",
        "(line 665,col 9)-(line 665,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.shallowClone()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * Create a stand-alone, shallow copy of this node. None of its children (if any) will be cloned, and it will have\n     * no parent or sibling nodes.\n     * @return a single independent copy of this node\n     * @see #clone()\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doClone(org.jsoup.nodes.Node)",
      "begin_line": 682,
      "end_line": 695,
      "comment": "\n     * Return a clone of the node using the given parent (which can be null).\n     * Not a deep copy of children.\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 19)",
        "(line 685,col 9)-(line 689,col 9)",
        "(line 691,col 9)-(line 691,col 34)",
        "(line 692,col 9)-(line 692,col 63)",
        "(line 694,col 9)-(line 694,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 697,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 698,
      "end_line": 698,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 699,
      "end_line": 699,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 701,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 702,col 13)-(line 702,col 31)",
        "(line 703,col 13)-(line 703,col 27)",
        "(line 704,col 13)-(line 704,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 707,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 708,col 13)-(line 712,col 4)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 715,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 716,col 13)-(line 722,col 13)"
      ]
    }
  ]
}