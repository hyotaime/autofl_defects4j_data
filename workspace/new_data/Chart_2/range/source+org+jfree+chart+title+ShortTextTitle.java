{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/title/ShortTextTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShortTextTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.TextTitle"
      ],
      "begin_line": 63,
      "end_line": 236,
      "comment": "\r\n * A text title that is only displayed if the entire text will be visible\r\n * without line wrapping.  It is only intended for use with short titles - for\r\n * general purpose titles, you should use the {@link TextTitle} class.\r\n *\r\n * @since 1.0.10\r\n *\r\n * @see TextTitle\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ShortTextTitle.ShortTextTitle(java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Creates a new title.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ShortTextTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 85,
      "end_line": 131,
      "comment": "\r\n     * Performs a layout for this title, subject to the supplied constraint,\r\n     * and returns the dimensions required for the title (if the title\r\n     * cannot be displayed in the available space, this method will return\r\n     * zero width and height for the dimensions).\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param constraint  the layout constraints.\r\n     *\r\n     * @return The dimensions for the title.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 65)",
        "(line 87,col 9)-(line 87,col 61)",
        "(line 88,col 9)-(line 88,col 62)",
        "(line 89,col 9)-(line 89,col 34)",
        "(line 90,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ShortTextTitle.arrangeNN(java.awt.Graphics2D)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\r\n     * Arranges the content for this title assuming no bounds on the width\r\n     * or the height, and returns the required size.\r\n     *\r\n     * @param g2  the graphics target.\r\n     *\r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 52)",
        "(line 143,col 9)-(line 143,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ShortTextTitle.arrangeRN(java.awt.Graphics2D, org.jfree.data.Range)",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\r\n     * Arranges the content for this title assuming a range constraint for the\r\n     * width and no bounds on the height, and returns the required size.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param widthRange  the range for the width.\r\n     *\r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 161,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ShortTextTitle.arrangeFN(java.awt.Graphics2D, double)",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\r\n     * Arranges the content for this title assuming a fixed width and no bounds\r\n     * on the height, and returns the required size.  This will reflect the\r\n     * fact that a text title positioned on the left or right of a chart will\r\n     * be rotated by 90 degrees.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param w  the width.\r\n     *\r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 30)",
        "(line 177,col 9)-(line 177,col 54)",
        "(line 178,col 9)-(line 178,col 76)",
        "(line 179,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ShortTextTitle.arrangeRR(java.awt.Graphics2D, org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 196,
      "end_line": 209,
      "comment": "\r\n     * Returns the content size for the title.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param widthRange  the width range.\r\n     * @param heightRange  the height range.\r\n     *\r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 30)",
        "(line 200,col 9)-(line 200,col 54)",
        "(line 201,col 9)-(line 201,col 76)",
        "(line 202,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ShortTextTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 220,
      "end_line": 234,
      "comment": "\r\n     * Draws the title using the current font and paint.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param area  the title area.\r\n     * @param params  optional parameters (ignored here).\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 32)",
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 30)",
        "(line 229,col 9)-(line 229,col 32)",
        "(line 230,col 9)-(line 231,col 61)",
        "(line 233,col 9)-(line 233,col 20)"
      ]
    }
  ]
}