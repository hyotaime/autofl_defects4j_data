{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 16,
      "end_line": 672,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.HtmlTreeBuilder()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 45)",
        "(line 37,col 9)-(line 37,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 40,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 45)",
        "(line 43,col 9)-(line 43,col 56)",
        "(line 44,col 9)-(line 44,col 33)",
        "(line 45,col 9)-(line 45,col 31)",
        "(line 46,col 9)-(line 46,col 28)",
        "(line 48,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 20)",
        "(line 75,col 9)-(line 78,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 29)",
        "(line 84,col 9)-(line 84,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)",
        "(line 89,col 9)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 126,col 19)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 142,col 130)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 145,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 93)",
        "(line 155,col 9)-(line 155,col 19)",
        "(line 156,col 9)-(line 156,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(java.lang.String)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 69)",
        "(line 161,col 9)-(line 161,col 19)",
        "(line 162,col 9)-(line 162,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 23)",
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 170,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 172,col 68)",
        "(line 173,col 9)-(line 173,col 23)",
        "(line 174,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 71)",
        "(line 184,col 9)-(line 184,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 187,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 18)",
        "(line 190,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 194,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 197,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 204,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 207,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 210,col 57)",
        "(line 211,col 9)-(line 212,col 52)",
        "(line 213,col 9)-(line 213,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(org.jsoup.helper.DescendableLinkedList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 228,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 58)",
        "(line 230,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 239,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 58)",
        "(line 241,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 250,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 262,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 58)",
        "(line 264,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 275,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 58)",
        "(line 277,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 288,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 58)",
        "(line 290,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 312,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 58)",
        "(line 314,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 323,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 27)",
        "(line 325,col 9)-(line 325,col 58)",
        "(line 326,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 335,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 41)",
        "(line 337,col 9)-(line 337,col 33)",
        "(line 338,col 9)-(line 338,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.LinkedList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 345,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 39)",
        "(line 347,col 9)-(line 347,col 33)",
        "(line 348,col 9)-(line 348,col 24)",
        "(line 349,col 9)-(line 349,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 352,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 29)",
        "(line 354,col 9)-(line 354,col 58)",
        "(line 355,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 403,
      "end_line": 405,
      "comment": " todo: tidy up in specific scope methods",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 407,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 58)",
        "(line 409,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 49)",
        "(line 420,col 9)-(line 420,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 423,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 135)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 431,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 449,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 58)",
        "(line 451,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 49)",
        "(line 460,col 9)-(line 460,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.Element)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003corg.jsoup.parser.Token.Character\u003e)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 508,
      "end_line": 512,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 518,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 36)",
        "(line 522,col 9)-(line 529,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 533,
      "end_line": 550,
      "comment": " active formatting elements",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 24)",
        "(line 535,col 9)-(line 535,col 73)",
        "(line 536,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 552,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 560,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 45)",
        "(line 562,col 9)-(line 563,col 19)",
        "(line 565,col 9)-(line 565,col 53)",
        "(line 566,col 9)-(line 566,col 27)",
        "(line 567,col 9)-(line 567,col 29)",
        "(line 568,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 598,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 607,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 71)",
        "(line 609,col 9)-(line 615,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 622,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 71)",
        "(line 624,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 642,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 36)",
        "(line 644,col 9)-(line 644,col 50)",
        "(line 645,col 9)-(line 645,col 42)",
        "(line 646,col 9)-(line 654,col 9)",
        "(line 656,col 9)-(line 661,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 664,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 670,col 20)"
      ]
    }
  ]
}