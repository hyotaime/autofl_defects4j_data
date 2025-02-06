{
  "filepath": "/tmp/Jsoup-89b/src/test/java/org/jsoup/integration/UrlConnectTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// todo: rebuild these into a local Jetty test server, so not reliant on the vagaries of the internet.\nUrlConnectTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 642,
      "comment": "\n Tests the URL connection. Not enabled by default, so tests don\u0027t require network connection.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "WEBSITE_WITH_INVALID_CERTIFICATE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEBSITE_WITH_SNI"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "browserUa"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchBaidu()",
      "begin_line": 40,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 100)",
        "(line 43,col 9)-(line 43,col 35)",
        "(line 45,col 9)-(line 45,col 74)",
        "(line 46,col 9)-(line 46,col 43)",
        "(line 47,col 9)-(line 47,col 41)",
        "(line 48,col 9)-(line 48,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.exceptOnUnknownContentType()",
      "begin_line": 51,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 64)",
        "(line 54,col 9)-(line 54,col 30)",
        "(line 55,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignoresContentTypeIfSoConfigured()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 105)",
        "(line 70,col 9)-(line 70,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ihVal(java.lang.String, org.jsoup.nodes.Document)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsTempRedirect()",
      "begin_line": 77,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 83)",
        "(line 80,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsNewTempRedirect()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 83)",
        "(line 87,col 9)-(line 87,col 33)",
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.postRedirectsFetchWithGet()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 97,col 48)",
        "(line 98,col 9)-(line 98,col 71)",
        "(line 99,col 9)-(line 99,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRedirectToHttps()",
      "begin_line": 102,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 90)",
        "(line 105,col 9)-(line 105,col 28)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRelativeRedirect()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 87)",
        "(line 113,col 9)-(line 113,col 34)",
        "(line 114,col 9)-(line 114,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRelativeDotRedirect()",
      "begin_line": 117,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 91)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 123,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRelativeDotRedirect2()",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.followsRedirectsWithWithespaces()",
      "begin_line": 135,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 69)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 139,col 9)-(line 139,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.gracefullyHandleBrokenLocationRedirect()",
      "begin_line": 142,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 60)",
        "(line 145,col 9)-(line 145,col 18)",
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.throwsExceptionOnError()",
      "begin_line": 149,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 61)",
        "(line 152,col 9)-(line 152,col 44)",
        "(line 153,col 9)-(line 153,col 30)",
        "(line 154,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignoresExceptionIfSoConfigured()",
      "begin_line": 166,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 103)",
        "(line 169,col 9)-(line 169,col 48)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 44)",
        "(line 172,col 9)-(line 172,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignores500tExceptionIfSoConfigured()",
      "begin_line": 175,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 106)",
        "(line 178,col 9)-(line 178,col 48)",
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 180,col 44)",
        "(line 181,col 9)-(line 181,col 63)",
        "(line 182,col 9)-(line 182,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignores500WithNoContentExceptionIfSoConfigured()",
      "begin_line": 185,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 117)",
        "(line 188,col 9)-(line 188,col 48)",
        "(line 189,col 9)-(line 189,col 35)",
        "(line 190,col 9)-(line 190,col 44)",
        "(line 191,col 9)-(line 191,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.ignores200WithNoContentExceptionIfSoConfigured()",
      "begin_line": 194,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 117)",
        "(line 197,col 9)-(line 197,col 48)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 199,col 9)-(line 199,col 44)",
        "(line 200,col 9)-(line 200,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handles200WithNoContent()",
      "begin_line": 203,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 34)",
        "(line 208,col 9)-(line 208,col 48)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 212,col 9)-(line 215,col 34)",
        "(line 216,col 9)-(line 216,col 28)",
        "(line 217,col 9)-(line 217,col 26)",
        "(line 218,col 9)-(line 218,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.doesntRedirectIfSoConfigured()",
      "begin_line": 221,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 106)",
        "(line 224,col 9)-(line 224,col 48)",
        "(line 225,col 9)-(line 225,col 44)",
        "(line 226,col 9)-(line 226,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.redirectsResponseCookieToNextResponse()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 90)",
        "(line 232,col 9)-(line 232,col 48)",
        "(line 233,col 9)-(line 233,col 54)",
        "(line 234,col 9)-(line 234,col 35)",
        "(line 235,col 9)-(line 235,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.maximumRedirects()",
      "begin_line": 238,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 30)",
        "(line 241,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesDodgyCharset()",
      "begin_line": 250,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 72)",
        "(line 254,col 9)-(line 254,col 63)",
        "(line 255,col 9)-(line 255,col 76)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 50)",
        "(line 259,col 9)-(line 259,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.maxBodySize()",
      "begin_line": 262,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 68)",
        "(line 266,col 9)-(line 266,col 70)",
        "(line 267,col 9)-(line 267,col 91)",
        "(line 268,col 9)-(line 268,col 93)",
        "(line 269,col 9)-(line 269,col 92)",
        "(line 270,col 9)-(line 270,col 87)",
        "(line 272,col 9)-(line 272,col 35)",
        "(line 273,col 9)-(line 273,col 72)",
        "(line 274,col 9)-(line 274,col 62)",
        "(line 275,col 9)-(line 275,col 64)",
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 277,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.testUnsafeFail()",
      "begin_line": 287,
      "end_line": 291,
      "comment": "\n     * Verify that security disabling feature works properly.\n     * \u003cp/\u003e\n     * 1. try to hit url with invalid certificate and evaluate that exception is thrown\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 54)",
        "(line 290,col 9)-(line 290,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.testSNIFail()",
      "begin_line": 303,
      "end_line": 307,
      "comment": "\n     * Verify that requests to websites with SNI fail on jdk 1.6\n     * \u003cp/\u003e\n     * read for more details:\n     * http://en.wikipedia.org/wiki/Server_Name_Indication\n     *\n     * Test is ignored independent from others as it requires JDK 1.6\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 38)",
        "(line 306,col 9)-(line 306,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldWorkForCharsetInExtraAttribute()",
      "begin_line": 309,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 101)",
        "(line 312,col 9)-(line 312,col 35)",
        "(line 313,col 9)-(line 313,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags()",
      "begin_line": 320,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 79)",
        "(line 323,col 9)-(line 323,col 20)",
        "(line 324,col 9)-(line 324,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldParseBrokenHtml5MetaCharsetTagCorrectly()",
      "begin_line": 327,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 80)",
        "(line 330,col 9)-(line 330,col 20)",
        "(line 331,col 9)-(line 331,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldEmptyMetaCharsetCorrectly()",
      "begin_line": 334,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 87)",
        "(line 337,col 9)-(line 337,col 20)",
        "(line 338,col 9)-(line 338,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.shouldWorkForDuplicateCharsetInTag()",
      "begin_line": 341,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 83)",
        "(line 344,col 9)-(line 344,col 35)",
        "(line 345,col 9)-(line 345,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.baseHrefCorrectAfterHttpEquiv()",
      "begin_line": 348,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 113)",
        "(line 352,col 9)-(line 352,col 35)",
        "(line 353,col 9)-(line 353,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.postHtmlFile()",
      "begin_line": 359,
      "end_line": 381,
      "comment": "\n     * Test fetching a form, and submitting it with a file attached.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 82)",
        "(line 362,col 9)-(line 362,col 70)",
        "(line 363,col 9)-(line 363,col 40)",
        "(line 365,col 9)-(line 365,col 75)",
        "(line 366,col 9)-(line 366,col 65)",
        "(line 368,col 9)-(line 368,col 56)",
        "(line 369,col 9)-(line 369,col 37)",
        "(line 370,col 9)-(line 370,col 37)",
        "(line 372,col 9)-(line 372,col 32)",
        "(line 373,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 380,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handles201Created()",
      "begin_line": 383,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 87)",
        "(line 386,col 9)-(line 386,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchToW3c()",
      "begin_line": 389,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 41)",
        "(line 392,col 9)-(line 392,col 48)",
        "(line 394,col 9)-(line 394,col 34)",
        "(line 395,col 9)-(line 395,col 55)",
        "(line 396,col 9)-(line 396,col 49)",
        "(line 397,col 9)-(line 397,col 41)",
        "(line 398,col 9)-(line 398,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchHandlesXml()",
      "begin_line": 401,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 74)",
        "(line 405,col 9)-(line 405,col 47)",
        "(line 406,col 9)-(line 406,col 33)",
        "(line 407,col 9)-(line 407,col 47)",
        "(line 408,col 9)-(line 408,col 76)",
        "(line 409,col 9)-(line 409,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchHandlesXmlAsHtmlWhenParserSet()",
      "begin_line": 412,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 74)",
        "(line 416,col 9)-(line 416,col 75)",
        "(line 417,col 9)-(line 417,col 33)",
        "(line 418,col 9)-(line 418,col 47)",
        "(line 419,col 9)-(line 419,col 77)",
        "(line 420,col 9)-(line 420,col 161)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.combinesSameHeadersWithComma()",
      "begin_line": 423,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 62)",
        "(line 427,col 9)-(line 427,col 44)",
        "(line 428,col 9)-(line 428,col 18)",
        "(line 430,col 9)-(line 430,col 49)",
        "(line 431,col 9)-(line 431,col 62)",
        "(line 432,col 9)-(line 432,col 72)",
        "(line 434,col 9)-(line 434,col 59)",
        "(line 435,col 9)-(line 435,col 39)",
        "(line 436,col 9)-(line 436,col 48)",
        "(line 437,col 9)-(line 437,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.sendHeadRequest()",
      "begin_line": 440,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 71)",
        "(line 443,col 9)-(line 443,col 75)",
        "(line 444,col 9)-(line 444,col 59)",
        "(line 445,col 9)-(line 445,col 66)",
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 447,col 40)",
        "(line 448,col 9)-(line 448,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchViaHttpProxy()",
      "begin_line": 456,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 41)",
        "(line 459,col 9)-(line 459,col 104)",
        "(line 460,col 9)-(line 460,col 61)",
        "(line 461,col 9)-(line 461,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.fetchViaHttpProxySetByArgument()",
      "begin_line": 464,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 41)",
        "(line 467,col 9)-(line 467,col 73)",
        "(line 468,col 9)-(line 468,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.invalidProxyFails()",
      "begin_line": 471,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 31)",
        "(line 474,col 9)-(line 474,col 41)",
        "(line 475,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.proxyGetAndSet()",
      "begin_line": 483,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 41)",
        "(line 486,col 9)-(line 486,col 104)",
        "(line 487,col 9)-(line 487,col 63)",
        "(line 489,col 9)-(line 489,col 46)",
        "(line 490,col 9)-(line 490,col 34)",
        "(line 491,col 9)-(line 491,col 33)",
        "(line 492,col 9)-(line 492,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.throwsIfRequestBodyForGet()",
      "begin_line": 495,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 31)",
        "(line 498,col 9)-(line 498,col 41)",
        "(line 499,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.canSpecifyResponseCharset()",
      "begin_line": 507,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 94)",
        "(line 511,col 9)-(line 511,col 90)",
        "(line 514,col 9)-(line 514,col 71)",
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 516,col 43)",
        "(line 517,col 9)-(line 517,col 67)",
        "(line 518,col 9)-(line 518,col 62)",
        "(line 519,col 9)-(line 519,col 46)",
        "(line 522,col 9)-(line 522,col 73)",
        "(line 523,col 9)-(line 523,col 43)",
        "(line 524,col 9)-(line 524,col 43)",
        "(line 525,col 9)-(line 525,col 60)",
        "(line 526,col 9)-(line 526,col 62)",
        "(line 527,col 9)-(line 527,col 46)",
        "(line 530,col 9)-(line 530,col 73)",
        "(line 531,col 9)-(line 531,col 43)",
        "(line 532,col 9)-(line 532,col 37)",
        "(line 533,col 9)-(line 533,col 53)",
        "(line 534,col 9)-(line 534,col 43)",
        "(line 535,col 9)-(line 535,col 67)",
        "(line 536,col 9)-(line 536,col 62)",
        "(line 537,col 9)-(line 537,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesUnescapedRedirects()",
      "begin_line": 540,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 68)",
        "(line 545,col 9)-(line 545,col 86)",
        "(line 547,col 9)-(line 547,col 63)",
        "(line 548,col 9)-(line 548,col 35)",
        "(line 549,col 9)-(line 549,col 57)",
        "(line 550,col 9)-(line 550,col 49)",
        "(line 552,col 9)-(line 552,col 87)",
        "(line 553,col 9)-(line 553,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesEscapesInRedirecct()",
      "begin_line": 557,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 88)",
        "(line 559,col 9)-(line 559,col 84)",
        "(line 561,col 9)-(line 561,col 77)",
        "(line 562,col 9)-(line 562,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesUt8fInUrl()",
      "begin_line": 565,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 79)",
        "(line 568,col 9)-(line 568,col 86)",
        "(line 570,col 9)-(line 570,col 63)",
        "(line 571,col 9)-(line 571,col 35)",
        "(line 572,col 9)-(line 572,col 57)",
        "(line 573,col 9)-(line 573,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.inWildUtfRedirect()",
      "begin_line": 576,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 84)",
        "(line 579,col 9)-(line 579,col 35)",
        "(line 580,col 9)-(line 583,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.inWildUtfRedirect2()",
      "begin_line": 586,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 104)",
        "(line 589,col 9)-(line 589,col 35)",
        "(line 590,col 9)-(line 593,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesEscapedRedirectUrls()",
      "begin_line": 596,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 129)",
        "(line 606,col 9)-(line 608,col 27)",
        "(line 609,col 9)-(line 609,col 35)",
        "(line 610,col 9)-(line 610,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesUnicodeInQuery()",
      "begin_line": 613,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 83)",
        "(line 615,col 9)-(line 615,col 61)",
        "(line 617,col 9)-(line 617,col 83)",
        "(line 618,col 9)-(line 618,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handlesSuperDeepPage()",
      "begin_line": 621,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 48)",
        "(line 625,col 9)-(line 625,col 61)",
        "(line 626,col 9)-(line 626,col 48)",
        "(line 627,col 9)-(line 627,col 86)",
        "(line 628,col 9)-(line 628,col 54)",
        "(line 630,col 9)-(line 630,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.UrlConnectTest.handles966()",
      "begin_line": 633,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 73)",
        "(line 639,col 9)-(line 639,col 47)"
      ]
    }
  ]
}