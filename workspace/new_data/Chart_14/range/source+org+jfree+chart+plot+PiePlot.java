{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/PiePlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PiePlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 236,
      "end_line": 3121,
      "comment": "\r\n * A plot that displays data in the form of a pie chart, using data from any \r\n * class that implements the {@link PieDataset} interface.\r\n * \u003cP\u003e\r\n * Special notes:\r\n * \u003col\u003e\r\n * \u003cli\u003ethe default starting point is 12 o\u0027clock and the pie sections proceed\r\n * in a clockwise direction, but these settings can be changed;\u003c/li\u003e\r\n * \u003cli\u003enegative values in the dataset are ignored;\u003c/li\u003e\r\n * \u003cli\u003ethere are utility methods for creating a {@link PieDataset} from a\r\n * {@link org.jfree.data.category.CategoryDataset};\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n *\r\n * @see Plot\r\n * @see PieDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " The default starting angle for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 251,
      "end_line": 252,
      "comment": " The default section label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " The default section label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 258,
      "end_line": 259,
      "comment": " The default section label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " The default section label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 265,
      "end_line": 266,
      "comment": " The default section label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 269,
      "end_line": 270,
      "comment": " The default section label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " The default minimum arc angle to draw. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " The dataset for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "pieIndex"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " The pie index (used by the {@link MultiplePiePlot} class). "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " \r\n     * The amount of space left around the outside of the pie plot, expressed \r\n     * as a percentage of the plot area width and height. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "circular"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " Flag determining whether to draw an ellipse or a perfect circle. "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": " The direction for the pie segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaintMap"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " The section paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionPaint"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " The base section paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinesVisible"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " \r\n     * A flag that controls whether or not an outline is drawn for each\r\n     * section in the plot.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinePaintMap"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " The section outline paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlinePaint"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " The base section outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlineStrokeMap"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " The section outline stroke map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlineStroke"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " The base section outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "shadowPaint"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " The shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowXOffset"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " The x-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowYOffset"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " The y-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "explodePercentages"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " The percentage amount to explode each pie section. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " The section label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " The font used to display the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " The color used to draw the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelBackgroundPaint"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " \r\n     * The color used to draw the background of the section labels.  If this\r\n     * is \u003ccode\u003enull\u003c/code\u003e, the background is not filled.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlinePaint"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " \r\n     * The paint used to draw the outline of the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlineStroke"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " \r\n     * The stroke used to draw the outline of the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelShadowPaint"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " \r\n     * The paint used to draw the shadow for the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabels"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": "\r\n     * A flag that controls whether simple or extended labels are used.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelPadding"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": "\r\n     * The padding between the labels and the label outlines.  This is not\r\n     * allowed to be \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabelOffset"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": "\r\n     * The simple label offset.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumLabelWidth"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " The maximum label width as a percentage of the plot width. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGap"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": " \r\n     * The gap between the labels and the link corner, as a percentage of the \r\n     * plot width. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinksVisible"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": " A flag that controls whether or not the label links are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStyle"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " \r\n     * The label link style.\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkMargin"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " The link margin. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkPaint"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " The paint used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStroke"
      ],
      "begin_line": 413,
      "end_line": 413,
      "comment": " The stroke used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelDistributor"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " \r\n     * The pie section label distributor.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " The tooltip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " The URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelGenerator"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " The legend label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelToolTipGenerator"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " A tool tip generator for the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelURLGenerator"
      ],
      "begin_line": 439,
      "end_line": 439,
      "comment": " \r\n     * A URL generator for the legend items (optional).  \r\n     *\r\n     * @since 1.0.4. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreNullValues"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " \r\n     * A flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored.  \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreZeroValues"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": "\r\n     * A flag that controls whether zero values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumArcAngleToDraw"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": "\r\n     * The smallest arc angle that will get drawn (this is to avoid a bug in \r\n     * various Java implementations that causes the JVM to crash).  See this \r\n     * link for details:\r\n     *\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\r\n     *\r\n     * ...and this bug report in the Java Bug Parade:\r\n     *\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 468,
      "end_line": 469,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_INTERIOR"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": " \r\n     * This debug flag controls whether or not an outline is drawn showing the \r\n     * interior of the plot region.  This is drawn as a lightGray rectangle \r\n     * showing the padding provided by the \u0027interiorGap\u0027 setting.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_LINK_AREA"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": " \r\n     * This debug flag controls whether or not an outline is drawn showing the \r\n     * link area (in blue) and link ellipse (in yellow).  This controls where \r\n     * the label links have \u0027elbow\u0027 points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_PIE_AREA"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": "\r\n     * This debug flag controls whether or not an outline is drawn showing\r\n     * the pie area (in green).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\r\n     * Creates a new plot.  The dataset is initially set to \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot(org.jfree.data.general.PieDataset)",
      "begin_line": 503,
      "end_line": 553,
      "comment": "\r\n     * Creates a plot that will draw a pie chart for the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 16)",
        "(line 505,col 9)-(line 505,col 31)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 26)",
        "(line 511,col 9)-(line 511,col 48)",
        "(line 512,col 9)-(line 512,col 29)",
        "(line 513,col 9)-(line 513,col 46)",
        "(line 514,col 9)-(line 514,col 44)",
        "(line 515,col 9)-(line 515,col 71)",
        "(line 517,col 9)-(line 517,col 46)",
        "(line 518,col 9)-(line 518,col 43)",
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 521,col 53)",
        "(line 522,col 9)-(line 522,col 61)",
        "(line 524,col 9)-(line 524,col 55)",
        "(line 525,col 9)-(line 525,col 63)",
        "(line 527,col 9)-(line 527,col 48)",
        "(line 529,col 9)-(line 529,col 69)",
        "(line 530,col 9)-(line 530,col 44)",
        "(line 531,col 9)-(line 531,col 46)",
        "(line 532,col 9)-(line 532,col 67)",
        "(line 533,col 9)-(line 533,col 61)",
        "(line 534,col 9)-(line 534,col 63)",
        "(line 535,col 9)-(line 535,col 59)",
        "(line 536,col 9)-(line 536,col 38)",
        "(line 537,col 9)-(line 537,col 59)",
        "(line 539,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 541,col 34)",
        "(line 542,col 9)-(line 542,col 60)",
        "(line 544,col 9)-(line 544,col 37)",
        "(line 545,col 9)-(line 545,col 33)",
        "(line 546,col 9)-(line 546,col 75)",
        "(line 547,col 9)-(line 547,col 48)",
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 549,col 63)",
        "(line 551,col 9)-(line 551,col 38)",
        "(line 552,col 9)-(line 552,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDataset()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(PieDataset)\r\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDataset(org.jfree.data.general.PieDataset)",
      "begin_line": 573,
      "end_line": 591,
      "comment": "\r\n     * Sets the dataset and sends a {@link DatasetChangeEvent} to \u0027this\u0027.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 43)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 582,col 9)-(line 582,col 31)",
        "(line 583,col 9)-(line 586,col 9)",
        "(line 589,col 9)-(line 589,col 73)",
        "(line 590,col 9)-(line 590,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPieIndex()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\r\n     * Returns the pie index (this is used by the {@link MultiplePiePlot} class\r\n     * to track subplots).\r\n     * \r\n     * @return The pie index.\r\n     * \r\n     * @see #setPieIndex(int)\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setPieIndex(int)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\r\n     * Sets the pie index (this is used by the {@link MultiplePiePlot} class to \r\n     * track subplots).\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @see #getPieIndex()\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getStartAngle()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\r\n     * Returns the start angle for the first pie section.  This is measured in \r\n     * degrees starting from 3 o\u0027clock and measuring anti-clockwise.\r\n     *\r\n     * @return The start angle.\r\n     * \r\n     * @see #setStartAngle(double)\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setStartAngle(double)",
      "begin_line": 639,
      "end_line": 642,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  The initial default value is 90 degrees, which \r\n     * corresponds to 12 o\u0027clock.  A value of zero corresponds to 3 o\u0027clock...\r\n     * this is the encoding used by Java\u0027s Arc2D class.\r\n     *\r\n     * @param angle  the angle (in degrees).\r\n     * \r\n     * @see #getStartAngle()\r\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 32)",
        "(line 641,col 9)-(line 641,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDirection()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\r\n     * Returns the direction in which the pie sections are drawn (clockwise or \r\n     * anti-clockwise).\r\n     *\r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDirection(Rotation)\r\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 664,
      "end_line": 671,
      "comment": "\r\n     * Sets the direction in which the pie sections are drawn and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDirection()\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 35)",
        "(line 669,col 9)-(line 669,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getInteriorGap()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available \r\n     * drawing space.\r\n     *\r\n     * @return The gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #setInteriorGap(double)\r\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setInteriorGap(double)",
      "begin_line": 695,
      "end_line": 707,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  This controls the space between the edges of the \r\n     * pie plot and the plot area itself (the region where the section labels \r\n     * appear).\r\n     *\r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #getInteriorGap()\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 700,col 9)",
        "(line 702,col 9)-(line 705,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.isCircular()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\r\n     * Returns a flag indicating whether the pie chart is circular, or\r\n     * stretched into an elliptical shape.\r\n     *\r\n     * @return A flag indicating whether the pie chart is circular.\r\n     * \r\n     * @see #setCircular(boolean)\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\r\n     * A flag indicating whether the pie chart is circular, or stretched into\r\n     * an elliptical shape.\r\n     *\r\n     * @param flag  the new value.\r\n     * \r\n     * @see #isCircular()\r\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean, boolean)",
      "begin_line": 742,
      "end_line": 747,
      "comment": "\r\n     * Sets the circular attribute and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param circular  the new value of the flag.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #isCircular()\r\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 33)",
        "(line 744,col 9)-(line 746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreNullValues()",
      "begin_line": 757,
      "end_line": 759,
      "comment": "\r\n     * Returns the flag that controls whether \u003ccode\u003enull\u003c/code\u003e values in the \r\n     * dataset are ignored.  \r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setIgnoreNullValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreNullValues(boolean)",
      "begin_line": 772,
      "end_line": 775,
      "comment": "\r\n     * Sets a flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  At \r\n     * present, this only affects whether or not the key is presented in the \r\n     * legend.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getIgnoreNullValues()\r\n     * @see #setIgnoreZeroValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 37)",
        "(line 774,col 9)-(line 774,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreZeroValues()",
      "begin_line": 785,
      "end_line": 787,
      "comment": "\r\n     * Returns the flag that controls whether zero values in the \r\n     * dataset are ignored.  \r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setIgnoreZeroValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreZeroValues(boolean)",
      "begin_line": 800,
      "end_line": 803,
      "comment": "\r\n     * Sets a flag that controls whether zero values are ignored, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  This \r\n     * only affects whether or not a label appears for the non-visible\r\n     * pie section.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getIgnoreZeroValues()\r\n     * @see #setIgnoreNullValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 37)",
        "(line 802,col 9)-(line 802,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\r\n     * Returns the paint for the specified section.  This is equivalent to\r\n     * \u003ccode\u003elookupSectionPaint(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The paint for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionPaint(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable, boolean)",
      "begin_line": 844,
      "end_line": 868,
      "comment": "\r\n     * Returns the paint for the specified section.  The lookup involves these\r\n     * steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is non-\u003ccode\u003enull\u003c/code\u003e \r\n     *         return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is \u003ccode\u003enull\u003c/code\u003e but \r\n     *         \u003ccode\u003eautoPopulate\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch\r\n     *         a new paint from the drawing supplier \r\n     *         ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionPaint()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section paint settings.\r\n     *     \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 28)",
        "(line 848,col 9)-(line 848,col 52)",
        "(line 849,col 9)-(line 851,col 9)",
        "(line 854,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionKey(int)",
      "begin_line": 884,
      "end_line": 895,
      "comment": "\r\n     * Returns a key for the specified section.  If there is no such section \r\n     * in the dataset, we generate a key.  This is to provide some backward\r\n     * compatibility for the (now deprecated) methods that get/set attributes \r\n     * based on section indices.  The preferred way of doing this now is to\r\n     * link the attributes directly to the section key (there are new methods\r\n     * for this, starting from version 1.0.3).  \r\n     * \r\n     * @param section  the section index.\r\n     * \r\n     * @return The key.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 30)",
        "(line 886,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionPaint(java.lang.Comparable)",
      "begin_line": 913,
      "end_line": 916,
      "comment": "\r\n     * Returns the paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionPaint(Comparable, Paint)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionPaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 932,
      "end_line": 936,
      "comment": "\r\n     * Sets the paint associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionPaint(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 45)",
        "(line 935,col 9)-(line 935,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionPaint()",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is \r\n     * defined, which is rare.  The default value is \u003ccode\u003eColor.gray\u003c/code\u003e.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionPaint(java.awt.Paint)",
      "begin_line": 958,
      "end_line": 964,
      "comment": "\r\n     * Sets the base section paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionPaint()\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 38)",
        "(line 963,col 9)-(line 963,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinesVisible()",
      "begin_line": 977,
      "end_line": 979,
      "comment": "\r\n     * Returns the flag that controls whether or not the outline is drawn for\r\n     * each pie section.\r\n     * \r\n     * @return The flag that controls whether or not the outline is drawn for\r\n     *         each pie section.\r\n     *         \r\n     * @see #setSectionOutlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinesVisible(boolean)",
      "begin_line": 990,
      "end_line": 993,
      "comment": "\r\n     * Sets the flag that controls whether or not the outline is drawn for \r\n     * each pie section, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSectionOutlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 46)",
        "(line 992,col 9)-(line 992,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\r\n     * Returns the outline paint for the specified section.  This is equivalent \r\n     * to \u003ccode\u003elookupSectionPaint(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The paint for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionOutlinePaint(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable, boolean)",
      "begin_line": 1032,
      "end_line": 1058,
      "comment": "\r\n     * Returns the outline paint for the specified section.  The lookup \r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is \r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is \r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is \r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline paint from \r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlinePaint()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section outline paint settings.\r\n     *     \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 28)",
        "(line 1038,col 9)-(line 1038,col 59)",
        "(line 1039,col 9)-(line 1041,col 9)",
        "(line 1044,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1057,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 1076,
      "end_line": 1079,
      "comment": "\r\n     * Returns the outline paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionOutlinePaint(Comparable, Paint)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 1095,
      "end_line": 1099,
      "comment": "\r\n     * Sets the outline paint associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionOutlinePaint(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 52)",
        "(line 1098,col 9)-(line 1098,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlinePaint()",
      "begin_line": 1109,
      "end_line": 1111,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is \r\n     * available.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlinePaint(java.awt.Paint)",
      "begin_line": 1120,
      "end_line": 1126,
      "comment": "\r\n     * Sets the base section paint.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1123,col 9)",
        "(line 1124,col 9)-(line 1124,col 45)",
        "(line 1125,col 9)-(line 1125,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1142,
      "end_line": 1144,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  This is equivalent \r\n     * to \u003ccode\u003elookupSectionOutlineStroke(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The stroke for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionOutlineStroke(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 1143,col 9)-(line 1143,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable, boolean)",
      "begin_line": 1167,
      "end_line": 1193,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  The lookup \r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is \r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is \r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is \r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline stroke from \r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlineStroke()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section outline stroke settings.\r\n     *     \r\n     * @return The stroke.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 29)",
        "(line 1173,col 9)-(line 1173,col 61)",
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1179,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1192,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1211,
      "end_line": 1214,
      "comment": "\r\n     * Returns the outline stroke associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no stroke associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The stroke associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionOutlineStroke(Comparable, Stroke)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlineStroke(java.lang.Comparable, java.awt.Stroke)",
      "begin_line": 1230,
      "end_line": 1234,
      "comment": "\r\n     * Sets the outline stroke associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionOutlineStroke(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1232,col 54)",
        "(line 1233,col 9)-(line 1233,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlineStroke()",
      "begin_line": 1244,
      "end_line": 1246,
      "comment": "\r\n     * Returns the base section stroke.  This is used when no other stroke is \r\n     * available.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1245,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlineStroke(java.awt.Stroke)",
      "begin_line": 1255,
      "end_line": 1261,
      "comment": "\r\n     * Sets the base section stroke.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1258,col 9)",
        "(line 1259,col 9)-(line 1259,col 47)",
        "(line 1260,col 9)-(line 1260,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowPaint()",
      "begin_line": 1270,
      "end_line": 1272,
      "comment": "\r\n     * Returns the shadow paint.\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowPaint(java.awt.Paint)",
      "begin_line": 1282,
      "end_line": 1285,
      "comment": "\r\n     * Sets the shadow paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 1283,col 9)-(line 1283,col 33)",
        "(line 1284,col 9)-(line 1284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowXOffset()",
      "begin_line": 1294,
      "end_line": 1296,
      "comment": "\r\n     * Returns the x-offset for the shadow effect.\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setShadowXOffset(double)\r\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowXOffset(double)",
      "begin_line": 1306,
      "end_line": 1309,
      "comment": "\r\n     * Sets the x-offset for the shadow effect and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getShadowXOffset()\r\n     ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 36)",
        "(line 1308,col 9)-(line 1308,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowYOffset()",
      "begin_line": 1318,
      "end_line": 1320,
      "comment": "\r\n     * Returns the y-offset for the shadow effect.\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setShadowYOffset(double)\r\n     ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowYOffset(double)",
      "begin_line": 1330,
      "end_line": 1333,
      "comment": "\r\n     * Sets the y-offset for the shadow effect and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getShadowYOffset()\r\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 36)",
        "(line 1332,col 9)-(line 1332,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getExplodePercent(java.lang.Comparable)",
      "begin_line": 1351,
      "end_line": 1360,
      "comment": "\r\n     * Returns the amount that the section with the specified key should be\r\n     * exploded.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The amount that the section with the specified key should be\r\n     *     exploded.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.3\r\n     * \r\n     * @see #setExplodePercent(Comparable, double)\r\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 28)",
        "(line 1353,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setExplodePercent(java.lang.Comparable, double)",
      "begin_line": 1373,
      "end_line": 1382,
      "comment": "\r\n     * Sets the amount that a pie section should be exploded and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percent  the explode percentage (0.30 \u003d 30 percent).\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #getExplodePercent(Comparable)\r\n     ",
      "child_ranges": [
        "(line 1374,col 9)-(line 1376,col 9)",
        "(line 1377,col 9)-(line 1379,col 9)",
        "(line 1380,col 9)-(line 1380,col 62)",
        "(line 1381,col 9)-(line 1381,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumExplodePercent()",
      "begin_line": 1389,
      "end_line": 1403,
      "comment": "\r\n     * Returns the maximum explode percent.\r\n     * \r\n     * @return The percent.\r\n     ",
      "child_ranges": [
        "(line 1390,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1393,col 28)",
        "(line 1394,col 9)-(line 1394,col 62)",
        "(line 1395,col 9)-(line 1401,col 9)",
        "(line 1402,col 9)-(line 1402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGenerator()",
      "begin_line": 1412,
      "end_line": 1414,
      "comment": "\r\n     * Returns the section label generator. \r\n     * \r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1413,col 9)-(line 1413,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1424,
      "end_line": 1427,
      "comment": "\r\n     * Sets the section label generator and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 40)",
        "(line 1426,col 9)-(line 1426,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGap()",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "\r\n     * Returns the gap between the edge of the pie and the labels, expressed as \r\n     * a percentage of the plot width.\r\n     * \r\n     * @return The gap (a percentage, where 0.05 \u003d five percent).\r\n     * \r\n     * @see #setLabelGap(double)\r\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGap(double)",
      "begin_line": 1450,
      "end_line": 1453,
      "comment": "\r\n     * Sets the gap between the edge of the pie and the labels (expressed as a \r\n     * percentage of the plot width) and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param gap  the gap (a percentage, where 0.05 \u003d five percent).\r\n     * \r\n     * @see #getLabelGap()\r\n     ",
      "child_ranges": [
        "(line 1451,col 9)-(line 1451,col 28)",
        "(line 1452,col 9)-(line 1452,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumLabelWidth()",
      "begin_line": 1462,
      "end_line": 1464,
      "comment": "\r\n     * Returns the maximum label width as a percentage of the plot width.\r\n     * \r\n     * @return The width (a percentage, where 0.20 \u003d 20 percent).\r\n     * \r\n     * @see #setMaximumLabelWidth(double)\r\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMaximumLabelWidth(double)",
      "begin_line": 1474,
      "end_line": 1477,
      "comment": "\r\n     * Sets the maximum label width as a percentage of the plot width and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param width  the width (a percentage, where 0.20 \u003d 20 percent).\r\n     * \r\n     * @see #getMaximumLabelWidth()\r\n     ",
      "child_ranges": [
        "(line 1475,col 9)-(line 1475,col 39)",
        "(line 1476,col 9)-(line 1476,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinksVisible()",
      "begin_line": 1487,
      "end_line": 1489,
      "comment": "\r\n     * Returns the flag that controls whether or not label linking lines are\r\n     * visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setLabelLinksVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1488,col 9)-(line 1488,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinksVisible(boolean)",
      "begin_line": 1502,
      "end_line": 1505,
      "comment": "\r\n     * Sets the flag that controls whether or not label linking lines are \r\n     * visible and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * Please take care when hiding the linking lines - depending on the data \r\n     * values, the labels can be displayed some distance away from the\r\n     * corresponding pie section.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getLabelLinksVisible()\r\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 41)",
        "(line 1504,col 9)-(line 1504,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkStyle()",
      "begin_line": 1516,
      "end_line": 1518,
      "comment": "\r\n     * Returns the label link style.\r\n     * \r\n     * @return The label link style (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelLinkStyle(PieLabelLinkStyle)\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1517,col 6)-(line 1517,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkStyle(org.jfree.chart.plot.PieLabelLinkStyle)",
      "begin_line": 1530,
      "end_line": 1536,
      "comment": "\r\n     * Sets the label link style and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param style  the new style (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelLinkStyle()\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1531,col 6)-(line 1533,col 6)",
        "(line 1534,col 6)-(line 1534,col 33)",
        "(line 1535,col 6)-(line 1535,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkMargin()",
      "begin_line": 1546,
      "end_line": 1548,
      "comment": "\r\n     * Returns the margin (expressed as a percentage of the width or height) \r\n     * between the edge of the pie and the link point.\r\n     * \r\n     * @return The link margin (as a percentage, where 0.05 is five percent).\r\n     * \r\n     * @see #setLabelLinkMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1547,col 9)-(line 1547,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkMargin(double)",
      "begin_line": 1558,
      "end_line": 1561,
      "comment": "\r\n     * Sets the link margin and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param margin  the margin.\r\n     * \r\n     * @see #getLabelLinkMargin()\r\n     ",
      "child_ranges": [
        "(line 1559,col 9)-(line 1559,col 38)",
        "(line 1560,col 9)-(line 1560,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkPaint()",
      "begin_line": 1571,
      "end_line": 1573,
      "comment": "\r\n     * Returns the paint used for the lines that connect pie sections to their \r\n     * corresponding labels.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelLinkPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkPaint(java.awt.Paint)",
      "begin_line": 1584,
      "end_line": 1590,
      "comment": "\r\n     * Sets the paint used for the lines that connect pie sections to their \r\n     * corresponding labels, and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelLinkPaint()\r\n     ",
      "child_ranges": [
        "(line 1585,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1588,col 36)",
        "(line 1589,col 9)-(line 1589,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkStroke()",
      "begin_line": 1599,
      "end_line": 1601,
      "comment": "\r\n     * Returns the stroke used for the label linking lines.\r\n     * \r\n     * @return The stroke.\r\n     * \r\n     * @see #setLabelLinkStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1600,col 9)-(line 1600,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkStroke(java.awt.Stroke)",
      "begin_line": 1611,
      "end_line": 1617,
      "comment": "\r\n     * Sets the link stroke and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #getLabelLinkStroke()\r\n     ",
      "child_ranges": [
        "(line 1612,col 9)-(line 1614,col 9)",
        "(line 1615,col 9)-(line 1615,col 38)",
        "(line 1616,col 9)-(line 1616,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelFont()",
      "begin_line": 1626,
      "end_line": 1628,
      "comment": "\r\n     * Returns the section label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelFont(java.awt.Font)",
      "begin_line": 1638,
      "end_line": 1644,
      "comment": "\r\n     * Sets the section label font and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1639,col 9)-(line 1641,col 9)",
        "(line 1642,col 9)-(line 1642,col 30)",
        "(line 1643,col 9)-(line 1643,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPaint()",
      "begin_line": 1653,
      "end_line": 1655,
      "comment": "\r\n     * Returns the section label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1654,col 9)-(line 1654,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 1665,
      "end_line": 1671,
      "comment": "\r\n     * Sets the section label paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1668,col 9)",
        "(line 1669,col 9)-(line 1669,col 32)",
        "(line 1670,col 9)-(line 1670,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelBackgroundPaint()",
      "begin_line": 1680,
      "end_line": 1682,
      "comment": "\r\n     * Returns the section label background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1681,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelBackgroundPaint(java.awt.Paint)",
      "begin_line": 1692,
      "end_line": 1695,
      "comment": "\r\n     * Sets the section label background paint and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1693,col 42)",
        "(line 1694,col 9)-(line 1694,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlinePaint()",
      "begin_line": 1704,
      "end_line": 1706,
      "comment": "\r\n     * Returns the section label outline paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1705,col 9)-(line 1705,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlinePaint(java.awt.Paint)",
      "begin_line": 1716,
      "end_line": 1719,
      "comment": "\r\n     * Sets the section label outline paint and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 39)",
        "(line 1718,col 9)-(line 1718,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlineStroke()",
      "begin_line": 1728,
      "end_line": 1730,
      "comment": "\r\n     * Returns the section label outline stroke.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1729,col 9)-(line 1729,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlineStroke(java.awt.Stroke)",
      "begin_line": 1740,
      "end_line": 1743,
      "comment": "\r\n     * Sets the section label outline stroke and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1741,col 9)-(line 1741,col 41)",
        "(line 1742,col 9)-(line 1742,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelShadowPaint()",
      "begin_line": 1752,
      "end_line": 1754,
      "comment": "\r\n     * Returns the section label shadow paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1753,col 9)-(line 1753,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelShadowPaint(java.awt.Paint)",
      "begin_line": 1764,
      "end_line": 1767,
      "comment": "\r\n     * Sets the section label shadow paint and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 1765,col 9)-(line 1765,col 38)",
        "(line 1766,col 9)-(line 1766,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPadding()",
      "begin_line": 1778,
      "end_line": 1780,
      "comment": "\r\n     * Returns the label padding.\r\n     * \r\n     * @return The label padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setLabelPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1792,
      "end_line": 1798,
      "comment": "\r\n     * Sets the padding between each label and its outline and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getLabelPadding()\r\n     ",
      "child_ranges": [
        "(line 1793,col 9)-(line 1795,col 9)",
        "(line 1796,col 9)-(line 1796,col 36)",
        "(line 1797,col 9)-(line 1797,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabels()",
      "begin_line": 1808,
      "end_line": 1810,
      "comment": "\r\n     * Returns the flag that controls whether simple or extended labels are\r\n     * displayed on the plot.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1809,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabels(boolean)",
      "begin_line": 1821,
      "end_line": 1824,
      "comment": "\r\n     * Sets the flag that controls whether simple or extended labels are \r\n     * displayed on the plot, and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param simple  the new flag value.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1822,col 9)-(line 1822,col 35)",
        "(line 1823,col 9)-(line 1823,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabelOffset()",
      "begin_line": 1835,
      "end_line": 1837,
      "comment": "\r\n     * Returns the offset used for the simple labels, if they are displayed.\r\n     * \r\n     * @return The offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setSimpleLabelOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 1836,col 9)-(line 1836,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1849,
      "end_line": 1855,
      "comment": "\r\n     * Sets the offset for the simple labels and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getSimpleLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 1850,col 9)-(line 1852,col 9)",
        "(line 1853,col 9)-(line 1853,col 40)",
        "(line 1854,col 9)-(line 1854,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelDistributor()",
      "begin_line": 1865,
      "end_line": 1867,
      "comment": "\r\n     * Returns the object responsible for the vertical layout of the pie \r\n     * section labels.\r\n     * \r\n     * @return The label distributor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1866,col 9)-(line 1866,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)",
      "begin_line": 1877,
      "end_line": 1883,
      "comment": "\r\n     * Sets the label distributor and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param distributor  the distributor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1878,col 9)-(line 1880,col 9)",
        "(line 1881,col 9)-(line 1881,col 44)",
        "(line 1882,col 9)-(line 1882,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getToolTipGenerator()",
      "begin_line": 1894,
      "end_line": 1896,
      "comment": "\r\n     * Returns the tool tip generator, an object that is responsible for \r\n     * generating the text items used for tool tips by the plot.  If the \r\n     * generator is \u003ccode\u003enull\u003c/code\u003e, no tool tips will be created.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setToolTipGenerator(PieToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 1895,col 9)-(line 1895,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)",
      "begin_line": 1907,
      "end_line": 1910,
      "comment": "\r\n     * Sets the tool tip generator and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  Set the generator to \u003ccode\u003enull\u003c/code\u003e if you \r\n     * don\u0027t want any tool tips.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 1908,col 9)-(line 1908,col 42)",
        "(line 1909,col 9)-(line 1909,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getURLGenerator()",
      "begin_line": 1919,
      "end_line": 1921,
      "comment": "\r\n     * Returns the URL generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setURLGenerator(PieURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 1920,col 9)-(line 1920,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 1931,
      "end_line": 1934,
      "comment": "\r\n     * Sets the URL generator and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 1932,col 9)-(line 1932,col 38)",
        "(line 1933,col 9)-(line 1933,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMinimumArcAngleToDraw()",
      "begin_line": 1944,
      "end_line": 1946,
      "comment": "\r\n     * Returns the minimum arc angle that will be drawn.  Pie sections for an \r\n     * angle smaller than this are not drawn, to avoid a JDK bug.\r\n     *\r\n     * @return The minimum angle.\r\n     * \r\n     * @see #setMinimumArcAngleToDraw(double)\r\n     ",
      "child_ranges": [
        "(line 1945,col 9)-(line 1945,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMinimumArcAngleToDraw(double)",
      "begin_line": 1966,
      "end_line": 1968,
      "comment": "\r\n     * Sets the minimum arc angle that will be drawn.  Pie sections for an \r\n     * angle smaller than this are not drawn, to avoid a JDK bug.  See this \r\n     * link for details:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\"http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\"\u003e\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\u003c/a\u003e\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * ...and this bug report in the Java Bug Parade:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\r\n     * \"http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\"\u003e\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\u003c/a\u003e\r\n     *\r\n     * @param angle  the minimum angle.\r\n     * \r\n     * @see #getMinimumArcAngleToDraw()\r\n     ",
      "child_ranges": [
        "(line 1967,col 9)-(line 1967,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItemShape()",
      "begin_line": 1977,
      "end_line": 1979,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     * \r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendItemShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 1978,col 9)-(line 1978,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 1989,
      "end_line": 1995,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendItemShape()\r\n     ",
      "child_ranges": [
        "(line 1990,col 9)-(line 1992,col 9)",
        "(line 1993,col 9)-(line 1993,col 37)",
        "(line 1994,col 9)-(line 1994,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelGenerator()",
      "begin_line": 2004,
      "end_line": 2006,
      "comment": "\r\n     * Returns the legend label generator.\r\n     * \r\n     * @return The legend label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 2005,col 9)-(line 2005,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 2016,
      "end_line": 2022,
      "comment": "\r\n     * Sets the legend label generator and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 2017,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2020,col 46)",
        "(line 2021,col 9)-(line 2021,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelToolTipGenerator()",
      "begin_line": 2031,
      "end_line": 2033,
      "comment": "\r\n     * Returns the legend label tool tip generator.\r\n     * \r\n     * @return The legend label tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelToolTipGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 2032,col 9)-(line 2032,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 2043,
      "end_line": 2047,
      "comment": "\r\n     * Sets the legend label tool tip generator and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLegendLabelToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 2045,col 9)-(line 2045,col 53)",
        "(line 2046,col 9)-(line 2046,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelURLGenerator()",
      "begin_line": 2058,
      "end_line": 2060,
      "comment": "\r\n     * Returns the legend label URL generator.\r\n     * \r\n     * @return The legend label URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelURLGenerator(PieURLGenerator)\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2059,col 9)-(line 2059,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 2072,
      "end_line": 2075,
      "comment": "\r\n     * Sets the legend label URL generator and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLegendLabelURLGenerator()\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2073,col 9)-(line 2073,col 49)",
        "(line 2074,col 9)-(line 2074,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2092,
      "end_line": 2104,
      "comment": "\r\n     * Initialises the drawing procedure.  This method will be called before \r\n     * the first item is rendered, giving the plot an opportunity to initialise\r\n     * any state information it wants to maintain.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plot  the plot.\r\n     * @param index  the secondary index (\u003ccode\u003enull\u003c/code\u003e for primary \r\n     *               renderer).\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return A state object (maintains state information relevant to one \r\n     *         chart drawing).\r\n     ",
      "child_ranges": [
        "(line 2095,col 9)-(line 2095,col 52)",
        "(line 2096,col 9)-(line 2096,col 35)",
        "(line 2097,col 9)-(line 2100,col 9)",
        "(line 2101,col 9)-(line 2101,col 51)",
        "(line 2102,col 9)-(line 2102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2117,
      "end_line": 2151,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing \r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 2121,col 9)-(line 2121,col 45)",
        "(line 2122,col 9)-(line 2122,col 26)",
        "(line 2124,col 9)-(line 2127,col 9)",
        "(line 2129,col 9)-(line 2129,col 33)",
        "(line 2130,col 9)-(line 2130,col 30)",
        "(line 2132,col 9)-(line 2132,col 39)",
        "(line 2133,col 9)-(line 2133,col 22)",
        "(line 2135,col 9)-(line 2135,col 56)",
        "(line 2136,col 9)-(line 2137,col 39)",
        "(line 2139,col 9)-(line 2144,col 9)",
        "(line 2146,col 9)-(line 2146,col 30)",
        "(line 2147,col 9)-(line 2147,col 43)",
        "(line 2149,col 9)-(line 2149,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawPie(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2160,
      "end_line": 2285,
      "comment": "\r\n     * Draws the pie.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param info  chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 2163,col 9)-(line 2163,col 72)",
        "(line 2166,col 9)-(line 2166,col 34)",
        "(line 2167,col 9)-(line 2169,col 9)",
        "(line 2170,col 9)-(line 2171,col 38)",
        "(line 2172,col 9)-(line 2172,col 75)",
        "(line 2175,col 9)-(line 2186,col 9)",
        "(line 2188,col 9)-(line 2188,col 59)",
        "(line 2189,col 9)-(line 2189,col 57)",
        "(line 2190,col 9)-(line 2190,col 59)",
        "(line 2191,col 9)-(line 2191,col 58)",
        "(line 2194,col 9)-(line 2200,col 9)",
        "(line 2204,col 9)-(line 2205,col 23)",
        "(line 2206,col 9)-(line 2206,col 36)",
        "(line 2208,col 9)-(line 2214,col 9)",
        "(line 2219,col 9)-(line 2219,col 24)",
        "(line 2220,col 9)-(line 2222,col 9)",
        "(line 2223,col 9)-(line 2223,col 51)",
        "(line 2224,col 9)-(line 2224,col 52)",
        "(line 2225,col 9)-(line 2226,col 58)",
        "(line 2228,col 9)-(line 2228,col 46)",
        "(line 2233,col 9)-(line 2233,col 66)",
        "(line 2234,col 9)-(line 2234,col 79)",
        "(line 2236,col 9)-(line 2236,col 53)",
        "(line 2237,col 9)-(line 2237,col 54)",
        "(line 2238,col 9)-(line 2240,col 75)",
        "(line 2242,col 9)-(line 2245,col 9)",
        "(line 2246,col 9)-(line 2246,col 34)",
        "(line 2247,col 9)-(line 2247,col 50)",
        "(line 2248,col 9)-(line 2248,col 50)",
        "(line 2249,col 9)-(line 2249,col 54)",
        "(line 2250,col 9)-(line 2250,col 55)",
        "(line 2253,col 9)-(line 2284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)",
      "begin_line": 2296,
      "end_line": 2378,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param section  the section index.\r\n     * @param dataArea  the data plot area.\r\n     * @param state  state information for one chart.\r\n     * @param currentPass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 2299,col 9)-(line 2299,col 50)",
        "(line 2300,col 9)-(line 2302,col 9)",
        "(line 2303,col 9)-(line 2303,col 39)",
        "(line 2304,col 9)-(line 2304,col 28)",
        "(line 2305,col 9)-(line 2305,col 28)",
        "(line 2307,col 9)-(line 2317,col 9)",
        "(line 2319,col 9)-(line 2319,col 41)",
        "(line 2320,col 9)-(line 2376,col 9)",
        "(line 2377,col 9)-(line 2377,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawSimpleLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2392,
      "end_line": 2474,
      "comment": "\r\n     * Draws the pie section labels in the simple form.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param keys  the section keys.\r\n     * @param totalValue  the total value for all sections in the pie.\r\n     * @param plotArea  the plot area.\r\n     * @param pieArea  the area containing the pie.\r\n     * @param state  the plot state.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2396,col 9)-(line 2396,col 56)",
        "(line 2397,col 9)-(line 2398,col 23)",
        "(line 2400,col 9)-(line 2401,col 40)",
        "(line 2402,col 9)-(line 2402,col 75)",
        "(line 2403,col 9)-(line 2403,col 34)",
        "(line 2404,col 9)-(line 2404,col 44)",
        "(line 2405,col 9)-(line 2470,col 9)",
        "(line 2472,col 9)-(line 2472,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2486,
      "end_line": 2547,
      "comment": "\r\n     * Draws the labels for the pie sections.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param keys  the keys.\r\n     * @param totalValue  the total value.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2490,col 9)-(line 2490,col 56)",
        "(line 2491,col 9)-(line 2492,col 23)",
        "(line 2495,col 9)-(line 2495,col 63)",
        "(line 2496,col 9)-(line 2496,col 64)",
        "(line 2498,col 9)-(line 2498,col 34)",
        "(line 2499,col 9)-(line 2499,col 44)",
        "(line 2500,col 9)-(line 2526,col 9)",
        "(line 2528,col 9)-(line 2528,col 35)",
        "(line 2532,col 9)-(line 2533,col 38)",
        "(line 2534,col 9)-(line 2534,col 57)",
        "(line 2535,col 9)-(line 2535,col 52)",
        "(line 2536,col 9)-(line 2536,col 67)",
        "(line 2539,col 9)-(line 2544,col 9)",
        "(line 2545,col 9)-(line 2545,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2561,
      "end_line": 2601,
      "comment": "\r\n     * Draws the left labels.\r\n     * \r\n     * @param leftKeys  a collection of keys and angles (to the middle of the\r\n     *         section, in degrees) for the sections on the left side of the \r\n     *         plot.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2565,col 9)-(line 2565,col 38)",
        "(line 2566,col 9)-(line 2566,col 58)",
        "(line 2567,col 9)-(line 2567,col 74)",
        "(line 2568,col 9)-(line 2592,col 9)",
        "(line 2593,col 9)-(line 2593,col 41)",
        "(line 2594,col 9)-(line 2594,col 43)",
        "(line 2595,col 9)-(line 2596,col 30)",
        "(line 2597,col 9)-(line 2600,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2613,
      "end_line": 2655,
      "comment": "\r\n     * Draws the right labels.\r\n     * \r\n     * @param keys  the keys.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2618,col 9)-(line 2618,col 38)",
        "(line 2619,col 9)-(line 2619,col 58)",
        "(line 2620,col 9)-(line 2620,col 74)",
        "(line 2622,col 9)-(line 2645,col 9)",
        "(line 2646,col 9)-(line 2646,col 41)",
        "(line 2647,col 9)-(line 2647,col 43)",
        "(line 2648,col 9)-(line 2649,col 30)",
        "(line 2650,col 9)-(line 2653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItems()",
      "begin_line": 2662,
      "end_line": 2721,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2664,col 9)-(line 2664,col 65)",
        "(line 2665,col 9)-(line 2667,col 9)",
        "(line 2668,col 9)-(line 2668,col 43)",
        "(line 2669,col 9)-(line 2669,col 24)",
        "(line 2670,col 9)-(line 2670,col 43)",
        "(line 2671,col 9)-(line 2671,col 44)",
        "(line 2672,col 9)-(line 2719,col 9)",
        "(line 2720,col 9)-(line 2720,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPlotType()",
      "begin_line": 2728,
      "end_line": 2730,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 2729,col 9)-(line 2729,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)",
      "begin_line": 2746,
      "end_line": 2767,
      "comment": "\r\n     * Returns a rectangle that can be used to create a pie section (taking\r\n     * into account the amount by which the pie section is \u0027exploded\u0027).\r\n     *\r\n     * @param unexploded  the area inside which the unexploded pie sections are\r\n     *                    drawn.\r\n     * @param exploded  the area inside which the exploded pie sections are \r\n     *                  drawn.\r\n     * @param angle  the start angle.\r\n     * @param extent  the extent of the arc.\r\n     * @param explodePercent  the amount by which the pie section is exploded.\r\n     *\r\n     * @return A rectangle that can be used to create a pie section.\r\n     ",
      "child_ranges": [
        "(line 2751,col 9)-(line 2766,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2776,
      "end_line": 2818,
      "comment": "\r\n     * Draws a section label on the left side of the pie chart.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     ",
      "child_ranges": [
        "(line 2779,col 9)-(line 2779,col 55)",
        "(line 2780,col 9)-(line 2780,col 51)",
        "(line 2781,col 9)-(line 2781,col 48)",
        "(line 2783,col 9)-(line 2814,col 9)",
        "(line 2815,col 9)-(line 2815,col 39)",
        "(line 2816,col 9)-(line 2816,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2827,
      "end_line": 2870,
      "comment": "\r\n     * Draws a section label on the right side of the pie chart.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     ",
      "child_ranges": [
        "(line 2830,col 9)-(line 2830,col 55)",
        "(line 2831,col 9)-(line 2831,col 51)",
        "(line 2832,col 9)-(line 2832,col 48)",
        "(line 2834,col 9)-(line 2865,col 9)",
        "(line 2867,col 9)-(line 2867,col 39)",
        "(line 2868,col 9)-(line 2868,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.equals(java.lang.Object)",
      "begin_line": 2880,
      "end_line": 3038,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the \r\n     * plot\u0027s dataset is NOT included in the test for equality.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 2881,col 9)-(line 2883,col 9)",
        "(line 2884,col 9)-(line 2886,col 9)",
        "(line 2887,col 9)-(line 2889,col 9)",
        "(line 2890,col 9)-(line 2890,col 37)",
        "(line 2891,col 9)-(line 2893,col 9)",
        "(line 2894,col 9)-(line 2896,col 9)",
        "(line 2897,col 9)-(line 2899,col 9)",
        "(line 2900,col 9)-(line 2902,col 9)",
        "(line 2903,col 9)-(line 2905,col 9)",
        "(line 2906,col 9)-(line 2908,col 9)",
        "(line 2909,col 9)-(line 2911,col 9)",
        "(line 2912,col 9)-(line 2915,col 9)",
        "(line 2916,col 9)-(line 2919,col 9)",
        "(line 2920,col 9)-(line 2922,col 9)",
        "(line 2923,col 9)-(line 2926,col 9)",
        "(line 2927,col 9)-(line 2931,col 9)",
        "(line 2932,col 9)-(line 2935,col 9)",
        "(line 2936,col 9)-(line 2940,col 9)",
        "(line 2941,col 9)-(line 2943,col 9)",
        "(line 2944,col 9)-(line 2946,col 9)",
        "(line 2947,col 9)-(line 2949,col 9)",
        "(line 2950,col 9)-(line 2953,col 9)",
        "(line 2954,col 9)-(line 2957,col 9)",
        "(line 2958,col 9)-(line 2960,col 9)",
        "(line 2961,col 9)-(line 2963,col 9)",
        "(line 2964,col 9)-(line 2967,col 9)",
        "(line 2968,col 9)-(line 2971,col 9)",
        "(line 2972,col 9)-(line 2975,col 9)",
        "(line 2976,col 9)-(line 2979,col 9)",
        "(line 2980,col 9)-(line 2982,col 9)",
        "(line 2983,col 9)-(line 2985,col 9)",
        "(line 2986,col 9)-(line 2988,col 9)",
        "(line 2989,col 9)-(line 2991,col 9)",
        "(line 2992,col 9)-(line 2994,col 9)",
        "(line 2995,col 9)-(line 2997,col 9)",
        "(line 2998,col 9)-(line 3000,col 9)",
        "(line 3001,col 9)-(line 3003,col 9)",
        "(line 3004,col 9)-(line 3006,col 9)",
        "(line 3007,col 9)-(line 3010,col 9)",
        "(line 3011,col 9)-(line 3014,col 9)",
        "(line 3015,col 9)-(line 3017,col 9)",
        "(line 3018,col 9)-(line 3020,col 9)",
        "(line 3021,col 9)-(line 3023,col 9)",
        "(line 3024,col 9)-(line 3027,col 9)",
        "(line 3028,col 9)-(line 3031,col 9)",
        "(line 3032,col 9)-(line 3035,col 9)",
        "(line 3037,col 9)-(line 3037,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clone()",
      "begin_line": 3048,
      "end_line": 3071,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 3049,col 9)-(line 3049,col 48)",
        "(line 3050,col 9)-(line 3052,col 9)",
        "(line 3053,col 9)-(line 3056,col 9)",
        "(line 3057,col 9)-(line 3057,col 75)",
        "(line 3058,col 9)-(line 3061,col 9)",
        "(line 3062,col 9)-(line 3065,col 9)",
        "(line 3066,col 9)-(line 3069,col 9)",
        "(line 3070,col 9)-(line 3070,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 3080,
      "end_line": 3094,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 3081,col 9)-(line 3081,col 36)",
        "(line 3082,col 9)-(line 3082,col 66)",
        "(line 3083,col 9)-(line 3083,col 73)",
        "(line 3084,col 9)-(line 3084,col 75)",
        "(line 3085,col 9)-(line 3085,col 61)",
        "(line 3086,col 9)-(line 3086,col 60)",
        "(line 3087,col 9)-(line 3087,col 70)",
        "(line 3088,col 9)-(line 3088,col 67)",
        "(line 3089,col 9)-(line 3089,col 69)",
        "(line 3090,col 9)-(line 3090,col 66)",
        "(line 3091,col 9)-(line 3091,col 64)",
        "(line 3092,col 9)-(line 3092,col 66)",
        "(line 3093,col 9)-(line 3093,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 3104,
      "end_line": 3119,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 3106,col 9)-(line 3106,col 35)",
        "(line 3107,col 9)-(line 3107,col 66)",
        "(line 3108,col 9)-(line 3108,col 73)",
        "(line 3109,col 9)-(line 3109,col 75)",
        "(line 3110,col 9)-(line 3110,col 61)",
        "(line 3111,col 9)-(line 3111,col 60)",
        "(line 3112,col 9)-(line 3112,col 70)",
        "(line 3113,col 9)-(line 3113,col 67)",
        "(line 3114,col 9)-(line 3114,col 69)",
        "(line 3115,col 9)-(line 3115,col 66)",
        "(line 3116,col 9)-(line 3116,col 64)",
        "(line 3117,col 9)-(line 3117,col 66)",
        "(line 3118,col 9)-(line 3118,col 65)"
      ]
    }
  ]
}