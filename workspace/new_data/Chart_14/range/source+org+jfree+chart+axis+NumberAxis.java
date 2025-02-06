{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/NumberAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueAxis",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 136,
      "end_line": 1376,
      "comment": "\r\n * An axis for displaying numerical data.\r\n * \u003cP\u003e\r\n * If the axis is set up to automatically determine its range to fit the data,\r\n * you can ensure that the range includes zero (statisticians usually prefer\r\n * this) by setting the \u003ccode\u003eautoRangeIncludesZero\u003c/code\u003e flag to \r\n * \u003ccode\u003etrue\u003c/code\u003e.\r\n * \u003cP\u003e\r\n * The \u003ccode\u003eNumberAxis\u003c/code\u003e class has a mechanism for automatically \r\n * selecting a tick unit that is appropriate for the current axis range.  This\r\n * mechanism is an adaptation of code suggested by Laurence Vanhelsuwe.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_INCLUDES_ZERO"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The default value for the autoRangeIncludesZero flag. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_STICKY_ZERO"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The default value for the autoRangeStickyZero flag. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_UNIT"
      ],
      "begin_line": 148,
      "end_line": 149,
      "comment": " The default tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VERTICAL_TICK_LABELS"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The default setting for the vertical tick labels flag. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeType"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " \r\n     * The range type (can be used to force the axis to display only positive\r\n     * values or only negative values).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeIncludesZero"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\r\n     * A flag that affects the axis range when the range is determined\r\n     * automatically.  If the auto range does NOT include zero and this flag\r\n     * is TRUE, then the range is changed to include zero.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeStickyZero"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": "\r\n     * A flag that affects the size of the margins added to the axis range when\r\n     * the range is determined automatically.  If the value 0 falls within the\r\n     * margin and this flag is TRUE, then the margin is truncated at zero.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The tick unit for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatOverride"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The override number format. "
    },
    {
      "type": "field",
      "varNames": [
        "markerBand"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " An optional band for marking regions on the axis. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberAxis.NumberAxis()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberAxis.NumberAxis(java.lang.String)",
      "begin_line": 195,
      "end_line": 203,
      "comment": "\r\n     * Constructs a number axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 197,col 40)",
        "(line 198,col 9)-(line 198,col 70)",
        "(line 199,col 9)-(line 199,col 66)",
        "(line 200,col 9)-(line 200,col 42)",
        "(line 201,col 9)-(line 201,col 41)",
        "(line 202,col 9)-(line 202,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getRangeType()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the axis range type.\r\n     * \r\n     * @return The axis range type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeType(RangeType)\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setRangeType(org.jfree.data.RangeType)",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\r\n     * Sets the axis range type.\r\n     * \r\n     * @param rangeType  the range type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeType()\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 35)",
        "(line 228,col 9)-(line 228,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getAutoRangeIncludesZero()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the flag that indicates whether or not the automatic axis range\r\n     * (if indeed it is determined automatically) is forced to include zero.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setAutoRangeIncludesZero(boolean)",
      "begin_line": 254,
      "end_line": 262,
      "comment": "\r\n     * Sets the flag that indicates whether or not the axis range, if \r\n     * automatically calculated, is forced to include zero.\r\n     * \u003cp\u003e\r\n     * If the flag is changed to \u003ccode\u003etrue\u003c/code\u003e, the axis range is \r\n     * recalculated.\r\n     * \u003cp\u003e\r\n     * Any change to the flag will trigger an {@link AxisChangeEvent}.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #getAutoRangeIncludesZero()\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getAutoRangeStickyZero()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\r\n     * Returns a flag that affects the auto-range when zero falls outside the\r\n     * data range but inside the margins defined for the axis.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setAutoRangeStickyZero(boolean)\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setAutoRangeStickyZero(boolean)",
      "begin_line": 284,
      "end_line": 292,
      "comment": "\r\n     * Sets a flag that affects the auto-range when zero falls outside the data\r\n     * range but inside the margins defined for the axis.\r\n     *\r\n     * @param flag  the new flag.\r\n     * \r\n     * @see #getAutoRangeStickyZero()\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getTickUnit()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the tick unit for the axis.  \r\n     * \u003cp\u003e\r\n     * Note: if the \u003ccode\u003eautoTickUnitSelection\u003c/code\u003e flag is \r\n     * \u003ccode\u003etrue\u003c/code\u003e the tick unit may be changed while the axis is being \r\n     * drawn, so in that case the return value from this method may be\r\n     * irrelevant if the method is called before the axis has been drawn.\r\n     *\r\n     * @return The tick unit for the axis.\r\n     * \r\n     * @see #setTickUnit(NumberTickUnit)\r\n     * @see ValueAxis#isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\r\n     * Sets the tick unit for the axis and sends an {@link AxisChangeEvent} to \r\n     * all registered listeners.  A side effect of calling this method is that\r\n     * the \"auto-select\" feature for tick units is switched off (you can \r\n     * restore it using the {@link ValueAxis#setAutoTickUnitSelection(boolean)}\r\n     * method).\r\n     *\r\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickUnit()\r\n     * @see #setTickUnit(NumberTickUnit, boolean, boolean)\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit, boolean, boolean)",
      "begin_line": 339,
      "end_line": 353,
      "comment": "\r\n     * Sets the tick unit for the axis and, if requested, sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  In addition, an \r\n     * option is provided to turn off the \"auto-select\" feature for tick units \r\n     * (you can restore it using the \r\n     * {@link ValueAxis#setAutoTickUnitSelection(boolean)} method).\r\n     *\r\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * @param turnOffAutoSelect  turn off the auto-tick selection?\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getNumberFormatOverride()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\r\n     * Returns the number format override.  If this is non-null, then it will \r\n     * be used to format the numbers on the axis.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNumberFormatOverride(NumberFormat)\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setNumberFormatOverride(java.text.NumberFormat)",
      "begin_line": 375,
      "end_line": 378,
      "comment": "\r\n     * Sets the number format override.  If this is non-null, then it will be \r\n     * used to format the numbers on the axis.\r\n     *\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getNumberFormatOverride()\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 46)",
        "(line 377,col 9)-(line 377,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getMarkerBand()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\r\n     * Returns the (optional) marker band for the axis.\r\n     *\r\n     * @return The marker band (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setMarkerBand(MarkerAxisBand)\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setMarkerBand(org.jfree.chart.axis.MarkerAxisBand)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\r\n     * Sets the marker band for the axis.\r\n     * \u003cP\u003e\r\n     * The marker band is optional, leave it set to \u003ccode\u003enull\u003c/code\u003e if you \r\n     * don\u0027t require it.\r\n     *\r\n     * @param band the new band (\u003ccode\u003enull\u003ccode\u003e permitted).\r\n     * \r\n     * @see #getMarkerBand()\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 31)",
        "(line 403,col 9)-(line 403,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.configure()",
      "begin_line": 410,
      "end_line": 414,
      "comment": "\r\n     * Configures the axis to work with the specified plot.  If the axis has\r\n     * auto-scaling, then sets the maximum and minimum values.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.autoAdjustRange()",
      "begin_line": 419,
      "end_line": 505,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 30)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 521,
      "end_line": 547,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that the\r\n     * axis runs along one edge of the specified dataArea.\r\n     * \u003cp\u003e\r\n     * Note that it is possible for the coordinate to fall outside the plotArea.\r\n     *\r\n     * @param value  the data value.\r\n     * @param area  the area for plotting the data.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     * \r\n     * @see #java2DToValue(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 33)",
        "(line 525,col 9)-(line 525,col 47)",
        "(line 526,col 9)-(line 526,col 47)",
        "(line 528,col 9)-(line 528,col 25)",
        "(line 529,col 9)-(line 529,col 25)",
        "(line 530,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 561,
      "end_line": 587,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data value,\r\n     * assuming that the axis runs along one edge of the specified dataArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the area in which the data is plotted.\r\n     * @param edge  the location.\r\n     *\r\n     * @return The data value.\r\n     * \r\n     * @see #valueToJava2D(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 33)",
        "(line 565,col 9)-(line 565,col 47)",
        "(line 566,col 9)-(line 566,col 47)",
        "(line 568,col 9)-(line 568,col 25)",
        "(line 569,col 9)-(line 569,col 25)",
        "(line 570,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.calculateLowestVisibleTickValue()",
      "begin_line": 596,
      "end_line": 602,
      "comment": "\r\n     * Calculates the value of the lowest visible tick on the axis.\r\n     *\r\n     * @return The value of the lowest visible tick on the axis.\r\n     * \r\n     * @see #calculateHighestVisibleTickValue()\r\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 46)",
        "(line 599,col 9)-(line 599,col 68)",
        "(line 600,col 9)-(line 600,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.calculateHighestVisibleTickValue()",
      "begin_line": 611,
      "end_line": 617,
      "comment": "\r\n     * Calculates the value of the highest visible tick on the axis.\r\n     *\r\n     * @return The value of the highest visible tick on the axis.\r\n     * \r\n     * @see #calculateLowestVisibleTickValue()\r\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 46)",
        "(line 614,col 9)-(line 614,col 69)",
        "(line 615,col 9)-(line 615,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.calculateVisibleTickCount()",
      "begin_line": 624,
      "end_line": 631,
      "comment": "\r\n     * Calculates the number of visible ticks.\r\n     *\r\n     * @return The number of visible ticks on the axis.\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 46)",
        "(line 627,col 9)-(line 627,col 33)",
        "(line 628,col 9)-(line 629,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 649,
      "end_line": 685,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axes and data should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the data should be drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 31)",
        "(line 658,col 9)-(line 665,col 9)",
        "(line 668,col 9)-(line 669,col 27)",
        "(line 680,col 9)-(line 681,col 27)",
        "(line 683,col 9)-(line 683,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createStandardTickUnits()",
      "begin_line": 699,
      "end_line": 778,
      "comment": "\r\n     * Creates the standard tick units.\r\n     * \u003cP\u003e\r\n     * If you don\u0027t like these defaults, create your own instance of TickUnits\r\n     * and then pass it to the setStandardTickUnits() method in the\r\n     * NumberAxis class.\r\n     *\r\n     * @return The standard tick units.\r\n     * \r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     * @see #createIntegerTickUnits()\r\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 42)",
        "(line 702,col 9)-(line 702,col 60)",
        "(line 703,col 9)-(line 703,col 59)",
        "(line 704,col 9)-(line 704,col 58)",
        "(line 705,col 9)-(line 705,col 57)",
        "(line 706,col 9)-(line 706,col 56)",
        "(line 707,col 9)-(line 707,col 55)",
        "(line 708,col 9)-(line 708,col 54)",
        "(line 709,col 9)-(line 709,col 53)",
        "(line 710,col 9)-(line 710,col 55)",
        "(line 711,col 9)-(line 711,col 59)",
        "(line 712,col 9)-(line 712,col 64)",
        "(line 716,col 9)-(line 716,col 54)",
        "(line 717,col 9)-(line 717,col 53)",
        "(line 718,col 9)-(line 718,col 52)",
        "(line 719,col 9)-(line 719,col 51)",
        "(line 720,col 9)-(line 720,col 50)",
        "(line 721,col 9)-(line 721,col 49)",
        "(line 722,col 9)-(line 722,col 48)",
        "(line 723,col 9)-(line 723,col 46)",
        "(line 724,col 9)-(line 724,col 47)",
        "(line 725,col 9)-(line 725,col 48)",
        "(line 726,col 9)-(line 726,col 49)",
        "(line 727,col 9)-(line 727,col 50)",
        "(line 728,col 9)-(line 728,col 51)",
        "(line 729,col 9)-(line 729,col 52)",
        "(line 730,col 9)-(line 730,col 53)",
        "(line 731,col 9)-(line 731,col 54)",
        "(line 732,col 9)-(line 732,col 56)",
        "(line 733,col 9)-(line 733,col 59)",
        "(line 734,col 9)-(line 734,col 60)",
        "(line 736,col 9)-(line 736,col 55)",
        "(line 737,col 9)-(line 737,col 54)",
        "(line 738,col 9)-(line 738,col 53)",
        "(line 739,col 9)-(line 739,col 52)",
        "(line 740,col 9)-(line 740,col 51)",
        "(line 741,col 9)-(line 741,col 50)",
        "(line 742,col 9)-(line 742,col 49)",
        "(line 743,col 9)-(line 743,col 48)",
        "(line 744,col 9)-(line 744,col 47)",
        "(line 745,col 9)-(line 745,col 48)",
        "(line 746,col 9)-(line 746,col 49)",
        "(line 747,col 9)-(line 747,col 50)",
        "(line 748,col 9)-(line 748,col 51)",
        "(line 749,col 9)-(line 749,col 52)",
        "(line 750,col 9)-(line 750,col 53)",
        "(line 751,col 9)-(line 751,col 54)",
        "(line 752,col 9)-(line 752,col 58)",
        "(line 753,col 9)-(line 753,col 59)",
        "(line 754,col 9)-(line 754,col 60)",
        "(line 756,col 9)-(line 756,col 54)",
        "(line 757,col 9)-(line 757,col 53)",
        "(line 758,col 9)-(line 758,col 52)",
        "(line 759,col 9)-(line 759,col 51)",
        "(line 760,col 9)-(line 760,col 50)",
        "(line 761,col 9)-(line 761,col 49)",
        "(line 762,col 9)-(line 762,col 48)",
        "(line 763,col 9)-(line 763,col 47)",
        "(line 764,col 9)-(line 764,col 48)",
        "(line 765,col 9)-(line 765,col 49)",
        "(line 766,col 9)-(line 766,col 50)",
        "(line 767,col 9)-(line 767,col 51)",
        "(line 768,col 9)-(line 768,col 52)",
        "(line 769,col 9)-(line 769,col 53)",
        "(line 770,col 9)-(line 770,col 54)",
        "(line 771,col 9)-(line 771,col 55)",
        "(line 772,col 9)-(line 772,col 57)",
        "(line 773,col 9)-(line 773,col 58)",
        "(line 774,col 9)-(line 774,col 59)",
        "(line 776,col 9)-(line 776,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createIntegerTickUnits()",
      "begin_line": 788,
      "end_line": 827,
      "comment": "\r\n     * Returns a collection of tick units for integer values.\r\n     *\r\n     * @return A collection of tick units for integer values.\r\n     * \r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     * @see #createStandardTickUnits()\r\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 42)",
        "(line 791,col 9)-(line 791,col 51)",
        "(line 792,col 9)-(line 792,col 55)",
        "(line 793,col 9)-(line 793,col 46)",
        "(line 794,col 9)-(line 794,col 46)",
        "(line 795,col 9)-(line 795,col 46)",
        "(line 796,col 9)-(line 796,col 47)",
        "(line 797,col 9)-(line 797,col 47)",
        "(line 798,col 9)-(line 798,col 47)",
        "(line 799,col 9)-(line 799,col 48)",
        "(line 800,col 9)-(line 800,col 48)",
        "(line 801,col 9)-(line 801,col 48)",
        "(line 802,col 9)-(line 802,col 49)",
        "(line 803,col 9)-(line 803,col 49)",
        "(line 804,col 9)-(line 804,col 49)",
        "(line 805,col 9)-(line 805,col 50)",
        "(line 806,col 9)-(line 806,col 50)",
        "(line 807,col 9)-(line 807,col 50)",
        "(line 808,col 9)-(line 808,col 51)",
        "(line 809,col 9)-(line 809,col 51)",
        "(line 810,col 9)-(line 810,col 51)",
        "(line 811,col 9)-(line 811,col 52)",
        "(line 812,col 9)-(line 812,col 52)",
        "(line 813,col 9)-(line 813,col 52)",
        "(line 814,col 9)-(line 814,col 53)",
        "(line 815,col 9)-(line 815,col 53)",
        "(line 816,col 9)-(line 816,col 53)",
        "(line 817,col 9)-(line 817,col 54)",
        "(line 818,col 9)-(line 818,col 54)",
        "(line 819,col 9)-(line 819,col 54)",
        "(line 820,col 9)-(line 820,col 55)",
        "(line 821,col 9)-(line 821,col 55)",
        "(line 822,col 9)-(line 822,col 57)",
        "(line 823,col 9)-(line 823,col 58)",
        "(line 825,col 9)-(line 825,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createStandardTickUnits(java.util.Locale)",
      "begin_line": 844,
      "end_line": 911,
      "comment": "\r\n     * Creates a collection of standard tick units.  The supplied locale is \r\n     * used to create the number formatter (a localised instance of \r\n     * \u003ccode\u003eNumberFormat\u003c/code\u003e).\r\n     * \u003cP\u003e\r\n     * If you don\u0027t like these defaults, create your own instance of \r\n     * {@link TickUnits} and then pass it to the \r\n     * \u003ccode\u003esetStandardTickUnits()\u003c/code\u003e method.\r\n     *\r\n     * @param locale  the locale.\r\n     *\r\n     * @return A tick unit collection.\r\n     * \r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 42)",
        "(line 848,col 9)-(line 848,col 75)",
        "(line 852,col 9)-(line 852,col 66)",
        "(line 853,col 9)-(line 853,col 66)",
        "(line 854,col 9)-(line 854,col 66)",
        "(line 855,col 9)-(line 855,col 66)",
        "(line 856,col 9)-(line 856,col 66)",
        "(line 857,col 9)-(line 857,col 66)",
        "(line 858,col 9)-(line 858,col 66)",
        "(line 859,col 9)-(line 859,col 66)",
        "(line 860,col 9)-(line 860,col 66)",
        "(line 861,col 9)-(line 861,col 66)",
        "(line 862,col 9)-(line 862,col 66)",
        "(line 863,col 9)-(line 863,col 66)",
        "(line 864,col 9)-(line 864,col 66)",
        "(line 865,col 9)-(line 865,col 66)",
        "(line 866,col 9)-(line 866,col 66)",
        "(line 867,col 9)-(line 867,col 66)",
        "(line 868,col 9)-(line 868,col 66)",
        "(line 869,col 9)-(line 869,col 69)",
        "(line 871,col 9)-(line 871,col 66)",
        "(line 872,col 9)-(line 872,col 66)",
        "(line 873,col 9)-(line 873,col 66)",
        "(line 874,col 9)-(line 874,col 66)",
        "(line 875,col 9)-(line 875,col 66)",
        "(line 876,col 9)-(line 876,col 66)",
        "(line 877,col 9)-(line 877,col 66)",
        "(line 878,col 9)-(line 878,col 66)",
        "(line 879,col 9)-(line 879,col 66)",
        "(line 880,col 9)-(line 880,col 66)",
        "(line 881,col 9)-(line 881,col 66)",
        "(line 882,col 9)-(line 882,col 66)",
        "(line 883,col 9)-(line 883,col 66)",
        "(line 884,col 9)-(line 884,col 66)",
        "(line 885,col 9)-(line 885,col 66)",
        "(line 886,col 9)-(line 886,col 66)",
        "(line 887,col 9)-(line 887,col 68)",
        "(line 888,col 9)-(line 888,col 69)",
        "(line 890,col 9)-(line 890,col 66)",
        "(line 891,col 9)-(line 891,col 66)",
        "(line 892,col 9)-(line 892,col 66)",
        "(line 893,col 9)-(line 893,col 66)",
        "(line 894,col 9)-(line 894,col 66)",
        "(line 895,col 9)-(line 895,col 66)",
        "(line 896,col 9)-(line 896,col 66)",
        "(line 897,col 9)-(line 897,col 66)",
        "(line 898,col 9)-(line 898,col 66)",
        "(line 899,col 9)-(line 899,col 66)",
        "(line 900,col 9)-(line 900,col 66)",
        "(line 901,col 9)-(line 901,col 66)",
        "(line 902,col 9)-(line 902,col 66)",
        "(line 903,col 9)-(line 903,col 66)",
        "(line 904,col 9)-(line 904,col 66)",
        "(line 905,col 9)-(line 905,col 66)",
        "(line 906,col 9)-(line 906,col 66)",
        "(line 907,col 9)-(line 907,col 67)",
        "(line 909,col 9)-(line 909,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(java.util.Locale)",
      "begin_line": 923,
      "end_line": 963,
      "comment": "\r\n     * Returns a collection of tick units for integer values.\r\n     * Uses a given Locale to create the DecimalFormats.\r\n     *\r\n     * @param locale the locale to use to represent Numbers.\r\n     *\r\n     * @return A collection of tick units for integer values.\r\n     * \r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 42)",
        "(line 927,col 9)-(line 927,col 75)",
        "(line 929,col 9)-(line 929,col 68)",
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
        "(line 945,col 9)-(line 945,col 68)",
        "(line 946,col 9)-(line 946,col 68)",
        "(line 947,col 9)-(line 947,col 68)",
        "(line 948,col 9)-(line 948,col 68)",
        "(line 949,col 9)-(line 949,col 68)",
        "(line 950,col 9)-(line 950,col 68)",
        "(line 951,col 9)-(line 951,col 68)",
        "(line 952,col 9)-(line 952,col 68)",
        "(line 953,col 9)-(line 953,col 68)",
        "(line 954,col 9)-(line 954,col 68)",
        "(line 955,col 9)-(line 955,col 68)",
        "(line 956,col 9)-(line 956,col 68)",
        "(line 957,col 9)-(line 957,col 68)",
        "(line 958,col 9)-(line 958,col 68)",
        "(line 959,col 9)-(line 959,col 68)",
        "(line 961,col 9)-(line 961,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D)",
      "begin_line": 972,
      "end_line": 982,
      "comment": "\r\n     * Estimates the maximum tick label height.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The maximum height.\r\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 63)",
        "(line 975,col 9)-(line 975,col 79)",
        "(line 977,col 9)-(line 977,col 48)",
        "(line 978,col 9)-(line 978,col 58)",
        "(line 979,col 9)-(line 979,col 71)",
        "(line 980,col 9)-(line 980,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.TickUnit)",
      "begin_line": 997,
      "end_line": 1034,
      "comment": "\r\n     * Estimates the maximum width of the tick labels, assuming the specified \r\n     * tick unit is used.\r\n     * \u003cP\u003e\r\n     * Rather than computing the string bounds of every tick on the axis, we \r\n     * just look at two values: the lower bound and the upper bound for the \r\n     * axis.  These two values will usually be representative.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param unit  the tick unit to use for calculation.\r\n     *\r\n     * @return The estimated maximum width of the tick labels.\r\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 63)",
        "(line 1001,col 9)-(line 1001,col 79)",
        "(line 1003,col 9)-(line 1030,col 9)",
        "(line 1032,col 9)-(line 1032,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1045,
      "end_line": 1056,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1054,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1067,
      "end_line": 1094,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1073,col 10)",
        "(line 1076,col 9)-(line 1076,col 58)",
        "(line 1077,col 9)-(line 1077,col 69)",
        "(line 1078,col 9)-(line 1078,col 76)",
        "(line 1081,col 9)-(line 1081,col 71)",
        "(line 1083,col 9)-(line 1084,col 67)",
        "(line 1085,col 9)-(line 1085,col 76)",
        "(line 1087,col 9)-(line 1087,col 66)",
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1092,col 9)-(line 1092,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1105,
      "end_line": 1130,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 68)",
        "(line 1112,col 9)-(line 1112,col 58)",
        "(line 1113,col 9)-(line 1113,col 69)",
        "(line 1114,col 9)-(line 1114,col 76)",
        "(line 1117,col 9)-(line 1117,col 72)",
        "(line 1119,col 9)-(line 1120,col 67)",
        "(line 1121,col 9)-(line 1121,col 77)",
        "(line 1123,col 9)-(line 1123,col 61)",
        "(line 1124,col 9)-(line 1126,col 9)",
        "(line 1128,col 9)-(line 1128,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1144,
      "end_line": 1158,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return A list of ticks.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 1149,col 9)-(line 1149,col 48)",
        "(line 1150,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1170,
      "end_line": 1229,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data should be drawn.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 48)",
        "(line 1176,col 9)-(line 1176,col 48)",
        "(line 1177,col 9)-(line 1177,col 34)",
        "(line 1179,col 9)-(line 1181,col 9)",
        "(line 1183,col 9)-(line 1183,col 46)",
        "(line 1184,col 9)-(line 1184,col 48)",
        "(line 1185,col 9)-(line 1185,col 67)",
        "(line 1187,col 9)-(line 1226,col 9)",
        "(line 1227,col 9)-(line 1227,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1242,
      "end_line": 1306,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return A list of ticks.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 48)",
        "(line 1247,col 9)-(line 1247,col 23)",
        "(line 1249,col 9)-(line 1249,col 48)",
        "(line 1250,col 9)-(line 1250,col 34)",
        "(line 1251,col 9)-(line 1253,col 9)",
        "(line 1255,col 9)-(line 1255,col 46)",
        "(line 1256,col 9)-(line 1256,col 48)",
        "(line 1257,col 9)-(line 1257,col 67)",
        "(line 1259,col 9)-(line 1303,col 9)",
        "(line 1304,col 9)-(line 1304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.clone()",
      "begin_line": 1316,
      "end_line": 1323,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     * \r\n     * @return A clone\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the axis does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 54)",
        "(line 1318,col 9)-(line 1321,col 9)",
        "(line 1322,col 9)-(line 1322,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.equals(java.lang.Object)",
      "begin_line": 1332,
      "end_line": 1360,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1342,col 43)",
        "(line 1343,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1351,col 9)",
        "(line 1352,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.hashCode()",
      "begin_line": 1367,
      "end_line": 1374,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1373,col 9)"
      ]
    }
  ]
}