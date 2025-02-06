{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/MouseWheelHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MouseWheelHandler",
      "is_interface": false,
      "parent_types": [
        "java.awt.event.MouseWheelListener",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 156,
      "comment": "\n * A class that handles mouse wheel events for the {@link ChartPanel} class.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "chartPanel"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomFactor"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The zoom factor. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.MouseWheelHandler.MouseWheelHandler(org.jfree.chart.ChartPanel)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Creates a new instance for the specified chart panel.\n     *\n     * @param chartPanel  the chart panel (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 37)",
        "(line 76,col 9)-(line 76,col 31)",
        "(line 77,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.getZoomFactor()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the current zoom factor.  The default value is 0.10 (ten\n     * percent).\n     *\n     * @return The zoom factor.\n     *\n     * @see #setZoomFactor(double)\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.setZoomFactor(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Sets the zoom factor.\n     *\n     * @param zoomFactor  the zoom factor.\n     *\n     * @see #getZoomFactor()\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.mouseWheelMoved(java.awt.event.MouseWheelEvent)",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\n     * Handles a mouse wheel event from the underlying chart panel.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 54)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 36)",
        "(line 114,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.MouseWheelHandler.handleZoomable(org.jfree.chart.plot.Zoomable, java.awt.event.MouseWheelEvent)",
      "begin_line": 129,
      "end_line": 154,
      "comment": "\n     * Handle the case where a plot implements the {@link Zoomable} interface.\n     *\n     * @param zoomable  the zoomable plot.\n     * @param e  the mouse wheel event.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 74)",
        "(line 132,col 9)-(line 132,col 53)",
        "(line 133,col 9)-(line 133,col 74)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 30)",
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 36)"
      ]
    }
  ]
}