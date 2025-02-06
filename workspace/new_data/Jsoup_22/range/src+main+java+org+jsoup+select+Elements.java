{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/select/Elements.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Elements",
      "is_interface": false,
      "parent_types": [
        "java.util.List\u003corg.jsoup.nodes.Element\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 15,
      "end_line": 533,
      "comment": "\n A list of {@link Element Elements}, with methods that act on every element in the list.\n \u003cp/\u003e\n To get an Elements object, use the {@link Element#select(String)} method.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "contents"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements()",
      "begin_line": 18,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 19,col 9)-(line 19,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 23,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(java.util.List\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(org.jsoup.nodes.Element...)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.clone()",
      "begin_line": 35,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 37,col 6)-(line 37,col 55)",
        "(line 39,col 6)-(line 40,col 30)",
        "(line 43,col 6)-(line 43,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.attr(java.lang.String)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     Get an attribute value from the first matched element that has the attribute.\n     @param attributeKey The attribute key.\n     @return The attribute value from the first matched element that has the attribute.. If no elements were matched (isEmpty() \u003d\u003d true),\n     or if the no elements have the attribute, returns empty string.\n     @see #hasAttr(String)\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasAttr(java.lang.String)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "\n     Checks if any of the matched elements have this attribute set.\n     @param attributeKey attribute key\n     @return true if any of the elements have the attribute; false if none do.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.attr(java.lang.String, java.lang.String)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n     * Set an attribute on all matched elements.\n     * @param attributeKey attribute key\n     * @param attributeValue attribute value\n     * @return this\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeAttr(java.lang.String)",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n     * Remove an attribute from every matched element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addClass(java.lang.String)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     Add the class name to every matched element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeClass(java.lang.String)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     Remove the class name from every matched element\u0027s {@code class} attribute, if present.\n     @param className class name to remove\n     @return this\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toggleClass(java.lang.String)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     Toggle the class name on every matched element\u0027s {@code class} attribute.\n     @param className class name to add if missing, or remove if present, from every element.\n     @return this\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasClass(java.lang.String)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     Determine if any of the matched elements have this class name set in their {@code class} attribute.\n     @param className class name to check for\n     @return true if any do, false if none do\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.val()",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * Get the form element\u0027s value of the first matched element.\n     * @return The form element\u0027s value, or empty if not set.\n     * @see Element#val()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.val(java.lang.String)",
      "begin_line": 166,
      "end_line": 170,
      "comment": "\n     * Set the form element\u0027s value in each of the matched elements.\n     * @param value The value to set into each matched element\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.text()",
      "begin_line": 180,
      "end_line": 188,
      "comment": "\n     * Get the combined text of all the matched elements.\n     * \u003cp\u003e\n     * Note that it is possible to get repeats if the matched elements contain both parent elements and their own\n     * children, as the Element.text() method returns the combined text of a parent and all its children.\n     * @return string of all text: unescaped and no HTML.\n     * @see Element#text()\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 47)",
        "(line 182,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasText()",
      "begin_line": 190,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.html()",
      "begin_line": 204,
      "end_line": 212,
      "comment": "\n     * Get the combined inner HTML of all matched elements.\n     * @return string of all element\u0027s inner HTML.\n     * @see #text()\n     * @see #outerHtml()\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 47)",
        "(line 206,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.outerHtml()",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * Get the combined outer HTML of all matched elements.\n     * @return string of all element\u0027s outer HTML.\n     * @see #text()\n     * @see #html()\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 47)",
        "(line 222,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toString()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Get the combined outer HTML of all matched elements. Alias of {@link #outerHtml()}.\n     * @return string of all element\u0027s outer HTML.\n     * @see #text()\n     * @see #html()\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.tagName(java.lang.String)",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Update the tag name of each matched element. For example, to change each {@code \u003ci\u003e} to a {@code \u003cem\u003e}, do\n     * {@code doc.select(\"i\").tagName(\"em\");}\n     * @param tagName the new tag name\n     * @return this, for chaining\n     * @see Element#tagName(String)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.html(java.lang.String)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\n     * Set the inner HTML of each matched element.\n     * @param html HTML to parse and set into each matched element.\n     * @return this, for chaining\n     * @see Element#html(String)\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prepend(java.lang.String)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "\n     * Add the supplied HTML to the start of each matched element\u0027s inner HTML.\n     * @param html HTML to add inside each element, before the existing HTML\n     * @return this, for chaining\n     * @see Element#prepend(String)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.append(java.lang.String)",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\n     * Add the supplied HTML to the end of each matched element\u0027s inner HTML.\n     * @param html HTML to add inside each element, after the existing HTML\n     * @return this, for chaining\n     * @see Element#append(String)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.before(java.lang.String)",
      "begin_line": 299,
      "end_line": 304,
      "comment": "\n     * Insert the supplied HTML before each matched element\u0027s outer HTML.\n     * @param html HTML to insert before each element\n     * @return this, for chaining\n     * @see Element#before(String)\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.after(java.lang.String)",
      "begin_line": 312,
      "end_line": 317,
      "comment": "\n     * Insert the supplied HTML after each matched element\u0027s outer HTML.\n     * @param html HTML to insert after each element\n     * @return this, for chaining\n     * @see Element#after(String)\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.wrap(java.lang.String)",
      "begin_line": 328,
      "end_line": 334,
      "comment": "\n     Wrap the supplied HTML around each matched elements. For example, with HTML\n     {@code \u003cp\u003e\u003cb\u003eThis\u003c/b\u003e is \u003cb\u003eJsoup\u003c/b\u003e\u003c/p\u003e},\n     \u003ccode\u003edoc.select(\"b\").wrap(\"\u0026lt;i\u0026gt;\u0026lt;/i\u0026gt;\");\u003c/code\u003e\n     becomes {@code \u003cp\u003e\u003ci\u003e\u003cb\u003eThis\u003c/b\u003e\u003c/i\u003e is \u003ci\u003e\u003cb\u003ejsoup\u003c/b\u003e\u003c/i\u003e\u003c/p\u003e}\n     @param html HTML to wrap around each element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this (for chaining)\n     @see Element#wrap\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 32)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.unwrap()",
      "begin_line": 349,
      "end_line": 354,
      "comment": "\n     * Removes the matched elements from the DOM, and moves their children up into their parents. This has the effect of\n     * dropping the elements but keeping their children.\n     * \u003cp/\u003e\n     * This is useful for e.g removing unwanted formatting elements but keeping their contents.\n     * \u003cp/\u003e\n     * E.g. with HTML: {@code \u003cdiv\u003e\u003cfont\u003eOne\u003c/font\u003e \u003cfont\u003e\u003ca href\u003d\"/\"\u003eTwo\u003c/a\u003e\u003c/font\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * {@code doc.select(\"font\").unwrap();}\u003cbr/\u003e\n     * HTML \u003d {@code \u003cdiv\u003eOne \u003ca href\u003d\"/\"\u003eTwo\u003c/a\u003e\u003c/div\u003e}\n     *\n     * @return this (for chaining)\n     * @see Node#unwrap\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.empty()",
      "begin_line": 367,
      "end_line": 372,
      "comment": "\n     * Empty (remove all child nodes from) each matched element. This is similar to setting the inner HTML of each\n     * element to nothing.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv\u003e\u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e\u003c/p\u003e \u003cp\u003enow\u003c/p\u003e\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003edoc.select(\"p\").empty();\u003c/code\u003e\u003cbr\u003e\n     * HTML \u003d {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e \u003cp\u003e\u003c/p\u003e\u003c/div\u003e}\n     * @return this, for chaining\n     * @see Element#empty()\n     * @see #remove()\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove()",
      "begin_line": 386,
      "end_line": 391,
      "comment": "\n     * Remove each matched element from the DOM. This is similar to setting the outer HTML of each element to nothing.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv\u003e\u003cp\u003eHello\u003c/p\u003e \u003cp\u003ethere\u003c/p\u003e \u003cimg /\u003e\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003edoc.select(\"p\").remove();\u003c/code\u003e\u003cbr\u003e\n     * HTML \u003d {@code \u003cdiv\u003e \u003cimg /\u003e\u003c/div\u003e}\n     * \u003cp\u003e\n     * Note that this method should not be used to clean user-submitted HTML; rather, use {@link org.jsoup.safety.Cleaner} to clean HTML.\n     * @return this, for chaining\n     * @see Element#empty()\n     * @see #empty()\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.select(java.lang.String)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Find matching elements within this element list.\n     * @param query A {@link Selector} query\n     * @return the filtered list of elements, or an empty list if none match.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.not(java.lang.String)",
      "begin_line": 414,
      "end_line": 417,
      "comment": "\n     * Remove elements from this list that do not match the {@link Selector} query.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv class\u003dlogo\u003eOne\u003c/div\u003e \u003cdiv\u003eTwo\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003eElements divs \u003d doc.select(\"div\").not(\"#logo\");\u003c/code\u003e\u003cbr\u003e\n     * Result: {@code divs: [\u003cdiv\u003eTwo\u003c/div\u003e]}\n     * \u003cp\u003e\n     * @param query the selector query whose results should be removed from these elements\n     * @return a new elements list that contains only the filtered results\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 416,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.eq(int)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Get the \u003ci\u003enth\u003c/i\u003e matched element as an Elements object.\n     * \u003cp\u003e\n     * See also {@link #get(int)} to retrieve an Element.\n     * @param index the (zero-based) index of the element in the list to retain\n     * @return Elements containing only the specified element, or, if that element did not exist, an empty list.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.is(java.lang.String)",
      "begin_line": 435,
      "end_line": 438,
      "comment": "\n     * Test if any of the matched elements match the supplied query.\n     * @param query A selector\n     * @return true if at least one element in the list matches the query.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 42)",
        "(line 437,col 9)-(line 437,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.parents()",
      "begin_line": 444,
      "end_line": 450,
      "comment": "\n     * Get all of the parents and ancestor elements of the matched elements.\n     * @return all of the parents and ancestor elements of the matched elements\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 62)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.first()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     Get the first matched element.\n     @return The first matched element, or \u003ccode\u003enull\u003c/code\u003e if contents is empty;\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.last()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     Get the last matched element.\n     @return The last matched element, or \u003ccode\u003enull\u003c/code\u003e if contents is empty.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 474,
      "end_line": 481,
      "comment": "\n     * Perform a depth-first traversal on each of the selected elements.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 38)",
        "(line 476,col 9)-(line 476,col 65)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.size()",
      "begin_line": 484,
      "end_line": 484,
      "comment": " implements List\u003cElement\u003e delegates:",
      "child_ranges": [
        "(line 484,col 24)-(line 484,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.isEmpty()",
      "begin_line": 486,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 486,col 31)-(line 486,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.contains(java.lang.Object)",
      "begin_line": 488,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 488,col 40)-(line 488,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.iterator()",
      "begin_line": 490,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 490,col 42)-(line 490,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toArray()",
      "begin_line": 492,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 492,col 32)-(line 492,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toArray(T[])",
      "begin_line": 494,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 494,col 36)-(line 494,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.add(org.jsoup.nodes.Element)",
      "begin_line": 496,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 496,col 42)-(line 496,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove(java.lang.Object)",
      "begin_line": 498,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 498,col 38)-(line 498,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 500,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 500,col 50)-(line 500,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addAll(java.util.Collection\u003c? extends org.jsoup.nodes.Element\u003e)",
      "begin_line": 502,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 502,col 61)-(line 502,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addAll(int, java.util.Collection\u003c? extends org.jsoup.nodes.Element\u003e)",
      "begin_line": 504,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 504,col 72)-(line 504,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 506,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 506,col 48)-(line 506,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 508,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 508,col 48)-(line 508,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.clear()",
      "begin_line": 510,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 510,col 26)-(line 510,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.equals(java.lang.Object)",
      "begin_line": 512,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 512,col 38)-(line 512,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hashCode()",
      "begin_line": 514,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 514,col 28)-(line 514,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.get(int)",
      "begin_line": 516,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 516,col 36)-(line 516,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.set(int, org.jsoup.nodes.Element)",
      "begin_line": 518,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 518,col 53)-(line 518,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.add(int, org.jsoup.nodes.Element)",
      "begin_line": 520,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 520,col 50)-(line 520,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove(int)",
      "begin_line": 522,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 522,col 39)-(line 522,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.indexOf(java.lang.Object)",
      "begin_line": 524,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 524,col 35)-(line 524,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.lastIndexOf(java.lang.Object)",
      "begin_line": 526,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 526,col 39)-(line 526,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.listIterator()",
      "begin_line": 528,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 528,col 50)-(line 528,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.listIterator(int)",
      "begin_line": 530,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 530,col 59)-(line 530,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.subList(int, int)",
      "begin_line": 532,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 532,col 63)-(line 532,col 106)"
      ]
    }
  ]
}