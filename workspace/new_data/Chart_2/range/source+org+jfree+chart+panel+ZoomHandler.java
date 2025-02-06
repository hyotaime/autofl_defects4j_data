{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/panel/ZoomHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZoomHandler",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.panel.AbstractMouseHandler"
      ],
      "begin_line": 55,
      "end_line": 258,
      "comment": "\n * A mouse handler than performs a zooming operation on a ChartPanel.\n "
    },
    {
      "type": "field",
      "varNames": [
        "zoomPoint"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zoomRectangle"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.ZoomHandler.ZoomHandler()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Creates a new instance.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.ZoomHandler.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 68,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 59)",
        "(line 70,col 9)-(line 71,col 26)",
        "(line 72,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.ZoomHandler.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 81,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 54)",
        "(line 88,col 9)-(line 88,col 57)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 30)",
        "(line 99,col 9)-(line 99,col 30)",
        "(line 100,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 109,col 74)",
        "(line 110,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 51)",
        "(line 132,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.ZoomHandler.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 143,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 54)",
        "(line 149,col 9)-(line 149,col 30)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 161,col 75)",
        "(line 162,col 9)-(line 163,col 75)",
        "(line 164,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.ZoomHandler.drawZoomRectangle(org.jfree.chart.ChartPanel, java.awt.Graphics2D, boolean)",
      "begin_line": 236,
      "end_line": 256,
      "comment": "\n     * Draws zoom rectangle (if present).\n     * The drawing is performed in XOR mode, therefore\n     * when this method is called twice in a row,\n     * the second call will completely restore the state\n     * of the canvas.\n     *\n     * @param g2 the graphics device.\n     * @param xor  use XOR for drawing?\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 255,col 9)"
      ]
    }
  ]
}