{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYBlockRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBlockRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 433,
      "comment": "\r\n * A renderer that represents data from an {@link XYZDataset} by drawing a\r\n * color block at each (x, y) point, where the color is a function of the\r\n * z-value from the dataset.\r\n * \r\n * @since 1.0.4\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "blockWidth"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\r\n     * The block width (defaults to 1.0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockHeight"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * The block height (defaults to 1.0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockAnchor"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\r\n     * The anchor point used to align each block to its (x, y) location.  The\r\n     * default value is \u003ccode\u003eRectangleAnchor.CENTER\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xOffset"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Temporary storage for the x-offset used to align the block anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "yOffset"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Temporary storage for the y-offset used to align the block anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "paintScale"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The paint scale. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.XYBlockRenderer()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYBlockRenderer\u003c/code\u003e instance with default \r\n     * attributes.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 109,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getBlockWidth()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns the block width, in data/axis units.\r\n     * \r\n     * @return The block width.\r\n     * \r\n     * @see #setBlockWidth(double)\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setBlockWidth(double)",
      "begin_line": 130,
      "end_line": 138,
      "comment": "\r\n     * Sets the width of the blocks used to represent each data item.\r\n     * \r\n     * @param width  the new width, in data/axis units (must be \u003e 0.0).\r\n     * \r\n     * @see #getBlockWidth()\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 32)",
        "(line 136,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 137,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getBlockHeight()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns the block height, in data/axis units.\r\n     * \r\n     * @return The block height.\r\n     * \r\n     * @see #setBlockHeight(double)\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setBlockHeight(double)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\r\n     * Sets the height of the blocks used to represent each data item.\r\n     * \r\n     * @param height  the new height, in data/axis units (must be \u003e 0.0).\r\n     * \r\n     * @see #getBlockHeight()\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 34)",
        "(line 164,col 9)-(line 164,col 24)",
        "(line 165,col 9)-(line 165,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getBlockAnchor()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the anchor point used to align a block at its (x, y) location.\r\n     * The default values is {@link RectangleAnchor#CENTER}.\r\n     * \r\n     * @return The anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBlockAnchor(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setBlockAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 188,
      "end_line": 198,
      "comment": "\r\n     * Sets the anchor point used to align a block at its (x, y) location and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param anchor  the anchor.\r\n     * \r\n     * @see #getBlockAnchor()\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 34)",
        "(line 196,col 9)-(line 196,col 24)",
        "(line 197,col 9)-(line 197,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getPaintScale()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Returns the paint scale used by the renderer.\r\n     * \r\n     * @return The paint scale (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaintScale(PaintScale)\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setPaintScale(org.jfree.chart.renderer.PaintScale)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\r\n     * Sets the paint scale used by the renderer.\r\n     * \r\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaintScale()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 32)",
        "(line 225,col 9)-(line 225,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.updateOffsets()",
      "begin_line": 232,
      "end_line": 269,
      "comment": "\r\n     * Updates the offsets to take into account the block width, height and\r\n     * anchor.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 282,
      "end_line": 296,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the \r\n     * specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *         \r\n     * @see #findRangeBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 309,
      "end_line": 323,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e \r\n     *         or empty).\r\n     *         \r\n     * @see #findDomainBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 341,
      "end_line": 377,
      "comment": "\r\n     * Draws the block representing the specified item.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the x-axis.\r\n     * @param rangeAxis  the y-axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param crosshairState  the crosshair state.\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 51)",
        "(line 347,col 9)-(line 347,col 51)",
        "(line 348,col 9)-(line 348,col 23)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 46)",
        "(line 353,col 9)-(line 354,col 42)",
        "(line 355,col 9)-(line 356,col 41)",
        "(line 357,col 9)-(line 358,col 68)",
        "(line 359,col 9)-(line 360,col 67)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 60)",
        "(line 363,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 23)",
        "(line 374,col 9)-(line 374,col 23)",
        "(line 375,col 9)-(line 375,col 44)",
        "(line 376,col 9)-(line 376,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.equals(java.lang.Object)",
      "begin_line": 393,
      "end_line": 414,
      "comment": "\r\n     * Tests this \u003ccode\u003eXYBlockRenderer\u003c/code\u003e for equality with an arbitrary\r\n     * object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eXYBlockRenderer\u003c/code\u003e (not\r\n     *     \u003ccode\u003enull\u003c/code\u003e);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e has the same field values as this \r\n     *     \u003ccode\u003eXYBlockRenderer\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 53)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.clone()",
      "begin_line": 424,
      "end_line": 431,
      "comment": "\r\n     * Returns a clone of this renderer.\r\n     * \r\n     * @return A clone of this renderer.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem creating the \r\n     *     clone.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 64)",
        "(line 426,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 21)"
      ]
    }
  ]
}