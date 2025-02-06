{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYLine3DRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYLine3DRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
        "org.jfree.chart.Effect3D",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 282,
      "comment": "\r\n * A XYLineAndShapeRenderer that adds a shadow line to the graph\r\n * to emulate a 3D-effect.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_X_OFFSET"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The default x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_Y_OFFSET"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The default y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WALL_PAINT"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The default wall paint. "
    },
    {
      "type": "field",
      "varNames": [
        "xOffset"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The size of x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "yOffset"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The size of y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "wallPaint"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The paint used to shade the left and lower 3D wall. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.XYLine3DRenderer()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)",
        "(line 91,col 9)-(line 91,col 40)",
        "(line 92,col 9)-(line 92,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.getXOffset()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the x-offset for the 3D effect.\r\n     *\r\n     * @return The 3D effect.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.getYOffset()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Returns the y-offset for the 3D effect.\r\n     *\r\n     * @return The 3D effect.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.setXOffset(double)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\r\n     * Sets the x-offset and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param xOffset  the x-offset.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 31)",
        "(line 121,col 9)-(line 121,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.setYOffset(double)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\r\n     * Sets the y-offset and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param yOffset  the y-offset.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)",
        "(line 132,col 9)-(line 132,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.getWallPaint()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Returns the paint used to highlight the left and bottom wall in the plot\r\n     * background.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.setWallPaint(java.awt.Paint)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\r\n     * Sets the paint used to hightlight the left and bottom walls in the plot \r\n     * background.\r\n     *\r\n     * @param paint  the paint.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 31)",
        "(line 153,col 9)-(line 153,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.getPassCount()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the number of passes through the data that the renderer requires \r\n     * in order to draw the chart.  Most charts will require a single pass, \r\n     * but some require two passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.isLinePass(int)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified pass involves drawing lines.\r\n     * \r\n     * @param pass  the pass.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.isItemPass(int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified pass involves drawing items.\r\n     * \r\n     * @param pass  the pass.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.isShadowPass(int)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified pass involves drawing shadows.\r\n     * \r\n     * @param pass  the pass.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.drawFirstPassShape(java.awt.Graphics2D, int, int, int, java.awt.Shape)",
      "begin_line": 209,
      "end_line": 227,
      "comment": "\r\n     * Overrides the method in the subclass to draw a shadow in the first pass.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param pass  the pass.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param shape  the shape.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.equals(java.lang.Object)",
      "begin_line": 236,
      "end_line": 254,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 55)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 264,
      "end_line": 268,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 267,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLine3DRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 59)"
      ]
    }
  ]
}