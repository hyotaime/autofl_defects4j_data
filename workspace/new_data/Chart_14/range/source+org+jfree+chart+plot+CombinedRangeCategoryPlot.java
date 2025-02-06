{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/CombinedRangeCategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedRangeCategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.CategoryPlot",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 86,
      "end_line": 571,
      "comment": "\r\n * A combined category plot where the range axis is shared.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "totalWeight"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Total weight of all charts. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotArea"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " TODO: move to plot state"
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.CombinedRangeCategoryPlot()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.CombinedRangeCategoryPlot(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param rangeAxis  the shared range axis.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 43)",
        "(line 118,col 9)-(line 118,col 50)",
        "(line 119,col 9)-(line 119,col 29)",
        "(line 120,col 9)-(line 120,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getGap()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the space between subplots.\r\n     *\r\n     * @return The gap (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.setGap(double)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\r\n     * Sets the amount of space between subplots and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 23)",
        "(line 140,col 9)-(line 140,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.add(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\r\n     * Adds a subplot (with a default \u0027weight\u0027 of 1) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.add(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 167,
      "end_line": 190,
      "comment": "\r\n     * Adds a subplot and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param weight  the weight (must be \u003e\u003d 1).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 32)",
        "(line 176,col 9)-(line 176,col 34)",
        "(line 177,col 9)-(line 177,col 67)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 49)",
        "(line 180,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 185,col 9)-(line 185,col 40)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.remove(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 197,
      "end_line": 227,
      "comment": "\r\n     * Removes a subplot from the combined chart.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 26)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 203,col 18)",
        "(line 204,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getSubplots()",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\r\n     * Returns the list of subplots.  The returned list may be empty, but is\r\n     * never \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 236,col 6)-(line 241,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 252,
      "end_line": 321,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 256,col 55)",
        "(line 259,col 9)-(line 259,col 51)",
        "(line 260,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 68)",
        "(line 282,col 9)-(line 282,col 37)",
        "(line 286,col 9)-(line 286,col 46)",
        "(line 287,col 9)-(line 287,col 43)",
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 32)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 336,
      "end_line": 382,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).  Will perform all the placement calculations for each \r\n     * sub-plots and then tell these to draw themselves.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axis labels)\r\n     *              should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the parent state.\r\n     * @param info  collects information about the drawing (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 346,col 45)",
        "(line 347,col 9)-(line 347,col 26)",
        "(line 350,col 9)-(line 350,col 55)",
        "(line 351,col 9)-(line 351,col 56)",
        "(line 354,col 9)-(line 354,col 50)",
        "(line 357,col 9)-(line 357,col 40)",
        "(line 358,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 70)",
        "(line 360,col 9)-(line 361,col 22)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 59)",
        "(line 368,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 389,
      "end_line": 399,
      "comment": "\r\n     * Sets the orientation for the plot (and all the subplots).\r\n     * \r\n     * @param orientation  the orientation.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 42)",
        "(line 393,col 9)-(line 393,col 53)",
        "(line 394,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 414,
      "end_line": 424,
      "comment": "\r\n     * Returns a range representing the extent of the data values in this plot\r\n     * (obtained from the subplots) that will be rendered against the specified \r\n     * axis.  NOTE: This method is intended for internal JFreeChart use, and \r\n     * is public only so that code in the axis classes can call it.  Since \r\n     * only the range axis is shared between subplots, the JFreeChart code \r\n     * will only call this method for the range values (although this is not \r\n     * checked/enforced).\r\n      *\r\n      * @param axis  the axis.\r\n      *\r\n      * @return The range.\r\n      ",
      "child_ranges": [
        "(line 415,col 10)-(line 415,col 29)",
        "(line 416,col 10)-(line 422,col 10)",
        "(line 423,col 10)-(line 423,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.getLegendItems()",
      "begin_line": 431,
      "end_line": 445,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 60)",
        "(line 433,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 453,
      "end_line": 459,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the \r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 53)",
        "(line 455,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 469,
      "end_line": 480,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor value.\r\n     *\r\n     * @param x  x-coordinate of the click.\r\n     * @param y  y-coordinate of the click.\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 50)",
        "(line 472,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.equals(java.lang.Object)",
      "begin_line": 499,
      "end_line": 520,
      "comment": " \r\n     * Tests the plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 73)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.clone()",
      "begin_line": 530,
      "end_line": 547,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 532,col 56)",
        "(line 533,col 9)-(line 533,col 74)",
        "(line 534,col 9)-(line 537,col 9)",
        "(line 541,col 9)-(line 541,col 52)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeCategoryPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 557,
      "end_line": 569,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 35)",
        "(line 564,col 9)-(line 564,col 45)",
        "(line 565,col 9)-(line 567,col 9)"
      ]
    }
  ]
}