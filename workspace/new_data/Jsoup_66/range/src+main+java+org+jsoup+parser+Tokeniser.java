{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/Tokeniser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tokeniser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 280,
      "comment": "\n * Readers the input stream into tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "replacementChar"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": " replaces null character"
    },
    {
      "type": "field",
      "varNames": [
        "notCharRefCharsSorted"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " html input"
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " errors found while tokenising"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " current tokenisation state"
    },
    {
      "type": "field",
      "varNames": [
        "emitPending"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " the token we are about to emit on next read"
    },
    {
      "type": "field",
      "varNames": [
        "isEmitPending"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsString"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " characters pending an emit. Will fall to charsBuilder if more than one"
    },
    {
      "type": "field",
      "varNames": [
        "charsBuilder"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " buffers characters to output as one token, if more than one emit per read"
    },
    {
      "type": "field",
      "varNames": [
        "dataBuffer"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " buffers data looking for \u003c/script\u003e"
    },
    {
      "type": "field",
      "varNames": [
        "tagPending"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " tag we are building up"
    },
    {
      "type": "field",
      "varNames": [
        "startPending"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endPending"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charPending"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doctypePending"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " doctype building up"
    },
    {
      "type": "field",
      "varNames": [
        "commentPending"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " comment building up"
    },
    {
      "type": "field",
      "varNames": [
        "lastStartTag"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " the last start tag emitted, to test appropriate end tag"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tokeniser.Tokeniser(org.jsoup.parser.CharacterReader, org.jsoup.parser.ParseErrorList)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 29)",
        "(line 40,col 9)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.read()",
      "begin_line": 43,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 45,col 37)",
        "(line 48,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(org.jsoup.parser.Token)",
      "begin_line": 63,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 77)",
        "(line 66,col 9)-(line 66,col 28)",
        "(line 67,col 9)-(line 67,col 29)",
        "(line 69,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(java.lang.String)",
      "begin_line": 79,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char[])",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(int[])",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.getState()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.transition(org.jsoup.parser.TokeniserState)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.advanceTransition(org.jsoup.parser.TokeniserState)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 25)",
        "(line 115,col 9)-(line 115,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "codepointHolder"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " holder to not have to keep creating arrays"
    },
    {
      "type": "field",
      "varNames": [
        "multipointHolder"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.consumeCharacterReference(java.lang.Character, boolean)",
      "begin_line": 120,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 122,col 24)",
        "(line 123,col 9)-(line 124,col 24)",
        "(line 125,col 9)-(line 126,col 24)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 129,col 22)",
        "(line 130,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTagPending(boolean)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 71)",
        "(line 191,col 9)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitTagPending()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 33)",
        "(line 196,col 9)-(line 196,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createCommentPending()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitCommentPending()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createDoctypePending()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitDoctypePending()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTempBuffer()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.isAppropriateEndTagToken()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.appropriateEndTagName()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 225,col 24)",
        "(line 226,col 9)-(line 226,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(org.jsoup.parser.TokeniserState)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 231,col 127)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.eofError(org.jsoup.parser.TokeniserState)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 236,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.characterReferenceError(java.lang.String)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 241,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(java.lang.String)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 246,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.currentNodeInHtmlNS()",
      "begin_line": 249,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.unescapeEntities(boolean)",
      "begin_line": 261,
      "end_line": 279,
      "comment": "\n     * Utility method to consume reader and unescape entities found within.\n     * @param inAttribute if the text to be unescaped is in an attribute\n     * @return unescaped string from reader\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 59)",
        "(line 263,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 34)"
      ]
    }
  ]
}