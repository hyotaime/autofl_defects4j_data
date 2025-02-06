{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/LogAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueAxis"
      ],
      "begin_line": 84,
      "end_line": 956,
      "comment": "\n * A numerical axis that uses a logarithmic scale.  The class is an \n * alternative to the {@link LogarithmicAxis} class.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The logarithm base. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLog"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The logarithm of the base value - cached for performance. "
    },
    {
      "type": "field",
      "varNames": [
        "smallestValue"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "  The smallest value permitted on the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The current tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatOverride"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The override number format. "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickCount"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The number of minor ticks per major tick unit. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogAxis.LogAxis()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Creates a new \u003ccode\u003eLogAxis\u003c/code\u003e with no label.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogAxis.LogAxis(java.lang.String)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * Creates a new \u003ccode\u003eLogAxis\u003c/code\u003e with the given label.\n     * \n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 63)",
        "(line 118,col 9)-(line 118,col 50)",
        "(line 119,col 9)-(line 119,col 74)",
        "(line 120,col 9)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getBase()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Returns the base for the logarithm calculation.\n     * \n     * @return The base for the logarithm calculation.\n     * \n     * @see #setBase(double)\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setBase(double)",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\n     * Sets the base for the logarithm calculation and sends an \n     * {@link AxisChangeEvent} to all registered listeners.\n     * \n     * @param base  the base value (must be \u003e 1.0).\n     * \n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 25)",
        "(line 147,col 9)-(line 147,col 38)",
        "(line 148,col 9)-(line 148,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getSmallestValue()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the smallest value represented by the axis.\n     * \n     * @return The smallest value represented by the axis.\n     * \n     * @see #setSmallestValue(double)\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setSmallestValue(double)",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Sets the smallest value represented by the axis and sends an \n     * {@link AxisChangeEvent} to all registered listeners.\n     * \n     * @param value  the value.\n     * \n     * @see #getSmallestValue()\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 175,col 9)-(line 175,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getTickUnit()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Returns the current tick unit.\n     * \n     * @return The current tick unit.\n     * \n     * @see #setTickUnit(NumberTickUnit)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Sets the tick unit for the axis and sends an {@link AxisChangeEvent} to \n     * all registered listeners.  A side effect of calling this method is that\n     * the \"auto-select\" feature for tick units is switched off (you can \n     * restore it using the {@link ValueAxis#setAutoTickUnitSelection(boolean)}\n     * method).\n     *\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getTickUnit()\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit, boolean, boolean)",
      "begin_line": 218,
      "end_line": 232,
      "comment": "\n     * Sets the tick unit for the axis and, if requested, sends an \n     * {@link AxisChangeEvent} to all registered listeners.  In addition, an \n     * option is provided to turn off the \"auto-select\" feature for tick units \n     * (you can restore it using the \n     * {@link ValueAxis#setAutoTickUnitSelection(boolean)} method).\n     *\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param notify  notify listeners?\n     * @param turnOffAutoSelect  turn off the auto-tick selection?\n     * \n     * @see #getTickUnit()\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 29)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getNumberFormatOverride()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns the number format override.  If this is non-null, then it will \n     * be used to format the numbers on the axis.\n     *\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setNumberFormatOverride(NumberFormat)\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setNumberFormatOverride(java.text.NumberFormat)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Sets the number format override.  If this is non-null, then it will be \n     * used to format the numbers on the axis.\n     *\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @see #getNumberFormatOverride()\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 46)",
        "(line 256,col 9)-(line 256,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.getMinorTickCount()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns the number of minor tick marks to display.\n     * \n     * @return The number of minor tick marks to display.\n     * \n     * @see #setMinorTickCount(int)\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.setMinorTickCount(int)",
      "begin_line": 278,
      "end_line": 284,
      "comment": "\n     * Sets the number of minor tick marks to display, and sends an\n     * {@link AxisChangeEvent} to all registered listeners.\n     * \n     * @param count  the count.\n     * \n     * @see #getMinorTickCount()\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 36)",
        "(line 283,col 9)-(line 283,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.calculateLog(double)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Calculates the log of the given value, using the current base.\n     * \n     * @param value  the value.\n     * \n     * @return The log of the given value.\n     * \n     * @see #calculateValue(double)\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.calculateValue(double)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Calculates the value from a given log.\n     * \n     * @param log  the log value (must be \u003e 0.0).\n     * \n     * @return The value with the given log.\n     * \n     * @see #calculateLog(double)\n     * @see #getBase()\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 324,
      "end_line": 351,
      "comment": "\n     * Converts a Java2D coordinate to an axis value, assuming that the\n     * axis covers the specified \u003ccode\u003eedge\u003c/code\u003e of the \u003ccode\u003earea\u003c/code\u003e.\n     * \n     * @param java2DValue  the Java2D coordinate.\n     * @param area  the area.\n     * @param edge  the edge that the axis belongs to.\n     * \n     * @return A value along the axis scale.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 33)",
        "(line 328,col 9)-(line 328,col 61)",
        "(line 329,col 9)-(line 329,col 61)",
        "(line 331,col 9)-(line 331,col 25)",
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 25)",
        "(line 342,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 364,
      "end_line": 390,
      "comment": "\n     * Converts a value on the axis scale to a Java2D coordinate relative to \n     * the given \u003ccode\u003earea\u003c/code\u003e, based on the axis running along the \n     * specified \u003ccode\u003eedge\u003c/code\u003e.\n     * \n     * @param value  the data value.\n     * @param area  the area.\n     * @param edge  the edge.\n     * \n     * @return The Java2D coordinate corresponding to \u003ccode\u003evalue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 33)",
        "(line 368,col 9)-(line 368,col 61)",
        "(line 369,col 9)-(line 369,col 61)",
        "(line 370,col 9)-(line 370,col 36)",
        "(line 372,col 9)-(line 372,col 25)",
        "(line 373,col 9)-(line 373,col 25)",
        "(line 374,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.configure()",
      "begin_line": 396,
      "end_line": 400,
      "comment": "\n     * Configures the axis.  This method is typically called when an axis\n     * is assigned to a new plot.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.autoAdjustRange()",
      "begin_line": 406,
      "end_line": 451,
      "comment": "\n     * Adjusts the axis range to match the data range that the axis is\n     * required to display.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 30)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 467,
      "end_line": 486,
      "comment": "\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \n     * printer).\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param cursor  the cursor location (determines where to draw the axis).\n     * @param plotArea  the area within which the axes and plot should be drawn.\n     * @param dataArea  the area within which the data should be drawn.\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plotState  collects information about the plot \n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 31)",
        "(line 473,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 482,col 27)",
        "(line 483,col 9)-(line 484,col 27)",
        "(line 485,col 9)-(line 485,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 500,
      "end_line": 512,
      "comment": "\n     * Calculates the positions of the tick labels for the axis, storing the \n     * results in the tick label list (ready for drawing).\n     *\n     * @param g2  the graphics device.\n     * @param state  the axis state.\n     * @param dataArea  the area in which the plot should be drawn.\n     * @param edge  the location of the axis.\n     * \n     * @return A list of ticks.\n     *\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 48)",
        "(line 504,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 523,
      "end_line": 563,
      "comment": "\n     * Returns a list of ticks for an axis at the top or bottom of the chart.\n     * \n     * @param g2  the graphics device.\n     * @param dataArea  the data area.\n     * @param edge  the edge.\n     * \n     * @return A list of ticks.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 33)",
        "(line 527,col 9)-(line 527,col 37)",
        "(line 528,col 9)-(line 528,col 48)",
        "(line 529,col 9)-(line 529,col 34)",
        "(line 530,col 6)-(line 530,col 27)",
        "(line 531,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 65)",
        "(line 542,col 9)-(line 542,col 62)",
        "(line 543,col 9)-(line 543,col 31)",
        "(line 544,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 574,
      "end_line": 614,
      "comment": "\n     * Returns a list of ticks for an axis at the left or right of the chart.\n     * \n     * @param g2  the graphics device.\n     * @param dataArea  the data area.\n     * @param edge  the edge.\n     * \n     * @return A list of ticks.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 33)",
        "(line 578,col 9)-(line 578,col 37)",
        "(line 579,col 9)-(line 579,col 48)",
        "(line 580,col 9)-(line 580,col 34)",
        "(line 581,col 6)-(line 581,col 27)",
        "(line 582,col 9)-(line 587,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 65)",
        "(line 593,col 9)-(line 593,col 62)",
        "(line 594,col 9)-(line 594,col 31)",
        "(line 595,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 627,
      "end_line": 637,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area defined by the axes.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 650,
      "end_line": 677,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area defined by the axes.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 654,col 31)",
        "(line 657,col 9)-(line 657,col 58)",
        "(line 658,col 9)-(line 658,col 69)",
        "(line 659,col 9)-(line 660,col 22)",
        "(line 663,col 9)-(line 663,col 71)",
        "(line 665,col 9)-(line 666,col 52)",
        "(line 667,col 9)-(line 668,col 22)",
        "(line 670,col 9)-(line 670,col 66)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 675,col 9)-(line 675,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.exponentLengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 691,
      "end_line": 696,
      "comment": "\n     * Converts a length in data coordinates into the corresponding length in \n     * Java2D coordinates.\n     * \n     * @param length  the length.\n     * @param area  the plot area.\n     * @param edge  the edge along which the axis lies.\n     * \n     * @return The length in Java2D coordinates.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 68)",
        "(line 694,col 9)-(line 694,col 75)",
        "(line 695,col 9)-(line 695,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 709,
      "end_line": 736,
      "comment": "\n     * Selects an appropriate tick value for the axis.  The strategy is to\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\n     * tick units) without the labels overlapping.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area in which the plot should be drawn.\n     * @param edge  the axis location.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 68)",
        "(line 716,col 9)-(line 716,col 58)",
        "(line 717,col 9)-(line 717,col 69)",
        "(line 718,col 9)-(line 719,col 22)",
        "(line 722,col 9)-(line 722,col 72)",
        "(line 724,col 9)-(line 725,col 52)",
        "(line 726,col 9)-(line 727,col 22)",
        "(line 729,col 9)-(line 729,col 61)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D)",
      "begin_line": 747,
      "end_line": 757,
      "comment": "\n     * Estimates the maximum tick label height.\n     * \n     * @param g2  the graphics device.\n     * \n     * @return The maximum height.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 63)",
        "(line 750,col 9)-(line 750,col 79)",
        "(line 752,col 9)-(line 752,col 48)",
        "(line 753,col 9)-(line 753,col 58)",
        "(line 754,col 9)-(line 754,col 71)",
        "(line 755,col 9)-(line 755,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.TickUnit)",
      "begin_line": 774,
      "end_line": 811,
      "comment": "\n     * Estimates the maximum width of the tick labels, assuming the specified \n     * tick unit is used.\n     * \u003cP\u003e\n     * Rather than computing the string bounds of every tick on the axis, we \n     * just look at two values: the lower bound and the upper bound for the \n     * axis.  These two values will usually be representative.\n     *\n     * @param g2  the graphics device.\n     * @param unit  the tick unit to use for calculation.\n     *\n     * @return The estimated maximum width of the tick labels.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 63)",
        "(line 778,col 9)-(line 778,col 79)",
        "(line 780,col 9)-(line 807,col 9)",
        "(line 809,col 9)-(line 809,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.zoomRange(double, double)",
      "begin_line": 819,
      "end_line": 838,
      "comment": "\n     * Zooms in on the current range.\n     * \n     * @param lowerPercent  the new lower bound.\n     * @param upperPercent  the new upper bound.\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 33)",
        "(line 821,col 9)-(line 821,col 45)",
        "(line 822,col 9)-(line 822,col 43)",
        "(line 823,col 9)-(line 823,col 42)",
        "(line 824,col 9)-(line 824,col 40)",
        "(line 825,col 9)-(line 825,col 36)",
        "(line 826,col 9)-(line 826,col 30)",
        "(line 827,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.createTickLabel(double)",
      "begin_line": 850,
      "end_line": 857,
      "comment": "\n     * Creates a tick label for the specified value.  Note that this method\n     * was \u0027private\u0027 prior to version 1.0.10.\n     * \n     * @param value  the value.\n     * \n     * @return The label.\n     *\n     * @since 1.0.10\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.equals(java.lang.Object)",
      "begin_line": 866,
      "end_line": 884,
      "comment": "\n     * Tests this axis for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 37)",
        "(line 874,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 883,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.hashCode()",
      "begin_line": 891,
      "end_line": 903,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 25)",
        "(line 893,col 9)-(line 893,col 55)",
        "(line 894,col 9)-(line 894,col 60)",
        "(line 895,col 9)-(line 895,col 51)",
        "(line 896,col 9)-(line 896,col 59)",
        "(line 897,col 9)-(line 897,col 60)",
        "(line 898,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 56)",
        "(line 902,col 9)-(line 902,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogAxis.createLogTickUnits(java.util.Locale)",
      "begin_line": 915,
      "end_line": 955,
      "comment": "\n     * Returns a collection of tick units for log (base 10) values.\n     * Uses a given Locale to create the DecimalFormats.\n     *\n     * @param locale the locale to use to represent Numbers.\n     *\n     * @return A collection of tick units for integer values.\n     *\n     * @since 1.0.7\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 42)",
        "(line 919,col 9)-(line 919,col 75)",
        "(line 921,col 9)-(line 921,col 55)",
        "(line 922,col 9)-(line 922,col 55)",
        "(line 923,col 9)-(line 923,col 55)",
        "(line 924,col 9)-(line 924,col 56)",
        "(line 925,col 9)-(line 925,col 56)",
        "(line 926,col 9)-(line 926,col 56)",
        "(line 927,col 9)-(line 927,col 57)",
        "(line 928,col 9)-(line 928,col 57)",
        "(line 929,col 9)-(line 929,col 57)",
        "(line 930,col 9)-(line 930,col 58)",
        "(line 931,col 9)-(line 931,col 58)",
        "(line 932,col 9)-(line 932,col 58)",
        "(line 933,col 9)-(line 933,col 59)",
        "(line 934,col 9)-(line 934,col 59)",
        "(line 935,col 9)-(line 935,col 59)",
        "(line 936,col 9)-(line 936,col 60)",
        "(line 937,col 9)-(line 937,col 68)",
        "(line 938,col 9)-(line 938,col 68)",
        "(line 939,col 9)-(line 939,col 68)",
        "(line 940,col 9)-(line 940,col 68)",
        "(line 941,col 9)-(line 941,col 68)",
        "(line 942,col 9)-(line 942,col 68)",
        "(line 943,col 9)-(line 943,col 68)",
        "(line 944,col 9)-(line 944,col 68)",
        "(line 945,col 9)-(line 945,col 68)",
        "(line 946,col 9)-(line 946,col 68)",
        "(line 947,col 9)-(line 947,col 68)",
        "(line 948,col 9)-(line 948,col 68)",
        "(line 949,col 9)-(line 949,col 68)",
        "(line 950,col 9)-(line 950,col 68)",
        "(line 951,col 9)-(line 951,col 68)",
        "(line 953,col 9)-(line 953,col 21)"
      ]
    }
  ]
}