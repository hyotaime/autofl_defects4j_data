{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/data/time/junit/YearTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YearTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 72,
      "end_line": 436,
      "comment": "\n * Tests for the {@link Year} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.suite()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.YearTests.YearTests(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.setUp()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testEqualsSelf()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Check that a Year instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testEquals()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)",
        "(line 114,col 9)-(line 114,col 36)",
        "(line 115,col 9)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testDateConstructor1()",
      "begin_line": 122,
      "end_line": 137,
      "comment": "\n     * In GMT, the end of 2001 is java.util.Date(1009843199999L).  Use this to \n     * check the year constructor.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 52)",
        "(line 125,col 9)-(line 125,col 49)",
        "(line 126,col 9)-(line 126,col 43)",
        "(line 127,col 9)-(line 127,col 43)",
        "(line 128,col 9)-(line 128,col 37)",
        "(line 129,col 9)-(line 129,col 37)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 132,col 63)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testDateConstructor2()",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\n     * In Los Angeles, the end of 2001 is java.util.Date(1009871999999L).  Use \n     * this to check the year constructor.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 68)",
        "(line 146,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 147,col 59)",
        "(line 148,col 9)-(line 148,col 59)",
        "(line 150,col 9)-(line 150,col 41)",
        "(line 151,col 9)-(line 151,col 63)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test1900Previous()",
      "begin_line": 162,
      "end_line": 166,
      "comment": "\n     * Set up a year equal to 1900.  Request the previous year, it should be\n     * null.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 38)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test1900Next()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "\n     * Set up a year equal to 1900.  Request the next year, it should be 1901.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 38)",
        "(line 173,col 9)-(line 173,col 42)",
        "(line 174,col 9)-(line 174,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test9999Previous()",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * Set up a year equal to 9999.  Request the previous year, it should be \n     * 9998.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 38)",
        "(line 183,col 9)-(line 183,col 50)",
        "(line 184,col 9)-(line 184,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test9999Next()",
      "begin_line": 190,
      "end_line": 194,
      "comment": "\n     * Set up a year equal to 9999.  Request the next year, it should be null.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 42)",
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testParseYear()",
      "begin_line": 199,
      "end_line": 230,
      "comment": "\n     * Tests the year string parser.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 25)",
        "(line 204,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 43)",
        "(line 213,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 43)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testSerialization()",
      "begin_line": 235,
      "end_line": 257,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 33)",
        "(line 238,col 9)-(line 238,col 23)",
        "(line 240,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testNotCloneable()",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * The {@link Year} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 32)",
        "(line 264,col 9)-(line 264,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testHashcode()",
      "begin_line": 270,
      "end_line": 277,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 34)",
        "(line 274,col 9)-(line 274,col 31)",
        "(line 275,col 9)-(line 275,col 31)",
        "(line 276,col 9)-(line 276,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetFirstMillisecond()",
      "begin_line": 282,
      "end_line": 292,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 43)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 285,col 51)",
        "(line 286,col 9)-(line 286,col 67)",
        "(line 287,col 9)-(line 287,col 32)",
        "(line 289,col 9)-(line 289,col 57)",
        "(line 290,col 9)-(line 290,col 33)",
        "(line 291,col 9)-(line 291,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 297,
      "end_line": 312,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 32)",
        "(line 299,col 9)-(line 299,col 68)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 63)",
        "(line 304,col 9)-(line 304,col 29)",
        "(line 305,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 317,
      "end_line": 332,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 32)",
        "(line 319,col 9)-(line 319,col 75)",
        "(line 320,col 9)-(line 320,col 71)",
        "(line 321,col 9)-(line 321,col 69)",
        "(line 324,col 9)-(line 324,col 29)",
        "(line 325,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetLastMillisecond()",
      "begin_line": 337,
      "end_line": 347,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 43)",
        "(line 339,col 9)-(line 339,col 37)",
        "(line 340,col 9)-(line 340,col 51)",
        "(line 341,col 9)-(line 341,col 67)",
        "(line 342,col 9)-(line 342,col 32)",
        "(line 344,col 9)-(line 344,col 59)",
        "(line 345,col 9)-(line 345,col 33)",
        "(line 346,col 9)-(line 346,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 352,
      "end_line": 367,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 32)",
        "(line 354,col 9)-(line 354,col 68)",
        "(line 355,col 9)-(line 355,col 49)",
        "(line 356,col 9)-(line 356,col 62)",
        "(line 359,col 9)-(line 359,col 29)",
        "(line 360,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 372,
      "end_line": 387,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 32)",
        "(line 374,col 9)-(line 374,col 75)",
        "(line 375,col 9)-(line 375,col 71)",
        "(line 376,col 9)-(line 376,col 69)",
        "(line 379,col 9)-(line 379,col 29)",
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetSerialIndex()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 32)",
        "(line 394,col 9)-(line 394,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testNext()",
      "begin_line": 400,
      "end_line": 406,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 32)",
        "(line 402,col 9)-(line 402,col 28)",
        "(line 403,col 9)-(line 403,col 40)",
        "(line 404,col 9)-(line 404,col 27)",
        "(line 405,col 9)-(line 405,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetStart()",
      "begin_line": 411,
      "end_line": 420,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 43)",
        "(line 413,col 9)-(line 413,col 40)",
        "(line 414,col 9)-(line 414,col 58)",
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 416,col 41)",
        "(line 417,col 9)-(line 417,col 32)",
        "(line 418,col 9)-(line 418,col 50)",
        "(line 419,col 9)-(line 419,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetEnd()",
      "begin_line": 425,
      "end_line": 434,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 43)",
        "(line 427,col 9)-(line 427,col 40)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 57)",
        "(line 430,col 9)-(line 430,col 43)",
        "(line 431,col 9)-(line 431,col 32)",
        "(line 432,col 9)-(line 432,col 48)",
        "(line 433,col 9)-(line 433,col 33)"
      ]
    }
  ]
}