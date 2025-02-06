{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/chart/axis/junit/LogarithmicAxisTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogarithmicAxisTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 63,
      "end_line": 291,
      "comment": "\n * Tests for the {@link LogarithmicAxis} class.\n "
    },
    {
      "type": "class_interface",
      "name": "MyLogarithmicAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.LogarithmicAxis"
      ],
      "begin_line": 65,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.MyLogarithmicAxis.MyLogarithmicAxis(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n         * Creates an instance.\n         * \n         * @param label  the label.\n         ",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.MyLogarithmicAxis.switchedLog10(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": " (non-Javadoc)\n         * @see org.jfree.chart.axis.LogarithmicAxis#switchedLog10(double)\n         ",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Tolerance for floating point comparisons "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.suite()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.LogarithmicAxisTests(java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.setUp()",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * Sets up a new axis.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 57)",
        "(line 115,col 9)-(line 115,col 47)",
        "(line 116,col 9)-(line 116,col 48)",
        "(line 117,col 9)-(line 117,col 38)",
        "(line 118,col 9)-(line 118,col 38)",
        "(line 120,col 9)-(line 120,col 37)",
        "(line 121,col 9)-(line 121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.testSerialization()",
      "begin_line": 127,
      "end_line": 148,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 62)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 132,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.testAdjustedLog10()",
      "begin_line": 153,
      "end_line": 162,
      "comment": " \n     * Test if adjustedLog10 and adjustedPow10 are inverses of each other \n     ",
      "child_ranges": [
        "(line 154,col 10)-(line 154,col 34)",
        "(line 155,col 10)-(line 155,col 34)",
        "(line 156,col 10)-(line 156,col 33)",
        "(line 157,col 10)-(line 157,col 33)",
        "(line 158,col 10)-(line 158,col 33)",
        "(line 159,col 10)-(line 159,col 35)",
        "(line 160,col 10)-(line 160,col 35)",
        "(line 161,col 10)-(line 161,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.checkLogPowRoundTrip(double)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 165,col 10)-(line 166,col 59)",
        "(line 167,col 10)-(line 168,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.testSwitchedLog10()",
      "begin_line": 174,
      "end_line": 189,
      "comment": " \n      * Test if switchedLog10 and switchedPow10 are inverses of each other \n      ",
      "child_ranges": [
        "(line 175,col 11)-(line 176,col 53)",
        "(line 178,col 11)-(line 179,col 57)",
        "(line 181,col 11)-(line 181,col 43)",
        "(line 182,col 11)-(line 182,col 43)",
        "(line 183,col 11)-(line 183,col 42)",
        "(line 184,col 11)-(line 184,col 42)",
        "(line 185,col 11)-(line 185,col 42)",
        "(line 186,col 11)-(line 186,col 44)",
        "(line 187,col 11)-(line 187,col 44)",
        "(line 188,col 11)-(line 188,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.checkSwitchedLogPowRoundTrip(double)",
      "begin_line": 191,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 192,col 11)-(line 193,col 60)",
        "(line 194,col 11)-(line 195,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.testJava2DToValue()",
      "begin_line": 201,
      "end_line": 220,
      "comment": "\n       * Test of java2DToValue method.\n       ",
      "child_ranges": [
        "(line 202,col 11)-(line 202,col 74)",
        "(line 203,col 11)-(line 203,col 52)",
        "(line 206,col 11)-(line 206,col 37)",
        "(line 207,col 11)-(line 207,col 45)",
        "(line 210,col 11)-(line 210,col 38)",
        "(line 211,col 11)-(line 211,col 45)",
        "(line 214,col 11)-(line 214,col 38)",
        "(line 215,col 11)-(line 215,col 45)",
        "(line 218,col 11)-(line 218,col 39)",
        "(line 219,col 11)-(line 219,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.testValueToJava2D()",
      "begin_line": 225,
      "end_line": 244,
      "comment": "\n       * Test of valueToJava2D method.\n       ",
      "child_ranges": [
        "(line 226,col 11)-(line 226,col 74)",
        "(line 227,col 11)-(line 227,col 52)",
        "(line 230,col 11)-(line 230,col 37)",
        "(line 231,col 11)-(line 231,col 46)",
        "(line 234,col 11)-(line 234,col 38)",
        "(line 235,col 11)-(line 235,col 46)",
        "(line 238,col 11)-(line 238,col 38)",
        "(line 239,col 11)-(line 239,col 46)",
        "(line 242,col 11)-(line 242,col 39)",
        "(line 243,col 11)-(line 243,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.checkPointsToJava2D(org.jfree.chart.util.RectangleEdge, java.awt.geom.Rectangle2D)",
      "begin_line": 246,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 248,col 11)-(line 250,col 71)",
        "(line 251,col 11)-(line 254,col 44)",
        "(line 255,col 11)-(line 258,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.checkPointsToValue(org.jfree.chart.util.RectangleEdge, java.awt.geom.Rectangle2D)",
      "begin_line": 264,
      "end_line": 280,
      "comment": " \n     * Check the translation java2D to value for left, right, and center point.\n     ",
      "child_ranges": [
        "(line 265,col 10)-(line 268,col 26)",
        "(line 270,col 10)-(line 273,col 26)",
        "(line 275,col 10)-(line 279,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.LogarithmicAxisTests.main(java.lang.String[])",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Runs all tests in this class.\n     * \n     * @param args  ignored.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 64)"
      ]
    }
  ]
}