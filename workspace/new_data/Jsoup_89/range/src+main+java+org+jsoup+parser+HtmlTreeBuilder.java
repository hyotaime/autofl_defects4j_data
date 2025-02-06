{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 25,
      "end_line": 733,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TagsSearchInScope"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " tag searches. must be sorted, used in inSorted. MUST update HtmlTreeBuilderTest if more arrays are added."
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchList"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchButton"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchTableScope"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSelectScope"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchEndTags"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSpecial"
      ],
      "begin_line": 33,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MaxScopeSearchDepth"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " prevents the parser bogging down in exceptionally broken pages"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "emptyEnd"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " reused empty end tag"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.defaultSettings()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 63,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 54)",
        "(line 68,col 9)-(line 68,col 45)",
        "(line 69,col 9)-(line 69,col 29)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 27)",
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 47)",
        "(line 75,col 9)-(line 75,col 51)",
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 77,col 26)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 82,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 74)",
        "(line 86,col 9)-(line 86,col 33)",
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 88,col 28)",
        "(line 90,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 20)",
        "(line 127,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 133,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)",
        "(line 141,col 9)-(line 141,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 176,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 178,col 19)",
        "(line 180,col 9)-(line 180,col 42)",
        "(line 181,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 194,col 142)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 197,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 133)",
        "(line 209,col 9)-(line 209,col 19)",
        "(line 210,col 9)-(line 210,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertStartTag(java.lang.String)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 79)",
        "(line 215,col 9)-(line 215,col 19)",
        "(line 216,col 9)-(line 216,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 23)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 224,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 57)",
        "(line 226,col 9)-(line 226,col 68)",
        "(line 227,col 9)-(line 227,col 23)",
        "(line 228,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 239,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 57)",
        "(line 241,col 9)-(line 241,col 76)",
        "(line 242,col 9)-(line 242,col 27)",
        "(line 243,col 9)-(line 243,col 23)",
        "(line 244,col 9)-(line 245,col 26)",
        "(line 246,col 9)-(line 246,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 62)",
        "(line 251,col 9)-(line 251,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 254,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 24)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 258,col 53)",
        "(line 260,col 9)-(line 265,col 38)",
        "(line 266,col 9)-(line 266,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 269,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 276,col 47)",
        "(line 279,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 32)",
        "(line 287,col 9)-(line 287,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 302,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 312,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 322,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 333,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 343,
      "end_line": 350,
      "comment": " elnames is sorted, comes from Constants",
      "child_ranges": [
        "(line 344,col 9)-(line 349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 352,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 375,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 385,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 27)",
        "(line 387,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 396,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 41)",
        "(line 398,col 9)-(line 398,col 33)",
        "(line 399,col 9)-(line 399,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 406,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 39)",
        "(line 408,col 9)-(line 408,col 33)",
        "(line 409,col 9)-(line 409,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 412,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 29)",
        "(line 414,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "specificScopeTarget"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 44)",
        "(line 466,col 9)-(line 466,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 469,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 43)",
        "(line 472,col 9)-(line 472,col 88)",
        "(line 475,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 488,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 496,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 514,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 49)",
        "(line 524,col 9)-(line 524,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 568,
      "end_line": 572,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 578,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 38)",
        "(line 582,col 9)-(line 582,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement()",
      "begin_line": 589,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 45)",
        "(line 591,col 9)-(line 594,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 598,
      "end_line": 614,
      "comment": " active formatting elements",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 24)",
        "(line 600,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 616,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 620,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 624,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 47)",
        "(line 626,col 9)-(line 627,col 19)",
        "(line 629,col 9)-(line 629,col 29)",
        "(line 630,col 9)-(line 630,col 45)",
        "(line 631,col 9)-(line 631,col 27)",
        "(line 632,col 9)-(line 632,col 29)",
        "(line 633,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 662,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 670,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 677,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 680,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 684,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 699,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 703,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 29)",
        "(line 705,col 9)-(line 705,col 50)",
        "(line 706,col 9)-(line 706,col 42)",
        "(line 707,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 722,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 725,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 731,col 20)"
      ]
    }
  ]
}