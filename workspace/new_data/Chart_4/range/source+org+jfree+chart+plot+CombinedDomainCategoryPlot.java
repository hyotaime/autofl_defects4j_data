{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/CombinedDomainCategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDomainCategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.CategoryPlot",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 91,
      "end_line": 674,
      "comment": "\r\n * A combined category plot where the domain axis is shared.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subplots"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Storage for the subplot references. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The gap between subplots. "
    },
    {
      "type": "field",
      "varNames": [
        "subplotAreas"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.CombinedDomainCategoryPlot()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.CombinedDomainCategoryPlot(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param domainAxis  the shared domain axis (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 50)",
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
      "comment": "\r\n     * Sets the amount of space between subplots and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
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
      "comment": "\r\n     * Adds a subplot to the combined chart and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.add(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 169,
      "end_line": 188,
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
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.remove(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 198,
      "end_line": 221,
      "comment": "\r\n     * Removes a subplot from the combined chart.  Potentially, this removes\r\n     * some unique categories from the overall union of the datasets...so the\r\n     * domain axis is reconfigured, then a {@link PlotChangeEvent} is sent to\r\n     * all registered listeners.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 26)",
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 18)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getSubplots()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "\r\n     * Returns the list of subplots.  The returned list may be empty, but is\r\n     * never \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return An unmodifiable list of subplots.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 247,
      "end_line": 260,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified\r\n     * in Java2D space).\r\n     *\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 56)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 282,
      "end_line": 298,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param useAnchor  zoom about the anchor point?\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 57)",
        "(line 286,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 308,
      "end_line": 324,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 57)",
        "(line 312,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 334,
      "end_line": 412,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 42)",
        "(line 338,col 9)-(line 338,col 55)",
        "(line 341,col 9)-(line 341,col 52)",
        "(line 342,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 68)",
        "(line 371,col 9)-(line 371,col 37)",
        "(line 372,col 9)-(line 372,col 28)",
        "(line 373,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 47)",
        "(line 378,col 9)-(line 378,col 43)",
        "(line 379,col 9)-(line 379,col 43)",
        "(line 380,col 9)-(line 380,col 32)",
        "(line 381,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 427,
      "end_line": 485,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).  Will perform all the placement calculations for each of the\r\n     * sub-plots and then tell these to draw themselves.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axis labels)\r\n     *              should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects information about the drawing (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 439,col 9)-(line 439,col 45)",
        "(line 440,col 9)-(line 443,col 73)",
        "(line 447,col 9)-(line 447,col 48)",
        "(line 448,col 9)-(line 448,col 55)",
        "(line 449,col 9)-(line 449,col 56)",
        "(line 452,col 9)-(line 452,col 49)",
        "(line 455,col 9)-(line 455,col 44)",
        "(line 456,col 9)-(line 456,col 55)",
        "(line 457,col 9)-(line 457,col 71)",
        "(line 458,col 9)-(line 459,col 34)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 63)",
        "(line 466,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 493,
      "end_line": 499,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the\r\n     * plot) for the range axis of each subplot.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 53)",
        "(line 495,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 506,
      "end_line": 516,
      "comment": "\r\n     * Sets the orientation of the plot (and all subplots).\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 42)",
        "(line 510,col 9)-(line 510,col 53)",
        "(line 511,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 532,
      "end_line": 535,
      "comment": "\r\n     * Returns a range representing the extent of the data values in this plot\r\n     * (obtained from the subplots) that will be rendered against the specified\r\n     * axis.  NOTE: This method is intended for internal JFreeChart use, and\r\n     * is public only so that code in the axis classes can call it.  Since,\r\n     * for this class, the domain axis is a {@link CategoryAxis}\r\n     * (not a \u003ccode\u003eValueAxis\u003c/code}) and subplots have independent range axes,\r\n     * the JFreeChart code will never call this method (although this is not\r\n     * checked/enforced).\r\n      *\r\n      * @param axis  the axis.\r\n      *\r\n      * @return The range.\r\n      ",
      "child_ranges": [
        "(line 534,col 10)-(line 534,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getLegendItems()",
      "begin_line": 542,
      "end_line": 556,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 60)",
        "(line 544,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getCategories()",
      "begin_line": 564,
      "end_line": 581,
      "comment": "\r\n     * Returns an unmodifiable list of the categories contained in all the\r\n     * subplots.\r\n     *\r\n     * @return The list.\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 48)",
        "(line 566,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 592,
      "end_line": 596,
      "comment": "\r\n     * Overridden to return the categories in the subplots.\r\n     *\r\n     * @param axis  ignored.\r\n     *\r\n     * @return A list of the categories in the subplots.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 606,
      "end_line": 617,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.\r\n     *\r\n     * @param x  x-coordinate of the click.\r\n     * @param y  y-coordinate of the click.\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 50)",
        "(line 609,col 9)-(line 615,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all\r\n     * listeners.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.equals(java.lang.Object)",
      "begin_line": 636,
      "end_line": 651,
      "comment": "\r\n     * Tests the plot for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 75)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.clone()",
      "begin_line": 661,
      "end_line": 672,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 664,col 57)",
        "(line 665,col 9)-(line 665,col 74)",
        "(line 666,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 22)"
      ]
    }
  ]
}