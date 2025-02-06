{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/BarRenderer3D.java",
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
      "begin_line": 146,
      "end_line": 774,
      "comment": "\r\n * A renderer for bars with a 3D effect, for use with the \r\n * {@link org.jfree.chart.plot.CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_X_OFFSET"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The default x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_Y_OFFSET"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The default y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WALL_PAINT"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The default wall paint. "
    },
    {
      "type": "field",
      "varNames": [
        "xOffset"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The size of x-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "yOffset"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The size of y-offset for the 3D effect. "
    },
    {
      "type": "field",
      "varNames": [
        "wallPaint"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The paint used to shade the left and lower 3D wall. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.BarRenderer3D()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Default constructor, creates a renderer with a default \u00273D effect\u0027.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.BarRenderer3D(double, double)",
      "begin_line": 184,
      "end_line": 198,
      "comment": "\r\n     * Constructs a new renderer with the specified \u00273D effect\u0027.\r\n     *\r\n     * @param xOffset  the x-offset for the 3D effect.\r\n     * @param yOffset  the y-offset for the 3D effect.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 16)",
        "(line 187,col 9)-(line 187,col 31)",
        "(line 188,col 9)-(line 188,col 31)",
        "(line 189,col 9)-(line 189,col 44)",
        "(line 191,col 9)-(line 192,col 39)",
        "(line 193,col 9)-(line 193,col 45)",
        "(line 194,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.getXOffset()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the x-offset for the 3D effect.\r\n     *\r\n     * @return The 3D effect.\r\n     * \r\n     * @see #getYOffset()\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.getYOffset()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the y-offset for the 3D effect.\r\n     *\r\n     * @return The 3D effect.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.getWallPaint()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the paint used to highlight the left and bottom wall in the plot\r\n     * background.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @see #setWallPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.setWallPaint(java.awt.Paint)",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\r\n     * Sets the paint used to hightlight the left and bottom walls in the plot\r\n     * background, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getWallPaint()\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 31)",
        "(line 246,col 9)-(line 246,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 263,
      "end_line": 276,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be passed \r\n     * to subsequent calls to the drawItem method.  This method gets called \r\n     * once at the start of the process of drawing a chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be plotted.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 69)",
        "(line 272,col 9)-(line 273,col 37)",
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 285,
      "end_line": 357,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area inside the axes.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 55)",
        "(line 290,col 9)-(line 290,col 46)",
        "(line 291,col 9)-(line 291,col 55)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 55)",
        "(line 295,col 9)-(line 295,col 46)",
        "(line 296,col 9)-(line 296,col 55)",
        "(line 298,col 9)-(line 298,col 45)",
        "(line 299,col 9)-(line 299,col 28)",
        "(line 300,col 9)-(line 300,col 28)",
        "(line 301,col 9)-(line 301,col 28)",
        "(line 302,col 9)-(line 302,col 28)",
        "(line 303,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 305,col 25)",
        "(line 307,col 9)-(line 307,col 56)",
        "(line 308,col 9)-(line 309,col 44)",
        "(line 312,col 9)-(line 312,col 58)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 49)",
        "(line 319,col 9)-(line 319,col 32)",
        "(line 320,col 9)-(line 320,col 32)",
        "(line 321,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 322,col 32)",
        "(line 323,col 9)-(line 323,col 29)",
        "(line 324,col 9)-(line 324,col 36)",
        "(line 325,col 9)-(line 325,col 26)",
        "(line 327,col 9)-(line 327,col 51)",
        "(line 328,col 9)-(line 328,col 34)",
        "(line 329,col 9)-(line 329,col 34)",
        "(line 330,col 9)-(line 330,col 34)",
        "(line 331,col 9)-(line 331,col 34)",
        "(line 332,col 9)-(line 332,col 31)",
        "(line 333,col 9)-(line 333,col 36)",
        "(line 334,col 9)-(line 334,col 28)",
        "(line 337,col 9)-(line 337,col 37)",
        "(line 338,col 9)-(line 338,col 58)",
        "(line 339,col 9)-(line 339,col 24)",
        "(line 340,col 9)-(line 340,col 39)",
        "(line 341,col 9)-(line 341,col 24)",
        "(line 342,col 9)-(line 342,col 39)",
        "(line 343,col 9)-(line 343,col 24)",
        "(line 346,col 9)-(line 346,col 58)",
        "(line 347,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 366,
      "end_line": 397,
      "comment": "\r\n     * Draws the outline for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area inside the axes.\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 43)",
        "(line 370,col 9)-(line 370,col 55)",
        "(line 371,col 9)-(line 371,col 46)",
        "(line 372,col 9)-(line 372,col 55)",
        "(line 374,col 9)-(line 374,col 46)",
        "(line 375,col 9)-(line 375,col 55)",
        "(line 376,col 9)-(line 376,col 46)",
        "(line 377,col 9)-(line 377,col 55)",
        "(line 379,col 9)-(line 379,col 45)",
        "(line 380,col 9)-(line 380,col 28)",
        "(line 381,col 9)-(line 381,col 28)",
        "(line 382,col 9)-(line 382,col 28)",
        "(line 383,col 9)-(line 383,col 28)",
        "(line 384,col 9)-(line 384,col 28)",
        "(line 385,col 9)-(line 385,col 28)",
        "(line 386,col 9)-(line 386,col 25)",
        "(line 389,col 9)-(line 389,col 55)",
        "(line 390,col 9)-(line 390,col 52)",
        "(line 391,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawDomainGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double)",
      "begin_line": 409,
      "end_line": 442,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any \r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 28)",
        "(line 415,col 9)-(line 415,col 28)",
        "(line 416,col 9)-(line 416,col 60)",
        "(line 417,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 52)",
        "(line 436,col 9)-(line 436,col 55)",
        "(line 437,col 9)-(line 437,col 72)",
        "(line 438,col 9)-(line 438,col 76)",
        "(line 439,col 9)-(line 439,col 23)",
        "(line 440,col 9)-(line 440,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawRangeGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 455,
      "end_line": 501,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any \r\n     *                  3D effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 38)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 469,col 69)",
        "(line 471,col 9)-(line 471,col 28)",
        "(line 472,col 9)-(line 472,col 28)",
        "(line 473,col 9)-(line 473,col 60)",
        "(line 474,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 51)",
        "(line 495,col 9)-(line 495,col 54)",
        "(line 496,col 9)-(line 496,col 72)",
        "(line 497,col 9)-(line 497,col 76)",
        "(line 498,col 9)-(line 498,col 23)",
        "(line 499,col 9)-(line 499,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 512,
      "end_line": 582,
      "comment": "\r\n     * Draws a range marker.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param marker  the marker.\r\n     * @param dataArea  the area for plotting data (not including 3D effect).\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 69)",
        "(line 522,col 9)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 598,
      "end_line": 719,
      "comment": "\r\n     * Draws a 3D bar to represent one data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area for plotting the data.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 57)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 47)",
        "(line 617,col 9)-(line 620,col 53)",
        "(line 622,col 9)-(line 622,col 60)",
        "(line 624,col 9)-(line 625,col 36)",
        "(line 626,col 9)-(line 626,col 51)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 53)",
        "(line 632,col 9)-(line 632,col 77)",
        "(line 633,col 9)-(line 633,col 77)",
        "(line 634,col 9)-(line 634,col 50)",
        "(line 635,col 9)-(line 635,col 55)",
        "(line 638,col 9)-(line 638,col 31)",
        "(line 639,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 52)",
        "(line 648,col 9)-(line 648,col 31)",
        "(line 649,col 9)-(line 649,col 21)",
        "(line 651,col 9)-(line 651,col 34)",
        "(line 652,col 9)-(line 652,col 38)",
        "(line 653,col 9)-(line 653,col 34)",
        "(line 654,col 9)-(line 654,col 38)",
        "(line 656,col 9)-(line 656,col 49)",
        "(line 657,col 9)-(line 657,col 34)",
        "(line 658,col 9)-(line 658,col 49)",
        "(line 659,col 9)-(line 659,col 34)",
        "(line 661,col 9)-(line 661,col 38)",
        "(line 662,col 9)-(line 662,col 36)",
        "(line 663,col 9)-(line 675,col 9)",
        "(line 677,col 9)-(line 677,col 37)",
        "(line 678,col 9)-(line 678,col 48)",
        "(line 679,col 9)-(line 679,col 48)",
        "(line 680,col 9)-(line 680,col 48)",
        "(line 681,col 9)-(line 681,col 48)",
        "(line 682,col 9)-(line 682,col 29)",
        "(line 683,col 9)-(line 683,col 26)",
        "(line 685,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 699,col 49)",
        "(line 700,col 9)-(line 703,col 9)",
        "(line 706,col 9)-(line 706,col 64)",
        "(line 707,col 9)-(line 717,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.equals(java.lang.Object)",
      "begin_line": 728,
      "end_line": 746,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 49)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 755,
      "end_line": 758,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 36)",
        "(line 757,col 9)-(line 757,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarRenderer3D.readObject(java.io.ObjectInputStream)",
      "begin_line": 768,
      "end_line": 772,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 35)",
        "(line 771,col 9)-(line 771,col 59)"
      ]
    }
  ]
}