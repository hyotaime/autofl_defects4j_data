{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/time/junit/TimePeriodValuesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValuesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 72,
      "end_line": 448,
      "comment": "\n * A collection of test cases for the {@link TimePeriodValues} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesA"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Series A. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesB"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Series B. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesC"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Series C. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.suite()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.TimePeriodValuesTests(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.setUp()",
      "begin_line": 104,
      "end_line": 139,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 56)",
        "(line 107,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 56)",
        "(line 120,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 56)",
        "(line 130,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testClone()",
      "begin_line": 145,
      "end_line": 180,
      "comment": "\n     * Set up a quarter equal to Q1 1900.  Request the previous quarter, it \n     * should be null.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 70)",
        "(line 149,col 9)-(line 149,col 80)",
        "(line 150,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 56)",
        "(line 173,col 9)-(line 173,col 54)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 176,col 37)",
        "(line 177,col 9)-(line 177,col 53)",
        "(line 178,col 9)-(line 178,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testAddValue()",
      "begin_line": 185,
      "end_line": 198,
      "comment": "\n     * Add a value to series A for 1999.  It should be added at index 0.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 61)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 48)",
        "(line 196,col 9)-(line 196,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testSerialization()",
      "begin_line": 203,
      "end_line": 229,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 61)",
        "(line 206,col 9)-(line 206,col 38)",
        "(line 207,col 9)-(line 207,col 38)",
        "(line 208,col 9)-(line 208,col 37)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 211,col 35)",
        "(line 213,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testEquals()",
      "begin_line": 234,
      "end_line": 280,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 68)",
        "(line 236,col 9)-(line 236,col 68)",
        "(line 237,col 9)-(line 237,col 35)",
        "(line 238,col 9)-(line 238,col 30)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 242,col 29)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 246,col 9)-(line 246,col 35)",
        "(line 247,col 9)-(line 247,col 39)",
        "(line 248,col 9)-(line 248,col 34)",
        "(line 251,col 9)-(line 251,col 38)",
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 38)",
        "(line 254,col 9)-(line 254,col 34)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 35)",
        "(line 259,col 9)-(line 259,col 38)",
        "(line 260,col 9)-(line 260,col 34)",
        "(line 263,col 9)-(line 263,col 37)",
        "(line 264,col 9)-(line 264,col 35)",
        "(line 265,col 9)-(line 265,col 37)",
        "(line 266,col 9)-(line 266,col 34)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 270,col 26)",
        "(line 271,col 9)-(line 271,col 26)",
        "(line 272,col 9)-(line 272,col 35)",
        "(line 273,col 9)-(line 273,col 30)",
        "(line 275,col 9)-(line 275,col 26)",
        "(line 276,col 9)-(line 276,col 26)",
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.test1161329()",
      "begin_line": 285,
      "end_line": 295,
      "comment": "\n     * A test for bug report 1161329.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 60)",
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 288,col 24)",
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 290,col 24)",
        "(line 291,col 9)-(line 291,col 25)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 24)",
        "(line 294,col 9)-(line 294,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testAdd()",
      "begin_line": 302,
      "end_line": 320,
      "comment": "\n     * Some checks for the add() methods.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 60)",
        "(line 304,col 9)-(line 304,col 71)",
        "(line 305,col 9)-(line 305,col 40)",
        "(line 306,col 9)-(line 307,col 38)",
        "(line 308,col 9)-(line 308,col 67)",
        "(line 309,col 9)-(line 309,col 63)",
        "(line 312,col 9)-(line 312,col 29)",
        "(line 313,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testGetMinStartIndex()",
      "begin_line": 325,
      "end_line": 334,
      "comment": "\n     * Some tests for the getMinStartIndex() method.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 58)",
        "(line 327,col 9)-(line 327,col 47)",
        "(line 328,col 9)-(line 328,col 53)",
        "(line 329,col 9)-(line 329,col 46)",
        "(line 330,col 9)-(line 330,col 53)",
        "(line 331,col 9)-(line 331,col 46)",
        "(line 332,col 9)-(line 332,col 50)",
        "(line 333,col 9)-(line 333,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testGetMaxStartIndex()",
      "begin_line": 339,
      "end_line": 348,
      "comment": "\n     * Some tests for the getMaxStartIndex() method.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 58)",
        "(line 341,col 9)-(line 341,col 47)",
        "(line 342,col 9)-(line 342,col 53)",
        "(line 343,col 9)-(line 343,col 46)",
        "(line 344,col 9)-(line 344,col 53)",
        "(line 345,col 9)-(line 345,col 46)",
        "(line 346,col 9)-(line 346,col 50)",
        "(line 347,col 9)-(line 347,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testGetMinMiddleIndex()",
      "begin_line": 353,
      "end_line": 362,
      "comment": "\n     * Some tests for the getMinMiddleIndex() method.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 58)",
        "(line 355,col 9)-(line 355,col 48)",
        "(line 356,col 9)-(line 356,col 53)",
        "(line 357,col 9)-(line 357,col 47)",
        "(line 358,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 47)",
        "(line 360,col 9)-(line 360,col 50)",
        "(line 361,col 9)-(line 361,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testGetMaxMiddleIndex()",
      "begin_line": 367,
      "end_line": 378,
      "comment": "\n     * Some tests for the getMaxMiddleIndex() method.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 58)",
        "(line 369,col 9)-(line 369,col 48)",
        "(line 370,col 9)-(line 370,col 53)",
        "(line 371,col 9)-(line 371,col 47)",
        "(line 372,col 9)-(line 372,col 53)",
        "(line 373,col 9)-(line 373,col 47)",
        "(line 374,col 9)-(line 374,col 50)",
        "(line 375,col 9)-(line 375,col 47)",
        "(line 376,col 9)-(line 376,col 53)",
        "(line 377,col 9)-(line 377,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.getMinEndIndex()",
      "begin_line": 383,
      "end_line": 392,
      "comment": "\n     * Some tests for the getMinEndIndex() method.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 58)",
        "(line 385,col 9)-(line 385,col 45)",
        "(line 386,col 9)-(line 386,col 53)",
        "(line 387,col 9)-(line 387,col 44)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 389,col 44)",
        "(line 390,col 9)-(line 390,col 50)",
        "(line 391,col 9)-(line 391,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.getMaxEndIndex()",
      "begin_line": 397,
      "end_line": 406,
      "comment": "\n     * Some tests for the getMaxEndIndex() method.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 58)",
        "(line 399,col 9)-(line 399,col 45)",
        "(line 400,col 9)-(line 400,col 53)",
        "(line 401,col 9)-(line 401,col 44)",
        "(line 402,col 9)-(line 402,col 53)",
        "(line 403,col 9)-(line 403,col 44)",
        "(line 404,col 9)-(line 404,col 50)",
        "(line 405,col 9)-(line 405,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MySeriesChangeListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.event.SeriesChangeListener"
      ],
      "begin_line": 411,
      "end_line": 446,
      "comment": "\n     * A listener used for detecting series change events.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastEvent"
      ],
      "begin_line": 413,
      "end_line": 413,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.MySeriesChangeListener()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n         * Creates a new listener.\n         ",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.getLastEvent()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n         * Returns the last event.\n         * \n         * @return The last event (possibly \u003ccode\u003enull\u003c/code\u003e).\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.clearLastEvent()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n         * Clears the last event (sets it to \u003ccode\u003enull\u003c/code\u003e).\n         ",
      "child_ranges": [
        "(line 435,col 13)-(line 435,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.seriesChanged(org.jfree.data.event.SeriesChangeEvent)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n         * Callback method for series change events.\n         * \n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 35)"
      ]
    }
  ]
}