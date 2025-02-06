{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/BoxAndWhiskerRenderer.java",
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
      "begin_line": 120,
      "end_line": 898,
      "comment": "\r\n * A box-and-whisker renderer.  This renderer requires a \r\n * {@link BoxAndWhiskerCategoryDataset} and is for use with the \r\n * {@link CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "artifactPaint"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The color used to paint the median line and average marker. "
    },
    {
      "type": "field",
      "varNames": [
        "fillBox"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " A flag that controls whether or not the box is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The margin between items (boxes) within a category. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumBarWidth"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " \r\n     * The maximum bar width as percentage of the available space in the plot,\r\n     * where 0.05 is five percent.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.BoxAndWhiskerRenderer()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 147,col 28)",
        "(line 148,col 9)-(line 148,col 31)",
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getArtifactPaint()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the paint used to color the median and average markers.\r\n     * \r\n     * @return The paint used to draw the median and average markers (never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArtifactPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setArtifactPaint(java.awt.Paint)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\r\n     * Sets the paint used to color the median and average markers and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArtifactPaint()\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 35)",
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getFillBox()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns the flag that controls whether or not the box is filled.\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setFillBox(boolean)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\r\n     * Sets the flag that controls whether or not the box is filled and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getFillBox()\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 28)",
        "(line 201,col 9)-(line 201,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getItemMargin()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the item margin.  This is a percentage of the available space \r\n     * that is allocated to the space between items in the chart.\r\n     * \r\n     * @return The margin.\r\n     *\r\n     * @see #setItemMargin(double)\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setItemMargin(double)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\r\n     * Sets the item margin and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param margin  the margin (a percentage).\r\n     *\r\n     * @see #getItemMargin()\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 33)",
        "(line 226,col 9)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getMaximumBarWidth()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Returns the maximum bar width as a percentage of the available drawing \r\n     * space.\r\n     * \r\n     * @return The maximum bar width.\r\n     *\r\n     * @see #setMaximumBarWidth(double)\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.setMaximumBarWidth(double)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\r\n     * Sets the maximum bar width, which is specified as a percentage of the \r\n     * available space for all bars, and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param percent  the maximum Bar Width (a percentage).\r\n     *\r\n     * @see #getMaximumBarWidth()\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.getLegendItem(int, int)",
      "begin_line": 267,
      "end_line": 305,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 62)",
        "(line 280,col 9)-(line 281,col 24)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 34)",
        "(line 284,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 30)",
        "(line 289,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 67)",
        "(line 294,col 9)-(line 294,col 48)",
        "(line 295,col 9)-(line 295,col 62)",
        "(line 296,col 9)-(line 296,col 65)",
        "(line 297,col 9)-(line 298,col 68)",
        "(line 299,col 9)-(line 299,col 35)",
        "(line 300,col 9)-(line 300,col 45)",
        "(line 301,col 9)-(line 301,col 55)",
        "(line 302,col 9)-(line 302,col 38)",
        "(line 303,col 9)-(line 303,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 319,
      "end_line": 365,
      "comment": "\r\n     * Initialises the renderer.  This method gets called once at the start of \r\n     * the process of drawing a chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 326,col 37)",
        "(line 329,col 9)-(line 329,col 69)",
        "(line 330,col 9)-(line 330,col 65)",
        "(line 331,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 381,
      "end_line": 409,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 398,col 60)",
        "(line 400,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 426,
      "end_line": 550,
      "comment": "\r\n     * Draws the visual representation of a single data item when the plot has \r\n     * a horizontal orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 437,col 57)",
        "(line 439,col 9)-(line 440,col 70)",
        "(line 441,col 9)-(line 442,col 70)",
        "(line 443,col 9)-(line 443,col 69)",
        "(line 445,col 9)-(line 445,col 34)",
        "(line 446,col 9)-(line 446,col 40)",
        "(line 447,col 9)-(line 447,col 45)",
        "(line 449,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 44)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 46)",
        "(line 471,col 9)-(line 471,col 24)",
        "(line 473,col 9)-(line 473,col 57)",
        "(line 475,col 9)-(line 475,col 56)",
        "(line 476,col 9)-(line 476,col 56)",
        "(line 477,col 9)-(line 477,col 65)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 480,col 9)-(line 480,col 25)",
        "(line 481,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 513,col 40)",
        "(line 514,col 9)-(line 514,col 27)",
        "(line 517,col 9)-(line 517,col 60)",
        "(line 518,col 9)-(line 531,col 9)",
        "(line 534,col 9)-(line 534,col 64)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 543,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 567,
      "end_line": 773,
      "comment": "\r\n     * Draws the visual representation of a single data item when the plot has \r\n     * a vertical orientation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 578,col 57)",
        "(line 580,col 9)-(line 581,col 70)",
        "(line 582,col 9)-(line 583,col 70)",
        "(line 584,col 9)-(line 584,col 59)",
        "(line 586,col 9)-(line 586,col 34)",
        "(line 587,col 9)-(line 587,col 40)",
        "(line 588,col 9)-(line 588,col 45)",
        "(line 590,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 31)",
        "(line 608,col 9)-(line 608,col 25)",
        "(line 610,col 9)-(line 610,col 44)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 46)",
        "(line 615,col 9)-(line 615,col 24)",
        "(line 617,col 9)-(line 617,col 27)",
        "(line 619,col 9)-(line 619,col 57)",
        "(line 621,col 9)-(line 621,col 56)",
        "(line 622,col 9)-(line 622,col 56)",
        "(line 623,col 9)-(line 623,col 65)",
        "(line 624,col 9)-(line 624,col 65)",
        "(line 625,col 9)-(line 625,col 25)",
        "(line 626,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 40)",
        "(line 661,col 9)-(line 661,col 60)",
        "(line 662,col 9)-(line 675,col 9)",
        "(line 678,col 9)-(line 678,col 64)",
        "(line 679,col 9)-(line 684,col 9)",
        "(line 687,col 9)-(line 688,col 73)",
        "(line 689,col 9)-(line 690,col 73)",
        "(line 692,col 9)-(line 692,col 23)",
        "(line 695,col 9)-(line 695,col 49)",
        "(line 696,col 9)-(line 696,col 40)",
        "(line 697,col 9)-(line 698,col 46)",
        "(line 703,col 9)-(line 703,col 61)",
        "(line 704,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 771,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawEllipse(java.awt.geom.Point2D, double, java.awt.Graphics2D)",
      "begin_line": 782,
      "end_line": 786,
      "comment": "\r\n     * Draws a dot to represent an outlier. \r\n     * \r\n     * @param point  the location.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 784,col 48)",
        "(line 785,col 9)-(line 785,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawMultipleEllipse(java.awt.geom.Point2D, double, double, java.awt.Graphics2D)",
      "begin_line": 796,
      "end_line": 805,
      "comment": "\r\n     * Draws two dots to represent the average value of more than one outlier.\r\n     * \r\n     * @param point  the location\r\n     * @param boxWidth  the box width.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 800,col 59)",
        "(line 801,col 9)-(line 802,col 48)",
        "(line 803,col 9)-(line 803,col 22)",
        "(line 804,col 9)-(line 804,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawHighFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 815,
      "end_line": 821,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far-out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x coordinate.\r\n     * @param m  the y coordinate.\r\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 34)",
        "(line 818,col 9)-(line 818,col 77)",
        "(line 819,col 9)-(line 819,col 63)",
        "(line 820,col 9)-(line 820,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.drawLowFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 831,
      "end_line": 837,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far-out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x coordinate.\r\n     * @param m  the y coordinate.\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 34)",
        "(line 834,col 9)-(line 834,col 77)",
        "(line 835,col 9)-(line 835,col 63)",
        "(line 836,col 9)-(line 836,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.equals(java.lang.Object)",
      "begin_line": 846,
      "end_line": 870,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 65)",
        "(line 857,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 879,
      "end_line": 882,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 36)",
        "(line 881,col 9)-(line 881,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 892,
      "end_line": 896,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 35)",
        "(line 895,col 9)-(line 895,col 63)"
      ]
    }
  ]
}