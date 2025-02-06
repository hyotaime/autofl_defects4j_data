{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYBlockRenderer.java",
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
      "begin_line": 77,
      "end_line": 444,
      "comment": "\r\n * A renderer that represents data from an {@link XYZDataset} by drawing a\r\n * color block at each (x, y) point, where the color is a function of the\r\n * z-value from the dataset.\r\n * \r\n * @since 1.0.4\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "blockWidth"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\r\n     * The block width (defaults to 1.0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockHeight"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * The block height (defaults to 1.0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockAnchor"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\r\n     * The anchor point used to align each block to its (x, y) location.  The\r\n     * default value is \u003ccode\u003eRectangleAnchor.CENTER\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xOffset"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Temporary storage for the x-offset used to align the block anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "yOffset"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Temporary storage for the y-offset used to align the block anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "paintScale"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The paint scale. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.XYBlockRenderer()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYBlockRenderer\u003c/code\u003e instance with default \r\n     * attributes.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)",
        "(line 111,col 9)-(line 111,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getBlockWidth()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the block width, in data/axis units.\r\n     * \r\n     * @return The block width.\r\n     * \r\n     * @see #setBlockWidth(double)\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setBlockWidth(double)",
      "begin_line": 133,
      "end_line": 141,
      "comment": "\r\n     * Sets the width of the blocks used to represent each data item and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param width  the new width, in data/axis units (must be \u003e 0.0).\r\n     * \r\n     * @see #getBlockWidth()\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 32)",
        "(line 139,col 9)-(line 139,col 24)",
        "(line 140,col 9)-(line 140,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getBlockHeight()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the block height, in data/axis units.\r\n     * \r\n     * @return The block height.\r\n     * \r\n     * @see #setBlockHeight(double)\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setBlockHeight(double)",
      "begin_line": 162,
      "end_line": 170,
      "comment": "\r\n     * Sets the height of the blocks used to represent each data item and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param height  the new height, in data/axis units (must be \u003e 0.0).\r\n     * \r\n     * @see #getBlockHeight()\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 34)",
        "(line 168,col 9)-(line 168,col 24)",
        "(line 169,col 9)-(line 169,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getBlockAnchor()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the anchor point used to align a block at its (x, y) location.\r\n     * The default values is {@link RectangleAnchor#CENTER}.\r\n     * \r\n     * @return The anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBlockAnchor(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setBlockAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 192,
      "end_line": 202,
      "comment": "\r\n     * Sets the anchor point used to align a block at its (x, y) location and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param anchor  the anchor.\r\n     * \r\n     * @see #getBlockAnchor()\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 34)",
        "(line 200,col 9)-(line 200,col 24)",
        "(line 201,col 9)-(line 201,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.getPaintScale()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the paint scale used by the renderer.\r\n     * \r\n     * @return The paint scale (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaintScale(PaintScale)\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.setPaintScale(org.jfree.chart.renderer.PaintScale)",
      "begin_line": 225,
      "end_line": 231,
      "comment": "\r\n     * Sets the paint scale used by the renderer and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaintScale()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 32)",
        "(line 230,col 9)-(line 230,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.updateOffsets()",
      "begin_line": 237,
      "end_line": 274,
      "comment": "\r\n     * Updates the offsets to take into account the block width, height and\r\n     * anchor.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 287,
      "end_line": 301,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the \r\n     * specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *         \r\n     * @see #findRangeBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 314,
      "end_line": 328,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e \r\n     *         or empty).\r\n     *         \r\n     * @see #findDomainBounds(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 346,
      "end_line": 388,
      "comment": "\r\n     * Draws the block representing the specified item.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the x-axis.\r\n     * @param rangeAxis  the y-axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param crosshairState  the crosshair state.\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 51)",
        "(line 352,col 9)-(line 352,col 51)",
        "(line 353,col 9)-(line 353,col 23)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 46)",
        "(line 358,col 9)-(line 359,col 42)",
        "(line 360,col 9)-(line 361,col 41)",
        "(line 362,col 9)-(line 363,col 68)",
        "(line 364,col 9)-(line 365,col 67)",
        "(line 366,col 9)-(line 366,col 26)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 23)",
        "(line 379,col 9)-(line 379,col 23)",
        "(line 380,col 9)-(line 380,col 44)",
        "(line 381,col 9)-(line 381,col 23)",
        "(line 383,col 9)-(line 383,col 64)",
        "(line 384,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.equals(java.lang.Object)",
      "begin_line": 404,
      "end_line": 425,
      "comment": "\r\n     * Tests this \u003ccode\u003eXYBlockRenderer\u003c/code\u003e for equality with an arbitrary\r\n     * object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eXYBlockRenderer\u003c/code\u003e (not\r\n     *     \u003ccode\u003enull\u003c/code\u003e);\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e has the same field values as this \r\n     *     \u003ccode\u003eXYBlockRenderer\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 53)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBlockRenderer.clone()",
      "begin_line": 435,
      "end_line": 442,
      "comment": "\r\n     * Returns a clone of this renderer.\r\n     * \r\n     * @return A clone of this renderer.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem creating the \r\n     *     clone.\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 64)",
        "(line 437,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 21)"
      ]
    }
  ]
}