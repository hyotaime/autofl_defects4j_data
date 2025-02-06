{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/JFreeChart.java",
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
      "begin_line": 246,
      "end_line": 1739,
      "comment": "\r\n * A chart class implemented using the Java 2D APIs.  The current version\r\n * supports bar charts, line charts, pie charts and xy plots (including time\r\n * series data).\r\n * \u003cP\u003e\r\n * JFreeChart coordinates several objects to achieve its aim of being able to\r\n * draw a chart on a Java 2D graphics device: a list of {@link Title} objects\r\n * (which often includes the chart\u0027s legend), a {@link Plot} and a\r\n * {@link org.jfree.data.general.Dataset} (the plot in turn manages a\r\n * domain axis and a range axis).\r\n * \u003cP\u003e\r\n * You should use a {@link ChartPanel} to display a chart in a GUI.\r\n * \u003cP\u003e\r\n * The {@link ChartFactory} class contains static methods for creating\r\n * \u0027ready-made\u0027 charts.\r\n *\r\n * @see ChartPanel\r\n * @see ChartFactory\r\n * @see Title\r\n * @see Plot\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "INFO"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " Information about the project. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TITLE_FONT"
      ],
      "begin_line": 259,
      "end_line": 260,
      "comment": " The default font for titles. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_PAINT"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " The default background color. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_IMAGE"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " The default background image. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_IMAGE_ALIGNMENT"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The default background image alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BACKGROUND_IMAGE_ALPHA"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The default background image alpha. "
    },
    {
      "type": "field",
      "varNames": [
        "renderingHints"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": "\r\n     * Rendering hints that will be used for chart drawing.  This should never\r\n     * be \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "borderVisible"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " A flag that controls whether or not the chart border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "borderStroke"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The stroke used to draw the chart border (if visible). "
    },
    {
      "type": "field",
      "varNames": [
        "borderPaint"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The paint used to draw the chart border (if visible). "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The padding between the chart border and the chart drawing area. "
    },
    {
      "type": "field",
      "varNames": [
        "title"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " The chart title (optional). "
    },
    {
      "type": "field",
      "varNames": [
        "subtitles"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": "\r\n     * The chart subtitles (zero, one or many).  This field should never be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " Draws the visual representation of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Paint used to draw the background of the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImage"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " todo: not serialized yet"
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlignment"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " The alignment for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundImageAlpha"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " The alpha transparency for the background image. "
    },
    {
      "type": "field",
      "varNames": [
        "changeListeners"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "progressListeners"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Storage for registered progress listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": "\r\n     * A flag that can be used to enable/disable notification of chart change\r\n     * events.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChart.JFreeChart(org.jfree.chart.plot.Plot)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\r\n     * Creates a new chart based on the supplied plot.  The chart will have\r\n     * a legend added automatically, but no title (although you can easily add\r\n     * one later).\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the  {@link ChartFactory} class contains a range\r\n     * of static methods that will return ready-made charts, and often this\r\n     * is a more convenient way to create charts than using this constructor.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChart.JFreeChart(java.lang.String, org.jfree.chart.plot.Plot)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Creates a new chart with the given title and plot.  A default font\r\n     * ({@link #DEFAULT_TITLE_FONT}) is used for the title, and the chart will\r\n     * have a legend added automatically.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the {@link ChartFactory} class contains a range\r\n     * of static methods that will return ready-made charts, and often this\r\n     * is a more convenient way to create charts than using this constructor.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChart.JFreeChart(java.lang.String, java.awt.Font, org.jfree.chart.plot.Plot, boolean)",
      "begin_line": 376,
      "end_line": 430,
      "comment": "\r\n     * Creates a new chart with the given title and plot.  The\r\n     * \u003ccode\u003ecreateLegend\u003c/code\u003e argument specifies whether or not a legend\r\n     * should be added to the chart.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the  {@link ChartFactory} class contains a range\r\n     * of static methods that will return ready-made charts, and often this\r\n     * is a more convenient way to create charts than using this constructor.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param titleFont  the font for displaying the chart title\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param plot  controller of the visual representation of the data\r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param createLegend  a flag indicating whether or not a legend should\r\n     *                      be created for the chart.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 384,col 9)-(line 384,col 57)",
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 386,col 27)",
        "(line 389,col 9)-(line 391,col 51)",
        "(line 393,col 9)-(line 393,col 35)",
        "(line 394,col 9)-(line 394,col 50)",
        "(line 395,col 9)-(line 395,col 39)",
        "(line 397,col 9)-(line 397,col 51)",
        "(line 399,col 9)-(line 399,col 25)",
        "(line 400,col 9)-(line 400,col 37)",
        "(line 402,col 9)-(line 402,col 41)",
        "(line 405,col 9)-(line 413,col 9)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 56)",
        "(line 426,col 9)-(line 426,col 56)",
        "(line 427,col 9)-(line 427,col 75)",
        "(line 428,col 9)-(line 428,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getRenderingHints()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\r\n     * Returns the collection of rendering hints for the chart.\r\n     *\r\n     * @return The rendering hints for the chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderingHints(RenderingHints)\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setRenderingHints(java.awt.RenderingHints)",
      "begin_line": 453,
      "end_line": 459,
      "comment": "\r\n     * Sets the rendering hints for the chart.  These will be added (using the\r\n     * Graphics2D.addRenderingHints() method) near the start of the\r\n     * JFreeChart.draw() method.\r\n     *\r\n     * @param renderingHints  the rendering hints (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                        permitted).\r\n     *\r\n     * @see #getRenderingHints()\r\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 45)",
        "(line 458,col 9)-(line 458,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.isBorderVisible()",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\r\n     * Returns a flag that controls whether or not a border is drawn around the\r\n     * outside of the chart.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setBorderVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBorderVisible(boolean)",
      "begin_line": 481,
      "end_line": 484,
      "comment": "\r\n     * Sets a flag that controls whether or not a border is drawn around the\r\n     * outside of the chart.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isBorderVisible()\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 37)",
        "(line 483,col 9)-(line 483,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBorderStroke()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\r\n     * Returns the stroke used to draw the chart border (if visible).\r\n     *\r\n     * @return The border stroke.\r\n     *\r\n     * @see #setBorderStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBorderStroke(java.awt.Stroke)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\r\n     * Sets the stroke used to draw the chart border (if visible).\r\n     *\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @see #getBorderStroke()\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 35)",
        "(line 506,col 9)-(line 506,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBorderPaint()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\r\n     * Returns the paint used to draw the chart border (if visible).\r\n     *\r\n     * @return The border paint.\r\n     *\r\n     * @see #setBorderPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBorderPaint(java.awt.Paint)",
      "begin_line": 527,
      "end_line": 530,
      "comment": "\r\n     * Sets the paint used to draw the chart border (if visible).\r\n     *\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #getBorderPaint()\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 33)",
        "(line 529,col 9)-(line 529,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getPadding()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\r\n     * Returns the padding between the chart border and the chart drawing area.\r\n     *\r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 551,
      "end_line": 557,
      "comment": "\r\n     * Sets the padding between the chart border and the chart drawing area,\r\n     * and sends a {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPadding()\r\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 31)",
        "(line 556,col 9)-(line 556,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getTitle()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\r\n     * Returns the main chart title.  Very often a chart will have just one\r\n     * title, so we make this case simple by providing accessor methods for\r\n     * the main title.  However, multiple titles are supported - see the\r\n     * {@link #addSubtitle(Title)} method.\r\n     *\r\n     * @return The chart title (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTitle(TextTitle)\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTitle(org.jfree.chart.title.TextTitle)",
      "begin_line": 583,
      "end_line": 592,
      "comment": "\r\n     * Sets the main title for the chart and sends a {@link ChartChangeEvent}\r\n     * to all registered listeners.  If you do not want a title for the\r\n     * chart, set it to \u003ccode\u003enull\u003c/code\u003e.  If you want more than one title on\r\n     * a chart, use the {@link #addSubtitle(Title)} method.\r\n     *\r\n     * @param title  the title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getTitle()\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 27)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTitle(java.lang.String)",
      "begin_line": 606,
      "end_line": 618,
      "comment": "\r\n     * Sets the chart title and sends a {@link ChartChangeEvent} to all\r\n     * registered listeners.  This is a convenience method that ends up calling\r\n     * the {@link #setTitle(TextTitle)} method.  If there is an existing title,\r\n     * its text is updated, otherwise a new title using the default font is\r\n     * added to the chart.  If \u003ccode\u003etext\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e the chart\r\n     * title is set to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param text  the title text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getTitle()\r\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addLegend(org.jfree.chart.title.LegendTitle)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\r\n     * Adds a legend to the plot and sends a {@link ChartChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param legend  the legend (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeLegend()\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getLegend()",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\r\n     * Returns the legend for the chart, if there is one.  Note that a chart\r\n     * can have more than one legend - this method returns the first.\r\n     *\r\n     * @return The legend (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegend(int)\r\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getLegend(int)",
      "begin_line": 653,
      "end_line": 668,
      "comment": "\r\n     * Returns the nth legend for a chart, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the legend index (zero-based).\r\n     *\r\n     * @return The legend (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addLegend(LegendTitle)\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 21)",
        "(line 655,col 9)-(line 655,col 54)",
        "(line 656,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeLegend()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\r\n     * Removes the first legend in the chart and sends a\r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #getLegend()\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getSubtitles()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\r\n     * Returns the list of subtitles for the chart.\r\n     *\r\n     * @return The subtitle list (possibly empty, but never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSubtitles(List)\r\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setSubtitles(java.util.List)",
      "begin_line": 701,
      "end_line": 715,
      "comment": "\r\n     * Sets the title list for the chart (completely replaces any existing\r\n     * titles) and sends a {@link ChartChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param subtitles  the new list of subtitles (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                   permitted).\r\n     *\r\n     * @see #getSubtitles()\r\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 25)",
        "(line 706,col 9)-(line 706,col 25)",
        "(line 707,col 9)-(line 707,col 49)",
        "(line 708,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getSubtitleCount()",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\r\n     * Returns the number of titles for the chart.\r\n     *\r\n     * @return The number of titles for the chart.\r\n     *\r\n     * @see #getSubtitles()\r\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getSubtitle(int)",
      "begin_line": 737,
      "end_line": 742,
      "comment": "\r\n     * Returns a chart subtitle.\r\n     *\r\n     * @param index  the index of the chart subtitle (zero based).\r\n     *\r\n     * @return A chart subtitle.\r\n     *\r\n     * @see #addSubtitle(Title)\r\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addSubtitle(org.jfree.chart.title.Title)",
      "begin_line": 752,
      "end_line": 759,
      "comment": "\r\n     * Adds a chart subtitle, and notifies registered listeners that the chart\r\n     * has been modified.\r\n     *\r\n     * @param subtitle  the subtitle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubtitle(int)\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 37)",
        "(line 757,col 9)-(line 757,col 41)",
        "(line 758,col 9)-(line 758,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addSubtitle(int, org.jfree.chart.title.Title)",
      "begin_line": 770,
      "end_line": 781,
      "comment": "\r\n     * Adds a subtitle at a particular position in the subtitle list, and sends\r\n     * a {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index (in the range 0 to {@link #getSubtitleCount()}).\r\n     * @param subtitle  the subtitle to add (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 44)",
        "(line 779,col 9)-(line 779,col 41)",
        "(line 780,col 9)-(line 780,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.clearSubtitles()",
      "begin_line": 789,
      "end_line": 797,
      "comment": "\r\n     * Clears all subtitles from the chart and sends a {@link ChartChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #addSubtitle(Title)\r\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 54)",
        "(line 791,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 31)",
        "(line 796,col 9)-(line 796,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeSubtitle(org.jfree.chart.title.Title)",
      "begin_line": 807,
      "end_line": 810,
      "comment": "\r\n     * Removes the specified subtitle and sends a {@link ChartChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param title  the title.\r\n     *\r\n     * @see #addSubtitle(Title)\r\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 37)",
        "(line 809,col 9)-(line 809,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getPlot()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\r\n     * Returns the plot for the chart.  The plot is a class responsible for\r\n     * coordinating the visual representation of the data, including the axes\r\n     * (if any).\r\n     *\r\n     * @return The plot.\r\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getCategoryPlot()",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\r\n     * Returns the plot cast as a {@link CategoryPlot}.\r\n     * \u003cp\u003e\r\n     * NOTE: if the plot is not an instance of {@link CategoryPlot}, then a\r\n     * \u003ccode\u003eClassCastException\u003c/code\u003e is thrown.\r\n     *\r\n     * @return The plot.\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getXYPlot()",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\r\n     * Returns the plot cast as an {@link XYPlot}.\r\n     * \u003cp\u003e\r\n     * NOTE: if the plot is not an instance of {@link XYPlot}, then a\r\n     * \u003ccode\u003eClassCastException\u003c/code\u003e is thrown.\r\n     *\r\n     * @return The plot.\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getAntiAlias()",
      "begin_line": 859,
      "end_line": 862,
      "comment": "\r\n     * Returns a flag that indicates whether or not anti-aliasing is used when\r\n     * the chart is drawn.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setAntiAlias(boolean)\r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 78)",
        "(line 861,col 9)-(line 861,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setAntiAlias(boolean)",
      "begin_line": 874,
      "end_line": 895,
      "comment": "\r\n     * Sets a flag that indicates whether or not anti-aliasing is used when the\r\n     * chart is drawn.\r\n     * \u003cP\u003e\r\n     * Anti-aliasing usually improves the appearance of charts, but is slower.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #getAntiAlias()\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 78)",
        "(line 877,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getTextAntiAlias()",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\r\n     * Returns the current value stored in the rendering hints table for\r\n     * {@link RenderingHints#KEY_TEXT_ANTIALIASING}.\r\n     *\r\n     * @return The hint value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setTextAntiAlias(Object)\r\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTextAntiAlias(boolean)",
      "begin_line": 925,
      "end_line": 932,
      "comment": "\r\n     * Sets the value in the rendering hints table for\r\n     * {@link RenderingHints#KEY_TEXT_ANTIALIASING} to either\r\n     * {@link RenderingHints#VALUE_TEXT_ANTIALIAS_ON} or\r\n     * {@link RenderingHints#VALUE_TEXT_ANTIALIAS_OFF}, then sends a\r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getTextAntiAlias()\r\n     * @see #setTextAntiAlias(Object)\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setTextAntiAlias(java.lang.Object)",
      "begin_line": 946,
      "end_line": 949,
      "comment": "\r\n     * Sets the value in the rendering hints table for\r\n     * {@link RenderingHints#KEY_TEXT_ANTIALIASING} and sends a\r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param val  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getTextAntiAlias()\r\n     * @see #setTextAntiAlias(boolean)\r\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 75)",
        "(line 948,col 9)-(line 948,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundPaint()",
      "begin_line": 958,
      "end_line": 960,
      "comment": "\r\n     * Returns the paint used for the chart background.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 970,
      "end_line": 985,
      "comment": "\r\n     * Sets the paint used to fill the chart background and sends a\r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 983,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundImage()",
      "begin_line": 995,
      "end_line": 997,
      "comment": "\r\n     * Returns the background image for the chart, or \u003ccode\u003enull\u003c/code\u003e if\r\n     * there is no image.\r\n     *\r\n     * @return The image (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundImage(Image)\r\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundImage(java.awt.Image)",
      "begin_line": 1007,
      "end_line": 1022,
      "comment": "\r\n     * Sets the background image for the chart and sends a\r\n     * {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundImage()\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1020,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundImageAlignment()",
      "begin_line": 1033,
      "end_line": 1035,
      "comment": "\r\n     * Returns the background image alignment. Alignment constants are defined\r\n     * in the \u003ccode\u003eorg.jfree.ui.Align\u003c/code\u003e class in the JCommon class\r\n     * library.\r\n     *\r\n     * @return The alignment.\r\n     *\r\n     * @see #setBackgroundImageAlignment(int)\r\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundImageAlignment(int)",
      "begin_line": 1045,
      "end_line": 1050,
      "comment": "\r\n     * Sets the background alignment.  Alignment options are defined by the\r\n     * {@link Align} class.\r\n     *\r\n     * @param alignment  the alignment.\r\n     *\r\n     * @see #getBackgroundImageAlignment()\r\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1049,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.getBackgroundImageAlpha()",
      "begin_line": 1059,
      "end_line": 1061,
      "comment": "\r\n     * Returns the alpha-transparency for the chart\u0027s background image.\r\n     *\r\n     * @return The alpha-transparency.\r\n     *\r\n     * @see #setBackgroundImageAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setBackgroundImageAlpha(float)",
      "begin_line": 1071,
      "end_line": 1078,
      "comment": "\r\n     * Sets the alpha-transparency for the chart\u0027s background image.\r\n     * Registered listeners are notified that the chart has been changed.\r\n     *\r\n     * @param alpha  the alpha value.\r\n     *\r\n     * @see #getBackgroundImageAlpha()\r\n     ",
      "child_ranges": [
        "(line 1073,col 9)-(line 1076,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.isNotify()",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "\r\n     * Returns a flag that controls whether or not change events are sent to\r\n     * registered listeners.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setNotify(boolean)\r\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.setNotify(boolean)",
      "begin_line": 1100,
      "end_line": 1106,
      "comment": "\r\n     * Sets a flag that controls whether or not listeners receive\r\n     * {@link ChartChangeEvent} notifications.\r\n     *\r\n     * @param notify  a boolean.\r\n     *\r\n     * @see #isNotify()\r\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 29)",
        "(line 1103,col 9)-(line 1105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1117,
      "end_line": 1119,
      "comment": "\r\n     * Draws the chart on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This method is the focus of the entire JFreeChart library.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the chart should be drawn.\r\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "\r\n     * Draws the chart on a Java 2D graphics device (such as the screen or a\r\n     * printer).  This method is the focus of the entire JFreeChart library.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the chart should be drawn.\r\n     * @param info  records info about the drawing (null means collect no info).\r\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1145,
      "end_line": 1242,
      "comment": "\r\n     * Draws the chart on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This method is the focus of the entire JFreeChart library.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param chartArea  the area within which the chart should be drawn.\r\n     * @param anchor  the anchor point (in Java2D space) for the chart\r\n     *                (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  records info about the drawing (null means collect no info).\r\n     ",
      "child_ranges": [
        "(line 1149,col 9)-(line 1150,col 56)",
        "(line 1152,col 9)-(line 1152,col 41)",
        "(line 1154,col 9)-(line 1158,col 9)",
        "(line 1159,col 9)-(line 1162,col 9)",
        "(line 1165,col 9)-(line 1165,col 39)",
        "(line 1166,col 9)-(line 1166,col 27)",
        "(line 1168,col 9)-(line 1168,col 50)",
        "(line 1171,col 9)-(line 1174,col 9)",
        "(line 1176,col 9)-(line 1188,col 9)",
        "(line 1190,col 9)-(line 1202,col 9)",
        "(line 1205,col 9)-(line 1205,col 60)",
        "(line 1206,col 9)-(line 1206,col 40)",
        "(line 1207,col 9)-(line 1207,col 40)",
        "(line 1209,col 9)-(line 1215,col 9)",
        "(line 1217,col 9)-(line 1217,col 54)",
        "(line 1218,col 9)-(line 1227,col 9)",
        "(line 1229,col 9)-(line 1229,col 44)",
        "(line 1232,col 9)-(line 1232,col 42)",
        "(line 1233,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 61)",
        "(line 1238,col 9)-(line 1238,col 30)",
        "(line 1240,col 9)-(line 1241,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createAlignedRectangle2D(org.jfree.chart.util.Size2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 1254,
      "end_line": 1280,
      "comment": "\r\n     * Creates a rectangle that is aligned to the frame.\r\n     *\r\n     * @param dimensions  the dimensions for the rectangle.\r\n     * @param frame  the frame to align to.\r\n     * @param hAlign  the horizontal alignment.\r\n     * @param vAlign  the vertical alignment.\r\n     *\r\n     * @return A rectangle.\r\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 30)",
        "(line 1258,col 9)-(line 1258,col 30)",
        "(line 1259,col 9)-(line 1267,col 9)",
        "(line 1268,col 9)-(line 1276,col 9)",
        "(line 1278,col 9)-(line 1279,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.drawTitle(org.jfree.chart.title.Title, java.awt.Graphics2D, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 1296,
      "end_line": 1364,
      "comment": "\r\n     * Draws a title.  The title should be drawn at the top, bottom, left or\r\n     * right of the specified area, and the area should be updated to reflect\r\n     * the amount of space used by the title.\r\n     *\r\n     * @param t  the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the chart area, excluding any existing titles\r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param entities  a flag that controls whether or not an entity\r\n     *                  collection is returned for the title.\r\n     *\r\n     * @return An entity collection for the title (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1299,col 9)-(line 1301,col 9)",
        "(line 1302,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1305,col 30)",
        "(line 1306,col 9)-(line 1306,col 49)",
        "(line 1307,col 9)-(line 1307,col 36)",
        "(line 1308,col 9)-(line 1310,col 9)",
        "(line 1311,col 9)-(line 1311,col 37)",
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1317,col 64)",
        "(line 1318,col 9)-(line 1318,col 31)",
        "(line 1319,col 9)-(line 1319,col 42)",
        "(line 1320,col 9)-(line 1320,col 40)",
        "(line 1321,col 9)-(line 1357,col 9)",
        "(line 1358,col 9)-(line 1358,col 39)",
        "(line 1359,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int)",
      "begin_line": 1374,
      "end_line": 1376,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1388,
      "end_line": 1392,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     * @param info  carries back chart state information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1390,col 9)-(line 1391,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1405,
      "end_line": 1413,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     * @param imageType  the image type.\r\n     * @param info  carries back chart state information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 74)",
        "(line 1409,col 9)-(line 1409,col 47)",
        "(line 1410,col 9)-(line 1410,col 74)",
        "(line 1411,col 9)-(line 1411,col 21)",
        "(line 1412,col 9)-(line 1412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.createBufferedImage(int, int, double, double, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1429,
      "end_line": 1447,
      "comment": "\r\n     * Creates and returns a buffered image into which the chart has been drawn.\r\n     *\r\n     * @param imageWidth  the image width.\r\n     * @param imageHeight  the image height.\r\n     * @param drawWidth  the width for drawing the chart (will be scaled to\r\n     *                   fit image).\r\n     * @param drawHeight  the height for drawing the chart (will be scaled to\r\n     *                    fit image).\r\n     * @param info  optional object for collection chart dimension and entity\r\n     *              information.\r\n     *\r\n     * @return A buffered image.\r\n     ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1436,col 45)",
        "(line 1437,col 9)-(line 1437,col 47)",
        "(line 1438,col 9)-(line 1438,col 47)",
        "(line 1439,col 9)-(line 1439,col 49)",
        "(line 1440,col 9)-(line 1440,col 78)",
        "(line 1441,col 9)-(line 1441,col 25)",
        "(line 1442,col 9)-(line 1443,col 22)",
        "(line 1444,col 9)-(line 1444,col 21)",
        "(line 1445,col 9)-(line 1445,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.handleClick(int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 1461,
      "end_line": 1467,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the chart.  JFreeChart is not a UI component, so\r\n     * some other object (for example, {@link ChartPanel}) needs to capture\r\n     * the click event and pass it onto the JFreeChart object.\r\n     * If you are not using JFreeChart in a client application, then this\r\n     * method is not required.\r\n     *\r\n     * @param x  x-coordinate of the click (in Java2D space).\r\n     * @param y  y-coordinate of the click (in Java2D space).\r\n     * @param info  contains chart dimension and entity information\r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1465,col 9)-(line 1465,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addChangeListener(org.jfree.chart.event.ChartChangeListener)",
      "begin_line": 1476,
      "end_line": 1481,
      "comment": "\r\n     * Registers an object for notification of changes to the chart.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeChangeListener(ChartChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1479,col 9)",
        "(line 1480,col 9)-(line 1480,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeChangeListener(org.jfree.chart.event.ChartChangeListener)",
      "begin_line": 1490,
      "end_line": 1495,
      "comment": "\r\n     * Deregisters an object for notification of changes to the chart.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted)\r\n     *\r\n     * @see #addChangeListener(ChartChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1494,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.fireChartChanged()",
      "begin_line": 1502,
      "end_line": 1505,
      "comment": "\r\n     * Sends a default {@link ChartChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * This method is for convenience only.\r\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 60)",
        "(line 1504,col 9)-(line 1504,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.notifyListeners(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 1513,
      "end_line": 1523,
      "comment": "\r\n     * Sends a {@link ChartChangeEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the event that triggered the\r\n     *               notification.\r\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1522,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.addProgressListener(org.jfree.chart.event.ChartProgressListener)",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\r\n     * Registers an object for notification of progress events relating to the\r\n     * chart.\r\n     *\r\n     * @param listener  the object being registered.\r\n     *\r\n     * @see #removeProgressListener(ChartProgressListener)\r\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.removeProgressListener(org.jfree.chart.event.ChartProgressListener)",
      "begin_line": 1544,
      "end_line": 1546,
      "comment": "\r\n     * Deregisters an object for notification of changes to the chart.\r\n     *\r\n     * @param listener  the object being deregistered.\r\n     *\r\n     * @see #addProgressListener(ChartProgressListener)\r\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1545,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.notifyListeners(org.jfree.chart.event.ChartProgressEvent)",
      "begin_line": 1554,
      "end_line": 1563,
      "comment": "\r\n     * Sends a {@link ChartProgressEvent} to all registered listeners.\r\n     *\r\n     * @param event  information about the event that triggered the\r\n     *               notification.\r\n     ",
      "child_ranges": [
        "(line 1556,col 9)-(line 1556,col 70)",
        "(line 1557,col 9)-(line 1561,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.titleChanged(org.jfree.chart.event.TitleChangeEvent)",
      "begin_line": 1571,
      "end_line": 1574,
      "comment": "\r\n     * Receives notification that a chart title has changed, and passes this\r\n     * on to registered listeners.\r\n     *\r\n     * @param event  information about the chart title change.\r\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 29)",
        "(line 1573,col 9)-(line 1573,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.plotChanged(org.jfree.chart.event.PlotChangeEvent)",
      "begin_line": 1582,
      "end_line": 1585,
      "comment": "\r\n     * Receives notification that the plot has changed, and passes this on to\r\n     * registered listeners.\r\n     *\r\n     * @param event  information about the plot change.\r\n     ",
      "child_ranges": [
        "(line 1583,col 9)-(line 1583,col 29)",
        "(line 1584,col 9)-(line 1584,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.equals(java.lang.Object)",
      "begin_line": 1594,
      "end_line": 1645,
      "comment": "\r\n     * Tests this chart for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1595,col 9)-(line 1597,col 9)",
        "(line 1598,col 9)-(line 1600,col 9)",
        "(line 1601,col 9)-(line 1601,col 43)",
        "(line 1602,col 9)-(line 1604,col 9)",
        "(line 1605,col 9)-(line 1607,col 9)",
        "(line 1608,col 9)-(line 1610,col 9)",
        "(line 1611,col 9)-(line 1613,col 9)",
        "(line 1614,col 9)-(line 1616,col 9)",
        "(line 1617,col 9)-(line 1619,col 9)",
        "(line 1620,col 9)-(line 1622,col 9)",
        "(line 1623,col 9)-(line 1625,col 9)",
        "(line 1626,col 9)-(line 1630,col 9)",
        "(line 1631,col 9)-(line 1634,col 9)",
        "(line 1635,col 9)-(line 1637,col 9)",
        "(line 1638,col 9)-(line 1640,col 9)",
        "(line 1641,col 9)-(line 1643,col 9)",
        "(line 1644,col 9)-(line 1644,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1654,
      "end_line": 1659,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1655,col 36)",
        "(line 1656,col 9)-(line 1656,col 63)",
        "(line 1657,col 9)-(line 1657,col 61)",
        "(line 1658,col 9)-(line 1658,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.readObject(java.io.ObjectInputStream)",
      "begin_line": 1669,
      "end_line": 1690,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1671,col 9)-(line 1671,col 35)",
        "(line 1672,col 9)-(line 1672,col 63)",
        "(line 1673,col 9)-(line 1673,col 61)",
        "(line 1674,col 9)-(line 1674,col 65)",
        "(line 1675,col 9)-(line 1675,col 57)",
        "(line 1676,col 9)-(line 1676,col 55)",
        "(line 1677,col 9)-(line 1679,col 51)",
        "(line 1682,col 9)-(line 1684,col 9)",
        "(line 1686,col 9)-(line 1688,col 9)",
        "(line 1689,col 9)-(line 1689,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.main(java.lang.String[])",
      "begin_line": 1697,
      "end_line": 1699,
      "comment": "\r\n     * Prints information about JFreeChart to standard output.\r\n     *\r\n     * @param args  no arguments are honored.\r\n     ",
      "child_ranges": [
        "(line 1698,col 9)-(line 1698,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChart.clone()",
      "begin_line": 1709,
      "end_line": 1737,
      "comment": "\r\n     * Clones the object, and takes care of listeners.\r\n     * Note: caller shall register its own listeners on cloned graph.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the chart is not cloneable.\r\n     ",
      "child_ranges": [
        "(line 1710,col 9)-(line 1710,col 54)",
        "(line 1712,col 9)-(line 1712,col 76)",
        "(line 1717,col 9)-(line 1720,col 9)",
        "(line 1722,col 9)-(line 1722,col 42)",
        "(line 1723,col 9)-(line 1727,col 9)",
        "(line 1729,col 9)-(line 1732,col 9)",
        "(line 1734,col 9)-(line 1734,col 58)",
        "(line 1735,col 9)-(line 1735,col 56)",
        "(line 1736,col 9)-(line 1736,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JFreeChartInfo",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.ui.ProjectInfo"
      ],
      "begin_line": 1745,
      "end_line": 1893,
      "comment": "\r\n * Information about the JFreeChart project.  One instance of this class is\r\n * assigned to \u003ccode\u003eJFreeChart.INFO\u003ccode\u003e.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.JFreeChartInfo.JFreeChartInfo()",
      "begin_line": 1750,
      "end_line": 1869,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 1753,col 9)-(line 1754,col 66)",
        "(line 1755,col 9)-(line 1756,col 35)",
        "(line 1758,col 9)-(line 1758,col 53)",
        "(line 1759,col 9)-(line 1759,col 59)",
        "(line 1760,col 9)-(line 1760,col 53)",
        "(line 1761,col 9)-(line 1761,col 63)",
        "(line 1762,col 9)-(line 1762,col 22)",
        "(line 1763,col 9)-(line 1763,col 31)",
        "(line 1764,col 9)-(line 1764,col 57)",
        "(line 1766,col 9)-(line 1867,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.JFreeChartInfo.getLogo()",
      "begin_line": 1876,
      "end_line": 1891,
      "comment": "\r\n     * Returns the JFreeChart logo (a picture of a gorilla).\r\n     *\r\n     * @return The JFreeChart logo.\r\n     ",
      "child_ranges": [
        "(line 1878,col 9)-(line 1878,col 37)",
        "(line 1879,col 9)-(line 1888,col 9)",
        "(line 1889,col 9)-(line 1889,col 20)"
      ]
    }
  ]
}