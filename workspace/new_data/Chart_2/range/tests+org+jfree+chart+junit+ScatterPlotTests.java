{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/junit/ScatterPlotTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScatterPlotTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 71,
      "end_line": 201,
      "comment": "\n * Tests for a scatter plot.\n *\n "
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
      "signature": "org.jfree.chart.junit.ScatterPlotTests.suite()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.ScatterPlotTests(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.setUp()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.testDrawWithNullInfo()",
      "begin_line": 105,
      "end_line": 125,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions\n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)",
        "(line 109,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.testReplaceDataset()",
      "begin_line": 130,
      "end_line": 151,
      "comment": "\n     * Replaces the dataset and checks that it has changed as expected.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 52)",
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 135,col 32)",
        "(line 136,col 9)-(line 136,col 32)",
        "(line 137,col 9)-(line 137,col 60)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 141,col 52)",
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 147,col 73)",
        "(line 148,col 9)-(line 149,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.testSetSeriesToolTipGenerator()",
      "begin_line": 157,
      "end_line": 164,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 52)",
        "(line 159,col 9)-(line 159,col 53)",
        "(line 160,col 9)-(line 160,col 73)",
        "(line 161,col 9)-(line 161,col 50)",
        "(line 162,col 9)-(line 162,col 75)",
        "(line 163,col 9)-(line 163,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.createChart()",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Create a horizontal bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 52)",
        "(line 173,col 9)-(line 173,col 30)",
        "(line 174,col 9)-(line 174,col 30)",
        "(line 175,col 9)-(line 175,col 30)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 177,col 9)-(line 178,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 185,
      "end_line": 199,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.ScatterPlotTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 29)"
      ]
    }
  ]
}