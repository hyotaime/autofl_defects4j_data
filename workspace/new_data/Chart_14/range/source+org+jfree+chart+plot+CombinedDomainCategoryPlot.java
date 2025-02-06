{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/CombinedDomainCategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDomainCategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.CategoryPlot",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 87,
      "end_line": 660,
      "comment": "\r\n * A combined category plot where the domain axis is shared.\r\n "
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
        "subplotAreas"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.CombinedDomainCategoryPlot()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.CombinedDomainCategoryPlot(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param domainAxis  the shared domain axis (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                    permitted).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 122,col 29)",
        "(line 123,col 9)-(line 123,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getGap()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the space between subplots.\r\n     *\r\n     * @return The gap (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setGap(double)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\r\n     * Sets the amount of space between subplots and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.add(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Adds a subplot to the combined chart and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     * \r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.add(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 169,
      "end_line": 189,
      "comment": "\r\n     * Adds a subplot to the combined chart and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param weight  the weight (must be \u003e\u003d 1).\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 178,col 67)",
        "(line 179,col 9)-(line 179,col 36)",
        "(line 180,col 9)-(line 180,col 49)",
        "(line 181,col 9)-(line 181,col 40)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 183,col 9)-(line 183,col 35)",
        "(line 184,col 9)-(line 184,col 44)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.remove(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 199,
      "end_line": 224,
      "comment": "\r\n     * Removes a subplot from the combined chart.  Potentially, this removes \r\n     * some unique categories from the overall union of the datasets...so the \r\n     * domain axis is reconfigured, then a {@link PlotChangeEvent} is sent to \r\n     * all registered listeners.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 26)",
        "(line 204,col 9)-(line 204,col 40)",
        "(line 205,col 9)-(line 205,col 18)",
        "(line 206,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getSubplots()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\r\n     * Returns the list of subplots.  The returned list may be empty, but is\r\n     * never \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 233,col 6)-(line 238,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 250,
      "end_line": 263,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified \r\n     * in Java2D space).\r\n     * \r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 56)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 272,
      "end_line": 288,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 57)",
        "(line 276,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 298,
      "end_line": 314,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 57)",
        "(line 302,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 324,
      "end_line": 397,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 42)",
        "(line 328,col 9)-(line 328,col 55)",
        "(line 331,col 9)-(line 331,col 52)",
        "(line 332,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 358,col 68)",
        "(line 361,col 9)-(line 361,col 37)",
        "(line 362,col 9)-(line 362,col 47)",
        "(line 363,col 9)-(line 363,col 43)",
        "(line 364,col 9)-(line 364,col 43)",
        "(line 365,col 9)-(line 365,col 32)",
        "(line 366,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 412,
      "end_line": 465,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).  Will perform all the placement calculations for each of the\r\n     * sub-plots and then tell these to draw themselves.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axis labels) \r\n     *              should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects information about the drawing (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 424,col 9)-(line 424,col 45)",
        "(line 425,col 9)-(line 428,col 73)",
        "(line 432,col 9)-(line 432,col 48)",
        "(line 433,col 9)-(line 433,col 55)",
        "(line 434,col 9)-(line 434,col 56)",
        "(line 437,col 9)-(line 437,col 49)",
        "(line 440,col 9)-(line 440,col 44)",
        "(line 441,col 9)-(line 441,col 55)",
        "(line 442,col 9)-(line 442,col 71)",
        "(line 443,col 9)-(line 444,col 34)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 63)",
        "(line 451,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the \r\n     * plot) for the range axis of each subplot.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 53)",
        "(line 475,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 486,
      "end_line": 496,
      "comment": "\r\n     * Sets the orientation of the plot (and all subplots).\r\n     * \r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 42)",
        "(line 490,col 9)-(line 490,col 53)",
        "(line 491,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 512,
      "end_line": 515,
      "comment": "\r\n     * Returns a range representing the extent of the data values in this plot\r\n     * (obtained from the subplots) that will be rendered against the specified \r\n     * axis.  NOTE: This method is intended for internal JFreeChart use, and \r\n     * is public only so that code in the axis classes can call it.  Since,\r\n     * for this class, the domain axis is a {@link CategoryAxis} \r\n     * (not a \u003ccode\u003eValueAxis\u003c/code}) and subplots have independent range axes,\r\n     * the JFreeChart code will never call this method (although this is not \r\n     * checked/enforced).\r\n      *\r\n      * @param axis  the axis.\r\n      *\r\n      * @return The range.\r\n      ",
      "child_ranges": [
        "(line 514,col 10)-(line 514,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getLegendItems()",
      "begin_line": 522,
      "end_line": 536,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 60)",
        "(line 524,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getCategories()",
      "begin_line": 544,
      "end_line": 561,
      "comment": "\r\n     * Returns an unmodifiable list of the categories contained in all the \r\n     * subplots.\r\n     * \r\n     * @return The list.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 48)",
        "(line 546,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 572,
      "end_line": 576,
      "comment": "\r\n     * Overridden to return the categories in the subplots.\r\n     * \r\n     * @param axis  ignored.\r\n     * \r\n     * @return A list of the categories in the subplots.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 586,
      "end_line": 597,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.\r\n     *\r\n     * @param x  x-coordinate of the click.\r\n     * @param y  y-coordinate of the click.\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 50)",
        "(line 589,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.equals(java.lang.Object)",
      "begin_line": 616,
      "end_line": 637,
      "comment": " \r\n     * Tests the plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 75)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.clone()",
      "begin_line": 647,
      "end_line": 658,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 650,col 57)",
        "(line 651,col 9)-(line 651,col 74)",
        "(line 652,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 22)"
      ]
    }
  ]
}