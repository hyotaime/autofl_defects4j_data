{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/SymbolAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymbolAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis",
        "java.io.Serializable"
      ],
      "begin_line": 115,
      "end_line": 822,
      "comment": "\r\n * A standard linear value axis that replaces integer values with symbols.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRID_BAND_PAINT"
      ],
      "begin_line": 121,
      "end_line": 122,
      "comment": " The default grid band paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRID_BAND_ALTERNATE_PAINT"
      ],
      "begin_line": 129,
      "end_line": 130,
      "comment": "\r\n     * The default paint for alternate grid bands.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "symbols"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The list of symbols to display instead of the numeric values. "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandsVisible"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Flag that indicates whether or not grid bands are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandPaint"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The paint used to color the grid bands (if the bands are visible). "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandAlternatePaint"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\r\n     * The paint used to fill the alternate grid bands.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SymbolAxis.SymbolAxis(java.lang.String, java.lang.String[])",
      "begin_line": 156,
      "end_line": 165,
      "comment": "\r\n     * Constructs a symbol axis, using default attribute values where\r\n     * necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param sv  the list of symbols to display instead of the numeric\r\n     *            values.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 21)",
        "(line 158,col 9)-(line 158,col 41)",
        "(line 159,col 9)-(line 159,col 37)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 72)",
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 163,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.getSymbols()",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\r\n     * Returns an array of the symbols for the axis.\r\n     *\r\n     * @return The symbols.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.isGridBandsVisible()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the grid bands are showing, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the grid bands are showing, and\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @see #setGridBandsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.setGridBandsVisible(boolean)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\r\n     * Sets the visibility of the grid bands and notifies registered\r\n     * listeners that the axis has been modified.\r\n     *\r\n     * @param flag  the new setting.\r\n     *\r\n     * @see #isGridBandsVisible()\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.getGridBandPaint()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the paint used to color the grid bands.\r\n     *\r\n     * @return The grid band paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setGridBandPaint(Paint)\r\n     * @see #isGridBandsVisible()\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.setGridBandPaint(java.awt.Paint)",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\r\n     * Sets the grid band paint and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getGridBandPaint()\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.getGridBandAlternatePaint()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\r\n     * Returns the paint used for alternate grid bands.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setGridBandAlternatePaint(Paint)\r\n     * @see #getGridBandPaint()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.setGridBandAlternatePaint(java.awt.Paint)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\r\n     * Sets the paint used for alternate grid bands and sends a\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getGridBandAlternatePaint()\r\n     * @see #setGridBandPaint(Paint)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 44)",
        "(line 264,col 9)-(line 264,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "\r\n     * This operation is not supported by this axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot and axes should be drawn.\r\n     * @param edge  the edge along which the axis is drawn.\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 295,
      "end_line": 311,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the plot and axes should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the data should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 47)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.drawGridBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, java.util.List)",
      "begin_line": 325,
      "end_line": 341,
      "comment": "\r\n     * Draws the grid bands.  Alternate bands are colored using\r\n     * \u003cCODE\u003egridBandPaint\u003cCODE\u003e (\u003cCODE\u003eDEFAULT_GRID_BAND_PAINT\u003c/CODE\u003e by\r\n     * default).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the area within which the chart should be drawn.\r\n     * @param dataArea  the area within which the plot should be drawn (a\r\n     *                  subset of the drawArea).\r\n     * @param edge  the axis location.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 39)",
        "(line 332,col 9)-(line 332,col 26)",
        "(line 333,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.drawGridBandsHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, boolean, java.util.List)",
      "begin_line": 357,
      "end_line": 398,
      "comment": "\r\n     * Draws the grid bands for the axis when it is at the top or bottom of\r\n     * the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the area within which the chart should be drawn.\r\n     * @param dataArea  the area within which the plot should be drawn\r\n     *                  (a subset of the drawArea).\r\n     * @param firstGridBandIsDark  True: the first grid band takes the\r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     *                             False: the second grid band takes the\r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 60)",
        "(line 364,col 9)-(line 364,col 36)",
        "(line 365,col 9)-(line 365,col 24)",
        "(line 368,col 9)-(line 368,col 34)",
        "(line 369,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 377,col 45)",
        "(line 378,col 9)-(line 378,col 23)",
        "(line 379,col 9)-(line 379,col 25)",
        "(line 380,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.drawGridBandsVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, boolean, java.util.List)",
      "begin_line": 414,
      "end_line": 455,
      "comment": "\r\n     * Draws the grid bands for the axis when it is at the top or bottom of\r\n     * the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the area within which the chart should be drawn.\r\n     * @param plotArea  the area within which the plot should be drawn (a\r\n     *                  subset of the drawArea).\r\n     * @param firstGridBandIsDark  True: the first grid band takes the\r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     *                             False: the second grid band takes the\r\n     *                             color of \u003cCODE\u003egridBandPaint\u003cCODE\u003e.\r\n     * @param ticks  a list of ticks.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 60)",
        "(line 421,col 9)-(line 421,col 36)",
        "(line 422,col 9)-(line 422,col 24)",
        "(line 425,col 9)-(line 425,col 34)",
        "(line 426,col 9)-(line 426,col 60)",
        "(line 427,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 45)",
        "(line 435,col 9)-(line 435,col 23)",
        "(line 436,col 9)-(line 436,col 25)",
        "(line 437,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.autoAdjustRange()",
      "begin_line": 460,
      "end_line": 530,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 30)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 543,
      "end_line": 555,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area in which the data should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 26)",
        "(line 548,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 567,
      "end_line": 649,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return The ticks.\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 47)",
        "(line 573,col 9)-(line 573,col 48)",
        "(line 574,col 9)-(line 574,col 34)",
        "(line 576,col 9)-(line 576,col 46)",
        "(line 577,col 9)-(line 577,col 48)",
        "(line 578,col 9)-(line 578,col 67)",
        "(line 580,col 9)-(line 580,col 47)",
        "(line 581,col 9)-(line 581,col 50)",
        "(line 583,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 661,
      "end_line": 743,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return The ticks.\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 47)",
        "(line 667,col 9)-(line 667,col 48)",
        "(line 668,col 9)-(line 668,col 34)",
        "(line 670,col 9)-(line 670,col 46)",
        "(line 671,col 9)-(line 671,col 48)",
        "(line 672,col 9)-(line 672,col 67)",
        "(line 674,col 9)-(line 674,col 47)",
        "(line 675,col 9)-(line 675,col 50)",
        "(line 677,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.valueToString(double)",
      "begin_line": 752,
      "end_line": 761,
      "comment": "\r\n     * Converts a value to a string, using the list of symbols.\r\n     *\r\n     * @param value  value to convert.\r\n     *\r\n     * @return The symbol.\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 27)",
        "(line 754,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.equals(java.lang.Object)",
      "begin_line": 770,
      "end_line": 792,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 43)",
        "(line 778,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 801,
      "end_line": 805,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 803,col 63)",
        "(line 804,col 9)-(line 804,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SymbolAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 815,
      "end_line": 820,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 35)",
        "(line 818,col 9)-(line 818,col 63)",
        "(line 819,col 9)-(line 819,col 72)"
      ]
    }
  ]
}