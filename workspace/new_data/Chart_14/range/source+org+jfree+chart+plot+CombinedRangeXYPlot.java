{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/CombinedRangeXYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedRangeXYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.XYPlot",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 123,
      "end_line": 689,
      "comment": "\r\n * An extension of {@link XYPlot} that contains multiple subplots that share a \r\n * common range axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "totalWeight"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Total weight of all charts. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotAreas"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.CombinedRangeXYPlot()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.CombinedRangeXYPlot(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 153,
      "end_line": 162,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param rangeAxis  the shared axis.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 20)",
        "(line 160,col 9)-(line 160,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getPlotType()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type of plot.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getGap()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the space between subplots.\r\n     *\r\n     * @return The gap\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setGap(double)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Sets the amount of space between subplots.\r\n     *\r\n     * @param gap  the gap between subplots\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.add(org.jfree.chart.plot.XYPlot)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Adds a subplot, with a default \u0027weight\u0027 of 1.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.add(org.jfree.chart.plot.XYPlot, int)",
      "begin_line": 214,
      "end_line": 235,
      "comment": "\r\n     * Adds a subplot with a particular weight (greater than or equal to one).  \r\n     * The weight determines how much space is allocated to the subplot \r\n     * relative to all the other subplots.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot.\r\n     * @param weight  the weight (must be 1 or greater).\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 224,col 9)-(line 224,col 34)",
        "(line 225,col 9)-(line 225,col 67)",
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 35)",
        "(line 231,col 9)-(line 231,col 35)",
        "(line 232,col 9)-(line 232,col 29)",
        "(line 233,col 9)-(line 233,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.remove(org.jfree.chart.plot.XYPlot)",
      "begin_line": 242,
      "end_line": 263,
      "comment": "\r\n     * Removes a subplot from the combined chart.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 26)",
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 18)",
        "(line 249,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getSubplots()",
      "begin_line": 271,
      "end_line": 278,
      "comment": "\r\n     * Returns the list of subplots.  The returned list may be empty, but is\r\n     * never \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 272,col 6)-(line 277,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 288,
      "end_line": 358,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 42)",
        "(line 292,col 9)-(line 292,col 55)",
        "(line 295,col 9)-(line 295,col 51)",
        "(line 296,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 68)",
        "(line 319,col 9)-(line 319,col 37)",
        "(line 323,col 9)-(line 323,col 47)",
        "(line 324,col 9)-(line 324,col 43)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 326,col 32)",
        "(line 327,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 372,
      "end_line": 421,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e \r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 384,col 9)-(line 384,col 45)",
        "(line 385,col 9)-(line 385,col 26)",
        "(line 387,col 9)-(line 387,col 55)",
        "(line 388,col 9)-(line 388,col 56)",
        "(line 392,col 9)-(line 392,col 50)",
        "(line 395,col 9)-(line 395,col 40)",
        "(line 396,col 9)-(line 396,col 48)",
        "(line 397,col 9)-(line 397,col 65)",
        "(line 398,col 9)-(line 398,col 80)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 63)",
        "(line 406,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 419,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getLegendItems()",
      "begin_line": 428,
      "end_line": 443,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 60)",
        "(line 430,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 452,
      "end_line": 468,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 51)",
        "(line 456,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 478,
      "end_line": 495,
      "comment": "\r\n     * Zooms in on the domain axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 51)",
        "(line 482,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 506,
      "end_line": 519,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified \r\n     * in Java2D space).\r\n     * \r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 29)",
        "(line 514,col 9)-(line 514,col 56)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 530,
      "end_line": 542,
      "comment": "\r\n     * Sets the item renderer FOR ALL SUBPLOTS.  Registered listeners are \r\n     * notified that the plot has been modified.\r\n     * \u003cP\u003e\r\n     * Note: usually you will want to set the renderer independently for each \r\n     * subplot, which is NOT what this method does.\r\n     *\r\n     * @param renderer the new renderer.\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 36)",
        "(line 536,col 9)-(line 536,col 53)",
        "(line 537,col 9)-(line 540,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 549,
      "end_line": 559,
      "comment": "\r\n     * Sets the orientation for the plot (and all its subplots).\r\n     * \r\n     * @param orientation  the orientation.\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 42)",
        "(line 553,col 9)-(line 553,col 53)",
        "(line 554,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 574,
      "end_line": 584,
      "comment": "\r\n     * Returns a range representing the extent of the data values in this plot\r\n     * (obtained from the subplots) that will be rendered against the specified \r\n     * axis.  NOTE: This method is intended for internal JFreeChart use, and \r\n     * is public only so that code in the axis classes can call it.  Since \r\n     * only the range axis is shared between subplots, the JFreeChart code \r\n     * will only call this method for the range values (although this is not \r\n     * checked/enforced).\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 28)",
        "(line 576,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 592,
      "end_line": 598,
      "comment": "\r\n     * Sets the space (width or height, depending on the orientation of the \r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 53)",
        "(line 594,col 9)-(line 597,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 607,
      "end_line": 618,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values...\r\n     *\r\n     * @param x  x-coordinate, where the click occured.\r\n     * @param y  y-coordinate, where the click occured.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.equals(java.lang.Object)",
      "begin_line": 637,
      "end_line": 660,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 61)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.clone()",
      "begin_line": 670,
      "end_line": 687,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 73)",
        "(line 673,col 9)-(line 673,col 74)",
        "(line 674,col 9)-(line 677,col 9)",
        "(line 681,col 9)-(line 681,col 52)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 686,col 9)-(line 686,col 22)"
      ]
    }
  ]
}