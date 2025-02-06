{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/chart/junit/StackedBarChart3DTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedBarChart3DTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 72,
      "end_line": 229,
      "comment": "\n * Some tests for a stacked bar chart with 3D effect.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.suite()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.StackedBarChart3DTests(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.setUp()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.testDrawWithNullInfo()",
      "begin_line": 106,
      "end_line": 123,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions \n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 32)",
        "(line 109,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.testReplaceDataset()",
      "begin_line": 128,
      "end_line": 151,
      "comment": "\n     * Replaces the dataset and checks that it has changed as expected.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 134,col 49)",
        "(line 136,col 9)-(line 137,col 27)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 141,col 64)",
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 147,col 75)",
        "(line 148,col 9)-(line 149,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.testSetSeriesToolTipGenerator()",
      "begin_line": 157,
      "end_line": 165,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 64)",
        "(line 159,col 9)-(line 159,col 59)",
        "(line 160,col 9)-(line 161,col 57)",
        "(line 162,col 9)-(line 162,col 50)",
        "(line 163,col 9)-(line 163,col 74)",
        "(line 164,col 9)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.testSetSeriesURLGenerator()",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 64)",
        "(line 173,col 9)-(line 173,col 59)",
        "(line 174,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 48)",
        "(line 177,col 9)-(line 177,col 67)",
        "(line 178,col 9)-(line 178,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.createChart()",
      "begin_line": 186,
      "end_line": 208,
      "comment": "\n     * Create a stacked bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 192,col 47)",
        "(line 194,col 9)-(line 195,col 27)",
        "(line 198,col 9)-(line 206,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 213,
      "end_line": 227,
      "comment": "\n     * A chart change listener.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.StackedBarChart3DTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 29)"
      ]
    }
  ]
}