{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/StandardXYItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 153,
      "end_line": 1073,
      "comment": "\r\n * Standard item renderer for an {@link XYPlot}.  This class can draw (a) \r\n * shapes at each point, or (b) lines between points, or (c) both shapes and \r\n * lines.\r\n * \u003cP\u003e\r\n * This renderer has been retained for historical reasons and, in general, you\r\n * should use the {@link XYLineAndShapeRenderer} class instead.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Constant for the type of rendering (shapes only). "
    },
    {
      "type": "field",
      "varNames": [
        "LINES"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Constant for the type of rendering (lines only). "
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES_AND_LINES"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Constant for the type of rendering (shapes and lines). "
    },
    {
      "type": "field",
      "varNames": [
        "IMAGES"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Constant for the type of rendering (images only). "
    },
    {
      "type": "field",
      "varNames": [
        "DISCONTINUOUS"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Constant for the type of rendering (discontinuous lines). "
    },
    {
      "type": "field",
      "varNames": [
        "DISCONTINUOUS_LINES"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Constant for the type of rendering (discontinuous lines). "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesVisible"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " A flag indicating whether or not shapes are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "plotLines"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " A flag indicating whether or not lines are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "plotImages"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " A flag indicating whether or not images are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "plotDiscontinuous"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " A flag controlling whether or not discontinuous lines are used. "
    },
    {
      "type": "field",
      "varNames": [
        "gapThresholdType"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Specifies how the gap threshold value is interpreted. "
    },
    {
      "type": "field",
      "varNames": [
        "gapThreshold"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Threshold for deciding when to discontinue a line. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesFilled"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " \r\n     * A table of flags that control (per series) whether or not shapes are \r\n     * filled. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesFilled"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " The default value returned by the getShapeFilled() method. "
    },
    {
      "type": "field",
      "varNames": [
        "drawSeriesLineAsPath"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " \r\n     * A flag that controls whether or not each series is drawn as a single \r\n     * path. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendLine"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " \r\n     * The shape that is used to represent a line in the legend. \r\n     * This should never be set to \u003ccode\u003enull\u003c/code\u003e. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer(int)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of \r\n     * the constants: {@link #SHAPES}, {@link #LINES} or \r\n     * {@link #SHAPES_AND_LINES}.\r\n     *\r\n     * @param type  the type.\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of \r\n     * the constants: {@link #SHAPES}, {@link #LINES} or \r\n     * {@link #SHAPES_AND_LINES}.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the item label generator (\u003ccode\u003enull\u003c/code\u003e \r\n     *                          permitted).\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 258,
      "end_line": 282,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of \r\n     * the constants: {@link #SHAPES}, {@link #LINES} or \r\n     * {@link #SHAPES_AND_LINES}.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the item label generator (\u003ccode\u003enull\u003c/code\u003e \r\n     *                          permitted).\r\n     * @param urlGenerator  the URL generator.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 16)",
        "(line 263,col 9)-(line 263,col 50)",
        "(line 264,col 9)-(line 264,col 42)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 52)",
        "(line 279,col 9)-(line 279,col 37)",
        "(line 280,col 9)-(line 280,col 65)",
        "(line 281,col 9)-(line 281,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getBaseShapesVisible()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Returns true if shapes are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if shapes are being plotted by the renderer.\r\n     * \r\n     * @see #setBaseShapesVisible\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setBaseShapesVisible(boolean)",
      "begin_line": 303,
      "end_line": 308,
      "comment": "\r\n     * Sets the flag that controls whether or not a shape is plotted at each \r\n     * data point.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseShapesVisible\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getItemShapeFilled(int, int)",
      "begin_line": 327,
      "end_line": 335,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item is\r\n     * filled.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the \r\n     * \u003ccode\u003egetSeriesShapesFilled\u003c/code\u003e method.  You can override this method \r\n     * if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 66)",
        "(line 329,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getSeriesShapesFilled(int)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the flag used to control whether or not the shapes for a series\r\n     * are filled.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setSeriesShapesFilled(int, java.lang.Boolean)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 57)",
        "(line 360,col 9)-(line 360,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getBaseShapesFilled()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n     * Returns the base \u0027shape filled\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #setBaseShapesFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setBaseShapesFilled(boolean)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Sets the base \u0027shapes filled\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseShapesFilled()\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getPlotLines()",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\r\n     * Returns true if lines are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if lines are being plotted by the renderer.\r\n     * \r\n     * @see #setPlotLines(boolean)\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setPlotLines(boolean)",
      "begin_line": 406,
      "end_line": 411,
      "comment": "\r\n     * Sets the flag that controls whether or not a line is plotted between \r\n     * each data point and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getPlotLines()\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getGapThresholdType()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\r\n     * Returns the gap threshold type (relative or absolute).\r\n     * \r\n     * @return The type.\r\n     * \r\n     * @see #setGapThresholdType(UnitType)\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setGapThresholdType(org.jfree.chart.util.UnitType)",
      "begin_line": 432,
      "end_line": 439,
      "comment": "\r\n     * Sets the gap threshold type and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param thresholdType  the type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getGapThresholdType()\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 46)",
        "(line 438,col 9)-(line 438,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getGapThreshold()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\r\n     * Returns the gap threshold for discontinuous lines.\r\n     *\r\n     * @return The gap threshold.\r\n     * \r\n     * @see #setGapThreshold(double)\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setGapThreshold(double)",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\r\n     * Sets the gap threshold for discontinuous lines and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param t  the threshold.\r\n     * \r\n     * @see #getGapThreshold()\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 30)",
        "(line 462,col 9)-(line 462,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getPlotImages()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\r\n     * Returns true if images are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if images are being plotted by the renderer.\r\n     * \r\n     * @see #setPlotImages(boolean)\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setPlotImages(boolean)",
      "begin_line": 485,
      "end_line": 490,
      "comment": "\r\n     * Sets the flag that controls whether or not an image is drawn at each \r\n     * data point and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getPlotImages()\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getPlotDiscontinuous()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\r\n     * Returns a flag that controls whether or not the renderer shows\r\n     * discontinuous lines.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if lines should be discontinuous.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setPlotDiscontinuous(boolean)",
      "begin_line": 511,
      "end_line": 516,
      "comment": "\r\n     * Sets the flag that controls whether or not the renderer shows\r\n     * discontinuous lines, and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param flag  the new flag value.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getDrawSeriesLineAsPath()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\r\n     * Returns a flag that controls whether or not each series is drawn as a \r\n     * single path.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawSeriesLineAsPath(boolean)\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setDrawSeriesLineAsPath(boolean)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\r\n     * Sets the flag that controls whether or not each series is drawn as a \r\n     * single path.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getDrawSeriesLineAsPath()\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getLegendLine()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "\r\n     * Returns the shape used to represent a line in the legend.\r\n     * \r\n     * @return The legend line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLine(Shape)\r\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setLegendLine(java.awt.Shape)",
      "begin_line": 561,
      "end_line": 567,
      "comment": "\r\n     * Sets the shape used as a line in each legend item and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendLine()\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 31)",
        "(line 566,col 9)-(line 566,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getLegendItem(int, int)",
      "begin_line": 577,
      "end_line": 615,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 32)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 33)",
        "(line 583,col 9)-(line 583,col 58)",
        "(line 584,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 622,
      "end_line": 682,
      "comment": "\r\n     * Records the state for the renderer.  This is used to preserve state \r\n     * information between calls to the drawItem() method for a single chart \r\n     * drawing.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPath"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": " The path for the current series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesIndex"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": " The series index. "
    },
    {
      "type": "field",
      "varNames": [
        "lastPointGood"
      ],
      "begin_line": 634,
      "end_line": 634,
      "comment": " \r\n         * A flag that indicates if the last (x, y) point was \u0027good\u0027 \r\n         * (non-null). \r\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.State(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\r\n         * Creates a new state instance.\r\n         * \r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.isLastPointGood()",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\r\n         * Returns a flag that indicates if the last point drawn (in the \r\n         * current series) was \u0027good\u0027 (non-null).\r\n         * \r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 652,col 13)-(line 652,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.setLastPointGood(boolean)",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\r\n         * Sets a flag that indicates if the last point drawn (in the current \r\n         * series) was \u0027good\u0027 (non-null).\r\n         * \r\n         * @param good  the flag.\r\n         ",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.getSeriesIndex()",
      "begin_line": 670,
      "end_line": 672,
      "comment": "\r\n         * Returns the series index for the current path.\r\n         * \r\n         * @return The series index for the current path.\r\n         ",
      "child_ranges": [
        "(line 671,col 13)-(line 671,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.setSeriesIndex(int)",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\r\n         * Sets the series index for the current path.\r\n         * \r\n         * @param index  the index.\r\n         ",
      "child_ranges": [
        "(line 680,col 13)-(line 680,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 700,
      "end_line": 711,
      "comment": "\r\n     * Initialises the renderer.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to \r\n     * maintain. The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 38)",
        "(line 707,col 9)-(line 707,col 45)",
        "(line 708,col 9)-(line 708,col 31)",
        "(line 709,col 9)-(line 709,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 731,
      "end_line": 928,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 59)",
        "(line 747,col 9)-(line 747,col 32)",
        "(line 748,col 9)-(line 748,col 41)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 753,col 9)-(line 753,col 60)",
        "(line 754,col 9)-(line 754,col 49)",
        "(line 755,col 9)-(line 755,col 58)",
        "(line 756,col 9)-(line 756,col 27)",
        "(line 757,col 9)-(line 757,col 35)",
        "(line 760,col 9)-(line 760,col 52)",
        "(line 761,col 9)-(line 761,col 52)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 766,col 63)",
        "(line 767,col 9)-(line 767,col 62)",
        "(line 768,col 9)-(line 768,col 79)",
        "(line 769,col 9)-(line 769,col 78)",
        "(line 771,col 9)-(line 859,col 9)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 868,col 9)-(line 889,col 9)",
        "(line 891,col 9)-(line 903,col 9)",
        "(line 905,col 9)-(line 905,col 28)",
        "(line 906,col 9)-(line 906,col 28)",
        "(line 907,col 9)-(line 910,col 9)",
        "(line 913,col 9)-(line 916,col 9)",
        "(line 918,col 9)-(line 918,col 66)",
        "(line 919,col 9)-(line 919,col 63)",
        "(line 920,col 9)-(line 921,col 63)",
        "(line 924,col 9)-(line 926,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.equals(java.lang.Object)",
      "begin_line": 937,
      "end_line": 978,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 67)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 975,col 9)",
        "(line 976,col 9)-(line 976,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.clone()",
      "begin_line": 987,
      "end_line": 993,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 78)",
        "(line 989,col 9)-(line 990,col 64)",
        "(line 991,col 9)-(line 991,col 65)",
        "(line 992,col 9)-(line 992,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getImage(org.jfree.chart.plot.Plot, int, int, double, double)",
      "begin_line": 1015,
      "end_line": 1019,
      "comment": "\r\n     * Returns the image used to draw a single data item.\r\n     *\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param x  the x value of the item.\r\n     * @param y  the y value of the item.\r\n     *\r\n     * @return The image.\r\n     * \r\n     * @see #getPlotImages()\r\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getImageHotspot(org.jfree.chart.plot.Plot, int, int, double, double, java.awt.Image)",
      "begin_line": 1038,
      "end_line": 1045,
      "comment": "\r\n     * Returns the hotspot of the image used to draw a single data item.\r\n     * The hotspot is the point relative to the top left of the image\r\n     * that should indicate the data item. The default is the center of the\r\n     * image.\r\n     *\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param image  the image (can be used to get size information about the \r\n     *               image)\r\n     * @param series  the series index\r\n     * @param item  the item index\r\n     * @param x  the x value of the item\r\n     * @param y  the y value of the item\r\n     *\r\n     * @return The hotspot used to draw the data item.\r\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 43)",
        "(line 1042,col 9)-(line 1042,col 41)",
        "(line 1043,col 9)-(line 1043,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 1055,
      "end_line": 1059,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 35)",
        "(line 1058,col 9)-(line 1058,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1068,
      "end_line": 1071,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1069,col 9)-(line 1069,col 36)",
        "(line 1070,col 9)-(line 1070,col 60)"
      ]
    }
  ]
}