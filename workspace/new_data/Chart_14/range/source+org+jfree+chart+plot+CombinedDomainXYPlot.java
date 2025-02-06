{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/CombinedDomainXYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDomainXYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.XYPlot",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 121,
      "end_line": 716,
      "comment": "\r\n * An extension of {@link XYPlot} that contains multiple subplots that share a \r\n * common domain axis.\r\n "
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
        "subplots"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "totalWeight"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Total weight of all charts. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotAreas"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.CombinedDomainXYPlot()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.CombinedDomainXYPlot(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "\r\n     * Creates a new combined plot that shares a domain axis among multiple \r\n     * subplots.\r\n     *\r\n     * @param domainAxis  the shared axis.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 161,col 10)",
        "(line 163,col 9)-(line 163,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getPlotType()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type of plot.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 182,
      "end_line": 191,
      "comment": "\r\n     * Sets the orientation for the plot (also changes the orientation for all \r\n     * the subplots to match).\r\n     * \r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 42)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 206,
      "end_line": 216,
      "comment": "\r\n     * Returns a range representing the extent of the data values in this plot\r\n     * (obtained from the subplots) that will be rendered against the specified \r\n     * axis.  NOTE: This method is intended for internal JFreeChart use, and \r\n     * is public only so that code in the axis classes can call it.  Since \r\n     * only the domain axis is shared between subplots, the JFreeChart code \r\n     * will only call this method for the domain values (although this is not \r\n     * checked/enforced).\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)",
        "(line 208,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getGap()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the gap between subplots, measured in Java2D units.\r\n     *\r\n     * @return The gap (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setGap(double)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\r\n     * Sets the amount of space between subplots and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 23)",
        "(line 235,col 9)-(line 235,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.add(org.jfree.chart.plot.XYPlot)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\r\n     * Adds a subplot (with a default \u0027weight\u0027 of 1) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.add(org.jfree.chart.plot.XYPlot, int)",
      "begin_line": 264,
      "end_line": 289,
      "comment": "\r\n     * Adds a subplot with the specified weight and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  The weight \r\n     * determines how much space is allocated to the subplot relative to all \r\n     * the other subplots.\r\n     * \u003cP\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param weight  the weight (must be \u003e\u003d 1).\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 275,col 9)-(line 275,col 34)",
        "(line 276,col 9)-(line 276,col 74)",
        "(line 277,col 9)-(line 277,col 36)",
        "(line 278,col 9)-(line 278,col 40)",
        "(line 279,col 9)-(line 279,col 35)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 284,col 9)-(line 284,col 41)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.remove(org.jfree.chart.plot.XYPlot)",
      "begin_line": 297,
      "end_line": 322,
      "comment": "\r\n     * Removes a subplot from the combined chart and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 26)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 18)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getSubplots()",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\r\n     * Returns the list of subplots.  The returned list may be empty, but is\r\n     * never \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 331,col 6)-(line 336,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 347,
      "end_line": 413,
      "comment": "\r\n     * Calculates the axis space required.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 42)",
        "(line 351,col 9)-(line 351,col 55)",
        "(line 354,col 9)-(line 354,col 52)",
        "(line 355,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 68)",
        "(line 377,col 9)-(line 377,col 37)",
        "(line 378,col 9)-(line 378,col 47)",
        "(line 379,col 9)-(line 379,col 43)",
        "(line 380,col 9)-(line 380,col 43)",
        "(line 381,col 9)-(line 381,col 32)",
        "(line 382,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 427,
      "end_line": 475,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e \r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 439,col 9)-(line 439,col 45)",
        "(line 440,col 9)-(line 440,col 26)",
        "(line 442,col 9)-(line 442,col 48)",
        "(line 443,col 9)-(line 443,col 55)",
        "(line 444,col 9)-(line 444,col 56)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 450,col 9)-(line 450,col 41)",
        "(line 451,col 9)-(line 451,col 49)",
        "(line 452,col 9)-(line 452,col 65)",
        "(line 453,col 9)-(line 453,col 80)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 63)",
        "(line 460,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getLegendItems()",
      "begin_line": 482,
      "end_line": 496,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 60)",
        "(line 484,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 505,
      "end_line": 521,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 51)",
        "(line 509,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 531,
      "end_line": 547,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 51)",
        "(line 535,col 9)-(line 546,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 558,
      "end_line": 571,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified \r\n     * in Java2D space).\r\n     * \r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 29)",
        "(line 566,col 9)-(line 566,col 56)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 582,
      "end_line": 594,
      "comment": "\r\n     * Sets the item renderer FOR ALL SUBPLOTS.  Registered listeners are \r\n     * notified that the plot has been modified.\r\n     * \u003cP\u003e\r\n     * Note: usually you will want to set the renderer independently for each \r\n     * subplot, which is NOT what this method does.\r\n     *\r\n     * @param renderer the new renderer.\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 36)",
        "(line 588,col 9)-(line 588,col 53)",
        "(line 589,col 9)-(line 592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 602,
      "end_line": 606,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 44)",
        "(line 604,col 9)-(line 604,col 49)",
        "(line 605,col 9)-(line 605,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 614,
      "end_line": 620,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the \r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 53)",
        "(line 616,col 9)-(line 619,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 629,
      "end_line": 638,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  x-coordinate, where the click occured.\r\n     * @param y  y-coordinate, where the click occured.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 50)",
        "(line 631,col 9)-(line 637,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.equals(java.lang.Object)",
      "begin_line": 657,
      "end_line": 686,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 663,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 674,col 60)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 685,col 9)-(line 685,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.clone()",
      "begin_line": 696,
      "end_line": 714,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 75)",
        "(line 699,col 9)-(line 699,col 74)",
        "(line 700,col 9)-(line 703,col 9)",
        "(line 707,col 9)-(line 707,col 54)",
        "(line 708,col 9)-(line 710,col 9)",
        "(line 712,col 9)-(line 712,col 22)"
      ]
    }
  ]
}