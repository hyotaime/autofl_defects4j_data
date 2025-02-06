{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/parsing/JsDocTokenStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsDocTokenStream",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 486,
      "comment": "\n * This class implements the scanner for JsDoc strings.\n *\n * It is heavily based on Rhino\u0027s TokenStream.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF_CHAR"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n   * For chars - because we need something out-of-range\n   * to check.  (And checking EOF by exception is annoying.)\n   * Note distinction from EOF token type!\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.JsDocTokenStream(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.JsDocTokenStream(java.lang.String, int)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.JsDocTokenStream(java.lang.String, int, int)",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 45)",
        "(line 46,col 5)-(line 46,col 25)",
        "(line 47,col 5)-(line 47,col 37)",
        "(line 48,col 5)-(line 48,col 43)",
        "(line 49,col 5)-(line 49,col 40)",
        "(line 50,col 5)-(line 50,col 29)",
        "(line 51,col 5)-(line 51,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getJsDocToken()",
      "begin_line": 57,
      "end_line": 193,
      "comment": "\n   * Tokenizes JSDoc comments.\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 10)",
        "(line 60,col 5)-(line 60,col 24)",
        "(line 61,col 5)-(line 192,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getRemainingJSDocLine()",
      "begin_line": 199,
      "end_line": 223,
      "comment": "\n   * Gets the remaining JSDoc line without the {@link JsDocToken#EOL},\n   * {@link JsDocToken#EOF} or {@link JsDocToken#EOC}.\n   ",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 10)",
        "(line 202,col 5)-(line 222,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getLineno()",
      "begin_line": 225,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 225,col 27)-(line 225,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getCharno()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getString()",
      "begin_line": 231,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 231,col 30)-(line 231,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.eof()",
      "begin_line": 233,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 233,col 25)-(line 233,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getStringFromBuffer()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 22)",
        "(line 237,col 5)-(line 237,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.addToString(int)",
      "begin_line": 240,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 28)",
        "(line 242,col 5)-(line 246,col 5)",
        "(line 247,col 5)-(line 247,col 31)",
        "(line 248,col 5)-(line 248,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.ungetChar(int)",
      "begin_line": 251,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 72)",
        "(line 254,col 5)-(line 254,col 35)",
        "(line 255,col 5)-(line 255,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.matchChar(int)",
      "begin_line": 258,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 35)",
        "(line 260,col 5)-(line 266,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isAlpha(int)",
      "begin_line": 269,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 275,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSDocString(int)",
      "begin_line": 278,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 301,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSSpace(int)",
      "begin_line": 308,
      "end_line": 315,
      "comment": " As defined in ECMA.  jsscan.c uses C isspace() (which allows\n   * \\v, I think.)  note that code in getChar() implicitly accepts\n   * \u0027\\r\u0027 \u003d\u003d \\u000D as well.\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 314,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSFormatChar(int)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 318,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.update()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n   * Allows the JSDocParser to update the character offset\n   * so that getCharno() returns a valid character position.\n   ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.peekChar()",
      "begin_line": 329,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 22)",
        "(line 331,col 5)-(line 331,col 17)",
        "(line 332,col 5)-(line 332,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getChar()",
      "begin_line": 335,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 336,col 5)-(line 343,col 5)",
        "(line 345,col 5)-(line 388,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getCharIgnoreLineEnd()",
      "begin_line": 391,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 392,col 5)-(line 399,col 5)",
        "(line 401,col 5)-(line 434,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.ungetCharIgnoreLineEnd(int)",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 35)",
        "(line 439,col 5)-(line 439,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.JsDocTokenStream.getOffset()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n   * Returns the offset into the current line.\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": " code."
    },
    {
      "type": "field",
      "varNames": [
        "stringBuffer"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringBufferTop"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ungetBuffer"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": " Room to backtrace from to \u003c on failed match of the last - in \u003c!--"
    },
    {
      "type": "field",
      "varNames": [
        "ungetCursor"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hitEOF"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineStart"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineEndChar"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineno"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charno"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initCharno"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initLineno"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceString"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceEnd"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceCursor"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": " sliding window of the source stream."
    },
    {
      "type": "field",
      "varNames": [
        "cursor"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": " Its value is the index of the next character to be scanned."
    },
    {
      "type": "field",
      "varNames": [
        "tokenBeg"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": " Record start and end positions of last scanned token."
    },
    {
      "type": "field",
      "varNames": [
        "tokenEnd"
      ],
      "begin_line": 485,
      "end_line": 485,
      "comment": ""
    }
  ]
}