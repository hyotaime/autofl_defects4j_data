{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/SymbolAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymbolAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis",
        "java.io.Serializable"
      ],
      "begin_line": 114,
      "end_line": 821,
      "comment": "\r\n * A standard linear value axis that replaces integer values with symbols.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRID_BAND_PAINT"
      ],
      "begin_line": 120,
      "end_line": 121,
      "comment": " The default grid band paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRID_BAND_ALTERNATE_PAINT"
      ],
      "begin_line": 128,
      "end_line": 129,
      "comment": "\r\n     * The default paint for alternate grid bands.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "symbols"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The list of symbols to display instead of the numeric values. "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandsVisible"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Flag that indicates whether or not grid bands are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandPaint"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The paint used to color the grid bands (if the bands are visible). "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandAlternatePaint"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " \r\n     * The paint used to fill the alternate grid bands.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SymbolAxis.SymbolAxis(java.lang.String, java.lang.String[])",
      "begin_line": 155,
      "end_line": 164,
      "comment": "\r\n     * Constructs a symbol axis, using default attribute values where \r\n     * necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param sv  the list of symbols to display instead of the numeric\r\n     *            values.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 21)",
        "(line 157,col 9)-(line 157,col 41)",
        "(line 158,col 9)-(line 158,col 37)",
        "(line 159,col 9)-(line 159,col 53)",
        "(line 160,col 9)-(line 160,col 72)",
        "(line 161,col 9)-(line 161,col 47)",
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.getSymbols()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "\r\n     * Returns an array of the symbols for the axis.\r\n     *\r\n     * @return The symbols.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 173,col 57)",
        "(line 174,col 9)-(line 174,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.isGridBandsVisible()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the grid bands are showing, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the grid bands are showing, and \r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *         \r\n     * @see #setGridBandsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.setGridBandsVisible(boolean)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "\r\n     * Sets the visibility of the grid bands and notifies registered\r\n     * listeners that the axis has been modified.\r\n     *\r\n     * @param flag  the new setting.\r\n     * \r\n     * @see #isGridBandsVisible()\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.getGridBandPaint()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the paint used to color the grid bands.\r\n     *\r\n     * @return The grid band paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setGridBandPaint(Paint)\r\n     * @see #isGridBandsVisible()\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.setGridBandPaint(java.awt.Paint)",
      "begin_line": 225,
      "end_line": 231,
      "comment": "\r\n     * Sets the grid band paint and sends an {@link AxisChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getGridBandPaint()\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 35)",
        "(line 230,col 9)-(line 230,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.getGridBandAlternatePaint()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the paint used for alternate grid bands.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setGridBandAlternatePaint(Paint)\r\n     * @see #getGridBandPaint()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.setGridBandAlternatePaint(java.awt.Paint)",
      "begin_line": 258,
      "end_line": 264,
      "comment": "\r\n     * Sets the paint used for alternate grid bands and sends a \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getGridBandAlternatePaint()\r\n     * @see #setGridBandPaint(Paint)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 44)",
        "(line 263,col 9)-(line 263,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\r\n     * This operation is not supported by this axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot and axes should be drawn.\r\n     * @param edge  the edge along which the axis is drawn.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 294,
      "end_line": 310,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the plot and axes should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the data should be drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 47)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.drawGridBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, java.util.List)",
      "begin_line": 324,
      "end_line": 340,
      "comment": "\r\n     * Draws the grid bands.  Alternate bands are colored using \r\n     * \u003cCODE\u003egridBandPaint\u003cCODE\u003e (\u003cCODE\u003eDEFAULT_GRID_BAND_PAINT\u003c/CODE\u003e by \r\n     * default).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the area within which the chart should be drawn.\r\n     * @param dataArea  the area within which the plot should be drawn (a \r\n     *                  subset of the drawArea).\r\n     * @param edge  the axis location.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 39)",
        "(line 331,col 9)-(line 331,col 26)",
        "(line 332,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.drawGridBandsHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, boolean, java.util.List)",
      "begin_line": 356,
      "end_line": 397,
      "comment": "\r\n     * Draws the grid bands for the axis when it is at the top or bottom of \r\n     * the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the area within which the chart should be drawn.\r\n     * @param dataArea  the area within which the plot should be drawn\r\n     *                  (a subset of the drawArea).\r\n     * @param firstGridBandIsDark  True: the first grid band takes the\r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     *                             False: the second grid band takes the \r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 60)",
        "(line 363,col 9)-(line 363,col 36)",
        "(line 364,col 9)-(line 364,col 24)",
        "(line 367,col 9)-(line 367,col 34)",
        "(line 368,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 45)",
        "(line 377,col 9)-(line 377,col 23)",
        "(line 378,col 9)-(line 378,col 25)",
        "(line 379,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.drawGridBandsVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, boolean, java.util.List)",
      "begin_line": 413,
      "end_line": 454,
      "comment": "\r\n     * Draws the grid bands for the axis when it is at the top or bottom of \r\n     * the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the area within which the chart should be drawn.\r\n     * @param plotArea  the area within which the plot should be drawn (a\r\n     *                  subset of the drawArea).\r\n     * @param firstGridBandIsDark  True: the first grid band takes the\r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     *                             False: the second grid band takes the \r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     * @param ticks  a list of ticks.\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 60)",
        "(line 420,col 9)-(line 420,col 36)",
        "(line 421,col 9)-(line 421,col 24)",
        "(line 424,col 9)-(line 424,col 34)",
        "(line 425,col 9)-(line 425,col 60)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 45)",
        "(line 434,col 9)-(line 434,col 23)",
        "(line 435,col 9)-(line 435,col 25)",
        "(line 436,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.autoAdjustRange()",
      "begin_line": 459,
      "end_line": 529,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 30)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 542,
      "end_line": 554,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area in which the data should be drawn.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 26)",
        "(line 547,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 566,
      "end_line": 648,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data should be drawn.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return The ticks.\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 47)",
        "(line 572,col 9)-(line 572,col 48)",
        "(line 573,col 9)-(line 573,col 34)",
        "(line 575,col 9)-(line 575,col 46)",
        "(line 576,col 9)-(line 576,col 48)",
        "(line 577,col 9)-(line 577,col 67)",
        "(line 579,col 9)-(line 579,col 47)",
        "(line 580,col 9)-(line 580,col 50)",
        "(line 582,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 660,
      "end_line": 742,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return The ticks.\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 47)",
        "(line 666,col 9)-(line 666,col 48)",
        "(line 667,col 9)-(line 667,col 34)",
        "(line 669,col 9)-(line 669,col 46)",
        "(line 670,col 9)-(line 670,col 48)",
        "(line 671,col 9)-(line 671,col 67)",
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 674,col 50)",
        "(line 676,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.valueToString(double)",
      "begin_line": 751,
      "end_line": 760,
      "comment": "\r\n     * Converts a value to a string, using the list of symbols.\r\n     *\r\n     * @param value  value to convert.\r\n     *\r\n     * @return The symbol.\r\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 27)",
        "(line 753,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.equals(java.lang.Object)",
      "begin_line": 769,
      "end_line": 791,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 43)",
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 800,
      "end_line": 804,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 36)",
        "(line 802,col 9)-(line 802,col 63)",
        "(line 803,col 9)-(line 803,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 814,
      "end_line": 819,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 35)",
        "(line 817,col 9)-(line 817,col 63)",
        "(line 818,col 9)-(line 818,col 72)"
      ]
    }
  ]
}