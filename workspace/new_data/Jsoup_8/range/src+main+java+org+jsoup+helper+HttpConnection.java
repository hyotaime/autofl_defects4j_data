{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/helper/HttpConnection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpConnection",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection"
      ],
      "begin_line": 23,
      "end_line": 543,
      "comment": "\n * Implementation of {@link Connection}.\n * @see org.jsoup.Jsoup#connect(String) \n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.lang.String)",
      "begin_line": 24,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 46)",
        "(line 26,col 9)-(line 26,col 21)",
        "(line 27,col 9)-(line 27,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.net.URL)",
      "begin_line": 30,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 46)",
        "(line 32,col 9)-(line 32,col 21)",
        "(line 33,col 9)-(line 33,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.HttpConnection()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 28)",
        "(line 41,col 9)-(line 41,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.net.URL)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)",
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.lang.String)",
      "begin_line": 49,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 58)",
        "(line 51,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.userAgent(java.lang.String)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 67)",
        "(line 61,col 9)-(line 61,col 44)",
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.timeout(int)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 28)",
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.referrer(java.lang.String)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 64)",
        "(line 72,col 9)-(line 72,col 40)",
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.method(org.jsoup.Connection.Method)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 44)",
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 86,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String...)",
      "begin_line": 94,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 75)",
        "(line 96,col 9)-(line 96,col 97)",
        "(line 97,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.header(java.lang.String, java.lang.String)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 32)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.get()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 31)",
        "(line 119,col 9)-(line 119,col 18)",
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.post()",
      "begin_line": 123,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 32)",
        "(line 125,col 9)-(line 125,col 18)",
        "(line 126,col 9)-(line 126,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.execute()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request(org.jsoup.Connection.Request)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 22)",
        "(line 140,col 9)-(line 140,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response(org.jsoup.Connection.Response)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 23)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.Base\u003cT\u003e"
      ],
      "begin_line": 152,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headers"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cookies"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Base.Base()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 58)",
        "(line 161,col 13)-(line 161,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 13)-(line 165,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url(java.net.URL)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 58)",
        "(line 170,col 13)-(line 170,col 27)",
        "(line 171,col 13)-(line 171,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 64)",
        "(line 180,col 13)-(line 180,col 33)",
        "(line 181,col 13)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 67)",
        "(line 186,col 13)-(line 186,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 189,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 69)",
        "(line 191,col 13)-(line 191,col 69)",
        "(line 192,col 13)-(line 192,col 31)",
        "(line 193,col 13)-(line 193,col 37)",
        "(line 194,col 13)-(line 194,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeader(java.lang.String)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 69)",
        "(line 199,col 13)-(line 199,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeHeader(java.lang.String)",
      "begin_line": 202,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 69)",
        "(line 204,col 13)-(line 204,col 64)",
        "(line 205,col 13)-(line 206,col 47)",
        "(line 207,col 13)-(line 207,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.getHeaderCaseInsensitive(java.lang.String)",
      "begin_line": 214,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 67)",
        "(line 217,col 13)-(line 217,col 45)",
        "(line 218,col 13)-(line 219,col 56)",
        "(line 220,col 13)-(line 224,col 13)",
        "(line 225,col 13)-(line 225,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.scanHeaders(java.lang.String)",
      "begin_line": 228,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 43)",
        "(line 230,col 13)-(line 233,col 13)",
        "(line 234,col 13)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 67)",
        "(line 239,col 13)-(line 239,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 69)",
        "(line 244,col 13)-(line 244,col 69)",
        "(line 245,col 13)-(line 245,col 37)",
        "(line 246,col 13)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasCookie(java.lang.String)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 63)",
        "(line 251,col 13)-(line 251,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeCookie(java.lang.String)",
      "begin_line": 254,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 63)",
        "(line 256,col 13)-(line 256,col 33)",
        "(line 257,col 13)-(line 257,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookies()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 27)"
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
      "begin_line": 265,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeoutMilliseconds"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Request.Request()",
      "begin_line": 269,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 39)",
        "(line 271,col 13)-(line 271,col 54)",
        "(line 272,col 13)-(line 272,col 43)",
        "(line 273,col 13)-(line 273,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 13)-(line 277,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout(int)",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 97)",
        "(line 282,col 13)-(line 282,col 41)",
        "(line 283,col 13)-(line 283,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 65)",
        "(line 288,col 13)-(line 288,col 29)",
        "(line 289,col 13)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 24)"
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
      "begin_line": 297,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusCode"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusMessage"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteData"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "executed"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request)",
      "begin_line": 305,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 62)",
        "(line 307,col 13)-(line 307,col 54)",
        "(line 308,col 13)-(line 309,col 118)",
        "(line 312,col 13)-(line 313,col 41)",
        "(line 314,col 13)-(line 314,col 59)",
        "(line 315,col 13)-(line 315,col 27)",
        "(line 316,col 13)-(line 317,col 62)",
        "(line 320,col 13)-(line 320,col 48)",
        "(line 321,col 13)-(line 321,col 42)",
        "(line 322,col 13)-(line 328,col 13)",
        "(line 329,col 13)-(line 329,col 42)",
        "(line 330,col 13)-(line 330,col 42)",
        "(line 331,col 13)-(line 334,col 13)",
        "(line 336,col 13)-(line 336,col 40)",
        "(line 337,col 13)-(line 345,col 13)",
        "(line 347,col 13)-(line 347,col 32)",
        "(line 348,col 13)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusCode()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusMessage()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.contentType()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 13)-(line 364,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.parse()",
      "begin_line": 367,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 127)",
        "(line 369,col 13)-(line 371,col 50)",
        "(line 372,col 13)-(line 372,col 91)",
        "(line 373,col 13)-(line 373,col 30)",
        "(line 374,col 13)-(line 374,col 60)",
        "(line 375,col 13)-(line 375,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.body()",
      "begin_line": 378,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 379,col 13)-(line 379,col 132)",
        "(line 381,col 13)-(line 381,col 24)",
        "(line 382,col 13)-(line 385,col 76)",
        "(line 386,col 13)-(line 386,col 30)",
        "(line 387,col 13)-(line 387,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyAsBytes()",
      "begin_line": 390,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 132)",
        "(line 392,col 13)-(line 392,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createConnection(org.jsoup.Connection.Request)",
      "begin_line": 396,
      "end_line": 410,
      "comment": " set up connection defaults, and details from request",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 84)",
        "(line 398,col 13)-(line 398,col 55)",
        "(line 399,col 13)-(line 399,col 50)",
        "(line 400,col 13)-(line 400,col 50)",
        "(line 401,col 13)-(line 401,col 47)",
        "(line 402,col 13)-(line 403,col 39)",
        "(line 404,col 13)-(line 405,col 79)",
        "(line 406,col 13)-(line 408,col 13)",
        "(line 409,col 13)-(line 409,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setupFromConnection(java.net.HttpURLConnection)",
      "begin_line": 413,
      "end_line": 440,
      "comment": " set up url, method, header, cookies",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 72)",
        "(line 415,col 13)-(line 415,col 32)",
        "(line 416,col 13)-(line 416,col 48)",
        "(line 417,col 13)-(line 417,col 54)",
        "(line 418,col 13)-(line 418,col 48)",
        "(line 420,col 13)-(line 420,col 74)",
        "(line 421,col 13)-(line 439,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.writePost(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e, java.io.OutputStream)",
      "begin_line": 442,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 97)",
        "(line 444,col 13)-(line 444,col 33)",
        "(line 445,col 13)-(line 454,col 13)",
        "(line 455,col 13)-(line 455,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getRequestCookieString(org.jsoup.Connection.Request)",
      "begin_line": 458,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 51)",
        "(line 460,col 13)-(line 460,col 33)",
        "(line 461,col 13)-(line 468,col 13)",
        "(line 469,col 13)-(line 469,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(org.jsoup.Connection.Request)",
      "begin_line": 473,
      "end_line": 500,
      "comment": " for get url reqs, serialise the data map into the url",
      "child_ranges": [
        "(line 474,col 13)-(line 474,col 31)",
        "(line 475,col 13)-(line 475,col 52)",
        "(line 476,col 13)-(line 476,col 33)",
        "(line 478,col 13)-(line 483,col 29)",
        "(line 484,col 13)-(line 487,col 13)",
        "(line 488,col 13)-(line 497,col 13)",
        "(line 498,col 13)-(line 498,col 45)",
        "(line 499,col 13)-(line 499,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.KeyVal"
      ],
      "begin_line": 503,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 504,
      "end_line": 504,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 505,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String)",
      "begin_line": 507,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 65)",
        "(line 509,col 13)-(line 509,col 67)",
        "(line 510,col 13)-(line 510,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.KeyVal(java.lang.String, java.lang.String)",
      "begin_line": 513,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 27)",
        "(line 515,col 13)-(line 515,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key(java.lang.String)",
      "begin_line": 518,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 519,col 13)-(line 519,col 65)",
        "(line 520,col 13)-(line 520,col 27)",
        "(line 521,col 13)-(line 521,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value(java.lang.String)",
      "begin_line": 528,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 67)",
        "(line 530,col 13)-(line 530,col 31)",
        "(line 531,col 13)-(line 531,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.toString()",
      "begin_line": 538,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 13)-(line 540,col 37)"
      ]
    }
  ]
}