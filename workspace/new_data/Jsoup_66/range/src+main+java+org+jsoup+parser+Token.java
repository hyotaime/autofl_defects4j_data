{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 375,
      "comment": "\n * Parse tokens for the Tokeniser.\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Token()",
      "begin_line": 14,
      "end_line": 15,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.tokenType()",
      "begin_line": 17,
      "end_line": 19,
      "comment": "",
      "child_ranges": [
        "(line 18,col 9)-(line 18,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.reset()",
      "begin_line": 25,
      "end_line": 25,
      "comment": "\n     * Reset the data represent by this token, for reuse. Prevents the need to create transfer objects for every\n     * piece of data, which immediately get GCed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.reset(java.lang.StringBuilder)",
      "begin_line": 27,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 30,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Doctype",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 33,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pubSysKey"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "publicIdentifier"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "systemIdentifier"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forceQuirks"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Doctype.Doctype()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.reset()",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 24)",
        "(line 47,col 13)-(line 47,col 29)",
        "(line 48,col 13)-(line 48,col 36)",
        "(line 49,col 13)-(line 49,col 36)",
        "(line 50,col 13)-(line 50,col 32)",
        "(line 51,col 13)-(line 51,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getName()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getPubSysKey()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getPublicIdentifier()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getSystemIdentifier()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.isForceQuirks()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 75,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normalName"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " lc version of tag name, for case insensitive tree build"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeName"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " attribute names are generally caught in one hop, not accumulated"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeValue"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " but values are accumulated, from e.g. \u0026 in hrefs"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeValueS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " try to get attr vals in one shot, vs Builder"
    },
    {
      "type": "field",
      "varNames": [
        "hasEmptyAttributeValue"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " distinguish boolean attribute from empty string value"
    },
    {
      "type": "field",
      "varNames": [
        "hasPendingAttributeValue"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " start tags get attributes on construction. End tags get attributes on first new attribute (but only for parser convenience, not used)."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.reset()",
      "begin_line": 86,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 27)",
        "(line 89,col 13)-(line 89,col 30)",
        "(line 90,col 13)-(line 90,col 40)",
        "(line 91,col 13)-(line 91,col 41)",
        "(line 92,col 13)-(line 92,col 42)",
        "(line 93,col 13)-(line 93,col 43)",
        "(line 94,col 13)-(line 94,col 45)",
        "(line 95,col 13)-(line 95,col 32)",
        "(line 96,col 13)-(line 96,col 30)",
        "(line 97,col 13)-(line 97,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.newAttribute()",
      "begin_line": 100,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 102,col 46)",
        "(line 104,col 13)-(line 117,col 13)",
        "(line 118,col 13)-(line 118,col 40)",
        "(line 119,col 13)-(line 119,col 43)",
        "(line 120,col 13)-(line 120,col 45)",
        "(line 121,col 13)-(line 121,col 41)",
        "(line 122,col 13)-(line 122,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.finaliseTag()",
      "begin_line": 125,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 130,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 71)",
        "(line 135,col 13)-(line 135,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.normalName()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name(java.lang.String)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 27)",
        "(line 144,col 13)-(line 144,col 41)",
        "(line 145,col 13)-(line 145,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.isSelfClosing()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.getAttributes()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(java.lang.String)",
      "begin_line": 158,
      "end_line": 161,
      "comment": " these appenders are rarely hit in not null state-- caused by null chars.",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 72)",
        "(line 160,col 13)-(line 160,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(char)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(java.lang.String)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(char)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(java.lang.String)",
      "begin_line": 175,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 35)",
        "(line 177,col 13)-(line 181,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 35)",
        "(line 186,col 13)-(line 186,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char[])",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 35)",
        "(line 191,col 13)-(line 191,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(int[])",
      "begin_line": 194,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 35)",
        "(line 196,col 13)-(line 198,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.setEmptyAttributeValue()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.ensureAttributeValue()",
      "begin_line": 205,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 44)",
        "(line 208,col 13)-(line 211,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StartTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 215,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag()",
      "begin_line": 216,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 20)",
        "(line 218,col 13)-(line 218,col 42)",
        "(line 219,col 13)-(line 219,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.reset()",
      "begin_line": 222,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 26)",
        "(line 225,col 13)-(line 225,col 42)",
        "(line 227,col 13)-(line 227,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.nameAttr(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 32)",
        "(line 232,col 13)-(line 232,col 41)",
        "(line 233,col 13)-(line 233,col 44)",
        "(line 234,col 13)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.toString()",
      "begin_line": 237,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 242,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 246,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 20)",
        "(line 249,col 13)-(line 249,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EndTag.toString()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Comment",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 258,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bogus"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.reset()",
      "begin_line": 262,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 24)",
        "(line 265,col 13)-(line 265,col 26)",
        "(line 266,col 13)-(line 266,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Comment.Comment()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.getData()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.toString()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Character",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 283,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Character.Character()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 20)",
        "(line 288,col 13)-(line 288,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.reset()",
      "begin_line": 291,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 24)",
        "(line 294,col 13)-(line 294,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.data(java.lang.String)",
      "begin_line": 297,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 29)",
        "(line 299,col 13)-(line 299,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.getData()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.toString()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EOF",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 312,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EOF.EOF()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EOF.reset()",
      "begin_line": 317,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 13)-(line 319,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isDoctype()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asDoctype()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isStartTag()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asStartTag()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEndTag()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asEndTag()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isComment()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asComment()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isCharacter()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asCharacter()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEOF()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 37)"
      ]
    }
  ]
}