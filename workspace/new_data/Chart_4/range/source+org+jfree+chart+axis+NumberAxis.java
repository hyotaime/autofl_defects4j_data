{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/NumberAxis.java",
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
      "begin_line": 141,
      "end_line": 1413,
      "comment": "\r\n * An axis for displaying numerical data.\r\n * \u003cP\u003e\r\n * If the axis is set up to automatically determine its range to fit the data,\r\n * you can ensure that the range includes zero (statisticians usually prefer\r\n * this) by setting the \u003ccode\u003eautoRangeIncludesZero\u003c/code\u003e flag to\r\n * \u003ccode\u003etrue\u003c/code\u003e.\r\n * \u003cP\u003e\r\n * The \u003ccode\u003eNumberAxis\u003c/code\u003e class has a mechanism for automatically\r\n * selecting a tick unit that is appropriate for the current axis range.  This\r\n * mechanism is an adaptation of code suggested by Laurence Vanhelsuwe.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_INCLUDES_ZERO"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The default value for the autoRangeIncludesZero flag. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_STICKY_ZERO"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The default value for the autoRangeStickyZero flag. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_UNIT"
      ],
      "begin_line": 153,
      "end_line": 154,
      "comment": " The default tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VERTICAL_TICK_LABELS"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The default setting for the vertical tick labels flag. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeType"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\r\n     * The range type (can be used to force the axis to display only positive\r\n     * values or only negative values).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeIncludesZero"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\r\n     * A flag that affects the axis range when the range is determined\r\n     * automatically.  If the auto range does NOT include zero and this flag\r\n     * is TRUE, then the range is changed to include zero.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeStickyZero"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": "\r\n     * A flag that affects the size of the margins added to the axis range when\r\n     * the range is determined automatically.  If the value 0 falls within the\r\n     * margin and this flag is TRUE, then the margin is truncated at zero.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The tick unit for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatOverride"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The override number format. "
    },
    {
      "type": "field",
      "varNames": [
        "markerBand"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " An optional band for marking regions on the axis. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberAxis.NumberAxis()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.NumberAxis.NumberAxis(java.lang.String)",
      "begin_line": 200,
      "end_line": 208,
      "comment": "\r\n     * Constructs a number axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 203,col 70)",
        "(line 204,col 9)-(line 204,col 66)",
        "(line 205,col 9)-(line 205,col 42)",
        "(line 206,col 9)-(line 206,col 41)",
        "(line 207,col 9)-(line 207,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getRangeType()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns the axis range type.\r\n     *\r\n     * @return The axis range type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeType(RangeType)\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setRangeType(org.jfree.data.RangeType)",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\r\n     * Sets the axis range type.\r\n     *\r\n     * @param rangeType  the range type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeType()\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 35)",
        "(line 233,col 9)-(line 233,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getAutoRangeIncludesZero()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the flag that indicates whether or not the automatic axis range\r\n     * (if indeed it is determined automatically) is forced to include zero.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setAutoRangeIncludesZero(boolean)",
      "begin_line": 259,
      "end_line": 267,
      "comment": "\r\n     * Sets the flag that indicates whether or not the axis range, if\r\n     * automatically calculated, is forced to include zero.\r\n     * \u003cp\u003e\r\n     * If the flag is changed to \u003ccode\u003etrue\u003c/code\u003e, the axis range is\r\n     * recalculated.\r\n     * \u003cp\u003e\r\n     * Any change to the flag will trigger an {@link AxisChangeEvent}.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #getAutoRangeIncludesZero()\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getAutoRangeStickyZero()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\r\n     * Returns a flag that affects the auto-range when zero falls outside the\r\n     * data range but inside the margins defined for the axis.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setAutoRangeStickyZero(boolean)\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setAutoRangeStickyZero(boolean)",
      "begin_line": 289,
      "end_line": 297,
      "comment": "\r\n     * Sets a flag that affects the auto-range when zero falls outside the data\r\n     * range but inside the margins defined for the axis.\r\n     *\r\n     * @param flag  the new flag.\r\n     *\r\n     * @see #getAutoRangeStickyZero()\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getTickUnit()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\r\n     * Returns the tick unit for the axis.\r\n     * \u003cp\u003e\r\n     * Note: if the \u003ccode\u003eautoTickUnitSelection\u003c/code\u003e flag is\r\n     * \u003ccode\u003etrue\u003c/code\u003e the tick unit may be changed while the axis is being\r\n     * drawn, so in that case the return value from this method may be\r\n     * irrelevant if the method is called before the axis has been drawn.\r\n     *\r\n     * @return The tick unit for the axis.\r\n     *\r\n     * @see #setTickUnit(NumberTickUnit)\r\n     * @see ValueAxis#isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\r\n     * Sets the tick unit for the axis and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.  A side effect of calling this method is that\r\n     * the \"auto-select\" feature for tick units is switched off (you can\r\n     * restore it using the {@link ValueAxis#setAutoTickUnitSelection(boolean)}\r\n     * method).\r\n     *\r\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickUnit()\r\n     * @see #setTickUnit(NumberTickUnit, boolean, boolean)\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setTickUnit(org.jfree.chart.axis.NumberTickUnit, boolean, boolean)",
      "begin_line": 344,
      "end_line": 358,
      "comment": "\r\n     * Sets the tick unit for the axis and, if requested, sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  In addition, an\r\n     * option is provided to turn off the \"auto-select\" feature for tick units\r\n     * (you can restore it using the\r\n     * {@link ValueAxis#setAutoTickUnitSelection(boolean)} method).\r\n     *\r\n     * @param unit  the new tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * @param turnOffAutoSelect  turn off the auto-tick selection?\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 29)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getNumberFormatOverride()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\r\n     * Returns the number format override.  If this is non-null, then it will\r\n     * be used to format the numbers on the axis.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNumberFormatOverride(NumberFormat)\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setNumberFormatOverride(java.text.NumberFormat)",
      "begin_line": 380,
      "end_line": 383,
      "comment": "\r\n     * Sets the number format override.  If this is non-null, then it will be\r\n     * used to format the numbers on the axis.\r\n     *\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getNumberFormatOverride()\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 46)",
        "(line 382,col 9)-(line 382,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.getMarkerBand()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\r\n     * Returns the (optional) marker band for the axis.\r\n     *\r\n     * @return The marker band (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setMarkerBand(MarkerAxisBand)\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.setMarkerBand(org.jfree.chart.axis.MarkerAxisBand)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\r\n     * Sets the marker band for the axis.\r\n     * \u003cP\u003e\r\n     * The marker band is optional, leave it set to \u003ccode\u003enull\u003c/code\u003e if you\r\n     * don\u0027t require it.\r\n     *\r\n     * @param band the new band (\u003ccode\u003enull\u003ccode\u003e permitted).\r\n     *\r\n     * @see #getMarkerBand()\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 31)",
        "(line 408,col 9)-(line 408,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.configure()",
      "begin_line": 415,
      "end_line": 419,
      "comment": "\r\n     * Configures the axis to work with the specified plot.  If the axis has\r\n     * auto-scaling, then sets the maximum and minimum values.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.autoAdjustRange()",
      "begin_line": 424,
      "end_line": 510,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 30)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 431,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 526,
      "end_line": 552,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that the\r\n     * axis runs along one edge of the specified dataArea.\r\n     * \u003cp\u003e\r\n     * Note that it is possible for the coordinate to fall outside the plotArea.\r\n     *\r\n     * @param value  the data value.\r\n     * @param area  the area for plotting the data.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     *\r\n     * @see #java2DToValue(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 33)",
        "(line 530,col 9)-(line 530,col 47)",
        "(line 531,col 9)-(line 531,col 47)",
        "(line 533,col 9)-(line 533,col 25)",
        "(line 534,col 9)-(line 534,col 25)",
        "(line 535,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 550,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 566,
      "end_line": 592,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data value,\r\n     * assuming that the axis runs along one edge of the specified dataArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the area in which the data is plotted.\r\n     * @param edge  the location.\r\n     *\r\n     * @return The data value.\r\n     *\r\n     * @see #valueToJava2D(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 33)",
        "(line 570,col 9)-(line 570,col 47)",
        "(line 571,col 9)-(line 571,col 47)",
        "(line 573,col 9)-(line 573,col 25)",
        "(line 574,col 9)-(line 574,col 25)",
        "(line 575,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 590,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.calculateLowestVisibleTickValue()",
      "begin_line": 601,
      "end_line": 607,
      "comment": "\r\n     * Calculates the value of the lowest visible tick on the axis.\r\n     *\r\n     * @return The value of the lowest visible tick on the axis.\r\n     *\r\n     * @see #calculateHighestVisibleTickValue()\r\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 46)",
        "(line 604,col 9)-(line 604,col 68)",
        "(line 605,col 9)-(line 605,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.calculateHighestVisibleTickValue()",
      "begin_line": 616,
      "end_line": 622,
      "comment": "\r\n     * Calculates the value of the highest visible tick on the axis.\r\n     *\r\n     * @return The value of the highest visible tick on the axis.\r\n     *\r\n     * @see #calculateLowestVisibleTickValue()\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 46)",
        "(line 619,col 9)-(line 619,col 69)",
        "(line 620,col 9)-(line 620,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.calculateVisibleTickCount()",
      "begin_line": 629,
      "end_line": 636,
      "comment": "\r\n     * Calculates the number of visible ticks.\r\n     *\r\n     * @return The number of visible ticks on the axis.\r\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 46)",
        "(line 632,col 9)-(line 632,col 33)",
        "(line 633,col 9)-(line 634,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 654,
      "end_line": 687,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axes and data should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the data should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 31)",
        "(line 660,col 9)-(line 667,col 9)",
        "(line 670,col 9)-(line 671,col 27)",
        "(line 682,col 9)-(line 683,col 27)",
        "(line 684,col 9)-(line 684,col 69)",
        "(line 685,col 9)-(line 685,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createStandardTickUnits()",
      "begin_line": 701,
      "end_line": 780,
      "comment": "\r\n     * Creates the standard tick units.\r\n     * \u003cP\u003e\r\n     * If you don\u0027t like these defaults, create your own instance of TickUnits\r\n     * and then pass it to the setStandardTickUnits() method in the\r\n     * NumberAxis class.\r\n     *\r\n     * @return The standard tick units.\r\n     *\r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     * @see #createIntegerTickUnits()\r\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 42)",
        "(line 704,col 9)-(line 704,col 60)",
        "(line 705,col 9)-(line 705,col 59)",
        "(line 706,col 9)-(line 706,col 58)",
        "(line 707,col 9)-(line 707,col 57)",
        "(line 708,col 9)-(line 708,col 56)",
        "(line 709,col 9)-(line 709,col 55)",
        "(line 710,col 9)-(line 710,col 54)",
        "(line 711,col 9)-(line 711,col 53)",
        "(line 712,col 9)-(line 712,col 55)",
        "(line 713,col 9)-(line 713,col 59)",
        "(line 714,col 9)-(line 714,col 64)",
        "(line 718,col 9)-(line 718,col 57)",
        "(line 719,col 9)-(line 719,col 56)",
        "(line 720,col 9)-(line 720,col 55)",
        "(line 721,col 9)-(line 721,col 54)",
        "(line 722,col 9)-(line 722,col 53)",
        "(line 723,col 9)-(line 723,col 52)",
        "(line 724,col 9)-(line 724,col 51)",
        "(line 725,col 9)-(line 725,col 49)",
        "(line 726,col 9)-(line 726,col 50)",
        "(line 727,col 9)-(line 727,col 51)",
        "(line 728,col 9)-(line 728,col 52)",
        "(line 729,col 9)-(line 729,col 53)",
        "(line 730,col 9)-(line 730,col 54)",
        "(line 731,col 9)-(line 731,col 55)",
        "(line 732,col 9)-(line 732,col 56)",
        "(line 733,col 9)-(line 733,col 57)",
        "(line 734,col 9)-(line 734,col 59)",
        "(line 735,col 9)-(line 735,col 62)",
        "(line 736,col 9)-(line 736,col 63)",
        "(line 738,col 9)-(line 738,col 58)",
        "(line 739,col 9)-(line 739,col 57)",
        "(line 740,col 9)-(line 740,col 56)",
        "(line 741,col 9)-(line 741,col 55)",
        "(line 742,col 9)-(line 742,col 54)",
        "(line 743,col 9)-(line 743,col 53)",
        "(line 744,col 9)-(line 744,col 52)",
        "(line 745,col 9)-(line 745,col 51)",
        "(line 746,col 9)-(line 746,col 50)",
        "(line 747,col 9)-(line 747,col 51)",
        "(line 748,col 9)-(line 748,col 52)",
        "(line 749,col 9)-(line 749,col 53)",
        "(line 750,col 9)-(line 750,col 54)",
        "(line 751,col 9)-(line 751,col 55)",
        "(line 752,col 9)-(line 752,col 56)",
        "(line 753,col 9)-(line 753,col 57)",
        "(line 754,col 9)-(line 754,col 61)",
        "(line 755,col 9)-(line 755,col 62)",
        "(line 756,col 9)-(line 756,col 63)",
        "(line 758,col 9)-(line 758,col 57)",
        "(line 759,col 9)-(line 759,col 56)",
        "(line 760,col 9)-(line 760,col 55)",
        "(line 761,col 9)-(line 761,col 54)",
        "(line 762,col 9)-(line 762,col 53)",
        "(line 763,col 9)-(line 763,col 52)",
        "(line 764,col 9)-(line 764,col 51)",
        "(line 765,col 9)-(line 765,col 50)",
        "(line 766,col 9)-(line 766,col 51)",
        "(line 767,col 9)-(line 767,col 52)",
        "(line 768,col 9)-(line 768,col 53)",
        "(line 769,col 9)-(line 769,col 54)",
        "(line 770,col 9)-(line 770,col 55)",
        "(line 771,col 9)-(line 771,col 56)",
        "(line 772,col 9)-(line 772,col 57)",
        "(line 773,col 9)-(line 773,col 58)",
        "(line 774,col 9)-(line 774,col 60)",
        "(line 775,col 9)-(line 775,col 61)",
        "(line 776,col 9)-(line 776,col 62)",
        "(line 778,col 9)-(line 778,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createIntegerTickUnits()",
      "begin_line": 790,
      "end_line": 826,
      "comment": "\r\n     * Returns a collection of tick units for integer values.\r\n     *\r\n     * @return A collection of tick units for integer values.\r\n     *\r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     * @see #createStandardTickUnits()\r\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 42)",
        "(line 792,col 9)-(line 792,col 51)",
        "(line 793,col 9)-(line 793,col 55)",
        "(line 794,col 9)-(line 794,col 49)",
        "(line 795,col 9)-(line 795,col 49)",
        "(line 796,col 9)-(line 796,col 49)",
        "(line 797,col 9)-(line 797,col 50)",
        "(line 798,col 9)-(line 798,col 50)",
        "(line 799,col 9)-(line 799,col 50)",
        "(line 800,col 9)-(line 800,col 51)",
        "(line 801,col 9)-(line 801,col 51)",
        "(line 802,col 9)-(line 802,col 51)",
        "(line 803,col 9)-(line 803,col 52)",
        "(line 804,col 9)-(line 804,col 52)",
        "(line 805,col 9)-(line 805,col 52)",
        "(line 806,col 9)-(line 806,col 53)",
        "(line 807,col 9)-(line 807,col 53)",
        "(line 808,col 9)-(line 808,col 53)",
        "(line 809,col 9)-(line 809,col 54)",
        "(line 810,col 9)-(line 810,col 54)",
        "(line 811,col 9)-(line 811,col 54)",
        "(line 812,col 9)-(line 812,col 55)",
        "(line 813,col 9)-(line 813,col 55)",
        "(line 814,col 9)-(line 814,col 55)",
        "(line 815,col 9)-(line 815,col 56)",
        "(line 816,col 9)-(line 816,col 56)",
        "(line 817,col 9)-(line 817,col 56)",
        "(line 818,col 9)-(line 818,col 57)",
        "(line 819,col 9)-(line 819,col 57)",
        "(line 820,col 9)-(line 820,col 57)",
        "(line 821,col 9)-(line 821,col 58)",
        "(line 822,col 9)-(line 822,col 58)",
        "(line 823,col 9)-(line 823,col 60)",
        "(line 824,col 9)-(line 824,col 61)",
        "(line 825,col 9)-(line 825,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createStandardTickUnits(java.util.Locale)",
      "begin_line": 843,
      "end_line": 908,
      "comment": "\r\n     * Creates a collection of standard tick units.  The supplied locale is\r\n     * used to create the number formatter (a localised instance of\r\n     * \u003ccode\u003eNumberFormat\u003c/code\u003e).\r\n     * \u003cP\u003e\r\n     * If you don\u0027t like these defaults, create your own instance of\r\n     * {@link TickUnits} and then pass it to the\r\n     * \u003ccode\u003esetStandardTickUnits()\u003c/code\u003e method.\r\n     *\r\n     * @param locale  the locale.\r\n     *\r\n     * @return A tick unit collection.\r\n     *\r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 42)",
        "(line 846,col 9)-(line 846,col 75)",
        "(line 849,col 9)-(line 849,col 66)",
        "(line 850,col 9)-(line 850,col 65)",
        "(line 851,col 9)-(line 851,col 64)",
        "(line 852,col 9)-(line 852,col 63)",
        "(line 853,col 9)-(line 853,col 62)",
        "(line 854,col 9)-(line 854,col 61)",
        "(line 855,col 9)-(line 855,col 60)",
        "(line 856,col 9)-(line 856,col 58)",
        "(line 857,col 9)-(line 857,col 59)",
        "(line 858,col 9)-(line 858,col 60)",
        "(line 859,col 9)-(line 859,col 61)",
        "(line 860,col 9)-(line 860,col 62)",
        "(line 861,col 9)-(line 861,col 63)",
        "(line 862,col 9)-(line 862,col 64)",
        "(line 863,col 9)-(line 863,col 65)",
        "(line 864,col 9)-(line 864,col 66)",
        "(line 865,col 9)-(line 865,col 67)",
        "(line 866,col 9)-(line 866,col 70)",
        "(line 868,col 9)-(line 868,col 67)",
        "(line 869,col 9)-(line 869,col 66)",
        "(line 870,col 9)-(line 870,col 65)",
        "(line 871,col 9)-(line 871,col 64)",
        "(line 872,col 9)-(line 872,col 63)",
        "(line 873,col 9)-(line 873,col 62)",
        "(line 874,col 9)-(line 874,col 61)",
        "(line 875,col 9)-(line 875,col 60)",
        "(line 876,col 9)-(line 876,col 59)",
        "(line 877,col 9)-(line 877,col 60)",
        "(line 878,col 9)-(line 878,col 61)",
        "(line 879,col 9)-(line 879,col 62)",
        "(line 880,col 9)-(line 880,col 63)",
        "(line 881,col 9)-(line 881,col 64)",
        "(line 882,col 9)-(line 882,col 65)",
        "(line 883,col 9)-(line 883,col 66)",
        "(line 884,col 9)-(line 884,col 69)",
        "(line 885,col 9)-(line 885,col 70)",
        "(line 887,col 9)-(line 887,col 66)",
        "(line 888,col 9)-(line 888,col 65)",
        "(line 889,col 9)-(line 889,col 64)",
        "(line 890,col 9)-(line 890,col 63)",
        "(line 891,col 9)-(line 891,col 62)",
        "(line 892,col 9)-(line 892,col 61)",
        "(line 893,col 9)-(line 893,col 60)",
        "(line 894,col 9)-(line 894,col 59)",
        "(line 895,col 9)-(line 895,col 60)",
        "(line 896,col 9)-(line 896,col 61)",
        "(line 897,col 9)-(line 897,col 62)",
        "(line 898,col 9)-(line 898,col 63)",
        "(line 899,col 9)-(line 899,col 64)",
        "(line 900,col 9)-(line 900,col 65)",
        "(line 901,col 9)-(line 901,col 66)",
        "(line 902,col 9)-(line 902,col 67)",
        "(line 903,col 9)-(line 903,col 68)",
        "(line 904,col 9)-(line 904,col 69)",
        "(line 906,col 9)-(line 906,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(java.util.Locale)",
      "begin_line": 920,
      "end_line": 955,
      "comment": "\r\n     * Returns a collection of tick units for integer values.\r\n     * Uses a given Locale to create the DecimalFormats.\r\n     *\r\n     * @param locale the locale to use to represent Numbers.\r\n     *\r\n     * @return A collection of tick units for integer values.\r\n     *\r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 42)",
        "(line 922,col 9)-(line 922,col 75)",
        "(line 923,col 9)-(line 923,col 58)",
        "(line 924,col 9)-(line 924,col 58)",
        "(line 925,col 9)-(line 925,col 58)",
        "(line 926,col 9)-(line 926,col 59)",
        "(line 927,col 9)-(line 927,col 59)",
        "(line 928,col 9)-(line 928,col 59)",
        "(line 929,col 9)-(line 929,col 60)",
        "(line 930,col 9)-(line 930,col 60)",
        "(line 931,col 9)-(line 931,col 60)",
        "(line 932,col 9)-(line 932,col 61)",
        "(line 933,col 9)-(line 933,col 61)",
        "(line 934,col 9)-(line 934,col 61)",
        "(line 935,col 9)-(line 935,col 62)",
        "(line 936,col 9)-(line 936,col 62)",
        "(line 937,col 9)-(line 937,col 62)",
        "(line 938,col 9)-(line 938,col 63)",
        "(line 939,col 9)-(line 939,col 63)",
        "(line 940,col 9)-(line 940,col 63)",
        "(line 941,col 9)-(line 941,col 64)",
        "(line 942,col 9)-(line 942,col 64)",
        "(line 943,col 9)-(line 943,col 64)",
        "(line 944,col 9)-(line 944,col 65)",
        "(line 945,col 9)-(line 945,col 65)",
        "(line 946,col 9)-(line 946,col 65)",
        "(line 947,col 9)-(line 947,col 66)",
        "(line 948,col 9)-(line 948,col 66)",
        "(line 949,col 9)-(line 949,col 66)",
        "(line 950,col 9)-(line 950,col 67)",
        "(line 951,col 9)-(line 951,col 67)",
        "(line 952,col 9)-(line 952,col 69)",
        "(line 953,col 9)-(line 953,col 70)",
        "(line 954,col 9)-(line 954,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D)",
      "begin_line": 964,
      "end_line": 974,
      "comment": "\r\n     * Estimates the maximum tick label height.\r\n     *\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The maximum height.\r\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 63)",
        "(line 967,col 9)-(line 967,col 79)",
        "(line 969,col 9)-(line 969,col 48)",
        "(line 970,col 9)-(line 970,col 58)",
        "(line 971,col 9)-(line 971,col 71)",
        "(line 972,col 9)-(line 972,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.TickUnit)",
      "begin_line": 989,
      "end_line": 1026,
      "comment": "\r\n     * Estimates the maximum width of the tick labels, assuming the specified\r\n     * tick unit is used.\r\n     * \u003cP\u003e\r\n     * Rather than computing the string bounds of every tick on the axis, we\r\n     * just look at two values: the lower bound and the upper bound for the\r\n     * axis.  These two values will usually be representative.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param unit  the tick unit to use for calculation.\r\n     *\r\n     * @return The estimated maximum width of the tick labels.\r\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 63)",
        "(line 993,col 9)-(line 993,col 79)",
        "(line 995,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1024,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1037,
      "end_line": 1048,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1046,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1059,
      "end_line": 1085,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1064,col 31)",
        "(line 1067,col 9)-(line 1067,col 58)",
        "(line 1068,col 9)-(line 1068,col 69)",
        "(line 1069,col 9)-(line 1069,col 76)",
        "(line 1072,col 9)-(line 1072,col 71)",
        "(line 1074,col 9)-(line 1075,col 23)",
        "(line 1076,col 9)-(line 1076,col 76)",
        "(line 1078,col 9)-(line 1078,col 66)",
        "(line 1079,col 9)-(line 1081,col 9)",
        "(line 1083,col 9)-(line 1083,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1096,
      "end_line": 1121,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 68)",
        "(line 1103,col 9)-(line 1103,col 58)",
        "(line 1104,col 9)-(line 1104,col 69)",
        "(line 1105,col 9)-(line 1105,col 76)",
        "(line 1108,col 9)-(line 1108,col 72)",
        "(line 1110,col 9)-(line 1111,col 67)",
        "(line 1112,col 9)-(line 1112,col 77)",
        "(line 1114,col 9)-(line 1114,col 61)",
        "(line 1115,col 9)-(line 1117,col 9)",
        "(line 1119,col 9)-(line 1119,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1135,
      "end_line": 1149,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 48)",
        "(line 1141,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1161,
      "end_line": 1245,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 48)",
        "(line 1166,col 9)-(line 1166,col 48)",
        "(line 1167,col 9)-(line 1167,col 34)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1173,col 9)-(line 1173,col 36)",
        "(line 1174,col 9)-(line 1174,col 35)",
        "(line 1175,col 9)-(line 1175,col 48)",
        "(line 1176,col 9)-(line 1176,col 67)",
        "(line 1178,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1243,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1257,
      "end_line": 1346,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 48)",
        "(line 1261,col 9)-(line 1261,col 23)",
        "(line 1263,col 9)-(line 1263,col 48)",
        "(line 1264,col 9)-(line 1264,col 34)",
        "(line 1265,col 9)-(line 1267,col 9)",
        "(line 1269,col 9)-(line 1269,col 36)",
        "(line 1270,col 9)-(line 1270,col 35)",
        "(line 1271,col 9)-(line 1271,col 48)",
        "(line 1272,col 9)-(line 1272,col 67)",
        "(line 1274,col 9)-(line 1343,col 9)",
        "(line 1344,col 9)-(line 1344,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.clone()",
      "begin_line": 1356,
      "end_line": 1363,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     *\r\n     * @return A clone\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the axis does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1357,col 9)-(line 1357,col 54)",
        "(line 1358,col 9)-(line 1361,col 9)",
        "(line 1362,col 9)-(line 1362,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.equals(java.lang.Object)",
      "begin_line": 1372,
      "end_line": 1397,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1378,col 9)",
        "(line 1379,col 9)-(line 1379,col 43)",
        "(line 1380,col 9)-(line 1382,col 9)",
        "(line 1383,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1388,col 9)",
        "(line 1389,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1395,col 9)",
        "(line 1396,col 9)-(line 1396,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.NumberAxis.hashCode()",
      "begin_line": 1404,
      "end_line": 1411,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1410,col 9)"
      ]
    }
  ]
}