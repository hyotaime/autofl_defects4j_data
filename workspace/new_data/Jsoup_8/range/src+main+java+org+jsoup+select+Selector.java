{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/select/Selector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Selector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 399,
      "comment": "\n CSS-like element selector, that finds elements matching a query.\n\n \u003ch2\u003eSelector syntax\u003c/h2\u003e\n A selector is a chain of simple selectors, seperated by combinators. Selectors are case insensitive (including against\n elements, attributes, and attribute values).\n \u003cp/\u003e\n The universal selector (*) is implicit when no element selector is supplied (i.e. {@code *.header} and {@code .header}\n is equivalent).\n\n \u003ctable\u003e\n  \u003ctr\u003e\u003cth\u003ePattern\u003c/th\u003e\u003cth\u003eMatches\u003c/th\u003e\u003cth\u003eExample\u003c/th\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e*\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eany element\u003c/td\u003e\u003ctd\u003e\u003ccode\u003e*\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003etag\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with the given tag name\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003ens|E\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements of type E in the namespace \u003ci\u003ens\u003c/i\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003efb|name\u003c/code\u003e finds \u003ccode\u003e\u0026lt;fb:name\u003e\u003c/code\u003e elements\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e#id\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with attribute ID of \"id\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv#wrap\u003c/code\u003e, \u003ccode\u003e#logo\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e.class\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with a class name of \"class\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv.left\u003c/code\u003e, \u003ccode\u003e.result\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\" (with any value)\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href]\u003c/code\u003e, \u003ccode\u003e[title]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[^attrPrefix]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute name starting with \"attrPrefix\". Use to find elements with HTML5 datasets\u003c/td\u003e\u003ctd\u003e\u003ccode\u003e[^data-]\u003c/code\u003e, \u003ccode\u003ediv[^data-]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr\u003dval]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value equal to \"val\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eimg[width\u003d500]\u003c/code\u003e, \u003ccode\u003ea[rel\u003dnofollow]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr^\u003dvalPrefix]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value starting with \"valPrefix\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href^\u003dhttp:]\u003c/code\u003e\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr$\u003dvalSuffix]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value ending with \"valSuffix\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eimg[src$\u003d.png]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr*\u003dvalContaining]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value containing \"valContaining\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href*\u003d/search/]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr~\u003d\u003cem\u003eregex\u003c/em\u003e]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value matching the regular expression\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eimg[src~\u003d(?i)\\\\.(png|jpe?g)]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003c/td\u003e\u003ctd\u003eThe above may be combined in any order\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv.header[title]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ctd colspan\u003d\"3\"\u003e\u003ch3\u003eCombinators\u003c/h3\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F element descended from an E element\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv a\u003c/code\u003e, \u003ccode\u003e.logo h1\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE \u003e F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F direct child of E\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eol \u003e li\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE + F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F element immediately preceded by sibling E\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eli + li\u003c/code\u003e, \u003ccode\u003ediv.head + div\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE ~ F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F element preceded by sibling E\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eh1 ~ p\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE, F, G\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eall matching elements E, F, or G\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href], div, h3\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ctd colspan\u003d\"3\"\u003e\u003ch3\u003ePseudo selectors\u003c/h3\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:lt(\u003cem\u003en\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose sibling index is less than \u003cem\u003en\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:lt(3)\u003c/code\u003e finds the first 2 cells of each row\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:gt(\u003cem\u003en\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose sibling index is greater than \u003cem\u003en\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:gt(1)\u003c/code\u003e finds cells after skipping the first two\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:eq(\u003cem\u003en\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose sibling index is equal to \u003cem\u003en\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:eq(0)\u003c/code\u003e finds the first cell of each row\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:has(\u003cem\u003eselector\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that contains at least one element matching the \u003cem\u003eselector\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv:has(p)\u003c/code\u003e finds divs that contain p elements \u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:contains(\u003cem\u003etext\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that contains the specified text. The search is case insensitive. The text may appear in the found element, or any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ep:contains(jsoup)\u003c/code\u003e finds p elements containing the text \"jsoup\".\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:matches(\u003cem\u003eregex\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose text matches the specified regular expression. The text may appear in the found element, or any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:matches(\\\\d+)\u003c/code\u003e finds table cells containing digits. \u003ccode\u003ediv:matches((?i)login)\u003c/code\u003e finds divs containing the text, case insensitively.\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:containsOwn(\u003cem\u003etext\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that directly contains the specified text. The search is case insensitive. The text must appear in the found element, not any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ep:containsOwn(jsoup)\u003c/code\u003e finds p elements with own text \"jsoup\".\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:matchesOwn(\u003cem\u003eregex\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose own text matches the specified regular expression. The text must appear in the found element, not any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:matchesOwn(\\\\d+)\u003c/code\u003e finds table cells directly containing digits. \u003ccode\u003ediv:matchesOwn((?i)login)\u003c/code\u003e finds divs containing the text, case insensitively.\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003c/td\u003e\u003ctd\u003eThe above may be combined in any order and with other selectors\u003c/td\u003e\u003ctd\u003e\u003ccode\u003e.light:contains(name):eq(0)\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003c/table\u003e\n\n @see Element#select(String)\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " LHS for unique and ordered elements"
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Selector.Selector(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 64,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 68,col 31)",
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 27)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.select(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     Find elements matching selector.\n     @param query CSS selector\n     @param root root element to descend into\n     @return matching elements, empty if not\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.select(java.lang.String, java.lang.Iterable\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 92,
      "end_line": 101,
      "comment": "\n     Find elements matching selector.\n     @param query CSS selector\n     @param roots root elements to descend into\n     @return matching elements, empty if not\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 32)",
        "(line 95,col 9)-(line 95,col 71)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.select()",
      "begin_line": 103,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)",
        "(line 106,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.combinator(java.lang.String)",
      "begin_line": 134,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 136,col 55)",
        "(line 138,col 9)-(line 138,col 24)",
        "(line 139,col 9)-(line 148,col 81)",
        "(line 150,col 9)-(line 150,col 25)",
        "(line 150,col 27)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.findElements()",
      "begin_line": 153,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.addElements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.intersectElements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byId()",
      "begin_line": 193,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 30)",
        "(line 197,col 9)-(line 197,col 48)",
        "(line 198,col 9)-(line 198,col 39)",
        "(line 199,col 9)-(line 200,col 28)",
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byClass()",
      "begin_line": 204,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 53)",
        "(line 206,col 9)-(line 206,col 37)",
        "(line 208,col 9)-(line 208,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byTag()",
      "begin_line": 211,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 53)",
        "(line 213,col 9)-(line 213,col 35)",
        "(line 216,col 9)-(line 217,col 48)",
        "(line 218,col 9)-(line 218,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byAttribute()",
      "begin_line": 221,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 67)",
        "(line 223,col 9)-(line 223,col 72)",
        "(line 224,col 9)-(line 224,col 31)",
        "(line 225,col 9)-(line 225,col 31)",
        "(line 227,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.allElements()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.indexLessThan()",
      "begin_line": 258,
      "end_line": 260,
      "comment": " pseudo selectors :lt, :gt, :eq",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.indexGreaterThan()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.indexEquals()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.consumeIndex()",
      "begin_line": 270,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 47)",
        "(line 272,col 9)-(line 272,col 79)",
        "(line 273,col 9)-(line 273,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.has()",
      "begin_line": 277,
      "end_line": 283,
      "comment": " pseudo selector :has(el)",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 27)",
        "(line 279,col 9)-(line 279,col 52)",
        "(line 280,col 9)-(line 280,col 76)",
        "(line 282,col 9)-(line 282,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.contains(boolean)",
      "begin_line": 286,
      "end_line": 292,
      "comment": " pseudo selector :contains(text), containsOwn(text)",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 75)",
        "(line 289,col 9)-(line 289,col 81)",
        "(line 291,col 9)-(line 291,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.matches(boolean)",
      "begin_line": 295,
      "end_line": 301,
      "comment": " :matches(regex), matchesOwn(regex)",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 52)",
        "(line 297,col 9)-(line 297,col 50)",
        "(line 298,col 9)-(line 298,col 76)",
        "(line 300,col 9)-(line 300,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForChildren(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 304,
      "end_line": 315,
      "comment": " direct child descendants",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 43)",
        "(line 306,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForDescendants(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 319,
      "end_line": 330,
      "comment": " or the original element; so check that parent is not child",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 43)",
        "(line 321,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForParentsOfDescendants(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 333,
      "end_line": 343,
      "comment": " implements :has(el). Finds elements that contain the matched elements",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 50)",
        "(line 335,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForAdjacentSiblings(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 346,
      "end_line": 360,
      "comment": " adjacent siblings",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 43)",
        "(line 348,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForGeneralSiblings(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 363,
      "end_line": 378,
      "comment": " preceeding siblings",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 41)",
        "(line 365,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForSelf(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 381,
      "end_line": 392,
      "comment": " union of both sets, for e.class type selectors",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 43)",
        "(line 383,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelectorParseException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalStateException"
      ],
      "begin_line": 394,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Selector.SelectorParseException.SelectorParseException(java.lang.String, java.lang.Object...)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 13)-(line 396,col 46)"
      ]
    }
  ]
}