{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/CyclicNumberAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CyclicNumberAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis"
      ],
      "begin_line": 127,
      "end_line": 1210,
      "comment": "\r\nThis class extends NumberAxis and handles cycling.\r\n \r\nTraditional representation of data in the range x0..x1\r\n\u003cpre\u003e\r\n|-------------------------|\r\nx0                       x1\r\n\u003c/pre\u003e \r\n\r\nHere, the range bounds are at the axis extremities.\r\nWith cyclic axis, however, the time is split in \r\n\"cycles\", or \"time frames\", or the same duration : the period.\r\n\r\nA cycle axis cannot by definition handle a larger interval \r\nthan the period : \u003cpre\u003ex1 - x0 \u003e\u003d period\u003c/pre\u003e. Thus, at most a full \r\nperiod can be represented with such an axis.\r\n\r\nThe cycle bound is the number between x0 and x1 which marks \r\nthe beginning of new time frame:\r\n\u003cpre\u003e\r\n|---------------------|----------------------------|\r\nx0                   cb                           x1\r\n\u003c---previous cycle---\u003e\u003c-------current cycle--------\u003e\r\n\u003c/pre\u003e\r\n\r\nIt is actually a multiple of the period, plus optionally \r\na start offset: \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\r\n\r\nThus, by definition, two consecutive cycle bounds \r\nperiod apart, which is precisely why it is called a \r\nperiod.\r\n\r\nThe visual representation of a cyclic axis is like that:\r\n\u003cpre\u003e\r\n|----------------------------|---------------------|\r\ncb                         x1|x0                  cb\r\n\u003c-------current cycle--------\u003e\u003c---previous cycle---\u003e\r\n\u003c/pre\u003e\r\n\r\nThe cycle bound is at the axis ends, then current \r\ncycle is shown, then the last cycle. When using \r\ndynamic data, the visual effect is the current cycle \r\nerases the last cycle as x grows. Then, the next cycle \r\nbound is reached, and the process starts over, erasing \r\nthe previous cycle.\r\n\r\nA Cyclic item renderer is provided to do exactly this.\r\n\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ADVANCE_LINE_STROKE"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The default axis line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ADVANCE_LINE_PAINT"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The default axis line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The offset. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The period."
    },
    {
      "type": "field",
      "varNames": [
        "boundMappedToLastCycle"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " ??. "
    },
    {
      "type": "field",
      "varNames": [
        "advanceLineVisible"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " A flag that controls whether or not the advance line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "advanceLineStroke"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The advance line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "advanceLinePaint"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The advance line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "internalMarkerWhenTicksOverlap"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "internalMarkerCycleBoundTick"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": " \r\n     * Creates a CycleNumberAxis with the given period.\r\n     * \r\n     * @param period  the period.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double, double)",
      "begin_line": 171,
      "end_line": 173,
      "comment": " \r\n     * Creates a CycleNumberAxis with the given period and offset.\r\n     * \r\n     * @param period  the period.\r\n     * @param offset  the offset.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double, java.lang.String)",
      "begin_line": 181,
      "end_line": 183,
      "comment": " \r\n     * Creates a named CycleNumberAxis with the given period.\r\n     * \r\n     * @param period  the period.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double, double, java.lang.String)",
      "begin_line": 192,
      "end_line": 199,
      "comment": " \r\n     * Creates a named CycleNumberAxis with the given period and offset.\r\n     * \r\n     * @param period  the period.\r\n     * @param offset  the offset.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 21)",
        "(line 194,col 9)-(line 194,col 29)",
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 34)",
        "(line 197,col 9)-(line 197,col 39)",
        "(line 198,col 9)-(line 198,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.isAdvanceLineVisible()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle, \r\n     * when erasing the previous cycle. \r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAdvanceLineVisible(boolean)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle, \r\n     * when erasing the previous cycle. \r\n     * \r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getAdvanceLinePaint()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle, \r\n     * when erasing the previous cycle. \r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAdvanceLinePaint(java.awt.Paint)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle, \r\n     * when erasing the previous cycle. \r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getAdvanceLineStroke()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle, \r\n     * when erasing the previous cycle. \r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAdvanceLineStroke(java.awt.Stroke)",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle, \r\n     * when erasing the previous cycle. \r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.isBoundMappedToLastCycle()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\r\n     * The cycle bound can be associated either with the current or with the \r\n     * last cycle.  It\u0027s up to the user\u0027s choice to decide which, as this is \r\n     * just a convention.  By default, the cycle bound is mapped to the current\r\n     * cycle.\r\n     * \u003cbr\u003e\r\n     * Note that this has no effect on visual appearance, as the cycle bound is\r\n     * mapped successively for both axis ends. Use this function for correct \r\n     * results in translateValueToJava2D. \r\n     *  \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the cycle bound is mapped to the last \r\n     *         cycle, \u003ccode\u003efalse\u003c/code\u003e if it is bound to the current cycle \r\n     *         (default)\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setBoundMappedToLastCycle(boolean)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * The cycle bound can be associated either with the current or with the \r\n     * last cycle.  It\u0027s up to the user\u0027s choice to decide which, as this is \r\n     * just a convention. By default, the cycle bound is mapped to the current \r\n     * cycle. \r\n     * \u003cbr\u003e\r\n     * Note that this has no effect on visual appearance, as the cycle bound is\r\n     * mapped successively for both axis ends. Use this function for correct \r\n     * results in valueToJava2D.\r\n     *  \r\n     * @param boundMappedToLastCycle Set it to true to map the cycle bound to \r\n     *        the last cycle.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 309,
      "end_line": 326,
      "comment": "\r\n     * Selects a tick unit when the axis is displayed horizontally.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the drawing area.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the side of the rectangle on which the axis is displayed.\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 315,col 63)",
        "(line 318,col 9)-(line 319,col 58)",
        "(line 321,col 9)-(line 324,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 336,
      "end_line": 353,
      "comment": "\r\n     * Selects a tick unit when the axis is displayed vertically.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the drawing area.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the side of the rectangle on which the axis is displayed.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 342,col 63)",
        "(line 345,col 9)-(line 346,col 59)",
        "(line 348,col 9)-(line 351,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CycleBoundTick",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberTick"
      ],
      "begin_line": 361,
      "end_line": 382,
      "comment": " \r\n     * A special Number tick that also hold information about the cycle bound \r\n     * mapping for this tick.  This is especially useful for having a tick at \r\n     * each axis end with the cycle bound value.  See also \r\n     * isBoundMappedToLastCycle()\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mapToLastCycle"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Map to last cycle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick.CycleBoundTick(boolean, java.lang.Number, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 376,
      "end_line": 381,
      "comment": "\r\n         * Creates a new tick.\r\n         * \r\n         * @param mapToLastCycle  map to last cycle?\r\n         * @param number  the number.\r\n         * @param label  the label.\r\n         * @param textAnchor  the text anchor.\r\n         * @param rotationAnchor  the rotation anchor.\r\n         * @param angle  the rotation angle.\r\n         ",
      "child_ranges": [
        "(line 379,col 13)-(line 379,col 68)",
        "(line 380,col 13)-(line 380,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.calculateAnchorPoint(org.jfree.chart.axis.ValueTick, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 394,
      "end_line": 408,
      "comment": "\r\n     * Calculates the anchor point for a tick.\r\n     * \r\n     * @param tick  the tick.\r\n     * @param cursor  the cursor.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the side on which the axis is displayed.\r\n     * \r\n     * @return The anchor point.\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 422,
      "end_line": 563,
      "comment": "\r\n     * Builds a list of ticks for the axis.  This method is called when the \r\n     * axis is at the top or bottom of the chart (so the axis is \"horizontal\").\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 48)",
        "(line 428,col 9)-(line 428,col 48)",
        "(line 429,col 9)-(line 429,col 34)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 46)",
        "(line 436,col 9)-(line 436,col 44)",
        "(line 437,col 9)-(line 437,col 70)",
        "(line 438,col 9)-(line 438,col 55)",
        "(line 439,col 9)-(line 439,col 31)",
        "(line 441,col 9)-(line 441,col 59)",
        "(line 442,col 9)-(line 442,col 44)",
        "(line 444,col 9)-(line 444,col 39)",
        "(line 445,col 9)-(line 445,col 27)",
        "(line 447,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 51)",
        "(line 561,col 9)-(line 561,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.refreshVerticalTicks(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 575,
      "end_line": 735,
      "comment": "\r\n     * Builds a list of ticks for the axis.  This method is called when the \r\n     * axis is at the left or right of the chart (so the axis is \"vertical\").\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 48)",
        "(line 580,col 9)-(line 580,col 23)",
        "(line 582,col 9)-(line 582,col 48)",
        "(line 583,col 9)-(line 583,col 34)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 588,col 9)-(line 588,col 46)",
        "(line 589,col 9)-(line 589,col 44)",
        "(line 590,col 9)-(line 590,col 70)",
        "(line 591,col 9)-(line 591,col 55)",
        "(line 592,col 9)-(line 592,col 31)",
        "(line 594,col 9)-(line 594,col 59)",
        "(line 595,col 9)-(line 595,col 43)",
        "(line 597,col 9)-(line 597,col 35)",
        "(line 598,col 9)-(line 598,col 27)",
        "(line 600,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 51)",
        "(line 734,col 9)-(line 734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 746,
      "end_line": 782,
      "comment": "\r\n     * Converts a coordinate from Java 2D space to data space.\r\n     * \r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 33)",
        "(line 750,col 9)-(line 750,col 44)",
        "(line 751,col 9)-(line 751,col 36)",
        "(line 753,col 9)-(line 753,col 26)",
        "(line 754,col 9)-(line 754,col 26)",
        "(line 755,col 9)-(line 762,col 9)",
        "(line 764,col 9)-(line 781,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 793,
      "end_line": 839,
      "comment": "\r\n     * Translates a value from data space to Java 2D space.\r\n     * \r\n     * @param value  the data value.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return The Java 2D value.\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 33)",
        "(line 797,col 9)-(line 797,col 44)",
        "(line 798,col 9)-(line 798,col 44)",
        "(line 799,col 9)-(line 799,col 36)",
        "(line 801,col 9)-(line 803,col 9)",
        "(line 806,col 9)-(line 806,col 26)",
        "(line 807,col 9)-(line 807,col 26)",
        "(line 808,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 838,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.centerRange(double)",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\r\n     * Centers the range about the given value.\r\n     * \r\n     * @param value  the data value.\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAutoRangeMinimumSize(double, boolean)",
      "begin_line": 861,
      "end_line": 866,
      "comment": " \r\n     * This function is nearly useless since the auto range is fixed for this \r\n     * class to the period.  The period is extended if necessary to fit the \r\n     * minimum size.\r\n     * \r\n     * @param size  the size.\r\n     * @param notify  notify?\r\n     * \r\n     * @see org.jfree.chart.axis.ValueAxis#setAutoRangeMinimumSize(double, \r\n     *      boolean)\r\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setFixedAutoRange(double)",
      "begin_line": 876,
      "end_line": 879,
      "comment": " \r\n     * The auto range is fixed for this class to the period by default. \r\n     * This function will thus set a new period.\r\n     * \r\n     * @param length  the length.\r\n     * \r\n     * @see org.jfree.chart.axis.ValueAxis#setFixedAutoRange(double)\r\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 29)",
        "(line 878,col 9)-(line 878,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 891,
      "end_line": 898,
      "comment": " \r\n     * Sets a new axis range. The period is extended to fit the range size, if \r\n     * necessary.\r\n     * \r\n     * @param range  the range.\r\n     * @param turnOffAutoRange  switch off the auto range.\r\n     * @param notify notify?\r\n     * \r\n     * @see org.jfree.chart.axis.ValueAxis#setRange(Range, boolean, boolean) \r\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 68)",
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getCycleBound()",
      "begin_line": 910,
      "end_line": 914,
      "comment": "\r\n     * The cycle bound is defined as the higest value x such that \r\n     * \"offset + period * i \u003d x\", with i and integer and x \u0026lt; \r\n     * range.getUpperBound() This is the value which is at both ends of the \r\n     * axis :  x...up|low...x\r\n     * The values from x to up are the valued in the current cycle.\r\n     * The values from low to x are the valued in the previous cycle.\r\n     * \r\n     * @return The cycle bound.\r\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getOffset()",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start \r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     * \r\n     * @return The current offset.\r\n     * \r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setOffset(double)",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start \r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     * \r\n     * @param offset The offset to set.\r\n     *\r\n     * @see #getCycleBound() \r\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getPeriod()",
      "begin_line": 954,
      "end_line": 956,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start \r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     * \r\n     * @return The current period.\r\n     * \r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setPeriod(double)",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start \r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     * \r\n     * @param period The period to set.\r\n     * \r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.drawTickMarksAndLabels(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 984,
      "end_line": 1030,
      "comment": "\r\n     * Draws the tick marks and labels.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the side on which the axis is displayed.\r\n     * @param info  the plot rendering info.\r\n     * \r\n     * @return The axis state.\r\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 52)",
        "(line 989,col 9)-(line 990,col 38)",
        "(line 993,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 997,col 47)",
        "(line 998,col 9)-(line 998,col 63)",
        "(line 1000,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1007,col 22)",
        "(line 1008,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1029,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1045,
      "end_line": 1085,
      "comment": "\r\n     * Draws the axis.\r\n     * \r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor position.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1054,col 10)",
        "(line 1055,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 1099,
      "end_line": 1135,
      "comment": "\r\n     * Reserve some space on each axis side because we draw a centered label at\r\n     * each extremity. \r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param plotArea  the plot area.\r\n     * @param edge  the edge.\r\n     * @param space  the space already reserved.\r\n     * \r\n     * @return The reserved space.\r\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 49)",
        "(line 1106,col 9)-(line 1106,col 76)",
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1111,col 9)-(line 1111,col 63)",
        "(line 1112,col 9)-(line 1114,col 10)",
        "(line 1116,col 9)-(line 1131,col 9)",
        "(line 1133,col 9)-(line 1133,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1144,
      "end_line": 1150,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1146,col 36)",
        "(line 1147,col 9)-(line 1147,col 66)",
        "(line 1148,col 9)-(line 1148,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1160,
      "end_line": 1167,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 35)",
        "(line 1164,col 9)-(line 1164,col 66)",
        "(line 1165,col 9)-(line 1165,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.equals(java.lang.Object)",
      "begin_line": 1177,
      "end_line": 1209,
      "comment": "\r\n     * Tests the axis for equality with another object.\r\n     * \r\n     * @param obj  the object to test against.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1187,col 55)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1197,col 9)",
        "(line 1198,col 9)-(line 1201,col 9)",
        "(line 1202,col 9)-(line 1204,col 9)",
        "(line 1205,col 9)-(line 1207,col 9)",
        "(line 1208,col 9)-(line 1208,col 20)"
      ]
    }
  ]
}