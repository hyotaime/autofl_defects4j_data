{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/time/junit/WeekTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeekTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 75,
      "end_line": 537,
      "comment": "\n * Tests for the {@link Week} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "w1Y1900"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " A week. "
    },
    {
      "type": "field",
      "varNames": [
        "w2Y1900"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " A week. "
    },
    {
      "type": "field",
      "varNames": [
        "w51Y9999"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " A week. "
    },
    {
      "type": "field",
      "varNames": [
        "w52Y9999"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " A week. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.suite()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.WeekTests.WeekTests(java.lang.String)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.setUp()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testEquals()",
      "begin_line": 120,
      "end_line": 135,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 34)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 31)",
        "(line 129,col 9)-(line 129,col 34)",
        "(line 131,col 9)-(line 131,col 31)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 133,col 9)-(line 133,col 31)",
        "(line 134,col 9)-(line 134,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW1Y1900Previous()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Request the week before week 1, 1900: it should be \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW1Y1900Next()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Request the week after week 1, 1900: it should be week 2, 1900.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW52Y9999Previous()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Request the week before w52, 9999: it should be week 51, 9999.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 56)",
        "(line 158,col 9)-(line 158,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW52Y9999Next()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Request the week after w52, 9999: it should be \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 48)",
        "(line 166,col 9)-(line 166,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testSerialization()",
      "begin_line": 172,
      "end_line": 193,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 23)",
        "(line 177,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testHashcode()",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 36)",
        "(line 200,col 9)-(line 200,col 36)",
        "(line 201,col 9)-(line 201,col 34)",
        "(line 202,col 9)-(line 202,col 31)",
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testNotCloneable()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * The {@link Week} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 35)",
        "(line 212,col 9)-(line 212,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testWeek12005()",
      "begin_line": 235,
      "end_line": 251,
      "comment": "\n     * The first week in 2005 should span the range:\n     *\n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * Europe/London    | 1104710400000 | 1105315199999 |  3-Jan-2005 | 9-Jan-2005\n     * Europe/Paris     | 1104706800000 | 1105311599999 |  3-Jan-2005 | 2-Jan-2005\n     * America/New_York | 1104037200000 | 1104641999999 | 26-Dec-2004 | 1-Jan-2005\n     *\n     * In London and Paris, Monday is the first day of the week, while in the\n     * US it is Sunday.\n     *\n     * Previously, we were using these values, but see Java Bug ID 4960215:\n     *\n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * Europe/London    | 1104105600000 | 1104710399999 | 27-Dec-2004 | 2-Jan-2005\n     * Europe/Paris     | 1104102000000 | 1104706799999 | 27-Dec-2004 | 2-Jan-2005\n     * America/New_York | 1104037200000 | 1104641999999 | 26-Dec-2004 | 1-Jan-2005\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 36)",
        "(line 237,col 9)-(line 238,col 66)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 65)",
        "(line 241,col 9)-(line 241,col 64)",
        "(line 242,col 9)-(line 243,col 69)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 65)",
        "(line 246,col 9)-(line 246,col 64)",
        "(line 247,col 9)-(line 248,col 69)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 250,col 9)-(line 250,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testWeek532005()",
      "begin_line": 270,
      "end_line": 287,
      "comment": "\n     * The 53rd week in 2004 in London and Paris should span the range:\n     *\n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * Europe/London    | 1104105600000 | 1104710399999 | 27-Dec-2004 | 02-Jan-2005\n     * Europe/Paris     | 1104102000000 | 1104706799999 | 27-Dec-2004 | 02-Jan-2005\n     *\n     * The 53rd week in 2005 in New York should span the range:\n     *\n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * America/New_York | 1135486800000 | 1136091599999 | 25-Dec-2005 | 31-Dec-2005\n     *\n     * In London and Paris, Monday is the first day of the week, while in the\n     * US it is Sunday.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 37)",
        "(line 272,col 9)-(line 273,col 66)",
        "(line 274,col 9)-(line 274,col 40)",
        "(line 275,col 9)-(line 275,col 65)",
        "(line 276,col 9)-(line 276,col 64)",
        "(line 277,col 9)-(line 278,col 69)",
        "(line 279,col 9)-(line 279,col 40)",
        "(line 280,col 9)-(line 280,col 65)",
        "(line 281,col 9)-(line 281,col 64)",
        "(line 282,col 9)-(line 282,col 32)",
        "(line 283,col 9)-(line 284,col 69)",
        "(line 285,col 9)-(line 285,col 65)",
        "(line 286,col 9)-(line 286,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testBug1448828()",
      "begin_line": 292,
      "end_line": 304,
      "comment": "\n     * A test case for bug 1448828.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 43)",
        "(line 294,col 9)-(line 294,col 37)",
        "(line 295,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testBug1498805()",
      "begin_line": 309,
      "end_line": 323,
      "comment": "\n     * A test case for bug 1498805.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 43)",
        "(line 311,col 9)-(line 311,col 37)",
        "(line 312,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetFirstMillisecond()",
      "begin_line": 328,
      "end_line": 337,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 330,col 37)",
        "(line 331,col 9)-(line 331,col 51)",
        "(line 332,col 9)-(line 332,col 67)",
        "(line 333,col 9)-(line 333,col 35)",
        "(line 334,col 9)-(line 334,col 58)",
        "(line 335,col 9)-(line 335,col 33)",
        "(line 336,col 9)-(line 336,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 342,
      "end_line": 364,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 36)",
        "(line 344,col 9)-(line 344,col 43)",
        "(line 345,col 9)-(line 345,col 37)",
        "(line 346,col 9)-(line 353,col 9)",
        "(line 356,col 9)-(line 356,col 29)",
        "(line 357,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 369,
      "end_line": 384,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 35)",
        "(line 371,col 9)-(line 371,col 75)",
        "(line 372,col 9)-(line 372,col 71)",
        "(line 373,col 9)-(line 373,col 69)",
        "(line 376,col 9)-(line 376,col 29)",
        "(line 377,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetLastMillisecond()",
      "begin_line": 389,
      "end_line": 398,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 43)",
        "(line 391,col 9)-(line 391,col 37)",
        "(line 392,col 9)-(line 392,col 51)",
        "(line 393,col 9)-(line 393,col 67)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 59)",
        "(line 396,col 9)-(line 396,col 33)",
        "(line 397,col 9)-(line 397,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 403,
      "end_line": 425,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 35)",
        "(line 405,col 9)-(line 405,col 43)",
        "(line 406,col 9)-(line 406,col 37)",
        "(line 407,col 9)-(line 414,col 9)",
        "(line 417,col 9)-(line 417,col 29)",
        "(line 418,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 430,
      "end_line": 445,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 75)",
        "(line 433,col 9)-(line 433,col 71)",
        "(line 434,col 9)-(line 434,col 69)",
        "(line 437,col 9)-(line 437,col 29)",
        "(line 438,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetSerialIndex()",
      "begin_line": 450,
      "end_line": 455,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 35)",
        "(line 452,col 9)-(line 452,col 50)",
        "(line 453,col 9)-(line 453,col 30)",
        "(line 454,col 9)-(line 454,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testNext()",
      "begin_line": 460,
      "end_line": 467,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 36)",
        "(line 462,col 9)-(line 462,col 28)",
        "(line 463,col 9)-(line 463,col 50)",
        "(line 464,col 9)-(line 464,col 38)",
        "(line 465,col 9)-(line 465,col 31)",
        "(line 466,col 9)-(line 466,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetStart()",
      "begin_line": 472,
      "end_line": 481,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 43)",
        "(line 474,col 9)-(line 474,col 40)",
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 53)",
        "(line 477,col 9)-(line 477,col 41)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 479,col 50)",
        "(line 480,col 9)-(line 480,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetEnd()",
      "begin_line": 486,
      "end_line": 495,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 43)",
        "(line 488,col 9)-(line 488,col 40)",
        "(line 489,col 9)-(line 489,col 58)",
        "(line 490,col 9)-(line 490,col 55)",
        "(line 491,col 9)-(line 491,col 43)",
        "(line 492,col 9)-(line 492,col 35)",
        "(line 493,col 9)-(line 493,col 48)",
        "(line 494,col 9)-(line 494,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testConstructor()",
      "begin_line": 500,
      "end_line": 535,
      "comment": "\n     * A test for a problem in constructing a new Week instance.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 49)",
        "(line 502,col 9)-(line 502,col 51)",
        "(line 503,col 9)-(line 503,col 50)",
        "(line 504,col 9)-(line 504,col 71)",
        "(line 505,col 9)-(line 506,col 60)",
        "(line 509,col 9)-(line 509,col 63)",
        "(line 510,col 9)-(line 510,col 52)",
        "(line 511,col 9)-(line 511,col 41)",
        "(line 512,col 9)-(line 512,col 31)",
        "(line 513,col 9)-(line 514,col 31)",
        "(line 515,col 9)-(line 515,col 38)",
        "(line 517,col 9)-(line 517,col 37)",
        "(line 518,col 9)-(line 518,col 64)",
        "(line 519,col 9)-(line 519,col 78)",
        "(line 521,col 9)-(line 521,col 63)",
        "(line 522,col 9)-(line 522,col 52)",
        "(line 523,col 9)-(line 523,col 41)",
        "(line 525,col 9)-(line 525,col 26)",
        "(line 526,col 9)-(line 527,col 31)",
        "(line 528,col 9)-(line 528,col 38)",
        "(line 529,col 9)-(line 530,col 40)",
        "(line 531,col 9)-(line 531,col 38)",
        "(line 533,col 9)-(line 533,col 39)",
        "(line 534,col 9)-(line 534,col 39)"
      ]
    }
  ]
}