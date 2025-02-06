{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/junit/PieChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 59,
      "end_line": 138,
      "comment": "\n * Tests for a pie chart.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "pieChart"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChartTests.suite()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.PieChartTests.PieChartTests(java.lang.String)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChartTests.setUp()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChartTests.testReplaceDatasetOnPieChart()",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Using a regular pie chart, we replace the dataset with null.  Expect to\n     * receive notification of a chart change event, and (of course) the\n     * dataset should be null.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 100,col 30)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChartTests.createPieChart()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Creates a pie chart.\n     *\n     * @return The pie chart.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 60)",
        "(line 112,col 9)-(line 112,col 51)",
        "(line 113,col 9)-(line 113,col 58)",
        "(line 114,col 9)-(line 114,col 52)",
        "(line 115,col 9)-(line 115,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 122,
      "end_line": 136,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 29)"
      ]
    }
  ]
}