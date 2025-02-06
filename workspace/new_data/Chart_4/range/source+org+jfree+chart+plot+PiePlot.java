{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/PiePlot.java",
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
      "begin_line": 246,
      "end_line": 3330,
      "comment": "\r\n * A plot that displays data in the form of a pie chart, using data from any\r\n * class that implements the {@link PieDataset} interface.\r\n * \u003cP\u003e\r\n * Special notes:\r\n * \u003col\u003e\r\n * \u003cli\u003ethe default starting point is 12 o\u0027clock and the pie sections proceed\r\n * in a clockwise direction, but these settings can be changed;\u003c/li\u003e\r\n * \u003cli\u003enegative values in the dataset are ignored;\u003c/li\u003e\r\n * \u003cli\u003ethere are utility methods for creating a {@link PieDataset} from a\r\n * {@link org.jfree.data.category.CategoryDataset};\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n *\r\n * @see Plot\r\n * @see PieDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " The default starting angle for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 261,
      "end_line": 262,
      "comment": " The default section label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " The default section label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 268,
      "end_line": 269,
      "comment": " The default section label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The default section label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 275,
      "end_line": 276,
      "comment": " The default section label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 279,
      "end_line": 280,
      "comment": " The default section label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " The default minimum arc angle to draw. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The dataset for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "pieIndex"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The pie index (used by the {@link MultiplePiePlot} class). "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\r\n     * The amount of space left around the outside of the pie plot, expressed\r\n     * as a percentage of the plot area width and height.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "circular"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " Flag determining whether to draw an ellipse or a perfect circle. "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " The direction for the pie segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaintMap"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " The section paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionPaint"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The base section paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSectionPaint"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": "\r\n     * A flag that controls whether or not the section paint is auto-populated\r\n     * from the drawing supplier.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinesVisible"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": "\r\n     * A flag that controls whether or not an outline is drawn for each\r\n     * section in the plot.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinePaintMap"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " The section outline paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlinePaint"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " The base section outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSectionOutlinePaint"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": "\r\n     * A flag that controls whether or not the section outline paint is\r\n     * auto-populated from the drawing supplier.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlineStrokeMap"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " The section outline stroke map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlineStroke"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " The base section outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSectionOutlineStroke"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": "\r\n     * A flag that controls whether or not the section outline stroke is\r\n     * auto-populated from the drawing supplier.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shadowPaint"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " The shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowXOffset"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " The x-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowYOffset"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " The y-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "explodePercentages"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " The percentage amount to explode each pie section. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " The section label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " The font used to display the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " The color used to draw the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelBackgroundPaint"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": "\r\n     * The color used to draw the background of the section labels.  If this\r\n     * is \u003ccode\u003enull\u003c/code\u003e, the background is not filled.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlinePaint"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": "\r\n     * The paint used to draw the outline of the section labels\r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlineStroke"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": "\r\n     * The stroke used to draw the outline of the section labels\r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelShadowPaint"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": "\r\n     * The paint used to draw the shadow for the section labels\r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabels"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": "\r\n     * A flag that controls whether simple or extended labels are used.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelPadding"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": "\r\n     * The padding between the labels and the label outlines.  This is not\r\n     * allowed to be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabelOffset"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": "\r\n     * The simple label offset.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumLabelWidth"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": " The maximum label width as a percentage of the plot width. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGap"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": "\r\n     * The gap between the labels and the link corner, as a percentage of the\r\n     * plot width.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinksVisible"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": " A flag that controls whether or not the label links are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStyle"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": "\r\n     * The label link style.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkMargin"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " The link margin. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkPaint"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " The paint used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStroke"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": " The stroke used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelDistributor"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": "\r\n     * The pie section label distributor.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " The tooltip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " The URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelGenerator"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": " The legend label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelToolTipGenerator"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " A tool tip generator for the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelURLGenerator"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": "\r\n     * A URL generator for the legend items (optional).\r\n     *\r\n     * @since 1.0.4.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreNullValues"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": "\r\n     * A flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreZeroValues"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": "\r\n     * A flag that controls whether zero values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumArcAngleToDraw"
      ],
      "begin_line": 499,
      "end_line": 499,
      "comment": "\r\n     * The smallest arc angle that will get drawn (this is to avoid a bug in\r\n     * various Java implementations that causes the JVM to crash).  See this\r\n     * link for details:\r\n     *\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\r\n     *\r\n     * ...and this bug report in the Java Bug Parade:\r\n     *\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 502,
      "end_line": 504,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_INTERIOR"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": "\r\n     * This debug flag controls whether or not an outline is drawn showing the\r\n     * interior of the plot region.  This is drawn as a lightGray rectangle\r\n     * showing the padding provided by the \u0027interiorGap\u0027 setting.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_LINK_AREA"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": "\r\n     * This debug flag controls whether or not an outline is drawn showing the\r\n     * link area (in blue) and link ellipse (in yellow).  This controls where\r\n     * the label links have \u0027elbow\u0027 points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_PIE_AREA"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": "\r\n     * This debug flag controls whether or not an outline is drawn showing\r\n     * the pie area (in green).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\r\n     * Creates a new plot.  The dataset is initially set to \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot(org.jfree.data.general.PieDataset)",
      "begin_line": 538,
      "end_line": 591,
      "comment": "\r\n     * Creates a plot that will draw a pie chart for the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 16)",
        "(line 540,col 9)-(line 540,col 31)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 26)",
        "(line 546,col 9)-(line 546,col 48)",
        "(line 547,col 9)-(line 547,col 29)",
        "(line 548,col 9)-(line 548,col 46)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 550,col 71)",
        "(line 552,col 9)-(line 552,col 46)",
        "(line 553,col 9)-(line 553,col 43)",
        "(line 554,col 9)-(line 554,col 45)",
        "(line 556,col 9)-(line 556,col 43)",
        "(line 557,col 9)-(line 557,col 53)",
        "(line 558,col 9)-(line 558,col 61)",
        "(line 559,col 9)-(line 559,col 53)",
        "(line 561,col 9)-(line 561,col 55)",
        "(line 562,col 9)-(line 562,col 63)",
        "(line 563,col 9)-(line 563,col 54)",
        "(line 565,col 9)-(line 565,col 48)",
        "(line 567,col 9)-(line 567,col 69)",
        "(line 568,col 9)-(line 568,col 44)",
        "(line 569,col 9)-(line 569,col 46)",
        "(line 570,col 9)-(line 570,col 67)",
        "(line 571,col 9)-(line 571,col 61)",
        "(line 572,col 9)-(line 572,col 63)",
        "(line 573,col 9)-(line 573,col 59)",
        "(line 574,col 9)-(line 574,col 38)",
        "(line 575,col 9)-(line 575,col 59)",
        "(line 577,col 9)-(line 577,col 34)",
        "(line 578,col 9)-(line 579,col 34)",
        "(line 580,col 9)-(line 580,col 60)",
        "(line 582,col 9)-(line 582,col 37)",
        "(line 583,col 9)-(line 583,col 33)",
        "(line 584,col 9)-(line 584,col 75)",
        "(line 585,col 9)-(line 585,col 48)",
        "(line 586,col 9)-(line 586,col 44)",
        "(line 587,col 9)-(line 587,col 63)",
        "(line 589,col 9)-(line 589,col 38)",
        "(line 590,col 9)-(line 590,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDataset()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(PieDataset)\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDataset(org.jfree.data.general.PieDataset)",
      "begin_line": 611,
      "end_line": 629,
      "comment": "\r\n     * Sets the dataset and sends a {@link DatasetChangeEvent} to \u0027this\u0027.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 43)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 620,col 9)-(line 620,col 31)",
        "(line 621,col 9)-(line 624,col 9)",
        "(line 627,col 9)-(line 627,col 73)",
        "(line 628,col 9)-(line 628,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPieIndex()",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\r\n     * Returns the pie index (this is used by the {@link MultiplePiePlot} class\r\n     * to track subplots).\r\n     *\r\n     * @return The pie index.\r\n     *\r\n     * @see #setPieIndex(int)\r\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setPieIndex(int)",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\r\n     * Sets the pie index (this is used by the {@link MultiplePiePlot} class to\r\n     * track subplots).\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @see #getPieIndex()\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getStartAngle()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\r\n     * Returns the start angle for the first pie section.  This is measured in\r\n     * degrees starting from 3 o\u0027clock and measuring anti-clockwise.\r\n     *\r\n     * @return The start angle.\r\n     *\r\n     * @see #setStartAngle(double)\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setStartAngle(double)",
      "begin_line": 677,
      "end_line": 680,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  The initial default value is 90 degrees, which\r\n     * corresponds to 12 o\u0027clock.  A value of zero corresponds to 3 o\u0027clock...\r\n     * this is the encoding used by Java\u0027s Arc2D class.\r\n     *\r\n     * @param angle  the angle (in degrees).\r\n     *\r\n     * @see #getStartAngle()\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 32)",
        "(line 679,col 9)-(line 679,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDirection()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\r\n     * Returns the direction in which the pie sections are drawn (clockwise or\r\n     * anti-clockwise).\r\n     *\r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDirection(Rotation)\r\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 702,
      "end_line": 709,
      "comment": "\r\n     * Sets the direction in which the pie sections are drawn and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDirection()\r\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 35)",
        "(line 707,col 9)-(line 707,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getInteriorGap()",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available\r\n     * drawing space.\r\n     *\r\n     * @return The gap (as a percentage of the available drawing space).\r\n     *\r\n     * @see #setInteriorGap(double)\r\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setInteriorGap(double)",
      "begin_line": 733,
      "end_line": 745,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  This controls the space between the edges of the\r\n     * pie plot and the plot area itself (the region where the section labels\r\n     * appear).\r\n     *\r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     *\r\n     * @see #getInteriorGap()\r\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 738,col 9)",
        "(line 740,col 9)-(line 743,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.isCircular()",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\r\n     * Returns a flag indicating whether the pie chart is circular, or\r\n     * stretched into an elliptical shape.\r\n     *\r\n     * @return A flag indicating whether the pie chart is circular.\r\n     *\r\n     * @see #setCircular(boolean)\r\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean)",
      "begin_line": 767,
      "end_line": 769,
      "comment": "\r\n     * A flag indicating whether the pie chart is circular, or stretched into\r\n     * an elliptical shape.\r\n     *\r\n     * @param flag  the new value.\r\n     *\r\n     * @see #isCircular()\r\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean, boolean)",
      "begin_line": 780,
      "end_line": 785,
      "comment": "\r\n     * Sets the circular attribute and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param circular  the new value of the flag.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #isCircular()\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 33)",
        "(line 782,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreNullValues()",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\r\n     * Returns the flag that controls whether \u003ccode\u003enull\u003c/code\u003e values in the\r\n     * dataset are ignored.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setIgnoreNullValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreNullValues(boolean)",
      "begin_line": 810,
      "end_line": 813,
      "comment": "\r\n     * Sets a flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  At\r\n     * present, this only affects whether or not the key is presented in the\r\n     * legend.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getIgnoreNullValues()\r\n     * @see #setIgnoreZeroValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 37)",
        "(line 812,col 9)-(line 812,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreZeroValues()",
      "begin_line": 823,
      "end_line": 825,
      "comment": "\r\n     * Returns the flag that controls whether zero values in the\r\n     * dataset are ignored.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setIgnoreZeroValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreZeroValues(boolean)",
      "begin_line": 838,
      "end_line": 841,
      "comment": "\r\n     * Sets a flag that controls whether zero values are ignored,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  This\r\n     * only affects whether or not a label appears for the non-visible\r\n     * pie section.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getIgnoreZeroValues()\r\n     * @see #setIgnoreNullValues(boolean)\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 37)",
        "(line 840,col 9)-(line 840,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable)",
      "begin_line": 857,
      "end_line": 859,
      "comment": "\r\n     * Returns the paint for the specified section.  This is equivalent to\r\n     * \u003ccode\u003elookupSectionPaint(section, getAutoPopulateSectionPaint())\u003c/code\u003e.\r\n     *\r\n     * @param key  the section key.\r\n     *\r\n     * @return The paint for the specified section.\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #lookupSectionPaint(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable, boolean)",
      "begin_line": 882,
      "end_line": 906,
      "comment": "\r\n     * Returns the paint for the specified section.  The lookup involves these\r\n     * steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is non-\u003ccode\u003enull\u003c/code\u003e\r\n     *         return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is \u003ccode\u003enull\u003c/code\u003e but\r\n     *         \u003ccode\u003eautoPopulate\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch\r\n     *         a new paint from the drawing supplier\r\n     *         ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionPaint()}.\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier\r\n     *     is used to auto-populate the section paint settings.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 28)",
        "(line 886,col 9)-(line 886,col 52)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 892,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionKey(int)",
      "begin_line": 922,
      "end_line": 933,
      "comment": "\r\n     * Returns a key for the specified section.  If there is no such section\r\n     * in the dataset, we generate a key.  This is to provide some backward\r\n     * compatibility for the (now deprecated) methods that get/set attributes\r\n     * based on section indices.  The preferred way of doing this now is to\r\n     * link the attributes directly to the section key (there are new methods\r\n     * for this, starting from version 1.0.3).\r\n     *\r\n     * @param section  the section index.\r\n     *\r\n     * @return The key.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 30)",
        "(line 924,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionPaint(java.lang.Comparable)",
      "begin_line": 951,
      "end_line": 954,
      "comment": "\r\n     * Returns the paint associated with the specified key, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The paint associated with the specified key, or\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #setSectionPaint(Comparable, Paint)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionPaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 970,
      "end_line": 974,
      "comment": "\r\n     * Sets the paint associated with the specified key, and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getSectionPaint(Comparable)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 45)",
        "(line 973,col 9)-(line 973,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clearSectionPaints(boolean)",
      "begin_line": 988,
      "end_line": 993,
      "comment": "\r\n     * Clears the section paint settings for this plot and, if requested, sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.  Be aware that\r\n     * if the \u003ccode\u003eautoPopulateSectionPaint\u003c/code\u003e flag is set, the section\r\n     * paints may be repopulated using the same colours as before.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #autoPopulateSectionPaint\r\n     ",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 37)",
        "(line 990,col 9)-(line 992,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionPaint()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is\r\n     * defined, which is rare.  The default value is \u003ccode\u003eColor.gray\u003c/code\u003e.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseSectionPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionPaint(java.awt.Paint)",
      "begin_line": 1015,
      "end_line": 1021,
      "comment": "\r\n     * Sets the base section paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseSectionPaint()\r\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1019,col 38)",
        "(line 1020,col 9)-(line 1020,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getAutoPopulateSectionPaint()",
      "begin_line": 1031,
      "end_line": 1033,
      "comment": "\r\n     * Returns the flag that controls whether or not the section paint is\r\n     * auto-populated by the {@link #lookupSectionPaint(Comparable)} method.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setAutoPopulateSectionPaint(boolean)",
      "begin_line": 1044,
      "end_line": 1047,
      "comment": "\r\n     * Sets the flag that controls whether or not the section paint is\r\n     * auto-populated by the {@link #lookupSectionPaint(Comparable)} method,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param auto  auto-populate?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 45)",
        "(line 1046,col 9)-(line 1046,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinesVisible()",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "\r\n     * Returns the flag that controls whether or not the outline is drawn for\r\n     * each pie section.\r\n     *\r\n     * @return The flag that controls whether or not the outline is drawn for\r\n     *         each pie section.\r\n     *\r\n     * @see #setSectionOutlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinesVisible(boolean)",
      "begin_line": 1073,
      "end_line": 1076,
      "comment": "\r\n     * Sets the flag that controls whether or not the outline is drawn for\r\n     * each pie section, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getSectionOutlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 46)",
        "(line 1075,col 9)-(line 1075,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 1091,
      "end_line": 1094,
      "comment": "\r\n     * Returns the outline paint for the specified section.  This is equivalent\r\n     * to \u003ccode\u003elookupSectionPaint(section,\r\n     * getAutoPopulateSectionOutlinePaint())\u003c/code\u003e.\r\n     *\r\n     * @param key  the section key.\r\n     *\r\n     * @return The paint for the specified section.\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #lookupSectionOutlinePaint(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1093,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable, boolean)",
      "begin_line": 1117,
      "end_line": 1143,
      "comment": "\r\n     * Returns the outline paint for the specified section.  The lookup\r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is\r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is\r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is\r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline paint from\r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlinePaint()}.\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier\r\n     *     is used to auto-populate the section outline paint settings.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 28)",
        "(line 1123,col 9)-(line 1123,col 59)",
        "(line 1124,col 9)-(line 1126,col 9)",
        "(line 1129,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1142,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 1161,
      "end_line": 1164,
      "comment": "\r\n     * Returns the outline paint associated with the specified key, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The paint associated with the specified key, or\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #setSectionOutlinePaint(Comparable, Paint)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 1180,
      "end_line": 1184,
      "comment": "\r\n     * Sets the outline paint associated with the specified key, and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getSectionOutlinePaint(Comparable)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 52)",
        "(line 1183,col 9)-(line 1183,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clearSectionOutlinePaints(boolean)",
      "begin_line": 1198,
      "end_line": 1203,
      "comment": "\r\n     * Clears the section outline paint settings for this plot and, if\r\n     * requested, sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * Be aware that if the \u003ccode\u003eautoPopulateSectionPaint\u003c/code\u003e flag is set,\r\n     * the section paints may be repopulated using the same colours as before.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #autoPopulateSectionOutlinePaint\r\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 44)",
        "(line 1200,col 9)-(line 1202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlinePaint()",
      "begin_line": 1213,
      "end_line": 1215,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is\r\n     * available.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseSectionOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlinePaint(java.awt.Paint)",
      "begin_line": 1224,
      "end_line": 1230,
      "comment": "\r\n     * Sets the base section paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseSectionOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1228,col 45)",
        "(line 1229,col 9)-(line 1229,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getAutoPopulateSectionOutlinePaint()",
      "begin_line": 1241,
      "end_line": 1243,
      "comment": "\r\n     * Returns the flag that controls whether or not the section outline paint\r\n     * is auto-populated by the {@link #lookupSectionOutlinePaint(Comparable)}\r\n     * method.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setAutoPopulateSectionOutlinePaint(boolean)",
      "begin_line": 1254,
      "end_line": 1257,
      "comment": "\r\n     * Sets the flag that controls whether or not the section outline paint is\r\n     * auto-populated by the {@link #lookupSectionOutlinePaint(Comparable)}\r\n     * method, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param auto  auto-populate?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 52)",
        "(line 1256,col 9)-(line 1256,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1274,
      "end_line": 1277,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  This is\r\n     * equivalent to \u003ccode\u003elookupSectionOutlineStroke(section,\r\n     * getAutoPopulateSectionOutlineStroke())\u003c/code\u003e.\r\n     *\r\n     * @param key  the section key.\r\n     *\r\n     * @return The stroke for the specified section.\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #lookupSectionOutlineStroke(Comparable, boolean)\r\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1276,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable, boolean)",
      "begin_line": 1300,
      "end_line": 1326,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  The lookup\r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is\r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is\r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is\r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline stroke from\r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlineStroke()}.\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier\r\n     *     is used to auto-populate the section outline stroke settings.\r\n     *\r\n     * @return The stroke.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1303,col 29)",
        "(line 1306,col 9)-(line 1306,col 61)",
        "(line 1307,col 9)-(line 1309,col 9)",
        "(line 1312,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1344,
      "end_line": 1347,
      "comment": "\r\n     * Returns the outline stroke associated with the specified key, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no stroke associated with the key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The stroke associated with the specified key, or\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #setSectionOutlineStroke(Comparable, Stroke)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1346,col 9)-(line 1346,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlineStroke(java.lang.Comparable, java.awt.Stroke)",
      "begin_line": 1363,
      "end_line": 1367,
      "comment": "\r\n     * Sets the outline stroke associated with the specified key, and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getSectionOutlineStroke(Comparable)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1365,col 9)-(line 1365,col 54)",
        "(line 1366,col 9)-(line 1366,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clearSectionOutlineStrokes(boolean)",
      "begin_line": 1381,
      "end_line": 1386,
      "comment": "\r\n     * Clears the section outline stroke settings for this plot and, if\r\n     * requested, sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * Be aware that if the \u003ccode\u003eautoPopulateSectionPaint\u003c/code\u003e flag is set,\r\n     * the section paints may be repopulated using the same colours as before.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #autoPopulateSectionOutlineStroke\r\n     ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1382,col 45)",
        "(line 1383,col 9)-(line 1385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlineStroke()",
      "begin_line": 1396,
      "end_line": 1398,
      "comment": "\r\n     * Returns the base section stroke.  This is used when no other stroke is\r\n     * available.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseSectionOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1397,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlineStroke(java.awt.Stroke)",
      "begin_line": 1407,
      "end_line": 1413,
      "comment": "\r\n     * Sets the base section stroke.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseSectionOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1410,col 9)",
        "(line 1411,col 9)-(line 1411,col 47)",
        "(line 1412,col 9)-(line 1412,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getAutoPopulateSectionOutlineStroke()",
      "begin_line": 1424,
      "end_line": 1426,
      "comment": "\r\n     * Returns the flag that controls whether or not the section outline stroke\r\n     * is auto-populated by the {@link #lookupSectionOutlinePaint(Comparable)}\r\n     * method.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setAutoPopulateSectionOutlineStroke(boolean)",
      "begin_line": 1437,
      "end_line": 1440,
      "comment": "\r\n     * Sets the flag that controls whether or not the section outline stroke is\r\n     * auto-populated by the {@link #lookupSectionOutlineStroke(Comparable)}\r\n     * method, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param auto  auto-populate?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 53)",
        "(line 1439,col 9)-(line 1439,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowPaint()",
      "begin_line": 1449,
      "end_line": 1451,
      "comment": "\r\n     * Returns the shadow paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1450,col 9)-(line 1450,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowPaint(java.awt.Paint)",
      "begin_line": 1461,
      "end_line": 1464,
      "comment": "\r\n     * Sets the shadow paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 33)",
        "(line 1463,col 9)-(line 1463,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowXOffset()",
      "begin_line": 1473,
      "end_line": 1475,
      "comment": "\r\n     * Returns the x-offset for the shadow effect.\r\n     *\r\n     * @return The offset (in Java2D units).\r\n     *\r\n     * @see #setShadowXOffset(double)\r\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1474,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowXOffset(double)",
      "begin_line": 1485,
      "end_line": 1488,
      "comment": "\r\n     * Sets the x-offset for the shadow effect and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getShadowXOffset()\r\n     ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1486,col 36)",
        "(line 1487,col 9)-(line 1487,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowYOffset()",
      "begin_line": 1497,
      "end_line": 1499,
      "comment": "\r\n     * Returns the y-offset for the shadow effect.\r\n     *\r\n     * @return The offset (in Java2D units).\r\n     *\r\n     * @see #setShadowYOffset(double)\r\n     ",
      "child_ranges": [
        "(line 1498,col 9)-(line 1498,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowYOffset(double)",
      "begin_line": 1509,
      "end_line": 1512,
      "comment": "\r\n     * Sets the y-offset for the shadow effect and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getShadowYOffset()\r\n     ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1510,col 36)",
        "(line 1511,col 9)-(line 1511,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getExplodePercent(java.lang.Comparable)",
      "begin_line": 1530,
      "end_line": 1539,
      "comment": "\r\n     * Returns the amount that the section with the specified key should be\r\n     * exploded.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The amount that the section with the specified key should be\r\n     *     exploded.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #setExplodePercent(Comparable, double)\r\n     ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1531,col 28)",
        "(line 1532,col 9)-(line 1537,col 9)",
        "(line 1538,col 9)-(line 1538,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setExplodePercent(java.lang.Comparable, double)",
      "begin_line": 1552,
      "end_line": 1561,
      "comment": "\r\n     * Sets the amount that a pie section should be exploded and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percent  the explode percentage (0.30 \u003d 30 percent).\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #getExplodePercent(Comparable)\r\n     ",
      "child_ranges": [
        "(line 1553,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1559,col 62)",
        "(line 1560,col 9)-(line 1560,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumExplodePercent()",
      "begin_line": 1568,
      "end_line": 1582,
      "comment": "\r\n     * Returns the maximum explode percent.\r\n     *\r\n     * @return The percent.\r\n     ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1572,col 28)",
        "(line 1573,col 9)-(line 1573,col 62)",
        "(line 1574,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1581,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGenerator()",
      "begin_line": 1591,
      "end_line": 1593,
      "comment": "\r\n     * Returns the section label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1592,col 9)-(line 1592,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1603,
      "end_line": 1606,
      "comment": "\r\n     * Sets the section label generator and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1604,col 9)-(line 1604,col 40)",
        "(line 1605,col 9)-(line 1605,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGap()",
      "begin_line": 1616,
      "end_line": 1618,
      "comment": "\r\n     * Returns the gap between the edge of the pie and the labels, expressed as\r\n     * a percentage of the plot width.\r\n     *\r\n     * @return The gap (a percentage, where 0.05 \u003d five percent).\r\n     *\r\n     * @see #setLabelGap(double)\r\n     ",
      "child_ranges": [
        "(line 1617,col 9)-(line 1617,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGap(double)",
      "begin_line": 1629,
      "end_line": 1632,
      "comment": "\r\n     * Sets the gap between the edge of the pie and the labels (expressed as a\r\n     * percentage of the plot width) and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param gap  the gap (a percentage, where 0.05 \u003d five percent).\r\n     *\r\n     * @see #getLabelGap()\r\n     ",
      "child_ranges": [
        "(line 1630,col 9)-(line 1630,col 28)",
        "(line 1631,col 9)-(line 1631,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumLabelWidth()",
      "begin_line": 1641,
      "end_line": 1643,
      "comment": "\r\n     * Returns the maximum label width as a percentage of the plot width.\r\n     *\r\n     * @return The width (a percentage, where 0.20 \u003d 20 percent).\r\n     *\r\n     * @see #setMaximumLabelWidth(double)\r\n     ",
      "child_ranges": [
        "(line 1642,col 9)-(line 1642,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMaximumLabelWidth(double)",
      "begin_line": 1653,
      "end_line": 1656,
      "comment": "\r\n     * Sets the maximum label width as a percentage of the plot width and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param width  the width (a percentage, where 0.20 \u003d 20 percent).\r\n     *\r\n     * @see #getMaximumLabelWidth()\r\n     ",
      "child_ranges": [
        "(line 1654,col 9)-(line 1654,col 39)",
        "(line 1655,col 9)-(line 1655,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinksVisible()",
      "begin_line": 1666,
      "end_line": 1668,
      "comment": "\r\n     * Returns the flag that controls whether or not label linking lines are\r\n     * visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setLabelLinksVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1667,col 9)-(line 1667,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinksVisible(boolean)",
      "begin_line": 1681,
      "end_line": 1684,
      "comment": "\r\n     * Sets the flag that controls whether or not label linking lines are\r\n     * visible and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * Please take care when hiding the linking lines - depending on the data\r\n     * values, the labels can be displayed some distance away from the\r\n     * corresponding pie section.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getLabelLinksVisible()\r\n     ",
      "child_ranges": [
        "(line 1682,col 9)-(line 1682,col 41)",
        "(line 1683,col 9)-(line 1683,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkStyle()",
      "begin_line": 1695,
      "end_line": 1697,
      "comment": "\r\n     * Returns the label link style.\r\n     *\r\n     * @return The label link style (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelLinkStyle(PieLabelLinkStyle)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1696,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkStyle(org.jfree.chart.plot.PieLabelLinkStyle)",
      "begin_line": 1709,
      "end_line": 1715,
      "comment": "\r\n     * Sets the label link style and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param style  the new style (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelLinkStyle()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1710,col 9)-(line 1712,col 9)",
        "(line 1713,col 9)-(line 1713,col 36)",
        "(line 1714,col 9)-(line 1714,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkMargin()",
      "begin_line": 1725,
      "end_line": 1727,
      "comment": "\r\n     * Returns the margin (expressed as a percentage of the width or height)\r\n     * between the edge of the pie and the link point.\r\n     *\r\n     * @return The link margin (as a percentage, where 0.05 is five percent).\r\n     *\r\n     * @see #setLabelLinkMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1726,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkMargin(double)",
      "begin_line": 1737,
      "end_line": 1740,
      "comment": "\r\n     * Sets the link margin and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param margin  the margin.\r\n     *\r\n     * @see #getLabelLinkMargin()\r\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1738,col 38)",
        "(line 1739,col 9)-(line 1739,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkPaint()",
      "begin_line": 1750,
      "end_line": 1752,
      "comment": "\r\n     * Returns the paint used for the lines that connect pie sections to their\r\n     * corresponding labels.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelLinkPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1751,col 9)-(line 1751,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkPaint(java.awt.Paint)",
      "begin_line": 1763,
      "end_line": 1769,
      "comment": "\r\n     * Sets the paint used for the lines that connect pie sections to their\r\n     * corresponding labels, and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelLinkPaint()\r\n     ",
      "child_ranges": [
        "(line 1764,col 9)-(line 1766,col 9)",
        "(line 1767,col 9)-(line 1767,col 36)",
        "(line 1768,col 9)-(line 1768,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkStroke()",
      "begin_line": 1778,
      "end_line": 1780,
      "comment": "\r\n     * Returns the stroke used for the label linking lines.\r\n     *\r\n     * @return The stroke.\r\n     *\r\n     * @see #setLabelLinkStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkStroke(java.awt.Stroke)",
      "begin_line": 1790,
      "end_line": 1796,
      "comment": "\r\n     * Sets the link stroke and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @see #getLabelLinkStroke()\r\n     ",
      "child_ranges": [
        "(line 1791,col 9)-(line 1793,col 9)",
        "(line 1794,col 9)-(line 1794,col 38)",
        "(line 1795,col 9)-(line 1795,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkDepth()",
      "begin_line": 1809,
      "end_line": 1811,
      "comment": "\r\n     * Returns the distance that the end of the label link is embedded into\r\n     * the plot, expressed as a percentage of the plot\u0027s radius.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * This method is overridden in the {@link RingPlot} class to resolve\r\n     * bug 2121818.\r\n     *\r\n     * @return \u003ccode\u003e0.10\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1810,col 9)-(line 1810,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelFont()",
      "begin_line": 1820,
      "end_line": 1822,
      "comment": "\r\n     * Returns the section label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 1821,col 9)-(line 1821,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelFont(java.awt.Font)",
      "begin_line": 1832,
      "end_line": 1838,
      "comment": "\r\n     * Sets the section label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1833,col 9)-(line 1835,col 9)",
        "(line 1836,col 9)-(line 1836,col 30)",
        "(line 1837,col 9)-(line 1837,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPaint()",
      "begin_line": 1847,
      "end_line": 1849,
      "comment": "\r\n     * Returns the section label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1848,col 9)-(line 1848,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 1859,
      "end_line": 1865,
      "comment": "\r\n     * Sets the section label paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 1860,col 9)-(line 1862,col 9)",
        "(line 1863,col 9)-(line 1863,col 32)",
        "(line 1864,col 9)-(line 1864,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelBackgroundPaint()",
      "begin_line": 1874,
      "end_line": 1876,
      "comment": "\r\n     * Returns the section label background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1875,col 9)-(line 1875,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelBackgroundPaint(java.awt.Paint)",
      "begin_line": 1886,
      "end_line": 1889,
      "comment": "\r\n     * Sets the section label background paint and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 1887,col 9)-(line 1887,col 42)",
        "(line 1888,col 9)-(line 1888,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlinePaint()",
      "begin_line": 1898,
      "end_line": 1900,
      "comment": "\r\n     * Returns the section label outline paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1899,col 9)-(line 1899,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlinePaint(java.awt.Paint)",
      "begin_line": 1910,
      "end_line": 1913,
      "comment": "\r\n     * Sets the section label outline paint and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1911,col 9)-(line 1911,col 39)",
        "(line 1912,col 9)-(line 1912,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlineStroke()",
      "begin_line": 1922,
      "end_line": 1924,
      "comment": "\r\n     * Returns the section label outline stroke.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1923,col 9)-(line 1923,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlineStroke(java.awt.Stroke)",
      "begin_line": 1934,
      "end_line": 1937,
      "comment": "\r\n     * Sets the section label outline stroke and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1935,col 41)",
        "(line 1936,col 9)-(line 1936,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelShadowPaint()",
      "begin_line": 1946,
      "end_line": 1948,
      "comment": "\r\n     * Returns the section label shadow paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1947,col 9)-(line 1947,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelShadowPaint(java.awt.Paint)",
      "begin_line": 1958,
      "end_line": 1961,
      "comment": "\r\n     * Sets the section label shadow paint and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 1959,col 9)-(line 1959,col 38)",
        "(line 1960,col 9)-(line 1960,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPadding()",
      "begin_line": 1972,
      "end_line": 1974,
      "comment": "\r\n     * Returns the label padding.\r\n     *\r\n     * @return The label padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #setLabelPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 1973,col 9)-(line 1973,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1986,
      "end_line": 1992,
      "comment": "\r\n     * Sets the padding between each label and its outline and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #getLabelPadding()\r\n     ",
      "child_ranges": [
        "(line 1987,col 9)-(line 1989,col 9)",
        "(line 1990,col 9)-(line 1990,col 36)",
        "(line 1991,col 9)-(line 1991,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabels()",
      "begin_line": 2002,
      "end_line": 2004,
      "comment": "\r\n     * Returns the flag that controls whether simple or extended labels are\r\n     * displayed on the plot.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2003,col 9)-(line 2003,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabels(boolean)",
      "begin_line": 2015,
      "end_line": 2018,
      "comment": "\r\n     * Sets the flag that controls whether simple or extended labels are\r\n     * displayed on the plot, and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param simple  the new flag value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2016,col 9)-(line 2016,col 35)",
        "(line 2017,col 9)-(line 2017,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabelOffset()",
      "begin_line": 2029,
      "end_line": 2031,
      "comment": "\r\n     * Returns the offset used for the simple labels, if they are displayed.\r\n     *\r\n     * @return The offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #setSimpleLabelOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 2030,col 9)-(line 2030,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 2043,
      "end_line": 2049,
      "comment": "\r\n     * Sets the offset for the simple labels and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #getSimpleLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 2044,col 9)-(line 2046,col 9)",
        "(line 2047,col 9)-(line 2047,col 40)",
        "(line 2048,col 9)-(line 2048,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelDistributor()",
      "begin_line": 2059,
      "end_line": 2061,
      "comment": "\r\n     * Returns the object responsible for the vertical layout of the pie\r\n     * section labels.\r\n     *\r\n     * @return The label distributor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 2060,col 9)-(line 2060,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)",
      "begin_line": 2071,
      "end_line": 2077,
      "comment": "\r\n     * Sets the label distributor and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param distributor  the distributor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 2072,col 9)-(line 2074,col 9)",
        "(line 2075,col 9)-(line 2075,col 44)",
        "(line 2076,col 9)-(line 2076,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getToolTipGenerator()",
      "begin_line": 2088,
      "end_line": 2090,
      "comment": "\r\n     * Returns the tool tip generator, an object that is responsible for\r\n     * generating the text items used for tool tips by the plot.  If the\r\n     * generator is \u003ccode\u003enull\u003c/code\u003e, no tool tips will be created.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setToolTipGenerator(PieToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 2089,col 9)-(line 2089,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)",
      "begin_line": 2101,
      "end_line": 2104,
      "comment": "\r\n     * Sets the tool tip generator and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  Set the generator to \u003ccode\u003enull\u003c/code\u003e if you\r\n     * don\u0027t want any tool tips.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 2102,col 9)-(line 2102,col 42)",
        "(line 2103,col 9)-(line 2103,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getURLGenerator()",
      "begin_line": 2113,
      "end_line": 2115,
      "comment": "\r\n     * Returns the URL generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setURLGenerator(PieURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 2114,col 9)-(line 2114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 2125,
      "end_line": 2128,
      "comment": "\r\n     * Sets the URL generator and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 2126,col 9)-(line 2126,col 38)",
        "(line 2127,col 9)-(line 2127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMinimumArcAngleToDraw()",
      "begin_line": 2138,
      "end_line": 2140,
      "comment": "\r\n     * Returns the minimum arc angle that will be drawn.  Pie sections for an\r\n     * angle smaller than this are not drawn, to avoid a JDK bug.\r\n     *\r\n     * @return The minimum angle.\r\n     *\r\n     * @see #setMinimumArcAngleToDraw(double)\r\n     ",
      "child_ranges": [
        "(line 2139,col 9)-(line 2139,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMinimumArcAngleToDraw(double)",
      "begin_line": 2160,
      "end_line": 2162,
      "comment": "\r\n     * Sets the minimum arc angle that will be drawn.  Pie sections for an\r\n     * angle smaller than this are not drawn, to avoid a JDK bug.  See this\r\n     * link for details:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\"http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\"\u003e\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\u003c/a\u003e\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * ...and this bug report in the Java Bug Parade:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\r\n     * \"http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\"\u003e\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\u003c/a\u003e\r\n     *\r\n     * @param angle  the minimum angle.\r\n     *\r\n     * @see #getMinimumArcAngleToDraw()\r\n     ",
      "child_ranges": [
        "(line 2161,col 9)-(line 2161,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItemShape()",
      "begin_line": 2171,
      "end_line": 2173,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 2172,col 9)-(line 2172,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 2183,
      "end_line": 2189,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemShape()\r\n     ",
      "child_ranges": [
        "(line 2184,col 9)-(line 2186,col 9)",
        "(line 2187,col 9)-(line 2187,col 37)",
        "(line 2188,col 9)-(line 2188,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelGenerator()",
      "begin_line": 2198,
      "end_line": 2200,
      "comment": "\r\n     * Returns the legend label generator.\r\n     *\r\n     * @return The legend label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendLabelGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 2199,col 9)-(line 2199,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 2210,
      "end_line": 2216,
      "comment": "\r\n     * Sets the legend label generator and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 2211,col 9)-(line 2213,col 9)",
        "(line 2214,col 9)-(line 2214,col 46)",
        "(line 2215,col 9)-(line 2215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelToolTipGenerator()",
      "begin_line": 2225,
      "end_line": 2227,
      "comment": "\r\n     * Returns the legend label tool tip generator.\r\n     *\r\n     * @return The legend label tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendLabelToolTipGenerator(PieSectionLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 2226,col 9)-(line 2226,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 2237,
      "end_line": 2241,
      "comment": "\r\n     * Sets the legend label tool tip generator and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendLabelToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 2239,col 9)-(line 2239,col 53)",
        "(line 2240,col 9)-(line 2240,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelURLGenerator()",
      "begin_line": 2252,
      "end_line": 2254,
      "comment": "\r\n     * Returns the legend label URL generator.\r\n     *\r\n     * @return The legend label URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendLabelURLGenerator(PieURLGenerator)\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2253,col 9)-(line 2253,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 2266,
      "end_line": 2269,
      "comment": "\r\n     * Sets the legend label URL generator and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendLabelURLGenerator()\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2267,col 9)-(line 2267,col 49)",
        "(line 2268,col 9)-(line 2268,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2286,
      "end_line": 2298,
      "comment": "\r\n     * Initialises the drawing procedure.  This method will be called before\r\n     * the first item is rendered, giving the plot an opportunity to initialise\r\n     * any state information it wants to maintain.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plot  the plot.\r\n     * @param index  the secondary index (\u003ccode\u003enull\u003c/code\u003e for primary\r\n     *               renderer).\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return A state object (maintains state information relevant to one\r\n     *         chart drawing).\r\n     ",
      "child_ranges": [
        "(line 2289,col 9)-(line 2289,col 52)",
        "(line 2290,col 9)-(line 2290,col 35)",
        "(line 2291,col 9)-(line 2294,col 9)",
        "(line 2295,col 9)-(line 2295,col 51)",
        "(line 2296,col 9)-(line 2296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2311,
      "end_line": 2345,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing\r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 2315,col 9)-(line 2315,col 45)",
        "(line 2316,col 9)-(line 2316,col 26)",
        "(line 2318,col 9)-(line 2321,col 9)",
        "(line 2323,col 9)-(line 2323,col 33)",
        "(line 2324,col 9)-(line 2324,col 30)",
        "(line 2326,col 9)-(line 2326,col 39)",
        "(line 2327,col 9)-(line 2327,col 22)",
        "(line 2329,col 9)-(line 2329,col 56)",
        "(line 2330,col 9)-(line 2331,col 39)",
        "(line 2333,col 9)-(line 2338,col 9)",
        "(line 2340,col 9)-(line 2340,col 30)",
        "(line 2341,col 9)-(line 2341,col 43)",
        "(line 2343,col 9)-(line 2343,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawPie(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2354,
      "end_line": 2479,
      "comment": "\r\n     * Draws the pie.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param info  chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 2357,col 9)-(line 2357,col 72)",
        "(line 2360,col 9)-(line 2360,col 34)",
        "(line 2361,col 9)-(line 2363,col 9)",
        "(line 2364,col 9)-(line 2365,col 38)",
        "(line 2366,col 9)-(line 2366,col 75)",
        "(line 2369,col 9)-(line 2380,col 9)",
        "(line 2382,col 9)-(line 2382,col 59)",
        "(line 2383,col 9)-(line 2383,col 57)",
        "(line 2384,col 9)-(line 2384,col 59)",
        "(line 2385,col 9)-(line 2385,col 58)",
        "(line 2388,col 9)-(line 2394,col 9)",
        "(line 2398,col 9)-(line 2399,col 23)",
        "(line 2400,col 9)-(line 2400,col 36)",
        "(line 2402,col 9)-(line 2408,col 9)",
        "(line 2413,col 9)-(line 2413,col 24)",
        "(line 2414,col 9)-(line 2416,col 9)",
        "(line 2417,col 9)-(line 2417,col 51)",
        "(line 2418,col 9)-(line 2418,col 52)",
        "(line 2419,col 9)-(line 2420,col 58)",
        "(line 2422,col 9)-(line 2422,col 46)",
        "(line 2427,col 9)-(line 2427,col 66)",
        "(line 2428,col 9)-(line 2428,col 79)",
        "(line 2430,col 9)-(line 2430,col 53)",
        "(line 2431,col 9)-(line 2431,col 54)",
        "(line 2432,col 9)-(line 2434,col 75)",
        "(line 2436,col 9)-(line 2439,col 9)",
        "(line 2440,col 9)-(line 2440,col 34)",
        "(line 2441,col 9)-(line 2441,col 50)",
        "(line 2442,col 9)-(line 2442,col 50)",
        "(line 2443,col 9)-(line 2443,col 54)",
        "(line 2444,col 9)-(line 2444,col 55)",
        "(line 2447,col 9)-(line 2478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)",
      "begin_line": 2490,
      "end_line": 2572,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param section  the section index.\r\n     * @param dataArea  the data plot area.\r\n     * @param state  state information for one chart.\r\n     * @param currentPass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 2493,col 9)-(line 2493,col 50)",
        "(line 2494,col 9)-(line 2496,col 9)",
        "(line 2497,col 9)-(line 2497,col 39)",
        "(line 2498,col 9)-(line 2498,col 28)",
        "(line 2499,col 9)-(line 2499,col 28)",
        "(line 2501,col 9)-(line 2511,col 9)",
        "(line 2513,col 9)-(line 2513,col 41)",
        "(line 2514,col 9)-(line 2570,col 9)",
        "(line 2571,col 9)-(line 2571,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawSimpleLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2586,
      "end_line": 2668,
      "comment": "\r\n     * Draws the pie section labels in the simple form.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param keys  the section keys.\r\n     * @param totalValue  the total value for all sections in the pie.\r\n     * @param plotArea  the plot area.\r\n     * @param pieArea  the area containing the pie.\r\n     * @param state  the plot state.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2590,col 9)-(line 2590,col 56)",
        "(line 2591,col 9)-(line 2592,col 23)",
        "(line 2594,col 9)-(line 2595,col 40)",
        "(line 2596,col 9)-(line 2596,col 75)",
        "(line 2597,col 9)-(line 2597,col 34)",
        "(line 2598,col 9)-(line 2598,col 44)",
        "(line 2599,col 9)-(line 2664,col 9)",
        "(line 2666,col 9)-(line 2666,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2680,
      "end_line": 2741,
      "comment": "\r\n     * Draws the labels for the pie sections.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param keys  the keys.\r\n     * @param totalValue  the total value.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2684,col 9)-(line 2684,col 56)",
        "(line 2685,col 9)-(line 2686,col 23)",
        "(line 2689,col 9)-(line 2689,col 63)",
        "(line 2690,col 9)-(line 2690,col 64)",
        "(line 2692,col 9)-(line 2692,col 34)",
        "(line 2693,col 9)-(line 2693,col 44)",
        "(line 2694,col 9)-(line 2720,col 9)",
        "(line 2722,col 9)-(line 2722,col 35)",
        "(line 2726,col 9)-(line 2727,col 38)",
        "(line 2728,col 9)-(line 2728,col 57)",
        "(line 2729,col 9)-(line 2729,col 52)",
        "(line 2730,col 9)-(line 2730,col 67)",
        "(line 2733,col 9)-(line 2738,col 9)",
        "(line 2739,col 9)-(line 2739,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2755,
      "end_line": 2796,
      "comment": "\r\n     * Draws the left labels.\r\n     *\r\n     * @param leftKeys  a collection of keys and angles (to the middle of the\r\n     *         section, in degrees) for the sections on the left side of the\r\n     *         plot.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2759,col 9)-(line 2759,col 38)",
        "(line 2760,col 9)-(line 2760,col 58)",
        "(line 2761,col 9)-(line 2761,col 74)",
        "(line 2762,col 9)-(line 2787,col 9)",
        "(line 2788,col 9)-(line 2788,col 41)",
        "(line 2789,col 9)-(line 2789,col 43)",
        "(line 2790,col 9)-(line 2791,col 30)",
        "(line 2792,col 9)-(line 2795,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2808,
      "end_line": 2851,
      "comment": "\r\n     * Draws the right labels.\r\n     *\r\n     * @param keys  the keys.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     ",
      "child_ranges": [
        "(line 2813,col 9)-(line 2813,col 38)",
        "(line 2814,col 9)-(line 2814,col 58)",
        "(line 2815,col 9)-(line 2815,col 74)",
        "(line 2817,col 9)-(line 2841,col 9)",
        "(line 2842,col 9)-(line 2842,col 41)",
        "(line 2843,col 9)-(line 2843,col 43)",
        "(line 2844,col 9)-(line 2845,col 30)",
        "(line 2846,col 9)-(line 2849,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItems()",
      "begin_line": 2858,
      "end_line": 2919,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2860,col 9)-(line 2860,col 65)",
        "(line 2861,col 9)-(line 2863,col 9)",
        "(line 2864,col 9)-(line 2864,col 43)",
        "(line 2865,col 9)-(line 2865,col 24)",
        "(line 2866,col 9)-(line 2866,col 43)",
        "(line 2867,col 9)-(line 2867,col 44)",
        "(line 2868,col 9)-(line 2917,col 9)",
        "(line 2918,col 9)-(line 2918,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPlotType()",
      "begin_line": 2926,
      "end_line": 2928,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 2927,col 9)-(line 2927,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)",
      "begin_line": 2944,
      "end_line": 2965,
      "comment": "\r\n     * Returns a rectangle that can be used to create a pie section (taking\r\n     * into account the amount by which the pie section is \u0027exploded\u0027).\r\n     *\r\n     * @param unexploded  the area inside which the unexploded pie sections are\r\n     *                    drawn.\r\n     * @param exploded  the area inside which the exploded pie sections are\r\n     *                  drawn.\r\n     * @param angle  the start angle.\r\n     * @param extent  the extent of the arc.\r\n     * @param explodePercent  the amount by which the pie section is exploded.\r\n     *\r\n     * @return A rectangle that can be used to create a pie section.\r\n     ",
      "child_ranges": [
        "(line 2949,col 9)-(line 2964,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2974,
      "end_line": 3016,
      "comment": "\r\n     * Draws a section label on the left side of the pie chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     ",
      "child_ranges": [
        "(line 2977,col 9)-(line 2977,col 55)",
        "(line 2978,col 9)-(line 2978,col 51)",
        "(line 2979,col 9)-(line 2979,col 48)",
        "(line 2981,col 9)-(line 3012,col 9)",
        "(line 3013,col 9)-(line 3013,col 39)",
        "(line 3014,col 9)-(line 3014,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 3025,
      "end_line": 3068,
      "comment": "\r\n     * Draws a section label on the right side of the pie chart.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     ",
      "child_ranges": [
        "(line 3028,col 9)-(line 3028,col 55)",
        "(line 3029,col 9)-(line 3029,col 51)",
        "(line 3030,col 9)-(line 3030,col 48)",
        "(line 3032,col 9)-(line 3063,col 9)",
        "(line 3065,col 9)-(line 3065,col 39)",
        "(line 3066,col 9)-(line 3066,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.equals(java.lang.Object)",
      "begin_line": 3078,
      "end_line": 3247,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the\r\n     * plot\u0027s dataset is NOT included in the test for equality.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 3079,col 9)-(line 3081,col 9)",
        "(line 3082,col 9)-(line 3084,col 9)",
        "(line 3085,col 9)-(line 3087,col 9)",
        "(line 3088,col 9)-(line 3088,col 37)",
        "(line 3089,col 9)-(line 3091,col 9)",
        "(line 3092,col 9)-(line 3094,col 9)",
        "(line 3095,col 9)-(line 3097,col 9)",
        "(line 3098,col 9)-(line 3100,col 9)",
        "(line 3101,col 9)-(line 3103,col 9)",
        "(line 3104,col 9)-(line 3106,col 9)",
        "(line 3107,col 9)-(line 3109,col 9)",
        "(line 3110,col 9)-(line 3113,col 9)",
        "(line 3114,col 9)-(line 3117,col 9)",
        "(line 3118,col 9)-(line 3120,col 9)",
        "(line 3121,col 9)-(line 3124,col 9)",
        "(line 3125,col 9)-(line 3129,col 9)",
        "(line 3130,col 9)-(line 3133,col 9)",
        "(line 3134,col 9)-(line 3138,col 9)",
        "(line 3139,col 9)-(line 3141,col 9)",
        "(line 3142,col 9)-(line 3144,col 9)",
        "(line 3145,col 9)-(line 3147,col 9)",
        "(line 3148,col 9)-(line 3151,col 9)",
        "(line 3152,col 9)-(line 3155,col 9)",
        "(line 3156,col 9)-(line 3158,col 9)",
        "(line 3159,col 9)-(line 3161,col 9)",
        "(line 3162,col 9)-(line 3165,col 9)",
        "(line 3166,col 9)-(line 3169,col 9)",
        "(line 3170,col 9)-(line 3173,col 9)",
        "(line 3174,col 9)-(line 3177,col 9)",
        "(line 3178,col 9)-(line 3180,col 9)",
        "(line 3181,col 9)-(line 3183,col 9)",
        "(line 3184,col 9)-(line 3186,col 9)",
        "(line 3187,col 9)-(line 3189,col 9)",
        "(line 3190,col 9)-(line 3192,col 9)",
        "(line 3193,col 9)-(line 3195,col 9)",
        "(line 3196,col 9)-(line 3198,col 9)",
        "(line 3199,col 9)-(line 3201,col 9)",
        "(line 3202,col 9)-(line 3204,col 9)",
        "(line 3205,col 9)-(line 3208,col 9)",
        "(line 3209,col 9)-(line 3212,col 9)",
        "(line 3213,col 9)-(line 3215,col 9)",
        "(line 3216,col 9)-(line 3218,col 9)",
        "(line 3219,col 9)-(line 3221,col 9)",
        "(line 3222,col 9)-(line 3225,col 9)",
        "(line 3226,col 9)-(line 3229,col 9)",
        "(line 3230,col 9)-(line 3233,col 9)",
        "(line 3234,col 9)-(line 3236,col 9)",
        "(line 3237,col 9)-(line 3240,col 9)",
        "(line 3241,col 9)-(line 3244,col 9)",
        "(line 3246,col 9)-(line 3246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clone()",
      "begin_line": 3257,
      "end_line": 3280,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 3258,col 9)-(line 3258,col 48)",
        "(line 3259,col 9)-(line 3261,col 9)",
        "(line 3262,col 9)-(line 3265,col 9)",
        "(line 3266,col 9)-(line 3266,col 75)",
        "(line 3267,col 9)-(line 3270,col 9)",
        "(line 3271,col 9)-(line 3274,col 9)",
        "(line 3275,col 9)-(line 3278,col 9)",
        "(line 3279,col 9)-(line 3279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 3289,
      "end_line": 3303,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 3290,col 9)-(line 3290,col 36)",
        "(line 3291,col 9)-(line 3291,col 66)",
        "(line 3292,col 9)-(line 3292,col 73)",
        "(line 3293,col 9)-(line 3293,col 75)",
        "(line 3294,col 9)-(line 3294,col 61)",
        "(line 3295,col 9)-(line 3295,col 60)",
        "(line 3296,col 9)-(line 3296,col 70)",
        "(line 3297,col 9)-(line 3297,col 67)",
        "(line 3298,col 9)-(line 3298,col 69)",
        "(line 3299,col 9)-(line 3299,col 66)",
        "(line 3300,col 9)-(line 3300,col 64)",
        "(line 3301,col 9)-(line 3301,col 66)",
        "(line 3302,col 9)-(line 3302,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 3313,
      "end_line": 3328,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 3315,col 9)-(line 3315,col 35)",
        "(line 3316,col 9)-(line 3316,col 66)",
        "(line 3317,col 9)-(line 3317,col 73)",
        "(line 3318,col 9)-(line 3318,col 75)",
        "(line 3319,col 9)-(line 3319,col 61)",
        "(line 3320,col 9)-(line 3320,col 60)",
        "(line 3321,col 9)-(line 3321,col 70)",
        "(line 3322,col 9)-(line 3322,col 67)",
        "(line 3323,col 9)-(line 3323,col 69)",
        "(line 3324,col 9)-(line 3324,col 66)",
        "(line 3325,col 9)-(line 3325,col 64)",
        "(line 3326,col 9)-(line 3326,col 66)",
        "(line 3327,col 9)-(line 3327,col 65)"
      ]
    }
  ]
}