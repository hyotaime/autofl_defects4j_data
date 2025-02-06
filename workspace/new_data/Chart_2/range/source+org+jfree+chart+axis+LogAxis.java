{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/LogAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueAxis"
      ],
      "begin_line": 93,
      "end_line": 932,
      "comment": "\n * A numerical axis that uses a logarithmic scale.  The class is an\n * alternative to the {@link LogarithmicAxis} class.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The logarithm base. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLog"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The logarithm of the base value - cached for performance. "
    },
    {
      "type": "field",
      "varNames": [
        "smallestValue"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "  The smallest value permitted on the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The current tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatOverride"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The override number format. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogAxis.LogAxis()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Creates a new \u003ccode\u003eLogAxis\u003c/code\u003e with no label.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogAxis.LogAxis(java.lang.String)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * Creates a new \u003ccode\u003eLogAxis\u003c/code\u003e with the given label.\n     *\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 62)",
        "(line 124,col 9)-(line 124,col 50)",
        "(line 125,col 9)-(line 125,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getBase()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns the base for the logarithm calculation.\n     *\n     * @return The base for the logarithm calculation.\n     *\n     * @see #setBase(double)\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setBase(double)",
      "begin_line": 147,
      "end_line": 154,
      "comment": "\n     * Sets the base for the logarithm calculation and sends an\n     * {@link AxisChangeEvent} to all registered listeners.\n     *\n     * @param base  the base value (must be \u003e 1.0).\n     *\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 25)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getSmallestValue()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns the smallest value represented by the axis.\n     *\n     * @return The smallest value represented by the axis.\n     *\n     * @see #setSmallestValue(double)\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setSmallestValue(double)",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n     * Sets the smallest value represented by the axis and sends an\n     * {@link AxisChangeEvent} to all registered listeners.\n     *\n     * @param value  the value.\n     *\n     * @see #getSmallestValue()\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 180,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getTickUnit()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the current tick unit.\n     *\n     * @return The current tick unit.\n     *\n     * @see #setTickUnit(NumberTickUnit)\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit)",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Sets the tick unit for the axis and sends an {@link AxisChangeEvent} to\n     * all registered listeners.  A side effect of calling this method is that\n     * the \"auto-select\" feature for tick units is switched off (you can\n     * restore it using the {@link ValueAxis#setAutoTickUnitSelection(boolean)}\n     * method).\n     *\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getTickUnit()\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit, boolean, boolean)",
      "begin_line": 223,
      "end_line": 237,
      "comment": "\n     * Sets the tick unit for the axis and, if requested, sends an\n     * {@link AxisChangeEvent} to all registered listeners.  In addition, an\n     * option is provided to turn off the \"auto-select\" feature for tick units\n     * (you can restore it using the\n     * {@link ValueAxis#setAutoTickUnitSelection(boolean)} method).\n     *\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param notify  notify listeners?\n     * @param turnOffAutoSelect  turn off the auto-tick selection?\n     *\n     * @see #getTickUnit()\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 29)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getNumberFormatOverride()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns the number format override.  If this is non-null, then it will\n     * be used to format the numbers on the axis.\n     *\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setNumberFormatOverride(NumberFormat)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setNumberFormatOverride(java.text.NumberFormat)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * Sets the number format override.  If this is non-null, then it will be\n     * used to format the numbers on the axis.\n     *\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @see #getNumberFormatOverride()\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 261,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.calculateLog(double)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Calculates the log of the given value, using the current base.\n     *\n     * @param value  the value.\n     *\n     * @return The log of the given value.\n     *\n     * @see #calculateValue(double)\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.calculateValue(double)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Calculates the value from a given log.\n     *\n     * @param log  the log value (must be \u003e 0.0).\n     *\n     * @return The value with the given log.\n     *\n     * @see #calculateLog(double)\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 302,
      "end_line": 329,
      "comment": "\n     * Converts a Java2D coordinate to an axis value, assuming that the\n     * axis covers the specified \u003ccode\u003eedge\u003c/code\u003e of the \u003ccode\u003earea\u003c/code\u003e.\n     *\n     * @param java2DValue  the Java2D coordinate.\n     * @param area  the area.\n     * @param edge  the edge that the axis belongs to.\n     *\n     * @return A value along the axis scale.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 33)",
        "(line 306,col 9)-(line 306,col 61)",
        "(line 307,col 9)-(line 307,col 61)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 310,col 9)-(line 310,col 25)",
        "(line 311,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 25)",
        "(line 320,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 342,
      "end_line": 368,
      "comment": "\n     * Converts a value on the axis scale to a Java2D coordinate relative to\n     * the given \u003ccode\u003earea\u003c/code\u003e, based on the axis running along the\n     * specified \u003ccode\u003eedge\u003c/code\u003e.\n     *\n     * @param value  the data value.\n     * @param area  the area.\n     * @param edge  the edge.\n     *\n     * @return The Java2D coordinate corresponding to \u003ccode\u003evalue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 33)",
        "(line 346,col 9)-(line 346,col 61)",
        "(line 347,col 9)-(line 347,col 61)",
        "(line 348,col 9)-(line 348,col 36)",
        "(line 350,col 9)-(line 350,col 25)",
        "(line 351,col 9)-(line 351,col 25)",
        "(line 352,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.configure()",
      "begin_line": 374,
      "end_line": 378,
      "comment": "\n     * Configures the axis.  This method is typically called when an axis\n     * is assigned to a new plot.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.autoAdjustRange()",
      "begin_line": 384,
      "end_line": 429,
      "comment": "\n     * Adjusts the axis range to match the data range that the axis is\n     * required to display.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 30)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 445,
      "end_line": 465,
      "comment": "\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\n     * printer).\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param cursor  the cursor location (determines where to draw the axis).\n     * @param plotArea  the area within which the axes and plot should be drawn.\n     * @param dataArea  the area within which the data should be drawn.\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plotState  collects information about the plot\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 31)",
        "(line 451,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 460,col 27)",
        "(line 461,col 9)-(line 462,col 27)",
        "(line 463,col 9)-(line 463,col 69)",
        "(line 464,col 9)-(line 464,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 479,
      "end_line": 491,
      "comment": "\n     * Calculates the positions of the tick labels for the axis, storing the\n     * results in the tick label list (ready for drawing).\n     *\n     * @param g2  the graphics device.\n     * @param state  the axis state.\n     * @param dataArea  the area in which the plot should be drawn.\n     * @param edge  the location of the axis.\n     *\n     * @return A list of ticks.\n     *\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 48)",
        "(line 483,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 502,
      "end_line": 543,
      "comment": "\n     * Returns a list of ticks for an axis at the top or bottom of the chart.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the data area.\n     * @param edge  the edge.\n     *\n     * @return A list of ticks.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 33)",
        "(line 506,col 9)-(line 506,col 37)",
        "(line 507,col 9)-(line 507,col 48)",
        "(line 508,col 9)-(line 508,col 34)",
        "(line 509,col 9)-(line 509,col 30)",
        "(line 510,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 63)",
        "(line 521,col 9)-(line 521,col 65)",
        "(line 522,col 9)-(line 522,col 62)",
        "(line 523,col 9)-(line 523,col 31)",
        "(line 524,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 554,
      "end_line": 595,
      "comment": "\n     * Returns a list of ticks for an axis at the left or right of the chart.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the data area.\n     * @param edge  the edge.\n     *\n     * @return A list of ticks.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 33)",
        "(line 558,col 9)-(line 558,col 37)",
        "(line 559,col 9)-(line 559,col 48)",
        "(line 560,col 9)-(line 560,col 34)",
        "(line 561,col 9)-(line 561,col 30)",
        "(line 562,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 63)",
        "(line 573,col 9)-(line 573,col 65)",
        "(line 574,col 9)-(line 574,col 62)",
        "(line 575,col 9)-(line 575,col 31)",
        "(line 576,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 608,
      "end_line": 618,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area defined by the axes.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 631,
      "end_line": 658,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area defined by the axes.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 635,col 31)",
        "(line 638,col 9)-(line 638,col 58)",
        "(line 639,col 9)-(line 639,col 69)",
        "(line 640,col 9)-(line 641,col 22)",
        "(line 644,col 9)-(line 644,col 71)",
        "(line 646,col 9)-(line 647,col 52)",
        "(line 648,col 9)-(line 649,col 22)",
        "(line 651,col 9)-(line 651,col 66)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 656,col 9)-(line 656,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.exponentLengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 672,
      "end_line": 677,
      "comment": "\n     * Converts a length in data coordinates into the corresponding length in\n     * Java2D coordinates.\n     *\n     * @param length  the length.\n     * @param area  the plot area.\n     * @param edge  the edge along which the axis lies.\n     *\n     * @return The length in Java2D coordinates.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 68)",
        "(line 675,col 9)-(line 675,col 75)",
        "(line 676,col 9)-(line 676,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 690,
      "end_line": 717,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area in which the plot should be drawn.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 68)",
        "(line 697,col 9)-(line 697,col 58)",
        "(line 698,col 9)-(line 698,col 69)",
        "(line 699,col 9)-(line 700,col 22)",
        "(line 703,col 9)-(line 703,col 72)",
        "(line 705,col 9)-(line 706,col 52)",
        "(line 707,col 9)-(line 708,col 22)",
        "(line 710,col 9)-(line 710,col 61)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 715,col 9)-(line 715,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D)",
      "begin_line": 728,
      "end_line": 738,
      "comment": "\n     * Estimates the maximum tick label height.\n     *\n     * @param g2  the graphics device.\n     *\n     * @return The maximum height.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 63)",
        "(line 731,col 9)-(line 731,col 79)",
        "(line 733,col 9)-(line 733,col 48)",
        "(line 734,col 9)-(line 734,col 58)",
        "(line 735,col 9)-(line 735,col 71)",
        "(line 736,col 9)-(line 736,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.TickUnit)",
      "begin_line": 755,
      "end_line": 792,
      "comment": "\n     * Estimates the maximum width of the tick labels, assuming the specified\n     * tick unit is used.\n     * \u003cP\u003e\n     * Rather than computing the string bounds of every tick on the axis, we\n     * just look at two values: the lower bound and the upper bound for the\n     * axis.  These two values will usually be representative.\n     *\n     * @param g2  the graphics device.\n     * @param unit  the tick unit to use for calculation.\n     *\n     * @return The estimated maximum width of the tick labels.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 63)",
        "(line 759,col 9)-(line 759,col 79)",
        "(line 761,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 790,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.zoomRange(double, double)",
      "begin_line": 800,
      "end_line": 819,
      "comment": "\n     * Zooms in on the current range.\n     *\n     * @param lowerPercent  the new lower bound.\n     * @param upperPercent  the new upper bound.\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 33)",
        "(line 802,col 9)-(line 802,col 45)",
        "(line 803,col 9)-(line 803,col 43)",
        "(line 804,col 9)-(line 804,col 42)",
        "(line 805,col 9)-(line 805,col 40)",
        "(line 806,col 9)-(line 806,col 36)",
        "(line 807,col 9)-(line 807,col 30)",
        "(line 808,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.pan(double)",
      "begin_line": 828,
      "end_line": 839,
      "comment": "\n     * Slides the axis range by the specified percentage.\n     *\n     * @param percent  the percentage.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 33)",
        "(line 830,col 9)-(line 830,col 45)",
        "(line 831,col 9)-(line 831,col 45)",
        "(line 832,col 9)-(line 832,col 42)",
        "(line 833,col 9)-(line 833,col 42)",
        "(line 834,col 9)-(line 834,col 36)",
        "(line 835,col 9)-(line 835,col 38)",
        "(line 836,col 9)-(line 836,col 26)",
        "(line 837,col 9)-(line 837,col 26)",
        "(line 838,col 9)-(line 838,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.createTickLabel(double)",
      "begin_line": 851,
      "end_line": 858,
      "comment": "\n     * Creates a tick label for the specified value.  Note that this method\n     * was \u0027private\u0027 prior to version 1.0.10.\n     *\n     * @param value  the value.\n     *\n     * @return The label.\n     *\n     * @since 1.0.10\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 857,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.equals(java.lang.Object)",
      "begin_line": 867,
      "end_line": 882,
      "comment": "\n     * Tests this axis for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 37)",
        "(line 875,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.hashCode()",
      "begin_line": 889,
      "end_line": 900,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 25)",
        "(line 891,col 9)-(line 891,col 55)",
        "(line 892,col 9)-(line 892,col 60)",
        "(line 893,col 9)-(line 893,col 59)",
        "(line 894,col 9)-(line 894,col 60)",
        "(line 895,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 56)",
        "(line 899,col 9)-(line 899,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.createLogTickUnits(java.util.Locale)",
      "begin_line": 912,
      "end_line": 930,
      "comment": "\n     * Returns a collection of tick units for log (base 10) values.\n     * Uses a given Locale to create the DecimalFormats.\n     *\n     * @param locale the locale to use to represent Numbers.\n     *\n     * @return A collection of tick units for integer values.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 42)",
        "(line 914,col 9)-(line 914,col 52)",
        "(line 915,col 9)-(line 915,col 61)",
        "(line 916,col 9)-(line 916,col 61)",
        "(line 917,col 9)-(line 917,col 60)",
        "(line 918,col 9)-(line 918,col 60)",
        "(line 919,col 9)-(line 919,col 59)",
        "(line 920,col 9)-(line 920,col 59)",
        "(line 921,col 9)-(line 921,col 59)",
        "(line 922,col 9)-(line 922,col 59)",
        "(line 923,col 9)-(line 923,col 59)",
        "(line 924,col 9)-(line 924,col 55)",
        "(line 925,col 9)-(line 925,col 55)",
        "(line 926,col 9)-(line 926,col 55)",
        "(line 927,col 9)-(line 927,col 55)",
        "(line 928,col 9)-(line 928,col 56)",
        "(line 929,col 9)-(line 929,col 21)"
      ]
    }
  ]
}