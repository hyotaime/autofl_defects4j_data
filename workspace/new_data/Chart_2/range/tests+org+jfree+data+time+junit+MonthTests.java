{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/time/junit/MonthTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MonthTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 77,
      "end_line": 460,
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
      "end_line": 157,
      "comment": "\n     * In GMT, the end of Feb 2000 is java.util.Date(951,868,799,999L).  Use\n     * this to check the Month constructor.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 52)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 149,col 31)",
        "(line 151,col 9)-(line 151,col 61)",
        "(line 152,col 9)-(line 152,col 62)",
        "(line 154,col 9)-(line 154,col 58)",
        "(line 155,col 9)-(line 155,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDateConstructor2()",
      "begin_line": 163,
      "end_line": 178,
      "comment": "\n     * In Auckland, the end of Feb 2000 is java.util.Date(951,821,999,999L).\n     * Use this to check the Month constructor.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 65)",
        "(line 166,col 9)-(line 166,col 49)",
        "(line 167,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 170,col 31)",
        "(line 172,col 9)-(line 172,col 61)",
        "(line 173,col 9)-(line 173,col 62)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 176,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testJan1900Previous()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * Set up a month equal to Jan 1900.  Request the previous month, it should\n     * be null.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testJan1900Next()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Set up a month equal to Jan 1900.  Request the next month, it should be\n     * Feb 1900.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDec9999Previous()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Set up a month equal to Dec 9999.  Request the previous month, it should\n     * be Nov 9999.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 57)",
        "(line 204,col 9)-(line 204,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testDec9999Next()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Set up a month equal to Dec 9999.  Request the next month, it should be\n     * null.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 49)",
        "(line 213,col 9)-(line 213,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testParseMonth()",
      "begin_line": 219,
      "end_line": 253,
      "comment": "\n     * Tests the string parsing code...\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 27)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 231,col 54)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 42)",
        "(line 241,col 9)-(line 241,col 54)",
        "(line 244,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testSerialization()",
      "begin_line": 258,
      "end_line": 280,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 39)",
        "(line 261,col 9)-(line 261,col 24)",
        "(line 263,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testHashcode()",
      "begin_line": 285,
      "end_line": 292,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 38)",
        "(line 287,col 9)-(line 287,col 38)",
        "(line 288,col 9)-(line 288,col 34)",
        "(line 289,col 9)-(line 289,col 31)",
        "(line 290,col 9)-(line 290,col 31)",
        "(line 291,col 9)-(line 291,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testNotCloneable()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n     * The {@link Month} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 37)",
        "(line 299,col 9)-(line 299,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetFirstMillisecond()",
      "begin_line": 305,
      "end_line": 314,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 43)",
        "(line 307,col 9)-(line 307,col 37)",
        "(line 308,col 9)-(line 308,col 51)",
        "(line 309,col 9)-(line 309,col 67)",
        "(line 310,col 9)-(line 310,col 37)",
        "(line 311,col 9)-(line 311,col 59)",
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 319,
      "end_line": 334,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 37)",
        "(line 321,col 9)-(line 321,col 68)",
        "(line 322,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 323,col 63)",
        "(line 326,col 9)-(line 326,col 29)",
        "(line 327,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 339,
      "end_line": 354,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 37)",
        "(line 341,col 9)-(line 341,col 75)",
        "(line 342,col 9)-(line 342,col 71)",
        "(line 343,col 9)-(line 343,col 69)",
        "(line 346,col 9)-(line 346,col 29)",
        "(line 347,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetLastMillisecond()",
      "begin_line": 359,
      "end_line": 368,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 43)",
        "(line 361,col 9)-(line 361,col 37)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 363,col 9)-(line 363,col 67)",
        "(line 364,col 9)-(line 364,col 37)",
        "(line 365,col 9)-(line 365,col 58)",
        "(line 366,col 9)-(line 366,col 33)",
        "(line 367,col 9)-(line 367,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 373,
      "end_line": 388,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 37)",
        "(line 375,col 9)-(line 375,col 68)",
        "(line 376,col 9)-(line 376,col 49)",
        "(line 377,col 9)-(line 377,col 62)",
        "(line 380,col 9)-(line 380,col 29)",
        "(line 381,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 393,
      "end_line": 408,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 37)",
        "(line 395,col 9)-(line 395,col 75)",
        "(line 396,col 9)-(line 396,col 71)",
        "(line 397,col 9)-(line 397,col 68)",
        "(line 400,col 9)-(line 400,col 29)",
        "(line 401,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetSerialIndex()",
      "begin_line": 413,
      "end_line": 418,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 37)",
        "(line 415,col 9)-(line 415,col 49)",
        "(line 416,col 9)-(line 416,col 31)",
        "(line 417,col 9)-(line 417,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testNext()",
      "begin_line": 423,
      "end_line": 430,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 38)",
        "(line 425,col 9)-(line 425,col 29)",
        "(line 426,col 9)-(line 426,col 50)",
        "(line 427,col 9)-(line 427,col 38)",
        "(line 428,col 9)-(line 428,col 32)",
        "(line 429,col 9)-(line 429,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetStart()",
      "begin_line": 435,
      "end_line": 444,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 43)",
        "(line 437,col 9)-(line 437,col 40)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 439,col 9)-(line 439,col 50)",
        "(line 440,col 9)-(line 440,col 41)",
        "(line 441,col 9)-(line 441,col 37)",
        "(line 442,col 9)-(line 442,col 50)",
        "(line 443,col 9)-(line 443,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.MonthTests.testGetEnd()",
      "begin_line": 449,
      "end_line": 458,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 43)",
        "(line 451,col 9)-(line 451,col 40)",
        "(line 452,col 9)-(line 452,col 58)",
        "(line 453,col 9)-(line 453,col 56)",
        "(line 454,col 9)-(line 454,col 43)",
        "(line 455,col 9)-(line 455,col 37)",
        "(line 456,col 9)-(line 456,col 48)",
        "(line 457,col 9)-(line 457,col 33)"
      ]
    }
  ]
}