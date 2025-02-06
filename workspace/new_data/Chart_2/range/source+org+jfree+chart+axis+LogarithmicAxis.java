{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/LogarithmicAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogarithmicAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis"
      ],
      "begin_line": 113,
      "end_line": 1090,
      "comment": "\r\n * A numerical axis that uses a logarithmic scale.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "LOG10_VALUE"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Useful constant for log(10). "
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_LOG_VALUE"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Smallest arbitrarily-close-to-zero value allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "allowNegativesFlag"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Flag set true to allow negative values in data. "
    },
    {
      "type": "field",
      "varNames": [
        "strictValuesFlag"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\r\n     * Flag set true make axis throw exception if any values are\r\n     * \u003c\u003d 0 and \u0027allowNegativesFlag\u0027 is false.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatterObj"
      ],
      "begin_line": 134,
      "end_line": 135,
      "comment": " Number formatter for generating numeric strings. "
    },
    {
      "type": "field",
      "varNames": [
        "expTickLabelsFlag"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Flag set true for \"1e#\"-style tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "log10TickLabelsFlag"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " Flag set true for \"10^n\"-style tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeNextLogFlag"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " True to make \u0027autoAdjustRange()\u0027 select \"10^n\" values. "
    },
    {
      "type": "field",
      "varNames": [
        "smallLogFlag"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Helper flag for log axis processing. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.LogarithmicAxis(java.lang.String)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 21)",
        "(line 156,col 9)-(line 156,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setAllowNegativesFlag(boolean)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Sets the \u0027allowNegativesFlag\u0027 flag; true to allow negative values\r\n     * in data, false to be able to plot positive values arbitrarily close to\r\n     * zero.\r\n     *\r\n     * @param flgVal  the new value of the flag.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.getAllowNegativesFlag()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns the \u0027allowNegativesFlag\u0027 flag; true to allow negative values\r\n     * in data, false to be able to plot positive values arbitrarily close\r\n     * to zero.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setStrictValuesFlag(boolean)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Sets the \u0027strictValuesFlag\u0027 flag; if true and \u0027allowNegativesFlag\u0027\r\n     * is false then this axis will throw a runtime exception if any of its\r\n     * values are less than or equal to zero; if false then the axis will\r\n     * adjust for values less than or equal to zero as needed.\r\n     *\r\n     * @param flgVal true for strict enforcement.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.getStrictValuesFlag()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the \u0027strictValuesFlag\u0027 flag; if true and \u0027allowNegativesFlag\u0027\r\n     * is false then this axis will throw a runtime exception if any of its\r\n     * values are less than or equal to zero; if false then the axis will\r\n     * adjust for values less than or equal to zero as needed.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if strict enforcement is enabled.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setExpTickLabelsFlag(boolean)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\r\n     * Sets the \u0027expTickLabelsFlag\u0027 flag.  If the \u0027log10TickLabelsFlag\u0027\r\n     * is false then this will set whether or not \"1e#\"-style tick labels\r\n     * are used.  The default is to use regular numeric tick labels.\r\n     *\r\n     * @param flgVal true for \"1e#\"-style tick labels, false for\r\n     * log10 or regular numeric tick labels.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)",
        "(line 215,col 9)-(line 215,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.getExpTickLabelsFlag()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the \u0027expTickLabelsFlag\u0027 flag.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e for \"1e#\"-style tick labels,\r\n     *         \u003ccode\u003efalse\u003c/code\u003e for log10 or regular numeric tick labels.\r\n     ",
      "child_ranges": [
        "(line 225,col 7)-(line 225,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setLog10TickLabelsFlag(boolean)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Sets the \u0027log10TickLabelsFlag\u0027 flag.  The default value is false.\r\n     *\r\n     * @param flag true for \"10^n\"-style tick labels, false for \"1e#\"-style\r\n     * or regular numeric tick labels.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.getLog10TickLabelsFlag()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n     * Returns the \u0027log10TickLabelsFlag\u0027 flag.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e for \"10^n\"-style tick labels,\r\n     *         \u003ccode\u003efalse\u003c/code\u003e for \"1e#\"-style or regular numeric tick\r\n     *         labels.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setAutoRangeNextLogFlag(boolean)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Sets the \u0027autoRangeNextLogFlag\u0027 flag.  This determines whether or\r\n     * not the \u0027autoAdjustRange()\u0027 method will select the next \"10^n\"\r\n     * values when determining the upper and lower bounds.  The default\r\n     * value is false.\r\n     *\r\n     * @param flag \u003ccode\u003etrue\u003c/code\u003e to make the \u0027autoAdjustRange()\u0027\r\n     * method select the next \"10^n\" values, \u003ccode\u003efalse\u003c/code\u003e to not.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.getAutoRangeNextLogFlag()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the \u0027autoRangeNextLogFlag\u0027 flag.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the \u0027autoAdjustRange()\u0027 method will\r\n     * select the next \"10^n\" values, \u003ccode\u003efalse\u003c/code\u003e if not.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setRange(org.jfree.data.Range)",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\r\n     * Overridden version that calls original and then sets up flag for\r\n     * log axis processing.\r\n     *\r\n     * @param range  the new range.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 30)",
        "(line 280,col 9)-(line 280,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setupSmallLogFlag()",
      "begin_line": 287,
      "end_line": 293,
      "comment": "\r\n     * Sets up flag for log axis processing.  Set true if negative values\r\n     * not allowed and the lower bound is between 0 and 10.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 53)",
        "(line 291,col 9)-(line 292,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.setupNumberFmtObj()",
      "begin_line": 299,
      "end_line": 306,
      "comment": "\r\n     * Sets up the number formatter object according to the\r\n     * \u0027expTickLabelsFlag\u0027 flag.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.switchedLog10(double)",
      "begin_line": 321,
      "end_line": 324,
      "comment": "\r\n     * Returns the log10 value, depending on if values between 0 and\r\n     * 1 are being plotted.  If negative values are not allowed and\r\n     * the lower bound is between 0 and 10 then a normal log is\r\n     * returned; otherwise the returned value is adjusted if the\r\n     * given value is less than 10.\r\n     *\r\n     * @param val the value.\r\n     *\r\n     * @return log\u003csub\u003e10\u003c/sub\u003e(val).\r\n     *\r\n     * @see #switchedPow10(double)\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 323,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.switchedPow10(double)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\r\n     * Returns a power of 10, depending on if values between 0 and\r\n     * 1 are being plotted.  If negative values are not allowed and\r\n     * the lower bound is between 0 and 10 then a normal power is\r\n     * returned; otherwise the returned value is adjusted if the\r\n     * given value is less than 1.\r\n     *\r\n     * @param val the value.\r\n     *\r\n     * @return 10\u003csup\u003eval\u003c/sup\u003e.\r\n     *\r\n     * @since 1.0.5\r\n     * @see #switchedLog10(double)\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.adjustedLog10(double)",
      "begin_line": 358,
      "end_line": 369,
      "comment": "\r\n     * Returns an adjusted log10 value for graphing purposes.  The first\r\n     * adjustment is that negative values are changed to positive during\r\n     * the calculations, and then the answer is negated at the end.  The\r\n     * second is that, for values less than 10, an increasingly large\r\n     * (0 to 1) scaling factor is added such that at 0 the value is\r\n     * adjusted to 1, resulting in a returned result of 0.\r\n     *\r\n     * @param val  value for which log10 should be calculated.\r\n     *\r\n     * @return An adjusted log\u003csub\u003e10\u003c/sub\u003e(val).\r\n     *\r\n     * @see #adjustedPow10(double)\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 38)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 49)",
        "(line 368,col 9)-(line 368,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.adjustedPow10(double)",
      "begin_line": 385,
      "end_line": 398,
      "comment": "\r\n     * Returns an adjusted power of 10 value for graphing purposes.  The first\r\n     * adjustment is that negative values are changed to positive during\r\n     * the calculations, and then the answer is negated at the end.  The\r\n     * second is that, for values less than 1, a progressive logarithmic\r\n     * offset is subtracted such that at 0 the returned result is also 0.\r\n     *\r\n     * @param val  value for which power of 10 should be calculated.\r\n     *\r\n     * @return An adjusted 10\u003csup\u003eval\u003c/sup\u003e.\r\n     *\r\n     * @since 1.0.5\r\n     * @see #adjustedLog10(double)\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 38)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 19)",
        "(line 391,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.computeLogFloor(double)",
      "begin_line": 410,
      "end_line": 448,
      "comment": "\r\n     * Returns the largest (closest to positive infinity) double value that is\r\n     * not greater than the argument, is equal to a mathematical integer and\r\n     * satisfying the condition that log base 10 of the value is an integer\r\n     * (i.e., the value returned will be a power of 10: 1, 10, 100, 1000, etc.).\r\n     *\r\n     * @param lower a double value below which a floor will be calcualted.\r\n     *\r\n     * @return 10\u003csup\u003eN\u003c/sup\u003e with N .. { 1 ... }\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 24)",
        "(line 413,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.computeLogCeil(double)",
      "begin_line": 460,
      "end_line": 501,
      "comment": "\r\n     * Returns the smallest (closest to negative infinity) double value that is\r\n     * not less than the argument, is equal to a mathematical integer and\r\n     * satisfying the condition that log base 10 of the value is an integer\r\n     * (i.e., the value returned will be a power of 10: 1, 10, 100, 1000, etc.).\r\n     *\r\n     * @param upper a double value above which a ceiling will be calcualted.\r\n     *\r\n     * @return 10\u003csup\u003eN\u003c/sup\u003e with N .. { 1 ... }\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 23)",
        "(line 463,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.autoAdjustRange()",
      "begin_line": 506,
      "end_line": 611,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 30)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 625,
      "end_line": 654,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that\r\n     * the axis runs along one edge of the specified plotArea.\r\n     * Note that it is possible for the coordinate to fall outside the\r\n     * plotArea.\r\n     *\r\n     * @param value  the data value.\r\n     * @param plotArea  the area for plotting the data.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 33)",
        "(line 629,col 9)-(line 629,col 62)",
        "(line 630,col 9)-(line 630,col 62)",
        "(line 632,col 9)-(line 632,col 25)",
        "(line 633,col 9)-(line 633,col 25)",
        "(line 634,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 643,col 37)",
        "(line 645,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 667,
      "end_line": 693,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data\r\n     * value, assuming that the axis runs along one edge of the specified\r\n     * plotArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param plotArea  the area in which the data is plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 33)",
        "(line 671,col 9)-(line 671,col 62)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 674,col 9)-(line 674,col 29)",
        "(line 675,col 9)-(line 675,col 29)",
        "(line 676,col 9)-(line 683,col 9)",
        "(line 685,col 9)-(line 692,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.zoomRange(double, double)",
      "begin_line": 701,
      "end_line": 721,
      "comment": "\r\n     * Zooms in on the current range.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 68)",
        "(line 703,col 9)-(line 704,col 36)",
        "(line 705,col 9)-(line 705,col 23)",
        "(line 707,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 733,
      "end_line": 870,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 47)",
        "(line 738,col 9)-(line 738,col 33)",
        "(line 741,col 9)-(line 741,col 53)",
        "(line 744,col 9)-(line 746,col 9)",
        "(line 749,col 9)-(line 749,col 53)",
        "(line 752,col 9)-(line 752,col 70)",
        "(line 754,col 9)-(line 754,col 70)",
        "(line 756,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 32)",
        "(line 764,col 9)-(line 764,col 25)",
        "(line 765,col 9)-(line 765,col 37)",
        "(line 766,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 882,
      "end_line": 1060,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 47)",
        "(line 889,col 9)-(line 889,col 58)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 896,col 9)-(line 896,col 58)",
        "(line 899,col 9)-(line 899,col 70)",
        "(line 901,col 9)-(line 901,col 70)",
        "(line 903,col 9)-(line 908,col 9)",
        "(line 910,col 9)-(line 910,col 23)",
        "(line 911,col 9)-(line 911,col 25)",
        "(line 912,col 9)-(line 912,col 37)",
        "(line 913,col 9)-(line 1058,col 9)",
        "(line 1059,col 9)-(line 1059,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.makeTickLabel(double, boolean)",
      "begin_line": 1071,
      "end_line": 1078,
      "comment": "\r\n     * Converts the given value to a tick label string.\r\n     *\r\n     * @param val the value to convert.\r\n     * @param forceFmtFlag true to force the number-formatter object\r\n     * to be used.\r\n     *\r\n     * @return The tick label string.\r\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1076,col 9)",
        "(line 1077,col 9)-(line 1077,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.LogarithmicAxis.makeTickLabel(double)",
      "begin_line": 1086,
      "end_line": 1088,
      "comment": "\r\n     * Converts the given value to a tick label string.\r\n     * @param val the value to convert.\r\n     *\r\n     * @return The tick label string.\r\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 41)"
      ]
    }
  ]
}