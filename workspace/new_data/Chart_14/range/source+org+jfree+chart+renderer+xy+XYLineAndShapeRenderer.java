{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYLineAndShapeRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYLineAndShapeRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 103,
      "end_line": 1202,
      "comment": "\r\n * A renderer that connects data points with lines and/or draws shapes at each\r\n * data point.  This renderer is designed for use with the {@link XYPlot} \r\n * class.\r\n "
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
        "seriesLinesVisible"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " \r\n     * A table of flags that control (per series) whether or not lines are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLinesVisible"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The default value returned by the getLinesVisible() method. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLine"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The shape that is used to represent a line in the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesVisible"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " \r\n     * A table of flags that control (per series) whether or not shapes are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesVisible"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " The default value returned by the getShapeVisible() method. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesFilled"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " \r\n     * A table of flags that control (per series) whether or not shapes are \r\n     * filled. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesFilled"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The default value returned by the getShapeFilled() method. "
    },
    {
      "type": "field",
      "varNames": [
        "drawOutlines"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " A flag that controls whether outlines are drawn for shapes. "
    },
    {
      "type": "field",
      "varNames": [
        "useFillPaint"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " \r\n     * A flag that controls whether the fill paint is used for filling \r\n     * shapes. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useOutlinePaint"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " \r\n     * A flag that controls whether the outline paint is used for drawing shape \r\n     * outlines. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawSeriesLineAsPath"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " \r\n     * A flag that controls whether or not each series is drawn as a single \r\n     * path. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.XYLineAndShapeRenderer()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Creates a new renderer with both lines and shapes visible.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.XYLineAndShapeRenderer(boolean, boolean)",
      "begin_line": 176,
      "end_line": 193,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param lines  lines visible?\r\n     * @param shapes  shapes visible?\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 179,col 65)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 40)",
        "(line 184,col 9)-(line 184,col 34)",
        "(line 185,col 9)-(line 185,col 52)",
        "(line 186,col 9)-(line 186,col 37)",
        "(line 188,col 9)-(line 188,col 33)",
        "(line 189,col 9)-(line 189,col 37)",
        "(line 192,col 9)-(line 192,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getDrawSeriesLineAsPath()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns a flag that controls whether or not each series is drawn as a \r\n     * single path.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawSeriesLineAsPath(boolean)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setDrawSeriesLineAsPath(boolean)",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\r\n     * Sets the flag that controls whether or not each series is drawn as a \r\n     * single path.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getDrawSeriesLineAsPath()\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getPassCount()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the number of passes through the data that the renderer requires \r\n     * in order to draw the chart.  Most charts will require a single pass, but \r\n     * some require two passes.\r\n     * \r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getItemLineVisible(int, int)",
      "begin_line": 244,
      "end_line": 252,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item is \r\n     * visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 53)",
        "(line 246,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getSeriesLinesVisible(int)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the flag used to control whether or not the lines for a series \r\n     * are visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesLinesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setSeriesLinesVisible(int, java.lang.Boolean)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\r\n     * Sets the \u0027lines visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesLinesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 57)",
        "(line 279,col 9)-(line 279,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setSeriesLinesVisible(int, boolean)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Sets the \u0027lines visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSeriesLinesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getBaseLinesVisible()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\r\n     * Returns the base \u0027lines visible\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #setBaseLinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setBaseLinesVisible(boolean)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\r\n     * Sets the base \u0027lines visible\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseLinesVisible()\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 37)",
        "(line 316,col 9)-(line 316,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getLegendLine()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the shape used to represent a line in the legend.\r\n     * \r\n     * @return The legend line (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLine(Shape)\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setLegendLine(java.awt.Shape)",
      "begin_line": 338,
      "end_line": 344,
      "comment": "\r\n     * Sets the shape used as a line in each legend item and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendLine()\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 31)",
        "(line 343,col 9)-(line 343,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getItemShapeVisible(int, int)",
      "begin_line": 361,
      "end_line": 369,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item is\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the \r\n     * \u003ccode\u003egetSeriesShapesVisible\u003c/code\u003e method. You can override this method\r\n     * if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 54)",
        "(line 363,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getSeriesShapesVisible(int)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Returns the flag used to control whether or not the shapes for a series\r\n     * are visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setSeriesShapesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setSeriesShapesVisible(int, boolean)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\r\n     * Sets the \u0027shapes visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSeriesShapesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setSeriesShapesVisible(int, java.lang.Boolean)",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\r\n     * Sets the \u0027shapes visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getSeriesShapesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 58)",
        "(line 409,col 9)-(line 409,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getBaseShapesVisible()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\r\n     * Returns the base \u0027shape visible\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #setBaseShapesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setBaseShapesVisible(boolean)",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\r\n     * Sets the base \u0027shapes visible\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseShapesVisible()\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 38)",
        "(line 433,col 9)-(line 433,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getItemShapeFilled(int, int)",
      "begin_line": 451,
      "end_line": 459,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item \r\n     * is filled.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the \r\n     * \u003ccode\u003egetSeriesShapesFilled\u003c/code\u003e method. You can override this method\r\n     * if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 53)",
        "(line 453,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getSeriesShapesFilled(int)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\r\n     * Returns the flag used to control whether or not the shapes for a series\r\n     * are filled.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setSeriesShapesFilled(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setSeriesShapesFilled(int, boolean)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setSeriesShapesFilled(int, java.lang.Boolean)",
      "begin_line": 497,
      "end_line": 500,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 57)",
        "(line 499,col 9)-(line 499,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getBaseShapesFilled()",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\r\n     * Returns the base \u0027shape filled\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #setBaseShapesFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setBaseShapesFilled(boolean)",
      "begin_line": 521,
      "end_line": 524,
      "comment": "\r\n     * Sets the base \u0027shapes filled\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseShapesFilled()\r\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 37)",
        "(line 523,col 9)-(line 523,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getDrawOutlines()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if outlines should be drawn for shapes, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawOutlines(boolean)\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setDrawOutlines(boolean)",
      "begin_line": 550,
      "end_line": 553,
      "comment": "\r\n     * Sets the flag that controls whether outlines are drawn for \r\n     * shapes, and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners. \r\n     * \u003cP\u003e\r\n     * In some cases, shapes look better if they do NOT have an outline, but \r\n     * this flag allows you to set your own preference.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getDrawOutlines()\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 33)",
        "(line 552,col 9)-(line 552,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getUseFillPaint()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should use the fill paint \r\n     * setting to fill shapes, and \u003ccode\u003efalse\u003c/code\u003e if it should just\r\n     * use the regular paint.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setUseFillPaint(boolean)\r\n     * @see #getUseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setUseFillPaint(boolean)",
      "begin_line": 578,
      "end_line": 581,
      "comment": "\r\n     * Sets the flag that controls whether the fill paint is used to fill \r\n     * shapes, and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getUseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 33)",
        "(line 580,col 9)-(line 580,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getUseOutlinePaint()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should use the outline paint \r\n     * setting to draw shape outlines, and \u003ccode\u003efalse\u003c/code\u003e if it should just\r\n     * use the regular paint.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setUseOutlinePaint(boolean)\r\n     * @see #getUseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.setUseOutlinePaint(boolean)",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\r\n     * Sets the flag that controls whether the outline paint is used to draw \r\n     * shape outlines, and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getUseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 36)",
        "(line 608,col 9)-(line 608,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 616,
      "end_line": 655,
      "comment": "\r\n     * Records the state for the renderer.  This is used to preserve state \r\n     * information between calls to the drawItem() method for a single chart \r\n     * drawing.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPath"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": " The path for the current series. "
    },
    {
      "type": "field",
      "varNames": [
        "lastPointGood"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": " \r\n         * A flag that indicates if the last (x, y) point was \u0027good\u0027 \r\n         * (non-null). \r\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.State(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\r\n         * Creates a new state instance.\r\n         * \r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.isLastPointGood()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n         * Returns a flag that indicates if the last point drawn (in the \r\n         * current series) was \u0027good\u0027 (non-null).\r\n         * \r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 643,col 13)-(line 643,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.setLastPointGood(boolean)",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\r\n         * Sets a flag that indicates if the last point drawn (in the current \r\n         * series) was \u0027good\u0027 (non-null).\r\n         * \r\n         * @param good  the flag.\r\n         ",
      "child_ranges": [
        "(line 653,col 13)-(line 653,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 673,
      "end_line": 683,
      "comment": "\r\n     * Initialises the renderer.\r\n     * \u003cP\u003e\r\n     * This method will be called before the first item is rendered, giving the\r\n     * renderer an opportunity to initialise any state information it wants to \r\n     * maintain.  The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 38)",
        "(line 680,col 9)-(line 680,col 45)",
        "(line 681,col 9)-(line 681,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 703,
      "end_line": 754,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 719,col 9)",
        "(line 722,col 9)-(line 753,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.isLinePass(int)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified pass is the one for drawing \r\n     * lines.\r\n     * \r\n     * @param pass  the pass.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.isItemPass(int)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified pass is the one for drawing \r\n     * items.\r\n     * \r\n     * @param pass  the pass.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.drawPrimaryLine(org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, int, int, int, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D)",
      "begin_line": 796,
      "end_line": 849,
      "comment": "\r\n     * Draws the item (first pass). This method draws the lines\r\n     * connecting the items.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param pass  the pass.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 808,col 9)",
        "(line 811,col 9)-(line 811,col 52)",
        "(line 812,col 9)-(line 812,col 52)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 817,col 56)",
        "(line 818,col 9)-(line 818,col 56)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 823,col 9)-(line 823,col 63)",
        "(line 824,col 9)-(line 824,col 62)",
        "(line 826,col 9)-(line 826,col 79)",
        "(line 827,col 9)-(line 827,col 78)",
        "(line 829,col 9)-(line 829,col 79)",
        "(line 830,col 9)-(line 830,col 78)",
        "(line 833,col 9)-(line 836,col 9)",
        "(line 838,col 9)-(line 838,col 60)",
        "(line 839,col 9)-(line 844,col 9)",
        "(line 846,col 9)-(line 848,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.drawFirstPassShape(java.awt.Graphics2D, int, int, int, java.awt.Shape)",
      "begin_line": 860,
      "end_line": 865,
      "comment": "\r\n     * Draws the first pass shape.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param pass  the pass.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param shape  the shape.\r\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 50)",
        "(line 863,col 9)-(line 863,col 48)",
        "(line 864,col 9)-(line 864,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.drawPrimaryLineAsPath(org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, int, int, int, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D)",
      "begin_line": 886,
      "end_line": 932,
      "comment": "\r\n     * Draws the item (first pass). This method draws the lines\r\n     * connecting the items. Instead of drawing separate lines,\r\n     * a GeneralPath is constructed and drawn at the end of\r\n     * the series painting.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param dataset  the dataset.\r\n     * @param pass  the pass.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 63)",
        "(line 898,col 9)-(line 898,col 62)",
        "(line 901,col 9)-(line 901,col 52)",
        "(line 902,col 9)-(line 902,col 52)",
        "(line 903,col 9)-(line 903,col 79)",
        "(line 904,col 9)-(line 904,col 78)",
        "(line 906,col 9)-(line 906,col 32)",
        "(line 908,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.drawSecondaryPass(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, int, int, int, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.CrosshairState, org.jfree.chart.entity.EntityCollection)",
      "begin_line": 953,
      "end_line": 1034,
      "comment": "\r\n     * Draws the item shapes and adds chart entities (second pass). This method \r\n     * draws the shapes which mark the item positions. If \u003ccode\u003eentities\u003c/code\u003e \r\n     * is not \u003ccode\u003enull\u003c/code\u003e it will be populated with entity information\r\n     * for points that fall within the data area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param pass  the pass.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  the crosshair state.\r\n     * @param entities the entity collection.\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 32)",
        "(line 965,col 9)-(line 965,col 52)",
        "(line 966,col 9)-(line 966,col 52)",
        "(line 967,col 9)-(line 969,col 9)",
        "(line 971,col 9)-(line 971,col 60)",
        "(line 972,col 9)-(line 972,col 63)",
        "(line 973,col 9)-(line 973,col 62)",
        "(line 974,col 9)-(line 974,col 79)",
        "(line 975,col 9)-(line 975,col 78)",
        "(line 977,col 9)-(line 1009,col 9)",
        "(line 1011,col 9)-(line 1011,col 28)",
        "(line 1012,col 9)-(line 1012,col 28)",
        "(line 1013,col 9)-(line 1016,col 9)",
        "(line 1019,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1024,col 66)",
        "(line 1025,col 9)-(line 1025,col 63)",
        "(line 1026,col 9)-(line 1027,col 73)",
        "(line 1031,col 9)-(line 1033,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.getLegendItem(int, int)",
      "begin_line": 1045,
      "end_line": 1096,
      "comment": "\r\n     * Returns a legend item for the specified series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 32)",
        "(line 1048,col 9)-(line 1050,col 9)",
        "(line 1052,col 9)-(line 1052,col 33)",
        "(line 1053,col 9)-(line 1053,col 58)",
        "(line 1054,col 9)-(line 1092,col 9)",
        "(line 1094,col 9)-(line 1094,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.clone()",
      "begin_line": 1105,
      "end_line": 1117,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the clone cannot be created.\r\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 78)",
        "(line 1107,col 9)-(line 1108,col 64)",
        "(line 1109,col 9)-(line 1111,col 9)",
        "(line 1112,col 9)-(line 1113,col 65)",
        "(line 1114,col 9)-(line 1115,col 64)",
        "(line 1116,col 9)-(line 1116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.equals(java.lang.Object)",
      "begin_line": 1126,
      "end_line": 1174,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1129,col 9)",
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1135,col 9)",
        "(line 1136,col 9)-(line 1136,col 67)",
        "(line 1137,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1153,col 9)",
        "(line 1154,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1163,col 9)",
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1170,col 9)-(line 1172,col 9)",
        "(line 1173,col 9)-(line 1173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 1184,
      "end_line": 1188,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 35)",
        "(line 1187,col 9)-(line 1187,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1197,
      "end_line": 1200,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 36)",
        "(line 1199,col 9)-(line 1199,col 60)"
      ]
    }
  ]
}