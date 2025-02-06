{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ChartMouseEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartMouseEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 118,
      "comment": "\r\n * A mouse event for a chart that is displayed in a {@link ChartPanel}.\r\n * \r\n * @see ChartMouseListener\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The chart that the mouse event relates to. "
    },
    {
      "type": "field",
      "varNames": [
        "trigger"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The Java mouse event that triggered this event. "
    },
    {
      "type": "field",
      "varNames": [
        "entity"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The chart entity (if any). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartMouseEvent.ChartMouseEvent(org.jfree.chart.JFreeChart, java.awt.event.MouseEvent, org.jfree.chart.entity.ChartEntity)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\r\n     * Constructs a new event.\r\n     *\r\n     * @param chart  the source chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param trigger  the mouse event that triggered this event \r\n     *                 (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param entity  the chart entity (if any) under the mouse point \r\n     *                (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 21)",
        "(line 86,col 9)-(line 86,col 27)",
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartMouseEvent.getChart()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the chart that the mouse event relates to.\r\n     *\r\n     * @return The chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartMouseEvent.getTrigger()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Returns the mouse event that triggered this event.\r\n     *\r\n     * @return The event (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartMouseEvent.getEntity()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Returns the chart entity (if any) under the mouse point.\r\n     *\r\n     * @return The chart entity (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 27)"
      ]
    }
  ]
}