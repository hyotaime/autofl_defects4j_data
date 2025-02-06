{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 284,
      "comment": "\n CharacterReader consumes tokens off a string. To replace the old TokenQueue.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.lang.String)",
      "begin_line": 18,
      "end_line": 22,
      "comment": "",
      "child_ranges": [
        "(line 19,col 9)-(line 19,col 32)",
        "(line 20,col 9)-(line 20,col 41)",
        "(line 21,col 9)-(line 21,col 40)"
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
        "(line 33,col 9)-(line 33,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 48)",
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
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(char)",
      "begin_line": 67,
      "end_line": 74,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input char\n     * @param c scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence)",
      "begin_line": 82,
      "end_line": 98,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input sequence\n     *\n     * @param seq scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)",
        "(line 102,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 111,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 38)",
        "(line 113,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 122,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 24)",
        "(line 125,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 57)",
        "(line 138,col 9)-(line 138,col 21)",
        "(line 139,col 9)-(line 139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 142,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)",
        "(line 144,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 155,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 24)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 175,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 24)",
        "(line 177,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 187,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 24)",
        "(line 189,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 204,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)",
        "(line 206,col 9)-(line 207,col 25)",
        "(line 209,col 9)-(line 211,col 29)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 215,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 38)",
        "(line 217,col 9)-(line 218,col 25)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 229,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 231,col 25)",
        "(line 233,col 9)-(line 233,col 28)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 241,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 243,col 25)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 245,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 248,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 28)",
        "(line 252,col 9)-(line 252,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 264,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 56)",
        "(line 276,col 9)-(line 276,col 56)",
        "(line 277,col 9)-(line 277,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 52)"
      ]
    }
  ]
}