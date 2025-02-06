{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/junit/XYBarChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBarChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 71,
      "end_line": 214,
      "comment": "\n * Some tests for an XY bar chart.\n "
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
      "signature": "org.jfree.chart.junit.XYBarChartTests.suite()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.XYBarChartTests.XYBarChartTests(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYBarChartTests.setUp()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYBarChartTests.testDrawWithNullInfo()",
      "begin_line": 105,
      "end_line": 123,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions\n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)",
        "(line 108,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYBarChartTests.testReplaceDataset()",
      "begin_line": 128,
      "end_line": 150,
      "comment": "\n     * Replaces the dataset and checks that it has changed as expected.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 52)",
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 135,col 60)",
        "(line 137,col 9)-(line 137,col 46)",
        "(line 138,col 9)-(line 138,col 40)",
        "(line 140,col 9)-(line 140,col 52)",
        "(line 141,col 9)-(line 141,col 33)",
        "(line 142,col 9)-(line 142,col 35)",
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 38)",
        "(line 145,col 9)-(line 146,col 73)",
        "(line 147,col 9)-(line 148,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYBarChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 156,
      "end_line": 163,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 52)",
        "(line 158,col 9)-(line 158,col 53)",
        "(line 159,col 9)-(line 159,col 73)",
        "(line 160,col 9)-(line 160,col 50)",
        "(line 161,col 9)-(line 161,col 75)",
        "(line 162,col 9)-(line 162,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYBarChartTests.createChart()",
      "begin_line": 170,
      "end_line": 192,
      "comment": "\n     * Create a horizontal bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 52)",
        "(line 174,col 9)-(line 174,col 30)",
        "(line 175,col 9)-(line 175,col 30)",
        "(line 176,col 9)-(line 176,col 30)",
        "(line 177,col 9)-(line 178,col 31)",
        "(line 181,col 9)-(line 190,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 198,
      "end_line": 212,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.XYBarChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 209,col 13)-(line 209,col 29)"
      ]
    }
  ]
}