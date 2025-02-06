{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/junit/XYAreaChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYAreaChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 69,
      "end_line": 210,
      "comment": "\n * Some tests for an XY area chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.suite()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.XYAreaChartTests(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.setUp()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.testDrawWithNullInfo()",
      "begin_line": 103,
      "end_line": 121,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions \n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 32)",
        "(line 106,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.testReplaceDataset()",
      "begin_line": 126,
      "end_line": 147,
      "comment": "\n     * Replaces the dataset and checks that it has changed as expected.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 52)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 135,col 9)-(line 135,col 46)",
        "(line 136,col 9)-(line 136,col 40)",
        "(line 137,col 9)-(line 137,col 52)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 143,col 73)",
        "(line 144,col 9)-(line 145,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 52)",
        "(line 155,col 9)-(line 155,col 53)",
        "(line 156,col 9)-(line 156,col 73)",
        "(line 157,col 9)-(line 157,col 50)",
        "(line 158,col 9)-(line 158,col 68)",
        "(line 159,col 9)-(line 159,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.createChart()",
      "begin_line": 167,
      "end_line": 188,
      "comment": "\n     * Create a horizontal bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 52)",
        "(line 171,col 9)-(line 171,col 30)",
        "(line 172,col 9)-(line 172,col 30)",
        "(line 173,col 9)-(line 173,col 30)",
        "(line 174,col 9)-(line 174,col 60)",
        "(line 177,col 9)-(line 186,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 194,
      "end_line": 208,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYAreaChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 29)"
      ]
    }
  ]
}