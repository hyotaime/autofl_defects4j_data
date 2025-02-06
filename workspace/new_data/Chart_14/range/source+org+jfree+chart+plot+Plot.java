{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/Plot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Plot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.AxisChangeListener",
        "org.jfree.data.general.DatasetChangeListener",
        "org.jfree.chart.event.MarkerChangeListener",
        "org.jfree.chart.LegendItemSource",
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 183,
      "end_line": 1423,
      "comment": "\r\n * The base class for all plots in JFreeChart.  The \r\n * {@link org.jfree.chart.JFreeChart} class delegates the drawing of axes and \r\n * data to the plot.  This base class provides facilities common to most plot \r\n * types.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Useful constant representing zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INSETS"
      ],
      "begin_line": 194,
      "end_line": 195,
      "comment": " The default insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The default outline color. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FOREGROUND_ALPHA"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The default foreground alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_ALPHA"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " The default background alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_PAINT"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " The default background color. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_WIDTH_TO_DRAW"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The minimum width at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_HEIGHT_TO_DRAW"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The minimum height at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_BOX"
      ],
      "begin_line": 219,
      "end_line": 220,
      "comment": " A default box shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_CIRCLE"
      ],
      "begin_line": 223,
      "end_line": 224,
      "comment": " A default circle shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " The parent plot (\u003ccode\u003enull\u003c/code\u003e if this is the root plot). "
    },
    {
      "type": "field",
      "varNames": [
        "datasetGroup"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " The dataset group (to be used for thread synchronisation). "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessage"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The message to display if no data is available. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessageFont"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " The font used to display the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessagePaint"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " The paint used to draw the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " Amount of blank space around the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineVisible"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " \r\n     * A flag that controls whether or not the plot outline is drawn. \r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " The Stroke used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " The Paint used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " An optional color used to fill the plot background. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImage"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " not currently serialized"
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlignment"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " The alignment for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlpha"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " The alpha value used to draw the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAlpha"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " The alpha-transparency for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAlpha"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " The alpha transparency for the background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawingSupplier"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " The drawing supplier. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Plot.Plot()",
      "begin_line": 284,
      "end_line": 304,
      "comment": "\r\n     * Creates a new plot.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 27)",
        "(line 287,col 9)-(line 287,col 37)",
        "(line 288,col 9)-(line 288,col 56)",
        "(line 289,col 9)-(line 289,col 56)",
        "(line 290,col 9)-(line 290,col 36)",
        "(line 291,col 9)-(line 291,col 35)",
        "(line 292,col 9)-(line 292,col 52)",
        "(line 293,col 9)-(line 293,col 50)",
        "(line 294,col 9)-(line 294,col 56)",
        "(line 296,col 9)-(line 296,col 34)",
        "(line 297,col 9)-(line 297,col 71)",
        "(line 298,col 9)-(line 298,col 46)",
        "(line 300,col 9)-(line 300,col 60)",
        "(line 302,col 9)-(line 302,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDatasetGroup()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\r\n     * Returns the dataset group for the plot (not currently used).\r\n     *\r\n     * @return The dataset group.\r\n     * \r\n     * @see #setDatasetGroup(DatasetGroup)\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDatasetGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Sets the dataset group (not currently used).\r\n     *\r\n     * @param group  the dataset group (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDatasetGroup()\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessage()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\r\n     * Returns the string that is displayed when the dataset is empty or \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The \u0027no data\u0027 message (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setNoDataMessage(String)\r\n     * @see #getNoDataMessageFont()\r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessage(java.lang.String)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\r\n     * Sets the message that is displayed when the dataset is empty or \r\n     * \u003ccode\u003enull\u003c/code\u003e, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param message  the message (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 37)",
        "(line 353,col 9)-(line 353,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessageFont()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\r\n     * Returns the font used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNoDataMessageFont(Font)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessageFont(java.awt.Font)",
      "begin_line": 376,
      "end_line": 382,
      "comment": "\r\n     * Sets the font used to display the \u0027no data\u0027 message and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getNoDataMessageFont()\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 38)",
        "(line 381,col 9)-(line 381,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessagePaint()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\r\n     * Returns the paint used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNoDataMessagePaint(Paint)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessagePaint(java.awt.Paint)",
      "begin_line": 404,
      "end_line": 410,
      "comment": "\r\n     * Sets the paint used to display the \u0027no data\u0027 message and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 40)",
        "(line 409,col 9)-(line 409,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getPlotType()",
      "begin_line": 421,
      "end_line": 421,
      "comment": "\r\n     * Returns a short string describing the plot type.\r\n     * \u003cP\u003e\r\n     * Note: this gets used in the chart property editing user interface,\r\n     * but there needs to be a better mechanism for identifying the plot type.\r\n     *\r\n     * @return A short string describing the plot type (never \r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getParent()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns the parent plot (or \u003ccode\u003enull\u003c/code\u003e if this plot is not part \r\n     * of a combined plot).\r\n     *\r\n     * @return The parent plot.\r\n     * \r\n     * @see #setParent(Plot)\r\n     * @see #getRootPlot()\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setParent(org.jfree.chart.plot.Plot)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\r\n     * Sets the parent plot.  This method is intended for internal use, you \r\n     * shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param parent  the parent plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRootPlot()",
      "begin_line": 455,
      "end_line": 465,
      "comment": "\r\n     * Returns the root plot.\r\n     *\r\n     * @return The root plot.\r\n     * \r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 29)",
        "(line 458,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isSubplot()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot \r\n     * structure (that is, {@link #getParent()} returns a non-\u003ccode\u003enull\u003c/code\u003e\r\n     * value), and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot \r\n     *         structure.\r\n     *         \r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getInsets()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Returns the insets for the plot area.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\r\n     * Sets the insets for the plot and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets, boolean)\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets, boolean)",
      "begin_line": 516,
      "end_line": 527,
      "comment": "\r\n     * Sets the insets for the plot and, if requested,  and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether the registered listeners are\r\n     *                notified.\r\n     *                \r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundPaint()",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\r\n     * Returns the background color of the plot area.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 548,
      "end_line": 566,
      "comment": "\r\n     * Sets the background color of the plot area and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundAlpha()",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\r\n     * Returns the alpha transparency of the plot area background.\r\n     *\r\n     * @return The alpha transparency.\r\n     * \r\n     * @see #setBackgroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundAlpha(float)",
      "begin_line": 587,
      "end_line": 592,
      "comment": "\r\n     * Sets the alpha transparency of the plot area background, and notifies\r\n     * registered listeners that the plot has been modified.\r\n     *\r\n     * @param alpha the new alpha value (in the range 0.0f to 1.0f).\r\n     * \r\n     * @see #getBackgroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDrawingSupplier()",
      "begin_line": 601,
      "end_line": 611,
      "comment": "\r\n     * Returns the drawing supplier for the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDrawingSupplier(DrawingSupplier)\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 38)",
        "(line 603,col 9)-(line 603,col 29)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier)",
      "begin_line": 623,
      "end_line": 626,
      "comment": "\r\n     * Sets the drawing supplier for the plot.  The drawing supplier is \r\n     * responsible for supplying a limitless (possibly repeating) sequence of \r\n     * \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and \u003ccode\u003eShape\u003c/code\u003e objects \r\n     * that the plot\u0027s renderer(s) can use to populate its (their) tables.\r\n     *\r\n     * @param supplier  the new supplier.\r\n     * \r\n     * @see #getDrawingSupplier()\r\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 40)",
        "(line 625,col 9)-(line 625,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImage()",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\r\n     * Returns the background image that is used to fill the plot\u0027s background \r\n     * area.\r\n     *\r\n     * @return The image (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBackgroundImage(Image)\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImage(java.awt.Image)",
      "begin_line": 648,
      "end_line": 651,
      "comment": "\r\n     * Sets the background image for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBackgroundImage()\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 37)",
        "(line 650,col 9)-(line 650,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlignment()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\r\n     * Returns the background image alignment. Alignment constants are defined \r\n     * in the {@link Align} class.\r\n     *\r\n     * @return The alignment.\r\n     * \r\n     * @see #setBackgroundImageAlignment(int)\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlignment(int)",
      "begin_line": 674,
      "end_line": 679,
      "comment": "\r\n     * Sets the alignment for the background image and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  Alignment options \r\n     * are defined by the {@link Align} class.\r\n     *\r\n     * @param alignment  the alignment.\r\n     * \r\n     * @see #getBackgroundImageAlignment()\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlpha()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\r\n     * Returns the alpha transparency used to draw the background image.  This\r\n     * is a value in the range 0.0f to 1.0f, where 0.0f is fully transparent\r\n     * and 1.0f is fully opaque.\r\n     * \r\n     * @return The alpha transparency.\r\n     * \r\n     * @see #setBackgroundImageAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlpha(float)",
      "begin_line": 705,
      "end_line": 713,
      "comment": "\r\n     * Sets the alpha transparency used when drawing the background image.\r\n     * \r\n     * @param alpha  the alpha transparency (in the range 0.0f to 1.0f, where\r\n     *     0.0f is fully transparent, and 1.0f is fully opaque).\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not within\r\n     *     the specified range.\r\n     *     \r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 76)",
        "(line 709,col 9)-(line 712,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isOutlineVisible()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\r\n     * Returns the flag that controls whether or not the plot outline is\r\n     * drawn.  The default value is \u003ccode\u003etrue\u003c/code\u003e.  Note that for \r\n     * historical reasons, the plot\u0027s outline paint and stroke can take on\r\n     * \u003ccode\u003enull\u003c/code\u003e values, in which case the outline will not be drawn\r\n     * even if this flag is set to \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return The outline visibility flag.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineVisible(boolean)",
      "begin_line": 742,
      "end_line": 745,
      "comment": "\r\n     * Sets the flag that controls whether or not the plot\u0027s outline is\r\n     * drawn, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #isOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 38)",
        "(line 744,col 9)-(line 744,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlineStroke()",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\r\n     * Returns the stroke used to outline the plot area.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 767,
      "end_line": 783,
      "comment": "\r\n     * Sets the stroke used to outline the plot area and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners. If you set this \r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 782,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlinePaint()",
      "begin_line": 792,
      "end_line": 794,
      "comment": "\r\n     * Returns the color used to draw the outline of the plot area.\r\n     *\r\n     * @return The color (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlinePaint(java.awt.Paint)",
      "begin_line": 805,
      "end_line": 821,
      "comment": "\r\n     * Sets the paint used to draw the outline of the plot area and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  If you set this \r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 820,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getForegroundAlpha()",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\r\n     * Returns the alpha-transparency for the plot foreground.\r\n     *\r\n     * @return The alpha-transparency.\r\n     * \r\n     * @see #setForegroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setForegroundAlpha(float)",
      "begin_line": 842,
      "end_line": 847,
      "comment": "\r\n     * Sets the alpha-transparency for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param alpha  the new alpha transparency.\r\n     * \r\n     * @see #getForegroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getLegendItems()",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method returns \r\n     * \u003ccode\u003enull\u003c/code\u003e.  Subclasses should override to return a \r\n     * {@link LegendItemCollection}.\r\n     *\r\n     * @return The legend items for the plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.addChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 867,
      "end_line": 869,
      "comment": "\r\n     * Registers an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be registered.\r\n     * \r\n     * @see #removeChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.removeChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 878,
      "end_line": 880,
      "comment": "\r\n     * Unregisters an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be unregistered.\r\n     * \r\n     * @see #addChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.notifyListeners(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 887,
      "end_line": 894,
      "comment": "\r\n     * Notifies all registered listeners that the plot has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 65)",
        "(line 889,col 9)-(line 893,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fireChangeEvent()",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\r\n     * Sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 919,
      "end_line": 923,
      "comment": "\r\n     * Draws the plot within the specified area.  The anchor is a point on the\r\n     * chart that is specified externally (for instance, it may be the last\r\n     * point of the last mouse click performed by the user) - plots can use or\r\n     * ignore this value as they see fit. \r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Subclasses need to provide an implementation of this method, obviously.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the parent state (if any).\r\n     * @param info  carries back plot rendering info.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 935,
      "end_line": 940,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is \r\n     * declared public so that it can be accessed by the renderers used by \r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 33)",
        "(line 939,col 9)-(line 939,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "\r\n     * Fills the specified area with the background paint.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #getBackgroundPaint()\r\n     * @see #getBackgroundAlpha()\r\n     * @see #fillBackground(Graphics2D, Rectangle2D, PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 968,
      "end_line": 998,
      "comment": "\r\n     * Fills the specified area with the background paint.  If the background\r\n     * paint is an instance of \u003ccode\u003eGradientPaint\u003c/code\u003e, the gradient will\r\n     * run in the direction suggested by the plot\u0027s orientation.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param area  the plot area.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 975,col 9)",
        "(line 976,col 9)-(line 976,col 39)",
        "(line 977,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 56)",
        "(line 993,col 9)-(line 994,col 39)",
        "(line 995,col 9)-(line 995,col 23)",
        "(line 996,col 9)-(line 996,col 22)",
        "(line 997,col 9)-(line 997,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackgroundImage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1011,
      "end_line": 1025,
      "comment": "\r\n     * Draws the background image (if there is one) aligned within the \r\n     * specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #getBackgroundImage()\r\n     * @see #getBackgroundImageAlignment()\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1024,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawOutline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1036,
      "end_line": 1045,
      "comment": "\r\n     * Draws the plot outline.  This method will be called during the chart \r\n     * drawing process and is declared public so that it can be accessed by the\r\n     * renderers used by certain subclasses. You shouldn\u0027t need to call this \r\n     * method directly.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1044,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawNoDataMessage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1053,
      "end_line": 1068,
      "comment": "\r\n     * Draws a message to state that there is no data to plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 39)",
        "(line 1055,col 9)-(line 1055,col 22)",
        "(line 1056,col 9)-(line 1056,col 44)",
        "(line 1057,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.  Since the plot does not maintain any\r\n     * information about where it has been drawn, the plot rendering info is \r\n     * supplied as an argument.\r\n     *\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param info  an object containing information about the dimensions of \r\n     *              the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.zoom(double)",
      "begin_line": 1090,
      "end_line": 1092,
      "comment": "\r\n     * Performs a zoom on the plot.  Subclasses should override if zooming is \r\n     * appropriate for the type of plot.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.axisChanged(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1099,
      "end_line": 1101,
      "comment": "\r\n     * Receives notification of a change to one of the plot\u0027s axes.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1111,
      "end_line": 1115,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The plot reacts by passing on a plot change event to all registered \r\n     * listeners.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 61)",
        "(line 1113,col 9)-(line 1113,col 63)",
        "(line 1114,col 9)-(line 1114,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.markerChanged(org.jfree.chart.event.MarkerChangeEvent)",
      "begin_line": 1125,
      "end_line": 1127,
      "comment": "\r\n     * Receives notification of a change to a marker that is assigned to the\r\n     * plot.\r\n     * \r\n     * @param event  the event.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectX(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1139,
      "end_line": 1151,
      "comment": "\r\n     * Adjusts the supplied x-value.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param w1  width 1.\r\n     * @param w2  width 2.\r\n     * @param edge  the edge (left or right).\r\n     *\r\n     * @return The adjusted x-value.\r\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 26)",
        "(line 1143,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectY(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1163,
      "end_line": 1175,
      "comment": "\r\n     * Adjusts the supplied y-value.\r\n     *\r\n     * @param y  the x-value.\r\n     * @param h1  height 1.\r\n     * @param h2  height 2.\r\n     * @param edge  the edge (top or bottom).\r\n     *\r\n     * @return The adjusted y-value.\r\n     ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 26)",
        "(line 1167,col 9)-(line 1172,col 9)",
        "(line 1173,col 9)-(line 1173,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.equals(java.lang.Object)",
      "begin_line": 1184,
      "end_line": 1239,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 31)",
        "(line 1192,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1210,col 9)-(line 1212,col 9)",
        "(line 1213,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1222,col 9)",
        "(line 1223,col 9)-(line 1225,col 9)",
        "(line 1226,col 9)-(line 1228,col 9)",
        "(line 1229,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1238,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.clone()",
      "begin_line": 1249,
      "end_line": 1263,
      "comment": "\r\n     * Creates a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does not\r\n     *         support cloning.\r\n     ",
      "child_ranges": [
        "(line 1251,col 9)-(line 1251,col 42)",
        "(line 1254,col 9)-(line 1257,col 9)",
        "(line 1258,col 9)-(line 1259,col 76)",
        "(line 1260,col 9)-(line 1260,col 53)",
        "(line 1261,col 9)-(line 1261,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1272,
      "end_line": 1279,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 36)",
        "(line 1274,col 9)-(line 1274,col 68)",
        "(line 1275,col 9)-(line 1275,col 64)",
        "(line 1276,col 9)-(line 1276,col 62)",
        "(line 1278,col 9)-(line 1278,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1289,
      "end_line": 1300,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1291,col 35)",
        "(line 1292,col 9)-(line 1292,col 68)",
        "(line 1293,col 9)-(line 1293,col 64)",
        "(line 1294,col 9)-(line 1294,col 62)",
        "(line 1296,col 9)-(line 1296,col 65)",
        "(line 1298,col 9)-(line 1298,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveDomainAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1310,
      "end_line": 1360,
      "comment": "\r\n     * Resolves a domain axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1315,col 9)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1320,col 9)-(line 1320,col 36)",
        "(line 1322,col 9)-(line 1353,col 9)",
        "(line 1355,col 9)-(line 1357,col 9)",
        "(line 1358,col 9)-(line 1358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveRangeAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1370,
      "end_line": 1421,
      "comment": "\r\n     * Resolves a range axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1378,col 9)",
        "(line 1380,col 9)-(line 1380,col 36)",
        "(line 1382,col 9)-(line 1413,col 9)",
        "(line 1416,col 9)-(line 1418,col 9)",
        "(line 1419,col 9)-(line 1419,col 22)"
      ]
    }
  ]
}