{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYBoxAndWhiskerRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBoxAndWhiskerRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 121,
      "end_line": 850,
      "comment": "\r\n * A renderer that draws box-and-whisker items on an {@link XYPlot}.  This \r\n * renderer requires a {@link BoxAndWhiskerXYDataset}).\r\n * \u003cP\u003e\r\n * This renderer does not include any code to calculate the crosshair point.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "boxWidth"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " The box width. "
    },
    {
      "type": "field",
      "varNames": [
        "boxPaint"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The paint used to fill the box. "
    },
    {
      "type": "field",
      "varNames": [
        "fillBox"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " A flag that controls whether or not the box is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "artifactPaint"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " \r\n     * The paint used to draw various artifacts such as outliers, farout \r\n     * symbol, average ellipse and median line. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.XYBoxAndWhiskerRenderer()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Creates a new renderer for box and whisker charts.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.XYBoxAndWhiskerRenderer(double)",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\r\n     * Creates a new renderer for box and whisker charts.\r\n     * \u003cP\u003e\r\n     * Use -1 for the box width if you prefer the width to be calculated \r\n     * automatically.\r\n     *\r\n     * @param boxWidth  the box width.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 16)",
        "(line 162,col 9)-(line 162,col 33)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 28)",
        "(line 165,col 9)-(line 165,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getBoxWidth()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Returns the width of each box.\r\n     *\r\n     * @return The box width.\r\n     * \r\n     * @see #setBoxWidth(double)\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setBoxWidth(double)",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\r\n     * Sets the box width and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * If you set the width to a negative value, the renderer will calculate\r\n     * the box width automatically based on the space available on the chart.\r\n     *\r\n     * @param width  the width.\r\n     * \r\n     * @see #getBoxWidth()\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getBoxPaint()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the paint used to fill boxes.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBoxPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setBoxPaint(java.awt.Paint)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\r\n     * Sets the paint used to fill boxes and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBoxPaint()\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 30)",
        "(line 218,col 9)-(line 218,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getFillBox()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the flag that controls whether or not the box is filled.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setFillBox(boolean)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\r\n     * Sets the flag that controls whether or not the box is filled and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 28)",
        "(line 242,col 9)-(line 242,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getArtifactPaint()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Returns the paint used to paint the various artifacts such as outliers, \r\n     * farout symbol, median line and the averages ellipse.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setArtifactPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setArtifactPaint(java.awt.Paint)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\r\n     * Sets the paint used to paint the various artifacts such as outliers, \r\n     * farout symbol, median line and the averages ellipse, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getArtifactPaint()\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 271,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.lookupBoxPaint(int, int)",
      "begin_line": 286,
      "end_line": 296,
      "comment": "\r\n     * Returns the box paint or, if this is \u003ccode\u003enull\u003c/code\u003e, the item\r\n     * paint.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The paint used to fill the box for the specified item (never \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 287,col 6)-(line 287,col 29)",
        "(line 288,col 6)-(line 295,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 317,
      "end_line": 341,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of \r\n     *                 {@link BoxAndWhiskerXYDataset}).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 60)",
        "(line 332,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawHorizontalItem(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 361,
      "end_line": 488,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of \r\n     *                 {@link BoxAndWhiskerXYDataset}).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 41)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 380,col 51)",
        "(line 382,col 9)-(line 382,col 56)",
        "(line 383,col 9)-(line 383,col 73)",
        "(line 384,col 9)-(line 384,col 73)",
        "(line 385,col 9)-(line 385,col 72)",
        "(line 386,col 9)-(line 386,col 71)",
        "(line 387,col 9)-(line 387,col 70)",
        "(line 388,col 9)-(line 388,col 70)",
        "(line 390,col 9)-(line 391,col 42)",
        "(line 393,col 9)-(line 393,col 57)",
        "(line 394,col 9)-(line 395,col 26)",
        "(line 396,col 9)-(line 397,col 26)",
        "(line 398,col 9)-(line 399,col 36)",
        "(line 400,col 9)-(line 400,col 31)",
        "(line 401,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 406,col 36)",
        "(line 407,col 9)-(line 408,col 36)",
        "(line 410,col 9)-(line 410,col 45)",
        "(line 411,col 9)-(line 411,col 37)",
        "(line 412,col 9)-(line 412,col 48)",
        "(line 413,col 9)-(line 413,col 35)",
        "(line 414,col 9)-(line 414,col 55)",
        "(line 415,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 48)",
        "(line 430,col 9)-(line 430,col 47)",
        "(line 431,col 9)-(line 431,col 24)",
        "(line 434,col 9)-(line 434,col 62)",
        "(line 435,col 9)-(line 436,col 33)",
        "(line 439,col 9)-(line 439,col 62)",
        "(line 440,col 9)-(line 441,col 33)",
        "(line 444,col 9)-(line 444,col 25)",
        "(line 445,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 57)",
        "(line 458,col 9)-(line 458,col 55)",
        "(line 459,col 9)-(line 459,col 21)",
        "(line 462,col 9)-(line 462,col 40)",
        "(line 463,col 9)-(line 464,col 59)",
        "(line 467,col 9)-(line 479,col 9)",
        "(line 484,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawVerticalItem(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 508,
      "end_line": 709,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset (must be an instance of \r\n     *                 {@link BoxAndWhiskerXYDataset}).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 41)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 527,col 47)",
        "(line 529,col 9)-(line 529,col 56)",
        "(line 530,col 9)-(line 530,col 73)",
        "(line 531,col 9)-(line 531,col 73)",
        "(line 532,col 9)-(line 532,col 72)",
        "(line 533,col 9)-(line 533,col 71)",
        "(line 534,col 9)-(line 534,col 70)",
        "(line 535,col 9)-(line 535,col 70)",
        "(line 536,col 9)-(line 536,col 69)",
        "(line 538,col 9)-(line 539,col 42)",
        "(line 541,col 9)-(line 541,col 57)",
        "(line 542,col 9)-(line 543,col 26)",
        "(line 544,col 9)-(line 545,col 26)",
        "(line 546,col 9)-(line 547,col 36)",
        "(line 548,col 9)-(line 548,col 31)",
        "(line 549,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 554,col 36)",
        "(line 555,col 9)-(line 556,col 36)",
        "(line 557,col 9)-(line 557,col 25)",
        "(line 560,col 9)-(line 560,col 45)",
        "(line 561,col 9)-(line 561,col 37)",
        "(line 562,col 9)-(line 562,col 67)",
        "(line 563,col 9)-(line 563,col 35)",
        "(line 564,col 9)-(line 564,col 55)",
        "(line 565,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 48)",
        "(line 580,col 9)-(line 580,col 47)",
        "(line 581,col 9)-(line 581,col 24)",
        "(line 584,col 9)-(line 584,col 62)",
        "(line 585,col 9)-(line 586,col 24)",
        "(line 589,col 9)-(line 589,col 62)",
        "(line 590,col 9)-(line 591,col 24)",
        "(line 594,col 9)-(line 594,col 25)",
        "(line 595,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 57)",
        "(line 608,col 9)-(line 608,col 55)",
        "(line 609,col 9)-(line 609,col 21)",
        "(line 612,col 9)-(line 612,col 40)",
        "(line 613,col 9)-(line 614,col 27)",
        "(line 616,col 9)-(line 616,col 27)",
        "(line 617,col 9)-(line 617,col 35)",
        "(line 620,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 40)",
        "(line 634,col 9)-(line 635,col 46)",
        "(line 642,col 9)-(line 665,col 9)",
        "(line 669,col 9)-(line 672,col 9)",
        "(line 675,col 9)-(line 676,col 46)",
        "(line 677,col 9)-(line 678,col 46)",
        "(line 681,col 9)-(line 693,col 9)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 705,col 9)-(line 707,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawEllipse(java.awt.geom.Point2D, double, java.awt.Graphics2D)",
      "begin_line": 718,
      "end_line": 722,
      "comment": "\r\n     * Draws an ellipse to represent an outlier.\r\n     * \r\n     * @param point  the location.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 720,col 48)",
        "(line 721,col 9)-(line 721,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawMultipleEllipse(java.awt.geom.Point2D, double, double, java.awt.Graphics2D)",
      "begin_line": 732,
      "end_line": 742,
      "comment": "\r\n     * Draws two ellipses to represent overlapping outliers.\r\n     * \r\n     * @param point  the location.\r\n     * @param boxWidth  the box width.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 736,col 76)",
        "(line 737,col 9)-(line 738,col 66)",
        "(line 739,col 9)-(line 739,col 22)",
        "(line 740,col 9)-(line 740,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawHighFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 752,
      "end_line": 758,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x value.\r\n     * @param m  the max y value.\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 34)",
        "(line 755,col 9)-(line 755,col 77)",
        "(line 756,col 9)-(line 756,col 63)",
        "(line 757,col 9)-(line 757,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawLowFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 768,
      "end_line": 774,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x value.\r\n     * @param m  the min y value.\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 34)",
        "(line 771,col 9)-(line 771,col 77)",
        "(line 772,col 9)-(line 772,col 63)",
        "(line 773,col 9)-(line 773,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.equals(java.lang.Object)",
      "begin_line": 783,
      "end_line": 808,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 69)",
        "(line 794,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 817,
      "end_line": 821,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 36)",
        "(line 819,col 9)-(line 819,col 58)",
        "(line 820,col 9)-(line 820,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 831,
      "end_line": 837,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 35)",
        "(line 835,col 9)-(line 835,col 58)",
        "(line 836,col 9)-(line 836,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.clone()",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 29)"
      ]
    }
  ]
}