{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/time/junit/YearTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YearTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 72,
      "end_line": 441,
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
      "end_line": 121,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)",
        "(line 114,col 9)-(line 114,col 36)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 117,col 9)-(line 117,col 31)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 31)",
        "(line 120,col 9)-(line 120,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testDateConstructor1()",
      "begin_line": 127,
      "end_line": 142,
      "comment": "\n     * In GMT, the end of 2001 is java.util.Date(1009843199999L).  Use this to\n     * check the year constructor.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 52)",
        "(line 130,col 9)-(line 130,col 49)",
        "(line 131,col 9)-(line 131,col 43)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 133,col 37)",
        "(line 134,col 9)-(line 134,col 37)",
        "(line 136,col 9)-(line 136,col 41)",
        "(line 137,col 9)-(line 137,col 63)",
        "(line 139,col 9)-(line 139,col 41)",
        "(line 140,col 9)-(line 140,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testDateConstructor2()",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * In Los Angeles, the end of 2001 is java.util.Date(1009871999999L).  Use\n     * this to check the year constructor.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 68)",
        "(line 151,col 9)-(line 151,col 49)",
        "(line 152,col 9)-(line 152,col 59)",
        "(line 153,col 9)-(line 153,col 59)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 63)",
        "(line 158,col 9)-(line 158,col 41)",
        "(line 159,col 9)-(line 159,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testMinuss9999Previous()",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * Set up a year equal to 1900.  Request the previous year, it should be\n     * null.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 39)",
        "(line 169,col 9)-(line 169,col 50)",
        "(line 170,col 9)-(line 170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test1900Next()",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Set up a year equal to 1900.  Request the next year, it should be 1901.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 42)",
        "(line 179,col 9)-(line 179,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test9999Previous()",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     * Set up a year equal to 9999.  Request the previous year, it should be\n     * 9998.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 38)",
        "(line 188,col 9)-(line 188,col 50)",
        "(line 189,col 9)-(line 189,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.test9999Next()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * Set up a year equal to 9999.  Request the next year, it should be null.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 38)",
        "(line 197,col 9)-(line 197,col 42)",
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testParseYear()",
      "begin_line": 204,
      "end_line": 235,
      "comment": "\n     * Tests the year string parser.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 43)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 43)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testSerialization()",
      "begin_line": 240,
      "end_line": 262,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 33)",
        "(line 243,col 9)-(line 243,col 23)",
        "(line 245,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testNotCloneable()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * The {@link Year} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 32)",
        "(line 269,col 9)-(line 269,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testHashcode()",
      "begin_line": 275,
      "end_line": 282,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 33)",
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 34)",
        "(line 279,col 9)-(line 279,col 31)",
        "(line 280,col 9)-(line 280,col 31)",
        "(line 281,col 9)-(line 281,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetFirstMillisecond()",
      "begin_line": 287,
      "end_line": 297,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 37)",
        "(line 290,col 9)-(line 290,col 51)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 32)",
        "(line 294,col 9)-(line 294,col 57)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 302,
      "end_line": 317,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 32)",
        "(line 304,col 9)-(line 304,col 68)",
        "(line 305,col 9)-(line 305,col 49)",
        "(line 306,col 9)-(line 306,col 63)",
        "(line 309,col 9)-(line 309,col 29)",
        "(line 310,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 322,
      "end_line": 337,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 32)",
        "(line 324,col 9)-(line 324,col 75)",
        "(line 325,col 9)-(line 325,col 71)",
        "(line 326,col 9)-(line 326,col 69)",
        "(line 329,col 9)-(line 329,col 29)",
        "(line 330,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetLastMillisecond()",
      "begin_line": 342,
      "end_line": 352,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 37)",
        "(line 345,col 9)-(line 345,col 51)",
        "(line 346,col 9)-(line 346,col 67)",
        "(line 347,col 9)-(line 347,col 32)",
        "(line 349,col 9)-(line 349,col 59)",
        "(line 350,col 9)-(line 350,col 33)",
        "(line 351,col 9)-(line 351,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 357,
      "end_line": 372,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 32)",
        "(line 359,col 9)-(line 359,col 68)",
        "(line 360,col 9)-(line 360,col 49)",
        "(line 361,col 9)-(line 361,col 62)",
        "(line 364,col 9)-(line 364,col 29)",
        "(line 365,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 377,
      "end_line": 392,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 32)",
        "(line 379,col 9)-(line 379,col 75)",
        "(line 380,col 9)-(line 380,col 71)",
        "(line 381,col 9)-(line 381,col 69)",
        "(line 384,col 9)-(line 384,col 29)",
        "(line 385,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetSerialIndex()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 32)",
        "(line 399,col 9)-(line 399,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testNext()",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 32)",
        "(line 407,col 9)-(line 407,col 28)",
        "(line 408,col 9)-(line 408,col 40)",
        "(line 409,col 9)-(line 409,col 27)",
        "(line 410,col 9)-(line 410,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetStart()",
      "begin_line": 416,
      "end_line": 425,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 43)",
        "(line 418,col 9)-(line 418,col 40)",
        "(line 419,col 9)-(line 419,col 58)",
        "(line 420,col 9)-(line 420,col 52)",
        "(line 421,col 9)-(line 421,col 41)",
        "(line 422,col 9)-(line 422,col 32)",
        "(line 423,col 9)-(line 423,col 50)",
        "(line 424,col 9)-(line 424,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.YearTests.testGetEnd()",
      "begin_line": 430,
      "end_line": 439,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 43)",
        "(line 432,col 9)-(line 432,col 40)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 434,col 57)",
        "(line 435,col 9)-(line 435,col 43)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 437,col 9)-(line 437,col 48)",
        "(line 438,col 9)-(line 438,col 33)"
      ]
    }
  ]
}