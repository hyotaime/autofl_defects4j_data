{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/Element.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Element",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 39,
      "end_line": 1497,
      "comment": "\n * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and\n * other elements).\n * \n * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.\n * \n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_NODES"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classSplit"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tag"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shadowChildrenRef"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " points to child elements shadowed from node children"
    },
    {
      "type": "field",
      "varNames": [
        "childNodes"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new, standalone element.\n     * @param tag tag name\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "\n     * Create a new, standalone Element. (Standalone in that is has no parent.)\n     * \n     * @param tag tag of this element\n     * @param baseUri the base URI\n     * @param attributes initial attributes\n     * @see #appendChild(Node)\n     * @see #appendElement(String)\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 30)",
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 31)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 71,col 9)-(line 71,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create a new Element from a tag and a base URI.\n     * \n     * @param tag element tag\n     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty\n     *            string, but not null.\n     * @see Tag#valueOf(String, ParseSettings)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ensureChildNodes()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasAttributes()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.attributes()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.baseUri()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.doSetBaseUri(java.lang.String)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.childNodeSize()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nodeName()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get the name of the tag for this element. E.g. {@code div}. If you are using {@link ParseSettings#preserveCase\n     * case preserving parsing}, this will return the source\u0027s original case.\n     * \n     * @return the tag name\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.normalName()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Get the normalized name of this Element\u0027s tag. This will always be the lowercased version of the tag, regardless\n     * of the tag case preserving setting of the parser.\n     * @return\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName(java.lang.String)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\n     * Change the tag of this element. For example, convert a {@code \u003cspan\u003e} to a {@code \u003cdiv\u003e} with\n     * {@code el.tagName(\"div\");}.\n     *\n     * @param tagName new tag name for this element\n     * @return this element, for chaining\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 70)",
        "(line 154,col 9)-(line 154,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tag()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Get the Tag for this element.\n     * \n     * @return the tag object\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.isBlock()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Test if this element is a block-level element. (E.g. {@code \u003cdiv\u003e \u003d\u003d true} or an inline element\n     * {@code \u003cp\u003e \u003d\u003d false}).\n     * \n     * @return true if block, false if not (and thus inline)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.id()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Get the {@code id} attribute of this element.\n     * \n     * @return The id attribute, if present, or an empty string if not.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.attr(java.lang.String, java.lang.String)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Set an attribute value on this element. If this element already has an attribute with the\n     * key, its value is updated; otherwise, a new attribute is added.\n     * \n     * @return this element\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 49)",
        "(line 193,col 9)-(line 193,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.attr(java.lang.String, boolean)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Set a boolean attribute value on this element. Setting to \u003ccode\u003etrue\u003c/code\u003e sets the attribute value to \"\" and\n     * marks the attribute as boolean so no value is written out. Setting to \u003ccode\u003efalse\u003c/code\u003e removes the attribute\n     * with the same key if it exists.\n     * \n     * @param attributeKey the attribute key\n     * @param attributeValue the attribute value\n     * \n     * @return this element\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 55)",
        "(line 208,col 9)-(line 208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataset()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Get this element\u0027s HTML5 custom data attributes. Each attribute in the element that has a key\n     * starting with \"data-\" is included the dataset.\n     * \u003cp\u003e\n     * E.g., the element {@code \u003cdiv data-package\u003d\"jsoup\" data-language\u003d\"Java\" class\u003d\"group\"\u003e...} has the dataset\n     * {@code package\u003djsoup, language\u003djava}.\n     * \u003cp\u003e\n     * This map is a filtered view of the element\u0027s attribute map. Changes to one map (add, remove, update) are reflected\n     * in the other map.\n     * \u003cp\u003e\n     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.\n     * @return a map of {@code key\u003dvalue} custom data attributes.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parent()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parents()",
      "begin_line": 237,
      "end_line": 241,
      "comment": "\n     * Get this element\u0027s parent and ancestors, up to the document root.\n     * @return this element\u0027s stack of parents, closest first.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 42)",
        "(line 239,col 9)-(line 239,col 41)",
        "(line 240,col 9)-(line 240,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)",
      "begin_line": 243,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 37)",
        "(line 245,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.child(int)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Get a child element of this element, by its 0-based index number.\n     * \u003cp\u003e\n     * Note that an element can have both mixed Nodes and Elements as children. This method inspects\n     * a filtered list of children that are elements, and the index is based on that filtered list.\n     * \u003c/p\u003e\n     * \n     * @param index the index number of the element to retrieve\n     * @return the child element, if it exists, otherwise throws an {@code IndexOutOfBoundsException}\n     * @see #childNode(int)\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.children()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Get this element\u0027s child elements.\n     * \u003cp\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Element nodes.\n     * \u003c/p\u003e\n     * @return child elements. If this element has no children, returns an empty list.\n     * @see #childNodes()\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.childElementsList()",
      "begin_line": 283,
      "end_line": 297,
      "comment": "\n     * Maintains a shadow copy of this element\u0027s child elements. If the nodelist is changed, this cache is invalidated.\n     * TODO - think about pulling this out as a helper as there are other shadow lists (like in Attributes) kept around.\n     * @return a list of child elements\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 31)",
        "(line 285,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nodelistChanged()",
      "begin_line": 302,
      "end_line": 306,
      "comment": "\n     * Clears the cached shadow child elements.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 32)",
        "(line 305,col 9)-(line 305,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.textNodes()",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\n     * Get this element\u0027s child text nodes. The list is unmodifiable but the text nodes may be manipulated.\n     * \u003cp\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Text nodes.\n     * @return child text nodes. If this element has no text nodes, returns an\n     * empty list.\n     * \u003c/p\u003e\n     * For example, with the input HTML: {@code \u003cp\u003eOne \u003cspan\u003eTwo\u003c/span\u003e Three \u003cbr\u003e Four\u003c/p\u003e} with the {@code p} element selected:\n     * \u003cul\u003e\n     *     \u003cli\u003e{@code p.text()} \u003d {@code \"One Two Three Four\"}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.ownText()} \u003d {@code \"One Three Four\"}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.children()} \u003d {@code Elements[\u003cspan\u003e, \u003cbr\u003e]}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.childNodes()} \u003d {@code List\u003cNode\u003e[\"One \", \u003cspan\u003e, \" Three \", \u003cbr\u003e, \" Four\"]}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.textNodes()} \u003d {@code List\u003cTextNode\u003e[\"One \", \" Three \", \" Four\"]}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 53)",
        "(line 326,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataNodes()",
      "begin_line": 342,
      "end_line": 349,
      "comment": "\n     * Get this element\u0027s child data nodes. The list is unmodifiable but the data nodes may be manipulated.\n     * \u003cp\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Data nodes.\n     * \u003c/p\u003e\n     * @return child data nodes. If this element has no data nodes, returns an\n     * empty list.\n     * @see #data()\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 53)",
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.select(java.lang.String)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Find elements that match the {@link Selector} CSS query, with this element as the starting context. Matched elements\n     * may include this element, or any of its children.\n     * \u003cp\u003e\n     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because\n     * multiple filters can be combined, e.g.:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@code el.select(\"a[href]\")} - finds links ({@code a} tags with {@code href} attributes)\n     * \u003cli\u003e{@code el.select(\"a[href*\u003dexample.com]\")} - finds links pointing to example.com (loosely)\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * See the query syntax documentation in {@link org.jsoup.select.Selector}.\n     * \u003c/p\u003e\n     * \n     * @param cssQuery a {@link Selector} CSS-like query\n     * @return elements that match the query (empty if none match)\n     * @see org.jsoup.select.Selector\n     * @throws Selector.SelectorParseException (unchecked) on an invalid CSS query.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.selectFirst(java.lang.String)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Find the first Element that matches the {@link Selector} CSS query, with this element as the starting context.\n     * \u003cp\u003eThis is effectively the same as calling {@code element.select(query).first()}, but is more efficient as query\n     * execution stops on the first hit.\u003c/p\u003e\n     * @param cssQuery cssQuery a {@link Selector} CSS-like query\n     * @return the first matching element, or \u003cb\u003e{@code null}\u003c/b\u003e if there is no match.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.is(java.lang.String)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Check if this element matches the given {@link Selector} CSS query.\n     * @param cssQuery a {@link Selector} CSS query\n     * @return if this element matches the query\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.is(org.jsoup.select.Evaluator)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Check if this element matches the given evaluator.\n     * @param evaluator an element evaluator\n     * @return if this element matches\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendChild(org.jsoup.nodes.Node)",
      "begin_line": 410,
      "end_line": 419,
      "comment": "\n     * Add a node child node to this element.\n     * \n     * @param child node to add.\n     * @return this element, so that you can add more child nodes or elements.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 32)",
        "(line 414,col 9)-(line 414,col 29)",
        "(line 415,col 9)-(line 415,col 27)",
        "(line 416,col 9)-(line 416,col 30)",
        "(line 417,col 9)-(line 417,col 53)",
        "(line 418,col 9)-(line 418,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendTo(org.jsoup.nodes.Element)",
      "begin_line": 427,
      "end_line": 431,
      "comment": "\n     * Add this element to the supplied parent element, as its next child.\n     *\n     * @param parent element to which this element will be appended\n     * @return this element, so that you can continue modifying the element\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 33)",
        "(line 429,col 9)-(line 429,col 33)",
        "(line 430,col 9)-(line 430,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependChild(org.jsoup.nodes.Node)",
      "begin_line": 439,
      "end_line": 444,
      "comment": "\n     * Add a node to the start of this element\u0027s children.\n     * \n     * @param child node to add.\n     * @return this element, so that you can add more child nodes or elements.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 32)",
        "(line 442,col 9)-(line 442,col 30)",
        "(line 443,col 9)-(line 443,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.insertChildren(int, java.util.Collection\u003c? extends org.jsoup.nodes.Node\u003e)",
      "begin_line": 456,
      "end_line": 466,
      "comment": "\n     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the\n     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.\n     *\n     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the\n     * end\n     * @param children child nodes to insert\n     * @return this element, for chaining.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 91)",
        "(line 458,col 9)-(line 458,col 42)",
        "(line 459,col 9)-(line 459,col 47)",
        "(line 460,col 9)-(line 460,col 94)",
        "(line 462,col 9)-(line 462,col 58)",
        "(line 463,col 9)-(line 463,col 54)",
        "(line 464,col 9)-(line 464,col 38)",
        "(line 465,col 9)-(line 465,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.insertChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 477,
      "end_line": 485,
      "comment": "\n     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the\n     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.\n     *\n     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the\n     * end\n     * @param children child nodes to insert\n     * @return this element, for chaining.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 91)",
        "(line 479,col 9)-(line 479,col 42)",
        "(line 480,col 9)-(line 480,col 47)",
        "(line 481,col 9)-(line 481,col 94)",
        "(line 483,col 9)-(line 483,col 37)",
        "(line 484,col 9)-(line 484,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendElement(java.lang.String)",
      "begin_line": 494,
      "end_line": 498,
      "comment": "\n     * Create a new element by tag name, and add it as the last child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.appendElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 104)",
        "(line 496,col 9)-(line 496,col 27)",
        "(line 497,col 9)-(line 497,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependElement(java.lang.String)",
      "begin_line": 507,
      "end_line": 511,
      "comment": "\n     * Create a new element by tag name, and add it as the first child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.prependElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 104)",
        "(line 509,col 9)-(line 509,col 28)",
        "(line 510,col 9)-(line 510,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendText(java.lang.String)",
      "begin_line": 519,
      "end_line": 524,
      "comment": "\n     * Create and append a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 31)",
        "(line 521,col 9)-(line 521,col 43)",
        "(line 522,col 9)-(line 522,col 26)",
        "(line 523,col 9)-(line 523,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependText(java.lang.String)",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n     * Create and prepend a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 31)",
        "(line 534,col 9)-(line 534,col 43)",
        "(line 535,col 9)-(line 535,col 27)",
        "(line 536,col 9)-(line 536,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.append(java.lang.String)",
      "begin_line": 545,
      "end_line": 550,
      "comment": "\n     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.\n     * @param html HTML to add inside this element, after the existing HTML\n     * @return this element\n     * @see #html(String)\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 31)",
        "(line 547,col 9)-(line 547,col 92)",
        "(line 548,col 9)-(line 548,col 48)",
        "(line 549,col 9)-(line 549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prepend(java.lang.String)",
      "begin_line": 558,
      "end_line": 563,
      "comment": "\n     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element\u0027s children.\n     * @param html HTML to add inside this element, before the existing HTML\n     * @return this element\n     * @see #html(String)\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 31)",
        "(line 560,col 9)-(line 560,col 92)",
        "(line 561,col 9)-(line 561,col 51)",
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(java.lang.String)",
      "begin_line": 572,
      "end_line": 575,
      "comment": "\n     * Insert the specified HTML into the DOM before this element (as a preceding sibling).\n     *\n     * @param html HTML to add before this element\n     * @return this element, for chaining\n     * @see #after(String)\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(org.jsoup.nodes.Node)",
      "begin_line": 583,
      "end_line": 586,
      "comment": "\n     * Insert the specified node into the DOM before this node (as a preceding sibling).\n     * @param node to add before this element\n     * @return this Element, for chaining\n     * @see #after(Node)\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(java.lang.String)",
      "begin_line": 595,
      "end_line": 598,
      "comment": "\n     * Insert the specified HTML into the DOM after this element (as a following sibling).\n     *\n     * @param html HTML to add after this element\n     * @return this element, for chaining\n     * @see #before(String)\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(org.jsoup.nodes.Node)",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\n     * Insert the specified node into the DOM after this node (as a following sibling).\n     * @param node to add after this element\n     * @return this element, for chaining\n     * @see #before(Node)\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.empty()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "\n     * Remove all of the element\u0027s child nodes. Any attributes are left as-is.\n     * @return this element\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 27)",
        "(line 617,col 9)-(line 617,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.wrap(java.lang.String)",
      "begin_line": 626,
      "end_line": 629,
      "comment": "\n     * Wrap the supplied HTML around this element.\n     *\n     * @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     * @return this element, for chaining.\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.cssSelector()",
      "begin_line": 641,
      "end_line": 661,
      "comment": "\n     * Get a CSS selector that will uniquely select this element.\n     * \u003cp\u003e\n     * If the element has an ID, returns #id;\n     * otherwise returns the parent (if any) CSS selector, followed by {@literal \u0027\u003e\u0027},\n     * followed by a unique selector for the element (tag.class.class:nth-child(n)).\n     * \u003c/p\u003e\n     *\n     * @return the CSS Path that can be used to retrieve the element in a selector.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 643,col 30)",
        "(line 646,col 9)-(line 646,col 53)",
        "(line 647,col 9)-(line 647,col 60)",
        "(line 648,col 9)-(line 648,col 60)",
        "(line 649,col 9)-(line 650,col 49)",
        "(line 652,col 9)-(line 653,col 39)",
        "(line 655,col 9)-(line 655,col 34)",
        "(line 656,col 9)-(line 658,col 62)",
        "(line 660,col 9)-(line 660,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.siblingElements()",
      "begin_line": 668,
      "end_line": 678,
      "comment": "\n     * Get sibling elements. If the element has no sibling elements, returns an empty list. An element is not a sibling\n     * of itself, so will not be included in the returned list.\n     * @return sibling elements\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 670,col 35)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 673,col 9)-(line 673,col 62)",
        "(line 674,col 9)-(line 676,col 33)",
        "(line 677,col 9)-(line 677,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nextElementSibling()",
      "begin_line": 689,
      "end_line": 698,
      "comment": "\n     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, \n     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.\n     * \u003cp\u003e\n     * This is similar to {@link #nextSibling()}, but specifically finds only Elements\n     * \u003c/p\u003e\n     * @return the next element, or null if there is no next element\n     * @see #previousElementSibling()\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 44)",
        "(line 691,col 9)-(line 691,col 62)",
        "(line 692,col 9)-(line 692,col 52)",
        "(line 693,col 9)-(line 693,col 32)",
        "(line 694,col 9)-(line 697,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nextElementSiblings()",
      "begin_line": 705,
      "end_line": 707,
      "comment": "\n     * Get each of the sibling elements that come after this element.\n     *\n     * @return each of the element siblings after this element, or an empty list if there are no next sibling elements\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.previousElementSibling()",
      "begin_line": 714,
      "end_line": 723,
      "comment": "\n     * Gets the previous element sibling of this element.\n     * @return the previous element, or null if there is no previous element\n     * @see #nextElementSibling()\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 44)",
        "(line 716,col 9)-(line 716,col 62)",
        "(line 717,col 9)-(line 717,col 52)",
        "(line 718,col 9)-(line 718,col 32)",
        "(line 719,col 9)-(line 722,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.previousElementSiblings()",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * Get each of the element siblings before this element.\n     *\n     * @return the previous element siblings, or an empty list if there are none.\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nextElementSiblings(boolean)",
      "begin_line": 734,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 38)",
        "(line 736,col 9)-(line 737,col 24)",
        "(line 738,col 9)-(line 738,col 22)",
        "(line 739,col 9)-(line 739,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.firstElementSibling()",
      "begin_line": 746,
      "end_line": 750,
      "comment": "\n     * Gets the first element sibling of this element.\n     * @return the first sibling that is an element (aka the parent\u0027s first element child) \n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 62)",
        "(line 749,col 9)-(line 749,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.elementSiblingIndex()",
      "begin_line": 757,
      "end_line": 760,
      "comment": "\n     * Get the list index of this element in its element sibling list. I.e. if this is the first element\n     * sibling, returns 0.\n     * @return position in element sibling list\n     ",
      "child_ranges": [
        "(line 758,col 8)-(line 758,col 38)",
        "(line 759,col 8)-(line 759,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.lastElementSibling()",
      "begin_line": 766,
      "end_line": 769,
      "comment": "\n     * Gets the last element sibling of this element\n     * @return the last sibling that is an element (aka the parent\u0027s last element child) \n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 62)",
        "(line 768,col 9)-(line 768,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.indexInList(org.jsoup.nodes.Element, java.util.List\u003cE\u003e)",
      "begin_line": 771,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 41)",
        "(line 773,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByTag(java.lang.String)",
      "begin_line": 787,
      "end_line": 792,
      "comment": "\n     * Finds elements, including and recursively under this element, with the specified tag name.\n     * @param tagName The tag name to search for (case insensitively).\n     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 35)",
        "(line 789,col 9)-(line 789,col 37)",
        "(line 791,col 9)-(line 791,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementById(java.lang.String)",
      "begin_line": 803,
      "end_line": 811,
      "comment": "\n     * Find an element by ID, including or under this element.\n     * \u003cp\u003e\n     * Note that this finds the first matching ID, starting with this element. If you search down from a different\n     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,\n     * use {@link Document#getElementById(String)}\n     * @param id The ID to search for.\n     * @return The first matching element by ID, starting with this element, or null if none found.\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 30)",
        "(line 806,col 9)-(line 806,col 74)",
        "(line 807,col 9)-(line 810,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByClass(java.lang.String)",
      "begin_line": 824,
      "end_line": 828,
      "comment": "\n     * Find elements that have this class, including or under this element. Case insensitive.\n     * \u003cp\u003e\n     * Elements can have multiple classes (e.g. {@code \u003cdiv class\u003d\"header round first\"\u003e}. This method\n     * checks each class, so you can find the above with {@code el.getElementsByClass(\"header\");}.\n     * \n     * @param className the name of the class to search for.\n     * @return elements with the supplied class name, empty if none\n     * @see #hasClass(String)\n     * @see #classNames()\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 37)",
        "(line 827,col 9)-(line 827,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttribute(java.lang.String)",
      "begin_line": 836,
      "end_line": 841,
      "comment": "\n     * Find elements that have a named attribute set. Case insensitive.\n     *\n     * @param key name of the attribute, e.g. {@code href}\n     * @return elements that have this attribute, empty if none\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 31)",
        "(line 838,col 9)-(line 838,col 25)",
        "(line 840,col 9)-(line 840,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeStarting(java.lang.String)",
      "begin_line": 849,
      "end_line": 854,
      "comment": "\n     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements\n     * that have HTML5 datasets.\n     * @param keyPrefix name prefix of the attribute e.g. {@code data-}\n     * @return elements that have attribute names that start with with the prefix, empty if none.\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 37)",
        "(line 851,col 9)-(line 851,col 37)",
        "(line 853,col 9)-(line 853,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValue(java.lang.String, java.lang.String)",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * Find elements that have an attribute with the specific value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that have this attribute with this value, empty if none\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueNot(java.lang.String, java.lang.String)",
      "begin_line": 874,
      "end_line": 876,
      "comment": "\n     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that do not have a matching attribute\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 885,
      "end_line": 887,
      "comment": "\n     * Find elements that have attributes that start with the value prefix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valuePrefix start of attribute value\n     * @return elements that have attributes that start with the value prefix\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 896,
      "end_line": 898,
      "comment": "\n     * Find elements that have attributes that end with the value suffix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valueSuffix end of the attribute value\n     * @return elements that have attributes that end with the value suffix\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n     * Find elements that have attributes whose value contains the match string. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param match substring of value to search for\n     * @return elements that have attributes containing this text\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 917,
      "end_line": 920,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param pattern compiled regular expression to match against attribute values\n     * @return elements that have attributes matching this regular expression\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.lang.String)",
      "begin_line": 928,
      "end_line": 936,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param regex regular expression to match against attribute values. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements that have attributes matching this regular expression\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 24)",
        "(line 930,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexLessThan(int)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * Find elements whose sibling index is less than the supplied index.\n     * @param index 0-based index\n     * @return elements less than index\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexGreaterThan(int)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "\n     * Find elements whose sibling index is greater than the supplied index.\n     * @param index 0-based index\n     * @return elements greater than index\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexEquals(int)",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\n     * Find elements whose sibling index is equal to the supplied index.\n     * @param index 0-based index\n     * @return elements equal to index\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingText(java.lang.String)",
      "begin_line": 972,
      "end_line": 974,
      "comment": "\n     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly\n     * in the element, or in any of its descendants.\n     * @param searchText to look for in the element\u0027s text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingOwnText(java.lang.String)",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\n     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly\n     * in the element, not in any of its descendants.\n     * @param searchText to look for in the element\u0027s own text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.util.regex.Pattern)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.lang.String)",
      "begin_line": 1003,
      "end_line": 1011,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 24)",
        "(line 1005,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1010,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.util.regex.Pattern)",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "\n     * Find elements whose own text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.lang.String)",
      "begin_line": 1029,
      "end_line": 1037,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 24)",
        "(line 1031,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1036,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getAllElements()",
      "begin_line": 1044,
      "end_line": 1046,
      "comment": "\n     * Find all elements under this element (including self, and children of children).\n     * \n     * @return all elements\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text()",
      "begin_line": 1058,
      "end_line": 1086,
      "comment": "\n     * Gets the combined text of this element and all its children. Whitespace is normalized and trimmed.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello  \u003cb\u003ethere\u003c/b\u003e now! \u003c/p\u003e}, {@code p.text()} returns {@code \"Hello there now!\"}\n     *\n     * @return unencoded, normalized text, or empty string if none.\n     * @see #wholeText() if you don\u0027t want the text to be normalized.\n     * @see #ownText()\n     * @see #textNodes()\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 63)",
        "(line 1060,col 9)-(line 1083,col 17)",
        "(line 1085,col 9)-(line 1085,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.Anonymous-58c8c254-d9eb-4756-9324-ab2c3ff2e2a1.head(org.jsoup.nodes.Node, int)",
      "begin_line": 1061,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 17)-(line 1071,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.Anonymous-75e588ad-625d-49b5-87fa-e00f7e92203b.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 1074,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 17)-(line 1080,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.wholeText()",
      "begin_line": 1095,
      "end_line": 1110,
      "comment": "\n     * Get the (unencoded) text of all children of this element, including any newlines and spaces present in the\n     * original.\n     *\n     * @return unencoded, un-normalized text\n     * @see #text()\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 63)",
        "(line 1097,col 9)-(line 1107,col 17)",
        "(line 1109,col 9)-(line 1109,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.Anonymous-4bb1f2ac-14bc-4460-b198-191d23fb9187.head(org.jsoup.nodes.Node, int)",
      "begin_line": 1098,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 17)-(line 1102,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.Anonymous-c46fc2fd-db37-47f6-9b9d-3b8e8e9530d3.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 1105,
      "end_line": 1106,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText()",
      "begin_line": 1123,
      "end_line": 1127,
      "comment": "\n     * Gets the text owned by this element only; does not get the combined text of all children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.ownText()} returns {@code \"Hello now!\"},\n     * whereas {@code p.text()} returns {@code \"Hello there now!\"}.\n     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #text()\n     * @see #textNodes()\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 54)",
        "(line 1125,col 9)-(line 1125,col 20)",
        "(line 1126,col 9)-(line 1126,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText(java.lang.StringBuilder)",
      "begin_line": 1129,
      "end_line": 1138,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 9)-(line 1137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)",
      "begin_line": 1140,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1141,col 9)-(line 1141,col 46)",
        "(line 1143,col 9)-(line 1146,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendWhitespaceIfBr(org.jsoup.nodes.Element, java.lang.StringBuilder)",
      "begin_line": 1149,
      "end_line": 1152,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 9)-(line 1151,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.preserveWhitespace(org.jsoup.nodes.Node)",
      "begin_line": 1154,
      "end_line": 1167,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.String)",
      "begin_line": 1174,
      "end_line": 1182,
      "comment": "\n     * Set the text of this element. Any existing contents (text or elements) will be cleared\n     * @param text unencoded text\n     * @return this element\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 31)",
        "(line 1177,col 9)-(line 1177,col 16)",
        "(line 1178,col 9)-(line 1178,col 47)",
        "(line 1179,col 9)-(line 1179,col 30)",
        "(line 1181,col 9)-(line 1181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasText()",
      "begin_line": 1188,
      "end_line": 1201,
      "comment": "\n     Test if this element has any text content (that is not just whitespace).\n     @return true if element has non-blank text content.\n     ",
      "child_ranges": [
        "(line 1189,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1200,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.data()",
      "begin_line": 1212,
      "end_line": 1234,
      "comment": "\n     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag. Note that data is NOT the\n     * text of the element. Use {@link #text()} to get the text that would be visible to a user, and {@link #data()}\n     * for the contents of scripts, comments, CSS styles, etc.\n     *\n     * @return the data, or empty string if none\n     *\n     * @see #dataNodes()\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 54)",
        "(line 1215,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.className()",
      "begin_line": 1241,
      "end_line": 1243,
      "comment": "\n     * Gets the literal value of this element\u0027s \"class\" attribute, which may include multiple class names, space\n     * separated. (E.g. on \u003ccode\u003e\u0026lt;div class\u003d\"header gray\"\u0026gt;\u003c/code\u003e returns, \"\u003ccode\u003eheader gray\u003c/code\u003e\")\n     * @return The literal class attribute, or \u003cb\u003eempty string\u003c/b\u003e if no class attribute set.\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames()",
      "begin_line": 1251,
      "end_line": 1257,
      "comment": "\n     * Get all of the element\u0027s class names. E.g. on element {@code \u003cdiv class\u003d\"header gray\"\u003e},\n     * returns a set of two elements {@code \"header\", \"gray\"}. Note that modifications to this set are not pushed to\n     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.\n     * @return set of classnames, empty if no class attribute\n     ",
      "child_ranges": [
        "(line 1252,col 6)-(line 1252,col 52)",
        "(line 1253,col 6)-(line 1253,col 72)",
        "(line 1254,col 6)-(line 1254,col 27)",
        "(line 1256,col 9)-(line 1256,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1264,
      "end_line": 1272,
      "comment": "\n     Set the element\u0027s {@code class} attribute to the supplied class names.\n     @param classNames set of classes\n     @return this element, for chaining\n     ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1265,col 37)",
        "(line 1266,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasClass(java.lang.String)",
      "begin_line": 1280,
      "end_line": 1321,
      "comment": " performance sensitive",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 69)",
        "(line 1282,col 9)-(line 1282,col 43)",
        "(line 1283,col 9)-(line 1283,col 47)",
        "(line 1285,col 9)-(line 1287,col 9)",
        "(line 1290,col 9)-(line 1292,col 9)",
        "(line 1295,col 9)-(line 1295,col 32)",
        "(line 1296,col 9)-(line 1296,col 22)",
        "(line 1297,col 9)-(line 1313,col 9)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1320,col 9)-(line 1320,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.addClass(java.lang.String)",
      "begin_line": 1328,
      "end_line": 1336,
      "comment": "\n     Add a class name to this element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this element\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 36)",
        "(line 1331,col 9)-(line 1331,col 43)",
        "(line 1332,col 9)-(line 1332,col 31)",
        "(line 1333,col 9)-(line 1333,col 28)",
        "(line 1335,col 9)-(line 1335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.removeClass(java.lang.String)",
      "begin_line": 1343,
      "end_line": 1351,
      "comment": "\n     Remove a class name from this element\u0027s {@code class} attribute.\n     @param className class name to remove\n     @return this element\n     ",
      "child_ranges": [
        "(line 1344,col 9)-(line 1344,col 36)",
        "(line 1346,col 9)-(line 1346,col 43)",
        "(line 1347,col 9)-(line 1347,col 34)",
        "(line 1348,col 9)-(line 1348,col 28)",
        "(line 1350,col 9)-(line 1350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toggleClass(java.lang.String)",
      "begin_line": 1358,
      "end_line": 1369,
      "comment": "\n     Toggle a class name on this element\u0027s {@code class} attribute: if present, remove it; otherwise add it.\n     @param className class name to toggle\n     @return this element\n     ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1359,col 36)",
        "(line 1361,col 9)-(line 1361,col 43)",
        "(line 1362,col 9)-(line 1365,col 35)",
        "(line 1366,col 9)-(line 1366,col 28)",
        "(line 1368,col 9)-(line 1368,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val()",
      "begin_line": 1375,
      "end_line": 1380,
      "comment": "\n     * Get the value of a form element (input, textarea, etc).\n     * @return the value of the form element, or empty string if not set.\n     ",
      "child_ranges": [
        "(line 1376,col 9)-(line 1379,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val(java.lang.String)",
      "begin_line": 1387,
      "end_line": 1393,
      "comment": "\n     * Set the value of a form element (input, textarea, etc).\n     * @param value value to set\n     * @return this element (for chaining)\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1391,col 33)",
        "(line 1392,col 9)-(line 1392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 1395,
      "end_line": 1416,
      "comment": "",
      "child_ranges": [
        "(line 1396,col 9)-(line 1403,col 9)",
        "(line 1404,col 9)-(line 1404,col 44)",
        "(line 1405,col 9)-(line 1405,col 60)",
        "(line 1408,col 9)-(line 1415,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 1418,
      "end_line": 1426,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 9)-(line 1425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html()",
      "begin_line": 1435,
      "end_line": 1440,
      "comment": "\n     * Retrieves the element\u0027s inner HTML. E.g. on a {@code \u003cdiv\u003e} with one empty {@code \u003cp\u003e}, would return\n     * {@code \u003cp\u003e\u003c/p\u003e}. (Whereas {@link #outerHtml()} would return {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e\u003c/div\u003e}.)\n     * \n     * @return String of HTML.\n     * @see #outerHtml()\n     ",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 57)",
        "(line 1437,col 9)-(line 1437,col 20)",
        "(line 1438,col 9)-(line 1438,col 55)",
        "(line 1439,col 9)-(line 1439,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(T)",
      "begin_line": 1442,
      "end_line": 1449,
      "comment": "",
      "child_ranges": [
        "(line 1444,col 9)-(line 1444,col 43)",
        "(line 1445,col 9)-(line 1446,col 52)",
        "(line 1448,col 9)-(line 1448,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.String)",
      "begin_line": 1457,
      "end_line": 1461,
      "comment": "\n     * Set this element\u0027s inner HTML. Clears the existing HTML first.\n     * @param html HTML to parse and set into this element\n     * @return this element\n     * @see #append(String)\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 16)",
        "(line 1459,col 9)-(line 1459,col 21)",
        "(line 1460,col 9)-(line 1460,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.clone()",
      "begin_line": 1463,
      "end_line": 1466,
      "comment": "",
      "child_ranges": [
        "(line 1465,col 9)-(line 1465,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.shallowClone()",
      "begin_line": 1468,
      "end_line": 1472,
      "comment": "",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.doClone(org.jsoup.nodes.Node)",
      "begin_line": 1474,
      "end_line": 1483,
      "comment": "",
      "child_ranges": [
        "(line 1476,col 9)-(line 1476,col 56)",
        "(line 1477,col 9)-(line 1477,col 74)",
        "(line 1478,col 9)-(line 1478,col 32)",
        "(line 1479,col 9)-(line 1479,col 66)",
        "(line 1480,col 9)-(line 1480,col 44)",
        "(line 1482,col 9)-(line 1482,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeList",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.helper.ChangeNotifyingArrayList\u003corg.jsoup.nodes.Node\u003e"
      ],
      "begin_line": 1485,
      "end_line": 1496,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "owner"
      ],
      "begin_line": 1486,
      "end_line": 1486,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.NodeList.NodeList(org.jsoup.nodes.Element, int)",
      "begin_line": 1488,
      "end_line": 1491,
      "comment": "",
      "child_ranges": [
        "(line 1489,col 13)-(line 1489,col 35)",
        "(line 1490,col 13)-(line 1490,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.NodeList.onContentsChanged()",
      "begin_line": 1493,
      "end_line": 1495,
      "comment": "",
      "child_ranges": [
        "(line 1494,col 13)-(line 1494,col 36)"
      ]
    }
  ]
}