{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/PiePlot.java",
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
      "begin_line": 229,
      "end_line": 3033,
      "comment": "\r\n * A plot that displays data in the form of a pie chart, using data from any \r\n * class that implements the {@link PieDataset} interface.\r\n * \u003cP\u003e\r\n * Special notes:\r\n * \u003col\u003e\r\n * \u003cli\u003ethe default starting point is 12 o\u0027clock and the pie sections proceed\r\n * in a clockwise direction, but these settings can be changed;\u003c/li\u003e\r\n * \u003cli\u003enegative values in the dataset are ignored;\u003c/li\u003e\r\n * \u003cli\u003ethere are utility methods for creating a {@link PieDataset} from a\r\n * {@link org.jfree.data.category.CategoryDataset};\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n *\r\n * @see Plot\r\n * @see PieDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " The default starting angle for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 244,
      "end_line": 245,
      "comment": " The default section label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " The default section label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 251,
      "end_line": 252,
      "comment": " The default section label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " The default section label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 258,
      "end_line": 259,
      "comment": " The default section label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 262,
      "end_line": 263,
      "comment": " The default section label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " The default minimum arc angle to draw. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The dataset for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "pieIndex"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The pie index (used by the {@link MultiplePiePlot} class). "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " \r\n     * The amount of space left around the outside of the pie plot, expressed \r\n     * as a percentage of the plot area width and height. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "circular"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Flag determining whether to draw an ellipse or a perfect circle. "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The direction for the pie segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaintMap"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The section paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionPaint"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " The base section paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinesVisible"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " \r\n     * A flag that controls whether or not an outline is drawn for each\r\n     * section in the plot.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinePaintMap"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " The section outline paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlinePaint"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " The base section outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlineStrokeMap"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " The section outline stroke map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlineStroke"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " The base section outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "shadowPaint"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " The shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowXOffset"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " The x-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowYOffset"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " The y-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "explodePercentages"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " The percentage amount to explode each pie section. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " The section label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " The font used to display the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " The color used to draw the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelBackgroundPaint"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " \r\n     * The color used to draw the background of the section labels.  If this\r\n     * is \u003ccode\u003enull\u003c/code\u003e, the background is not filled.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlinePaint"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " \r\n     * The paint used to draw the outline of the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlineStroke"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " \r\n     * The stroke used to draw the outline of the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelShadowPaint"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " \r\n     * The paint used to draw the shadow for the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabels"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": "\r\n     * A flag that controls whether simple or extended labels are used.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelPadding"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": "\r\n     * The padding between the labels and the label outlines.  This is not\r\n     * allowed to be \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabelOffset"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": "\r\n     * The simple label offset.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumLabelWidth"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " The maximum label width as a percentage of the plot width. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGap"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " \r\n     * The gap between the labels and the link corner, as a percentage of the \r\n     * plot width. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinksVisible"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " A flag that controls whether or not the label links are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkMargin"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " The link margin. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkPaint"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " The paint used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStroke"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " The stroke used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelDistributor"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " \r\n     * The pie section label distributor.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": " The tooltip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": " The URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelGenerator"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": " The legend label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelToolTipGenerator"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": " A tool tip generator for the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelURLGenerator"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": " \r\n     * A URL generator for the legend items (optional).  \r\n     *\r\n     * @since 1.0.4. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreNullValues"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": " \r\n     * A flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored.  \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreZeroValues"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": "\r\n     * A flag that controls whether zero values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumArcAngleToDraw"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": "\r\n     * The smallest arc angle that will get drawn (this is to avoid a bug in \r\n     * various Java implementations that causes the JVM to crash).  See this \r\n     * link for details:\r\n     *\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\r\n     *\r\n     * ...and this bug report in the Java Bug Parade:\r\n     *\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 454,
      "end_line": 455,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_INTERIOR"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " \r\n     * This debug flag controls whether or not an outline is drawn showing the \r\n     * interior of the plot region.  This is drawn as a lightGray rectangle \r\n     * showing the padding provided by the \u0027interiorGap\u0027 setting.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_LINK_AREA"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": " \r\n     * This debug flag controls whether or not an outline is drawn showing the \r\n     * link area (in blue) and link ellipse (in yellow).  This controls where \r\n     * the label links have \u0027elbow\u0027 points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_PIE_AREA"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": "\r\n     * This debug flag controls whether or not an outline is drawn showing\r\n     * the pie area (in green).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n     * Creates a new plot.  The dataset is initially set to \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot(org.jfree.data.general.PieDataset)",
      "begin_line": 489,
      "end_line": 539,
      "comment": "\r\n     * Creates a plot that will draw a pie chart for the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 16)",
        "(line 491,col 9)-(line 491,col 31)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 26)",
        "(line 497,col 9)-(line 497,col 48)",
        "(line 498,col 9)-(line 498,col 29)",
        "(line 499,col 9)-(line 499,col 46)",
        "(line 500,col 9)-(line 500,col 44)",
        "(line 501,col 9)-(line 501,col 71)",
        "(line 503,col 9)-(line 503,col 46)",
        "(line 504,col 9)-(line 504,col 43)",
        "(line 506,col 9)-(line 506,col 43)",
        "(line 507,col 9)-(line 507,col 53)",
        "(line 508,col 9)-(line 508,col 61)",
        "(line 510,col 9)-(line 510,col 55)",
        "(line 511,col 9)-(line 511,col 63)",
        "(line 513,col 9)-(line 513,col 48)",
        "(line 515,col 9)-(line 515,col 69)",
        "(line 516,col 9)-(line 516,col 44)",
        "(line 517,col 9)-(line 517,col 46)",
        "(line 518,col 9)-(line 518,col 67)",
        "(line 519,col 9)-(line 519,col 61)",
        "(line 520,col 9)-(line 520,col 63)",
        "(line 521,col 9)-(line 521,col 59)",
        "(line 522,col 9)-(line 522,col 38)",
        "(line 523,col 9)-(line 523,col 59)",
        "(line 525,col 9)-(line 525,col 34)",
        "(line 526,col 9)-(line 527,col 34)",
        "(line 528,col 9)-(line 528,col 60)",
        "(line 530,col 9)-(line 530,col 37)",
        "(line 531,col 9)-(line 531,col 33)",
        "(line 532,col 9)-(line 532,col 75)",
        "(line 533,col 9)-(line 533,col 48)",
        "(line 534,col 9)-(line 534,col 44)",
        "(line 535,col 9)-(line 535,col 63)",
        "(line 537,col 9)-(line 537,col 38)",
        "(line 538,col 9)-(line 538,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDataset()",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(PieDataset)\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDataset(org.jfree.data.general.PieDataset)",
      "begin_line": 559,
      "end_line": 577,
      "comment": "\r\n     * Sets the dataset and sends a {@link DatasetChangeEvent} to \u0027this\u0027.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 43)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 568,col 9)-(line 568,col 31)",
        "(line 569,col 9)-(line 572,col 9)",
        "(line 575,col 9)-(line 575,col 73)",
        "(line 576,col 9)-(line 576,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPieIndex()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\r\n     * Returns the pie index (this is used by the {@link MultiplePiePlot} class\r\n     * to track subplots).\r\n     * \r\n     * @return The pie index.\r\n     * \r\n     * @see #setPieIndex(int)\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setPieIndex(int)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\r\n     * Sets the pie index (this is used by the {@link MultiplePiePlot} class to \r\n     * track subplots).\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @see #getPieIndex()\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getStartAngle()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\r\n     * Returns the start angle for the first pie section.  This is measured in \r\n     * degrees starting from 3 o\u0027clock and measuring anti-clockwise.\r\n     *\r\n     * @return The start angle.\r\n     * \r\n     * @see #setStartAngle(double)\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setStartAngle(double)",
      "begin_line": 625,
      "end_line": 628,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  The initial default value is 90 degrees, which \r\n     * corresponds to 12 o\u0027clock.  A value of zero corresponds to 3 o\u0027clock...\r\n     * this is the encoding used by Java\u0027s Arc2D class.\r\n     *\r\n     * @param angle  the angle (in degrees).\r\n     * \r\n     * @see #getStartAngle()\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 32)",
        "(line 627,col 9)-(line 627,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDirection()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\r\n     * Returns the direction in which the pie sections are drawn (clockwise or \r\n     * anti-clockwise).\r\n     *\r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDirection(Rotation)\r\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 650,
      "end_line": 657,
      "comment": "\r\n     * Sets the direction in which the pie sections are drawn and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDirection()\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 35)",
        "(line 655,col 9)-(line 655,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getInteriorGap()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available \r\n     * drawing space.\r\n     *\r\n     * @return The gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #setInteriorGap(double)\r\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setInteriorGap(double)",
      "begin_line": 681,
      "end_line": 693,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  This controls the space between the edges of the \r\n     * pie plot and the plot area itself (the region where the section labels \r\n     * appear).\r\n     *\r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #getInteriorGap()\r\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 686,col 9)",
        "(line 688,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.isCircular()",
      "begin_line": 703,
      "end_line": 705,
      "comment": "\r\n     * Returns a flag indicating whether the pie chart is circular, or\r\n     * stretched into an elliptical shape.\r\n     *\r\n     * @return A flag indicating whether the pie chart is circular.\r\n     * \r\n     * @see #setCircular(boolean)\r\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\r\n     * A flag indicating whether the pie chart is circular, or stretched into\r\n     * an elliptical shape.\r\n     *\r\n     * @param flag  the new value.\r\n     * \r\n     * @see #isCircular()\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean, boolean)",
      "begin_line": 728,
      "end_line": 733,
      "comment": "\r\n     * Sets the circular attribute and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param circular  the new value of the flag.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #isCircular()\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 33)",
        "(line 730,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreNullValues()",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\r\n     * Returns the flag that controls whether \u003ccode\u003enull\u003c/code\u003e values in the \r\n     * dataset are ignored.  \r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setIgnoreNullValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreNullValues(boolean)",
      "begin_line": 758,
      "end_line": 761,
      "comment": "\r\n     * Sets a flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  At \r\n     * present, this only affects whether or not the key is presented in the \r\n     * legend.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getIgnoreNullValues()\r\n     * @see #setIgnoreZeroValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 37)",
        "(line 760,col 9)-(line 760,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreZeroValues()",
      "begin_line": 771,
      "end_line": 773,
      "comment": "\r\n     * Returns the flag that controls whether zero values in the \r\n     * dataset are ignored.  \r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setIgnoreZeroValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreZeroValues(boolean)",
      "begin_line": 786,
      "end_line": 789,
      "comment": "\r\n     * Sets a flag that controls whether zero values are ignored, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  This \r\n     * only affects whether or not a label appears for the non-visible\r\n     * pie section.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getIgnoreZeroValues()\r\n     * @see #setIgnoreNullValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 37)",
        "(line 788,col 9)-(line 788,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable)",
      "begin_line": 805,
      "end_line": 807,
      "comment": "\r\n     * Returns the paint for the specified section.  This is equivalent to\r\n     * \u003ccode\u003elookupSectionPaint(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The paint for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionPaint(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable, boolean)",
      "begin_line": 830,
      "end_line": 854,
      "comment": "\r\n     * Returns the paint for the specified section.  The lookup involves these\r\n     * steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is non-\u003ccode\u003enull\u003c/code\u003e \r\n     *         return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is \u003ccode\u003enull\u003c/code\u003e but \r\n     *         \u003ccode\u003eautoPopulate\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch\r\n     *         a new paint from the drawing supplier \r\n     *         ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionPaint()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section paint settings.\r\n     *     \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 28)",
        "(line 834,col 9)-(line 834,col 52)",
        "(line 835,col 9)-(line 837,col 9)",
        "(line 840,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionKey(int)",
      "begin_line": 870,
      "end_line": 881,
      "comment": "\r\n     * Returns a key for the specified section.  If there is no such section \r\n     * in the dataset, we generate a key.  This is to provide some backward\r\n     * compatibility for the (now deprecated) methods that get/set attributes \r\n     * based on section indices.  The preferred way of doing this now is to\r\n     * link the attributes directly to the section key (there are new methods\r\n     * for this, starting from version 1.0.3).  \r\n     * \r\n     * @param section  the section index.\r\n     * \r\n     * @return The key.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 30)",
        "(line 872,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionPaint(java.lang.Comparable)",
      "begin_line": 899,
      "end_line": 902,
      "comment": "\r\n     * Returns the paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionPaint(Comparable, Paint)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionPaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 918,
      "end_line": 922,
      "comment": "\r\n     * Sets the paint associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionPaint(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 45)",
        "(line 921,col 9)-(line 921,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionPaint()",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is \r\n     * defined, which is rare.  The default value is \u003ccode\u003eColor.gray\u003c/code\u003e.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionPaint(java.awt.Paint)",
      "begin_line": 944,
      "end_line": 950,
      "comment": "\r\n     * Sets the base section paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionPaint()\r\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 948,col 38)",
        "(line 949,col 9)-(line 949,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinesVisible()",
      "begin_line": 963,
      "end_line": 965,
      "comment": "\r\n     * Returns the flag that controls whether or not the outline is drawn for\r\n     * each pie section.\r\n     * \r\n     * @return The flag that controls whether or not the outline is drawn for\r\n     *         each pie section.\r\n     *         \r\n     * @see #setSectionOutlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinesVisible(boolean)",
      "begin_line": 976,
      "end_line": 979,
      "comment": "\r\n     * Sets the flag that controls whether or not the outline is drawn for \r\n     * each pie section, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSectionOutlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 46)",
        "(line 978,col 9)-(line 978,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\r\n     * Returns the outline paint for the specified section.  This is equivalent \r\n     * to \u003ccode\u003elookupSectionPaint(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The paint for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionOutlinePaint(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable, boolean)",
      "begin_line": 1018,
      "end_line": 1044,
      "comment": "\r\n     * Returns the outline paint for the specified section.  The lookup \r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is \r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is \r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is \r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline paint from \r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlinePaint()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section outline paint settings.\r\n     *     \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 28)",
        "(line 1024,col 9)-(line 1024,col 59)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1030,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1043,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 1062,
      "end_line": 1065,
      "comment": "\r\n     * Returns the outline paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionOutlinePaint(Comparable, Paint)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 1081,
      "end_line": 1085,
      "comment": "\r\n     * Sets the outline paint associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionOutlinePaint(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 52)",
        "(line 1084,col 9)-(line 1084,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlinePaint()",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is \r\n     * available.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlinePaint(java.awt.Paint)",
      "begin_line": 1106,
      "end_line": 1112,
      "comment": "\r\n     * Sets the base section paint.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 45)",
        "(line 1111,col 9)-(line 1111,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  This is equivalent \r\n     * to \u003ccode\u003elookupSectionOutlineStroke(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The stroke for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionOutlineStroke(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable, boolean)",
      "begin_line": 1153,
      "end_line": 1179,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  The lookup \r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is \r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is \r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is \r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline stroke from \r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlineStroke()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section outline stroke settings.\r\n     *     \r\n     * @return The stroke.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 29)",
        "(line 1159,col 9)-(line 1159,col 61)",
        "(line 1160,col 9)-(line 1162,col 9)",
        "(line 1165,col 9)-(line 1177,col 9)",
        "(line 1178,col 9)-(line 1178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1197,
      "end_line": 1200,
      "comment": "\r\n     * Returns the outline stroke associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no stroke associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The stroke associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionOutlineStroke(Comparable, Stroke)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlineStroke(java.lang.Comparable, java.awt.Stroke)",
      "begin_line": 1216,
      "end_line": 1220,
      "comment": "\r\n     * Sets the outline stroke associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionOutlineStroke(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 54)",
        "(line 1219,col 9)-(line 1219,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlineStroke()",
      "begin_line": 1230,
      "end_line": 1232,
      "comment": "\r\n     * Returns the base section stroke.  This is used when no other stroke is \r\n     * available.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlineStroke(java.awt.Stroke)",
      "begin_line": 1241,
      "end_line": 1247,
      "comment": "\r\n     * Sets the base section stroke.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1244,col 9)",
        "(line 1245,col 9)-(line 1245,col 47)",
        "(line 1246,col 9)-(line 1246,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowPaint()",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\r\n     * Returns the shadow paint.\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowPaint(java.awt.Paint)",
      "begin_line": 1268,
      "end_line": 1271,
      "comment": "\r\n     * Sets the shadow paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1269,col 33)",
        "(line 1270,col 9)-(line 1270,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowXOffset()",
      "begin_line": 1280,
      "end_line": 1282,
      "comment": "\r\n     * Returns the x-offset for the shadow effect.\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setShadowXOffset(double)\r\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowXOffset(double)",
      "begin_line": 1292,
      "end_line": 1295,
      "comment": "\r\n     * Sets the x-offset for the shadow effect and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getShadowXOffset()\r\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1293,col 36)",
        "(line 1294,col 9)-(line 1294,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowYOffset()",
      "begin_line": 1304,
      "end_line": 1306,
      "comment": "\r\n     * Returns the y-offset for the shadow effect.\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setShadowYOffset(double)\r\n     ",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowYOffset(double)",
      "begin_line": 1316,
      "end_line": 1319,
      "comment": "\r\n     * Sets the y-offset for the shadow effect and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getShadowYOffset()\r\n     ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 36)",
        "(line 1318,col 9)-(line 1318,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getExplodePercent(java.lang.Comparable)",
      "begin_line": 1337,
      "end_line": 1346,
      "comment": "\r\n     * Returns the amount that the section with the specified key should be\r\n     * exploded.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The amount that the section with the specified key should be\r\n     *     exploded.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.3\r\n     * \r\n     * @see #setExplodePercent(Comparable, double)\r\n     ",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 28)",
        "(line 1339,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setExplodePercent(java.lang.Comparable, double)",
      "begin_line": 1359,
      "end_line": 1368,
      "comment": "\r\n     * Sets the amount that a pie section should be exploded and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percent  the explode percentage (0.30 \u003d 30 percent).\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #getExplodePercent(Comparable)\r\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 62)",
        "(line 1367,col 9)-(line 1367,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumExplodePercent()",
      "begin_line": 1375,
      "end_line": 1386,
      "comment": "\r\n     * Returns the maximum explode percent.\r\n     * \r\n     * @return The percent.\r\n     ",
      "child_ranges": [
        "(line 1376,col 9)-(line 1376,col 28)",
        "(line 1377,col 9)-(line 1377,col 62)",
        "(line 1378,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGenerator()",
      "begin_line": 1395,
      "end_line": 1397,
      "comment": "\r\n     * Returns the section label generator. \r\n     * \r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1407,
      "end_line": 1410,
      "comment": "\r\n     * Sets the section label generator and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 40)",
        "(line 1409,col 9)-(line 1409,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGap()",
      "begin_line": 1420,
      "end_line": 1422,
      "comment": "\r\n     * Returns the gap between the edge of the pie and the labels, expressed as \r\n     * a percentage of the plot width.\r\n     * \r\n     * @return The gap (a percentage, where 0.05 \u003d five percent).\r\n     * \r\n     * @see #setLabelGap(double)\r\n     ",
      "child_ranges": [
        "(line 1421,col 9)-(line 1421,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGap(double)",
      "begin_line": 1433,
      "end_line": 1436,
      "comment": "\r\n     * Sets the gap between the edge of the pie and the labels (expressed as a \r\n     * percentage of the plot width) and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param gap  the gap (a percentage, where 0.05 \u003d five percent).\r\n     * \r\n     * @see #getLabelGap()\r\n     ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 28)",
        "(line 1435,col 9)-(line 1435,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumLabelWidth()",
      "begin_line": 1445,
      "end_line": 1447,
      "comment": "\r\n     * Returns the maximum label width as a percentage of the plot width.\r\n     * \r\n     * @return The width (a percentage, where 0.20 \u003d 20 percent).\r\n     * \r\n     * @see #setMaximumLabelWidth(double)\r\n     ",
      "child_ranges": [
        "(line 1446,col 9)-(line 1446,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMaximumLabelWidth(double)",
      "begin_line": 1457,
      "end_line": 1460,
      "comment": "\r\n     * Sets the maximum label width as a percentage of the plot width and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param width  the width (a percentage, where 0.20 \u003d 20 percent).\r\n     * \r\n     * @see #getMaximumLabelWidth()\r\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 39)",
        "(line 1459,col 9)-(line 1459,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinksVisible()",
      "begin_line": 1470,
      "end_line": 1472,
      "comment": "\r\n     * Returns the flag that controls whether or not label linking lines are\r\n     * visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setLabelLinksVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinksVisible(boolean)",
      "begin_line": 1485,
      "end_line": 1488,
      "comment": "\r\n     * Sets the flag that controls whether or not label linking lines are \r\n     * visible and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * Please take care when hiding the linking lines - depending on the data \r\n     * values, the labels can be displayed some distance away from the\r\n     * corresponding pie section.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getLabelLinksVisible()\r\n     ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1486,col 41)",
        "(line 1487,col 9)-(line 1487,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkMargin()",
      "begin_line": 1498,
      "end_line": 1500,
      "comment": "\r\n     * Returns the margin (expressed as a percentage of the width or height) \r\n     * between the edge of the pie and the link point.\r\n     * \r\n     * @return The link margin (as a percentage, where 0.05 is five percent).\r\n     * \r\n     * @see #setLabelLinkMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1499,col 9)-(line 1499,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkMargin(double)",
      "begin_line": 1510,
      "end_line": 1513,
      "comment": "\r\n     * Sets the link margin and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param margin  the margin.\r\n     * \r\n     * @see #getLabelLinkMargin()\r\n     ",
      "child_ranges": [
        "(line 1511,col 9)-(line 1511,col 38)",
        "(line 1512,col 9)-(line 1512,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkPaint()",
      "begin_line": 1523,
      "end_line": 1525,
      "comment": "\r\n     * Returns the paint used for the lines that connect pie sections to their \r\n     * corresponding labels.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelLinkPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1524,col 9)-(line 1524,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkPaint(java.awt.Paint)",
      "begin_line": 1536,
      "end_line": 1542,
      "comment": "\r\n     * Sets the paint used for the lines that connect pie sections to their \r\n     * corresponding labels, and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelLinkPaint()\r\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1539,col 9)",
        "(line 1540,col 9)-(line 1540,col 36)",
        "(line 1541,col 9)-(line 1541,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkStroke()",
      "begin_line": 1551,
      "end_line": 1553,
      "comment": "\r\n     * Returns the stroke used for the label linking lines.\r\n     * \r\n     * @return The stroke.\r\n     * \r\n     * @see #setLabelLinkStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkStroke(java.awt.Stroke)",
      "begin_line": 1563,
      "end_line": 1569,
      "comment": "\r\n     * Sets the link stroke and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #getLabelLinkStroke()\r\n     ",
      "child_ranges": [
        "(line 1564,col 9)-(line 1566,col 9)",
        "(line 1567,col 9)-(line 1567,col 38)",
        "(line 1568,col 9)-(line 1568,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelFont()",
      "begin_line": 1578,
      "end_line": 1580,
      "comment": "\r\n     * Returns the section label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 1579,col 9)-(line 1579,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelFont(java.awt.Font)",
      "begin_line": 1590,
      "end_line": 1596,
      "comment": "\r\n     * Sets the section label font and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1591,col 9)-(line 1593,col 9)",
        "(line 1594,col 9)-(line 1594,col 30)",
        "(line 1595,col 9)-(line 1595,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPaint()",
      "begin_line": 1605,
      "end_line": 1607,
      "comment": "\r\n     * Returns the section label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1606,col 9)-(line 1606,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 1617,
      "end_line": 1623,
      "comment": "\r\n     * Sets the section label paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1620,col 9)",
        "(line 1621,col 9)-(line 1621,col 32)",
        "(line 1622,col 9)-(line 1622,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelBackgroundPaint()",
      "begin_line": 1632,
      "end_line": 1634,
      "comment": "\r\n     * Returns the section label background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1633,col 9)-(line 1633,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelBackgroundPaint(java.awt.Paint)",
      "begin_line": 1644,
      "end_line": 1647,
      "comment": "\r\n     * Sets the section label background paint and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 1645,col 9)-(line 1645,col 42)",
        "(line 1646,col 9)-(line 1646,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlinePaint()",
      "begin_line": 1656,
      "end_line": 1658,
      "comment": "\r\n     * Returns the section label outline paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1657,col 9)-(line 1657,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlinePaint(java.awt.Paint)",
      "begin_line": 1668,
      "end_line": 1671,
      "comment": "\r\n     * Sets the section label outline paint and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1669,col 9)-(line 1669,col 39)",
        "(line 1670,col 9)-(line 1670,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlineStroke()",
      "begin_line": 1680,
      "end_line": 1682,
      "comment": "\r\n     * Returns the section label outline stroke.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1681,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlineStroke(java.awt.Stroke)",
      "begin_line": 1692,
      "end_line": 1695,
      "comment": "\r\n     * Sets the section label outline stroke and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1693,col 41)",
        "(line 1694,col 9)-(line 1694,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelShadowPaint()",
      "begin_line": 1704,
      "end_line": 1706,
      "comment": "\r\n     * Returns the section label shadow paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1705,col 9)-(line 1705,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelShadowPaint(java.awt.Paint)",
      "begin_line": 1716,
      "end_line": 1719,
      "comment": "\r\n     * Sets the section label shadow paint and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 38)",
        "(line 1718,col 9)-(line 1718,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPadding()",
      "begin_line": 1730,
      "end_line": 1732,
      "comment": "\r\n     * Returns the label padding.\r\n     * \r\n     * @return The label padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setLabelPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 1731,col 9)-(line 1731,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1744,
      "end_line": 1750,
      "comment": "\r\n     * Sets the padding between each label and its outline and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getLabelPadding()\r\n     ",
      "child_ranges": [
        "(line 1745,col 9)-(line 1747,col 9)",
        "(line 1748,col 9)-(line 1748,col 36)",
        "(line 1749,col 9)-(line 1749,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabels()",
      "begin_line": 1760,
      "end_line": 1762,
      "comment": "\r\n     * Returns the flag that controls whether simple or extended labels are\r\n     * displayed on the plot.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1761,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabels(boolean)",
      "begin_line": 1773,
      "end_line": 1776,
      "comment": "\r\n     * Sets the flag that controls whether simple or extended labels are \r\n     * displayed on the plot, and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param simple  the new flag value.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1774,col 9)-(line 1774,col 35)",
        "(line 1775,col 9)-(line 1775,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabelOffset()",
      "begin_line": 1787,
      "end_line": 1789,
      "comment": "\r\n     * Returns the offset used for the simple labels, if they are displayed.\r\n     * \r\n     * @return The offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setSimpleLabelOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 1788,col 9)-(line 1788,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1801,
      "end_line": 1807,
      "comment": "\r\n     * Sets the offset for the simple labels and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getSimpleLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 1802,col 9)-(line 1804,col 9)",
        "(line 1805,col 9)-(line 1805,col 40)",
        "(line 1806,col 9)-(line 1806,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelDistributor()",
      "begin_line": 1817,
      "end_line": 1819,
      "comment": "\r\n     * Returns the object responsible for the vertical layout of the pie \r\n     * section labels.\r\n     * \r\n     * @return The label distributor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1818,col 9)-(line 1818,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)",
      "begin_line": 1829,
      "end_line": 1835,
      "comment": "\r\n     * Sets the label distributor and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param distributor  the distributor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1830,col 9)-(line 1832,col 9)",
        "(line 1833,col 9)-(line 1833,col 44)",
        "(line 1834,col 9)-(line 1834,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getToolTipGenerator()",
      "begin_line": 1846,
      "end_line": 1848,
      "comment": "\r\n     * Returns the tool tip generator, an object that is responsible for \r\n     * generating the text items used for tool tips by the plot.  If the \r\n     * generator is \u003ccode\u003enull\u003c/code\u003e, no tool tips will be created.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setToolTipGenerator(PieToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 1847,col 9)-(line 1847,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)",
      "begin_line": 1859,
      "end_line": 1862,
      "comment": "\r\n     * Sets the tool tip generator and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  Set the generator to \u003ccode\u003enull\u003c/code\u003e if you \r\n     * don\u0027t want any tool tips.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 1860,col 9)-(line 1860,col 42)",
        "(line 1861,col 9)-(line 1861,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getURLGenerator()",
      "begin_line": 1871,
      "end_line": 1873,
      "comment": "\r\n     * Returns the URL generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setURLGenerator(PieURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 1872,col 9)-(line 1872,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 1883,
      "end_line": 1886,
      "comment": "\r\n     * Sets the URL generator and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 1884,col 9)-(line 1884,col 38)",
        "(line 1885,col 9)-(line 1885,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMinimumArcAngleToDraw()",
      "begin_line": 1896,
      "end_line": 1898,
      "comment": "\r\n     * Returns the minimum arc angle that will be drawn.  Pie sections for an \r\n     * angle smaller than this are not drawn, to avoid a JDK bug.\r\n     *\r\n     * @return The minimum angle.\r\n     * \r\n     * @see #setMinimumArcAngleToDraw(double)\r\n     ",
      "child_ranges": [
        "(line 1897,col 9)-(line 1897,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMinimumArcAngleToDraw(double)",
      "begin_line": 1918,
      "end_line": 1920,
      "comment": "\r\n     * Sets the minimum arc angle that will be drawn.  Pie sections for an \r\n     * angle smaller than this are not drawn, to avoid a JDK bug.  See this \r\n     * link for details:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\"http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\"\u003e\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\u003c/a\u003e\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * ...and this bug report in the Java Bug Parade:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\r\n     * \"http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\"\u003e\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\u003c/a\u003e\r\n     *\r\n     * @param angle  the minimum angle.\r\n     * \r\n     * @see #getMinimumArcAngleToDraw()\r\n     ",
      "child_ranges": [
        "(line 1919,col 9)-(line 1919,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItemShape()",
      "begin_line": 1929,
      "end_line": 1931,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     * \r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendItemShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 1930,col 9)-(line 1930,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 1941,
      "end_line": 1947,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendItemShape()\r\n     ",
      "child_ranges": [
        "(line 1942,col 9)-(line 1944,col 9)",
        "(line 1945,col 9)-(line 1945,col 37)",
        "(line 1946,col 9)-(line 1946,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelGenerator()",
      "begin_line": 1956,
      "end_line": 1958,
      "comment": "\r\n     * Returns the legend label generator.\r\n     * \r\n     * @return The legend label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1957,col 9)-(line 1957,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1968,
      "end_line": 1974,
      "comment": "\r\n     * Sets the legend label generator and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1969,col 9)-(line 1971,col 9)",
        "(line 1972,col 9)-(line 1972,col 46)",
        "(line 1973,col 9)-(line 1973,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelToolTipGenerator()",
      "begin_line": 1983,
      "end_line": 1985,
      "comment": "\r\n     * Returns the legend label tool tip generator.\r\n     * \r\n     * @return The legend label tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelToolTipGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1984,col 9)-(line 1984,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1995,
      "end_line": 1999,
      "comment": "\r\n     * Sets the legend label tool tip generator and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLegendLabelToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 1997,col 9)-(line 1997,col 53)",
        "(line 1998,col 9)-(line 1998,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelURLGenerator()",
      "begin_line": 2010,
      "end_line": 2012,
      "comment": "\r\n     * Returns the legend label URL generator.\r\n     * \r\n     * @return The legend label URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelURLGenerator(PieURLGenerator)\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2011,col 9)-(line 2011,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 2024,
      "end_line": 2027,
      "comment": "\r\n     * Sets the legend label URL generator and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLegendLabelURLGenerator()\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2025,col 9)-(line 2025,col 49)",
        "(line 2026,col 9)-(line 2026,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2044,
      "end_line": 2054,
      "comment": "\r\n     * Initialises the drawing procedure.  This method will be called before \r\n     * the first item is rendered, giving the plot an opportunity to initialise\r\n     * any state information it wants to maintain.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plot  the plot.\r\n     * @param index  the secondary index (\u003ccode\u003enull\u003c/code\u003e for primary \r\n     *               renderer).\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return A state object (maintains state information relevant to one \r\n     *         chart drawing).\r\n     ",
      "child_ranges": [
        "(line 2047,col 9)-(line 2047,col 52)",
        "(line 2048,col 9)-(line 2048,col 35)",
        "(line 2049,col 9)-(line 2050,col 36)",
        "(line 2051,col 9)-(line 2051,col 51)",
        "(line 2052,col 9)-(line 2052,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2067,
      "end_line": 2101,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing \r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 2071,col 9)-(line 2071,col 45)",
        "(line 2072,col 9)-(line 2072,col 26)",
        "(line 2074,col 9)-(line 2077,col 9)",
        "(line 2079,col 9)-(line 2079,col 33)",
        "(line 2080,col 9)-(line 2080,col 30)",
        "(line 2082,col 9)-(line 2082,col 39)",
        "(line 2083,col 9)-(line 2083,col 22)",
        "(line 2085,col 9)-(line 2085,col 56)",
        "(line 2086,col 9)-(line 2087,col 39)",
        "(line 2089,col 9)-(line 2094,col 9)",
        "(line 2096,col 9)-(line 2096,col 30)",
        "(line 2097,col 9)-(line 2097,col 43)",
        "(line 2099,col 9)-(line 2099,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawPie(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2110,
      "end_line": 2235,
      "comment": "\r\n     * Draws the pie.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param info  chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 2113,col 9)-(line 2113,col 72)",
        "(line 2116,col 9)-(line 2116,col 34)",
        "(line 2117,col 9)-(line 2119,col 9)",
        "(line 2120,col 9)-(line 2121,col 38)",
        "(line 2122,col 9)-(line 2122,col 75)",
        "(line 2125,col 9)-(line 2136,col 9)",
        "(line 2138,col 9)-(line 2138,col 59)",
        "(line 2139,col 9)-(line 2139,col 57)",
        "(line 2140,col 9)-(line 2140,col 59)",
        "(line 2141,col 9)-(line 2141,col 58)",
        "(line 2144,col 9)-(line 2150,col 9)",
        "(line 2154,col 9)-(line 2155,col 23)",
        "(line 2156,col 9)-(line 2156,col 36)",
        "(line 2158,col 9)-(line 2164,col 9)",
        "(line 2169,col 9)-(line 2169,col 24)",
        "(line 2170,col 9)-(line 2172,col 9)",
        "(line 2173,col 9)-(line 2173,col 51)",
        "(line 2174,col 9)-(line 2174,col 52)",
        "(line 2175,col 9)-(line 2176,col 58)",
        "(line 2178,col 9)-(line 2178,col 46)",
        "(line 2183,col 9)-(line 2183,col 66)",
        "(line 2184,col 9)-(line 2184,col 79)",
        "(line 2186,col 9)-(line 2186,col 53)",
        "(line 2187,col 9)-(line 2187,col 54)",
        "(line 2188,col 9)-(line 2190,col 75)",
        "(line 2192,col 9)-(line 2195,col 9)",
        "(line 2196,col 9)-(line 2196,col 34)",
        "(line 2197,col 9)-(line 2197,col 50)",
        "(line 2198,col 9)-(line 2198,col 50)",
        "(line 2199,col 9)-(line 2199,col 54)",
        "(line 2200,col 9)-(line 2200,col 55)",
        "(line 2203,col 9)-(line 2234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)",
      "begin_line": 2246,
      "end_line": 2328,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param section  the section index.\r\n     * @param dataArea  the data plot area.\r\n     * @param state  state information for one chart.\r\n     * @param currentPass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 2249,col 9)-(line 2249,col 50)",
        "(line 2250,col 9)-(line 2252,col 9)",
        "(line 2253,col 9)-(line 2253,col 39)",
        "(line 2254,col 9)-(line 2254,col 28)",
        "(line 2255,col 9)-(line 2255,col 28)",
        "(line 2257,col 9)-(line 2267,col 9)",
        "(line 2269,col 9)-(line 2269,col 41)",
        "(line 2270,col 9)-(line 2326,col 9)",
        "(line 2327,col 9)-(line 2327,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawSimpleLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2342,
      "end_line": 2424,
      "comment": "\r\n     * Draws the pie section labels in the simple form.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param keys  the section keys.\r\n     * @param totalValue  the total value for all sections in the pie.\r\n     * @param plotArea  the plot area.\r\n     * @param pieArea  the area containing the pie.\r\n     * @param state  the plot state.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2346,col 9)-(line 2346,col 56)",
        "(line 2347,col 9)-(line 2348,col 23)",
        "(line 2350,col 9)-(line 2351,col 40)",
        "(line 2352,col 9)-(line 2352,col 75)",
        "(line 2353,col 9)-(line 2353,col 34)",
        "(line 2354,col 9)-(line 2354,col 44)",
        "(line 2355,col 9)-(line 2420,col 9)",
        "(line 2422,col 9)-(line 2422,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2436,
      "end_line": 2496,
      "comment": "\r\n     * Draws the labels for the pie sections.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param keys  the keys.\r\n     * @param totalValue  the total value.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2440,col 9)-(line 2440,col 56)",
        "(line 2441,col 9)-(line 2442,col 23)",
        "(line 2445,col 9)-(line 2445,col 63)",
        "(line 2446,col 9)-(line 2446,col 64)",
        "(line 2448,col 9)-(line 2448,col 34)",
        "(line 2449,col 9)-(line 2449,col 44)",
        "(line 2450,col 9)-(line 2476,col 9)",
        "(line 2478,col 9)-(line 2478,col 35)",
        "(line 2482,col 9)-(line 2482,col 82)",
        "(line 2483,col 9)-(line 2483,col 57)",
        "(line 2484,col 9)-(line 2484,col 52)",
        "(line 2485,col 9)-(line 2485,col 67)",
        "(line 2488,col 9)-(line 2493,col 9)",
        "(line 2494,col 9)-(line 2494,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2510,
      "end_line": 2548,
      "comment": "\r\n     * Draws the left labels.\r\n     * \r\n     * @param leftKeys  a collection of keys and angles (to the middle of the\r\n     *         section, in degrees) for the sections on the left side of the \r\n     *         plot.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2514,col 9)-(line 2514,col 38)",
        "(line 2515,col 9)-(line 2515,col 58)",
        "(line 2516,col 9)-(line 2516,col 74)",
        "(line 2517,col 9)-(line 2541,col 9)",
        "(line 2542,col 9)-(line 2543,col 38)",
        "(line 2544,col 9)-(line 2547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2560,
      "end_line": 2600,
      "comment": "\r\n     * Draws the right labels.\r\n     * \r\n     * @param keys  the keys.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2565,col 9)-(line 2565,col 38)",
        "(line 2566,col 9)-(line 2566,col 58)",
        "(line 2567,col 9)-(line 2567,col 74)",
        "(line 2569,col 9)-(line 2592,col 9)",
        "(line 2593,col 9)-(line 2594,col 38)",
        "(line 2595,col 9)-(line 2598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItems()",
      "begin_line": 2607,
      "end_line": 2666,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2609,col 9)-(line 2609,col 65)",
        "(line 2610,col 9)-(line 2612,col 9)",
        "(line 2613,col 9)-(line 2613,col 43)",
        "(line 2614,col 9)-(line 2614,col 24)",
        "(line 2615,col 9)-(line 2615,col 43)",
        "(line 2616,col 9)-(line 2616,col 44)",
        "(line 2617,col 9)-(line 2664,col 9)",
        "(line 2665,col 9)-(line 2665,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPlotType()",
      "begin_line": 2673,
      "end_line": 2675,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 2674,col 9)-(line 2674,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)",
      "begin_line": 2691,
      "end_line": 2712,
      "comment": "\r\n     * Returns a rectangle that can be used to create a pie section (taking\r\n     * into account the amount by which the pie section is \u0027exploded\u0027).\r\n     *\r\n     * @param unexploded  the area inside which the unexploded pie sections are\r\n     *                    drawn.\r\n     * @param exploded  the area inside which the exploded pie sections are \r\n     *                  drawn.\r\n     * @param angle  the start angle.\r\n     * @param extent  the extent of the arc.\r\n     * @param explodePercent  the amount by which the pie section is exploded.\r\n     *\r\n     * @return A rectangle that can be used to create a pie section.\r\n     ",
      "child_ranges": [
        "(line 2696,col 9)-(line 2711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2721,
      "end_line": 2748,
      "comment": "\r\n     * Draws a section label on the left side of the pie chart.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     ",
      "child_ranges": [
        "(line 2724,col 9)-(line 2724,col 55)",
        "(line 2725,col 9)-(line 2725,col 51)",
        "(line 2726,col 9)-(line 2726,col 48)",
        "(line 2728,col 9)-(line 2744,col 9)",
        "(line 2745,col 9)-(line 2745,col 39)",
        "(line 2746,col 9)-(line 2746,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2757,
      "end_line": 2785,
      "comment": "\r\n     * Draws a section label on the right side of the pie chart.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     ",
      "child_ranges": [
        "(line 2760,col 9)-(line 2760,col 55)",
        "(line 2761,col 9)-(line 2761,col 51)",
        "(line 2762,col 9)-(line 2762,col 48)",
        "(line 2764,col 9)-(line 2780,col 9)",
        "(line 2782,col 9)-(line 2782,col 39)",
        "(line 2783,col 9)-(line 2783,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.equals(java.lang.Object)",
      "begin_line": 2795,
      "end_line": 2950,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the \r\n     * plot\u0027s dataset is NOT included in the test for equality.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 2796,col 9)-(line 2798,col 9)",
        "(line 2799,col 9)-(line 2801,col 9)",
        "(line 2802,col 9)-(line 2804,col 9)",
        "(line 2805,col 9)-(line 2805,col 37)",
        "(line 2806,col 9)-(line 2808,col 9)",
        "(line 2809,col 9)-(line 2811,col 9)",
        "(line 2812,col 9)-(line 2814,col 9)",
        "(line 2815,col 9)-(line 2817,col 9)",
        "(line 2818,col 9)-(line 2820,col 9)",
        "(line 2821,col 9)-(line 2823,col 9)",
        "(line 2824,col 9)-(line 2826,col 9)",
        "(line 2827,col 9)-(line 2830,col 9)",
        "(line 2831,col 9)-(line 2834,col 9)",
        "(line 2835,col 9)-(line 2837,col 9)",
        "(line 2838,col 9)-(line 2841,col 9)",
        "(line 2842,col 9)-(line 2846,col 9)",
        "(line 2847,col 9)-(line 2850,col 9)",
        "(line 2851,col 9)-(line 2855,col 9)",
        "(line 2856,col 9)-(line 2858,col 9)",
        "(line 2859,col 9)-(line 2861,col 9)",
        "(line 2862,col 9)-(line 2864,col 9)",
        "(line 2865,col 9)-(line 2868,col 9)",
        "(line 2869,col 9)-(line 2872,col 9)",
        "(line 2873,col 9)-(line 2875,col 9)",
        "(line 2876,col 9)-(line 2878,col 9)",
        "(line 2879,col 9)-(line 2882,col 9)",
        "(line 2883,col 9)-(line 2886,col 9)",
        "(line 2887,col 9)-(line 2890,col 9)",
        "(line 2891,col 9)-(line 2894,col 9)",
        "(line 2895,col 9)-(line 2897,col 9)",
        "(line 2898,col 9)-(line 2900,col 9)",
        "(line 2901,col 9)-(line 2903,col 9)",
        "(line 2904,col 9)-(line 2906,col 9)",
        "(line 2907,col 9)-(line 2909,col 9)",
        "(line 2910,col 9)-(line 2912,col 9)",
        "(line 2913,col 9)-(line 2915,col 9)",
        "(line 2916,col 9)-(line 2918,col 9)",
        "(line 2919,col 9)-(line 2922,col 9)",
        "(line 2923,col 9)-(line 2926,col 9)",
        "(line 2927,col 9)-(line 2929,col 9)",
        "(line 2930,col 9)-(line 2932,col 9)",
        "(line 2933,col 9)-(line 2935,col 9)",
        "(line 2936,col 9)-(line 2939,col 9)",
        "(line 2940,col 9)-(line 2943,col 9)",
        "(line 2944,col 9)-(line 2947,col 9)",
        "(line 2949,col 9)-(line 2949,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clone()",
      "begin_line": 2960,
      "end_line": 2983,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 2961,col 9)-(line 2961,col 48)",
        "(line 2962,col 9)-(line 2964,col 9)",
        "(line 2965,col 9)-(line 2968,col 9)",
        "(line 2969,col 9)-(line 2969,col 75)",
        "(line 2970,col 9)-(line 2973,col 9)",
        "(line 2974,col 9)-(line 2977,col 9)",
        "(line 2978,col 9)-(line 2981,col 9)",
        "(line 2982,col 9)-(line 2982,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2992,
      "end_line": 3006,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2993,col 9)-(line 2993,col 36)",
        "(line 2994,col 9)-(line 2994,col 66)",
        "(line 2995,col 9)-(line 2995,col 73)",
        "(line 2996,col 9)-(line 2996,col 75)",
        "(line 2997,col 9)-(line 2997,col 61)",
        "(line 2998,col 9)-(line 2998,col 60)",
        "(line 2999,col 9)-(line 2999,col 70)",
        "(line 3000,col 9)-(line 3000,col 67)",
        "(line 3001,col 9)-(line 3001,col 69)",
        "(line 3002,col 9)-(line 3002,col 66)",
        "(line 3003,col 9)-(line 3003,col 64)",
        "(line 3004,col 9)-(line 3004,col 66)",
        "(line 3005,col 9)-(line 3005,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 3016,
      "end_line": 3031,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 3018,col 9)-(line 3018,col 35)",
        "(line 3019,col 9)-(line 3019,col 66)",
        "(line 3020,col 9)-(line 3020,col 73)",
        "(line 3021,col 9)-(line 3021,col 75)",
        "(line 3022,col 9)-(line 3022,col 61)",
        "(line 3023,col 9)-(line 3023,col 60)",
        "(line 3024,col 9)-(line 3024,col 70)",
        "(line 3025,col 9)-(line 3025,col 67)",
        "(line 3026,col 9)-(line 3026,col 69)",
        "(line 3027,col 9)-(line 3027,col 66)",
        "(line 3028,col 9)-(line 3028,col 64)",
        "(line 3029,col 9)-(line 3029,col 66)",
        "(line 3030,col 9)-(line 3030,col 65)"
      ]
    }
  ]
}