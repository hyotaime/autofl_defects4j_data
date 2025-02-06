{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/junit/StackedBarChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedBarChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 76,
      "end_line": 235,
      "comment": "\n * Tests for a stacked bar chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.suite()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.StackedBarChartTests(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.setUp()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.testDrawWithNullInfo()",
      "begin_line": 110,
      "end_line": 129,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions \n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 32)",
        "(line 114,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.testReplaceDataset()",
      "begin_line": 134,
      "end_line": 157,
      "comment": "\n     * Replaces the dataset and checks that it has changed as expected.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 140,col 49)",
        "(line 142,col 9)-(line 143,col 27)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 146,col 9)-(line 146,col 40)",
        "(line 147,col 9)-(line 147,col 64)",
        "(line 148,col 9)-(line 148,col 33)",
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 155,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 163,
      "end_line": 171,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 64)",
        "(line 165,col 9)-(line 165,col 59)",
        "(line 166,col 9)-(line 167,col 57)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 169,col 9)-(line 169,col 74)",
        "(line 170,col 9)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.testSetSeriesURLGenerator()",
      "begin_line": 177,
      "end_line": 185,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 64)",
        "(line 179,col 9)-(line 179,col 59)",
        "(line 180,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 48)",
        "(line 183,col 9)-(line 183,col 67)",
        "(line 184,col 9)-(line 184,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.createChart()",
      "begin_line": 192,
      "end_line": 214,
      "comment": "\n     * Create a stacked bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 198,col 47)",
        "(line 200,col 9)-(line 201,col 27)",
        "(line 204,col 9)-(line 212,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 219,
      "end_line": 233,
      "comment": "\n     * A chart change listener.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 29)"
      ]
    }
  ]
}