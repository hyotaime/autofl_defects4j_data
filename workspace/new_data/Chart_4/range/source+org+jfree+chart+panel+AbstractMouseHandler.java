{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/panel/AbstractMouseHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMouseHandler",
      "is_interface": false,
      "parent_types": [
        "java.awt.event.MouseListener",
        "java.awt.event.MouseMotionListener"
      ],
      "begin_line": 53,
      "end_line": 154,
      "comment": "\n * A handler for mouse events in a {@link ChartPanel}.  A handler can be\n * assigned a modifier and installed on the panel to be invoked by the user.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "modifier"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The modifier used to invoke this handler. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.AbstractMouseHandler()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.getModifier()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Returns the modifier for this handler.\n     *\n     * @return The modifier.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.setModifier(int)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Sets the modifier for this handler.\n     *\n     * @param modifier  the modifier.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Handle a mouse pressed event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Handle a mouse released event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mouseClicked(java.awt.event.MouseEvent)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Handle a mouse clicked event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mouseEntered(java.awt.event.MouseEvent)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Handle a mouse entered event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mouseMoved(java.awt.event.MouseEvent)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Handle a mouse moved event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mouseExited(java.awt.event.MouseEvent)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Handle a mouse exited event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractMouseHandler.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Handle a mouse dragged event.  This implementation does nothing -\n     * subclasses should override if necessary.\n     *\n     * @param e  the mouse event.\n     ",
      "child_ranges": []
    }
  ]
}