{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 473,
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
      "comment": ""
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
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 19)",
        "(line 50,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Gets the current cursor position in the content.\n     * @return current position\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Tests if all the content has been read.\n     * @return true if nothing left to read.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Get the char at the current position.\n     * @return char\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 19)",
        "(line 86,col 9)-(line 86,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 89,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)",
        "(line 91,col 9)-(line 91,col 53)",
        "(line 92,col 9)-(line 92,col 17)",
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Moves the current position by one.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(char)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input char\n     * @param c scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 19)",
        "(line 123,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence)",
      "begin_line": 136,
      "end_line": 153,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input sequence\n     *\n     * @param seq scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 19)",
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 160,
      "end_line": 169,
      "comment": "\n     * Reads characters up to the specific char.\n     * @param c the delimiter\n     * @return the chars read\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 171,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 38)",
        "(line 173,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 187,
      "end_line": 202,
      "comment": "\n     * Read characters until the first of any delimiters is found.\n     * @param chars delimiters to scan for\n     * @return characters read up to the matched delimiter.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 19)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 40)",
        "(line 191,col 9)-(line 191,col 35)",
        "(line 193,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAnySorted(char...)",
      "begin_line": 204,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 19)",
        "(line 206,col 9)-(line 206,col 33)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 208,col 35)",
        "(line 210,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeData()",
      "begin_line": 219,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 19)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 223,col 40)",
        "(line 224,col 9)-(line 224,col 35)",
        "(line 226,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTagName()",
      "begin_line": 236,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 19)",
        "(line 239,col 9)-(line 239,col 33)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 243,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 253,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 19)",
        "(line 255,col 9)-(line 255,col 84)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 260,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 19)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 274,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 19)",
        "(line 276,col 9)-(line 276,col 27)",
        "(line 277,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 295,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 19)",
        "(line 297,col 9)-(line 297,col 27)",
        "(line 298,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 308,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 19)",
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 321,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 326,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 19)",
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 330,col 25)",
        "(line 332,col 9)-(line 334,col 29)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 338,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 19)",
        "(line 340,col 9)-(line 340,col 38)",
        "(line 341,col 9)-(line 342,col 25)",
        "(line 344,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 353,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 355,col 25)",
        "(line 357,col 9)-(line 357,col 19)",
        "(line 358,col 9)-(line 358,col 33)",
        "(line 359,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAnySorted(char[])",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 19)",
        "(line 368,col 9)-(line 368,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 371,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 373,col 25)",
        "(line 374,col 9)-(line 374,col 33)",
        "(line 375,col 9)-(line 375,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 378,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 380,col 25)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 382,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 385,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 19)",
        "(line 387,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 395,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 404,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 56)",
        "(line 407,col 9)-(line 407,col 56)",
        "(line 408,col 9)-(line 408,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 411,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.cacheString(char[], java.lang.String[], int, int)",
      "begin_line": 423,
      "end_line": 451,
      "comment": "\n     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.\n     * \u003cp /\u003e\n     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.\n     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of\n     * some more duplicates.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 426,col 53)",
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 27)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 436,col 9)-(line 436,col 56)",
        "(line 437,col 9)-(line 437,col 43)",
        "(line 439,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(char[], int, int, java.lang.String)",
      "begin_line": 456,
      "end_line": 467,
      "comment": "\n     * Check if the value of the provided range equals the string.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(int, int, java.lang.String)",
      "begin_line": 470,
      "end_line": 472,
      "comment": " just used for testing",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 58)"
      ]
    }
  ]
}