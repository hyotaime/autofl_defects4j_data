{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/event/AxisChangeListener.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AxisChangeListener",
      "is_interface": true,
      "parent_types": [
        "java.util.EventListener"
      ],
      "begin_line": 57,
      "end_line": 66,
      "comment": "\r\n * The interface that must be supported by classes that wish to receive \r\n * notification of changes to an axis.\r\n * \u003cP\u003e\r\n * The Plot class implements this interface, and automatically registers with \r\n * its axes (if any). Any axis changes are passed on by the plot as a plot \r\n * change event.  This is part of the notification mechanism that ensures that \r\n * charts are redrawn whenever changes are made to any chart component.\r\n *\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.AxisChangeListener.axisChanged(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\r\n     * Receives notification of an axis change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": []
    }
  ]
}