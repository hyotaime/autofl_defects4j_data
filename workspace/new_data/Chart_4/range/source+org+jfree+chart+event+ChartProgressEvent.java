{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/event/ChartProgressEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartProgressEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject"
      ],
      "begin_line": 49,
      "end_line": 136,
      "comment": "\r\n * An event that contains information about the drawing progress of a chart.\r\n *\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "DRAWING_STARTED"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Indicates drawing has started. "
    },
    {
      "type": "field",
      "varNames": [
        "DRAWING_FINISHED"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Indicates drawing has finished. "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The type of event. "
    },
    {
      "type": "field",
      "varNames": [
        "percent"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The percentage of completion. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The chart that generated the event. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.ChartProgressEvent.ChartProgressEvent(java.lang.Object, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\r\n     * Creates a new chart change event.\r\n     *\r\n     * @param source  the source of the event (could be the chart, a title, an\r\n     *                axis etc.)\r\n     * @param chart  the chart that generated the event.\r\n     * @param type  the type of event.\r\n     * @param percent  the percentage of completion.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 22)",
        "(line 78,col 9)-(line 78,col 27)",
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartProgressEvent.getChart()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns the chart that generated the change event.\r\n     *\r\n     * @return The chart that generated the change event.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartProgressEvent.setChart(org.jfree.chart.JFreeChart)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Sets the chart that generated the change event.\r\n     *\r\n     * @param chart  the chart that generated the event.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartProgressEvent.getType()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Returns the event type.\r\n     *\r\n     * @return The event type.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartProgressEvent.setType(int)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Sets the event type.\r\n     *\r\n     * @param type  the event type.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartProgressEvent.getPercent()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns the percentage complete.\r\n     *\r\n     * @return The percentage complete.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartProgressEvent.setPercent(int)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Sets the percentage complete.\r\n     *\r\n     * @param percent  the percentage.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 31)"
      ]
    }
  ]
}