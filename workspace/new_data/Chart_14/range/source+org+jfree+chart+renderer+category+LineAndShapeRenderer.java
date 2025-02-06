{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/LineAndShapeRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineAndShapeRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 121,
      "end_line": 900,
      "comment": "\r\n * A renderer that draws shapes for each data item, and lines between data \r\n * items (for use with the {@link CategoryPlot} class).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesLinesVisible"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " \r\n     * A table of flags that control (per series) whether or not lines are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLinesVisible"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " \r\n     * A flag indicating whether or not lines are drawn between non-null \r\n     * points. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesVisible"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " \r\n     * A table of flags that control (per series) whether or not shapes are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesVisible"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The default value returned by the getShapeVisible() method. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesFilled"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " \r\n     * A table of flags that control (per series) whether or not shapes are \r\n     * filled. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesFilled"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The default value returned by the getShapeFilled() method. "
    },
    {
      "type": "field",
      "varNames": [
        "useFillPaint"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " \r\n     * A flag that controls whether the fill paint is used for filling \r\n     * shapes. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawOutlines"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " A flag that controls whether outlines are drawn for shapes. "
    },
    {
      "type": "field",
      "varNames": [
        "useOutlinePaint"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " \r\n     * A flag that controls whether the outline paint is used for drawing shape \r\n     * outlines - if not, the regular series paint is used. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useSeriesOffset"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\r\n     * A flag that controls whether or not the x-position for each item is\r\n     * offset within the category according to the series.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": "\r\n     * The item margin used for series offsetting - this allows the positioning\r\n     * to match the bar positions of the {@link BarRenderer} class.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.LineAndShapeRenderer()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Creates a renderer with both lines and shapes visible by default.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.LineAndShapeRenderer(boolean, boolean)",
      "begin_line": 202,
      "end_line": 215,
      "comment": "\r\n     * Creates a new renderer with lines and/or shapes visible.\r\n     * \r\n     * @param lines  draw lines?\r\n     * @param shapes  draw shapes?\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 16)",
        "(line 204,col 9)-(line 204,col 52)",
        "(line 205,col 9)-(line 205,col 38)",
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 208,col 52)",
        "(line 209,col 9)-(line 209,col 37)",
        "(line 210,col 9)-(line 210,col 34)",
        "(line 211,col 9)-(line 211,col 33)",
        "(line 212,col 9)-(line 212,col 37)",
        "(line 213,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getItemLineVisible(int, int)",
      "begin_line": 228,
      "end_line": 236,
      "comment": "\r\n     * Returns the flag used to control whether or not the line for an item is \r\n     * visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 53)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getSeriesLinesVisible(int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Returns the flag used to control whether or not the lines for a series \r\n     * are visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesLinesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setSeriesLinesVisible(int, java.lang.Boolean)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\r\n     * Sets the \u0027lines visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesLinesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 57)",
        "(line 263,col 9)-(line 263,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setSeriesLinesVisible(int, boolean)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Sets the \u0027lines visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSeriesLinesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getBaseLinesVisible()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the base \u0027lines visible\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #getBaseLinesVisible()\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setBaseLinesVisible(boolean)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\r\n     * Sets the base \u0027lines visible\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseLinesVisible()\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 37)",
        "(line 300,col 9)-(line 300,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getItemShapeVisible(int, int)",
      "begin_line": 314,
      "end_line": 322,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item is \r\n     * visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getSeriesShapesVisible(int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Returns the flag used to control whether or not the shapes for a series\r\n     * are visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setSeriesShapesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setSeriesShapesVisible(int, boolean)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Sets the \u0027shapes visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSeriesShapesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setSeriesShapesVisible(int, java.lang.Boolean)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\r\n     * Sets the \u0027shapes visible\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getSeriesShapesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 58)",
        "(line 362,col 9)-(line 362,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getBaseShapesVisible()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the base \u0027shape visible\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #setBaseShapesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setBaseShapesVisible(boolean)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\r\n     * Sets the base \u0027shapes visible\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseShapesVisible()\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 38)",
        "(line 386,col 9)-(line 386,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getDrawOutlines()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if outlines should be drawn for shapes, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawOutlines(boolean)\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setDrawOutlines(boolean)",
      "begin_line": 413,
      "end_line": 416,
      "comment": "\r\n     * Sets the flag that controls whether outlines are drawn for \r\n     * shapes, and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners. \r\n     * \u003cP\u003e\r\n     * In some cases, shapes look better if they do NOT have an outline, but \r\n     * this flag allows you to set your own preference.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getDrawOutlines()\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 33)",
        "(line 415,col 9)-(line 415,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getUseOutlinePaint()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\r\n     * Returns the flag that controls whether the outline paint is used for \r\n     * shape outlines.  If not, the regular series paint is used.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setUseOutlinePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setUseOutlinePaint(boolean)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\r\n     * Sets the flag that controls whether the outline paint is used for shape \r\n     * outlines, and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners. \r\n     * \r\n     * @param use  the flag.\r\n     * \r\n     * @see #getUseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 35)",
        "(line 441,col 9)-(line 441,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getItemShapeFilled(int, int)",
      "begin_line": 457,
      "end_line": 465,
      "comment": "\r\n     * Returns the flag used to control whether or not the shape for an item \r\n     * is filled. The default implementation passes control to the \r\n     * \u003ccode\u003egetSeriesShapesFilled\u003c/code\u003e method. You can override this method\r\n     * if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 53)",
        "(line 459,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getSeriesShapesFilled(int)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Returns the flag used to control whether or not the shapes for a series \r\n     * are filled. \r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setSeriesShapesFilled(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setSeriesShapesFilled(int, java.lang.Boolean)",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param filled  the flag.\r\n     * \r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 59)",
        "(line 492,col 9)-(line 492,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setSeriesShapesFilled(int, boolean)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 flag for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param filled  the flag.\r\n     * \r\n     * @see #getSeriesShapesFilled(int)\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 76)",
        "(line 506,col 9)-(line 506,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getBaseShapesFilled()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\r\n     * Returns the base \u0027shape filled\u0027 attribute.\r\n     *\r\n     * @return The base flag.\r\n     * \r\n     * @see #setBaseShapesFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setBaseShapesFilled(boolean)",
      "begin_line": 528,
      "end_line": 531,
      "comment": "\r\n     * Sets the base \u0027shapes filled\u0027 flag and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getBaseShapesFilled()\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 37)",
        "(line 530,col 9)-(line 530,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getUseFillPaint()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should use the fill paint \r\n     * setting to fill shapes, and \u003ccode\u003efalse\u003c/code\u003e if it should just\r\n     * use the regular paint.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setUseFillPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setUseFillPaint(boolean)",
      "begin_line": 555,
      "end_line": 558,
      "comment": "\r\n     * Sets the flag that controls whether the fill paint is used to fill \r\n     * shapes, and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getUseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 33)",
        "(line 557,col 9)-(line 557,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getUseSeriesOffset()",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\r\n     * Returns the flag that controls whether or not the x-position for each\r\n     * data item is offset within the category according to the series.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setUseSeriesOffset(boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setUseSeriesOffset(boolean)",
      "begin_line": 585,
      "end_line": 588,
      "comment": "\r\n     * Sets the flag that controls whether or not the x-position for each \r\n     * data item is offset within its category according to the series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset.\r\n     * \r\n     * @see #getUseSeriesOffset()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 38)",
        "(line 587,col 9)-(line 587,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getItemMargin()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\r\n     * Returns the item margin, which is the gap between items within a \r\n     * category (expressed as a percentage of the overall category width).  \r\n     * This can be used to match the offset alignment with the bars drawn by \r\n     * a {@link BarRenderer}).\r\n     * \r\n     * @return The item margin.\r\n     * \r\n     * @see #setItemMargin(double)\r\n     * @see #getUseSeriesOffset()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.setItemMargin(double)",
      "begin_line": 619,
      "end_line": 625,
      "comment": "\r\n     * Sets the item margin, which is the gap between items within a category\r\n     * (expressed as a percentage of the overall category width), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param margin  the margin (0.0 \u003c\u003d margin \u003c 1.0).\r\n     * \r\n     * @see #getItemMargin()\r\n     * @see #getUseSeriesOffset()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 33)",
        "(line 624,col 9)-(line 624,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getLegendItem(int, int)",
      "begin_line": 635,
      "end_line": 680,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 36)",
        "(line 638,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.getPassCount()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\r\n     * This renderer uses two passes to draw the data.\r\n     * \r\n     * @return The pass count (\u003ccode\u003e2\u003c/code\u003e for this renderer).\r\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 705,
      "end_line": 830,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 713,col 9)",
        "(line 716,col 9)-(line 719,col 9)",
        "(line 722,col 9)-(line 722,col 49)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 727,col 9)-(line 727,col 60)",
        "(line 730,col 9)-(line 730,col 18)",
        "(line 731,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 39)",
        "(line 741,col 9)-(line 742,col 41)",
        "(line 744,col 9)-(line 778,col 9)",
        "(line 780,col 9)-(line 828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.equals(java.lang.Object)",
      "begin_line": 839,
      "end_line": 880,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 846,col 9)",
        "(line 848,col 9)-(line 848,col 63)",
        "(line 849,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LineAndShapeRenderer.clone()",
      "begin_line": 889,
      "end_line": 898,
      "comment": "\r\n     * Returns an independent copy of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 74)",
        "(line 891,col 9)-(line 892,col 64)",
        "(line 893,col 9)-(line 894,col 65)",
        "(line 895,col 9)-(line 896,col 64)",
        "(line 897,col 9)-(line 897,col 21)"
      ]
    }
  ]
}