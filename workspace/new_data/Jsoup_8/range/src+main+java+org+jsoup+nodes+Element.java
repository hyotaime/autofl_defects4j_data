{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/Element.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Element",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 23,
      "end_line": 1044,
      "comment": "\n * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and\n * other elements).\n * \n * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.\n * \n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "tag"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classNames"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 36,
      "end_line": 41,
      "comment": "\n     * Create a new, standalone Element. (Standalone in that is has no parent.)\n     * \n     * @param tag tag of this element\n     * @param baseUri the base URI\n     * @param attributes initial attributes\n     * @see #appendChild(Node)\n     * @see #appendElement(String)\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 35)",
        "(line 39,col 9)-(line 39,col 30)",
        "(line 40,col 9)-(line 40,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a new Element from a tag and a base URI.\n     * \n     * @param tag element tag\n     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty\n     *            string, but not null.\n     * @see Tag#valueOf(String)\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nodeName()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Get the name of the tag for this element. E.g. {@code div}\n     * \n     * @return the tag name\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tag()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Get the Tag for this element.\n     * \n     * @return the tag object\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.isBlock()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Test if this element is a block-level element. (E.g. {@code \u003cdiv\u003e \u003d\u003d true} or an inline element\n     * {@code \u003cp\u003e \u003d\u003d false}).\n     * \n     * @return true if block, false if not (and thus inline)\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.id()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Get the {@code id} attribute of this element.\n     * \n     * @return The id attribute, if present, or an empty string if not.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 31)",
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.attr(java.lang.String, java.lang.String)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Set an attribute value on this element. If this element already has an attribute with the\n     * key, its value is updated; otherwise, a new attribute is added.\n     * \n     * @return this element\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 49)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataset()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Get this element\u0027s HTML5 custom data attributes. Each attribute in the element that has a key\n     * starting with \"data-\" is included the dataset.\n     * \u003cp\u003e\n     * E.g., the element {@code \u003cdiv data-package\u003d\"jsoup\" data-language\u003d\"Java\" class\u003d\"group\"\u003e...} has the dataset\n     * {@code package\u003djsoup, language\u003djava}.\n     * \u003cp\u003e\n     * This map is a filtered view of the element\u0027s attribute map. Changes to one map (add, remove, update) are reflected\n     * in the other map.\n     * \u003cp\u003e\n     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.\n     * @return a map of {@code key\u003dvalue} custom data attributes.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parent()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parents()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n     * Get this element\u0027s parent and ancestors, up to the document root.\n     * @return this element\u0027s stack of parents, closest first.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 137,col 41)",
        "(line 138,col 9)-(line 138,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.child(int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Get a child element of this element, by its 0-based index number.\n     * \u003cp/\u003e\n     * Note that an element can have both mixed Nodes and Elements as children. This method inspects\n     * a filtered list of children that are elements, and the index is based on that filtered list.\n     * \n     * @param index the index number of the element to retrieve\n     * @return the child element, if it exists, or {@code null} if absent.\n     * @see #childNode(int)\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.children()",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Get this element\u0027s child elements.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Element nodes.\n     * @return child elements. If this element has no children, returns an\n     * empty list.\n     * @see #childNodes()\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.select(java.lang.String)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Find elements that match the selector query, with this element as the starting context. Matched elements\n     * may include this element, or any of its children.\n     * \u003cp/\u003e\n     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because\n     * multiple filters can be combined, e.g.:\n     * \u003cul\u003e\n     * \u003cli\u003e{@code el.select(\"a[href]\")} - finds links ({@code a} tags with {@code href} attributes)\n     * \u003cli\u003e{@code el.select(\"a[href*\u003dexample.com]\")} - finds links pointing to example.com (loosely)\n     * \u003c/ul\u003e\n     * \u003cp/\u003e\n     * See the query syntax documentation in {@link org.jsoup.select.Selector}.\n     *\n     * @param query a {@link Selector} query\n     * @return elements that match the query (empty if none match)\n     * @see org.jsoup.select.Selector\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendChild(org.jsoup.nodes.Node)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "\n     * Add a node to the last child of this element.\n     * \n     * @param child node to add. Must not already have a parent.\n     * @return this element, so that you can add more child nodes or elements.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 32)",
        "(line 211,col 9)-(line 211,col 27)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependChild(org.jsoup.nodes.Node)",
      "begin_line": 221,
      "end_line": 226,
      "comment": "\n     * Add a node to the start of this element\u0027s children.\n     * \n     * @param child node to add. Must not already have a parent.\n     * @return this element, so that you can add more child nodes or elements.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 32)",
        "(line 224,col 9)-(line 224,col 30)",
        "(line 225,col 9)-(line 225,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendElement(java.lang.String)",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\n     * Create a new element by tag name, and add it as the last child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.appendElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 69)",
        "(line 237,col 9)-(line 237,col 27)",
        "(line 238,col 9)-(line 238,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependElement(java.lang.String)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\n     * Create a new element by tag name, and add it as the first child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.prependElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 69)",
        "(line 250,col 9)-(line 250,col 28)",
        "(line 251,col 9)-(line 251,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendText(java.lang.String)",
      "begin_line": 260,
      "end_line": 264,
      "comment": "\n     * Create and append a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 54)",
        "(line 262,col 9)-(line 262,col 26)",
        "(line 263,col 9)-(line 263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependText(java.lang.String)",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * Create and prepend a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 54)",
        "(line 274,col 9)-(line 274,col 27)",
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.append(java.lang.String)",
      "begin_line": 284,
      "end_line": 290,
      "comment": "\n     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.\n     * @param html HTML to add inside this element, after the existing HTML\n     * @return this element\n     * @see #html(String)\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 31)",
        "(line 287,col 9)-(line 287,col 83)",
        "(line 288,col 9)-(line 288,col 50)",
        "(line 289,col 9)-(line 289,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prepend(java.lang.String)",
      "begin_line": 298,
      "end_line": 304,
      "comment": "\n     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element\u0027s children.\n     * @param html HTML to add inside this element, before the existing HTML\n     * @return this element\n     * @see #html(String)\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 31)",
        "(line 301,col 9)-(line 301,col 83)",
        "(line 302,col 9)-(line 302,col 53)",
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(java.lang.String)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Insert the specified HTML into the DOM before this element (i.e. as a preceeding sibling).\n     * @param html HTML to add before this element\n     * @return this element, for chaining\n     * @see #after(String)\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 45)",
        "(line 314,col 9)-(line 314,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(java.lang.String)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * Insert the specified HTML into the DOM after this element (i.e. as a following sibling).\n     * @param html HTML to add after this element\n     * @return this element, for chaining\n     * @see #before(String)\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 47)",
        "(line 325,col 9)-(line 325,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.addSiblingHtml(int, java.lang.String)",
      "begin_line": 328,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 31)",
        "(line 330,col 9)-(line 330,col 37)",
        "(line 332,col 9)-(line 332,col 83)",
        "(line 333,col 9)-(line 333,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.empty()",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * Remove all of the element\u0027s child nodes. Any attributes are left as-is.\n     * @return this element\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 27)",
        "(line 342,col 9)-(line 342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.wrap(java.lang.String)",
      "begin_line": 350,
      "end_line": 372,
      "comment": "\n     Wrap the supplied HTML around this element.\n     @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitralily deep.\n     @return this element, for chaining.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 32)",
        "(line 353,col 9)-(line 353,col 81)",
        "(line 354,col 9)-(line 354,col 52)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 357,col 24)",
        "(line 359,col 9)-(line 359,col 45)",
        "(line 360,col 9)-(line 360,col 44)",
        "(line 361,col 9)-(line 361,col 34)",
        "(line 364,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getDeepChild(org.jsoup.nodes.Element)",
      "begin_line": 374,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 47)",
        "(line 376,col 9)-(line 379,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.siblingElements()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Get sibling elements.\n     * @return sibling elements\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nextElementSibling()",
      "begin_line": 398,
      "end_line": 406,
      "comment": "\n     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, \n     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.\n     * \u003cp/\u003e\n     * This is similar to {@link #nextSibling()}, but specifically finds only Elements\n     * @return the next element, or null if there is no next element\n     * @see #previousElementSibling()\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 53)",
        "(line 400,col 9)-(line 400,col 52)",
        "(line 401,col 9)-(line 401,col 32)",
        "(line 402,col 9)-(line 405,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.previousElementSibling()",
      "begin_line": 413,
      "end_line": 421,
      "comment": "\n     * Gets the previous element sibling of this element.\n     * @return the previous element, or null if there is no previous element\n     * @see #nextElementSibling()\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 53)",
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 416,col 32)",
        "(line 417,col 9)-(line 420,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.firstElementSibling()",
      "begin_line": 427,
      "end_line": 431,
      "comment": "\n     * Gets the first element sibling of this element.\n     * @return the first sibling that is an element (aka the parent\u0027s first element child) \n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 53)",
        "(line 430,col 9)-(line 430,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.elementSiblingIndex()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Get the list index of this element in its element sibling list. I.e. if this is the first element\n     * sibling, returns 0.\n     * @return position in element sibling list\n     ",
      "child_ranges": [
        "(line 439,col 8)-(line 439,col 38)",
        "(line 440,col 8)-(line 440,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.lastElementSibling()",
      "begin_line": 447,
      "end_line": 450,
      "comment": "\n     * Gets the last element sibling of this element\n     * @return the last sibling that is an element (aka the parent\u0027s last element child) \n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 53)",
        "(line 449,col 9)-(line 449,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.indexInList(org.jsoup.nodes.Element, java.util.List\u003cE\u003e)",
      "begin_line": 452,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 33)",
        "(line 454,col 9)-(line 454,col 35)",
        "(line 456,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByTag(java.lang.String)",
      "begin_line": 471,
      "end_line": 476,
      "comment": "\n     * Finds elements, including and recursively under this element, with the specified tag name.\n     * @param tagName The tag name to search for (case insensitively).\n     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 35)",
        "(line 473,col 9)-(line 473,col 47)",
        "(line 475,col 9)-(line 475,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementById(java.lang.String)",
      "begin_line": 487,
      "end_line": 495,
      "comment": "\n     * Find an element by ID, including or under this element.\n     * \u003cp\u003e\n     * Note that this finds the first matching ID, starting with this element. If you search down from a different\n     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,\n     * use {@link Document#getElementById(String)}\n     * @param id The ID to search for.\n     * @return The first matching element by ID, starting with this element, or null if none found.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 30)",
        "(line 490,col 9)-(line 490,col 74)",
        "(line 491,col 9)-(line 494,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByClass(java.lang.String)",
      "begin_line": 508,
      "end_line": 512,
      "comment": "\n     * Find elements that have this class, including or under this element. Case insensitive.\n     * \u003cp\u003e\n     * Elements can have multiple classes (e.g. {@code \u003cdiv class\u003d\"header round first\"\u003e}. This method\n     * checks each class, so you can find the above with {@code el.getElementsByClass(\"header\");}.\n     * \n     * @param className the name of the class to search for.\n     * @return elements with the supplied class name, empty if none\n     * @see #hasClass(String)\n     * @see #classNames()\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 37)",
        "(line 511,col 9)-(line 511,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttribute(java.lang.String)",
      "begin_line": 520,
      "end_line": 525,
      "comment": "\n     * Find elements that have a named attribute set. Case insensitive.\n     *\n     * @param key name of the attribute, e.g. {@code href}\n     * @return elements that have this attribute, empty if none\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 31)",
        "(line 522,col 9)-(line 522,col 39)",
        "(line 524,col 9)-(line 524,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeStarting(java.lang.String)",
      "begin_line": 533,
      "end_line": 538,
      "comment": "\n     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements\n     * that have HTML5 datasets.\n     * @param keyPrefix name prefix of the attribute e.g. {@code data-}\n     * @return elements that have attribute names that start with with the prefix, empty if none.\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 37)",
        "(line 535,col 9)-(line 535,col 51)",
        "(line 537,col 9)-(line 537,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValue(java.lang.String, java.lang.String)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Find elements that have an attribute with the specific value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that have this attribute with this value, empty if none\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueNot(java.lang.String, java.lang.String)",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that do not have a matching attribute\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n     * Find elements that have attributes that start with the value prefix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valuePrefix start of attribute value\n     * @return elements that have attributes that start with the value prefix\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\n     * Find elements that have attributes that end with the value suffix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valueSuffix end of the attribute value\n     * @return elements that have attributes that end with the value suffix\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 591,
      "end_line": 593,
      "comment": "\n     * Find elements that have attributes whose value contains the match string. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param match substring of value to search for\n     * @return elements that have attributes containing this text\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 601,
      "end_line": 604,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param pattern compiled regular expression to match against attribute values\n     * @return elements that have attributes matching this regular expression\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.lang.String)",
      "begin_line": 612,
      "end_line": 620,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param regex regular expression to match agaisnt attribute values. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements that have attributes matching this regular expression\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 24)",
        "(line 614,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexLessThan(int)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Find elements whose sibling index is less than the supplied index.\n     * @param index 0-based index\n     * @return elements less than index\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexGreaterThan(int)",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * Find elements whose sibling index is greater than the supplied index.\n     * @param index 0-based index\n     * @return elements greater than index\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexEquals(int)",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * Find elements whose sibling index is equal to the supplied index.\n     * @param index 0-based index\n     * @return elements equal to index\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingText(java.lang.String)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "\n     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly\n     * in the element, or in any of its descendants.\n     * @param searchText to look for in the element\u0027s text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingOwnText(java.lang.String)",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly\n     * in the element, not in any of its descendants.\n     * @param searchText to look for in the element\u0027s own text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.util.regex.Pattern)",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.lang.String)",
      "begin_line": 687,
      "end_line": 695,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 24)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.util.regex.Pattern)",
      "begin_line": 703,
      "end_line": 705,
      "comment": "\n     * Find elements whose own text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.lang.String)",
      "begin_line": 713,
      "end_line": 721,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 24)",
        "(line 715,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getAllElements()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\n     * Find all elements under this element (including self, and children of children).\n     * \n     * @return all elements\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text()",
      "begin_line": 740,
      "end_line": 744,
      "comment": "\n     * Gets the combined text of this element and all its children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.text()} returns {@code \"Hello there now!\"}\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #ownText()\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 47)",
        "(line 742,col 9)-(line 742,col 17)",
        "(line 743,col 9)-(line 743,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.StringBuilder)",
      "begin_line": 746,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 757,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText()",
      "begin_line": 770,
      "end_line": 774,
      "comment": "\n     * Gets the text owned by this element only; does not get the combined text of all children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.ownText()} returns {@code \"Hello now!\"},\n     * whereas {@code p.text()} returns {@code \"Hello there now!\"}.\n     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #text()\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 47)",
        "(line 772,col 9)-(line 772,col 20)",
        "(line 773,col 9)-(line 773,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText(java.lang.StringBuilder)",
      "begin_line": 776,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 777,col 9)-(line 782,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)",
      "begin_line": 785,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 46)",
        "(line 788,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.preserveWhitespace()",
      "begin_line": 796,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.String)",
      "begin_line": 805,
      "end_line": 813,
      "comment": "\n     * Set the text of this element. Any existing contents (text or elements) will be cleared\n     * @param text unencoded text\n     * @return this element\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 31)",
        "(line 808,col 9)-(line 808,col 16)",
        "(line 809,col 9)-(line 809,col 56)",
        "(line 810,col 9)-(line 810,col 30)",
        "(line 812,col 9)-(line 812,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasText()",
      "begin_line": 819,
      "end_line": 832,
      "comment": "\n     Test if this element has any text content (that is not just whitespace).\n     @return true if element has non-blank text content.\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.data()",
      "begin_line": 838,
      "end_line": 852,
      "comment": "\n     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag.\n     * @return the data, or empty string if none\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 47)",
        "(line 841,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.className()",
      "begin_line": 859,
      "end_line": 861,
      "comment": "\n     * Gets the literal value of this element\u0027s \"class\" attribute, which may include multiple class names, space\n     * separated. (E.g. on \u003ccode\u003e\u0026lt;div class\u003d\"header gray\"\u003e\u003c/code\u003e returns, \"\u003ccode\u003eheader gray\u003c/code\u003e\")\n     * @return The literal class attribute, or \u003cb\u003eempty string\u003c/b\u003e if no class attribute set.\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames()",
      "begin_line": 869,
      "end_line": 875,
      "comment": "\n     * Get all of the element\u0027s class names. E.g. on element {@code \u003cdiv class\u003d\"header gray\"}\u003e},\n     * returns a set of two elements {@code \"header\", \"gray\"}. Note that modifications to this set are not pushed to\n     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.\n     * @return set of classnames, empty if no class attribute\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 882,
      "end_line": 886,
      "comment": "\n     Set the element\u0027s {@code class} attribute to the supplied class names.\n     @param classNames set of classes\n     @return this element, for chaining\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 37)",
        "(line 884,col 9)-(line 884,col 66)",
        "(line 885,col 9)-(line 885,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasClass(java.lang.String)",
      "begin_line": 893,
      "end_line": 895,
      "comment": "\n     * Tests if this element has a class.\n     * @param className name of class to check for\n     * @return true if it does, false if not\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.addClass(java.lang.String)",
      "begin_line": 902,
      "end_line": 910,
      "comment": "\n     Add a class name to this element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this element\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 36)",
        "(line 905,col 9)-(line 905,col 43)",
        "(line 906,col 9)-(line 906,col 31)",
        "(line 907,col 9)-(line 907,col 28)",
        "(line 909,col 9)-(line 909,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.removeClass(java.lang.String)",
      "begin_line": 917,
      "end_line": 925,
      "comment": "\n     Remove a class name from this element\u0027s {@code class} attribute.\n     @param className class name to remove\n     @return this element\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 36)",
        "(line 920,col 9)-(line 920,col 43)",
        "(line 921,col 9)-(line 921,col 34)",
        "(line 922,col 9)-(line 922,col 28)",
        "(line 924,col 9)-(line 924,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toggleClass(java.lang.String)",
      "begin_line": 932,
      "end_line": 943,
      "comment": "\n     Toggle a class name on this element\u0027s {@code class} attribute: if present, remove it; otherwise add it.\n     @param className class name to toggle\n     @return this element\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 36)",
        "(line 935,col 9)-(line 935,col 43)",
        "(line 936,col 9)-(line 939,col 35)",
        "(line 940,col 9)-(line 940,col 28)",
        "(line 942,col 9)-(line 942,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val()",
      "begin_line": 949,
      "end_line": 954,
      "comment": "\n     * Get the value of a form element (input, textarea, etc).\n     * @return the value of the form element, or empty string if not set.\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 953,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val(java.lang.String)",
      "begin_line": 961,
      "end_line": 967,
      "comment": "\n     * Set the value of a form element (input, textarea, etc).\n     * @param value value to set\n     * @return this element (for chaining)\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 965,col 33)",
        "(line 966,col 9)-(line 966,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 969,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 970,col 9)-(line 971,col 38)",
        "(line 972,col 9)-(line 974,col 35)",
        "(line 975,col 9)-(line 975,col 36)",
        "(line 977,col 9)-(line 980,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 983,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 984,col 9)-(line 988,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html()",
      "begin_line": 998,
      "end_line": 1002,
      "comment": "\n     * Retrieves the element\u0027s inner HTML. E.g. on a {@code \u003cdiv\u003e} with one empty {@code \u003cp\u003e}, would return\n     * {@code \u003cp\u003e\u003c/p\u003e}. (Whereas {@link #outerHtml()} would return {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e\u003c/div\u003e}.)\n     * \n     * @return String of HTML.\n     * @see #outerHtml()\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 50)",
        "(line 1000,col 9)-(line 1000,col 20)",
        "(line 1001,col 9)-(line 1001,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.StringBuilder)",
      "begin_line": 1004,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 9)-(line 1006,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.String)",
      "begin_line": 1015,
      "end_line": 1019,
      "comment": "\n     * Set this element\u0027s inner HTML. Clears the existing HTML first.\n     * @param html HTML to parse and set into this element\n     * @return this element\n     * @see #append(String)\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 16)",
        "(line 1017,col 9)-(line 1017,col 21)",
        "(line 1018,col 9)-(line 1018,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toString()",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.equals(java.lang.Object)",
      "begin_line": 1025,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 35)",
        "(line 1028,col 9)-(line 1028,col 50)",
        "(line 1029,col 9)-(line 1029,col 43)",
        "(line 1031,col 9)-(line 1031,col 38)",
        "(line 1033,col 9)-(line 1033,col 87)",
        "(line 1035,col 9)-(line 1035,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hashCode()",
      "begin_line": 1038,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 38)",
        "(line 1041,col 9)-(line 1041,col 66)",
        "(line 1042,col 9)-(line 1042,col 22)"
      ]
    }
  ]
}