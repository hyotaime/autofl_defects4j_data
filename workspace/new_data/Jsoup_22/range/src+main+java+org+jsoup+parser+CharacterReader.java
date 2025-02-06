{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 8,
      "end_line": 210,
      "comment": "\n CharacterReader cosumes tokens off a string. To replace the old TokenQueue.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 9,
      "end_line": 9,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.lang.String)",
      "begin_line": 16,
      "end_line": 22,
      "comment": "",
      "child_ranges": [
        "(line 17,col 9)-(line 17,col 32)",
        "(line 18,col 9)-(line 18,col 48)",
        "(line 20,col 9)-(line 20,col 27)",
        "(line 21,col 9)-(line 21,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 24,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 28,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 55)",
        "(line 38,col 9)-(line 38,col 14)",
        "(line 39,col 9)-(line 39,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeAsString()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 62,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 43)",
        "(line 64,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 73,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 45)",
        "(line 75,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 84,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)",
        "(line 87,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 59)",
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 105,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 24)",
        "(line 107,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 118,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)",
        "(line 120,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 130,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 24)",
        "(line 132,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 155,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 25)",
        "(line 159,col 9)-(line 159,col 35)",
        "(line 160,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 167,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 169,col 25)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 176,col 25)",
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 181,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 190,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 202,col 42)",
        "(line 203,col 9)-(line 203,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 36)"
      ]
    }
  ]
}