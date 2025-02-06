{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/Plot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Plot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.AxisChangeListener",
        "org.jfree.data.event.DatasetChangeListener",
        "org.jfree.chart.event.AnnotationChangeListener",
        "org.jfree.chart.event.MarkerChangeListener",
        "org.jfree.chart.LegendItemSource",
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 195,
      "end_line": 1550,
      "comment": "\r\n * The base class for all plots in JFreeChart.  The {@link JFreeChart} class\r\n * delegates the drawing of axes and data to the plot.  This base class\r\n * provides facilities common to most plot types.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Useful constant representing zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INSETS"
      ],
      "begin_line": 206,
      "end_line": 207,
      "comment": " The default insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 210,
      "end_line": 211,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " The default outline color. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FOREGROUND_ALPHA"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The default foreground alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_ALPHA"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " The default background alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_PAINT"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " The default background color. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_WIDTH_TO_DRAW"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " The minimum width at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_HEIGHT_TO_DRAW"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The minimum height at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_BOX"
      ],
      "begin_line": 232,
      "end_line": 233,
      "comment": " A default box shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_CIRCLE"
      ],
      "begin_line": 236,
      "end_line": 237,
      "comment": " A default circle shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " The parent plot (\u003ccode\u003enull\u003c/code\u003e if this is the root plot). "
    },
    {
      "type": "field",
      "varNames": [
        "datasetGroup"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " The dataset group (to be used for thread synchronisation). "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessage"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " The message to display if no data is available. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessageFont"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " The font used to display the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessagePaint"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " The paint used to draw the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " Amount of blank space around the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineVisible"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": "\r\n     * A flag that controls whether or not the plot outline is drawn.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " The Stroke used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " The Paint used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " An optional color used to fill the plot background. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImage"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " not currently serialized"
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlignment"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " The alignment for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlpha"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " The alpha value used to draw the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAlpha"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " The alpha-transparency for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAlpha"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The alpha transparency for the background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawingSupplier"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The drawing supplier. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": "\r\n     * A flag that controls whether or not the plot will notify listeners\r\n     * of changes (defaults to true, but sometimes it is useful to disable\r\n     * this).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Plot.Plot()",
      "begin_line": 306,
      "end_line": 327,
      "comment": "\r\n     * Creates a new plot.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 27)",
        "(line 309,col 9)-(line 309,col 37)",
        "(line 310,col 9)-(line 310,col 56)",
        "(line 311,col 9)-(line 311,col 56)",
        "(line 312,col 9)-(line 312,col 36)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 52)",
        "(line 315,col 9)-(line 315,col 50)",
        "(line 316,col 9)-(line 316,col 56)",
        "(line 318,col 9)-(line 318,col 34)",
        "(line 319,col 9)-(line 319,col 68)",
        "(line 320,col 9)-(line 320,col 46)",
        "(line 322,col 9)-(line 322,col 60)",
        "(line 324,col 9)-(line 324,col 27)",
        "(line 325,col 9)-(line 325,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDatasetGroup()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\r\n     * Returns the dataset group for the plot (not currently used).\r\n     *\r\n     * @return The dataset group.\r\n     *\r\n     * @see #setDatasetGroup(DatasetGroup)\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDatasetGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Sets the dataset group (not currently used).\r\n     *\r\n     * @param group  the dataset group (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDatasetGroup()\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessage()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\r\n     * Returns the string that is displayed when the dataset is empty or\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The \u0027no data\u0027 message (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setNoDataMessage(String)\r\n     * @see #getNoDataMessageFont()\r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessage(java.lang.String)",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\r\n     * Sets the message that is displayed when the dataset is empty or\r\n     * \u003ccode\u003enull\u003c/code\u003e, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param message  the message (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 37)",
        "(line 376,col 9)-(line 376,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessageFont()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\r\n     * Returns the font used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNoDataMessageFont(Font)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessageFont(java.awt.Font)",
      "begin_line": 399,
      "end_line": 405,
      "comment": "\r\n     * Sets the font used to display the \u0027no data\u0027 message and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getNoDataMessageFont()\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessagePaint()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\r\n     * Returns the paint used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNoDataMessagePaint(Paint)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessagePaint(java.awt.Paint)",
      "begin_line": 427,
      "end_line": 433,
      "comment": "\r\n     * Sets the paint used to display the \u0027no data\u0027 message and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 40)",
        "(line 432,col 9)-(line 432,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getPlotType()",
      "begin_line": 444,
      "end_line": 444,
      "comment": "\r\n     * Returns a short string describing the plot type.\r\n     * \u003cP\u003e\r\n     * Note: this gets used in the chart property editing user interface,\r\n     * but there needs to be a better mechanism for identifying the plot type.\r\n     *\r\n     * @return A short string describing the plot type (never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getParent()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\r\n     * Returns the parent plot (or \u003ccode\u003enull\u003c/code\u003e if this plot is not part\r\n     * of a combined plot).\r\n     *\r\n     * @return The parent plot.\r\n     *\r\n     * @see #setParent(Plot)\r\n     * @see #getRootPlot()\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setParent(org.jfree.chart.plot.Plot)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\r\n     * Sets the parent plot.  This method is intended for internal use, you\r\n     * shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param parent  the parent plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRootPlot()",
      "begin_line": 478,
      "end_line": 488,
      "comment": "\r\n     * Returns the root plot.\r\n     *\r\n     * @return The root plot.\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 29)",
        "(line 481,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isSubplot()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot\r\n     * structure (that is, {@link #getParent()} returns a non-\u003ccode\u003enull\u003c/code\u003e\r\n     * value), and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot\r\n     *         structure.\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getInsets()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\r\n     * Returns the insets for the plot area.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\r\n     * Sets the insets for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets, boolean)\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets, boolean)",
      "begin_line": 539,
      "end_line": 550,
      "comment": "\r\n     * Sets the insets for the plot and, if requested,  and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether the registered listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundPaint()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\r\n     * Returns the background color of the plot area.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 571,
      "end_line": 589,
      "comment": "\r\n     * Sets the background color of the plot area and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundAlpha()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\r\n     * Returns the alpha transparency of the plot area background.\r\n     *\r\n     * @return The alpha transparency.\r\n     *\r\n     * @see #setBackgroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundAlpha(float)",
      "begin_line": 610,
      "end_line": 615,
      "comment": "\r\n     * Sets the alpha transparency of the plot area background, and notifies\r\n     * registered listeners that the plot has been modified.\r\n     *\r\n     * @param alpha the new alpha value (in the range 0.0f to 1.0f).\r\n     *\r\n     * @see #getBackgroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDrawingSupplier()",
      "begin_line": 624,
      "end_line": 634,
      "comment": "\r\n     * Returns the drawing supplier for the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDrawingSupplier(DrawingSupplier)\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 38)",
        "(line 626,col 9)-(line 626,col 29)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier)",
      "begin_line": 648,
      "end_line": 651,
      "comment": "\r\n     * Sets the drawing supplier for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  The drawing\r\n     * supplier is responsible for supplying a limitless (possibly repeating)\r\n     * sequence of \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and\r\n     * \u003ccode\u003eShape\u003c/code\u003e objects that the plot\u0027s renderer(s) can use to\r\n     * populate its (their) tables.\r\n     *\r\n     * @param supplier  the new supplier.\r\n     *\r\n     * @see #getDrawingSupplier()\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 40)",
        "(line 650,col 9)-(line 650,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier, boolean)",
      "begin_line": 668,
      "end_line": 673,
      "comment": "\r\n     * Sets the drawing supplier for the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  The drawing\r\n     * supplier is responsible for supplying a limitless (possibly repeating)\r\n     * sequence of \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and\r\n     * \u003ccode\u003eShape\u003c/code\u003e objects that the plot\u0027s renderer(s) can use to\r\n     * populate its (their) tables.\r\n     *\r\n     * @param supplier  the new supplier.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDrawingSupplier()\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 40)",
        "(line 670,col 9)-(line 672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImage()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\r\n     * Returns the background image that is used to fill the plot\u0027s background\r\n     * area.\r\n     *\r\n     * @return The image (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundImage(Image)\r\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImage(java.awt.Image)",
      "begin_line": 695,
      "end_line": 698,
      "comment": "\r\n     * Sets the background image for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundImage()\r\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 37)",
        "(line 697,col 9)-(line 697,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlignment()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\r\n     * Returns the background image alignment. Alignment constants are defined\r\n     * in the {@link Align} class.\r\n     *\r\n     * @return The alignment.\r\n     *\r\n     * @see #setBackgroundImageAlignment(int)\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlignment(int)",
      "begin_line": 721,
      "end_line": 726,
      "comment": "\r\n     * Sets the alignment for the background image and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Alignment options\r\n     * are defined by the {@link Align} class.\r\n     *\r\n     * @param alignment  the alignment.\r\n     *\r\n     * @see #getBackgroundImageAlignment()\r\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 725,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlpha()",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\r\n     * Returns the alpha transparency used to draw the background image.  This\r\n     * is a value in the range 0.0f to 1.0f, where 0.0f is fully transparent\r\n     * and 1.0f is fully opaque.\r\n     *\r\n     * @return The alpha transparency.\r\n     *\r\n     * @see #setBackgroundImageAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlpha(float)",
      "begin_line": 752,
      "end_line": 760,
      "comment": "\r\n     * Sets the alpha transparency used when drawing the background image.\r\n     *\r\n     * @param alpha  the alpha transparency (in the range 0.0f to 1.0f, where\r\n     *     0.0f is fully transparent, and 1.0f is fully opaque).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not within\r\n     *     the specified range.\r\n     *\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 755,col 76)",
        "(line 756,col 9)-(line 759,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isOutlineVisible()",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\r\n     * Returns the flag that controls whether or not the plot outline is\r\n     * drawn.  The default value is \u003ccode\u003etrue\u003c/code\u003e.  Note that for\r\n     * historical reasons, the plot\u0027s outline paint and stroke can take on\r\n     * \u003ccode\u003enull\u003c/code\u003e values, in which case the outline will not be drawn\r\n     * even if this flag is set to \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return The outline visibility flag.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineVisible(boolean)",
      "begin_line": 789,
      "end_line": 792,
      "comment": "\r\n     * Sets the flag that controls whether or not the plot\u0027s outline is\r\n     * drawn, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #isOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 38)",
        "(line 791,col 9)-(line 791,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlineStroke()",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\r\n     * Returns the stroke used to outline the plot area.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 814,
      "end_line": 830,
      "comment": "\r\n     * Sets the stroke used to outline the plot area and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners. If you set this\r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 829,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlinePaint()",
      "begin_line": 839,
      "end_line": 841,
      "comment": "\r\n     * Returns the color used to draw the outline of the plot area.\r\n     *\r\n     * @return The color (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlinePaint(java.awt.Paint)",
      "begin_line": 852,
      "end_line": 868,
      "comment": "\r\n     * Sets the paint used to draw the outline of the plot area and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If you set this\r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 867,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getForegroundAlpha()",
      "begin_line": 877,
      "end_line": 879,
      "comment": "\r\n     * Returns the alpha-transparency for the plot foreground.\r\n     *\r\n     * @return The alpha-transparency.\r\n     *\r\n     * @see #setForegroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setForegroundAlpha(float)",
      "begin_line": 889,
      "end_line": 894,
      "comment": "\r\n     * Sets the alpha-transparency for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param alpha  the new alpha transparency.\r\n     *\r\n     * @see #getForegroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 893,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getLegendItems()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method returns\r\n     * \u003ccode\u003enull\u003c/code\u003e.  Subclasses should override to return a\r\n     * {@link LegendItemCollection}.\r\n     *\r\n     * @return The legend items for the plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isNotify()",
      "begin_line": 917,
      "end_line": 919,
      "comment": "\r\n     * Returns a flag that controls whether or not change events are sent to\r\n     * registered listeners.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setNotify(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNotify(boolean)",
      "begin_line": 931,
      "end_line": 937,
      "comment": "\r\n     * Sets a flag that controls whether or not listeners receive\r\n     * {@link PlotChangeEvent} notifications.\r\n     *\r\n     * @param notify  a boolean.\r\n     *\r\n     * @see #isNotify()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 29)",
        "(line 934,col 9)-(line 936,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.addChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\r\n     * Registers an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be registered.\r\n     *\r\n     * @see #removeChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.removeChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 957,
      "end_line": 959,
      "comment": "\r\n     * Unregisters an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be unregistered.\r\n     *\r\n     * @see #addChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.notifyListeners(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 966,
      "end_line": 978,
      "comment": "\r\n     * Notifies all registered listeners that the plot has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 65)",
        "(line 973,col 9)-(line 977,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fireChangeEvent()",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\r\n     * Sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1003,
      "end_line": 1007,
      "comment": "\r\n     * Draws the plot within the specified area.  The anchor is a point on the\r\n     * chart that is specified externally (for instance, it may be the last\r\n     * point of the last mouse click performed by the user) - plots can use or\r\n     * ignore this value as they see fit.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Subclasses need to provide an implementation of this method, obviously.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the parent state (if any).\r\n     * @param info  carries back plot rendering info.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1019,
      "end_line": 1024,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is\r\n     * declared public so that it can be accessed by the renderers used by\r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 33)",
        "(line 1023,col 9)-(line 1023,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1036,
      "end_line": 1038,
      "comment": "\r\n     * Fills the specified area with the background paint.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     * @see #getBackgroundAlpha()\r\n     * @see #fillBackground(Graphics2D, Rectangle2D, PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1052,
      "end_line": 1082,
      "comment": "\r\n     * Fills the specified area with the background paint.  If the background\r\n     * paint is an instance of \u003ccode\u003eGradientPaint\u003c/code\u003e, the gradient will\r\n     * run in the direction suggested by the plot\u0027s orientation.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param area  the plot area.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1059,col 9)",
        "(line 1060,col 9)-(line 1060,col 39)",
        "(line 1061,col 9)-(line 1075,col 9)",
        "(line 1076,col 9)-(line 1076,col 56)",
        "(line 1077,col 9)-(line 1078,col 39)",
        "(line 1079,col 9)-(line 1079,col 23)",
        "(line 1080,col 9)-(line 1080,col 22)",
        "(line 1081,col 9)-(line 1081,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackgroundImage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1095,
      "end_line": 1113,
      "comment": "\r\n     * Draws the background image (if there is one) aligned within the\r\n     * specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     *\r\n     * @see #getBackgroundImage()\r\n     * @see #getBackgroundImageAlignment()\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1099,col 53)",
        "(line 1100,col 9)-(line 1101,col 44)",
        "(line 1102,col 9)-(line 1104,col 54)",
        "(line 1105,col 9)-(line 1105,col 63)",
        "(line 1106,col 9)-(line 1106,col 39)",
        "(line 1107,col 9)-(line 1107,col 22)",
        "(line 1108,col 9)-(line 1110,col 50)",
        "(line 1111,col 9)-(line 1111,col 30)",
        "(line 1112,col 9)-(line 1112,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawOutline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1124,
      "end_line": 1133,
      "comment": "\r\n     * Draws the plot outline.  This method will be called during the chart\r\n     * drawing process and is declared public so that it can be accessed by the\r\n     * renderers used by certain subclasses. You shouldn\u0027t need to call this\r\n     * method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1127,col 9)",
        "(line 1128,col 9)-(line 1132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawNoDataMessage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1141,
      "end_line": 1156,
      "comment": "\r\n     * Draws a message to state that there is no data to plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 39)",
        "(line 1143,col 9)-(line 1143,col 22)",
        "(line 1144,col 9)-(line 1144,col 44)",
        "(line 1145,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1155,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.createAndAddEntity(java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, java.lang.String, java.lang.String)",
      "begin_line": 1172,
      "end_line": 1180,
      "comment": "\r\n     * Creates a plot entity that contains a reference to the plot and the\r\n     * data area as shape.\r\n     *\r\n     * @param dataArea  the data area used as hot spot for the entity.\r\n     * @param plotState  the plot rendering info containing a reference to the\r\n     *     EntityCollection.\r\n     * @param toolTip  the tool tip (defined in the respective Plot\r\n     *     subclass) (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the url (defined in the respective Plot subclass)\r\n     *     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     *  @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1192,
      "end_line": 1194,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.  Since the plot does not maintain any\r\n     * information about where it has been drawn, the plot rendering info is\r\n     * supplied as an argument so that the plot dimensions can be determined.\r\n     *\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param info  an object containing information about the dimensions of\r\n     *              the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.zoom(double)",
      "begin_line": 1202,
      "end_line": 1204,
      "comment": "\r\n     * Performs a zoom on the plot.  Subclasses should override if zooming is\r\n     * appropriate for the type of plot.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.annotationChanged(org.jfree.chart.event.AnnotationChangeEvent)",
      "begin_line": 1214,
      "end_line": 1216,
      "comment": "\r\n     * Receives notification of a change to an {@link Annotation} added to\r\n     * this plot.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.axisChanged(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1223,
      "end_line": 1225,
      "comment": "\r\n     * Receives notification of a change to one of the plot\u0027s axes.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 1235,
      "end_line": 1239,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The plot reacts by passing on a plot change event to all registered\r\n     * listeners.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1236,col 61)",
        "(line 1237,col 9)-(line 1237,col 63)",
        "(line 1238,col 9)-(line 1238,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.markerChanged(org.jfree.chart.event.MarkerChangeEvent)",
      "begin_line": 1249,
      "end_line": 1251,
      "comment": "\r\n     * Receives notification of a change to a marker that is assigned to the\r\n     * plot.\r\n     *\r\n     * @param event  the event.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1250,col 9)-(line 1250,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectX(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1263,
      "end_line": 1275,
      "comment": "\r\n     * Adjusts the supplied x-value.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param w1  width 1.\r\n     * @param w2  width 2.\r\n     * @param edge  the edge (left or right).\r\n     *\r\n     * @return The adjusted x-value.\r\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 26)",
        "(line 1267,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectY(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1287,
      "end_line": 1299,
      "comment": "\r\n     * Adjusts the supplied y-value.\r\n     *\r\n     * @param y  the x-value.\r\n     * @param h1  height 1.\r\n     * @param h2  height 2.\r\n     * @param edge  the edge (top or bottom).\r\n     *\r\n     * @return The adjusted y-value.\r\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 26)",
        "(line 1291,col 9)-(line 1296,col 9)",
        "(line 1297,col 9)-(line 1297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.equals(java.lang.Object)",
      "begin_line": 1308,
      "end_line": 1366,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1309,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 31)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1327,col 9)",
        "(line 1328,col 9)-(line 1330,col 9)",
        "(line 1331,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1342,col 9)",
        "(line 1343,col 9)-(line 1346,col 9)",
        "(line 1347,col 9)-(line 1349,col 9)",
        "(line 1350,col 9)-(line 1352,col 9)",
        "(line 1353,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1361,col 9)",
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1365,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.clone()",
      "begin_line": 1376,
      "end_line": 1390,
      "comment": "\r\n     * Creates a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does not\r\n     *         support cloning.\r\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1378,col 42)",
        "(line 1381,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1386,col 76)",
        "(line 1387,col 9)-(line 1387,col 53)",
        "(line 1388,col 9)-(line 1388,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1399,
      "end_line": 1406,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1400,col 36)",
        "(line 1401,col 9)-(line 1401,col 68)",
        "(line 1402,col 9)-(line 1402,col 64)",
        "(line 1403,col 9)-(line 1403,col 62)",
        "(line 1405,col 9)-(line 1405,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1416,
      "end_line": 1427,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 35)",
        "(line 1419,col 9)-(line 1419,col 68)",
        "(line 1420,col 9)-(line 1420,col 64)",
        "(line 1421,col 9)-(line 1421,col 62)",
        "(line 1423,col 9)-(line 1423,col 65)",
        "(line 1425,col 9)-(line 1425,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveDomainAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1437,
      "end_line": 1487,
      "comment": "\r\n     * Resolves a domain axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1440,col 9)-(line 1442,col 9)",
        "(line 1443,col 9)-(line 1445,col 9)",
        "(line 1447,col 9)-(line 1447,col 36)",
        "(line 1449,col 9)-(line 1480,col 9)",
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1485,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveRangeAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1497,
      "end_line": 1548,
      "comment": "\r\n     * Resolves a range axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1500,col 9)-(line 1502,col 9)",
        "(line 1503,col 9)-(line 1505,col 9)",
        "(line 1507,col 9)-(line 1507,col 36)",
        "(line 1509,col 9)-(line 1540,col 9)",
        "(line 1543,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1546,col 22)"
      ]
    }
  ]
}