{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/plot/junit/MultiplePiePlotTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiplePiePlotTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 76,
      "end_line": 244,
      "comment": "\n * Some tests for the {@link MultiplePiePlot} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastEvent"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The last event received. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.suite()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Receives a plot change event and records it.  Some tests will use this\n     * to check that events have been generated (or not) when required.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.MultiplePiePlotTests(java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testConstructor()",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * Some checks for the constructors.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 115,col 38)",
        "(line 119,col 9)-(line 119,col 70)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testEquals()",
      "begin_line": 127,
      "end_line": 166,
      "comment": "\n     * Check that the equals() method distinguishes the required fields.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 51)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 133,col 9)-(line 133,col 50)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 135,col 50)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 138,col 9)-(line 138,col 26)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 26)",
        "(line 141,col 9)-(line 141,col 34)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 144,col 9)-(line 144,col 35)",
        "(line 145,col 9)-(line 145,col 53)",
        "(line 146,col 9)-(line 146,col 34)",
        "(line 148,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 152,col 43)",
        "(line 153,col 9)-(line 153,col 34)",
        "(line 155,col 9)-(line 156,col 23)",
        "(line 157,col 9)-(line 157,col 35)",
        "(line 158,col 9)-(line 159,col 23)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 162,col 9)-(line 162,col 74)",
        "(line 163,col 9)-(line 163,col 35)",
        "(line 164,col 9)-(line 164,col 74)",
        "(line 165,col 9)-(line 165,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testCloning()",
      "begin_line": 171,
      "end_line": 189,
      "comment": "\n     * Some basic checks for the clone() method.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 51)",
        "(line 173,col 9)-(line 173,col 70)",
        "(line 174,col 9)-(line 174,col 36)",
        "(line 175,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 29)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 184,col 9)-(line 184,col 34)",
        "(line 187,col 9)-(line 187,col 41)",
        "(line 188,col 9)-(line 188,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testSerialization()",
      "begin_line": 194,
      "end_line": 214,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 55)",
        "(line 196,col 9)-(line 197,col 40)",
        "(line 198,col 9)-(line 198,col 34)",
        "(line 199,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.MultiplePiePlotTests.testGetLegendItems()",
      "begin_line": 219,
      "end_line": 242,
      "comment": "\n     * Fetches the legend items and checks the values.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 70)",
        "(line 221,col 9)-(line 221,col 43)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 223,col 43)",
        "(line 224,col 9)-(line 224,col 43)",
        "(line 225,col 9)-(line 225,col 60)",
        "(line 226,col 9)-(line 226,col 48)",
        "(line 227,col 9)-(line 227,col 65)",
        "(line 228,col 9)-(line 228,col 52)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 230,col 45)",
        "(line 231,col 9)-(line 231,col 49)",
        "(line 232,col 9)-(line 232,col 48)",
        "(line 233,col 9)-(line 233,col 50)",
        "(line 234,col 9)-(line 234,col 49)",
        "(line 236,col 9)-(line 236,col 46)",
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 238,col 49)",
        "(line 239,col 9)-(line 239,col 48)",
        "(line 240,col 9)-(line 240,col 50)",
        "(line 241,col 9)-(line 241,col 49)"
      ]
    }
  ]
}