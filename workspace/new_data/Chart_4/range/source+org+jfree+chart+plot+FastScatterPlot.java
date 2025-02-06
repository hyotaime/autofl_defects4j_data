{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/FastScatterPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastScatterPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Pannable",
        "org.jfree.chart.plot.Zoomable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 105,
      "end_line": 1132,
      "comment": "\r\n * A fast scatter plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 112,
      "end_line": 114,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The data. "
    },
    {
      "type": "field",
      "varNames": [
        "xDataRange"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The x data range. "
    },
    {
      "type": "field",
      "varNames": [
        "yDataRange"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The y data range. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxis"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The domain axis (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxis"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The paint used to plot data points. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainPannable"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the domain\r\n     * axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangePannable"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the range\r\n     * axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 172,
      "end_line": 174,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.FastScatterPlot.FastScatterPlot()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eFastScatterPlot\u003c/code\u003e with default\r\n     * axes.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.FastScatterPlot.FastScatterPlot(float[][], org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 193,
      "end_line": 224,
      "comment": "\r\n     * Creates a new fast scatter plot.\r\n     * \u003cp\u003e\r\n     * The data is an array of x, y values:  data[0][i] \u003d x, data[1][i] \u003d y.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain (x) axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rangeAxis  the range (y) axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 16)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 25)",
        "(line 205,col 9)-(line 205,col 52)",
        "(line 206,col 9)-(line 206,col 52)",
        "(line 207,col 9)-(line 207,col 37)",
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 209,col 48)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 211,col 37)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 214,col 9)-(line 214,col 31)",
        "(line 216,col 9)-(line 216,col 43)",
        "(line 217,col 9)-(line 217,col 74)",
        "(line 218,col 9)-(line 218,col 76)",
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 73)",
        "(line 222,col 9)-(line 222,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getPlotType()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns a short string describing the plot type.\r\n     *\r\n     * @return A short string describing the plot type.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getData()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the data array used by the plot.\r\n     *\r\n     * @return The data array (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setData(float[][])\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setData(float[][])",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\r\n     * Sets the data array used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param data  the data array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getData()\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 25)",
        "(line 256,col 9)-(line 256,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getOrientation()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (always {@link PlotOrientation#VERTICAL}).\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDomainAxis()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Returns the domain axis for the plot.\r\n     *\r\n     * @return The domain axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 289,
      "end_line": 295,
      "comment": "\r\n     * Sets the domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #getDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 31)",
        "(line 294,col 9)-(line 294,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getRangeAxis()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\r\n     * Returns the range axis for the plot.\r\n     *\r\n     * @return The range axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 318,
      "end_line": 324,
      "comment": "\r\n     * Sets the range axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     *\r\n     * @see #getRangeAxis()\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 30)",
        "(line 323,col 9)-(line 323,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getPaint()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Returns the paint used to plot data points.  The default is\r\n     * \u003ccode\u003eColor.red\u003c/code\u003e.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setPaint(java.awt.Paint)",
      "begin_line": 346,
      "end_line": 352,
      "comment": "\r\n     * Sets the color for the data points and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 27)",
        "(line 351,col 9)-(line 351,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isDomainGridlinesVisible()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 376,
      "end_line": 381,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are\r\n     * visible.  If the flag value is changed, a {@link PlotChangeEvent} is\r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDomainGridlineStroke()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 403,
      "end_line": 409,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 43)",
        "(line 408,col 9)-(line 408,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDomainGridlinePaint()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 41)",
        "(line 436,col 9)-(line 436,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isRangeGridlinesVisible()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 460,
      "end_line": 465,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines are\r\n     * visible.  If the flag value is changed, a {@link PlotChangeEvent} is\r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getRangeGridlineStroke()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 42)",
        "(line 492,col 9)-(line 492,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getRangeGridlinePaint()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 515,
      "end_line": 521,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 40)",
        "(line 520,col 9)-(line 520,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 535,
      "end_line": 582,
      "comment": "\r\n     * Draws the fast scatter plot on a Java 2D graphics device (such as the\r\n     * screen or a printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area   the area within which the plot (including axis labels)\r\n     *                   should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot (ignored).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 545,col 9)-(line 545,col 45)",
        "(line 546,col 9)-(line 546,col 26)",
        "(line 548,col 9)-(line 548,col 42)",
        "(line 549,col 9)-(line 550,col 45)",
        "(line 551,col 9)-(line 552,col 23)",
        "(line 553,col 9)-(line 553,col 56)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 560,col 9)-(line 560,col 37)",
        "(line 562,col 9)-(line 563,col 80)",
        "(line 564,col 9)-(line 565,col 58)",
        "(line 566,col 9)-(line 566,col 70)",
        "(line 567,col 9)-(line 567,col 68)",
        "(line 569,col 9)-(line 569,col 42)",
        "(line 570,col 9)-(line 570,col 56)",
        "(line 572,col 9)-(line 572,col 26)",
        "(line 573,col 9)-(line 574,col 39)",
        "(line 576,col 9)-(line 576,col 41)",
        "(line 578,col 9)-(line 578,col 33)",
        "(line 579,col 9)-(line 579,col 43)",
        "(line 580,col 9)-(line 580,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 595,
      "end_line": 634,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region.  The\r\n     * \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 32)",
        "(line 616,col 9)-(line 629,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 643,
      "end_line": 660,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 669,
      "end_line": 687,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 685,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 698,
      "end_line": 707,
      "comment": "\r\n     * Returns the range of data values to be plotted along the axis, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if the specified axis isn\u0027t the domain axis or the\r\n     * range axis for the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 28)",
        "(line 700,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.calculateXDataRange(float[][])",
      "begin_line": 716,
      "end_line": 739,
      "comment": "\r\n     * Calculates the X data range.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 28)",
        "(line 720,col 9)-(line 735,col 9)",
        "(line 737,col 9)-(line 737,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.calculateYDataRange(float[][])",
      "begin_line": 748,
      "end_line": 770,
      "comment": "\r\n     * Calculates the Y data range.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 28)",
        "(line 752,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 779,
      "end_line": 782,
      "comment": "\r\n     * Multiplies the range on the domain axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 796,
      "end_line": 811,
      "comment": "\r\n     * Multiplies the range on the domain axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 809,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 823,
      "end_line": 826,
      "comment": "\r\n     * Zooms in on the domain axes.\r\n     *\r\n     * @param lowerPercent  the new lower bound as a percentage of the current\r\n     *                      range.\r\n     * @param upperPercent  the new upper bound as a percentage of the current\r\n     *                      range.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 835,
      "end_line": 838,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 852,
      "end_line": 867,
      "comment": "\r\n     * Multiplies the range on the range axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 865,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 879,
      "end_line": 882,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the new lower bound as a percentage of the current\r\n     *                      range.\r\n     * @param upperPercent  the new upper bound as a percentage of the current\r\n     *                      range.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isDomainZoomable()",
      "begin_line": 889,
      "end_line": 891,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isRangeZoomable()",
      "begin_line": 898,
      "end_line": 900,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isDomainPannable()",
      "begin_line": 910,
      "end_line": 912,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the domain axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainPannable(boolean)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along the\r\n     * domain axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isRangePannable()",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the range axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangePannable(boolean)",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along\r\n     * the range axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 959,
      "end_line": 971,
      "comment": "\r\n     * Pans the domain axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 63)",
        "(line 965,col 9)-(line 965,col 39)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 970,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 982,
      "end_line": 994,
      "comment": "\r\n     * Pans the range axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 62)",
        "(line 988,col 9)-(line 988,col 38)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 993,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.equals(java.lang.Object)",
      "begin_line": 1006,
      "end_line": 1058,
      "comment": "\r\n     * Tests an arbitrary object for equality with this plot.  Note that\r\n     * \u003ccode\u003eFastScatterPlot\u003c/code\u003e carries its data around with it (rather\r\n     * than referencing a dataset), and the data is included in the\r\n     * equality test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 53)",
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1041,col 9)",
        "(line 1042,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1057,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.clone()",
      "begin_line": 1068,
      "end_line": 1086,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does\r\n     *                                    not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1070,col 9)-(line 1070,col 64)",
        "(line 1071,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1078,col 9)",
        "(line 1079,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1095,
      "end_line": 1102,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 36)",
        "(line 1097,col 9)-(line 1097,col 55)",
        "(line 1098,col 9)-(line 1098,col 71)",
        "(line 1099,col 9)-(line 1099,col 69)",
        "(line 1100,col 9)-(line 1100,col 70)",
        "(line 1101,col 9)-(line 1101,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1112,
      "end_line": 1130,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 35)",
        "(line 1116,col 9)-(line 1116,col 55)",
        "(line 1117,col 9)-(line 1117,col 71)",
        "(line 1118,col 9)-(line 1118,col 69)",
        "(line 1120,col 9)-(line 1120,col 70)",
        "(line 1121,col 9)-(line 1121,col 68)",
        "(line 1123,col 9)-(line 1125,col 9)",
        "(line 1127,col 9)-(line 1129,col 9)"
      ]
    }
  ]
}