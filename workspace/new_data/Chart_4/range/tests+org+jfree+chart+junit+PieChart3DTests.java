{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/junit/PieChart3DTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieChart3DTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 62,
      "end_line": 173,
      "comment": "\n * Tests for a pie chart with a 3D effect.\n "
    },
    {
      "type": "field",
      "varNames": [
        "pieChart"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChart3DTests.suite()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.PieChart3DTests.PieChart3DTests(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChart3DTests.setUp()",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 60)",
        "(line 91,col 9)-(line 91,col 51)",
        "(line 92,col 9)-(line 92,col 58)",
        "(line 93,col 9)-(line 93,col 52)",
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChart3DTests.testReplaceDatasetOnPieChart()",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n     * Using a regular pie chart, we replace the dataset with null.  Expect to\n     * receive notification of a chart change event, and (of course) the\n     * dataset should be null.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 46)",
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 105,col 57)",
        "(line 106,col 9)-(line 106,col 30)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 108,col 9)-(line 108,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChart3DTests.testNullValueInDataset()",
      "begin_line": 115,
      "end_line": 134,
      "comment": "\n     * Tests that no exceptions are thrown when there is a \u003ccode\u003enull\u003c/code\u003e\n     * value in the dataset.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 60)",
        "(line 117,col 9)-(line 117,col 44)",
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 53)",
        "(line 121,col 9)-(line 121,col 32)",
        "(line 122,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChart3DTests.createPieChart3D(org.jfree.data.general.PieDataset)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "\n     * Creates a pie chart.\n     *\n     * @param dataset  the dataset.\n     *\n     * @return The pie chart.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 151,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 157,
      "end_line": 171,
      "comment": "\n     * A chart change listener.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.PieChart3DTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 29)"
      ]
    }
  ]
}