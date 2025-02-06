{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/CyclicNumberAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CyclicNumberAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis"
      ],
      "begin_line": 127,
      "end_line": 1212,
      "comment": "\r\nThis class extends NumberAxis and handles cycling.\r\n\r\nTraditional representation of data in the range x0..x1\r\n\u003cpre\u003e\r\n|-------------------------|\r\nx0                       x1\r\n\u003c/pre\u003e\r\n\r\nHere, the range bounds are at the axis extremities.\r\nWith cyclic axis, however, the time is split in\r\n\"cycles\", or \"time frames\", or the same duration : the period.\r\n\r\nA cycle axis cannot by definition handle a larger interval\r\nthan the period : \u003cpre\u003ex1 - x0 \u003e\u003d period\u003c/pre\u003e. Thus, at most a full\r\nperiod can be represented with such an axis.\r\n\r\nThe cycle bound is the number between x0 and x1 which marks\r\nthe beginning of new time frame:\r\n\u003cpre\u003e\r\n|---------------------|----------------------------|\r\nx0                   cb                           x1\r\n\u003c---previous cycle---\u003e\u003c-------current cycle--------\u003e\r\n\u003c/pre\u003e\r\n\r\nIt is actually a multiple of the period, plus optionally\r\na start offset: \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\r\n\r\nThus, by definition, two consecutive cycle bounds\r\nperiod apart, which is precisely why it is called a\r\nperiod.\r\n\r\nThe visual representation of a cyclic axis is like that:\r\n\u003cpre\u003e\r\n|----------------------------|---------------------|\r\ncb                         x1|x0                  cb\r\n\u003c-------current cycle--------\u003e\u003c---previous cycle---\u003e\r\n\u003c/pre\u003e\r\n\r\nThe cycle bound is at the axis ends, then current\r\ncycle is shown, then the last cycle. When using\r\ndynamic data, the visual effect is the current cycle\r\nerases the last cycle as x grows. Then, the next cycle\r\nbound is reached, and the process starts over, erasing\r\nthe previous cycle.\r\n\r\nA Cyclic item renderer is provided to do exactly this.\r\n\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ADVANCE_LINE_STROKE"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The default axis line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ADVANCE_LINE_PAINT"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The default axis line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The offset. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The period."
    },
    {
      "type": "field",
      "varNames": [
        "boundMappedToLastCycle"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " ??. "
    },
    {
      "type": "field",
      "varNames": [
        "advanceLineVisible"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " A flag that controls whether or not the advance line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "advanceLineStroke"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The advance line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "advanceLinePaint"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The advance line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "internalMarkerWhenTicksOverlap"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "internalMarkerCycleBoundTick"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Creates a CycleNumberAxis with the given period.\r\n     *\r\n     * @param period  the period.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double, double)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Creates a CycleNumberAxis with the given period and offset.\r\n     *\r\n     * @param period  the period.\r\n     * @param offset  the offset.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double, java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Creates a named CycleNumberAxis with the given period.\r\n     *\r\n     * @param period  the period.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CyclicNumberAxis(double, double, java.lang.String)",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\r\n     * Creates a named CycleNumberAxis with the given period and offset.\r\n     *\r\n     * @param period  the period.\r\n     * @param offset  the offset.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 21)",
        "(line 197,col 9)-(line 197,col 29)",
        "(line 198,col 9)-(line 198,col 29)",
        "(line 199,col 9)-(line 199,col 34)",
        "(line 200,col 9)-(line 200,col 39)",
        "(line 201,col 9)-(line 201,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.isAdvanceLineVisible()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle,\r\n     * when erasing the previous cycle.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAdvanceLineVisible(boolean)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle,\r\n     * when erasing the previous cycle.\r\n     *\r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getAdvanceLinePaint()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle,\r\n     * when erasing the previous cycle.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAdvanceLinePaint(java.awt.Paint)",
      "begin_line": 240,
      "end_line": 245,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle,\r\n     * when erasing the previous cycle.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getAdvanceLineStroke()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle,\r\n     * when erasing the previous cycle.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAdvanceLineStroke(java.awt.Stroke)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\r\n     * The advance line is the line drawn at the limit of the current cycle,\r\n     * when erasing the previous cycle.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.isBoundMappedToLastCycle()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * The cycle bound can be associated either with the current or with the\r\n     * last cycle.  It\u0027s up to the user\u0027s choice to decide which, as this is\r\n     * just a convention.  By default, the cycle bound is mapped to the current\r\n     * cycle.\r\n     * \u003cbr\u003e\r\n     * Note that this has no effect on visual appearance, as the cycle bound is\r\n     * mapped successively for both axis ends. Use this function for correct\r\n     * results in translateValueToJava2D.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the cycle bound is mapped to the last\r\n     *         cycle, \u003ccode\u003efalse\u003c/code\u003e if it is bound to the current cycle\r\n     *         (default)\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setBoundMappedToLastCycle(boolean)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\r\n     * The cycle bound can be associated either with the current or with the\r\n     * last cycle.  It\u0027s up to the user\u0027s choice to decide which, as this is\r\n     * just a convention. By default, the cycle bound is mapped to the current\r\n     * cycle.\r\n     * \u003cbr\u003e\r\n     * Note that this has no effect on visual appearance, as the cycle bound is\r\n     * mapped successively for both axis ends. Use this function for correct\r\n     * results in valueToJava2D.\r\n     *\r\n     * @param boundMappedToLastCycle Set it to true to map the cycle bound to\r\n     *        the last cycle.\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 312,
      "end_line": 329,
      "comment": "\r\n     * Selects a tick unit when the axis is displayed horizontally.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the drawing area.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the side of the rectangle on which the axis is displayed.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 318,col 63)",
        "(line 321,col 9)-(line 322,col 58)",
        "(line 324,col 9)-(line 327,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 339,
      "end_line": 356,
      "comment": "\r\n     * Selects a tick unit when the axis is displayed vertically.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the drawing area.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the side of the rectangle on which the axis is displayed.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 345,col 63)",
        "(line 348,col 9)-(line 349,col 59)",
        "(line 351,col 9)-(line 354,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CycleBoundTick",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberTick"
      ],
      "begin_line": 364,
      "end_line": 385,
      "comment": "\r\n     * A special Number tick that also hold information about the cycle bound\r\n     * mapping for this tick.  This is especially useful for having a tick at\r\n     * each axis end with the cycle bound value.  See also\r\n     * isBoundMappedToLastCycle()\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mapToLastCycle"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " Map to last cycle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick.CycleBoundTick(boolean, java.lang.Number, java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 379,
      "end_line": 384,
      "comment": "\r\n         * Creates a new tick.\r\n         *\r\n         * @param mapToLastCycle  map to last cycle?\r\n         * @param number  the number.\r\n         * @param label  the label.\r\n         * @param textAnchor  the text anchor.\r\n         * @param rotationAnchor  the rotation anchor.\r\n         * @param angle  the rotation angle.\r\n         ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 68)",
        "(line 383,col 13)-(line 383,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.calculateAnchorPoint(org.jfree.chart.axis.ValueTick, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 397,
      "end_line": 411,
      "comment": "\r\n     * Calculates the anchor point for a tick.\r\n     *\r\n     * @param tick  the tick.\r\n     * @param cursor  the cursor.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the side on which the axis is displayed.\r\n     *\r\n     * @return The anchor point.\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 425,
      "end_line": 566,
      "comment": "\r\n     * Builds a list of ticks for the axis.  This method is called when the\r\n     * axis is at the top or bottom of the chart (so the axis is \"horizontal\").\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 48)",
        "(line 431,col 9)-(line 431,col 48)",
        "(line 432,col 9)-(line 432,col 34)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 46)",
        "(line 439,col 9)-(line 439,col 44)",
        "(line 440,col 9)-(line 440,col 70)",
        "(line 441,col 9)-(line 441,col 55)",
        "(line 442,col 9)-(line 442,col 31)",
        "(line 444,col 9)-(line 444,col 59)",
        "(line 445,col 9)-(line 445,col 44)",
        "(line 447,col 9)-(line 447,col 39)",
        "(line 448,col 9)-(line 448,col 27)",
        "(line 450,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 51)",
        "(line 564,col 9)-(line 564,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.refreshVerticalTicks(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 578,
      "end_line": 738,
      "comment": "\r\n     * Builds a list of ticks for the axis.  This method is called when the\r\n     * axis is at the left or right of the chart (so the axis is \"vertical\").\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 48)",
        "(line 583,col 9)-(line 583,col 23)",
        "(line 585,col 9)-(line 585,col 48)",
        "(line 586,col 9)-(line 586,col 34)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 591,col 46)",
        "(line 592,col 9)-(line 592,col 44)",
        "(line 593,col 9)-(line 593,col 70)",
        "(line 594,col 9)-(line 594,col 55)",
        "(line 595,col 9)-(line 595,col 31)",
        "(line 597,col 9)-(line 597,col 59)",
        "(line 598,col 9)-(line 598,col 43)",
        "(line 600,col 9)-(line 600,col 35)",
        "(line 601,col 9)-(line 601,col 27)",
        "(line 603,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 51)",
        "(line 737,col 9)-(line 737,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 749,
      "end_line": 785,
      "comment": "\r\n     * Converts a coordinate from Java 2D space to data space.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 33)",
        "(line 753,col 9)-(line 753,col 44)",
        "(line 754,col 9)-(line 754,col 36)",
        "(line 756,col 9)-(line 756,col 26)",
        "(line 757,col 9)-(line 757,col 26)",
        "(line 758,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 796,
      "end_line": 842,
      "comment": "\r\n     * Translates a value from data space to Java 2D space.\r\n     *\r\n     * @param value  the data value.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return The Java 2D value.\r\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 33)",
        "(line 800,col 9)-(line 800,col 44)",
        "(line 801,col 9)-(line 801,col 44)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 804,col 9)-(line 806,col 9)",
        "(line 809,col 9)-(line 809,col 26)",
        "(line 810,col 9)-(line 810,col 26)",
        "(line 811,col 9)-(line 818,col 9)",
        "(line 820,col 9)-(line 841,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.centerRange(double)",
      "begin_line": 849,
      "end_line": 851,
      "comment": "\r\n     * Centers the range about the given value.\r\n     *\r\n     * @param value  the data value.\r\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setAutoRangeMinimumSize(double, boolean)",
      "begin_line": 864,
      "end_line": 869,
      "comment": "\r\n     * This function is nearly useless since the auto range is fixed for this\r\n     * class to the period.  The period is extended if necessary to fit the\r\n     * minimum size.\r\n     *\r\n     * @param size  the size.\r\n     * @param notify  notify?\r\n     *\r\n     * @see org.jfree.chart.axis.ValueAxis#setAutoRangeMinimumSize(double,\r\n     *      boolean)\r\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setFixedAutoRange(double)",
      "begin_line": 879,
      "end_line": 882,
      "comment": "\r\n     * The auto range is fixed for this class to the period by default.\r\n     * This function will thus set a new period.\r\n     *\r\n     * @param length  the length.\r\n     *\r\n     * @see org.jfree.chart.axis.ValueAxis#setFixedAutoRange(double)\r\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 29)",
        "(line 881,col 9)-(line 881,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 894,
      "end_line": 901,
      "comment": "\r\n     * Sets a new axis range. The period is extended to fit the range size, if\r\n     * necessary.\r\n     *\r\n     * @param range  the range.\r\n     * @param turnOffAutoRange  switch off the auto range.\r\n     * @param notify notify?\r\n     *\r\n     * @see org.jfree.chart.axis.ValueAxis#setRange(Range, boolean, boolean)\r\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 68)",
        "(line 897,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 900,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getCycleBound()",
      "begin_line": 913,
      "end_line": 917,
      "comment": "\r\n     * The cycle bound is defined as the higest value x such that\r\n     * \"offset + period * i \u003d x\", with i and integer and x \u0026lt;\r\n     * range.getUpperBound() This is the value which is at both ends of the\r\n     * axis :  x...up|low...x\r\n     * The values from x to up are the valued in the current cycle.\r\n     * The values from low to x are the valued in the previous cycle.\r\n     *\r\n     * @return The cycle bound.\r\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 916,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getOffset()",
      "begin_line": 929,
      "end_line": 931,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start\r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     *\r\n     * @return The current offset.\r\n     *\r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setOffset(double)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start\r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     *\r\n     * @param offset The offset to set.\r\n     *\r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.getPeriod()",
      "begin_line": 957,
      "end_line": 959,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start\r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     *\r\n     * @return The current period.\r\n     *\r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.setPeriod(double)",
      "begin_line": 971,
      "end_line": 973,
      "comment": "\r\n     * The cycle bound is a multiple of the period, plus optionally a start\r\n     * offset.\r\n     * \u003cP\u003e\r\n     * \u003cpre\u003ecb \u003d n * period + offset\u003c/pre\u003e\u003cbr\u003e\r\n     *\r\n     * @param period The period to set.\r\n     *\r\n     * @see #getCycleBound()\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.drawTickMarksAndLabels(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 987,
      "end_line": 1032,
      "comment": "\r\n     * Draws the tick marks and labels.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the side on which the axis is displayed.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @return The axis state.\r\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 52)",
        "(line 992,col 9)-(line 993,col 38)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1000,col 47)",
        "(line 1001,col 9)-(line 1001,col 63)",
        "(line 1003,col 9)-(line 1008,col 9)",
        "(line 1010,col 9)-(line 1010,col 22)",
        "(line 1011,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1031,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1047,
      "end_line": 1087,
      "comment": "\r\n     * Draws the axis.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor position.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1056,col 10)",
        "(line 1057,col 9)-(line 1085,col 9)",
        "(line 1086,col 9)-(line 1086,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 1101,
      "end_line": 1137,
      "comment": "\r\n     * Reserve some space on each axis side because we draw a centered label at\r\n     * each extremity.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param plotArea  the plot area.\r\n     * @param edge  the edge.\r\n     * @param space  the space already reserved.\r\n     *\r\n     * @return The reserved space.\r\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 49)",
        "(line 1108,col 9)-(line 1108,col 76)",
        "(line 1109,col 9)-(line 1111,col 9)",
        "(line 1113,col 9)-(line 1113,col 63)",
        "(line 1114,col 9)-(line 1116,col 10)",
        "(line 1118,col 9)-(line 1133,col 9)",
        "(line 1135,col 9)-(line 1135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1146,
      "end_line": 1152,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 36)",
        "(line 1149,col 9)-(line 1149,col 66)",
        "(line 1150,col 9)-(line 1150,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1162,
      "end_line": 1169,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 35)",
        "(line 1166,col 9)-(line 1166,col 66)",
        "(line 1167,col 9)-(line 1167,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CyclicNumberAxis.equals(java.lang.Object)",
      "begin_line": 1179,
      "end_line": 1211,
      "comment": "\r\n     * Tests the axis for equality with another object.\r\n     *\r\n     * @param obj  the object to test against.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1189,col 55)",
        "(line 1190,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1210,col 9)-(line 1210,col 20)"
      ]
    }
  ]
}