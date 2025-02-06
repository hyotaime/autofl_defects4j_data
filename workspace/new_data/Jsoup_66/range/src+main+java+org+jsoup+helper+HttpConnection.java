{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/helper/HttpConnection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpConnection",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection"
      ],
      "begin_line": 56,
      "end_line": 1204,
      "comment": "\n * Implementation of {@link Connection}.\n * @see org.jsoup.Jsoup#connect(String)\n "
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_ENCODING"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UA"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n     * Many users would get caught by not setting a user-agent and therefore getting different responses on their desktop\n     * vs in jsoup, which would otherwise default to {@code Java}. So by default, use a desktop UA.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_AGENT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_TYPE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPART_FORM_DATA"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FORM_URL_ENCODED"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HTTP_TEMP_REDIR"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " http/1.1 temporary redirect, not in Java\u0027s set."
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.lang.String)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 46)",
        "(line 72,col 9)-(line 72,col 21)",
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.net.URL)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 46)",
        "(line 78,col 9)-(line 78,col 21)",
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.lang.String)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * Encodes the input URL into a safe ASCII URL string\n     * @param url unescaped URL\n     * @return escaped URL\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.net.URL)",
      "begin_line": 96,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeMimeName(java.lang.String)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 110,col 24)",
        "(line 111,col 9)-(line 111,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.HttpConnection()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 28)",
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.net.URL)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 21)",
        "(line 124,col 9)-(line 124,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.lang.String)",
      "begin_line": 127,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.proxy(java.net.Proxy)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)",
        "(line 139,col 9)-(line 139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.proxy(java.lang.String, int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 30)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.userAgent(java.lang.String)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 67)",
        "(line 149,col 9)-(line 149,col 42)",
        "(line 150,col 9)-(line 150,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.timeout(int)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 28)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.maxBodySize(int)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 31)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.followRedirects(boolean)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.referrer(java.lang.String)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 64)",
        "(line 170,col 9)-(line 170,col 40)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.method(org.jsoup.Connection.Method)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreHttpErrors(boolean)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 180,col 3)-(line 180,col 41)",
        "(line 181,col 3)-(line 181,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreContentType(boolean)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 49)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.validateTLSCertificates(boolean)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 43)",
        "(line 191,col 9)-(line 191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 44)",
        "(line 196,col 9)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 60)",
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 204,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 60)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String...)",
      "begin_line": 212,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 75)",
        "(line 214,col 9)-(line 214,col 97)",
        "(line 215,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e)",
      "begin_line": 225,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 67)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String)",
      "begin_line": 233,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.requestBody(java.lang.String)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 30)",
        "(line 244,col 9)-(line 244,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.header(java.lang.String, java.lang.String)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 32)",
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.headers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 252,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 65)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 32)",
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 265,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.parser(org.jsoup.parser.Parser)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 27)",
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.get()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 31)",
        "(line 280,col 9)-(line 280,col 18)",
        "(line 281,col 9)-(line 281,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.post()",
      "begin_line": 284,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 32)",
        "(line 286,col 9)-(line 286,col 18)",
        "(line 287,col 9)-(line 287,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.execute()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 292,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request(org.jsoup.Connection.Request)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 22)",
        "(line 301,col 9)-(line 301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response(org.jsoup.Connection.Response)",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 23)",
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.postDataCharset(java.lang.String)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.Base\u003cT\u003e"
      ],
      "begin_line": 318,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headers"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cookies"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Base.Base()",
      "begin_line": 325,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 44)",
        "(line 327,col 13)-(line 327,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url(java.net.URL)",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 58)",
        "(line 336,col 13)-(line 336,col 27)",
        "(line 337,col 13)-(line 337,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 344,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 345,col 13)-(line 345,col 64)",
        "(line 346,col 13)-(line 346,col 33)",
        "(line 347,col 13)-(line 347,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String)",
      "begin_line": 350,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 67)",
        "(line 352,col 13)-(line 352,col 64)",
        "(line 353,col 13)-(line 356,col 13)",
        "(line 358,col 13)-(line 358,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.addHeader(java.lang.String, java.lang.String)",
      "begin_line": 361,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 36)",
        "(line 364,col 13)-(line 364,col 47)",
        "(line 366,col 13)-(line 366,col 48)",
        "(line 367,col 13)-(line 370,col 13)",
        "(line 371,col 13)-(line 371,col 49)",
        "(line 373,col 13)-(line 373,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers(java.lang.String)",
      "begin_line": 376,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 36)",
        "(line 379,col 13)-(line 379,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.fixHeaderEncoding(java.lang.String)",
      "begin_line": 382,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 383,col 13)-(line 391,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.looksLikeUtf8(byte[])",
      "begin_line": 394,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 22)",
        "(line 397,col 13)-(line 400,col 13)",
        "(line 402,col 13)-(line 402,col 20)",
        "(line 403,col 13)-(line 427,col 13)",
        "(line 428,col 13)-(line 428,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 431,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 69)",
        "(line 433,col 13)-(line 433,col 31)",
        "(line 434,col 13)-(line 434,col 35)",
        "(line 435,col 13)-(line 435,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeader(java.lang.String)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 69)",
        "(line 440,col 13)-(line 440,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeaderWithValue(java.lang.String, java.lang.String)",
      "begin_line": 446,
      "end_line": 455,
      "comment": "\n         * Test if the request has a header with this value (case insensitive).\n         ",
      "child_ranges": [
        "(line 447,col 13)-(line 447,col 36)",
        "(line 448,col 13)-(line 448,col 37)",
        "(line 449,col 13)-(line 449,col 48)",
        "(line 450,col 13)-(line 453,col 13)",
        "(line 454,col 13)-(line 454,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeHeader(java.lang.String)",
      "begin_line": 457,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 458,col 13)-(line 458,col 69)",
        "(line 459,col 13)-(line 459,col 70)",
        "(line 460,col 13)-(line 461,col 47)",
        "(line 462,col 13)-(line 462,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers()",
      "begin_line": 465,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 84)",
        "(line 467,col 13)-(line 472,col 13)",
        "(line 473,col 13)-(line 473,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.multiHeaders()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.getHeadersCaseInsensitive(java.lang.String)",
      "begin_line": 481,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 35)",
        "(line 484,col 13)-(line 487,col 13)",
        "(line 489,col 13)-(line 489,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.scanHeaders(java.lang.String)",
      "begin_line": 492,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 493,col 13)-(line 493,col 40)",
        "(line 494,col 13)-(line 497,col 13)",
        "(line 498,col 13)-(line 498,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String)",
      "begin_line": 501,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 502,col 13)-(line 502,col 69)",
        "(line 503,col 13)-(line 503,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 506,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 507,col 13)-(line 507,col 69)",
        "(line 508,col 13)-(line 508,col 69)",
        "(line 509,col 13)-(line 509,col 37)",
        "(line 510,col 13)-(line 510,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasCookie(java.lang.String)",
      "begin_line": 513,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 69)",
        "(line 515,col 13)-(line 515,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeCookie(java.lang.String)",
      "begin_line": 518,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 519,col 13)-(line 519,col 69)",
        "(line 520,col 13)-(line 520,col 33)",
        "(line 521,col 13)-(line 521,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookies()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Request",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.helper.HttpConnection.Base\u003corg.jsoup.Connection.Request\u003e",
        "org.jsoup.Connection.Request"
      ],
      "begin_line": 529,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 530,
      "end_line": 530,
      "comment": " nullable"
    },
    {
      "type": "field",
      "varNames": [
        "timeoutMilliseconds"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxBodySizeBytes"
      ],
      "begin_line": 532,
      "end_line": 532,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "followRedirects"
      ],
      "begin_line": 533,
      "end_line": 533,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "body"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHttpErrors"
      ],
      "begin_line": 536,
      "end_line": 536,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreContentType"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserDefined"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": " called parser(...) vs initialized in ctor"
    },
    {
      "type": "field",
      "varNames": [
        "validateTSLCertificates"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "postDataCharset"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Request.Request()",
      "begin_line": 543,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 544,col 13)-(line 544,col 40)",
        "(line 545,col 13)-(line 545,col 43)",
        "(line 546,col 13)-(line 546,col 35)",
        "(line 547,col 13)-(line 547,col 37)",
        "(line 548,col 13)-(line 548,col 32)",
        "(line 549,col 13)-(line 549,col 49)",
        "(line 550,col 13)-(line 550,col 46)",
        "(line 551,col 13)-(line 551,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 13)-(line 555,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy(java.net.Proxy)",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 559,col 13)-(line 559,col 31)",
        "(line 560,col 13)-(line 560,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy(java.lang.String, int)",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 100)",
        "(line 565,col 13)-(line 565,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout(int)",
      "begin_line": 572,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 573,col 13)-(line 573,col 97)",
        "(line 574,col 13)-(line 574,col 41)",
        "(line 575,col 13)-(line 575,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize()",
      "begin_line": 578,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 13)-(line 579,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize(int)",
      "begin_line": 582,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 83)",
        "(line 584,col 13)-(line 584,col 37)",
        "(line 585,col 13)-(line 585,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 13)-(line 589,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects(boolean)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 593,col 13)-(line 593,col 51)",
        "(line 594,col 13)-(line 594,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.validateTLSCertificates()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.validateTLSCertificates(boolean)",
      "begin_line": 605,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 13)-(line 606,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 609,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 610,col 13)-(line 610,col 53)",
        "(line 611,col 13)-(line 611,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType(boolean)",
      "begin_line": 618,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 619,col 13)-(line 619,col 55)",
        "(line 620,col 13)-(line 620,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 623,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 624,col 13)-(line 624,col 65)",
        "(line 625,col 13)-(line 625,col 29)",
        "(line 626,col 13)-(line 626,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data()",
      "begin_line": 629,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 13)-(line 630,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.requestBody(java.lang.String)",
      "begin_line": 633,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 634,col 13)-(line 634,col 29)",
        "(line 635,col 13)-(line 635,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.requestBody()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 639,col 13)-(line 639,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 642,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 643,col 13)-(line 643,col 33)",
        "(line 644,col 13)-(line 644,col 33)",
        "(line 645,col 13)-(line 645,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser()",
      "begin_line": 648,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 649,col 13)-(line 649,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset(java.lang.String)",
      "begin_line": 652,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 653,col 13)-(line 653,col 66)",
        "(line 654,col 13)-(line 654,col 94)",
        "(line 655,col 13)-(line 655,col 43)",
        "(line 656,col 13)-(line 656,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset()",
      "begin_line": 659,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 660,col 13)-(line 660,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Response",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.helper.HttpConnection.Base\u003corg.jsoup.Connection.Response\u003e",
        "org.jsoup.Connection.Response"
      ],
      "begin_line": 664,
      "end_line": 1136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_REDIRECTS"
      ],
      "begin_line": 665,
      "end_line": 665,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sslSocketFactory"
      ],
      "begin_line": 666,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCATION"
      ],
      "begin_line": 667,
      "end_line": 667,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusCode"
      ],
      "begin_line": 668,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusMessage"
      ],
      "begin_line": 669,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteData"
      ],
      "begin_line": 670,
      "end_line": 670,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyStream"
      ],
      "begin_line": 671,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 673,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "executed"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputStreamRead"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numRedirects"
      ],
      "begin_line": 676,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 677,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlContentTypeRxp"
      ],
      "begin_line": 682,
      "end_line": 682,
      "comment": "\n         * Matches XML content types (like text/xml, application/xhtml+xml;charset\u003dUTF8, etc)\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response()",
      "begin_line": 684,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 13)-(line 685,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response(org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 688,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 689,col 13)-(line 689,col 20)",
        "(line 690,col 13)-(line 694,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request)",
      "begin_line": 697,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 698,col 13)-(line 698,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 701,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 702,col 13)-(line 702,col 62)",
        "(line 703,col 13)-(line 703,col 54)",
        "(line 704,col 13)-(line 705,col 89)",
        "(line 706,col 13)-(line 706,col 65)",
        "(line 707,col 13)-(line 707,col 69)",
        "(line 708,col 13)-(line 709,col 110)",
        "(line 712,col 13)-(line 712,col 39)",
        "(line 713,col 13)-(line 716,col 57)",
        "(line 718,col 13)-(line 718,col 59)",
        "(line 719,col 13)-(line 719,col 25)",
        "(line 720,col 13)-(line 786,col 13)",
        "(line 788,col 13)-(line 788,col 32)",
        "(line 789,col 13)-(line 789,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusCode()",
      "begin_line": 792,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 793,col 13)-(line 793,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusMessage()",
      "begin_line": 796,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 797,col 13)-(line 797,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset()",
      "begin_line": 800,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 801,col 13)-(line 801,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset(java.lang.String)",
      "begin_line": 804,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 805,col 13)-(line 805,col 35)",
        "(line 806,col 13)-(line 806,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.contentType()",
      "begin_line": 809,
      "end_line": 811,
      "comment": "",
      "child_ranges": [
        "(line 810,col 13)-(line 810,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.parse()",
      "begin_line": 813,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 127)",
        "(line 815,col 13)-(line 818,col 13)",
        "(line 819,col 13)-(line 819,col 103)",
        "(line 820,col 13)-(line 820,col 110)",
        "(line 821,col 13)-(line 821,col 60)",
        "(line 823,col 13)-(line 823,col 35)",
        "(line 824,col 13)-(line 824,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.prepareByteData()",
      "begin_line": 827,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 828,col 13)-(line 828,col 132)",
        "(line 829,col 13)-(line 836,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.body()",
      "begin_line": 839,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 840,col 13)-(line 840,col 30)",
        "(line 842,col 13)-(line 842,col 24)",
        "(line 843,col 13)-(line 846,col 76)",
        "(line 847,col 13)-(line 847,col 30)",
        "(line 848,col 13)-(line 848,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyAsBytes()",
      "begin_line": 851,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 852,col 13)-(line 852,col 30)",
        "(line 853,col 13)-(line 853,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bufferUp()",
      "begin_line": 856,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 858,col 13)-(line 858,col 30)",
        "(line 859,col 13)-(line 859,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyStream()",
      "begin_line": 862,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 864,col 13)-(line 864,col 132)",
        "(line 865,col 13)-(line 865,col 79)",
        "(line 866,col 13)-(line 866,col 35)",
        "(line 867,col 13)-(line 867,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createConnection(org.jsoup.Connection.Request)",
      "begin_line": 871,
      "end_line": 901,
      "comment": " set up connection defaults, and details from request",
      "child_ranges": [
        "(line 872,col 13)-(line 876,col 14)",
        "(line 878,col 13)-(line 878,col 55)",
        "(line 879,col 13)-(line 879,col 51)",
        "(line 880,col 13)-(line 880,col 50)",
        "(line 881,col 13)-(line 881,col 47)",
        "(line 883,col 13)-(line 889,col 13)",
        "(line 891,col 13)-(line 892,col 39)",
        "(line 893,col 13)-(line 894,col 79)",
        "(line 895,col 13)-(line 899,col 13)",
        "(line 900,col 13)-(line 900,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getInsecureVerifier()",
      "begin_line": 910,
      "end_line": 916,
      "comment": "\n         * Instantiate Hostname Verifier that does nothing.\n         * This is used for connections with disabled SSL certificates validation.\n         *\n         *\n         * @return Hostname Verifier that does nothing and accepts all hostnames\n         ",
      "child_ranges": [
        "(line 911,col 13)-(line 915,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-af2f2de2-0d8c-4544-a5bb-6a9dba70fe00.verify(java.lang.String, javax.net.ssl.SSLSession)",
      "begin_line": 912,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 913,col 21)-(line 913,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.initUnSecureTSL()",
      "begin_line": 927,
      "end_line": 955,
      "comment": "\n         * Initialise Trust manager that does not validate certificate chains and\n         * add it to current SSLContext.\n         * \u003cp/\u003e\n         * please not that this method will only perform action if sslSocketFactory is not yet\n         * instantiated.\n         *\n         * @throws IOException on SSL init errors\n         ",
      "child_ranges": [
        "(line 928,col 13)-(line 953,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-5c021b37-dea5-4dbf-a956-c0adcd6b0f3a.checkClientTrusted(java.security.cert.X509Certificate[], java.lang.String)",
      "begin_line": 932,
      "end_line": 933,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-06e2428c-aa7f-47ec-8b46-a998ca5b2592.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String)",
      "begin_line": 935,
      "end_line": 936,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-b0650ef2-60bc-4d76-b86f-e0aa436e8a08.getAcceptedIssuers()",
      "begin_line": 938,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 939,col 25)-(line 939,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setupFromConnection(java.net.HttpURLConnection, org.jsoup.Connection.Response)",
      "begin_line": 958,
      "end_line": 975,
      "comment": " set up url, method, header, cookies",
      "child_ranges": [
        "(line 959,col 13)-(line 959,col 61)",
        "(line 960,col 13)-(line 960,col 32)",
        "(line 961,col 13)-(line 961,col 48)",
        "(line 962,col 13)-(line 962,col 54)",
        "(line 963,col 13)-(line 963,col 48)",
        "(line 965,col 13)-(line 965,col 73)",
        "(line 966,col 13)-(line 966,col 47)",
        "(line 969,col 13)-(line 974,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createHeaderMap(java.net.HttpURLConnection)",
      "begin_line": 977,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 979,col 13)-(line 979,col 86)",
        "(line 980,col 13)-(line 980,col 22)",
        "(line 981,col 13)-(line 997,col 13)",
        "(line 998,col 13)-(line 998,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.processResponseHeaders(java.util.Map\u003cjava.lang.String, java.util.List\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 1001,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 13)-(line 1024,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setOutputContentType(org.jsoup.Connection.Request)",
      "begin_line": 1027,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 13)-(line 1028,col 32)",
        "(line 1029,col 13)-(line 1038,col 13)",
        "(line 1039,col 13)-(line 1039,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.writePost(org.jsoup.Connection.Request, java.io.OutputStream, java.lang.String)",
      "begin_line": 1042,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 13)-(line 1043,col 66)",
        "(line 1044,col 13)-(line 1044,col 117)",
        "(line 1046,col 13)-(line 1088,col 13)",
        "(line 1089,col 13)-(line 1089,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getRequestCookieString(org.jsoup.Connection.Request)",
      "begin_line": 1092,
      "end_line": 1104,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 13)-(line 1093,col 58)",
        "(line 1094,col 13)-(line 1094,col 33)",
        "(line 1095,col 13)-(line 1102,col 13)",
        "(line 1103,col 13)-(line 1103,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(org.jsoup.Connection.Request)",
      "begin_line": 1107,
      "end_line": 1135,
      "comment": " for get url reqs, serialise the data map into the url",
      "child_ranges": [
        "(line 1108,col 13)-(line 1108,col 31)",
        "(line 1109,col 13)-(line 1109,col 59)",
        "(line 1110,col 13)-(line 1110,col 33)",
        "(line 1112,col 13)-(line 1117,col 29)",
        "(line 1118,col 13)-(line 1121,col 13)",
        "(line 1122,col 13)-(line 1132,col 13)",
        "(line 1133,col 13)-(line 1133,col 45)",
        "(line 1134,col 13)-(line 1134,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.needsMultipart(org.jsoup.Connection.Request)",
      "begin_line": 1138,
      "end_line": 1148,
      "comment": "",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 35)",
        "(line 1141,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.KeyVal"
      ],
      "begin_line": 1150,
      "end_line": 1203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 1151,
      "end_line": 1151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 1152,
      "end_line": 1152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 1153,
      "end_line": 1153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String)",
      "begin_line": 1155,
      "end_line": 1157,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 13)-(line 1156,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 1159,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 13)-(line 1160,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.KeyVal()",
      "begin_line": 1163,
      "end_line": 1163,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key(java.lang.String)",
      "begin_line": 1165,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 13)-(line 1166,col 65)",
        "(line 1167,col 13)-(line 1167,col 27)",
        "(line 1168,col 13)-(line 1168,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key()",
      "begin_line": 1171,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 13)-(line 1172,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value(java.lang.String)",
      "begin_line": 1175,
      "end_line": 1179,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 13)-(line 1176,col 67)",
        "(line 1177,col 13)-(line 1177,col 31)",
        "(line 1178,col 13)-(line 1178,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value()",
      "begin_line": 1181,
      "end_line": 1183,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 13)-(line 1182,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream(java.io.InputStream)",
      "begin_line": 1185,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 13)-(line 1186,col 74)",
        "(line 1187,col 13)-(line 1187,col 38)",
        "(line 1188,col 13)-(line 1188,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream()",
      "begin_line": 1191,
      "end_line": 1193,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 13)-(line 1192,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.hasInputStream()",
      "begin_line": 1195,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1196,col 13)-(line 1196,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.toString()",
      "begin_line": 1199,
      "end_line": 1202,
      "comment": "",
      "child_ranges": [
        "(line 1201,col 13)-(line 1201,col 37)"
      ]
    }
  ]
}