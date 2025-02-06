{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/nodes/Element.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Element",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 24,
      "end_line": 1110,
      "comment": "\n * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and\n * other elements).\n * \n * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.\n * \n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "tag"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classNames"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 37,
      "end_line": 42,
      "comment": "\n     * Create a new, standalone Element. (Standalone in that is has no parent.)\n     * \n     * @param tag tag of this element\n     * @param baseUri the base URI\n     * @param attributes initial attributes\n     * @see #appendChild(Node)\n     * @see #appendElement(String)\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 35)",
        "(line 40,col 9)-(line 40,col 30)",
        "(line 41,col 9)-(line 41,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new Element from a tag and a base URI.\n     * \n     * @param tag element tag\n     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty\n     *            string, but not null.\n     * @see Tag#valueOf(String)\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nodeName()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Get the name of the tag for this element. E.g. {@code div}\n     * \n     * @return the tag name\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName(java.lang.String)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Change the tag of this element. For example, convert a {@code \u003cspan\u003e} to a {@code \u003cdiv\u003e} with\n     * {@code el.tagName(\"div\");}.\n     *\n     * @param tagName new tag name for this element\n     * @return this element, for chaining\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 66)",
        "(line 79,col 9)-(line 79,col 35)",
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tag()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Get the Tag for this element.\n     * \n     * @return the tag object\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.isBlock()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Test if this element is a block-level element. (E.g. {@code \u003cdiv\u003e \u003d\u003d true} or an inline element\n     * {@code \u003cp\u003e \u003d\u003d false}).\n     * \n     * @return true if block, false if not (and thus inline)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.id()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Get the {@code id} attribute of this element.\n     * \n     * @return The id attribute, if present, or an empty string if not.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.attr(java.lang.String, java.lang.String)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Set an attribute value on this element. If this element already has an attribute with the\n     * key, its value is updated; otherwise, a new attribute is added.\n     * \n     * @return this element\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataset()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Get this element\u0027s HTML5 custom data attributes. Each attribute in the element that has a key\n     * starting with \"data-\" is included the dataset.\n     * \u003cp\u003e\n     * E.g., the element {@code \u003cdiv data-package\u003d\"jsoup\" data-language\u003d\"Java\" class\u003d\"group\"\u003e...} has the dataset\n     * {@code package\u003djsoup, language\u003djava}.\n     * \u003cp\u003e\n     * This map is a filtered view of the element\u0027s attribute map. Changes to one map (add, remove, update) are reflected\n     * in the other map.\n     * \u003cp\u003e\n     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.\n     * @return a map of {@code key\u003dvalue} custom data attributes.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parent()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parents()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n     * Get this element\u0027s parent and ancestors, up to the document root.\n     * @return this element\u0027s stack of parents, closest first.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 42)",
        "(line 151,col 9)-(line 151,col 41)",
        "(line 152,col 9)-(line 152,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)",
        "(line 157,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.child(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Get a child element of this element, by its 0-based index number.\n     * \u003cp/\u003e\n     * Note that an element can have both mixed Nodes and Elements as children. This method inspects\n     * a filtered list of children that are elements, and the index is based on that filtered list.\n     * \n     * @param index the index number of the element to retrieve\n     * @return the child element, if it exists, or {@code null} if absent.\n     * @see #childNode(int)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.children()",
      "begin_line": 185,
      "end_line": 193,
      "comment": "\n     * Get this element\u0027s child elements.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Element nodes.\n     * @return child elements. If this element has no children, returns an\n     * empty list.\n     * @see #childNodes()\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 58)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.textNodes()",
      "begin_line": 211,
      "end_line": 218,
      "comment": "\n     * Get this element\u0027s child text nodes. The list is unmodifiable but the text nodes may be manipulated.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Text nodes.\n     * @return child text nodes. If this element has no text nodes, returns an\n     * empty list.\n     * \u003cp/\u003e\n     * For example, with the input HTML: {@code \u003cp\u003eOne \u003cspan\u003eTwo\u003c/span\u003e Three \u003cbr\u003e Four\u003c/p\u003e} with the {@code p} element selected:\n     * \u003cul\u003e\n     *     \u003cli\u003e{@code p.text()} \u003d {@code \"One Two Three Four\"}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.ownText()} \u003d {@code \"One Three Four\"}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.children()} \u003d {@code Elements[\u003cspan\u003e, \u003cbr\u003e]}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.childNodes()} \u003d {@code List\u003cNode\u003e[\"One \", \u003cspan\u003e, \" Three \", \u003cbr\u003e, \" Four\"]}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.textNodes()} \u003d {@code List\u003cTextNode\u003e[\"One \", \" Three \", \" Four\"]}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 61)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataNodes()",
      "begin_line": 228,
      "end_line": 235,
      "comment": "\n     * Get this element\u0027s child data nodes. The list is unmodifiable but the data nodes may be manipulated.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Data nodes.\n     * @return child data nodes. If this element has no data nodes, returns an\n     * empty list.\n     * @see #data()\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 61)",
        "(line 230,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.select(java.lang.String)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Find elements that match the {@link Selector} CSS query, with this element as the starting context. Matched elements\n     * may include this element, or any of its children.\n     * \u003cp/\u003e\n     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because\n     * multiple filters can be combined, e.g.:\n     * \u003cul\u003e\n     * \u003cli\u003e{@code el.select(\"a[href]\")} - finds links ({@code a} tags with {@code href} attributes)\n     * \u003cli\u003e{@code el.select(\"a[href*\u003dexample.com]\")} - finds links pointing to example.com (loosely)\n     * \u003c/ul\u003e\n     * \u003cp/\u003e\n     * See the query syntax documentation in {@link org.jsoup.select.Selector}.\n     *\n     * @param cssQuery a {@link Selector} CSS-like query\n     * @return elements that match the query (empty if none match)\n     * @see org.jsoup.select.Selector\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendChild(org.jsoup.nodes.Node)",
      "begin_line": 264,
      "end_line": 269,
      "comment": "\n     * Add a node child node to this element.\n     * \n     * @param child node to add. Must not already have a parent.\n     * @return this element, so that you can add more child nodes or elements.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 32)",
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependChild(org.jsoup.nodes.Node)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * Add a node to the start of this element\u0027s children.\n     * \n     * @param child node to add. Must not already have a parent.\n     * @return this element, so that you can add more child nodes or elements.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 32)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 281,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendElement(java.lang.String)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\n     * Create a new element by tag name, and add it as the last child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.appendElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 69)",
        "(line 293,col 9)-(line 293,col 27)",
        "(line 294,col 9)-(line 294,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependElement(java.lang.String)",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\n     * Create a new element by tag name, and add it as the first child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.prependElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 69)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 307,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendText(java.lang.String)",
      "begin_line": 316,
      "end_line": 320,
      "comment": "\n     * Create and append a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 54)",
        "(line 318,col 9)-(line 318,col 26)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependText(java.lang.String)",
      "begin_line": 328,
      "end_line": 332,
      "comment": "\n     * Create and prepend a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 54)",
        "(line 330,col 9)-(line 330,col 27)",
        "(line 331,col 9)-(line 331,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.append(java.lang.String)",
      "begin_line": 340,
      "end_line": 346,
      "comment": "\n     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.\n     * @param html HTML to add inside this element, after the existing HTML\n     * @return this element\n     * @see #html(String)\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 31)",
        "(line 343,col 9)-(line 343,col 71)",
        "(line 344,col 9)-(line 344,col 59)",
        "(line 345,col 9)-(line 345,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prepend(java.lang.String)",
      "begin_line": 354,
      "end_line": 360,
      "comment": "\n     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element\u0027s children.\n     * @param html HTML to add inside this element, before the existing HTML\n     * @return this element\n     * @see #html(String)\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 31)",
        "(line 357,col 9)-(line 357,col 71)",
        "(line 358,col 9)-(line 358,col 62)",
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(java.lang.String)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * Insert the specified HTML into the DOM before this element (i.e. as a preceeding sibling).\n     *\n     * @param html HTML to add before this element\n     * @return this element, for chaining\n     * @see #after(String)\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(org.jsoup.nodes.Node)",
      "begin_line": 380,
      "end_line": 383,
      "comment": "\n     * Insert the specified node into the DOM before this node (i.e. as a preceeding sibling).\n     * @param node to add before this element\n     * @return this Element, for chaining\n     * @see #after(Node)\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(java.lang.String)",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * Insert the specified HTML into the DOM after this element (i.e. as a following sibling).\n     *\n     * @param html HTML to add after this element\n     * @return this element, for chaining\n     * @see #before(String)\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(org.jsoup.nodes.Node)",
      "begin_line": 403,
      "end_line": 406,
      "comment": "\n     * Insert the specified node into the DOM after this node (i.e. as a following sibling).\n     * @param node to add after this element\n     * @return this element, for chaining\n     * @see #before(Node)\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.empty()",
      "begin_line": 412,
      "end_line": 415,
      "comment": "\n     * Remove all of the element\u0027s child nodes. Any attributes are left as-is.\n     * @return this element\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 27)",
        "(line 414,col 9)-(line 414,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.wrap(java.lang.String)",
      "begin_line": 423,
      "end_line": 426,
      "comment": "\n     * Wrap the supplied HTML around this element.\n     *\n     * @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     * @return this element, for chaining.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.siblingElements()",
      "begin_line": 433,
      "end_line": 436,
      "comment": "\n     * Get sibling elements. If the element has no sibling elements, returns an empty list. An element is not a sibling\n     * of itself, so will not be included in the returned list.\n     * @return sibling elements\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nextElementSibling()",
      "begin_line": 446,
      "end_line": 454,
      "comment": "\n     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, \n     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.\n     * \u003cp/\u003e\n     * This is similar to {@link #nextSibling()}, but specifically finds only Elements\n     * @return the next element, or null if there is no next element\n     * @see #previousElementSibling()\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 53)",
        "(line 448,col 9)-(line 448,col 52)",
        "(line 449,col 9)-(line 449,col 32)",
        "(line 450,col 9)-(line 453,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.previousElementSibling()",
      "begin_line": 461,
      "end_line": 469,
      "comment": "\n     * Gets the previous element sibling of this element.\n     * @return the previous element, or null if there is no previous element\n     * @see #nextElementSibling()\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 53)",
        "(line 463,col 9)-(line 463,col 52)",
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 468,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.firstElementSibling()",
      "begin_line": 475,
      "end_line": 479,
      "comment": "\n     * Gets the first element sibling of this element.\n     * @return the first sibling that is an element (aka the parent\u0027s first element child) \n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 53)",
        "(line 478,col 9)-(line 478,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.elementSiblingIndex()",
      "begin_line": 486,
      "end_line": 489,
      "comment": "\n     * Get the list index of this element in its element sibling list. I.e. if this is the first element\n     * sibling, returns 0.\n     * @return position in element sibling list\n     ",
      "child_ranges": [
        "(line 487,col 8)-(line 487,col 38)",
        "(line 488,col 8)-(line 488,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.lastElementSibling()",
      "begin_line": 495,
      "end_line": 498,
      "comment": "\n     * Gets the last element sibling of this element\n     * @return the last sibling that is an element (aka the parent\u0027s last element child) \n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 53)",
        "(line 497,col 9)-(line 497,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.indexInList(org.jsoup.nodes.Element, java.util.List\u003cE\u003e)",
      "begin_line": 500,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 33)",
        "(line 502,col 9)-(line 502,col 35)",
        "(line 504,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByTag(java.lang.String)",
      "begin_line": 519,
      "end_line": 524,
      "comment": "\n     * Finds elements, including and recursively under this element, with the specified tag name.\n     * @param tagName The tag name to search for (case insensitively).\n     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 35)",
        "(line 521,col 9)-(line 521,col 47)",
        "(line 523,col 9)-(line 523,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementById(java.lang.String)",
      "begin_line": 535,
      "end_line": 543,
      "comment": "\n     * Find an element by ID, including or under this element.\n     * \u003cp\u003e\n     * Note that this finds the first matching ID, starting with this element. If you search down from a different\n     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,\n     * use {@link Document#getElementById(String)}\n     * @param id The ID to search for.\n     * @return The first matching element by ID, starting with this element, or null if none found.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 30)",
        "(line 538,col 9)-(line 538,col 74)",
        "(line 539,col 9)-(line 542,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByClass(java.lang.String)",
      "begin_line": 556,
      "end_line": 560,
      "comment": "\n     * Find elements that have this class, including or under this element. Case insensitive.\n     * \u003cp\u003e\n     * Elements can have multiple classes (e.g. {@code \u003cdiv class\u003d\"header round first\"\u003e}. This method\n     * checks each class, so you can find the above with {@code el.getElementsByClass(\"header\");}.\n     * \n     * @param className the name of the class to search for.\n     * @return elements with the supplied class name, empty if none\n     * @see #hasClass(String)\n     * @see #classNames()\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 37)",
        "(line 559,col 9)-(line 559,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttribute(java.lang.String)",
      "begin_line": 568,
      "end_line": 573,
      "comment": "\n     * Find elements that have a named attribute set. Case insensitive.\n     *\n     * @param key name of the attribute, e.g. {@code href}\n     * @return elements that have this attribute, empty if none\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 31)",
        "(line 570,col 9)-(line 570,col 39)",
        "(line 572,col 9)-(line 572,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeStarting(java.lang.String)",
      "begin_line": 581,
      "end_line": 586,
      "comment": "\n     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements\n     * that have HTML5 datasets.\n     * @param keyPrefix name prefix of the attribute e.g. {@code data-}\n     * @return elements that have attribute names that start with with the prefix, empty if none.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 37)",
        "(line 583,col 9)-(line 583,col 51)",
        "(line 585,col 9)-(line 585,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValue(java.lang.String, java.lang.String)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Find elements that have an attribute with the specific value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that have this attribute with this value, empty if none\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueNot(java.lang.String, java.lang.String)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that do not have a matching attribute\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n     * Find elements that have attributes that start with the value prefix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valuePrefix start of attribute value\n     * @return elements that have attributes that start with the value prefix\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Find elements that have attributes that end with the value suffix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valueSuffix end of the attribute value\n     * @return elements that have attributes that end with the value suffix\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\n     * Find elements that have attributes whose value contains the match string. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param match substring of value to search for\n     * @return elements that have attributes containing this text\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 649,
      "end_line": 652,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param pattern compiled regular expression to match against attribute values\n     * @return elements that have attributes matching this regular expression\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.lang.String)",
      "begin_line": 660,
      "end_line": 668,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param regex regular expression to match agaisnt attribute values. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements that have attributes matching this regular expression\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 24)",
        "(line 662,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexLessThan(int)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n     * Find elements whose sibling index is less than the supplied index.\n     * @param index 0-based index\n     * @return elements less than index\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexGreaterThan(int)",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n     * Find elements whose sibling index is greater than the supplied index.\n     * @param index 0-based index\n     * @return elements greater than index\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexEquals(int)",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n     * Find elements whose sibling index is equal to the supplied index.\n     * @param index 0-based index\n     * @return elements equal to index\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingText(java.lang.String)",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly\n     * in the element, or in any of its descendants.\n     * @param searchText to look for in the element\u0027s text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingOwnText(java.lang.String)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly\n     * in the element, not in any of its descendants.\n     * @param searchText to look for in the element\u0027s own text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.util.regex.Pattern)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.lang.String)",
      "begin_line": 735,
      "end_line": 743,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 24)",
        "(line 737,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.util.regex.Pattern)",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * Find elements whose own text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.lang.String)",
      "begin_line": 761,
      "end_line": 769,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 24)",
        "(line 763,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getAllElements()",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * Find all elements under this element (including self, and children of children).\n     * \n     * @return all elements\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text()",
      "begin_line": 789,
      "end_line": 793,
      "comment": "\n     * Gets the combined text of this element and all its children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.text()} returns {@code \"Hello there now!\"}\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #ownText()\n     * @see #textNodes()\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 47)",
        "(line 791,col 9)-(line 791,col 17)",
        "(line 792,col 9)-(line 792,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.StringBuilder)",
      "begin_line": 795,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 42)",
        "(line 798,col 9)-(line 808,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText()",
      "begin_line": 822,
      "end_line": 826,
      "comment": "\n     * Gets the text owned by this element only; does not get the combined text of all children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.ownText()} returns {@code \"Hello now!\"},\n     * whereas {@code p.text()} returns {@code \"Hello there now!\"}.\n     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #text()\n     * @see #textNodes()\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 47)",
        "(line 824,col 9)-(line 824,col 20)",
        "(line 825,col 9)-(line 825,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText(java.lang.StringBuilder)",
      "begin_line": 828,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)",
      "begin_line": 839,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 46)",
        "(line 842,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendWhitespaceIfBr(org.jsoup.nodes.Element, java.lang.StringBuilder)",
      "begin_line": 850,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 851,col 9)-(line 852,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.preserveWhitespace()",
      "begin_line": 855,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.String)",
      "begin_line": 864,
      "end_line": 872,
      "comment": "\n     * Set the text of this element. Any existing contents (text or elements) will be cleared\n     * @param text unencoded text\n     * @return this element\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 31)",
        "(line 867,col 9)-(line 867,col 16)",
        "(line 868,col 9)-(line 868,col 56)",
        "(line 869,col 9)-(line 869,col 30)",
        "(line 871,col 9)-(line 871,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasText()",
      "begin_line": 878,
      "end_line": 891,
      "comment": "\n     Test if this element has any text content (that is not just whitespace).\n     @return true if element has non-blank text content.\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.data()",
      "begin_line": 899,
      "end_line": 913,
      "comment": "\n     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag.\n     * @return the data, or empty string if none\n     *\n     * @see #dataNodes()\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 47)",
        "(line 902,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.className()",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * Gets the literal value of this element\u0027s \"class\" attribute, which may include multiple class names, space\n     * separated. (E.g. on \u003ccode\u003e\u0026lt;div class\u003d\"header gray\"\u003e\u003c/code\u003e returns, \"\u003ccode\u003eheader gray\u003c/code\u003e\")\n     * @return The literal class attribute, or \u003cb\u003eempty string\u003c/b\u003e if no class attribute set.\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames()",
      "begin_line": 930,
      "end_line": 936,
      "comment": "\n     * Get all of the element\u0027s class names. E.g. on element {@code \u003cdiv class\u003d\"header gray\"}\u003e},\n     * returns a set of two elements {@code \"header\", \"gray\"}. Note that modifications to this set are not pushed to\n     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.\n     * @return set of classnames, empty if no class attribute\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 943,
      "end_line": 947,
      "comment": "\n     Set the element\u0027s {@code class} attribute to the supplied class names.\n     @param classNames set of classes\n     @return this element, for chaining\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 37)",
        "(line 945,col 9)-(line 945,col 66)",
        "(line 946,col 9)-(line 946,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasClass(java.lang.String)",
      "begin_line": 954,
      "end_line": 961,
      "comment": "\n     * Tests if this element has a class. Case insensitive.\n     * @param className name of class to check for\n     * @return true if it does, false if not\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 46)",
        "(line 956,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.addClass(java.lang.String)",
      "begin_line": 968,
      "end_line": 976,
      "comment": "\n     Add a class name to this element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this element\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 36)",
        "(line 971,col 9)-(line 971,col 43)",
        "(line 972,col 9)-(line 972,col 31)",
        "(line 973,col 9)-(line 973,col 28)",
        "(line 975,col 9)-(line 975,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.removeClass(java.lang.String)",
      "begin_line": 983,
      "end_line": 991,
      "comment": "\n     Remove a class name from this element\u0027s {@code class} attribute.\n     @param className class name to remove\n     @return this element\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 36)",
        "(line 986,col 9)-(line 986,col 43)",
        "(line 987,col 9)-(line 987,col 34)",
        "(line 988,col 9)-(line 988,col 28)",
        "(line 990,col 9)-(line 990,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toggleClass(java.lang.String)",
      "begin_line": 998,
      "end_line": 1009,
      "comment": "\n     Toggle a class name on this element\u0027s {@code class} attribute: if present, remove it; otherwise add it.\n     @param className class name to toggle\n     @return this element\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 36)",
        "(line 1001,col 9)-(line 1001,col 43)",
        "(line 1002,col 9)-(line 1005,col 35)",
        "(line 1006,col 9)-(line 1006,col 28)",
        "(line 1008,col 9)-(line 1008,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val()",
      "begin_line": 1015,
      "end_line": 1020,
      "comment": "\n     * Get the value of a form element (input, textarea, etc).\n     * @return the value of the form element, or empty string if not set.\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1019,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val(java.lang.String)",
      "begin_line": 1027,
      "end_line": 1033,
      "comment": "\n     * Set the value of a form element (input, textarea, etc).\n     * @param value value to set\n     * @return this element (for chaining)\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1031,col 33)",
        "(line 1032,col 9)-(line 1032,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 1035,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 9)-(line 1037,col 38)",
        "(line 1038,col 9)-(line 1040,col 35)",
        "(line 1041,col 9)-(line 1041,col 36)",
        "(line 1043,col 9)-(line 1046,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 1049,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 9)-(line 1054,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html()",
      "begin_line": 1064,
      "end_line": 1068,
      "comment": "\n     * Retrieves the element\u0027s inner HTML. E.g. on a {@code \u003cdiv\u003e} with one empty {@code \u003cp\u003e}, would return\n     * {@code \u003cp\u003e\u003c/p\u003e}. (Whereas {@link #outerHtml()} would return {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e\u003c/div\u003e}.)\n     * \n     * @return String of HTML.\n     * @see #outerHtml()\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 50)",
        "(line 1066,col 9)-(line 1066,col 20)",
        "(line 1067,col 9)-(line 1067,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.StringBuilder)",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 9)-(line 1072,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.String)",
      "begin_line": 1081,
      "end_line": 1085,
      "comment": "\n     * Set this element\u0027s inner HTML. Clears the existing HTML first.\n     * @param html HTML to parse and set into this element\n     * @return this element\n     * @see #append(String)\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 16)",
        "(line 1083,col 9)-(line 1083,col 21)",
        "(line 1084,col 9)-(line 1084,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toString()",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.equals(java.lang.Object)",
      "begin_line": 1091,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hashCode()",
      "begin_line": 1096,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 38)",
        "(line 1100,col 9)-(line 1100,col 66)",
        "(line 1101,col 9)-(line 1101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.clone()",
      "begin_line": 1104,
      "end_line": 1109,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 48)",
        "(line 1107,col 9)-(line 1107,col 27)",
        "(line 1108,col 9)-(line 1108,col 21)"
      ]
    }
  ]
}