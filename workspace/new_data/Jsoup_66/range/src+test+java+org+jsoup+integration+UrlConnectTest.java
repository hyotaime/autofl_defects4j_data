{
  "filepath": "/tmp/Jsoup-66b/src/test/java/org/jsoup/integration/UrlConnectTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// todo: rebuild these into a local Jetty test server, so not reliant on the vagaries of the internet.\nUrlConnectTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 895,
      "comment": "\n Tests the URL connection. Not enabled by default, so tests don\u0027t require network connection.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "WEBSITE_WITH_INVALID_CERTIFICATE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEBSITE_WITH_SNI"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "echoURL"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "browserUa"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchURl()",
      "begin_line": 43,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 41)",
        "(line 46,col 9)-(line 46,col 58)",
        "(line 47,col 9)-(line 47,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchURIWithWihtespace()",
      "begin_line": 50,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 81)",
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 54,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchBaidu()",
      "begin_line": 57,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 100)",
        "(line 60,col 9)-(line 60,col 35)",
        "(line 62,col 9)-(line 62,col 74)",
        "(line 63,col 9)-(line 63,col 43)",
        "(line 64,col 9)-(line 64,col 41)",
        "(line 65,col 9)-(line 65,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.exceptOnUnknownContentType()",
      "begin_line": 68,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 64)",
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.exceptOnUnsupportedProtocol()",
      "begin_line": 84,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 30)",
        "(line 88,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignoresContentTypeIfSoConfigured()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 105)",
        "(line 101,col 9)-(line 101,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.doesPost()",
      "begin_line": 104,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 109,col 20)",
        "(line 111,col 9)-(line 111,col 59)",
        "(line 113,col 9)-(line 113,col 62)",
        "(line 114,col 9)-(line 114,col 45)",
        "(line 115,col 9)-(line 115,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.sendsRequestBodyJsonWithData()",
      "begin_line": 118,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 126,col 20)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 128,col 69)",
        "(line 129,col 9)-(line 129,col 61)",
        "(line 130,col 9)-(line 130,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.sendsRequestBodyJsonWithoutData()",
      "begin_line": 133,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 42)",
        "(line 136,col 9)-(line 140,col 20)",
        "(line 141,col 9)-(line 141,col 59)",
        "(line 142,col 9)-(line 142,col 69)",
        "(line 143,col 9)-(line 143,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.sendsRequestBody()",
      "begin_line": 146,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 42)",
        "(line 149,col 9)-(line 153,col 20)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 63)",
        "(line 156,col 9)-(line 156,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.sendsRequestBodyWithUrlParams()",
      "begin_line": 159,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 42)",
        "(line 162,col 9)-(line 167,col 20)",
        "(line 168,col 9)-(line 168,col 59)",
        "(line 169,col 9)-(line 169,col 117)",
        "(line 170,col 9)-(line 170,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.doesGet()",
      "begin_line": 173,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 178,col 41)",
        "(line 180,col 9)-(line 180,col 33)",
        "(line 181,col 9)-(line 181,col 82)",
        "(line 182,col 9)-(line 182,col 61)",
        "(line 183,col 9)-(line 183,col 63)",
        "(line 184,col 9)-(line 184,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.doesPut()",
      "begin_line": 187,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 193,col 27)",
        "(line 195,col 9)-(line 195,col 35)",
        "(line 196,col 9)-(line 196,col 58)",
        "(line 198,col 9)-(line 198,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ihVal(java.lang.String, org.jsoup.nodes.Document)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsTempRedirect()",
      "begin_line": 206,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 83)",
        "(line 209,col 9)-(line 209,col 33)",
        "(line 210,col 9)-(line 210,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsNewTempRedirect()",
      "begin_line": 213,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 83)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 217,col 50)",
        "(line 218,col 9)-(line 218,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.postRedirectsFetchWithGet()",
      "begin_line": 221,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 226,col 48)",
        "(line 227,col 9)-(line 227,col 71)",
        "(line 228,col 9)-(line 228,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRedirectToHttps()",
      "begin_line": 231,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 90)",
        "(line 234,col 9)-(line 234,col 28)",
        "(line 235,col 9)-(line 235,col 33)",
        "(line 236,col 9)-(line 236,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRelativeRedirect()",
      "begin_line": 239,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 87)",
        "(line 242,col 9)-(line 242,col 34)",
        "(line 243,col 9)-(line 243,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRelativeDotRedirect()",
      "begin_line": 246,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 91)",
        "(line 250,col 9)-(line 250,col 34)",
        "(line 251,col 9)-(line 251,col 47)",
        "(line 252,col 9)-(line 252,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRelativeDotRedirect2()",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 259,col 32)",
        "(line 260,col 9)-(line 260,col 34)",
        "(line 261,col 9)-(line 261,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRedirectsWithWithespaces()",
      "begin_line": 264,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 69)",
        "(line 267,col 9)-(line 267,col 33)",
        "(line 268,col 9)-(line 268,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.gracefullyHandleBrokenLocationRedirect()",
      "begin_line": 271,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 60)",
        "(line 274,col 9)-(line 274,col 18)",
        "(line 275,col 9)-(line 275,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.throwsExceptionOnError()",
      "begin_line": 278,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 61)",
        "(line 281,col 9)-(line 281,col 44)",
        "(line 282,col 9)-(line 282,col 30)",
        "(line 283,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignoresExceptionIfSoConfigured()",
      "begin_line": 295,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 103)",
        "(line 298,col 9)-(line 298,col 48)",
        "(line 299,col 9)-(line 299,col 35)",
        "(line 300,col 9)-(line 300,col 44)",
        "(line 301,col 9)-(line 301,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignores500tExceptionIfSoConfigured()",
      "begin_line": 304,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 106)",
        "(line 307,col 9)-(line 307,col 48)",
        "(line 308,col 9)-(line 308,col 35)",
        "(line 309,col 9)-(line 309,col 44)",
        "(line 310,col 9)-(line 310,col 63)",
        "(line 311,col 9)-(line 311,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignores500WithNoContentExceptionIfSoConfigured()",
      "begin_line": 314,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 117)",
        "(line 317,col 9)-(line 317,col 48)",
        "(line 318,col 9)-(line 318,col 35)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 320,col 9)-(line 320,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignores200WithNoContentExceptionIfSoConfigured()",
      "begin_line": 323,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 117)",
        "(line 326,col 9)-(line 326,col 48)",
        "(line 327,col 9)-(line 327,col 35)",
        "(line 328,col 9)-(line 328,col 44)",
        "(line 329,col 9)-(line 329,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handles200WithNoContent()",
      "begin_line": 332,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 34)",
        "(line 337,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 338,col 35)",
        "(line 339,col 9)-(line 339,col 44)",
        "(line 341,col 9)-(line 344,col 34)",
        "(line 345,col 9)-(line 345,col 28)",
        "(line 346,col 9)-(line 346,col 26)",
        "(line 347,col 9)-(line 347,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.doesntRedirectIfSoConfigured()",
      "begin_line": 350,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 106)",
        "(line 353,col 9)-(line 353,col 48)",
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 355,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.redirectsResponseCookieToNextResponse()",
      "begin_line": 358,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 90)",
        "(line 361,col 9)-(line 361,col 48)",
        "(line 362,col 9)-(line 362,col 54)",
        "(line 363,col 9)-(line 363,col 35)",
        "(line 364,col 9)-(line 364,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.maximumRedirects()",
      "begin_line": 367,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 30)",
        "(line 370,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.multiCookieSet()",
      "begin_line": 379,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 90)",
        "(line 382,col 9)-(line 382,col 48)",
        "(line 385,col 9)-(line 385,col 52)",
        "(line 386,col 9)-(line 386,col 55)",
        "(line 387,col 9)-(line 387,col 48)",
        "(line 390,col 9)-(line 390,col 69)",
        "(line 391,col 9)-(line 391,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesDodgyCharset()",
      "begin_line": 394,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 72)",
        "(line 398,col 9)-(line 398,col 63)",
        "(line 399,col 9)-(line 399,col 76)",
        "(line 400,col 9)-(line 400,col 42)",
        "(line 401,col 9)-(line 401,col 35)",
        "(line 402,col 9)-(line 402,col 50)",
        "(line 403,col 9)-(line 403,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.maxBodySize()",
      "begin_line": 406,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 68)",
        "(line 410,col 9)-(line 410,col 70)",
        "(line 411,col 9)-(line 411,col 91)",
        "(line 412,col 9)-(line 412,col 93)",
        "(line 413,col 9)-(line 413,col 92)",
        "(line 414,col 9)-(line 414,col 87)",
        "(line 416,col 9)-(line 416,col 35)",
        "(line 417,col 9)-(line 417,col 72)",
        "(line 418,col 9)-(line 418,col 62)",
        "(line 419,col 9)-(line 419,col 64)",
        "(line 420,col 9)-(line 420,col 70)",
        "(line 421,col 9)-(line 421,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.testUnsafeFail()",
      "begin_line": 431,
      "end_line": 435,
      "comment": "\n     * Verify that security disabling feature works properly.\n     * \u003cp/\u003e\n     * 1. try to hit url with invalid certificate and evaluate that exception is thrown\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 54)",
        "(line 434,col 9)-(line 434,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.testSNIFail()",
      "begin_line": 447,
      "end_line": 451,
      "comment": "\n     * Verify that requests to websites with SNI fail on jdk 1.6\n     * \u003cp/\u003e\n     * read for more details:\n     * http://en.wikipedia.org/wiki/Server_Name_Indication\n     *\n     * Test is ignored independent from others as it requires JDK 1.6\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 38)",
        "(line 450,col 9)-(line 450,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.testSNIPass()",
      "begin_line": 460,
      "end_line": 465,
      "comment": "\n     * Verify that requests to websites with SNI pass\n     * \u003cp/\u003e\n     * \u003cb\u003eNB!\u003c/b\u003e this test is FAILING right now on jdk 1.6\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 38)",
        "(line 463,col 9)-(line 463,col 101)",
        "(line 464,col 9)-(line 464,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.testUnsafePass()",
      "begin_line": 474,
      "end_line": 479,
      "comment": "\n     * Verify that security disabling feature works properly.\n     * \u003cp/\u003e\n     * 1. disable security checks and call the same url to verify that content is consumed correctly\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 54)",
        "(line 477,col 9)-(line 477,col 101)",
        "(line 478,col 9)-(line 478,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldWorkForCharsetInExtraAttribute()",
      "begin_line": 481,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 101)",
        "(line 484,col 9)-(line 484,col 35)",
        "(line 485,col 9)-(line 485,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags()",
      "begin_line": 492,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 79)",
        "(line 495,col 9)-(line 495,col 20)",
        "(line 496,col 9)-(line 496,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldParseBrokenHtml5MetaCharsetTagCorrectly()",
      "begin_line": 499,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 80)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldEmptyMetaCharsetCorrectly()",
      "begin_line": 506,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 87)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldWorkForDuplicateCharsetInTag()",
      "begin_line": 513,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 83)",
        "(line 516,col 9)-(line 516,col 35)",
        "(line 517,col 9)-(line 517,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.baseHrefCorrectAfterHttpEquiv()",
      "begin_line": 520,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 113)",
        "(line 524,col 9)-(line 524,col 35)",
        "(line 525,col 9)-(line 525,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.postHtmlFile()",
      "begin_line": 531,
      "end_line": 553,
      "comment": "\n     * Test fetching a form, and submitting it with a file attached.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 82)",
        "(line 534,col 9)-(line 534,col 70)",
        "(line 535,col 9)-(line 535,col 40)",
        "(line 537,col 9)-(line 537,col 75)",
        "(line 538,col 9)-(line 538,col 65)",
        "(line 540,col 9)-(line 540,col 56)",
        "(line 541,col 9)-(line 541,col 37)",
        "(line 542,col 9)-(line 542,col 37)",
        "(line 544,col 9)-(line 544,col 32)",
        "(line 545,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 551,col 35)",
        "(line 552,col 9)-(line 552,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.postJpeg()",
      "begin_line": 558,
      "end_line": 569,
      "comment": "\n     * Tests upload of binary content to a remote service.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 63)",
        "(line 561,col 9)-(line 565,col 20)",
        "(line 567,col 9)-(line 567,col 104)",
        "(line 568,col 9)-(line 568,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handles201Created()",
      "begin_line": 571,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 87)",
        "(line 574,col 9)-(line 574,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchToW3c()",
      "begin_line": 577,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 41)",
        "(line 580,col 9)-(line 580,col 48)",
        "(line 582,col 9)-(line 582,col 34)",
        "(line 583,col 9)-(line 583,col 55)",
        "(line 584,col 9)-(line 584,col 49)",
        "(line 585,col 9)-(line 585,col 41)",
        "(line 586,col 9)-(line 586,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchHandlesXml()",
      "begin_line": 589,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 74)",
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 594,col 33)",
        "(line 595,col 9)-(line 595,col 47)",
        "(line 596,col 9)-(line 596,col 76)",
        "(line 597,col 9)-(line 597,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchHandlesXmlAsHtmlWhenParserSet()",
      "begin_line": 600,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 74)",
        "(line 604,col 9)-(line 604,col 75)",
        "(line 605,col 9)-(line 605,col 33)",
        "(line 606,col 9)-(line 606,col 47)",
        "(line 607,col 9)-(line 607,col 77)",
        "(line 608,col 9)-(line 608,col 161)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.combinesSameHeadersWithComma()",
      "begin_line": 611,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 62)",
        "(line 615,col 9)-(line 615,col 44)",
        "(line 616,col 9)-(line 616,col 18)",
        "(line 618,col 9)-(line 618,col 49)",
        "(line 619,col 9)-(line 619,col 62)",
        "(line 620,col 9)-(line 620,col 72)",
        "(line 622,col 9)-(line 622,col 59)",
        "(line 623,col 9)-(line 623,col 39)",
        "(line 624,col 9)-(line 624,col 48)",
        "(line 625,col 9)-(line 625,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.sendHeadRequest()",
      "begin_line": 628,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 71)",
        "(line 631,col 9)-(line 631,col 75)",
        "(line 632,col 9)-(line 632,col 59)",
        "(line 633,col 9)-(line 633,col 66)",
        "(line 634,col 9)-(line 634,col 42)",
        "(line 635,col 9)-(line 635,col 40)",
        "(line 636,col 9)-(line 636,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchViaHttpProxy()",
      "begin_line": 644,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 41)",
        "(line 647,col 9)-(line 647,col 104)",
        "(line 648,col 9)-(line 648,col 61)",
        "(line 649,col 9)-(line 649,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchViaHttpProxySetByArgument()",
      "begin_line": 652,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 41)",
        "(line 655,col 9)-(line 655,col 73)",
        "(line 656,col 9)-(line 656,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.invalidProxyFails()",
      "begin_line": 659,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 31)",
        "(line 662,col 9)-(line 662,col 41)",
        "(line 663,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.proxyGetAndSet()",
      "begin_line": 671,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 41)",
        "(line 674,col 9)-(line 674,col 104)",
        "(line 675,col 9)-(line 675,col 63)",
        "(line 677,col 9)-(line 677,col 46)",
        "(line 678,col 9)-(line 678,col 34)",
        "(line 679,col 9)-(line 679,col 33)",
        "(line 680,col 9)-(line 680,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.throwsIfRequestBodyForGet()",
      "begin_line": 683,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 31)",
        "(line 686,col 9)-(line 686,col 41)",
        "(line 687,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.canSpecifyResponseCharset()",
      "begin_line": 695,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 94)",
        "(line 699,col 9)-(line 699,col 90)",
        "(line 702,col 9)-(line 702,col 71)",
        "(line 703,col 9)-(line 703,col 43)",
        "(line 704,col 9)-(line 704,col 43)",
        "(line 705,col 9)-(line 705,col 67)",
        "(line 706,col 9)-(line 706,col 62)",
        "(line 707,col 9)-(line 707,col 46)",
        "(line 710,col 9)-(line 710,col 73)",
        "(line 711,col 9)-(line 711,col 43)",
        "(line 712,col 9)-(line 712,col 43)",
        "(line 713,col 9)-(line 713,col 60)",
        "(line 714,col 9)-(line 714,col 62)",
        "(line 715,col 9)-(line 715,col 46)",
        "(line 718,col 9)-(line 718,col 73)",
        "(line 719,col 9)-(line 719,col 43)",
        "(line 720,col 9)-(line 720,col 37)",
        "(line 721,col 9)-(line 721,col 53)",
        "(line 722,col 9)-(line 722,col 43)",
        "(line 723,col 9)-(line 723,col 67)",
        "(line 724,col 9)-(line 724,col 62)",
        "(line 725,col 9)-(line 725,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesUnescapedRedirects()",
      "begin_line": 728,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 68)",
        "(line 733,col 9)-(line 733,col 86)",
        "(line 735,col 9)-(line 735,col 63)",
        "(line 736,col 9)-(line 736,col 35)",
        "(line 737,col 9)-(line 737,col 57)",
        "(line 738,col 9)-(line 738,col 49)",
        "(line 740,col 9)-(line 740,col 87)",
        "(line 741,col 9)-(line 741,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesEscapesInRedirecct()",
      "begin_line": 745,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 88)",
        "(line 747,col 9)-(line 747,col 84)",
        "(line 749,col 9)-(line 749,col 77)",
        "(line 750,col 9)-(line 750,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesUt8fInUrl()",
      "begin_line": 753,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 79)",
        "(line 756,col 9)-(line 756,col 86)",
        "(line 758,col 9)-(line 758,col 63)",
        "(line 759,col 9)-(line 759,col 35)",
        "(line 760,col 9)-(line 760,col 57)",
        "(line 761,col 9)-(line 761,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.inWildUtfRedirect()",
      "begin_line": 764,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 84)",
        "(line 767,col 9)-(line 767,col 35)",
        "(line 768,col 9)-(line 771,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.inWildUtfRedirect2()",
      "begin_line": 774,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 104)",
        "(line 777,col 9)-(line 777,col 35)",
        "(line 778,col 9)-(line 781,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.canInterruptBodyStringRead()",
      "begin_line": 784,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 44)",
        "(line 787,col 9)-(line 799,col 11)",
        "(line 801,col 9)-(line 801,col 23)",
        "(line 802,col 9)-(line 802,col 31)",
        "(line 803,col 9)-(line 803,col 27)",
        "(line 804,col 9)-(line 804,col 43)",
        "(line 805,col 9)-(line 805,col 22)",
        "(line 807,col 9)-(line 807,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.Anonymous-58cab863-b5d5-4071-b83b-230d91c786b7.run()",
      "begin_line": 788,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 789,col 17)-(line 796,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.canInterruptDocumentRead()",
      "begin_line": 810,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 44)",
        "(line 813,col 9)-(line 825,col 11)",
        "(line 827,col 9)-(line 827,col 23)",
        "(line 828,col 9)-(line 828,col 31)",
        "(line 829,col 9)-(line 829,col 27)",
        "(line 830,col 9)-(line 830,col 43)",
        "(line 831,col 9)-(line 831,col 22)",
        "(line 833,col 9)-(line 833,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.Anonymous-efd23fd2-f0dd-4748-b9c8-62a216580512.run()",
      "begin_line": 814,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 815,col 17)-(line 822,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesEscapedRedirectUrls()",
      "begin_line": 836,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 129)",
        "(line 846,col 9)-(line 848,col 27)",
        "(line 849,col 9)-(line 849,col 35)",
        "(line 850,col 9)-(line 850,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesUnicodeInQuery()",
      "begin_line": 853,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 83)",
        "(line 855,col 9)-(line 855,col 61)",
        "(line 857,col 9)-(line 857,col 83)",
        "(line 858,col 9)-(line 858,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.bodyAfterParseThrowsValidationError()",
      "begin_line": 861,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 67)",
        "(line 863,col 9)-(line 863,col 35)",
        "(line 864,col 9)-(line 864,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.bodyAndBytesAvailableBeforeParse()",
      "begin_line": 867,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 67)",
        "(line 869,col 9)-(line 869,col 33)",
        "(line 870,col 9)-(line 870,col 49)",
        "(line 871,col 9)-(line 871,col 41)",
        "(line 872,col 9)-(line 872,col 39)",
        "(line 874,col 9)-(line 874,col 35)",
        "(line 875,col 9)-(line 875,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.parseParseThrowsValidates()",
      "begin_line": 878,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 67)",
        "(line 880,col 9)-(line 880,col 35)",
        "(line 881,col 9)-(line 881,col 56)",
        "(line 882,col 9)-(line 882,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.multipleParsesOkAfterBufferUp()",
      "begin_line": 885,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 78)",
        "(line 888,col 9)-(line 888,col 35)",
        "(line 889,col 9)-(line 889,col 56)",
        "(line 891,col 9)-(line 891,col 36)",
        "(line 892,col 9)-(line 892,col 57)"
      ]
    }
  ]
}