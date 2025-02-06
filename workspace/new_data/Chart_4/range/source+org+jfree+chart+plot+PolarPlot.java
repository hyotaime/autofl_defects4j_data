{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/PolarPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolarPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 105,
      "end_line": 1306,
      "comment": "\r\n * Plots data that is in (theta, radius) pairs where\r\n * theta equal to zero is due north and increases clockwise.\r\n "
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
        "MARGIN"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The default margin. "
    },
    {
      "type": "field",
      "varNames": [
        "ANNOTATION_MARGIN"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The annotation margin. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ANGLE_TICK_UNIT_SIZE"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\r\n     * The default angle tick unit size.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 125,
      "end_line": 127,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 133,
      "end_line": 135,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "angleTicks"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The angles that are marked with gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "renderer"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\r\n     * Object responsible for drawing the visual representation of each point\r\n     * on the plot.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angleTickUnit"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\r\n     * The tick unit that controls the spacing between the angular grid lines.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelsVisible"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " A flag that controls whether or not the angle labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelFont"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The font used to display the angle labels - never null. "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelPaint"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The paint used to display the angle labels. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlinesVisible"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " A flag that controls whether the angular grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlineStroke"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " The stroke used to draw the angular grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlinePaint"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The paint used to draw the angular grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlinesVisible"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " A flag that controls whether the radius grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlineStroke"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The stroke used to draw the radius grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlinePaint"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The paint used to draw the radius grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "cornerTextItems"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The annotations for the plot. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PolarPlot.PolarPlot()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PolarPlot.PolarPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.PolarItemRenderer)",
      "begin_line": 203,
      "end_line": 234,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param radiusAxis  the radius axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 16)",
        "(line 209,col 9)-(line 209,col 31)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 78)",
        "(line 215,col 9)-(line 215,col 31)",
        "(line 216,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 33)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 42)",
        "(line 228,col 9)-(line 228,col 59)",
        "(line 229,col 9)-(line 229,col 57)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 232,col 60)",
        "(line 233,col 9)-(line 233,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.addCornerTextItem(java.lang.String)",
      "begin_line": 244,
      "end_line": 250,
      "comment": "\r\n     * Add text to be displayed in the lower right hand corner and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text to display (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 39)",
        "(line 249,col 9)-(line 249,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.removeCornerTextItem(java.lang.String)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\r\n     * Remove the given text from the list of corner text items and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text to remove (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #addCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 60)",
        "(line 262,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.clearCornerTextItems()",
      "begin_line": 274,
      "end_line": 279,
      "comment": "\r\n     * Clear the list of corner text items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #addCornerTextItem(String)\r\n     * @see #removeCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getPlotType()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 287,col 8)-(line 287,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAxis()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the axis for the plot.\r\n     *\r\n     * @return The radius axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 307,
      "end_line": 323,
      "comment": "\r\n     * Sets the axis for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 25)",
        "(line 318,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getDataset()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 344,
      "end_line": 362,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there\r\n     * is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 42)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 78)",
        "(line 361,col 9)-(line 361,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRenderer()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n     * Returns the item renderer.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(PolarItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRenderer(org.jfree.chart.renderer.PolarItemRenderer)",
      "begin_line": 385,
      "end_line": 396,
      "comment": "\r\n     * Sets the item renderer, and notifies all listeners of a change to the\r\n     * plot.\r\n     * \u003cP\u003e\r\n     * If the renderer is set to \u003ccode\u003enull\u003c/code\u003e, no chart will be drawn.\r\n     *\r\n     * @param renderer  the new renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 33)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 395,col 9)-(line 395,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleTickUnit()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\r\n     * Returns the tick unit that controls the spacing of the angular grid\r\n     * lines.\r\n     *\r\n     * @return The tick unit (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\r\n     * Sets the tick unit that controls the spacing of the angular grid\r\n     * lines, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param unit  the tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 34)",
        "(line 423,col 9)-(line 423,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isAngleLabelsVisible()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\r\n     * Returns a flag that controls whether or not the angle labels are visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setAngleLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelsVisible(boolean)",
      "begin_line": 445,
      "end_line": 450,
      "comment": "\r\n     * Sets the flag that controls whether or not the angle labels are visible,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isAngleLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleLabelFont()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\r\n     * Returns the font used to display the angle labels.\r\n     *\r\n     * @return A font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelFont(java.awt.Font)",
      "begin_line": 471,
      "end_line": 477,
      "comment": "\r\n     * Sets the font used to display the angle labels and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAngleLabelFont()\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 476,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleLabelPaint()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\r\n     * Returns the paint used to display the angle labels.\r\n     *\r\n     * @return A paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelPaint(java.awt.Paint)",
      "begin_line": 496,
      "end_line": 502,
      "comment": "\r\n     * Sets the paint used to display the angle labels and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 37)",
        "(line 501,col 9)-(line 501,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isAngleGridlinesVisible()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the angular gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setAngleGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlinesVisible(boolean)",
      "begin_line": 527,
      "end_line": 532,
      "comment": "\r\n     * Sets the flag that controls whether or not the angular grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isAngleGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleGridlineStroke()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * angular axis.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlineStroke(java.awt.Stroke)",
      "begin_line": 556,
      "end_line": 559,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the angular axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getAngleGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 42)",
        "(line 558,col 9)-(line 558,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleGridlinePaint()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the\r\n     * angular axis.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlinePaint(java.awt.Paint)",
      "begin_line": 582,
      "end_line": 585,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the angular axis.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getAngleGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 40)",
        "(line 584,col 9)-(line 584,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isRadiusGridlinesVisible()",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the radius axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setRadiusGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlinesVisible(boolean)",
      "begin_line": 610,
      "end_line": 615,
      "comment": "\r\n     * Sets the flag that controls whether or not the radius axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRadiusGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRadiusGridlineStroke()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * radius axis.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRadiusGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlineStroke(java.awt.Stroke)",
      "begin_line": 639,
      "end_line": 642,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the radius axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRadiusGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 43)",
        "(line 641,col 9)-(line 641,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRadiusGridlinePaint()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the radius\r\n     * axis.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRadiusGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlinePaint(java.awt.Paint)",
      "begin_line": 666,
      "end_line": 669,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the radius axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRadiusGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 41)",
        "(line 668,col 9)-(line 668,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.refreshAngleTicks()",
      "begin_line": 678,
      "end_line": 688,
      "comment": "\r\n     * Generates a list of tick values for the angular tick marks.\r\n     *\r\n     * @return A list of {@link NumberTick} instances.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 37)",
        "(line 680,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 710,
      "end_line": 763,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This plot relies on a {@link PolarItemRenderer} to draw each\r\n     * item in the plot.  This allows the visual representation of the data to\r\n     * be changed easily.\r\n     * \u003cP\u003e\r\n     * The optional info argument collects information about the rendering of\r\n     * the plot (dimensions, tooltip information etc).  Just pass in\r\n     * \u003ccode\u003enull\u003c/code\u003e if you do not need this information.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes and\r\n     *              labels) should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  ignored.\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 64)",
        "(line 718,col 9)-(line 718,col 66)",
        "(line 719,col 9)-(line 721,col 9)",
        "(line 724,col 9)-(line 726,col 9)",
        "(line 729,col 9)-(line 729,col 45)",
        "(line 730,col 9)-(line 730,col 26)",
        "(line 732,col 9)-(line 732,col 36)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 738,col 9)-(line 738,col 37)",
        "(line 739,col 9)-(line 740,col 53)",
        "(line 741,col 9)-(line 742,col 45)",
        "(line 743,col 9)-(line 743,col 55)",
        "(line 744,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 34)",
        "(line 762,col 9)-(line 762,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawCornerTextItems(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 771,
      "end_line": 803,
      "comment": "\r\n     * Draws the corner text items.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 776,col 33)",
        "(line 777,col 9)-(line 777,col 27)",
        "(line 778,col 9)-(line 778,col 28)",
        "(line 779,col 9)-(line 785,col 9)",
        "(line 787,col 9)-(line 787,col 46)",
        "(line 788,col 9)-(line 788,col 40)",
        "(line 789,col 9)-(line 789,col 22)",
        "(line 790,col 9)-(line 790,col 23)",
        "(line 792,col 9)-(line 792,col 42)",
        "(line 793,col 9)-(line 793,col 43)",
        "(line 794,col 9)-(line 794,col 65)",
        "(line 795,col 9)-(line 795,col 31)",
        "(line 796,col 9)-(line 802,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawAxis(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 814,
      "end_line": 818,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     *\r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 817,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 829,
      "end_line": 845,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current m_Renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param info  an optional object for collection dimension\r\n     *              information (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List, java.util.List)",
      "begin_line": 855,
      "end_line": 882,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param angularTicks  the ticks for the angular axis.\r\n     * @param radialTicks  the ticks for the radial axis.\r\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 861,col 9)",
        "(line 864,col 9)-(line 871,col 9)",
        "(line 874,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoom(double)",
      "begin_line": 889,
      "end_line": 899,
      "comment": "\r\n     * Zooms the axis ranges by the specified percentage about the anchor point.\r\n     *\r\n     * @param percent  the amount of the zoom.\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 908,
      "end_line": 915,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 28)",
        "(line 910,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 924,
      "end_line": 936,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s m_Dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 928,col 9)",
        "(line 930,col 9)-(line 935,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\r\n     * Notifies all registered listeners of a property change.\r\n     * \u003cP\u003e\r\n     * One source of property change events is the plot\u0027s m_Renderer.\r\n     *\r\n     * @param event  information about the property change.\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getSeriesCount()",
      "begin_line": 955,
      "end_line": 962,
      "comment": "\r\n     * Returns the number of series in the dataset for this plot.  If the\r\n     * dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 23)",
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 961,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getLegendItems()",
      "begin_line": 971,
      "end_line": 985,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s m_Renderer, since the m_Renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 65)",
        "(line 975,col 9)-(line 983,col 9)",
        "(line 984,col 9)-(line 984,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.equals(java.lang.Object)",
      "begin_line": 994,
      "end_line": 1047,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1001,col 41)",
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1016,col 9)",
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1046,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.clone()",
      "begin_line": 1057,
      "end_line": 1078,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 52)",
        "(line 1060,col 9)-(line 1064,col 9)",
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1070,col 9)-(line 1073,col 9)",
        "(line 1075,col 9)-(line 1075,col 68)",
        "(line 1077,col 9)-(line 1077,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1087,
      "end_line": 1094,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 36)",
        "(line 1089,col 9)-(line 1089,col 70)",
        "(line 1090,col 9)-(line 1090,col 68)",
        "(line 1091,col 9)-(line 1091,col 71)",
        "(line 1092,col 9)-(line 1092,col 69)",
        "(line 1093,col 9)-(line 1093,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1104,
      "end_line": 1122,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 35)",
        "(line 1108,col 9)-(line 1108,col 70)",
        "(line 1109,col 9)-(line 1109,col 68)",
        "(line 1110,col 9)-(line 1110,col 71)",
        "(line 1111,col 9)-(line 1111,col 69)",
        "(line 1112,col 9)-(line 1112,col 65)",
        "(line 1114,col 9)-(line 1117,col 9)",
        "(line 1119,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1132,
      "end_line": 1135,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1148,
      "end_line": 1151,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1162,
      "end_line": 1165,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1174,
      "end_line": 1177,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1191,
      "end_line": 1206,
      "comment": "\r\n     * Multiplies the range on the range axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1216,
      "end_line": 1219,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isDomainZoomable()",
      "begin_line": 1226,
      "end_line": 1228,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e always.\r\n     *\r\n     * @return \u003ccode\u003efalse\u003c/code\u003e always.\r\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isRangeZoomable()",
      "begin_line": 1235,
      "end_line": 1237,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axis is zoomable.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getOrientation()",
      "begin_line": 1244,
      "end_line": 1246,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation.\r\n     ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1245,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getMaxRadius()",
      "begin_line": 1253,
      "end_line": 1255,
      "comment": "\r\n     * Returns the upper bound of the radius axis.\r\n     *\r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.translateValueThetaRadiusToJava2D(double, double, java.awt.geom.Rectangle2D)",
      "begin_line": 1268,
      "end_line": 1304,
      "comment": "\r\n     * Translates a (theta, radius) pair into Java2D coordinates.  If\r\n     * \u003ccode\u003eradius\u003c/code\u003e is less than the lower bound of the axis, then\r\n     * this method returns the centre point.\r\n     *\r\n     * @param angleDegrees  the angle in degrees.\r\n     * @param radius  the radius.\r\n     * @param dataArea  the data area.\r\n     *\r\n     * @return A point in Java2D space.\r\n     ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 61)",
        "(line 1274,col 9)-(line 1274,col 50)",
        "(line 1275,col 9)-(line 1275,col 50)",
        "(line 1276,col 9)-(line 1276,col 50)",
        "(line 1277,col 9)-(line 1277,col 50)",
        "(line 1279,col 9)-(line 1279,col 37)",
        "(line 1280,col 9)-(line 1280,col 37)",
        "(line 1281,col 9)-(line 1281,col 51)",
        "(line 1283,col 9)-(line 1283,col 43)",
        "(line 1284,col 9)-(line 1284,col 43)",
        "(line 1286,col 9)-(line 1286,col 51)",
        "(line 1287,col 9)-(line 1287,col 41)",
        "(line 1288,col 9)-(line 1288,col 58)",
        "(line 1290,col 9)-(line 1290,col 53)",
        "(line 1291,col 9)-(line 1291,col 53)",
        "(line 1293,col 9)-(line 1294,col 40)",
        "(line 1295,col 9)-(line 1296,col 40)",
        "(line 1298,col 9)-(line 1298,col 31)",
        "(line 1299,col 9)-(line 1299,col 31)",
        "(line 1301,col 9)-(line 1301,col 36)",
        "(line 1302,col 9)-(line 1302,col 17)"
      ]
    }
  ]
}