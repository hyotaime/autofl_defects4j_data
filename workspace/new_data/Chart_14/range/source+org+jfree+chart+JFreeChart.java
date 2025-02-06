{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/JFreeChart.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JFreeChart",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.Drawable",
        "org.jfree.chart.event.TitleChangeListener",
        "org.jfree.chart.event.PlotChangeListener",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 233,
      "end_line": 1722,
      "comment": "\r\n * A chart class implemented using the Java 2D APIs.  The current version\r\n * supports bar charts, line charts, pie charts and xy plots (including time\r\n * series data).\r\n * \u003cP\u003e\r\n * JFreeChart coordinates several objects to achieve its aim of being able to\r\n * draw a chart on a Java 2D graphics device: a list of {@link Title} objects\r\n * (which often includes the chart\u0027s legend), a {@link Plot} and a \r\n * {@link org.jfree.data.general.Dataset} (the plot in turn manages a \r\n * domain axis and a range axis).\r\n * \u003cP\u003e\r\n * You should use a {@link ChartPanel} to display a chart in a GUI.\r\n * \u003cP\u003e\r\n * The {@link ChartFactory} class contains static methods for creating \r\n * \u0027ready-made\u0027 charts.\r\n *\r\n * @see ChartPanel\r\n * @see ChartFactory\r\n * @see Title\r\n * @see Plot\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "INFO"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Information about the project. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TITLE_FONT"
      ],
      "begin_line": 246,
      "end_line": 247,
      "comment": " The default font for titles. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_PAINT"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The default background color. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_IMAGE"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " The default background image. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_IMAGE_ALIGNMENT"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " The default background image alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_IMAGE_ALPHA"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " The default background image alpha. "
    },
    {
      "type": "field",
      "varNames": [
        "renderingHints"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " \r\n     * Rendering hints that will be used for chart drawing.  This should never\r\n     * be \u003ccode\u003enull\u003c/code\u003e. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "borderVisible"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " A flag that controls whether or not the chart border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "borderStroke"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " The stroke used to draw the chart border (if visible). "
    },
    {
      "type": "field",
      "varNames": [
        "borderPaint"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " The paint used to draw the chart border (if visible). "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " The padding between the chart border and the chart drawing area. "
    },
    {
      "type": "field",
      "varNames": [
        "title"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " The chart title (optional). "
    },
    {
      "type": "field",
      "varNames": [
        "subtitles"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " \r\n     * The chart subtitles (zero, one or many).  This field should never be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Draws the visual representation of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Paint used to draw the background of the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImage"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " todo: not serialized yet"
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlignment"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " The alignment for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlpha"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " The alpha transparency for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "changeListeners"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "progressListeners"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " Storage for registered progress listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " \r\n     * A flag that can be used to enable/disable notification of chart change \r\n     * events. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChart.JFreeChart(org.jfree.chart.plot.Plot)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Creates a new chart based on the supplied plot.  The chart will have\r\n     * a legend added automatically, but no title (although you can easily add\r\n     * one later).  \r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the  {@link ChartFactory} class contains a range \r\n     * of static methods that will return ready-made charts, and often this\r\n     * is a more convenient way to create charts than using this constructor.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChart.JFreeChart(java.lang.String, org.jfree.chart.plot.Plot)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Creates a new chart with the given title and plot.  A default font \r\n     * (@link DEFAULT_TITLE_FONT) is used for the title, and the chart will \r\n     * have a legend added automatically.  \r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the  {@link ChartFactory} class contains a range \r\n     * of static methods that will return ready-made charts, and often this\r\n     * is a more convenient way to create charts than using this constructor.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChart.JFreeChart(java.lang.String, java.awt.Font, org.jfree.chart.plot.Plot, boolean)",
      "begin_line": 363,
      "end_line": 417,
      "comment": "\r\n     * Creates a new chart with the given title and plot.  The \r\n     * \u003ccode\u003ecreateLegend\u003c/code\u003e argument specifies whether or not a legend\r\n     * should be added to the chart.  \r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the  {@link ChartFactory} class contains a range \r\n     * of static methods that will return ready-made charts, and often this\r\n     * is a more convenient way to create charts than using this constructor.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param titleFont  the font for displaying the chart title \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param plot  controller of the visual representation of the data \r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param createLegend  a flag indicating whether or not a legend should   \r\n     *                      be created for the chart.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 371,col 9)-(line 371,col 57)",
        "(line 372,col 9)-(line 372,col 55)",
        "(line 373,col 9)-(line 373,col 27)",
        "(line 376,col 9)-(line 378,col 51)",
        "(line 380,col 9)-(line 380,col 35)",
        "(line 381,col 9)-(line 381,col 50)",
        "(line 382,col 9)-(line 382,col 39)",
        "(line 384,col 9)-(line 384,col 51)",
        "(line 386,col 9)-(line 386,col 25)",
        "(line 387,col 9)-(line 387,col 37)",
        "(line 389,col 9)-(line 389,col 41)",
        "(line 392,col 9)-(line 400,col 9)",
        "(line 403,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 56)",
        "(line 413,col 9)-(line 413,col 56)",
        "(line 414,col 9)-(line 414,col 75)",
        "(line 415,col 9)-(line 415,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getRenderingHints()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\r\n     * Returns the collection of rendering hints for the chart.\r\n     *\r\n     * @return The rendering hints for the chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderingHints(RenderingHints)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setRenderingHints(java.awt.RenderingHints)",
      "begin_line": 440,
      "end_line": 446,
      "comment": "\r\n     * Sets the rendering hints for the chart.  These will be added (using the \r\n     * Graphics2D.addRenderingHints() method) near the start of the \r\n     * JFreeChart.draw() method.\r\n     *\r\n     * @param renderingHints  the rendering hints (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                        permitted).\r\n     *                        \r\n     * @see #getRenderingHints()\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 45)",
        "(line 445,col 9)-(line 445,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.isBorderVisible()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\r\n     * Returns a flag that controls whether or not a border is drawn around the\r\n     * outside of the chart.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setBorderVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBorderVisible(boolean)",
      "begin_line": 468,
      "end_line": 471,
      "comment": "\r\n     * Sets a flag that controls whether or not a border is drawn around the \r\n     * outside of the chart.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isBorderVisible()\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 37)",
        "(line 470,col 9)-(line 470,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBorderStroke()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n     * Returns the stroke used to draw the chart border (if visible).\r\n     *\r\n     * @return The border stroke.\r\n     * \r\n     * @see #setBorderStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBorderStroke(java.awt.Stroke)",
      "begin_line": 491,
      "end_line": 494,
      "comment": "\r\n     * Sets the stroke used to draw the chart border (if visible).\r\n     *\r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #getBorderStroke()\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 35)",
        "(line 493,col 9)-(line 493,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBorderPaint()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\r\n     * Returns the paint used to draw the chart border (if visible).\r\n     *\r\n     * @return The border paint.\r\n     * \r\n     * @see #setBorderPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBorderPaint(java.awt.Paint)",
      "begin_line": 514,
      "end_line": 517,
      "comment": "\r\n     * Sets the paint used to draw the chart border (if visible).\r\n     *\r\n     * @param paint  the paint.\r\n     * \r\n     * @see #getBorderPaint()\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 33)",
        "(line 516,col 9)-(line 516,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getPadding()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\r\n     * Returns the padding between the chart border and the chart drawing area.\r\n     * \r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 538,
      "end_line": 544,
      "comment": "\r\n     * Sets the padding between the chart border and the chart drawing area,\r\n     * and sends a {@link ChartChangeEvent} to all registered listeners.\r\n     * \r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPadding()\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 31)",
        "(line 543,col 9)-(line 543,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getTitle()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\r\n     * Returns the main chart title.  Very often a chart will have just one\r\n     * title, so we make this case simple by providing accessor methods for\r\n     * the main title.  However, multiple titles are supported - see the\r\n     * {@link #addSubtitle(Title)} method.\r\n     *\r\n     * @return The chart title (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTitle(TextTitle)\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTitle(org.jfree.chart.title.TextTitle)",
      "begin_line": 570,
      "end_line": 579,
      "comment": "\r\n     * Sets the main title for the chart and sends a {@link ChartChangeEvent} \r\n     * to all registered listeners.  If you do not want a title for the \r\n     * chart, set it to \u003ccode\u003enull\u003c/code\u003e.  If you want more than one title on\r\n     * a chart, use the {@link #addSubtitle(Title)} method.\r\n     *\r\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getTitle()\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 27)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTitle(java.lang.String)",
      "begin_line": 593,
      "end_line": 605,
      "comment": "\r\n     * Sets the chart title and sends a {@link ChartChangeEvent} to all \r\n     * registered listeners.  This is a convenience method that ends up calling \r\n     * the {@link #setTitle(TextTitle)} method.  If there is an existing title,\r\n     * its text is updated, otherwise a new title using the default font is \r\n     * added to the chart.  If \u003ccode\u003etext\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e the chart\r\n     * title is set to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param text  the title text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getTitle()\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addLegend(org.jfree.chart.title.LegendTitle)",
      "begin_line": 615,
      "end_line": 617,
      "comment": "\r\n     * Adds a legend to the plot and sends a {@link ChartChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param legend  the legend (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeLegend()\r\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getLegend()",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\r\n     * Returns the legend for the chart, if there is one.  Note that a chart\r\n     * can have more than one legend - this method returns the first.\r\n     * \r\n     * @return The legend (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getLegend(int)\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getLegend(int)",
      "begin_line": 640,
      "end_line": 655,
      "comment": "\r\n     * Returns the nth legend for a chart, or \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @param index  the legend index (zero-based).\r\n     * \r\n     * @return The legend (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #addLegend(LegendTitle)\r\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 21)",
        "(line 642,col 9)-(line 642,col 54)",
        "(line 643,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeLegend()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\r\n     * Removes the first legend in the chart and sends a \r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #getLegend()\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getSubtitles()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\r\n     * Returns the list of subtitles for the chart.\r\n     *\r\n     * @return The subtitle list (possibly empty, but never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSubtitles(List)\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setSubtitles(java.util.List)",
      "begin_line": 688,
      "end_line": 702,
      "comment": "\r\n     * Sets the title list for the chart (completely replaces any existing \r\n     * titles) and sends a {@link ChartChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param subtitles  the new list of subtitles (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                   permitted).\r\n     *                   \r\n     * @see #getSubtitles()\r\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 25)",
        "(line 693,col 9)-(line 693,col 25)",
        "(line 694,col 9)-(line 694,col 49)",
        "(line 695,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getSubtitleCount()",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\r\n     * Returns the number of titles for the chart.\r\n     *\r\n     * @return The number of titles for the chart.\r\n     * \r\n     * @see #getSubtitles()\r\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getSubtitle(int)",
      "begin_line": 724,
      "end_line": 729,
      "comment": "\r\n     * Returns a chart subtitle.\r\n     *\r\n     * @param index  the index of the chart subtitle (zero based).\r\n     *\r\n     * @return A chart subtitle.\r\n     * \r\n     * @see #addSubtitle(Title)\r\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addSubtitle(org.jfree.chart.title.Title)",
      "begin_line": 739,
      "end_line": 746,
      "comment": "\r\n     * Adds a chart subtitle, and notifies registered listeners that the chart \r\n     * has been modified.\r\n     *\r\n     * @param subtitle  the subtitle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSubtitle(int)\r\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 37)",
        "(line 744,col 9)-(line 744,col 41)",
        "(line 745,col 9)-(line 745,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addSubtitle(int, org.jfree.chart.title.Title)",
      "begin_line": 757,
      "end_line": 768,
      "comment": "\r\n     * Adds a subtitle at a particular position in the subtitle list, and sends\r\n     * a {@link ChartChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the index (in the range 0 to {@link #getSubtitleCount()}).\r\n     * @param subtitle  the subtitle to add (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 765,col 44)",
        "(line 766,col 9)-(line 766,col 41)",
        "(line 767,col 9)-(line 767,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.clearSubtitles()",
      "begin_line": 776,
      "end_line": 784,
      "comment": "\r\n     * Clears all subtitles from the chart and sends a {@link ChartChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #addSubtitle(Title)\r\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 54)",
        "(line 778,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 31)",
        "(line 783,col 9)-(line 783,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeSubtitle(org.jfree.chart.title.Title)",
      "begin_line": 794,
      "end_line": 797,
      "comment": "\r\n     * Removes the specified subtitle and sends a {@link ChartChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param title  the title.\r\n     * \r\n     * @see #addSubtitle(Title)\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 37)",
        "(line 796,col 9)-(line 796,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getPlot()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\r\n     * Returns the plot for the chart.  The plot is a class responsible for\r\n     * coordinating the visual representation of the data, including the axes\r\n     * (if any).\r\n     *\r\n     * @return The plot.\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getCategoryPlot()",
      "begin_line": 820,
      "end_line": 822,
      "comment": "\r\n     * Returns the plot cast as a {@link CategoryPlot}.\r\n     * \u003cp\u003e\r\n     * NOTE: if the plot is not an instance of {@link CategoryPlot}, then a\r\n     * \u003ccode\u003eClassCastException\u003c/code\u003e is thrown.\r\n     *\r\n     * @return The plot.\r\n     * \r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getXYPlot()",
      "begin_line": 834,
      "end_line": 836,
      "comment": "\r\n     * Returns the plot cast as an {@link XYPlot}.\r\n     * \u003cp\u003e\r\n     * NOTE: if the plot is not an instance of {@link XYPlot}, then a\r\n     * \u003ccode\u003eClassCastException\u003c/code\u003e is thrown.\r\n     *\r\n     * @return The plot.\r\n     * \r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getAntiAlias()",
      "begin_line": 846,
      "end_line": 849,
      "comment": "\r\n     * Returns a flag that indicates whether or not anti-aliasing is used when\r\n     * the chart is drawn.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setAntiAlias(boolean)\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 78)",
        "(line 848,col 9)-(line 848,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setAntiAlias(boolean)",
      "begin_line": 861,
      "end_line": 882,
      "comment": "\r\n     * Sets a flag that indicates whether or not anti-aliasing is used when the\r\n     * chart is drawn.\r\n     * \u003cP\u003e\r\n     * Anti-aliasing usually improves the appearance of charts, but is slower.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #getAntiAlias()\r\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 78)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getTextAntiAlias()",
      "begin_line": 894,
      "end_line": 896,
      "comment": "\r\n     * Returns the current value stored in the rendering hints table for\r\n     * {@link RenderingHints#KEY_TEXT_ANTIALIASING}.\r\n     * \r\n     * @return The hint value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setTextAntiAlias(Object)\r\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTextAntiAlias(boolean)",
      "begin_line": 912,
      "end_line": 919,
      "comment": "\r\n     * Sets the value in the rendering hints table for \r\n     * {@link RenderingHints#KEY_TEXT_ANTIALIASING} to either\r\n     * {@link RenderingHints#VALUE_TEXT_ANTIALIAS_ON} or\r\n     * {@link RenderingHints#VALUE_TEXT_ANTIALIAS_OFF}, then sends a \r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     * \r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getTextAntiAlias()\r\n     * @see #setTextAntiAlias(Object)\r\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 918,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTextAntiAlias(java.lang.Object)",
      "begin_line": 933,
      "end_line": 936,
      "comment": "\r\n     * Sets the value in the rendering hints table for \r\n     * {@link RenderingHints#KEY_TEXT_ANTIALIASING} and sends a \r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     * \r\n     * @param val  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getTextAntiAlias()\r\n     * @see #setTextAntiAlias(boolean)\r\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 75)",
        "(line 935,col 9)-(line 935,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundPaint()",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\r\n     * Returns the paint used for the chart background.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 957,
      "end_line": 972,
      "comment": "\r\n     * Sets the paint used to fill the chart background and sends a \r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 970,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundImage()",
      "begin_line": 982,
      "end_line": 984,
      "comment": "\r\n     * Returns the background image for the chart, or \u003ccode\u003enull\u003c/code\u003e if \r\n     * there is no image.\r\n     *\r\n     * @return The image (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBackgroundImage(Image)\r\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundImage(java.awt.Image)",
      "begin_line": 994,
      "end_line": 1009,
      "comment": "\r\n     * Sets the background image for the chart and sends a \r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getBackgroundImage()\r\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 1007,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundImageAlignment()",
      "begin_line": 1020,
      "end_line": 1022,
      "comment": "\r\n     * Returns the background image alignment. Alignment constants are defined \r\n     * in the \u003ccode\u003eorg.jfree.ui.Align\u003c/code\u003e class in the JCommon class \r\n     * library.\r\n     *\r\n     * @return The alignment.\r\n     * \r\n     * @see #setBackgroundImageAlignment(int)\r\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundImageAlignment(int)",
      "begin_line": 1032,
      "end_line": 1037,
      "comment": "\r\n     * Sets the background alignment.  Alignment options are defined by the \r\n     * {@link Align} class.\r\n     *\r\n     * @param alignment  the alignment.\r\n     * \r\n     * @see #getBackgroundImageAlignment()\r\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundImageAlpha()",
      "begin_line": 1046,
      "end_line": 1048,
      "comment": "\r\n     * Returns the alpha-transparency for the chart\u0027s background image.\r\n     *\r\n     * @return The alpha-transparency.\r\n     * \r\n     * @see #setBackgroundImageAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundImageAlpha(float)",
      "begin_line": 1058,
      "end_line": 1065,
      "comment": "\r\n     * Sets the alpha-transparency for the chart\u0027s background image.\r\n     * Registered listeners are notified that the chart has been changed.\r\n     *\r\n     * @param alpha  the alpha value.\r\n     * \r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1063,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.isNotify()",
      "begin_line": 1075,
      "end_line": 1077,
      "comment": "\r\n     * Returns a flag that controls whether or not change events are sent to \r\n     * registered listeners.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setNotify(boolean)\r\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setNotify(boolean)",
      "begin_line": 1087,
      "end_line": 1093,
      "comment": "\r\n     * Sets a flag that controls whether or not listeners receive \r\n     * {@link ChartChangeEvent} notifications.\r\n     *\r\n     * @param notify  a boolean.\r\n     * \r\n     * @see #isNotify()\r\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 29)",
        "(line 1090,col 9)-(line 1092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1104,
      "end_line": 1106,
      "comment": "\r\n     * Draws the chart on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This method is the focus of the entire JFreeChart library.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the chart should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1116,
      "end_line": 1118,
      "comment": "\r\n     * Draws the chart on a Java 2D graphics device (such as the screen or a\r\n     * printer).  This method is the focus of the entire JFreeChart library.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the chart should be drawn.\r\n     * @param info  records info about the drawing (null means collect no info).\r\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1117,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1132,
      "end_line": 1225,
      "comment": "\r\n     * Draws the chart on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This method is the focus of the entire JFreeChart library.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param chartArea  the area within which the chart should be drawn.\r\n     * @param anchor  the anchor point (in Java2D space) for the chart \r\n     *                (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  records info about the drawing (null means collect no info).\r\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1137,col 56)",
        "(line 1140,col 9)-(line 1143,col 9)",
        "(line 1146,col 9)-(line 1146,col 39)",
        "(line 1147,col 9)-(line 1147,col 27)",
        "(line 1149,col 9)-(line 1149,col 50)",
        "(line 1152,col 9)-(line 1155,col 9)",
        "(line 1157,col 9)-(line 1169,col 9)",
        "(line 1171,col 9)-(line 1183,col 9)",
        "(line 1186,col 9)-(line 1186,col 60)",
        "(line 1187,col 9)-(line 1187,col 40)",
        "(line 1188,col 9)-(line 1188,col 40)",
        "(line 1190,col 9)-(line 1190,col 41)",
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1200,col 9)",
        "(line 1202,col 9)-(line 1202,col 54)",
        "(line 1203,col 9)-(line 1210,col 9)",
        "(line 1212,col 9)-(line 1212,col 44)",
        "(line 1215,col 9)-(line 1215,col 42)",
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1219,col 61)",
        "(line 1221,col 9)-(line 1221,col 30)",
        "(line 1223,col 9)-(line 1224,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createAlignedRectangle2D(org.jfree.chart.util.Size2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 1237,
      "end_line": 1263,
      "comment": "\r\n     * Creates a rectangle that is aligned to the frame.\r\n     * \r\n     * @param dimensions  the dimensions for the rectangle.\r\n     * @param frame  the frame to align to.\r\n     * @param hAlign  the horizontal alignment.\r\n     * @param vAlign  the vertical alignment.\r\n     * \r\n     * @return A rectangle.\r\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 30)",
        "(line 1241,col 9)-(line 1241,col 30)",
        "(line 1242,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1259,col 9)",
        "(line 1261,col 9)-(line 1262,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.drawTitle(org.jfree.chart.title.Title, java.awt.Graphics2D, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 1279,
      "end_line": 1347,
      "comment": "\r\n     * Draws a title.  The title should be drawn at the top, bottom, left or \r\n     * right of the specified area, and the area should be updated to reflect \r\n     * the amount of space used by the title.\r\n     *\r\n     * @param t  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the chart area, excluding any existing titles \r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param entities  a flag that controls whether or not an entity \r\n     *                  collection is returned for the title.\r\n     * \r\n     * @return An entity collection for the title (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1284,col 9)",
        "(line 1285,col 9)-(line 1287,col 9)",
        "(line 1288,col 9)-(line 1288,col 57)",
        "(line 1289,col 9)-(line 1289,col 49)",
        "(line 1290,col 9)-(line 1290,col 36)",
        "(line 1291,col 9)-(line 1293,col 9)",
        "(line 1294,col 9)-(line 1294,col 37)",
        "(line 1295,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1300,col 64)",
        "(line 1301,col 9)-(line 1301,col 31)",
        "(line 1302,col 9)-(line 1302,col 42)",
        "(line 1303,col 9)-(line 1303,col 40)",
        "(line 1304,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 39)",
        "(line 1342,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int)",
      "begin_line": 1357,
      "end_line": 1359,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1358,col 9)-(line 1358,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1371,
      "end_line": 1375,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     * @param info  carries back chart state information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1374,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1388,
      "end_line": 1396,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     * @param imageType  the image type.\r\n     * @param info  carries back chart state information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1391,col 74)",
        "(line 1392,col 9)-(line 1392,col 47)",
        "(line 1393,col 9)-(line 1393,col 74)",
        "(line 1394,col 9)-(line 1394,col 21)",
        "(line 1395,col 9)-(line 1395,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int, double, double, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1412,
      "end_line": 1430,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param imageWidth  the image width.\r\n     * @param imageHeight  the image height.\r\n     * @param drawWidth  the width for drawing the chart (will be scaled to \r\n     *                   fit image).\r\n     * @param drawHeight  the height for drawing the chart (will be scaled to \r\n     *                    fit image).\r\n     * @param info  optional object for collection chart dimension and entity \r\n     *              information.\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1419,col 45)",
        "(line 1420,col 9)-(line 1420,col 47)",
        "(line 1421,col 9)-(line 1421,col 47)",
        "(line 1422,col 9)-(line 1422,col 49)",
        "(line 1423,col 9)-(line 1423,col 78)",
        "(line 1424,col 9)-(line 1424,col 25)",
        "(line 1425,col 9)-(line 1426,col 22)",
        "(line 1427,col 9)-(line 1427,col 21)",
        "(line 1428,col 9)-(line 1428,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.handleClick(int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1444,
      "end_line": 1450,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the chart.\r\n     * \u003cP\u003e\r\n     * JFreeChart is not a UI component, so some other object (e.g. ChartPanel)\r\n     * needs to capture the click event and pass it onto the JFreeChart object.\r\n     * If you are not using JFreeChart in a client application, then this\r\n     * method is not required (and hopefully it doesn\u0027t get in the way).\r\n     *\r\n     * @param x  x-coordinate of the click (in Java2D space).\r\n     * @param y  y-coordinate of the click (in Java2D space).\r\n     * @param info  contains chart dimension and entity information.\r\n     ",
      "child_ranges": [
        "(line 1448,col 9)-(line 1448,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addChangeListener(org.jfree.chart.event.ChartChangeListener)",
      "begin_line": 1459,
      "end_line": 1464,
      "comment": "\r\n     * Registers an object for notification of changes to the chart.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeChangeListener(ChartChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1460,col 9)-(line 1462,col 9)",
        "(line 1463,col 9)-(line 1463,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeChangeListener(org.jfree.chart.event.ChartChangeListener)",
      "begin_line": 1473,
      "end_line": 1478,
      "comment": "\r\n     * Deregisters an object for notification of changes to the chart.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted)\r\n     * \r\n     * @see #addChangeListener(ChartChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1476,col 9)",
        "(line 1477,col 9)-(line 1477,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.fireChartChanged()",
      "begin_line": 1485,
      "end_line": 1488,
      "comment": "\r\n     * Sends a default {@link ChartChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * This method is for convenience only.\r\n     ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1486,col 60)",
        "(line 1487,col 9)-(line 1487,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.notifyListeners(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 1496,
      "end_line": 1506,
      "comment": "\r\n     * Sends a {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the event that triggered the \r\n     *               notification.\r\n     ",
      "child_ranges": [
        "(line 1497,col 9)-(line 1505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addProgressListener(org.jfree.chart.event.ChartProgressListener)",
      "begin_line": 1516,
      "end_line": 1518,
      "comment": "\r\n     * Registers an object for notification of progress events relating to the \r\n     * chart.\r\n     *\r\n     * @param listener  the object being registered.\r\n     * \r\n     * @see #removeProgressListener(ChartProgressListener)\r\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeProgressListener(org.jfree.chart.event.ChartProgressListener)",
      "begin_line": 1527,
      "end_line": 1529,
      "comment": "\r\n     * Deregisters an object for notification of changes to the chart.\r\n     *\r\n     * @param listener  the object being deregistered.\r\n     * \r\n     * @see #addProgressListener(ChartProgressListener)\r\n     ",
      "child_ranges": [
        "(line 1528,col 9)-(line 1528,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.notifyListeners(org.jfree.chart.event.ChartProgressEvent)",
      "begin_line": 1537,
      "end_line": 1546,
      "comment": "\r\n     * Sends a {@link ChartProgressEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the event that triggered the \r\n     *               notification.\r\n     ",
      "child_ranges": [
        "(line 1539,col 9)-(line 1539,col 70)",
        "(line 1540,col 9)-(line 1544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.titleChanged(org.jfree.chart.event.TitleChangeEvent)",
      "begin_line": 1554,
      "end_line": 1557,
      "comment": "\r\n     * Receives notification that a chart title has changed, and passes this\r\n     * on to registered listeners.\r\n     *\r\n     * @param event  information about the chart title change.\r\n     ",
      "child_ranges": [
        "(line 1555,col 9)-(line 1555,col 29)",
        "(line 1556,col 9)-(line 1556,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 1565,
      "end_line": 1568,
      "comment": "\r\n     * Receives notification that the plot has changed, and passes this on to\r\n     * registered listeners.\r\n     *\r\n     * @param event  information about the plot change.\r\n     ",
      "child_ranges": [
        "(line 1566,col 9)-(line 1566,col 29)",
        "(line 1567,col 9)-(line 1567,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.equals(java.lang.Object)",
      "begin_line": 1577,
      "end_line": 1628,
      "comment": "\r\n     * Tests this chart for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1578,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1583,col 9)",
        "(line 1584,col 9)-(line 1584,col 43)",
        "(line 1585,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1593,col 9)",
        "(line 1594,col 9)-(line 1596,col 9)",
        "(line 1597,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1602,col 9)",
        "(line 1603,col 9)-(line 1605,col 9)",
        "(line 1606,col 9)-(line 1608,col 9)",
        "(line 1609,col 9)-(line 1613,col 9)",
        "(line 1614,col 9)-(line 1617,col 9)",
        "(line 1618,col 9)-(line 1620,col 9)",
        "(line 1621,col 9)-(line 1623,col 9)",
        "(line 1624,col 9)-(line 1626,col 9)",
        "(line 1627,col 9)-(line 1627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1637,
      "end_line": 1642,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1638,col 9)-(line 1638,col 36)",
        "(line 1639,col 9)-(line 1639,col 63)",
        "(line 1640,col 9)-(line 1640,col 61)",
        "(line 1641,col 9)-(line 1641,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.readObject(java.io.ObjectInputStream)",
      "begin_line": 1652,
      "end_line": 1673,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1654,col 9)-(line 1654,col 35)",
        "(line 1655,col 9)-(line 1655,col 63)",
        "(line 1656,col 9)-(line 1656,col 61)",
        "(line 1657,col 9)-(line 1657,col 65)",
        "(line 1658,col 9)-(line 1658,col 57)",
        "(line 1659,col 9)-(line 1659,col 55)",
        "(line 1660,col 9)-(line 1662,col 51)",
        "(line 1665,col 9)-(line 1667,col 9)",
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1672,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.main(java.lang.String[])",
      "begin_line": 1680,
      "end_line": 1682,
      "comment": "\r\n     * Prints information about JFreeChart to standard output.\r\n     *\r\n     * @param args  no arguments are honored.\r\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1681,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.clone()",
      "begin_line": 1692,
      "end_line": 1720,
      "comment": "\r\n     * Clones the object, and takes care of listeners.\r\n     * Note: caller shall register its own listeners on cloned graph.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the chart is not cloneable.\r\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1693,col 54)",
        "(line 1695,col 9)-(line 1695,col 76)",
        "(line 1700,col 9)-(line 1703,col 9)",
        "(line 1705,col 9)-(line 1705,col 42)",
        "(line 1706,col 9)-(line 1710,col 9)",
        "(line 1712,col 9)-(line 1715,col 9)",
        "(line 1717,col 9)-(line 1717,col 58)",
        "(line 1718,col 9)-(line 1718,col 56)",
        "(line 1719,col 9)-(line 1719,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JFreeChartInfo",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.ui.ProjectInfo"
      ],
      "begin_line": 1728,
      "end_line": 1865,
      "comment": "\r\n * Information about the JFreeChart project.  One instance of this class is \r\n * assigned to \u003ccode\u003eJFreeChart.INFO\u003ccode\u003e.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChartInfo.JFreeChartInfo()",
      "begin_line": 1733,
      "end_line": 1841,
      "comment": " \r\n     * Default constructor. \r\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1737,col 66)",
        "(line 1738,col 9)-(line 1738,col 79)",
        "(line 1740,col 9)-(line 1740,col 53)",
        "(line 1741,col 9)-(line 1741,col 59)",
        "(line 1742,col 9)-(line 1742,col 53)",
        "(line 1743,col 9)-(line 1743,col 63)",
        "(line 1744,col 9)-(line 1744,col 22)",
        "(line 1745,col 9)-(line 1745,col 31)",
        "(line 1746,col 9)-(line 1746,col 57)",
        "(line 1748,col 9)-(line 1839,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChartInfo.getLogo()",
      "begin_line": 1848,
      "end_line": 1863,
      "comment": "\r\n     * Returns the JFreeChart logo (a picture of a gorilla).\r\n     *\r\n     * @return The JFreeChart logo.\r\n     ",
      "child_ranges": [
        "(line 1850,col 9)-(line 1850,col 37)",
        "(line 1851,col 9)-(line 1860,col 9)",
        "(line 1861,col 9)-(line 1861,col 20)"
      ]
    }
  ]
}