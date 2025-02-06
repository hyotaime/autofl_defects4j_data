{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/junit/BarChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BarChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 75,
      "end_line": 229,
      "comment": "\n * Tests for a bar chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.suite()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.BarChartTests.BarChartTests(java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.setUp()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.testDrawWithNullInfo()",
      "begin_line": 109,
      "end_line": 128,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions\n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 32)",
        "(line 113,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.testReplaceDataset()",
      "begin_line": 133,
      "end_line": 156,
      "comment": "\n     * Replaces the chart\u0027s dataset and then checks that the new dataset is OK.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 139,col 49)",
        "(line 141,col 9)-(line 142,col 27)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 40)",
        "(line 146,col 9)-(line 146,col 64)",
        "(line 147,col 9)-(line 147,col 33)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 45)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 152,col 74)",
        "(line 153,col 9)-(line 154,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 162,
      "end_line": 171,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 164,col 59)",
        "(line 165,col 9)-(line 166,col 57)",
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 169,col 23)",
        "(line 170,col 9)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.testSetSeriesURLGenerator()",
      "begin_line": 177,
      "end_line": 185,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 64)",
        "(line 179,col 9)-(line 179,col 59)",
        "(line 180,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 48)",
        "(line 183,col 9)-(line 183,col 74)",
        "(line 184,col 9)-(line 184,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChartTests.createBarChart()",
      "begin_line": 192,
      "end_line": 207,
      "comment": "\n     * Create a bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 198,col 47)",
        "(line 200,col 9)-(line 201,col 27)",
        "(line 204,col 9)-(line 205,col 31)"
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
      "comment": "\n     * A chart change listener.\n     *\n     "
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
      "signature": "org.jfree.chart.junit.BarChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 29)"
      ]
    }
  ]
}