{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/VectorRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 328,
      "comment": "\r\n * A renderer that represents data from an {@link VectorXYDataset} by drawing a\r\n * line with an arrow at each (x, y) point.\r\n * \r\n * @since 1.0.6\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "baseLength"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The length of the base. "
    },
    {
      "type": "field",
      "varNames": [
        "headLength"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The length of the head. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.VectorRenderer()",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYBlockRenderer\u003c/code\u003e instance with default \r\n     * attributes.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 93,
      "end_line": 138,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the \r\n     * specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 50)",
        "(line 98,col 9)-(line 98,col 50)",
        "(line 99,col 9)-(line 99,col 51)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 101,col 22)",
        "(line 102,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 149,
      "end_line": 194,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e \r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 50)",
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 156,col 22)",
        "(line 157,col 9)-(line 157,col 22)",
        "(line 158,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 212,
      "end_line": 283,
      "comment": "\r\n     * Draws the block representing the specified item.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the x-axis.\r\n     * @param rangeAxis  the y-axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param crosshairState  the crosshair state.\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 219,col 24)",
        "(line 220,col 9)-(line 220,col 24)",
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 226,col 42)",
        "(line 227,col 9)-(line 228,col 41)",
        "(line 229,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 232,col 41)",
        "(line 233,col 9)-(line 233,col 20)",
        "(line 234,col 9)-(line 234,col 60)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 48)",
        "(line 242,col 9)-(line 242,col 50)",
        "(line 243,col 9)-(line 243,col 22)",
        "(line 246,col 9)-(line 246,col 33)",
        "(line 247,col 9)-(line 247,col 33)",
        "(line 248,col 9)-(line 248,col 56)",
        "(line 249,col 9)-(line 249,col 56)",
        "(line 251,col 9)-(line 251,col 56)",
        "(line 252,col 9)-(line 252,col 56)",
        "(line 254,col 9)-(line 254,col 27)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 46)",
        "(line 259,col 9)-(line 259,col 46)",
        "(line 261,col 9)-(line 261,col 35)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 36)",
        "(line 264,col 9)-(line 264,col 36)",
        "(line 266,col 9)-(line 266,col 42)",
        "(line 267,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 22)",
        "(line 280,col 9)-(line 280,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.equals(java.lang.Object)",
      "begin_line": 299,
      "end_line": 314,
      "comment": "\r\n     * Tests this \u003ccode\u003eVectorRenderer\u003c/code\u003e for equality with an arbitrary\r\n     * object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eVectorRenderer\u003c/code\u003e (not\r\n     *     \u003ccode\u003enull\u003c/code\u003e);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e has the same field values as this \r\n     *     \u003ccode\u003eVectorRenderer\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 51)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.clone()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns a clone of this renderer.\r\n     * \r\n     * @return A clone of this renderer.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem creating the \r\n     *     clone.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 29)"
      ]
    }
  ]
}