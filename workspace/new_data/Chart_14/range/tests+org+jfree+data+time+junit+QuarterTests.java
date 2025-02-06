{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/data/time/junit/QuarterTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuarterTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 71,
      "end_line": 474,
      "comment": "\n * Tests for the {link Quarter} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "q1Y1900"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "q2Y1900"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "q3Y9999"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " A quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "q4Y9999"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A quarter. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.suite()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.QuarterTests.QuarterTests(java.lang.String)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.setUp()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 44)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testEqualsSelf()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Check that a Quarter instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 120,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testEquals()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 129,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testDateConstructor1()",
      "begin_line": 136,
      "end_line": 149,
      "comment": "\n     * In GMT, the end of Q1 2002 is java.util.Date(1017619199999L).  Use this\n     * to check the quarter constructor.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 139,col 49)",
        "(line 140,col 9)-(line 140,col 65)",
        "(line 141,col 9)-(line 141,col 65)",
        "(line 143,col 9)-(line 143,col 41)",
        "(line 144,col 9)-(line 144,col 63)",
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 147,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testDateConstructor2()",
      "begin_line": 155,
      "end_line": 168,
      "comment": "\n     * In Istanbul, the end of Q1 2002 is java.util.Date(1017608399999L).  Use\n     * this to check the quarter constructor.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 64)",
        "(line 158,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 159,col 65)",
        "(line 160,col 9)-(line 160,col 65)",
        "(line 162,col 9)-(line 162,col 41)",
        "(line 163,col 9)-(line 163,col 63)",
        "(line 165,col 9)-(line 165,col 41)",
        "(line 166,col 9)-(line 166,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ1Y1900Previous()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Set up a quarter equal to Q1 1900.  Request the previous quarter, it \n     * should be null.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 61)",
        "(line 176,col 9)-(line 176,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ1Y1900Next()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Set up a quarter equal to Q1 1900.  Request the next quarter, it should\n     * be Q2 1900.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 185,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ4Y9999Previous()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Set up a quarter equal to Q4 9999.  Request the previous quarter, it \n     * should be Q3 9999.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 61)",
        "(line 194,col 9)-(line 194,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ4Y9999Next()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Set up a quarter equal to Q4 9999.  Request the next quarter, it should \n     * be null.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 53)",
        "(line 203,col 9)-(line 203,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testParseQuarter()",
      "begin_line": 209,
      "end_line": 243,
      "comment": "\n     * Test the string parsing code...\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 31)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 221,col 56)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 231,col 56)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 46)",
        "(line 241,col 9)-(line 241,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testSerialization()",
      "begin_line": 248,
      "end_line": 270,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 26)",
        "(line 253,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testHashcode()",
      "begin_line": 275,
      "end_line": 282,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 277,col 42)",
        "(line 278,col 9)-(line 278,col 34)",
        "(line 279,col 9)-(line 279,col 31)",
        "(line 280,col 9)-(line 280,col 31)",
        "(line 281,col 9)-(line 281,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testNotCloneable()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * The {@link Quarter} class is immutable, so should not be \n     * {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 41)",
        "(line 290,col 9)-(line 290,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testConstructor()",
      "begin_line": 297,
      "end_line": 315,
      "comment": "\n     * Some tests for the constructor with (int, int) arguments.  Covers bug \n     * report 1377239.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 29)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 25)",
        "(line 307,col 9)-(line 307,col 21)",
        "(line 308,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetFirstMillisecond()",
      "begin_line": 320,
      "end_line": 329,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 43)",
        "(line 322,col 9)-(line 322,col 37)",
        "(line 323,col 9)-(line 323,col 51)",
        "(line 324,col 9)-(line 324,col 67)",
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 60)",
        "(line 327,col 9)-(line 327,col 33)",
        "(line 328,col 9)-(line 328,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 334,
      "end_line": 349,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 41)",
        "(line 336,col 9)-(line 336,col 68)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 338,col 9)-(line 338,col 63)",
        "(line 341,col 9)-(line 341,col 29)",
        "(line 342,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 354,
      "end_line": 369,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 41)",
        "(line 356,col 9)-(line 356,col 75)",
        "(line 357,col 9)-(line 357,col 71)",
        "(line 358,col 9)-(line 358,col 69)",
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetLastMillisecond()",
      "begin_line": 374,
      "end_line": 383,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 376,col 37)",
        "(line 377,col 9)-(line 377,col 51)",
        "(line 378,col 9)-(line 378,col 67)",
        "(line 379,col 9)-(line 379,col 41)",
        "(line 380,col 9)-(line 380,col 59)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 382,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 388,
      "end_line": 403,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 41)",
        "(line 390,col 9)-(line 390,col 68)",
        "(line 391,col 9)-(line 391,col 49)",
        "(line 392,col 9)-(line 392,col 62)",
        "(line 395,col 9)-(line 395,col 29)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 408,
      "end_line": 423,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 75)",
        "(line 411,col 9)-(line 411,col 71)",
        "(line 412,col 9)-(line 412,col 69)",
        "(line 415,col 9)-(line 415,col 29)",
        "(line 416,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetSerialIndex()",
      "begin_line": 428,
      "end_line": 433,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 41)",
        "(line 430,col 9)-(line 430,col 48)",
        "(line 431,col 9)-(line 431,col 33)",
        "(line 432,col 9)-(line 432,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testNext()",
      "begin_line": 438,
      "end_line": 445,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 41)",
        "(line 440,col 9)-(line 440,col 31)",
        "(line 441,col 9)-(line 441,col 50)",
        "(line 442,col 9)-(line 442,col 40)",
        "(line 443,col 9)-(line 443,col 33)",
        "(line 444,col 9)-(line 444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetStart()",
      "begin_line": 450,
      "end_line": 459,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 43)",
        "(line 452,col 9)-(line 452,col 40)",
        "(line 453,col 9)-(line 453,col 58)",
        "(line 454,col 9)-(line 454,col 49)",
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 41)",
        "(line 457,col 9)-(line 457,col 50)",
        "(line 458,col 9)-(line 458,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetEnd()",
      "begin_line": 464,
      "end_line": 473,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 43)",
        "(line 466,col 9)-(line 466,col 40)",
        "(line 467,col 9)-(line 467,col 58)",
        "(line 468,col 9)-(line 468,col 54)",
        "(line 469,col 9)-(line 469,col 43)",
        "(line 470,col 9)-(line 470,col 41)",
        "(line 471,col 9)-(line 471,col 48)",
        "(line 472,col 9)-(line 472,col 33)"
      ]
    }
  ]
}