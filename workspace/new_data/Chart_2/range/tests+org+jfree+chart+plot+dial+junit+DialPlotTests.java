{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/plot/dial/junit/DialPlotTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialPlotTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 68,
      "end_line": 324,
      "comment": "\n * Tests for the {@link DialPlot} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastEvent"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The last plot change event received. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Records the last plot change event received.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.suite()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.DialPlotTests(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testEquals()",
      "begin_line": 104,
      "end_line": 158,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 37)",
        "(line 106,col 9)-(line 106,col 37)",
        "(line 107,col 9)-(line 107,col 34)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 58)",
        "(line 113,col 9)-(line 113,col 34)",
        "(line 115,col 9)-(line 115,col 31)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 31)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 121,col 9)-(line 121,col 37)",
        "(line 122,col 9)-(line 122,col 37)",
        "(line 123,col 9)-(line 123,col 24)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 37)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 24)",
        "(line 128,col 9)-(line 128,col 34)",
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 136,col 9)-(line 136,col 55)",
        "(line 137,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 140,col 35)",
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 143,col 36)",
        "(line 144,col 9)-(line 144,col 28)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 148,col 9)-(line 148,col 39)",
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 156,col 45)",
        "(line 157,col 9)-(line 157,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testHashCode()",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 37)",
        "(line 165,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 166,col 34)",
        "(line 167,col 9)-(line 167,col 31)",
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testCloning()",
      "begin_line": 175,
      "end_line": 187,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 37)",
        "(line 177,col 9)-(line 177,col 27)",
        "(line 178,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 29)",
        "(line 185,col 9)-(line 185,col 51)",
        "(line 186,col 9)-(line 186,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testSerialization()",
      "begin_line": 193,
      "end_line": 212,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 37)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 197,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testBackgroundListener()",
      "begin_line": 217,
      "end_line": 233,
      "comment": "\n     * Check the notification event mechanism for the dial background.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 36)",
        "(line 219,col 9)-(line 219,col 58)",
        "(line 220,col 9)-(line 220,col 28)",
        "(line 221,col 9)-(line 221,col 34)",
        "(line 222,col 9)-(line 222,col 30)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 226,col 9)-(line 226,col 60)",
        "(line 227,col 9)-(line 227,col 28)",
        "(line 228,col 9)-(line 228,col 30)",
        "(line 229,col 9)-(line 229,col 31)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 31)",
        "(line 232,col 9)-(line 232,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testCapListener()",
      "begin_line": 238,
      "end_line": 254,
      "comment": "\n     * Check the notification event mechanism for the dial cap.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 36)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 21)",
        "(line 242,col 9)-(line 242,col 34)",
        "(line 243,col 9)-(line 243,col 30)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 245,col 38)",
        "(line 247,col 9)-(line 247,col 35)",
        "(line 248,col 9)-(line 248,col 21)",
        "(line 249,col 9)-(line 249,col 30)",
        "(line 250,col 9)-(line 250,col 36)",
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 37)",
        "(line 253,col 9)-(line 253,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testFrameListener()",
      "begin_line": 259,
      "end_line": 275,
      "comment": "\n     * Check the notification event mechanism for the dial frame.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 36)",
        "(line 261,col 9)-(line 261,col 45)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 263,col 34)",
        "(line 264,col 9)-(line 264,col 30)",
        "(line 265,col 9)-(line 265,col 42)",
        "(line 266,col 9)-(line 266,col 38)",
        "(line 268,col 9)-(line 268,col 45)",
        "(line 269,col 9)-(line 269,col 27)",
        "(line 270,col 9)-(line 270,col 30)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 35)",
        "(line 273,col 9)-(line 273,col 43)",
        "(line 274,col 9)-(line 274,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testScaleListener()",
      "begin_line": 280,
      "end_line": 296,
      "comment": "\n     * Check the notification event mechanism for the dial scales.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 36)",
        "(line 282,col 9)-(line 282,col 55)",
        "(line 283,col 9)-(line 283,col 26)",
        "(line 284,col 9)-(line 284,col 34)",
        "(line 285,col 9)-(line 285,col 30)",
        "(line 286,col 9)-(line 286,col 31)",
        "(line 287,col 9)-(line 287,col 38)",
        "(line 289,col 9)-(line 289,col 55)",
        "(line 290,col 9)-(line 290,col 26)",
        "(line 291,col 9)-(line 291,col 30)",
        "(line 292,col 9)-(line 292,col 31)",
        "(line 293,col 9)-(line 293,col 35)",
        "(line 294,col 9)-(line 294,col 31)",
        "(line 295,col 9)-(line 295,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.junit.DialPlotTests.testLayerListener()",
      "begin_line": 301,
      "end_line": 322,
      "comment": "\n     * Check the notification event mechanism for a layer.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 36)",
        "(line 303,col 9)-(line 303,col 58)",
        "(line 304,col 9)-(line 304,col 23)",
        "(line 305,col 9)-(line 305,col 34)",
        "(line 306,col 9)-(line 306,col 30)",
        "(line 307,col 9)-(line 307,col 32)",
        "(line 308,col 9)-(line 308,col 38)",
        "(line 310,col 9)-(line 310,col 60)",
        "(line 311,col 9)-(line 311,col 23)",
        "(line 312,col 9)-(line 312,col 30)",
        "(line 313,col 9)-(line 313,col 31)",
        "(line 314,col 9)-(line 314,col 38)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 316,col 38)",
        "(line 318,col 9)-(line 318,col 26)",
        "(line 319,col 9)-(line 319,col 30)",
        "(line 320,col 9)-(line 320,col 31)",
        "(line 321,col 9)-(line 321,col 35)"
      ]
    }
  ]
}