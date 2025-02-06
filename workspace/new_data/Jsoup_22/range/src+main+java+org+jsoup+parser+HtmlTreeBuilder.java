{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 16,
      "end_line": 671,
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
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 56)",
        "(line 43,col 9)-(line 43,col 33)",
        "(line 44,col 9)-(line 44,col 31)",
        "(line 45,col 9)-(line 45,col 28)",
        "(line 47,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 20)",
        "(line 74,col 9)-(line 77,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 29)",
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 29)",
        "(line 88,col 9)-(line 88,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 123,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 125,col 19)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 141,col 130)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 144,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 93)",
        "(line 154,col 9)-(line 154,col 19)",
        "(line 155,col 9)-(line 155,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(java.lang.String)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 69)",
        "(line 160,col 9)-(line 160,col 19)",
        "(line 161,col 9)-(line 161,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 23)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 47)",
        "(line 171,col 9)-(line 171,col 68)",
        "(line 172,col 9)-(line 172,col 23)",
        "(line 173,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 71)",
        "(line 183,col 9)-(line 183,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 186,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 18)",
        "(line 189,col 9)-(line 192,col 67)",
        "(line 193,col 9)-(line 193,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 196,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 203,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 209,col 57)",
        "(line 210,col 9)-(line 211,col 52)",
        "(line 212,col 9)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(org.jsoup.helper.DescendableLinkedList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 227,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 58)",
        "(line 229,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 238,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 58)",
        "(line 240,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 249,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 58)",
        "(line 251,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 261,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 58)",
        "(line 263,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 274,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 58)",
        "(line 276,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 287,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 58)",
        "(line 289,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 311,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 58)",
        "(line 313,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 322,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 27)",
        "(line 324,col 9)-(line 324,col 58)",
        "(line 325,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 41)",
        "(line 336,col 9)-(line 336,col 33)",
        "(line 337,col 9)-(line 337,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.LinkedList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 344,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 39)",
        "(line 346,col 9)-(line 346,col 33)",
        "(line 347,col 9)-(line 347,col 24)",
        "(line 348,col 9)-(line 348,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 351,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 29)",
        "(line 353,col 9)-(line 353,col 58)",
        "(line 354,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 402,
      "end_line": 404,
      "comment": " todo: tidy up in specific scope methods",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 406,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 58)",
        "(line 408,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 135)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 430,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 448,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 58)",
        "(line 450,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 49)",
        "(line 459,col 9)-(line 459,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.Element)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003corg.jsoup.parser.Token.Character\u003e)",
      "begin_line": 494,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 507,
      "end_line": 511,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 517,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 36)",
        "(line 521,col 9)-(line 528,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 532,
      "end_line": 549,
      "comment": " active formatting elements",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 24)",
        "(line 534,col 9)-(line 534,col 73)",
        "(line 535,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 551,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 559,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 45)",
        "(line 561,col 9)-(line 562,col 19)",
        "(line 564,col 9)-(line 564,col 53)",
        "(line 565,col 9)-(line 565,col 27)",
        "(line 566,col 9)-(line 566,col 29)",
        "(line 567,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 597,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 606,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 71)",
        "(line 608,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 617,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 621,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 71)",
        "(line 623,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 641,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 36)",
        "(line 643,col 9)-(line 643,col 50)",
        "(line 644,col 9)-(line 644,col 42)",
        "(line 645,col 9)-(line 653,col 9)",
        "(line 655,col 9)-(line 660,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 663,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 669,col 20)"
      ]
    }
  ]
}