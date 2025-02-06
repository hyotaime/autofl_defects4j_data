{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/panel/RegionSelectionHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegionSelectionHandler",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.panel.AbstractMouseHandler"
      ],
      "begin_line": 63,
      "end_line": 247,
      "comment": "\n * A mouse handler that allows data items to be selected.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "selection"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * The selection path (in Java2D space).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastPoint"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The last mouse point.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The outline stroke.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The outline paint.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The fill paint.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.RegionSelectionHandler()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Creates a new default instance.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.RegionSelectionHandler(java.awt.Stroke, java.awt.Paint, java.awt.Paint)",
      "begin_line": 104,
      "end_line": 112,
      "comment": "\n     * Creates a new selection handler with the specified attributes.\n     *\n     * @param outlineStroke  the outline stroke.\n     * @param outlinePaint  the outline paint.\n     * @param fillPaint  the fill paint.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)",
        "(line 107,col 9)-(line 107,col 43)",
        "(line 108,col 9)-(line 108,col 30)",
        "(line 109,col 9)-(line 109,col 51)",
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 111,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.getFillPaint()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns the fill paint.\n     *\n     * @return The fill paint (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setFillPaint(java.awt.Paint)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.setFillPaint(java.awt.Paint)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Sets the fill paint.\n     *\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @see #getFillPaint()\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.getOutlinePaint()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Returns the outline paint.\n     *\n     * @return The outline paint.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.setOutlinePaint(java.awt.Paint)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Sets the outline paint.\n     *\n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.getOutlineStroke()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Returns the outline stroke.\n     *\n     * @return The outline stroke.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Sets the outline stroke.\n     *\n     * @param stroke  the outline stroke.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 177,
      "end_line": 193,
      "comment": "\n     * Handles a mouse pressed event.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 54)",
        "(line 179,col 9)-(line 179,col 57)",
        "(line 180,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 200,
      "end_line": 216,
      "comment": "\n     * Handles a mouse dragged event.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 54)",
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 207,col 43)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 43)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 214,col 9)-(line 214,col 58)",
        "(line 215,col 9)-(line 215,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.RegionSelectionHandler.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 223,
      "end_line": 245,
      "comment": "\n     * Handles a mouse released event.\n     *\n     * @param e  the event.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 54)",
        "(line 228,col 9)-(line 228,col 35)",
        "(line 231,col 9)-(line 231,col 44)",
        "(line 232,col 9)-(line 232,col 36)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 41)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 31)",
        "(line 242,col 9)-(line 242,col 30)",
        "(line 243,col 9)-(line 243,col 24)",
        "(line 244,col 9)-(line 244,col 38)"
      ]
    }
  ]
}