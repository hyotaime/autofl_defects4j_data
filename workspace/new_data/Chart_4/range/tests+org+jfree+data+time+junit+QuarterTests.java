{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/data/time/junit/QuarterTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuarterTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 71,
      "end_line": 478,
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
      "end_line": 151,
      "comment": "\n     * In GMT, the end of Q1 2002 is java.util.Date(1017619199999L).  Use this\n     * to check the quarter constructor.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 139,col 49)",
        "(line 140,col 9)-(line 141,col 31)",
        "(line 142,col 9)-(line 143,col 31)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 146,col 63)",
        "(line 148,col 9)-(line 148,col 41)",
        "(line 149,col 9)-(line 149,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testDateConstructor2()",
      "begin_line": 157,
      "end_line": 172,
      "comment": "\n     * In Istanbul, the end of Q1 2002 is java.util.Date(1017608399999L).  Use\n     * this to check the quarter constructor.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 64)",
        "(line 160,col 9)-(line 160,col 49)",
        "(line 161,col 9)-(line 162,col 31)",
        "(line 163,col 9)-(line 164,col 31)",
        "(line 166,col 9)-(line 166,col 41)",
        "(line 167,col 9)-(line 167,col 63)",
        "(line 169,col 9)-(line 169,col 41)",
        "(line 170,col 9)-(line 170,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ1Y1900Previous()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Set up a quarter equal to Q1 1900.  Request the previous quarter, it\n     * should be null.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 61)",
        "(line 180,col 9)-(line 180,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ1Y1900Next()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * Set up a quarter equal to Q1 1900.  Request the next quarter, it should\n     * be Q2 1900.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ4Y9999Previous()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Set up a quarter equal to Q4 9999.  Request the previous quarter, it\n     * should be Q3 9999.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 61)",
        "(line 198,col 9)-(line 198,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testQ4Y9999Next()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Set up a quarter equal to Q4 9999.  Request the next quarter, it should\n     * be null.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 207,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testParseQuarter()",
      "begin_line": 213,
      "end_line": 247,
      "comment": "\n     * Test the string parsing code...\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 31)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 46)",
        "(line 225,col 9)-(line 225,col 56)",
        "(line 228,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 235,col 56)",
        "(line 238,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 46)",
        "(line 245,col 9)-(line 245,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testSerialization()",
      "begin_line": 252,
      "end_line": 274,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 42)",
        "(line 255,col 9)-(line 255,col 26)",
        "(line 257,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testHashcode()",
      "begin_line": 279,
      "end_line": 286,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 42)",
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 34)",
        "(line 283,col 9)-(line 283,col 31)",
        "(line 284,col 9)-(line 284,col 31)",
        "(line 285,col 9)-(line 285,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testNotCloneable()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * The {@link Quarter} class is immutable, so should not be\n     * {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 41)",
        "(line 294,col 9)-(line 294,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testConstructor()",
      "begin_line": 301,
      "end_line": 319,
      "comment": "\n     * Some tests for the constructor with (int, int) arguments.  Covers bug\n     * report 1377239.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 29)",
        "(line 303,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 311,col 9)-(line 311,col 21)",
        "(line 312,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetFirstMillisecond()",
      "begin_line": 324,
      "end_line": 333,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 326,col 37)",
        "(line 327,col 9)-(line 327,col 51)",
        "(line 328,col 9)-(line 328,col 67)",
        "(line 329,col 9)-(line 329,col 41)",
        "(line 330,col 9)-(line 330,col 60)",
        "(line 331,col 9)-(line 331,col 33)",
        "(line 332,col 9)-(line 332,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 338,
      "end_line": 353,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 41)",
        "(line 340,col 9)-(line 340,col 68)",
        "(line 341,col 9)-(line 341,col 49)",
        "(line 342,col 9)-(line 342,col 63)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 358,
      "end_line": 373,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 41)",
        "(line 360,col 9)-(line 360,col 75)",
        "(line 361,col 9)-(line 361,col 71)",
        "(line 362,col 9)-(line 362,col 69)",
        "(line 365,col 9)-(line 365,col 29)",
        "(line 366,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetLastMillisecond()",
      "begin_line": 378,
      "end_line": 387,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 43)",
        "(line 380,col 9)-(line 380,col 37)",
        "(line 381,col 9)-(line 381,col 51)",
        "(line 382,col 9)-(line 382,col 67)",
        "(line 383,col 9)-(line 383,col 41)",
        "(line 384,col 9)-(line 384,col 59)",
        "(line 385,col 9)-(line 385,col 33)",
        "(line 386,col 9)-(line 386,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 392,
      "end_line": 407,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 41)",
        "(line 394,col 9)-(line 394,col 68)",
        "(line 395,col 9)-(line 395,col 49)",
        "(line 396,col 9)-(line 396,col 62)",
        "(line 399,col 9)-(line 399,col 29)",
        "(line 400,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 412,
      "end_line": 427,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 41)",
        "(line 414,col 9)-(line 414,col 75)",
        "(line 415,col 9)-(line 415,col 71)",
        "(line 416,col 9)-(line 416,col 69)",
        "(line 419,col 9)-(line 419,col 29)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetSerialIndex()",
      "begin_line": 432,
      "end_line": 437,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 41)",
        "(line 434,col 9)-(line 434,col 48)",
        "(line 435,col 9)-(line 435,col 33)",
        "(line 436,col 9)-(line 436,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testNext()",
      "begin_line": 442,
      "end_line": 449,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 41)",
        "(line 444,col 9)-(line 444,col 31)",
        "(line 445,col 9)-(line 445,col 50)",
        "(line 446,col 9)-(line 446,col 40)",
        "(line 447,col 9)-(line 447,col 33)",
        "(line 448,col 9)-(line 448,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetStart()",
      "begin_line": 454,
      "end_line": 463,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 43)",
        "(line 456,col 9)-(line 456,col 40)",
        "(line 457,col 9)-(line 457,col 58)",
        "(line 458,col 9)-(line 458,col 49)",
        "(line 459,col 9)-(line 459,col 41)",
        "(line 460,col 9)-(line 460,col 41)",
        "(line 461,col 9)-(line 461,col 50)",
        "(line 462,col 9)-(line 462,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.QuarterTests.testGetEnd()",
      "begin_line": 468,
      "end_line": 477,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 43)",
        "(line 470,col 9)-(line 470,col 40)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 54)",
        "(line 473,col 9)-(line 473,col 43)",
        "(line 474,col 9)-(line 474,col 41)",
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 476,col 33)"
      ]
    }
  ]
}