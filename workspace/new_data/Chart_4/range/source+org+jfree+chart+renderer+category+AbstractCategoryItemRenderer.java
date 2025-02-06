{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java",
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
      "begin_line": 177,
      "end_line": 1863,
      "comment": "\r\n * An abstract base class that you can use to implement a new\r\n * {@link CategoryItemRenderer}.  When you create a new\r\n * {@link CategoryItemRenderer} you are not required to extend this class,\r\n * but it makes the job easier.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The plot that the renderer is assigned to. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " A list of label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " The base label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowCount"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " The number of rows in the dataset (temporary record). "
    },
    {
      "type": "field",
      "varNames": [
        "columnCount"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " The number of columns in the dataset (temporary record). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.AbstractCategoryItemRenderer()",
      "begin_line": 243,
      "end_line": 251,
      "comment": "\r\n     * Creates a new renderer with no tool tip generator and no URL generator.\r\n     * The defaults (no tool tip or URL generators) have been chosen to\r\n     * minimise the processing required to generate a default chart.  If you\r\n     * require tool tips or URLs, then you can easily add the required\r\n     * generators.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 55)",
        "(line 245,col 9)-(line 245,col 53)",
        "(line 246,col 9)-(line 246,col 49)",
        "(line 247,col 9)-(line 248,col 61)",
        "(line 249,col 9)-(line 249,col 53)",
        "(line 250,col 9)-(line 250,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPassCount()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the\r\n     * renderer.  This method returns \u003ccode\u003e1\u003c/code\u003e, subclasses should\r\n     * override if they need more passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPlot()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where\r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned\r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(CategoryPlot)\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is\r\n     * usually called by the {@link CategoryPlot}, in normal usage you\r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 309,
      "end_line": 317,
      "comment": "\r\n     * Returns the item label generator for a data item.  This implementation\r\n     * returns the series item label generator if one is defined, otherwise\r\n     * it returns the default item label generator (which may be\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 312,col 53)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 330,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 359,
      "end_line": 365,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 59)",
        "(line 362,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 386,
      "end_line": 389,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 402,
      "end_line": 408,
      "comment": "\r\n     * Sets the base item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 48)",
        "(line 405,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 425,
      "end_line": 434,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified\r\n     * item.  You can override this method if you want to return a different\r\n     * generator per item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 47)",
        "(line 429,col 9)-(line 429,col 48)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\"\r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 459,
      "end_line": 462,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 477,
      "end_line": 483,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 57)",
        "(line 480,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 46)",
        "(line 522,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 540,
      "end_line": 548,
      "comment": "\r\n     * Returns the URL generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The URL generator.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 543,col 72)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The URL generator for the series.\r\n     *\r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 572,
      "end_line": 575,
      "comment": "\r\n     * Sets the URL generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 589,
      "end_line": 595,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 53)",
        "(line 592,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\r\n     * Returns the base item URL generator.\r\n     *\r\n     * @return The item URL generator.\r\n     *\r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 615,
      "end_line": 617,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator.\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 629,
      "end_line": 635,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 42)",
        "(line 632,col 9)-(line 634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 648,
      "end_line": 651,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 661,
      "end_line": 677,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 690,
      "end_line": 695,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 72)",
        "(line 692,col 9)-(line 692,col 74)",
        "(line 693,col 9)-(line 693,col 55)",
        "(line 694,col 9)-(line 694,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations()",
      "begin_line": 703,
      "end_line": 707,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 43)",
        "(line 705,col 9)-(line 705,col 43)",
        "(line 706,col 9)-(line 706,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 728,
      "end_line": 735,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 50)",
        "(line 734,col 9)-(line 734,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 756,
      "end_line": 760,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 52)",
        "(line 759,col 9)-(line 759,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 781,
      "end_line": 785,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 48)",
        "(line 784,col 9)-(line 784,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRowCount()",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\r\n     * Returns the number of rows in the dataset.  This value is updated in the\r\n     * {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getColumnCount()",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\r\n     * Returns the number of columns in the dataset.  This value is updated in\r\n     * the {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\r\n     * Creates a new state instance---this method is called from the\r\n     * {@link #initialise(Graphics2D, Rectangle2D, CategoryPlot, int,\r\n     * PlotRenderingInfo)} method.  Subclasses can override this method if\r\n     * they need to use a subclass of {@link CategoryItemRendererState}.\r\n     *\r\n     * @param info  collects plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The new state instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 838,
      "end_line": 868,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be used\r\n     * for the remainder of the drawing process for a single chart.  The state\r\n     * object allows for the fact that the renderer may be used simultaneously\r\n     * by multiple threads (each thread will work with a separate state object).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  an object for returning information about the structure of\r\n     *              the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 22)",
        "(line 845,col 9)-(line 845,col 62)",
        "(line 846,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 60)",
        "(line 855,col 9)-(line 855,col 57)",
        "(line 856,col 9)-(line 856,col 35)",
        "(line 857,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 58)",
        "(line 864,col 9)-(line 865,col 36)",
        "(line 866,col 9)-(line 866,col 51)",
        "(line 867,col 9)-(line 867,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 879,
      "end_line": 881,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 895,
      "end_line": 914,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the y-interval if the dataset has one.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 913,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 930,
      "end_line": 935,
      "comment": "\r\n     * Returns the Java2D coordinate for the middle of the specified data item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param dataset  the dataset.\r\n     * @param axis  the axis.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate for the middle of the item.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 934,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 946,
      "end_line": 952,
      "comment": "\r\n     * Draws a background for the data area.  The default implementation just\r\n     * gets the plot to draw the background, but some renderers will override\r\n     * this behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 963,
      "end_line": 969,
      "comment": "\r\n     * Draws an outline for the data area.  The default implementation just\r\n     * gets the plot to draw the outline, but some renderers will override this\r\n     * behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 991,
      "end_line": 1016,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     * \u003cP\u003e\r\n     * Note that this default implementation assumes that the horizontal axis\r\n     * is the domain axis. If this is not the case, you will need to override\r\n     * this method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeGridline(Graphics2D, CategoryPlot, ValueAxis,\r\n     *     Rectangle2D, double)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 27)",
        "(line 1001,col 9)-(line 1001,col 60)",
        "(line 1003,col 9)-(line 1010,col 9)",
        "(line 1012,col 9)-(line 1012,col 27)",
        "(line 1013,col 9)-(line 1013,col 29)",
        "(line 1014,col 9)-(line 1014,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1034,
      "end_line": 1058,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeGridline\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 38)",
        "(line 1038,col 9)-(line 1040,col 9)",
        "(line 1042,col 9)-(line 1042,col 60)",
        "(line 1043,col 9)-(line 1043,col 27)",
        "(line 1044,col 9)-(line 1044,col 80)",
        "(line 1045,col 9)-(line 1052,col 9)",
        "(line 1054,col 9)-(line 1054,col 27)",
        "(line 1055,col 9)-(line 1055,col 29)",
        "(line 1056,col 9)-(line 1056,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 1072,
      "end_line": 1144,
      "comment": "\r\n     * Draws a marker for the domain axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker,\r\n     *     Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 46)",
        "(line 1079,col 9)-(line 1079,col 73)",
        "(line 1080,col 9)-(line 1080,col 59)",
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1085,col 9)-(line 1085,col 59)",
        "(line 1086,col 9)-(line 1087,col 61)",
        "(line 1089,col 9)-(line 1089,col 60)",
        "(line 1090,col 9)-(line 1090,col 34)",
        "(line 1091,col 9)-(line 1128,col 9)",
        "(line 1130,col 9)-(line 1130,col 41)",
        "(line 1131,col 9)-(line 1131,col 57)",
        "(line 1132,col 9)-(line 1142,col 9)",
        "(line 1143,col 9)-(line 1143,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1158,
      "end_line": 1312,
      "comment": "\r\n     * Draws a marker for the range axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis,\r\n     *     CategoryMarker, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1328,
      "end_line": 1347,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing the label for a marker on\r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1336,col 38)",
        "(line 1337,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1362,
      "end_line": 1381,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1370,col 9)-(line 1370,col 38)",
        "(line 1371,col 9)-(line 1378,col 9)",
        "(line 1379,col 9)-(line 1379,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 1395,
      "end_line": 1438,
      "comment": "\r\n     * Returns a legend item for a series.  This default implementation will\r\n     * return \u003ccode\u003enull\u003c/code\u003e if {@link #isSeriesVisible(int)} or\r\n     * {@link #isSeriesVisibleInLegend(int)} returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItems()\r\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1397,col 35)",
        "(line 1398,col 9)-(line 1400,col 9)",
        "(line 1403,col 9)-(line 1405,col 9)",
        "(line 1407,col 9)-(line 1407,col 61)",
        "(line 1408,col 9)-(line 1409,col 24)",
        "(line 1410,col 9)-(line 1410,col 35)",
        "(line 1411,col 9)-(line 1411,col 34)",
        "(line 1412,col 9)-(line 1415,col 9)",
        "(line 1416,col 9)-(line 1416,col 30)",
        "(line 1417,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 48)",
        "(line 1422,col 9)-(line 1422,col 48)",
        "(line 1423,col 9)-(line 1423,col 62)",
        "(line 1424,col 9)-(line 1424,col 65)",
        "(line 1426,col 9)-(line 1427,col 68)",
        "(line 1428,col 9)-(line 1428,col 56)",
        "(line 1429,col 9)-(line 1429,col 57)",
        "(line 1430,col 9)-(line 1432,col 9)",
        "(line 1433,col 9)-(line 1433,col 53)",
        "(line 1434,col 9)-(line 1434,col 36)",
        "(line 1435,col 9)-(line 1435,col 33)",
        "(line 1436,col 9)-(line 1436,col 43)",
        "(line 1437,col 9)-(line 1437,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(java.lang.Object)",
      "begin_line": 1447,
      "end_line": 1502,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1454,col 9)",
        "(line 1455,col 9)-(line 1455,col 79)",
        "(line 1457,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1464,col 9)",
        "(line 1465,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1472,col 9)",
        "(line 1473,col 9)-(line 1476,col 9)",
        "(line 1477,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1492,col 9)",
        "(line 1493,col 9)-(line 1496,col 9)",
        "(line 1497,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1501,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode()",
      "begin_line": 1509,
      "end_line": 1512,
      "comment": "\r\n     * Returns a hash code for the renderer.\r\n     *\r\n     * @return The hash code.\r\n     ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1510,col 38)",
        "(line 1511,col 9)-(line 1511,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDrawingSupplier()",
      "begin_line": 1519,
      "end_line": 1526,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1520,col 9)-(line 1520,col 38)",
        "(line 1521,col 9)-(line 1521,col 36)",
        "(line 1522,col 9)-(line 1524,col 9)",
        "(line 1525,col 9)-(line 1525,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1546,
      "end_line": 1566,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param value  the data value.\r\n     * @param datasetIndex  the dataset index.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1551,col 9)-(line 1553,col 9)",
        "(line 1555,col 9)-(line 1565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double, boolean)",
      "begin_line": 1584,
      "end_line": 1611,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     * @param selected  is the item selected?\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1589,col 34)",
        "(line 1590,col 9)-(line 1609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1625,
      "end_line": 1646,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 33)",
        "(line 1630,col 9)-(line 1639,col 9)",
        "(line 1640,col 9)-(line 1644,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.clone()",
      "begin_line": 1658,
      "end_line": 1728,
      "comment": "\r\n     * Returns an independent copy of the renderer.  The \u003ccode\u003eplot\u003c/code\u003e\r\n     * reference is shallow copied.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  can be thrown if one of the objects\r\n     *         belonging to the renderer does not support cloning (for example,\r\n     *         an item label generator).\r\n     ",
      "child_ranges": [
        "(line 1660,col 9)-(line 1661,col 63)",
        "(line 1664,col 9)-(line 1667,col 9)",
        "(line 1669,col 9)-(line 1680,col 9)",
        "(line 1682,col 9)-(line 1685,col 9)",
        "(line 1687,col 9)-(line 1698,col 9)",
        "(line 1700,col 9)-(line 1702,col 9)",
        "(line 1704,col 9)-(line 1713,col 9)",
        "(line 1715,col 9)-(line 1718,col 9)",
        "(line 1719,col 9)-(line 1722,col 9)",
        "(line 1723,col 9)-(line 1726,col 9)",
        "(line 1727,col 9)-(line 1727,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 1738,
      "end_line": 1744,
      "comment": "\r\n     * Returns a domain axis for a plot.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A domain axis.\r\n     ",
      "child_ranges": [
        "(line 1739,col 9)-(line 1739,col 56)",
        "(line 1740,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1743,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 1754,
      "end_line": 1760,
      "comment": "\r\n     * Returns a range axis for a plot.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A range axis.\r\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1755,col 52)",
        "(line 1756,col 9)-(line 1758,col 9)",
        "(line 1759,col 9)-(line 1759,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems()",
      "begin_line": 1770,
      "end_line": 1790,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 1771,col 9)-(line 1773,col 9)",
        "(line 1774,col 9)-(line 1774,col 65)",
        "(line 1775,col 9)-(line 1775,col 47)",
        "(line 1776,col 9)-(line 1776,col 62)",
        "(line 1777,col 9)-(line 1788,col 9)",
        "(line 1789,col 9)-(line 1789,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean)",
      "begin_line": 1804,
      "end_line": 1811,
      "comment": "\r\n     * Adds an entity with the specified hotspot.\r\n     *\r\n     * @param entities  the entity collection.\r\n     * @param hotspot  the hotspot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1807,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1810,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double)",
      "begin_line": 1830,
      "end_line": 1861,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param hotspot  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param row  the series.\r\n     * @param column  the item.\r\n     * @param selected  is the item selected?\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1833,col 9)-(line 1835,col 9)",
        "(line 1836,col 9)-(line 1836,col 26)",
        "(line 1837,col 9)-(line 1846,col 9)",
        "(line 1847,col 9)-(line 1847,col 26)",
        "(line 1848,col 9)-(line 1849,col 26)",
        "(line 1850,col 9)-(line 1852,col 9)",
        "(line 1853,col 9)-(line 1853,col 26)",
        "(line 1854,col 9)-(line 1854,col 78)",
        "(line 1855,col 9)-(line 1857,col 9)",
        "(line 1858,col 9)-(line 1859,col 79)",
        "(line 1860,col 9)-(line 1860,col 29)"
      ]
    }
  ]
}