{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CombinedRangeCategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedRangeCategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.CategoryPlot",
        "org.jfree.chart.plot.Zoomable",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 84,
      "end_line": 565,
      "comment": "\r\n * A combined category plot where the range axis is shared.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "totalWeight"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Total weight of all charts. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotArea"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " TODO: move to plot state"
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.CombinedRangeCategoryPlot()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.CombinedRangeCategoryPlot(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param rangeAxis  the shared range axis.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 119,col 50)",
        "(line 120,col 9)-(line 120,col 29)",
        "(line 121,col 9)-(line 121,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getGap()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the space between subplots.\r\n     *\r\n     * @return The gap (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.setGap(double)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\r\n     * Sets the amount of space between subplots and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 23)",
        "(line 141,col 9)-(line 141,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.add(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\r\n     * Adds a subplot (with a default \u0027weight\u0027 of 1) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.add(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 168,
      "end_line": 191,
      "comment": "\r\n     * Adds a subplot and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param weight  the weight (must be \u003e\u003d 1).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 178,col 67)",
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 180,col 49)",
        "(line 181,col 9)-(line 181,col 40)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 183,col 9)-(line 183,col 35)",
        "(line 186,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.remove(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 198,
      "end_line": 228,
      "comment": "\r\n     * Removes a subplot from the combined chart.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 26)",
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 18)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getSubplots()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns the list of subplots.\r\n     *\r\n     * @return The list (unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 247,
      "end_line": 316,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 55)",
        "(line 254,col 9)-(line 254,col 51)",
        "(line 255,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 68)",
        "(line 277,col 9)-(line 277,col 37)",
        "(line 281,col 9)-(line 281,col 46)",
        "(line 282,col 9)-(line 282,col 43)",
        "(line 283,col 9)-(line 283,col 43)",
        "(line 284,col 9)-(line 284,col 32)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 331,
      "end_line": 377,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).  Will perform all the placement calculations for each \r\n     * sub-plots and then tell these to draw themselves.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axis labels)\r\n     *              should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the parent state.\r\n     * @param info  collects information about the drawing (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 341,col 9)-(line 341,col 45)",
        "(line 342,col 9)-(line 342,col 26)",
        "(line 345,col 9)-(line 345,col 55)",
        "(line 346,col 9)-(line 346,col 56)",
        "(line 349,col 9)-(line 349,col 50)",
        "(line 352,col 9)-(line 352,col 40)",
        "(line 353,col 9)-(line 353,col 53)",
        "(line 354,col 9)-(line 354,col 70)",
        "(line 355,col 9)-(line 356,col 22)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 59)",
        "(line 363,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 384,
      "end_line": 394,
      "comment": "\r\n     * Sets the orientation for the plot (and all the subplots).\r\n     * \r\n     * @param orientation  the orientation.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 42)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 404,
      "end_line": 416,
      "comment": "\r\n      * Returns the range for the axis.  This is the combined range of all the\r\n      * subplots.\r\n      *\r\n      * @param axis  the axis.\r\n      *\r\n      * @return The range.\r\n      ",
      "child_ranges": [
        "(line 406,col 10)-(line 406,col 29)",
        "(line 407,col 10)-(line 413,col 10)",
        "(line 414,col 10)-(line 414,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getLegendItems()",
      "begin_line": 423,
      "end_line": 437,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 60)",
        "(line 425,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 445,
      "end_line": 453,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the \r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 53)",
        "(line 448,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 463,
      "end_line": 474,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor value.\r\n     *\r\n     * @param x  x-coordinate of the click.\r\n     * @param y  y-coordinate of the click.\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 50)",
        "(line 466,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.equals(java.lang.Object)",
      "begin_line": 493,
      "end_line": 514,
      "comment": " \r\n     * Tests the plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 73)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.clone()",
      "begin_line": 524,
      "end_line": 541,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 526,col 56)",
        "(line 527,col 9)-(line 527,col 74)",
        "(line 528,col 9)-(line 531,col 9)",
        "(line 535,col 9)-(line 535,col 52)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 540,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 551,
      "end_line": 563,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 35)",
        "(line 558,col 9)-(line 558,col 45)",
        "(line 559,col 9)-(line 561,col 9)"
      ]
    }
  ]
}