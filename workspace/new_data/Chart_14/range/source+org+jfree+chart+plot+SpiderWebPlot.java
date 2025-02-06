{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/SpiderWebPlot.java",
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
      "begin_line": 123,
      "end_line": 1652,
      "comment": "\r\n * A plot that displays data from a {@link CategoryDataset} in the form of a \r\n * \"spider web\".  Multiple series can be plotted on the same axis to allow \r\n * easy comparison.  This plot doesn\u0027t support negative values at present.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HEAD"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The default head radius percent (currently 1%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_GAP"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The default axis label gap (currently 10%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The default starting angle for the radar chart axes. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 144,
      "end_line": 145,
      "comment": " The default series label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The default series label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 151,
      "end_line": 152,
      "comment": " The default series label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The default series label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 158,
      "end_line": 159,
      "comment": " The default series label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The default series label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_VALUE"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " \r\n     * The default maximum value plotted - forces the plot to evaluate\r\n     *  the maximum from the data passed in\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "headPercent"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " The head radius as a percentage of the available drawing area. "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The space left around the outside of the plot as a percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLabelGap"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The gap between the labels and the axes as a %age of the radius. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLinePaint"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\r\n     * The paint used to draw the axis lines.\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineStroke"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\r\n     * The stroke used to draw the axis lines.\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The maximum value we are plotting against on each category axis "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " \r\n     * The data extract order (BY_ROW or BY_COLUMN). This denotes whether\r\n     * the data series are stored in rows (in which case the category names are\r\n     * derived from the column keys) or in columns (in which case the category\r\n     * names are derived from the row keys).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The direction for drawing the radar axis \u0026 plots. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPaint"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The paint for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPaintList"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " The series paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesPaint"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " The base series paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlinePaint"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " The outline paint for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlinePaintList"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The series outline paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesOutlinePaint"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The base series outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlineStroke"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " The outline stroke for ALL series (overrides list). "
    },
    {
      "type": "field",
      "varNames": [
        "seriesOutlineStrokeList"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " The series outline stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesOutlineStroke"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " The base series outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " The font used to display the category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " The color used to draw the category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "webFilled"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " controls if the web polygons are filled or not "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " A tooltip generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " A URL generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Creates a default plot with no dataset.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Creates a new spider web plot with the given dataset, with each row\r\n     * representing a series.  \r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.SpiderWebPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder)",
      "begin_line": 285,
      "end_line": 323,
      "comment": "\r\n     * Creates a new spider web plot with the given dataset.\r\n     * \r\n     * @param dataset  the dataset.\r\n     * @param extract  controls how data is extracted ({@link TableOrder#BY_ROW}\r\n     *                 or {@link TableOrder#BY_COLUMN}).\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 16)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 31)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 40)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 51)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 52)",
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 46)",
        "(line 303,col 9)-(line 303,col 44)",
        "(line 304,col 9)-(line 304,col 42)",
        "(line 306,col 9)-(line 306,col 32)",
        "(line 307,col 9)-(line 307,col 47)",
        "(line 308,col 9)-(line 308,col 36)",
        "(line 310,col 9)-(line 310,col 39)",
        "(line 311,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 312,col 60)",
        "(line 314,col 9)-(line 314,col 40)",
        "(line 315,col 9)-(line 315,col 56)",
        "(line 316,col 9)-(line 316,col 62)",
        "(line 318,col 9)-(line 318,col 44)",
        "(line 319,col 9)-(line 319,col 46)",
        "(line 320,col 9)-(line 320,col 71)",
        "(line 322,col 9)-(line 322,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getPlotType()",
      "begin_line": 330,
      "end_line": 333,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     * \r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDataset()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns the dataset.\r\n     * \r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 354,
      "end_line": 370,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 362,col 9)-(line 362,col 31)",
        "(line 363,col 9)-(line 366,col 9)",
        "(line 369,col 9)-(line 369,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.isWebFilled()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Method to determine if the web chart is to be filled.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setWebFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setWebFilled(boolean)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\r\n     * Sets the webFilled flag and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isWebFilled()\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 30)",
        "(line 393,col 9)-(line 393,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDataExtractOrder()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     * \r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataExtractOrder(TableOrder)\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a\r\n     * {@link PlotChangeEvent}to all registered listeners.\r\n     * \r\n     * @param order the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eorder\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getDataExtractOrder()\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 38)",
        "(line 423,col 9)-(line 423,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getHeadPercent()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\r\n     * Returns the head percent.\r\n     * \r\n     * @return The head percent.\r\n     * \r\n     * @see #setHeadPercent(double)\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setHeadPercent(double)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\r\n     * Sets the head percent and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param percent  the percent.\r\n     * \r\n     * @see #getHeadPercent()\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 35)",
        "(line 447,col 9)-(line 447,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getStartAngle()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\r\n     * Returns the start angle for the first radar axis.\r\n     * \u003cBR\u003e\r\n     * This is measured in degrees starting from 3 o\u0027clock (Java Arc2D default)\r\n     * and measuring anti-clockwise.\r\n     * \r\n     * @return The start angle.\r\n     * \r\n     * @see #setStartAngle(double)\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setStartAngle(double)",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * The initial default value is 90 degrees, which corresponds to 12 o\u0027clock.\r\n     * A value of zero corresponds to 3 o\u0027clock... this is the encoding used by\r\n     * Java\u0027s Arc2D class.\r\n     * \r\n     * @param angle  the angle (in degrees).\r\n     * \r\n     * @see #getStartAngle()\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 32)",
        "(line 478,col 9)-(line 478,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getMaxValue()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Returns the maximum value any category axis can take.\r\n     * \r\n     * @return The maximum value.\r\n     * \r\n     * @see #setMaxValue(double)\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setMaxValue(double)",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\r\n     * Sets the maximum value any category axis can take and sends \r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param value  the maximum value.\r\n     * \r\n     * @see #getMaxValue()\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 30)",
        "(line 502,col 9)-(line 502,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getDirection()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\r\n     * Returns the direction in which the radar axes are drawn\r\n     * (clockwise or anti-clockwise).\r\n     * \r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDirection(Rotation)\r\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 525,
      "end_line": 531,
      "comment": "\r\n     * Sets the direction in which the radar axes are drawn and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDirection()\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 35)",
        "(line 530,col 9)-(line 530,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getInteriorGap()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available \r\n     * drawing space.\r\n     * \r\n     * @return The gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #setInteriorGap(double)\r\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setInteriorGap(double)",
      "begin_line": 554,
      "end_line": 563,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners. This controls the space between the edges of the \r\n     * plot and the plot area itself (the region where the axis labels appear).\r\n     * \r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #getInteriorGap()\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLabelGap()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\r\n     * Returns the axis label gap.\r\n     * \r\n     * @return The axis label gap.\r\n     * \r\n     * @see #setAxisLabelGap(double)\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLabelGap(double)",
      "begin_line": 584,
      "end_line": 587,
      "comment": "\r\n     * Sets the axis label gap and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param gap  the gap.\r\n     * \r\n     * @see #getAxisLabelGap()\r\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 32)",
        "(line 586,col 9)-(line 586,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLinePaint()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\r\n     * Returns the paint used to draw the axis lines.\r\n     * \r\n     * @return The paint used to draw the axis lines (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLinePaint(Paint)\r\n     * @see #getAxisLineStroke()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLinePaint(java.awt.Paint)",
      "begin_line": 611,
      "end_line": 617,
      "comment": "\r\n     * Sets the paint used to draw the axis lines and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLinePaint()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 35)",
        "(line 616,col 9)-(line 616,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getAxisLineStroke()",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\r\n     * Returns the stroke used to draw the axis lines.\r\n     * \r\n     * @return The stroke used to draw the axis lines (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLineStroke(Stroke)\r\n     * @see #getAxisLinePaint()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setAxisLineStroke(java.awt.Stroke)",
      "begin_line": 641,
      "end_line": 647,
      "comment": "\r\n     * Sets the stroke used to draw the axis lines and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLineStroke()\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 37)",
        "(line 646,col 9)-(line 646,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesPaint()",
      "begin_line": 658,
      "end_line": 660,
      "comment": "\r\n     * Returns the paint for ALL series in the plot.\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesPaint(java.awt.Paint)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "\r\n     * Sets the paint for ALL series in the plot. If this is set to\u003c/code\u003e null\r\n     * \u003c/code\u003e, then a list of paints is used instead (to allow different colors\r\n     * to be used for each series of the radar group).\r\n     * \r\n     * @param paint the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 33)",
        "(line 673,col 9)-(line 673,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesPaint(int)",
      "begin_line": 685,
      "end_line": 707,
      "comment": "\r\n     * Returns the paint for the specified series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 690,col 9)",
        "(line 693,col 9)-(line 693,col 61)",
        "(line 694,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 718,
      "end_line": 721,
      "comment": "\r\n     * Sets the paint used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 53)",
        "(line 720,col 9)-(line 720,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesPaint()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\r\n     * Returns the base series paint. This is used when no other paint is\r\n     * available.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSeriesPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 732,col 7)-(line 732,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesPaint(java.awt.Paint)",
      "begin_line": 742,
      "end_line": 748,
      "comment": "\r\n     * Sets the base series paint.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 746,col 37)",
        "(line 747,col 9)-(line 747,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlinePaint()",
      "begin_line": 757,
      "end_line": 759,
      "comment": "\r\n     * Returns the outline paint for ALL series in the plot.\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlinePaint(java.awt.Paint)",
      "begin_line": 768,
      "end_line": 771,
      "comment": "\r\n     * Sets the outline paint for ALL series in the plot. If this is set to\r\n     * \u003c/code\u003e null\u003c/code\u003e, then a list of paints is used instead (to allow\r\n     * different colors to be used for each series).\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 40)",
        "(line 770,col 9)-(line 770,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlinePaint(int)",
      "begin_line": 780,
      "end_line": 791,
      "comment": "\r\n     * Returns the paint for the specified series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 784,col 9)",
        "(line 786,col 9)-(line 786,col 68)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 800,
      "end_line": 803,
      "comment": "\r\n     * Sets the paint used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 60)",
        "(line 802,col 9)-(line 802,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesOutlinePaint()",
      "begin_line": 811,
      "end_line": 813,
      "comment": "\r\n     * Returns the base series paint. This is used when no other paint is\r\n     * available.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesOutlinePaint(java.awt.Paint)",
      "begin_line": 820,
      "end_line": 826,
      "comment": "\r\n     * Sets the base series paint.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 44)",
        "(line 825,col 9)-(line 825,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlineStroke()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\r\n     * Returns the outline stroke for ALL series in the plot.\r\n     * \r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlineStroke(java.awt.Stroke)",
      "begin_line": 846,
      "end_line": 849,
      "comment": "\r\n     * Sets the outline stroke for ALL series in the plot. If this is set to\r\n     * \u003c/code\u003e null\u003c/code\u003e, then a list of paints is used instead (to allow\r\n     * different colors to be used for each series).\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 42)",
        "(line 848,col 9)-(line 848,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getSeriesOutlineStroke(int)",
      "begin_line": 858,
      "end_line": 872,
      "comment": "\r\n     * Returns the stroke for the specified series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 863,col 9)",
        "(line 866,col 9)-(line 866,col 71)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 881,
      "end_line": 884,
      "comment": "\r\n     * Sets the stroke used to fill a series of the radar and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 63)",
        "(line 883,col 9)-(line 883,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getBaseSeriesOutlineStroke()",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\r\n     * Returns the base series stroke. This is used when no other stroke is\r\n     * available.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setBaseSeriesOutlineStroke(java.awt.Stroke)",
      "begin_line": 901,
      "end_line": 907,
      "comment": "\r\n     * Sets the base series stroke.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 46)",
        "(line 906,col 9)-(line 906,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLegendItemShape()",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     * \r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendItemShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 928,
      "end_line": 934,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendItemShape()\r\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 37)",
        "(line 933,col 9)-(line 933,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelFont()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\r\n     * Returns the series label font.\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelFont(java.awt.Font)",
      "begin_line": 955,
      "end_line": 961,
      "comment": "\r\n     * Sets the series label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 30)",
        "(line 960,col 9)-(line 960,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelPaint()",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\r\n     * Returns the series label paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 982,
      "end_line": 988,
      "comment": "\r\n     * Sets the series label paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 32)",
        "(line 987,col 9)-(line 987,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLabelGenerator()",
      "begin_line": 997,
      "end_line": 999,
      "comment": "\r\n     * Returns the label generator.\r\n     * \r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 1009,
      "end_line": 1014,
      "comment": "\r\n     * Sets the label generator and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getToolTipGenerator()",
      "begin_line": 1025,
      "end_line": 1027,
      "comment": "\r\n     * Returns the tool tip generator for the plot.\r\n     * \r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setToolTipGenerator(CategoryToolTipGenerator)\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 1039,
      "end_line": 1042,
      "comment": "\r\n     * Sets the tool tip generator for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getToolTipGenerator()\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 42)",
        "(line 1041,col 9)-(line 1041,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getURLGenerator()",
      "begin_line": 1053,
      "end_line": 1055,
      "comment": "\r\n     * Returns the URL generator for the plot.\r\n     * \r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setURLGenerator(CategoryURLGenerator)\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.setURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 1067,
      "end_line": 1070,
      "comment": "\r\n     * Sets the URL generator for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getURLGenerator()\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 38)",
        "(line 1069,col 9)-(line 1069,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getLegendItems()",
      "begin_line": 1077,
      "end_line": 1110,
      "comment": "\r\n     * Returns a collection of legend items for the radar chart.\r\n     * \r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 65)",
        "(line 1080,col 9)-(line 1080,col 25)",
        "(line 1082,col 9)-(line 1087,col 9)",
        "(line 1089,col 9)-(line 1107,col 9)",
        "(line 1109,col 9)-(line 1109,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getWebPoint(java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1121,
      "end_line": 1130,
      "comment": "\r\n     * Returns a cartesian point from a polar angle, length and bounding box\r\n     * \r\n     * @param bounds  the area inside which the point needs to be.\r\n     * @param angle  the polar angle, in degrees.\r\n     * @param length  the relative length. Given in percent of maximum extend.\r\n     * \r\n     * @return The cartesian point.\r\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 46)",
        "(line 1125,col 9)-(line 1125,col 69)",
        "(line 1126,col 9)-(line 1126,col 71)",
        "(line 1128,col 9)-(line 1129,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1142,
      "end_line": 1232,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 45)",
        "(line 1148,col 9)-(line 1148,col 26)",
        "(line 1150,col 9)-(line 1153,col 9)",
        "(line 1155,col 9)-(line 1155,col 33)",
        "(line 1156,col 9)-(line 1156,col 30)",
        "(line 1158,col 9)-(line 1158,col 39)",
        "(line 1160,col 9)-(line 1160,col 22)",
        "(line 1161,col 9)-(line 1161,col 56)",
        "(line 1162,col 9)-(line 1163,col 39)",
        "(line 1165,col 9)-(line 1228,col 9)",
        "(line 1229,col 9)-(line 1229,col 30)",
        "(line 1230,col 9)-(line 1230,col 43)",
        "(line 1231,col 9)-(line 1231,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.calculateMaxValue(int, int)",
      "begin_line": 1241,
      "end_line": 1256,
      "comment": "\r\n     * loop through each of the series to get the maximum value\r\n     * on each category axis\r\n     *\r\n     * @param seriesCount  the number of series\r\n     * @param catCount  the number of categories\r\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 21)",
        "(line 1243,col 9)-(line 1243,col 25)",
        "(line 1245,col 9)-(line 1255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.drawRadarPoly(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotRenderingInfo, int, int, double, double)",
      "begin_line": 1270,
      "end_line": 1371,
      "comment": "\r\n     * Draws a radar plot polygon.\r\n     * \r\n     * @param g2 the graphics device.\r\n     * @param plotArea the area we are plotting in (already adjusted).\r\n     * @param centre the centre point of the radar axes\r\n     * @param info chart rendering info.\r\n     * @param series the series within the dataset we are plotting\r\n     * @param catCount the number of categories per radar plot\r\n     * @param headH the data point height\r\n     * @param headW the data point width\r\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 40)",
        "(line 1279,col 9)-(line 1279,col 41)",
        "(line 1280,col 9)-(line 1282,col 9)",
        "(line 1285,col 9)-(line 1354,col 9)",
        "(line 1357,col 9)-(line 1357,col 45)",
        "(line 1358,col 9)-(line 1358,col 27)",
        "(line 1359,col 9)-(line 1359,col 53)",
        "(line 1360,col 9)-(line 1360,col 25)",
        "(line 1364,col 9)-(line 1370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.getPlotValue(int, int)",
      "begin_line": 1387,
      "end_line": 1396,
      "comment": "\r\n     * Returns the value to be plotted at the interseries of the \r\n     * series and the category.  This allows us to plot\r\n     * \u003ccode\u003eBY_ROW\u003c/code\u003e or \u003ccode\u003eBY_COLUMN\u003c/code\u003e which basically is just \r\n     * reversing the definition of the categories and data series being \r\n     * plotted.\r\n     * \r\n     * @param series the series to be plotted.\r\n     * @param cat the category within the series to be plotted.\r\n     * \r\n     * @return The value to be plotted (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDataExtractOrder()\r\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1388,col 28)",
        "(line 1389,col 9)-(line 1394,col 9)",
        "(line 1395,col 9)-(line 1395,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.drawLabel(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, int, double, double)",
      "begin_line": 1408,
      "end_line": 1438,
      "comment": "\r\n     * Draws the label for one axis.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area\r\n     * @param value  the value of the label (ignored).\r\n     * @param cat  the category (zero-based index).\r\n     * @param startAngle  the starting angle.\r\n     * @param extent  the extent of the arc.\r\n     ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 58)",
        "(line 1412,col 9)-(line 1412,col 28)",
        "(line 1413,col 9)-(line 1420,col 9)",
        "(line 1422,col 9)-(line 1422,col 77)",
        "(line 1423,col 9)-(line 1423,col 67)",
        "(line 1424,col 9)-(line 1424,col 39)",
        "(line 1426,col 9)-(line 1427,col 38)",
        "(line 1429,col 9)-(line 1429,col 52)",
        "(line 1431,col 9)-(line 1432,col 23)",
        "(line 1433,col 9)-(line 1433,col 37)",
        "(line 1434,col 9)-(line 1434,col 35)",
        "(line 1435,col 9)-(line 1436,col 46)",
        "(line 1437,col 9)-(line 1437,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.calculateLabelLocation(java.awt.geom.Rectangle2D, double, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1450,
      "end_line": 1479,
      "comment": "\r\n     * Returns the location for a label\r\n     * \r\n     * @param labelBounds the label bounds.\r\n     * @param ascent the ascent (height of font).\r\n     * @param plotArea the plot area\r\n     * @param startAngle the start angle for the pie series.\r\n     * \r\n     * @return The location for a label.\r\n     ",
      "child_ranges": [
        "(line 1455,col 9)-(line 1455,col 75)",
        "(line 1456,col 9)-(line 1456,col 44)",
        "(line 1458,col 9)-(line 1459,col 44)",
        "(line 1460,col 9)-(line 1461,col 44)",
        "(line 1463,col 9)-(line 1463,col 47)",
        "(line 1464,col 9)-(line 1464,col 47)",
        "(line 1466,col 9)-(line 1468,col 9)",
        "(line 1470,col 9)-(line 1472,col 9)",
        "(line 1474,col 9)-(line 1476,col 9)",
        "(line 1478,col 9)-(line 1478,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.equals(java.lang.Object)",
      "begin_line": 1488,
      "end_line": 1582,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1491,col 9)",
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1498,col 49)",
        "(line 1499,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1507,col 9)",
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1513,col 9)",
        "(line 1514,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1519,col 9)",
        "(line 1520,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1531,col 9)",
        "(line 1532,col 9)-(line 1534,col 9)",
        "(line 1535,col 9)-(line 1537,col 9)",
        "(line 1538,col 9)-(line 1540,col 9)",
        "(line 1541,col 9)-(line 1544,col 9)",
        "(line 1545,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1551,col 9)",
        "(line 1552,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1559,col 9)",
        "(line 1560,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1566,col 9)",
        "(line 1567,col 9)-(line 1569,col 9)",
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1576,col 9)",
        "(line 1577,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.clone()",
      "begin_line": 1592,
      "end_line": 1601,
      "comment": "\r\n     * Returns a clone of this plot.\r\n     * \r\n     * @return A clone of this plot.\r\n     * \r\n     * @throws CloneNotSupportedException if the plot cannot be cloned for \r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 1593,col 9)-(line 1593,col 60)",
        "(line 1594,col 9)-(line 1594,col 75)",
        "(line 1595,col 9)-(line 1595,col 73)",
        "(line 1596,col 9)-(line 1597,col 66)",
        "(line 1598,col 9)-(line 1599,col 68)",
        "(line 1600,col 9)-(line 1600,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1610,
      "end_line": 1623,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1611,col 36)",
        "(line 1613,col 9)-(line 1613,col 65)",
        "(line 1614,col 9)-(line 1614,col 61)",
        "(line 1615,col 9)-(line 1615,col 65)",
        "(line 1616,col 9)-(line 1616,col 68)",
        "(line 1617,col 9)-(line 1617,col 72)",
        "(line 1618,col 9)-(line 1618,col 70)",
        "(line 1619,col 9)-(line 1619,col 74)",
        "(line 1620,col 9)-(line 1620,col 60)",
        "(line 1621,col 9)-(line 1621,col 63)",
        "(line 1622,col 9)-(line 1622,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SpiderWebPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1633,
      "end_line": 1650,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 35)",
        "(line 1637,col 9)-(line 1637,col 65)",
        "(line 1638,col 9)-(line 1638,col 61)",
        "(line 1639,col 9)-(line 1639,col 65)",
        "(line 1640,col 9)-(line 1640,col 68)",
        "(line 1641,col 9)-(line 1641,col 72)",
        "(line 1642,col 9)-(line 1642,col 70)",
        "(line 1643,col 9)-(line 1643,col 74)",
        "(line 1644,col 9)-(line 1644,col 60)",
        "(line 1645,col 9)-(line 1645,col 63)",
        "(line 1646,col 9)-(line 1646,col 65)",
        "(line 1647,col 9)-(line 1649,col 9)"
      ]
    }
  ]
}