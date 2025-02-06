{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/select/Elements.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Elements",
      "is_interface": false,
      "parent_types": [
        "java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e"
      ],
      "begin_line": 23,
      "end_line": 643,
      "comment": "\n A list of {@link Element}s, with methods that act on every element in the list.\n \u003cp\u003e\n To get an {@code Elements} object, use the {@link Element#select(String)} method.\n \u003c/p\u003e\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements()",
      "begin_line": 24,
      "end_line": 25,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(int)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(java.util.List\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(org.jsoup.nodes.Element...)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 6)-(line 40,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.clone()",
      "begin_line": 47,
      "end_line": 55,
      "comment": "\n     * Creates a deep copy of these elements.\n     * @return a deep copy\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 46)",
        "(line 51,col 9)-(line 52,col 27)",
        "(line 54,col 6)-(line 54,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.attr(java.lang.String)",
      "begin_line": 65,
      "end_line": 71,
      "comment": "\n     Get an attribute value from the first matched element that has the attribute.\n     @param attributeKey The attribute key.\n     @return The attribute value from the first matched element that has the attribute.. If no elements were matched (isEmpty() \u003d\u003d true),\n     or if the no elements have the attribute, returns empty string.\n     @see #hasAttr(String)\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasAttr(java.lang.String)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     Checks if any of the matched elements have this attribute defined.\n     @param attributeKey attribute key\n     @return true if any of the elements have the attribute; false if none do.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.eachAttr(java.lang.String)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\n     * Get the attribute value for each of the matched elements. If an element does not have this attribute, no value is\n     * included in the result set for that element.\n     * @param attributeKey the attribute name to return values for. You can add the {@code abs:} prefix to the key to\n     * get absolute URLs from relative URLs, e.g.: {@code doc.select(\"a\").eachAttr(\"abs:href\")} .\n     * @return a list of each element\u0027s attribute value for the attribute\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 53)",
        "(line 95,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.attr(java.lang.String, java.lang.String)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Set an attribute on all matched elements.\n     * @param attributeKey attribute key\n     * @param attributeValue attribute value\n     * @return this\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeAttr(java.lang.String)",
      "begin_line": 120,
      "end_line": 125,
      "comment": "\n     * Remove an attribute from every matched element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addClass(java.lang.String)",
      "begin_line": 132,
      "end_line": 137,
      "comment": "\n     Add the class name to every matched element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeClass(java.lang.String)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     Remove the class name from every matched element\u0027s {@code class} attribute, if present.\n     @param className class name to remove\n     @return this\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toggleClass(java.lang.String)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     Toggle the class name on every matched element\u0027s {@code class} attribute.\n     @param className class name to add if missing, or remove if present, from every element.\n     @return this\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasClass(java.lang.String)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\n     Determine if any of the matched elements have this class name set in their {@code class} attribute.\n     @param className class name to check for\n     @return true if any do, false if none do\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.val()",
      "begin_line": 181,
      "end_line": 186,
      "comment": "\n     * Get the form element\u0027s value of the first matched element.\n     * @return The form element\u0027s value, or empty if not set.\n     * @see Element#val()\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 185,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.val(java.lang.String)",
      "begin_line": 193,
      "end_line": 197,
      "comment": "\n     * Set the form element\u0027s value in each of the matched elements.\n     * @param value The value to set into each matched element\n     * @return this (for chaining)\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 195,col 31)",
        "(line 196,col 9)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.text()",
      "begin_line": 208,
      "end_line": 216,
      "comment": "\n     * Get the combined text of all the matched elements.\n     * \u003cp\u003e\n     * Note that it is possible to get repeats if the matched elements contain both parent elements and their own\n     * children, as the Element.text() method returns the combined text of a parent and all its children.\n     * @return string of all text: unescaped and no HTML.\n     * @see Element#text()\n     * @see #eachText()\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 54)",
        "(line 210,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasText()",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     Test if any matched Element has any text content, that is not just whitespace.\n     @return true if any element has non-blank text content.\n     @see Element#hasText()\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.eachText()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\n     * Get the text content of each of the matched elements. If an element has no text, then it is not included in the\n     * result.\n     * @return A list of each matched element\u0027s text content.\n     * @see Element#text()\n     * @see Element#hasText()\n     * @see #text()\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 58)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.html()",
      "begin_line": 254,
      "end_line": 262,
      "comment": "\n     * Get the combined inner HTML of all matched elements.\n     * @return string of all element\u0027s inner HTML.\n     * @see #text()\n     * @see #outerHtml()\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 54)",
        "(line 256,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.outerHtml()",
      "begin_line": 270,
      "end_line": 278,
      "comment": "\n     * Get the combined outer HTML of all matched elements.\n     * @return string of all element\u0027s outer HTML.\n     * @see #text()\n     * @see #html()\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 54)",
        "(line 272,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toString()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * Get the combined outer HTML of all matched elements. Alias of {@link #outerHtml()}.\n     * @return string of all element\u0027s outer HTML.\n     * @see #text()\n     * @see #html()\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.tagName(java.lang.String)",
      "begin_line": 298,
      "end_line": 303,
      "comment": "\n     * Update the tag name of each matched element. For example, to change each {@code \u003ci\u003e} to a {@code \u003cem\u003e}, do\n     * {@code doc.select(\"i\").tagName(\"em\");}\n     * @param tagName the new tag name\n     * @return this, for chaining\n     * @see Element#tagName(String)\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.html(java.lang.String)",
      "begin_line": 311,
      "end_line": 316,
      "comment": "\n     * Set the inner HTML of each matched element.\n     * @param html HTML to parse and set into each matched element.\n     * @return this, for chaining\n     * @see Element#html(String)\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prepend(java.lang.String)",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\n     * Add the supplied HTML to the start of each matched element\u0027s inner HTML.\n     * @param html HTML to add inside each element, before the existing HTML\n     * @return this, for chaining\n     * @see Element#prepend(String)\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.append(java.lang.String)",
      "begin_line": 337,
      "end_line": 342,
      "comment": "\n     * Add the supplied HTML to the end of each matched element\u0027s inner HTML.\n     * @param html HTML to add inside each element, after the existing HTML\n     * @return this, for chaining\n     * @see Element#append(String)\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.before(java.lang.String)",
      "begin_line": 350,
      "end_line": 355,
      "comment": "\n     * Insert the supplied HTML before each matched element\u0027s outer HTML.\n     * @param html HTML to insert before each element\n     * @return this, for chaining\n     * @see Element#before(String)\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.after(java.lang.String)",
      "begin_line": 363,
      "end_line": 368,
      "comment": "\n     * Insert the supplied HTML after each matched element\u0027s outer HTML.\n     * @param html HTML to insert after each element\n     * @return this, for chaining\n     * @see Element#after(String)\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.wrap(java.lang.String)",
      "begin_line": 379,
      "end_line": 385,
      "comment": "\n     Wrap the supplied HTML around each matched elements. For example, with HTML\n     {@code \u003cp\u003e\u003cb\u003eThis\u003c/b\u003e is \u003cb\u003eJsoup\u003c/b\u003e\u003c/p\u003e},\n     \u003ccode\u003edoc.select(\"b\").wrap(\"\u0026lt;i\u0026gt;\u0026lt;/i\u0026gt;\");\u003c/code\u003e\n     becomes {@code \u003cp\u003e\u003ci\u003e\u003cb\u003eThis\u003c/b\u003e\u003c/i\u003e is \u003ci\u003e\u003cb\u003ejsoup\u003c/b\u003e\u003c/i\u003e\u003c/p\u003e}\n     @param html HTML to wrap around each element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this (for chaining)\n     @see Element#wrap\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 32)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.unwrap()",
      "begin_line": 401,
      "end_line": 406,
      "comment": "\n     * Removes the matched elements from the DOM, and moves their children up into their parents. This has the effect of\n     * dropping the elements but keeping their children.\n     * \u003cp\u003e\n     * This is useful for e.g removing unwanted formatting elements but keeping their contents.\n     * \u003c/p\u003e\n     * \n     * E.g. with HTML: \u003cp\u003e{@code \u003cdiv\u003e\u003cfont\u003eOne\u003c/font\u003e \u003cfont\u003e\u003ca href\u003d\"/\"\u003eTwo\u003c/a\u003e\u003c/font\u003e\u003c/div\u003e}\u003c/p\u003e\n     * \u003cp\u003e{@code doc.select(\"font\").unwrap();}\u003c/p\u003e\n     * \u003cp\u003eHTML \u003d {@code \u003cdiv\u003eOne \u003ca href\u003d\"/\"\u003eTwo\u003c/a\u003e\u003c/div\u003e}\u003c/p\u003e\n     *\n     * @return this (for chaining)\n     * @see Node#unwrap\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.empty()",
      "begin_line": 419,
      "end_line": 424,
      "comment": "\n     * Empty (remove all child nodes from) each matched element. This is similar to setting the inner HTML of each\n     * element to nothing.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv\u003e\u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e\u003c/p\u003e \u003cp\u003enow\u003c/p\u003e\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003edoc.select(\"p\").empty();\u003c/code\u003e\u003cbr\u003e\n     * HTML \u003d {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e \u003cp\u003e\u003c/p\u003e\u003c/div\u003e}\n     * @return this, for chaining\n     * @see Element#empty()\n     * @see #remove()\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove()",
      "begin_line": 438,
      "end_line": 443,
      "comment": "\n     * Remove each matched element from the DOM. This is similar to setting the outer HTML of each element to nothing.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv\u003e\u003cp\u003eHello\u003c/p\u003e \u003cp\u003ethere\u003c/p\u003e \u003cimg /\u003e\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003edoc.select(\"p\").remove();\u003c/code\u003e\u003cbr\u003e\n     * HTML \u003d {@code \u003cdiv\u003e \u003cimg /\u003e\u003c/div\u003e}\n     * \u003cp\u003e\n     * Note that this method should not be used to clean user-submitted HTML; rather, use {@link org.jsoup.safety.Cleaner} to clean HTML.\n     * @return this, for chaining\n     * @see Element#empty()\n     * @see #empty()\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.select(java.lang.String)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * Find matching elements within this element list.\n     * @param query A {@link Selector} query\n     * @return the filtered list of elements, or an empty list if none match.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.not(java.lang.String)",
      "begin_line": 466,
      "end_line": 469,
      "comment": "\n     * Remove elements from this list that match the {@link Selector} query.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv class\u003dlogo\u003eOne\u003c/div\u003e \u003cdiv\u003eTwo\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003eElements divs \u003d doc.select(\"div\").not(\".logo\");\u003c/code\u003e\u003cbr\u003e\n     * Result: {@code divs: [\u003cdiv\u003eTwo\u003c/div\u003e]}\n     * \u003cp\u003e\n     * @param query the selector query whose results should be removed from these elements\n     * @return a new elements list that contains only the filtered results\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 52)",
        "(line 468,col 9)-(line 468,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.eq(int)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Get the \u003ci\u003enth\u003c/i\u003e matched element as an Elements object.\n     * \u003cp\u003e\n     * See also {@link #get(int)} to retrieve an Element.\n     * @param index the (zero-based) index of the element in the list to retain\n     * @return Elements containing only the specified element, or, if that element did not exist, an empty list.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.is(java.lang.String)",
      "begin_line": 487,
      "end_line": 494,
      "comment": "\n     * Test if any of the matched elements match the supplied query.\n     * @param query A selector\n     * @return true if at least one element in the list matches the query.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 50)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.next()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * Get the immediate next element sibling of each element in this list.\n     * @return next element siblings.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.next(java.lang.String)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * Get the immediate next element sibling of each element in this list, filtered by the query.\n     * @param query CSS query to match siblings against\n     * @return next element siblings.\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.nextAll()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Get each of the following element siblings of each element in this list.\n     * @return all following element siblings.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.nextAll(java.lang.String)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Get each of the following element siblings of each element in this list, that match the query.\n     * @param query CSS query to match siblings against\n     * @return all following element siblings.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prev()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Get the immediate previous element sibling of each element in this list.\n     * @return previous element siblings.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prev(java.lang.String)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Get the immediate previous element sibling of each element in this list, filtered by the query.\n     * @param query CSS query to match siblings against\n     * @return previous element siblings.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prevAll()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Get each of the previous element siblings of each element in this list.\n     * @return all previous element siblings.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prevAll(java.lang.String)",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * Get each of the previous element siblings of each element in this list, that match the query.\n     * @param query CSS query to match siblings against\n     * @return all previous element siblings.\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.siblings(java.lang.String, boolean, boolean)",
      "begin_line": 564,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 38)",
        "(line 566,col 9)-(line 566,col 72)",
        "(line 567,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.parents()",
      "begin_line": 585,
      "end_line": 591,
      "comment": "\n     * Get all of the parents and ancestor elements of the matched elements.\n     * @return all of the parents and ancestor elements of the matched elements\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 55)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.first()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n     Get the first matched element.\n     @return The first matched element, or \u003ccode\u003enull\u003c/code\u003e if contents is empty.\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.last()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     Get the last matched element.\n     @return The last matched element, or \u003ccode\u003enull\u003c/code\u003e if contents is empty.\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 615,
      "end_line": 618,
      "comment": "\n     * Perform a depth-first traversal on each of the selected elements.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 50)",
        "(line 617,col 9)-(line 617,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.filter(org.jsoup.select.NodeFilter)",
      "begin_line": 625,
      "end_line": 628,
      "comment": "\n     * Perform a depth-first filtering on each of the selected elements.\n     * @param nodeFilter the filter callbacks to perform on each node\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 47)",
        "(line 627,col 9)-(line 627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.forms()",
      "begin_line": 635,
      "end_line": 641,
      "comment": "\n     * Get the {@link FormElement} forms from the selected elements, if any.\n     * @return a list of {@link FormElement}s pulled from the matched elements. The list will be empty if the elements contain\n     * no forms.\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 57)",
        "(line 637,col 9)-(line 639,col 44)",
        "(line 640,col 9)-(line 640,col 21)"
      ]
    }
  ]
}