{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/junit/AreaChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AreaChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 71,
      "end_line": 211,
      "comment": "\n * Tests for an area chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.suite()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.AreaChartTests.AreaChartTests(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.setUp()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 107,col 59)",
        "(line 108,col 9)-(line 109,col 57)",
        "(line 110,col 9)-(line 110,col 50)",
        "(line 111,col 9)-(line 111,col 74)",
        "(line 112,col 9)-(line 112,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.testSetSeriesURLGenerator()",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 121,col 59)",
        "(line 122,col 9)-(line 123,col 53)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 67)",
        "(line 126,col 9)-(line 126,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.testDrawWithNullInfo()",
      "begin_line": 133,
      "end_line": 148,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions \n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.testReplaceDataset()",
      "begin_line": 153,
      "end_line": 173,
      "comment": "\n     * Replaces the chart\u0027s dataset and then checks that the new dataset is OK.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 49)",
        "(line 159,col 9)-(line 160,col 32)",
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 165,col 35)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 169,col 74)",
        "(line 170,col 9)-(line 171,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.createAreaChart()",
      "begin_line": 180,
      "end_line": 190,
      "comment": "\n     * Create an area chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 184,col 47)",
        "(line 185,col 9)-(line 186,col 27)",
        "(line 187,col 9)-(line 188,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 195,
      "end_line": 209,
      "comment": "\n     * A chart change listener.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.AreaChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 29)"
      ]
    }
  ]
}