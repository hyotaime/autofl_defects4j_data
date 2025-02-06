{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CombinedRangeXYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedRangeXYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.XYPlot",
        "org.jfree.chart.plot.Zoomable",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 122,
      "end_line": 682,
      "comment": "\r\n * An extension of {@link XYPlot} that contains multiple subplots that share a \r\n * common range axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "totalWeight"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Total weight of all charts. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotAreas"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.CombinedRangeXYPlot()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.CombinedRangeXYPlot(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 155,
      "end_line": 164,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param rangeAxis  the shared axis.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 160,col 20)",
        "(line 162,col 9)-(line 162,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getPlotType()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type of plot.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getGap()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the space between subplots.\r\n     *\r\n     * @return The gap\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setGap(double)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Sets the amount of space between subplots.\r\n     *\r\n     * @param gap  the gap between subplots\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.add(org.jfree.chart.plot.XYPlot)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Adds a subplot, with a default \u0027weight\u0027 of 1.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.add(org.jfree.chart.plot.XYPlot, int)",
      "begin_line": 216,
      "end_line": 237,
      "comment": "\r\n     * Adds a subplot with a particular weight (greater than or equal to one).  \r\n     * The weight determines how much space is allocated to the subplot \r\n     * relative to all the other subplots.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * You must ensure that the subplot has a non-null domain axis.  The range\r\n     * axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  \r\n     *\r\n     * @param subplot  the subplot.\r\n     * @param weight  the weight (must be 1 or greater).\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 225,col 32)",
        "(line 226,col 9)-(line 226,col 34)",
        "(line 227,col 9)-(line 227,col 67)",
        "(line 228,col 9)-(line 228,col 35)",
        "(line 229,col 9)-(line 229,col 40)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 235,col 9)-(line 235,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.remove(org.jfree.chart.plot.XYPlot)",
      "begin_line": 244,
      "end_line": 265,
      "comment": "\r\n     * Removes a subplot from the combined chart.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 26)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 18)",
        "(line 251,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getSubplots()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\r\n     * Returns a list of the subplots.\r\n     *\r\n     * @return The list (unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 284,
      "end_line": 354,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 55)",
        "(line 291,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 68)",
        "(line 315,col 9)-(line 315,col 37)",
        "(line 319,col 9)-(line 319,col 47)",
        "(line 320,col 9)-(line 320,col 43)",
        "(line 321,col 9)-(line 321,col 43)",
        "(line 322,col 9)-(line 322,col 32)",
        "(line 323,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 368,
      "end_line": 417,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e \r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 380,col 9)-(line 380,col 45)",
        "(line 381,col 9)-(line 381,col 26)",
        "(line 383,col 9)-(line 383,col 55)",
        "(line 384,col 9)-(line 384,col 56)",
        "(line 388,col 9)-(line 388,col 50)",
        "(line 391,col 9)-(line 391,col 40)",
        "(line 392,col 9)-(line 392,col 48)",
        "(line 393,col 9)-(line 393,col 65)",
        "(line 394,col 9)-(line 394,col 80)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 63)",
        "(line 402,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getLegendItems()",
      "begin_line": 424,
      "end_line": 439,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 60)",
        "(line 426,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 448,
      "end_line": 464,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 51)",
        "(line 452,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 474,
      "end_line": 491,
      "comment": "\r\n     * Zooms in on the domain axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 51)",
        "(line 478,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 502,
      "end_line": 515,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified \r\n     * in Java2D space).\r\n     * \r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 29)",
        "(line 510,col 9)-(line 510,col 56)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 526,
      "end_line": 538,
      "comment": "\r\n     * Sets the item renderer FOR ALL SUBPLOTS.  Registered listeners are \r\n     * notified that the plot has been modified.\r\n     * \u003cP\u003e\r\n     * Note: usually you will want to set the renderer independently for each \r\n     * subplot, which is NOT what this method does.\r\n     *\r\n     * @param renderer the new renderer.\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 36)",
        "(line 532,col 9)-(line 532,col 53)",
        "(line 533,col 9)-(line 536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 545,
      "end_line": 555,
      "comment": "\r\n     * Sets the orientation for the plot (and all its subplots).\r\n     * \r\n     * @param orientation  the orientation.\r\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 42)",
        "(line 549,col 9)-(line 549,col 53)",
        "(line 550,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 565,
      "end_line": 577,
      "comment": "\r\n     * Returns the range for the axis.  This is the combined range of all the \r\n     * subplots.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 28)",
        "(line 568,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 585,
      "end_line": 591,
      "comment": "\r\n     * Sets the space (width or height, depending on the orientation of the \r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 53)",
        "(line 587,col 9)-(line 590,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 600,
      "end_line": 611,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values...\r\n     *\r\n     * @param x  x-coordinate, where the click occured.\r\n     * @param y  y-coordinate, where the click occured.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 50)",
        "(line 603,col 9)-(line 609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.equals(java.lang.Object)",
      "begin_line": 630,
      "end_line": 653,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 61)",
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedRangeXYPlot.clone()",
      "begin_line": 663,
      "end_line": 680,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 73)",
        "(line 666,col 9)-(line 666,col 74)",
        "(line 667,col 9)-(line 670,col 9)",
        "(line 674,col 9)-(line 674,col 52)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 679,col 9)-(line 679,col 22)"
      ]
    }
  ]
}