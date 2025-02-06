{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/BarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 127,
      "end_line": 1074,
      "comment": "\r\n * A {@link CategoryItemRenderer} that draws individual data items as bars.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_MARGIN"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The default item margin percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "BAR_OUTLINE_WIDTH_THRESHOLD"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " \r\n     * Constant that controls the minimum width before a bar has an outline \r\n     * drawn. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The margin between items (bars) within a category. "
    },
    {
      "type": "field",
      "varNames": [
        "drawBarOutline"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " A flag that controls whether or not bar outlines are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumBarWidth"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The maximum bar width as a percentage of the available space. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumBarLength"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The minimum bar length (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "gradientPaintTransformer"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " \r\n     * An optional class used to transform gradient paint objects to fit each \r\n     * bar. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positiveItemLabelPositionFallback"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " \r\n     * The fallback position if a positive item label doesn\u0027t fit inside the \r\n     * bar. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "negativeItemLabelPositionFallback"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " \r\n     * The fallback position if a negative item label doesn\u0027t fit inside the \r\n     * bar. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperClip"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The upper clip (axis) value for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerClip"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The lower clip (axis) value for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The base value for the bars (defaults to 0.0). "
    },
    {
      "type": "field",
      "varNames": [
        "includeBaseInRange"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " \r\n     * A flag that controls whether the base value is included in the range\r\n     * returned by the findRangeBounds() method.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.BarRenderer()",
      "begin_line": 192,
      "end_line": 204,
      "comment": "\r\n     * Creates a new bar renderer with default settings.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 16)",
        "(line 194,col 9)-(line 194,col 24)",
        "(line 195,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 46)",
        "(line 197,col 9)-(line 197,col 36)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 200,col 9)-(line 200,col 54)",
        "(line 201,col 9)-(line 201,col 54)",
        "(line 202,col 9)-(line 202,col 79)",
        "(line 203,col 9)-(line 203,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getBase()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the base value for the bars.  The default value is \r\n     * \u003ccode\u003e0.0\u003c/code\u003e.\r\n     * \r\n     * @return The base value for the bars.\r\n     * \r\n     * @see #setBase(double)\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setBase(double)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\r\n     * Sets the base value for the bars and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param base  the new base value.\r\n     * \r\n     * @see #getBase()\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 25)",
        "(line 228,col 9)-(line 228,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getItemMargin()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Returns the item margin as a percentage of the available space for all \r\n     * bars.\r\n     *\r\n     * @return The margin percentage (where 0.10 is ten percent).\r\n     * \r\n     * @see #setItemMargin(double)\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setItemMargin(double)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\r\n     * Sets the item margin and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.  The value is expressed as a percentage of the \r\n     * available width for plotting all the bars, with the resulting amount to \r\n     * be distributed between all the bars evenly.\r\n     *\r\n     * @param percent  the margin (where 0.10 is ten percent).\r\n     * \r\n     * @see #getItemMargin()\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 34)",
        "(line 255,col 9)-(line 255,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.isDrawBarOutline()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns a flag that controls whether or not bar outlines are drawn.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawBarOutline(boolean)\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setDrawBarOutline(boolean)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\r\n     * Sets the flag that controls whether or not bar outlines are drawn and \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param draw  the flag.\r\n     * \r\n     * @see #isDrawBarOutline()\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 279,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getMaximumBarWidth()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Returns the maximum bar width, as a percentage of the available drawing \r\n     * space.\r\n     * \r\n     * @return The maximum bar width.\r\n     * \r\n     * @see #setMaximumBarWidth(double)\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setMaximumBarWidth(double)",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\r\n     * Sets the maximum bar width, which is specified as a percentage of the \r\n     * available space for all bars, and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param percent  the percent (where 0.05 is five percent).\r\n     * \r\n     * @see #getMaximumBarWidth()\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 39)",
        "(line 305,col 9)-(line 305,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getMinimumBarLength()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\r\n     * Returns the minimum bar length (in Java2D units).\r\n     * \r\n     * @return The minimum bar length.\r\n     * \r\n     * @see #setMinimumBarLength(double)\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setMinimumBarLength(double)",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\r\n     * Sets the minimum bar length and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.  The minimum bar length is specified in Java2D\r\n     * units, and can be used to prevent bars that represent very small data \r\n     * values from disappearing when drawn on the screen.\r\n     * \r\n     * @param min  the minimum bar length (in Java2D units).\r\n     * \r\n     * @see #getMinimumBarLength()\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 36)",
        "(line 331,col 9)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getGradientPaintTransformer()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns the gradient paint transformer (an object used to transform \r\n     * gradient paint objects to fit each bar).\r\n     * \r\n     * @return A transformer (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setGradientPaintTransformer(GradientPaintTransformer)\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 354,
      "end_line": 358,
      "comment": "\r\n     * Sets the gradient paint transformer and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getGradientPaintTransformer()\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 52)",
        "(line 357,col 9)-(line 357,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getPositiveItemLabelPositionFallback()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\r\n     * Returns the fallback position for positive item labels that don\u0027t fit \r\n     * within a bar.\r\n     * \r\n     * @return The fallback position (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setPositiveItemLabelPositionFallback(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setPositiveItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 381,
      "end_line": 385,
      "comment": "\r\n     * Sets the fallback position for positive item labels that don\u0027t fit \r\n     * within a bar, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getPositiveItemLabelPositionFallback()\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 58)",
        "(line 384,col 9)-(line 384,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getNegativeItemLabelPositionFallback()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\r\n     * Returns the fallback position for negative item labels that don\u0027t fit \r\n     * within a bar.\r\n     * \r\n     * @return The fallback position (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setPositiveItemLabelPositionFallback(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setNegativeItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 408,
      "end_line": 412,
      "comment": "\r\n     * Sets the fallback position for negative item labels that don\u0027t fit \r\n     * within a bar, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getNegativeItemLabelPositionFallback()\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 58)",
        "(line 411,col 9)-(line 411,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getIncludeBaseInRange()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\r\n     * Returns the flag that controls whether or not the base value for the \r\n     * bars is included in the range calculated by \r\n     * {@link #findRangeBounds(CategoryDataset)}.\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the base is included in the range, and\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @since 1.0.1\r\n     * \r\n     * @see #setIncludeBaseInRange(boolean)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.setIncludeBaseInRange(boolean)",
      "begin_line": 442,
      "end_line": 447,
      "comment": "\r\n     * Sets the flag that controls whether or not the base value for the bars \r\n     * is included in the range calculated by \r\n     * {@link #findRangeBounds(CategoryDataset)}.  If the flag is changed,\r\n     * a {@link RendererChangeEvent} is sent to all registered listeners.\r\n     * \r\n     * @param include  the new value for the flag.\r\n     * \r\n     * @since 1.0.1\r\n     * \r\n     * @see #getIncludeBaseInRange()\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getLowerClip()",
      "begin_line": 455,
      "end_line": 458,
      "comment": "\r\n     * Returns the lower clip value.  This value is recalculated in the \r\n     * initialise() method.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getUpperClip()",
      "begin_line": 466,
      "end_line": 469,
      "comment": "\r\n     * Returns the upper clip value.  This value is recalculated in the \r\n     * initialise() method.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 484,
      "end_line": 503,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be passed \r\n     * to subsequent calls to the drawItem method.  This method gets called \r\n     * once at the start of the process of drawing a chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 491,col 37)",
        "(line 494,col 9)-(line 494,col 73)",
        "(line 495,col 9)-(line 495,col 62)",
        "(line 496,col 9)-(line 496,col 62)",
        "(line 499,col 9)-(line 499,col 64)",
        "(line 501,col 9)-(line 501,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.calculateBarWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 513,
      "end_line": 550,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 69)",
        "(line 519,col 9)-(line 519,col 65)",
        "(line 520,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.calculateBarW0(org.jfree.chart.plot.CategoryPlot, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.renderer.category.CategoryItemRendererState, int, int)",
      "begin_line": 567,
      "end_line": 600,
      "comment": "\r\n     * Calculates the coordinate of the first \"side\" of a bar.  This will be \r\n     * the minimum x-coordinate for a vertical bar, and the minimum \r\n     * y-coordinate for a horizontal bar.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param state  the renderer state (has the bar width precalculated).\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * \r\n     * @return The coordinate.\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 27)",
        "(line 576,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 583,col 52)",
        "(line 584,col 9)-(line 584,col 40)",
        "(line 585,col 9)-(line 585,col 45)",
        "(line 586,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.calculateBarL0L1(double)",
      "begin_line": 610,
      "end_line": 624,
      "comment": "\r\n     * Calculates the coordinates for the length of a single bar.\r\n     * \r\n     * @param value  the value represented by the bar.\r\n     * \r\n     * @return The coordinates for each end of the bar (or \u003ccode\u003enull\u003c/code\u003e if \r\n     *         the bar is not visible for the current axis range).\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 38)",
        "(line 612,col 9)-(line 612,col 38)",
        "(line 613,col 9)-(line 613,col 51)",
        "(line 614,col 9)-(line 614,col 52)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 41)",
        "(line 622,col 9)-(line 622,col 43)",
        "(line 623,col 9)-(line 623,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 637,
      "end_line": 645,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.  This takes into account the range\r\n     * of values in the dataset, plus the flag that determines whether or not\r\n     * the base value for the bars should be included in the range.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 65)",
        "(line 639,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.getLegendItem(int, int)",
      "begin_line": 655,
      "end_line": 698,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 36)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 663,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 667,col 62)",
        "(line 668,col 9)-(line 669,col 24)",
        "(line 670,col 9)-(line 670,col 35)",
        "(line 671,col 9)-(line 671,col 34)",
        "(line 672,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 30)",
        "(line 677,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 67)",
        "(line 682,col 9)-(line 682,col 48)",
        "(line 683,col 9)-(line 683,col 62)",
        "(line 684,col 9)-(line 684,col 65)",
        "(line 686,col 9)-(line 689,col 52)",
        "(line 690,col 9)-(line 690,col 35)",
        "(line 691,col 9)-(line 691,col 45)",
        "(line 692,col 9)-(line 692,col 55)",
        "(line 693,col 9)-(line 693,col 38)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 714,
      "end_line": 791,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 57)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 731,col 9)-(line 731,col 47)",
        "(line 733,col 9)-(line 733,col 60)",
        "(line 734,col 9)-(line 735,col 36)",
        "(line 736,col 9)-(line 736,col 51)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 741,col 9)-(line 741,col 53)",
        "(line 742,col 9)-(line 742,col 77)",
        "(line 743,col 9)-(line 743,col 77)",
        "(line 744,col 9)-(line 744,col 50)",
        "(line 745,col 9)-(line 746,col 39)",
        "(line 749,col 9)-(line 749,col 31)",
        "(line 750,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 52)",
        "(line 759,col 9)-(line 759,col 67)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 31)",
        "(line 764,col 9)-(line 764,col 21)",
        "(line 767,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 779,col 49)",
        "(line 780,col 9)-(line 783,col 9)",
        "(line 786,col 9)-(line 786,col 64)",
        "(line 787,col 9)-(line 789,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.calculateSeriesWidth(double, org.jfree.chart.axis.CategoryAxis, int, int)",
      "begin_line": 803,
      "end_line": 811,
      "comment": "\r\n     * Calculates the available space for each series.\r\n     * \r\n     * @param space  the space along the entire axis (in Java2D units).\r\n     * @param axis  the category axis.\r\n     * @param categories  the number of categories.\r\n     * @param series  the number of series.\r\n     * \r\n     * @return The width of one series.\r\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 806,col 52)",
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.data.category.CategoryDataset, int, int, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.labels.CategoryItemLabelGenerator, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 826,
      "end_line": 888,
      "comment": "\r\n     * Draws an item label.  This method is overridden so that the bar can be \r\n     * used to calculate the label anchor point.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param data  the dataset.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     * @param plot  the plot.\r\n     * @param generator  the label generator.\r\n     * @param bar  the bar.\r\n     * @param negative  a flag indicating a negative value.\r\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 66)",
        "(line 836,col 9)-(line 838,col 9)",
        "(line 840,col 9)-(line 840,col 55)",
        "(line 841,col 9)-(line 841,col 30)",
        "(line 842,col 9)-(line 842,col 53)",
        "(line 843,col 9)-(line 843,col 27)",
        "(line 846,col 9)-(line 846,col 42)",
        "(line 847,col 9)-(line 852,col 9)",
        "(line 855,col 9)-(line 856,col 75)",
        "(line 858,col 9)-(line 880,col 9)",
        "(line 882,col 9)-(line 887,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 899,
      "end_line": 999,
      "comment": "\r\n     * Calculates the item label anchor point.\r\n     *\r\n     * @param anchor  the anchor.\r\n     * @param bar  the bar.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @return The anchor point.\r\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 30)",
        "(line 904,col 9)-(line 904,col 51)",
        "(line 905,col 9)-(line 905,col 40)",
        "(line 906,col 9)-(line 906,col 31)",
        "(line 907,col 9)-(line 907,col 40)",
        "(line 908,col 9)-(line 908,col 37)",
        "(line 909,col 9)-(line 909,col 43)",
        "(line 910,col 9)-(line 910,col 34)",
        "(line 911,col 9)-(line 911,col 43)",
        "(line 913,col 9)-(line 913,col 43)",
        "(line 914,col 9)-(line 914,col 34)",
        "(line 915,col 9)-(line 915,col 43)",
        "(line 916,col 9)-(line 916,col 37)",
        "(line 917,col 9)-(line 917,col 43)",
        "(line 918,col 9)-(line 918,col 34)",
        "(line 919,col 9)-(line 919,col 43)",
        "(line 921,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 997,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.isInternalAnchor(org.jfree.chart.labels.ItemLabelAnchor)",
      "begin_line": 1008,
      "end_line": 1022,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified anchor point is inside a bar.\r\n     * \r\n     * @param anchor  the anchor point.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1021,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer.equals(java.lang.Object)",
      "begin_line": 1031,
      "end_line": 1072,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1041,col 9)",
        "(line 1042,col 9)-(line 1042,col 45)",
        "(line 1043,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1051,col 9)",
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1058,col 9)-(line 1061,col 9)",
        "(line 1062,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1069,col 9)",
        "(line 1070,col 9)-(line 1070,col 20)"
      ]
    }
  ]
}