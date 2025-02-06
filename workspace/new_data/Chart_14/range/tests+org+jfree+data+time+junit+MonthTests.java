{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/data/time/junit/MonthTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MonthTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 77,
      "end_line": 456,
      "comment": "\n * Tests for the {@link Month} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "jan1900"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " A month. "
    },
    {
      "type": "field",
      "varNames": [
        "feb1900"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A month. "
    },
    {
      "type": "field",
      "varNames": [
        "nov9999"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " A month. "
    },
    {
      "type": "field",
      "varNames": [
        "dec9999"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " A month. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.suite()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.MonthTests.MonthTests(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.setUp()",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 63)",
        "(line 114,col 9)-(line 114,col 64)",
        "(line 115,col 9)-(line 115,col 64)",
        "(line 116,col 9)-(line 116,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testEqualsSelf()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Check that a Month instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testEquals()",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 55)",
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDateConstructor1()",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * In GMT, the end of Feb 2000 is java.util.Date(951,868,799,999L).  Use \n     * this to check the Month constructor.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 52)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 60)",
        "(line 147,col 9)-(line 147,col 60)",
        "(line 149,col 9)-(line 149,col 61)",
        "(line 150,col 9)-(line 150,col 62)",
        "(line 152,col 9)-(line 152,col 58)",
        "(line 153,col 9)-(line 153,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDateConstructor2()",
      "begin_line": 161,
      "end_line": 174,
      "comment": "\n     * In Auckland, the end of Feb 2000 is java.util.Date(951,821,999,999L).\n     * Use this to check the Month constructor.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 65)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 165,col 60)",
        "(line 166,col 9)-(line 166,col 60)",
        "(line 168,col 9)-(line 168,col 61)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testJan1900Previous()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Set up a month equal to Jan 1900.  Request the previous month, it should\n     * be null.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 57)",
        "(line 182,col 9)-(line 182,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testJan1900Next()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Set up a month equal to Jan 1900.  Request the next month, it should be \n     * Feb 1900.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 49)",
        "(line 191,col 9)-(line 191,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDec9999Previous()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Set up a month equal to Dec 9999.  Request the previous month, it should\n     * be Nov 9999.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 57)",
        "(line 200,col 9)-(line 200,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDec9999Next()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Set up a month equal to Dec 9999.  Request the next month, it should be\n     * null.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 49)",
        "(line 209,col 9)-(line 209,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testParseMonth()",
      "begin_line": 215,
      "end_line": 249,
      "comment": "\n     * Tests the string parsing code...\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 27)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 42)",
        "(line 227,col 9)-(line 227,col 54)",
        "(line 230,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 42)",
        "(line 237,col 9)-(line 237,col 54)",
        "(line 240,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 42)",
        "(line 247,col 9)-(line 247,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testSerialization()",
      "begin_line": 254,
      "end_line": 276,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 257,col 24)",
        "(line 259,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testHashcode()",
      "begin_line": 281,
      "end_line": 288,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 284,col 34)",
        "(line 285,col 9)-(line 285,col 31)",
        "(line 286,col 9)-(line 286,col 31)",
        "(line 287,col 9)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testNotCloneable()",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n     * The {@link Month} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 37)",
        "(line 295,col 9)-(line 295,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetFirstMillisecond()",
      "begin_line": 301,
      "end_line": 310,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 37)",
        "(line 304,col 9)-(line 304,col 51)",
        "(line 305,col 9)-(line 305,col 67)",
        "(line 306,col 9)-(line 306,col 37)",
        "(line 307,col 9)-(line 307,col 59)",
        "(line 308,col 9)-(line 308,col 33)",
        "(line 309,col 9)-(line 309,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 315,
      "end_line": 330,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 37)",
        "(line 317,col 9)-(line 317,col 68)",
        "(line 318,col 9)-(line 318,col 49)",
        "(line 319,col 9)-(line 319,col 63)",
        "(line 322,col 9)-(line 322,col 29)",
        "(line 323,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 335,
      "end_line": 350,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 37)",
        "(line 337,col 9)-(line 337,col 75)",
        "(line 338,col 9)-(line 338,col 71)",
        "(line 339,col 9)-(line 339,col 69)",
        "(line 342,col 9)-(line 342,col 29)",
        "(line 343,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetLastMillisecond()",
      "begin_line": 355,
      "end_line": 364,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 43)",
        "(line 357,col 9)-(line 357,col 37)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 359,col 9)-(line 359,col 67)",
        "(line 360,col 9)-(line 360,col 37)",
        "(line 361,col 9)-(line 361,col 58)",
        "(line 362,col 9)-(line 362,col 33)",
        "(line 363,col 9)-(line 363,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 369,
      "end_line": 384,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 37)",
        "(line 371,col 9)-(line 371,col 68)",
        "(line 372,col 9)-(line 372,col 49)",
        "(line 373,col 9)-(line 373,col 62)",
        "(line 376,col 9)-(line 376,col 29)",
        "(line 377,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 389,
      "end_line": 404,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 37)",
        "(line 391,col 9)-(line 391,col 75)",
        "(line 392,col 9)-(line 392,col 71)",
        "(line 393,col 9)-(line 393,col 68)",
        "(line 396,col 9)-(line 396,col 29)",
        "(line 397,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetSerialIndex()",
      "begin_line": 409,
      "end_line": 414,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 37)",
        "(line 411,col 9)-(line 411,col 49)",
        "(line 412,col 9)-(line 412,col 31)",
        "(line 413,col 9)-(line 413,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testNext()",
      "begin_line": 419,
      "end_line": 426,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 38)",
        "(line 421,col 9)-(line 421,col 29)",
        "(line 422,col 9)-(line 422,col 50)",
        "(line 423,col 9)-(line 423,col 38)",
        "(line 424,col 9)-(line 424,col 32)",
        "(line 425,col 9)-(line 425,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetStart()",
      "begin_line": 431,
      "end_line": 440,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 43)",
        "(line 433,col 9)-(line 433,col 40)",
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 50)",
        "(line 436,col 9)-(line 436,col 41)",
        "(line 437,col 9)-(line 437,col 37)",
        "(line 438,col 9)-(line 438,col 50)",
        "(line 439,col 9)-(line 439,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetEnd()",
      "begin_line": 445,
      "end_line": 454,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 43)",
        "(line 447,col 9)-(line 447,col 40)",
        "(line 448,col 9)-(line 448,col 58)",
        "(line 449,col 9)-(line 449,col 56)",
        "(line 450,col 9)-(line 450,col 43)",
        "(line 451,col 9)-(line 451,col 37)",
        "(line 452,col 9)-(line 452,col 48)",
        "(line 453,col 9)-(line 453,col 33)"
      ]
    }
  ]
}