{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/chart/junit/GanttChartTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GanttChartTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 74,
      "end_line": 328,
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
      "end_line": 123,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that \n     * no exceptions are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testDrawWithNullInfo2()",
      "begin_line": 129,
      "end_line": 142,
      "comment": "\n     * Draws the chart with a \u003ccode\u003enull\u003c/code\u003e info object to make sure that \n     * no exceptions are thrown (a problem that was occurring at one point).\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testReplaceDataset()",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * Replaces the chart\u0027s dataset and then checks that the new dataset is OK.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 64)",
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testSetSeriesToolTipGenerator()",
      "begin_line": 159,
      "end_line": 167,
      "comment": "\n     * Check that setting a tool tip generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 64)",
        "(line 161,col 9)-(line 161,col 59)",
        "(line 162,col 9)-(line 163,col 57)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 74)",
        "(line 166,col 9)-(line 166,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.testSetSeriesURLGenerator()",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * Check that setting a URL generator for a series does override the\n     * default generator.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 64)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 177,col 53)",
        "(line 178,col 9)-(line 178,col 48)",
        "(line 179,col 9)-(line 179,col 67)",
        "(line 180,col 9)-(line 180,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.createGanttChart()",
      "begin_line": 188,
      "end_line": 200,
      "comment": "\n     * Create a Gantt chart.\n     *\n     * @return The chart.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 198,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.createDataset()",
      "begin_line": 207,
      "end_line": 290,
      "comment": "\n     * Creates a sample dataset for a Gantt chart.\n     *\n     * @return The dataset.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 212,col 69)",
        "(line 213,col 9)-(line 215,col 69)",
        "(line 216,col 9)-(line 218,col 67)",
        "(line 219,col 9)-(line 221,col 68)",
        "(line 222,col 9)-(line 224,col 68)",
        "(line 225,col 9)-(line 227,col 69)",
        "(line 228,col 9)-(line 230,col 70)",
        "(line 231,col 9)-(line 233,col 71)",
        "(line 234,col 9)-(line 236,col 74)",
        "(line 237,col 9)-(line 239,col 72)",
        "(line 240,col 9)-(line 242,col 73)",
        "(line 243,col 9)-(line 245,col 73)",
        "(line 247,col 9)-(line 247,col 49)",
        "(line 248,col 9)-(line 250,col 69)",
        "(line 251,col 9)-(line 253,col 69)",
        "(line 254,col 9)-(line 256,col 68)",
        "(line 257,col 9)-(line 259,col 69)",
        "(line 260,col 9)-(line 262,col 69)",
        "(line 263,col 9)-(line 265,col 74)",
        "(line 266,col 9)-(line 268,col 74)",
        "(line 269,col 9)-(line 271,col 74)",
        "(line 272,col 9)-(line 274,col 72)",
        "(line 275,col 9)-(line 277,col 73)",
        "(line 278,col 9)-(line 280,col 72)",
        "(line 281,col 9)-(line 283,col 73)",
        "(line 285,col 9)-(line 285,col 69)",
        "(line 286,col 9)-(line 286,col 27)",
        "(line 287,col 9)-(line 287,col 27)",
        "(line 289,col 9)-(line 289,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.date(int, int, int)",
      "begin_line": 301,
      "end_line": 308,
      "comment": "\n     * Utility method for creating \u003ccode\u003eDate\u003c/code\u003e objects.\n     *\n     * @param day  the date.\n     * @param month  the month.\n     * @param year  the year.\n     *\n     * @return a date.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 51)",
        "(line 304,col 9)-(line 304,col 39)",
        "(line 305,col 9)-(line 305,col 41)",
        "(line 306,col 9)-(line 306,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalListener",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeListener"
      ],
      "begin_line": 312,
      "end_line": 326,
      "comment": "\n     * A chart change listener.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flag"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " A flag. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.junit.GanttChartTests.LocalListener.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n         * Event handler.\n         *\n         * @param event  the event.\n         ",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 29)"
      ]
    }
  ]
}