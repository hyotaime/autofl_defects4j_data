{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/FastScatterPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastScatterPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Zoomable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 100,
      "end_line": 1012,
      "comment": "\r\n * A fast scatter plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 107,
      "end_line": 109,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The data. "
    },
    {
      "type": "field",
      "varNames": [
        "xDataRange"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The x data range. "
    },
    {
      "type": "field",
      "varNames": [
        "yDataRange"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The y data range. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxis"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The domain axis (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxis"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The paint used to plot data points. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 151,
      "end_line": 153,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.FastScatterPlot.FastScatterPlot()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eFastScatterPlot\u003c/code\u003e with default \r\n     * axes.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.FastScatterPlot.FastScatterPlot(float[][], org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 172,
      "end_line": 203,
      "comment": "\r\n     * Creates a new fast scatter plot.\r\n     * \u003cp\u003e\r\n     * The data is an array of x, y values:  data[0][i] \u003d x, data[1][i] \u003d y.\r\n     * \r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain (x) axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rangeAxis  the range (y) axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 16)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 25)",
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 185,col 52)",
        "(line 186,col 9)-(line 186,col 37)",
        "(line 187,col 9)-(line 187,col 38)",
        "(line 188,col 9)-(line 188,col 48)",
        "(line 189,col 9)-(line 189,col 35)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 47)",
        "(line 193,col 9)-(line 193,col 31)",
        "(line 195,col 9)-(line 195,col 43)",
        "(line 196,col 9)-(line 196,col 74)",
        "(line 197,col 9)-(line 197,col 76)",
        "(line 199,col 9)-(line 199,col 42)",
        "(line 200,col 9)-(line 200,col 73)",
        "(line 201,col 9)-(line 201,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getPlotType()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns a short string describing the plot type.\r\n     *\r\n     * @return A short string describing the plot type.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getData()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the data array used by the plot.\r\n     * \r\n     * @return The data array (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setData(float[][])\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setData(float[][])",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\r\n     * Sets the data array used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param data  the data array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getData()\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getOrientation()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     * \r\n     * @return The orientation (always {@link PlotOrientation#VERTICAL}).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDomainAxis()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\r\n     * Returns the domain axis for the plot.\r\n     *\r\n     * @return The domain axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 268,
      "end_line": 274,
      "comment": "\r\n     * Sets the domain axis and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #getDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 31)",
        "(line 273,col 9)-(line 273,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getRangeAxis()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns the range axis for the plot.\r\n     *\r\n     * @return The range axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 297,
      "end_line": 303,
      "comment": "\r\n     * Sets the range axis and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #getRangeAxis()\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 30)",
        "(line 302,col 9)-(line 302,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getPaint()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\r\n     * Returns the paint used to plot data points.  The default is \r\n     * \u003ccode\u003eColor.red\u003c/code\u003e.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setPaint(java.awt.Paint)",
      "begin_line": 325,
      "end_line": 331,
      "comment": "\r\n     * Sets the color for the data points and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 27)",
        "(line 330,col 9)-(line 330,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isDomainGridlinesVisible()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and \r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 355,
      "end_line": 360,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are \r\n     * visible.  If the flag value is changed, a {@link PlotChangeEvent} is \r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDomainGridlineStroke()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the \r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 382,
      "end_line": 388,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 43)",
        "(line 387,col 9)-(line 387,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDomainGridlinePaint()",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 410,
      "end_line": 416,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isRangeGridlinesVisible()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and \r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 439,
      "end_line": 444,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines are\r\n     * visible.  If the flag value is changed, a {@link PlotChangeEvent} is \r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getRangeGridlineStroke()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 466,
      "end_line": 472,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 42)",
        "(line 471,col 9)-(line 471,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getRangeGridlinePaint()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range \r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 40)",
        "(line 499,col 9)-(line 499,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 514,
      "end_line": 561,
      "comment": "\r\n     * Draws the fast scatter plot on a Java 2D graphics device (such as the \r\n     * screen or a printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area   the area within which the plot (including axis labels)\r\n     *                   should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot (ignored).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 524,col 9)-(line 524,col 45)",
        "(line 525,col 9)-(line 525,col 26)",
        "(line 527,col 9)-(line 527,col 42)",
        "(line 528,col 9)-(line 529,col 45)",
        "(line 530,col 9)-(line 531,col 23)",
        "(line 532,col 9)-(line 532,col 56)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 539,col 9)-(line 539,col 37)",
        "(line 541,col 9)-(line 542,col 80)",
        "(line 543,col 9)-(line 544,col 58)",
        "(line 545,col 9)-(line 545,col 70)",
        "(line 546,col 9)-(line 546,col 68)",
        "(line 548,col 9)-(line 548,col 42)",
        "(line 549,col 9)-(line 549,col 56)",
        "(line 551,col 9)-(line 551,col 26)",
        "(line 552,col 9)-(line 553,col 39)",
        "(line 555,col 9)-(line 555,col 41)",
        "(line 557,col 9)-(line 557,col 33)",
        "(line 558,col 9)-(line 558,col 43)",
        "(line 559,col 9)-(line 559,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 574,
      "end_line": 613,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region.  The \r\n     * \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 32)",
        "(line 595,col 9)-(line 608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 622,
      "end_line": 639,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 648,
      "end_line": 666,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 664,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 677,
      "end_line": 686,
      "comment": "\r\n     * Returns the range of data values to be plotted along the axis, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if the specified axis isn\u0027t the domain axis or the\r\n     * range axis for the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 28)",
        "(line 679,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.calculateXDataRange(float[][])",
      "begin_line": 695,
      "end_line": 718,
      "comment": "\r\n     * Calculates the X data range.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 28)",
        "(line 699,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.calculateYDataRange(float[][])",
      "begin_line": 727,
      "end_line": 749,
      "comment": "\r\n     * Calculates the Y data range.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 28)",
        "(line 731,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 758,
      "end_line": 761,
      "comment": "\r\n     * Multiplies the range on the domain axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 775,
      "end_line": 790,
      "comment": "\r\n     * Multiplies the range on the domain axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 788,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 802,
      "end_line": 805,
      "comment": "\r\n     * Zooms in on the domain axes.\r\n     * \r\n     * @param lowerPercent  the new lower bound as a percentage of the current \r\n     *                      range.\r\n     * @param upperPercent  the new upper bound as a percentage of the current\r\n     *                      range.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 814,
      "end_line": 817,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 831,
      "end_line": 846,
      "comment": "\r\n     * Multiplies the range on the range axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 858,
      "end_line": 861,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     * \r\n     * @param lowerPercent  the new lower bound as a percentage of the current \r\n     *                      range.\r\n     * @param upperPercent  the new upper bound as a percentage of the current \r\n     *                      range.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isDomainZoomable()",
      "begin_line": 868,
      "end_line": 870,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.isRangeZoomable()",
      "begin_line": 877,
      "end_line": 879,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.equals(java.lang.Object)",
      "begin_line": 888,
      "end_line": 934,
      "comment": "\r\n     * Tests an object for equality with this instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 53)",
        "(line 899,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.clone()",
      "begin_line": 944,
      "end_line": 966,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the plot does \r\n     *                                    not support cloning.\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 64)",
        "(line 948,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 956,col 9)",
        "(line 958,col 9)-(line 962,col 9)",
        "(line 964,col 9)-(line 964,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 975,
      "end_line": 982,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 36)",
        "(line 977,col 9)-(line 977,col 55)",
        "(line 978,col 9)-(line 978,col 71)",
        "(line 979,col 9)-(line 979,col 69)",
        "(line 980,col 9)-(line 980,col 70)",
        "(line 981,col 9)-(line 981,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.FastScatterPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 992,
      "end_line": 1010,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 35)",
        "(line 996,col 9)-(line 996,col 55)",
        "(line 997,col 9)-(line 997,col 71)",
        "(line 998,col 9)-(line 998,col 69)",
        "(line 1000,col 9)-(line 1000,col 70)",
        "(line 1001,col 9)-(line 1001,col 68)",
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1009,col 9)"
      ]
    }
  ]
}