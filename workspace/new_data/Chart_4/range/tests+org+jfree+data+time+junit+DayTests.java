{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/data/time/junit/DayTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DayTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 77,
      "end_line": 442,
      "comment": "\n * Tests for the {@link Day} class.\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.suite()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.DayTests.DayTests(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.setUp()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testEqualsSelf()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Check that a Day instance is equal to itself.\n     *\n     * SourceForge Bug ID: 558850.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 28)",
        "(line 111,col 9)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testEquals()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 59)",
        "(line 119,col 9)-(line 119,col 59)",
        "(line 120,col 9)-(line 120,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testDateConstructor1()",
      "begin_line": 127,
      "end_line": 140,
      "comment": "\n     * In GMT, the end of 29 Feb 2004 is java.util.Date(1,078,099,199,999L).\n     * Use this to check the day constructor.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 52)",
        "(line 130,col 9)-(line 130,col 49)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 132,col 9)-(line 132,col 57)",
        "(line 134,col 9)-(line 134,col 61)",
        "(line 135,col 9)-(line 135,col 63)",
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testDateConstructor2()",
      "begin_line": 147,
      "end_line": 160,
      "comment": "\n     * In Helsinki, the end of 29 Feb 2004 is\n     * java.util.Date(1,078,091,999,999L).  Use this to check the Day\n     * constructor.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 64)",
        "(line 150,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 151,col 57)",
        "(line 152,col 9)-(line 152,col 57)",
        "(line 154,col 9)-(line 154,col 61)",
        "(line 155,col 9)-(line 155,col 63)",
        "(line 157,col 9)-(line 157,col 58)",
        "(line 158,col 9)-(line 158,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.test1Jan1900Previous()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Set up a day equal to 1 January 1900.  Request the previous day, it\n     * should be null.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 66)",
        "(line 169,col 9)-(line 169,col 51)",
        "(line 170,col 9)-(line 170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.test1Jan1900Next()",
      "begin_line": 178,
      "end_line": 184,
      "comment": "\n     * Set up a day equal to 1 January 1900.  Request the next day, it should\n     * be 2 January 1900.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 66)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 182,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.test31Dec9999Previous()",
      "begin_line": 190,
      "end_line": 196,
      "comment": "\n     * Set up a day equal to 31 December 9999.  Request the previous day, it\n     * should be 30 December 9999.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 69)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.test31Dec9999Next()",
      "begin_line": 202,
      "end_line": 208,
      "comment": "\n     * Set up a day equal to 31 December 9999.  Request the next day, it should\n     * be null.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 69)",
        "(line 205,col 9)-(line 205,col 44)",
        "(line 206,col 9)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testParseDay()",
      "begin_line": 219,
      "end_line": 234,
      "comment": "\n     * Problem for date parsing.\n     * \u003cp\u003e\n     * This test works only correct if the short pattern of the date\n     * format is \"dd/MM/yyyy\". If not, this test will result in a\n     * false negative.\n     *\n     * @throws ParseException on parsing errors.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 67)",
        "(line 222,col 9)-(line 222,col 69)",
        "(line 223,col 9)-(line 223,col 52)",
        "(line 224,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 232,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testSerialization()",
      "begin_line": 239,
      "end_line": 261,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 22)",
        "(line 244,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testHashcode()",
      "begin_line": 266,
      "end_line": 273,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 269,col 9)-(line 269,col 34)",
        "(line 270,col 9)-(line 270,col 31)",
        "(line 271,col 9)-(line 271,col 31)",
        "(line 272,col 9)-(line 272,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testNotCloneable()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * The {@link Day} class is immutable, so should not be {@link Cloneable}.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 36)",
        "(line 280,col 9)-(line 280,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetSerialIndex()",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\n     * Some checks for the getSerialIndex() method.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 36)",
        "(line 288,col 9)-(line 288,col 44)",
        "(line 289,col 9)-(line 289,col 33)",
        "(line 290,col 9)-(line 290,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetFirstMillisecond()",
      "begin_line": 296,
      "end_line": 305,
      "comment": "\n     * Some checks for the getFirstMillisecond() method.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 43)",
        "(line 298,col 9)-(line 298,col 37)",
        "(line 299,col 9)-(line 299,col 51)",
        "(line 300,col 9)-(line 300,col 67)",
        "(line 301,col 9)-(line 301,col 36)",
        "(line 302,col 9)-(line 302,col 59)",
        "(line 303,col 9)-(line 303,col 33)",
        "(line 304,col 9)-(line 304,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetFirstMillisecondWithTimeZone()",
      "begin_line": 310,
      "end_line": 325,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 37)",
        "(line 312,col 9)-(line 312,col 68)",
        "(line 313,col 9)-(line 313,col 49)",
        "(line 314,col 9)-(line 314,col 63)",
        "(line 317,col 9)-(line 317,col 29)",
        "(line 318,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetFirstMillisecondWithCalendar()",
      "begin_line": 330,
      "end_line": 345,
      "comment": "\n     * Some checks for the getFirstMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 37)",
        "(line 332,col 9)-(line 332,col 75)",
        "(line 333,col 9)-(line 333,col 71)",
        "(line 334,col 9)-(line 334,col 70)",
        "(line 337,col 9)-(line 337,col 29)",
        "(line 338,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetLastMillisecond()",
      "begin_line": 350,
      "end_line": 359,
      "comment": "\n     * Some checks for the getLastMillisecond() method.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 37)",
        "(line 353,col 9)-(line 353,col 51)",
        "(line 354,col 9)-(line 354,col 67)",
        "(line 355,col 9)-(line 355,col 36)",
        "(line 356,col 9)-(line 356,col 56)",
        "(line 357,col 9)-(line 357,col 33)",
        "(line 358,col 9)-(line 358,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetLastMillisecondWithTimeZone()",
      "begin_line": 364,
      "end_line": 379,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 36)",
        "(line 366,col 9)-(line 366,col 68)",
        "(line 367,col 9)-(line 367,col 49)",
        "(line 368,col 9)-(line 368,col 62)",
        "(line 371,col 9)-(line 371,col 29)",
        "(line 372,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetLastMillisecondWithCalendar()",
      "begin_line": 384,
      "end_line": 399,
      "comment": "\n     * Some checks for the getLastMillisecond(TimeZone) method.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 36)",
        "(line 386,col 9)-(line 387,col 66)",
        "(line 388,col 9)-(line 388,col 68)",
        "(line 391,col 9)-(line 391,col 29)",
        "(line 392,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testNext()",
      "begin_line": 404,
      "end_line": 412,
      "comment": "\n     * Some checks for the testNext() method.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 27)",
        "(line 407,col 9)-(line 407,col 40)",
        "(line 408,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 44)",
        "(line 410,col 9)-(line 410,col 34)",
        "(line 411,col 9)-(line 411,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetStart()",
      "begin_line": 417,
      "end_line": 426,
      "comment": "\n     * Some checks for the getStart() method.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 43)",
        "(line 419,col 9)-(line 419,col 40)",
        "(line 420,col 9)-(line 420,col 58)",
        "(line 421,col 9)-(line 421,col 53)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 423,col 37)",
        "(line 424,col 9)-(line 424,col 50)",
        "(line 425,col 9)-(line 425,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.DayTests.testGetEnd()",
      "begin_line": 431,
      "end_line": 440,
      "comment": "\n     * Some checks for the getEnd() method.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 43)",
        "(line 433,col 9)-(line 433,col 40)",
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 55)",
        "(line 436,col 9)-(line 436,col 43)",
        "(line 437,col 9)-(line 437,col 36)",
        "(line 438,col 9)-(line 438,col 48)",
        "(line 439,col 9)-(line 439,col 33)"
      ]
    }
  ]
}