{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/VectorRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 344,
      "comment": "\r\n * A renderer that represents data from an {@link VectorXYDataset} by drawing a\r\n * line with an arrow at each (x, y) point.\r\n * The example shown here is generated by the \u003ccode\u003eVectorPlotDemo1.java\u003c/code\u003e\r\n * program included in the JFreeChart demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/VectorRendererSample.png\"\r\n * alt\u003d\"VectorRendererSample.png\" /\u003e\r\n *\r\n * @since 1.0.6\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "baseLength"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The length of the base. "
    },
    {
      "type": "field",
      "varNames": [
        "headLength"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The length of the head. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.VectorRenderer()",
      "begin_line": 90,
      "end_line": 91,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYBlockRenderer\u003c/code\u003e instance with default\r\n     * attributes.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 102,
      "end_line": 147,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the\r\n     * specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 107,col 50)",
        "(line 108,col 9)-(line 108,col 51)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 22)",
        "(line 111,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 158,
      "end_line": 203,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 50)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 51)",
        "(line 165,col 9)-(line 165,col 22)",
        "(line 166,col 9)-(line 166,col 22)",
        "(line 167,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 219,
      "end_line": 299,
      "comment": "\r\n     * Draws the block representing the specified item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the x-axis.\r\n     * @param rangeAxis  the y-axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 51)",
        "(line 225,col 9)-(line 225,col 51)",
        "(line 226,col 9)-(line 226,col 24)",
        "(line 227,col 9)-(line 227,col 24)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 233,col 42)",
        "(line 234,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 237,col 42)",
        "(line 238,col 9)-(line 239,col 41)",
        "(line 240,col 9)-(line 240,col 20)",
        "(line 241,col 9)-(line 241,col 60)",
        "(line 242,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 58)",
        "(line 249,col 9)-(line 249,col 60)",
        "(line 250,col 9)-(line 250,col 22)",
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 255,col 56)",
        "(line 256,col 9)-(line 256,col 56)",
        "(line 258,col 9)-(line 258,col 56)",
        "(line 259,col 9)-(line 259,col 56)",
        "(line 261,col 9)-(line 261,col 27)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 46)",
        "(line 266,col 9)-(line 266,col 46)",
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 36)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 22)",
        "(line 287,col 9)-(line 287,col 19)",
        "(line 290,col 9)-(line 290,col 41)",
        "(line 291,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.equals(java.lang.Object)",
      "begin_line": 315,
      "end_line": 330,
      "comment": "\r\n     * Tests this \u003ccode\u003eVectorRenderer\u003c/code\u003e for equality with an arbitrary\r\n     * object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eVectorRenderer\u003c/code\u003e (not\r\n     *     \u003ccode\u003enull\u003c/code\u003e);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e has the same field values as this\r\n     *     \u003ccode\u003eVectorRenderer\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.VectorRenderer.clone()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\r\n     * Returns a clone of this renderer.\r\n     *\r\n     * @return A clone of this renderer.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem creating the\r\n     *     clone.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 29)"
      ]
    }
  ]
}