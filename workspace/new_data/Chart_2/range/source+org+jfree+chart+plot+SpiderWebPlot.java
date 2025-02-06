{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/SpiderWebPlot.java",
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
      "begin_line": 127,
      "end_line": 1669,
      "comment": "\r\n * A plot that displays data from a {@link CategoryDataset} in the form of a\r\n * \"spider web\".  Multiple series can be plotted on the same axis to allow\r\n * easy comparison.  This plot doesn\u0027t support negative values at present.\r\n "
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
        "DEFAULT_HEAD"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The default head radius percent (currently 1%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_GAP"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The default axis label gap (currently 10%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The default starting angle for the radar chart axes. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 148,
      "end_line": 149,
      "comment": " The default series label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The default series label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 155,
      "end_line": 156,
      "comment": " The default series label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The default series label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 162,
      "end_line": 163,
      "comment": " The default series label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The default series label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_VALUE"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": "\r\n     * The default maximum value plotted - forces the plot to evaluate\r\n     *  the maximum from the data passed in\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "headPercent"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The head radius as a percentage of the available drawing area. "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The space left around the outside of the plot as a percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLabelGap"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The gap between the labels and the axes as a %age of the radius. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLinePaint"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\r\n     * The paint used to draw the axis lines.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineStroke"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\r\n     * The stroke used to draw the axis lines.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The maximum value we are plotting against on each category axis "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": "\r\n     * The data extract order (BY_ROW or BY_COLUMN). This denotes whether\r\n     * the data series are stored in rows (in which case the category names are\r\n     * derived from the column keys) or in columns (in which case the category\r\n     * names are derived from the row keys).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The direction for drawing the radar axis \u0026 plots. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPaint"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " The paint for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPaintList"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " The series paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesPaint"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " The base series paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlinePaint"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " The outline paint for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlinePaintList"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The series outline paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesOutlinePaint"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " The base series outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlineStroke"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " The outline stroke for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlineStrokeList"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " The series outline stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesOutlineStroke"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " The base series outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " The font used to display the category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " The color used to draw the category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " The label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "webFilled"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " controls if the web polygons are filled or not "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " A tooltip generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " A URL generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Creates a default plot with no dataset.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Creates a new spider web plot with the given dataset, with each row\r\n     * representing a series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder)",
      "begin_line": 289,
      "end_line": 327,
      "comment": "\r\n     * Creates a new spider web plot with the given dataset.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param extract  controls how data is extracted ({@link TableOrder#BY_ROW}\r\n     *                 or {@link TableOrder#BY_COLUMN}).\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 16)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 31)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 40)",
        "(line 300,col 9)-(line 300,col 40)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 302,col 41)",
        "(line 303,col 9)-(line 303,col 52)",
        "(line 305,col 9)-(line 305,col 48)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 307,col 9)-(line 307,col 44)",
        "(line 308,col 9)-(line 308,col 42)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 47)",
        "(line 312,col 9)-(line 312,col 36)",
        "(line 314,col 9)-(line 314,col 39)",
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 316,col 60)",
        "(line 318,col 9)-(line 318,col 40)",
        "(line 319,col 9)-(line 319,col 56)",
        "(line 320,col 9)-(line 320,col 62)",
        "(line 322,col 9)-(line 322,col 44)",
        "(line 323,col 9)-(line 323,col 46)",
        "(line 324,col 9)-(line 324,col 71)",
        "(line 326,col 9)-(line 326,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getPlotType()",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDataset()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 358,
      "end_line": 376,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 366,col 9)-(line 366,col 31)",
        "(line 367,col 9)-(line 370,col 9)",
        "(line 373,col 9)-(line 374,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.isWebFilled()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\r\n     * Method to determine if the web chart is to be filled.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setWebFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setWebFilled(boolean)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\r\n     * Sets the webFilled flag and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isWebFilled()\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 30)",
        "(line 399,col 9)-(line 399,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDataExtractOrder()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     *\r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataExtractOrder(TableOrder)\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 424,
      "end_line": 430,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a\r\n     * {@link PlotChangeEvent}to all registered listeners.\r\n     *\r\n     * @param order the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eorder\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDataExtractOrder()\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 38)",
        "(line 429,col 9)-(line 429,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getHeadPercent()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\r\n     * Returns the head percent.\r\n     *\r\n     * @return The head percent.\r\n     *\r\n     * @see #setHeadPercent(double)\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setHeadPercent(double)",
      "begin_line": 451,
      "end_line": 454,
      "comment": "\r\n     * Sets the head percent and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param percent  the percent.\r\n     *\r\n     * @see #getHeadPercent()\r\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 35)",
        "(line 453,col 9)-(line 453,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getStartAngle()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\r\n     * Returns the start angle for the first radar axis.\r\n     * \u003cBR\u003e\r\n     * This is measured in degrees starting from 3 o\u0027clock (Java Arc2D default)\r\n     * and measuring anti-clockwise.\r\n     *\r\n     * @return The start angle.\r\n     *\r\n     * @see #setStartAngle(double)\r\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setStartAngle(double)",
      "begin_line": 482,
      "end_line": 485,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * The initial default value is 90 degrees, which corresponds to 12 o\u0027clock.\r\n     * A value of zero corresponds to 3 o\u0027clock... this is the encoding used by\r\n     * Java\u0027s Arc2D class.\r\n     *\r\n     * @param angle  the angle (in degrees).\r\n     *\r\n     * @see #getStartAngle()\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 32)",
        "(line 484,col 9)-(line 484,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getMaxValue()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\r\n     * Returns the maximum value any category axis can take.\r\n     *\r\n     * @return The maximum value.\r\n     *\r\n     * @see #setMaxValue(double)\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setMaxValue(double)",
      "begin_line": 506,
      "end_line": 509,
      "comment": "\r\n     * Sets the maximum value any category axis can take and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the maximum value.\r\n     *\r\n     * @see #getMaxValue()\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 30)",
        "(line 508,col 9)-(line 508,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDirection()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\r\n     * Returns the direction in which the radar axes are drawn\r\n     * (clockwise or anti-clockwise).\r\n     *\r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDirection(Rotation)\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 531,
      "end_line": 537,
      "comment": "\r\n     * Sets the direction in which the radar axes are drawn and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDirection()\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 35)",
        "(line 536,col 9)-(line 536,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getInteriorGap()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available\r\n     * drawing space.\r\n     *\r\n     * @return The gap (as a percentage of the available drawing space).\r\n     *\r\n     * @see #setInteriorGap(double)\r\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setInteriorGap(double)",
      "begin_line": 560,
      "end_line": 569,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners. This controls the space between the edges of the\r\n     * plot and the plot area itself (the region where the axis labels appear).\r\n     *\r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     *\r\n     * @see #getInteriorGap()\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLabelGap()",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\r\n     * Returns the axis label gap.\r\n     *\r\n     * @return The axis label gap.\r\n     *\r\n     * @see #setAxisLabelGap(double)\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLabelGap(double)",
      "begin_line": 590,
      "end_line": 593,
      "comment": "\r\n     * Sets the axis label gap and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param gap  the gap.\r\n     *\r\n     * @see #getAxisLabelGap()\r\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 32)",
        "(line 592,col 9)-(line 592,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLinePaint()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\r\n     * Returns the paint used to draw the axis lines.\r\n     *\r\n     * @return The paint used to draw the axis lines (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLinePaint(Paint)\r\n     * @see #getAxisLineStroke()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLinePaint(java.awt.Paint)",
      "begin_line": 617,
      "end_line": 623,
      "comment": "\r\n     * Sets the paint used to draw the axis lines and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLinePaint()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 35)",
        "(line 622,col 9)-(line 622,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLineStroke()",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\r\n     * Returns the stroke used to draw the axis lines.\r\n     *\r\n     * @return The stroke used to draw the axis lines (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLineStroke(Stroke)\r\n     * @see #getAxisLinePaint()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLineStroke(java.awt.Stroke)",
      "begin_line": 647,
      "end_line": 653,
      "comment": "\r\n     * Sets the stroke used to draw the axis lines and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLineStroke()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 37)",
        "(line 652,col 9)-(line 652,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesPaint()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\r\n     * Returns the paint for ALL series in the plot.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesPaint(java.awt.Paint)",
      "begin_line": 677,
      "end_line": 680,
      "comment": "\r\n     * Sets the paint for ALL series in the plot. If this is set to\u003c/code\u003e null\r\n     * \u003c/code\u003e, then a list of paints is used instead (to allow different colors\r\n     * to be used for each series of the radar group).\r\n     *\r\n     * @param paint the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 33)",
        "(line 679,col 9)-(line 679,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesPaint(int)",
      "begin_line": 691,
      "end_line": 713,
      "comment": "\r\n     * Returns the paint for the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 699,col 9)-(line 699,col 61)",
        "(line 700,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 724,
      "end_line": 727,
      "comment": "\r\n     * Sets the paint used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 53)",
        "(line 726,col 9)-(line 726,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesPaint()",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\r\n     * Returns the base series paint. This is used when no other paint is\r\n     * available.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseSeriesPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 738,col 7)-(line 738,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesPaint(java.awt.Paint)",
      "begin_line": 748,
      "end_line": 754,
      "comment": "\r\n     * Sets the base series paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 37)",
        "(line 753,col 9)-(line 753,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlinePaint()",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\r\n     * Returns the outline paint for ALL series in the plot.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlinePaint(java.awt.Paint)",
      "begin_line": 774,
      "end_line": 777,
      "comment": "\r\n     * Sets the outline paint for ALL series in the plot. If this is set to\r\n     * \u003c/code\u003e null\u003c/code\u003e, then a list of paints is used instead (to allow\r\n     * different colors to be used for each series).\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 40)",
        "(line 776,col 9)-(line 776,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlinePaint(int)",
      "begin_line": 786,
      "end_line": 797,
      "comment": "\r\n     * Returns the paint for the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 790,col 9)",
        "(line 792,col 9)-(line 792,col 68)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 806,
      "end_line": 809,
      "comment": "\r\n     * Sets the paint used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 60)",
        "(line 808,col 9)-(line 808,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesOutlinePaint()",
      "begin_line": 817,
      "end_line": 819,
      "comment": "\r\n     * Returns the base series paint. This is used when no other paint is\r\n     * available.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesOutlinePaint(java.awt.Paint)",
      "begin_line": 826,
      "end_line": 832,
      "comment": "\r\n     * Sets the base series paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 44)",
        "(line 831,col 9)-(line 831,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlineStroke()",
      "begin_line": 841,
      "end_line": 843,
      "comment": "\r\n     * Returns the outline stroke for ALL series in the plot.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlineStroke(java.awt.Stroke)",
      "begin_line": 852,
      "end_line": 855,
      "comment": "\r\n     * Sets the outline stroke for ALL series in the plot. If this is set to\r\n     * \u003c/code\u003e null\u003c/code\u003e, then a list of paints is used instead (to allow\r\n     * different colors to be used for each series).\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 42)",
        "(line 854,col 9)-(line 854,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlineStroke(int)",
      "begin_line": 864,
      "end_line": 878,
      "comment": "\r\n     * Returns the stroke for the specified series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 869,col 9)",
        "(line 872,col 9)-(line 872,col 71)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 887,
      "end_line": 890,
      "comment": "\r\n     * Sets the stroke used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 63)",
        "(line 889,col 9)-(line 889,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesOutlineStroke()",
      "begin_line": 898,
      "end_line": 900,
      "comment": "\r\n     * Returns the base series stroke. This is used when no other stroke is\r\n     * available.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesOutlineStroke(java.awt.Stroke)",
      "begin_line": 907,
      "end_line": 913,
      "comment": "\r\n     * Sets the base series stroke.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 911,col 46)",
        "(line 912,col 9)-(line 912,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLegendItemShape()",
      "begin_line": 922,
      "end_line": 924,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 934,
      "end_line": 940,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemShape()\r\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 37)",
        "(line 939,col 9)-(line 939,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelFont()",
      "begin_line": 949,
      "end_line": 951,
      "comment": "\r\n     * Returns the series label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelFont(java.awt.Font)",
      "begin_line": 961,
      "end_line": 967,
      "comment": "\r\n     * Sets the series label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 965,col 30)",
        "(line 966,col 9)-(line 966,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelPaint()",
      "begin_line": 976,
      "end_line": 978,
      "comment": "\r\n     * Returns the series label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 988,
      "end_line": 994,
      "comment": "\r\n     * Sets the series label paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 32)",
        "(line 993,col 9)-(line 993,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelGenerator()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\r\n     * Returns the label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1015,
      "end_line": 1020,
      "comment": "\r\n     * Sets the label generator and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1019,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getToolTipGenerator()",
      "begin_line": 1031,
      "end_line": 1033,
      "comment": "\r\n     * Returns the tool tip generator for the plot.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setToolTipGenerator(CategoryToolTipGenerator)\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "\r\n     * Sets the tool tip generator for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getToolTipGenerator()\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 42)",
        "(line 1047,col 9)-(line 1047,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getURLGenerator()",
      "begin_line": 1059,
      "end_line": 1061,
      "comment": "\r\n     * Returns the URL generator for the plot.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setURLGenerator(CategoryURLGenerator)\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1073,
      "end_line": 1076,
      "comment": "\r\n     * Sets the URL generator for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getURLGenerator()\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 38)",
        "(line 1075,col 9)-(line 1075,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLegendItems()",
      "begin_line": 1083,
      "end_line": 1118,
      "comment": "\r\n     * Returns a collection of legend items for the spider web chart.\r\n     *\r\n     * @return The legend items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 65)",
        "(line 1085,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1088,col 25)",
        "(line 1089,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1099,col 9)-(line 1099,col 23)",
        "(line 1100,col 9)-(line 1100,col 44)",
        "(line 1101,col 9)-(line 1101,col 43)",
        "(line 1102,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getWebPoint(java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1129,
      "end_line": 1138,
      "comment": "\r\n     * Returns a cartesian point from a polar angle, length and bounding box\r\n     *\r\n     * @param bounds  the area inside which the point needs to be.\r\n     * @param angle  the polar angle, in degrees.\r\n     * @param length  the relative length. Given in percent of maximum extend.\r\n     *\r\n     * @return The cartesian point.\r\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1132,col 46)",
        "(line 1133,col 9)-(line 1133,col 69)",
        "(line 1134,col 9)-(line 1134,col 71)",
        "(line 1136,col 9)-(line 1137,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1150,
      "end_line": 1239,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 45)",
        "(line 1155,col 9)-(line 1155,col 26)",
        "(line 1157,col 9)-(line 1160,col 9)",
        "(line 1162,col 9)-(line 1162,col 33)",
        "(line 1163,col 9)-(line 1163,col 30)",
        "(line 1165,col 9)-(line 1165,col 39)",
        "(line 1167,col 9)-(line 1167,col 22)",
        "(line 1168,col 9)-(line 1168,col 56)",
        "(line 1169,col 9)-(line 1170,col 39)",
        "(line 1172,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 30)",
        "(line 1237,col 9)-(line 1237,col 43)",
        "(line 1238,col 9)-(line 1238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.calculateMaxValue(int, int)",
      "begin_line": 1248,
      "end_line": 1263,
      "comment": "\r\n     * loop through each of the series to get the maximum value\r\n     * on each category axis\r\n     *\r\n     * @param seriesCount  the number of series\r\n     * @param catCount  the number of categories\r\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 21)",
        "(line 1250,col 9)-(line 1250,col 25)",
        "(line 1252,col 9)-(line 1262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.drawRadarPoly(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotRenderingInfo, int, int, double, double)",
      "begin_line": 1277,
      "end_line": 1388,
      "comment": "\r\n     * Draws a radar plot polygon.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param plotArea the area we are plotting in (already adjusted).\r\n     * @param centre the centre point of the radar axes\r\n     * @param info chart rendering info.\r\n     * @param series the series within the dataset we are plotting\r\n     * @param catCount the number of categories per radar plot\r\n     * @param headH the data point height\r\n     * @param headW the data point width\r\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 40)",
        "(line 1286,col 9)-(line 1286,col 41)",
        "(line 1287,col 9)-(line 1289,col 9)",
        "(line 1292,col 9)-(line 1371,col 9)",
        "(line 1374,col 9)-(line 1374,col 45)",
        "(line 1375,col 9)-(line 1375,col 27)",
        "(line 1376,col 9)-(line 1376,col 53)",
        "(line 1377,col 9)-(line 1377,col 25)",
        "(line 1381,col 9)-(line 1387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getPlotValue(int, int)",
      "begin_line": 1404,
      "end_line": 1413,
      "comment": "\r\n     * Returns the value to be plotted at the interseries of the\r\n     * series and the category.  This allows us to plot\r\n     * \u003ccode\u003eBY_ROW\u003c/code\u003e or \u003ccode\u003eBY_COLUMN\u003c/code\u003e which basically is just\r\n     * reversing the definition of the categories and data series being\r\n     * plotted.\r\n     *\r\n     * @param series the series to be plotted.\r\n     * @param cat the category within the series to be plotted.\r\n     *\r\n     * @return The value to be plotted (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDataExtractOrder()\r\n     ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1405,col 28)",
        "(line 1406,col 9)-(line 1411,col 9)",
        "(line 1412,col 9)-(line 1412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.drawLabel(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, int, double, double)",
      "begin_line": 1425,
      "end_line": 1455,
      "comment": "\r\n     * Draws the label for one axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area\r\n     * @param value  the value of the label (ignored).\r\n     * @param cat  the category (zero-based index).\r\n     * @param startAngle  the starting angle.\r\n     * @param extent  the extent of the arc.\r\n     ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1427,col 58)",
        "(line 1429,col 9)-(line 1429,col 28)",
        "(line 1430,col 9)-(line 1437,col 9)",
        "(line 1439,col 9)-(line 1439,col 77)",
        "(line 1440,col 9)-(line 1440,col 67)",
        "(line 1441,col 9)-(line 1441,col 39)",
        "(line 1443,col 9)-(line 1444,col 38)",
        "(line 1446,col 9)-(line 1446,col 52)",
        "(line 1448,col 9)-(line 1449,col 23)",
        "(line 1450,col 9)-(line 1450,col 37)",
        "(line 1451,col 9)-(line 1451,col 35)",
        "(line 1452,col 9)-(line 1453,col 46)",
        "(line 1454,col 9)-(line 1454,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.calculateLabelLocation(java.awt.geom.Rectangle2D, double, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1467,
      "end_line": 1496,
      "comment": "\r\n     * Returns the location for a label\r\n     *\r\n     * @param labelBounds the label bounds.\r\n     * @param ascent the ascent (height of font).\r\n     * @param plotArea the plot area\r\n     * @param startAngle the start angle for the pie series.\r\n     *\r\n     * @return The location for a label.\r\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1472,col 75)",
        "(line 1473,col 9)-(line 1473,col 44)",
        "(line 1475,col 9)-(line 1476,col 44)",
        "(line 1477,col 9)-(line 1478,col 44)",
        "(line 1480,col 9)-(line 1480,col 47)",
        "(line 1481,col 9)-(line 1481,col 47)",
        "(line 1483,col 9)-(line 1485,col 9)",
        "(line 1487,col 9)-(line 1489,col 9)",
        "(line 1491,col 9)-(line 1493,col 9)",
        "(line 1495,col 9)-(line 1495,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.equals(java.lang.Object)",
      "begin_line": 1505,
      "end_line": 1599,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1511,col 9)",
        "(line 1512,col 9)-(line 1514,col 9)",
        "(line 1515,col 9)-(line 1515,col 49)",
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
        "(line 1555,col 9)-(line 1557,col 9)",
        "(line 1558,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1564,col 9)",
        "(line 1565,col 9)-(line 1568,col 9)",
        "(line 1569,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1576,col 9)",
        "(line 1577,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1583,col 9)",
        "(line 1584,col 9)-(line 1586,col 9)",
        "(line 1587,col 9)-(line 1589,col 9)",
        "(line 1590,col 9)-(line 1593,col 9)",
        "(line 1594,col 9)-(line 1597,col 9)",
        "(line 1598,col 9)-(line 1598,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.clone()",
      "begin_line": 1609,
      "end_line": 1618,
      "comment": "\r\n     * Returns a clone of this plot.\r\n     *\r\n     * @return A clone of this plot.\r\n     *\r\n     * @throws CloneNotSupportedException if the plot cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 1610,col 9)-(line 1610,col 60)",
        "(line 1611,col 9)-(line 1611,col 75)",
        "(line 1612,col 9)-(line 1612,col 73)",
        "(line 1613,col 9)-(line 1614,col 66)",
        "(line 1615,col 9)-(line 1616,col 68)",
        "(line 1617,col 9)-(line 1617,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1627,
      "end_line": 1640,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1628,col 9)-(line 1628,col 36)",
        "(line 1630,col 9)-(line 1630,col 65)",
        "(line 1631,col 9)-(line 1631,col 61)",
        "(line 1632,col 9)-(line 1632,col 65)",
        "(line 1633,col 9)-(line 1633,col 68)",
        "(line 1634,col 9)-(line 1634,col 72)",
        "(line 1635,col 9)-(line 1635,col 70)",
        "(line 1636,col 9)-(line 1636,col 74)",
        "(line 1637,col 9)-(line 1637,col 60)",
        "(line 1638,col 9)-(line 1638,col 63)",
        "(line 1639,col 9)-(line 1639,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1650,
      "end_line": 1667,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1652,col 9)-(line 1652,col 35)",
        "(line 1654,col 9)-(line 1654,col 65)",
        "(line 1655,col 9)-(line 1655,col 61)",
        "(line 1656,col 9)-(line 1656,col 65)",
        "(line 1657,col 9)-(line 1657,col 68)",
        "(line 1658,col 9)-(line 1658,col 72)",
        "(line 1659,col 9)-(line 1659,col 70)",
        "(line 1660,col 9)-(line 1660,col 74)",
        "(line 1661,col 9)-(line 1661,col 60)",
        "(line 1662,col 9)-(line 1662,col 63)",
        "(line 1663,col 9)-(line 1663,col 65)",
        "(line 1664,col 9)-(line 1666,col 9)"
      ]
    }
  ]
}