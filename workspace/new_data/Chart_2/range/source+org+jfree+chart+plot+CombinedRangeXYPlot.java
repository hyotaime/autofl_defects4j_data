{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/CombinedRangeXYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedRangeXYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.XYPlot",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 126,
      "end_line": 695,
      "comment": "\r\n * An extension of {@link XYPlot} that contains multiple subplots that share a\r\n * common range axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Storage for the subplot references. "
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
      "comment": "\r\n     * Adds a subplot, with a default \u0027weight\u0027 of 1.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param subplot  the subplot.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.add(org.jfree.chart.plot.XYPlot, int)",
      "begin_line": 214,
      "end_line": 232,
      "comment": "\r\n     * Adds a subplot with a particular weight (greater than or equal to one).\r\n     * The weight determines how much space is allocated to the subplot\r\n     * relative to all the other subplots.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param subplot  the subplot.\r\n     * @param weight  the weight (must be 1 or greater).\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 224,col 9)-(line 224,col 34)",
        "(line 225,col 9)-(line 225,col 67)",
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 35)",
        "(line 229,col 9)-(line 229,col 29)",
        "(line 230,col 9)-(line 230,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.remove(org.jfree.chart.plot.XYPlot)",
      "begin_line": 239,
      "end_line": 259,
      "comment": "\r\n     * Removes a subplot from the combined chart.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 18)",
        "(line 246,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getSubplots()",
      "begin_line": 267,
      "end_line": 274,
      "comment": "\r\n     * Returns the list of subplots.  The returned list may be empty, but is\r\n     * never \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 284,
      "end_line": 359,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 55)",
        "(line 291,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 68)",
        "(line 315,col 9)-(line 315,col 37)",
        "(line 316,col 9)-(line 316,col 28)",
        "(line 317,col 9)-(line 320,col 9)",
        "(line 324,col 9)-(line 324,col 47)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 326,col 43)",
        "(line 327,col 9)-(line 327,col 32)",
        "(line 328,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 358,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 373,
      "end_line": 422,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 385,col 9)-(line 385,col 45)",
        "(line 386,col 9)-(line 386,col 26)",
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 56)",
        "(line 393,col 9)-(line 393,col 50)",
        "(line 396,col 9)-(line 396,col 40)",
        "(line 397,col 9)-(line 397,col 48)",
        "(line 398,col 9)-(line 398,col 65)",
        "(line 399,col 9)-(line 399,col 80)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 63)",
        "(line 407,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getLegendItems()",
      "begin_line": 429,
      "end_line": 444,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 60)",
        "(line 431,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 466,
      "end_line": 482,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param useAnchor  zoom about the anchor point?\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 51)",
        "(line 470,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 492,
      "end_line": 509,
      "comment": "\r\n     * Zooms in on the domain axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 51)",
        "(line 496,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 520,
      "end_line": 533,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified\r\n     * in Java2D space).\r\n     *\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 29)",
        "(line 528,col 9)-(line 528,col 56)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 544,
      "end_line": 556,
      "comment": "\r\n     * Sets the item renderer FOR ALL SUBPLOTS.  Registered listeners are\r\n     * notified that the plot has been modified.\r\n     * \u003cP\u003e\r\n     * Note: usually you will want to set the renderer independently for each\r\n     * subplot, which is NOT what this method does.\r\n     *\r\n     * @param renderer the new renderer.\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 36)",
        "(line 550,col 9)-(line 550,col 53)",
        "(line 551,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 563,
      "end_line": 573,
      "comment": "\r\n     * Sets the orientation for the plot (and all its subplots).\r\n     *\r\n     * @param orientation  the orientation.\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 42)",
        "(line 567,col 9)-(line 567,col 53)",
        "(line 568,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 588,
      "end_line": 598,
      "comment": "\r\n     * Returns a range representing the extent of the data values in this plot\r\n     * (obtained from the subplots) that will be rendered against the specified\r\n     * axis.  NOTE: This method is intended for internal JFreeChart use, and\r\n     * is public only so that code in the axis classes can call it.  Since\r\n     * only the range axis is shared between subplots, the JFreeChart code\r\n     * will only call this method for the range values (although this is not\r\n     * checked/enforced).\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 28)",
        "(line 590,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 606,
      "end_line": 612,
      "comment": "\r\n     * Sets the space (width or height, depending on the orientation of the\r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 53)",
        "(line 608,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 621,
      "end_line": 632,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values...\r\n     *\r\n     * @param x  x-coordinate, where the click occured.\r\n     * @param y  y-coordinate, where the click occured.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 50)",
        "(line 624,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all\r\n     * listeners.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.equals(java.lang.Object)",
      "begin_line": 651,
      "end_line": 666,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 61)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.clone()",
      "begin_line": 676,
      "end_line": 693,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 73)",
        "(line 679,col 9)-(line 679,col 74)",
        "(line 680,col 9)-(line 683,col 9)",
        "(line 687,col 9)-(line 687,col 52)",
        "(line 688,col 9)-(line 690,col 9)",
        "(line 692,col 9)-(line 692,col 22)"
      ]
    }
  ]
}