{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/data/time/junit/WeekTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeekTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 73,
      "end_line": 515,
      "comment": "\n * Tests for the {@link Week} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "w1Y1900"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " A week. "
    },
    {
      "type": "field",
      "varNames": [
        "w2Y1900"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A week. "
    },
    {
      "type": "field",
      "varNames": [
        "w51Y9999"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A week. "
    },
    {
      "type": "field",
      "varNames": [
        "w52Y9999"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " A week. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.suite()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.WeekTests.WeekTests(java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.setUp()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 41)",
        "(line 111,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testEquals()",
      "begin_line": 118,
      "end_line": 133,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 34)",
        "(line 124,col 9)-(line 124,col 31)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 127,col 9)-(line 127,col 34)",
        "(line 129,col 9)-(line 129,col 31)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 31)",
        "(line 132,col 9)-(line 132,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW1Y1900Previous()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Request the week before week 1, 1900: it should be \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 55)",
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW1Y1900Next()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Request the week after week 1, 1900: it should be week 2, 1900.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW52Y9999Previous()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Request the week before w52, 9999: it should be week 51, 9999.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testW52Y9999Next()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Request the week after w52, 9999: it should be \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 164,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testSerialization()",
      "begin_line": 170,
      "end_line": 191,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 37)",
        "(line 173,col 9)-(line 173,col 23)",
        "(line 175,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testHashcode()",
      "begin_line": 196,
      "end_line": 203,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 36)",
        "(line 198,col 9)-(line 198,col 36)",
        "(line 199,col 9)-(line 199,col 34)",
        "(line 200,col 9)-(line 200,col 31)",
        "(line 201,col 9)-(line 201,col 31)",
        "(line 202,col 9)-(line 202,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testNotCloneable()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * The {@link Week} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testWeek12005()",
      "begin_line": 233,
      "end_line": 249,
      "comment": "\n     * The first week in 2005 should span the range:\n     * \n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * Europe/London    | 1104710400000 | 1105315199999 |  3-Jan-2005 | 9-Jan-2005\n     * Europe/Paris     | 1104706800000 | 1105311599999 |  3-Jan-2005 | 2-Jan-2005\n     * America/New_York | 1104037200000 | 1104641999999 | 26-Dec-2004 | 1-Jan-2005\n     * \n     * In London and Paris, Monday is the first day of the week, while in the \n     * US it is Sunday.\n     * \n     * Previously, we were using these values, but see Java Bug ID 4960215:\n     * \n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * Europe/London    | 1104105600000 | 1104710399999 | 27-Dec-2004 | 2-Jan-2005\n     * Europe/Paris     | 1104102000000 | 1104706799999 | 27-Dec-2004 | 2-Jan-2005\n     * America/New_York | 1104037200000 | 1104641999999 | 26-Dec-2004 | 1-Jan-2005\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 36)",
        "(line 235,col 9)-(line 236,col 66)",
        "(line 237,col 9)-(line 237,col 40)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 239,col 64)",
        "(line 240,col 9)-(line 241,col 69)",
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 65)",
        "(line 244,col 9)-(line 244,col 64)",
        "(line 245,col 9)-(line 246,col 69)",
        "(line 247,col 9)-(line 247,col 65)",
        "(line 248,col 9)-(line 248,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testWeek532005()",
      "begin_line": 268,
      "end_line": 285,
      "comment": "\n     * The 53rd week in 2004 in London and Paris should span the range:\n     * \n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * Europe/London    | 1104105600000 | 1104710399999 | 27-Dec-2004 | 02-Jan-2005\n     * Europe/Paris     | 1104102000000 | 1104706799999 | 27-Dec-2004 | 02-Jan-2005\n     *\n     * The 53rd week in 2005 in New York should span the range:\n     * \n     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date\n     * -----------------+---------------+---------------+-------------+------------\n     * America/New_York | 1135486800000 | 1136091599999 | 25-Dec-2005 | 31-Dec-2005\n     * \n     * In London and Paris, Monday is the first day of the week, while in the \n     * US it is Sunday.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 37)",
        "(line 270,col 9)-(line 271,col 66)",
        "(line 272,col 9)-(line 272,col 40)",
        "(line 273,col 9)-(line 273,col 65)",
        "(line 274,col 9)-(line 274,col 64)",
        "(line 275,col 9)-(line 276,col 69)",
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 278,col 65)",
        "(line 279,col 9)-(line 279,col 64)",
        "(line 280,col 9)-(line 280,col 32)",
        "(line 281,col 9)-(line 282,col 69)",
        "(line 283,col 9)-(line 283,col 65)",
        "(line 284,col 9)-(line 284,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testBug1448828()",
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n     * A test case for bug 1448828.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testBug1498805()",
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n     * A test case for bug 1498805.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetFirstMillisecond()",
      "begin_line": 316,
      "end_line": 325,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 43)",
        "(line 318,col 9)-(line 318,col 37)",
        "(line 319,col 9)-(line 319,col 51)",
        "(line 320,col 9)-(line 320,col 67)",
        "(line 321,col 9)-(line 321,col 35)",
        "(line 322,col 9)-(line 322,col 58)",
        "(line 323,col 9)-(line 323,col 33)",
        "(line 324,col 9)-(line 324,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 330,
      "end_line": 330,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 352,
      "end_line": 367,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 35)",
        "(line 354,col 9)-(line 354,col 75)",
        "(line 355,col 9)-(line 355,col 71)",
        "(line 356,col 9)-(line 356,col 69)",
        "(line 359,col 9)-(line 359,col 29)",
        "(line 360,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetLastMillisecond()",
      "begin_line": 372,
      "end_line": 381,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 43)",
        "(line 374,col 9)-(line 374,col 37)",
        "(line 375,col 9)-(line 375,col 51)",
        "(line 376,col 9)-(line 376,col 67)",
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 378,col 59)",
        "(line 379,col 9)-(line 379,col 33)",
        "(line 380,col 9)-(line 380,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 408,
      "end_line": 423,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 36)",
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
      "signature": "org.jfree.data.time.junit.WeekTests.testGetSerialIndex()",
      "begin_line": 428,
      "end_line": 433,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 430,col 50)",
        "(line 431,col 9)-(line 431,col 30)",
        "(line 432,col 9)-(line 432,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testNext()",
      "begin_line": 438,
      "end_line": 445,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 36)",
        "(line 440,col 9)-(line 440,col 28)",
        "(line 441,col 9)-(line 441,col 50)",
        "(line 442,col 9)-(line 442,col 38)",
        "(line 443,col 9)-(line 443,col 31)",
        "(line 444,col 9)-(line 444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetStart()",
      "begin_line": 450,
      "end_line": 459,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 43)",
        "(line 452,col 9)-(line 452,col 40)",
        "(line 453,col 9)-(line 453,col 58)",
        "(line 454,col 9)-(line 454,col 53)",
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 35)",
        "(line 457,col 9)-(line 457,col 50)",
        "(line 458,col 9)-(line 458,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testGetEnd()",
      "begin_line": 464,
      "end_line": 473,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 43)",
        "(line 466,col 9)-(line 466,col 40)",
        "(line 467,col 9)-(line 467,col 58)",
        "(line 468,col 9)-(line 468,col 55)",
        "(line 469,col 9)-(line 469,col 43)",
        "(line 470,col 9)-(line 470,col 35)",
        "(line 471,col 9)-(line 471,col 48)",
        "(line 472,col 9)-(line 472,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.WeekTests.testConstructor()",
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n     * A test for a problem in constructing a new Week instance.\n     ",
      "child_ranges": []
    }
  ]
}