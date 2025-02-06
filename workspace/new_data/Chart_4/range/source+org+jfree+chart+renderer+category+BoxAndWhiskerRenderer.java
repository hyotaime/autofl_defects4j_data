{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/BoxAndWhiskerRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 129,
      "end_line": 999,
      "comment": "\r\n * A box-and-whisker renderer.  This renderer requires a\r\n * {@link BoxAndWhiskerCategoryDataset} and is for use with the\r\n * {@link CategoryPlot} class.  The example shown here is generated\r\n * by the \u003ccode\u003eBoxAndWhiskerChartDemo1.java\u003c/code\u003e program included in the\r\n * JFreeChart Demo Collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/BoxAndWhiskerRendererSample.png\"\r\n * alt\u003d\"BoxAndWhiskerRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "artifactPaint"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The color used to paint the median line and average marker. "
    },
    {
      "type": "field",
      "varNames": [
        "fillBox"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " A flag that controls whether or not the box is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The margin between items (boxes) within a category. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumBarWidth"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\r\n     * The maximum bar width as percentage of the available space in the plot,\r\n     * where 0.05 is five percent.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "medianVisible"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\r\n     * A flag that controls whether or not the median indicator is drawn.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "meanVisible"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\r\n     * A flag that controls whether or not the mean indicator is drawn.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.BoxAndWhiskerRenderer()",
      "begin_line": 167,
      "end_line": 175,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 41)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 170,col 31)",
        "(line 171,col 9)-(line 171,col 35)",
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 33)",
        "(line 174,col 9)-(line 174,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getArtifactPaint()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns the paint used to color the median and average markers.\r\n     *\r\n     * @return The paint used to draw the median and average markers (never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArtifactPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setArtifactPaint(java.awt.Paint)",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\r\n     * Sets the paint used to color the median and average markers and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArtifactPaint()\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getFillBox()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the flag that controls whether or not the box is filled.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setFillBox(boolean)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\r\n     * Sets the flag that controls whether or not the box is filled and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getFillBox()\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 28)",
        "(line 226,col 9)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getItemMargin()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the item margin.  This is a percentage of the available space\r\n     * that is allocated to the space between items in the chart.\r\n     *\r\n     * @return The margin.\r\n     *\r\n     * @see #setItemMargin(double)\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setItemMargin(double)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\r\n     * Sets the item margin and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param margin  the margin (a percentage).\r\n     *\r\n     * @see #getItemMargin()\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 33)",
        "(line 251,col 9)-(line 251,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getMaximumBarWidth()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the maximum bar width as a percentage of the available drawing\r\n     * space.\r\n     *\r\n     * @return The maximum bar width.\r\n     *\r\n     * @see #setMaximumBarWidth(double)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setMaximumBarWidth(double)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\r\n     * Sets the maximum bar width, which is specified as a percentage of the\r\n     * available space for all bars, and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param percent  the maximum Bar Width (a percentage).\r\n     *\r\n     * @see #getMaximumBarWidth()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 39)",
        "(line 281,col 9)-(line 281,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.isMeanVisible()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Returns the flag that controls whether or not the mean indicator is\r\n     * draw for each item.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setMeanVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setMeanVisible(boolean)",
      "begin_line": 309,
      "end_line": 315,
      "comment": "\r\n     * Sets the flag that controls whether or not the mean indicator is drawn\r\n     * for each item, and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @see #isMeanVisible()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.isMedianVisible()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the flag that controls whether or not the median indicator is\r\n     * draw for each item.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setMedianVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setMedianVisible(boolean)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Sets the flag that controls whether or not the median indicator is drawn\r\n     * for each item, and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @see #isMedianVisible()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getLegendItem(int, int)",
      "begin_line": 354,
      "end_line": 397,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 36)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 62)",
        "(line 367,col 9)-(line 368,col 24)",
        "(line 369,col 9)-(line 369,col 35)",
        "(line 370,col 9)-(line 370,col 34)",
        "(line 371,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 30)",
        "(line 376,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 48)",
        "(line 381,col 9)-(line 381,col 48)",
        "(line 382,col 9)-(line 382,col 62)",
        "(line 383,col 9)-(line 383,col 65)",
        "(line 384,col 9)-(line 385,col 68)",
        "(line 386,col 9)-(line 386,col 58)",
        "(line 387,col 9)-(line 387,col 57)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 35)",
        "(line 392,col 9)-(line 392,col 45)",
        "(line 393,col 9)-(line 393,col 55)",
        "(line 394,col 9)-(line 394,col 38)",
        "(line 395,col 9)-(line 395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 411,
      "end_line": 456,
      "comment": "\r\n     * Initialises the renderer.  This method gets called once at the start of\r\n     * the process of drawing a chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 418,col 37)",
        "(line 421,col 9)-(line 421,col 69)",
        "(line 422,col 9)-(line 422,col 65)",
        "(line 423,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 473,
      "end_line": 500,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data (must be an instance of\r\n     *                 {@link BoxAndWhiskerCategoryDataset}).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 489,col 60)",
        "(line 491,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 522,
      "end_line": 643,
      "comment": "\r\n     * Draws the visual representation of a single data item when the plot has\r\n     * a horizontal orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of\r\n     *                 {@link BoxAndWhiskerCategoryDataset}).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the number of the current pass.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 529,col 57)",
        "(line 531,col 9)-(line 532,col 70)",
        "(line 533,col 9)-(line 534,col 70)",
        "(line 535,col 9)-(line 535,col 69)",
        "(line 537,col 9)-(line 537,col 34)",
        "(line 538,col 9)-(line 538,col 40)",
        "(line 539,col 9)-(line 539,col 45)",
        "(line 541,col 9)-(line 556,col 9)",
        "(line 558,col 9)-(line 558,col 57)",
        "(line 559,col 9)-(line 559,col 56)",
        "(line 560,col 9)-(line 560,col 24)",
        "(line 562,col 9)-(line 562,col 57)",
        "(line 564,col 9)-(line 564,col 56)",
        "(line 565,col 9)-(line 565,col 56)",
        "(line 566,col 9)-(line 566,col 65)",
        "(line 567,col 9)-(line 567,col 65)",
        "(line 569,col 9)-(line 569,col 25)",
        "(line 570,col 9)-(line 601,col 9)",
        "(line 604,col 9)-(line 604,col 40)",
        "(line 605,col 9)-(line 605,col 27)",
        "(line 606,col 9)-(line 622,col 9)",
        "(line 625,col 9)-(line 633,col 9)",
        "(line 636,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 665,
      "end_line": 871,
      "comment": "\r\n     * Draws the visual representation of a single data item when the plot has\r\n     * a vertical orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color information\r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of\r\n     *                 {@link BoxAndWhiskerCategoryDataset}).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the number of the current pass.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 672,col 57)",
        "(line 674,col 9)-(line 675,col 70)",
        "(line 676,col 9)-(line 677,col 70)",
        "(line 678,col 9)-(line 678,col 59)",
        "(line 680,col 9)-(line 680,col 34)",
        "(line 681,col 9)-(line 681,col 40)",
        "(line 682,col 9)-(line 682,col 45)",
        "(line 684,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 701,col 31)",
        "(line 702,col 9)-(line 702,col 25)",
        "(line 704,col 9)-(line 704,col 62)",
        "(line 705,col 9)-(line 705,col 31)",
        "(line 706,col 9)-(line 706,col 56)",
        "(line 707,col 9)-(line 707,col 24)",
        "(line 709,col 9)-(line 709,col 27)",
        "(line 711,col 9)-(line 711,col 57)",
        "(line 713,col 9)-(line 713,col 56)",
        "(line 714,col 9)-(line 714,col 56)",
        "(line 715,col 9)-(line 715,col 65)",
        "(line 716,col 9)-(line 716,col 65)",
        "(line 717,col 9)-(line 717,col 25)",
        "(line 718,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 40)",
        "(line 754,col 9)-(line 771,col 9)",
        "(line 774,col 9)-(line 782,col 9)",
        "(line 785,col 9)-(line 786,col 73)",
        "(line 787,col 9)-(line 788,col 73)",
        "(line 790,col 9)-(line 790,col 31)",
        "(line 793,col 9)-(line 793,col 49)",
        "(line 794,col 9)-(line 794,col 40)",
        "(line 795,col 9)-(line 796,col 46)",
        "(line 801,col 9)-(line 801,col 61)",
        "(line 802,col 9)-(line 862,col 9)",
        "(line 864,col 9)-(line 869,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawEllipse(java.awt.geom.Point2D, double, java.awt.Graphics2D)",
      "begin_line": 880,
      "end_line": 884,
      "comment": "\r\n     * Draws a dot to represent an outlier.\r\n     *\r\n     * @param point  the location.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 882,col 48)",
        "(line 883,col 9)-(line 883,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawMultipleEllipse(java.awt.geom.Point2D, double, double, java.awt.Graphics2D)",
      "begin_line": 894,
      "end_line": 903,
      "comment": "\r\n     * Draws two dots to represent the average value of more than one outlier.\r\n     *\r\n     * @param point  the location\r\n     * @param boxWidth  the box width.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 898,col 59)",
        "(line 899,col 9)-(line 900,col 48)",
        "(line 901,col 9)-(line 901,col 22)",
        "(line 902,col 9)-(line 902,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawHighFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 913,
      "end_line": 919,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far-out values.\r\n     *\r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x coordinate.\r\n     * @param m  the y coordinate.\r\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 34)",
        "(line 916,col 9)-(line 916,col 77)",
        "(line 917,col 9)-(line 917,col 63)",
        "(line 918,col 9)-(line 918,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawLowFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 929,
      "end_line": 935,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far-out values.\r\n     *\r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x coordinate.\r\n     * @param m  the y coordinate.\r\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 34)",
        "(line 932,col 9)-(line 932,col 77)",
        "(line 933,col 9)-(line 933,col 63)",
        "(line 934,col 9)-(line 934,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.equals(java.lang.Object)",
      "begin_line": 944,
      "end_line": 971,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 951,col 65)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 980,
      "end_line": 983,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 36)",
        "(line 982,col 9)-(line 982,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 993,
      "end_line": 997,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 35)",
        "(line 996,col 9)-(line 996,col 63)"
      ]
    }
  ]
}