{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/Plot.java",
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
      "begin_line": 189,
      "end_line": 1527,
      "comment": "\r\n * The base class for all plots in JFreeChart.  The {@link JFreeChart} class\r\n * delegates the drawing of axes and data to the plot.  This base class\r\n * provides facilities common to most plot types.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Useful constant representing zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INSETS"
      ],
      "begin_line": 200,
      "end_line": 201,
      "comment": " The default insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " The default outline color. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FOREGROUND_ALPHA"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " The default foreground alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_ALPHA"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The default background alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_PAINT"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The default background color. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_WIDTH_TO_DRAW"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " The minimum width at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_HEIGHT_TO_DRAW"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " The minimum height at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_BOX"
      ],
      "begin_line": 225,
      "end_line": 226,
      "comment": " A default box shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_CIRCLE"
      ],
      "begin_line": 229,
      "end_line": 230,
      "comment": " A default circle shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The parent plot (\u003ccode\u003enull\u003c/code\u003e if this is the root plot). "
    },
    {
      "type": "field",
      "varNames": [
        "datasetGroup"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " The dataset group (to be used for thread synchronisation). "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessage"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " The message to display if no data is available. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessageFont"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " The font used to display the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessagePaint"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " The paint used to draw the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Amount of blank space around the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineVisible"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\r\n     * A flag that controls whether or not the plot outline is drawn.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " The Stroke used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " The Paint used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " An optional color used to fill the plot background. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImage"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " not currently serialized"
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlignment"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " The alignment for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlpha"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " The alpha value used to draw the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAlpha"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " The alpha-transparency for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAlpha"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " The alpha transparency for the background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawingSupplier"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " The drawing supplier. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": "\r\n     * A flag that controls whether or not the plot will notify listeners\r\n     * of changes (defaults to true, but sometimes it is useful to disable\r\n     * this).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Plot.Plot()",
      "begin_line": 299,
      "end_line": 320,
      "comment": "\r\n     * Creates a new plot.\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 27)",
        "(line 302,col 9)-(line 302,col 37)",
        "(line 303,col 9)-(line 303,col 56)",
        "(line 304,col 9)-(line 304,col 56)",
        "(line 305,col 9)-(line 305,col 36)",
        "(line 306,col 9)-(line 306,col 35)",
        "(line 307,col 9)-(line 307,col 52)",
        "(line 308,col 9)-(line 308,col 50)",
        "(line 309,col 9)-(line 309,col 56)",
        "(line 311,col 9)-(line 311,col 34)",
        "(line 312,col 9)-(line 312,col 68)",
        "(line 313,col 9)-(line 313,col 46)",
        "(line 315,col 9)-(line 315,col 60)",
        "(line 317,col 9)-(line 317,col 27)",
        "(line 318,col 9)-(line 318,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDatasetGroup()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\r\n     * Returns the dataset group for the plot (not currently used).\r\n     *\r\n     * @return The dataset group.\r\n     *\r\n     * @see #setDatasetGroup(DatasetGroup)\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDatasetGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\r\n     * Sets the dataset group (not currently used).\r\n     *\r\n     * @param group  the dataset group (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDatasetGroup()\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessage()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\r\n     * Returns the string that is displayed when the dataset is empty or\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The \u0027no data\u0027 message (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setNoDataMessage(String)\r\n     * @see #getNoDataMessageFont()\r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessage(java.lang.String)",
      "begin_line": 367,
      "end_line": 370,
      "comment": "\r\n     * Sets the message that is displayed when the dataset is empty or\r\n     * \u003ccode\u003enull\u003c/code\u003e, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param message  the message (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 37)",
        "(line 369,col 9)-(line 369,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessageFont()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\r\n     * Returns the font used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNoDataMessageFont(Font)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessageFont(java.awt.Font)",
      "begin_line": 392,
      "end_line": 398,
      "comment": "\r\n     * Sets the font used to display the \u0027no data\u0027 message and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getNoDataMessageFont()\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 38)",
        "(line 397,col 9)-(line 397,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessagePaint()",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Returns the paint used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNoDataMessagePaint(Paint)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessagePaint(java.awt.Paint)",
      "begin_line": 420,
      "end_line": 426,
      "comment": "\r\n     * Sets the paint used to display the \u0027no data\u0027 message and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 40)",
        "(line 425,col 9)-(line 425,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getPlotType()",
      "begin_line": 437,
      "end_line": 437,
      "comment": "\r\n     * Returns a short string describing the plot type.\r\n     * \u003cP\u003e\r\n     * Note: this gets used in the chart property editing user interface,\r\n     * but there needs to be a better mechanism for identifying the plot type.\r\n     *\r\n     * @return A short string describing the plot type (never\r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getParent()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\r\n     * Returns the parent plot (or \u003ccode\u003enull\u003c/code\u003e if this plot is not part\r\n     * of a combined plot).\r\n     *\r\n     * @return The parent plot.\r\n     *\r\n     * @see #setParent(Plot)\r\n     * @see #getRootPlot()\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setParent(org.jfree.chart.plot.Plot)",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\r\n     * Sets the parent plot.  This method is intended for internal use, you\r\n     * shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param parent  the parent plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRootPlot()",
      "begin_line": 471,
      "end_line": 481,
      "comment": "\r\n     * Returns the root plot.\r\n     *\r\n     * @return The root plot.\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 29)",
        "(line 474,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isSubplot()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot\r\n     * structure (that is, {@link #getParent()} returns a non-\u003ccode\u003enull\u003c/code\u003e\r\n     * value), and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot\r\n     *         structure.\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getInsets()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\r\n     * Returns the insets for the plot area.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\r\n     * Sets the insets for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets, boolean)\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets, boolean)",
      "begin_line": 532,
      "end_line": 543,
      "comment": "\r\n     * Sets the insets for the plot and, if requested,  and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether the registered listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundPaint()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\r\n     * Returns the background color of the plot area.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 564,
      "end_line": 582,
      "comment": "\r\n     * Sets the background color of the plot area and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 580,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundAlpha()",
      "begin_line": 591,
      "end_line": 593,
      "comment": "\r\n     * Returns the alpha transparency of the plot area background.\r\n     *\r\n     * @return The alpha transparency.\r\n     *\r\n     * @see #setBackgroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundAlpha(float)",
      "begin_line": 603,
      "end_line": 608,
      "comment": "\r\n     * Sets the alpha transparency of the plot area background, and notifies\r\n     * registered listeners that the plot has been modified.\r\n     *\r\n     * @param alpha the new alpha value (in the range 0.0f to 1.0f).\r\n     *\r\n     * @see #getBackgroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 607,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDrawingSupplier()",
      "begin_line": 617,
      "end_line": 627,
      "comment": "\r\n     * Returns the drawing supplier for the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDrawingSupplier(DrawingSupplier)\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 38)",
        "(line 619,col 9)-(line 619,col 29)",
        "(line 620,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier)",
      "begin_line": 641,
      "end_line": 644,
      "comment": "\r\n     * Sets the drawing supplier for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  The drawing\r\n     * supplier is responsible for supplying a limitless (possibly repeating)\r\n     * sequence of \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and\r\n     * \u003ccode\u003eShape\u003c/code\u003e objects that the plot\u0027s renderer(s) can use to\r\n     * populate its (their) tables.\r\n     *\r\n     * @param supplier  the new supplier.\r\n     *\r\n     * @see #getDrawingSupplier()\r\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 40)",
        "(line 643,col 9)-(line 643,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier, boolean)",
      "begin_line": 661,
      "end_line": 666,
      "comment": "\r\n     * Sets the drawing supplier for the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  The drawing\r\n     * supplier is responsible for supplying a limitless (possibly repeating)\r\n     * sequence of \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and\r\n     * \u003ccode\u003eShape\u003c/code\u003e objects that the plot\u0027s renderer(s) can use to\r\n     * populate its (their) tables.\r\n     *\r\n     * @param supplier  the new supplier.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDrawingSupplier()\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 40)",
        "(line 663,col 9)-(line 665,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImage()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\r\n     * Returns the background image that is used to fill the plot\u0027s background\r\n     * area.\r\n     *\r\n     * @return The image (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundImage(Image)\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImage(java.awt.Image)",
      "begin_line": 688,
      "end_line": 691,
      "comment": "\r\n     * Sets the background image for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundImage()\r\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 37)",
        "(line 690,col 9)-(line 690,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlignment()",
      "begin_line": 701,
      "end_line": 703,
      "comment": "\r\n     * Returns the background image alignment. Alignment constants are defined\r\n     * in the {@link Align} class.\r\n     *\r\n     * @return The alignment.\r\n     *\r\n     * @see #setBackgroundImageAlignment(int)\r\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlignment(int)",
      "begin_line": 714,
      "end_line": 719,
      "comment": "\r\n     * Sets the alignment for the background image and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Alignment options\r\n     * are defined by the {@link Align} class.\r\n     *\r\n     * @param alignment  the alignment.\r\n     *\r\n     * @see #getBackgroundImageAlignment()\r\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 718,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlpha()",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\r\n     * Returns the alpha transparency used to draw the background image.  This\r\n     * is a value in the range 0.0f to 1.0f, where 0.0f is fully transparent\r\n     * and 1.0f is fully opaque.\r\n     *\r\n     * @return The alpha transparency.\r\n     *\r\n     * @see #setBackgroundImageAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlpha(float)",
      "begin_line": 745,
      "end_line": 753,
      "comment": "\r\n     * Sets the alpha transparency used when drawing the background image.\r\n     *\r\n     * @param alpha  the alpha transparency (in the range 0.0f to 1.0f, where\r\n     *     0.0f is fully transparent, and 1.0f is fully opaque).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not within\r\n     *     the specified range.\r\n     *\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 76)",
        "(line 749,col 9)-(line 752,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isOutlineVisible()",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\r\n     * Returns the flag that controls whether or not the plot outline is\r\n     * drawn.  The default value is \u003ccode\u003etrue\u003c/code\u003e.  Note that for\r\n     * historical reasons, the plot\u0027s outline paint and stroke can take on\r\n     * \u003ccode\u003enull\u003c/code\u003e values, in which case the outline will not be drawn\r\n     * even if this flag is set to \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return The outline visibility flag.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineVisible(boolean)",
      "begin_line": 782,
      "end_line": 785,
      "comment": "\r\n     * Sets the flag that controls whether or not the plot\u0027s outline is\r\n     * drawn, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #isOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 38)",
        "(line 784,col 9)-(line 784,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlineStroke()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\r\n     * Returns the stroke used to outline the plot area.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 807,
      "end_line": 823,
      "comment": "\r\n     * Sets the stroke used to outline the plot area and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners. If you set this\r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlinePaint()",
      "begin_line": 832,
      "end_line": 834,
      "comment": "\r\n     * Returns the color used to draw the outline of the plot area.\r\n     *\r\n     * @return The color (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlinePaint(java.awt.Paint)",
      "begin_line": 845,
      "end_line": 861,
      "comment": "\r\n     * Sets the paint used to draw the outline of the plot area and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If you set this\r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getForegroundAlpha()",
      "begin_line": 870,
      "end_line": 872,
      "comment": "\r\n     * Returns the alpha-transparency for the plot foreground.\r\n     *\r\n     * @return The alpha-transparency.\r\n     *\r\n     * @see #setForegroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setForegroundAlpha(float)",
      "begin_line": 882,
      "end_line": 887,
      "comment": "\r\n     * Sets the alpha-transparency for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param alpha  the new alpha transparency.\r\n     *\r\n     * @see #getForegroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 886,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getLegendItems()",
      "begin_line": 896,
      "end_line": 898,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method returns\r\n     * \u003ccode\u003enull\u003c/code\u003e.  Subclasses should override to return a\r\n     * {@link LegendItemCollection}.\r\n     *\r\n     * @return The legend items for the plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isNotify()",
      "begin_line": 910,
      "end_line": 912,
      "comment": "\r\n     * Returns a flag that controls whether or not change events are sent to\r\n     * registered listeners.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setNotify(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNotify(boolean)",
      "begin_line": 924,
      "end_line": 930,
      "comment": "\r\n     * Sets a flag that controls whether or not listeners receive\r\n     * {@link PlotChangeEvent} notifications.\r\n     *\r\n     * @param notify  a boolean.\r\n     *\r\n     * @see #isNotify()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 29)",
        "(line 927,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.addChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 939,
      "end_line": 941,
      "comment": "\r\n     * Registers an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be registered.\r\n     *\r\n     * @see #removeChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.removeChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 950,
      "end_line": 952,
      "comment": "\r\n     * Unregisters an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be unregistered.\r\n     *\r\n     * @see #addChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.notifyListeners(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 959,
      "end_line": 971,
      "comment": "\r\n     * Notifies all registered listeners that the plot has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 965,col 65)",
        "(line 966,col 9)-(line 970,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fireChangeEvent()",
      "begin_line": 978,
      "end_line": 980,
      "comment": "\r\n     * Sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 996,
      "end_line": 1000,
      "comment": "\r\n     * Draws the plot within the specified area.  The anchor is a point on the\r\n     * chart that is specified externally (for instance, it may be the last\r\n     * point of the last mouse click performed by the user) - plots can use or\r\n     * ignore this value as they see fit.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Subclasses need to provide an implementation of this method, obviously.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the parent state (if any).\r\n     * @param info  carries back plot rendering info.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1012,
      "end_line": 1017,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is\r\n     * declared public so that it can be accessed by the renderers used by\r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 33)",
        "(line 1016,col 9)-(line 1016,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1029,
      "end_line": 1031,
      "comment": "\r\n     * Fills the specified area with the background paint.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     * @see #getBackgroundAlpha()\r\n     * @see #fillBackground(Graphics2D, Rectangle2D, PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1045,
      "end_line": 1075,
      "comment": "\r\n     * Fills the specified area with the background paint.  If the background\r\n     * paint is an instance of \u003ccode\u003eGradientPaint\u003c/code\u003e, the gradient will\r\n     * run in the direction suggested by the plot\u0027s orientation.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param area  the plot area.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 39)",
        "(line 1054,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1069,col 56)",
        "(line 1070,col 9)-(line 1071,col 39)",
        "(line 1072,col 9)-(line 1072,col 23)",
        "(line 1073,col 9)-(line 1073,col 22)",
        "(line 1074,col 9)-(line 1074,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackgroundImage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1088,
      "end_line": 1102,
      "comment": "\r\n     * Draws the background image (if there is one) aligned within the\r\n     * specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     *\r\n     * @see #getBackgroundImage()\r\n     * @see #getBackgroundImageAlignment()\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawOutline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1113,
      "end_line": 1122,
      "comment": "\r\n     * Draws the plot outline.  This method will be called during the chart\r\n     * drawing process and is declared public so that it can be accessed by the\r\n     * renderers used by certain subclasses. You shouldn\u0027t need to call this\r\n     * method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawNoDataMessage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1130,
      "end_line": 1145,
      "comment": "\r\n     * Draws a message to state that there is no data to plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1131,col 9)-(line 1131,col 39)",
        "(line 1132,col 9)-(line 1132,col 22)",
        "(line 1133,col 9)-(line 1133,col 44)",
        "(line 1134,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1144,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.createAndAddEntity(java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, java.lang.String, java.lang.String)",
      "begin_line": 1161,
      "end_line": 1169,
      "comment": "\r\n     * Creates a plot entity that contains a reference to the plot and the\r\n     * data area as shape.\r\n     *\r\n     * @param dataArea  the data area used as hot spot for the entity.\r\n     * @param plotState  the plot rendering info containing a reference to the\r\n     *     EntityCollection.\r\n     * @param toolTip  the tool tip (defined in the respective Plot\r\n     *     subclass) (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlText  the url (defined in the respective Plot subclass)\r\n     *     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     *  @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1163,col 3)-(line 1168,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1181,
      "end_line": 1183,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.  Since the plot does not maintain any\r\n     * information about where it has been drawn, the plot rendering info is\r\n     * supplied as an argument so that the plot dimensions can be determined.\r\n     *\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param info  an object containing information about the dimensions of\r\n     *              the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.zoom(double)",
      "begin_line": 1191,
      "end_line": 1193,
      "comment": "\r\n     * Performs a zoom on the plot.  Subclasses should override if zooming is\r\n     * appropriate for the type of plot.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.axisChanged(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1200,
      "end_line": 1202,
      "comment": "\r\n     * Receives notification of a change to one of the plot\u0027s axes.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1212,
      "end_line": 1216,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The plot reacts by passing on a plot change event to all registered\r\n     * listeners.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 61)",
        "(line 1214,col 9)-(line 1214,col 63)",
        "(line 1215,col 9)-(line 1215,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.markerChanged(org.jfree.chart.event.MarkerChangeEvent)",
      "begin_line": 1226,
      "end_line": 1228,
      "comment": "\r\n     * Receives notification of a change to a marker that is assigned to the\r\n     * plot.\r\n     *\r\n     * @param event  the event.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectX(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1240,
      "end_line": 1252,
      "comment": "\r\n     * Adjusts the supplied x-value.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param w1  width 1.\r\n     * @param w2  width 2.\r\n     * @param edge  the edge (left or right).\r\n     *\r\n     * @return The adjusted x-value.\r\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 26)",
        "(line 1244,col 9)-(line 1249,col 9)",
        "(line 1250,col 9)-(line 1250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectY(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1264,
      "end_line": 1276,
      "comment": "\r\n     * Adjusts the supplied y-value.\r\n     *\r\n     * @param y  the x-value.\r\n     * @param h1  height 1.\r\n     * @param h2  height 2.\r\n     * @param edge  the edge (top or bottom).\r\n     *\r\n     * @return The adjusted y-value.\r\n     ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 26)",
        "(line 1268,col 9)-(line 1273,col 9)",
        "(line 1274,col 9)-(line 1274,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.equals(java.lang.Object)",
      "begin_line": 1285,
      "end_line": 1343,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1288,col 9)",
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1292,col 31)",
        "(line 1293,col 9)-(line 1295,col 9)",
        "(line 1296,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1307,col 9)",
        "(line 1308,col 9)-(line 1310,col 9)",
        "(line 1311,col 9)-(line 1313,col 9)",
        "(line 1314,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1326,col 9)",
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.clone()",
      "begin_line": 1353,
      "end_line": 1367,
      "comment": "\r\n     * Creates a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does not\r\n     *         support cloning.\r\n     ",
      "child_ranges": [
        "(line 1355,col 9)-(line 1355,col 42)",
        "(line 1358,col 9)-(line 1361,col 9)",
        "(line 1362,col 9)-(line 1363,col 76)",
        "(line 1364,col 9)-(line 1364,col 53)",
        "(line 1365,col 9)-(line 1365,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1376,
      "end_line": 1383,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1377,col 9)-(line 1377,col 36)",
        "(line 1378,col 9)-(line 1378,col 68)",
        "(line 1379,col 9)-(line 1379,col 64)",
        "(line 1380,col 9)-(line 1380,col 62)",
        "(line 1382,col 9)-(line 1382,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1393,
      "end_line": 1404,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1395,col 9)-(line 1395,col 35)",
        "(line 1396,col 9)-(line 1396,col 68)",
        "(line 1397,col 9)-(line 1397,col 64)",
        "(line 1398,col 9)-(line 1398,col 62)",
        "(line 1400,col 9)-(line 1400,col 65)",
        "(line 1402,col 9)-(line 1402,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveDomainAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1414,
      "end_line": 1464,
      "comment": "\r\n     * Resolves a domain axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1417,col 9)-(line 1419,col 9)",
        "(line 1420,col 9)-(line 1422,col 9)",
        "(line 1424,col 9)-(line 1424,col 36)",
        "(line 1426,col 9)-(line 1457,col 9)",
        "(line 1459,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1462,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveRangeAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1474,
      "end_line": 1525,
      "comment": "\r\n     * Resolves a range axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1479,col 9)",
        "(line 1480,col 9)-(line 1482,col 9)",
        "(line 1484,col 9)-(line 1484,col 36)",
        "(line 1486,col 9)-(line 1517,col 9)",
        "(line 1520,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1523,col 22)"
      ]
    }
  ]
}