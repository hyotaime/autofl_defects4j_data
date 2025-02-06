{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/dial/StandardDialScale.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardDialScale",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialScale",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 1021,
      "comment": "\n * A scale for a {@link DialPlot}.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The minimum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The maximum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * The start angle for the scale display, in degrees (using the same\n     * encoding as Arc2D).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "extent"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The extent of the scale display. "
    },
    {
      "type": "field",
      "varNames": [
        "tickRadius"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * The factor (in the range 0.0 to 1.0) that determines the outside limit\n     * of the tick marks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickIncrement"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * The increment (in data units) between major tick marks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickLength"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The factor that is subtracted from the tickRadius to determine the\n     * inner point of the major ticks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickPaint"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * The paint to use for major tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickStroke"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The stroke to use for major tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickCount"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The number of minor ticks between each major tick.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickLength"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * The factor that is subtracted from the tickRadius to determine the\n     * inner point of the minor ticks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickPaint"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * The paint to use for minor tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickStroke"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * The stroke to use for minor tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelOffset"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * The tick label offset.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * The tick label font.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * A flag that controls whether or not the tick labels are\n     * displayed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFormatter"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * The number formatter for the tick labels.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "firstTickLabelVisible"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * A flag that controls whether or not the first tick label is\n     * displayed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * The tick label paint.  This field is transient because it requires\n     * special handling for serialization.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.StandardDialScale()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Creates a new instance of DialScale.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.StandardDialScale(double, double, double, double, double, int)",
      "begin_line": 201,
      "end_line": 223,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param lowerBound  the lower bound of the scale.\n     * @param upperBound  the upper bound of the scale.\n     * @param startAngle  the start angle (in degrees, using the same\n     *     orientation as Java\u0027s \u003ccode\u003eArc2D\u003c/code\u003e class).\n     * @param extent  the extent (in degrees, counter-clockwise).\n     * @param majorTickIncrement  the interval between major tick marks\n     * @param minorTickCount  the number of minor ticks between major tick\n     *          marks.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 37)",
        "(line 205,col 9)-(line 205,col 29)",
        "(line 206,col 9)-(line 206,col 37)",
        "(line 207,col 9)-(line 207,col 37)",
        "(line 208,col 9)-(line 208,col 31)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 212,col 63)",
        "(line 213,col 9)-(line 213,col 41)",
        "(line 214,col 9)-(line 214,col 36)",
        "(line 215,col 9)-(line 215,col 53)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 217,col 9)-(line 217,col 42)",
        "(line 218,col 9)-(line 218,col 53)",
        "(line 219,col 9)-(line 219,col 45)",
        "(line 220,col 9)-(line 220,col 36)",
        "(line 221,col 9)-(line 221,col 42)",
        "(line 222,col 9)-(line 222,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getLowerBound()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Returns the lower bound for the scale.\n     *\n     * @return The lower bound for the scale.\n     *\n     * @see #setLowerBound(double)\n     *\n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setLowerBound(double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * Sets the lower bound for the scale and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param lower  the lower bound.\n     *\n     * @see #getLowerBound()\n     *\n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 250,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getUpperBound()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the upper bound for the scale.\n     *\n     * @return The upper bound for the scale.\n     *\n     * @see #setUpperBound(double)\n     *\n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setUpperBound(double)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Sets the upper bound for the scale and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param upper  the upper bound.\n     *\n     * @see #getUpperBound()\n     *\n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 278,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getStartAngle()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the start angle for the scale (in degrees using the same\n     * orientation as Java\u0027s \u003ccode\u003eArc2D\u003c/code\u003e class).\n     *\n     * @return The start angle.\n     *\n     * @see #setStartAngle(double)\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setStartAngle(double)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Sets the start angle for the scale and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param angle  the angle (in degrees).\n     *\n     * @see #getStartAngle()\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 32)",
        "(line 303,col 9)-(line 303,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getExtent()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Returns the extent.\n     *\n     * @return The extent.\n     *\n     * @see #setExtent(double)\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setExtent(double)",
      "begin_line": 325,
      "end_line": 328,
      "comment": "\n     * Sets the extent and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param extent  the extent.\n     *\n     * @see #getExtent()\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 29)",
        "(line 327,col 9)-(line 327,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickRadius()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Returns the radius (as a percentage of the maximum space available) of\n     * the outer limit of the tick marks.\n     *\n     * @return The tick radius.\n     *\n     * @see #setTickRadius(double)\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickRadius(double)",
      "begin_line": 350,
      "end_line": 357,
      "comment": "\n     * Sets the tick radius and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param radius  the radius.\n     *\n     * @see #getTickRadius()\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 33)",
        "(line 356,col 9)-(line 356,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickIncrement()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Returns the increment (in data units) between major tick labels.\n     *\n     * @return The increment between major tick labels.\n     *\n     * @see #setMajorTickIncrement(double)\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickIncrement(double)",
      "begin_line": 378,
      "end_line": 385,
      "comment": "\n     * Sets the increment (in data units) between major tick labels and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param increment  the increment.\n     *\n     * @see #getMajorTickIncrement()\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 44)",
        "(line 384,col 9)-(line 384,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickLength()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Returns the length factor for the major tick marks.  The value is\n     * subtracted from the tick radius to determine the inner starting point\n     * for the tick marks.\n     *\n     * @return The length factor.\n     *\n     * @see #setMajorTickLength(double)\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickLength(double)",
      "begin_line": 408,
      "end_line": 414,
      "comment": "\n     * Sets the length factor for the major tick marks and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param length  the length.\n     *\n     * @see #getMajorTickLength()\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 38)",
        "(line 413,col 9)-(line 413,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickPaint()",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Returns the major tick paint.\n     *\n     * @return The major tick paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setMajorTickPaint(Paint)\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickPaint(java.awt.Paint)",
      "begin_line": 435,
      "end_line": 441,
      "comment": "\n     * Sets the major tick paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getMajorTickPaint()\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 36)",
        "(line 440,col 9)-(line 440,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickStroke()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns the stroke used to draw the major tick marks.\n     *\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setMajorTickStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickStroke(java.awt.Stroke)",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\n     * Sets the stroke used to draw the major tick marks and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getMajorTickStroke()\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 38)",
        "(line 467,col 9)-(line 467,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickCount()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns the number of minor tick marks between major tick marks.\n     *\n     * @return The number of minor tick marks between major tick marks.\n     *\n     * @see #setMinorTickCount(int)\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickCount(int)",
      "begin_line": 489,
      "end_line": 496,
      "comment": "\n     * Sets the number of minor tick marks between major tick marks and sends\n     * a {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param count  the count.\n     *\n     * @see #getMinorTickCount()\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 36)",
        "(line 495,col 9)-(line 495,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickLength()",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * Returns the length factor for the minor tick marks.  The value is\n     * subtracted from the tick radius to determine the inner starting point\n     * for the tick marks.\n     *\n     * @return The length factor.\n     *\n     * @see #setMinorTickLength(double)\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickLength(double)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\n     * Sets the length factor for the minor tick marks and sends\n     * a {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param length  the length.\n     *\n     * @see #getMinorTickLength()\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 38)",
        "(line 524,col 9)-(line 524,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickPaint()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Returns the paint used to draw the minor tick marks.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setMinorTickPaint(Paint)\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickPaint(java.awt.Paint)",
      "begin_line": 546,
      "end_line": 552,
      "comment": "\n     * Sets the paint used to draw the minor tick marks and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getMinorTickPaint()\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 36)",
        "(line 551,col 9)-(line 551,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickStroke()",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\n     * Returns the stroke used to draw the minor tick marks.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setMinorTickStroke(Stroke)\n     *\n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickStroke(java.awt.Stroke)",
      "begin_line": 577,
      "end_line": 583,
      "comment": "\n     * Sets the stroke used to draw the minor tick marks and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getMinorTickStroke()\n     *\n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 38)",
        "(line 582,col 9)-(line 582,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelOffset()",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\n     * Returns the tick label offset.\n     *\n     * @return The tick label offset.\n     *\n     * @see #setTickLabelOffset(double)\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelOffset(double)",
      "begin_line": 604,
      "end_line": 607,
      "comment": "\n     * Sets the tick label offset and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param offset  the offset.\n     *\n     * @see #getTickLabelOffset()\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 38)",
        "(line 606,col 9)-(line 606,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelFont()",
      "begin_line": 616,
      "end_line": 618,
      "comment": "\n     * Returns the font used to draw the tick labels.\n     *\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setTickLabelFont(Font)\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelFont(java.awt.Font)",
      "begin_line": 628,
      "end_line": 634,
      "comment": "\n     * Sets the font used to display the tick labels and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getTickLabelFont()\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 34)",
        "(line 633,col 9)-(line 633,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelPaint()",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\n     * Returns the paint used to draw the tick labels.\n     *\n     * @return The paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #setTickLabelPaint(Paint)\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 653,
      "end_line": 659,
      "comment": "\n     * Sets the paint used to draw the tick labels and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 36)",
        "(line 658,col 9)-(line 658,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelsVisible()",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the tick labels should be displayed,\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @return A boolean.\n     *\n     * @see #setTickLabelsVisible(boolean)\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelsVisible(boolean)",
      "begin_line": 682,
      "end_line": 685,
      "comment": "\n     * Sets the flag that controls whether or not the tick labels are\n     * displayed, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     *\n     * @param visible  the new flag value.\n     *\n     * @see #getTickLabelsVisible()\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 41)",
        "(line 684,col 9)-(line 684,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelFormatter()",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Returns the number formatter used to convert the tick label values to\n     * strings.\n     *\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setTickLabelFormatter(NumberFormat)\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelFormatter(java.text.NumberFormat)",
      "begin_line": 708,
      "end_line": 714,
      "comment": "\n     * Sets the number formatter used to convert the tick label values to\n     * strings, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     *\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getTickLabelFormatter()\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 44)",
        "(line 713,col 9)-(line 713,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getFirstTickLabelVisible()",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Returns a flag that controls whether or not the first tick label is\n     * visible.\n     *\n     * @return A boolean.\n     *\n     * @see #setFirstTickLabelVisible(boolean)\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setFirstTickLabelVisible(boolean)",
      "begin_line": 737,
      "end_line": 740,
      "comment": "\n     * Sets a flag that controls whether or not the first tick label is\n     * visible, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     *\n     * @param visible  the new flag value.\n     *\n     * @see #getFirstTickLabelVisible()\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 45)",
        "(line 739,col 9)-(line 739,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.isClippedToWindow()",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be\n     * clipped within the dial window.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 762,
      "end_line": 837,
      "comment": "\n     * Draws the scale on the dial plot.\n     *\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the dial plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param frame  the reference frame that is used to construct the\n     *     geometry of the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param view  the visible part of the plot (\u003ccode\u003enull\u003c/code\u003e not\n     *     permitted).\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 766,col 50)",
        "(line 767,col 9)-(line 769,col 56)",
        "(line 770,col 9)-(line 770,col 43)",
        "(line 771,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 778,col 56)",
        "(line 780,col 9)-(line 780,col 34)",
        "(line 782,col 9)-(line 782,col 39)",
        "(line 783,col 9)-(line 783,col 49)",
        "(line 784,col 9)-(line 836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.valueToAngle(double)",
      "begin_line": 849,
      "end_line": 853,
      "comment": "\n     * Converts a data value to an angle against this scale.\n     *\n     * @param value  the data value.\n     *\n     * @return The angle (in degrees, using the same specification as Java\u0027s\n     *     Arc2D class).\n     *\n     * @see #angleToValue(double)\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 57)",
        "(line 851,col 9)-(line 851,col 42)",
        "(line 852,col 9)-(line 852,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.angleToValue(double)",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n     * Converts the given angle to a data value, based on this scale.\n     *\n     * @param angle  the angle.\n     *\n     * @return The data value.\n     *\n     * @see #valueToAngle(double)\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.equals(java.lang.Object)",
      "begin_line": 876,
      "end_line": 936,
      "comment": "\n     * Tests this \u003ccode\u003eStandardDialScale\u003c/code\u003e for equality with an arbitrary\n     * object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 883,col 57)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.hashCode()",
      "begin_line": 943,
      "end_line": 974,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 25)",
        "(line 946,col 9)-(line 946,col 61)",
        "(line 947,col 9)-(line 947,col 60)",
        "(line 949,col 9)-(line 949,col 56)",
        "(line 950,col 9)-(line 950,col 60)",
        "(line 952,col 9)-(line 952,col 56)",
        "(line 953,col 9)-(line 953,col 60)",
        "(line 955,col 9)-(line 955,col 52)",
        "(line 956,col 9)-(line 956,col 60)",
        "(line 958,col 9)-(line 958,col 56)",
        "(line 959,col 9)-(line 959,col 60)",
        "(line 973,col 9)-(line 973,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.clone()",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if this instance is not cloneable.\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 994,
      "end_line": 1001,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 36)",
        "(line 996,col 9)-(line 996,col 64)",
        "(line 997,col 9)-(line 997,col 66)",
        "(line 998,col 9)-(line 998,col 64)",
        "(line 999,col 9)-(line 999,col 66)",
        "(line 1000,col 9)-(line 1000,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.readObject(java.io.ObjectInputStream)",
      "begin_line": 1011,
      "end_line": 1019,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 35)",
        "(line 1014,col 9)-(line 1014,col 64)",
        "(line 1015,col 9)-(line 1015,col 66)",
        "(line 1016,col 9)-(line 1016,col 64)",
        "(line 1017,col 9)-(line 1017,col 66)",
        "(line 1018,col 9)-(line 1018,col 64)"
      ]
    }
  ]
}