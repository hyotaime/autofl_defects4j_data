{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 22,
      "end_line": 725,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TagsSearchInScope"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " tag searches"
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchList"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchButton"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchTableScope"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSelectScope"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchEndTags"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSpecial"
      ],
      "begin_line": 30,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "emptyEnd"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " reused empty end tag"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.HtmlTreeBuilder()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.defaultSettings()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 60,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 64)",
        "(line 65,col 9)-(line 65,col 45)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 30)",
        "(line 71,col 9)-(line 71,col 47)",
        "(line 72,col 9)-(line 72,col 51)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 26)",
        "(line 75,col 9)-(line 75,col 30)",
        "(line 76,col 9)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 79,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 45)",
        "(line 82,col 9)-(line 82,col 84)",
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 84,col 31)",
        "(line 85,col 9)-(line 85,col 28)",
        "(line 87,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 20)",
        "(line 124,col 9)-(line 127,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 29)",
        "(line 133,col 9)-(line 133,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 138,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 173,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 175,col 19)",
        "(line 177,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 191,col 130)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 194,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 133)",
        "(line 206,col 9)-(line 206,col 19)",
        "(line 207,col 9)-(line 207,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertStartTag(java.lang.String)",
      "begin_line": 210,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 79)",
        "(line 212,col 9)-(line 212,col 19)",
        "(line 213,col 9)-(line 213,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 23)",
        "(line 218,col 9)-(line 218,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 221,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 57)",
        "(line 223,col 9)-(line 223,col 68)",
        "(line 224,col 9)-(line 224,col 23)",
        "(line 225,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 236,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 57)",
        "(line 238,col 9)-(line 238,col 76)",
        "(line 239,col 9)-(line 239,col 27)",
        "(line 240,col 9)-(line 240,col 23)",
        "(line 241,col 9)-(line 242,col 26)",
        "(line 243,col 9)-(line 243,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 62)",
        "(line 248,col 9)-(line 248,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 18)",
        "(line 254,col 9)-(line 254,col 52)",
        "(line 255,col 9)-(line 258,col 58)",
        "(line 259,col 9)-(line 259,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 262,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 269,col 47)",
        "(line 272,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 32)",
        "(line 280,col 9)-(line 280,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 295,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 305,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 315,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 326,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 335,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 344,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 367,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 377,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 27)",
        "(line 379,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 388,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 41)",
        "(line 390,col 9)-(line 390,col 33)",
        "(line 391,col 9)-(line 391,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 398,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 39)",
        "(line 400,col 9)-(line 400,col 33)",
        "(line 401,col 9)-(line 401,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 404,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 29)",
        "(line 406,col 9)-(line 450,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "specificScopeTarget"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 456,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 44)",
        "(line 458,col 9)-(line 458,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 461,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 49)",
        "(line 473,col 9)-(line 473,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 476,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 480,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 484,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 494,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 498,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 502,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 49)",
        "(line 512,col 9)-(line 512,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 523,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 560,
      "end_line": 564,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 563,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 570,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 36)",
        "(line 574,col 9)-(line 574,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement()",
      "begin_line": 581,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 45)",
        "(line 583,col 9)-(line 586,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 590,
      "end_line": 606,
      "comment": " active formatting elements",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 608,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 616,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 47)",
        "(line 618,col 9)-(line 619,col 19)",
        "(line 621,col 9)-(line 621,col 29)",
        "(line 622,col 9)-(line 622,col 45)",
        "(line 623,col 9)-(line 623,col 27)",
        "(line 624,col 9)-(line 624,col 29)",
        "(line 625,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 651,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 654,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 662,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 676,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 687,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 691,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 695,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 29)",
        "(line 697,col 9)-(line 697,col 50)",
        "(line 698,col 9)-(line 698,col 42)",
        "(line 699,col 9)-(line 707,col 9)",
        "(line 709,col 9)-(line 714,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 717,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 719,col 9)-(line 723,col 20)"
      ]
    }
  ]
}