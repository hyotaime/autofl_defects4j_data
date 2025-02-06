{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/category/BarRenderer3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BarRenderer3D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "org.jfree.chart.Effect3D",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 151,
      "end_line": 831,
      "comment": "\r\n * A renderer for bars with a 3D effect, for use with the\r\n * {@link CategoryPlot} class.  The example shown here is generated\r\n * by the \u003ccode\u003eBarChart3DDemo1.java\u003c/code\u003e program included in the JFreeChart\r\n * Demo Collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/BarRenderer3DSample.png\"\r\n * alt\u003d\"BarRenderer3DSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_X_OFFSET"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The default x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_Y_OFFSET"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The default y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WALL_PAINT"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The default wall paint. "
    },
    {
      "type": "field",
      "varNames": [
        "xOffset"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The size of x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "yOffset"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The size of y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "wallPaint"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The paint used to shade the left and lower 3D wall. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.BarRenderer3D()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Default constructor, creates a renderer with a default \u00273D effect\u0027.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.BarRenderer3D(double, double)",
      "begin_line": 188,
      "end_line": 202,
      "comment": "\r\n     * Constructs a new renderer with the specified \u00273D effect\u0027.\r\n     *\r\n     * @param xOffset  the x-offset for the 3D effect.\r\n     * @param yOffset  the y-offset for the 3D effect.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 16)",
        "(line 191,col 9)-(line 191,col 31)",
        "(line 192,col 9)-(line 192,col 31)",
        "(line 193,col 9)-(line 193,col 44)",
        "(line 195,col 9)-(line 196,col 39)",
        "(line 197,col 9)-(line 197,col 45)",
        "(line 198,col 9)-(line 199,col 39)",
        "(line 200,col 9)-(line 200,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.getXOffset()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the x-offset for the 3D effect.\r\n     *\r\n     * @return The 3D effect.\r\n     *\r\n     * @see #getYOffset()\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.getYOffset()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * Returns the y-offset for the 3D effect.\r\n     *\r\n     * @return The 3D effect.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.getWallPaint()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the paint used to highlight the left and bottom wall in the plot\r\n     * background.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setWallPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.setWallPaint(java.awt.Paint)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\r\n     * Sets the paint used to hightlight the left and bottom walls in the plot\r\n     * background, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getWallPaint()\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 31)",
        "(line 250,col 9)-(line 250,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 267,
      "end_line": 280,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be passed\r\n     * to subsequent calls to the drawItem method.  This method gets called\r\n     * once at the start of the process of drawing a chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 69)",
        "(line 276,col 9)-(line 277,col 31)",
        "(line 278,col 9)-(line 278,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 289,
      "end_line": 361,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area inside the axes.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 55)",
        "(line 294,col 9)-(line 294,col 46)",
        "(line 295,col 9)-(line 295,col 55)",
        "(line 297,col 9)-(line 297,col 46)",
        "(line 298,col 9)-(line 298,col 55)",
        "(line 299,col 9)-(line 299,col 46)",
        "(line 300,col 9)-(line 300,col 55)",
        "(line 302,col 9)-(line 302,col 45)",
        "(line 303,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 305,col 28)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 307,col 28)",
        "(line 308,col 9)-(line 308,col 28)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 311,col 9)-(line 311,col 56)",
        "(line 312,col 9)-(line 313,col 44)",
        "(line 316,col 9)-(line 316,col 58)",
        "(line 317,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 323,col 32)",
        "(line 324,col 9)-(line 324,col 32)",
        "(line 325,col 9)-(line 325,col 32)",
        "(line 326,col 9)-(line 326,col 32)",
        "(line 327,col 9)-(line 327,col 29)",
        "(line 328,col 9)-(line 328,col 36)",
        "(line 329,col 9)-(line 329,col 26)",
        "(line 331,col 9)-(line 331,col 51)",
        "(line 332,col 9)-(line 332,col 34)",
        "(line 333,col 9)-(line 333,col 34)",
        "(line 334,col 9)-(line 334,col 34)",
        "(line 335,col 9)-(line 335,col 34)",
        "(line 336,col 9)-(line 336,col 31)",
        "(line 337,col 9)-(line 337,col 36)",
        "(line 338,col 9)-(line 338,col 28)",
        "(line 341,col 9)-(line 341,col 37)",
        "(line 342,col 9)-(line 342,col 58)",
        "(line 343,col 9)-(line 343,col 24)",
        "(line 344,col 9)-(line 344,col 39)",
        "(line 345,col 9)-(line 345,col 24)",
        "(line 346,col 9)-(line 346,col 39)",
        "(line 347,col 9)-(line 347,col 24)",
        "(line 350,col 9)-(line 350,col 58)",
        "(line 351,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 359,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 370,
      "end_line": 401,
      "comment": "\r\n     * Draws the outline for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area inside the axes.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 43)",
        "(line 374,col 9)-(line 374,col 55)",
        "(line 375,col 9)-(line 375,col 46)",
        "(line 376,col 9)-(line 376,col 55)",
        "(line 378,col 9)-(line 378,col 46)",
        "(line 379,col 9)-(line 379,col 55)",
        "(line 380,col 9)-(line 380,col 46)",
        "(line 381,col 9)-(line 381,col 55)",
        "(line 383,col 9)-(line 383,col 45)",
        "(line 384,col 9)-(line 384,col 28)",
        "(line 385,col 9)-(line 385,col 28)",
        "(line 386,col 9)-(line 386,col 28)",
        "(line 387,col 9)-(line 387,col 28)",
        "(line 388,col 9)-(line 388,col 28)",
        "(line 389,col 9)-(line 389,col 28)",
        "(line 390,col 9)-(line 390,col 25)",
        "(line 393,col 9)-(line 393,col 55)",
        "(line 394,col 9)-(line 394,col 52)",
        "(line 395,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawDomainGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double)",
      "begin_line": 413,
      "end_line": 446,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 28)",
        "(line 419,col 9)-(line 419,col 28)",
        "(line 420,col 9)-(line 420,col 60)",
        "(line 421,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 52)",
        "(line 440,col 9)-(line 440,col 55)",
        "(line 441,col 9)-(line 441,col 72)",
        "(line 442,col 9)-(line 442,col 76)",
        "(line 443,col 9)-(line 443,col 23)",
        "(line 444,col 9)-(line 444,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawRangeGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 459,
      "end_line": 502,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 38)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 470,col 69)",
        "(line 472,col 9)-(line 472,col 28)",
        "(line 473,col 9)-(line 473,col 28)",
        "(line 474,col 9)-(line 474,col 60)",
        "(line 475,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 51)",
        "(line 496,col 9)-(line 496,col 54)",
        "(line 497,col 9)-(line 497,col 72)",
        "(line 498,col 9)-(line 498,col 76)",
        "(line 499,col 9)-(line 499,col 23)",
        "(line 500,col 9)-(line 500,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 520,
      "end_line": 560,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @see #drawRangeGridline\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 38)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 530,col 69)",
        "(line 532,col 9)-(line 532,col 28)",
        "(line 533,col 9)-(line 533,col 28)",
        "(line 534,col 9)-(line 534,col 60)",
        "(line 535,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 27)",
        "(line 556,col 9)-(line 556,col 29)",
        "(line 557,col 9)-(line 557,col 23)",
        "(line 558,col 9)-(line 558,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 571,
      "end_line": 641,
      "comment": "\r\n     * Draws a range marker.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 69)",
        "(line 581,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 660,
      "end_line": 776,
      "comment": "\r\n     * Draws a 3D bar to represent one data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area for plotting the data.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 57)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 671,col 47)",
        "(line 673,col 9)-(line 676,col 53)",
        "(line 678,col 9)-(line 678,col 60)",
        "(line 680,col 9)-(line 681,col 36)",
        "(line 682,col 9)-(line 683,col 43)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 688,col 9)-(line 688,col 53)",
        "(line 689,col 9)-(line 689,col 77)",
        "(line 690,col 9)-(line 690,col 77)",
        "(line 691,col 9)-(line 691,col 50)",
        "(line 692,col 9)-(line 692,col 55)",
        "(line 695,col 9)-(line 695,col 31)",
        "(line 696,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 62)",
        "(line 705,col 9)-(line 705,col 31)",
        "(line 706,col 9)-(line 706,col 21)",
        "(line 708,col 9)-(line 708,col 34)",
        "(line 709,col 9)-(line 709,col 38)",
        "(line 710,col 9)-(line 710,col 34)",
        "(line 711,col 9)-(line 711,col 38)",
        "(line 713,col 9)-(line 713,col 49)",
        "(line 714,col 9)-(line 714,col 34)",
        "(line 715,col 9)-(line 715,col 49)",
        "(line 716,col 9)-(line 716,col 34)",
        "(line 718,col 9)-(line 718,col 38)",
        "(line 719,col 9)-(line 719,col 36)",
        "(line 720,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 37)",
        "(line 735,col 9)-(line 735,col 48)",
        "(line 736,col 9)-(line 736,col 48)",
        "(line 737,col 9)-(line 737,col 48)",
        "(line 738,col 9)-(line 738,col 48)",
        "(line 739,col 9)-(line 739,col 29)",
        "(line 740,col 9)-(line 740,col 26)",
        "(line 742,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 756,col 34)",
        "(line 757,col 9)-(line 760,col 9)",
        "(line 763,col 9)-(line 763,col 64)",
        "(line 764,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.equals(java.lang.Object)",
      "begin_line": 785,
      "end_line": 803,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 49)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 812,
      "end_line": 815,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 36)",
        "(line 814,col 9)-(line 814,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.readObject(java.io.ObjectInputStream)",
      "begin_line": 825,
      "end_line": 829,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 35)",
        "(line 828,col 9)-(line 828,col 59)"
      ]
    }
  ]
}