{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/plot/junit/MultiplePiePlotTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiplePiePlotTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 77,
      "end_line": 243,
      "comment": "\n * Some tests for the {@link MultiplePiePlot} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastEvent"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The last event received. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.suite()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Receives a plot change event and records it.  Some tests will use this\n     * to check that events have been generated (or not) when required.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.MultiplePiePlotTests(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testConstructor()",
      "begin_line": 114,
      "end_line": 123,
      "comment": "\n     * Some checks for the constructors.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 53)",
        "(line 116,col 9)-(line 116,col 38)",
        "(line 120,col 9)-(line 120,col 70)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testEquals()",
      "begin_line": 128,
      "end_line": 165,
      "comment": "\n     * Check that the equals() method distinguishes the required fields.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 130,col 51)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 34)",
        "(line 134,col 9)-(line 134,col 50)",
        "(line 135,col 9)-(line 135,col 35)",
        "(line 136,col 9)-(line 136,col 50)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 139,col 9)-(line 139,col 26)",
        "(line 140,col 9)-(line 140,col 35)",
        "(line 141,col 9)-(line 141,col 26)",
        "(line 142,col 9)-(line 142,col 34)",
        "(line 144,col 9)-(line 144,col 53)",
        "(line 145,col 9)-(line 145,col 35)",
        "(line 146,col 9)-(line 146,col 53)",
        "(line 147,col 9)-(line 147,col 34)",
        "(line 149,col 9)-(line 150,col 43)",
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 153,col 43)",
        "(line 154,col 9)-(line 154,col 34)",
        "(line 156,col 9)-(line 156,col 73)",
        "(line 157,col 9)-(line 157,col 35)",
        "(line 158,col 9)-(line 158,col 73)",
        "(line 159,col 9)-(line 159,col 34)",
        "(line 161,col 9)-(line 161,col 74)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 74)",
        "(line 164,col 9)-(line 164,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testCloning()",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\n     * Some basic checks for the clone() method.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 51)",
        "(line 172,col 9)-(line 172,col 70)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 174,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 29)",
        "(line 182,col 9)-(line 182,col 51)",
        "(line 183,col 9)-(line 183,col 34)",
        "(line 186,col 9)-(line 186,col 41)",
        "(line 187,col 9)-(line 187,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testSerialization()",
      "begin_line": 193,
      "end_line": 213,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 55)",
        "(line 195,col 9)-(line 196,col 40)",
        "(line 197,col 9)-(line 197,col 34)",
        "(line 198,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testGetLegendItems()",
      "begin_line": 218,
      "end_line": 241,
      "comment": "\n     * Fetches the legend items and checks the values.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 70)",
        "(line 220,col 9)-(line 220,col 43)",
        "(line 221,col 9)-(line 221,col 43)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 223,col 43)",
        "(line 224,col 9)-(line 224,col 60)",
        "(line 225,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 226,col 65)",
        "(line 227,col 9)-(line 227,col 52)",
        "(line 228,col 9)-(line 228,col 46)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 230,col 9)-(line 230,col 49)",
        "(line 231,col 9)-(line 231,col 48)",
        "(line 232,col 9)-(line 232,col 50)",
        "(line 233,col 9)-(line 233,col 49)",
        "(line 235,col 9)-(line 235,col 46)",
        "(line 236,col 9)-(line 236,col 45)",
        "(line 237,col 9)-(line 237,col 49)",
        "(line 238,col 9)-(line 238,col 48)",
        "(line 239,col 9)-(line 239,col 50)",
        "(line 240,col 9)-(line 240,col 49)"
      ]
    }
  ]
}