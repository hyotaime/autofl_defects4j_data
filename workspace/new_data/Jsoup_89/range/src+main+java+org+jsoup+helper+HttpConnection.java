{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/helper/HttpConnection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpConnection",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection"
      ],
      "begin_line": 52,
      "end_line": 1192,
      "comment": "\n * Implementation of {@link Connection}.\n * @see org.jsoup.Jsoup#connect(String)\n "
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_ENCODING"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UA"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Many users would get caught by not setting a user-agent and therefore getting different responses on their desktop\n     * vs in jsoup, which would otherwise default to {@code Java}. So by default, use a desktop UA.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_AGENT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_TYPE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPART_FORM_DATA"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FORM_URL_ENCODED"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HTTP_TEMP_REDIR"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " http/1.1 temporary redirect, not in Java\u0027s set."
    },
    {
      "type": "field",
      "varNames": [
        "DefaultUploadType"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.lang.String)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 46)",
        "(line 69,col 9)-(line 69,col 21)",
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.net.URL)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 46)",
        "(line 75,col 9)-(line 75,col 21)",
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.HttpConnection()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.lang.String)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Encodes the input URL into a safe ASCII URL string\n     * @param url unescaped URL\n     * @return escaped URL\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.net.URL)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeMimeName(java.lang.String)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 112,col 24)",
        "(line 113,col 9)-(line 113,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.net.URL)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 21)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.lang.String)",
      "begin_line": 124,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 58)",
        "(line 126,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.proxy(java.net.Proxy)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 25)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.proxy(java.lang.String, int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 30)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.userAgent(java.lang.String)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 67)",
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.timeout(int)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 28)",
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.maxBodySize(int)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 31)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.followRedirects(boolean)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.referrer(java.lang.String)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 64)",
        "(line 167,col 9)-(line 167,col 40)",
        "(line 168,col 9)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.method(org.jsoup.Connection.Method)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreHttpErrors(boolean)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 177,col 3)-(line 177,col 41)",
        "(line 178,col 3)-(line 178,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreContentType(boolean)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 49)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String)",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 44)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.sslSocketFactory(javax.net.ssl.SSLSocketFactory)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 193,col 6)-(line 193,col 44)",
        "(line 194,col 6)-(line 194,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 199,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String)",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 85)",
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 60)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String...)",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 75)",
        "(line 218,col 9)-(line 218,col 97)",
        "(line 219,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e)",
      "begin_line": 229,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 67)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String)",
      "begin_line": 237,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 61)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.requestBody(java.lang.String)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 30)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.header(java.lang.String, java.lang.String)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 32)",
        "(line 253,col 9)-(line 253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.headers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 256,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 65)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 32)",
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 269,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 65)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.parser(org.jsoup.parser.Parser)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 27)",
        "(line 279,col 9)-(line 279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.get()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 31)",
        "(line 284,col 9)-(line 284,col 18)",
        "(line 285,col 9)-(line 285,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.post()",
      "begin_line": 288,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 32)",
        "(line 290,col 9)-(line 290,col 18)",
        "(line 291,col 9)-(line 291,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.execute()",
      "begin_line": 294,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 36)",
        "(line 296,col 9)-(line 296,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request(org.jsoup.Connection.Request)",
      "begin_line": 303,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 22)",
        "(line 305,col 9)-(line 305,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response(org.jsoup.Connection.Response)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 23)",
        "(line 314,col 9)-(line 314,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.postDataCharset(java.lang.String)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 37)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.Base\u003cT\u003e"
      ],
      "begin_line": 322,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headers"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cookies"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Base.Base()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 44)",
        "(line 331,col 13)-(line 331,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url(java.net.URL)",
      "begin_line": 338,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 339,col 13)-(line 339,col 58)",
        "(line 340,col 13)-(line 340,col 27)",
        "(line 341,col 13)-(line 341,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 13)-(line 345,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 348,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 349,col 13)-(line 349,col 64)",
        "(line 350,col 13)-(line 350,col 33)",
        "(line 351,col 13)-(line 351,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String)",
      "begin_line": 354,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 67)",
        "(line 356,col 13)-(line 356,col 64)",
        "(line 357,col 13)-(line 360,col 13)",
        "(line 362,col 13)-(line 362,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.addHeader(java.lang.String, java.lang.String)",
      "begin_line": 365,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 36)",
        "(line 368,col 13)-(line 368,col 47)",
        "(line 370,col 13)-(line 370,col 48)",
        "(line 371,col 13)-(line 374,col 13)",
        "(line 375,col 13)-(line 375,col 49)",
        "(line 377,col 13)-(line 377,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers(java.lang.String)",
      "begin_line": 380,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 36)",
        "(line 383,col 13)-(line 383,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.fixHeaderEncoding(java.lang.String)",
      "begin_line": 386,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 395,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.looksLikeUtf8(byte[])",
      "begin_line": 398,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 22)",
        "(line 401,col 13)-(line 404,col 13)",
        "(line 406,col 13)-(line 406,col 20)",
        "(line 407,col 13)-(line 431,col 13)",
        "(line 432,col 13)-(line 432,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 435,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 69)",
        "(line 437,col 13)-(line 437,col 31)",
        "(line 438,col 13)-(line 438,col 35)",
        "(line 439,col 13)-(line 439,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeader(java.lang.String)",
      "begin_line": 442,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 69)",
        "(line 444,col 13)-(line 444,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeaderWithValue(java.lang.String, java.lang.String)",
      "begin_line": 450,
      "end_line": 459,
      "comment": "\n         * Test if the request has a header with this value (case insensitive).\n         ",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 36)",
        "(line 452,col 13)-(line 452,col 37)",
        "(line 453,col 13)-(line 453,col 48)",
        "(line 454,col 13)-(line 457,col 13)",
        "(line 458,col 13)-(line 458,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeHeader(java.lang.String)",
      "begin_line": 461,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 69)",
        "(line 463,col 13)-(line 463,col 70)",
        "(line 464,col 13)-(line 465,col 47)",
        "(line 466,col 13)-(line 466,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers()",
      "begin_line": 469,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 84)",
        "(line 471,col 13)-(line 476,col 13)",
        "(line 477,col 13)-(line 477,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.multiHeaders()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.getHeadersCaseInsensitive(java.lang.String)",
      "begin_line": 485,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 35)",
        "(line 488,col 13)-(line 491,col 13)",
        "(line 493,col 13)-(line 493,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.scanHeaders(java.lang.String)",
      "begin_line": 496,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 497,col 13)-(line 497,col 40)",
        "(line 498,col 13)-(line 501,col 13)",
        "(line 502,col 13)-(line 502,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 506,col 13)-(line 506,col 69)",
        "(line 507,col 13)-(line 507,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 510,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 511,col 13)-(line 511,col 69)",
        "(line 512,col 13)-(line 512,col 69)",
        "(line 513,col 13)-(line 513,col 37)",
        "(line 514,col 13)-(line 514,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasCookie(java.lang.String)",
      "begin_line": 517,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 518,col 13)-(line 518,col 69)",
        "(line 519,col 13)-(line 519,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeCookie(java.lang.String)",
      "begin_line": 522,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 69)",
        "(line 524,col 13)-(line 524,col 33)",
        "(line 525,col 13)-(line 525,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookies()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 27)"
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
      "begin_line": 533,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": " nullable"
    },
    {
      "type": "field",
      "varNames": [
        "timeoutMilliseconds"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxBodySizeBytes"
      ],
      "begin_line": 536,
      "end_line": 536,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "followRedirects"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "body"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHttpErrors"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreContentType"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserDefined"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": " called parser(...) vs initialized in ctor"
    },
    {
      "type": "field",
      "varNames": [
        "postDataCharset"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sslSocketFactory"
      ],
      "begin_line": 545,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Request.Request()",
      "begin_line": 547,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 548,col 13)-(line 548,col 40)",
        "(line 549,col 13)-(line 549,col 43)",
        "(line 550,col 13)-(line 550,col 35)",
        "(line 551,col 13)-(line 551,col 37)",
        "(line 552,col 13)-(line 552,col 32)",
        "(line 553,col 13)-(line 553,col 49)",
        "(line 554,col 13)-(line 554,col 46)",
        "(line 555,col 13)-(line 555,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 13)-(line 559,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy(java.net.Proxy)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 563,col 13)-(line 563,col 31)",
        "(line 564,col 13)-(line 564,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy(java.lang.String, int)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 568,col 13)-(line 568,col 100)",
        "(line 569,col 13)-(line 569,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 573,col 13)-(line 573,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout(int)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 97)",
        "(line 578,col 13)-(line 578,col 41)",
        "(line 579,col 13)-(line 579,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize()",
      "begin_line": 582,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize(int)",
      "begin_line": 586,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 587,col 13)-(line 587,col 83)",
        "(line 588,col 13)-(line 588,col 37)",
        "(line 589,col 13)-(line 589,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects()",
      "begin_line": 592,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 593,col 13)-(line 593,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects(boolean)",
      "begin_line": 596,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 597,col 13)-(line 597,col 51)",
        "(line 598,col 13)-(line 598,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.sslSocketFactory()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 13)-(line 606,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.sslSocketFactory(javax.net.ssl.SSLSocketFactory)",
      "begin_line": 609,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 610,col 13)-(line 610,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 613,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 614,col 13)-(line 614,col 53)",
        "(line 615,col 13)-(line 615,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType()",
      "begin_line": 618,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 619,col 13)-(line 619,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType(boolean)",
      "begin_line": 622,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 623,col 13)-(line 623,col 55)",
        "(line 624,col 13)-(line 624,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 627,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 65)",
        "(line 629,col 13)-(line 629,col 29)",
        "(line 630,col 13)-(line 630,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 13)-(line 634,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.requestBody(java.lang.String)",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 638,col 13)-(line 638,col 29)",
        "(line 639,col 13)-(line 639,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.requestBody()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 643,col 13)-(line 643,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 646,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 647,col 13)-(line 647,col 33)",
        "(line 648,col 13)-(line 648,col 33)",
        "(line 649,col 13)-(line 649,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 653,col 13)-(line 653,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset(java.lang.String)",
      "begin_line": 656,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 66)",
        "(line 658,col 13)-(line 658,col 94)",
        "(line 659,col 13)-(line 659,col 43)",
        "(line 660,col 13)-(line 660,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 664,col 13)-(line 664,col 35)"
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
      "begin_line": 668,
      "end_line": 1114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_REDIRECTS"
      ],
      "begin_line": 669,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCATION"
      ],
      "begin_line": 670,
      "end_line": 670,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusCode"
      ],
      "begin_line": 671,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusMessage"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteData"
      ],
      "begin_line": 673,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyStream"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "conn"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 676,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 677,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "executed"
      ],
      "begin_line": 678,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputStreamRead"
      ],
      "begin_line": 679,
      "end_line": 679,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numRedirects"
      ],
      "begin_line": 680,
      "end_line": 680,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 681,
      "end_line": 681,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlContentTypeRxp"
      ],
      "begin_line": 686,
      "end_line": 686,
      "comment": "\n         * Matches XML content types (like text/xml, application/xhtml+xml;charset\u003dUTF8, etc)\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response()",
      "begin_line": 688,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 689,col 13)-(line 689,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response(org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 692,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 693,col 13)-(line 693,col 20)",
        "(line 694,col 13)-(line 698,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request)",
      "begin_line": 701,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 702,col 13)-(line 702,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 705,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 706,col 13)-(line 706,col 62)",
        "(line 707,col 13)-(line 707,col 76)",
        "(line 708,col 13)-(line 708,col 54)",
        "(line 709,col 13)-(line 710,col 89)",
        "(line 711,col 13)-(line 711,col 65)",
        "(line 712,col 13)-(line 712,col 69)",
        "(line 713,col 13)-(line 714,col 110)",
        "(line 717,col 13)-(line 717,col 39)",
        "(line 718,col 13)-(line 721,col 57)",
        "(line 723,col 13)-(line 723,col 47)",
        "(line 724,col 13)-(line 724,col 59)",
        "(line 725,col 13)-(line 725,col 25)",
        "(line 726,col 13)-(line 798,col 13)",
        "(line 800,col 13)-(line 800,col 32)",
        "(line 801,col 13)-(line 801,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusCode()",
      "begin_line": 804,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 805,col 13)-(line 805,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusMessage()",
      "begin_line": 808,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 809,col 13)-(line 809,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset(java.lang.String)",
      "begin_line": 816,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 817,col 13)-(line 817,col 35)",
        "(line 818,col 13)-(line 818,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.contentType()",
      "begin_line": 821,
      "end_line": 823,
      "comment": "",
      "child_ranges": [
        "(line 822,col 13)-(line 822,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.parse()",
      "begin_line": 825,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 826,col 13)-(line 826,col 127)",
        "(line 827,col 13)-(line 830,col 13)",
        "(line 831,col 13)-(line 831,col 103)",
        "(line 832,col 13)-(line 832,col 110)",
        "(line 833,col 13)-(line 833,col 60)",
        "(line 834,col 13)-(line 834,col 35)",
        "(line 835,col 13)-(line 835,col 24)",
        "(line 836,col 13)-(line 836,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.prepareByteData()",
      "begin_line": 839,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 840,col 13)-(line 840,col 132)",
        "(line 841,col 13)-(line 851,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.body()",
      "begin_line": 854,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 855,col 13)-(line 855,col 30)",
        "(line 857,col 13)-(line 857,col 24)",
        "(line 858,col 13)-(line 861,col 76)",
        "(line 862,col 13)-(line 862,col 40)",
        "(line 863,col 13)-(line 863,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyAsBytes()",
      "begin_line": 866,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 867,col 13)-(line 867,col 30)",
        "(line 868,col 13)-(line 868,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bufferUp()",
      "begin_line": 871,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 873,col 13)-(line 873,col 30)",
        "(line 874,col 13)-(line 874,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyStream()",
      "begin_line": 877,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 879,col 13)-(line 879,col 132)",
        "(line 880,col 13)-(line 880,col 79)",
        "(line 881,col 13)-(line 881,col 35)",
        "(line 882,col 13)-(line 882,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createConnection(org.jsoup.Connection.Request)",
      "begin_line": 886,
      "end_line": 910,
      "comment": " set up connection defaults, and details from request",
      "child_ranges": [
        "(line 887,col 13)-(line 891,col 14)",
        "(line 893,col 13)-(line 893,col 55)",
        "(line 894,col 13)-(line 894,col 51)",
        "(line 895,col 13)-(line 895,col 50)",
        "(line 896,col 13)-(line 896,col 51)",
        "(line 898,col 13)-(line 899,col 88)",
        "(line 900,col 13)-(line 901,col 39)",
        "(line 902,col 13)-(line 903,col 79)",
        "(line 904,col 13)-(line 908,col 13)",
        "(line 909,col 13)-(line 909,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.safeClose()",
      "begin_line": 915,
      "end_line": 929,
      "comment": "\n         * Call on completion of stream read, to close the body (or error) stream\n         ",
      "child_ranges": [
        "(line 916,col 13)-(line 919,col 13)",
        "(line 920,col 13)-(line 928,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setupFromConnection(java.net.HttpURLConnection, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 932,
      "end_line": 951,
      "comment": " set up url, method, header, cookies",
      "child_ranges": [
        "(line 933,col 13)-(line 933,col 29)",
        "(line 934,col 13)-(line 934,col 61)",
        "(line 935,col 13)-(line 935,col 32)",
        "(line 936,col 13)-(line 936,col 48)",
        "(line 937,col 13)-(line 937,col 54)",
        "(line 938,col 13)-(line 938,col 48)",
        "(line 940,col 13)-(line 940,col 73)",
        "(line 941,col 13)-(line 941,col 47)",
        "(line 944,col 13)-(line 950,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createHeaderMap(java.net.HttpURLConnection)",
      "begin_line": 953,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 955,col 13)-(line 955,col 86)",
        "(line 956,col 13)-(line 956,col 22)",
        "(line 957,col 13)-(line 973,col 13)",
        "(line 974,col 13)-(line 974,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.processResponseHeaders(java.util.Map\u003cjava.lang.String, java.util.List\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 977,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 978,col 13)-(line 1000,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setOutputContentType(org.jsoup.Connection.Request)",
      "begin_line": 1003,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 13)-(line 1004,col 32)",
        "(line 1005,col 13)-(line 1014,col 13)",
        "(line 1015,col 13)-(line 1015,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.writePost(org.jsoup.Connection.Request, java.io.OutputStream, java.lang.String)",
      "begin_line": 1018,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 13)-(line 1019,col 66)",
        "(line 1020,col 13)-(line 1020,col 117)",
        "(line 1022,col 13)-(line 1066,col 13)",
        "(line 1067,col 13)-(line 1067,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getRequestCookieString(org.jsoup.Connection.Request)",
      "begin_line": 1070,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 58)",
        "(line 1072,col 13)-(line 1072,col 33)",
        "(line 1073,col 13)-(line 1080,col 13)",
        "(line 1081,col 13)-(line 1081,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(org.jsoup.Connection.Request)",
      "begin_line": 1085,
      "end_line": 1113,
      "comment": " for get url reqs, serialise the data map into the url",
      "child_ranges": [
        "(line 1086,col 13)-(line 1086,col 31)",
        "(line 1087,col 13)-(line 1087,col 59)",
        "(line 1088,col 13)-(line 1088,col 33)",
        "(line 1090,col 13)-(line 1095,col 29)",
        "(line 1096,col 13)-(line 1099,col 13)",
        "(line 1100,col 13)-(line 1110,col 13)",
        "(line 1111,col 13)-(line 1111,col 61)",
        "(line 1112,col 13)-(line 1112,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.needsMultipart(org.jsoup.Connection.Request)",
      "begin_line": 1116,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 9)-(line 1121,col 9)",
        "(line 1122,col 9)-(line 1122,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.KeyVal"
      ],
      "begin_line": 1125,
      "end_line": 1191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 1126,
      "end_line": 1126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 1127,
      "end_line": 1127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 1128,
      "end_line": 1128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 1129,
      "end_line": 1129,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String)",
      "begin_line": 1131,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 13)-(line 1132,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 1135,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 13)-(line 1136,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.KeyVal()",
      "begin_line": 1139,
      "end_line": 1139,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key(java.lang.String)",
      "begin_line": 1141,
      "end_line": 1145,
      "comment": "",
      "child_ranges": [
        "(line 1142,col 13)-(line 1142,col 65)",
        "(line 1143,col 13)-(line 1143,col 27)",
        "(line 1144,col 13)-(line 1144,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key()",
      "begin_line": 1147,
      "end_line": 1149,
      "comment": "",
      "child_ranges": [
        "(line 1148,col 13)-(line 1148,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value(java.lang.String)",
      "begin_line": 1151,
      "end_line": 1155,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 13)-(line 1152,col 67)",
        "(line 1153,col 13)-(line 1153,col 31)",
        "(line 1154,col 13)-(line 1154,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value()",
      "begin_line": 1157,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 13)-(line 1158,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream(java.io.InputStream)",
      "begin_line": 1161,
      "end_line": 1165,
      "comment": "",
      "child_ranges": [
        "(line 1162,col 13)-(line 1162,col 74)",
        "(line 1163,col 13)-(line 1163,col 38)",
        "(line 1164,col 13)-(line 1164,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream()",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1168,col 13)-(line 1168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.hasInputStream()",
      "begin_line": 1171,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 13)-(line 1172,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.contentType(java.lang.String)",
      "begin_line": 1175,
      "end_line": 1180,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 13)-(line 1177,col 43)",
        "(line 1178,col 13)-(line 1178,col 43)",
        "(line 1179,col 13)-(line 1179,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.contentType()",
      "begin_line": 1182,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1184,col 13)-(line 1184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.toString()",
      "begin_line": 1187,
      "end_line": 1190,
      "comment": "",
      "child_ranges": [
        "(line 1189,col 13)-(line 1189,col 37)"
      ]
    }
  ]
}