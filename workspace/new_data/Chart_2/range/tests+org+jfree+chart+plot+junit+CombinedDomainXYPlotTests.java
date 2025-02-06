{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/plot/junit/CombinedDomainXYPlotTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDomainXYPlotTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 78,
      "end_line": 321,
      "comment": "\n * Tests for the {@link CombinedDomainXYPlot} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "events"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A list of the events received. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Receives a chart change event.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.suite()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.CombinedDomainXYPlotTests(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.testConstructor1()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Confirm that the constructor will accept a null axis.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 67)",
        "(line 116,col 9)-(line 116,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.testRemoveSubplot()",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * This is a test to replicate the bug report 987080.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 126,col 24)",
        "(line 127,col 9)-(line 127,col 24)",
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 131,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.testEquals()",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Tests the equals() method.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 50)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 141,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.testCloning()",
      "begin_line": 147,
      "end_line": 159,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 50)",
        "(line 149,col 9)-(line 149,col 42)",
        "(line 150,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 35)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.testSerialization()",
      "begin_line": 164,
      "end_line": 182,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 50)",
        "(line 166,col 9)-(line 166,col 42)",
        "(line 167,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.testNotification()",
      "begin_line": 188,
      "end_line": 204,
      "comment": "\n     * Check that only one chart change event is generated by a change to a\n     * subplot.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 49)",
        "(line 190,col 9)-(line 190,col 48)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 193,col 64)",
        "(line 194,col 9)-(line 194,col 74)",
        "(line 195,col 9)-(line 195,col 44)",
        "(line 198,col 9)-(line 199,col 44)",
        "(line 200,col 9)-(line 200,col 47)",
        "(line 201,col 9)-(line 201,col 28)",
        "(line 202,col 9)-(line 202,col 71)",
        "(line 203,col 9)-(line 203,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.createDataset1()",
      "begin_line": 211,
      "end_line": 253,
      "comment": "\n     * Creates a sample dataset.\n     *\n     * @return Series 1.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 52)",
        "(line 215,col 9)-(line 215,col 35)",
        "(line 216,col 9)-(line 216,col 35)",
        "(line 217,col 9)-(line 217,col 35)",
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 219,col 35)",
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 35)",
        "(line 222,col 9)-(line 222,col 35)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 224,col 9)-(line 224,col 36)",
        "(line 225,col 9)-(line 225,col 36)",
        "(line 226,col 9)-(line 226,col 36)",
        "(line 227,col 9)-(line 227,col 36)",
        "(line 228,col 9)-(line 228,col 36)",
        "(line 229,col 9)-(line 229,col 36)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 232,col 35)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 35)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 237,col 35)",
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 242,col 36)",
        "(line 243,col 9)-(line 243,col 36)",
        "(line 244,col 9)-(line 244,col 36)",
        "(line 245,col 9)-(line 245,col 36)",
        "(line 246,col 9)-(line 246,col 36)",
        "(line 248,col 9)-(line 248,col 65)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 38)",
        "(line 251,col 9)-(line 251,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.createDataset2()",
      "begin_line": 260,
      "end_line": 281,
      "comment": "\n     * Creates a sample dataset.\n     *\n     * @return Series 2.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 52)",
        "(line 264,col 9)-(line 264,col 35)",
        "(line 265,col 9)-(line 265,col 35)",
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 267,col 35)",
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 36)",
        "(line 272,col 9)-(line 272,col 36)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 36)",
        "(line 275,col 9)-(line 275,col 36)",
        "(line 276,col 9)-(line 276,col 36)",
        "(line 277,col 9)-(line 277,col 36)",
        "(line 279,col 9)-(line 279,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.junit.CombinedDomainXYPlotTests.createPlot()",
      "begin_line": 288,
      "end_line": 320,
      "comment": "\n     * Creates a sample plot.\n     *\n     * @return A sample plot.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 43)",
        "(line 291,col 9)-(line 291,col 64)",
        "(line 292,col 9)-(line 292,col 58)",
        "(line 293,col 9)-(line 293,col 73)",
        "(line 294,col 9)-(line 294,col 67)",
        "(line 296,col 9)-(line 297,col 60)",
        "(line 298,col 9)-(line 298,col 65)",
        "(line 299,col 9)-(line 299,col 51)",
        "(line 300,col 9)-(line 300,col 43)",
        "(line 303,col 9)-(line 303,col 43)",
        "(line 304,col 9)-(line 304,col 64)",
        "(line 305,col 9)-(line 305,col 58)",
        "(line 306,col 9)-(line 306,col 51)",
        "(line 307,col 9)-(line 307,col 73)",
        "(line 308,col 9)-(line 308,col 64)",
        "(line 311,col 9)-(line 312,col 65)",
        "(line 313,col 9)-(line 313,col 26)",
        "(line 316,col 9)-(line 316,col 30)",
        "(line 317,col 9)-(line 317,col 30)",
        "(line 318,col 9)-(line 318,col 54)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    }
  ]
}