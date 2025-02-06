{
  "filepath": "/tmp/Jsoup-89b/src/test/java/org/jsoup/integration/ConnectTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConnectTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 466,
      "comment": "\n * Tests Jsoup.connect against a local server.\n "
    },
    {
      "type": "field",
      "varNames": [
        "echoUrl"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.setUp()",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 27)",
        "(line 41,col 9)-(line 41,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.tearDown()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.canConnectToLocalServer()",
      "begin_line": 49,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 52,col 48)",
        "(line 53,col 9)-(line 53,col 41)",
        "(line 54,col 9)-(line 54,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.fetchURl()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 64)",
        "(line 60,col 9)-(line 60,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.fetchURIWithWihtespace()",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 70)",
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.exceptOnUnsupportedProtocol()",
      "begin_line": 70,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 41)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.ihVal(java.lang.String, org.jsoup.nodes.Document)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 82)",
        "(line 86,col 9)-(line 86,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.doesPost()",
      "begin_line": 89,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 94,col 20)",
        "(line 96,col 9)-(line 96,col 51)",
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 98,col 57)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 100,col 61)",
        "(line 101,col 9)-(line 101,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.sendsRequestBodyJsonWithData()",
      "begin_line": 104,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 42)",
        "(line 107,col 9)-(line 112,col 20)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 69)",
        "(line 115,col 9)-(line 115,col 61)",
        "(line 116,col 9)-(line 116,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.sendsRequestBodyJsonWithoutData()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 42)",
        "(line 122,col 9)-(line 126,col 20)",
        "(line 127,col 9)-(line 127,col 51)",
        "(line 128,col 9)-(line 128,col 69)",
        "(line 129,col 9)-(line 129,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.sendsRequestBody()",
      "begin_line": 132,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 42)",
        "(line 135,col 9)-(line 139,col 20)",
        "(line 140,col 9)-(line 140,col 51)",
        "(line 141,col 9)-(line 141,col 63)",
        "(line 142,col 9)-(line 142,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.sendsRequestBodyWithUrlParams()",
      "begin_line": 145,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 42)",
        "(line 148,col 9)-(line 153,col 20)",
        "(line 154,col 9)-(line 154,col 51)",
        "(line 155,col 9)-(line 155,col 117)",
        "(line 156,col 9)-(line 156,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.doesGet()",
      "begin_line": 159,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 41)",
        "(line 166,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 167,col 82)",
        "(line 168,col 9)-(line 168,col 61)",
        "(line 169,col 9)-(line 169,col 58)",
        "(line 170,col 9)-(line 170,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.doesPut()",
      "begin_line": 173,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 179,col 23)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 60)",
        "(line 184,col 9)-(line 184,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.canInterruptBodyStringRead()",
      "begin_line": 188,
      "end_line": 214,
      "comment": " Slow Rider tests. Ignored by default so tests don\u0027t take aaages",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 204,col 11)",
        "(line 206,col 9)-(line 206,col 23)",
        "(line 207,col 9)-(line 207,col 31)",
        "(line 208,col 9)-(line 208,col 27)",
        "(line 209,col 9)-(line 209,col 43)",
        "(line 210,col 9)-(line 210,col 22)",
        "(line 212,col 9)-(line 212,col 41)",
        "(line 213,col 9)-(line 213,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.Anonymous-11a5c710-72df-4fc2-a22c-d84461f333d5.run()",
      "begin_line": 193,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 194,col 17)-(line 201,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.canInterruptDocumentRead()",
      "begin_line": 216,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 44)",
        "(line 220,col 9)-(line 232,col 11)",
        "(line 234,col 9)-(line 234,col 23)",
        "(line 235,col 9)-(line 235,col 31)",
        "(line 236,col 9)-(line 236,col 27)",
        "(line 237,col 9)-(line 237,col 43)",
        "(line 238,col 9)-(line 238,col 22)",
        "(line 240,col 9)-(line 240,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.Anonymous-8e1ecaaa-2a0c-41ef-9aef-c9c6a63024a9.run()",
      "begin_line": 221,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 222,col 17)-(line 229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.totalTimeout()",
      "begin_line": 243,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 31)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 247,col 30)",
        "(line 248,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.slowReadOk()",
      "begin_line": 261,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 19)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 269,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.infiniteReadSupported()",
      "begin_line": 272,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 277,col 19)",
        "(line 279,col 9)-(line 279,col 43)",
        "(line 280,col 9)-(line 280,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.postFiles()",
      "begin_line": 286,
      "end_line": 324,
      "comment": "\n     * Tests upload of content to a remote service.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 63)",
        "(line 289,col 9)-(line 289,col 69)",
        "(line 291,col 9)-(line 297,col 20)",
        "(line 299,col 9)-(line 299,col 47)",
        "(line 301,col 9)-(line 301,col 92)",
        "(line 302,col 9)-(line 302,col 71)",
        "(line 303,col 9)-(line 303,col 81)",
        "(line 304,col 9)-(line 304,col 66)",
        "(line 306,col 9)-(line 306,col 77)",
        "(line 307,col 9)-(line 307,col 69)",
        "(line 308,col 9)-(line 308,col 73)",
        "(line 309,col 9)-(line 309,col 64)",
        "(line 311,col 9)-(line 311,col 53)",
        "(line 312,col 9)-(line 312,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.multipleParsesOkAfterBufferUp()",
      "begin_line": 326,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 78)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 56)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.bodyAfterParseThrowsValidationError()",
      "begin_line": 336,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 67)",
        "(line 338,col 9)-(line 338,col 35)",
        "(line 339,col 9)-(line 339,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.bodyAndBytesAvailableBeforeParse()",
      "begin_line": 342,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 67)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 345,col 49)",
        "(line 346,col 9)-(line 346,col 41)",
        "(line 347,col 9)-(line 347,col 39)",
        "(line 349,col 9)-(line 349,col 35)",
        "(line 350,col 9)-(line 350,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.parseParseThrowsValidates()",
      "begin_line": 353,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 67)",
        "(line 355,col 9)-(line 355,col 35)",
        "(line 356,col 9)-(line 356,col 56)",
        "(line 357,col 9)-(line 357,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.multiCookieSet()",
      "begin_line": 361,
      "end_line": 362,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.supportsDeflate()",
      "begin_line": 379,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 78)",
        "(line 382,col 9)-(line 382,col 64)",
        "(line 384,col 9)-(line 384,col 35)",
        "(line 385,col 9)-(line 385,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.handlesEmptyStreamDuringParseRead()",
      "begin_line": 388,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 23)",
        "(line 396,col 9)-(line 396,col 30)",
        "(line 397,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.handlesEmtpyStreamDuringBufferdRead()",
      "begin_line": 406,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 23)",
        "(line 412,col 9)-(line 412,col 30)",
        "(line 413,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.handlesRedirect()",
      "begin_line": 421,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 19)",
        "(line 426,col 9)-(line 426,col 41)",
        "(line 427,col 9)-(line 427,col 48)",
        "(line 429,col 9)-(line 429,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.handlesEmptyRedirect()",
      "begin_line": 432,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 30)",
        "(line 434,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.doesNotPostFor302()",
      "begin_line": 444,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 448,col 20)",
        "(line 450,col 9)-(line 450,col 54)",
        "(line 451,col 9)-(line 451,col 50)",
        "(line 452,col 9)-(line 452,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.ConnectTest.doesPostFor307()",
      "begin_line": 455,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 460,col 20)",
        "(line 462,col 9)-(line 462,col 54)",
        "(line 463,col 9)-(line 463,col 51)",
        "(line 464,col 9)-(line 464,col 51)"
      ]
    }
  ]
}