{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYBoxAndWhiskerRenderer.java",
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
      "begin_line": 119,
      "end_line": 814,
      "comment": "\r\n * A renderer that draws box-and-whisker items on an {@link XYPlot}.  This \r\n * renderer requires a {@link BoxAndWhiskerXYDataset}).\r\n * \u003cP\u003e\r\n * This renderer does not include any code to calculate the crosshair point.\r\n "
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
        "boxWidth"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The box width. "
    },
    {
      "type": "field",
      "varNames": [
        "boxPaint"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The paint used to fill the box. "
    },
    {
      "type": "field",
      "varNames": [
        "fillBox"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " A flag that controls whether or not the box is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "artifactPaint"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " \r\n     * The paint used to draw various artifacts such as outliers, farout \r\n     * symbol, average ellipse and median line. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.XYBoxAndWhiskerRenderer()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Creates a new renderer for box and whisker charts.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.XYBoxAndWhiskerRenderer(double)",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\r\n     * Creates a new renderer for box and whisker charts.\r\n     * \u003cP\u003e\r\n     * Use -1 for the box width if you prefer the width to be calculated \r\n     * automatically.\r\n     *\r\n     * @param boxWidth  the box width.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 16)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getBoxWidth()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the width of each box.\r\n     *\r\n     * @return The box width.\r\n     * \r\n     * @see #setBoxWidth(double)\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setBoxWidth(double)",
      "begin_line": 188,
      "end_line": 193,
      "comment": "\r\n     * Sets the box width and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * If you set the width to a negative value, the renderer will calculate\r\n     * the box width automatically based on the space available on the chart.\r\n     *\r\n     * @param width  the width.\r\n     * \r\n     * @see #getBoxWidth()\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getBoxPaint()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\r\n     * Returns the paint used to fill boxes.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBoxPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setBoxPaint(java.awt.Paint)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\r\n     * Sets the paint used to fill boxes and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBoxPaint()\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 30)",
        "(line 216,col 9)-(line 216,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getFillBox()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns the flag that controls whether or not the box is filled.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setFillBox(boolean)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\r\n     * Sets the flag that controls whether or not the box is filled and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #setFillBox(boolean)\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 28)",
        "(line 240,col 9)-(line 240,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.getArtifactPaint()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Returns the paint used to paint the various artifacts such as outliers, \r\n     * farout symbol, median line and the averages ellipse.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setArtifactPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.setArtifactPaint(java.awt.Paint)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\r\n     * Sets the paint used to paint the various artifacts such as outliers, \r\n     * farout symbol, median line and the averages ellipse.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getArtifactPaint()\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 35)",
        "(line 268,col 9)-(line 268,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 289,
      "end_line": 313,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 60)",
        "(line 304,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawHorizontalItem(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 332,
      "end_line": 457,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 41)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 351,col 51)",
        "(line 353,col 9)-(line 353,col 56)",
        "(line 354,col 9)-(line 354,col 73)",
        "(line 355,col 9)-(line 355,col 73)",
        "(line 356,col 9)-(line 356,col 72)",
        "(line 357,col 9)-(line 357,col 71)",
        "(line 358,col 9)-(line 358,col 70)",
        "(line 359,col 9)-(line 359,col 70)",
        "(line 361,col 9)-(line 362,col 42)",
        "(line 364,col 9)-(line 364,col 57)",
        "(line 365,col 9)-(line 366,col 26)",
        "(line 367,col 9)-(line 368,col 26)",
        "(line 369,col 9)-(line 370,col 36)",
        "(line 371,col 9)-(line 371,col 31)",
        "(line 372,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 379,col 36)",
        "(line 381,col 9)-(line 381,col 45)",
        "(line 382,col 9)-(line 382,col 37)",
        "(line 383,col 9)-(line 383,col 48)",
        "(line 384,col 9)-(line 384,col 35)",
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 32)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 47)",
        "(line 405,col 9)-(line 405,col 24)",
        "(line 408,col 9)-(line 408,col 62)",
        "(line 409,col 9)-(line 410,col 33)",
        "(line 413,col 9)-(line 413,col 62)",
        "(line 414,col 9)-(line 415,col 33)",
        "(line 418,col 9)-(line 418,col 25)",
        "(line 419,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 21)",
        "(line 436,col 9)-(line 436,col 40)",
        "(line 437,col 9)-(line 438,col 59)",
        "(line 441,col 9)-(line 448,col 9)",
        "(line 453,col 9)-(line 455,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawVerticalItem(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 476,
      "end_line": 673,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 41)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 495,col 47)",
        "(line 497,col 9)-(line 497,col 56)",
        "(line 498,col 9)-(line 498,col 73)",
        "(line 499,col 9)-(line 499,col 73)",
        "(line 500,col 9)-(line 500,col 72)",
        "(line 501,col 9)-(line 501,col 71)",
        "(line 502,col 9)-(line 502,col 70)",
        "(line 503,col 9)-(line 503,col 70)",
        "(line 504,col 9)-(line 504,col 69)",
        "(line 506,col 9)-(line 507,col 42)",
        "(line 509,col 9)-(line 509,col 57)",
        "(line 510,col 9)-(line 511,col 26)",
        "(line 512,col 9)-(line 513,col 26)",
        "(line 514,col 9)-(line 515,col 36)",
        "(line 516,col 9)-(line 516,col 31)",
        "(line 517,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 522,col 36)",
        "(line 523,col 9)-(line 524,col 36)",
        "(line 525,col 9)-(line 525,col 25)",
        "(line 528,col 9)-(line 528,col 45)",
        "(line 529,col 9)-(line 529,col 37)",
        "(line 530,col 9)-(line 530,col 67)",
        "(line 531,col 9)-(line 531,col 35)",
        "(line 532,col 9)-(line 532,col 55)",
        "(line 533,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 547,col 32)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 47)",
        "(line 553,col 9)-(line 553,col 24)",
        "(line 556,col 9)-(line 556,col 62)",
        "(line 557,col 9)-(line 558,col 24)",
        "(line 561,col 9)-(line 561,col 62)",
        "(line 562,col 9)-(line 563,col 24)",
        "(line 566,col 9)-(line 566,col 25)",
        "(line 567,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 21)",
        "(line 581,col 9)-(line 581,col 40)",
        "(line 582,col 9)-(line 583,col 27)",
        "(line 585,col 9)-(line 585,col 27)",
        "(line 586,col 9)-(line 586,col 35)",
        "(line 589,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 597,col 40)",
        "(line 598,col 9)-(line 599,col 46)",
        "(line 606,col 9)-(line 629,col 9)",
        "(line 633,col 9)-(line 636,col 9)",
        "(line 639,col 9)-(line 640,col 46)",
        "(line 641,col 9)-(line 642,col 46)",
        "(line 645,col 9)-(line 657,col 9)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 669,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawEllipse(java.awt.geom.Point2D, double, java.awt.Graphics2D)",
      "begin_line": 682,
      "end_line": 686,
      "comment": "\r\n     * Draws an ellipse to represent an outlier.\r\n     * \r\n     * @param point  the location.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 684,col 48)",
        "(line 685,col 9)-(line 685,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawMultipleEllipse(java.awt.geom.Point2D, double, double, java.awt.Graphics2D)",
      "begin_line": 696,
      "end_line": 706,
      "comment": "\r\n     * Draws two ellipses to represent overlapping outliers.\r\n     * \r\n     * @param point  the location.\r\n     * @param boxWidth  the box width.\r\n     * @param oRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 700,col 76)",
        "(line 701,col 9)-(line 702,col 66)",
        "(line 703,col 9)-(line 703,col 22)",
        "(line 704,col 9)-(line 704,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawHighFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 716,
      "end_line": 722,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x value.\r\n     * @param m  the max y value.\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 34)",
        "(line 719,col 9)-(line 719,col 77)",
        "(line 720,col 9)-(line 720,col 63)",
        "(line 721,col 9)-(line 721,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.drawLowFarOut(double, java.awt.Graphics2D, double, double)",
      "begin_line": 732,
      "end_line": 738,
      "comment": "\r\n     * Draws a triangle to indicate the presence of far out values.\r\n     * \r\n     * @param aRadius  the radius.\r\n     * @param g2  the graphics device.\r\n     * @param xx  the x value.\r\n     * @param m  the min y value.\r\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 34)",
        "(line 735,col 9)-(line 735,col 77)",
        "(line 736,col 9)-(line 736,col 63)",
        "(line 737,col 9)-(line 737,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.equals(java.lang.Object)",
      "begin_line": 747,
      "end_line": 772,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 69)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 781,
      "end_line": 785,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 36)",
        "(line 783,col 9)-(line 783,col 58)",
        "(line 784,col 9)-(line 784,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 795,
      "end_line": 801,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 35)",
        "(line 799,col 9)-(line 799,col 58)",
        "(line 800,col 9)-(line 800,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.clone()",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 29)"
      ]
    }
  ]
}