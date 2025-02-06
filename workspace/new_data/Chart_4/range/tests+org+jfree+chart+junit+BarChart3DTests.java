{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/junit/BarChart3DTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BarChart3DTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 75,
      "end_line": 225,
      "comment": "\n * Tests for a 3D bar chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.suite()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.BarChart3DTests.BarChart3DTests(java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.setUp()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.testDrawWithNullInfo()",
      "begin_line": 109,
      "end_line": 124,
      "comment": "\n     * Draws the chart with a null info object to make sure that no exceptions\n     * are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 32)",
        "(line 111,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.testReplaceDataset()",
      "begin_line": 129,
      "end_line": 152,
      "comment": "\n     * Replaces the dataset and checks that the data range is as expected.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 135,col 49)",
        "(line 137,col 9)-(line 138,col 27)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 142,col 64)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 35)",
        "(line 145,col 9)-(line 145,col 45)",
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 148,col 71)",
        "(line 149,col 9)-(line 150,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.testSetSeriesToolTipGenerator()",
      "begin_line": 158,
      "end_line": 167,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 64)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 162,col 57)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 165,col 23)",
        "(line 166,col 9)-(line 166,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.testSetSeriesURLGenerator()",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 64)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 177,col 53)",
        "(line 178,col 9)-(line 178,col 48)",
        "(line 179,col 9)-(line 179,col 74)",
        "(line 180,col 9)-(line 180,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.createBarChart3D()",
      "begin_line": 188,
      "end_line": 203,
      "comment": "\n     * Create a horizontal bar chart with sample data in the range -3 to +3.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 47)",
        "(line 196,col 9)-(line 197,col 27)",
        "(line 200,col 9)-(line 201,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 209,
      "end_line": 223,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.BarChart3DTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 29)"
      ]
    }
  ]
}