{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java",
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
      "begin_line": 182,
      "end_line": 1981,
      "comment": "\r\n * An abstract base class that you can use to implement a new\r\n * {@link CategoryItemRenderer}.  When you create a new\r\n * {@link CategoryItemRenderer} you are not required to extend this class,\r\n * but it makes the job easier.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " The plot that the renderer is assigned to. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " A list of label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The base label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowCount"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " The number of rows in the dataset (temporary record). "
    },
    {
      "type": "field",
      "varNames": [
        "columnCount"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " The number of columns in the dataset (temporary record). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.AbstractCategoryItemRenderer()",
      "begin_line": 248,
      "end_line": 256,
      "comment": "\r\n     * Creates a new renderer with no tool tip generator and no URL generator.\r\n     * The defaults (no tool tip or URL generators) have been chosen to\r\n     * minimise the processing required to generate a default chart.  If you\r\n     * require tool tips or URLs, then you can easily add the required\r\n     * generators.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 55)",
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 251,col 49)",
        "(line 252,col 9)-(line 253,col 61)",
        "(line 254,col 9)-(line 254,col 53)",
        "(line 255,col 9)-(line 255,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPassCount()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the\r\n     * renderer.  This method returns \u003ccode\u003e1\u003c/code\u003e, subclasses should\r\n     * override if they need more passes.\r\n     *\r\n     * @return The pass count.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPlot()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where\r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned\r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(CategoryPlot)\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 291,
      "end_line": 296,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is\r\n     * usually called by the {@link CategoryPlot}, in normal usage you\r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 314,
      "end_line": 322,
      "comment": "\r\n     * Returns the item label generator for a data item.  This implementation\r\n     * returns the series item label generator if one is defined, otherwise\r\n     * it returns the default item label generator (which may be\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 317,col 53)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 335,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 364,
      "end_line": 370,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 59)",
        "(line 367,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\r\n     * Sets the base item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 48)",
        "(line 410,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 430,
      "end_line": 439,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified\r\n     * item.  You can override this method if you want to return a different\r\n     * generator per item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 47)",
        "(line 434,col 9)-(line 434,col 48)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\"\r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 464,
      "end_line": 467,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 482,
      "end_line": 488,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 57)",
        "(line 485,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 524,
      "end_line": 530,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 46)",
        "(line 527,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 545,
      "end_line": 553,
      "comment": "\r\n     * Returns the URL generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The URL generator.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 548,col 72)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The URL generator for the series.\r\n     *\r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 577,
      "end_line": 580,
      "comment": "\r\n     * Sets the URL generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 594,
      "end_line": 600,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 53)",
        "(line 597,col 9)-(line 599,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\r\n     * Returns the base item URL generator.\r\n     *\r\n     * @return The item URL generator.\r\n     *\r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator.\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 634,
      "end_line": 640,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 42)",
        "(line 637,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 653,
      "end_line": 656,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 666,
      "end_line": 682,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 695,
      "end_line": 700,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 72)",
        "(line 697,col 9)-(line 697,col 74)",
        "(line 698,col 9)-(line 698,col 55)",
        "(line 699,col 9)-(line 699,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations()",
      "begin_line": 708,
      "end_line": 712,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 43)",
        "(line 710,col 9)-(line 710,col 43)",
        "(line 711,col 9)-(line 711,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 733,
      "end_line": 740,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 50)",
        "(line 739,col 9)-(line 739,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 749,
      "end_line": 751,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 761,
      "end_line": 765,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 52)",
        "(line 764,col 9)-(line 764,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 786,
      "end_line": 790,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 48)",
        "(line 789,col 9)-(line 789,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRowCount()",
      "begin_line": 798,
      "end_line": 800,
      "comment": "\r\n     * Returns the number of rows in the dataset.  This value is updated in the\r\n     * {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getColumnCount()",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\r\n     * Returns the number of columns in the dataset.  This value is updated in\r\n     * the {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 824,
      "end_line": 839,
      "comment": "\r\n     * Creates a new state instance---this method is called from the\r\n     * {@link #initialise(Graphics2D, Rectangle2D, CategoryPlot, int,\r\n     * PlotRenderingInfo)} method.  Subclasses can override this method if\r\n     * they need to use a subclass of {@link CategoryItemRendererState}.\r\n     *\r\n     * @param info  collects plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The new state instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 78)",
        "(line 826,col 9)-(line 826,col 57)",
        "(line 827,col 9)-(line 827,col 35)",
        "(line 828,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 58)",
        "(line 835,col 9)-(line 836,col 36)",
        "(line 837,col 9)-(line 837,col 51)",
        "(line 838,col 9)-(line 838,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 855,
      "end_line": 889,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be used\r\n     * for the remainder of the drawing process for a single chart.  The state\r\n     * object allows for the fact that the renderer may be used simultaneously\r\n     * by multiple threads (each thread will work with a separate state object).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param info  an object for returning information about the structure of\r\n     *              the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer state.\r\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 22)",
        "(line 860,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 60)",
        "(line 871,col 9)-(line 871,col 60)",
        "(line 872,col 9)-(line 875,col 9)",
        "(line 878,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 48)",
        "(line 888,col 9)-(line 888,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 916,
      "end_line": 935,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the y-interval if the dataset has one.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 951,
      "end_line": 956,
      "comment": "\r\n     * Returns the Java2D coordinate for the middle of the specified data item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param dataset  the dataset.\r\n     * @param axis  the axis.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate for the middle of the item.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 955,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 967,
      "end_line": 973,
      "comment": "\r\n     * Draws a background for the data area.  The default implementation just\r\n     * gets the plot to draw the background, but some renderers will override\r\n     * this behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 984,
      "end_line": 990,
      "comment": "\r\n     * Draws an outline for the data area.  The default implementation just\r\n     * gets the plot to draw the outline, but some renderers will override this\r\n     * behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1012,
      "end_line": 1037,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     * \u003cP\u003e\r\n     * Note that this default implementation assumes that the horizontal axis\r\n     * is the domain axis. If this is not the case, you will need to override\r\n     * this method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeGridline(Graphics2D, CategoryPlot, ValueAxis,\r\n     *     Rectangle2D, double)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1021,col 27)",
        "(line 1022,col 9)-(line 1022,col 60)",
        "(line 1024,col 9)-(line 1031,col 9)",
        "(line 1033,col 9)-(line 1033,col 27)",
        "(line 1034,col 9)-(line 1034,col 29)",
        "(line 1035,col 9)-(line 1035,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1055,
      "end_line": 1079,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeGridline\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1058,col 9)-(line 1058,col 38)",
        "(line 1059,col 9)-(line 1061,col 9)",
        "(line 1063,col 9)-(line 1063,col 60)",
        "(line 1064,col 9)-(line 1064,col 27)",
        "(line 1065,col 9)-(line 1065,col 80)",
        "(line 1066,col 9)-(line 1073,col 9)",
        "(line 1075,col 9)-(line 1075,col 27)",
        "(line 1076,col 9)-(line 1076,col 29)",
        "(line 1077,col 9)-(line 1077,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 1093,
      "end_line": 1165,
      "comment": "\r\n     * Draws a marker for the domain axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker,\r\n     *     Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 46)",
        "(line 1100,col 9)-(line 1100,col 73)",
        "(line 1101,col 9)-(line 1101,col 59)",
        "(line 1102,col 9)-(line 1104,col 9)",
        "(line 1106,col 9)-(line 1106,col 59)",
        "(line 1107,col 9)-(line 1108,col 61)",
        "(line 1110,col 9)-(line 1110,col 60)",
        "(line 1111,col 9)-(line 1111,col 34)",
        "(line 1112,col 9)-(line 1149,col 9)",
        "(line 1151,col 9)-(line 1151,col 41)",
        "(line 1152,col 9)-(line 1152,col 57)",
        "(line 1153,col 9)-(line 1163,col 9)",
        "(line 1164,col 9)-(line 1164,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1179,
      "end_line": 1333,
      "comment": "\r\n     * Draws a marker for the range axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis,\r\n     *     CategoryMarker, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1349,
      "end_line": 1368,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing the label for a marker on\r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1357,col 9)-(line 1357,col 38)",
        "(line 1358,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1383,
      "end_line": 1402,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1391,col 38)",
        "(line 1392,col 9)-(line 1399,col 9)",
        "(line 1400,col 9)-(line 1400,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 1416,
      "end_line": 1459,
      "comment": "\r\n     * Returns a legend item for a series.  This default implementation will\r\n     * return \u003ccode\u003enull\u003c/code\u003e if {@link #isSeriesVisible(int)} or\r\n     * {@link #isSeriesVisibleInLegend(int)} returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItems()\r\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 35)",
        "(line 1419,col 9)-(line 1421,col 9)",
        "(line 1424,col 9)-(line 1426,col 9)",
        "(line 1428,col 9)-(line 1428,col 61)",
        "(line 1429,col 9)-(line 1430,col 24)",
        "(line 1431,col 9)-(line 1431,col 35)",
        "(line 1432,col 9)-(line 1432,col 34)",
        "(line 1433,col 9)-(line 1436,col 9)",
        "(line 1437,col 9)-(line 1437,col 30)",
        "(line 1438,col 9)-(line 1441,col 9)",
        "(line 1442,col 9)-(line 1442,col 48)",
        "(line 1443,col 9)-(line 1443,col 48)",
        "(line 1444,col 9)-(line 1444,col 62)",
        "(line 1445,col 9)-(line 1445,col 65)",
        "(line 1447,col 9)-(line 1448,col 68)",
        "(line 1449,col 9)-(line 1449,col 56)",
        "(line 1450,col 9)-(line 1450,col 57)",
        "(line 1451,col 9)-(line 1453,col 9)",
        "(line 1454,col 9)-(line 1454,col 53)",
        "(line 1455,col 9)-(line 1455,col 36)",
        "(line 1456,col 9)-(line 1456,col 33)",
        "(line 1457,col 9)-(line 1457,col 43)",
        "(line 1458,col 9)-(line 1458,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(java.lang.Object)",
      "begin_line": 1468,
      "end_line": 1523,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1470,col 9)-(line 1472,col 9)",
        "(line 1473,col 9)-(line 1475,col 9)",
        "(line 1476,col 9)-(line 1476,col 79)",
        "(line 1478,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1485,col 9)",
        "(line 1486,col 9)-(line 1489,col 9)",
        "(line 1490,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1509,col 9)",
        "(line 1510,col 9)-(line 1513,col 9)",
        "(line 1514,col 9)-(line 1517,col 9)",
        "(line 1518,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1522,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode()",
      "begin_line": 1530,
      "end_line": 1533,
      "comment": "\r\n     * Returns a hash code for the renderer.\r\n     *\r\n     * @return The hash code.\r\n     ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1531,col 38)",
        "(line 1532,col 9)-(line 1532,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDrawingSupplier()",
      "begin_line": 1540,
      "end_line": 1547,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1541,col 38)",
        "(line 1542,col 9)-(line 1542,col 36)",
        "(line 1543,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1546,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1567,
      "end_line": 1587,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param value  the data value.\r\n     * @param datasetIndex  the dataset index.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1574,col 9)",
        "(line 1576,col 9)-(line 1586,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double, boolean)",
      "begin_line": 1605,
      "end_line": 1632,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     * @param selected  is the item selected?\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1610,col 34)",
        "(line 1611,col 9)-(line 1630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1646,
      "end_line": 1667,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1650,col 9)-(line 1650,col 33)",
        "(line 1651,col 9)-(line 1660,col 9)",
        "(line 1661,col 9)-(line 1665,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.clone()",
      "begin_line": 1679,
      "end_line": 1749,
      "comment": "\r\n     * Returns an independent copy of the renderer.  The \u003ccode\u003eplot\u003c/code\u003e\r\n     * reference is shallow copied.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  can be thrown if one of the objects\r\n     *         belonging to the renderer does not support cloning (for example,\r\n     *         an item label generator).\r\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1682,col 63)",
        "(line 1685,col 9)-(line 1688,col 9)",
        "(line 1690,col 9)-(line 1701,col 9)",
        "(line 1703,col 9)-(line 1706,col 9)",
        "(line 1708,col 9)-(line 1719,col 9)",
        "(line 1721,col 9)-(line 1723,col 9)",
        "(line 1725,col 9)-(line 1734,col 9)",
        "(line 1736,col 9)-(line 1739,col 9)",
        "(line 1740,col 9)-(line 1743,col 9)",
        "(line 1744,col 9)-(line 1747,col 9)",
        "(line 1748,col 9)-(line 1748,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset)",
      "begin_line": 1759,
      "end_line": 1763,
      "comment": "\r\n     * Returns the domain axis that is used for the specified dataset.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A domain axis.\r\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1761,col 49)",
        "(line 1762,col 9)-(line 1762,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 1773,
      "end_line": 1779,
      "comment": "\r\n     * Returns a range axis for a plot.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A range axis.\r\n     ",
      "child_ranges": [
        "(line 1774,col 9)-(line 1774,col 52)",
        "(line 1775,col 9)-(line 1777,col 9)",
        "(line 1778,col 9)-(line 1778,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems()",
      "begin_line": 1789,
      "end_line": 1809,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 1790,col 9)-(line 1792,col 9)",
        "(line 1793,col 9)-(line 1793,col 65)",
        "(line 1794,col 9)-(line 1794,col 47)",
        "(line 1795,col 9)-(line 1795,col 62)",
        "(line 1796,col 9)-(line 1807,col 9)",
        "(line 1808,col 9)-(line 1808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean)",
      "begin_line": 1823,
      "end_line": 1830,
      "comment": "\r\n     * Adds an entity with the specified hotspot.\r\n     *\r\n     * @param entities  the entity collection.\r\n     * @param hotspot  the hotspot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1826,col 9)-(line 1828,col 9)",
        "(line 1829,col 9)-(line 1829,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double)",
      "begin_line": 1849,
      "end_line": 1880,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param hotspot  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param row  the series.\r\n     * @param column  the item.\r\n     * @param selected  is the item selected?\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1852,col 9)-(line 1854,col 9)",
        "(line 1855,col 9)-(line 1855,col 26)",
        "(line 1856,col 9)-(line 1865,col 9)",
        "(line 1866,col 9)-(line 1866,col 26)",
        "(line 1867,col 9)-(line 1868,col 26)",
        "(line 1869,col 9)-(line 1871,col 9)",
        "(line 1872,col 9)-(line 1872,col 26)",
        "(line 1873,col 9)-(line 1873,col 78)",
        "(line 1874,col 9)-(line 1876,col 9)",
        "(line 1877,col 9)-(line 1878,col 79)",
        "(line 1879,col 9)-(line 1879,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotShape(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 1899,
      "end_line": 1904,
      "comment": "\r\n     * Returns a shape that can be used for hit testing on a data item drawn\r\n     * by the renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the data is being rendered.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A shape equal to the hot spot for a data item.\r\n     ",
      "child_ranges": [
        "(line 1903,col 9)-(line 1903,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D)",
      "begin_line": 1924,
      "end_line": 1943,
      "comment": "\r\n     * Returns the rectangular bounds for the hot spot for an item drawn by\r\n     * this renderer.  This is intended to provide a quick test for\r\n     * eliminating data points before more accurate testing against the\r\n     * shape returned by createHotSpotShape().\r\n     *\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param row\r\n     * @param column\r\n     * @param selected\r\n     * @param result\r\n     * @return\r\n     ",
      "child_ranges": [
        "(line 1928,col 9)-(line 1930,col 9)",
        "(line 1931,col 9)-(line 1931,col 54)",
        "(line 1932,col 9)-(line 1932,col 49)",
        "(line 1933,col 9)-(line 1935,col 9)",
        "(line 1936,col 9)-(line 1938,col 52)",
        "(line 1939,col 9)-(line 1940,col 41)",
        "(line 1941,col 9)-(line 1941,col 45)",
        "(line 1942,col 9)-(line 1942,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 1966,
      "end_line": 1979,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified point (xx, yy) in Java2D\r\n     * space falls within the \"hot spot\" for the specified data item, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param xx\r\n     * @param yy\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param row\r\n     * @param column\r\n     * @param selected\r\n     *\r\n     * @return\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1970,col 9)-(line 1972,col 29)",
        "(line 1973,col 9)-(line 1975,col 9)",
        "(line 1978,col 9)-(line 1978,col 39)"
      ]
    }
  ]
}