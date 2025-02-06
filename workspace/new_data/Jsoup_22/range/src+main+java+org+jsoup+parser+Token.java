{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/parser/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 252,
      "comment": "\n * Parse tokens for the Tokeniser.\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Token()",
      "begin_line": 13,
      "end_line": 14,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.tokenType()",
      "begin_line": 16,
      "end_line": 18,
      "comment": "",
      "child_ranges": [
        "(line 17,col 9)-(line 17,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Doctype",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 20,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "publicIdentifier"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "systemIdentifier"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forceQuirks"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Doctype.Doctype()",
      "begin_line": 26,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 13)-(line 27,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getName()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 13)-(line 31,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getPublicIdentifier()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 13)-(line 35,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getSystemIdentifier()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 39,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.isForceQuirks()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 43,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 47,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeName"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeValue"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " todo: allow nodes to not have attributes"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.newAttribute()",
      "begin_line": 55,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 61,col 13)",
        "(line 62,col 13)-(line 62,col 40)",
        "(line 63,col 13)-(line 63,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.finaliseTag()",
      "begin_line": 66,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 71,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 52)",
        "(line 76,col 13)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name(java.lang.String)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 27)",
        "(line 81,col 13)-(line 81,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.isSelfClosing()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.getAttributes()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " these appenders are rarely hit in not null state-- caused by null chars.",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(char)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(java.lang.String)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(char)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(java.lang.String)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StartTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 119,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 20)",
        "(line 122,col 13)-(line 122,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag(java.lang.String)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 19)",
        "(line 127,col 13)-(line 127,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 19)",
        "(line 132,col 13)-(line 132,col 32)",
        "(line 133,col 13)-(line 133,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.toString()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 142,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 20)",
        "(line 145,col 13)-(line 145,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag(java.lang.String)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 19)",
        "(line 150,col 13)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EndTag.toString()",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Comment",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 159,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Comment.Comment()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.getData()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.toString()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Character",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 176,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Character.Character(java.lang.String)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 39)",
        "(line 181,col 13)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.getData()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.toString()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EOF",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 194,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EOF.EOF()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isDoctype()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asDoctype()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isStartTag()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asStartTag()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEndTag()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asEndTag()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isComment()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asComment()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isCharacter()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asCharacter()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEOF()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 37)"
      ]
    }
  ]
}