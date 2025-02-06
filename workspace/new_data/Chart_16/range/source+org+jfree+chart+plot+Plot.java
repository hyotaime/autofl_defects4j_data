{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/Plot.java",
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
      "begin_line": 181,
      "end_line": 1416,
      "comment": "\r\n * The base class for all plots in JFreeChart.  The \r\n * {@link org.jfree.chart.JFreeChart} class delegates the drawing of axes and \r\n * data to the plot.  This base class provides facilities common to most plot \r\n * types.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Useful constant representing zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INSETS"
      ],
      "begin_line": 196,
      "end_line": 197,
      "comment": " The default insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " The default outline color. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FOREGROUND_ALPHA"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The default foreground alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_ALPHA"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The default background alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_PAINT"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The default background color. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_WIDTH_TO_DRAW"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The minimum width at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_HEIGHT_TO_DRAW"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The minimum height at which the plot should be drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_BOX"
      ],
      "begin_line": 221,
      "end_line": 222,
      "comment": " A default box shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEGEND_ITEM_CIRCLE"
      ],
      "begin_line": 225,
      "end_line": 226,
      "comment": " A default circle shape for legend items. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The parent plot (\u003ccode\u003enull\u003c/code\u003e if this is the root plot). "
    },
    {
      "type": "field",
      "varNames": [
        "datasetGroup"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The dataset group (to be used for thread synchronisation). "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessage"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " The message to display if no data is available. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessageFont"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " The font used to display the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "noDataMessagePaint"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " The paint used to draw the \u0027no data\u0027 message. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " Amount of blank space around the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineVisible"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " \r\n     * A flag that controls whether or not the plot outline is drawn. \r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " The Stroke used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " The Paint used to draw an outline around the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " An optional color used to fill the plot background. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImage"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " not currently serialized"
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlignment"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " The alignment for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlpha"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The alpha value used to draw the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAlpha"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The alpha-transparency for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAlpha"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " The alpha transparency for the background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawingSupplier"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " The drawing supplier. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Plot.Plot()",
      "begin_line": 286,
      "end_line": 306,
      "comment": "\r\n     * Creates a new plot.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 27)",
        "(line 289,col 9)-(line 289,col 37)",
        "(line 290,col 9)-(line 290,col 56)",
        "(line 291,col 9)-(line 291,col 56)",
        "(line 292,col 9)-(line 292,col 36)",
        "(line 293,col 9)-(line 293,col 35)",
        "(line 294,col 9)-(line 294,col 52)",
        "(line 295,col 9)-(line 295,col 50)",
        "(line 296,col 9)-(line 296,col 56)",
        "(line 298,col 9)-(line 298,col 34)",
        "(line 299,col 9)-(line 299,col 71)",
        "(line 300,col 9)-(line 300,col 46)",
        "(line 302,col 9)-(line 302,col 60)",
        "(line 304,col 9)-(line 304,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDatasetGroup()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\r\n     * Returns the dataset group for the plot (not currently used).\r\n     *\r\n     * @return The dataset group.\r\n     * \r\n     * @see #setDatasetGroup(DatasetGroup)\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDatasetGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Sets the dataset group (not currently used).\r\n     *\r\n     * @param group  the dataset group (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDatasetGroup()\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessage()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\r\n     * Returns the string that is displayed when the dataset is empty or \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The \u0027no data\u0027 message (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setNoDataMessage(String)\r\n     * @see #getNoDataMessageFont()\r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessage(java.lang.String)",
      "begin_line": 353,
      "end_line": 356,
      "comment": "\r\n     * Sets the message that is displayed when the dataset is empty or \r\n     * \u003ccode\u003enull\u003c/code\u003e, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param message  the message (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 37)",
        "(line 355,col 9)-(line 355,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessageFont()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the font used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNoDataMessageFont(Font)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessageFont(java.awt.Font)",
      "begin_line": 378,
      "end_line": 384,
      "comment": "\r\n     * Sets the font used to display the \u0027no data\u0027 message and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getNoDataMessageFont()\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getNoDataMessagePaint()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\r\n     * Returns the paint used to display the \u0027no data\u0027 message.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNoDataMessagePaint(Paint)\r\n     * @see #getNoDataMessage()\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setNoDataMessagePaint(java.awt.Paint)",
      "begin_line": 406,
      "end_line": 412,
      "comment": "\r\n     * Sets the paint used to display the \u0027no data\u0027 message and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getNoDataMessagePaint()\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 411,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getPlotType()",
      "begin_line": 423,
      "end_line": 423,
      "comment": "\r\n     * Returns a short string describing the plot type.\r\n     * \u003cP\u003e\r\n     * Note: this gets used in the chart property editing user interface,\r\n     * but there needs to be a better mechanism for identifying the plot type.\r\n     *\r\n     * @return A short string describing the plot type (never \r\n     *     \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getParent()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\r\n     * Returns the parent plot (or \u003ccode\u003enull\u003c/code\u003e if this plot is not part \r\n     * of a combined plot).\r\n     *\r\n     * @return The parent plot.\r\n     * \r\n     * @see #setParent(Plot)\r\n     * @see #getRootPlot()\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setParent(org.jfree.chart.plot.Plot)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\r\n     * Sets the parent plot.  This method is intended for internal use, you \r\n     * shouldn\u0027t need to call it directly.\r\n     *\r\n     * @param parent  the parent plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRootPlot()",
      "begin_line": 457,
      "end_line": 467,
      "comment": "\r\n     * Returns the root plot.\r\n     *\r\n     * @return The root plot.\r\n     * \r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 29)",
        "(line 460,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isSubplot()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot \r\n     * structure (that is, {@link #getParent()} returns a non-\u003ccode\u003enull\u003c/code\u003e\r\n     * value), and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is part of a combined plot \r\n     *         structure.\r\n     *         \r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getInsets()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\r\n     * Returns the insets for the plot area.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\r\n     * Sets the insets for the plot and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets, boolean)\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setInsets(org.jfree.chart.util.RectangleInsets, boolean)",
      "begin_line": 518,
      "end_line": 529,
      "comment": "\r\n     * Sets the insets for the plot and, if requested,  and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param insets  the new insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether the registered listeners are\r\n     *                notified.\r\n     *                \r\n     * @see #getInsets()\r\n     * @see #setInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundPaint()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\r\n     * Returns the background color of the plot area.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 550,
      "end_line": 568,
      "comment": "\r\n     * Sets the background color of the plot area and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundAlpha()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\r\n     * Returns the alpha transparency of the plot area background.\r\n     *\r\n     * @return The alpha transparency.\r\n     * \r\n     * @see #setBackgroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundAlpha(float)",
      "begin_line": 589,
      "end_line": 594,
      "comment": "\r\n     * Sets the alpha transparency of the plot area background, and notifies\r\n     * registered listeners that the plot has been modified.\r\n     *\r\n     * @param alpha the new alpha value (in the range 0.0f to 1.0f).\r\n     * \r\n     * @see #getBackgroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getDrawingSupplier()",
      "begin_line": 603,
      "end_line": 613,
      "comment": "\r\n     * Returns the drawing supplier for the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDrawingSupplier(DrawingSupplier)\r\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 38)",
        "(line 605,col 9)-(line 605,col 29)",
        "(line 606,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier)",
      "begin_line": 625,
      "end_line": 628,
      "comment": "\r\n     * Sets the drawing supplier for the plot.  The drawing supplier is \r\n     * responsible for supplying a limitless (possibly repeating) sequence of \r\n     * \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and \u003ccode\u003eShape\u003c/code\u003e objects \r\n     * that the plot\u0027s renderer(s) can use to populate its (their) tables.\r\n     *\r\n     * @param supplier  the new supplier.\r\n     * \r\n     * @see #getDrawingSupplier()\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 40)",
        "(line 627,col 9)-(line 627,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImage()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\r\n     * Returns the background image that is used to fill the plot\u0027s background \r\n     * area.\r\n     *\r\n     * @return The image (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBackgroundImage(Image)\r\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImage(java.awt.Image)",
      "begin_line": 650,
      "end_line": 653,
      "comment": "\r\n     * Sets the background image for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBackgroundImage()\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 37)",
        "(line 652,col 9)-(line 652,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlignment()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\r\n     * Returns the background image alignment. Alignment constants are defined \r\n     * in the {@link Align} class.\r\n     *\r\n     * @return The alignment.\r\n     * \r\n     * @see #setBackgroundImageAlignment(int)\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlignment(int)",
      "begin_line": 676,
      "end_line": 681,
      "comment": "\r\n     * Sets the alignment for the background image and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  Alignment options \r\n     * are defined by the {@link Align} class.\r\n     *\r\n     * @param alignment  the alignment.\r\n     * \r\n     * @see #getBackgroundImageAlignment()\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 680,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getBackgroundImageAlpha()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\r\n     * Returns the alpha transparency used to draw the background image.  This\r\n     * is a value in the range 0.0f to 1.0f, where 0.0f is fully transparent\r\n     * and 1.0f is fully opaque.\r\n     * \r\n     * @return The alpha transparency.\r\n     * \r\n     * @see #setBackgroundImageAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setBackgroundImageAlpha(float)",
      "begin_line": 707,
      "end_line": 715,
      "comment": "\r\n     * Sets the alpha transparency used when drawing the background image.\r\n     * \r\n     * @param alpha  the alpha transparency (in the range 0.0f to 1.0f, where\r\n     *     0.0f is fully transparent, and 1.0f is fully opaque).\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not within\r\n     *     the specified range.\r\n     *     \r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 710,col 76)",
        "(line 711,col 9)-(line 714,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.isOutlineVisible()",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\r\n     * Returns the flag that controls whether or not the plot outline is\r\n     * drawn.  The default value is \u003ccode\u003etrue\u003c/code\u003e.  Note that for \r\n     * historical reasons, the plot\u0027s outline paint and stroke can take on\r\n     * \u003ccode\u003enull\u003c/code\u003e values, in which case the outline will not be drawn\r\n     * even if this flag is set to \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return The outline visibility flag.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineVisible(boolean)",
      "begin_line": 744,
      "end_line": 747,
      "comment": "\r\n     * Sets the flag that controls whether or not the plot\u0027s outline is\r\n     * drawn, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #isOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 38)",
        "(line 746,col 9)-(line 746,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlineStroke()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\r\n     * Returns the stroke used to outline the plot area.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 769,
      "end_line": 785,
      "comment": "\r\n     * Sets the stroke used to outline the plot area and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners. If you set this \r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getOutlinePaint()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\r\n     * Returns the color used to draw the outline of the plot area.\r\n     *\r\n     * @return The color (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setOutlinePaint(java.awt.Paint)",
      "begin_line": 807,
      "end_line": 823,
      "comment": "\r\n     * Sets the paint used to draw the outline of the plot area and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  If you set this \r\n     * attribute to \u003ccode\u003enull\u003c/code\u003e, no outline will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getForegroundAlpha()",
      "begin_line": 832,
      "end_line": 834,
      "comment": "\r\n     * Returns the alpha-transparency for the plot foreground.\r\n     *\r\n     * @return The alpha-transparency.\r\n     * \r\n     * @see #setForegroundAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.setForegroundAlpha(float)",
      "begin_line": 844,
      "end_line": 849,
      "comment": "\r\n     * Sets the alpha-transparency for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param alpha  the new alpha transparency.\r\n     * \r\n     * @see #getForegroundAlpha()\r\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 848,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getLegendItems()",
      "begin_line": 858,
      "end_line": 860,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method returns \r\n     * \u003ccode\u003enull\u003c/code\u003e.  Subclasses should override to return a \r\n     * {@link LegendItemCollection}.\r\n     *\r\n     * @return The legend items for the plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.addChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 869,
      "end_line": 871,
      "comment": "\r\n     * Registers an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be registered.\r\n     * \r\n     * @see #removeChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.removeChangeListener(org.jfree.chart.event.PlotChangeListener)",
      "begin_line": 880,
      "end_line": 882,
      "comment": "\r\n     * Unregisters an object for notification of changes to the plot.\r\n     *\r\n     * @param listener  the object to be unregistered.\r\n     * \r\n     * @see #addChangeListener(PlotChangeListener)\r\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.notifyListeners(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 889,
      "end_line": 896,
      "comment": "\r\n     * Notifies all registered listeners that the plot has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 65)",
        "(line 891,col 9)-(line 895,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 912,
      "end_line": 916,
      "comment": "\r\n     * Draws the plot within the specified area.  The anchor is a point on the\r\n     * chart that is specified externally (for instance, it may be the last\r\n     * point of the last mouse click performed by the user) - plots can use or\r\n     * ignore this value as they see fit. \r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Subclasses need to provide an implementation of this method, obviously.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the parent state (if any).\r\n     * @param info  carries back plot rendering info.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 928,
      "end_line": 933,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is \r\n     * declared public so that it can be accessed by the renderers used by \r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 33)",
        "(line 932,col 9)-(line 932,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\r\n     * Fills the specified area with the background paint.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #getBackgroundPaint()\r\n     * @see #getBackgroundAlpha()\r\n     * @see #fillBackground(Graphics2D, Rectangle2D, PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.fillBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 961,
      "end_line": 991,
      "comment": "\r\n     * Fills the specified area with the background paint.  If the background\r\n     * paint is an instance of \u003ccode\u003eGradientPaint\u003c/code\u003e, the gradient will\r\n     * run in the direction suggested by the plot\u0027s orientation.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param area  the plot area.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 39)",
        "(line 970,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 985,col 56)",
        "(line 986,col 9)-(line 987,col 39)",
        "(line 988,col 9)-(line 988,col 23)",
        "(line 989,col 9)-(line 989,col 22)",
        "(line 990,col 9)-(line 990,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawBackgroundImage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1004,
      "end_line": 1018,
      "comment": "\r\n     * Draws the background image (if there is one) aligned within the \r\n     * specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #getBackgroundImage()\r\n     * @see #getBackgroundImageAlignment()\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1017,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawOutline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1029,
      "end_line": 1038,
      "comment": "\r\n     * Draws the plot outline.  This method will be called during the chart \r\n     * drawing process and is declared public so that it can be accessed by the\r\n     * renderers used by certain subclasses. You shouldn\u0027t need to call this \r\n     * method directly.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1037,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.drawNoDataMessage(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1046,
      "end_line": 1061,
      "comment": "\r\n     * Draws a message to state that there is no data to plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 39)",
        "(line 1048,col 9)-(line 1048,col 22)",
        "(line 1049,col 9)-(line 1049,col 44)",
        "(line 1050,col 9)-(line 1059,col 9)",
        "(line 1060,col 9)-(line 1060,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1073,
      "end_line": 1075,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot.  Since the plot does not maintain any\r\n     * information about where it has been drawn, the plot rendering info is \r\n     * supplied as an argument.\r\n     *\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param info  an object containing information about the dimensions of \r\n     *              the plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.zoom(double)",
      "begin_line": 1083,
      "end_line": 1085,
      "comment": "\r\n     * Performs a zoom on the plot.  Subclasses should override if zooming is \r\n     * appropriate for the type of plot.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.axisChanged(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "\r\n     * Receives notification of a change to one of the plot\u0027s axes.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1104,
      "end_line": 1108,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The plot reacts by passing on a plot change event to all registered \r\n     * listeners.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 61)",
        "(line 1106,col 9)-(line 1106,col 63)",
        "(line 1107,col 9)-(line 1107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.markerChanged(org.jfree.chart.event.MarkerChangeEvent)",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": "\r\n     * Receives notification of a change to a marker that is assigned to the\r\n     * plot.\r\n     * \r\n     * @param event  the event.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectX(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1132,
      "end_line": 1144,
      "comment": "\r\n     * Adjusts the supplied x-value.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param w1  width 1.\r\n     * @param w2  width 2.\r\n     * @param edge  the edge (left or right).\r\n     *\r\n     * @return The adjusted x-value.\r\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 26)",
        "(line 1136,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1142,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.getRectY(double, double, double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1156,
      "end_line": 1168,
      "comment": "\r\n     * Adjusts the supplied y-value.\r\n     *\r\n     * @param y  the x-value.\r\n     * @param h1  height 1.\r\n     * @param h2  height 2.\r\n     * @param edge  the edge (top or bottom).\r\n     *\r\n     * @return The adjusted y-value.\r\n     ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 26)",
        "(line 1160,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.equals(java.lang.Object)",
      "begin_line": 1177,
      "end_line": 1232,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1184,col 9)-(line 1184,col 31)",
        "(line 1185,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1196,col 9)",
        "(line 1197,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1211,col 9)",
        "(line 1212,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.clone()",
      "begin_line": 1242,
      "end_line": 1256,
      "comment": "\r\n     * Creates a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does not\r\n     *         support cloning.\r\n     ",
      "child_ranges": [
        "(line 1244,col 9)-(line 1244,col 42)",
        "(line 1247,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1252,col 76)",
        "(line 1253,col 9)-(line 1253,col 53)",
        "(line 1254,col 9)-(line 1254,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1265,
      "end_line": 1272,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 36)",
        "(line 1267,col 9)-(line 1267,col 68)",
        "(line 1268,col 9)-(line 1268,col 64)",
        "(line 1269,col 9)-(line 1269,col 62)",
        "(line 1271,col 9)-(line 1271,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1282,
      "end_line": 1293,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 35)",
        "(line 1285,col 9)-(line 1285,col 68)",
        "(line 1286,col 9)-(line 1286,col 64)",
        "(line 1287,col 9)-(line 1287,col 62)",
        "(line 1289,col 9)-(line 1289,col 65)",
        "(line 1291,col 9)-(line 1291,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveDomainAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1303,
      "end_line": 1353,
      "comment": "\r\n     * Resolves a domain axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1308,col 9)",
        "(line 1309,col 9)-(line 1311,col 9)",
        "(line 1313,col 9)-(line 1313,col 36)",
        "(line 1315,col 9)-(line 1346,col 9)",
        "(line 1348,col 9)-(line 1350,col 9)",
        "(line 1351,col 9)-(line 1351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Plot.resolveRangeAxisLocation(org.jfree.chart.axis.AxisLocation, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1363,
      "end_line": 1414,
      "comment": "\r\n     * Resolves a range axis location for a given plot orientation.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1366,col 9)-(line 1368,col 9)",
        "(line 1369,col 9)-(line 1371,col 9)",
        "(line 1373,col 9)-(line 1373,col 36)",
        "(line 1375,col 9)-(line 1406,col 9)",
        "(line 1409,col 9)-(line 1411,col 9)",
        "(line 1412,col 9)-(line 1412,col 22)"
      ]
    }
  ]
}