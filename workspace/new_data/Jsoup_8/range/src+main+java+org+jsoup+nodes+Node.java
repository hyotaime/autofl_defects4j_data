{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 417,
      "comment": "\n The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.\n\n @author Jonathan Hedley, jonathan@hedley.net "
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
        "childNodes"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingIndex"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 30,
      "end_line": 37,
      "comment": "\n     Create a new Node.\n     @param baseUri base URI\n     @param attributes attributes (not null, but may be empty)\n     ",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 34)",
        "(line 32,col 9)-(line 32,col 37)",
        "(line 34,col 9)-(line 34,col 44)",
        "(line 35,col 9)-(line 35,col 38)",
        "(line 36,col 9)-(line 36,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Default constructor. Doesn\u0027t setup base uri, children, or attributes; use with caution.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 44)",
        "(line 48,col 9)-(line 48,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodeName()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).\n     @return node name\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String)",
      "begin_line": 69,
      "end_line": 77,
      "comment": "\n     * Get an attribute\u0027s value by its key.\n     * \u003cp/\u003e\n     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with \u003ccode\u003e\u003cb\u003eabs\u003c/b\u003e\u003c/code\u003e,\n     * which is a shortcut to the {@link #absUrl} method.\n     * E.g.: \u003cblockquote\u003e\u003ccode\u003eString url \u003d a.attr(\"abs:href\");\u003c/code\u003e\u003c/blockquote\u003e\n     * @param attributeKey The attribute key.\n     * @return The attribute, or empty string if not present (to avoid nulls).\n     * @see #attributes()\n     * @see #hasAttr(String)\n     * @see #absUrl(String)\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 39)",
        "(line 72,col 9)-(line 76,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attributes()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Get all of the element\u0027s attributes.\n     * @return attributes (which implements iterable, in same order as presented in original HTML).\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String, java.lang.String)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Set an attribute (key\u003dvalue). If the attribute already exists, it is replaced.\n     * @param attributeKey The attribute key.\n     * @param attributeValue The attribute value.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 53)",
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttr(java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Test if this element has an attribute.\n     * @param attributeKey The attribute key to check.\n     * @return true if the attribute exists, false if not.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeAttr(java.lang.String)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Remove an attribute from this element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.baseUri()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     Get the base URI of this node.\n     @return base URI\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setBaseUri(java.lang.String)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     Update the base URI of this node.\n     @param baseUri base URI to set\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 34)",
        "(line 133,col 9)-(line 133,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.absUrl(java.lang.String)",
      "begin_line": 156,
      "end_line": 178,
      "comment": "\n     * Get an absolute URL from a URL attribute that may be relative (i.e. an \u003ccode\u003e\u0026lt;a href\u003e\u003c/code\u003e or\n     * \u003ccode\u003e\u0026lt;img src\u003e\u003c/code\u003e).\n     * \u003cp/\u003e\n     * E.g.: \u003ccode\u003eString absUrl \u003d linkEl.absUrl(\"href\");\u003c/code\u003e\n     * \u003cp/\u003e\n     * If the attribute value is already absolute (i.e. it starts with a protocol, like\n     * \u003ccode\u003ehttp://\u003c/code\u003e or \u003ccode\u003ehttps://\u003c/code\u003e etc), and it successfully parses as a URL, the attribute is\n     * returned directly. Otherwise, it is treated as a URL relative to the element\u0027s {@link #baseUri}, and made\n     * absolute using that.\n     * \u003cp/\u003e\n     * As an alternate, you can use the {@link #attr} method with the \u003ccode\u003eabs:\u003c/code\u003e prefix, e.g.:\n     * \u003ccode\u003eString absUrl \u003d linkEl.attr(\"abs:href\");\u003c/code\u003e\n     *\n     * @param attributeKey The attribute key\n     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or\n     * could not be made successfully into a URL.\n     * @see #attr\n     * @see java.net.URL#URL(java.net.URL, String)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)",
        "(line 159,col 9)-(line 159,col 43)",
        "(line 160,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNode(int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     Get a child node by index\n     @param index index of child node\n     @return the child node at this index.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodes()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 214,
      "end_line": 221,
      "comment": "\n     * Gets the Document associated with this Node. \n     * @return the Document associated with this Node, or null if there is no such Document.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 220,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 37)",
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 29)",
        "(line 237,col 9)-(line 237,col 37)",
        "(line 238,col 9)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 243,col 46)",
        "(line 244,col 9)-(line 244,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 247,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 48)",
        "(line 249,col 9)-(line 249,col 29)",
        "(line 250,col 9)-(line 251,col 42)",
        "(line 253,col 9)-(line 253,col 43)",
        "(line 254,col 9)-(line 254,col 34)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 256,col 9)-(line 256,col 34)",
        "(line 257,col 9)-(line 257,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 260,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 48)",
        "(line 262,col 9)-(line 262,col 39)",
        "(line 263,col 9)-(line 263,col 33)",
        "(line 264,col 9)-(line 264,col 26)",
        "(line 265,col 9)-(line 265,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 268,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 277,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 287,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 48)",
        "(line 290,col 9)-(line 290,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren()",
      "begin_line": 293,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Effectively, {@link #childNodes()  node.parent.childNodes()}.\n     @return node siblings, including this node\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 311,
      "end_line": 322,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 313,col 24)",
        "(line 315,col 9)-(line 315,col 52)",
        "(line 316,col 9)-(line 316,col 39)",
        "(line 317,col 9)-(line 317,col 32)",
        "(line 318,col 9)-(line 321,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 328,
      "end_line": 336,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 52)",
        "(line 330,col 9)-(line 330,col 39)",
        "(line 331,col 9)-(line 331,col 32)",
        "(line 332,col 9)-(line 335,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     Get the outer HTML of this node.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 358,col 25)",
        "(line 359,col 9)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.StringBuilder)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 372,
      "end_line": 372,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 374,
      "end_line": 374,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 384,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 35)",
        "(line 388,col 9)-(line 388,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hashCode()",
      "begin_line": 391,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 68)",
        "(line 395,col 9)-(line 395,col 80)",
        "(line 396,col 9)-(line 396,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 399,
      "end_line": 416,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 400,
      "end_line": 400,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 403,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 31)",
        "(line 405,col 13)-(line 405,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 412,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 413,col 13)-(line 414,col 54)"
      ]
    }
  ]
}