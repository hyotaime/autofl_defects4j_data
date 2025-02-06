{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/event/ChartChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartChangeEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject"
      ],
      "begin_line": 54,
      "end_line": 134,
      "comment": "\r\n * A change event that encapsulates information about a change to a chart.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The type of event. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The chart that generated the event. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.ChartChangeEvent.ChartChangeEvent(java.lang.Object)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Creates a new chart change event.\r\n     *\r\n     * @param source  the source of the event (could be the chart, a title,\r\n     *                an axis etc.)\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.ChartChangeEvent.ChartChangeEvent(java.lang.Object, org.jfree.chart.JFreeChart)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Creates a new chart change event.\r\n     *\r\n     * @param source  the source of the event (could be the chart, a title, an\r\n     *                axis etc.)\r\n     * @param chart  the chart that generated the event.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.ChartChangeEvent.ChartChangeEvent(java.lang.Object, org.jfree.chart.JFreeChart, org.jfree.chart.event.ChartChangeEventType)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\r\n     * Creates a new chart change event.\r\n     *\r\n     * @param source  the source of the event (could be the chart, a title, an\r\n                      axis etc.)\r\n     * @param chart  the chart that generated the event.\r\n     * @param type  the type of event.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEvent.getChart()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the chart that generated the change event.\r\n     *\r\n     * @return The chart that generated the change event.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEvent.setChart(org.jfree.chart.JFreeChart)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Sets the chart that generated the change event.\r\n     *\r\n     * @param chart  the chart that generated the event.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEvent.getType()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the event type.\r\n     *\r\n     * @return The event type.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEvent.setType(org.jfree.chart.event.ChartChangeEventType)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Sets the event type.\r\n     *\r\n     * @param type  the event type.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 25)"
      ]
    }
  ]
}