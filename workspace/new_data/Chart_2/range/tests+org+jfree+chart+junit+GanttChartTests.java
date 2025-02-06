{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/chart/junit/GanttChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GanttChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 74,
      "end_line": 321,
      "comment": "\n * Some tests for a Gantt chart.\n "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A chart. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.suite()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.junit.GanttChartTests.GanttChartTests(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.setUp()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testDrawWithNullInfo()",
      "begin_line": 108,
      "end_line": 124,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that\n     * no exceptions are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testDrawWithNullInfo2()",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that\n     * no exceptions are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testReplaceDataset()",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * Replaces the chart\u0027s dataset and then checks that the new dataset is OK.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 46)",
        "(line 150,col 9)-(line 150,col 40)",
        "(line 151,col 9)-(line 151,col 64)",
        "(line 152,col 9)-(line 152,col 30)",
        "(line 153,col 9)-(line 153,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 160,
      "end_line": 169,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 64)",
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 164,col 57)",
        "(line 165,col 9)-(line 165,col 50)",
        "(line 166,col 9)-(line 167,col 23)",
        "(line 168,col 9)-(line 168,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testSetSeriesURLGenerator()",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 64)",
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 181,col 9)-(line 181,col 74)",
        "(line 182,col 9)-(line 182,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.createGanttChart()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Create a Gantt chart.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 192,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.createDataset()",
      "begin_line": 200,
      "end_line": 283,
      "comment": "\n     * Creates a sample dataset for a Gantt chart.\n     *\n     * @return The dataset.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 52)",
        "(line 203,col 9)-(line 205,col 69)",
        "(line 206,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 211,col 67)",
        "(line 212,col 9)-(line 214,col 68)",
        "(line 215,col 9)-(line 217,col 68)",
        "(line 218,col 9)-(line 220,col 69)",
        "(line 221,col 9)-(line 223,col 70)",
        "(line 224,col 9)-(line 226,col 71)",
        "(line 227,col 9)-(line 229,col 74)",
        "(line 230,col 9)-(line 232,col 72)",
        "(line 233,col 9)-(line 235,col 73)",
        "(line 236,col 9)-(line 238,col 73)",
        "(line 240,col 9)-(line 240,col 49)",
        "(line 241,col 9)-(line 243,col 69)",
        "(line 244,col 9)-(line 246,col 69)",
        "(line 247,col 9)-(line 249,col 68)",
        "(line 250,col 9)-(line 252,col 69)",
        "(line 253,col 9)-(line 255,col 69)",
        "(line 256,col 9)-(line 258,col 74)",
        "(line 259,col 9)-(line 261,col 74)",
        "(line 262,col 9)-(line 264,col 74)",
        "(line 265,col 9)-(line 267,col 72)",
        "(line 268,col 9)-(line 270,col 73)",
        "(line 271,col 9)-(line 273,col 72)",
        "(line 274,col 9)-(line 276,col 73)",
        "(line 278,col 9)-(line 278,col 69)",
        "(line 279,col 9)-(line 279,col 27)",
        "(line 280,col 9)-(line 280,col 27)",
        "(line 282,col 9)-(line 282,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.date(int, int, int)",
      "begin_line": 294,
      "end_line": 301,
      "comment": "\n     * Utility method for creating \u003ccode\u003eDate\u003c/code\u003e objects.\n     *\n     * @param day  the date.\n     * @param month  the month.\n     * @param year  the year.\n     *\n     * @return a date.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 51)",
        "(line 297,col 9)-(line 297,col 39)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 305,
      "end_line": 319,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 29)"
      ]
    }
  ]
}