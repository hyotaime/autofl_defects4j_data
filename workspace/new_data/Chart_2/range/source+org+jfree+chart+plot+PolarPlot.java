{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/PolarPlot.java",
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
      "begin_line": 106,
      "end_line": 1309,
      "comment": "\r\n * Plots data that is in (theta, radius) pairs where\r\n * theta equal to zero is due north and increases clockwise.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "MARGIN"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The default margin. "
    },
    {
      "type": "field",
      "varNames": [
        "ANNOTATION_MARGIN"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The annotation margin. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ANGLE_TICK_UNIT_SIZE"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\r\n     * The default angle tick unit size.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 126,
      "end_line": 128,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 134,
      "end_line": 136,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "angleTicks"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The angles that are marked with gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "renderer"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\r\n     * Object responsible for drawing the visual representation of each point\r\n     * on the plot.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angleTickUnit"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\r\n     * The tick unit that controls the spacing between the angular grid lines.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelsVisible"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " A flag that controls whether or not the angle labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelFont"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The font used to display the angle labels - never null. "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelPaint"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The paint used to display the angle labels. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlinesVisible"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " A flag that controls whether the angular grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlineStroke"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The stroke used to draw the angular grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlinePaint"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The paint used to draw the angular grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlinesVisible"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " A flag that controls whether the radius grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlineStroke"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " The stroke used to draw the radius grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlinePaint"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The paint used to draw the radius grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "cornerTextItems"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The annotations for the plot. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PolarPlot.PolarPlot()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PolarPlot.PolarPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.PolarItemRenderer)",
      "begin_line": 204,
      "end_line": 235,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param radiusAxis  the radius axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 16)",
        "(line 210,col 9)-(line 210,col 31)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 78)",
        "(line 216,col 9)-(line 216,col 31)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 42)",
        "(line 229,col 9)-(line 229,col 59)",
        "(line 230,col 9)-(line 230,col 57)",
        "(line 232,col 9)-(line 232,col 43)",
        "(line 233,col 9)-(line 233,col 60)",
        "(line 234,col 9)-(line 234,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.addCornerTextItem(java.lang.String)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\r\n     * Add text to be displayed in the lower right hand corner and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text to display (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 250,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.removeCornerTextItem(java.lang.String)",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\r\n     * Remove the given text from the list of corner text items and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text to remove (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #addCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 60)",
        "(line 263,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.clearCornerTextItems()",
      "begin_line": 275,
      "end_line": 280,
      "comment": "\r\n     * Clear the list of corner text items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #addCornerTextItem(String)\r\n     * @see #removeCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getPlotType()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 288,col 8)-(line 288,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAxis()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\r\n     * Returns the axis for the plot.\r\n     *\r\n     * @return The radius axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 308,
      "end_line": 324,
      "comment": "\r\n     * Sets the axis for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 25)",
        "(line 319,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getDataset()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 345,
      "end_line": 365,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there\r\n     * is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 354,col 9)-(line 354,col 31)",
        "(line 355,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 362,col 41)",
        "(line 364,col 9)-(line 364,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRenderer()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\r\n     * Returns the item renderer.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(PolarItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRenderer(org.jfree.chart.renderer.PolarItemRenderer)",
      "begin_line": 388,
      "end_line": 399,
      "comment": "\r\n     * Sets the item renderer, and notifies all listeners of a change to the\r\n     * plot.\r\n     * \u003cP\u003e\r\n     * If the renderer is set to \u003ccode\u003enull\u003c/code\u003e, no chart will be drawn.\r\n     *\r\n     * @param renderer  the new renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 33)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 398,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleTickUnit()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\r\n     * Returns the tick unit that controls the spacing of the angular grid\r\n     * lines.\r\n     *\r\n     * @return The tick unit (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 421,
      "end_line": 427,
      "comment": "\r\n     * Sets the tick unit that controls the spacing of the angular grid\r\n     * lines, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param unit  the tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 34)",
        "(line 426,col 9)-(line 426,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isAngleLabelsVisible()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\r\n     * Returns a flag that controls whether or not the angle labels are visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setAngleLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelsVisible(boolean)",
      "begin_line": 448,
      "end_line": 453,
      "comment": "\r\n     * Sets the flag that controls whether or not the angle labels are visible,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isAngleLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleLabelFont()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\r\n     * Returns the font used to display the angle labels.\r\n     *\r\n     * @return A font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelFont(java.awt.Font)",
      "begin_line": 474,
      "end_line": 480,
      "comment": "\r\n     * Sets the font used to display the angle labels and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAngleLabelFont()\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 479,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleLabelPaint()",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\r\n     * Returns the paint used to display the angle labels.\r\n     *\r\n     * @return A paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelPaint(java.awt.Paint)",
      "begin_line": 499,
      "end_line": 505,
      "comment": "\r\n     * Sets the paint used to display the angle labels and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 37)",
        "(line 504,col 9)-(line 504,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isAngleGridlinesVisible()",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the angular gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setAngleGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlinesVisible(boolean)",
      "begin_line": 530,
      "end_line": 535,
      "comment": "\r\n     * Sets the flag that controls whether or not the angular grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isAngleGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleGridlineStroke()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * angular axis.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlineStroke(java.awt.Stroke)",
      "begin_line": 559,
      "end_line": 562,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the angular axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getAngleGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 42)",
        "(line 561,col 9)-(line 561,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleGridlinePaint()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the\r\n     * angular axis.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAngleGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlinePaint(java.awt.Paint)",
      "begin_line": 585,
      "end_line": 588,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the angular axis.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getAngleGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 40)",
        "(line 587,col 9)-(line 587,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isRadiusGridlinesVisible()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the radius axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setRadiusGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlinesVisible(boolean)",
      "begin_line": 613,
      "end_line": 618,
      "comment": "\r\n     * Sets the flag that controls whether or not the radius axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRadiusGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRadiusGridlineStroke()",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * radius axis.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRadiusGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlineStroke(java.awt.Stroke)",
      "begin_line": 642,
      "end_line": 645,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the radius axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRadiusGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 43)",
        "(line 644,col 9)-(line 644,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRadiusGridlinePaint()",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the radius\r\n     * axis.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRadiusGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlinePaint(java.awt.Paint)",
      "begin_line": 669,
      "end_line": 672,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the radius axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRadiusGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 41)",
        "(line 671,col 9)-(line 671,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.refreshAngleTicks()",
      "begin_line": 681,
      "end_line": 691,
      "comment": "\r\n     * Generates a list of tick values for the angular tick marks.\r\n     *\r\n     * @return A list of {@link NumberTick} instances.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 37)",
        "(line 683,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 713,
      "end_line": 766,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This plot relies on a {@link PolarItemRenderer} to draw each\r\n     * item in the plot.  This allows the visual representation of the data to\r\n     * be changed easily.\r\n     * \u003cP\u003e\r\n     * The optional info argument collects information about the rendering of\r\n     * the plot (dimensions, tooltip information etc).  Just pass in\r\n     * \u003ccode\u003enull\u003c/code\u003e if you do not need this information.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes and\r\n     *              labels) should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  ignored.\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 64)",
        "(line 721,col 9)-(line 721,col 66)",
        "(line 722,col 9)-(line 724,col 9)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 732,col 9)-(line 732,col 45)",
        "(line 733,col 9)-(line 733,col 26)",
        "(line 735,col 9)-(line 735,col 36)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 741,col 9)-(line 741,col 37)",
        "(line 742,col 9)-(line 743,col 53)",
        "(line 744,col 9)-(line 745,col 45)",
        "(line 746,col 9)-(line 746,col 55)",
        "(line 747,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 34)",
        "(line 765,col 9)-(line 765,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawCornerTextItems(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 774,
      "end_line": 806,
      "comment": "\r\n     * Draws the corner text items.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 777,col 9)",
        "(line 779,col 9)-(line 779,col 33)",
        "(line 780,col 9)-(line 780,col 27)",
        "(line 781,col 9)-(line 781,col 28)",
        "(line 782,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 790,col 46)",
        "(line 791,col 9)-(line 791,col 40)",
        "(line 792,col 9)-(line 792,col 22)",
        "(line 793,col 9)-(line 793,col 23)",
        "(line 795,col 9)-(line 795,col 42)",
        "(line 796,col 9)-(line 796,col 43)",
        "(line 797,col 9)-(line 797,col 65)",
        "(line 798,col 9)-(line 798,col 31)",
        "(line 799,col 9)-(line 805,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawAxis(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 817,
      "end_line": 821,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     *\r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 820,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 832,
      "end_line": 848,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current m_Renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param info  an optional object for collection dimension\r\n     *              information (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 847,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List, java.util.List)",
      "begin_line": 858,
      "end_line": 885,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param angularTicks  the ticks for the angular axis.\r\n     * @param radialTicks  the ticks for the radial axis.\r\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 864,col 9)",
        "(line 867,col 9)-(line 874,col 9)",
        "(line 877,col 9)-(line 884,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoom(double)",
      "begin_line": 892,
      "end_line": 902,
      "comment": "\r\n     * Zooms the axis ranges by the specified percentage about the anchor point.\r\n     *\r\n     * @param percent  the amount of the zoom.\r\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 901,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 911,
      "end_line": 918,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 28)",
        "(line 913,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 927,
      "end_line": 939,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s m_Dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 938,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 948,
      "end_line": 950,
      "comment": "\r\n     * Notifies all registered listeners of a property change.\r\n     * \u003cP\u003e\r\n     * One source of property change events is the plot\u0027s m_Renderer.\r\n     *\r\n     * @param event  information about the property change.\r\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getSeriesCount()",
      "begin_line": 958,
      "end_line": 965,
      "comment": "\r\n     * Returns the number of series in the dataset for this plot.  If the\r\n     * dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 23)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getLegendItems()",
      "begin_line": 974,
      "end_line": 988,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s m_Renderer, since the m_Renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 65)",
        "(line 978,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.equals(java.lang.Object)",
      "begin_line": 997,
      "end_line": 1050,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 41)",
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1016,col 9)",
        "(line 1017,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1041,col 9)",
        "(line 1042,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.clone()",
      "begin_line": 1060,
      "end_line": 1081,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 52)",
        "(line 1063,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1071,col 9)",
        "(line 1073,col 9)-(line 1076,col 9)",
        "(line 1078,col 9)-(line 1078,col 68)",
        "(line 1080,col 9)-(line 1080,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1090,
      "end_line": 1097,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 36)",
        "(line 1092,col 9)-(line 1092,col 70)",
        "(line 1093,col 9)-(line 1093,col 68)",
        "(line 1094,col 9)-(line 1094,col 71)",
        "(line 1095,col 9)-(line 1095,col 69)",
        "(line 1096,col 9)-(line 1096,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1107,
      "end_line": 1125,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 35)",
        "(line 1111,col 9)-(line 1111,col 70)",
        "(line 1112,col 9)-(line 1112,col 68)",
        "(line 1113,col 9)-(line 1113,col 71)",
        "(line 1114,col 9)-(line 1114,col 69)",
        "(line 1115,col 9)-(line 1115,col 65)",
        "(line 1117,col 9)-(line 1120,col 9)",
        "(line 1122,col 9)-(line 1124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1135,
      "end_line": 1138,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1151,
      "end_line": 1154,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1165,
      "end_line": 1168,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1177,
      "end_line": 1180,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": [
        "(line 1179,col 9)-(line 1179,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1194,
      "end_line": 1209,
      "comment": "\r\n     * Multiplies the range on the range axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1197,col 9)-(line 1207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1219,
      "end_line": 1222,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1221,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isDomainZoomable()",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e always.\r\n     *\r\n     * @return \u003ccode\u003efalse\u003c/code\u003e always.\r\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isRangeZoomable()",
      "begin_line": 1238,
      "end_line": 1240,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axis is zoomable.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1239,col 9)-(line 1239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getOrientation()",
      "begin_line": 1247,
      "end_line": 1249,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation.\r\n     ",
      "child_ranges": [
        "(line 1248,col 9)-(line 1248,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getMaxRadius()",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\r\n     * Returns the upper bound of the radius axis.\r\n     *\r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.translateValueThetaRadiusToJava2D(double, double, java.awt.geom.Rectangle2D)",
      "begin_line": 1271,
      "end_line": 1307,
      "comment": "\r\n     * Translates a (theta, radius) pair into Java2D coordinates.  If\r\n     * \u003ccode\u003eradius\u003c/code\u003e is less than the lower bound of the axis, then\r\n     * this method returns the centre point.\r\n     *\r\n     * @param angleDegrees  the angle in degrees.\r\n     * @param radius  the radius.\r\n     * @param dataArea  the data area.\r\n     *\r\n     * @return A point in Java2D space.\r\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 61)",
        "(line 1277,col 9)-(line 1277,col 50)",
        "(line 1278,col 9)-(line 1278,col 50)",
        "(line 1279,col 9)-(line 1279,col 50)",
        "(line 1280,col 9)-(line 1280,col 50)",
        "(line 1282,col 9)-(line 1282,col 37)",
        "(line 1283,col 9)-(line 1283,col 37)",
        "(line 1284,col 9)-(line 1284,col 51)",
        "(line 1286,col 9)-(line 1286,col 43)",
        "(line 1287,col 9)-(line 1287,col 43)",
        "(line 1289,col 9)-(line 1289,col 51)",
        "(line 1290,col 9)-(line 1290,col 41)",
        "(line 1291,col 9)-(line 1291,col 58)",
        "(line 1293,col 9)-(line 1293,col 53)",
        "(line 1294,col 9)-(line 1294,col 53)",
        "(line 1296,col 9)-(line 1297,col 40)",
        "(line 1298,col 9)-(line 1299,col 40)",
        "(line 1301,col 9)-(line 1301,col 31)",
        "(line 1302,col 9)-(line 1302,col 31)",
        "(line 1304,col 9)-(line 1304,col 36)",
        "(line 1305,col 9)-(line 1305,col 17)"
      ]
    }
  ]
}