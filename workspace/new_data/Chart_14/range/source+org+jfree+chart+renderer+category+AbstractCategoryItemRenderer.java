{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCategoryItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.AbstractRenderer",
        "org.jfree.chart.renderer.category.CategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 163,
      "end_line": 1700,
      "comment": "\r\n * An abstract base class that you can use to implement a new\r\n * {@link CategoryItemRenderer}.  When you create a new\r\n * {@link CategoryItemRenderer} you are not required to extend this class,\r\n * but it makes the job easier.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The plot that the renderer is assigned to. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " A list of label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The base label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowCount"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The number of rows in the dataset (temporary record). "
    },
    {
      "type": "field",
      "varNames": [
        "columnCount"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " The number of columns in the dataset (temporary record). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.AbstractCategoryItemRenderer()",
      "begin_line": 228,
      "end_line": 236,
      "comment": "\r\n     * Creates a new renderer with no tool tip generator and no URL generator.\r\n     * The defaults (no tool tip or URL generators) have been chosen to\r\n     * minimise the processing required to generate a default chart.  If you\r\n     * require tool tips or URLs, then you can easily add the required\r\n     * generators.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 55)",
        "(line 230,col 9)-(line 230,col 53)",
        "(line 231,col 9)-(line 231,col 49)",
        "(line 232,col 9)-(line 233,col 61)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPassCount()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the\r\n     * renderer.  This method returns \u003ccode\u003e1\u003c/code\u003e, subclasses should\r\n     * override if they need more passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPlot()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where\r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned\r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(CategoryPlot)\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is\r\n     * usually called by the {@link CategoryPlot}, in normal usage you\r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(int, int)",
      "begin_line": 291,
      "end_line": 299,
      "comment": "\r\n     * Returns the item label generator for a data item.  This implementation\r\n     * returns the series item label generator if one is defined, otherwise\r\n     * it returns the default item label generator (which may be \r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 294,col 45)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 312,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 324,
      "end_line": 327,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 341,
      "end_line": 347,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 59)",
        "(line 344,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 368,
      "end_line": 371,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 384,
      "end_line": 390,
      "comment": "\r\n     * Sets the base item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 48)",
        "(line 387,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(int, int)",
      "begin_line": 406,
      "end_line": 414,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified\r\n     * item.  This method looks up the generator using the \"three-layer\"\r\n     * approach outlined in the general description of this interface.  You\r\n     * can override this method if you want to return a different generator per\r\n     * item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 47)",
        "(line 409,col 9)-(line 409,col 48)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\"\r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 458,
      "end_line": 464,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 57)",
        "(line 461,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 500,
      "end_line": 506,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 46)",
        "(line 503,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(int, int)",
      "begin_line": 518,
      "end_line": 525,
      "comment": "\r\n     * Returns the URL generator for a data item.  \r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     *\r\n     * @return The URL generator.\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 520,col 72)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The URL generator for the series.\r\n     *\r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 549,
      "end_line": 552,
      "comment": "\r\n     * Sets the URL generator for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 566,
      "end_line": 572,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 53)",
        "(line 569,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\r\n     * Returns the base item URL generator.\r\n     *\r\n     * @return The item URL generator.\r\n     *\r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator.\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 606,
      "end_line": 612,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 42)",
        "(line 609,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 625,
      "end_line": 628,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 638,
      "end_line": 654,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 667,
      "end_line": 672,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 72)",
        "(line 669,col 9)-(line 669,col 74)",
        "(line 670,col 9)-(line 670,col 55)",
        "(line 671,col 9)-(line 671,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations()",
      "begin_line": 680,
      "end_line": 684,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 43)",
        "(line 682,col 9)-(line 682,col 43)",
        "(line 683,col 9)-(line 683,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRowCount()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\r\n     * Returns the number of rows in the dataset.  This value is updated in the\r\n     * {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getColumnCount()",
      "begin_line": 702,
      "end_line": 704,
      "comment": "\r\n     * Returns the number of columns in the dataset.  This value is updated in\r\n     * the {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\r\n     * Creates a new state instance---this method is called from the\r\n     * {@link #initialise(Graphics2D, Rectangle2D, CategoryPlot, int,\r\n     * PlotRenderingInfo)} method.  Subclasses can override this method if\r\n     * they need to use a subclass of {@link CategoryItemRendererState}.\r\n     *\r\n     * @param info  collects plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The new state instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 737,
      "end_line": 755,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be used\r\n     * for the remainder of the drawing process for a single chart.  The state\r\n     * object allows for the fact that the renderer may be used simultaneously\r\n     * by multiple threads (each thread will work with a separate state object).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  an object for returning information about the structure of\r\n     *              the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 22)",
        "(line 744,col 9)-(line 744,col 62)",
        "(line 745,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 779,
      "end_line": 785,
      "comment": "\r\n     * Draws a background for the data area.  The default implementation just\r\n     * gets the plot to draw the background, but some renderers will override \r\n     * this behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 796,
      "end_line": 802,
      "comment": "\r\n     * Draws an outline for the data area.  The default implementation just\r\n     * gets the plot to draw the outline, but some renderers will override this\r\n     * behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double)",
      "begin_line": 820,
      "end_line": 851,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     * \u003cP\u003e\r\n     * Note that this default implementation assumes that the horizontal axis\r\n     * is the domain axis. If this is not the case, you will need to override\r\n     * this method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     *\r\n     * @see #drawRangeGridline(Graphics2D, CategoryPlot, ValueAxis,\r\n     *     Rectangle2D, double)\r\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 27)",
        "(line 826,col 9)-(line 826,col 60)",
        "(line 828,col 9)-(line 835,col 9)",
        "(line 837,col 9)-(line 837,col 52)",
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 27)",
        "(line 843,col 9)-(line 843,col 55)",
        "(line 844,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 29)",
        "(line 849,col 9)-(line 849,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeGridline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double)",
      "begin_line": 866,
      "end_line": 903,
      "comment": "\r\n     * Draws a grid line against the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     *\r\n     * @see #drawDomainGridline(Graphics2D, CategoryPlot, Rectangle2D, double)\r\n     *\r\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 38)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 877,col 9)-(line 877,col 60)",
        "(line 878,col 9)-(line 878,col 80)",
        "(line 879,col 9)-(line 879,col 27)",
        "(line 880,col 9)-(line 887,col 9)",
        "(line 889,col 9)-(line 889,col 51)",
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 27)",
        "(line 895,col 9)-(line 895,col 54)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 29)",
        "(line 901,col 9)-(line 901,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 917,
      "end_line": 989,
      "comment": "\r\n     * Draws a marker for the domain axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker,\r\n     *     Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 46)",
        "(line 924,col 9)-(line 924,col 73)",
        "(line 925,col 9)-(line 925,col 59)",
        "(line 926,col 9)-(line 928,col 9)",
        "(line 930,col 9)-(line 930,col 59)",
        "(line 931,col 9)-(line 932,col 61)",
        "(line 934,col 9)-(line 934,col 60)",
        "(line 935,col 9)-(line 935,col 34)",
        "(line 936,col 9)-(line 973,col 9)",
        "(line 975,col 9)-(line 975,col 41)",
        "(line 976,col 9)-(line 976,col 57)",
        "(line 977,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1003,
      "end_line": 1157,
      "comment": "\r\n     * Draws a marker for the range axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis,\r\n     *     CategoryMarker, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1173,
      "end_line": 1192,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing the label for a marker on\r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 38)",
        "(line 1182,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1190,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1207,
      "end_line": 1226,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 38)",
        "(line 1216,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1224,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 1240,
      "end_line": 1278,
      "comment": "\r\n     * Returns a legend item for a series.  This default implementation will\r\n     * return \u003ccode\u003enull\u003c/code\u003e if {@link #isSeriesVisible(int)} or \r\n     * {@link #isSeriesVisibleInLegend(int)} returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItems()\r\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 35)",
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1248,col 9)-(line 1250,col 9)",
        "(line 1252,col 9)-(line 1252,col 61)",
        "(line 1253,col 9)-(line 1254,col 24)",
        "(line 1255,col 9)-(line 1255,col 35)",
        "(line 1256,col 9)-(line 1256,col 34)",
        "(line 1257,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1261,col 30)",
        "(line 1262,col 9)-(line 1265,col 9)",
        "(line 1266,col 9)-(line 1266,col 48)",
        "(line 1267,col 9)-(line 1267,col 48)",
        "(line 1268,col 9)-(line 1268,col 62)",
        "(line 1269,col 9)-(line 1269,col 65)",
        "(line 1271,col 9)-(line 1272,col 68)",
        "(line 1273,col 9)-(line 1273,col 53)",
        "(line 1274,col 9)-(line 1274,col 36)",
        "(line 1275,col 9)-(line 1275,col 33)",
        "(line 1276,col 9)-(line 1276,col 43)",
        "(line 1277,col 9)-(line 1277,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(java.lang.Object)",
      "begin_line": 1287,
      "end_line": 1342,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1294,col 9)",
        "(line 1295,col 9)-(line 1295,col 79)",
        "(line 1297,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1308,col 9)",
        "(line 1309,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode()",
      "begin_line": 1349,
      "end_line": 1352,
      "comment": "\r\n     * Returns a hash code for the renderer.\r\n     *\r\n     * @return The hash code.\r\n     ",
      "child_ranges": [
        "(line 1350,col 9)-(line 1350,col 38)",
        "(line 1351,col 9)-(line 1351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDrawingSupplier()",
      "begin_line": 1359,
      "end_line": 1366,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 38)",
        "(line 1361,col 9)-(line 1361,col 36)",
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, double, double, boolean)",
      "begin_line": 1381,
      "end_line": 1411,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1389,col 49)",
        "(line 1390,col 9)-(line 1409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1425,
      "end_line": 1446,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 33)",
        "(line 1430,col 9)-(line 1439,col 9)",
        "(line 1440,col 9)-(line 1444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.clone()",
      "begin_line": 1458,
      "end_line": 1528,
      "comment": "\r\n     * Returns an independent copy of the renderer.  The \u003ccode\u003eplot\u003c/code\u003e\r\n     * reference is shallow copied.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  can be thrown if one of the objects\r\n     *         belonging to the renderer does not support cloning (for example,\r\n     *         an item label generator).\r\n     ",
      "child_ranges": [
        "(line 1460,col 9)-(line 1461,col 63)",
        "(line 1464,col 9)-(line 1467,col 9)",
        "(line 1469,col 9)-(line 1480,col 9)",
        "(line 1482,col 9)-(line 1485,col 9)",
        "(line 1487,col 9)-(line 1498,col 9)",
        "(line 1500,col 9)-(line 1502,col 9)",
        "(line 1504,col 9)-(line 1513,col 9)",
        "(line 1515,col 9)-(line 1518,col 9)",
        "(line 1519,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1526,col 9)",
        "(line 1527,col 9)-(line 1527,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 1538,
      "end_line": 1544,
      "comment": "\r\n     * Returns a domain axis for a plot.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A domain axis.\r\n     ",
      "child_ranges": [
        "(line 1539,col 9)-(line 1539,col 56)",
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1543,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 1554,
      "end_line": 1560,
      "comment": "\r\n     * Returns a range axis for a plot.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A range axis.\r\n     ",
      "child_ranges": [
        "(line 1555,col 9)-(line 1555,col 52)",
        "(line 1556,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1559,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems()",
      "begin_line": 1570,
      "end_line": 1590,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 1571,col 9)-(line 1573,col 9)",
        "(line 1574,col 9)-(line 1574,col 65)",
        "(line 1575,col 9)-(line 1575,col 47)",
        "(line 1576,col 9)-(line 1576,col 62)",
        "(line 1577,col 9)-(line 1588,col 9)",
        "(line 1589,col 9)-(line 1589,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 1599,
      "end_line": 1601,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1600,col 9)-(line 1600,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 1611,
      "end_line": 1618,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1615,col 9)",
        "(line 1616,col 9)-(line 1616,col 50)",
        "(line 1617,col 9)-(line 1617,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 1627,
      "end_line": 1629,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1628,col 9)-(line 1628,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 1639,
      "end_line": 1643,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1641,col 9)-(line 1641,col 52)",
        "(line 1642,col 9)-(line 1642,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 1652,
      "end_line": 1654,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 1653,col 9)-(line 1653,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 1664,
      "end_line": 1668,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 48)",
        "(line 1667,col 9)-(line 1667,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addItemEntity(org.jfree.chart.entity.EntityCollection, org.jfree.data.category.CategoryDataset, int, int, java.awt.Shape)",
      "begin_line": 1679,
      "end_line": 1697,
      "comment": "\r\n     * Adds an entity with the specified hotspot.\r\n     *\r\n     * @param entities  the entity collection.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param hotspot  the hotspot.\r\n     ",
      "child_ranges": [
        "(line 1683,col 9)-(line 1683,col 26)",
        "(line 1684,col 9)-(line 1684,col 76)",
        "(line 1685,col 9)-(line 1687,col 9)",
        "(line 1688,col 9)-(line 1688,col 26)",
        "(line 1689,col 9)-(line 1689,col 68)",
        "(line 1690,col 9)-(line 1692,col 9)",
        "(line 1693,col 9)-(line 1694,col 79)",
        "(line 1695,col 9)-(line 1695,col 29)"
      ]
    }
  ]
}