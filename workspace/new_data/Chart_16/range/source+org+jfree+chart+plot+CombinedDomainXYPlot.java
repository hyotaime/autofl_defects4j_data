{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CombinedDomainXYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDomainXYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.XYPlot",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 118,
      "end_line": 706,
      "comment": "\r\n * An extension of {@link XYPlot} that contains multiple subplots that share a \r\n * common domain axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "totalWeight"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Total weight of all charts. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotAreas"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.CombinedDomainXYPlot()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.CombinedDomainXYPlot(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 153,
      "end_line": 164,
      "comment": "\r\n     * Creates a new combined plot that shares a domain axis among multiple \r\n     * subplots.\r\n     *\r\n     * @param domainAxis  the shared axis.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 160,col 10)",
        "(line 162,col 9)-(line 162,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getPlotType()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type of plot.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 181,
      "end_line": 190,
      "comment": "\r\n     * Sets the orientation for the plot (also changes the orientation for all \r\n     * the subplots to match).\r\n     * \r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 42)",
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 200,
      "end_line": 212,
      "comment": "\r\n     * Returns the range for the specified axis.  This is the combined range \r\n     * of all the subplots.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 28)",
        "(line 203,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getGap()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Returns the gap between subplots, measured in Java2D units.\r\n     *\r\n     * @return The gap (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setGap(double)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\r\n     * Sets the amount of space between subplots and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 23)",
        "(line 231,col 9)-(line 231,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.add(org.jfree.chart.plot.XYPlot)",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\r\n     * Adds a subplot (with a default \u0027weight\u0027 of 1) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.add(org.jfree.chart.plot.XYPlot, int)",
      "begin_line": 260,
      "end_line": 287,
      "comment": "\r\n     * Adds a subplot with the specified weight and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  The weight \r\n     * determines how much space is allocated to the subplot relative to all \r\n     * the other subplots.\r\n     * \u003cP\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param weight  the weight (must be \u003e\u003d 1).\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 270,col 32)",
        "(line 271,col 9)-(line 271,col 34)",
        "(line 272,col 9)-(line 272,col 74)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 40)",
        "(line 275,col 9)-(line 275,col 35)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 280,col 9)-(line 280,col 41)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.remove(org.jfree.chart.plot.XYPlot)",
      "begin_line": 295,
      "end_line": 320,
      "comment": "\r\n     * Removes a subplot from the combined chart and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 26)",
        "(line 300,col 9)-(line 300,col 40)",
        "(line 301,col 9)-(line 301,col 18)",
        "(line 302,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getSubplots()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the list of subplots.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 339,
      "end_line": 405,
      "comment": "\r\n     * Calculates the axis space required.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 42)",
        "(line 343,col 9)-(line 343,col 55)",
        "(line 346,col 9)-(line 346,col 52)",
        "(line 347,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 68)",
        "(line 369,col 9)-(line 369,col 37)",
        "(line 370,col 9)-(line 370,col 47)",
        "(line 371,col 9)-(line 371,col 43)",
        "(line 372,col 9)-(line 372,col 43)",
        "(line 373,col 9)-(line 373,col 32)",
        "(line 374,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 419,
      "end_line": 466,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e \r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 431,col 9)-(line 431,col 45)",
        "(line 432,col 9)-(line 432,col 26)",
        "(line 434,col 9)-(line 434,col 55)",
        "(line 435,col 9)-(line 435,col 56)",
        "(line 438,col 9)-(line 438,col 49)",
        "(line 441,col 9)-(line 441,col 41)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 443,col 65)",
        "(line 444,col 9)-(line 444,col 80)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 63)",
        "(line 451,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.getLegendItems()",
      "begin_line": 473,
      "end_line": 487,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 60)",
        "(line 475,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 496,
      "end_line": 512,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 51)",
        "(line 500,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 522,
      "end_line": 538,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 51)",
        "(line 526,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 549,
      "end_line": 562,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified \r\n     * in Java2D space).\r\n     * \r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 29)",
        "(line 557,col 9)-(line 557,col 56)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 573,
      "end_line": 585,
      "comment": "\r\n     * Sets the item renderer FOR ALL SUBPLOTS.  Registered listeners are \r\n     * notified that the plot has been modified.\r\n     * \u003cP\u003e\r\n     * Note: usually you will want to set the renderer independently for each \r\n     * subplot, which is NOT what this method does.\r\n     *\r\n     * @param renderer the new renderer.\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 36)",
        "(line 579,col 9)-(line 579,col 53)",
        "(line 580,col 9)-(line 583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 592,
      "end_line": 596,
      "comment": "\r\n     * Sets the fixed range axis space.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 44)",
        "(line 594,col 9)-(line 594,col 49)",
        "(line 595,col 9)-(line 595,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 604,
      "end_line": 610,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the \r\n     * plot) for the domain axis of each subplot.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 53)",
        "(line 606,col 9)-(line 609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 619,
      "end_line": 628,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  x-coordinate, where the click occured.\r\n     * @param y  y-coordinate, where the click occured.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 50)",
        "(line 621,col 9)-(line 627,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.equals(java.lang.Object)",
      "begin_line": 647,
      "end_line": 676,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 657,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 664,col 60)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 675,col 9)-(line 675,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainXYPlot.clone()",
      "begin_line": 686,
      "end_line": 704,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 75)",
        "(line 689,col 9)-(line 689,col 74)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 697,col 9)-(line 697,col 54)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 702,col 9)-(line 702,col 22)"
      ]
    }
  ]
}