{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/panel/PanHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PanHandler",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.panel.AbstractMouseHandler"
      ],
      "begin_line": 60,
      "end_line": 157,
      "comment": "\n * Handles panning operations in a {@link ChartPanel} if the plot supports\n * panning (see the {@link Pannable} interface).\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "panW",
        "panH"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Temporary storage for the width and height of the chart\n     * drawing area during panning.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "panLast"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The last mouse position during panning. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.PanHandler.PanHandler()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Creates a new instance.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.PanHandler.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 84,
      "end_line": 103,
      "comment": "\n     * Handles a mouse pressed event.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 54)",
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 44)",
        "(line 91,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.PanHandler.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 110,
      "end_line": 139,
      "comment": "\n     * Handles a mouse dragged event.  This is where the panning occurs.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 54)",
        "(line 116,col 9)-(line 116,col 44)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 118,col 9)-(line 118,col 51)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 42)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 125,col 41)",
        "(line 126,col 9)-(line 126,col 48)",
        "(line 127,col 9)-(line 127,col 77)",
        "(line 128,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 137,col 39)",
        "(line 138,col 9)-(line 138,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.PanHandler.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 146,
      "end_line": 155,
      "comment": "\n     * Handles a mouse released event.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 154,col 9)"
      ]
    }
  ]
}