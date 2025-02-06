{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/dial/StandardDialScale.java",
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
      "begin_line": 75,
      "end_line": 1019,
      "comment": "\n * A scale for a {@link DialPlot}.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The minimum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The maximum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " \n     * The start angle for the scale display, in degrees (using the same\n     * encoding as Arc2D). \n     "
    },
    {
      "type": "field",
      "varNames": [
        "extent"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The extent of the scale display. "
    },
    {
      "type": "field",
      "varNames": [
        "tickRadius"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " \n     * The factor (in the range 0.0 to 1.0) that determines the outside limit\n     * of the tick marks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickIncrement"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * The increment (in data units) between major tick marks. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickLength"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * The factor that is subtracted from the tickRadius to determine the\n     * inner point of the major ticks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickPaint"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The paint to use for major tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickStroke"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * The stroke to use for major tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickCount"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The number of minor ticks between each major tick.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickLength"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * The factor that is subtracted from the tickRadius to determine the\n     * inner point of the minor ticks.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickPaint"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * The paint to use for minor tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickStroke"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * The stroke to use for minor tick marks.  This field is transient because\n     * it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelOffset"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * The tick label offset.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " \n     * The tick label font.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " \n     * A flag that controls whether or not the tick labels are \n     * displayed. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFormatter"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": "\n     * The number formatter for the tick labels.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "firstTickLabelVisible"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * A flag that controls whether or not the first tick label is\n     * displayed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * The tick label paint.  This field is transient because it requires \n     * special handling for serialization.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.StandardDialScale()",
      "begin_line": 184,
      "end_line": 186,
      "comment": " \n     * Creates a new instance of DialScale.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.StandardDialScale(double, double, double, double, double, int)",
      "begin_line": 200,
      "end_line": 222,
      "comment": "\n     * Creates a new instance.\n     * \n     * @param lowerBound  the lower bound of the scale.\n     * @param upperBound  the upper bound of the scale.\n     * @param startAngle  the start angle (in degrees, using the same \n     *     orientation as Java\u0027s \u003ccode\u003eArc2D\u003c/code\u003e class).\n     * @param extent  the extent (in degrees, counter-clockwise).\n     * @param majorTickIncrement  the interval between major tick marks\n     * @param minorTickCount  the number of minor ticks between major tick\n     *          marks.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 205,col 37)",
        "(line 206,col 9)-(line 206,col 37)",
        "(line 207,col 9)-(line 207,col 31)",
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 42)",
        "(line 211,col 9)-(line 211,col 63)",
        "(line 212,col 9)-(line 212,col 41)",
        "(line 213,col 9)-(line 213,col 36)",
        "(line 214,col 9)-(line 214,col 53)",
        "(line 215,col 9)-(line 215,col 36)",
        "(line 216,col 9)-(line 216,col 42)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 219,col 36)",
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getLowerBound()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns the lower bound for the scale.\n     * \n     * @return The lower bound for the scale.\n     * \n     * @see #setLowerBound(double)\n     * \n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setLowerBound(double)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * Sets the lower bound for the scale and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param lower  the lower bound.\n     * \n     * @see #getLowerBound()\n     * \n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 32)",
        "(line 249,col 9)-(line 249,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getUpperBound()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the upper bound for the scale.\n     * \n     * @return The upper bound for the scale.\n     * \n     * @see #setUpperBound(double)\n     * \n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setUpperBound(double)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Sets the upper bound for the scale and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param upper  the upper bound.\n     * \n     * @see #getUpperBound()\n     * \n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 277,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getStartAngle()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Returns the start angle for the scale (in degrees using the same \n     * orientation as Java\u0027s \u003ccode\u003eArc2D\u003c/code\u003e class).\n     * \n     * @return The start angle.\n     * \n     * @see #setStartAngle(double)\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setStartAngle(double)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Sets the start angle for the scale and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param angle  the angle (in degrees).\n     * \n     * @see #getStartAngle()\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 32)",
        "(line 302,col 9)-(line 302,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getExtent()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Returns the extent.\n     * \n     * @return The extent.\n     * \n     * @see #setExtent(double)\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setExtent(double)",
      "begin_line": 324,
      "end_line": 327,
      "comment": "\n     * Sets the extent and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param extent  the extent.\n     * \n     * @see #getExtent()\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 326,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickRadius()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Returns the radius (as a percentage of the maximum space available) of\n     * the outer limit of the tick marks.\n     *\n     * @return The tick radius.\n     *\n     * @see #setTickRadius(double)\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickRadius(double)",
      "begin_line": 349,
      "end_line": 356,
      "comment": "\n     * Sets the tick radius and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param radius  the radius.\n     *\n     * @see #getTickRadius()\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 33)",
        "(line 355,col 9)-(line 355,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickIncrement()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Returns the increment (in data units) between major tick labels.\n     *\n     * @return The increment between major tick labels.\n     *\n     * @see #setMajorTickIncrement(double)\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickIncrement(double)",
      "begin_line": 377,
      "end_line": 384,
      "comment": "\n     * Sets the increment (in data units) between major tick labels and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param increment  the increment.\n     *\n     * @see #getMajorTickIncrement()\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 44)",
        "(line 383,col 9)-(line 383,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickLength()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Returns the length factor for the major tick marks.  The value is\n     * subtracted from the tick radius to determine the inner starting point\n     * for the tick marks.\n     *\n     * @return The length factor.\n     *\n     * @see #setMajorTickLength(double)\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickLength(double)",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\n     * Sets the length factor for the major tick marks and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param length  the length.\n     *\n     * @see #getMajorTickLength()\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 38)",
        "(line 412,col 9)-(line 412,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickPaint()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * Returns the major tick paint.\n     *\n     * @return The major tick paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setMajorTickPaint(Paint)\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickPaint(java.awt.Paint)",
      "begin_line": 434,
      "end_line": 440,
      "comment": "\n     * Sets the major tick paint and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getMajorTickPaint()\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 36)",
        "(line 439,col 9)-(line 439,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMajorTickStroke()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Returns the stroke used to draw the major tick marks.\n     *\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setMajorTickStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMajorTickStroke(java.awt.Stroke)",
      "begin_line": 461,
      "end_line": 467,
      "comment": "\n     * Sets the stroke used to draw the major tick marks and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getMajorTickStroke()\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 38)",
        "(line 466,col 9)-(line 466,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickCount()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n     * Returns the number of minor tick marks between major tick marks.\n     *\n     * @return The number of minor tick marks between major tick marks.\n     *\n     * @see #setMinorTickCount(int)\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickCount(int)",
      "begin_line": 488,
      "end_line": 495,
      "comment": "\n     * Sets the number of minor tick marks between major tick marks and sends \n     * a {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param count  the count.\n     *\n     * @see #getMinorTickCount()\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 36)",
        "(line 494,col 9)-(line 494,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickLength()",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * Returns the length factor for the minor tick marks.  The value is\n     * subtracted from the tick radius to determine the inner starting point\n     * for the tick marks.\n     *\n     * @return The length factor.\n     *\n     * @see #setMinorTickLength(double)\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickLength(double)",
      "begin_line": 518,
      "end_line": 524,
      "comment": "\n     * Sets the length factor for the minor tick marks and sends \n     * a {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param length  the length.\n     *\n     * @see #getMinorTickLength()\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 38)",
        "(line 523,col 9)-(line 523,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickPaint()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Returns the paint used to draw the minor tick marks.\n     * \n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setMinorTickPaint(Paint)\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickPaint(java.awt.Paint)",
      "begin_line": 545,
      "end_line": 551,
      "comment": "\n     * Sets the paint used to draw the minor tick marks and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getMinorTickPaint()\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 36)",
        "(line 550,col 9)-(line 550,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getMinorTickStroke()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n     * Returns the stroke used to draw the minor tick marks.\n     * \n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setMinorTickStroke(Stroke)\n     * \n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setMinorTickStroke(java.awt.Stroke)",
      "begin_line": 576,
      "end_line": 582,
      "comment": "\n     * Sets the stroke used to draw the minor tick marks and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getMinorTickStroke()\n     * \n     * @since 1.0.8\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 38)",
        "(line 581,col 9)-(line 581,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelOffset()",
      "begin_line": 591,
      "end_line": 593,
      "comment": "\n     * Returns the tick label offset.\n     *\n     * @return The tick label offset.\n     *\n     * @see #setTickLabelOffset(double)\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelOffset(double)",
      "begin_line": 603,
      "end_line": 606,
      "comment": "\n     * Sets the tick label offset and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     *\n     * @param offset  the offset.\n     *\n     * @see #getTickLabelOffset()\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 38)",
        "(line 605,col 9)-(line 605,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelFont()",
      "begin_line": 615,
      "end_line": 617,
      "comment": "\n     * Returns the font used to draw the tick labels.\n     *\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setTickLabelFont(Font)\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelFont(java.awt.Font)",
      "begin_line": 627,
      "end_line": 633,
      "comment": "\n     * Sets the font used to display the tick labels and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getTickLabelFont()\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 34)",
        "(line 632,col 9)-(line 632,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelPaint()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * Returns the paint used to draw the tick labels.\n     *\n     * @return The paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #setTickLabelPaint(Paint)\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 652,
      "end_line": 658,
      "comment": "\n     * Sets the paint used to draw the tick labels and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 36)",
        "(line 657,col 9)-(line 657,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelsVisible()",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the tick labels should be displayed,\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @return A boolean.\n     * \n     * @see #setTickLabelsVisible(boolean)\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelsVisible(boolean)",
      "begin_line": 681,
      "end_line": 684,
      "comment": "\n     * Sets the flag that controls whether or not the tick labels are\n     * displayed, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     * \n     * @param visible  the new flag value.\n     * \n     * @see #getTickLabelsVisible()\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 41)",
        "(line 683,col 9)-(line 683,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getTickLabelFormatter()",
      "begin_line": 694,
      "end_line": 696,
      "comment": "\n     * Returns the number formatter used to convert the tick label values to\n     * strings.\n     * \n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setTickLabelFormatter(NumberFormat)\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setTickLabelFormatter(java.text.NumberFormat)",
      "begin_line": 707,
      "end_line": 713,
      "comment": "\n     * Sets the number formatter used to convert the tick label values to \n     * strings, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     * \n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getTickLabelFormatter()\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 44)",
        "(line 712,col 9)-(line 712,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.getFirstTickLabelVisible()",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * Returns a flag that controls whether or not the first tick label is\n     * visible.\n     * \n     * @return A boolean.\n     * \n     * @see #setFirstTickLabelVisible(boolean)\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.setFirstTickLabelVisible(boolean)",
      "begin_line": 736,
      "end_line": 739,
      "comment": "\n     * Sets a flag that controls whether or not the first tick label is \n     * visible, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     * \n     * @param visible  the new flag value.\n     * \n     * @see #getFirstTickLabelVisible()\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 45)",
        "(line 738,col 9)-(line 738,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.isClippedToWindow()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be \n     * clipped within the dial window. \n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 761,
      "end_line": 835,
      "comment": "\n     * Draws the scale on the dial plot.\n     *\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the dial plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param frame  the reference frame that is used to construct the\n     *     geometry of the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param view  the visible part of the plot (\u003ccode\u003enull\u003c/code\u003e not \n     *     permitted).\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 765,col 50)",
        "(line 766,col 9)-(line 768,col 56)",
        "(line 769,col 9)-(line 769,col 43)",
        "(line 770,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 777,col 56)",
        "(line 779,col 9)-(line 779,col 34)",
        "(line 781,col 9)-(line 781,col 39)",
        "(line 782,col 9)-(line 782,col 49)",
        "(line 783,col 9)-(line 834,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.valueToAngle(double)",
      "begin_line": 847,
      "end_line": 851,
      "comment": "\n     * Converts a data value to an angle against this scale.\n     *\n     * @param value  the data value.\n     *\n     * @return The angle (in degrees, using the same specification as Java\u0027s\n     *     Arc2D class).\n     *     \n     * @see #angleToValue(double)\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 57)",
        "(line 849,col 9)-(line 849,col 42)",
        "(line 850,col 9)-(line 850,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.angleToValue(double)",
      "begin_line": 862,
      "end_line": 864,
      "comment": " \n     * Converts the given angle to a data value, based on this scale.\n     * \n     * @param angle  the angle.\n     * \n     * @return The data value.\n     * \n     * @see #valueToAngle(double)\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.equals(java.lang.Object)",
      "begin_line": 874,
      "end_line": 934,
      "comment": "\n     * Tests this \u003ccode\u003eStandardDialScale\u003c/code\u003e for equality with an arbitrary\n     * object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 57)",
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 887,col 9)",
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.hashCode()",
      "begin_line": 941,
      "end_line": 972,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 25)",
        "(line 944,col 9)-(line 944,col 61)",
        "(line 945,col 9)-(line 945,col 60)",
        "(line 947,col 9)-(line 947,col 56)",
        "(line 948,col 9)-(line 948,col 60)",
        "(line 950,col 9)-(line 950,col 56)",
        "(line 951,col 9)-(line 951,col 60)",
        "(line 953,col 9)-(line 953,col 52)",
        "(line 954,col 9)-(line 954,col 60)",
        "(line 956,col 9)-(line 956,col 56)",
        "(line 957,col 9)-(line 957,col 60)",
        "(line 971,col 9)-(line 971,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.clone()",
      "begin_line": 981,
      "end_line": 983,
      "comment": "\n     * Returns a clone of this instance.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if this instance is not cloneable.\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 992,
      "end_line": 999,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 36)",
        "(line 994,col 9)-(line 994,col 64)",
        "(line 995,col 9)-(line 995,col 66)",
        "(line 996,col 9)-(line 996,col 64)",
        "(line 997,col 9)-(line 997,col 66)",
        "(line 998,col 9)-(line 998,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialScale.readObject(java.io.ObjectInputStream)",
      "begin_line": 1009,
      "end_line": 1017,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 35)",
        "(line 1012,col 9)-(line 1012,col 64)",
        "(line 1013,col 9)-(line 1013,col 66)",
        "(line 1014,col 9)-(line 1014,col 64)",
        "(line 1015,col 9)-(line 1015,col 66)",
        "(line 1016,col 9)-(line 1016,col 64)"
      ]
    }
  ]
}