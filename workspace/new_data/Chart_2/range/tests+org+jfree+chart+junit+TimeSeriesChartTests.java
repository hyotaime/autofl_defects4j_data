{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/junit/TimeSeriesChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 68,
      "end_line": 196,
      "comment": "\n * Some tests for a time series chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.suite()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.TimeSeriesChartTests(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.setUp()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.testDrawWithNullInfo()",
      "begin_line": 102,
      "end_line": 120,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions\n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.testReplaceDataset()",
      "begin_line": 125,
      "end_line": 146,
      "comment": "\n     * Replaces the dataset and checks that it has changed as expected.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 52)",
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 60)",
        "(line 134,col 9)-(line 134,col 46)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 52)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 138,col 35)",
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 142,col 73)",
        "(line 143,col 9)-(line 144,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 152,
      "end_line": 159,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 52)",
        "(line 154,col 9)-(line 154,col 53)",
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 50)",
        "(line 157,col 9)-(line 157,col 75)",
        "(line 158,col 9)-(line 158,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.createChart()",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n     * Create a horizontal bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 52)",
        "(line 168,col 9)-(line 168,col 30)",
        "(line 169,col 9)-(line 169,col 30)",
        "(line 170,col 9)-(line 170,col 30)",
        "(line 171,col 9)-(line 171,col 60)",
        "(line 172,col 9)-(line 173,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 180,
      "end_line": 194,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.TimeSeriesChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 29)"
      ]
    }
  ]
}