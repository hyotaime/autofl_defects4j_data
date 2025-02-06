{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/parsing/JsDocTokenStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsDocTokenStream",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 487,
      "comment": "\n * This class implements the scanner for JsDoc strings.\n *\n * It is heavily based on Rhino\u0027s TokenStream.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF_CHAR"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": "\n   * For chars - because we need something out-of-range\n   * to check.  (And checking EOF by exception is annoying.)\n   * Note distinction from EOF token type!\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.JsDocTokenStream(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.JsDocTokenStream(java.lang.String, int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.JsDocTokenStream(java.lang.String, int, int)",
      "begin_line": 45,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 45)",
        "(line 47,col 5)-(line 47,col 25)",
        "(line 48,col 5)-(line 48,col 37)",
        "(line 49,col 5)-(line 49,col 43)",
        "(line 50,col 5)-(line 50,col 40)",
        "(line 51,col 5)-(line 51,col 29)",
        "(line 52,col 5)-(line 52,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getJsDocToken()",
      "begin_line": 58,
      "end_line": 194,
      "comment": "\n   * Tokenizes JSDoc comments.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 10)",
        "(line 61,col 5)-(line 61,col 24)",
        "(line 62,col 5)-(line 193,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getRemainingJSDocLine()",
      "begin_line": 200,
      "end_line": 224,
      "comment": "\n   * Gets the remaining JSDoc line without the {@link JsDocToken#EOL},\n   * {@link JsDocToken#EOF} or {@link JsDocToken#EOC}.\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 10)",
        "(line 203,col 5)-(line 223,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getLineno()",
      "begin_line": 226,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 226,col 27)-(line 226,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getCharno()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getString()",
      "begin_line": 232,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 232,col 30)-(line 232,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.eof()",
      "begin_line": 234,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 234,col 25)-(line 234,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getStringFromBuffer()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 22)",
        "(line 238,col 5)-(line 238,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.addToString(int)",
      "begin_line": 241,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 28)",
        "(line 243,col 5)-(line 247,col 5)",
        "(line 248,col 5)-(line 248,col 30)",
        "(line 249,col 5)-(line 249,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.ungetChar(int)",
      "begin_line": 252,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 72)",
        "(line 255,col 5)-(line 255,col 35)",
        "(line 256,col 5)-(line 256,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.matchChar(int)",
      "begin_line": 259,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 35)",
        "(line 261,col 5)-(line 267,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isAlpha(int)",
      "begin_line": 270,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 276,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSDocString(int)",
      "begin_line": 279,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 302,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSSpace(int)",
      "begin_line": 309,
      "end_line": 316,
      "comment": " As defined in ECMA.  jsscan.c uses C isspace() (which allows\n   * \\v, I think.)  note that code in getChar() implicitly accepts\n   * \u0027\\r\u0027 \u003d\u003d \\u000D as well.\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 315,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSFormatChar(int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.update()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n   * Allows the JSDocParser to update the character offset\n   * so that getCharno() returns a valid character position.\n   ",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.peekChar()",
      "begin_line": 330,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 22)",
        "(line 332,col 5)-(line 332,col 17)",
        "(line 333,col 5)-(line 333,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getChar()",
      "begin_line": 336,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 344,col 5)",
        "(line 346,col 5)-(line 389,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getCharIgnoreLineEnd()",
      "begin_line": 392,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 393,col 5)-(line 400,col 5)",
        "(line 402,col 5)-(line 435,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.ungetCharIgnoreLineEnd(int)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 35)",
        "(line 440,col 5)-(line 440,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getOffset()",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n   * Returns the offset into the current line.\n   ",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " code."
    },
    {
      "type": "field",
      "varNames": [
        "stringBuffer"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringBufferTop"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ungetBuffer"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Room to backtrace from to \u003c on failed match of the last - in \u003c!--"
    },
    {
      "type": "field",
      "varNames": [
        "ungetCursor"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hitEOF"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineStart"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineEndChar"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineno"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charno"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initCharno"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initLineno"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceString"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceEnd"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceCursor"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": " sliding window of the source stream."
    },
    {
      "type": "field",
      "varNames": [
        "cursor"
      ],
      "begin_line": 482,
      "end_line": 482,
      "comment": " Its value is the index of the next character to be scanned."
    },
    {
      "type": "field",
      "varNames": [
        "tokenBeg"
      ],
      "begin_line": 485,
      "end_line": 485,
      "comment": " Record start and end positions of last scanned token."
    },
    {
      "type": "field",
      "varNames": [
        "tokenEnd"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": ""
    }
  ]
}