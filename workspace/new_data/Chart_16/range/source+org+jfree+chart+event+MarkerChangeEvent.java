{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/event/MarkerChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MarkerChangeEvent",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeEvent"
      ],
      "begin_line": 51,
      "end_line": 80,
      "comment": "\r\n * An event that can be forwarded to any {@link MarkerChangeListener} to \r\n * signal a change to a {@link Marker}.\r\n * \r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "marker"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The plot that generated the event. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.MarkerChangeEvent.MarkerChangeEvent(org.jfree.chart.plot.Marker)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\r\n     * Creates a new \u003ccode\u003eMarkerChangeEvent\u003c/code\u003e instance.\r\n     *\r\n     * @param marker  the marker that triggered the event (\u003ccode\u003enull\u003c/code\u003e \r\n     *     not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 66,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.MarkerChangeEvent.getMarker()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Returns the marker that triggered the event.\r\n     *\r\n     * @return The marker that triggered the event (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 27)"
      ]
    }
  ]
}