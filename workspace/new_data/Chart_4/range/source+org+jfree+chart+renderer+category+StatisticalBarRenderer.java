{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java",
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
      "begin_line": 106,
      "end_line": 619,
      "comment": "\r\n * A renderer that handles the drawing a bar plot where\r\n * each bar has a mean value and a standard deviation line.  The example shown\r\n * here is generated by the \u003ccode\u003eStatisticalBarChartDemo1.java\u003c/code\u003e program\r\n * included in the JFreeChart Demo Collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/StatisticalBarRendererSample.png\"\r\n * alt\u003d\"StatisticalBarRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorPaint"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The paint used to show the error indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorStroke"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\r\n     * The stroke used to draw the error indicators.\r\n     *\r\n     * @since 1.0.8\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.StatisticalBarRenderer()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 16)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 129,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorPaint()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the paint used for the error indicators.\r\n     *\r\n     * @return The paint used for the error indicators (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setErrorIndicatorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint(java.awt.Paint)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\r\n     * Sets the paint used for the error indicators (if \u003ccode\u003enull\u003c/code\u003e,\r\n     * the item outline paint is used instead) and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getErrorIndicatorPaint()\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 41)",
        "(line 155,col 9)-(line 155,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorStroke()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the stroke used to draw the error indicators.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, the renderer will use the item outline stroke).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setErrorIndicatorStroke(Stroke)\r\n     *\r\n     * @since 1.0.8\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke(java.awt.Stroke)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\r\n     * Sets the stroke used to draw the error indicators, and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.  If you set\r\n     * this to \u003ccode\u003enull\u003c/code\u003e, the renderer will use the item outline\r\n     * stroke.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getErrorIndicatorStroke()\r\n     *\r\n     * @since 1.0.8\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 43)",
        "(line 186,col 9)-(line 186,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset. This takes into account the range\r\n     * between the min/max values, possibly ignoring invisible series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 200,col 10)-(line 200,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 219,
      "end_line": 245,
      "comment": "\r\n     * Draws the bar with its standard deviation line range for a single\r\n     * (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 58)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 234,col 55)",
        "(line 236,col 9)-(line 236,col 60)",
        "(line 237,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int, int, boolean)",
      "begin_line": 264,
      "end_line": 404,
      "comment": "\r\n     * Draws an item for a plot with a horizontal orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param visibleRow  the visible row index.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 63)",
        "(line 273,col 9)-(line 274,col 41)",
        "(line 276,col 9)-(line 277,col 64)",
        "(line 278,col 9)-(line 278,col 45)",
        "(line 279,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 289,col 61)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 47)",
        "(line 294,col 9)-(line 294,col 26)",
        "(line 295,col 9)-(line 295,col 38)",
        "(line 296,col 9)-(line 296,col 38)",
        "(line 298,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 62)",
        "(line 328,col 9)-(line 328,col 80)",
        "(line 329,col 9)-(line 330,col 31)",
        "(line 331,col 9)-(line 331,col 50)",
        "(line 333,col 9)-(line 333,col 48)",
        "(line 334,col 9)-(line 334,col 55)",
        "(line 336,col 9)-(line 337,col 28)",
        "(line 338,col 9)-(line 338,col 62)",
        "(line 339,col 9)-(line 339,col 67)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 31)",
        "(line 344,col 9)-(line 344,col 21)",
        "(line 347,col 9)-(line 356,col 9)",
        "(line 359,col 9)-(line 359,col 55)",
        "(line 360,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 392,col 34)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 399,col 9)-(line 399,col 64)",
        "(line 400,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int, int, boolean)",
      "begin_line": 423,
      "end_line": 563,
      "comment": "\r\n     * Draws an item for a plot with a vertical orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param visibleRow  the visible row index.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 63)",
        "(line 432,col 9)-(line 433,col 41)",
        "(line 435,col 9)-(line 436,col 64)",
        "(line 437,col 9)-(line 437,col 45)",
        "(line 438,col 9)-(line 445,col 9)",
        "(line 448,col 9)-(line 448,col 61)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 47)",
        "(line 454,col 9)-(line 454,col 26)",
        "(line 455,col 9)-(line 455,col 38)",
        "(line 456,col 9)-(line 456,col 38)",
        "(line 458,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 487,col 62)",
        "(line 488,col 9)-(line 488,col 80)",
        "(line 489,col 9)-(line 490,col 31)",
        "(line 491,col 9)-(line 491,col 50)",
        "(line 493,col 9)-(line 493,col 47)",
        "(line 494,col 9)-(line 494,col 56)",
        "(line 496,col 9)-(line 497,col 28)",
        "(line 498,col 9)-(line 498,col 62)",
        "(line 499,col 9)-(line 499,col 67)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 31)",
        "(line 504,col 9)-(line 504,col 21)",
        "(line 506,col 9)-(line 515,col 9)",
        "(line 518,col 9)-(line 518,col 55)",
        "(line 519,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 552,col 34)",
        "(line 553,col 9)-(line 556,col 9)",
        "(line 559,col 9)-(line 559,col 64)",
        "(line 560,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.equals(java.lang.Object)",
      "begin_line": 572,
      "end_line": 589,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 67)",
        "(line 580,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 598,
      "end_line": 602,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 36)",
        "(line 600,col 9)-(line 600,col 69)",
        "(line 601,col 9)-(line 601,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 612,
      "end_line": 617,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 35)",
        "(line 615,col 9)-(line 615,col 69)",
        "(line 616,col 9)-(line 616,col 71)"
      ]
    }
  ]
}