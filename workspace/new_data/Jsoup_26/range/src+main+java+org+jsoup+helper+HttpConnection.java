{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/helper/HttpConnection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpConnection",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection"
      ],
      "begin_line": 22,
      "end_line": 661,
      "comment": "\n * Implementation of {@link Connection}.\n * @see org.jsoup.Jsoup#connect(String) \n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.lang.String)",
      "begin_line": 23,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 46)",
        "(line 25,col 9)-(line 25,col 21)",
        "(line 26,col 9)-(line 26,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.net.URL)",
      "begin_line": 29,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 46)",
        "(line 31,col 9)-(line 31,col 21)",
        "(line 32,col 9)-(line 32,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.HttpConnection()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 28)",
        "(line 40,col 9)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.net.URL)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 21)",
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.lang.String)",
      "begin_line": 48,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 58)",
        "(line 50,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.userAgent(java.lang.String)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 67)",
        "(line 60,col 9)-(line 60,col 44)",
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.timeout(int)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 28)",
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.followRedirects(boolean)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 45)",
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.referrer(java.lang.String)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 64)",
        "(line 76,col 9)-(line 76,col 40)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.method(org.jsoup.Connection.Method)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)",
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreHttpErrors(boolean)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 3)-(line 86,col 41)",
        "(line 87,col 3)-(line 87,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreContentType(boolean)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 44)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 60)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String...)",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 75)",
        "(line 110,col 9)-(line 110,col 97)",
        "(line 111,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.header(java.lang.String, java.lang.String)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)",
        "(line 123,col 9)-(line 123,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 128,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 65)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.parser(org.jsoup.parser.Parser)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.get()",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 31)",
        "(line 146,col 9)-(line 146,col 18)",
        "(line 147,col 9)-(line 147,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.post()",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 32)",
        "(line 152,col 9)-(line 152,col 18)",
        "(line 153,col 9)-(line 153,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.execute()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 36)",
        "(line 158,col 9)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request(org.jsoup.Connection.Request)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 22)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response(org.jsoup.Connection.Response)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 23)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.Base\u003cT\u003e"
      ],
      "begin_line": 179,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headers"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cookies"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Base.Base()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 58)",
        "(line 188,col 13)-(line 188,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url(java.net.URL)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 58)",
        "(line 197,col 13)-(line 197,col 27)",
        "(line 198,col 13)-(line 198,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 64)",
        "(line 207,col 13)-(line 207,col 33)",
        "(line 208,col 13)-(line 208,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 67)",
        "(line 213,col 13)-(line 213,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 216,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 69)",
        "(line 218,col 13)-(line 218,col 69)",
        "(line 219,col 13)-(line 219,col 31)",
        "(line 220,col 13)-(line 220,col 37)",
        "(line 221,col 13)-(line 221,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeader(java.lang.String)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 69)",
        "(line 226,col 13)-(line 226,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeHeader(java.lang.String)",
      "begin_line": 229,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 69)",
        "(line 231,col 13)-(line 231,col 64)",
        "(line 232,col 13)-(line 233,col 47)",
        "(line 234,col 13)-(line 234,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.getHeaderCaseInsensitive(java.lang.String)",
      "begin_line": 241,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 67)",
        "(line 244,col 13)-(line 244,col 45)",
        "(line 245,col 13)-(line 246,col 56)",
        "(line 247,col 13)-(line 251,col 13)",
        "(line 252,col 13)-(line 252,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.scanHeaders(java.lang.String)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 43)",
        "(line 257,col 13)-(line 260,col 13)",
        "(line 261,col 13)-(line 261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 67)",
        "(line 266,col 13)-(line 266,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 69)",
        "(line 271,col 13)-(line 271,col 69)",
        "(line 272,col 13)-(line 272,col 37)",
        "(line 273,col 13)-(line 273,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasCookie(java.lang.String)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 277,col 13)-(line 277,col 63)",
        "(line 278,col 13)-(line 278,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeCookie(java.lang.String)",
      "begin_line": 281,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 63)",
        "(line 283,col 13)-(line 283,col 33)",
        "(line 284,col 13)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookies()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 27)"
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
      "begin_line": 292,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeoutMilliseconds"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "followRedirects"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHttpErrors"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreContentType"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Request.Request()",
      "begin_line": 300,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 39)",
        "(line 302,col 13)-(line 302,col 35)",
        "(line 303,col 13)-(line 303,col 54)",
        "(line 304,col 13)-(line 304,col 43)",
        "(line 305,col 13)-(line 305,col 51)",
        "(line 306,col 13)-(line 306,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout(int)",
      "begin_line": 313,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 97)",
        "(line 315,col 13)-(line 315,col 41)",
        "(line 316,col 13)-(line 316,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects(boolean)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 51)",
        "(line 325,col 13)-(line 325,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 332,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 333,col 13)-(line 333,col 53)",
        "(line 334,col 13)-(line 334,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType(boolean)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 55)",
        "(line 343,col 13)-(line 343,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 346,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 65)",
        "(line 348,col 13)-(line 348,col 29)",
        "(line 349,col 13)-(line 349,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 353,col 13)-(line 353,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 357,col 13)-(line 357,col 33)",
        "(line 358,col 13)-(line 358,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 26)"
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
      "begin_line": 366,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_REDIRECTS"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusCode"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusMessage"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteData"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "executed"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numRedirects"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response(org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 381,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 20)",
        "(line 383,col 13)-(line 387,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 394,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 62)",
        "(line 396,col 13)-(line 396,col 54)",
        "(line 397,col 13)-(line 398,col 118)",
        "(line 401,col 13)-(line 402,col 41)",
        "(line 403,col 13)-(line 403,col 59)",
        "(line 404,col 13)-(line 404,col 27)",
        "(line 405,col 13)-(line 406,col 62)",
        "(line 408,col 13)-(line 408,col 48)",
        "(line 409,col 13)-(line 409,col 42)",
        "(line 410,col 13)-(line 415,col 13)",
        "(line 416,col 13)-(line 416,col 58)",
        "(line 417,col 13)-(line 417,col 60)",
        "(line 418,col 13)-(line 426,col 13)",
        "(line 427,col 13)-(line 427,col 26)",
        "(line 430,col 13)-(line 430,col 51)",
        "(line 431,col 13)-(line 433,col 56)",
        "(line 435,col 13)-(line 435,col 42)",
        "(line 436,col 13)-(line 436,col 42)",
        "(line 437,col 13)-(line 448,col 13)",
        "(line 450,col 13)-(line 450,col 32)",
        "(line 451,col 13)-(line 451,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusCode()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusMessage()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.contentType()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.parse()",
      "begin_line": 470,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 471,col 127)",
        "(line 472,col 13)-(line 472,col 105)",
        "(line 473,col 13)-(line 473,col 30)",
        "(line 474,col 13)-(line 474,col 60)",
        "(line 475,col 13)-(line 475,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.body()",
      "begin_line": 478,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 479,col 13)-(line 479,col 132)",
        "(line 481,col 13)-(line 481,col 24)",
        "(line 482,col 13)-(line 485,col 76)",
        "(line 486,col 13)-(line 486,col 30)",
        "(line 487,col 13)-(line 487,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyAsBytes()",
      "begin_line": 490,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 132)",
        "(line 492,col 13)-(line 492,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createConnection(org.jsoup.Connection.Request)",
      "begin_line": 496,
      "end_line": 510,
      "comment": " set up connection defaults, and details from request",
      "child_ranges": [
        "(line 497,col 13)-(line 497,col 84)",
        "(line 498,col 13)-(line 498,col 55)",
        "(line 499,col 13)-(line 499,col 51)",
        "(line 500,col 13)-(line 500,col 50)",
        "(line 501,col 13)-(line 501,col 47)",
        "(line 502,col 13)-(line 503,col 39)",
        "(line 504,col 13)-(line 505,col 79)",
        "(line 506,col 13)-(line 508,col 13)",
        "(line 509,col 13)-(line 509,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setupFromConnection(java.net.HttpURLConnection, org.jsoup.Connection.Response)",
      "begin_line": 513,
      "end_line": 530,
      "comment": " set up url, method, header, cookies",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 72)",
        "(line 515,col 13)-(line 515,col 32)",
        "(line 516,col 13)-(line 516,col 48)",
        "(line 517,col 13)-(line 517,col 54)",
        "(line 518,col 13)-(line 518,col 48)",
        "(line 520,col 13)-(line 520,col 74)",
        "(line 521,col 13)-(line 521,col 47)",
        "(line 524,col 13)-(line 529,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.processResponseHeaders(java.util.Map\u003cjava.lang.String, java.util.List\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 532,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 533,col 13)-(line 557,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.writePost(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e, java.io.OutputStream)",
      "begin_line": 560,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 97)",
        "(line 562,col 13)-(line 562,col 33)",
        "(line 563,col 13)-(line 572,col 13)",
        "(line 573,col 13)-(line 573,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getRequestCookieString(org.jsoup.Connection.Request)",
      "begin_line": 576,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 51)",
        "(line 578,col 13)-(line 578,col 33)",
        "(line 579,col 13)-(line 586,col 13)",
        "(line 587,col 13)-(line 587,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(org.jsoup.Connection.Request)",
      "begin_line": 591,
      "end_line": 618,
      "comment": " for get url reqs, serialise the data map into the url",
      "child_ranges": [
        "(line 592,col 13)-(line 592,col 31)",
        "(line 593,col 13)-(line 593,col 52)",
        "(line 594,col 13)-(line 594,col 33)",
        "(line 596,col 13)-(line 601,col 29)",
        "(line 602,col 13)-(line 605,col 13)",
        "(line 606,col 13)-(line 615,col 13)",
        "(line 616,col 13)-(line 616,col 45)",
        "(line 617,col 13)-(line 617,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.KeyVal"
      ],
      "begin_line": 621,
      "end_line": 660,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 622,
      "end_line": 622,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String)",
      "begin_line": 625,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 626,col 13)-(line 626,col 65)",
        "(line 627,col 13)-(line 627,col 67)",
        "(line 628,col 13)-(line 628,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.KeyVal(java.lang.String, java.lang.String)",
      "begin_line": 631,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 632,col 13)-(line 632,col 27)",
        "(line 633,col 13)-(line 633,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key(java.lang.String)",
      "begin_line": 636,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 637,col 13)-(line 637,col 65)",
        "(line 638,col 13)-(line 638,col 27)",
        "(line 639,col 13)-(line 639,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 643,col 13)-(line 643,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value(java.lang.String)",
      "begin_line": 646,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 647,col 13)-(line 647,col 67)",
        "(line 648,col 13)-(line 648,col 31)",
        "(line 649,col 13)-(line 649,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 653,col 13)-(line 653,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.toString()",
      "begin_line": 656,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 658,col 13)-(line 658,col 37)"
      ]
    }
  ]
}