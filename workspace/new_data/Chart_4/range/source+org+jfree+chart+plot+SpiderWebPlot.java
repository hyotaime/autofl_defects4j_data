{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/SpiderWebPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpiderWebPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 126,
      "end_line": 1666,
      "comment": "\r\n * A plot that displays data from a {@link CategoryDataset} in the form of a\r\n * \"spider web\".  Multiple series can be plotted on the same axis to allow\r\n * easy comparison.  This plot doesn\u0027t support negative values at present.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HEAD"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The default head radius percent (currently 1%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_GAP"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The default axis label gap (currently 10%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The default starting angle for the radar chart axes. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 147,
      "end_line": 148,
      "comment": " The default series label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The default series label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 154,
      "end_line": 155,
      "comment": " The default series label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The default series label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 161,
      "end_line": 162,
      "comment": " The default series label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The default series label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_VALUE"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": "\r\n     * The default maximum value plotted - forces the plot to evaluate\r\n     *  the maximum from the data passed in\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "headPercent"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The head radius as a percentage of the available drawing area. "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The space left around the outside of the plot as a percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLabelGap"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The gap between the labels and the axes as a %age of the radius. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLinePaint"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": "\r\n     * The paint used to draw the axis lines.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineStroke"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": "\r\n     * The stroke used to draw the axis lines.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " The maximum value we are plotting against on each category axis "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": "\r\n     * The data extract order (BY_ROW or BY_COLUMN). This denotes whether\r\n     * the data series are stored in rows (in which case the category names are\r\n     * derived from the column keys) or in columns (in which case the category\r\n     * names are derived from the row keys).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " The direction for drawing the radar axis \u0026 plots. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPaint"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " The paint for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPaintList"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " The series paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesPaint"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " The base series paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlinePaint"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The outline paint for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlinePaintList"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The series outline paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesOutlinePaint"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " The base series outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlineStroke"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " The outline stroke for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlineStrokeList"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " The series outline stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesOutlineStroke"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " The base series outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " The font used to display the category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The color used to draw the category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " The label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "webFilled"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " controls if the web polygons are filled or not "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " A tooltip generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " A URL generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Creates a default plot with no dataset.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\r\n     * Creates a new spider web plot with the given dataset, with each row\r\n     * representing a series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder)",
      "begin_line": 288,
      "end_line": 326,
      "comment": "\r\n     * Creates a new spider web plot with the given dataset.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param extract  controls how data is extracted ({@link TableOrder#BY_ROW}\r\n     *                 or {@link TableOrder#BY_COLUMN}).\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 16)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 31)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 40)",
        "(line 299,col 9)-(line 299,col 40)",
        "(line 300,col 9)-(line 300,col 51)",
        "(line 301,col 9)-(line 301,col 41)",
        "(line 302,col 9)-(line 302,col 52)",
        "(line 304,col 9)-(line 304,col 48)",
        "(line 305,col 9)-(line 305,col 46)",
        "(line 306,col 9)-(line 306,col 44)",
        "(line 307,col 9)-(line 307,col 42)",
        "(line 309,col 9)-(line 309,col 32)",
        "(line 310,col 9)-(line 310,col 47)",
        "(line 311,col 9)-(line 311,col 36)",
        "(line 313,col 9)-(line 313,col 39)",
        "(line 314,col 9)-(line 314,col 54)",
        "(line 315,col 9)-(line 315,col 60)",
        "(line 317,col 9)-(line 317,col 40)",
        "(line 318,col 9)-(line 318,col 56)",
        "(line 319,col 9)-(line 319,col 62)",
        "(line 321,col 9)-(line 321,col 44)",
        "(line 322,col 9)-(line 322,col 46)",
        "(line 323,col 9)-(line 323,col 71)",
        "(line 325,col 9)-(line 325,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getPlotType()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDataset()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 357,
      "end_line": 373,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 31)",
        "(line 366,col 9)-(line 369,col 9)",
        "(line 372,col 9)-(line 372,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.isWebFilled()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Method to determine if the web chart is to be filled.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setWebFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setWebFilled(boolean)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\r\n     * Sets the webFilled flag and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isWebFilled()\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 30)",
        "(line 396,col 9)-(line 396,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDataExtractOrder()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     *\r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataExtractOrder(TableOrder)\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 421,
      "end_line": 427,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a\r\n     * {@link PlotChangeEvent}to all registered listeners.\r\n     *\r\n     * @param order the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eorder\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDataExtractOrder()\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 38)",
        "(line 426,col 9)-(line 426,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getHeadPercent()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\r\n     * Returns the head percent.\r\n     *\r\n     * @return The head percent.\r\n     *\r\n     * @see #setHeadPercent(double)\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setHeadPercent(double)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\r\n     * Sets the head percent and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param percent  the percent.\r\n     *\r\n     * @see #getHeadPercent()\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 35)",
        "(line 450,col 9)-(line 450,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getStartAngle()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\r\n     * Returns the start angle for the first radar axis.\r\n     * \u003cBR\u003e\r\n     * This is measured in degrees starting from 3 o\u0027clock (Java Arc2D default)\r\n     * and measuring anti-clockwise.\r\n     *\r\n     * @return The start angle.\r\n     *\r\n     * @see #setStartAngle(double)\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setStartAngle(double)",
      "begin_line": 479,
      "end_line": 482,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * The initial default value is 90 degrees, which corresponds to 12 o\u0027clock.\r\n     * A value of zero corresponds to 3 o\u0027clock... this is the encoding used by\r\n     * Java\u0027s Arc2D class.\r\n     *\r\n     * @param angle  the angle (in degrees).\r\n     *\r\n     * @see #getStartAngle()\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 32)",
        "(line 481,col 9)-(line 481,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getMaxValue()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\r\n     * Returns the maximum value any category axis can take.\r\n     *\r\n     * @return The maximum value.\r\n     *\r\n     * @see #setMaxValue(double)\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setMaxValue(double)",
      "begin_line": 503,
      "end_line": 506,
      "comment": "\r\n     * Sets the maximum value any category axis can take and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the maximum value.\r\n     *\r\n     * @see #getMaxValue()\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 30)",
        "(line 505,col 9)-(line 505,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDirection()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\r\n     * Returns the direction in which the radar axes are drawn\r\n     * (clockwise or anti-clockwise).\r\n     *\r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDirection(Rotation)\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 528,
      "end_line": 534,
      "comment": "\r\n     * Sets the direction in which the radar axes are drawn and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDirection()\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 35)",
        "(line 533,col 9)-(line 533,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getInteriorGap()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available\r\n     * drawing space.\r\n     *\r\n     * @return The gap (as a percentage of the available drawing space).\r\n     *\r\n     * @see #setInteriorGap(double)\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setInteriorGap(double)",
      "begin_line": 557,
      "end_line": 566,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners. This controls the space between the edges of the\r\n     * plot and the plot area itself (the region where the axis labels appear).\r\n     *\r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     *\r\n     * @see #getInteriorGap()\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLabelGap()",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\r\n     * Returns the axis label gap.\r\n     *\r\n     * @return The axis label gap.\r\n     *\r\n     * @see #setAxisLabelGap(double)\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLabelGap(double)",
      "begin_line": 587,
      "end_line": 590,
      "comment": "\r\n     * Sets the axis label gap and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param gap  the gap.\r\n     *\r\n     * @see #getAxisLabelGap()\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 32)",
        "(line 589,col 9)-(line 589,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLinePaint()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\r\n     * Returns the paint used to draw the axis lines.\r\n     *\r\n     * @return The paint used to draw the axis lines (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLinePaint(Paint)\r\n     * @see #getAxisLineStroke()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLinePaint(java.awt.Paint)",
      "begin_line": 614,
      "end_line": 620,
      "comment": "\r\n     * Sets the paint used to draw the axis lines and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLinePaint()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 35)",
        "(line 619,col 9)-(line 619,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLineStroke()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\r\n     * Returns the stroke used to draw the axis lines.\r\n     *\r\n     * @return The stroke used to draw the axis lines (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLineStroke(Stroke)\r\n     * @see #getAxisLinePaint()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLineStroke(java.awt.Stroke)",
      "begin_line": 644,
      "end_line": 650,
      "comment": "\r\n     * Sets the stroke used to draw the axis lines and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLineStroke()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 37)",
        "(line 649,col 9)-(line 649,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesPaint()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\r\n     * Returns the paint for ALL series in the plot.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesPaint(java.awt.Paint)",
      "begin_line": 674,
      "end_line": 677,
      "comment": "\r\n     * Sets the paint for ALL series in the plot. If this is set to\u003c/code\u003e null\r\n     * \u003c/code\u003e, then a list of paints is used instead (to allow different colors\r\n     * to be used for each series of the radar group).\r\n     *\r\n     * @param paint the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 33)",
        "(line 676,col 9)-(line 676,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesPaint(int)",
      "begin_line": 688,
      "end_line": 710,
      "comment": "\r\n     * Returns the paint for the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 696,col 9)-(line 696,col 61)",
        "(line 697,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 721,
      "end_line": 724,
      "comment": "\r\n     * Sets the paint used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 53)",
        "(line 723,col 9)-(line 723,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesPaint()",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\r\n     * Returns the base series paint. This is used when no other paint is\r\n     * available.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseSeriesPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 735,col 7)-(line 735,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesPaint(java.awt.Paint)",
      "begin_line": 745,
      "end_line": 751,
      "comment": "\r\n     * Sets the base series paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 37)",
        "(line 750,col 9)-(line 750,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlinePaint()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\r\n     * Returns the outline paint for ALL series in the plot.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlinePaint(java.awt.Paint)",
      "begin_line": 771,
      "end_line": 774,
      "comment": "\r\n     * Sets the outline paint for ALL series in the plot. If this is set to\r\n     * \u003c/code\u003e null\u003c/code\u003e, then a list of paints is used instead (to allow\r\n     * different colors to be used for each series).\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 40)",
        "(line 773,col 9)-(line 773,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlinePaint(int)",
      "begin_line": 783,
      "end_line": 794,
      "comment": "\r\n     * Returns the paint for the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 787,col 9)",
        "(line 789,col 9)-(line 789,col 68)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 803,
      "end_line": 806,
      "comment": "\r\n     * Sets the paint used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 60)",
        "(line 805,col 9)-(line 805,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesOutlinePaint()",
      "begin_line": 814,
      "end_line": 816,
      "comment": "\r\n     * Returns the base series paint. This is used when no other paint is\r\n     * available.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesOutlinePaint(java.awt.Paint)",
      "begin_line": 823,
      "end_line": 829,
      "comment": "\r\n     * Sets the base series paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 44)",
        "(line 828,col 9)-(line 828,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlineStroke()",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\r\n     * Returns the outline stroke for ALL series in the plot.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlineStroke(java.awt.Stroke)",
      "begin_line": 849,
      "end_line": 852,
      "comment": "\r\n     * Sets the outline stroke for ALL series in the plot. If this is set to\r\n     * \u003c/code\u003e null\u003c/code\u003e, then a list of paints is used instead (to allow\r\n     * different colors to be used for each series).\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 42)",
        "(line 851,col 9)-(line 851,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlineStroke(int)",
      "begin_line": 861,
      "end_line": 875,
      "comment": "\r\n     * Returns the stroke for the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 866,col 9)",
        "(line 869,col 9)-(line 869,col 71)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 884,
      "end_line": 887,
      "comment": "\r\n     * Sets the stroke used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 63)",
        "(line 886,col 9)-(line 886,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesOutlineStroke()",
      "begin_line": 895,
      "end_line": 897,
      "comment": "\r\n     * Returns the base series stroke. This is used when no other stroke is\r\n     * available.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesOutlineStroke(java.awt.Stroke)",
      "begin_line": 904,
      "end_line": 910,
      "comment": "\r\n     * Sets the base series stroke.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 46)",
        "(line 909,col 9)-(line 909,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLegendItemShape()",
      "begin_line": 919,
      "end_line": 921,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 931,
      "end_line": 937,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemShape()\r\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 37)",
        "(line 936,col 9)-(line 936,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelFont()",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\r\n     * Returns the series label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelFont(java.awt.Font)",
      "begin_line": 958,
      "end_line": 964,
      "comment": "\r\n     * Sets the series label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 963,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelPaint()",
      "begin_line": 973,
      "end_line": 975,
      "comment": "\r\n     * Returns the series label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 985,
      "end_line": 991,
      "comment": "\r\n     * Sets the series label paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 32)",
        "(line 990,col 9)-(line 990,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelGenerator()",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\r\n     * Returns the label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1012,
      "end_line": 1017,
      "comment": "\r\n     * Sets the label generator and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getToolTipGenerator()",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": "\r\n     * Returns the tool tip generator for the plot.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setToolTipGenerator(CategoryToolTipGenerator)\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1042,
      "end_line": 1045,
      "comment": "\r\n     * Sets the tool tip generator for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getToolTipGenerator()\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 42)",
        "(line 1044,col 9)-(line 1044,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getURLGenerator()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\r\n     * Returns the URL generator for the plot.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setURLGenerator(CategoryURLGenerator)\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": "\r\n     * Sets the URL generator for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getURLGenerator()\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 38)",
        "(line 1072,col 9)-(line 1072,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLegendItems()",
      "begin_line": 1080,
      "end_line": 1115,
      "comment": "\r\n     * Returns a collection of legend items for the spider web chart.\r\n     *\r\n     * @return The legend items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 65)",
        "(line 1082,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1085,col 25)",
        "(line 1086,col 9)-(line 1091,col 9)",
        "(line 1092,col 9)-(line 1094,col 9)",
        "(line 1096,col 9)-(line 1096,col 23)",
        "(line 1097,col 9)-(line 1097,col 44)",
        "(line 1098,col 9)-(line 1098,col 43)",
        "(line 1099,col 9)-(line 1113,col 9)",
        "(line 1114,col 9)-(line 1114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getWebPoint(java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1126,
      "end_line": 1135,
      "comment": "\r\n     * Returns a cartesian point from a polar angle, length and bounding box\r\n     *\r\n     * @param bounds  the area inside which the point needs to be.\r\n     * @param angle  the polar angle, in degrees.\r\n     * @param length  the relative length. Given in percent of maximum extend.\r\n     *\r\n     * @return The cartesian point.\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 46)",
        "(line 1130,col 9)-(line 1130,col 69)",
        "(line 1131,col 9)-(line 1131,col 71)",
        "(line 1133,col 9)-(line 1134,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1147,
      "end_line": 1236,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 45)",
        "(line 1152,col 9)-(line 1152,col 26)",
        "(line 1154,col 9)-(line 1157,col 9)",
        "(line 1159,col 9)-(line 1159,col 33)",
        "(line 1160,col 9)-(line 1160,col 30)",
        "(line 1162,col 9)-(line 1162,col 39)",
        "(line 1164,col 9)-(line 1164,col 22)",
        "(line 1165,col 9)-(line 1165,col 56)",
        "(line 1166,col 9)-(line 1167,col 39)",
        "(line 1169,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 30)",
        "(line 1234,col 9)-(line 1234,col 43)",
        "(line 1235,col 9)-(line 1235,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.calculateMaxValue(int, int)",
      "begin_line": 1245,
      "end_line": 1260,
      "comment": "\r\n     * loop through each of the series to get the maximum value\r\n     * on each category axis\r\n     *\r\n     * @param seriesCount  the number of series\r\n     * @param catCount  the number of categories\r\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 21)",
        "(line 1247,col 9)-(line 1247,col 25)",
        "(line 1249,col 9)-(line 1259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.drawRadarPoly(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotRenderingInfo, int, int, double, double)",
      "begin_line": 1274,
      "end_line": 1385,
      "comment": "\r\n     * Draws a radar plot polygon.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param plotArea the area we are plotting in (already adjusted).\r\n     * @param centre the centre point of the radar axes\r\n     * @param info chart rendering info.\r\n     * @param series the series within the dataset we are plotting\r\n     * @param catCount the number of categories per radar plot\r\n     * @param headH the data point height\r\n     * @param headW the data point width\r\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 40)",
        "(line 1283,col 9)-(line 1283,col 41)",
        "(line 1284,col 9)-(line 1286,col 9)",
        "(line 1289,col 9)-(line 1368,col 9)",
        "(line 1371,col 9)-(line 1371,col 45)",
        "(line 1372,col 9)-(line 1372,col 27)",
        "(line 1373,col 9)-(line 1373,col 53)",
        "(line 1374,col 9)-(line 1374,col 25)",
        "(line 1378,col 9)-(line 1384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getPlotValue(int, int)",
      "begin_line": 1401,
      "end_line": 1410,
      "comment": "\r\n     * Returns the value to be plotted at the interseries of the\r\n     * series and the category.  This allows us to plot\r\n     * \u003ccode\u003eBY_ROW\u003c/code\u003e or \u003ccode\u003eBY_COLUMN\u003c/code\u003e which basically is just\r\n     * reversing the definition of the categories and data series being\r\n     * plotted.\r\n     *\r\n     * @param series the series to be plotted.\r\n     * @param cat the category within the series to be plotted.\r\n     *\r\n     * @return The value to be plotted (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDataExtractOrder()\r\n     ",
      "child_ranges": [
        "(line 1402,col 9)-(line 1402,col 28)",
        "(line 1403,col 9)-(line 1408,col 9)",
        "(line 1409,col 9)-(line 1409,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.drawLabel(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, int, double, double)",
      "begin_line": 1422,
      "end_line": 1452,
      "comment": "\r\n     * Draws the label for one axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area\r\n     * @param value  the value of the label (ignored).\r\n     * @param cat  the category (zero-based index).\r\n     * @param startAngle  the starting angle.\r\n     * @param extent  the extent of the arc.\r\n     ",
      "child_ranges": [
        "(line 1424,col 9)-(line 1424,col 58)",
        "(line 1426,col 9)-(line 1426,col 28)",
        "(line 1427,col 9)-(line 1434,col 9)",
        "(line 1436,col 9)-(line 1436,col 77)",
        "(line 1437,col 9)-(line 1437,col 67)",
        "(line 1438,col 9)-(line 1438,col 39)",
        "(line 1440,col 9)-(line 1441,col 38)",
        "(line 1443,col 9)-(line 1443,col 52)",
        "(line 1445,col 9)-(line 1446,col 23)",
        "(line 1447,col 9)-(line 1447,col 37)",
        "(line 1448,col 9)-(line 1448,col 35)",
        "(line 1449,col 9)-(line 1450,col 46)",
        "(line 1451,col 9)-(line 1451,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.calculateLabelLocation(java.awt.geom.Rectangle2D, double, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1464,
      "end_line": 1493,
      "comment": "\r\n     * Returns the location for a label\r\n     *\r\n     * @param labelBounds the label bounds.\r\n     * @param ascent the ascent (height of font).\r\n     * @param plotArea the plot area\r\n     * @param startAngle the start angle for the pie series.\r\n     *\r\n     * @return The location for a label.\r\n     ",
      "child_ranges": [
        "(line 1469,col 9)-(line 1469,col 75)",
        "(line 1470,col 9)-(line 1470,col 44)",
        "(line 1472,col 9)-(line 1473,col 44)",
        "(line 1474,col 9)-(line 1475,col 44)",
        "(line 1477,col 9)-(line 1477,col 47)",
        "(line 1478,col 9)-(line 1478,col 47)",
        "(line 1480,col 9)-(line 1482,col 9)",
        "(line 1484,col 9)-(line 1486,col 9)",
        "(line 1488,col 9)-(line 1490,col 9)",
        "(line 1492,col 9)-(line 1492,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.equals(java.lang.Object)",
      "begin_line": 1502,
      "end_line": 1596,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1511,col 9)",
        "(line 1512,col 9)-(line 1512,col 49)",
        "(line 1513,col 9)-(line 1515,col 9)",
        "(line 1516,col 9)-(line 1518,col 9)",
        "(line 1519,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1524,col 9)",
        "(line 1525,col 9)-(line 1527,col 9)",
        "(line 1528,col 9)-(line 1530,col 9)",
        "(line 1531,col 9)-(line 1533,col 9)",
        "(line 1534,col 9)-(line 1536,col 9)",
        "(line 1537,col 9)-(line 1539,col 9)",
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1551,col 9)",
        "(line 1552,col 9)-(line 1554,col 9)",
        "(line 1555,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1565,col 9)",
        "(line 1566,col 9)-(line 1569,col 9)",
        "(line 1570,col 9)-(line 1573,col 9)",
        "(line 1574,col 9)-(line 1577,col 9)",
        "(line 1578,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1583,col 9)",
        "(line 1584,col 9)-(line 1586,col 9)",
        "(line 1587,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1594,col 9)",
        "(line 1595,col 9)-(line 1595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.clone()",
      "begin_line": 1606,
      "end_line": 1615,
      "comment": "\r\n     * Returns a clone of this plot.\r\n     *\r\n     * @return A clone of this plot.\r\n     *\r\n     * @throws CloneNotSupportedException if the plot cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1607,col 60)",
        "(line 1608,col 9)-(line 1608,col 75)",
        "(line 1609,col 9)-(line 1609,col 73)",
        "(line 1610,col 9)-(line 1611,col 66)",
        "(line 1612,col 9)-(line 1613,col 68)",
        "(line 1614,col 9)-(line 1614,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1624,
      "end_line": 1637,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 36)",
        "(line 1627,col 9)-(line 1627,col 65)",
        "(line 1628,col 9)-(line 1628,col 61)",
        "(line 1629,col 9)-(line 1629,col 65)",
        "(line 1630,col 9)-(line 1630,col 68)",
        "(line 1631,col 9)-(line 1631,col 72)",
        "(line 1632,col 9)-(line 1632,col 70)",
        "(line 1633,col 9)-(line 1633,col 74)",
        "(line 1634,col 9)-(line 1634,col 60)",
        "(line 1635,col 9)-(line 1635,col 63)",
        "(line 1636,col 9)-(line 1636,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1647,
      "end_line": 1664,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1649,col 9)-(line 1649,col 35)",
        "(line 1651,col 9)-(line 1651,col 65)",
        "(line 1652,col 9)-(line 1652,col 61)",
        "(line 1653,col 9)-(line 1653,col 65)",
        "(line 1654,col 9)-(line 1654,col 68)",
        "(line 1655,col 9)-(line 1655,col 72)",
        "(line 1656,col 9)-(line 1656,col 70)",
        "(line 1657,col 9)-(line 1657,col 74)",
        "(line 1658,col 9)-(line 1658,col 60)",
        "(line 1659,col 9)-(line 1659,col 63)",
        "(line 1660,col 9)-(line 1660,col 65)",
        "(line 1661,col 9)-(line 1663,col 9)"
      ]
    }
  ]
}