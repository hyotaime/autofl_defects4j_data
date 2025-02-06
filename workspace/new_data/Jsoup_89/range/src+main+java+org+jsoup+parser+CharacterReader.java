{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 515,
      "comment": "\n CharacterReader consumes tokens off a string. Used internally by jsoup. API subject to changes.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStringCacheLen"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxBufferLen"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " visible for testing"
    },
    {
      "type": "field",
      "varNames": [
        "readAheadLimit"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charBuf"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufLength"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufSplitPoint"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufPos"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readerPos"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufMark"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringCache"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " holds reused strings in this doc, to lessen garbage"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.io.Reader, int)",
      "begin_line": 30,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 32)",
        "(line 32,col 9)-(line 32,col 47)",
        "(line 33,col 9)-(line 33,col 23)",
        "(line 34,col 9)-(line 34,col 66)",
        "(line 35,col 9)-(line 35,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.io.Reader)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.bufferUp()",
      "begin_line": 46,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 31)",
        "(line 48,col 9)-(line 49,col 19)",
        "(line 51,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Gets the current cursor position in the content.\n     * @return current position\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Tests if all the content has been read.\n     * @return true if nothing left to read.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmptyNoBufferUp()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Get the char at the current position.\n     * @return char\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)",
        "(line 95,col 9)-(line 95,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 19)",
        "(line 100,col 9)-(line 100,col 63)",
        "(line 101,col 9)-(line 101,col 17)",
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 105,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 91)",
        "(line 109,col 9)-(line 109,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Moves the current position by one.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 119,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 26)",
        "(line 122,col 9)-(line 122,col 19)",
        "(line 123,col 9)-(line 123,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 126,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 76)",
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(char)",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input char\n     * @param c scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 19)",
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence)",
      "begin_line": 154,
      "end_line": 171,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input sequence\n     *\n     * @param seq scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 19)",
        "(line 157,col 9)-(line 157,col 39)",
        "(line 158,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 178,
      "end_line": 187,
      "comment": "\n     * Reads characters up to the specific char.\n     * @param c the delimiter\n     * @return the chars read\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 36)",
        "(line 180,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 205,
      "end_line": 224,
      "comment": "\n     * Read characters until the first of any delimiters is found.\n     * @param chars delimiters to scan for\n     * @return characters read up to the matched delimiter.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 19)",
        "(line 207,col 9)-(line 207,col 25)",
        "(line 208,col 9)-(line 208,col 30)",
        "(line 209,col 9)-(line 209,col 40)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 211,col 41)",
        "(line 212,col 9)-(line 212,col 14)",
        "(line 214,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 21)",
        "(line 223,col 9)-(line 223,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAnySorted(char...)",
      "begin_line": 226,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 19)",
        "(line 228,col 9)-(line 228,col 25)",
        "(line 229,col 9)-(line 229,col 30)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 231,col 35)",
        "(line 233,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 21)",
        "(line 239,col 9)-(line 239,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeData()",
      "begin_line": 242,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 246,col 30)",
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 35)",
        "(line 250,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 21)",
        "(line 261,col 9)-(line 261,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTagName()",
      "begin_line": 264,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 19)",
        "(line 268,col 9)-(line 268,col 25)",
        "(line 269,col 9)-(line 269,col 30)",
        "(line 270,col 9)-(line 270,col 40)",
        "(line 271,col 9)-(line 271,col 35)",
        "(line 273,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 290,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 293,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 19)",
        "(line 295,col 9)-(line 295,col 84)",
        "(line 296,col 9)-(line 296,col 27)",
        "(line 297,col 9)-(line 297,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 300,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 19)",
        "(line 302,col 9)-(line 302,col 27)",
        "(line 303,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 314,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 19)",
        "(line 316,col 9)-(line 316,col 27)",
        "(line 317,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 335,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 19)",
        "(line 337,col 9)-(line 337,col 27)",
        "(line 338,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 348,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 19)",
        "(line 350,col 9)-(line 350,col 27)",
        "(line 351,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 366,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 19)",
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 370,col 25)",
        "(line 372,col 9)-(line 374,col 29)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 378,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 19)",
        "(line 380,col 9)-(line 380,col 38)",
        "(line 381,col 9)-(line 382,col 25)",
        "(line 384,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 393,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 395,col 25)",
        "(line 397,col 9)-(line 397,col 19)",
        "(line 398,col 9)-(line 398,col 33)",
        "(line 399,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAnySorted(char[])",
      "begin_line": 406,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 19)",
        "(line 408,col 9)-(line 408,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 411,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 413,col 25)",
        "(line 414,col 9)-(line 414,col 33)",
        "(line 415,col 9)-(line 415,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 418,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 420,col 25)",
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 425,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 19)",
        "(line 427,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 435,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 444,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 56)",
        "(line 447,col 9)-(line 447,col 56)",
        "(line 448,col 9)-(line 448,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 451,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.cacheString(char[], java.lang.String[], int, int)",
      "begin_line": 463,
      "end_line": 493,
      "comment": "\n     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.\n     * \u003cp /\u003e\n     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.\n     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of\n     * some more duplicates.\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 466,col 53)",
        "(line 467,col 9)-(line 468,col 22)",
        "(line 471,col 9)-(line 471,col 21)",
        "(line 472,col 9)-(line 472,col 27)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 478,col 9)-(line 478,col 56)",
        "(line 479,col 9)-(line 479,col 43)",
        "(line 481,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(char[], int, int, java.lang.String)",
      "begin_line": 498,
      "end_line": 509,
      "comment": "\n     * Check if the value of the provided range equals the string.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(int, int, java.lang.String)",
      "begin_line": 512,
      "end_line": 514,
      "comment": " just used for testing",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 58)"
      ]
    }
  ]
}