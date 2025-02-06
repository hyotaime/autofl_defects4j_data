{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CombinedDomainCategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDomainCategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.CategoryPlot",
        "org.jfree.chart.plot.Zoomable",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable",
        "org.jfree.chart.event.PlotChangeListener"
      ],
      "begin_line": 83,
      "end_line": 636,
      "comment": "\r\n * A combined category plot where the domain axis is shared.\r\n "
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
        "subplotAreas"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Temporary storage for the subplot areas. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.CombinedDomainCategoryPlot()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.CombinedDomainCategoryPlot(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param domainAxis  the shared domain axis (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                    permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 50)",
        "(line 121,col 9)-(line 121,col 29)",
        "(line 122,col 9)-(line 122,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getGap()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the space between subplots.\r\n     *\r\n     * @return The gap (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setGap(double)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\r\n     * Sets the amount of space between subplots and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param gap  the gap between subplots (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.add(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Adds a subplot to the combined chart and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     * \r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.add(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 168,
      "end_line": 188,
      "comment": "\r\n     * Adds a subplot to the combined chart and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * The domain axis for the subplot will be set to \u003ccode\u003enull\u003c/code\u003e.  You\r\n     * must ensure that the subplot has a non-null range axis.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param weight  the weight (must be \u003e\u003d 1).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 32)",
        "(line 176,col 9)-(line 176,col 34)",
        "(line 177,col 9)-(line 177,col 67)",
        "(line 178,col 9)-(line 178,col 36)",
        "(line 179,col 9)-(line 179,col 49)",
        "(line 180,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.remove(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 198,
      "end_line": 223,
      "comment": "\r\n     * Removes a subplot from the combined chart.  Potentially, this removes \r\n     * some unique categories from the overall union of the datasets...so the \r\n     * domain axis is reconfigured, then a {@link PlotChangeEvent} is sent to \r\n     * all registered listeners.\r\n     *\r\n     * @param subplot  the subplot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 26)",
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 18)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getSubplots()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the list of subplots.\r\n     *\r\n     * @return An unmodifiable list of subplots .\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.findSubplot(org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 243,
      "end_line": 256,
      "comment": "\r\n     * Returns the subplot (if any) that contains the (x, y) point (specified \r\n     * in Java2D space).\r\n     * \r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A subplot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 251,col 56)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 265,
      "end_line": 281,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 57)",
        "(line 269,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 291,
      "end_line": 307,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param source  the source point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 57)",
        "(line 295,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 317,
      "end_line": 390,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * \r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 42)",
        "(line 321,col 9)-(line 321,col 55)",
        "(line 324,col 9)-(line 324,col 52)",
        "(line 325,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 351,col 68)",
        "(line 354,col 9)-(line 354,col 37)",
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 356,col 43)",
        "(line 357,col 9)-(line 357,col 43)",
        "(line 358,col 9)-(line 358,col 32)",
        "(line 359,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 389,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 405,
      "end_line": 458,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).  Will perform all the placement calculations for each of the\r\n     * sub-plots and then tell these to draw themselves.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axis labels) \r\n     *              should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects information about the drawing (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 414,col 9)",
        "(line 417,col 9)-(line 417,col 45)",
        "(line 418,col 9)-(line 421,col 73)",
        "(line 425,col 9)-(line 425,col 48)",
        "(line 426,col 9)-(line 426,col 55)",
        "(line 427,col 9)-(line 427,col 56)",
        "(line 430,col 9)-(line 430,col 49)",
        "(line 433,col 9)-(line 433,col 44)",
        "(line 434,col 9)-(line 434,col 55)",
        "(line 435,col 9)-(line 435,col 71)",
        "(line 436,col 9)-(line 437,col 34)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 63)",
        "(line 444,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 466,
      "end_line": 474,
      "comment": "\r\n     * Sets the size (width or height, depending on the orientation of the \r\n     * plot) for the range axis of each subplot.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 53)",
        "(line 469,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 481,
      "end_line": 491,
      "comment": "\r\n     * Sets the orientation of the plot (and all subplots).\r\n     * \r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 42)",
        "(line 485,col 9)-(line 485,col 53)",
        "(line 486,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getLegendItems()",
      "begin_line": 498,
      "end_line": 512,
      "comment": "\r\n     * Returns a collection of legend items for the plot.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 60)",
        "(line 500,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getCategories()",
      "begin_line": 520,
      "end_line": 537,
      "comment": "\r\n     * Returns an unmodifiable list of the categories contained in all the \r\n     * subplots.\r\n     * \r\n     * @return The list.\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 48)",
        "(line 522,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 548,
      "end_line": 552,
      "comment": "\r\n     * Overridden to return the categories in the subplots.\r\n     * \r\n     * @param axis  ignored.\r\n     * \r\n     * @return A list of the categories in the subplots.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 562,
      "end_line": 573,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.\r\n     *\r\n     * @param x  x-coordinate of the click.\r\n     * @param y  y-coordinate of the click.\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 50)",
        "(line 565,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\r\n     * Receives a {@link PlotChangeEvent} and responds by notifying all \r\n     * listeners.\r\n     * \r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.equals(java.lang.Object)",
      "begin_line": 592,
      "end_line": 613,
      "comment": " \r\n     * Tests the plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 75)",
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CombinedDomainCategoryPlot.clone()",
      "begin_line": 623,
      "end_line": 634,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 626,col 57)",
        "(line 627,col 9)-(line 627,col 74)",
        "(line 628,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 22)"
      ]
    }
  ]
}