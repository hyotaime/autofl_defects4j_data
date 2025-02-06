{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/StandardXYItemRenderer.java",
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
      "begin_line": 155,
      "end_line": 1072,
      "comment": "\r\n * Standard item renderer for an {@link XYPlot}.  This class can draw (a)\r\n * shapes at each point, or (b) lines between points, or (c) both shapes and\r\n * lines.\r\n * \u003cP\u003e\r\n * This renderer has been retained for historical reasons and, in general, you\r\n * should use the {@link XYLineAndShapeRenderer} class instead.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Constant for the type of rendering (shapes only). "
    },
    {
      "type": "field",
      "varNames": [
        "LINES"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Constant for the type of rendering (lines only). "
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES_AND_LINES"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " Constant for the type of rendering (shapes and lines). "
    },
    {
      "type": "field",
      "varNames": [
        "IMAGES"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Constant for the type of rendering (images only). "
    },
    {
      "type": "field",
      "varNames": [
        "DISCONTINUOUS"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Constant for the type of rendering (discontinuous lines). "
    },
    {
      "type": "field",
      "varNames": [
        "DISCONTINUOUS_LINES"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Constant for the type of rendering (discontinuous lines). "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesVisible"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " A flag indicating whether or not shapes are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "plotLines"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " A flag indicating whether or not lines are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "plotImages"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " A flag indicating whether or not images are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "plotDiscontinuous"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " A flag controlling whether or not discontinuous lines are used. "
    },
    {
      "type": "field",
      "varNames": [
        "gapThresholdType"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Specifies how the gap threshold value is interpreted. "
    },
    {
      "type": "field",
      "varNames": [
        "gapThreshold"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Threshold for deciding when to discontinue a line. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesFilled"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": "\r\n     * A table of flags that control (per series) whether or not shapes are\r\n     * filled.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesFilled"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The default value returned by the getShapeFilled() method. "
    },
    {
      "type": "field",
      "varNames": [
        "drawSeriesLineAsPath"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\r\n     * A flag that controls whether or not each series is drawn as a single\r\n     * path.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendLine"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\r\n     * The shape that is used to represent a line in the legend.\r\n     * This should never be set to \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer(int)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of\r\n     * the constants: {@link #SHAPES}, {@link #LINES} or\r\n     * {@link #SHAPES_AND_LINES}.\r\n     *\r\n     * @param type  the type.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of\r\n     * the constants: {@link #SHAPES}, {@link #LINES} or\r\n     * {@link #SHAPES_AND_LINES}.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the item label generator (\u003ccode\u003enull\u003c/code\u003e\r\n     *                          permitted).\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.StandardXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 260,
      "end_line": 284,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of\r\n     * the constants: {@link #SHAPES}, {@link #LINES} or\r\n     * {@link #SHAPES_AND_LINES}.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the item label generator (\u003ccode\u003enull\u003c/code\u003e\r\n     *                          permitted).\r\n     * @param urlGenerator  the URL generator.\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 16)",
        "(line 265,col 9)-(line 265,col 50)",
        "(line 266,col 9)-(line 266,col 42)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 52)",
        "(line 281,col 9)-(line 281,col 37)",
        "(line 282,col 9)-(line 282,col 65)",
        "(line 283,col 9)-(line 283,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getBaseShapesVisible()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns true if shapes are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if shapes are being plotted by the renderer.\r\n     *\r\n     * @see #setBaseShapesVisible\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setBaseShapesVisible(boolean)",
      "begin_line": 305,
      "end_line": 310,
      "comment": "\r\n     * Sets the flag that controls whether or not a shape is plotted at each\r\n     * data point.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getBaseShapesVisible\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getItemShapeFilled(int, int)",
      "begin_line": 329,
      "end_line": 337,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item is\r\n     * filled.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the\r\n     * \u003ccode\u003egetSeriesShapesFilled\u003c/code\u003e method.  You can override this method\r\n     * if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 66)",
        "(line 331,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getSeriesShapesFilled(int)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns the flag used to control whether or not the shapes for a series\r\n     * are filled.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setSeriesShapesFilled(int, java.lang.Boolean)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 flag for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 57)",
        "(line 362,col 9)-(line 362,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getBaseShapesFilled()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the base \u0027shape filled\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     *\r\n     * @see #setBaseShapesFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setBaseShapesFilled(boolean)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\r\n     * Sets the base \u0027shapes filled\u0027 flag and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getBaseShapesFilled()\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getPlotLines()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\r\n     * Returns true if lines are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if lines are being plotted by the renderer.\r\n     *\r\n     * @see #setPlotLines(boolean)\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setPlotLines(boolean)",
      "begin_line": 408,
      "end_line": 413,
      "comment": "\r\n     * Sets the flag that controls whether or not a line is plotted between\r\n     * each data point and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getPlotLines()\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getGapThresholdType()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Returns the gap threshold type (relative or absolute).\r\n     *\r\n     * @return The type.\r\n     *\r\n     * @see #setGapThresholdType(UnitType)\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setGapThresholdType(org.jfree.chart.util.UnitType)",
      "begin_line": 434,
      "end_line": 441,
      "comment": "\r\n     * Sets the gap threshold type and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param thresholdType  the type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getGapThresholdType()\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 46)",
        "(line 440,col 9)-(line 440,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getGapThreshold()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\r\n     * Returns the gap threshold for discontinuous lines.\r\n     *\r\n     * @return The gap threshold.\r\n     *\r\n     * @see #setGapThreshold(double)\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setGapThreshold(double)",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\r\n     * Sets the gap threshold for discontinuous lines and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param t  the threshold.\r\n     *\r\n     * @see #getGapThreshold()\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 30)",
        "(line 464,col 9)-(line 464,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getPlotImages()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\r\n     * Returns true if images are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if images are being plotted by the renderer.\r\n     *\r\n     * @see #setPlotImages(boolean)\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setPlotImages(boolean)",
      "begin_line": 487,
      "end_line": 492,
      "comment": "\r\n     * Sets the flag that controls whether or not an image is drawn at each\r\n     * data point and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getPlotImages()\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getPlotDiscontinuous()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Returns a flag that controls whether or not the renderer shows\r\n     * discontinuous lines.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if lines should be discontinuous.\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setPlotDiscontinuous(boolean)",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\r\n     * Sets the flag that controls whether or not the renderer shows\r\n     * discontinuous lines, and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new flag value.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getDrawSeriesLineAsPath()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\r\n     * Returns a flag that controls whether or not each series is drawn as a\r\n     * single path.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setDrawSeriesLineAsPath(boolean)\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setDrawSeriesLineAsPath(boolean)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\r\n     * Sets the flag that controls whether or not each series is drawn as a\r\n     * single path.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getDrawSeriesLineAsPath()\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getLegendLine()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\r\n     * Returns the shape used to represent a line in the legend.\r\n     *\r\n     * @return The legend line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendLine(Shape)\r\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.setLegendLine(java.awt.Shape)",
      "begin_line": 563,
      "end_line": 569,
      "comment": "\r\n     * Sets the shape used as a line in each legend item and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendLine()\r\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 31)",
        "(line 568,col 9)-(line 568,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getLegendItem(int, int)",
      "begin_line": 579,
      "end_line": 622,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 32)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 33)",
        "(line 585,col 9)-(line 585,col 58)",
        "(line 586,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 629,
      "end_line": 689,
      "comment": "\r\n     * Records the state for the renderer.  This is used to preserve state\r\n     * information between calls to the drawItem() method for a single chart\r\n     * drawing.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPath"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": " The path for the current series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesIndex"
      ],
      "begin_line": 635,
      "end_line": 635,
      "comment": " The series index. "
    },
    {
      "type": "field",
      "varNames": [
        "lastPointGood"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": "\r\n         * A flag that indicates if the last (x, y) point was \u0027good\u0027\r\n         * (non-null).\r\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.State(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\r\n         * Creates a new state instance.\r\n         *\r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 649,col 13)-(line 649,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.isLastPointGood()",
      "begin_line": 658,
      "end_line": 660,
      "comment": "\r\n         * Returns a flag that indicates if the last point drawn (in the\r\n         * current series) was \u0027good\u0027 (non-null).\r\n         *\r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 659,col 13)-(line 659,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.setLastPointGood(boolean)",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\r\n         * Sets a flag that indicates if the last point drawn (in the current\r\n         * series) was \u0027good\u0027 (non-null).\r\n         *\r\n         * @param good  the flag.\r\n         ",
      "child_ranges": [
        "(line 669,col 13)-(line 669,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.getSeriesIndex()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\r\n         * Returns the series index for the current path.\r\n         *\r\n         * @return The series index for the current path.\r\n         ",
      "child_ranges": [
        "(line 678,col 13)-(line 678,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.setSeriesIndex(int)",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\r\n         * Sets the series index for the current path.\r\n         *\r\n         * @param index  the index.\r\n         ",
      "child_ranges": [
        "(line 687,col 13)-(line 687,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 707,
      "end_line": 718,
      "comment": "\r\n     * Initialises the renderer.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to\r\n     * maintain. The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 38)",
        "(line 714,col 9)-(line 714,col 45)",
        "(line 715,col 9)-(line 715,col 31)",
        "(line 716,col 9)-(line 716,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 735,
      "end_line": 927,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color information\r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 59)",
        "(line 743,col 9)-(line 743,col 32)",
        "(line 744,col 9)-(line 744,col 41)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 60)",
        "(line 750,col 9)-(line 750,col 59)",
        "(line 751,col 9)-(line 751,col 68)",
        "(line 752,col 9)-(line 752,col 27)",
        "(line 753,col 9)-(line 753,col 35)",
        "(line 756,col 9)-(line 756,col 52)",
        "(line 757,col 9)-(line 757,col 52)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 762,col 9)-(line 762,col 63)",
        "(line 763,col 9)-(line 763,col 62)",
        "(line 764,col 9)-(line 764,col 79)",
        "(line 765,col 9)-(line 765,col 78)",
        "(line 767,col 9)-(line 855,col 9)",
        "(line 860,col 9)-(line 862,col 9)",
        "(line 864,col 9)-(line 885,col 9)",
        "(line 887,col 9)-(line 899,col 9)",
        "(line 901,col 9)-(line 901,col 28)",
        "(line 902,col 9)-(line 902,col 28)",
        "(line 903,col 9)-(line 906,col 9)",
        "(line 909,col 9)-(line 912,col 9)",
        "(line 914,col 9)-(line 914,col 66)",
        "(line 915,col 9)-(line 915,col 63)",
        "(line 916,col 9)-(line 916,col 68)",
        "(line 917,col 9)-(line 918,col 63)",
        "(line 921,col 9)-(line 925,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.equals(java.lang.Object)",
      "begin_line": 936,
      "end_line": 977,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 67)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 975,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.clone()",
      "begin_line": 986,
      "end_line": 992,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 78)",
        "(line 988,col 9)-(line 989,col 64)",
        "(line 990,col 9)-(line 990,col 65)",
        "(line 991,col 9)-(line 991,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getImage(org.jfree.chart.plot.Plot, int, int, double, double)",
      "begin_line": 1014,
      "end_line": 1018,
      "comment": "\r\n     * Returns the image used to draw a single data item.\r\n     *\r\n     * @param plot  the plot (can be used to obtain standard color information\r\n     *              etc).\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param x  the x value of the item.\r\n     * @param y  the y value of the item.\r\n     *\r\n     * @return The image.\r\n     *\r\n     * @see #getPlotImages()\r\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.getImageHotspot(org.jfree.chart.plot.Plot, int, int, double, double, java.awt.Image)",
      "begin_line": 1037,
      "end_line": 1044,
      "comment": "\r\n     * Returns the hotspot of the image used to draw a single data item.\r\n     * The hotspot is the point relative to the top left of the image\r\n     * that should indicate the data item. The default is the center of the\r\n     * image.\r\n     *\r\n     * @param plot  the plot (can be used to obtain standard color information\r\n     *              etc).\r\n     * @param image  the image (can be used to get size information about the\r\n     *               image)\r\n     * @param series  the series index\r\n     * @param item  the item index\r\n     * @param x  the x value of the item\r\n     * @param y  the y value of the item\r\n     *\r\n     * @return The hotspot used to draw the data item.\r\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 43)",
        "(line 1041,col 9)-(line 1041,col 41)",
        "(line 1042,col 9)-(line 1042,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 35)",
        "(line 1057,col 9)-(line 1057,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYItemRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1067,
      "end_line": 1070,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 36)",
        "(line 1069,col 9)-(line 1069,col 60)"
      ]
    }
  ]
}