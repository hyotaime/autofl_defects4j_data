{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/event/RendererChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RendererChangeEvent",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeEvent"
      ],
      "begin_line": 50,
      "end_line": 108,
      "comment": "\r\n * An event that can be forwarded to any {@link RendererChangeListener} to\r\n * signal a change to a renderer.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "renderer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The renderer that generated the event. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibilityChanged"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\r\n     * A flag that indicates whether this event relates to a change in the\r\n     * series visibility.  If so, the receiver (if it is a plot) may want to\r\n     * update the axis bounds.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.RendererChangeEvent.RendererChangeEvent(java.lang.Object)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Creates a new event.\r\n     *\r\n     * @param renderer  the renderer that generated the event.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.RendererChangeEvent.RendererChangeEvent(java.lang.Object, boolean)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\r\n     * Creates a new event.\r\n     *\r\n     * @param renderer  the renderer that generated the event.\r\n     * @param seriesVisibilityChanged  a flag that indicates whether or not\r\n     *         the event relates to a change in the series visibility flags.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)",
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 84,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.RendererChangeEvent.getRenderer()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the renderer that generated the event.\r\n     *\r\n     * @return The renderer that generated the event.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.RendererChangeEvent.getSeriesVisibilityChanged()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the flag that indicates whether or not the event relates to\r\n     * a change in series visibility.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)"
      ]
    }
  ]
}