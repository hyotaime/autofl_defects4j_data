{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/data/time/junit/TimePeriodValuesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValuesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 70,
      "end_line": 360,
      "comment": "\n * A collection of test cases for the {@link TimePeriodValues} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesA"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Series A. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesB"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Series B. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesC"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Series C. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.suite()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.TimePeriodValuesTests(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.setUp()",
      "begin_line": 102,
      "end_line": 137,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testClone()",
      "begin_line": 143,
      "end_line": 178,
      "comment": "\n     * Set up a quarter equal to Q1 1900.  Request the previous quarter, it \n     * should be null.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 70)",
        "(line 147,col 9)-(line 147,col 80)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 56)",
        "(line 171,col 9)-(line 171,col 54)",
        "(line 173,col 9)-(line 173,col 38)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testAddValue()",
      "begin_line": 183,
      "end_line": 196,
      "comment": "\n     * Add a value to series A for 1999.  It should be added at index 0.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 61)",
        "(line 186,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 48)",
        "(line 194,col 9)-(line 194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testSerialization()",
      "begin_line": 201,
      "end_line": 227,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 61)",
        "(line 204,col 9)-(line 204,col 38)",
        "(line 205,col 9)-(line 205,col 38)",
        "(line 206,col 9)-(line 206,col 37)",
        "(line 207,col 9)-(line 207,col 38)",
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 211,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testEquals()",
      "begin_line": 232,
      "end_line": 278,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 68)",
        "(line 234,col 9)-(line 234,col 68)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 29)",
        "(line 243,col 9)-(line 243,col 39)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 246,col 9)-(line 246,col 34)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 251,col 38)",
        "(line 252,col 9)-(line 252,col 34)",
        "(line 255,col 9)-(line 255,col 38)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 34)",
        "(line 261,col 9)-(line 261,col 37)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 37)",
        "(line 264,col 9)-(line 264,col 34)",
        "(line 266,col 9)-(line 266,col 41)",
        "(line 267,col 9)-(line 267,col 41)",
        "(line 268,col 9)-(line 268,col 26)",
        "(line 269,col 9)-(line 269,col 26)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 271,col 30)",
        "(line 273,col 9)-(line 273,col 26)",
        "(line 274,col 9)-(line 274,col 26)",
        "(line 275,col 9)-(line 275,col 35)",
        "(line 276,col 9)-(line 276,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.test1161329()",
      "begin_line": 283,
      "end_line": 293,
      "comment": "\n     * A test for bug report 1161329.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 60)",
        "(line 285,col 9)-(line 285,col 40)",
        "(line 286,col 9)-(line 286,col 24)",
        "(line 287,col 9)-(line 287,col 21)",
        "(line 288,col 9)-(line 288,col 24)",
        "(line 289,col 9)-(line 289,col 25)",
        "(line 290,col 9)-(line 290,col 44)",
        "(line 291,col 9)-(line 291,col 24)",
        "(line 292,col 9)-(line 292,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.testAdd()",
      "begin_line": 300,
      "end_line": 318,
      "comment": "\n     * Some checks for the add() methods.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 60)",
        "(line 302,col 9)-(line 302,col 71)",
        "(line 303,col 9)-(line 303,col 40)",
        "(line 304,col 9)-(line 305,col 38)",
        "(line 306,col 9)-(line 306,col 67)",
        "(line 307,col 9)-(line 307,col 63)",
        "(line 310,col 9)-(line 310,col 29)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MySeriesChangeListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.SeriesChangeListener"
      ],
      "begin_line": 323,
      "end_line": 358,
      "comment": "\n     * A listener used for detecting series change events.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastEvent"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.MySeriesChangeListener()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n         * Creates a new listener.\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.getLastEvent()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n         * Returns the last event.\n         * \n         * @return The last event (possibly \u003ccode\u003enull\u003c/code\u003e).\n         ",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.clearLastEvent()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n         * Clears the last event (sets it to \u003ccode\u003enull\u003c/code\u003e).\n         ",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimePeriodValuesTests.MySeriesChangeListener.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n         * Callback method for series change events.\n         * \n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 35)"
      ]
    }
  ]
}