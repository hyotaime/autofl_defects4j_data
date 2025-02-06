{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "org.jfree.chart.renderer.category.CategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 91,
      "end_line": 565,
      "comment": "\r\n * A renderer that handles the drawing a bar plot where\r\n * each bar has a mean value and a standard deviation line.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorPaint"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The paint used to show the error indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorStroke"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\r\n     * The stroke used to draw the error indicator. \r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.StatisticalBarRenderer()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 16)",
        "(line 114,col 9)-(line 114,col 46)",
        "(line 115,col 9)-(line 115,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorPaint()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns the paint used for the error indicators.\r\n     * \r\n     * @return The paint used for the error indicators (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setErrorIndicatorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint(java.awt.Paint)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\r\n     * Sets the paint used for the error indicators (if \u003ccode\u003enull\u003c/code\u003e, \r\n     * the item outline paint is used instead)\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getErrorIndicatorPaint()\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 41)",
        "(line 140,col 9)-(line 140,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorStroke()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the stroke used for the error indicators.\r\n     * \r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setErrorIndicatorStroke(Stroke)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke(java.awt.Stroke)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\r\n     * Sets the stroke used for the error indicators (if \u003ccode\u003enull\u003c/code\u003e, \r\n     * the item outline stroke is used instead)\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getErrorIndicatorStroke()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 168,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 186,
      "end_line": 213,
      "comment": "\r\n     * Draws the bar with its standard deviation line range for a single \r\n     * (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param data  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 80)",
        "(line 204,col 9)-(line 204,col 60)",
        "(line 205,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)",
      "begin_line": 228,
      "end_line": 362,
      "comment": "\r\n     * Draws an item for a plot with a horizontal orientation.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 63)",
        "(line 241,col 9)-(line 242,col 41)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 253,col 9)",
        "(line 256,col 9)-(line 256,col 61)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 261,col 47)",
        "(line 262,col 9)-(line 262,col 26)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 38)",
        "(line 266,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 62)",
        "(line 296,col 9)-(line 296,col 80)",
        "(line 297,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 299,col 50)",
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 55)",
        "(line 304,col 9)-(line 305,col 28)",
        "(line 306,col 9)-(line 306,col 54)",
        "(line 307,col 9)-(line 307,col 33)",
        "(line 308,col 9)-(line 308,col 21)",
        "(line 309,col 9)-(line 313,col 9)",
        "(line 316,col 9)-(line 316,col 55)",
        "(line 317,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 350,col 24)",
        "(line 351,col 9)-(line 354,col 9)",
        "(line 357,col 9)-(line 357,col 64)",
        "(line 358,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)",
      "begin_line": 377,
      "end_line": 510,
      "comment": "\r\n     * Draws an item for a plot with a vertical orientation.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 63)",
        "(line 390,col 9)-(line 392,col 10)",
        "(line 394,col 9)-(line 394,col 40)",
        "(line 395,col 9)-(line 395,col 45)",
        "(line 396,col 9)-(line 403,col 9)",
        "(line 406,col 9)-(line 406,col 61)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 47)",
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 38)",
        "(line 414,col 9)-(line 414,col 38)",
        "(line 416,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 445,col 62)",
        "(line 446,col 9)-(line 446,col 80)",
        "(line 447,col 9)-(line 448,col 31)",
        "(line 449,col 9)-(line 449,col 50)",
        "(line 451,col 9)-(line 451,col 47)",
        "(line 452,col 9)-(line 452,col 56)",
        "(line 454,col 9)-(line 455,col 28)",
        "(line 456,col 9)-(line 456,col 54)",
        "(line 457,col 9)-(line 457,col 33)",
        "(line 458,col 9)-(line 458,col 21)",
        "(line 459,col 9)-(line 463,col 9)",
        "(line 466,col 9)-(line 466,col 55)",
        "(line 467,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 499,col 24)",
        "(line 500,col 9)-(line 503,col 9)",
        "(line 506,col 9)-(line 506,col 64)",
        "(line 507,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.equals(java.lang.Object)",
      "begin_line": 519,
      "end_line": 535,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 67)",
        "(line 530,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 544,
      "end_line": 548,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 36)",
        "(line 546,col 9)-(line 546,col 69)",
        "(line 547,col 9)-(line 547,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 558,
      "end_line": 563,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 35)",
        "(line 561,col 9)-(line 561,col 69)",
        "(line 562,col 9)-(line 562,col 71)"
      ]
    }
  ]
}