{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/BoxAndWhiskerRenderer.java",
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
      "begin_line": 121,
      "end_line": 899,
      "comment": "\r\n * A box-and-whisker renderer.  This renderer requires a \r\n * {@link BoxAndWhiskerCategoryDataset} and is for use with the \r\n * {@link CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "artifactPaint"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The color used to paint the median line and average marker. "
    },
    {
      "type": "field",
      "varNames": [
        "fillBox"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " A flag that controls whether or not the box is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The margin between items (boxes) within a category. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumBarWidth"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " \r\n     * The maximum bar width as percentage of the available space in the plot,\r\n     * where 0.05 is five percent.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.BoxAndWhiskerRenderer()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 41)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getArtifactPaint()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the paint used to color the median and average markers.\r\n     * \r\n     * @return The paint used to draw the median and average markers (never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArtifactPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setArtifactPaint(java.awt.Paint)",
      "begin_line": 173,
      "end_line": 179,
      "comment": "\r\n     * Sets the paint used to color the median and average markers and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArtifactPaint()\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getFillBox()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the flag that controls whether or not the box is filled.\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setFillBox(boolean)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\r\n     * Sets the flag that controls whether or not the box is filled and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getFillBox()\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 28)",
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getItemMargin()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the item margin.  This is a percentage of the available space \r\n     * that is allocated to the space between items in the chart.\r\n     * \r\n     * @return The margin.\r\n     *\r\n     * @see #setItemMargin(double)\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setItemMargin(double)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\r\n     * Sets the item margin and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param margin  the margin (a percentage).\r\n     *\r\n     * @see #getItemMargin()\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 33)",
        "(line 227,col 9)-(line 227,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getMaximumBarWidth()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\r\n     * Returns the maximum bar width as a percentage of the available drawing \r\n     * space.\r\n     * \r\n     * @return The maximum bar width.\r\n     *\r\n     * @see #setMaximumBarWidth(double)\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setMaximumBarWidth(double)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\r\n     * Sets the maximum bar width, which is specified as a percentage of the \r\n     * available space for all bars, and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param percent  the maximum Bar Width (a percentage).\r\n     *\r\n     * @see #getMaximumBarWidth()\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 257,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getLegendItem(int, int)",
      "begin_line": 268,
      "end_line": 306,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 62)",
        "(line 281,col 9)-(line 282,col 24)",
        "(line 283,col 9)-(line 283,col 35)",
        "(line 284,col 9)-(line 284,col 34)",
        "(line 285,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 30)",
        "(line 290,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 67)",
        "(line 295,col 9)-(line 295,col 48)",
        "(line 296,col 9)-(line 296,col 62)",
        "(line 297,col 9)-(line 297,col 65)",
        "(line 298,col 9)-(line 299,col 68)",
        "(line 300,col 9)-(line 300,col 35)",
        "(line 301,col 9)-(line 301,col 45)",
        "(line 302,col 9)-(line 302,col 55)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 320,
      "end_line": 366,
      "comment": "\r\n     * Initialises the renderer.  This method gets called once at the start of \r\n     * the process of drawing a chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 327,col 37)",
        "(line 330,col 9)-(line 330,col 69)",
        "(line 331,col 9)-(line 331,col 65)",
        "(line 332,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 383,
      "end_line": 411,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data (must be an instance of \r\n     *                 {@link BoxAndWhiskerCategoryDataset}).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 60)",
        "(line 402,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 429,
      "end_line": 551,
      "comment": "\r\n     * Draws the visual representation of a single data item when the plot has \r\n     * a horizontal orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of \r\n     *                 {@link BoxAndWhiskerCategoryDataset}).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 440,col 57)",
        "(line 442,col 9)-(line 443,col 70)",
        "(line 444,col 9)-(line 445,col 70)",
        "(line 446,col 9)-(line 446,col 69)",
        "(line 448,col 9)-(line 448,col 34)",
        "(line 449,col 9)-(line 449,col 40)",
        "(line 450,col 9)-(line 450,col 45)",
        "(line 452,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 469,col 47)",
        "(line 470,col 9)-(line 470,col 46)",
        "(line 471,col 9)-(line 471,col 24)",
        "(line 473,col 9)-(line 473,col 57)",
        "(line 475,col 9)-(line 475,col 56)",
        "(line 476,col 9)-(line 476,col 56)",
        "(line 477,col 9)-(line 477,col 65)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 480,col 9)-(line 480,col 25)",
        "(line 481,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 40)",
        "(line 515,col 9)-(line 515,col 27)",
        "(line 518,col 9)-(line 518,col 60)",
        "(line 519,col 9)-(line 532,col 9)",
        "(line 535,col 9)-(line 535,col 64)",
        "(line 536,col 9)-(line 541,col 9)",
        "(line 544,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 569,
      "end_line": 774,
      "comment": "\r\n     * Draws the visual representation of a single data item when the plot has \r\n     * a vertical orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of \r\n     *                 {@link BoxAndWhiskerCategoryDataset}).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 580,col 57)",
        "(line 582,col 9)-(line 583,col 70)",
        "(line 584,col 9)-(line 585,col 70)",
        "(line 586,col 9)-(line 586,col 59)",
        "(line 588,col 9)-(line 588,col 34)",
        "(line 589,col 9)-(line 589,col 40)",
        "(line 590,col 9)-(line 590,col 45)",
        "(line 592,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 31)",
        "(line 610,col 9)-(line 610,col 25)",
        "(line 612,col 9)-(line 612,col 52)",
        "(line 613,col 9)-(line 613,col 31)",
        "(line 614,col 9)-(line 614,col 46)",
        "(line 615,col 9)-(line 615,col 24)",
        "(line 617,col 9)-(line 617,col 27)",
        "(line 619,col 9)-(line 619,col 57)",
        "(line 621,col 9)-(line 621,col 56)",
        "(line 622,col 9)-(line 622,col 56)",
        "(line 623,col 9)-(line 623,col 65)",
        "(line 624,col 9)-(line 624,col 65)",
        "(line 625,col 9)-(line 625,col 25)",
        "(line 626,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 659,col 40)",
        "(line 662,col 9)-(line 662,col 60)",
        "(line 663,col 9)-(line 676,col 9)",
        "(line 679,col 9)-(line 679,col 64)",
        "(line 680,col 9)-(line 685,col 9)",
        "(line 688,col 9)-(line 689,col 73)",
        "(line 690,col 9)-(line 691,col 73)",
        "(line 693,col 9)-(line 693,col 31)",
        "(line 696,col 9)-(line 696,col 49)",
        "(line 697,col 9)-(line 697,col 40)",
        "(line 698,col 9)-(line 699,col 46)",
        "(line 704,col 9)-(line 704,col 61)",
        "(line 705,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 772,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawEllipse(java.awt.geom.Point2D, double, java.awt.Graphics2D)",
      "begin_line": 783,
      "end_line": 787,
      "comment": "\r\n     * Draws a dot to represent an outlier. \r\n     * \r\n     * @param point  the location.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 785,col 48)",
        "(line 786,col 9)-(line 786,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawMultipleEllipse(java.awt.geom.Point2D, double, double, java.awt.Graphics2D)",
      "begin_line": 797,
      "end_line": 806,
      "comment": "\r\n     * Draws two dots to represent the average value of more than one outlier.\r\n     * \r\n     * @param point  the location\r\n     * @param boxWidth  the box width.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 801,col 59)",
        "(line 802,col 9)-(line 803,col 48)",
        "(line 804,col 9)-(line 804,col 22)",
        "(line 805,col 9)-(line 805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawHighFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 816,
      "end_line": 822,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far-out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x coordinate.\r\n     * @param m  the y coordinate.\r\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 34)",
        "(line 819,col 9)-(line 819,col 77)",
        "(line 820,col 9)-(line 820,col 63)",
        "(line 821,col 9)-(line 821,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawLowFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 832,
      "end_line": 838,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far-out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x coordinate.\r\n     * @param m  the y coordinate.\r\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 34)",
        "(line 835,col 9)-(line 835,col 77)",
        "(line 836,col 9)-(line 836,col 63)",
        "(line 837,col 9)-(line 837,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.equals(java.lang.Object)",
      "begin_line": 847,
      "end_line": 871,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 65)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 880,
      "end_line": 883,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 36)",
        "(line 882,col 9)-(line 882,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 893,
      "end_line": 897,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 35)",
        "(line 896,col 9)-(line 896,col 63)"
      ]
    }
  ]
}