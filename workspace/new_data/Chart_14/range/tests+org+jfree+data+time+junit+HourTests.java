{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/data/time/junit/HourTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HourTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 73,
      "end_line": 422,
      "comment": "\n * Tests for the {@link Hour} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.suite()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.HourTests.HourTests(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.setUp()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testEqualsSelf()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Check that an Hour instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)",
        "(line 107,col 9)-(line 107,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testEquals()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 75)",
        "(line 115,col 9)-(line 115,col 75)",
        "(line 116,col 9)-(line 116,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testDateConstructor1()",
      "begin_line": 123,
      "end_line": 136,
      "comment": "\n     * In GMT, the 4pm on 21 Mar 2002 is java.util.Date(1,014,307,200,000L).  \n     * Use this to check the hour constructor.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 52)",
        "(line 126,col 9)-(line 126,col 49)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 128,col 59)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 131,col 63)",
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 134,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testDateConstructor2()",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * In Sydney, the 4pm on 21 Mar 2002 is java.util.Date(1,014,267,600,000L).\n     * Use this to check the hour constructor.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 65)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 59)",
        "(line 147,col 9)-(line 147,col 60)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 150,col 63)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testFirstHourPrevious()",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * Set up an hour equal to hour zero, 1 January 1900.  Request the \n     * previous hour, it should be null.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 75)",
        "(line 164,col 9)-(line 164,col 48)",
        "(line 165,col 9)-(line 165,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testFirstHourNext()",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * Set up an hour equal to hour zero, 1 January 1900.  Request the next \n     * hour, it should be null.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 75)",
        "(line 175,col 9)-(line 175,col 40)",
        "(line 176,col 9)-(line 176,col 40)",
        "(line 177,col 9)-(line 177,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testLastHourPrevious()",
      "begin_line": 184,
      "end_line": 191,
      "comment": "\n     * Set up an hour equal to hour zero, 1 January 1900.  Request the previous\n     * hour, it should be null.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 77)",
        "(line 187,col 9)-(line 187,col 47)",
        "(line 188,col 9)-(line 188,col 45)",
        "(line 189,col 9)-(line 189,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testLastHourNext()",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\n     * Set up an hour equal to hour zero, 1 January 1900.  Request the next \n     * hour, it should be null.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 77)",
        "(line 200,col 9)-(line 200,col 39)",
        "(line 201,col 9)-(line 201,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testParseHour()",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Problem for date parsing.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 49)",
        "(line 212,col 9)-(line 212,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testSerialization()",
      "begin_line": 219,
      "end_line": 240,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 29)",
        "(line 221,col 9)-(line 221,col 23)",
        "(line 223,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testHashcode()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 43)",
        "(line 247,col 9)-(line 247,col 43)",
        "(line 248,col 9)-(line 248,col 34)",
        "(line 249,col 9)-(line 249,col 34)",
        "(line 250,col 9)-(line 250,col 34)",
        "(line 251,col 9)-(line 251,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testNotCloneable()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * The {@link Hour} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 42)",
        "(line 259,col 9)-(line 259,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetFirstMillisecond()",
      "begin_line": 265,
      "end_line": 274,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 43)",
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 268,col 51)",
        "(line 269,col 9)-(line 269,col 67)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 62)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 279,
      "end_line": 294,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 42)",
        "(line 281,col 9)-(line 281,col 68)",
        "(line 282,col 9)-(line 282,col 49)",
        "(line 283,col 9)-(line 283,col 63)",
        "(line 286,col 9)-(line 286,col 29)",
        "(line 287,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 299,
      "end_line": 314,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 42)",
        "(line 301,col 9)-(line 301,col 75)",
        "(line 302,col 9)-(line 302,col 71)",
        "(line 303,col 9)-(line 303,col 69)",
        "(line 306,col 9)-(line 306,col 29)",
        "(line 307,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetLastMillisecond()",
      "begin_line": 319,
      "end_line": 328,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 43)",
        "(line 321,col 9)-(line 321,col 37)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 323,col 67)",
        "(line 324,col 9)-(line 324,col 41)",
        "(line 325,col 9)-(line 325,col 55)",
        "(line 326,col 9)-(line 326,col 33)",
        "(line 327,col 9)-(line 327,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 333,
      "end_line": 348,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 41)",
        "(line 335,col 9)-(line 335,col 68)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 337,col 9)-(line 337,col 62)",
        "(line 340,col 9)-(line 340,col 29)",
        "(line 341,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 353,
      "end_line": 368,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 43)",
        "(line 355,col 9)-(line 355,col 75)",
        "(line 356,col 9)-(line 356,col 71)",
        "(line 357,col 9)-(line 357,col 68)",
        "(line 360,col 9)-(line 360,col 29)",
        "(line 361,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetSerialIndex()",
      "begin_line": 373,
      "end_line": 378,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 41)",
        "(line 375,col 9)-(line 375,col 50)",
        "(line 376,col 9)-(line 376,col 36)",
        "(line 377,col 9)-(line 377,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testNext()",
      "begin_line": 383,
      "end_line": 392,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 43)",
        "(line 385,col 9)-(line 385,col 28)",
        "(line 386,col 9)-(line 386,col 40)",
        "(line 387,col 9)-(line 387,col 39)",
        "(line 388,col 9)-(line 388,col 44)",
        "(line 389,col 9)-(line 389,col 37)",
        "(line 390,col 9)-(line 390,col 39)",
        "(line 391,col 9)-(line 391,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetStart()",
      "begin_line": 397,
      "end_line": 406,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 43)",
        "(line 399,col 9)-(line 399,col 40)",
        "(line 400,col 9)-(line 400,col 58)",
        "(line 401,col 9)-(line 401,col 53)",
        "(line 402,col 9)-(line 402,col 41)",
        "(line 403,col 9)-(line 403,col 42)",
        "(line 404,col 9)-(line 404,col 50)",
        "(line 405,col 9)-(line 405,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.HourTests.testGetEnd()",
      "begin_line": 411,
      "end_line": 420,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 43)",
        "(line 413,col 9)-(line 413,col 40)",
        "(line 414,col 9)-(line 414,col 58)",
        "(line 415,col 9)-(line 415,col 54)",
        "(line 416,col 9)-(line 416,col 43)",
        "(line 417,col 9)-(line 417,col 41)",
        "(line 418,col 9)-(line 418,col 48)",
        "(line 419,col 9)-(line 419,col 33)"
      ]
    }
  ]
}