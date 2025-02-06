{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/LogAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueAxis"
      ],
      "begin_line": 80,
      "end_line": 949,
      "comment": "\n * A numerical axis that uses a logarithmic scale.  The class is an \n * alternative to the {@link LogarithmicAxis} class.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The logarithm base. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLog"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The logarithm of the base value - cached for performance. "
    },
    {
      "type": "field",
      "varNames": [
        "smallestValue"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "  The smallest value permitted on the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The current tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatOverride"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The override number format. "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickCount"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The number of minor ticks per major tick unit. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogAxis.LogAxis()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Creates a new \u003ccode\u003eLogAxis\u003c/code\u003e with no label.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogAxis.LogAxis(java.lang.String)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Creates a new \u003ccode\u003eLogAxis\u003c/code\u003e with the given label.\n     * \n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 63)",
        "(line 114,col 9)-(line 114,col 50)",
        "(line 115,col 9)-(line 115,col 74)",
        "(line 116,col 9)-(line 116,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getBase()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Returns the base for the logarithm calculation.\n     * \n     * @return The base for the logarithm calculation.\n     * \n     * @see #setBase(double)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setBase(double)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Sets the base for the logarithm calculation and sends an \n     * {@link AxisChangeEvent} to all registered listeners.\n     * \n     * @param base  the base value (must be \u003e 1.0).\n     * \n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 25)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getSmallestValue()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns the smallest value represented by the axis.\n     * \n     * @return The smallest value represented by the axis.\n     * \n     * @see #setSmallestValue(double)\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setSmallestValue(double)",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Sets the smallest value represented by the axis and sends an \n     * {@link AxisChangeEvent} to all registered listeners.\n     * \n     * @param value  the value.\n     * \n     * @see #getSmallestValue()\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getTickUnit()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns the current tick unit.\n     * \n     * @return The current tick unit.\n     * \n     * @see #setTickUnit(NumberTickUnit)\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Sets the tick unit for the axis and sends an {@link AxisChangeEvent} to \n     * all registered listeners.  A side effect of calling this method is that\n     * the \"auto-select\" feature for tick units is switched off (you can \n     * restore it using the {@link ValueAxis#setAutoTickUnitSelection(boolean)}\n     * method).\n     *\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getTickUnit()\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit, boolean, boolean)",
      "begin_line": 214,
      "end_line": 228,
      "comment": "\n     * Sets the tick unit for the axis and, if requested, sends an \n     * {@link AxisChangeEvent} to all registered listeners.  In addition, an \n     * option is provided to turn off the \"auto-select\" feature for tick units \n     * (you can restore it using the \n     * {@link ValueAxis#setAutoTickUnitSelection(boolean)} method).\n     *\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param notify  notify listeners?\n     * @param turnOffAutoSelect  turn off the auto-tick selection?\n     * \n     * @see #getTickUnit()\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 29)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getNumberFormatOverride()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Returns the number format override.  If this is non-null, then it will \n     * be used to format the numbers on the axis.\n     *\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setNumberFormatOverride(NumberFormat)\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setNumberFormatOverride(java.text.NumberFormat)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * Sets the number format override.  If this is non-null, then it will be \n     * used to format the numbers on the axis.\n     *\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @see #getNumberFormatOverride()\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 252,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getMinorTickCount()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the number of minor tick marks to display.\n     * \n     * @return The number of minor tick marks to display.\n     * \n     * @see #setMinorTickCount(int)\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setMinorTickCount(int)",
      "begin_line": 274,
      "end_line": 280,
      "comment": "\n     * Sets the number of minor tick marks to display, and sends an\n     * {@link AxisChangeEvent} to all registered listeners.\n     * \n     * @param count  the count.\n     * \n     * @see #getMinorTickCount()\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.calculateLog(double)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Calculates the log of the given value, using the current base.\n     * \n     * @param value  the value.\n     * \n     * @return The log of the given value.\n     * \n     * @see #calculateValue(double)\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.calculateValue(double)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Calculates the value from a given log.\n     * \n     * @param log  the log value (must be \u003e 0.0).\n     * \n     * @return The value with the given log.\n     * \n     * @see #calculateLog(double)\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 320,
      "end_line": 347,
      "comment": "\n     * Converts a Java2D coordinate to an axis value, assuming that the\n     * axis covers the specified \u003ccode\u003eedge\u003c/code\u003e of the \u003ccode\u003earea\u003c/code\u003e.\n     * \n     * @param java2DValue  the Java2D coordinate.\n     * @param area  the area.\n     * @param edge  the edge that the axis belongs to.\n     * \n     * @return A value along the axis scale.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 33)",
        "(line 324,col 9)-(line 324,col 61)",
        "(line 325,col 9)-(line 325,col 61)",
        "(line 327,col 9)-(line 327,col 25)",
        "(line 328,col 9)-(line 328,col 25)",
        "(line 329,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 25)",
        "(line 338,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 360,
      "end_line": 386,
      "comment": "\n     * Converts a value on the axis scale to a Java2D coordinate relative to \n     * the given \u003ccode\u003earea\u003c/code\u003e, based on the axis running along the \n     * specified \u003ccode\u003eedge\u003c/code\u003e.\n     * \n     * @param value  the data value.\n     * @param area  the area.\n     * @param edge  the edge.\n     * \n     * @return The Java2D coordinate corresponding to \u003ccode\u003evalue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 33)",
        "(line 364,col 9)-(line 364,col 61)",
        "(line 365,col 9)-(line 365,col 61)",
        "(line 366,col 9)-(line 366,col 36)",
        "(line 368,col 9)-(line 368,col 25)",
        "(line 369,col 9)-(line 369,col 25)",
        "(line 370,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.configure()",
      "begin_line": 392,
      "end_line": 396,
      "comment": "\n     * Configures the axis.  This method is typically called when an axis\n     * is assigned to a new plot.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.autoAdjustRange()",
      "begin_line": 402,
      "end_line": 447,
      "comment": "\n     * Adjusts the axis range to match the data range that the axis is\n     * required to display.\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 30)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 463,
      "end_line": 482,
      "comment": "\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \n     * printer).\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param cursor  the cursor location (determines where to draw the axis).\n     * @param plotArea  the area within which the axes and plot should be drawn.\n     * @param dataArea  the area within which the data should be drawn.\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plotState  collects information about the plot \n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 31)",
        "(line 469,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 478,col 27)",
        "(line 479,col 9)-(line 480,col 27)",
        "(line 481,col 9)-(line 481,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 496,
      "end_line": 508,
      "comment": "\n     * Calculates the positions of the tick labels for the axis, storing the \n     * results in the tick label list (ready for drawing).\n     *\n     * @param g2  the graphics device.\n     * @param state  the axis state.\n     * @param dataArea  the area in which the plot should be drawn.\n     * @param edge  the location of the axis.\n     * \n     * @return A list of ticks.\n     *\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 48)",
        "(line 500,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 519,
      "end_line": 559,
      "comment": "\n     * Returns a list of ticks for an axis at the top or bottom of the chart.\n     * \n     * @param g2  the graphics device.\n     * @param dataArea  the data area.\n     * @param edge  the edge.\n     * \n     * @return A list of ticks.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 33)",
        "(line 523,col 9)-(line 523,col 37)",
        "(line 524,col 9)-(line 524,col 48)",
        "(line 525,col 9)-(line 525,col 34)",
        "(line 526,col 6)-(line 526,col 27)",
        "(line 527,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 65)",
        "(line 538,col 9)-(line 538,col 62)",
        "(line 539,col 9)-(line 539,col 31)",
        "(line 540,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 570,
      "end_line": 610,
      "comment": "\n     * Returns a list of ticks for an axis at the left or right of the chart.\n     * \n     * @param g2  the graphics device.\n     * @param dataArea  the data area.\n     * @param edge  the edge.\n     * \n     * @return A list of ticks.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 33)",
        "(line 574,col 9)-(line 574,col 37)",
        "(line 575,col 9)-(line 575,col 48)",
        "(line 576,col 9)-(line 576,col 34)",
        "(line 577,col 6)-(line 577,col 27)",
        "(line 578,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 65)",
        "(line 589,col 9)-(line 589,col 62)",
        "(line 590,col 9)-(line 590,col 31)",
        "(line 591,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 623,
      "end_line": 633,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area defined by the axes.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 631,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 646,
      "end_line": 673,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area defined by the axes.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 650,col 31)",
        "(line 653,col 9)-(line 653,col 58)",
        "(line 654,col 9)-(line 654,col 69)",
        "(line 655,col 9)-(line 656,col 22)",
        "(line 659,col 9)-(line 659,col 71)",
        "(line 661,col 9)-(line 662,col 52)",
        "(line 663,col 9)-(line 664,col 22)",
        "(line 666,col 9)-(line 666,col 66)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 671,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.exponentLengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 687,
      "end_line": 692,
      "comment": "\n     * Converts a length in data coordinates into the corresponding length in \n     * Java2D coordinates.\n     * \n     * @param length  the length.\n     * @param area  the plot area.\n     * @param edge  the edge along which the axis lies.\n     * \n     * @return The length in Java2D coordinates.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 68)",
        "(line 690,col 9)-(line 690,col 75)",
        "(line 691,col 9)-(line 691,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 705,
      "end_line": 732,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area in which the plot should be drawn.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 68)",
        "(line 712,col 9)-(line 712,col 58)",
        "(line 713,col 9)-(line 713,col 69)",
        "(line 714,col 9)-(line 715,col 22)",
        "(line 718,col 9)-(line 718,col 72)",
        "(line 720,col 9)-(line 721,col 52)",
        "(line 722,col 9)-(line 723,col 22)",
        "(line 725,col 9)-(line 725,col 61)",
        "(line 726,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D)",
      "begin_line": 743,
      "end_line": 753,
      "comment": "\n     * Estimates the maximum tick label height.\n     * \n     * @param g2  the graphics device.\n     * \n     * @return The maximum height.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 63)",
        "(line 746,col 9)-(line 746,col 79)",
        "(line 748,col 9)-(line 748,col 48)",
        "(line 749,col 9)-(line 749,col 58)",
        "(line 750,col 9)-(line 750,col 71)",
        "(line 751,col 9)-(line 751,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.TickUnit)",
      "begin_line": 770,
      "end_line": 807,
      "comment": "\n     * Estimates the maximum width of the tick labels, assuming the specified \n     * tick unit is used.\n     * \u003cP\u003e\n     * Rather than computing the string bounds of every tick on the axis, we \n     * just look at two values: the lower bound and the upper bound for the \n     * axis.  These two values will usually be representative.\n     *\n     * @param g2  the graphics device.\n     * @param unit  the tick unit to use for calculation.\n     *\n     * @return The estimated maximum width of the tick labels.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 63)",
        "(line 774,col 9)-(line 774,col 79)",
        "(line 776,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.zoomRange(double, double)",
      "begin_line": 815,
      "end_line": 834,
      "comment": "\n     * Zooms in on the current range.\n     * \n     * @param lowerPercent  the new lower bound.\n     * @param upperPercent  the new upper bound.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 33)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 818,col 43)",
        "(line 819,col 9)-(line 819,col 42)",
        "(line 820,col 9)-(line 820,col 40)",
        "(line 821,col 9)-(line 821,col 36)",
        "(line 822,col 9)-(line 822,col 30)",
        "(line 823,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.createTickLabel(double)",
      "begin_line": 843,
      "end_line": 850,
      "comment": "\n     * Creates a tick label for the specified value.\n     * \n     * @param value  the value.\n     * \n     * @return The label.\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 849,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.equals(java.lang.Object)",
      "begin_line": 859,
      "end_line": 877,
      "comment": "\n     * Tests this axis for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 37)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.hashCode()",
      "begin_line": 884,
      "end_line": 896,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 25)",
        "(line 886,col 9)-(line 886,col 55)",
        "(line 887,col 9)-(line 887,col 60)",
        "(line 888,col 9)-(line 888,col 51)",
        "(line 889,col 9)-(line 889,col 59)",
        "(line 890,col 9)-(line 890,col 60)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 56)",
        "(line 895,col 9)-(line 895,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.createLogTickUnits(java.util.Locale)",
      "begin_line": 908,
      "end_line": 948,
      "comment": "\n     * Returns a collection of tick units for log (base 10) values.\n     * Uses a given Locale to create the DecimalFormats.\n     *\n     * @param locale the locale to use to represent Numbers.\n     *\n     * @return A collection of tick units for integer values.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 42)",
        "(line 912,col 9)-(line 912,col 75)",
        "(line 914,col 9)-(line 914,col 55)",
        "(line 915,col 9)-(line 915,col 55)",
        "(line 916,col 9)-(line 916,col 55)",
        "(line 917,col 9)-(line 917,col 56)",
        "(line 918,col 9)-(line 918,col 56)",
        "(line 919,col 9)-(line 919,col 56)",
        "(line 920,col 9)-(line 920,col 57)",
        "(line 921,col 9)-(line 921,col 57)",
        "(line 922,col 9)-(line 922,col 57)",
        "(line 923,col 9)-(line 923,col 58)",
        "(line 924,col 9)-(line 924,col 58)",
        "(line 925,col 9)-(line 925,col 58)",
        "(line 926,col 9)-(line 926,col 59)",
        "(line 927,col 9)-(line 927,col 59)",
        "(line 928,col 9)-(line 928,col 59)",
        "(line 929,col 9)-(line 929,col 60)",
        "(line 930,col 9)-(line 930,col 68)",
        "(line 931,col 9)-(line 931,col 68)",
        "(line 932,col 9)-(line 932,col 68)",
        "(line 933,col 9)-(line 933,col 68)",
        "(line 934,col 9)-(line 934,col 68)",
        "(line 935,col 9)-(line 935,col 68)",
        "(line 936,col 9)-(line 936,col 68)",
        "(line 937,col 9)-(line 937,col 68)",
        "(line 938,col 9)-(line 938,col 68)",
        "(line 939,col 9)-(line 939,col 68)",
        "(line 940,col 9)-(line 940,col 68)",
        "(line 941,col 9)-(line 941,col 68)",
        "(line 942,col 9)-(line 942,col 68)",
        "(line 943,col 9)-(line 943,col 68)",
        "(line 944,col 9)-(line 944,col 68)",
        "(line 946,col 9)-(line 946,col 21)"
      ]
    }
  ]
}