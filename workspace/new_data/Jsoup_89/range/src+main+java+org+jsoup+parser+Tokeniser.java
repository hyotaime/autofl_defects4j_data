{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/Tokeniser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tokeniser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 296,
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
        "win1252ExtensionsStart"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " https://html.spec.whatwg.org/multipage/parsing.html#numeric-character-reference-end-state"
    },
    {
      "type": "field",
      "varNames": [
        "win1252Extensions"
      ],
      "begin_line": 19,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " html input"
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " errors found while tokenising"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " current tokenisation state"
    },
    {
      "type": "field",
      "varNames": [
        "emitPending"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " the token we are about to emit on next read"
    },
    {
      "type": "field",
      "varNames": [
        "isEmitPending"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsString"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " characters pending an emit. Will fall to charsBuilder if more than one"
    },
    {
      "type": "field",
      "varNames": [
        "charsBuilder"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " buffers characters to output as one token, if more than one emit per read"
    },
    {
      "type": "field",
      "varNames": [
        "dataBuffer"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " buffers data looking for \u003c/script\u003e"
    },
    {
      "type": "field",
      "varNames": [
        "tagPending"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " tag we are building up"
    },
    {
      "type": "field",
      "varNames": [
        "startPending"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endPending"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charPending"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doctypePending"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " doctype building up"
    },
    {
      "type": "field",
      "varNames": [
        "commentPending"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " comment building up"
    },
    {
      "type": "field",
      "varNames": [
        "lastStartTag"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the last start tag emitted, to test appropriate end tag"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tokeniser.Tokeniser(org.jsoup.parser.CharacterReader, org.jsoup.parser.ParseErrorList)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 29)",
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.read()",
      "begin_line": 55,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 57,col 37)",
        "(line 60,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(org.jsoup.parser.Token)",
      "begin_line": 75,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 77)",
        "(line 78,col 9)-(line 78,col 28)",
        "(line 79,col 9)-(line 79,col 29)",
        "(line 81,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(java.lang.String)",
      "begin_line": 91,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char[])",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(int[])",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.getState()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.transition(org.jsoup.parser.TokeniserState)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.advanceTransition(org.jsoup.parser.TokeniserState)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)",
        "(line 127,col 9)-(line 127,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "codepointHolder"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " holder to not have to keep creating arrays"
    },
    {
      "type": "field",
      "varNames": [
        "multipointHolder"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.consumeCharacterReference(java.lang.Character, boolean)",
      "begin_line": 132,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 134,col 24)",
        "(line 135,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 138,col 24)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 22)",
        "(line 142,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTagPending(boolean)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 71)",
        "(line 209,col 9)-(line 209,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitTagPending()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 33)",
        "(line 214,col 9)-(line 214,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createCommentPending()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitCommentPending()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createDoctypePending()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitDoctypePending()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTempBuffer()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.isAppropriateEndTagToken()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.appropriateEndTagName()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(org.jsoup.parser.TokeniserState)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 247,col 127)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.eofError(org.jsoup.parser.TokeniserState)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 252,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.characterReferenceError(java.lang.String)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 257,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(java.lang.String)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 262,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.currentNodeInHtmlNS()",
      "begin_line": 265,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.unescapeEntities(boolean)",
      "begin_line": 277,
      "end_line": 295,
      "comment": "\n     * Utility method to consume reader and unescape entities found within.\n     * @param inAttribute if the text to be unescaped is in an attribute\n     * @return unescaped string from reader\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 59)",
        "(line 279,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 50)"
      ]
    }
  ]
}