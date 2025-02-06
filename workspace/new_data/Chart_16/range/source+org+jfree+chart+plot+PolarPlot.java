{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/PolarPlot.java",
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
      "begin_line": 104,
      "end_line": 1304,
      "comment": "\r\n * Plots data that is in (theta, radius) pairs where\r\n * theta equal to zero is due north and increases clockwise.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "MARGIN"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The default margin. "
    },
    {
      "type": "field",
      "varNames": [
        "ANNOTATION_MARGIN"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The annotation margin. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ANGLE_TICK_UNIT_SIZE"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " \r\n     * The default angle tick unit size.\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 124,
      "end_line": 126,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 132,
      "end_line": 133,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "angleTicks"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The angles that are marked with gridlines. "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "renderer"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " \r\n     * Object responsible for drawing the visual representation of each point \r\n     * on the plot. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angleTickUnit"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " \r\n     * The tick unit that controls the spacing between the angular grid lines.\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelsVisible"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " A flag that controls whether or not the angle labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelFont"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The font used to display the angle labels - never null. "
    },
    {
      "type": "field",
      "varNames": [
        "angleLabelPaint"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The paint used to display the angle labels. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlinesVisible"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " A flag that controls whether the angular grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlineStroke"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The stroke used to draw the angular grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "angleGridlinePaint"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The paint used to draw the angular grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlinesVisible"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " A flag that controls whether the radius grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlineStroke"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The stroke used to draw the radius grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "radiusGridlinePaint"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " The paint used to draw the radius grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "cornerTextItems"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The annotations for the plot. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PolarPlot.PolarPlot()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PolarPlot.PolarPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.PolarItemRenderer)",
      "begin_line": 201,
      "end_line": 232,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param radiusAxis  the radius axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 16)",
        "(line 207,col 9)-(line 207,col 31)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 78)",
        "(line 213,col 9)-(line 213,col 31)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 59)",
        "(line 227,col 9)-(line 227,col 57)",
        "(line 229,col 9)-(line 229,col 43)",
        "(line 230,col 9)-(line 230,col 60)",
        "(line 231,col 9)-(line 231,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.addCornerTextItem(java.lang.String)",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\r\n     * Add text to be displayed in the lower right hand corner and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param text  the text to display (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 39)",
        "(line 247,col 9)-(line 247,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.removeCornerTextItem(java.lang.String)",
      "begin_line": 258,
      "end_line": 263,
      "comment": "\r\n     * Remove the given text from the list of corner text items and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param text  the text to remove (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     * \r\n     * @see #addCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.clearCornerTextItems()",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\r\n     * Clear the list of corner text items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #addCornerTextItem(String)\r\n     * @see #removeCornerTextItem(String)\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getPlotType()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 285,col 8)-(line 285,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAxis()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the axis for the plot.\r\n     *\r\n     * @return The radius axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 305,
      "end_line": 321,
      "comment": "\r\n     * Sets the axis for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 25)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getDataset()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 342,
      "end_line": 360,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there \r\n     * is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 42)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 351,col 9)-(line 351,col 31)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 358,col 9)-(line 358,col 78)",
        "(line 359,col 9)-(line 359,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRenderer()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Returns the item renderer.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(PolarItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRenderer(org.jfree.chart.renderer.PolarItemRenderer)",
      "begin_line": 383,
      "end_line": 394,
      "comment": "\r\n     * Sets the item renderer, and notifies all listeners of a change to the \r\n     * plot.\r\n     * \u003cP\u003e\r\n     * If the renderer is set to \u003ccode\u003enull\u003c/code\u003e, no chart will be drawn.\r\n     *\r\n     * @param renderer  the new renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 33)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleTickUnit()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\r\n     * Returns the tick unit that controls the spacing of the angular grid \r\n     * lines.\r\n     * \r\n     * @return The tick unit (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 416,
      "end_line": 422,
      "comment": "\r\n     * Sets the tick unit that controls the spacing of the angular grid \r\n     * lines, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param unit  the tick unit (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 417,col 6)-(line 419,col 6)",
        "(line 420,col 9)-(line 420,col 34)",
        "(line 421,col 9)-(line 421,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isAngleLabelsVisible()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\r\n     * Returns a flag that controls whether or not the angle labels are visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setAngleLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelsVisible(boolean)",
      "begin_line": 443,
      "end_line": 448,
      "comment": "\r\n     * Sets the flag that controls whether or not the angle labels are visible,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isAngleLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleLabelFont()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\r\n     * Returns the font used to display the angle labels.\r\n     * \r\n     * @return A font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAngleLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelFont(java.awt.Font)",
      "begin_line": 469,
      "end_line": 475,
      "comment": "\r\n     * Sets the font used to display the angle labels and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAngleLabelFont()\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 35)",
        "(line 474,col 9)-(line 474,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleLabelPaint()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\r\n     * Returns the paint used to display the angle labels.\r\n     * \r\n     * @return A paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAngleLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleLabelPaint(java.awt.Paint)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\r\n     * Sets the paint used to display the angle labels and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 37)",
        "(line 499,col 9)-(line 499,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isAngleGridlinesVisible()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the angular gridlines are visible, and \r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setAngleGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlinesVisible(boolean)",
      "begin_line": 525,
      "end_line": 530,
      "comment": "\r\n     * Sets the flag that controls whether or not the angular grid-lines are \r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all \r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isAngleGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleGridlineStroke()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the \r\n     * angular axis.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAngleGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlineStroke(java.awt.Stroke)",
      "begin_line": 554,
      "end_line": 557,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the angular axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getAngleGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 42)",
        "(line 556,col 9)-(line 556,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getAngleGridlinePaint()",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the \r\n     * angular axis.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAngleGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setAngleGridlinePaint(java.awt.Paint)",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the angular axis.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getAngleGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 40)",
        "(line 582,col 9)-(line 582,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isRadiusGridlinesVisible()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the radius axis grid is visible, and \r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setRadiusGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlinesVisible(boolean)",
      "begin_line": 608,
      "end_line": 613,
      "comment": "\r\n     * Sets the flag that controls whether or not the radius axis grid lines \r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all \r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRadiusGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 612,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRadiusGridlineStroke()",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the \r\n     * radius axis.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRadiusGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlineStroke(java.awt.Stroke)",
      "begin_line": 637,
      "end_line": 640,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the radius axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRadiusGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 43)",
        "(line 639,col 9)-(line 639,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getRadiusGridlinePaint()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the radius\r\n     * axis.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRadiusGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.setRadiusGridlinePaint(java.awt.Paint)",
      "begin_line": 664,
      "end_line": 667,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the radius axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRadiusGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 41)",
        "(line 666,col 9)-(line 666,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.refreshAngleTicks()",
      "begin_line": 676,
      "end_line": 686,
      "comment": "\r\n     * Generates a list of tick values for the angular tick marks.\r\n     * \r\n     * @return A list of {@link NumberTick} instances.\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 37)",
        "(line 678,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 708,
      "end_line": 761,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     * \u003cP\u003e\r\n     * This plot relies on a {@link PolarItemRenderer} to draw each \r\n     * item in the plot.  This allows the visual representation of the data to \r\n     * be changed easily.\r\n     * \u003cP\u003e\r\n     * The optional info argument collects information about the rendering of\r\n     * the plot (dimensions, tooltip information etc).  Just pass in \r\n     * \u003ccode\u003enull\u003c/code\u003e if you do not need this information.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes and \r\n     *              labels) should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  ignored.\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 64)",
        "(line 716,col 9)-(line 716,col 66)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 722,col 9)-(line 724,col 9)",
        "(line 727,col 9)-(line 727,col 45)",
        "(line 728,col 9)-(line 728,col 26)",
        "(line 730,col 9)-(line 730,col 36)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 736,col 9)-(line 736,col 37)",
        "(line 737,col 9)-(line 738,col 53)",
        "(line 739,col 9)-(line 740,col 45)",
        "(line 741,col 9)-(line 741,col 55)",
        "(line 742,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 34)",
        "(line 760,col 9)-(line 760,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawCornerTextItems(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 769,
      "end_line": 801,
      "comment": "\r\n     * Draws the corner text items.\r\n     * \r\n     * @param g2  the drawing surface.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 772,col 9)",
        "(line 774,col 9)-(line 774,col 33)",
        "(line 775,col 9)-(line 775,col 27)",
        "(line 776,col 9)-(line 776,col 28)",
        "(line 777,col 9)-(line 783,col 9)",
        "(line 785,col 9)-(line 785,col 46)",
        "(line 786,col 9)-(line 786,col 40)",
        "(line 787,col 9)-(line 787,col 22)",
        "(line 788,col 9)-(line 788,col 23)",
        "(line 790,col 9)-(line 790,col 42)",
        "(line 791,col 9)-(line 791,col 43)",
        "(line 792,col 9)-(line 792,col 65)",
        "(line 793,col 9)-(line 793,col 31)",
        "(line 794,col 9)-(line 800,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawAxis(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 812,
      "end_line": 816,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * \r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 815,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 827,
      "end_line": 843,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current m_Renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param info  an optional object for collection dimension \r\n     *              information (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 842,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.drawGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List, java.util.List)",
      "begin_line": 853,
      "end_line": 880,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param angularTicks  the ticks for the angular axis.\r\n     * @param radialTicks  the ticks for the radial axis.\r\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 859,col 9)",
        "(line 862,col 9)-(line 869,col 9)",
        "(line 872,col 9)-(line 879,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoom(double)",
      "begin_line": 887,
      "end_line": 897,
      "comment": "\r\n     * Zooms the axis ranges by the specified percentage about the anchor point.\r\n     *\r\n     * @param percent  the amount of the zoom.\r\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 896,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 906,
      "end_line": 913,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 28)",
        "(line 908,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 922,
      "end_line": 934,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s m_Dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 933,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\r\n     * Notifies all registered listeners of a property change.\r\n     * \u003cP\u003e\r\n     * One source of property change events is the plot\u0027s m_Renderer.\r\n     *\r\n     * @param event  information about the property change.\r\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getSeriesCount()",
      "begin_line": 953,
      "end_line": 960,
      "comment": "\r\n     * Returns the number of series in the dataset for this plot.  If the \r\n     * dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 23)",
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getLegendItems()",
      "begin_line": 969,
      "end_line": 983,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s m_Renderer, since the m_Renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 65)",
        "(line 973,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.equals(java.lang.Object)",
      "begin_line": 992,
      "end_line": 1045,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 999,col 41)",
        "(line 1000,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1040,col 9)",
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1044,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.clone()",
      "begin_line": 1055,
      "end_line": 1076,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of \r\n     *         the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 52)",
        "(line 1058,col 9)-(line 1062,col 9)",
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1068,col 9)-(line 1071,col 9)",
        "(line 1073,col 9)-(line 1073,col 68)",
        "(line 1075,col 9)-(line 1075,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1085,
      "end_line": 1092,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 36)",
        "(line 1087,col 9)-(line 1087,col 70)",
        "(line 1088,col 9)-(line 1088,col 68)",
        "(line 1089,col 9)-(line 1089,col 71)",
        "(line 1090,col 9)-(line 1090,col 69)",
        "(line 1091,col 9)-(line 1091,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1102,
      "end_line": 1120,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 35)",
        "(line 1106,col 9)-(line 1106,col 70)",
        "(line 1107,col 9)-(line 1107,col 68)",
        "(line 1108,col 9)-(line 1108,col 71)",
        "(line 1109,col 9)-(line 1109,col 69)",
        "(line 1110,col 9)-(line 1110,col 65)",
        "(line 1112,col 9)-(line 1115,col 9)",
        "(line 1117,col 9)-(line 1119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1130,
      "end_line": 1133,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1146,
      "end_line": 1149,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1160,
      "end_line": 1163,
      "comment": "\r\n     * This method is required by the {@link Zoomable} interface, but since\r\n     * the plot does not have any domain axes, it does nothing.\r\n     * \r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1172,
      "end_line": 1175,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1189,
      "end_line": 1204,
      "comment": "\r\n     * Multiplies the range on the range axis by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1214,
      "end_line": 1217,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     * \r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D coordinates).\r\n     ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1216,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isDomainZoomable()",
      "begin_line": 1224,
      "end_line": 1226,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e always.\r\n     * \r\n     * @return \u003ccode\u003efalse\u003c/code\u003e always.\r\n     ",
      "child_ranges": [
        "(line 1225,col 9)-(line 1225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.isRangeZoomable()",
      "begin_line": 1233,
      "end_line": 1235,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axis is zoomable.\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1234,col 9)-(line 1234,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getOrientation()",
      "begin_line": 1242,
      "end_line": 1244,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     * \r\n     * @return The orientation.\r\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.getMaxRadius()",
      "begin_line": 1251,
      "end_line": 1253,
      "comment": "\r\n     * Returns the upper bound of the radius axis.\r\n     * \r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 1252,col 9)-(line 1252,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PolarPlot.translateValueThetaRadiusToJava2D(double, double, java.awt.geom.Rectangle2D)",
      "begin_line": 1266,
      "end_line": 1302,
      "comment": "\r\n     * Translates a (theta, radius) pair into Java2D coordinates.  If \r\n     * \u003ccode\u003eradius\u003c/code\u003e is less than the lower bound of the axis, then\r\n     * this method returns the centre point.\r\n     * \r\n     * @param angleDegrees  the angle in degrees.\r\n     * @param radius  the radius.\r\n     * @param dataArea  the data area.\r\n     * \r\n     * @return A point in Java2D space.\r\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 61)",
        "(line 1272,col 9)-(line 1272,col 50)",
        "(line 1273,col 9)-(line 1273,col 50)",
        "(line 1274,col 9)-(line 1274,col 50)",
        "(line 1275,col 9)-(line 1275,col 50)",
        "(line 1277,col 9)-(line 1277,col 37)",
        "(line 1278,col 9)-(line 1278,col 37)",
        "(line 1279,col 9)-(line 1279,col 51)",
        "(line 1281,col 9)-(line 1281,col 43)",
        "(line 1282,col 9)-(line 1282,col 43)",
        "(line 1284,col 9)-(line 1284,col 51)",
        "(line 1285,col 9)-(line 1285,col 41)",
        "(line 1286,col 9)-(line 1286,col 58)",
        "(line 1288,col 9)-(line 1288,col 53)",
        "(line 1289,col 9)-(line 1289,col 53)",
        "(line 1291,col 9)-(line 1292,col 40)",
        "(line 1293,col 9)-(line 1294,col 40)",
        "(line 1296,col 9)-(line 1296,col 31)",
        "(line 1297,col 9)-(line 1297,col 31)",
        "(line 1299,col 9)-(line 1299,col 36)",
        "(line 1300,col 9)-(line 1300,col 17)"
      ]
    }
  ]
}