{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/MouseWheelHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MouseWheelHandler",
      "is_interface": false,
      "parent_types": [
        "java.awt.event.MouseWheelListener",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 161,
      "comment": "\n * A class that handles mouse wheel events for the {@link ChartPanel} class.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "chartPanel"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomFactor"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The zoom factor. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.MouseWheelHandler.MouseWheelHandler(org.jfree.chart.ChartPanel)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param chartPanel  the chart panel (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 73,col 31)",
        "(line 74,col 9)-(line 74,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.getZoomFactor()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns the current zoom factor.  The default value is 0.10 (ten\n     * percent).\n     *\n     * @return The zoom factor.\n     *\n     * @see #setZoomFactor(double)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.setZoomFactor(double)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Sets the zoom factor.\n     *\n     * @param zoomFactor  the zoom factor.\n     *\n     * @see #getZoomFactor()\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.mouseWheelMoved(java.awt.event.MouseWheelEvent)",
      "begin_line": 105,
      "end_line": 118,
      "comment": "\n     * Handles a mouse wheel event from the underlying chart panel.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 54)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 36)",
        "(line 111,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.handleZoomable(org.jfree.chart.plot.Zoomable, java.awt.event.MouseWheelEvent)",
      "begin_line": 126,
      "end_line": 159,
      "comment": "\n     * Handle the case where a plot implements the {@link Zoomable} interface.\n     *\n     * @param zoomable  the zoomable plot.\n     * @param e  the mouse wheel event.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 74)",
        "(line 129,col 9)-(line 129,col 53)",
        "(line 130,col 9)-(line 130,col 74)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 42)",
        "(line 135,col 9)-(line 135,col 26)",
        "(line 136,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 146,col 9)-(line 146,col 30)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 148,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 28)"
      ]
    }
  ]
}